package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class bc0 extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean isTerminated() {
        return get() == k75.f52721a;
    }

    public Throwable terminate() {
        return k75.terminate(this);
    }

    public boolean tryAddThrowable(Throwable t) {
        return k75.addThrowable(this, t);
    }

    public boolean tryAddThrowableOrReport(Throwable t) {
        if (tryAddThrowable(t)) {
            return true;
        }
        ofe.onError(t);
        return false;
    }

    public void tryTerminateAndReport() {
        Throwable thTerminate = terminate();
        if (thTerminate == null || thTerminate == k75.f52721a) {
            return;
        }
        ofe.onError(thTerminate);
    }

    public void tryTerminateConsumer(ycg<?> consumer) {
        Throwable thTerminate = terminate();
        if (thTerminate == null) {
            consumer.onComplete();
        } else if (thTerminate != k75.f52721a) {
            consumer.onError(thTerminate);
        }
    }

    public void tryTerminateConsumer(pxb<?> consumer) {
        Throwable thTerminate = terminate();
        if (thTerminate == null) {
            consumer.onComplete();
        } else if (thTerminate != k75.f52721a) {
            consumer.onError(thTerminate);
        }
    }

    public void tryTerminateConsumer(k9a<?> consumer) {
        Throwable thTerminate = terminate();
        if (thTerminate == null) {
            consumer.onComplete();
        } else if (thTerminate != k75.f52721a) {
            consumer.onError(thTerminate);
        }
    }

    public void tryTerminateConsumer(hnf<?> consumer) {
        Throwable thTerminate = terminate();
        if (thTerminate == null || thTerminate == k75.f52721a) {
            return;
        }
        consumer.onError(thTerminate);
    }

    public void tryTerminateConsumer(ch2 consumer) {
        Throwable thTerminate = terminate();
        if (thTerminate == null) {
            consumer.onComplete();
        } else if (thTerminate != k75.f52721a) {
            consumer.onError(thTerminate);
        }
    }

    public void tryTerminateConsumer(qy4<?> consumer) {
        Throwable thTerminate = terminate();
        if (thTerminate == null) {
            consumer.onComplete();
        } else if (thTerminate != k75.f52721a) {
            consumer.onError(thTerminate);
        }
    }
}
