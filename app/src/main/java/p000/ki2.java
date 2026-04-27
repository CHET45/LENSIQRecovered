package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ki2<R> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final nfg<R> f54174a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super R, ? extends ph2> f54175b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super R> f54176c;

    /* JADX INFO: renamed from: d */
    public final boolean f54177d;

    /* JADX INFO: renamed from: ki2$a */
    public static final class C8372a<R> extends AtomicReference<Object> implements ch2, lf4 {
        private static final long serialVersionUID = -674404550052917487L;

        /* JADX INFO: renamed from: a */
        public final ch2 f54178a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super R> f54179b;

        /* JADX INFO: renamed from: c */
        public final boolean f54180c;

        /* JADX INFO: renamed from: d */
        public lf4 f54181d;

        public C8372a(ch2 actual, R resource, uu2<? super R> disposer, boolean eager) {
            super(resource);
            this.f54178a = actual;
            this.f54179b = disposer;
            this.f54180c = eager;
        }

        /* JADX INFO: renamed from: a */
        public void m14751a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f54179b.accept(andSet);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f54180c) {
                m14751a();
                this.f54181d.dispose();
                this.f54181d = zf4.DISPOSED;
            } else {
                this.f54181d.dispose();
                this.f54181d = zf4.DISPOSED;
                m14751a();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f54181d.isDisposed();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f54181d = zf4.DISPOSED;
            if (this.f54180c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f54179b.accept(andSet);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f54178a.onError(th);
                    return;
                }
            }
            this.f54178a.onComplete();
            if (this.f54180c) {
                return;
            }
            m14751a();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f54181d = zf4.DISPOSED;
            if (this.f54180c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f54179b.accept(andSet);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    e = new qm2(e, th);
                }
            }
            this.f54178a.onError(e);
            if (this.f54180c) {
                return;
            }
            m14751a();
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f54181d, d)) {
                this.f54181d = d;
                this.f54178a.onSubscribe(this);
            }
        }
    }

    public ki2(nfg<R> resourceSupplier, sy6<? super R, ? extends ph2> completableFunction, uu2<? super R> disposer, boolean eager) {
        this.f54174a = resourceSupplier;
        this.f54175b = completableFunction;
        this.f54176c = disposer;
        this.f54177d = eager;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        try {
            R r = this.f54174a.get();
            try {
                ph2 ph2VarApply = this.f54175b.apply(r);
                Objects.requireNonNull(ph2VarApply, "The completableFunction returned a null CompletableSource");
                ph2VarApply.subscribe(new C8372a(observer, r, this.f54176c, this.f54177d));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                if (this.f54177d) {
                    try {
                        this.f54176c.accept(r);
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        b05.error(new qm2(th, th2), observer);
                        return;
                    }
                }
                b05.error(th, observer);
                if (this.f54177d) {
                    return;
                }
                try {
                    this.f54176c.accept(r);
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
