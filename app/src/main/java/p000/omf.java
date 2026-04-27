package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class omf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f68155a;

    /* JADX INFO: renamed from: omf$a */
    public static final class C10470a<T> implements inf<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f68156a;

        /* JADX INFO: renamed from: b */
        public mf4 f68157b;

        public C10470a(inf<? super T> infVar) {
            this.f68156a = infVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f68157b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f68157b.isDisposed();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f68156a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f68157b, mf4Var)) {
                this.f68157b = mf4Var;
                this.f68156a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f68156a.onSuccess(t);
        }
    }

    public omf(pof<? extends T> pofVar) {
        this.f68155a = pofVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f68155a.subscribe(new C10470a(infVar));
    }
}
