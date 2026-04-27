package p000;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class fli {

    /* JADX INFO: renamed from: e */
    public static final String f37093e = "WifiLockManager";

    /* JADX INFO: renamed from: f */
    public static final String f37094f = "ExoPlayer:WifiLockManager";

    /* JADX INFO: renamed from: a */
    public final C5886a f37095a;

    /* JADX INFO: renamed from: b */
    public final oe7 f37096b;

    /* JADX INFO: renamed from: c */
    public boolean f37097c;

    /* JADX INFO: renamed from: d */
    public boolean f37098d;

    /* JADX INFO: renamed from: fli$a */
    public static final class C5886a {

        /* JADX INFO: renamed from: a */
        public final Context f37099a;

        /* JADX INFO: renamed from: b */
        @hib
        public WifiManager.WifiLock f37100b;

        public C5886a(Context context) {
            this.f37099a = context;
        }

        public void updateWifiLock(boolean z, boolean z2) {
            if (z && this.f37100b == null) {
                WifiManager wifiManager = (WifiManager) this.f37099a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    xh9.m25148w("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f37100b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f37100b;
            if (wifiLock == null) {
                return;
            }
            if (z && z2) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public fli(Context context, Looper looper, j52 j52Var) {
        this.f37095a = new C5886a(context.getApplicationContext());
        this.f37096b = j52Var.createHandler(looper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$0(boolean z, boolean z2) {
        this.f37095a.updateWifiLock(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setStayAwake$1(boolean z) {
        this.f37095a.updateWifiLock(true, z);
    }

    public void setEnabled(final boolean z) {
        if (this.f37097c == z) {
            return;
        }
        this.f37097c = z;
        final boolean z2 = this.f37098d;
        this.f37096b.post(new Runnable() { // from class: dli
            @Override // java.lang.Runnable
            public final void run() {
                this.f30010a.lambda$setEnabled$0(z, z2);
            }
        });
    }

    public void setStayAwake(final boolean z) {
        if (this.f37098d == z) {
            return;
        }
        this.f37098d = z;
        if (this.f37097c) {
            this.f37096b.post(new Runnable() { // from class: eli
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33388a.lambda$setStayAwake$1(z);
                }
            });
        }
    }
}
