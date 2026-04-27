package p000;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class i41 implements t5e<Bitmap>, l18 {

    /* JADX INFO: renamed from: a */
    public final Bitmap f45710a;

    /* JADX INFO: renamed from: b */
    public final e41 f45711b;

    public i41(@efb Bitmap bitmap, @efb e41 e41Var) {
        this.f45710a = (Bitmap) t7d.checkNotNull(bitmap, "Bitmap must not be null");
        this.f45711b = (e41) t7d.checkNotNull(e41Var, "BitmapPool must not be null");
    }

    @hib
    public static i41 obtain(@hib Bitmap bitmap, @efb e41 e41Var) {
        if (bitmap == null) {
            return null;
        }
        return new i41(bitmap, e41Var);
    }

    @Override // p000.t5e
    @efb
    public Class<Bitmap> getResourceClass() {
        return Bitmap.class;
    }

    @Override // p000.t5e
    public int getSize() {
        return v0i.getBitmapByteSize(this.f45710a);
    }

    @Override // p000.l18
    public void initialize() {
        this.f45710a.prepareToDraw();
    }

    @Override // p000.t5e
    public void recycle() {
        this.f45711b.put(this.f45710a);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.t5e
    @efb
    public Bitmap get() {
        return this.f45710a;
    }
}
