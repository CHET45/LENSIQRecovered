package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@c5e(29)
public final class t4d extends u4d {
    @Override // p000.u4d, p000.s4d
    public void setGestureExclusionRects(@yfb View view, int i, int i2) {
        view.setSystemGestureExclusionRects(l82.mutableListOf(new Rect(0, 0, i, i2)));
    }
}
