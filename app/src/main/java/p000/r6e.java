package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class r6e<T> implements oxb<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<mf4> f77137a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final t89 f77138b = new t89();

    /* JADX INFO: renamed from: a */
    public void m21075a() {
    }

    public final void add(@bfb mf4 mf4Var) {
        xjb.requireNonNull(mf4Var, "resource is null");
        this.f77138b.add(mf4Var);
    }

    @Override // p000.mf4
    public final void dispose() {
        if (ag4.dispose(this.f77137a)) {
            this.f77138b.dispose();
        }
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return ag4.isDisposed(this.f77137a.get());
    }

    @Override // p000.oxb
    public final void onSubscribe(mf4 mf4Var) {
        if (z15.setOnce(this.f77137a, mf4Var, getClass())) {
            m21075a();
        }
    }
}
