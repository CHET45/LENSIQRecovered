package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class z8a<T, R> extends AbstractC15921z2<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends R> f104375b;

    /* JADX INFO: renamed from: z8a$a */
    public static final class C16032a<T, R> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super R> f104376a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends R> f104377b;

        /* JADX INFO: renamed from: c */
        public mf4 f104378c;

        public C16032a(l9a<? super R> l9aVar, py6<? super T, ? extends R> py6Var) {
            this.f104376a = l9aVar;
            this.f104377b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            mf4 mf4Var = this.f104378c;
            this.f104378c = ag4.DISPOSED;
            mf4Var.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f104378c.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f104376a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f104376a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f104378c, mf4Var)) {
                this.f104378c = mf4Var;
                this.f104376a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                this.f104376a.onSuccess(xjb.requireNonNull(this.f104377b.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f104376a.onError(th);
            }
        }
    }

    public z8a(aaa<T> aaaVar, py6<? super T, ? extends R> py6Var) {
        super(aaaVar);
        this.f104375b = py6Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super R> l9aVar) {
        this.f103681a.subscribe(new C16032a(l9aVar, this.f104375b));
    }
}
