package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class olf<T, R> extends ljf<R> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f68093a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends pof<? extends R>> f68094b;

    /* JADX INFO: renamed from: olf$a */
    public static final class C10457a<T, R> extends AtomicReference<mf4> implements inf<T>, mf4 {
        private static final long serialVersionUID = 3258103020495908596L;

        /* JADX INFO: renamed from: a */
        public final inf<? super R> f68095a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends pof<? extends R>> f68096b;

        /* JADX INFO: renamed from: olf$a$a */
        public static final class a<R> implements inf<R> {

            /* JADX INFO: renamed from: a */
            public final AtomicReference<mf4> f68097a;

            /* JADX INFO: renamed from: b */
            public final inf<? super R> f68098b;

            public a(AtomicReference<mf4> atomicReference, inf<? super R> infVar) {
                this.f68097a = atomicReference;
                this.f68098b = infVar;
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                this.f68098b.onError(th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.replace(this.f68097a, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(R r) {
                this.f68098b.onSuccess(r);
            }
        }

        public C10457a(inf<? super R> infVar, py6<? super T, ? extends pof<? extends R>> py6Var) {
            this.f68095a = infVar;
            this.f68096b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f68095a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f68095a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                pof pofVar = (pof) xjb.requireNonNull(this.f68096b.apply(t), "The single returned by the mapper is null");
                if (isDisposed()) {
                    return;
                }
                pofVar.subscribe(new a(this, this.f68095a));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f68095a.onError(th);
            }
        }
    }

    public olf(pof<? extends T> pofVar, py6<? super T, ? extends pof<? extends R>> py6Var) {
        this.f68094b = py6Var;
        this.f68093a = pofVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super R> infVar) {
        this.f68093a.subscribe(new C10457a(infVar, this.f68094b));
    }
}
