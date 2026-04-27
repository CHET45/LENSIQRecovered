package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class nz3<T> implements kj6<T> {

    /* JADX INFO: renamed from: a */
    public fdg f66111a;

    /* JADX INFO: renamed from: a */
    public final void m18229a() {
        fdg fdgVar = this.f66111a;
        this.f66111a = ldg.CANCELLED;
        fdgVar.cancel();
    }

    /* JADX INFO: renamed from: b */
    public void m18230b() {
        m18231c(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public final void m18231c(long n) {
        fdg fdgVar = this.f66111a;
        if (fdgVar != null) {
            fdgVar.request(n);
        }
    }

    @Override // p000.kj6, p000.ycg
    public final void onSubscribe(fdg s) {
        if (y15.validate(this.f66111a, s, getClass())) {
            this.f66111a = s;
            m18230b();
        }
    }
}
