package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class cc0 extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean addThrowable(Throwable th) {
        return j75.addThrowable(this, th);
    }

    public boolean isTerminated() {
        return get() == j75.f49698a;
    }

    public Throwable terminate() {
        return j75.terminate(this);
    }
}
