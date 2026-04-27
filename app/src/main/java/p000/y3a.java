package p000;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes5.dex */
public class y3a implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a */
    public final float[] f100219a = new float[9];

    /* JADX INFO: renamed from: b */
    public final float[] f100220b = new float[9];

    /* JADX INFO: renamed from: c */
    public final Matrix f100221c = new Matrix();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.animation.TypeEvaluator
    @efb
    public Matrix evaluate(float f, @efb Matrix matrix, @efb Matrix matrix2) {
        matrix.getValues(this.f100219a);
        matrix2.getValues(this.f100220b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f100220b;
            float f2 = fArr[i];
            float f3 = this.f100219a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f100221c.setValues(this.f100220b);
        return this.f100221c;
    }
}
