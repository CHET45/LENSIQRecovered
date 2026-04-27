package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class uwb<T, D> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final nfg<? extends D> f89273a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super D, ? extends wub<? extends T>> f89274b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super D> f89275c;

    /* JADX INFO: renamed from: d */
    public final boolean f89276d;

    /* JADX INFO: renamed from: uwb$a */
    public static final class C13750a<T, D> extends AtomicBoolean implements pxb<T>, lf4 {
        private static final long serialVersionUID = 5904473792286235046L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f89277a;

        /* JADX INFO: renamed from: b */
        public final D f89278b;

        /* JADX INFO: renamed from: c */
        public final uu2<? super D> f89279c;

        /* JADX INFO: renamed from: d */
        public final boolean f89280d;

        /* JADX INFO: renamed from: e */
        public lf4 f89281e;

        public C13750a(pxb<? super T> actual, D resource, uu2<? super D> disposer, boolean eager) {
            this.f89277a = actual;
            this.f89278b = resource;
            this.f89279c = disposer;
            this.f89280d = eager;
        }

        /* JADX INFO: renamed from: a */
        public void m23616a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f89279c.accept(this.f89278b);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f89280d) {
                m23616a();
                this.f89281e.dispose();
                this.f89281e = zf4.DISPOSED;
            } else {
                this.f89281e.dispose();
                this.f89281e = zf4.DISPOSED;
                m23616a();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (!this.f89280d) {
                this.f89277a.onComplete();
                m23616a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f89279c.accept(this.f89278b);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f89277a.onError(th);
                    return;
                }
            }
            this.f89277a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable th) {
            if (!this.f89280d) {
                this.f89277a.onError(th);
                m23616a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f89279c.accept(this.f89278b);
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    th = new qm2(th, th2);
                }
            }
            this.f89277a.onError(th);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f89277a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f89281e, d)) {
                this.f89281e = d;
                this.f89277a.onSubscribe(this);
            }
        }
    }

    public uwb(nfg<? extends D> resourceSupplier, sy6<? super D, ? extends wub<? extends T>> sourceSupplier, uu2<? super D> disposer, boolean eager) {
        this.f89273a = resourceSupplier;
        this.f89274b = sourceSupplier;
        this.f89275c = disposer;
        this.f89276d = eager;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        try {
            D d = this.f89273a.get();
            try {
                wub<? extends T> wubVarApply = this.f89274b.apply(d);
                Objects.requireNonNull(wubVarApply, "The sourceSupplier returned a null ObservableSource");
                wubVarApply.subscribe(new C13750a(observer, d, this.f89275c, this.f89276d));
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                try {
                    this.f89275c.accept(d);
                    b05.error(th, observer);
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    b05.error(new qm2(th, th2), observer);
                }
            }
        } catch (Throwable th3) {
            o75.throwIfFatal(th3);
            b05.error(th3, observer);
        }
    }
}
