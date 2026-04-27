package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;

/* JADX INFO: loaded from: classes.dex */
@c5e(28)
public final class fv8 implements bv8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final fv8 f37810a = new fv8();

    /* JADX INFO: renamed from: fv8$a */
    public static final class C5997a extends Picture {

        /* JADX INFO: renamed from: a */
        @yfb
        public final u97 f37811a;

        public C5997a(@yfb u97 u97Var) {
            this.f37811a = u97Var;
        }

        @Override // android.graphics.Picture
        @yfb
        public Canvas beginRecording(int i, int i2) {
            return new Canvas();
        }

        @Override // android.graphics.Picture
        public void draw(@yfb Canvas canvas) {
            this.f37811a.draw$ui_graphics_release(C5437eq.Canvas(canvas), null);
        }

        @Override // android.graphics.Picture
        public void endRecording() {
        }

        @yfb
        public final u97 getGraphicsLayer() {
            return this.f37811a;
        }

        @Override // android.graphics.Picture
        public int getHeight() {
            return r78.m32086getHeightimpl(this.f37811a.m32570getSizeYbymL2g());
        }

        @Override // android.graphics.Picture
        public int getWidth() {
            return r78.m32087getWidthimpl(this.f37811a.m32570getSizeYbymL2g());
        }

        @Override // android.graphics.Picture
        public boolean requiresHardwareAcceleration() {
            return true;
        }
    }

    private fv8() {
    }

    @Override // p000.bv8
    @gib
    public Object toBitmap(@yfb u97 u97Var, @yfb zy2<? super Bitmap> zy2Var) {
        return Bitmap.createBitmap(new C5997a(u97Var));
    }
}
