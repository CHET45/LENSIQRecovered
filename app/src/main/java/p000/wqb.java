package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wqb<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f95160a;

    /* JADX INFO: renamed from: wqb$a */
    public static final class C14750a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f95161a;

        /* JADX INFO: renamed from: b */
        public mf4 f95162b;

        /* JADX INFO: renamed from: c */
        public T f95163c;

        public C14750a(l9a<? super T> l9aVar) {
            this.f95161a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f95162b.dispose();
            this.f95162b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f95162b == ag4.DISPOSED;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f95162b = ag4.DISPOSED;
            T t = this.f95163c;
            if (t == null) {
                this.f95161a.onComplete();
            } else {
                this.f95163c = null;
                this.f95161a.onSuccess(t);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f95162b = ag4.DISPOSED;
            this.f95163c = null;
            this.f95161a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f95163c = t;
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f95162b, mf4Var)) {
                this.f95162b = mf4Var;
                this.f95161a.onSubscribe(this);
            }
        }
    }

    public wqb(xub<T> xubVar) {
        this.f95160a = xubVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f95160a.subscribe(new C14750a(l9aVar));
    }
}
