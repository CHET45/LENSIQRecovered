package p000;

import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class vud {
    @yfb
    @q64(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @i2e(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    public static final Rect toAndroidRect(@yfb rud rudVar) {
        return new Rect((int) rudVar.getLeft(), (int) rudVar.getTop(), (int) rudVar.getRight(), (int) rudVar.getBottom());
    }

    @yfb
    public static final RectF toAndroidRectF(@yfb rud rudVar) {
        return new RectF(rudVar.getLeft(), rudVar.getTop(), rudVar.getRight(), rudVar.getBottom());
    }

    @yfb
    public static final l78 toComposeIntRect(@yfb Rect rect) {
        return new l78(rect.left, rect.top, rect.right, rect.bottom);
    }

    @yfb
    public static final rud toComposeRect(@yfb Rect rect) {
        return new rud(rect.left, rect.top, rect.right, rect.bottom);
    }

    @yfb
    public static final Rect toAndroidRect(@yfb l78 l78Var) {
        return new Rect(l78Var.getLeft(), l78Var.getTop(), l78Var.getRight(), l78Var.getBottom());
    }

    @yfb
    public static final rud toComposeRect(@yfb RectF rectF) {
        return new rud(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
