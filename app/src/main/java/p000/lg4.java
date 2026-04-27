package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lg4<T> implements inf<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<mf4> f57497a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public void m16120a() {
    }

    @Override // p000.mf4
    public final void dispose() {
        ag4.dispose(this.f57497a);
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return this.f57497a.get() == ag4.DISPOSED;
    }

    @Override // p000.inf
    public final void onSubscribe(@bfb mf4 mf4Var) {
        if (z15.setOnce(this.f57497a, mf4Var, getClass())) {
            m16120a();
        }
    }
}
