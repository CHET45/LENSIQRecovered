package p000;

import android.graphics.Color;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ya2 {
    private ya2() {
    }

    @g92
    public static int applyAlpha(@g92 int i, @h78(from = 0, m12174to = coe.f17274d) int i2) {
        return (i & 16777215) | (i2 << 24);
    }

    @g92
    public static int blend(@g92 int i, @g92 int i2, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((f2 * Color.blue(i)) + (f * Color.blue(i2))));
    }
}
