package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class se2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final hh2 f81514a;

    /* JADX INFO: renamed from: se2$a */
    public static final class C12543a extends AtomicReference<lf4> implements if2, lf4 {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: a */
        public final ch2 f81515a;

        public C12543a(ch2 downstream) {
            this.f81515a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.if2, p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.if2
        public void onComplete() {
            lf4 andSet;
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var || (andSet = getAndSet(zf4Var)) == zf4Var) {
                return;
            }
            try {
                this.f81515a.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // p000.if2
        public void onError(Throwable t) {
            if (tryOnError(t)) {
                return;
            }
            ofe.onError(t);
        }

        @Override // p000.if2
        public void setCancellable(bq1 c) {
            setDisposable(new iq1(c));
        }

        @Override // p000.if2
        public void setDisposable(lf4 d) {
            zf4.set(this, d);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C12543a.class.getSimpleName(), super.toString());
        }

        @Override // p000.if2
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
                this.f81515a.onError(t);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public se2(hh2 source) {
        this.f81514a = source;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        C12543a c12543a = new C12543a(observer);
        observer.onSubscribe(c12543a);
        try {
            this.f81514a.subscribe(c12543a);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            c12543a.onError(th);
        }
    }
}
