package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 3 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,344:1\n343#1:377\n343#1:378\n339#1:379\n343#1:380\n343#1:381\n339#1:382\n103#2:345\n107#2:351\n103#2:355\n103#2:361\n107#2:367\n103#2:371\n35#3,2:346\n54#3,3:348\n66#3,3:352\n35#3,2:356\n54#3,3:358\n35#3,2:362\n54#3,3:364\n66#3,3:368\n35#3,2:372\n54#3,3:374\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n164#1:377\n165#1:378\n203#1:379\n236#1:380\n237#1:381\n281#1:382\n74#1:345\n75#1:351\n75#1:355\n105#1:361\n106#1:367\n106#1:371\n74#1:346,2\n74#1:348,3\n75#1:352,3\n75#1:356,2\n75#1:358,3\n105#1:362,2\n105#1:364,3\n106#1:368,3\n106#1:372,2\n106#1:374,3\n*E\n"})
public final class izf {

    /* JADX INFO: renamed from: a */
    public static final long f49159a = 9223372036854L;

    @p7e({p7e.EnumC10826a.f69934a})
    public static final long estimateAnimationDurationMillis(float f, float f2, float f3, float f4, float f5) {
        if (f2 == 0.0f) {
            return 9223372036854L;
        }
        return estimateAnimationDurationMillis(f, f2, f3, f4, f5);
    }

    private static final double estimateCriticallyDamped(ui2 ui2Var, double d, double d2, double d3) {
        double d4 = d3;
        double real = ui2Var.getReal();
        double d5 = real * d;
        double d6 = d2 - d5;
        double dLog = Math.log(Math.abs(d4 / d)) / real;
        double dLog2 = Math.log(Math.abs(d4 / d6));
        double dLog3 = dLog2;
        for (int i = 0; i < 6; i++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / real));
        }
        double d7 = dLog3 / real;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d7;
        } else if ((Double.isInfinite(d7) || Double.isNaN(d7)) ? false : true) {
            dLog = Math.max(dLog, d7);
        }
        double d8 = (-(d5 + d6)) / (real * d6);
        double d9 = real * d8;
        double dExp = (Math.exp(d9) * d) + (d6 * d8 * Math.exp(d9));
        if (Double.isNaN(d8) || d8 <= 0.0d) {
            d4 = -d4;
        } else if (d8 <= 0.0d || (-dExp) >= d4) {
            dLog = (-(2.0d / real)) - (d / d6);
        } else {
            if (d6 < 0.0d && d > 0.0d) {
                dLog = 0.0d;
            }
            d4 = -d4;
        }
        double dAbs = Double.MAX_VALUE;
        int i2 = 0;
        while (dAbs > 0.001d && i2 < 100) {
            i2++;
            double d10 = real * dLog;
            double d11 = d4;
            double dExp2 = dLog - ((((d + (d6 * dLog)) * Math.exp(d10)) + d4) / ((((((double) 1) + d10) * d6) + d5) * Math.exp(d10)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d4 = d11;
        }
        return dLog;
    }

    private static final long estimateDurationInternal(ui2 ui2Var, ui2 ui2Var2, double d, double d2, double d3, double d4) {
        double d5 = d2;
        if (d3 == 0.0d && d5 == 0.0d) {
            return 0L;
        }
        if (d3 < 0.0d) {
            d5 = -d5;
        }
        double dAbs = Math.abs(d3);
        return (long) ((d > 1.0d ? estimateOverDamped(ui2Var, ui2Var2, dAbs, d5, d4) : d < 1.0d ? estimateUnderDamped(ui2Var, dAbs, d5, d4) : estimateCriticallyDamped(ui2Var, dAbs, d5, d4)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final double estimateOverDamped(p000.ui2 r29, p000.ui2 r30, double r31, double r33, double r35) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.izf.estimateOverDamped(ui2, ui2, double, double, double):double");
    }

    private static final double estimateOverDamped$xInflection(double d, double d2, double d3, double d4, double d5) {
        return (d * Math.exp(d2 * d3)) + (d4 * Math.exp(d5 * d3));
    }

    private static final double estimateUnderDamped(ui2 ui2Var, double d, double d2, double d3) {
        double real = ui2Var.getReal();
        double imaginary = (d2 - (real * d)) / ui2Var.getImaginary();
        return Math.log(d3 / Math.sqrt((d * d) + (imaginary * imaginary))) / real;
    }

    private static final boolean isNotFinite(double d) {
        return !((Double.isInfinite(d) || Double.isNaN(d)) ? false : true);
    }

    private static final double iterateNewtonsMethod(double d, qy6<? super Double, Double> qy6Var, qy6<? super Double, Double> qy6Var2) {
        return d - (qy6Var.invoke(Double.valueOf(d)).doubleValue() / qy6Var2.invoke(Double.valueOf(d)).doubleValue());
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5) {
        double dSqrt = 2.0d * d2 * Math.sqrt(d);
        double d6 = (dSqrt * dSqrt) - (4.0d * d);
        double d7 = -dSqrt;
        ui2 ui2VarComplexSqrt = vi2.complexSqrt(d6);
        ui2VarComplexSqrt.f88037a += d7;
        ui2VarComplexSqrt.f88037a *= 0.5d;
        ui2VarComplexSqrt.f88038b *= 0.5d;
        ui2 ui2VarComplexSqrt2 = vi2.complexSqrt(d6);
        double d8 = -1;
        ui2VarComplexSqrt2.f88037a *= d8;
        ui2VarComplexSqrt2.f88038b *= d8;
        ui2VarComplexSqrt2.f88037a += d7;
        ui2VarComplexSqrt2.f88037a *= 0.5d;
        ui2VarComplexSqrt2.f88038b *= 0.5d;
        return estimateDurationInternal(ui2VarComplexSqrt, ui2VarComplexSqrt2, d2, d3, d4, d5);
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public static final long estimateAnimationDurationMillis(double d, double d2, double d3, double d4, double d5, double d6) {
        double dSqrt = d2 / (Math.sqrt(d * d3) * 2.0d);
        double d7 = (d2 * d2) - ((4.0d * d3) * d);
        double d8 = 1.0d / (2.0d * d3);
        double d9 = -d2;
        ui2 ui2VarComplexSqrt = vi2.complexSqrt(d7);
        ui2VarComplexSqrt.f88037a += d9;
        ui2VarComplexSqrt.f88037a *= d8;
        ui2VarComplexSqrt.f88038b *= d8;
        ui2 ui2VarComplexSqrt2 = vi2.complexSqrt(d7);
        double d10 = -1;
        ui2VarComplexSqrt2.f88037a *= d10;
        ui2VarComplexSqrt2.f88038b *= d10;
        ui2VarComplexSqrt2.f88037a += d9;
        ui2VarComplexSqrt2.f88037a *= d8;
        ui2VarComplexSqrt2.f88038b *= d8;
        return estimateDurationInternal(ui2VarComplexSqrt, ui2VarComplexSqrt2, dSqrt, d4, d5, d6);
    }
}
