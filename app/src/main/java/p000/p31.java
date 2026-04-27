package p000;

import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class p31 extends hq4<BitmapDrawable> implements l18 {

    /* JADX INFO: renamed from: b */
    public final e41 f69519b;

    public p31(BitmapDrawable bitmapDrawable, e41 e41Var) {
        super(bitmapDrawable);
        this.f69519b = e41Var;
    }

    @Override // p000.t5e
    @efb
    public Class<BitmapDrawable> getResourceClass() {
        return BitmapDrawable.class;
    }

    @Override // p000.t5e
    public int getSize() {
        return v0i.getBitmapByteSize(((BitmapDrawable) this.f44522a).getBitmap());
    }

    @Override // p000.hq4, p000.l18
    public void initialize() {
        ((BitmapDrawable) this.f44522a).getBitmap().prepareToDraw();
    }

    @Override // p000.t5e
    public void recycle() {
        this.f69519b.put(((BitmapDrawable) this.f44522a).getBitmap());
    }
}
