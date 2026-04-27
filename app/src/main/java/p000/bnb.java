package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class bnb<T> extends ljf<Long> implements z07<Long> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f14214a;

    /* JADX INFO: renamed from: bnb$a */
    public static final class C1958a implements oxb<Object>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super Long> f14215a;

        /* JADX INFO: renamed from: b */
        public mf4 f14216b;

        /* JADX INFO: renamed from: c */
        public long f14217c;

        public C1958a(inf<? super Long> infVar) {
            this.f14215a = infVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f14216b.dispose();
            this.f14216b = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f14216b.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f14216b = ag4.DISPOSED;
            this.f14215a.onSuccess(Long.valueOf(this.f14217c));
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f14216b = ag4.DISPOSED;
            this.f14215a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(Object obj) {
            this.f14217c++;
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f14216b, mf4Var)) {
                this.f14216b = mf4Var;
                this.f14215a.onSubscribe(this);
            }
        }
    }

    public bnb(xub<T> xubVar) {
        this.f14214a = xubVar;
    }

    @Override // p000.z07
    public Observable<Long> fuseToObservable() {
        return pfe.onAssembly(new zmb(this.f14214a));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Long> infVar) {
        this.f14214a.subscribe(new C1958a(infVar));
    }
}
