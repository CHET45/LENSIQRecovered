package p000;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes3.dex */
public class z36 implements TypeEvaluator<float[]> {

    /* JADX INFO: renamed from: a */
    public float[] f103967a;

    public z36(float[] fArr) {
        this.f103967a = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f103967a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
