package p000;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
public final class er1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final er1 f33876a = new er1();

    private er1() {
    }

    @ih4
    public final void disableZ(@yfb Canvas canvas) {
        canvas.disableZ();
    }

    @ih4
    public final void drawColor(@yfb Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    @ih4
    public final void drawDoubleRoundRect(@yfb Canvas canvas, @yfb RectF rectF, float f, float f2, @yfb RectF rectF2, float f3, float f4, @yfb Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    @ih4
    public final void drawRenderNode(@yfb Canvas canvas, @yfb RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    @ih4
    public final void drawTextRun(@yfb Canvas canvas, @yfb MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, @yfb Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    @ih4
    public final void enableZ(@yfb Canvas canvas) {
        canvas.enableZ();
    }

    @ih4
    public final void drawColor(@yfb Canvas canvas, int i, @yfb BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    @ih4
    public final void drawDoubleRoundRect(@yfb Canvas canvas, @yfb RectF rectF, @yfb float[] fArr, @yfb RectF rectF2, @yfb float[] fArr2, @yfb Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @ih4
    public final void drawColor(@yfb Canvas canvas, long j, @yfb BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }
}
