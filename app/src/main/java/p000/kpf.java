package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class kpf<T, U> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<U> f54918a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super U, ? extends oof<? extends T>> f54919b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super U> f54920c;

    /* JADX INFO: renamed from: d */
    public final boolean f54921d;

    /* JADX INFO: renamed from: kpf$a */
    public static final class C8491a<T, U> extends AtomicReference<Object> implements hnf<T>, lf4 {
        private static final long serialVersionUID = -5331524057054083935L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f54922a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super U> f54923b;

        /* JADX INFO: renamed from: c */
        public final boolean f54924c;

        /* JADX INFO: renamed from: d */
        public lf4 f54925d;

        public C8491a(hnf<? super T> actual, U resource, boolean eager, uu2<? super U> disposer) {
            super(resource);
            this.f54922a = actual;
            this.f54924c = eager;
            this.f54923b = disposer;
        }

        /* JADX INFO: renamed from: a */
        public void m14894a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f54923b.accept(andSet);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f54924c) {
                m14894a();
                this.f54925d.dispose();
                this.f54925d = zf4.DISPOSED;
            } else {
                this.f54925d.dispose();
                this.f54925d = zf4.DISPOSED;
                m14894a();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f54925d.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f54925d = zf4.DISPOSED;
            if (this.f54924c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f54923b.accept(andSet);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    e = new qm2(e, th);
                }
            }
            this.f54922a.onError(e);
            if (this.f54924c) {
                return;
            }
            m14894a();
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f54925d, d)) {
                this.f54925d = d;
                this.f54922a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f54925d = zf4.DISPOSED;
            if (this.f54924c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f54923b.accept(andSet);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f54922a.onError(th);
                    return;
                }
            }
            this.f54922a.onSuccess(value);
            if (this.f54924c) {
                return;
            }
            m14894a();
        }
    }

    public kpf(nfg<U> resourceSupplier, sy6<? super U, ? extends oof<? extends T>> singleFunction, uu2<? super U> disposer, boolean eager) {
        this.f54918a = resourceSupplier;
        this.f54919b = singleFunction;
        this.f54920c = disposer;
        this.f54921d = eager;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        try {
            U u = this.f54918a.get();
            try {
                oof<? extends T> oofVarApply = this.f54919b.apply(u);
                Objects.requireNonNull(oofVarApply, "The singleFunction returned a null SingleSource");
                oofVarApply.subscribe(new C8491a(observer, u, this.f54921d, this.f54920c));
            } catch (Throwable th) {
                th = th;
                o75.throwIfFatal(th);
                if (this.f54921d) {
                    try {
                        this.f54920c.accept(u);
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        th = new qm2(th, th2);
                    }
                }
                b05.error(th, observer);
                if (this.f54921d) {
                    return;
                }
                try {
                    this.f54920c.accept(u);
                } catch (Throwable th3) {
                    o75.throwIfFatal(th3);
                    ofe.onError(th3);
                }
            }
        } catch (Throwable th4) {
            o75.throwIfFatal(th4);
            b05.error(th4, observer);
        }
    }
}
