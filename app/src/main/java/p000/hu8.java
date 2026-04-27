package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class hu8 {

    /* JADX INFO: renamed from: a */
    public static final String f44892a = "file:///android_asset/simplify_manual_";

    /* JADX INFO: renamed from: b */
    public static final String f44893b = ".html";

    /* JADX INFO: renamed from: c */
    public static final Set<String> f44894c = new HashSet(Arrays.asList("zh", ufh.f87917d, ufh.f87920g, ufh.f87925l, ufh.f87919f, ufh.f87922i, ufh.f87921h, ufh.f87916c));

    public static final void changeLanguage(Context context, String language, String country) {
        if (context == null || TextUtils.isEmpty(language)) {
            return;
        }
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        if (language.equals("zh_TW")) {
            configuration.locale = Locale.TAIWAN;
            vfe.getInstance().putBoolean("IS_FOLLOW_SYSTEM", false);
        } else if (language.equals("default")) {
            configuration.locale = Resources.getSystem().getConfiguration().locale;
            vfe.getInstance().putBoolean("IS_FOLLOW_SYSTEM", true);
        } else {
            configuration.locale = new Locale(language, country);
            vfe.getInstance().putBoolean("IS_FOLLOW_SYSTEM", false);
        }
        configuration.setLocale(configuration.locale);
        StringBuilder sb = new StringBuilder();
        sb.append(" config.locale -=");
        sb.append(configuration.locale);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        vfe.getInstance().putString("CURRENT_LANGUAGE", language);
        vfe.getInstance().putString("CURRENT_COUNTRY", country);
    }

    public static String generateDefaultUrl(Context context) {
        return generateUrl(ufh.f87916c);
    }

    public static String generateUrl(String language) {
        return "file:///android_asset/simplify_manual_en.html";
    }

    public static void setLanguage(Context activity) {
        if (vfe.getInstance().getBoolean("IS_FOLLOW_SYSTEM", false)) {
            return;
        }
        String string = vfe.getInstance().getString("CURRENT_COUNTRY");
        String string2 = vfe.getInstance().getString("CURRENT_LANGUAGE");
        changeLanguage(activity, string2, string);
        Log.e("ContentValues", "setLanguage: " + string + "," + string2);
    }
}
