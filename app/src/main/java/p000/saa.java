package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class saa extends s4a<Long> {

    /* JADX INFO: renamed from: a */
    public final long f81046a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f81047b;

    /* JADX INFO: renamed from: c */
    public final voe f81048c;

    /* JADX INFO: renamed from: saa$a */
    public static final class RunnableC12499a extends AtomicReference<mf4> implements mf4, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;

        /* JADX INFO: renamed from: a */
        public final l9a<? super Long> f81049a;

        public RunnableC12499a(l9a<? super Long> l9aVar) {
            this.f81049a = l9aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m21796a(mf4 mf4Var) {
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
            this.f81049a.onSuccess(0L);
        }
    }

    public saa(long j, TimeUnit timeUnit, voe voeVar) {
        this.f81046a = j;
        this.f81047b = timeUnit;
        this.f81048c = voeVar;
    }

    @Override // p000.s4a
    public void subscribeActual(l9a<? super Long> l9aVar) {
        RunnableC12499a runnableC12499a = new RunnableC12499a(l9aVar);
        l9aVar.onSubscribe(runnableC12499a);
        runnableC12499a.m21796a(this.f81048c.scheduleDirect(runnableC12499a, this.f81046a, this.f81047b));
    }
}
