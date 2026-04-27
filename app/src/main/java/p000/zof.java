package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zof extends ljf<Long> {

    /* JADX INFO: renamed from: a */
    public final long f105627a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f105628b;

    /* JADX INFO: renamed from: c */
    public final voe f105629c;

    /* JADX INFO: renamed from: zof$a */
    public static final class RunnableC16204a extends AtomicReference<mf4> implements mf4, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;

        /* JADX INFO: renamed from: a */
        public final inf<? super Long> f105630a;

        public RunnableC16204a(inf<? super Long> infVar) {
            this.f105630a = infVar;
        }

        /* JADX INFO: renamed from: a */
        public void m26928a(mf4 mf4Var) {
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
            this.f105630a.onSuccess(0L);
        }
    }

    public zof(long j, TimeUnit timeUnit, voe voeVar) {
        this.f105627a = j;
        this.f105628b = timeUnit;
        this.f105629c = voeVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Long> infVar) {
        RunnableC16204a runnableC16204a = new RunnableC16204a(infVar);
        infVar.onSubscribe(runnableC16204a);
        runnableC16204a.m26928a(this.f105629c.scheduleDirect(runnableC16204a, this.f105627a, this.f105628b));
    }
}
