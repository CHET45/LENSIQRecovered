package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class tui {

    /* JADX INFO: renamed from: a */
    public static Locale f86028a = Locale.CHINA;

    /* JADX INFO: renamed from: a */
    public static String m22871a(int i) {
        String[] strArr = nvi.f65837a;
        if (f86028a.equals(Locale.US)) {
            strArr = rvi.f79906a;
        } else if (f86028a.equals(Locale.TRADITIONAL_CHINESE)) {
            strArr = xvi.f99516a;
        }
        return (i <= 0 || i >= strArr.length) ? m22872b(1) : strArr[i];
    }

    /* JADX INFO: renamed from: b */
    public static String m22872b(int i) {
        String[] strArr = nvi.f65838b;
        if (f86028a.equals(Locale.US)) {
            strArr = rvi.f79907b;
        } else if (f86028a.equals(Locale.TRADITIONAL_CHINESE)) {
            strArr = xvi.f99517b;
        }
        return (i < 0 || i >= strArr.length) ? "" : strArr[i];
    }
}
