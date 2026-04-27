package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class c92 extends k41 {

    /* JADX INFO: renamed from: d */
    public static final int f16003d = 1;

    /* JADX INFO: renamed from: e */
    public static final String f16004e = "jp.wasabeef.glide.transformations.ColorFilterTransformation.1";

    /* JADX INFO: renamed from: c */
    public final int f16005c;

    public c92(int color) {
        this.f16005c = color;
    }

    @Override // p000.k41
    /* JADX INFO: renamed from: b */
    public Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight) {
        Bitmap bitmap = pool.get(toTransform.getWidth(), toTransform.getHeight(), toTransform.getConfig() != null ? toTransform.getConfig() : Bitmap.Config.ARGB_8888);
        m14491a(toTransform, bitmap);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(new PorterDuffColorFilter(this.f16005c, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(toTransform, 0.0f, 0.0f, paint);
        return bitmap;
    }

    @Override // p000.k41, p000.eq8
    public boolean equals(Object o) {
        return (o instanceof c92) && ((c92) o).f16005c == this.f16005c;
    }

    @Override // p000.k41, p000.eq8
    public int hashCode() {
        return 705373712 + (this.f16005c * 10);
    }

    public String toString() {
        return "ColorFilterTransformation(color=" + this.f16005c + c0b.f15434d;
    }

    @Override // p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f16004e + this.f16005c).getBytes(eq8.f33838b));
    }
}
