package p000;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class xmh {

    /* JADX INFO: renamed from: a */
    public static final float f98549a = 0.013888889f;

    /* JADX INFO: renamed from: b */
    public static final float f98550b = 0.03937008f;

    /* JADX INFO: renamed from: xmh$a */
    @c5e(34)
    public static class C15202a {
        private C15202a() {
        }

        @ih4
        public static float deriveDimension(int i, float f, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i, f, displayMetrics);
        }
    }

    /* JADX INFO: renamed from: xmh$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69934a})
    public @interface InterfaceC15203b {
    }

    private xmh() {
    }

    public static float deriveDimension(int i, float f, @efb DisplayMetrics displayMetrics) {
        float f2;
        float f3;
        if (Build.VERSION.SDK_INT >= 34) {
            return C15202a.deriveDimension(i, f, displayMetrics);
        }
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            float f4 = displayMetrics.density;
            if (f4 == 0.0f) {
                return 0.0f;
            }
            return f / f4;
        }
        if (i == 2) {
            float f5 = displayMetrics.scaledDensity;
            if (f5 == 0.0f) {
                return 0.0f;
            }
            return f / f5;
        }
        if (i == 3) {
            float f6 = displayMetrics.xdpi;
            if (f6 == 0.0f) {
                return 0.0f;
            }
            f2 = f / f6;
            f3 = 0.013888889f;
        } else {
            if (i == 4) {
                float f7 = displayMetrics.xdpi;
                if (f7 == 0.0f) {
                    return 0.0f;
                }
                return f / f7;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Invalid unitToConvertTo " + i);
            }
            float f8 = displayMetrics.xdpi;
            if (f8 == 0.0f) {
                return 0.0f;
            }
            f2 = f / f8;
            f3 = 0.03937008f;
        }
        return f2 / f3;
    }

    public static float dpToPx(float f, @efb DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    @igg({"WrongConstant"})
    public static int getUnitFromComplexDimension(int i) {
        return i & 15;
    }

    public static float pxToDp(float f, @efb DisplayMetrics displayMetrics) {
        return deriveDimension(1, f, displayMetrics);
    }

    public static float pxToSp(float f, @efb DisplayMetrics displayMetrics) {
        return deriveDimension(2, f, displayMetrics);
    }

    public static float spToPx(float f, @efb DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f, displayMetrics);
    }
}
