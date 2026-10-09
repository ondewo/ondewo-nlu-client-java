package com.ondewo.nlu.channel;

import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.BasicConstraints;
import org.bouncycastle.asn1.x509.ExtendedKeyUsage;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.cert.X509v3CertificateBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509ExtensionUtils;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.time.Duration;
import java.time.Instant;
import java.util.Base64;
import java.util.Date;

/**
 * A throwaway PKI generated at test time - a CA, a server certificate for localhost /
 * 127.0.0.1 / ::1, a client certificate, and a second, unrelated CA with its own client - so
 * no private key is ever committed. ECDSA P-256, valid for one day.
 */
final class TestPki {

    /** The PEM label of a PKCS#8 key, split so no hygiene hook mistakes this file for a key. */
    private static final String KEY_LABEL = "PRIVATE" + " KEY";

    final Issued ca;
    final Issued server;
    final Issued client;
    final Issued otherCa;
    final Issued otherClient;

    private TestPki() throws Exception {
        ca = selfSignedCa("ONDEWO Test CA");
        server = leaf(ca, "localhost", KeyPurposeId.id_kp_serverAuth, true);
        client = leaf(ca, "ondewo-test-client", KeyPurposeId.id_kp_clientAuth, false);
        otherCa = selfSignedCa("Unrelated Test CA");
        otherClient = leaf(otherCa, "unrelated-client", KeyPurposeId.id_kp_clientAuth, false);
    }

    static TestPki generate() throws Exception {
        return new TestPki();
    }

    /** A certificate with its key, both as PEM. */
    static final class Issued {
        final X509Certificate certificate;
        final PrivateKey key;
        final String certPem;
        final String keyPem;

        Issued(final X509Certificate certificate, final PrivateKey key) throws Exception {
            this.certificate = certificate;
            this.key = key;
            this.certPem = pem("CERTIFICATE", certificate.getEncoded());
            this.keyPem = pem(KEY_LABEL, key.getEncoded());
        }
    }

    /** @return {@code pem} with every line ending turned into CRLF */
    static String crlf(final String pem) {
        return pem.replace("\r\n", "\n").replace("\n", "\r\n");
    }

    private static String pem(final String label, final byte[] der) {
        final String body =
                Base64.getMimeEncoder(64, "\n".getBytes(java.nio.charset.StandardCharsets.US_ASCII))
                        .encodeToString(der);
        return "-----BEGIN " + label + "-----\n" + body + "\n-----END " + label + "-----\n";
    }

    private static KeyPair keyPair() throws GeneralSecurityException {
        final KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");
        generator.initialize(new ECGenParameterSpec("secp256r1"));
        return generator.generateKeyPair();
    }

    private static Issued selfSignedCa(final String commonName) throws Exception {
        final KeyPair keys = keyPair();
        final X500Name name = new X500Name("CN=" + commonName);
        final X509v3CertificateBuilder builder = builder(name, name, keys);
        builder.addExtension(Extension.basicConstraints, true, new BasicConstraints(true));
        builder.addExtension(
                Extension.keyUsage, true, new KeyUsage(KeyUsage.keyCertSign | KeyUsage.cRLSign));
        return new Issued(sign(builder, keys.getPrivate()), keys.getPrivate());
    }

    private static Issued leaf(
            final Issued issuer,
            final String commonName,
            final KeyPurposeId purpose,
            final boolean withServerNames)
            throws Exception {
        final KeyPair keys = keyPair();
        final X509v3CertificateBuilder builder =
                builder(
                        X500Name.getInstance(
                                issuer.certificate.getSubjectX500Principal().getEncoded()),
                        new X500Name("CN=" + commonName),
                        keys);
        builder.addExtension(Extension.basicConstraints, true, new BasicConstraints(false));
        builder.addExtension(
                Extension.keyUsage,
                true,
                new KeyUsage(KeyUsage.digitalSignature | KeyUsage.keyAgreement));
        builder.addExtension(Extension.extendedKeyUsage, false, new ExtendedKeyUsage(purpose));
        builder.addExtension(
                Extension.authorityKeyIdentifier,
                false,
                new JcaX509ExtensionUtils().createAuthorityKeyIdentifier(issuer.certificate));
        if (withServerNames) {
            builder.addExtension(
                    Extension.subjectAlternativeName,
                    false,
                    new GeneralNames(
                            new GeneralName[] {
                                new GeneralName(GeneralName.dNSName, "localhost"),
                                new GeneralName(GeneralName.iPAddress, "127.0.0.1"),
                                new GeneralName(GeneralName.iPAddress, "::1"),
                            }));
        }
        return new Issued(sign(builder, issuer.key), keys.getPrivate());
    }

    private static X509v3CertificateBuilder builder(
            final X500Name issuer, final X500Name subject, final KeyPair keys) throws Exception {
        final Instant now = Instant.now();
        final X509v3CertificateBuilder builder =
                new JcaX509v3CertificateBuilder(
                        issuer,
                        new BigInteger(64, new SecureRandom()).add(BigInteger.ONE),
                        Date.from(now.minus(Duration.ofHours(1))),
                        Date.from(now.plus(Duration.ofDays(1))),
                        subject,
                        keys.getPublic());
        builder.addExtension(
                Extension.subjectKeyIdentifier,
                false,
                new JcaX509ExtensionUtils().createSubjectKeyIdentifier(keys.getPublic()));
        return builder;
    }

    private static X509Certificate sign(
            final X509v3CertificateBuilder builder, final PrivateKey key) throws Exception {
        return new JcaX509CertificateConverter()
                .getCertificate(
                        builder.build(new JcaContentSignerBuilder("SHA256withECDSA").build(key)));
    }
}
