package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class apf extends kjf<Long> {

    /* JADX INFO: renamed from: a */
    public final long f11552a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f11553b;

    /* JADX INFO: renamed from: c */
    public final woe f11554c;

    /* JADX INFO: renamed from: apf$a */
    public static final class RunnableC1552a extends AtomicReference<lf4> implements lf4, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super Long> f11555a;

        public RunnableC1552a(final hnf<? super Long> downstream) {
            this.f11555a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m2528a(lf4 d) {
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
            this.f11555a.onSuccess(0L);
        }
    }

    public apf(long delay, TimeUnit unit, woe scheduler) {
        this.f11552a = delay;
        this.f11553b = unit;
        this.f11554c = scheduler;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super Long> observer) {
        RunnableC1552a runnableC1552a = new RunnableC1552a(observer);
        observer.onSubscribe(runnableC1552a);
        runnableC1552a.m2528a(this.f11554c.scheduleDirect(runnableC1552a, this.f11552a, this.f11553b));
    }
}
