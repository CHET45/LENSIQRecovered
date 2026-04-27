package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class yof<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f102443a;

    /* JADX INFO: renamed from: b */
    public final long f102444b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f102445c;

    /* JADX INFO: renamed from: d */
    public final woe f102446d;

    /* JADX INFO: renamed from: e */
    public final oof<? extends T> f102447e;

    /* JADX INFO: renamed from: yof$a */
    public static final class RunnableC15750a<T> extends AtomicReference<lf4> implements hnf<T>, Runnable, lf4 {
        private static final long serialVersionUID = 37497744973048446L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f102448a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<lf4> f102449b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a<T> f102450c;

        /* JADX INFO: renamed from: d */
        public oof<? extends T> f102451d;

        /* JADX INFO: renamed from: e */
        public final long f102452e;

        /* JADX INFO: renamed from: f */
        public final TimeUnit f102453f;

        /* JADX INFO: renamed from: yof$a$a */
        public static final class a<T> extends AtomicReference<lf4> implements hnf<T> {
            private static final long serialVersionUID = 2071387740092105509L;

            /* JADX INFO: renamed from: a */
            public final hnf<? super T> f102454a;

            public a(hnf<? super T> downstream) {
                this.f102454a = downstream;
            }

            @Override // p000.hnf
            public void onError(Throwable e) {
                this.f102454a.onError(e);
            }

            @Override // p000.hnf
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }

            @Override // p000.hnf
            public void onSuccess(T t) {
                this.f102454a.onSuccess(t);
            }
        }

        public RunnableC15750a(hnf<? super T> actual, oof<? extends T> other, long timeout, TimeUnit unit) {
            this.f102448a = actual;
            this.f102451d = other;
            this.f102452e = timeout;
            this.f102453f = unit;
            if (other != null) {
                this.f102450c = new a<>(actual);
            } else {
                this.f102450c = null;
            }
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            zf4.dispose(this.f102449b);
            a<T> aVar = this.f102450c;
            if (aVar != null) {
                zf4.dispose(aVar);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var || !compareAndSet(lf4Var, zf4Var)) {
                ofe.onError(e);
            } else {
                zf4.dispose(this.f102449b);
                this.f102448a.onError(e);
            }
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var || !compareAndSet(lf4Var, zf4Var)) {
                return;
            }
            zf4.dispose(this.f102449b);
            this.f102448a.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var || !compareAndSet(lf4Var, zf4Var)) {
                return;
            }
            if (lf4Var != null) {
                lf4Var.dispose();
            }
            oof<? extends T> oofVar = this.f102451d;
            if (oofVar == null) {
                this.f102448a.onError(new TimeoutException(k75.timeoutMessage(this.f102452e, this.f102453f)));
            } else {
                this.f102451d = null;
                oofVar.subscribe(this.f102450c);
            }
        }
    }

    public yof(oof<T> source, long timeout, TimeUnit unit, woe scheduler, oof<? extends T> other) {
        this.f102443a = source;
        this.f102444b = timeout;
        this.f102445c = unit;
        this.f102446d = scheduler;
        this.f102447e = other;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        RunnableC15750a runnableC15750a = new RunnableC15750a(observer, this.f102447e, this.f102444b, this.f102445c);
        observer.onSubscribe(runnableC15750a);
        zf4.replace(runnableC15750a.f102449b, this.f102446d.scheduleDirect(runnableC15750a, this.f102444b, this.f102445c));
        this.f102443a.subscribe(runnableC15750a);
    }
}
