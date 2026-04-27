package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class vjf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final nnf<T> f91412a;

    /* JADX INFO: renamed from: vjf$a */
    public static final class C14125a<T> extends AtomicReference<mf4> implements jlf<T>, mf4 {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f91413a;

        public C14125a(inf<? super T> infVar) {
            this.f91413a = infVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.jlf, p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.jlf
        public void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            pfe.onError(th);
        }

        @Override // p000.jlf
        public void onSuccess(T t) {
            mf4 andSet;
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var || (andSet = getAndSet(ag4Var)) == ag4Var) {
                return;
            }
            try {
                if (t == null) {
                    this.f91413a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f91413a.onSuccess(t);
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

        @Override // p000.jlf
        public void setCancellable(aq1 aq1Var) {
            setDisposable(new jq1(aq1Var));
        }

        @Override // p000.jlf
        public void setDisposable(mf4 mf4Var) {
            ag4.set(this, mf4Var);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C14125a.class.getSimpleName(), super.toString());
        }

        @Override // p000.jlf
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
                this.f91413a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public vjf(nnf<T> nnfVar) {
        this.f91412a = nnfVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        C14125a c14125a = new C14125a(infVar);
        infVar.onSubscribe(c14125a);
        try {
            this.f91412a.subscribe(c14125a);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c14125a.onError(th);
        }
    }
}
