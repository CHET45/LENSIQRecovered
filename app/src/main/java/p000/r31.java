package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class r31 implements ceh<BitmapDrawable> {

    /* JADX INFO: renamed from: c */
    public final ceh<Drawable> f76917c;

    public r31(ceh<Bitmap> cehVar) {
        this.f76917c = (ceh) t7d.checkNotNull(new kq4(cehVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static t5e<BitmapDrawable> convertToBitmapDrawableResource(t5e<Drawable> t5eVar) {
        if (t5eVar.get() instanceof BitmapDrawable) {
            return t5eVar;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + t5eVar.get());
    }

    private static t5e<Drawable> convertToDrawableResource(t5e<BitmapDrawable> t5eVar) {
        return t5eVar;
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (obj instanceof r31) {
            return this.f76917c.equals(((r31) obj).f76917c);
        }
        return false;
    }

    @Override // p000.eq8
    public int hashCode() {
        return this.f76917c.hashCode();
    }

    @Override // p000.ceh
    @efb
    public t5e<BitmapDrawable> transform(@efb Context context, @efb t5e<BitmapDrawable> t5eVar, int i, int i2) {
        return convertToBitmapDrawableResource(this.f76917c.transform(context, convertToDrawableResource(t5eVar), i, i2));
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        this.f76917c.updateDiskCacheKey(messageDigest);
    }
}
