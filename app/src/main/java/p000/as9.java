package p000;

import android.os.Build;
import java.util.Locale;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class as9 {

    /* JADX INFO: renamed from: a */
    public static final String f11747a = "lge";

    /* JADX INFO: renamed from: b */
    public static final String f11748b = "samsung";

    /* JADX INFO: renamed from: c */
    public static final String f11749c = "meizu";

    private as9() {
    }

    public static boolean isDateInputKeyboardMissingSeparatorCharacters() {
        return isLGEDevice() || isSamsungDevice();
    }

    public static boolean isLGEDevice() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f11747a);
    }

    public static boolean isMeizuDevice() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f11749c);
    }

    public static boolean isSamsungDevice() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals(f11748b);
    }
}
