package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class a8a<T> extends s4a<T> implements yg7 {

    /* JADX INFO: renamed from: a */
    public final qh2 f617a;

    /* JADX INFO: renamed from: a8a$a */
    public static final class C0089a<T> implements dh2, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f618a;

        /* JADX INFO: renamed from: b */
        public mf4 f619b;

        public C0089a(l9a<? super T> l9aVar) {
            this.f618a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f619b.dispose();
            this.f619b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f619b.isDisposed();
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f619b = ag4.DISPOSED;
            this.f618a.onComplete();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f619b = ag4.DISPOSED;
            this.f618a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f619b, mf4Var)) {
                this.f619b = mf4Var;
                this.f618a.onSubscribe(this);
            }
        }
    }

    public a8a(qh2 qh2Var) {
        this.f617a = qh2Var;
    }

    @Override // p000.yg7
    public qh2 source() {
        return this.f617a;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f617a.subscribe(new C0089a(l9aVar));
    }
}
