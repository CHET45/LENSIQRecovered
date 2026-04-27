package p000;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class x61 implements InterfaceC1524ao, InterfaceC16189zn {

    /* JADX INFO: renamed from: g */
    public static final String f96849g = "_ae";

    /* JADX INFO: renamed from: a */
    public final w33 f96850a;

    /* JADX INFO: renamed from: b */
    public final int f96851b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f96852c;

    /* JADX INFO: renamed from: e */
    public CountDownLatch f96854e;

    /* JADX INFO: renamed from: d */
    public final Object f96853d = new Object();

    /* JADX INFO: renamed from: f */
    public boolean f96855f = false;

    public x61(@efb w33 w33Var, int i, TimeUnit timeUnit) {
        this.f96850a = w33Var;
        this.f96851b = i;
        this.f96852c = timeUnit;
    }

    /* JADX INFO: renamed from: a */
    public boolean m25019a() {
        return this.f96855f;
    }

    @Override // p000.InterfaceC16189zn
    public void logEvent(@efb String str, @hib Bundle bundle) {
        synchronized (this.f96853d) {
            try {
                ej9.getLogger().m10067v("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f96854e = new CountDownLatch(1);
                this.f96855f = false;
                this.f96850a.logEvent(str, bundle);
                ej9.getLogger().m10067v("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f96854e.await(this.f96851b, this.f96852c)) {
                        this.f96855f = true;
                        ej9.getLogger().m10067v("App exception callback received from Analytics listener.");
                    } else {
                        ej9.getLogger().m10069w("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    ej9.getLogger().m10063e("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f96854e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.InterfaceC1524ao
    public void onEvent(@efb String str, @efb Bundle bundle) {
        CountDownLatch countDownLatch = this.f96854e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
