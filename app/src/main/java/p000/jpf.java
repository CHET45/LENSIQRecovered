package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jpf<T, U> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<U> f51421a;

    /* JADX INFO: renamed from: b */
    public final py6<? super U, ? extends pof<? extends T>> f51422b;

    /* JADX INFO: renamed from: c */
    public final tu2<? super U> f51423c;

    /* JADX INFO: renamed from: d */
    public final boolean f51424d;

    /* JADX INFO: renamed from: jpf$a */
    public static final class C8007a<T, U> extends AtomicReference<Object> implements inf<T>, mf4 {
        private static final long serialVersionUID = -5331524057054083935L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f51425a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super U> f51426b;

        /* JADX INFO: renamed from: c */
        public final boolean f51427c;

        /* JADX INFO: renamed from: d */
        public mf4 f51428d;

        public C8007a(inf<? super T> infVar, U u, boolean z, tu2<? super U> tu2Var) {
            super(u);
            this.f51425a = infVar;
            this.f51427c = z;
            this.f51426b = tu2Var;
        }

        /* JADX INFO: renamed from: a */
        public void m14230a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f51426b.accept(andSet);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f51428d.dispose();
            this.f51428d = ag4.DISPOSED;
            m14230a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f51428d.isDisposed();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f51428d = ag4.DISPOSED;
            if (this.f51427c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f51426b.accept(andSet);
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    th = new pm2(th, th2);
                }
            }
            this.f51425a.onError(th);
            if (this.f51427c) {
                return;
            }
            m14230a();
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f51428d, mf4Var)) {
                this.f51428d = mf4Var;
                this.f51425a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f51428d = ag4.DISPOSED;
            if (this.f51427c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f51426b.accept(andSet);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f51425a.onError(th);
                    return;
                }
            }
            this.f51425a.onSuccess(t);
            if (this.f51427c) {
                return;
            }
            m14230a();
        }
    }

    public jpf(Callable<U> callable, py6<? super U, ? extends pof<? extends T>> py6Var, tu2<? super U> tu2Var, boolean z) {
        this.f51421a = callable;
        this.f51422b = py6Var;
        this.f51423c = tu2Var;
        this.f51424d = z;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        try {
            U uCall = this.f51421a.call();
            try {
                ((pof) xjb.requireNonNull(this.f51422b.apply(uCall), "The singleFunction returned a null SingleSource")).subscribe(new C8007a(infVar, uCall, this.f51424d, this.f51423c));
            } catch (Throwable th) {
                th = th;
                n75.throwIfFatal(th);
                if (this.f51424d) {
                    try {
                        this.f51423c.accept(uCall);
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        th = new pm2(th, th2);
                    }
                }
                c05.error(th, infVar);
                if (this.f51424d) {
                    return;
                }
                try {
                    this.f51423c.accept(uCall);
                } catch (Throwable th3) {
                    n75.throwIfFatal(th3);
                    pfe.onError(th3);
                }
            }
        } catch (Throwable th4) {
            n75.throwIfFatal(th4);
            c05.error(th4, infVar);
        }
    }
}
