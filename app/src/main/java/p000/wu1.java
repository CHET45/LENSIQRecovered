package p000;

import android.support.v4.media.MediaDescriptionCompat;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class wu1 {

    /* JADX INFO: renamed from: a */
    public final int f95511a;

    /* JADX INFO: renamed from: b */
    public final int f95512b;

    /* JADX INFO: renamed from: c */
    public final float[] f95513c;

    /* JADX INFO: renamed from: d */
    public final boolean f95514d;

    /* JADX INFO: renamed from: e */
    public final boolean f95515e;

    /* JADX INFO: renamed from: f */
    public final boolean f95516f;

    public wu1(int i, int i2, float[] fArr) {
        boolean z = false;
        v80.checkArgument(i > 0, "Input channel count must be positive.");
        v80.checkArgument(i2 > 0, "Output channel count must be positive.");
        v80.checkArgument(fArr.length == i * i2, "Coefficient array length is invalid.");
        this.f95511a = i;
        this.f95512b = i2;
        this.f95513c = checkCoefficientsValid(fArr);
        int i3 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                float mixingCoefficient = getMixingCoefficient(i3, i4);
                boolean z5 = i3 == i4;
                if (mixingCoefficient != 1.0f && z5) {
                    z4 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z2 = false;
                    if (!z5) {
                        z3 = false;
                    }
                }
                i4++;
            }
            i3++;
        }
        this.f95514d = z2;
        boolean z6 = isSquare() && z3;
        this.f95515e = z6;
        if (z6 && z4) {
            z = true;
        }
        this.f95516f = z;
    }

    @op1
    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i + " is negative.");
            }
        }
        return fArr;
    }

    @Deprecated
    public static wu1 create(@h78(from = 1, m12174to = 2) int i, @h78(from = 1, m12174to = 2) int i2) {
        return createForConstantGain(i, i2);
    }

    private static float[] createConstantGainMixingCoefficients(int i, int i2) {
        if (i == i2) {
            return initializeIdentityMatrix(i2);
        }
        if (i == 1 && i2 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i == 2 && i2 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i + "->" + i2 + " are not yet implemented.");
    }

    private static float[] createConstantPowerMixingCoefficients(int i, int i2) {
        if (i2 == 1) {
            return getConstantPowerCoefficientsToMono(i);
        }
        if (i2 == 2) {
            return getConstantPowerCoefficientsToStereo(i);
        }
        if (i == i2) {
            return initializeIdentityMatrix(i2);
        }
        throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i + "->" + i2 + " are not implemented.");
    }

    public static wu1 createForConstantGain(@h78(from = 1, m12174to = 2) int i, @h78(from = 1, m12174to = 2) int i2) {
        return new wu1(i, i2, createConstantGainMixingCoefficients(i, i2));
    }

    public static wu1 createForConstantPower(@h78(from = 1, m12174to = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int i, @h78(from = 1, m12174to = 2) int i2) {
        return new wu1(i, i2, createConstantPowerMixingCoefficients(i, i2));
    }

    private static float[] getConstantPowerCoefficientsToMono(int i) {
        switch (i) {
            case 1:
                return new float[]{1.0f};
            case 2:
                return new float[]{0.7071f, 0.7071f};
            case 3:
                return new float[]{0.7071f, 0.7071f, 1.0f};
            case 4:
                return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
            case 5:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
            case 6:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i + "->1 are not implemented.");
        }
    }

    private static float[] getConstantPowerCoefficientsToStereo(int i) {
        switch (i) {
            case 1:
                return new float[]{0.7071f, 0.7071f};
            case 2:
                return new float[]{1.0f, 0.0f, 0.0f, 1.0f};
            case 3:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
            case 4:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
            case 5:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
            case 6:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i + "->2 are not implemented.");
        }
    }

    private static float[] initializeIdentityMatrix(int i) {
        float[] fArr = new float[i * i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[(i * i2) + i2] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.f95511a;
    }

    public float getMixingCoefficient(int i, int i2) {
        return this.f95513c[(i * this.f95512b) + i2];
    }

    public int getOutputChannelCount() {
        return this.f95512b;
    }

    public boolean isDiagonal() {
        return this.f95515e;
    }

    public boolean isIdentity() {
        return this.f95516f;
    }

    public boolean isSquare() {
        return this.f95511a == this.f95512b;
    }

    public boolean isZero() {
        return this.f95514d;
    }

    public wu1 scaleBy(float f) {
        float[] fArr = new float[this.f95513c.length];
        int i = 0;
        while (true) {
            float[] fArr2 = this.f95513c;
            if (i >= fArr2.length) {
                return new wu1(this.f95511a, this.f95512b, fArr);
            }
            fArr[i] = fArr2[i] * f;
            i++;
        }
    }
}
