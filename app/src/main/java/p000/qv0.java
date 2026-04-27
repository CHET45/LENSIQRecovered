package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qv0<T> extends AtomicInteger implements umd<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // p000.ajf
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // p000.ajf
    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
