package p000;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
public final class n92 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final n92 f63669a = new n92();

    private n92() {
    }

    @yfb
    @ih4
    /* JADX INFO: renamed from: getColorMatrix-8unuwjk, reason: not valid java name */
    public final float[] m31143getColorMatrix8unuwjk(@yfb ColorMatrixColorFilter colorMatrixColorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrixColorFilter.getColorMatrix(colorMatrix);
        return l92.m30832constructorimpl(colorMatrix.getArray());
    }
}
