package p000;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
@c5e(30)
public final class ir1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final ir1 f48020a = new ir1();

    private ir1() {
    }

    @ih4
    public final boolean quickReject(@yfb Canvas canvas, @yfb RectF rectF) {
        return canvas.quickReject(rectF);
    }

    @ih4
    public final boolean quickReject(@yfb Canvas canvas, @yfb Path path) {
        return canvas.quickReject(path);
    }

    @ih4
    public final boolean quickReject(@yfb Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }
}
