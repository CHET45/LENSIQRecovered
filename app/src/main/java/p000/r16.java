package p000;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public class r16 {

    /* JADX INFO: renamed from: a */
    public static final o16 f76743a = new C11842a();

    /* JADX INFO: renamed from: b */
    public static final o16 f76744b = new C11843b();

    /* JADX INFO: renamed from: r16$a */
    public class C11842a implements o16 {
        @Override // p000.o16
        public void applyMask(RectF rectF, float f, s16 s16Var) {
            rectF.bottom -= Math.abs(s16Var.f80382f - s16Var.f80380d) * f;
        }

        @Override // p000.o16
        public s16 evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fM20342m = qfh.m20342m(f4, f6, f2, f3, f, true);
            float f8 = fM20342m / f4;
            float f9 = fM20342m / f6;
            return new s16(f8, f9, fM20342m, f5 * f8, fM20342m, f7 * f9);
        }

        @Override // p000.o16
        public boolean shouldMaskStartBounds(s16 s16Var) {
            return s16Var.f80380d > s16Var.f80382f;
        }
    }

    /* JADX INFO: renamed from: r16$b */
    public class C11843b implements o16 {
        @Override // p000.o16
        public void applyMask(RectF rectF, float f, s16 s16Var) {
            float fAbs = (Math.abs(s16Var.f80381e - s16Var.f80379c) / 2.0f) * f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // p000.o16
        public s16 evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fM20342m = qfh.m20342m(f5, f7, f2, f3, f, true);
            float f8 = fM20342m / f5;
            float f9 = fM20342m / f7;
            return new s16(f8, f9, f4 * f8, fM20342m, f6 * f9, fM20342m);
        }

        @Override // p000.o16
        public boolean shouldMaskStartBounds(s16 s16Var) {
            return s16Var.f80379c > s16Var.f80381e;
        }
    }

    private r16() {
    }

    /* JADX INFO: renamed from: a */
    public static o16 m20760a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i == 0) {
            return shouldAutoFitToWidth(z, rectF, rectF2) ? f76743a : f76744b;
        }
        if (i == 1) {
            return f76743a;
        }
        if (i == 2) {
            return f76744b;
        }
        throw new IllegalArgumentException("Invalid fit mode: " + i);
    }

    private static boolean shouldAutoFitToWidth(boolean z, RectF rectF, RectF rectF2) {
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fWidth2 = rectF2.width();
        float fHeight2 = rectF2.height();
        float f = (fHeight2 * fWidth) / fWidth2;
        float f2 = (fWidth2 * fHeight) / fWidth;
        if (z) {
            if (f < fHeight) {
                return false;
            }
        } else if (f2 < fHeight2) {
            return false;
        }
        return true;
    }
}
