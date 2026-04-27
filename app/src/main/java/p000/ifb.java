package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class ifb extends hq4<Drawable> {
    private ifb(Drawable drawable) {
        super(drawable);
    }

    @hib
    /* JADX INFO: renamed from: a */
    public static t5e<Drawable> m13011a(@hib Drawable drawable) {
        if (drawable != null) {
            return new ifb(drawable);
        }
        return null;
    }

    @Override // p000.t5e
    @efb
    public Class<Drawable> getResourceClass() {
        return this.f44522a.getClass();
    }

    @Override // p000.t5e
    public int getSize() {
        return Math.max(1, this.f44522a.getIntrinsicWidth() * this.f44522a.getIntrinsicHeight() * 4);
    }

    @Override // p000.t5e
    public void recycle() {
    }
}
