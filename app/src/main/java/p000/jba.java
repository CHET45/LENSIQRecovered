package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jba<T, D> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends D> f50235a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super D, ? extends z9a<? extends T>> f50236b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super D> f50237c;

    /* JADX INFO: renamed from: d */
    public final boolean f50238d;

    /* JADX INFO: renamed from: jba$a */
    public static final class C7842a<T, D> extends AtomicReference<Object> implements k9a<T>, lf4 {
        private static final long serialVersionUID = -674404550052917487L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f50239a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super D> f50240b;

        /* JADX INFO: renamed from: c */
        public final boolean f50241c;

        /* JADX INFO: renamed from: d */
        public lf4 f50242d;

        public C7842a(k9a<? super T> actual, D resource, uu2<? super D> disposer, boolean eager) {
            super(resource);
            this.f50239a = actual;
            this.f50240b = disposer;
            this.f50241c = eager;
        }

        /* JADX INFO: renamed from: a */
        public void m13933a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f50240b.accept(andSet);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f50241c) {
                m13933a();
                this.f50242d.dispose();
                this.f50242d = zf4.DISPOSED;
            } else {
                this.f50242d.dispose();
                this.f50242d = zf4.DISPOSED;
                m13933a();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f50242d.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f50242d = zf4.DISPOSED;
            if (this.f50241c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f50240b.accept(andSet);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f50239a.onError(th);
                    return;
                }
            }
            this.f50239a.onComplete();
            if (this.f50241c) {
                return;
            }
            m13933a();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f50242d = zf4.DISPOSED;
            if (this.f50241c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f50240b.accept(andSet);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    e = new qm2(e, th);
                }
            }
            this.f50239a.onError(e);
            if (this.f50241c) {
                return;
            }
            m13933a();
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f50242d, d)) {
                this.f50242d = d;
                this.f50239a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f50242d = zf4.DISPOSED;
            if (this.f50241c) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f50240b.accept(andSet);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f50239a.onError(th);
                    return;
                }
            }
            this.f50239a.onSuccess(value);
            if (this.f50241c) {
                return;
            }
            m13933a();
        }
    }

    public jba(nfg<? extends D> resourceSupplier, sy6<? super D, ? extends z9a<? extends T>> sourceSupplier, uu2<? super D> resourceDisposer, boolean eager) {
        this.f50235a = resourceSupplier;
        this.f50236b = sourceSupplier;
        this.f50237c = resourceDisposer;
        this.f50238d = eager;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        try {
            D d = this.f50235a.get();
            try {
                z9a<? extends T> z9aVarApply = this.f50236b.apply(d);
                Objects.requireNonNull(z9aVarApply, "The sourceSupplier returned a null MaybeSource");
                z9aVarApply.subscribe(new C7842a(observer, d, this.f50237c, this.f50238d));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                if (this.f50238d) {
                    try {
                        this.f50237c.accept(d);
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        b05.error(new qm2(th, th2), observer);
                        return;
                    }
                }
                b05.error(th, observer);
                if (this.f50238d) {
                    return;
                }
                try {
                    this.f50237c.accept(d);
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
