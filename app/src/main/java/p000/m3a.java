package p000;

import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMathHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,241:1\n78#1,9:243\n104#1,9:252\n28#2:242\n22#2:261\n*S KotlinDebug\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n71#1:243,9\n97#1:252,9\n31#1:242\n233#1:261\n*E\n"})
public final class m3a {
    public static final float fastCbrt(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & TarConstants.MAXSIZE) / ((long) 3))) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final float fastCoerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final float fastCoerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final float fastCoerceIn(float f, float f2, float f3) {
        if (f < f2) {
            f = f2;
        }
        return f > f3 ? f3 : f;
    }

    public static final float fastMaxOf(float f, float f2, float f3, float f4) {
        return Math.max(f, Math.max(f2, Math.max(f3, f4)));
    }

    public static final float fastMinOf(float f, float f2, float f3, float f4) {
        return Math.min(f, Math.min(f2, Math.min(f3, f4)));
    }

    public static final float lerp(float f, float f2, float f3) {
        return ((1 - f3) * f) + (f3 * f2);
    }

    public static final double fastCoerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final double fastCoerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static final double fastCoerceIn(double d, double d2, double d3) {
        if (d < d2) {
            d = d2;
        }
        return d > d3 ? d3 : d;
    }

    public static final long lerp(long j, long j2, float f) {
        return j + p3a.roundToLong((j2 - j) * ((double) f));
    }

    public static final int lerp(int i, int i2, float f) {
        return i + ((int) Math.round(((double) (i2 - i)) * ((double) f)));
    }
}
