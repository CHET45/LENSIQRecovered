package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zh2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final long f105073a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f105074b;

    /* JADX INFO: renamed from: c */
    public final voe f105075c;

    /* JADX INFO: renamed from: zh2$a */
    public static final class RunnableC16137a extends AtomicReference<mf4> implements mf4, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;

        /* JADX INFO: renamed from: a */
        public final dh2 f105076a;

        public RunnableC16137a(dh2 dh2Var) {
            this.f105076a = dh2Var;
        }

        /* JADX INFO: renamed from: a */
        public void m26806a(mf4 mf4Var) {
            ag4.replace(this, mf4Var);
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f105076a.onComplete();
        }
    }

    public zh2(long j, TimeUnit timeUnit, voe voeVar) {
        this.f105073a = j;
        this.f105074b = timeUnit;
        this.f105075c = voeVar;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        RunnableC16137a runnableC16137a = new RunnableC16137a(dh2Var);
        dh2Var.onSubscribe(runnableC16137a);
        runnableC16137a.m26806a(this.f105075c.scheduleDirect(runnableC16137a, this.f105073a, this.f105074b));
    }
}
