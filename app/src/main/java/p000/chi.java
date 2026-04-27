package p000;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class chi {

    /* JADX INFO: renamed from: e */
    public static final String f16565e = "WakeLockManager";

    /* JADX INFO: renamed from: f */
    public static final String f16566f = "ExoPlayer:WakeLockManager";

    /* JADX INFO: renamed from: a */
    @hib
    public final PowerManager f16567a;

    /* JADX INFO: renamed from: b */
    @hib
    public PowerManager.WakeLock f16568b;

    /* JADX INFO: renamed from: c */
    public boolean f16569c;

    /* JADX INFO: renamed from: d */
    public boolean f16570d;

    public chi(Context context) {
        this.f16567a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @igg({"WakelockTimeout"})
    private void updateWakeLock() {
        PowerManager.WakeLock wakeLock = this.f16568b;
        if (wakeLock == null) {
            return;
        }
        if (this.f16569c && this.f16570d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void setEnabled(boolean z) {
        if (z && this.f16568b == null) {
            PowerManager powerManager = this.f16567a;
            if (powerManager == null) {
                yh9.m25919w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f16568b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f16569c = z;
        updateWakeLock();
    }

    public void setStayAwake(boolean z) {
        this.f16570d = z;
        updateWakeLock();
    }
}
