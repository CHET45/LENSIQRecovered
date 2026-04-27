package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class dk6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: dk6$a */
    public static final class C4830a<T> extends k34<T> implements lj6<T> {
        private static final long serialVersionUID = -5467847744262967226L;

        /* JADX INFO: renamed from: L */
        public fdg f29872L;

        public C4830a(ycg<? super T> ycgVar) {
            super(ycgVar);
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f29872L.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            T t = this.f52503b;
            if (t != null) {
                complete(t);
            } else {
                this.f52502a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f52503b = null;
            this.f52502a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f52503b = t;
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f29872L, fdgVar)) {
                this.f29872L = fdgVar;
                this.f52502a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public dk6(m86<T> m86Var) {
        super(m86Var);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C4830a(ycgVar));
    }
}
