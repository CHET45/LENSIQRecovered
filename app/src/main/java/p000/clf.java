package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class clf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f16904a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super T> f16905b;

    /* JADX INFO: renamed from: clf$a */
    public final class C2379a implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f16906a;

        public C2379a(inf<? super T> infVar) {
            this.f16906a = infVar;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f16906a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f16906a.onSubscribe(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                clf.this.f16905b.accept(t);
                this.f16906a.onSuccess(t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f16906a.onError(th);
            }
        }
    }

    public clf(pof<T> pofVar, tu2<? super T> tu2Var) {
        this.f16904a = pofVar;
        this.f16905b = tu2Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f16904a.subscribe(new C2379a(infVar));
    }
}
