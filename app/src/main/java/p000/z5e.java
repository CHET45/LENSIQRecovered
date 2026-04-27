package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class z5e implements dh2, mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<mf4> f104249a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final t89 f104250b = new t89();

    /* JADX INFO: renamed from: a */
    public void m26587a() {
    }

    public final void add(@bfb mf4 mf4Var) {
        xjb.requireNonNull(mf4Var, "resource is null");
        this.f104250b.add(mf4Var);
    }

    @Override // p000.mf4
    public final void dispose() {
        if (ag4.dispose(this.f104249a)) {
            this.f104250b.dispose();
        }
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return ag4.isDisposed(this.f104249a.get());
    }

    @Override // p000.dh2
    public final void onSubscribe(@bfb mf4 mf4Var) {
        if (z15.setOnce(this.f104249a, mf4Var, getClass())) {
            m26587a();
        }
    }
}
