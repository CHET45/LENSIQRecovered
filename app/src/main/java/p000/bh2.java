package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class bh2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f13731a;

    /* JADX INFO: renamed from: b */
    public final woe f13732b;

    /* JADX INFO: renamed from: bh2$a */
    public static final class RunnableC1895a extends AtomicReference<lf4> implements ch2, lf4, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* JADX INFO: renamed from: a */
        public final ch2 f13733a;

        /* JADX INFO: renamed from: b */
        public final woe f13734b;

        /* JADX INFO: renamed from: c */
        public Throwable f13735c;

        public RunnableC1895a(ch2 actual, woe scheduler) {
            this.f13733a = actual;
            this.f13734b = scheduler;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            zf4.replace(this, this.f13734b.scheduleDirect(this));
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f13735c = e;
            zf4.replace(this, this.f13734b.scheduleDirect(this));
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f13733a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f13735c;
            if (th == null) {
                this.f13733a.onComplete();
            } else {
                this.f13735c = null;
                this.f13733a.onError(th);
            }
        }
    }

    public bh2(ph2 source, woe scheduler) {
        this.f13731a = source;
        this.f13732b = scheduler;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        this.f13731a.subscribe(new RunnableC1895a(observer, this.f13732b));
    }
}
