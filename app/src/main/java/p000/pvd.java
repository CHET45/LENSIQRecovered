package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class pvd<T> extends AtomicReference<T> implements mf4 {
    private static final long serialVersionUID = 6537757548749041217L;

    public pvd(T t) {
        super(xjb.requireNonNull(t, "value is null"));
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo14662a(@bfb T t);

    @Override // p000.mf4
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo14662a(andSet);
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return get() == null;
    }
}
