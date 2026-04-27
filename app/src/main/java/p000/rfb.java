package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class rfb {
    public static String lowerCase(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String normalize(String str) {
        return lowerCase(str).trim();
    }
}
