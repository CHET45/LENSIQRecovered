package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lkf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f57996a;

    /* JADX INFO: renamed from: lkf$a */
    public static final class C8869a<T> implements inf<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public inf<? super T> f57997a;

        /* JADX INFO: renamed from: b */
        public mf4 f57998b;

        public C8869a(inf<? super T> infVar) {
            this.f57997a = infVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f57997a = null;
            this.f57998b.dispose();
            this.f57998b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f57998b.isDisposed();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f57998b = ag4.DISPOSED;
            inf<? super T> infVar = this.f57997a;
            if (infVar != null) {
                this.f57997a = null;
                infVar.onError(th);
            }
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f57998b, mf4Var)) {
                this.f57998b = mf4Var;
                this.f57997a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f57998b = ag4.DISPOSED;
            inf<? super T> infVar = this.f57997a;
            if (infVar != null) {
                this.f57997a = null;
                infVar.onSuccess(t);
            }
        }
    }

    public lkf(pof<T> pofVar) {
        this.f57996a = pofVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f57996a.subscribe(new C8869a(infVar));
    }
}
