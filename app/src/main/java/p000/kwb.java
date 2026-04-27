package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class kwb extends vkb<Long> {

    /* JADX INFO: renamed from: a */
    public final woe f55516a;

    /* JADX INFO: renamed from: b */
    public final long f55517b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f55518c;

    /* JADX INFO: renamed from: kwb$a */
    public static final class RunnableC8538a extends AtomicReference<lf4> implements lf4, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super Long> f55519a;

        public RunnableC8538a(pxb<? super Long> downstream) {
            this.f55519a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == zf4.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            this.f55519a.onNext(0L);
            lazySet(b05.INSTANCE);
            this.f55519a.onComplete();
        }

        public void setResource(lf4 d) {
            zf4.trySet(this, d);
        }
    }

    public kwb(long delay, TimeUnit unit, woe scheduler) {
        this.f55517b = delay;
        this.f55518c = unit;
        this.f55516a = scheduler;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super Long> observer) {
        RunnableC8538a runnableC8538a = new RunnableC8538a(observer);
        observer.onSubscribe(runnableC8538a);
        runnableC8538a.setResource(this.f55516a.scheduleDirect(runnableC8538a, this.f55517b, this.f55518c));
    }
}
