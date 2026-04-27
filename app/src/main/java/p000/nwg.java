package p000;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class nwg {
    private nwg() {
    }

    public static int getLayoutDirectionFromLocale(@hib Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    @efb
    public static String htmlEncode(@efb String str) {
        return TextUtils.htmlEncode(str);
    }
}
