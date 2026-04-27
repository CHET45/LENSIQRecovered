package p000;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: dt */
/* JADX INFO: loaded from: classes.dex */
public final class C4936dt implements rs7 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final Bitmap f30639b;

    public C4936dt(@yfb Bitmap bitmap) {
        this.f30639b = bitmap;
    }

    @yfb
    public final Bitmap getBitmap$ui_graphics_release() {
        return this.f30639b;
    }

    @Override // p000.rs7
    @yfb
    public ia2 getColorSpace() {
        l00 l00Var = l00.f55792a;
        return l00.composeColorSpace$ui_graphics_release(this.f30639b);
    }

    @Override // p000.rs7
    /* JADX INFO: renamed from: getConfig-_sVssgQ, reason: not valid java name */
    public int mo28693getConfig_sVssgQ() {
        return C5460et.toImageConfig(this.f30639b.getConfig());
    }

    @Override // p000.rs7
    public boolean getHasAlpha() {
        return this.f30639b.hasAlpha();
    }

    @Override // p000.rs7
    public int getHeight() {
        return this.f30639b.getHeight();
    }

    @Override // p000.rs7
    public int getWidth() {
        return this.f30639b.getWidth();
    }

    @Override // p000.rs7
    public void prepareToDraw() {
        this.f30639b.prepareToDraw();
    }

    @Override // p000.rs7
    public void readPixels(@yfb int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        Bitmap bitmapAsAndroidBitmap = C5460et.asAndroidBitmap(this);
        boolean z = false;
        if (bitmapAsAndroidBitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapAsAndroidBitmap = bitmapAsAndroidBitmap.copy(Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        bitmapAsAndroidBitmap.getPixels(iArr, i5, i6, i, i2, i3, i4);
        if (z) {
            bitmapAsAndroidBitmap.recycle();
        }
    }
}
