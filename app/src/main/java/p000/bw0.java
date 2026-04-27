package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bw0<T> extends AtomicLong implements bod<T> {
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
