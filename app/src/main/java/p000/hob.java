package p000;

import io.reactivex.Observable;

/* JADX INFO: loaded from: classes7.dex */
public final class hob<T> extends s4a<T> implements z07<T> {

    /* JADX INFO: renamed from: a */
    public final xub<T> f44408a;

    /* JADX INFO: renamed from: b */
    public final long f44409b;

    /* JADX INFO: renamed from: hob$a */
    public static final class C6957a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f44410a;

        /* JADX INFO: renamed from: b */
        public final long f44411b;

        /* JADX INFO: renamed from: c */
        public mf4 f44412c;

        /* JADX INFO: renamed from: d */
        public long f44413d;

        /* JADX INFO: renamed from: e */
        public boolean f44414e;

        public C6957a(l9a<? super T> l9aVar, long j) {
            this.f44410a = l9aVar;
            this.f44411b = j;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f44412c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f44412c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f44414e) {
                return;
            }
            this.f44414e = true;
            this.f44410a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f44414e) {
                pfe.onError(th);
            } else {
                this.f44414e = true;
                this.f44410a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f44414e) {
                return;
            }
            long j = this.f44413d;
            if (j != this.f44411b) {
                this.f44413d = j + 1;
                return;
            }
            this.f44414e = true;
            this.f44412c.dispose();
            this.f44410a.onSuccess(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f44412c, mf4Var)) {
                this.f44412c = mf4Var;
                this.f44410a.onSubscribe(this);
            }
        }
    }

    public hob(xub<T> xubVar, long j) {
        this.f44408a = xubVar;
        this.f44409b = j;
    }

    @Override // p000.z07
    public Observable<T> fuseToObservable() {
        return pfe.onAssembly(new fob(this.f44408a, this.f44409b, null, false));
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        this.f44408a.subscribe(new C6957a(l9aVar, this.f44409b));
    }
}
