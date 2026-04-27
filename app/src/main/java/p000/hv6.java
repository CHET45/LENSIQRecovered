package p000;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class hv6 {

    /* JADX INFO: renamed from: a */
    public final float[] f44928a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f44929b = new float[16];

    /* JADX INFO: renamed from: c */
    public final l1h<float[]> f44930c = new l1h<>();

    /* JADX INFO: renamed from: d */
    public boolean f44931d;

    public static void computeRecenterMatrix(float[] fArr, float[] fArr2) {
        y67.setToIdentity(fArr);
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
            y67.setToIdentity(fArr);
        }
    }

    public boolean pollRotationMatrix(float[] fArr, long j) {
        float[] fArrPollFloor = this.f44930c.pollFloor(j);
        if (fArrPollFloor == null) {
            return false;
        }
        getRotationMatrixFromAngleAxis(this.f44929b, fArrPollFloor);
        if (!this.f44931d) {
            computeRecenterMatrix(this.f44928a, this.f44929b);
            this.f44931d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f44928a, 0, this.f44929b, 0);
        return true;
    }

    public void reset() {
        this.f44930c.clear();
        this.f44931d = false;
    }

    public void setRotation(long j, float[] fArr) {
        this.f44930c.add(j, fArr);
    }
}
