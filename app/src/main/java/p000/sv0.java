package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class sv0<T> extends AtomicInteger implements cod<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // p000.ajf
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.ajf
    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
