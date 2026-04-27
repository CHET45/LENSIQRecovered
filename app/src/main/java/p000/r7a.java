package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class r7a<T, R> extends s4a<R> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f77327a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends pof<? extends R>> f77328b;

    /* JADX INFO: renamed from: r7a$a */
    public static final class C11933a<T, R> extends AtomicReference<mf4> implements l9a<T>, mf4 {
        private static final long serialVersionUID = 4827726964688405508L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super R> f77329a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends pof<? extends R>> f77330b;

        public C11933a(l9a<? super R> l9aVar, py6<? super T, ? extends pof<? extends R>> py6Var) {
            this.f77329a = l9aVar;
            this.f77330b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f77329a.onComplete();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f77329a.onError(th);
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f77329a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                ((pof) xjb.requireNonNull(this.f77330b.apply(t), "The mapper returned a null SingleSource")).subscribe(new C11934b(this, this.f77329a));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    /* JADX INFO: renamed from: r7a$b */
    public static final class C11934b<R> implements inf<R> {

        /* JADX INFO: renamed from: a */
        public final AtomicReference<mf4> f77331a;

        /* JADX INFO: renamed from: b */
        public final l9a<? super R> f77332b;

        public C11934b(AtomicReference<mf4> atomicReference, l9a<? super R> l9aVar) {
            this.f77331a = atomicReference;
            this.f77332b = l9aVar;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f77332b.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this.f77331a, mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(R r) {
            this.f77332b.onSuccess(r);
        }
    }

    public r7a(aaa<T> aaaVar, py6<? super T, ? extends pof<? extends R>> py6Var) {
        this.f77327a = aaaVar;
        this.f77328b = py6Var;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super R> l9aVar) {
        this.f77327a.subscribe(new C11933a(l9aVar, this.f77328b));
    }
}
