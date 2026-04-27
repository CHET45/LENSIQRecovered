package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class v83 extends k41 {

    /* JADX INFO: renamed from: e */
    public static final int f90290e = 1;

    /* JADX INFO: renamed from: f */
    public static final String f90291f = "jp.wasabeef.glide.transformations.CropCircleWithBorderTransformation.1";

    /* JADX INFO: renamed from: c */
    public final int f90292c;

    /* JADX INFO: renamed from: d */
    public final int f90293d;

    public v83() {
        this.f90292c = i1i.toDp(4);
        this.f90293d = -16777216;
    }

    @Override // p000.k41
    /* JADX INFO: renamed from: b */
    public Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight) {
        Bitmap bitmapCircleCrop = eeh.circleCrop(pool, toTransform, outWidth, outHeight);
        m14491a(toTransform, bitmapCircleCrop);
        Paint paint = new Paint();
        paint.setColor(this.f90293d);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f90292c);
        paint.setAntiAlias(true);
        new Canvas(bitmapCircleCrop).drawCircle(outWidth / 2.0f, outHeight / 2.0f, (Math.max(outWidth, outHeight) / 2.0f) - (this.f90292c / 2.0f), paint);
        return bitmapCircleCrop;
    }

    @Override // p000.k41, p000.eq8
    public boolean equals(Object o) {
        if (o instanceof v83) {
            v83 v83Var = (v83) o;
            if (v83Var.f90292c == this.f90292c && v83Var.f90293d == this.f90293d) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.k41, p000.eq8
    public int hashCode() {
        return 882652245 + (this.f90292c * 100) + this.f90293d + 10;
    }

    @Override // p000.k41, p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        messageDigest.update((f90291f + this.f90292c + this.f90293d).getBytes(eq8.f33838b));
    }

    public v83(int borderSize, @g92 int borderColor) {
        this.f90292c = borderSize;
        this.f90293d = borderColor;
    }
}
