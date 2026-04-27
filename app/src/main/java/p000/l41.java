package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2485a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l41 implements ceh<Bitmap> {
    public abstract Bitmap transform(@efb e41 e41Var, @efb Bitmap bitmap, int i, int i2);

    @Override // p000.ceh
    @efb
    public final t5e<Bitmap> transform(@efb Context context, @efb t5e<Bitmap> t5eVar, int i, int i2) {
        if (!v0i.isValidDimensions(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        e41 bitmapPool = ComponentCallbacks2C2485a.get(context).getBitmapPool();
        Bitmap bitmap = t5eVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapTransform = transform(bitmapPool, bitmap, i, i2);
        return bitmap.equals(bitmapTransform) ? t5eVar : i41.obtain(bitmapTransform, bitmapPool);
    }
}
