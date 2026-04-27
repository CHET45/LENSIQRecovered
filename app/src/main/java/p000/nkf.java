package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class nkf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f64819a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super T> f64820b;

    /* JADX INFO: renamed from: nkf$a */
    public static final class C9915a<T> implements inf<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f64821a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super T> f64822b;

        /* JADX INFO: renamed from: c */
        public mf4 f64823c;

        public C9915a(inf<? super T> infVar, tu2<? super T> tu2Var) {
            this.f64821a = infVar;
            this.f64822b = tu2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f64823c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f64823c.isDisposed();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f64821a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f64823c, mf4Var)) {
                this.f64823c = mf4Var;
                this.f64821a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f64821a.onSuccess(t);
            try {
                this.f64822b.accept(t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
        }
    }

    public nkf(pof<T> pofVar, tu2<? super T> tu2Var) {
        this.f64819a = pofVar;
        this.f64820b = tu2Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f64819a.subscribe(new C9915a(infVar, this.f64820b));
    }
}
