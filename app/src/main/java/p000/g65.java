package p000;

import java.util.concurrent.locks.LockSupport;
import p000.f65;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g65 extends e65 {
    @yfb
    /* JADX INFO: renamed from: c */
    public abstract Thread mo9773c();

    /* JADX INFO: renamed from: d */
    public void mo11414d(long j, @yfb f65.AbstractRunnableC5633c abstractRunnableC5633c) {
        tu3.f85932F.schedule(j, abstractRunnableC5633c);
    }

    /* JADX INFO: renamed from: e */
    public final void m11415e() {
        Thread threadMo9773c = mo9773c();
        if (Thread.currentThread() != threadMo9773c) {
            AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
            if (abstractC2202c5 != null) {
                abstractC2202c5.unpark(threadMo9773c);
            } else {
                LockSupport.unpark(threadMo9773c);
            }
        }
    }
}
