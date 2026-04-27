package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p000.izc;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class fii implements izc.InterfaceC7680g {

    /* JADX INFO: renamed from: C */
    public static final String f36828C = "EXTRA_CLOSE_ON_CONNECT";

    /* JADX INFO: renamed from: F */
    public static final String f36829F = "EXTRA_CONNECTION_ONLY";

    /* JADX INFO: renamed from: H */
    public static final String f36830H = "android.bluetooth.devicepicker.extra.FILTER_TYPE";

    /* JADX INFO: renamed from: L */
    public static final int f36831L = 1;

    /* JADX INFO: renamed from: M */
    public static final String f36832M = "WearUnsuitableOutputPlaybackSuppressionResolverListener:WakeLock";

    /* JADX INFO: renamed from: N */
    public static final long f36833N = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: f */
    public static final String f36834f = "com.android.settings.panel.action.MEDIA_OUTPUT";

    /* JADX INFO: renamed from: m */
    public static final String f36835m = "com.android.settings.panel.extra.PACKAGE_NAME";

    /* JADX INFO: renamed from: a */
    public final Context f36836a;

    /* JADX INFO: renamed from: b */
    public final long f36837b;

    /* JADX INFO: renamed from: c */
    public final j52 f36838c;

    /* JADX INFO: renamed from: d */
    @hib
    public final PowerManager.WakeLock f36839d;

    /* JADX INFO: renamed from: e */
    public long f36840e;

    public fii(Context context) {
        this(context, f36833N);
    }

    @hib
    private static ComponentName getSystemOrSystemUpdatedAppComponent(Context context, Intent intent) {
        ApplicationInfo applicationInfo;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                return new ComponentName(activityInfo.packageName, activityInfo.name);
            }
        }
        return null;
    }

    private static void launchSystemMediaOutputSwitcherUi(Context context) {
        Intent intentPutExtra = new Intent("com.android.settings.panel.action.MEDIA_OUTPUT").addFlags(268435456).putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        ComponentName systemOrSystemUpdatedAppComponent = getSystemOrSystemUpdatedAppComponent(context, intentPutExtra);
        if (systemOrSystemUpdatedAppComponent != null) {
            intentPutExtra.setComponent(systemOrSystemUpdatedAppComponent);
            context.startActivity(intentPutExtra);
            return;
        }
        Intent intentPutExtra2 = new Intent("android.settings.BLUETOOTH_SETTINGS").addFlags(268468224).putExtra(f36828C, true).putExtra(f36829F, true).putExtra(f36830H, 1);
        ComponentName systemOrSystemUpdatedAppComponent2 = getSystemOrSystemUpdatedAppComponent(context, intentPutExtra2);
        if (systemOrSystemUpdatedAppComponent2 != null) {
            intentPutExtra2.setComponent(systemOrSystemUpdatedAppComponent2);
            context.startActivity(intentPutExtra2);
        }
    }

    @Override // p000.izc.InterfaceC7680g
    public void onEvents(izc izcVar, izc.C7679f c7679f) {
        if (t0i.isWear(this.f36836a)) {
            if ((c7679f.contains(6) || c7679f.contains(5)) && izcVar.getPlayWhenReady() && izcVar.getPlaybackSuppressionReason() == 3) {
                izcVar.pause();
                this.f36840e = this.f36838c.elapsedRealtime();
                PowerManager.WakeLock wakeLock = this.f36839d;
                if (wakeLock != null && !wakeLock.isHeld()) {
                    this.f36839d.acquire(this.f36837b);
                }
                if (c7679f.contains(5)) {
                    launchSystemMediaOutputSwitcherUi(this.f36836a);
                    return;
                }
                return;
            }
            if (!c7679f.contains(6) || izcVar.getPlaybackSuppressionReason() != 0 || this.f36840e == -9223372036854775807L || this.f36838c.elapsedRealtime() - this.f36840e >= this.f36837b) {
                return;
            }
            this.f36840e = -9223372036854775807L;
            izcVar.play();
            PowerManager.WakeLock wakeLock2 = this.f36839d;
            if (wakeLock2 != null) {
                wakeLock2.release();
            }
        }
    }

    public fii(Context context, @h78(from = 0) long j) {
        this(context, j, j52.f49539a);
    }

    @fdi
    public fii(Context context, @h78(from = 0) long j, j52 j52Var) {
        PowerManager.WakeLock wakeLockNewWakeLock;
        v80.checkArgument(j >= 0);
        Context applicationContext = context.getApplicationContext();
        this.f36836a = applicationContext;
        this.f36837b = j;
        this.f36838c = j52Var;
        this.f36840e = -9223372036854775807L;
        PowerManager powerManager = (PowerManager) applicationContext.getSystemService("power");
        if (powerManager != null) {
            wakeLockNewWakeLock = powerManager.newWakeLock(1, f36832M);
            wakeLockNewWakeLock.setReferenceCounted(false);
        } else {
            wakeLockNewWakeLock = null;
        }
        this.f36839d = wakeLockNewWakeLock;
    }
}
