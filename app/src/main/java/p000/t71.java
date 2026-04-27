package p000;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public final class t71 {
    private t71() {
        throw new IllegalStateException("No instances!");
    }

    public static void awaitForComplete(CountDownLatch countDownLatch, mf4 mf4Var) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            verifyNonBlocking();
            countDownLatch.await();
        } catch (InterruptedException e) {
            mf4Var.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
        }
    }

    public static void verifyNonBlocking() {
        if (pfe.isFailOnNonBlockingScheduler()) {
            if ((Thread.currentThread() instanceof veb) || pfe.onBeforeBlocking()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
