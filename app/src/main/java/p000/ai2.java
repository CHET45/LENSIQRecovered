package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ai2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final long f1631a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f1632b;

    /* JADX INFO: renamed from: c */
    public final woe f1633c;

    /* JADX INFO: renamed from: ai2$a */
    public static final class RunnableC0256a extends AtomicReference<lf4> implements lf4, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;

        /* JADX INFO: renamed from: a */
        public final ch2 f1634a;

        public RunnableC0256a(final ch2 downstream) {
            this.f1634a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m598a(lf4 d) {
            zf4.replace(this, d);
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1634a.onComplete();
        }
    }

    public ai2(long delay, TimeUnit unit, woe scheduler) {
        this.f1631a = delay;
        this.f1632b = unit;
        this.f1633c = scheduler;
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 observer) {
        RunnableC0256a runnableC0256a = new RunnableC0256a(observer);
        observer.onSubscribe(runnableC0256a);
        runnableC0256a.m598a(this.f1633c.scheduleDirect(runnableC0256a, this.f1631a, this.f1632b));
    }
}
