package p000;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* JADX INFO: loaded from: classes.dex */
@c5e(31)
public final class mr1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final mr1 f61779a = new mr1();

    private mr1() {
    }

    @ih4
    public final void drawGlyphs(@yfb Canvas canvas, @yfb int[] iArr, int i, @yfb float[] fArr, int i2, int i3, @yfb Font font, @yfb Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    @ih4
    public final void drawPatch(@yfb Canvas canvas, @yfb NinePatch ninePatch, @yfb Rect rect, @gib Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    @ih4
    public final void drawPatch(@yfb Canvas canvas, @yfb NinePatch ninePatch, @yfb RectF rectF, @gib Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
