package p000;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class k31 {

    /* JADX INFO: renamed from: k31$a */
    @c5e(27)
    public static class C8178a {
        private C8178a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Bitmap m14475a(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config configM14479a = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                configM14479a = C8180c.m14479a(bitmap);
            }
            return bitmap.copy(configM14479a, true);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static Bitmap m14476b(int i, int i2, Bitmap bitmap, boolean z) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = C8180c.m14479a(bitmap);
                }
            }
            return Bitmap.createBitmap(i, i2, config, bitmap.hasAlpha(), colorSpace);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static boolean m14477c(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    /* JADX INFO: renamed from: k31$b */
    @c5e(29)
    public static class C8179b {
        private C8179b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m14478a(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    /* JADX INFO: renamed from: k31$c */
    @c5e(31)
    public static class C8180c {
        private C8180c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static Bitmap.Config m14479a(Bitmap bitmap) {
            return bitmap.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    private k31() {
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public static int m14474a(int i, int i2, int i3, int i4) {
        return i3 == 0 ? i2 : i3 > 0 ? i * (1 << (i4 - i3)) : i2 << ((-i3) - 1);
    }

    @efb
    public static Bitmap createScaledBitmap(@efb Bitmap bitmap, int i, int i2, @hib Rect rect, boolean z) {
        Paint paint;
        double dFloor;
        Paint paint2;
        Bitmap bitmap2;
        int i3;
        Rect rect2;
        Bitmap bitmapCreateBitmap;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        int i4 = Build.VERSION.SDK_INT;
        Bitmap bitmapM14475a = i4 >= 27 ? C8178a.m14475a(bitmap) : bitmap;
        int iWidth = rect != null ? rect.width() : bitmap.getWidth();
        int iHeight = rect != null ? rect.height() : bitmap.getHeight();
        float f = i / iWidth;
        float f2 = i2 / iHeight;
        int i5 = rect != null ? rect.left : 0;
        int i6 = rect != null ? rect.top : 0;
        if (i5 == 0 && i6 == 0 && i == bitmap.getWidth() && i2 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == bitmapM14475a) ? bitmap.copy(bitmap.getConfig(), true) : bitmapM14475a;
        }
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        if (i4 >= 29) {
            C8179b.m14478a(paint3);
        } else {
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        if (iWidth == i && iHeight == i2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i, i2, bitmapM14475a.getConfig());
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapM14475a, -i5, -i6, paint3);
            return bitmapCreateBitmap2;
        }
        double dLog = Math.log(2.0d);
        if (f > 1.0f) {
            paint = paint3;
            dFloor = Math.ceil(Math.log(f) / dLog);
        } else {
            paint = paint3;
            dFloor = Math.floor(Math.log(f) / dLog);
        }
        int i7 = (int) dFloor;
        int iCeil = (int) (f2 > 1.0f ? Math.ceil(Math.log(f2) / dLog) : Math.floor(Math.log(f2) / dLog));
        if (!z || i4 < 27 || C8178a.m14477c(bitmap)) {
            paint2 = paint;
            bitmap2 = null;
            i3 = 0;
        } else {
            Bitmap bitmapM14476b = C8178a.m14476b(i7 > 0 ? m14474a(iWidth, i, 1, i7) : iWidth, iCeil > 0 ? m14474a(iHeight, i2, 1, iCeil) : iHeight, bitmap, true);
            paint2 = paint;
            new Canvas(bitmapM14476b).drawBitmap(bitmapM14475a, -i5, -i6, paint2);
            i3 = 1;
            i6 = 0;
            i5 = 0;
            bitmap2 = bitmapM14475a;
            bitmapM14475a = bitmapM14476b;
        }
        Rect rect3 = new Rect(i5, i6, iWidth, iHeight);
        Rect rect4 = new Rect();
        int i8 = i7;
        int i9 = iCeil;
        while (true) {
            if (i8 == 0 && i9 == 0) {
                break;
            }
            if (i8 < 0) {
                i8++;
            } else if (i8 > 0) {
                i8--;
            }
            if (i9 < 0) {
                i9++;
            } else if (i9 > 0) {
                i9--;
            }
            int i10 = i9;
            Paint paint4 = paint2;
            Rect rect5 = rect3;
            rect4.set(0, 0, m14474a(iWidth, i, i8, i7), m14474a(iHeight, i2, i10, iCeil));
            boolean z2 = i8 == 0 && i10 == 0;
            boolean z3 = bitmap2 != null && bitmap2.getWidth() == i && bitmap2.getHeight() == i2;
            if (bitmap2 == null || bitmap2 == bitmap) {
                rect2 = rect4;
            } else {
                if (z) {
                    rect2 = rect4;
                    if (Build.VERSION.SDK_INT < 27 || C8178a.m14477c(bitmap2)) {
                    }
                    Rect rect6 = rect2;
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM14475a, rect5, rect6, paint4);
                    rect5.set(rect6);
                    i9 = i10;
                    Bitmap bitmap3 = bitmapM14475a;
                    bitmapM14475a = bitmapCreateBitmap;
                    rect4 = rect6;
                    rect3 = rect5;
                    paint2 = paint4;
                    bitmap2 = bitmap3;
                } else {
                    rect2 = rect4;
                }
                if (!z2 || (z3 && i3 == 0)) {
                    bitmapCreateBitmap = bitmap2;
                }
                Rect rect62 = rect2;
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM14475a, rect5, rect62, paint4);
                rect5.set(rect62);
                i9 = i10;
                Bitmap bitmap32 = bitmapM14475a;
                bitmapM14475a = bitmapCreateBitmap;
                rect4 = rect62;
                rect3 = rect5;
                paint2 = paint4;
                bitmap2 = bitmap32;
            }
            if (bitmap2 != bitmap && bitmap2 != null) {
                bitmap2.recycle();
            }
            int iM14474a = m14474a(iWidth, i, i8 > 0 ? i3 : i8, i7);
            int iM14474a2 = m14474a(iHeight, i2, i10 > 0 ? i3 : i10, iCeil);
            if (Build.VERSION.SDK_INT >= 27) {
                bitmapCreateBitmap = C8178a.m14476b(iM14474a, iM14474a2, bitmap, z && !z2);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iM14474a, iM14474a2, bitmapM14475a.getConfig());
            }
            Rect rect622 = rect2;
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapM14475a, rect5, rect622, paint4);
            rect5.set(rect622);
            i9 = i10;
            Bitmap bitmap322 = bitmapM14475a;
            bitmapM14475a = bitmapCreateBitmap;
            rect4 = rect622;
            rect3 = rect5;
            paint2 = paint4;
            bitmap2 = bitmap322;
        }
        if (bitmap2 != bitmap && bitmap2 != null) {
            bitmap2.recycle();
        }
        return bitmapM14475a;
    }

    public static int getAllocationByteCount(@efb Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    public static boolean hasMipMap(@efb Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    public static void setHasMipMap(@efb Bitmap bitmap, boolean z) {
        bitmap.setHasMipMap(z);
    }
}
