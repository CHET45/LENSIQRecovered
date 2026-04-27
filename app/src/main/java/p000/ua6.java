package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ua6<T> extends AbstractC8162k1<T, Long> {

    /* JADX INFO: renamed from: ua6$a */
    public static final class C13429a extends k34<Long> implements lj6<Object> {
        private static final long serialVersionUID = 4973004223787171406L;

        /* JADX INFO: renamed from: L */
        public fdg f87292L;

        /* JADX INFO: renamed from: M */
        public long f87293M;

        public C13429a(ycg<? super Long> ycgVar) {
            super(ycgVar);
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f87292L.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            complete(Long.valueOf(this.f87293M));
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f52502a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            this.f87293M++;
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f87292L, fdgVar)) {
                this.f87292L = fdgVar;
                this.f52502a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public ua6(m86<T> m86Var) {
        super(m86Var);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super Long> ycgVar) {
        this.f52360b.subscribe((lj6) new C13429a(ycgVar));
    }
}
