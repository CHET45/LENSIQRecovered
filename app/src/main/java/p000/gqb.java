package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gqb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: gqb$a */
    public static final class C6465a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f40794a;

        /* JADX INFO: renamed from: b */
        public mf4 f40795b;

        public C6465a(oxb<? super T> oxbVar) {
            this.f40794a = oxbVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f40795b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f40795b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f40794a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f40794a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f40794a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f40795b, mf4Var)) {
                this.f40795b = mf4Var;
                this.f40794a.onSubscribe(this);
            }
        }
    }

    public gqb(xub<T> xubVar) {
        super(xubVar);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C6465a(oxbVar));
    }
}
