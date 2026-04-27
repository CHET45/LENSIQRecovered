package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class gu8 {

    /* JADX INFO: renamed from: a */
    public static zp7 f41195a = null;

    /* JADX INFO: renamed from: b */
    public static final String f41196b = "CURRENT_LANGUAGE";

    /* JADX INFO: renamed from: c */
    public static final String f41197c = "CURRENT_COUNTRY";

    /* JADX INFO: renamed from: d */
    public static final String f41198d = "IS_FOLLOW_SYSTEM";

    public static void changeLanguage(Context context, String str, String str2) {
        Locale locale;
        if (context == null || TextUtils.isEmpty(str) || f41195a == null) {
            return;
        }
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        str.hashCode();
        switch (str) {
            case "es_MX":
                locale = new Locale(ufh.f87920g, "MX");
                f41195a.putBoolean("IS_FOLLOW_SYSTEM", false);
                break;
            case "ms_MY":
                locale = new Locale("ms", "MY");
                f41195a.putBoolean("IS_FOLLOW_SYSTEM", false);
                break;
            case "ms_SG":
                locale = new Locale("ms", "SG");
                f41195a.putBoolean("IS_FOLLOW_SYSTEM", false);
                break;
            case "zh_TW":
                locale = Locale.TAIWAN;
                f41195a.putBoolean("IS_FOLLOW_SYSTEM", false);
                break;
            case "default":
                Locale locale2 = Resources.getSystem().getConfiguration().locale;
                f41195a.putBoolean("IS_FOLLOW_SYSTEM", true);
                locale = locale2;
                break;
            default:
                locale = new Locale(str, str2);
                f41195a.putBoolean("IS_FOLLOW_SYSTEM", false);
                break;
        }
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        f41195a.putString("CURRENT_LANGUAGE", str);
        f41195a.putString("CURRENT_COUNTRY", str2);
    }

    public static void setLanguage(Context context) {
        zp7 zp7Var = f41195a;
        if (zp7Var == null || zp7Var.getBoolean("IS_FOLLOW_SYSTEM", false)) {
            return;
        }
        changeLanguage(context, f41195a.getString("CURRENT_LANGUAGE", ""), f41195a.getString("CURRENT_COUNTRY", ""));
    }

    public static void setStorage(zp7 zp7Var) {
        f41195a = zp7Var;
    }
}
