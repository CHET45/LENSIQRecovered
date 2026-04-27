package p000;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import p000.ss7;

/* JADX INFO: renamed from: et */
/* JADX INFO: loaded from: classes.dex */
public final class C5460et {
    @yfb
    /* JADX INFO: renamed from: ActualImageBitmap-x__-hDU, reason: not valid java name */
    public static final rs7 m28855ActualImageBitmapx__hDU(int i, int i2, int i3, boolean z, @yfb ia2 ia2Var) {
        m28856toBitmapConfig1JJdX4A(i3);
        return new C4936dt(Bitmap.createBitmap((DisplayMetrics) null, i, i2, m28856toBitmapConfig1JJdX4A(i3), z, C9469mq.toAndroidColorSpace(ia2Var)));
    }

    @yfb
    public static final Bitmap asAndroidBitmap(@yfb rs7 rs7Var) {
        if (rs7Var instanceof C4936dt) {
            return ((C4936dt) rs7Var).getBitmap$ui_graphics_release();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    @yfb
    public static final rs7 asImageBitmap(@yfb Bitmap bitmap) {
        return new C4936dt(bitmap);
    }

    @yfb
    /* JADX INFO: renamed from: toBitmapConfig-1JJdX4A, reason: not valid java name */
    public static final Bitmap.Config m28856toBitmapConfig1JJdX4A(int i) {
        ss7.C12765a c12765a = ss7.f82741b;
        return ss7.m32322equalsimpl0(i, c12765a.m32327getArgb8888_sVssgQ()) ? Bitmap.Config.ARGB_8888 : ss7.m32322equalsimpl0(i, c12765a.m32326getAlpha8_sVssgQ()) ? Bitmap.Config.ALPHA_8 : ss7.m32322equalsimpl0(i, c12765a.m32330getRgb565_sVssgQ()) ? Bitmap.Config.RGB_565 : ss7.m32322equalsimpl0(i, c12765a.m32328getF16_sVssgQ()) ? Bitmap.Config.RGBA_F16 : ss7.m32322equalsimpl0(i, c12765a.m32329getGpu_sVssgQ()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final int toImageConfig(@yfb Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? ss7.f82741b.m32326getAlpha8_sVssgQ() : config == Bitmap.Config.RGB_565 ? ss7.f82741b.m32330getRgb565_sVssgQ() : config == Bitmap.Config.ARGB_4444 ? ss7.f82741b.m32327getArgb8888_sVssgQ() : config == Bitmap.Config.RGBA_F16 ? ss7.f82741b.m32328getF16_sVssgQ() : config == Bitmap.Config.HARDWARE ? ss7.f82741b.m32329getGpu_sVssgQ() : ss7.f82741b.m32327getArgb8888_sVssgQ();
    }
}
