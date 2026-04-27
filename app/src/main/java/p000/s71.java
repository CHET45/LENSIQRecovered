package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public final class s71 {
    private s71() {
        throw new IllegalStateException("No instances!");
    }

    public static void awaitForComplete(CountDownLatch latch, lf4 subscription) {
        if (latch.getCount() == 0) {
            return;
        }
        try {
            verifyNonBlocking();
            latch.await();
        } catch (InterruptedException e) {
            subscription.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
        }
    }

    public static void verifyNonBlocking() {
        if (ofe.isFailOnNonBlockingScheduler()) {
            if ((Thread.currentThread() instanceof ueb) || ofe.onBeforeBlocking()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
