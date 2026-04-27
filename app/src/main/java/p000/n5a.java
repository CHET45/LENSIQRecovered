package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class n5a<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final s9a<T> f63341a;

    /* JADX INFO: renamed from: n5a$a */
    public static final class C9704a<T> extends AtomicReference<lf4> implements n6a<T>, lf4 {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f63342a;

        public C9704a(k9a<? super T> downstream) {
            this.f63342a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.n6a, p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.n6a
        public void onComplete() {
            lf4 andSet;
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var || (andSet = getAndSet(zf4Var)) == zf4Var) {
                return;
            }
            try {
                this.f63342a.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // p000.n6a
        public void onError(Throwable t) {
            if (tryOnError(t)) {
                return;
            }
            ofe.onError(t);
        }

        @Override // p000.n6a
        public void onSuccess(T value) {
            lf4 andSet;
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var || (andSet = getAndSet(zf4Var)) == zf4Var) {
                return;
            }
            try {
                if (value == null) {
                    this.f63342a.onError(k75.createNullPointerException("onSuccess called with a null value."));
                } else {
                    this.f63342a.onSuccess(value);
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

        @Override // p000.n6a
        public void setCancellable(bq1 c) {
            setDisposable(new iq1(c));
        }

        @Override // p000.n6a
        public void setDisposable(lf4 d) {
            zf4.set(this, d);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C9704a.class.getSimpleName(), super.toString());
        }

        @Override // p000.n6a
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
                this.f63342a.onError(t);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public n5a(s9a<T> source) {
        this.f63341a = source;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        C9704a c9704a = new C9704a(observer);
        observer.onSubscribe(c9704a);
        try {
            this.f63341a.subscribe(c9704a);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            c9704a.onError(th);
        }
    }
}
