package com.ondewo.nlu.auth;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * The stop event of the background refresh worker, and its interruptible sleep. The tests inject
 * a scripted one, so the loop runs deterministically and never sleeps for real.
 */
interface StopSignal {

    /** @return whether {@link #set()} has been called */
    boolean isSet();

    /** Signals the stop and wakes a pending {@link #await(double)}. Idempotent. */
    void set();

    /**
     * Waits until the stop is signalled or {@code seconds} have passed.
     *
     * @param seconds the longest wait; zero or negative does not wait
     * @return {@code true} if the stop was signalled, {@code false} on timeout
     * @throws InterruptedException if the waiting thread is interrupted
     */
    boolean await(double seconds) throws InterruptedException;

    /** The production signal: a one-shot latch. */
    final class Latch implements StopSignal {

        private final CountDownLatch latch = new CountDownLatch(1);

        @Override
        public boolean isSet() {
            return latch.getCount() == 0;
        }

        @Override
        public void set() {
            latch.countDown();
        }

        @Override
        public boolean await(final double seconds) throws InterruptedException {
            return latch.await((long) (seconds * 1_000_000_000L), TimeUnit.NANOSECONDS);
        }
    }
}
