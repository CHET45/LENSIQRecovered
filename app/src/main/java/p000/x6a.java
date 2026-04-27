package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class x6a<T> extends AbstractC15921z2<T, T> {

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f96892b;

    /* JADX INFO: renamed from: x6a$a */
    public static final class C14941a<T> implements l9a<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f96893a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f96894b;

        /* JADX INFO: renamed from: c */
        public mf4 f96895c;

        public C14941a(l9a<? super T> l9aVar, m8d<? super T> m8dVar) {
            this.f96893a = l9aVar;
            this.f96894b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            mf4 mf4Var = this.f96895c;
            this.f96895c = ag4.DISPOSED;
            mf4Var.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f96895c.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f96893a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f96893a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f96895c, mf4Var)) {
                this.f96895c = mf4Var;
                this.f96893a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                if (this.f96894b.test(t)) {
                    this.f96893a.onSuccess(t);
                } else {
                    this.f96893a.onComplete();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f96893a.onError(th);
            }
        }
    }

    public x6a(aaa<T> aaaVar, m8d<? super T> m8dVar) {
        super(aaaVar);
        this.f96892b = m8dVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f103681a.subscribe(new C14941a(l9aVar, this.f96892b));
    }
}
