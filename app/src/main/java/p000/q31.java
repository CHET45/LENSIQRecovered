package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class q31 implements c7e<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final Resources f73084a;

    public q31(@efb Context context) {
        this(context.getResources());
    }

    @Override // p000.c7e
    @hib
    public t5e<BitmapDrawable> transcode(@efb t5e<Bitmap> t5eVar, @efb i7c i7cVar) {
        return jx8.obtain(this.f73084a, t5eVar);
    }

    @Deprecated
    public q31(@efb Resources resources, e41 e41Var) {
        this(resources);
    }

    public q31(@efb Resources resources) {
        this.f73084a = (Resources) t7d.checkNotNull(resources);
    }
}
