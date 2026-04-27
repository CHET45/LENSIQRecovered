package p000;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z87 implements r2i<w87> {

    /* JADX INFO: renamed from: a */
    public int f104374a;

    public z87(int i) {
        this.f104374a = i;
    }

    /* JADX INFO: renamed from: a */
    public static float[] m26609a(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (Float.isNaN(f2) || f < f2) {
                fArr3[i4] = f;
                i2++;
            } else if (Float.isNaN(f) || f2 < f) {
                fArr3[i4] = f2;
                i3++;
            } else {
                fArr3[i4] = f;
                i2++;
                i3++;
                i++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }

    private w87 addOpacityStopsToGradientIfNeeded(w87 w87Var, List<Float> list) {
        int i = this.f104374a * 4;
        if (list.size() <= i) {
            return w87Var;
        }
        float[] positions = w87Var.getPositions();
        int[] colors = w87Var.getColors();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] fArrM26609a = m26609a(w87Var.getPositions(), fArr);
        int length = fArrM26609a.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = fArrM26609a[i3];
            int iBinarySearch = Arrays.binarySearch(positions, f);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i3] = getColorInBetweenColorStops(f, fArr2[iBinarySearch2], positions, colors);
            } else {
                iArr[i3] = getColorInBetweenOpacityStops(f, colors[iBinarySearch], fArr, fArr2);
            }
        }
        return new w87(fArrM26609a, iArr);
    }

    private int getColorInBetweenColorStops(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 >= f || i == fArr.length - 1) {
                int i2 = i - 1;
                float f4 = fArr[i2];
                float f5 = (f - f4) / (f3 - f4);
                int i3 = iArr[i];
                int i4 = iArr[i2];
                return Color.argb((int) (f2 * 255.0f), awa.lerp(Color.red(i4), Color.red(i3), f5), awa.lerp(Color.green(i4), Color.green(i3), f5), awa.lerp(Color.blue(i4), Color.blue(i3), f5));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private int getColorInBetweenOpacityStops(float f, int i, float[] fArr, float[] fArr2) {
        float fLerp;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 >= f || i2 == fArr.length - 1) {
                if (f2 <= f) {
                    fLerp = fArr2[i2];
                } else {
                    int i3 = i2 - 1;
                    float f3 = fArr[i3];
                    fLerp = awa.lerp(fArr2[i3], fArr2[i2], (f - f3) / (f2 - f3));
                }
                return Color.argb((int) (fLerp * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    @Override // p000.r2i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000.w87 parse(p000.jm8 r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z87.parse(jm8, float):w87");
    }
}
