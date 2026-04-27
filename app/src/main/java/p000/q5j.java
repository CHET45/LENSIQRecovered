package p000;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.p024firebaseauthapi.zze;

/* JADX INFO: loaded from: classes5.dex */
public final class q5j {

    /* JADX INFO: renamed from: h */
    public static Logger f73296h = new Logger("TokenRefresher", "FirebaseAuth:");

    /* JADX INFO: renamed from: a */
    public final lw5 f73297a;

    /* JADX INFO: renamed from: b */
    @fdi
    public volatile long f73298b;

    /* JADX INFO: renamed from: c */
    @fdi
    public volatile long f73299c;

    /* JADX INFO: renamed from: d */
    @fdi
    public long f73300d;

    /* JADX INFO: renamed from: e */
    @fdi
    public HandlerThread f73301e;

    /* JADX INFO: renamed from: f */
    @fdi
    public Handler f73302f;

    /* JADX INFO: renamed from: g */
    @fdi
    public Runnable f73303g;

    public q5j(lw5 lw5Var) {
        f73296h.m5799v("Initializing TokenRefresher", new Object[0]);
        lw5 lw5Var2 = (lw5) Preconditions.checkNotNull(lw5Var);
        this.f73297a = lw5Var2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f73301e = handlerThread;
        handlerThread.start();
        this.f73302f = new zze(this.f73301e.getLooper());
        this.f73303g = new w5j(this, lw5Var2.getName());
        this.f73300d = 300000L;
    }

    /* JADX INFO: renamed from: b */
    public final void m20077b() {
        int i = (int) this.f73299c;
        this.f73299c = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * this.f73299c : i != 960 ? 30L : 960L;
        this.f73298b = DefaultClock.getInstance().currentTimeMillis() + (this.f73299c * 1000);
        f73296h.m5799v("Scheduling refresh for " + this.f73298b, new Object[0]);
        this.f73302f.postDelayed(this.f73303g, this.f73299c * 1000);
    }

    public final void zzb() {
        this.f73302f.removeCallbacks(this.f73303g);
    }

    public final void zzc() {
        f73296h.m5799v("Scheduling refresh for " + (this.f73298b - this.f73300d), new Object[0]);
        zzb();
        this.f73299c = Math.max((this.f73298b - DefaultClock.getInstance().currentTimeMillis()) - this.f73300d, 0L) / 1000;
        this.f73302f.postDelayed(this.f73303g, this.f73299c * 1000);
    }
}
