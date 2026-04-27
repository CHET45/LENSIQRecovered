package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gnf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f40366a;

    /* JADX INFO: renamed from: b */
    public final woe f40367b;

    /* JADX INFO: renamed from: gnf$a */
    public static final class RunnableC6435a<T> extends AtomicReference<lf4> implements hnf<T>, lf4, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f40368a;

        /* JADX INFO: renamed from: b */
        public final woe f40369b;

        /* JADX INFO: renamed from: c */
        public T f40370c;

        /* JADX INFO: renamed from: d */
        public Throwable f40371d;

        public RunnableC6435a(hnf<? super T> actual, woe scheduler) {
            this.f40368a = actual;
            this.f40369b = scheduler;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f40371d = e;
            zf4.replace(this, this.f40369b.scheduleDirect(this));
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f40368a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f40370c = value;
            zf4.replace(this, this.f40369b.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f40371d;
            if (th != null) {
                this.f40368a.onError(th);
            } else {
                this.f40368a.onSuccess(this.f40370c);
            }
        }
    }

    public gnf(oof<T> source, woe scheduler) {
        this.f40366a = source;
        this.f40367b = scheduler;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f40366a.subscribe(new RunnableC6435a(observer, this.f40367b));
    }
}
