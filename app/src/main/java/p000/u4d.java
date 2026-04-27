package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public class u4d implements s4d {
    @Override // p000.s4d
    public void getWindowVisibleDisplayFrame(@yfb View view, @yfb Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // p000.s4d
    public void setGestureExclusionRects(@yfb View view, int i, int i2) {
    }

    @Override // p000.s4d
    public void updateViewLayout(@yfb WindowManager windowManager, @yfb View view, @yfb ViewGroup.LayoutParams layoutParams) {
        windowManager.updateViewLayout(view, layoutParams);
    }
}
