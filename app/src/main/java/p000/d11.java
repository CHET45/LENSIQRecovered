package p000;

import p000.bkc;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBezier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1119:1\n229#1:1120\n570#1,7:1121\n570#1,7:1128\n570#1,7:1135\n570#1,7:1142\n570#1,7:1149\n559#1:1156\n559#1:1157\n559#1:1158\n570#1,7:1159\n570#1,7:1166\n570#1,7:1173\n570#1,7:1196\n570#1,7:1203\n570#1,7:1210\n570#1,7:1217\n570#1,7:1224\n570#1,7:1231\n358#1:1238\n358#1:1239\n1093#1:1240\n1093#1:1241\n1107#1:1242\n1107#1:1243\n358#1:1244\n570#1,7:1245\n562#1:1252\n562#1:1255\n97#2,16:1180\n49#2:1253\n60#2:1254\n71#2,16:1256\n*S KotlinDebug\n*F\n+ 1 Bezier.kt\nandroidx/compose/ui/graphics/BezierKt\n*L\n200#1:1120\n200#1:1121,7\n229#1:1128,7\n253#1:1135,7\n256#1:1142,7\n258#1:1149,7\n292#1:1156\n294#1:1157\n296#1:1158\n299#1:1159,7\n304#1:1166,7\n307#1:1173,7\n328#1:1196,7\n331#1:1203,7\n334#1:1210,7\n338#1:1217,7\n341#1:1224,7\n348#1:1231,7\n441#1:1238\n460#1:1239\n483#1:1240\n484#1:1241\n510#1:1242\n511#1:1243\n543#1:1244\n585#1:1245,7\n725#1:1252\n909#1:1255\n324#1:1180,16\n888#1:1253\n891#1:1254\n949#1:1256,16\n*E\n"})
public final class d11 {

    /* JADX INFO: renamed from: a */
    public static final double f28207a = 6.283185307179586d;

    /* JADX INFO: renamed from: b */
    public static final double f28208b = 1.0E-7d;

    /* JADX INFO: renamed from: c */
    public static final float f28209c = 8.34465E-7f;

    /* JADX INFO: renamed from: d11$a */
    public /* synthetic */ class C4579a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28210a;

        static {
            int[] iArr = new int[bkc.EnumC1929a.values().length];
            try {
                iArr[bkc.EnumC1929a.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bkc.EnumC1929a.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bkc.EnumC1929a.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[bkc.EnumC1929a.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[bkc.EnumC1929a.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[bkc.EnumC1929a.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[bkc.EnumC1929a.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f28210a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m8813a(float f, float f2, float[] fArr, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return writeValidRootInUnitRange((-f) / (f2 - f), fArr, i);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m8814b(float f, float f2, float f3, float[] fArr, int i, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        return findQuadraticRoots(f, f2, f3, fArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r3 <= 1.0000008f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        if (r3 >= (-8.34465E-7f)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float clampValidRootInUnitRange(float r3) {
        /*
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 >= 0) goto L11
            r1 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto Lf
        Ld:
            r3 = r0
            goto L1f
        Lf:
            r3 = r2
            goto L1f
        L11:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1f
            r1 = 1065353223(0x3f800007, float:1.0000008)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto Lf
            goto Ld
        L1f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d11.clampValidRootInUnitRange(float):float");
    }

    public static final boolean closeTo(double d, double d2) {
        return Math.abs(d - d2) < 1.0E-7d;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static final long computeCubicVerticalBounds(float f, float f2, float f3, float f4, @yfb float[] fArr, int i) {
        float f5 = (f2 - f) * 3.0f;
        float f6 = (f3 - f2) * 3.0f;
        float f7 = (f4 - f3) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f5, f6, f7, fArr, i);
        float f8 = (f6 - f5) * 2.0f;
        int iWriteValidRootInUnitRange = iFindQuadraticRoots + writeValidRootInUnitRange((-f8) / (((f7 - f6) * 2.0f) - f8), fArr, i + iFindQuadraticRoots);
        float fMin = Math.min(f, f4);
        float fMax = Math.max(f, f4);
        for (int i2 = 0; i2 < iWriteValidRootInUnitRange; i2++) {
            float fEvaluateCubic = evaluateCubic(f, f2, f3, f4, fArr[i2]);
            fMin = Math.min(fMin, fEvaluateCubic);
            fMax = Math.max(fMax, fEvaluateCubic);
        }
        return j46.m30451constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeCubicVerticalBounds$default(float f, float f2, float f3, float f4, float[] fArr, int i, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            i = 0;
        }
        return computeCubicVerticalBounds(f, f2, f3, f4, fArr, i);
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static final long computeHorizontalBounds(@yfb bkc bkcVar, @yfb float[] fArr, int i) {
        int iFindDerivativeRoots = findDerivativeRoots(bkcVar, true, fArr, i);
        float fMin = Math.min(bkcVar.getPoints()[0], getEndX(bkcVar));
        float fMax = Math.max(bkcVar.getPoints()[0], getEndX(bkcVar));
        for (int i2 = 0; i2 < iFindDerivativeRoots; i2++) {
            float fEvaluateX = evaluateX(bkcVar, fArr[i2]);
            fMin = Math.min(fMin, fEvaluateX);
            fMax = Math.max(fMax, fEvaluateX);
        }
        return j46.m30451constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeHorizontalBounds$default(bkc bkcVar, float[] fArr, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return computeHorizontalBounds(bkcVar, fArr, i);
    }

    public static final long computeVerticalBounds(@yfb bkc bkcVar, @yfb float[] fArr, int i) {
        int iFindDerivativeRoots = findDerivativeRoots(bkcVar, false, fArr, i);
        float fMin = Math.min(bkcVar.getPoints()[1], getEndY(bkcVar));
        float fMax = Math.max(bkcVar.getPoints()[1], getEndY(bkcVar));
        for (int i2 = 0; i2 < iFindDerivativeRoots; i2++) {
            float fEvaluateY = evaluateY(bkcVar, fArr[i2]);
            fMin = Math.min(fMin, fEvaluateY);
            fMax = Math.max(fMax, fEvaluateY);
        }
        return j46.m30451constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeVerticalBounds$default(bkc bkcVar, float[] fArr, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return computeVerticalBounds(bkcVar, fArr, i);
    }

    public static final float cubicArea(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return ((((((((f8 - f2) * (f3 + f5)) - ((f7 - f) * (f4 + f6))) + (f4 * (f - f5))) - (f3 * (f2 - f6))) + (f8 * (f5 + (f / 3.0f)))) - (f7 * (f6 + (f2 / 3.0f)))) * 3.0f) / 20.0f;
    }

    private static final int cubicToMonotonicCubics(float[] fArr, float[] fArr2, float[] fArr3) {
        int iFindCubicExtremaY = findCubicExtremaY(fArr, fArr3);
        int i = 0;
        if (iFindCubicExtremaY == 0) {
            u70.copyInto(fArr, fArr2, 0, 0, 8);
        } else {
            int i2 = 0;
            float f = 0.0f;
            while (i < iFindCubicExtremaY) {
                float f2 = (fArr3[i] - f) / (1.0f - f);
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                f = f2 > 1.0f ? 1.0f : f2;
                splitCubicAt(fArr, i2, fArr2, i2, f);
                i2 += 6;
                i++;
                fArr = fArr2;
            }
        }
        return iFindCubicExtremaY;
    }

    public static final int cubicWinding(@yfb float[] fArr, float f, float f2, @yfb float[] fArr2, @yfb float[] fArr3) {
        int iCubicToMonotonicCubics = cubicToMonotonicCubics(fArr, fArr2, fArr3);
        int iMonotonicCubicWinding = 0;
        if (iCubicToMonotonicCubics >= 0) {
            int i = 0;
            while (true) {
                iMonotonicCubicWinding += monotonicCubicWinding(fArr2, i * 6, f, f2);
                if (i == iCubicToMonotonicCubics) {
                    break;
                }
                i++;
            }
        }
        return iMonotonicCubicWinding;
    }

    private static final float evaluateCubic(float f, float f2, float f3, float f4, float f5) {
        float f6 = (f4 + ((f2 - f3) * 3.0f)) - f;
        return (((((f6 * f5) + (((f3 - (2.0f * f2)) + f) * 3.0f)) * f5) + ((f2 - f) * 3.0f)) * f5) + f;
    }

    private static final float evaluateLine(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    private static final float evaluateQuadratic(float f, float f2, float f3, float f4) {
        return (((((f3 - (f2 * 2.0f)) + f) * f4) + ((f2 - f) * 2.0f)) * f4) + f;
    }

    private static final float evaluateX(bkc bkcVar, float f) {
        float[] points = bkcVar.getPoints();
        switch (C4579a.f28210a[bkcVar.getType().ordinal()]) {
            case 1:
                return points[0];
            case 2:
                return evaluateLine(points[0], points[2], f);
            case 3:
                return evaluateQuadratic(points[0], points[2], points[4], f);
            case 4:
            case 6:
            case 7:
                return Float.NaN;
            case 5:
                return evaluateCubic(points[0], points[2], points[4], points[6], f);
            default:
                throw new ceb();
        }
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static final float evaluateY(@yfb bkc bkcVar, float f) {
        float[] points = bkcVar.getPoints();
        switch (C4579a.f28210a[bkcVar.getType().ordinal()]) {
            case 1:
                return points[1];
            case 2:
                return evaluateLine(points[1], points[3], f);
            case 3:
                return evaluateQuadratic(points[1], points[3], points[5], f);
            case 4:
            case 6:
            case 7:
                return Float.NaN;
            case 5:
                return evaluateCubic(points[1], points[3], points[5], points[7], f);
            default:
                throw new ceb();
        }
    }

    private static final int findCubicExtremaY(float[] fArr, float[] fArr2) {
        float f = fArr[1];
        float f2 = fArr[3];
        float f3 = fArr[5];
        return findQuadraticRoots((fArr[7] - f) + ((f2 - f3) * 3.0f), (((f - f2) - f2) - f3) * 2.0f, f2 - f, fArr2, 0);
    }

    private static final int findDerivativeRoots(bkc bkcVar, boolean z, float[] fArr, int i) {
        int i2 = !z ? 1 : 0;
        float[] points = bkcVar.getPoints();
        switch (C4579a.f28210a[bkcVar.getType().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
                return 0;
            case 3:
                float f = 2;
                float f2 = points[i2 + 2];
                float f3 = (f2 - points[i2]) * f;
                return writeValidRootInUnitRange((-f3) / ((f * (points[i2 + 4] - f2)) - f3), fArr, i);
            case 5:
                float f4 = points[i2 + 2];
                float f5 = (f4 - points[i2]) * 3.0f;
                float f6 = points[i2 + 4];
                float f7 = (f6 - f4) * 3.0f;
                float f8 = (points[i2 + 6] - f6) * 3.0f;
                int iFindQuadraticRoots = findQuadraticRoots(f5, f7, f8, fArr, i);
                float f9 = (f7 - f5) * 2.0f;
                return iFindQuadraticRoots + writeValidRootInUnitRange((-f9) / (((f8 - f7) * 2.0f) - f9), fArr, i + iFindQuadraticRoots);
            default:
                throw new ceb();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
    @p000.p7e({p000.p7e.EnumC10826a.f69936c})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float findFirstCubicRoot(float r22, float r23, float r24, float r25) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d11.findFirstCubicRoot(float, float, float, float):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r0 <= 1.0000008f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 >= (-8.34465E-7f)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float findFirstLineRoot(float r2, float r3) {
        /*
            float r0 = -r2
            float r3 = r3 - r2
            float r0 = r0 / r3
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L14
            r3 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L12
        L10:
            r0 = r2
            goto L22
        L12:
            r0 = r1
            goto L22
        L14:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L22
            r3 = 1065353223(0x3f800007, float:1.0000008)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L12
            goto L10
        L22:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d11.findFirstLineRoot(float, float):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float findFirstQuadraticRoot(float r18, float r19, float r20) {
        /*
            r0 = r18
            double r0 = (double) r0
            r2 = r19
            double r2 = (double) r2
            r4 = r20
            double r4 = (double) r4
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r2 * r6
            double r10 = r0 - r8
            double r10 = r10 + r4
            r12 = 0
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r13 = 1065353223(0x3f800007, float:1.0000008)
            r14 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            r15 = 1065353216(0x3f800000, float:1.0)
            r16 = 0
            r17 = 2143289344(0x7fc00000, float:NaN)
            if (r12 != 0) goto L45
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L26
            return r17
        L26:
            double r0 = r8 - r4
            double r4 = r4 * r6
            double r8 = r8 - r4
            double r0 = r0 / r8
            float r0 = (float) r0
            int r1 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r1 >= 0) goto L3a
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 < 0) goto L37
            r15 = r16
            goto L44
        L37:
            r15 = r17
            goto L44
        L3a:
            int r1 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r1 <= 0) goto L43
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 > 0) goto L37
            goto L44
        L43:
            r15 = r0
        L44:
            return r15
        L45:
            double r6 = r2 * r2
            double r4 = r4 * r0
            double r6 = r6 - r4
            double r4 = java.lang.Math.sqrt(r6)
            double r4 = -r4
            double r0 = -r0
            double r0 = r0 + r2
            double r2 = r4 + r0
            double r2 = -r2
            double r2 = r2 / r10
            float r2 = (float) r2
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 >= 0) goto L63
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 < 0) goto L60
            r2 = r16
            goto L6c
        L60:
            r2 = r17
            goto L6c
        L63:
            int r3 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r3 <= 0) goto L6c
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 > 0) goto L60
            r2 = r15
        L6c:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 != 0) goto L73
            return r2
        L73:
            double r4 = r4 - r0
            double r4 = r4 / r10
            float r0 = (float) r4
            int r1 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r1 >= 0) goto L84
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 < 0) goto L81
            r15 = r16
            goto L8e
        L81:
            r15 = r17
            goto L8e
        L84:
            int r1 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r1 <= 0) goto L8d
            int r0 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r0 > 0) goto L81
            goto L8e
        L8d:
            r15 = r0
        L8e:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d11.findFirstQuadraticRoot(float, float, float):float");
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static final float findFirstRoot(@yfb bkc bkcVar, float f) {
        float[] points = bkcVar.getPoints();
        switch (C4579a.f28210a[bkcVar.getType().ordinal()]) {
            case 1:
            case 4:
            case 6:
            case 7:
                return Float.NaN;
            case 2:
                float f2 = points[0] - f;
                float f3 = (-f2) / ((points[2] - f) - f2);
                float f4 = 0.0f;
                if (f3 >= 0.0f) {
                    f4 = 1.0f;
                    if (f3 <= 1.0f) {
                        return f3;
                    }
                    if (f3 > 1.0000008f) {
                        return Float.NaN;
                    }
                } else if (f3 < -8.34465E-7f) {
                    return Float.NaN;
                }
                return f4;
            case 3:
                return findFirstQuadraticRoot(points[0] - f, points[2] - f, points[4] - f);
            case 5:
                return findFirstCubicRoot(points[0] - f, points[2] - f, points[4] - f, points[6] - f);
            default:
                throw new ceb();
        }
    }

    private static final int findLineRoot(float f, float f2, float[] fArr, int i) {
        return writeValidRootInUnitRange((-f) / (f2 - f), fArr, i);
    }

    private static final int findQuadraticRoots(float f, float f2, float f3, float[] fArr, int i) {
        double d = f;
        double d2 = f2;
        double d3 = f3;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            if (d2 == d3) {
                return 0;
            }
            return writeValidRootInUnitRange((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, i);
        }
        double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
        double d7 = (-d) + d2;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((float) ((-(d6 + d7)) / d5), fArr, i);
        int iWriteValidRootInUnitRange2 = iWriteValidRootInUnitRange + writeValidRootInUnitRange((float) ((d6 - d7) / d5), fArr, i + iWriteValidRootInUnitRange);
        if (iWriteValidRootInUnitRange2 > 1) {
            float f4 = fArr[i];
            int i2 = i + 1;
            float f5 = fArr[i2];
            if (f4 > f5) {
                fArr[i] = f5;
                fArr[i2] = f4;
            } else if (f4 == f5) {
                return iWriteValidRootInUnitRange2 - 1;
            }
        }
        return iWriteValidRootInUnitRange2;
    }

    private static final float getEndX(bkc bkcVar) {
        float[] points = bkcVar.getPoints();
        char c = 4;
        switch (C4579a.f28210a[bkcVar.getType().ordinal()]) {
            case 1:
            case 6:
            case 7:
                c = 0;
                break;
            case 2:
                c = 2;
                break;
            case 3:
            case 4:
                break;
            case 5:
                c = 6;
                break;
            default:
                throw new ceb();
        }
        return points[c];
    }

    private static final float getEndY(bkc bkcVar) {
        float[] points = bkcVar.getPoints();
        char c = 5;
        switch (C4579a.f28210a[bkcVar.getType().ordinal()]) {
            case 1:
            case 6:
            case 7:
                c = 0;
                break;
            case 2:
                c = 3;
                break;
            case 3:
            case 4:
                break;
            case 5:
                c = 7;
                break;
            default:
                throw new ceb();
        }
        return points[c];
    }

    private static final float getStartX(bkc bkcVar) {
        return bkcVar.getPoints()[0];
    }

    private static final float getStartY(bkc bkcVar) {
        return bkcVar.getPoints()[1];
    }

    private static final boolean isQuadraticMonotonic(float f, float f2, float f3) {
        return !(Math.signum(f - f2) + Math.signum(f2 - f3) == 0.0f);
    }

    public static final int lineWinding(@yfb float[] fArr, float f, float f2) {
        int i;
        float f3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = f7 - f5;
        if (f5 > f7) {
            i = -1;
            f3 = f5;
        } else {
            i = 1;
            f3 = f7;
            f7 = f5;
        }
        if (f2 < f7 || f2 >= f3) {
            return 0;
        }
        float f9 = ((f6 - f4) * (f2 - f5)) - (f8 * (f - f4));
        if (f9 == 0.0f || ((int) Math.signum(f9)) == i) {
            return 0;
        }
        return i;
    }

    private static final int monotonicCubicWinding(float[] fArr, int i, float f, float f2) {
        int i2;
        int i3 = i + 1;
        float f3 = fArr[i3];
        int i4 = i + 7;
        float f4 = fArr[i4];
        if (f3 > f4) {
            i2 = -1;
            f4 = f3;
            f3 = f4;
        } else {
            i2 = 1;
        }
        if (f2 < f3 || f2 >= f4) {
            return 0;
        }
        float f5 = fArr[i];
        float f6 = fArr[i + 2];
        float f7 = fArr[i + 4];
        float f8 = fArr[i + 6];
        if (f < Math.min(f5, Math.min(f6, Math.min(f7, f8)))) {
            return 0;
        }
        if (f > Math.max(f5, Math.max(f6, Math.max(f7, f8)))) {
            return i2;
        }
        float f9 = fArr[i3];
        float f10 = fArr[i + 3];
        float f11 = fArr[i + 5];
        float f12 = fArr[i4];
        float fFindFirstCubicRoot = findFirstCubicRoot(f9 - f2, f10 - f2, f11 - f2, f12 - f2);
        if (Float.isNaN(fFindFirstCubicRoot)) {
            return 0;
        }
        float fEvaluateCubic = evaluateCubic(f5, f6, f7, f8, fFindFirstCubicRoot);
        if ((Math.abs(fEvaluateCubic - f) >= 8.34465E-7f || (f == f8 && f2 == f12)) && fEvaluateCubic < f) {
            return i2;
        }
        return 0;
    }

    private static final int monotonicQuadraticWinding(float[] fArr, int i, float f, float f2, float[] fArr2) {
        int i2;
        float f3;
        float f4;
        float f5 = fArr[i + 1];
        float f6 = fArr[i + 5];
        if (f5 > f6) {
            i2 = -1;
            f4 = f5;
            f3 = f6;
        } else {
            i2 = 1;
            f3 = f5;
            f4 = f6;
        }
        if (f2 < f3 || f2 >= f4) {
            return 0;
        }
        float f7 = fArr[i + 3];
        float fEvaluateQuadratic = m8814b((f5 - (f7 * 2.0f)) + f6, (f7 - f5) * 2.0f, f5 - f2, fArr2, 0, 16, null) == 0 ? fArr[(1 - i2) * 2] : evaluateQuadratic(fArr[0], fArr[2], fArr[4], fArr2[0]);
        if ((Math.abs(fEvaluateQuadratic - f) >= 8.34465E-7f || (f == fArr[4] && f2 == f6)) && fEvaluateQuadratic < f) {
            return i2;
        }
        return 0;
    }

    private static final int quadraticToMonotonicQuadratics(float[] fArr, float[] fArr2) {
        float f = fArr[1];
        float f2 = fArr[3];
        float f3 = fArr[5];
        if (!isQuadraticMonotonic(f, f2, f3)) {
            float f4 = f - f2;
            float fUnitDivide = unitDivide(f4, (f4 - f2) + f3);
            if (!Float.isNaN(fUnitDivide)) {
                splitQuadraticAt(fArr, fArr2, fUnitDivide);
                return 1;
            }
            if (Math.abs(f4) >= Math.abs(f2 - f3)) {
                f = f3;
            }
            f2 = f;
        }
        u70.copyInto(fArr, fArr2, 0, 0, 6);
        fArr2[3] = f2;
        return 0;
    }

    public static final int quadraticWinding(@yfb float[] fArr, float f, float f2, @yfb float[] fArr2, @yfb float[] fArr3) {
        if (isQuadraticMonotonic(fArr[1], fArr[3], fArr[5])) {
            return monotonicQuadraticWinding(fArr, 0, f, f2, fArr3);
        }
        int iQuadraticToMonotonicQuadratics = quadraticToMonotonicQuadratics(fArr, fArr2);
        int iMonotonicQuadraticWinding = monotonicQuadraticWinding(fArr2, 0, f, f2, fArr3);
        return iQuadraticToMonotonicQuadratics > 0 ? iMonotonicQuadraticWinding + monotonicQuadraticWinding(fArr2, 4, f, f2, fArr3) : iMonotonicQuadraticWinding;
    }

    private static final void splitCubicAt(float[] fArr, int i, float[] fArr2, int i2, float f) {
        if (f >= 1.0f) {
            u70.copyInto(fArr, fArr2, i2, i, 8);
            float f2 = fArr[i + 6];
            float f3 = fArr[i + 7];
            fArr2[i2 + 8] = f2;
            fArr2[i2 + 9] = f3;
            fArr2[i2 + 10] = f2;
            fArr2[i2 + 11] = f3;
            fArr2[i2 + 12] = f2;
            fArr2[i2 + 13] = f3;
            return;
        }
        float f4 = fArr[i];
        float f5 = fArr[i + 1];
        fArr2[i2] = f4;
        fArr2[i2 + 1] = f5;
        float f6 = fArr[i + 2];
        float f7 = fArr[i + 3];
        float fLerp = m3a.lerp(f4, f6, f);
        float fLerp2 = m3a.lerp(f5, f7, f);
        fArr2[i2 + 2] = fLerp;
        fArr2[i2 + 3] = fLerp2;
        float f8 = fArr[i + 4];
        float f9 = fArr[i + 5];
        float fLerp3 = m3a.lerp(f6, f8, f);
        float fLerp4 = m3a.lerp(f7, f9, f);
        float fLerp5 = m3a.lerp(fLerp, fLerp3, f);
        float fLerp6 = m3a.lerp(fLerp2, fLerp4, f);
        fArr2[i2 + 4] = fLerp5;
        fArr2[i2 + 5] = fLerp6;
        float f10 = fArr[i + 6];
        float f11 = fArr[i + 7];
        float fLerp7 = m3a.lerp(f8, f10, f);
        float fLerp8 = m3a.lerp(f9, f11, f);
        float fLerp9 = m3a.lerp(fLerp3, fLerp7, f);
        float fLerp10 = m3a.lerp(fLerp4, fLerp8, f);
        float fLerp11 = m3a.lerp(fLerp5, fLerp9, f);
        float fLerp12 = m3a.lerp(fLerp6, fLerp10, f);
        fArr2[i2 + 6] = fLerp11;
        fArr2[i2 + 7] = fLerp12;
        fArr2[i2 + 8] = fLerp9;
        fArr2[i2 + 9] = fLerp10;
        fArr2[i2 + 10] = fLerp7;
        fArr2[i2 + 11] = fLerp8;
        fArr2[i2 + 12] = f10;
        fArr2[i2 + 13] = f11;
    }

    private static final void splitQuadraticAt(float[] fArr, float[] fArr2, float f) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float fLerp = m3a.lerp(f2, f4, f);
        float fLerp2 = m3a.lerp(f3, f5, f);
        fArr2[0] = f2;
        fArr2[1] = f3;
        fArr2[2] = fLerp;
        fArr2[3] = fLerp2;
        float fLerp3 = m3a.lerp(f4, f6, f);
        float fLerp4 = m3a.lerp(f5, f7, f);
        float fLerp5 = m3a.lerp(fLerp, fLerp3, f);
        float fLerp6 = m3a.lerp(fLerp2, fLerp4, f);
        fArr2[4] = fLerp5;
        fArr2[5] = fLerp6;
        fArr2[6] = fLerp3;
        fArr2[7] = fLerp4;
        fArr2[8] = f6;
        fArr2[9] = f7;
    }

    private static final float unitDivide(float f, float f2) {
        if (f < 0.0f) {
            f = -f;
            f2 = -f2;
        }
        if (f2 == 0.0f || f == 0.0f || f >= f2) {
            return Float.NaN;
        }
        float f3 = f / f2;
        if (f3 == 0.0f) {
            return Float.NaN;
        }
        return f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[PHI: r0
  0x000d: PHI (r0v2 float) = (r0v1 float), (r0v0 float) binds: [B:11:0x001c, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int writeValidRootInUnitRange(float r3, float[] r4, int r5) {
        /*
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 >= 0) goto L11
            r1 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto Lf
        Ld:
            r3 = r0
            goto L1f
        Lf:
            r3 = r2
            goto L1f
        L11:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1f
            r1 = 1065353223(0x3f800007, float:1.0000008)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto Lf
            goto Ld
        L1f:
            r4[r5] = r3
            boolean r3 = java.lang.Float.isNaN(r3)
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d11.writeValidRootInUnitRange(float, float[], int):int");
    }

    public static final boolean closeTo(float f, float f2) {
        return Math.abs(f - f2) < 8.34465E-7f;
    }

    @p7e({p7e.EnumC10826a.f69936c})
    public static final float evaluateCubic(float f, float f2, float f3) {
        return ((((((f - f2) + 0.33333334f) * f3) + (f2 - (2.0f * f))) * f3) + f) * 3.0f * f3;
    }
}
