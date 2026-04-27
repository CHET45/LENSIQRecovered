package p000;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
@c5e(23)
public final class xq1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final xq1 f98894a = new xq1();

    private xq1() {
    }

    @ih4
    public final void drawTextRun(@yfb Canvas canvas, @yfb char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, @yfb Paint paint) {
        canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @ih4
    public final void drawTextRun(@yfb Canvas canvas, @yfb CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, @yfb Paint paint) {
        canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }
}
