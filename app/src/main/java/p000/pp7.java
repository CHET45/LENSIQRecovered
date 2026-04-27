package p000;

import android.icu.util.ULocale;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class pp7 {

    /* JADX INFO: renamed from: a */
    public static final String f71578a = "ICUCompat";

    /* JADX INFO: renamed from: b */
    public static Method f71579b;

    /* JADX INFO: renamed from: c */
    public static Method f71580c;

    /* JADX INFO: renamed from: pp7$a */
    @c5e(21)
    public static class C11059a {
        private C11059a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static String m19676a(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: renamed from: pp7$b */
    @c5e(24)
    public static class C11060b {
        private C11060b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static ULocale m19677a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static ULocale m19678b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static String m19679c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    private pp7() {
    }

    @igg({"BanUncheckedReflection"})
    private static String addLikelySubtagsBelowApi21(Locale locale) {
        String string = locale.toString();
        try {
            Method method = f71580c;
            if (method != null) {
                return (String) method.invoke(null, string);
            }
        } catch (IllegalAccessException e) {
            Log.w(f71578a, e);
        } catch (InvocationTargetException e2) {
            Log.w(f71578a, e2);
        }
        return string;
    }

    @igg({"BanUncheckedReflection"})
    private static String getScriptBelowApi21(String str) {
        try {
            Method method = f71579b;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w(f71578a, e);
        } catch (InvocationTargetException e2) {
            Log.w(f71578a, e2);
        }
        return null;
    }

    @hib
    public static String maximizeAndGetScript(@efb Locale locale) {
        return C11060b.m19679c(C11060b.m19677a(C11060b.m19678b(locale)));
    }
}
