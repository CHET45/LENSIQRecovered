package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class pvb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: pvb$a */
    public static final class C11145a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f72223a;

        /* JADX INFO: renamed from: b */
        public mf4 f72224b;

        /* JADX INFO: renamed from: c */
        public T f72225c;

        public C11145a(oxb<? super T> oxbVar) {
            this.f72223a = oxbVar;
        }

        /* JADX INFO: renamed from: a */
        public void m19795a() {
            T t = this.f72225c;
            if (t != null) {
                this.f72225c = null;
                this.f72223a.onNext(t);
            }
            this.f72223a.onComplete();
        }

        @Override // p000.mf4
        public void dispose() {
            this.f72225c = null;
            this.f72224b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f72224b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            m19795a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f72225c = null;
            this.f72223a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f72225c = t;
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f72224b, mf4Var)) {
                this.f72224b = mf4Var;
                this.f72223a.onSubscribe(this);
            }
        }
    }

    public pvb(xub<T> xubVar) {
        super(xubVar);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C11145a(oxbVar));
    }
}
