package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z6e<T> implements inf<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<mf4> f104297a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final t89 f104298b = new t89();

    /* JADX INFO: renamed from: a */
    public void m26595a() {
    }

    public final void add(@bfb mf4 mf4Var) {
        xjb.requireNonNull(mf4Var, "resource is null");
        this.f104298b.add(mf4Var);
    }

    @Override // p000.mf4
    public final void dispose() {
        if (ag4.dispose(this.f104297a)) {
            this.f104298b.dispose();
        }
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return ag4.isDisposed(this.f104297a.get());
    }

    @Override // p000.inf
    public final void onSubscribe(@bfb mf4 mf4Var) {
        if (z15.setOnce(this.f104297a, mf4Var, getClass())) {
            m26595a();
        }
    }
}
