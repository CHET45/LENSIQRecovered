package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ymf<T, R> extends ljf<R> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f102071a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends R> f102072b;

    /* JADX INFO: renamed from: ymf$a */
    public static final class C15721a<T, R> implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final inf<? super R> f102073a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends R> f102074b;

        public C15721a(inf<? super R> infVar, py6<? super T, ? extends R> py6Var) {
            this.f102073a = infVar;
            this.f102074b = py6Var;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f102073a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f102073a.onSubscribe(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                this.f102073a.onSuccess(xjb.requireNonNull(this.f102074b.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    public ymf(pof<? extends T> pofVar, py6<? super T, ? extends R> py6Var) {
        this.f102071a = pofVar;
        this.f102072b = py6Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super R> infVar) {
        this.f102071a.subscribe(new C15721a(infVar, this.f102072b));
    }
}
