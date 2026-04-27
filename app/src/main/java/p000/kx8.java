package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kx8<E> extends xd1<E> {

    /* JADX INFO: renamed from: e */
    @yfb
    public final zy2<bth> f55561e;

    public kx8(@yfb e13 e13Var, @yfb ud1<E> ud1Var, @yfb gz6<? super vdd<? super E>, ? super zy2<? super bth>, ? extends Object> gz6Var) {
        super(e13Var, ud1Var, false);
        this.f55561e = od8.createCoroutineUnintercepted(gz6Var, this, this);
    }

    @Override // p000.sj8
    /* JADX INFO: renamed from: m */
    public void mo2873m() throws Throwable {
        mq1.startCoroutineCancellable(this.f55561e, this);
    }

    @Override // p000.xd1, p000.ud1
    @yfb
    public hsd<E> openSubscription() {
        hsd<E> hsdVarOpenSubscription = m25097q().openSubscription();
        start();
        return hsdVarOpenSubscription;
    }
}
