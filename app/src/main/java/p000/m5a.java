package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class m5a<T> extends s4a<T> {

    /* JADX INFO: renamed from: a */
    public final t9a<T> f59939a;

    /* JADX INFO: renamed from: m5a$a */
    public static final class C9147a<T> extends AtomicReference<mf4> implements o6a<T>, mf4 {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super T> f59940a;

        public C9147a(l9a<? super T> l9aVar) {
            this.f59940a = l9aVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.o6a, p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.o6a
        public void onComplete() {
            mf4 andSet;
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var || (andSet = getAndSet(ag4Var)) == ag4Var) {
                return;
            }
            try {
                this.f59940a.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // p000.o6a
        public void onError(Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            pfe.onError(th);
        }

        @Override // p000.o6a
        public void onSuccess(T t) {
            mf4 andSet;
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var || (andSet = getAndSet(ag4Var)) == ag4Var) {
                return;
            }
            try {
                if (t == null) {
                    this.f59940a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f59940a.onSuccess(t);
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

        @Override // p000.o6a
        public void setCancellable(aq1 aq1Var) {
            setDisposable(new jq1(aq1Var));
        }

        @Override // p000.o6a
        public void setDisposable(mf4 mf4Var) {
            ag4.set(this, mf4Var);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C9147a.class.getSimpleName(), super.toString());
        }

        @Override // p000.o6a
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
                this.f59940a.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public m5a(t9a<T> t9aVar) {
        this.f59939a = t9aVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super T> l9aVar) {
        C9147a c9147a = new C9147a(l9aVar);
        l9aVar.onSubscribe(c9147a);
        try {
            this.f59939a.subscribe(c9147a);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c9147a.onError(th);
        }
    }
}
