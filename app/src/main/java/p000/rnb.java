package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class rnb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: rnb$a */
    public static final class C12167a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public oxb<? super T> f78795a;

        /* JADX INFO: renamed from: b */
        public mf4 f78796b;

        public C12167a(oxb<? super T> oxbVar) {
            this.f78795a = oxbVar;
        }

        @Override // p000.mf4
        public void dispose() {
            mf4 mf4Var = this.f78796b;
            this.f78796b = yz4.INSTANCE;
            this.f78795a = yz4.asObserver();
            mf4Var.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f78796b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            oxb<? super T> oxbVar = this.f78795a;
            this.f78796b = yz4.INSTANCE;
            this.f78795a = yz4.asObserver();
            oxbVar.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            oxb<? super T> oxbVar = this.f78795a;
            this.f78796b = yz4.INSTANCE;
            this.f78795a = yz4.asObserver();
            oxbVar.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f78795a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f78796b, mf4Var)) {
                this.f78796b = mf4Var;
                this.f78795a.onSubscribe(this);
            }
        }
    }

    public rnb(xub<T> xubVar) {
        super(xubVar);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C12167a(oxbVar));
    }
}
