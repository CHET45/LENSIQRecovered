package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zk6 extends m86<Long> {

    /* JADX INFO: renamed from: b */
    public final voe f105339b;

    /* JADX INFO: renamed from: c */
    public final long f105340c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f105341d;

    /* JADX INFO: renamed from: zk6$a */
    public static final class RunnableC16166a extends AtomicReference<mf4> implements fdg, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super Long> f105342a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f105343b;

        public RunnableC16166a(ycg<? super Long> ycgVar) {
            this.f105342a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            ag4.dispose(this);
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                this.f105343b = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != ag4.DISPOSED) {
                if (!this.f105343b) {
                    lazySet(c05.INSTANCE);
                    this.f105342a.onError(new cwa("Can't deliver value due to lack of requests"));
                } else {
                    this.f105342a.onNext(0L);
                    lazySet(c05.INSTANCE);
                    this.f105342a.onComplete();
                }
            }
        }

        public void setResource(mf4 mf4Var) {
            ag4.trySet(this, mf4Var);
        }
    }

    public zk6(long j, TimeUnit timeUnit, voe voeVar) {
        this.f105340c = j;
        this.f105341d = timeUnit;
        this.f105339b = voeVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super Long> ycgVar) {
        RunnableC16166a runnableC16166a = new RunnableC16166a(ycgVar);
        ycgVar.onSubscribe(runnableC16166a);
        runnableC16166a.setResource(this.f105339b.scheduleDirect(runnableC16166a, this.f105340c, this.f105341d));
    }
}
