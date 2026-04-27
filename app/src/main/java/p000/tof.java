package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class tof<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f85520a;

    /* JADX INFO: renamed from: b */
    public final woe f85521b;

    /* JADX INFO: renamed from: tof$a */
    public static final class RunnableC13131a<T> extends AtomicReference<lf4> implements hnf<T>, lf4, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f85522a;

        /* JADX INFO: renamed from: b */
        public final a0f f85523b = new a0f();

        /* JADX INFO: renamed from: c */
        public final oof<? extends T> f85524c;

        public RunnableC13131a(hnf<? super T> actual, oof<? extends T> source) {
            this.f85522a = actual;
            this.f85524c = source;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
            this.f85523b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f85522a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f85522a.onSuccess(value);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f85524c.subscribe(this);
        }
    }

    public tof(oof<? extends T> source, woe scheduler) {
        this.f85520a = source;
        this.f85521b = scheduler;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        RunnableC13131a runnableC13131a = new RunnableC13131a(observer, this.f85520a);
        observer.onSubscribe(runnableC13131a);
        runnableC13131a.f85523b.replace(this.f85521b.scheduleDirect(runnableC13131a));
    }
}
