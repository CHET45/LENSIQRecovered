package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class kv9 extends k41 {

    /* JADX INFO: renamed from: d */
    public static final int f55437d = 1;

    /* JADX INFO: renamed from: e */
    public static final String f55438e = "jp.wasabeef.glide.transformations.MaskTransformation.1";

    /* JADX INFO: renamed from: f */
    public static final Paint f55439f;

    /* JADX INFO: renamed from: c */
    public final int f55440c;

    static {
        Paint paint = new Paint();
        f55439f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public kv9(int maskId) {
        this.f55440c = maskId;
    }

    @Override // p000.k41
    /* JADX INFO: renamed from: b */
    public Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight) {
        int width = toTransform.getWidth();
        int height = toTransform.getHeight();
        Bitmap bitmap = pool.get(width, height, Bitmap.Config.ARGB_8888);
        bitmap.setHasAlpha(true);
        Drawable drawable = context.getDrawable(this.f55440c);
        m14491a(toTransform, bitmap);
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, width, height);
        drawable.draw(canvas);
        canvas.drawBitmap(toTransform, 0.0f, 0.0f, f55439f);
        return bitmap;
    }

    @Override // p000.k41, p000.eq8
    public boolean equals(Object o) {
        return (o instanceof kv9) && ((kv9) o).f55440c == this.f55440c;
    }

    @Override // p000.k41, p000.eq8
    public int hashCode() {
        return (-1949385457) + (this.f55440c * 10);
    }

    public String toString() {
        return "MaskTransformation(maskId=" + this.f55440c + c0b.f15434d;
    }

    @Override // p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f55438e + this.f55440c).getBytes(eq8.f33838b));
    }
}
