package p000;

import android.text.TextUtils;
import java.util.Locale;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public final class z7d {
    private z7d() {
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static float checkArgumentFinite(float f, @efb String str) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f)) {
            return f;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    public static int checkArgumentInRange(int i, int i2, int i3, @efb String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        if (i <= i3) {
            return i;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @h78(from = 0)
    public static int checkArgumentNonnegative(int i, @hib String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str);
    }

    public static int checkFlagsArgument(int i, int i2) {
        if ((i & i2) == i) {
            return i;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i) + ", but only 0x" + Integer.toHexString(i2) + " are allowed");
    }

    @efb
    public static <T> T checkNotNull(@hib T t) {
        t.getClass();
        return t;
    }

    public static void checkState(boolean z, @hib String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    @efb
    public static <T extends CharSequence> T checkStringNotEmpty(@hib T t) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException();
        }
        return t;
    }

    public static void checkArgument(boolean z, @efb Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @h78(from = 0)
    public static int checkArgumentNonnegative(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    @efb
    public static <T> T checkNotNull(@hib T t, @efb Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z) {
        checkState(z, null);
    }

    public static void checkArgument(boolean z, @efb String str, @efb Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    @efb
    public static <T extends CharSequence> T checkStringNotEmpty(@hib T t, @efb Object obj) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t;
    }

    @efb
    public static <T extends CharSequence> T checkStringNotEmpty(@hib T t, @efb String str, @efb Object... objArr) {
        if (TextUtils.isEmpty(t)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t;
    }

    public static long checkArgumentInRange(long j, long j2, long j3, @efb String str) {
        if (j < j2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j2), Long.valueOf(j3)));
        }
        if (j <= j3) {
            return j;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static float checkArgumentInRange(float f, float f2, float f3, @efb String str) {
        if (f < f2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
        }
        if (f <= f3) {
            return f;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
    }

    public static double checkArgumentInRange(double d, double d2, double d3, @efb String str) {
        if (d < d2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
        }
        if (d <= d3) {
            return d;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
    }
}
