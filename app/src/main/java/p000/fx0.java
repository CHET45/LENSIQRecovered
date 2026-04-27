package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes5.dex */
public class fx0 {

    /* JADX INFO: renamed from: c */
    public static final int f37901c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f37902d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f37903e = 3;

    /* JADX INFO: renamed from: a */
    public final Float f37904a;

    /* JADX INFO: renamed from: b */
    public final boolean f37905b;

    private fx0(Float f, boolean z) {
        this.f37905b = z;
        this.f37904a = f;
    }

    public static fx0 get(Context context) {
        boolean zIsPowerConnected = false;
        Float level = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zIsPowerConnected = isPowerConnected(intentRegisterReceiver);
                level = getLevel(intentRegisterReceiver);
            }
        } catch (IllegalStateException e) {
            ej9.getLogger().m10064e("An error occurred getting battery state.", e);
        }
        return new fx0(level, zIsPowerConnected);
    }

    private static Float getLevel(Intent intent) {
        int intExtra = intent.getIntExtra(FirebaseAnalytics.C3552d.f23228t, -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean isPowerConnected(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* JADX INFO: renamed from: a */
    public boolean m11207a() {
        return this.f37905b;
    }

    public Float getBatteryLevel() {
        return this.f37904a;
    }

    public int getBatteryVelocity() {
        Float f;
        if (!this.f37905b || (f = this.f37904a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
