package p000;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes3.dex */
public class o4i {

    /* JADX INFO: renamed from: f */
    public static final long f66472f = 100;

    /* JADX INFO: renamed from: g */
    public static final int f66473g = 20;

    /* JADX INFO: renamed from: h */
    public static final long f66474h = 40;

    /* JADX INFO: renamed from: a */
    public final float[] f66475a = new float[20];

    /* JADX INFO: renamed from: b */
    public final long[] f66476b = new long[20];

    /* JADX INFO: renamed from: c */
    public float f66477c = 0.0f;

    /* JADX INFO: renamed from: d */
    public int f66478d = 0;

    /* JADX INFO: renamed from: e */
    public int f66479e = 0;

    private void clear() {
        this.f66478d = 0;
        this.f66477c = 0.0f;
    }

    private float getCurrentVelocity() {
        long[] jArr;
        long j;
        int i = this.f66478d;
        if (i < 2) {
            return 0.0f;
        }
        int i2 = this.f66479e;
        int i3 = ((i2 + 20) - (i - 1)) % 20;
        long j2 = this.f66476b[i2];
        while (true) {
            jArr = this.f66476b;
            j = jArr[i3];
            if (j2 - j <= 100) {
                break;
            }
            this.f66478d--;
            i3 = (i3 + 1) % 20;
        }
        int i4 = this.f66478d;
        if (i4 < 2) {
            return 0.0f;
        }
        if (i4 == 2) {
            int i5 = (i3 + 1) % 20;
            if (j == jArr[i5]) {
                return 0.0f;
            }
            return this.f66475a[i5] / (r2 - j);
        }
        float fAbs = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f66478d - 1; i7++) {
            int i8 = i7 + i3;
            long[] jArr2 = this.f66476b;
            long j3 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j3) {
                i6++;
                float fKineticEnergyToVelocity = kineticEnergyToVelocity(fAbs);
                float f = this.f66475a[i9] / (this.f66476b[i9] - j3);
                fAbs += (f - fKineticEnergyToVelocity) * Math.abs(f);
                if (i6 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return kineticEnergyToVelocity(fAbs);
    }

    private static float kineticEnergyToVelocity(float f) {
        return (f < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    /* JADX INFO: renamed from: a */
    public void m18349a(@efb MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f66478d != 0 && eventTime - this.f66476b[this.f66479e] > 40) {
            clear();
        }
        int i = (this.f66479e + 1) % 20;
        this.f66479e = i;
        int i2 = this.f66478d;
        if (i2 != 20) {
            this.f66478d = i2 + 1;
        }
        this.f66475a[i] = motionEvent.getAxisValue(26);
        this.f66476b[this.f66479e] = eventTime;
    }

    /* JADX INFO: renamed from: b */
    public void m18350b(int i) {
        m18351c(i, Float.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public void m18351c(int i, float f) {
        float currentVelocity = getCurrentVelocity() * i;
        this.f66477c = currentVelocity;
        if (currentVelocity < (-Math.abs(f))) {
            this.f66477c = -Math.abs(f);
        } else if (this.f66477c > Math.abs(f)) {
            this.f66477c = Math.abs(f);
        }
    }

    /* JADX INFO: renamed from: d */
    public float m18352d(int i) {
        if (i != 26) {
            return 0.0f;
        }
        return this.f66477c;
    }
}
