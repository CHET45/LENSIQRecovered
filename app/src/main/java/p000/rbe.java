package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
@c5e(21)
public class rbe extends sbe {
    public rbe(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // p000.sbe
    /* JADX INFO: renamed from: a */
    public void mo21113a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@efb Outline outline) {
        m21808b();
        outline.setRoundRect(this.f81160h, getCornerRadius());
    }

    @Override // p000.sbe
    public boolean hasMipMap() {
        Bitmap bitmap = this.f81153a;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override // p000.sbe
    public void setMipMap(boolean z) {
        Bitmap bitmap = this.f81153a;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }
}
