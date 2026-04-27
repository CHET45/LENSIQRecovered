package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzjo;
import com.google.firebase.analytics.FirebaseAnalytics;
import p000.kx7;

/* JADX INFO: loaded from: classes5.dex */
public final class m7j {

    /* JADX INFO: renamed from: a */
    public static final dy7 f60168a = dy7.m9581of("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.C3551c.f23146g, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* JADX INFO: renamed from: b */
    public static final kx7 f60169b = kx7.m15117of("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c */
    public static final kx7 f60170c = kx7.m15113of("auto", "app", "am");

    /* JADX INFO: renamed from: d */
    public static final kx7 f60171d = kx7.m15112of("_r", "_dbg");

    /* JADX INFO: renamed from: e */
    public static final kx7 f60172e = new kx7.C8541a().add((Object[]) zzjo.zza).add((Object[]) zzjo.zzb).build();

    /* JADX INFO: renamed from: f */
    public static final kx7 f60173f = kx7.m15112of("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f60174g = 0;

    public static boolean zza(String str) {
        return !f60170c.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzb(String str, Bundle bundle) {
        if (f60169b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        kx7 kx7Var = f60171d;
        int size = kx7Var.size();
        int i = 0;
        while (i < size) {
            boolean zContainsKey = bundle.containsKey((String) kx7Var.get(i));
            i++;
            if (zContainsKey) {
                return false;
            }
        }
        return true;
    }

    public static boolean zzc(String str) {
        return !f60168a.contains(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzd(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (f60172e.contains(str2)) {
            return false;
        }
        kx7 kx7Var = f60173f;
        int size = kx7Var.size();
        int i = 0;
        while (i < size) {
            boolean zMatches = str2.matches((String) kx7Var.get(i));
            i++;
            if (zMatches) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zze(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto La
            return r0
        La:
            boolean r6 = zza(r5)
            r1 = 0
            if (r6 != 0) goto L12
            return r1
        L12:
            if (r7 != 0) goto L15
            return r1
        L15:
            kx7 r6 = p000.m7j.f60171d
            int r2 = r6.size()
            r3 = r1
        L1c:
            if (r3 >= r2) goto L2d
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L1c
            return r1
        L2d:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L56
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L4c
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L42
            goto L60
        L42:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = r3
            goto L61
        L4c:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = r0
            goto L61
        L56:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = r1
            goto L61
        L60:
            r5 = -1
        L61:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L76
            if (r5 == r0) goto L70
            if (r5 == r3) goto L6a
            return r1
        L6a:
            java.lang.String r5 = "fiam_integration"
            r7.putString(r6, r5)
            return r0
        L70:
            java.lang.String r5 = "fdl_integration"
            r7.putString(r6, r5)
            return r0
        L76:
            java.lang.String r5 = "fcm_integration"
            r7.putString(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m7j.zze(java.lang.String, java.lang.String, android.os.Bundle):boolean");
    }
}
