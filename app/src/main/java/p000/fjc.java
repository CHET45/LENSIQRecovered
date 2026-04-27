package p000;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public class fjc implements Interpolator {

    /* JADX INFO: renamed from: c */
    public static final float f36864c = 0.002f;

    /* JADX INFO: renamed from: a */
    public final float[] f36865a;

    /* JADX INFO: renamed from: b */
    public final float[] f36866b;

    public fjc(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i2 = i + 1;
        this.f36865a = new float[i2];
        this.f36866b = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / i, fArr, null);
            this.f36865a[i3] = fArr[0];
            this.f36866b[i3] = fArr[1];
        }
    }

    private static Path createCubic(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    private static Path createQuad(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f36865a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f36865a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f36865a;
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.f36866b[i];
        }
        float f5 = (f - f3) / f4;
        float[] fArr2 = this.f36866b;
        float f6 = fArr2[i];
        return f6 + (f5 * (fArr2[length] - f6));
    }

    public fjc(float f, float f2) {
        this(createQuad(f, f2));
    }

    public fjc(float f, float f2, float f3, float f4) {
        this(createCubic(f, f2, f3, f4));
    }
}
