package p000;

import android.os.Build;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class aog {

    /* JADX INFO: renamed from: a */
    public static Method f11468a;

    /* JADX INFO: renamed from: b */
    public static Method f11469b;

    /* JADX INFO: renamed from: aog$a */
    @c5e(23)
    public static class C1529a {
        private C1529a() {
        }

        @hib
        @ih4
        @j5e(xnc.f98590O)
        @igg({"MissingPermission"})
        /* JADX INFO: renamed from: a */
        public static String m2497a(TelephonyManager telephonyManager, int i) {
            return telephonyManager.getDeviceId(i);
        }
    }

    /* JADX INFO: renamed from: aog$b */
    @c5e(26)
    public static class C1530b {
        private C1530b() {
        }

        @hib
        @ih4
        @j5e(xnc.f98590O)
        @igg({"MissingPermission"})
        /* JADX INFO: renamed from: a */
        public static String m2498a(TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }

    /* JADX INFO: renamed from: aog$c */
    @c5e(30)
    public static class C1531c {
        private C1531c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m2499a(TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }

    private aog() {
    }

    @hib
    @igg({"MissingPermission"})
    @j5e(xnc.f98590O)
    public static String getImei(@efb TelephonyManager telephonyManager) {
        return C1530b.m2498a(telephonyManager);
    }

    @igg({"SoonBlockedPrivateApi"})
    public static int getSubscriptionId(@efb TelephonyManager telephonyManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C1531c.m2499a(telephonyManager);
        }
        try {
            if (f11469b == null) {
                Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getSubId", null);
                f11469b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Integer num = (Integer) f11469b.invoke(telephonyManager, null);
            if (num == null || num.intValue() == -1) {
                return Integer.MAX_VALUE;
            }
            return num.intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return Integer.MAX_VALUE;
        }
    }
}
