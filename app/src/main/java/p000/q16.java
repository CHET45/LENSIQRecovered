package p000;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes5.dex */
public class q16 {

    /* JADX INFO: renamed from: a */
    public static final p16 f72886a = new C11262a();

    /* JADX INFO: renamed from: b */
    public static final p16 f72887b = new C11263b();

    /* JADX INFO: renamed from: q16$a */
    public class C11262a implements p16 {
        @Override // p000.p16
        public void applyMask(RectF rectF, float f, t16 t16Var) {
            rectF.bottom -= Math.abs(t16Var.f83352f - t16Var.f83350d) * f;
        }

        @Override // p000.p16
        public t16 evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fM21276m = rfh.m21276m(f4, f6, f2, f3, f, true);
            float f8 = fM21276m / f4;
            float f9 = fM21276m / f6;
            return new t16(f8, f9, fM21276m, f5 * f8, fM21276m, f7 * f9);
        }

        @Override // p000.p16
        public boolean shouldMaskStartBounds(t16 t16Var) {
            return t16Var.f83350d > t16Var.f83352f;
        }
    }

    /* JADX INFO: renamed from: q16$b */
    public class C11263b implements p16 {
        @Override // p000.p16
        public void applyMask(RectF rectF, float f, t16 t16Var) {
            float fAbs = (Math.abs(t16Var.f83351e - t16Var.f83349c) / 2.0f) * f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        }

        @Override // p000.p16
        public t16 evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float fM21276m = rfh.m21276m(f5, f7, f2, f3, f, true);
            float f8 = fM21276m / f5;
            float f9 = fM21276m / f7;
            return new t16(f8, f9, f4 * f8, fM21276m, f6 * f9, fM21276m);
        }

        @Override // p000.p16
        public boolean shouldMaskStartBounds(t16 t16Var) {
            return t16Var.f83349c > t16Var.f83351e;
        }
    }

    private q16() {
    }

    /* JADX INFO: renamed from: a */
    public static p16 m19987a(int i, boolean z, RectF rectF, RectF rectF2) {
        if (i == 0) {
            return shouldAutoFitToWidth(z, rectF, rectF2) ? f72886a : f72887b;
        }
        if (i == 1) {
            return f72886a;
        }
        if (i == 2) {
            return f72887b;
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
