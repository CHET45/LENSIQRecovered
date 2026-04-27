package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class eb7 extends k41 {

    /* JADX INFO: renamed from: c */
    public static final int f32511c = 1;

    /* JADX INFO: renamed from: d */
    public static final String f32512d = "jp.wasabeef.glide.transformations.GrayscaleTransformation.1";

    @Override // p000.k41
    /* JADX INFO: renamed from: b */
    public Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight) {
        Bitmap bitmap = pool.get(toTransform.getWidth(), toTransform.getHeight(), toTransform.getConfig() != null ? toTransform.getConfig() : Bitmap.Config.ARGB_8888);
        m14491a(toTransform, bitmap);
        Canvas canvas = new Canvas(bitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(toTransform, 0.0f, 0.0f, paint);
        return bitmap;
    }

    @Override // p000.k41, p000.eq8
    public boolean equals(Object o) {
        return o instanceof eb7;
    }

    @Override // p000.k41, p000.eq8
    public int hashCode() {
        return -1580689316;
    }

    public String toString() {
        return "GrayscaleTransformation()";
    }

    @Override // p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update(f32512d.getBytes(eq8.f33838b));
    }
}
