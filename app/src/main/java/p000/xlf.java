package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class xlf<T, R> extends s4a<R> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f98438a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends aaa<? extends R>> f98439b;

    /* JADX INFO: renamed from: xlf$a */
    public static final class C15186a<R> implements l9a<R> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<mf4> f98440a;

        /* JADX INFO: renamed from: b */
        public final l9a<? super R> f98441b;

        public C15186a(AtomicReference<mf4> atomicReference, l9a<? super R> l9aVar) {
            this.f98440a = atomicReference;
            this.f98441b = l9aVar;
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f98441b.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f98441b.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this.f98440a, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(R r) {
            this.f98441b.onSuccess(r);
        }
    }

    /* JADX INFO: renamed from: xlf$b */
    public static final class C15187b<T, R> extends AtomicReference<mf4> implements inf<T>, mf4 {
        private static final long serialVersionUID = -5843758257109742742L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super R> f98442a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends aaa<? extends R>> f98443b;

        public C15187b(l9a<? super R> l9aVar, py6<? super T, ? extends aaa<? extends R>> py6Var) {
            this.f98442a = l9aVar;
            this.f98443b = py6Var;
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
            this.f98442a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f98442a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                aaa aaaVar = (aaa) xjb.requireNonNull(this.f98443b.apply(t), "The mapper returned a null MaybeSource");
                if (isDisposed()) {
                    return;
                }
                aaaVar.subscribe(new C15186a(this, this.f98442a));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    public xlf(pof<? extends T> pofVar, py6<? super T, ? extends aaa<? extends R>> py6Var) {
        this.f98439b = py6Var;
        this.f98438a = pofVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super R> l9aVar) {
        this.f98438a.subscribe(new C15187b(l9aVar, this.f98439b));
    }
}
