package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class b39 extends t0g {

    /* JADX INFO: renamed from: d */
    @yfb
    public final zy2<bth> f12532d;

    public b39(@yfb e13 e13Var, @yfb gz6<? super x13, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        super(e13Var, false);
        this.f12532d = od8.createCoroutineUnintercepted(gz6Var, this, this);
    }

    @Override // p000.sj8
    /* JADX INFO: renamed from: m */
    public void mo2873m() throws Throwable {
        mq1.startCoroutineCancellable(this.f12532d, this);
    }
}
