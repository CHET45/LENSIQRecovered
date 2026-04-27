package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class xd7 {
    private xd7() {
        throw new IllegalStateException("No instances!");
    }

    public static void onComplete(ycg<?> subscriber, AtomicInteger wip, bc0 errors) {
        if (wip.getAndIncrement() == 0) {
            errors.tryTerminateConsumer(subscriber);
        }
    }

    public static void onError(ycg<?> subscriber, Throwable ex, AtomicInteger wip, bc0 errors) {
        if (errors.tryAddThrowableOrReport(ex) && wip.getAndIncrement() == 0) {
            errors.tryTerminateConsumer(subscriber);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean onNext(ycg<? super T> subscriber, T value, AtomicInteger wip, bc0 errors) {
        if (wip.get() == 0 && wip.compareAndSet(0, 1)) {
            subscriber.onNext(value);
            if (wip.decrementAndGet() == 0) {
                return true;
            }
            errors.tryTerminateConsumer(subscriber);
        }
        return false;
    }

    public static void onComplete(pxb<?> observer, AtomicInteger wip, bc0 errors) {
        if (wip.getAndIncrement() == 0) {
            errors.tryTerminateConsumer(observer);
        }
    }

    public static void onError(pxb<?> observer, Throwable ex, AtomicInteger wip, bc0 errors) {
        if (errors.tryAddThrowableOrReport(ex) && wip.getAndIncrement() == 0) {
            errors.tryTerminateConsumer(observer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void onNext(pxb<? super T> observer, T value, AtomicInteger wip, bc0 errors) {
        if (wip.get() == 0 && wip.compareAndSet(0, 1)) {
            observer.onNext(value);
            if (wip.decrementAndGet() != 0) {
                errors.tryTerminateConsumer(observer);
            }
        }
    }
}
