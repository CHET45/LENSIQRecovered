package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kx3<T> implements oxb<T> {

    /* JADX INFO: renamed from: a */
    public mf4 f55553a;

    /* JADX INFO: renamed from: a */
    public final void m15105a() {
        mf4 mf4Var = this.f55553a;
        this.f55553a = ag4.DISPOSED;
        mf4Var.dispose();
    }

    /* JADX INFO: renamed from: b */
    public void m15106b() {
    }

    @Override // p000.oxb
    public final void onSubscribe(@bfb mf4 mf4Var) {
        if (z15.validate(this.f55553a, mf4Var, getClass())) {
            this.f55553a = mf4Var;
            m15106b();
        }
    }
}
