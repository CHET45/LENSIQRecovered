package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class kq4 implements ceh<Drawable> {

    /* JADX INFO: renamed from: c */
    public final ceh<Bitmap> f54947c;

    /* JADX INFO: renamed from: d */
    public final boolean f54948d;

    public kq4(ceh<Bitmap> cehVar, boolean z) {
        this.f54947c = cehVar;
        this.f54948d = z;
    }

    private t5e<Drawable> newDrawableResource(Context context, t5e<Bitmap> t5eVar) {
        return jx8.obtain(context.getResources(), t5eVar);
    }

    public ceh<BitmapDrawable> asBitmapDrawable() {
        return this;
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (obj instanceof kq4) {
            return this.f54947c.equals(((kq4) obj).f54947c);
        }
        return false;
    }

    @Override // p000.eq8
    public int hashCode() {
        return this.f54947c.hashCode();
    }

    @Override // p000.ceh
    @efb
    public t5e<Drawable> transform(@efb Context context, @efb t5e<Drawable> t5eVar, int i, int i2) {
        e41 bitmapPool = ComponentCallbacks2C2485a.get(context).getBitmapPool();
        Drawable drawable = t5eVar.get();
        t5e<Bitmap> t5eVarM14232a = jq4.m14232a(bitmapPool, drawable, i, i2);
        if (t5eVarM14232a != null) {
            t5e<Bitmap> t5eVarTransform = this.f54947c.transform(context, t5eVarM14232a, i, i2);
            if (!t5eVarTransform.equals(t5eVarM14232a)) {
                return newDrawableResource(context, t5eVarTransform);
            }
            t5eVarTransform.recycle();
            return t5eVar;
        }
        if (!this.f54948d) {
            return t5eVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        this.f54947c.updateDiskCacheKey(messageDigest);
    }
}
