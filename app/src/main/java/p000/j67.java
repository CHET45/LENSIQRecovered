package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2485a;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class j67 implements ceh<GifDrawable> {

    /* JADX INFO: renamed from: c */
    public final ceh<Bitmap> f49624c;

    public j67(ceh<Bitmap> cehVar) {
        this.f49624c = (ceh) t7d.checkNotNull(cehVar);
    }

    @Override // p000.eq8
    public boolean equals(Object obj) {
        if (obj instanceof j67) {
            return this.f49624c.equals(((j67) obj).f49624c);
        }
        return false;
    }

    @Override // p000.eq8
    public int hashCode() {
        return this.f49624c.hashCode();
    }

    @Override // p000.ceh
    @efb
    public t5e<GifDrawable> transform(@efb Context context, @efb t5e<GifDrawable> t5eVar, int i, int i2) {
        GifDrawable gifDrawable = t5eVar.get();
        t5e<Bitmap> i41Var = new i41(gifDrawable.getFirstFrame(), ComponentCallbacks2C2485a.get(context).getBitmapPool());
        t5e<Bitmap> t5eVarTransform = this.f49624c.transform(context, i41Var, i, i2);
        if (!i41Var.equals(t5eVarTransform)) {
            i41Var.recycle();
        }
        gifDrawable.setFrameTransformation(this.f49624c, t5eVarTransform.get());
        return t5eVar;
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
        this.f49624c.updateDiskCacheKey(messageDigest);
    }
}
