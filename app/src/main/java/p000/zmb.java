package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zmb<T> extends AbstractC10162o3<T, Long> {

    /* JADX INFO: renamed from: zmb$a */
    public static final class C16187a implements oxb<Object>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super Long> f105478a;

        /* JADX INFO: renamed from: b */
        public mf4 f105479b;

        /* JADX INFO: renamed from: c */
        public long f105480c;

        public C16187a(oxb<? super Long> oxbVar) {
            this.f105478a = oxbVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f105479b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f105479b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f105478a.onNext(Long.valueOf(this.f105480c));
            this.f105478a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f105478a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(Object obj) {
            this.f105480c++;
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f105479b, mf4Var)) {
                this.f105479b = mf4Var;
                this.f105478a.onSubscribe(this);
            }
        }
    }

    public zmb(xub<T> xubVar) {
        super(xubVar);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Long> oxbVar) {
        this.f66354a.subscribe(new C16187a(oxbVar));
    }
}
