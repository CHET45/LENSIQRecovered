package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class rv0<T> extends AtomicInteger implements bod<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // p000.zif
    public final boolean offer(T e) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.zif
    public final boolean offer(T v1, T v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
