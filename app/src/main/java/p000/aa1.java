package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class aa1 extends k41 {

    /* JADX INFO: renamed from: e */
    public static final int f792e = 1;

    /* JADX INFO: renamed from: f */
    public static final String f793f = "jp.wasabeef.glide.transformations.BlurTransformation.1";

    /* JADX INFO: renamed from: g */
    public static final int f794g = 25;

    /* JADX INFO: renamed from: h */
    public static final int f795h = 1;

    /* JADX INFO: renamed from: c */
    public final int f796c;

    /* JADX INFO: renamed from: d */
    public final int f797d;

    public aa1() {
        this(25, 1);
    }

    @Override // p000.k41
    /* JADX INFO: renamed from: b */
    public Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight) {
        int width = toTransform.getWidth();
        int height = toTransform.getHeight();
        int i = this.f797d;
        Bitmap bitmap = pool.get(width / i, height / i, Bitmap.Config.ARGB_8888);
        m14491a(toTransform, bitmap);
        Canvas canvas = new Canvas(bitmap);
        int i2 = this.f797d;
        canvas.scale(1.0f / i2, 1.0f / i2);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(toTransform, 0.0f, 0.0f, paint);
        try {
            return qod.blur(context, bitmap, this.f796c);
        } catch (RSRuntimeException unused) {
            return kp5.blur(bitmap, this.f796c, true);
        }
    }

    @Override // p000.k41, p000.eq8
    public boolean equals(Object o) {
        if (o instanceof aa1) {
            aa1 aa1Var = (aa1) o;
            if (aa1Var.f796c == this.f796c && aa1Var.f797d == this.f797d) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.k41, p000.eq8
    public int hashCode() {
        return 737513610 + (this.f796c * 1000) + (this.f797d * 10);
    }

    public String toString() {
        return "BlurTransformation(radius=" + this.f796c + ", sampling=" + this.f797d + c0b.f15434d;
    }

    @Override // p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f793f + this.f796c + this.f797d).getBytes(eq8.f33838b));
    }

    public aa1(int radius) {
        this(radius, 1);
    }

    public aa1(int radius, int sampling) {
        this.f796c = radius;
        this.f797d = sampling;
    }
}
