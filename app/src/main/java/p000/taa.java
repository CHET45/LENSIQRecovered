package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class taa extends r4a<Long> {

    /* JADX INFO: renamed from: a */
    public final long f84085a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f84086b;

    /* JADX INFO: renamed from: c */
    public final woe f84087c;

    /* JADX INFO: renamed from: taa$a */
    public static final class RunnableC12964a extends AtomicReference<lf4> implements lf4, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super Long> f84088a;

        public RunnableC12964a(final k9a<? super Long> downstream) {
            this.f84088a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m22444a(lf4 d) {
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
            this.f84088a.onSuccess(0L);
        }
    }

    public taa(long delay, TimeUnit unit, woe scheduler) {
        this.f84085a = delay;
        this.f84086b = unit;
        this.f84087c = scheduler;
    }

    @Override // p000.r4a
    public void subscribeActual(final k9a<? super Long> observer) {
        RunnableC12964a runnableC12964a = new RunnableC12964a(observer);
        observer.onSubscribe(runnableC12964a);
        runnableC12964a.m22444a(this.f84087c.scheduleDirect(runnableC12964a, this.f84085a, this.f84086b));
    }
}
