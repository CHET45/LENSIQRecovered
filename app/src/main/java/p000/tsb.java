package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class tsb<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f85713a;

    /* JADX INFO: renamed from: b */
    public final j11<T, T, T> f85714b;

    /* JADX INFO: renamed from: tsb$a */
    public static final class C13183a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f85715a;

        /* JADX INFO: renamed from: b */
        public final j11<T, T, T> f85716b;

        /* JADX INFO: renamed from: c */
        public boolean f85717c;

        /* JADX INFO: renamed from: d */
        public T f85718d;

        /* JADX INFO: renamed from: e */
        public mf4 f85719e;

        public C13183a(l9a<? super T> l9aVar, j11<T, T, T> j11Var) {
            this.f85715a = l9aVar;
            this.f85716b = j11Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f85719e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f85719e.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f85717c) {
                return;
            }
            this.f85717c = true;
            T t = this.f85718d;
            this.f85718d = null;
            if (t != null) {
                this.f85715a.onSuccess(t);
            } else {
                this.f85715a.onComplete();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f85717c) {
                pfe.onError(th);
                return;
            }
            this.f85717c = true;
            this.f85718d = null;
            this.f85715a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f85717c) {
                return;
            }
            T t2 = this.f85718d;
            if (t2 == null) {
                this.f85718d = t;
                return;
            }
            try {
                this.f85718d = (T) xjb.requireNonNull(this.f85716b.apply(t2, t), "The reducer returned a null value");
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f85719e.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f85719e, mf4Var)) {
                this.f85719e = mf4Var;
                this.f85715a.onSubscribe(this);
            }
        }
    }

    public tsb(xub<T> xubVar, j11<T, T, T> j11Var) {
        this.f85713a = xubVar;
        this.f85714b = j11Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f85713a.subscribe(new C13183a(l9aVar, this.f85714b));
    }
}
