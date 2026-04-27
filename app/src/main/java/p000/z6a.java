package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class z6a<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f104289a;

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f104290b;

    /* JADX INFO: renamed from: z6a$a */
    public static final class C16019a<T> implements inf<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f104291a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f104292b;

        /* JADX INFO: renamed from: c */
        public mf4 f104293c;

        public C16019a(l9a<? super T> l9aVar, m8d<? super T> m8dVar) {
            this.f104291a = l9aVar;
            this.f104292b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            mf4 mf4Var = this.f104293c;
            this.f104293c = ag4.DISPOSED;
            mf4Var.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f104293c.isDisposed();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f104291a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f104293c, mf4Var)) {
                this.f104293c = mf4Var;
                this.f104291a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                if (this.f104292b.test(t)) {
                    this.f104291a.onSuccess(t);
                } else {
                    this.f104291a.onComplete();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f104291a.onError(th);
            }
        }
    }

    public z6a(pof<T> pofVar, m8d<? super T> m8dVar) {
        this.f104289a = pofVar;
        this.f104290b = m8dVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f104289a.subscribe(new C16019a(l9aVar, this.f104290b));
    }
}
