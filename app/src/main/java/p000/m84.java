package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.iflytek.aikit.core.Auth;
import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class m84 {
    /* JADX INFO: renamed from: a */
    public static Context m17117a() {
        return Auth.m7094d().m7095a();
    }

    /* JADX INFO: renamed from: fa */
    public static String m17118fa() {
        return "";
    }

    /* JADX INFO: renamed from: fb */
    public static String m17119fb() {
        try {
            return Settings.Secure.getString(m17117a().getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: fc */
    public static String m17120fc() {
        String serial;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    serial = Build.getSerial();
                } catch (Exception unused) {
                    serial = null;
                }
                if (TextUtils.isEmpty(serial)) {
                    try {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        Method method = cls.getMethod("get", String.class, String.class);
                        String str = (String) method.invoke(cls, "persist.sys.get.sn2", null);
                        serial = TextUtils.isEmpty(str) ? (String) method.invoke(cls, "ro.serialno", null) : str;
                    } catch (Exception unused2) {
                    }
                }
            } else {
                serial = Build.SERIAL;
            }
            if (!TextUtils.isEmpty(serial)) {
                return serial;
            }
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            return (String) cls2.getMethod("get", String.class, String.class).invoke(cls2, "gsm.scril.sn", null);
        } catch (Exception unused3) {
            return "";
        }
    }

    /* JADX INFO: renamed from: fd */
    public static String m17121fd() {
        return "";
    }

    /* JADX INFO: renamed from: fe */
    public static String m17122fe() {
        return Auth.m7094d().m7098c();
    }

    /* JADX INFO: renamed from: ff */
    public static boolean m17123ff() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/sbin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/xbin/", "/data/local/bin/", "/data/local/"};
        for (int i = 0; i < 8; i++) {
            if (new File(strArr[i] + h62.f42464z).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: fg */
    public static String m17124fg() {
        try {
            PackageInfo packageInfo = m17117a().getPackageManager().getPackageInfo(m17117a().getPackageName(), 64);
            if (packageInfo == null) {
                return "";
            }
            try {
                return new String(packageInfo.signatures[0].toByteArray());
            } catch (Throwable th) {
                th.printStackTrace();
                return "";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: fh */
    public static String m17125fh() {
        return m17117a().getPackageName();
    }

    public static int getSDKVersion() {
        return Build.VERSION.SDK_INT;
    }
}
