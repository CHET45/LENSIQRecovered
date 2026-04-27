package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class wjf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final mnf<T> f94438a;

    /* JADX INFO: renamed from: wjf$a */
    public static final class C14648a<T> extends AtomicReference<lf4> implements ilf<T>, lf4 {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f94439a;

        public C14648a(hnf<? super T> downstream) {
            this.f94439a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.ilf, p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.ilf
        public void onError(Throwable t) {
            if (tryOnError(t)) {
                return;
            }
            ofe.onError(t);
        }

        @Override // p000.ilf
        public void onSuccess(T value) {
            lf4 andSet;
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var || (andSet = getAndSet(zf4Var)) == zf4Var) {
                return;
            }
            try {
                if (value == null) {
                    this.f94439a.onError(k75.createNullPointerException("onSuccess called with a null value."));
                } else {
                    this.f94439a.onSuccess(value);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // p000.ilf
        public void setCancellable(bq1 c) {
            setDisposable(new iq1(c));
        }

        @Override // p000.ilf
        public void setDisposable(lf4 d) {
            zf4.set(this, d);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C14648a.class.getSimpleName(), super.toString());
        }

        @Override // p000.ilf
        public boolean tryOnError(Throwable t) {
            lf4 andSet;
            if (t == null) {
                t = k75.createNullPointerException("onError called with a null Throwable.");
            }
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var || (andSet = getAndSet(zf4Var)) == zf4Var) {
                return false;
            }
            try {
                this.f94439a.onError(t);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public wjf(mnf<T> source) {
        this.f94438a = source;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        C14648a c14648a = new C14648a(observer);
        observer.onSubscribe(c14648a);
        try {
            this.f94438a.subscribe(c14648a);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            c14648a.onError(th);
        }
    }
}
