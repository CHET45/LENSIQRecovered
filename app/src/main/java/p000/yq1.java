package p000;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
@c5e(26)
public final class yq1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final yq1 f102629a = new yq1();

    private yq1() {
    }

    @ih4
    public final boolean clipOutPath(@yfb Canvas canvas, @yfb Path path) {
        return canvas.clipOutPath(path);
    }

    @ih4
    public final boolean clipOutRect(@yfb Canvas canvas, @yfb RectF rectF) {
        return canvas.clipOutRect(rectF);
    }

    @ih4
    public final boolean clipOutRect(@yfb Canvas canvas, @yfb Rect rect) {
        return canvas.clipOutRect(rect);
    }

    @ih4
    public final boolean clipOutRect(@yfb Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.clipOutRect(f, f2, f3, f4);
    }

    @ih4
    public final boolean clipOutRect(@yfb Canvas canvas, int i, int i2, int i3, int i4) {
        return canvas.clipOutRect(i, i2, i3, i4);
    }
}
