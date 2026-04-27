package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class ykb<T> extends ljf<Boolean> implements z07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f101922a;

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f101923b;

    /* JADX INFO: renamed from: ykb$a */
    public static final class C15707a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super Boolean> f101924a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f101925b;

        /* JADX INFO: renamed from: c */
        public mf4 f101926c;

        /* JADX INFO: renamed from: d */
        public boolean f101927d;

        public C15707a(inf<? super Boolean> infVar, m8d<? super T> m8dVar) {
            this.f101924a = infVar;
            this.f101925b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f101926c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f101926c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f101927d) {
                return;
            }
            this.f101927d = true;
            this.f101924a.onSuccess(Boolean.TRUE);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f101927d) {
                pfe.onError(th);
            } else {
                this.f101927d = true;
                this.f101924a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f101927d) {
                return;
            }
            try {
                if (this.f101925b.test(t)) {
                    return;
                }
                this.f101927d = true;
                this.f101926c.dispose();
                this.f101924a.onSuccess(Boolean.FALSE);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f101926c.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f101926c, mf4Var)) {
                this.f101926c = mf4Var;
                this.f101924a.onSubscribe(this);
            }
        }
    }

    public ykb(xub<T> xubVar, m8d<? super T> m8dVar) {
        this.f101922a = xubVar;
        this.f101923b = m8dVar;
    }

    @Override // p000.z07
    public Observable<Boolean> fuseToObservable() {
        return pfe.onAssembly(new wkb(this.f101922a, this.f101923b));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        this.f101922a.subscribe(new C15707a(infVar, this.f101923b));
    }
}
