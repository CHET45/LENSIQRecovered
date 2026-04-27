package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class uaa<T> extends m86<T> implements ah7<T> {

    /* JADX INFO: renamed from: b */
    public final aaa<T> f87295b;

    /* JADX INFO: renamed from: uaa$a */
    public static final class C13430a<T> extends k34<T> implements l9a<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: L */
        public mf4 f87296L;

        public C13430a(ycg<? super T> ycgVar) {
            super(ycgVar);
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f87296L.dispose();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f52502a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f52502a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f87296L, mf4Var)) {
                this.f87296L = mf4Var;
                this.f52502a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            complete(t);
        }
    }

    public uaa(aaa<T> aaaVar) {
        this.f87295b = aaaVar;
    }

    @Override // p000.ah7
    public aaa<T> source() {
        return this.f87295b;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f87295b.subscribe(new C13430a(ycgVar));
    }
}
