package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class vu1 {

    /* JADX INFO: renamed from: a */
    public final int f92267a;

    /* JADX INFO: renamed from: b */
    public final int f92268b;

    /* JADX INFO: renamed from: c */
    public final float[] f92269c;

    /* JADX INFO: renamed from: d */
    public final boolean f92270d;

    /* JADX INFO: renamed from: e */
    public final boolean f92271e;

    /* JADX INFO: renamed from: f */
    public final boolean f92272f;

    public vu1(int i, int i2, float[] fArr) {
        boolean z = false;
        u80.checkArgument(i > 0, "Input channel count must be positive.");
        u80.checkArgument(i2 > 0, "Output channel count must be positive.");
        u80.checkArgument(fArr.length == i * i2, "Coefficient array length is invalid.");
        this.f92267a = i;
        this.f92268b = i2;
        this.f92269c = checkCoefficientsValid(fArr);
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
        this.f92270d = z2;
        boolean z6 = isSquare() && z3;
        this.f92271e = z6;
        if (z6 && z4) {
            z = true;
        }
        this.f92272f = z;
    }

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i + " is negative.");
            }
        }
        return fArr;
    }

    public static vu1 create(int i, int i2) {
        return new vu1(i, i2, createMixingCoefficients(i, i2));
    }

    private static float[] createMixingCoefficients(int i, int i2) {
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

    private static float[] initializeIdentityMatrix(int i) {
        float[] fArr = new float[i * i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[(i * i2) + i2] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.f92267a;
    }

    public float getMixingCoefficient(int i, int i2) {
        return this.f92269c[(i * this.f92268b) + i2];
    }

    public int getOutputChannelCount() {
        return this.f92268b;
    }

    public boolean isDiagonal() {
        return this.f92271e;
    }

    public boolean isIdentity() {
        return this.f92272f;
    }

    public boolean isSquare() {
        return this.f92267a == this.f92268b;
    }

    public boolean isZero() {
        return this.f92270d;
    }

    public vu1 scaleBy(float f) {
        float[] fArr = new float[this.f92269c.length];
        int i = 0;
        while (true) {
            float[] fArr2 = this.f92269c;
            if (i >= fArr2.length) {
                return new vu1(this.f92267a, this.f92268b, fArr);
            }
            fArr[i] = fArr2[i] * f;
            i++;
        }
    }
}
