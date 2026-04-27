package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vsb<T, R> extends ljf<R> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f92178a;

    /* JADX INFO: renamed from: b */
    public final R f92179b;

    /* JADX INFO: renamed from: c */
    public final j11<R, ? super T, R> f92180c;

    /* JADX INFO: renamed from: vsb$a */
    public static final class C14249a<T, R> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super R> f92181a;

        /* JADX INFO: renamed from: b */
        public final j11<R, ? super T, R> f92182b;

        /* JADX INFO: renamed from: c */
        public R f92183c;

        /* JADX INFO: renamed from: d */
        public mf4 f92184d;

        public C14249a(inf<? super R> infVar, j11<R, ? super T, R> j11Var, R r) {
            this.f92181a = infVar;
            this.f92183c = r;
            this.f92182b = j11Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f92184d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f92184d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            R r = this.f92183c;
            if (r != null) {
                this.f92183c = null;
                this.f92181a.onSuccess(r);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f92183c == null) {
                pfe.onError(th);
            } else {
                this.f92183c = null;
                this.f92181a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            R r = this.f92183c;
            if (r != null) {
                try {
                    this.f92183c = (R) xjb.requireNonNull(this.f92182b.apply(r, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f92184d.dispose();
                    onError(th);
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f92184d, mf4Var)) {
                this.f92184d = mf4Var;
                this.f92181a.onSubscribe(this);
            }
        }
    }

    public vsb(xub<T> xubVar, R r, j11<R, ? super T, R> j11Var) {
        this.f92178a = xubVar;
        this.f92179b = r;
        this.f92180c = j11Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super R> infVar) {
        this.f92178a.subscribe(new C14249a(infVar, this.f92180c, this.f92179b));
    }
}
