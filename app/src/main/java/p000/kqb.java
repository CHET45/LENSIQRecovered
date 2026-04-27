package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class kqb<T> extends yd2 implements z07<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f55060a;

    /* JADX INFO: renamed from: kqb$a */
    public static final class C8501a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final dh2 f55061a;

        /* JADX INFO: renamed from: b */
        public mf4 f55062b;

        public C8501a(dh2 dh2Var) {
            this.f55061a = dh2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f55062b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f55062b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f55061a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f55061a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f55062b = mf4Var;
            this.f55061a.onSubscribe(this);
        }
    }

    public kqb(xub<T> xubVar) {
        this.f55060a = xubVar;
    }

    @Override // p000.z07
    public Observable<T> fuseToObservable() {
        return pfe.onAssembly(new iqb(this.f55060a));
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f55060a.subscribe(new C8501a(dh2Var));
    }
}
