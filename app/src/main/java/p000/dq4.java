package p000;

import android.graphics.drawable.shapes.RoundRectShape;

/* JADX INFO: loaded from: classes6.dex */
public class dq4 {
    /* JADX INFO: renamed from: a */
    public static RoundRectShape m9295a(int i, int i2, int i3, int i4) {
        float[] fArr = new float[8];
        if (i > 0) {
            float f = i;
            fArr[0] = f;
            fArr[1] = f;
        }
        if (i2 > 0) {
            float f2 = i2;
            fArr[2] = f2;
            fArr[3] = f2;
        }
        if (i3 > 0) {
            float f3 = i3;
            fArr[4] = f3;
            fArr[5] = f3;
        }
        if (i4 > 0) {
            float f4 = i4;
            fArr[6] = f4;
            fArr[7] = f4;
        }
        return new RoundRectShape(fArr, null, null);
    }
}
