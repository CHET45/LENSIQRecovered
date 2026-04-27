package p000;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public final class nf1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final nf1 f64224a = new nf1();

    /* JADX INFO: renamed from: b */
    @sy1(extension = 30)
    @un8
    public static final int f64225b;

    /* JADX INFO: renamed from: c */
    @sy1(extension = 31)
    @un8
    public static final int f64226c;

    /* JADX INFO: renamed from: d */
    @sy1(extension = 33)
    @un8
    public static final int f64227d;

    /* JADX INFO: renamed from: e */
    @sy1(extension = 1000000)
    @un8
    public static final int f64228e;

    /* JADX INFO: renamed from: nf1$a */
    @c5e(30)
    public static final class C9838a {

        /* JADX INFO: renamed from: a */
        @yfb
        public static final C9838a f64229a = new C9838a();

        private C9838a() {
        }

        @ih4
        public final int getExtensionVersion(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }

    /* JADX INFO: renamed from: nf1$b */
    @i5e
    @i8e(EnumC11189pz.f72537b)
    @Retention(RetentionPolicy.CLASS)
    public @interface InterfaceC9839b {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f64225b = i >= 30 ? C9838a.f64229a.getExtensionVersion(30) : 0;
        f64226c = i >= 30 ? C9838a.f64229a.getExtensionVersion(31) : 0;
        f64227d = i >= 30 ? C9838a.f64229a.getExtensionVersion(33) : 0;
        f64228e = i >= 30 ? C9838a.f64229a.getExtensionVersion(1000000) : 0;
    }

    private nf1() {
    }

    @do8
    @sy1(api = 24)
    @q64(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    public static final boolean isAtLeastN() {
        return true;
    }

    @do8
    @sy1(api = 25)
    @q64(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    public static final boolean isAtLeastNMR1() {
        return true;
    }

    @do8
    @sy1(api = 26)
    @q64(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    public static final boolean isAtLeastO() {
        return true;
    }

    @do8
    @sy1(api = 27)
    @q64(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @do8
    @sy1(api = 28)
    @q64(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @do8
    @fdi
    @p7e({p7e.EnumC10826a.f69934a})
    public static final boolean isAtLeastPreReleaseCodename(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "codename");
        md8.checkNotNullParameter(str2, "buildCodename");
        if (md8.areEqual("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        md8.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        md8.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @do8
    @sy1(api = 29)
    @q64(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @do8
    @sy1(api = 30)
    @q64(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @do8
    @sy1(api = 31, codename = k95.f53020R4)
    @q64(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    public static final boolean isAtLeastS() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                md8.checkNotNullExpressionValue(str, "CODENAME");
                if (isAtLeastPreReleaseCodename(k95.f53020R4, str)) {
                }
            }
            return false;
        }
        return true;
    }

    @do8
    @sy1(api = 32, codename = "Sv2")
    @q64(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    public static final boolean isAtLeastSv2() {
        int i = Build.VERSION.SDK_INT;
        if (i < 32) {
            if (i >= 31) {
                String str = Build.VERSION.CODENAME;
                md8.checkNotNullExpressionValue(str, "CODENAME");
                if (isAtLeastPreReleaseCodename("Sv2", str)) {
                }
            }
            return false;
        }
        return true;
    }

    @do8
    @sy1(api = 33, codename = "Tiramisu")
    @q64(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    public static final boolean isAtLeastT() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                md8.checkNotNullExpressionValue(str, "CODENAME");
                if (isAtLeastPreReleaseCodename("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }

    @do8
    @sy1(api = 34, codename = "UpsideDownCake")
    @q64(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @i2e(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    public static final boolean isAtLeastU() {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            if (i >= 33) {
                String str = Build.VERSION.CODENAME;
                md8.checkNotNullExpressionValue(str, "CODENAME");
                if (isAtLeastPreReleaseCodename("UpsideDownCake", str)) {
                }
            }
            return false;
        }
        return true;
    }

    @do8
    @sy1(codename = "VanillaIceCream")
    @InterfaceC9839b
    public static final boolean isAtLeastV() {
        if (Build.VERSION.SDK_INT >= 34) {
            String str = Build.VERSION.CODENAME;
            md8.checkNotNullExpressionValue(str, "CODENAME");
            if (isAtLeastPreReleaseCodename("VanillaIceCream", str)) {
                return true;
            }
        }
        return false;
    }
}
