package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lx8<T> extends c34<T> {

    /* JADX INFO: renamed from: d */
    @yfb
    public final zy2<bth> f59142d;

    public lx8(@yfb e13 e13Var, @yfb gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var) {
        super(e13Var, false);
        this.f59142d = od8.createCoroutineUnintercepted(gz6Var, this, this);
    }

    @Override // p000.sj8
    /* JADX INFO: renamed from: m */
    public void mo2873m() throws Throwable {
        mq1.startCoroutineCancellable(this.f59142d, this);
    }
}
