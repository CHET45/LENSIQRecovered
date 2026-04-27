package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
@jg5
public final class nya {

    /* JADX INFO: renamed from: f */
    public static final int f66047f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final float[] f66048a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final float[][] f66049b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final float[][] f66050c;

    /* JADX INFO: renamed from: d */
    public final boolean f66051d = true;

    /* JADX INFO: renamed from: e */
    @yfb
    public final float[] f66052e;

    public nya(@yfb float[] fArr, @yfb float[][] fArr2, float f) {
        int i;
        int length = fArr.length;
        int i2 = 0;
        int length2 = fArr2[0].length;
        this.f66052e = new float[length2];
        int i3 = length - 1;
        float[][] fArrMakeFloatArray = makeFloatArray(i3, length2);
        float[][] fArrMakeFloatArray2 = makeFloatArray(length, length2);
        for (int i4 = 0; i4 < length2; i4++) {
            int i5 = 0;
            while (i5 < i3) {
                int i6 = i5 + 1;
                float f2 = fArr[i6] - fArr[i5];
                float[] fArr3 = fArrMakeFloatArray[i5];
                float f3 = (fArr2[i6][i4] - fArr2[i5][i4]) / f2;
                fArr3[i4] = f3;
                if (i5 == 0) {
                    fArrMakeFloatArray2[i5][i4] = f3;
                } else {
                    fArrMakeFloatArray2[i5][i4] = (fArrMakeFloatArray[i5 - 1][i4] + f3) * 0.5f;
                }
                i5 = i6;
            }
            fArrMakeFloatArray2[i3][i4] = fArrMakeFloatArray[length - 2][i4];
        }
        if (!Float.isNaN(f)) {
            for (int i7 = 0; i7 < length2; i7++) {
                float[] fArr4 = fArrMakeFloatArray[length - 2];
                float f4 = fArr4[i7] * (1 - f);
                float[] fArr5 = fArrMakeFloatArray[0];
                float f5 = f4 + (fArr5[i7] * f);
                fArr5[i7] = f5;
                fArr4[i7] = f5;
                fArrMakeFloatArray2[i3][i7] = f5;
                fArrMakeFloatArray2[0][i7] = f5;
            }
        }
        int i8 = 0;
        while (i8 < i3) {
            int i9 = i2;
            while (i9 < length2) {
                float f6 = fArrMakeFloatArray[i8][i9];
                if (f6 == 0.0f) {
                    fArrMakeFloatArray2[i8][i9] = 0.0f;
                    fArrMakeFloatArray2[i8 + 1][i9] = 0.0f;
                    i = length2;
                } else {
                    float f7 = fArrMakeFloatArray2[i8][i9] / f6;
                    int i10 = i8 + 1;
                    float f8 = fArrMakeFloatArray2[i10][i9] / f6;
                    i = length2;
                    float fHypot = (float) Math.hypot(f7, f8);
                    if (fHypot > 9.0d) {
                        float f9 = 3.0f / fHypot;
                        float[] fArr6 = fArrMakeFloatArray2[i8];
                        float[] fArr7 = fArrMakeFloatArray[i8];
                        fArr6[i9] = f7 * f9 * fArr7[i9];
                        fArrMakeFloatArray2[i10][i9] = f9 * f8 * fArr7[i9];
                    }
                }
                i9++;
                length2 = i;
            }
            i8++;
            i2 = 0;
        }
        this.f66048a = fArr;
        this.f66049b = fArr2;
        this.f66050c = fArrMakeFloatArray2;
    }

    private final float diff(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 * f2;
        float f8 = 6;
        float f9 = f8 * f2;
        float f10 = (((((-6) * f7) * f4) + (f4 * f9)) + ((f8 * f7) * f3)) - (f9 * f3);
        float f11 = 3 * f;
        return ((((f10 + ((f11 * f6) * f7)) + ((f11 * f5) * f7)) - (((2 * f) * f6) * f2)) - (((4 * f) * f5) * f2)) + (f * f5);
    }

    public static /* synthetic */ void getPos$default(nya nyaVar, float f, AbstractC16313zy abstractC16313zy, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        nyaVar.getPos(f, abstractC16313zy, i);
    }

    public static /* synthetic */ void getSlope$default(nya nyaVar, float f, AbstractC16313zy abstractC16313zy, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        nyaVar.getSlope(f, abstractC16313zy, i);
    }

    private final float interpolate(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 * f2;
        float f8 = f7 * f2;
        float f9 = 3 * f7;
        float f10 = ((-2) * f8 * f4) + (f4 * f9);
        float f11 = 2;
        float f12 = f6 * f;
        float f13 = ((f10 + ((f11 * f8) * f3)) - (f9 * f3)) + f3 + (f12 * f8);
        float f14 = f * f5;
        return (((f13 + (f8 * f14)) - (f12 * f7)) - (((f11 * f) * f5) * f7)) + (f14 * f2);
    }

    private final float[][] makeFloatArray(int i, int i2) {
        float[][] fArr = new float[i][];
        for (int i3 = 0; i3 < i; i3++) {
            fArr[i3] = new float[i2];
        }
        return fArr;
    }

    public final float getPos(float f, int i) {
        float[] fArr = this.f66048a;
        int length = fArr.length;
        int i2 = 0;
        if (this.f66051d) {
            float f2 = fArr[0];
            if (f <= f2) {
                return this.f66049b[0][i] + ((f - f2) * getSlope(f2, i));
            }
            int i3 = length - 1;
            float f3 = fArr[i3];
            if (f >= f3) {
                return this.f66049b[i3][i] + ((f - f3) * getSlope(f3, i));
            }
        } else {
            if (f <= fArr[0]) {
                return this.f66049b[0][i];
            }
            int i4 = length - 1;
            if (f >= fArr[i4]) {
                return this.f66049b[i4][i];
            }
        }
        int i5 = length - 1;
        while (i2 < i5) {
            float[] fArr2 = this.f66048a;
            float f4 = fArr2[i2];
            if (f == f4) {
                return this.f66049b[i2][i];
            }
            int i6 = i2 + 1;
            float f5 = fArr2[i6];
            if (f < f5) {
                float f6 = f5 - f4;
                float f7 = (f - f4) / f6;
                float[][] fArr3 = this.f66049b;
                float f8 = fArr3[i2][i];
                float f9 = fArr3[i6][i];
                float[][] fArr4 = this.f66050c;
                return interpolate(f6, f7, f8, f9, fArr4[i2][i], fArr4[i6][i]);
            }
            i2 = i6;
        }
        return 0.0f;
    }

    public final void getSlope(float f, @yfb float[] fArr) {
        float f2;
        float[] fArr2 = this.f66048a;
        int length = fArr2.length;
        int length2 = this.f66049b[0].length;
        float f3 = fArr2[0];
        if (f <= f3) {
            f2 = f3;
        } else {
            f2 = fArr2[length - 1];
            if (f < f2) {
                f2 = f;
            }
        }
        int i = length - 1;
        int i2 = 0;
        while (i2 < i) {
            float[] fArr3 = this.f66048a;
            int i3 = i2 + 1;
            float f4 = fArr3[i3];
            if (f2 <= f4) {
                float f5 = fArr3[i2];
                float f6 = f4 - f5;
                float f7 = (f2 - f5) / f6;
                for (int i4 = 0; i4 < length2; i4++) {
                    float[][] fArr4 = this.f66049b;
                    float f8 = fArr4[i2][i4];
                    float f9 = fArr4[i3][i4];
                    float[][] fArr5 = this.f66050c;
                    fArr[i4] = diff(f6, f7, f8, f9, fArr5[i2][i4], fArr5[i3][i4]) / f6;
                }
                return;
            }
            i2 = i3;
        }
    }

    public final void getSlope(float f, @yfb AbstractC16313zy abstractC16313zy, int i) {
        float[] fArr = this.f66048a;
        int length = fArr.length;
        int length2 = this.f66049b[0].length;
        if (f <= fArr[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                abstractC16313zy.set$animation_core_release(i2, this.f66050c[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        if (f >= fArr[i3]) {
            for (int i4 = 0; i4 < length2; i4++) {
                abstractC16313zy.set$animation_core_release(i4, this.f66050c[i3][i4]);
            }
            return;
        }
        int i5 = i;
        while (i5 < i3) {
            float[] fArr2 = this.f66048a;
            int i6 = i5 + 1;
            float f2 = fArr2[i6];
            if (f <= f2) {
                float f3 = fArr2[i5];
                float f4 = f2 - f3;
                float f5 = (f - f3) / f4;
                for (int i7 = 0; i7 < length2; i7++) {
                    float[][] fArr3 = this.f66049b;
                    float f6 = fArr3[i5][i7];
                    float f7 = fArr3[i6][i7];
                    float[][] fArr4 = this.f66050c;
                    abstractC16313zy.set$animation_core_release(i7, diff(f4, f5, f6, f7, fArr4[i5][i7], fArr4[i6][i7]) / f4);
                }
                return;
            }
            i5 = i6;
        }
    }

    public final void getPos(float f, @yfb AbstractC16313zy abstractC16313zy, int i) {
        float[] fArr = this.f66048a;
        int length = fArr.length;
        int i2 = 0;
        int length2 = this.f66049b[0].length;
        if (this.f66051d) {
            float f2 = fArr[0];
            if (f <= f2) {
                getSlope(f2, this.f66052e);
                for (int i3 = 0; i3 < length2; i3++) {
                    abstractC16313zy.set$animation_core_release(i3, this.f66049b[0][i3] + ((f - this.f66048a[0]) * this.f66052e[i3]));
                }
                return;
            }
            int i4 = length - 1;
            float f3 = fArr[i4];
            if (f >= f3) {
                getSlope(f3, this.f66052e);
                while (i2 < length2) {
                    abstractC16313zy.set$animation_core_release(i2, this.f66049b[i4][i2] + ((f - this.f66048a[i4]) * this.f66052e[i2]));
                    i2++;
                }
                return;
            }
        } else {
            if (f <= fArr[0]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    abstractC16313zy.set$animation_core_release(i5, this.f66049b[0][i5]);
                }
                return;
            }
            int i6 = length - 1;
            if (f >= fArr[i6]) {
                while (i2 < length2) {
                    abstractC16313zy.set$animation_core_release(i2, this.f66049b[i6][i2]);
                    i2++;
                }
                return;
            }
        }
        int i7 = length - 1;
        int i8 = i;
        while (i8 < i7) {
            if (f == this.f66048a[i8]) {
                for (int i9 = 0; i9 < length2; i9++) {
                    abstractC16313zy.set$animation_core_release(i9, this.f66049b[i8][i9]);
                }
            }
            float[] fArr2 = this.f66048a;
            int i10 = i8 + 1;
            float f4 = fArr2[i10];
            if (f < f4) {
                float f5 = fArr2[i8];
                float f6 = f4 - f5;
                float f7 = (f - f5) / f6;
                for (int i11 = 0; i11 < length2; i11++) {
                    float[][] fArr3 = this.f66049b;
                    float f8 = fArr3[i8][i11];
                    float f9 = fArr3[i10][i11];
                    float[][] fArr4 = this.f66050c;
                    abstractC16313zy.set$animation_core_release(i11, interpolate(f6, f7, f8, f9, fArr4[i8][i11], fArr4[i10][i11]));
                }
                return;
            }
            i8 = i10;
        }
    }

    private final float getSlope(float f, int i) {
        float[] fArr = this.f66048a;
        int length = fArr.length;
        int i2 = 0;
        float f2 = fArr[0];
        if (f < f2) {
            f = f2;
        } else {
            float f3 = fArr[length - 1];
            if (f >= f3) {
                f = f3;
            }
        }
        int i3 = length - 1;
        while (i2 < i3) {
            float[] fArr2 = this.f66048a;
            int i4 = i2 + 1;
            float f4 = fArr2[i4];
            if (f <= f4) {
                float f5 = fArr2[i2];
                float f6 = f4 - f5;
                float f7 = (f - f5) / f6;
                float[][] fArr3 = this.f66049b;
                float f8 = fArr3[i2][i];
                float f9 = fArr3[i4][i];
                float[][] fArr4 = this.f66050c;
                return diff(f6, f7, f8, f9, fArr4[i2][i], fArr4[i4][i]) / f6;
            }
            i2 = i4;
        }
        return 0.0f;
    }
}
