package p000;

import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes3.dex */
public final class bhi {

    /* JADX INFO: renamed from: e */
    public static final String f13760e = "WakeLockManager";

    /* JADX INFO: renamed from: f */
    public static final String f13761f = "ExoPlayer:WakeLockManager";

    /* JADX INFO: renamed from: a */
    public final C1904a f13762a;

    /* JADX INFO: renamed from: b */
    public final oe7 f13763b;

    /* JADX INFO: renamed from: c */
    public boolean f13764c;

    /* JADX INFO: renamed from: d */
    public boolean f13765d;

    /* JADX INFO: renamed from: bhi$a */
    public static final class C1904a {

        /* JADX INFO: renamed from: a */
        public final Context f13766a;

        /* JADX INFO: renamed from: b */
        @hib
        public PowerManager.WakeLock f13767b;

        public C1904a(Context context) {
            this.f13766a = context;
        }

        @igg({"WakelockTimeout"})
        public void updateWakeLock(boolean z, boolean z2) {
            if (z && this.f13767b == null) {
                PowerManager powerManager = (PowerManager) this.f13766a.getSystemService("power");
                if (powerManager == null) {
                    xh9.m25148w("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f13767b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f13767b;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public bhi(Context context, Looper looper, j52 j52Var) {
        this.f13762a = new C1904a(context.getApplicationContext());
        this.f13763b = j52Var.createHandler(looper, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setEnabled$0(boolean z, boolean z2) {
        this.f13762a.updateWakeLock(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setStayAwake$1(boolean z) {
        this.f13762a.updateWakeLock(true, z);
    }

    public void setEnabled(final boolean z) {
        if (this.f13764c == z) {
            return;
        }
        this.f13764c = z;
        final boolean z2 = this.f13765d;
        this.f13763b.post(new Runnable() { // from class: ahi
            @Override // java.lang.Runnable
            public final void run() {
                this.f1623a.lambda$setEnabled$0(z, z2);
            }
        });
    }

    public void setStayAwake(final boolean z) {
        if (this.f13765d == z) {
            return;
        }
        this.f13765d = z;
        if (this.f13764c) {
            this.f13763b.post(new Runnable() { // from class: zgi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105067a.lambda$setStayAwake$1(z);
                }
            });
        }
    }
}
