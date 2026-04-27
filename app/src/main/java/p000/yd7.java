package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class yd7 {
    private yd7() {
        throw new IllegalStateException("No instances!");
    }

    public static void onComplete(ycg<?> ycgVar, AtomicInteger atomicInteger, cc0 cc0Var) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = cc0Var.terminate();
            if (thTerminate != null) {
                ycgVar.onError(thTerminate);
            } else {
                ycgVar.onComplete();
            }
        }
    }

    public static void onError(ycg<?> ycgVar, Throwable th, AtomicInteger atomicInteger, cc0 cc0Var) {
        if (!cc0Var.addThrowable(th)) {
            pfe.onError(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            ycgVar.onError(cc0Var.terminate());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void onNext(ycg<? super T> ycgVar, T t, AtomicInteger atomicInteger, cc0 cc0Var) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            ycgVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = cc0Var.terminate();
                if (thTerminate != null) {
                    ycgVar.onError(thTerminate);
                } else {
                    ycgVar.onComplete();
                }
            }
        }
    }

    public static void onComplete(oxb<?> oxbVar, AtomicInteger atomicInteger, cc0 cc0Var) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable thTerminate = cc0Var.terminate();
            if (thTerminate != null) {
                oxbVar.onError(thTerminate);
            } else {
                oxbVar.onComplete();
            }
        }
    }

    public static void onError(oxb<?> oxbVar, Throwable th, AtomicInteger atomicInteger, cc0 cc0Var) {
        if (cc0Var.addThrowable(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                oxbVar.onError(cc0Var.terminate());
                return;
            }
            return;
        }
        pfe.onError(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void onNext(oxb<? super T> oxbVar, T t, AtomicInteger atomicInteger, cc0 cc0Var) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            oxbVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTerminate = cc0Var.terminate();
                if (thTerminate != null) {
                    oxbVar.onError(thTerminate);
                } else {
                    oxbVar.onComplete();
                }
            }
        }
    }
}
