package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class jx3<T> implements pxb<T> {

    /* JADX INFO: renamed from: a */
    public lf4 f52167a;

    /* JADX INFO: renamed from: a */
    public final void m14364a() {
        lf4 lf4Var = this.f52167a;
        this.f52167a = zf4.DISPOSED;
        lf4Var.dispose();
    }

    /* JADX INFO: renamed from: b */
    public void m14365b() {
    }

    @Override // p000.pxb
    public final void onSubscribe(@cfb lf4 d) {
        if (y15.validate(this.f52167a, d, getClass())) {
            this.f52167a = d;
            m14365b();
        }
    }
}
