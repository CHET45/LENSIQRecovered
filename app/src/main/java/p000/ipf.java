package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ipf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f47848a;

    /* JADX INFO: renamed from: b */
    public final woe f47849b;

    /* JADX INFO: renamed from: ipf$a */
    public static final class RunnableC7559a<T> extends AtomicReference<lf4> implements hnf<T>, lf4, Runnable {
        private static final long serialVersionUID = 3256698449646456986L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f47850a;

        /* JADX INFO: renamed from: b */
        public final woe f47851b;

        /* JADX INFO: renamed from: c */
        public lf4 f47852c;

        public RunnableC7559a(hnf<? super T> actual, woe scheduler) {
            this.f47850a = actual;
            this.f47851b = scheduler;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4 zf4Var = zf4.DISPOSED;
            lf4 andSet = getAndSet(zf4Var);
            if (andSet != zf4Var) {
                this.f47852c = andSet;
                this.f47851b.scheduleDirect(this);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f47850a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f47850a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f47850a.onSuccess(value);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47852c.dispose();
        }
    }

    public ipf(oof<T> source, woe scheduler) {
        this.f47848a = source;
        this.f47849b = scheduler;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f47848a.subscribe(new RunnableC7559a(observer, this.f47849b));
    }
}
