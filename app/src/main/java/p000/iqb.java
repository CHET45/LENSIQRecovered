package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class iqb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: iqb$a */
    public static final class C7564a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f47970a;

        /* JADX INFO: renamed from: b */
        public mf4 f47971b;

        public C7564a(oxb<? super T> oxbVar) {
            this.f47970a = oxbVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f47971b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f47971b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f47970a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f47970a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f47971b = mf4Var;
            this.f47970a.onSubscribe(this);
        }
    }

    public iqb(xub<T> xubVar) {
        super(xubVar);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C7564a(oxbVar));
    }
}
