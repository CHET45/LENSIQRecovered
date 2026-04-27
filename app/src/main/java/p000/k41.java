package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k41 implements ceh<Bitmap> {
    /* JADX INFO: renamed from: a */
    public void m14491a(@efb Bitmap toTransform, @efb Bitmap canvasBitmap) {
        canvasBitmap.setDensity(toTransform.getDensity());
    }

    /* JADX INFO: renamed from: b */
    public abstract Bitmap mo255b(@efb Context context, @efb e41 pool, @efb Bitmap toTransform, int outWidth, int outHeight);

    @Override // p000.eq8
    public abstract boolean equals(Object o);

    @Override // p000.eq8
    public abstract int hashCode();

    @Override // p000.ceh
    @efb
    public final t5e<Bitmap> transform(@efb Context context, @efb t5e<Bitmap> resource, int outWidth, int outHeight) {
        if (!v0i.isValidDimensions(outWidth, outHeight)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + outWidth + " or height: " + outHeight + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        e41 bitmapPool = ComponentCallbacks2C2485a.get(context).getBitmapPool();
        Bitmap bitmap = resource.get();
        if (outWidth == Integer.MIN_VALUE) {
            outWidth = bitmap.getWidth();
        }
        int i = outWidth;
        if (outHeight == Integer.MIN_VALUE) {
            outHeight = bitmap.getHeight();
        }
        Bitmap bitmapMo255b = mo255b(context.getApplicationContext(), bitmapPool, bitmap, i, outHeight);
        return bitmap.equals(bitmapMo255b) ? resource : i41.obtain(bitmapMo255b, bitmapPool);
    }

    @Override // p000.eq8
    public abstract void updateDiskCacheKey(@efb MessageDigest messageDigest);
}
