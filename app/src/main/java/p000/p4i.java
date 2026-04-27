package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,734:1\n696#1:747\n703#1,2:748\n699#1,6:750\n696#1:756\n696#1:757\n691#1:758\n677#1:760\n677#1:761\n33#2,6:735\n33#2,6:741\n78#3:759\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n498#1:747\n500#1:748,2\n502#1:750,6\n509#1:756\n511#1:757\n524#1:758\n661#1:760\n667#1:761\n396#1:735,6\n432#1:741,6\n524#1:759\n*E\n"})
public final class p4i {

    /* JADX INFO: renamed from: a */
    public static final int f69666a = 40;

    /* JADX INFO: renamed from: b */
    public static final int f69667b = 20;

    /* JADX INFO: renamed from: c */
    public static final int f69668c = 100;

    /* JADX INFO: renamed from: d */
    public static final float f69669d = 1.0f;

    /* JADX INFO: renamed from: e */
    public static boolean f69670e = true;

    /* JADX INFO: renamed from: f */
    public static boolean f69671f;

    private static final float[][] Matrix(int i, int i2) {
        float[][] fArr = new float[i][];
        for (int i3 = 0; i3 < i; i3++) {
            fArr[i3] = new float[i2];
        }
        return fArr;
    }

    public static final void addPointerInputChange(@yfb m4i m4iVar, @yfb h2d h2dVar) {
        if (f69670e) {
            addPointerInputChangeWithFix(m4iVar, h2dVar);
        } else {
            addPointerInputChangeLegacy(m4iVar, h2dVar);
        }
    }

    private static final void addPointerInputChangeLegacy(m4i m4iVar, h2d h2dVar) {
        if (u1d.changedToDownIgnoreConsumed(h2dVar)) {
            m4iVar.m30948setCurrentPointerPositionAccumulatork4lQ0M$ui_release(h2dVar.m29911getPositionF1C5BW0());
            m4iVar.resetTracking();
        }
        long jM29912getPreviousPositionF1C5BW0 = h2dVar.m29912getPreviousPositionF1C5BW0();
        List<ak7> historical = h2dVar.getHistorical();
        int size = historical.size();
        int i = 0;
        while (i < size) {
            ak7 ak7Var = historical.get(i);
            long jM30433minusMKHz9U = izb.m30433minusMKHz9U(ak7Var.m27224getPositionF1C5BW0(), jM29912getPreviousPositionF1C5BW0);
            long jM27224getPositionF1C5BW0 = ak7Var.m27224getPositionF1C5BW0();
            m4iVar.m30948setCurrentPointerPositionAccumulatork4lQ0M$ui_release(izb.m30434plusMKHz9U(m4iVar.m30947getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), jM30433minusMKHz9U));
            m4iVar.m30944addPositionUv8p0NA(ak7Var.getUptimeMillis(), m4iVar.m30947getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
            i++;
            jM29912getPreviousPositionF1C5BW0 = jM27224getPositionF1C5BW0;
        }
        m4iVar.m30948setCurrentPointerPositionAccumulatork4lQ0M$ui_release(izb.m30434plusMKHz9U(m4iVar.m30947getCurrentPointerPositionAccumulatorF1C5BW0$ui_release(), izb.m30433minusMKHz9U(h2dVar.m29911getPositionF1C5BW0(), jM29912getPreviousPositionF1C5BW0)));
        m4iVar.m30944addPositionUv8p0NA(h2dVar.getUptimeMillis(), m4iVar.m30947getCurrentPointerPositionAccumulatorF1C5BW0$ui_release());
    }

    private static final void addPointerInputChangeWithFix(m4i m4iVar, h2d h2dVar) {
        if (u1d.changedToDownIgnoreConsumed(h2dVar)) {
            m4iVar.resetTracking();
        }
        if (!u1d.changedToUpIgnoreConsumed(h2dVar)) {
            List<ak7> historical = h2dVar.getHistorical();
            int size = historical.size();
            for (int i = 0; i < size; i++) {
                ak7 ak7Var = historical.get(i);
                m4iVar.m30944addPositionUv8p0NA(ak7Var.getUptimeMillis(), ak7Var.m27223getOriginalEventPositionF1C5BW0$ui_release());
            }
            m4iVar.m30944addPositionUv8p0NA(h2dVar.getUptimeMillis(), h2dVar.m29910getOriginalEventPositionF1C5BW0$ui_release());
        }
        if (u1d.changedToUpIgnoreConsumed(h2dVar) && h2dVar.getUptimeMillis() - m4iVar.getLastMoveEventTimeStamp$ui_release() > 40) {
            m4iVar.resetTracking();
        }
        m4iVar.setLastMoveEventTimeStamp$ui_release(h2dVar.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i, boolean z) {
        int i2 = i - 1;
        float f = fArr2[i2];
        float fSignum = 0.0f;
        int i3 = i2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            float f2 = fArr2[i4];
            if (f != f2) {
                float f3 = (z ? -fArr[i4] : fArr[i3] - fArr[i4]) / (f - f2);
                fSignum += (f3 - (Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum))))) * Math.abs(f3);
                if (i3 == i2) {
                    fSignum *= 0.5f;
                }
            }
            i3--;
            f = f2;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(2 * Math.abs(fSignum)));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    private static final float get(float[][] fArr, int i, int i2) {
        return fArr[i][i2];
    }

    @ug5
    public static final boolean getVelocityTrackerAddPointsFix() {
        return f69670e;
    }

    @ug5
    public static /* synthetic */ void getVelocityTrackerAddPointsFix$annotations() {
    }

    @ug5
    public static final boolean getVelocityTrackerStrategyUseImpulse() {
        return f69671f;
    }

    @ug5
    public static /* synthetic */ void getVelocityTrackerStrategyUseImpulse$annotations() {
    }

    private static final float kineticEnergyToVelocity(float f) {
        return Math.signum(f) * ((float) Math.sqrt(2 * Math.abs(f)));
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    @yfb
    public static final float[] polyFitLeastSquares(@yfb float[] fArr, @yfb float[] fArr2, int i, int i2, @yfb float[] fArr3) {
        int i3 = i2;
        if (i3 < 1) {
            g28.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i == 0) {
            g28.throwIllegalArgumentException("At least one point must be provided");
        }
        if (i3 >= i) {
            i3 = i - 1;
        }
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i];
        }
        for (int i6 = 0; i6 < i; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            u70.copyInto(fArr4[i10], fArr7, 0, 0, i);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr8 = fArr5[i11];
                float fDot = dot(fArr7, fArr8);
                for (int i12 = 0; i12 < i; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr8[i12] * fDot);
                }
            }
            float fSqrt = (float) Math.sqrt(dot(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i13 = 0; i13 < i; i13++) {
                fArr7[i13] = fArr7[i13] * f;
            }
            float[] fArr9 = fArr6[i10];
            int i14 = 0;
            while (i14 < i4) {
                fArr9[i14] = i14 < i10 ? 0.0f : dot(fArr7, fArr4[i14]);
                i14++;
            }
            i10++;
        }
        for (int i15 = i3; -1 < i15; i15--) {
            float fDot2 = dot(fArr5[i15], fArr2);
            float[] fArr10 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    fDot2 -= fArr10[i17] * fArr3[i17];
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            fArr3[i15] = fDot2 / fArr10[i15];
        }
        return fArr3;
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i, int i2, float[] fArr3, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            fArr3 = new float[kpd.coerceAtLeast(i2 + 1, 0)];
        }
        return polyFitLeastSquares(fArr, fArr2, i, i2, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(yg3[] yg3VarArr, int i, long j, float f) {
        yg3 yg3Var = yg3VarArr[i];
        if (yg3Var == null) {
            yg3VarArr[i] = new yg3(j, f);
        } else {
            yg3Var.setTime(j);
            yg3Var.setDataPoint(f);
        }
    }

    @ug5
    public static final void setVelocityTrackerAddPointsFix(boolean z) {
        f69670e = z;
    }

    @ug5
    public static final void setVelocityTrackerStrategyUseImpulse(boolean z) {
        f69671f = z;
    }

    private static final void set(float[][] fArr, int i, int i2, float f) {
        fArr[i][i2] = f;
    }
}
