package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class iba<T, D> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends D> f46449a;

    /* JADX INFO: renamed from: b */
    public final py6<? super D, ? extends aaa<? extends T>> f46450b;

    /* JADX INFO: renamed from: c */
    public final tu2<? super D> f46451c;

    /* JADX INFO: renamed from: d */
    public final boolean f46452d;

    /* JADX INFO: renamed from: iba$a */
    public static final class C7225a<T, D> extends AtomicReference<Object> implements l9a<T>, mf4 {
        private static final long serialVersionUID = -674404550052917487L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f46453a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super D> f46454b;

        /* JADX INFO: renamed from: c */
        public final boolean f46455c;

        /* JADX INFO: renamed from: d */
        public mf4 f46456d;

        public C7225a(l9a<? super T> l9aVar, D d, tu2<? super D> tu2Var, boolean z) {
            super(d);
            this.f46453a = l9aVar;
            this.f46454b = tu2Var;
            this.f46455c = z;
        }

        /* JADX INFO: renamed from: a */
        public void m12887a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f46454b.accept(andSet);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f46456d.dispose();
            this.f46456d = ag4.DISPOSED;
            m12887a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f46456d.isDisposed();
        }

        @Override // p000.l9a
        public void onComplete() {
            this.f46456d = ag4.DISPOSED;
            if (this.f46455c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f46454b.accept(andSet);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f46453a.onError(th);
                    return;
                }
            }
            this.f46453a.onComplete();
            if (this.f46455c) {
                return;
            }
            m12887a();
        }

        @Override // p000.l9a
        public void onError(Throwable th) {
            this.f46456d = ag4.DISPOSED;
            if (this.f46455c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f46454b.accept(andSet);
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    th = new pm2(th, th2);
                }
            }
            this.f46453a.onError(th);
            if (this.f46455c) {
                return;
            }
            m12887a();
        }

        @Override // p000.l9a
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f46456d, mf4Var)) {
                this.f46456d = mf4Var;
                this.f46453a.onSubscribe(this);
            }
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            this.f46456d = ag4.DISPOSED;
            if (this.f46455c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f46454b.accept(andSet);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f46453a.onError(th);
                    return;
                }
            }
            this.f46453a.onSuccess(t);
            if (this.f46455c) {
                return;
            }
            m12887a();
        }
    }

    public iba(Callable<? extends D> callable, py6<? super D, ? extends aaa<? extends T>> py6Var, tu2<? super D> tu2Var, boolean z) {
        this.f46449a = callable;
        this.f46450b = py6Var;
        this.f46451c = tu2Var;
        this.f46452d = z;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        try {
            D dCall = this.f46449a.call();
            try {
                ((aaa) xjb.requireNonNull(this.f46450b.apply(dCall), "The sourceSupplier returned a null MaybeSource")).subscribe(new C7225a(l9aVar, dCall, this.f46451c, this.f46452d));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                if (this.f46452d) {
                    try {
                        this.f46451c.accept(dCall);
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        c05.error(new pm2(th, th2), l9aVar);
                        return;
                    }
                }
                c05.error(th, l9aVar);
                if (this.f46452d) {
                    return;
                }
                try {
                    this.f46451c.accept(dCall);
                } catch (Throwable th3) {
                    n75.throwIfFatal(th3);
                    pfe.onError(th3);
                }
            }
        } catch (Throwable th4) {
            n75.throwIfFatal(th4);
            c05.error(th4, l9aVar);
        }
    }
}
