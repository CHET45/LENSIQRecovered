package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class mz3<T> implements lj6<T> {

    /* JADX INFO: renamed from: a */
    public fdg f62843a;

    /* JADX INFO: renamed from: a */
    public final void m17672a() {
        fdg fdgVar = this.f62843a;
        this.f62843a = mdg.CANCELLED;
        fdgVar.cancel();
    }

    /* JADX INFO: renamed from: b */
    public void m17673b() {
        m17674c(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public final void m17674c(long j) {
        fdg fdgVar = this.f62843a;
        if (fdgVar != null) {
            fdgVar.request(j);
        }
    }

    @Override // p000.lj6, p000.ycg
    public final void onSubscribe(fdg fdgVar) {
        if (z15.validate(this.f62843a, fdgVar, getClass())) {
            this.f62843a = fdgVar;
            m17673b();
        }
    }
}
