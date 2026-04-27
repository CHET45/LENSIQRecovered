package p000;

import android.os.Handler;
import android.os.Looper;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class az3 implements rde {

    /* JADX INFO: renamed from: a */
    public final Handler f12219a;

    public az3() {
        this.f12219a = de7.createAsync(Looper.getMainLooper());
    }

    @Override // p000.rde
    public void cancel(@efb Runnable runnable) {
        this.f12219a.removeCallbacks(runnable);
    }

    @efb
    public Handler getHandler() {
        return this.f12219a;
    }

    @Override // p000.rde
    public void scheduleWithDelay(long delayInMillis, @efb Runnable runnable) {
        this.f12219a.postDelayed(runnable, delayInMillis);
    }

    @fdi
    public az3(@efb Handler handler) {
        this.f12219a = handler;
    }
}
