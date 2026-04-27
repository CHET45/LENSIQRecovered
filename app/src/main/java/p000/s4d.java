package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
@fdi
public interface s4d {
    void getWindowVisibleDisplayFrame(@yfb View view, @yfb Rect rect);

    void setGestureExclusionRects(@yfb View view, int i, int i2);

    void updateViewLayout(@yfb WindowManager windowManager, @yfb View view, @yfb ViewGroup.LayoutParams layoutParams);
}
