package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,113:1\n103#1:114\n107#1:120\n103#1:124\n103#1:135\n35#2,2:115\n54#2,3:117\n66#2,3:121\n35#2,2:125\n54#2,3:127\n35#2,2:130\n66#2,3:132\n35#2,2:136\n54#2,3:138\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n88#1:114\n89#1:120\n89#1:124\n107#1:135\n88#1:115,2\n88#1:117,3\n89#1:121,3\n89#1:125,2\n89#1:127,3\n103#1:130,2\n107#1:132,3\n107#1:136,2\n111#1:138,3\n*E\n"})
public final class vi2 {
    @yfb
    public static final scc<ui2, ui2> complexQuadraticFormula(double d, double d2, double d3) {
        double d4 = (d2 * d2) - ((4.0d * d) * d3);
        double d5 = 1.0d / (d * 2.0d);
        double d6 = -d2;
        ui2 ui2VarComplexSqrt = complexSqrt(d4);
        ui2VarComplexSqrt.f88037a += d6;
        ui2VarComplexSqrt.f88037a *= d5;
        ui2VarComplexSqrt.f88038b *= d5;
        ui2 ui2VarComplexSqrt2 = complexSqrt(d4);
        double d7 = -1;
        ui2VarComplexSqrt2.f88037a *= d7;
        ui2VarComplexSqrt2.f88038b *= d7;
        ui2VarComplexSqrt2.f88037a += d6;
        ui2VarComplexSqrt2.f88037a *= d5;
        ui2VarComplexSqrt2.f88038b *= d5;
        return vkh.m24050to(ui2VarComplexSqrt, ui2VarComplexSqrt2);
    }

    @yfb
    public static final ui2 complexSqrt(double d) {
        return d < 0.0d ? new ui2(0.0d, Math.sqrt(Math.abs(d))) : new ui2(Math.sqrt(d), 0.0d);
    }

    @yfb
    public static final ui2 minus(double d, @yfb ui2 ui2Var) {
        double d2 = -1;
        ui2Var.f88037a *= d2;
        ui2Var.f88038b *= d2;
        ui2Var.f88037a += d;
        return ui2Var;
    }

    @yfb
    public static final ui2 plus(double d, @yfb ui2 ui2Var) {
        ui2Var.f88037a += d;
        return ui2Var;
    }

    @yfb
    public static final ui2 times(double d, @yfb ui2 ui2Var) {
        ui2Var.f88037a *= d;
        ui2Var.f88038b *= d;
        return ui2Var;
    }
}
