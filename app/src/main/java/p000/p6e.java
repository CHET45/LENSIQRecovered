package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p6e<T> implements l9a<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<mf4> f69855a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final t89 f69856b = new t89();

    /* JADX INFO: renamed from: a */
    public void m19286a() {
    }

    public final void add(@bfb mf4 mf4Var) {
        xjb.requireNonNull(mf4Var, "resource is null");
        this.f69856b.add(mf4Var);
    }

    @Override // p000.mf4
    public final void dispose() {
        if (ag4.dispose(this.f69855a)) {
            this.f69856b.dispose();
        }
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return ag4.isDisposed(this.f69855a.get());
    }

    @Override // p000.l9a
    public final void onSubscribe(@bfb mf4 mf4Var) {
        if (z15.setOnce(this.f69855a, mf4Var, getClass())) {
            m19286a();
        }
    }
}
