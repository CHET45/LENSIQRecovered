package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class cv8 implements bv8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final cv8 f27827a = new cv8();

    private cv8() {
    }

    @Override // p000.bv8
    @gib
    public Object toBitmap(@yfb u97 u97Var, @yfb zy2<? super Bitmap> zy2Var) {
        long jM32570getSizeYbymL2g = u97Var.m32570getSizeYbymL2g();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r78.m32087getWidthimpl(jM32570getSizeYbymL2g), r78.m32086getHeightimpl(jM32570getSizeYbymL2g), Bitmap.Config.ARGB_8888);
        u97Var.draw$ui_graphics_release(C5437eq.Canvas(new Canvas(bitmapCreateBitmap)), null);
        return bitmapCreateBitmap;
    }
}
