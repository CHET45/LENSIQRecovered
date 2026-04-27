package p000;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
public final class l00 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final l00 f55792a = new l00();

    private l00() {
    }

    @do8
    @yfb
    @ih4
    public static final ia2 composeColorSpace$ui_graphics_release(@yfb Bitmap bitmap) {
        ia2 composeColorSpace;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (composeColorSpace = C9469mq.toComposeColorSpace(colorSpace)) == null) ? ra2.f77522a.getSrgb() : composeColorSpace;
    }
}
