package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class y31 {
    @yfb
    public static final Bitmap applyCanvas(@yfb Bitmap bitmap, @yfb qy6<? super Canvas, bth> qy6Var) {
        qy6Var.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean contains(@yfb Bitmap bitmap, @yfb Point point) {
        int i;
        int width = bitmap.getWidth();
        int i2 = point.x;
        return i2 >= 0 && i2 < width && (i = point.y) >= 0 && i < bitmap.getHeight();
    }

    @yfb
    public static final Bitmap createBitmap(int i, int i2, @yfb Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public static final int get(@yfb Bitmap bitmap, int i, int i2) {
        return bitmap.getPixel(i, i2);
    }

    @yfb
    public static final Bitmap scale(@yfb Bitmap bitmap, int i, int i2, boolean z) {
        return Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i, i2, z);
    }

    public static final void set(@yfb Bitmap bitmap, int i, int i2, @g92 int i3) {
        bitmap.setPixel(i, i2, i3);
    }

    public static final boolean contains(@yfb Bitmap bitmap, @yfb PointF pointF) {
        float f = pointF.x;
        if (f >= 0.0f && f < bitmap.getWidth()) {
            float f2 = pointF.y;
            if (f2 >= 0.0f && f2 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @c5e(26)
    @yfb
    @igg({"ClassVerificationFailure"})
    public static final Bitmap createBitmap(int i, int i2, @yfb Bitmap.Config config, boolean z, @yfb ColorSpace colorSpace) {
        return Bitmap.createBitmap(i, i2, config, z, colorSpace);
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return Bitmap.createBitmap(i, i2, config, z, colorSpace);
    }
}
