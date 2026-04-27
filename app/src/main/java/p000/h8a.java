package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class h8a<T> extends s4a<T> implements gh7<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f42923a;

    /* JADX INFO: renamed from: h8a$a */
    public static final class C6753a<T> implements inf<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f42924a;

        /* JADX INFO: renamed from: b */
        public mf4 f42925b;

        public C6753a(l9a<? super T> l9aVar) {
            this.f42924a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f42925b.dispose();
            this.f42925b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f42925b.isDisposed();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f42925b = ag4.DISPOSED;
            this.f42924a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f42925b, mf4Var)) {
                this.f42925b = mf4Var;
                this.f42924a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f42925b = ag4.DISPOSED;
            this.f42924a.onSuccess(t);
        }
    }

    public h8a(pof<T> pofVar) {
        this.f42923a = pofVar;
    }

    @Override // p000.gh7
    public pof<T> source() {
        return this.f42923a;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f42923a.subscribe(new C6753a(l9aVar));
    }
}
