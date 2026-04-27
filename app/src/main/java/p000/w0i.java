package p000;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public class w0i {

    /* JADX INFO: renamed from: w0i$a */
    public static /* synthetic */ class C14341a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93054a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f93054a = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m24309a(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m24310b(int i) {
        return (i & 65280) >> 8;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m24311c(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m24312d(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (C14341a.f93054a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
