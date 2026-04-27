package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class al6 extends l86<Long> {

    /* JADX INFO: renamed from: b */
    public final woe f1988b;

    /* JADX INFO: renamed from: c */
    public final long f1989c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f1990d;

    /* JADX INFO: renamed from: al6$a */
    public static final class RunnableC0314a extends AtomicReference<lf4> implements fdg, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super Long> f1991a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f1992b;

        public RunnableC0314a(ycg<? super Long> downstream) {
            this.f1991a = downstream;
        }

        @Override // p000.fdg
        public void cancel() {
            zf4.dispose(this);
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                this.f1992b = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != zf4.DISPOSED) {
                if (!this.f1992b) {
                    lazySet(b05.INSTANCE);
                    this.f1991a.onError(new bwa("Can't deliver value due to lack of requests"));
                } else {
                    this.f1991a.onNext(0L);
                    lazySet(b05.INSTANCE);
                    this.f1991a.onComplete();
                }
            }
        }

        public void setResource(lf4 d) {
            zf4.trySet(this, d);
        }
    }

    public al6(long delay, TimeUnit unit, woe scheduler) {
        this.f1989c = delay;
        this.f1990d = unit;
        this.f1988b = scheduler;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super Long> s) {
        RunnableC0314a runnableC0314a = new RunnableC0314a(s);
        s.onSubscribe(runnableC0314a);
        runnableC0314a.setResource(this.f1988b.scheduleDirect(runnableC0314a, this.f1989c, this.f1990d));
    }
}
