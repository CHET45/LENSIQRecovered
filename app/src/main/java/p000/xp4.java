package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class xp4 implements c7e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a */
    public final e41 f98856a;

    /* JADX INFO: renamed from: b */
    public final c7e<Bitmap, byte[]> f98857b;

    /* JADX INFO: renamed from: c */
    public final c7e<GifDrawable, byte[]> f98858c;

    public xp4(@efb e41 e41Var, @efb c7e<Bitmap, byte[]> c7eVar, @efb c7e<GifDrawable, byte[]> c7eVar2) {
        this.f98856a = e41Var;
        this.f98857b = c7eVar;
        this.f98858c = c7eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @efb
    private static t5e<GifDrawable> toGifDrawableResource(@efb t5e<Drawable> t5eVar) {
        return t5eVar;
    }

    @Override // p000.c7e
    @hib
    public t5e<byte[]> transcode(@efb t5e<Drawable> t5eVar, @efb i7c i7cVar) {
        Drawable drawable = t5eVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f98857b.transcode(i41.obtain(((BitmapDrawable) drawable).getBitmap(), this.f98856a), i7cVar);
        }
        if (drawable instanceof GifDrawable) {
            return this.f98858c.transcode(toGifDrawableResource(t5eVar), i7cVar);
        }
        return null;
    }
}
