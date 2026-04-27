package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class hpf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f44452a;

    /* JADX INFO: renamed from: b */
    public final voe f44453b;

    /* JADX INFO: renamed from: hpf$a */
    public static final class RunnableC6966a<T> extends AtomicReference<mf4> implements inf<T>, mf4, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f44454a;

        /* JADX INFO: renamed from: b */
        public final voe f44455b;

        /* JADX INFO: renamed from: c */
        public mf4 f44456c;

        public RunnableC6966a(inf<? super T> infVar, voe voeVar) {
            this.f44454a = infVar;
            this.f44455b = voeVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4 ag4Var = ag4.DISPOSED;
            mf4 andSet = getAndSet(ag4Var);
            if (andSet != ag4Var) {
                this.f44456c = andSet;
                this.f44455b.scheduleDirect(this);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f44454a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f44454a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f44454a.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44456c.dispose();
        }
    }

    public hpf(pof<T> pofVar, voe voeVar) {
        this.f44452a = pofVar;
        this.f44453b = voeVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f44452a.subscribe(new RunnableC6966a(infVar, this.f44453b));
    }
}
