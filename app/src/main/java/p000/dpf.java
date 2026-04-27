package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class dpf<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f30350a;

    /* JADX INFO: renamed from: dpf$a */
    public static final class C4904a<T> extends e34<T> implements inf<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* JADX INFO: renamed from: C */
        public mf4 f30351C;

        public C4904a(oxb<? super T> oxbVar) {
            super(oxbVar);
        }

        @Override // p000.e34, p000.mf4
        public void dispose() {
            super.dispose();
            this.f30351C.dispose();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            error(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f30351C, mf4Var)) {
                this.f30351C = mf4Var;
                this.f31631a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            complete(t);
        }
    }

    public dpf(pof<? extends T> pofVar) {
        this.f30350a = pofVar;
    }

    public static <T> inf<T> create(oxb<? super T> oxbVar) {
        return new C4904a(oxbVar);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f30350a.subscribe(create(oxbVar));
    }
}
