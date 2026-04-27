package p000;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
public final class xr1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final xr1 f99013a = new xr1();

    private xr1() {
    }

    @ih4
    public final void enableZ(@yfb Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
