package p000;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public final class iv6 {

    /* JADX INFO: renamed from: a */
    public final float[] f48545a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f48546b = new float[16];

    /* JADX INFO: renamed from: c */
    public final m1h<float[]> f48547c = new m1h<>();

    /* JADX INFO: renamed from: d */
    public boolean f48548d;

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        x67.setToIdentity(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }

    private static void getRotationMatrixFromAngleAxis(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            x67.setToIdentity(fArr);
        }
    }

    public boolean pollRotationMatrix(float[] fArr, long j) {
        float[] fArrPollFloor = this.f48547c.pollFloor(j);
        if (fArrPollFloor == null) {
            return false;
        }
        getRotationMatrixFromAngleAxis(this.f48546b, fArrPollFloor);
        if (!this.f48548d) {
            computeRecenterMatrix(this.f48545a, this.f48546b);
            this.f48548d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f48545a, 0, this.f48546b, 0);
        return true;
    }

    public void reset() {
        this.f48547c.clear();
        this.f48548d = false;
    }

    public void setRotation(long j, float[] fArr) {
        this.f48547c.add(j, fArr);
    }
}
