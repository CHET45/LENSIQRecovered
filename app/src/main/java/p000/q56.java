package p000;

/* JADX INFO: loaded from: classes.dex */
public final class q56 {
    public static final boolean equalsWithNanFix(float f, float f2) {
        return f == f2;
    }

    public static final boolean isNan(float f) {
        return (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) > 2139095040;
    }

    public static final boolean equalsWithNanFix(double d, double d2) {
        return d == d2;
    }

    public static final boolean isNan(double d) {
        return (Double.doubleToRawLongBits(d) & Long.MAX_VALUE) > ik4.f47227b;
    }
}
