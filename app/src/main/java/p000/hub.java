package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class hub<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f44896a;

    /* JADX INFO: renamed from: hub$a */
    public static final class C7022a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f44897a;

        /* JADX INFO: renamed from: b */
        public mf4 f44898b;

        /* JADX INFO: renamed from: c */
        public T f44899c;

        /* JADX INFO: renamed from: d */
        public boolean f44900d;

        public C7022a(l9a<? super T> l9aVar) {
            this.f44897a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f44898b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f44898b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f44900d) {
                return;
            }
            this.f44900d = true;
            T t = this.f44899c;
            this.f44899c = null;
            if (t == null) {
                this.f44897a.onComplete();
            } else {
                this.f44897a.onSuccess(t);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f44900d) {
                pfe.onError(th);
            } else {
                this.f44900d = true;
                this.f44897a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f44900d) {
                return;
            }
            if (this.f44899c == null) {
                this.f44899c = t;
                return;
            }
            this.f44900d = true;
            this.f44898b.dispose();
            this.f44897a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f44898b, mf4Var)) {
                this.f44898b = mf4Var;
                this.f44897a.onSubscribe(this);
            }
        }
    }

    public hub(xub<T> xubVar) {
        this.f44896a = xubVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f44896a.subscribe(new C7022a(l9aVar));
    }
}
