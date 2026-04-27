package p000;

import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.blankj.utilcode.util.C2479l;
import com.blankj.utilcode.util.C2481n;

/* JADX INFO: loaded from: classes3.dex */
public final class atc {
    private atc() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @j5e(xnc.f98591P)
    public static void call(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'phoneNumber' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        C2479l.getApp().startActivity(C2481n.m4252L(str));
    }

    public static void dial(@efb String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'phoneNumber' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        C2479l.getApp().startActivity(C2481n.m4256N(str));
    }

    @igg({"HardwareIds"})
    @j5e(xnc.f98590O)
    public static String getDeviceId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        String deviceId = telephonyManager.getDeviceId();
        if (!TextUtils.isEmpty(deviceId)) {
            return deviceId;
        }
        String imei = telephonyManager.getImei();
        if (!TextUtils.isEmpty(imei)) {
            return imei;
        }
        String meid = telephonyManager.getMeid();
        return TextUtils.isEmpty(meid) ? "" : meid;
    }

    @j5e(xnc.f98590O)
    public static String getIMEI() {
        return getImeiOrMeid(true);
    }

    @igg({"HardwareIds"})
    @j5e(xnc.f98590O)
    public static String getIMSI() {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                getTelephonyManager().getSubscriberId();
            } catch (SecurityException e) {
                e.printStackTrace();
                return "";
            }
        }
        return getTelephonyManager().getSubscriberId();
    }

    @igg({"HardwareIds"})
    @j5e(xnc.f98590O)
    public static String getImeiOrMeid(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        return z ? getMinOne(telephonyManager.getImei(0), telephonyManager.getImei(1)) : getMinOne(telephonyManager.getMeid(0), telephonyManager.getMeid(1));
    }

    @j5e(xnc.f98590O)
    public static String getMEID() {
        return getImeiOrMeid(false);
    }

    private static String getMinOne(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        return (zIsEmpty && zIsEmpty2) ? "" : (zIsEmpty || zIsEmpty2) ? !zIsEmpty ? str : str2 : str.compareTo(str2) <= 0 ? str : str2;
    }

    public static int getPhoneType() {
        return getTelephonyManager().getPhoneType();
    }

    @igg({"HardwareIds"})
    @j5e(xnc.f98590O)
    public static String getSerial() {
        if (Build.VERSION.SDK_INT < 29) {
            return Build.getSerial();
        }
        try {
            return Build.getSerial();
        } catch (SecurityException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getSimOperatorByMnc() {
        String simOperator = getTelephonyManager().getSimOperator();
        if (simOperator == null) {
            return "";
        }
        switch (simOperator) {
            case "46000":
            case "46002":
            case "46007":
            case "46020":
                return "中国移动";
            case "46001":
            case "46006":
            case "46009":
                return "中国联通";
            case "46003":
            case "46005":
            case "46011":
                return "中国电信";
            default:
                return simOperator;
        }
    }

    public static String getSimOperatorName() {
        return getTelephonyManager().getSimOperatorName();
    }

    private static String getSystemPropertyByReflect(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static TelephonyManager getTelephonyManager() {
        return (TelephonyManager) C2479l.getApp().getSystemService("phone");
    }

    public static boolean isPhone() {
        return getTelephonyManager().getPhoneType() != 0;
    }

    public static boolean isSimCardReady() {
        return getTelephonyManager().getSimState() == 5;
    }

    public static void sendSms(@efb String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Argument 'phoneNumber' of type String (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        C2479l.getApp().startActivity(C2481n.m4286b0(str, str2));
    }
}
