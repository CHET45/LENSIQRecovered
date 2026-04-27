package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class elb<T> extends ljf<Boolean> implements z07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f33346a;

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f33347b;

    /* JADX INFO: renamed from: elb$a */
    public static final class C5367a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super Boolean> f33348a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f33349b;

        /* JADX INFO: renamed from: c */
        public mf4 f33350c;

        /* JADX INFO: renamed from: d */
        public boolean f33351d;

        public C5367a(inf<? super Boolean> infVar, m8d<? super T> m8dVar) {
            this.f33348a = infVar;
            this.f33349b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f33350c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f33350c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f33351d) {
                return;
            }
            this.f33351d = true;
            this.f33348a.onSuccess(Boolean.FALSE);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f33351d) {
                pfe.onError(th);
            } else {
                this.f33351d = true;
                this.f33348a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f33351d) {
                return;
            }
            try {
                if (this.f33349b.test(t)) {
                    this.f33351d = true;
                    this.f33350c.dispose();
                    this.f33348a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f33350c.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f33350c, mf4Var)) {
                this.f33350c = mf4Var;
                this.f33348a.onSubscribe(this);
            }
        }
    }

    public elb(xub<T> xubVar, m8d<? super T> m8dVar) {
        this.f33346a = xubVar;
        this.f33347b = m8dVar;
    }

    @Override // p000.z07
    public Observable<Boolean> fuseToObservable() {
        return pfe.onAssembly(new clb(this.f33346a, this.f33347b));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        this.f33346a.subscribe(new C5367a(infVar, this.f33347b));
    }
}
