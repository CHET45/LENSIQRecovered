package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pv0<T> extends AtomicInteger implements tmd<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // p000.zif
    public final boolean offer(T e) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // p000.zif
    public final boolean offer(T v1, T v2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
