package p000;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class gli {

    /* JADX INFO: renamed from: e */
    public static final String f40154e = "WifiLockManager";

    /* JADX INFO: renamed from: f */
    public static final String f40155f = "ExoPlayer:WifiLockManager";

    /* JADX INFO: renamed from: a */
    @hib
    public final WifiManager f40156a;

    /* JADX INFO: renamed from: b */
    @hib
    public WifiManager.WifiLock f40157b;

    /* JADX INFO: renamed from: c */
    public boolean f40158c;

    /* JADX INFO: renamed from: d */
    public boolean f40159d;

    public gli(Context context) {
        this.f40156a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void updateWifiLock() {
        WifiManager.WifiLock wifiLock = this.f40157b;
        if (wifiLock == null) {
            return;
        }
        if (this.f40158c && this.f40159d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void setEnabled(boolean z) {
        if (z && this.f40157b == null) {
            WifiManager wifiManager = this.f40156a;
            if (wifiManager == null) {
                yh9.m25919w("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f40157b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f40158c = z;
        updateWifiLock();
    }

    public void setStayAwake(boolean z) {
        this.f40159d = z;
        updateWifiLock();
    }
}
