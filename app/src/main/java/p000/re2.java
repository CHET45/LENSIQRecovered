package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class re2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final ih2 f77977a;

    /* JADX INFO: renamed from: re2$a */
    public static final class C12035a extends AtomicReference<mf4> implements jf2, mf4 {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: a */
        public final dh2 f77978a;

        public C12035a(dh2 dh2Var) {
            this.f77978a = dh2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.jf2, p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.jf2
        public void onComplete() {
            mf4 andSet;
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var || (andSet = getAndSet(ag4Var)) == ag4Var) {
                return;
            }
            try {
                this.f77978a.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // p000.jf2
        public void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            pfe.onError(th);
        }

        @Override // p000.jf2
        public void setCancellable(aq1 aq1Var) {
            setDisposable(new jq1(aq1Var));
        }

        @Override // p000.jf2
        public void setDisposable(mf4 mf4Var) {
            ag4.set(this, mf4Var);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C12035a.class.getSimpleName(), super.toString());
        }

        @Override // p000.jf2
        public boolean tryOnError(Throwable th) {
            mf4 andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var || (andSet = getAndSet(ag4Var)) == ag4Var) {
                return false;
            }
            try {
                this.f77978a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public re2(ih2 ih2Var) {
        this.f77977a = ih2Var;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        C12035a c12035a = new C12035a(dh2Var);
        dh2Var.onSubscribe(c12035a);
        try {
            this.f77977a.subscribe(c12035a);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c12035a.onError(th);
        }
    }
}
