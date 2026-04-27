package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.ComponentCallbacks2C2485a;

/* JADX INFO: loaded from: classes3.dex */
public final class jx8 implements t5e<BitmapDrawable>, l18 {

    /* JADX INFO: renamed from: a */
    public final Resources f52179a;

    /* JADX INFO: renamed from: b */
    public final t5e<Bitmap> f52180b;

    private jx8(@efb Resources resources, @efb t5e<Bitmap> t5eVar) {
        this.f52179a = (Resources) t7d.checkNotNull(resources);
        this.f52180b = (t5e) t7d.checkNotNull(t5eVar);
    }

    @Deprecated
    public static jx8 obtain(Context context, Bitmap bitmap) {
        return (jx8) obtain(context.getResources(), i41.obtain(bitmap, ComponentCallbacks2C2485a.get(context).getBitmapPool()));
    }

    @Override // p000.t5e
    @efb
    public Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }

    @Override // p000.t5e
    public int getSize() {
        return this.f52180b.getSize();
    }

    @Override // p000.l18
    public void initialize() {
        t5e<Bitmap> t5eVar = this.f52180b;
        if (t5eVar instanceof l18) {
            ((l18) t5eVar).initialize();
        }
    }

    @Override // p000.t5e
    public void recycle() {
        this.f52180b.recycle();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.t5e
    @efb
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f52179a, this.f52180b.get());
    }

    @Deprecated
    public static jx8 obtain(Resources resources, e41 e41Var, Bitmap bitmap) {
        return (jx8) obtain(resources, i41.obtain(bitmap, e41Var));
    }

    @hib
    public static t5e<BitmapDrawable> obtain(@efb Resources resources, @hib t5e<Bitmap> t5eVar) {
        if (t5eVar == null) {
            return null;
        }
        return new jx8(resources, t5eVar);
    }
}
