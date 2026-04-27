package p000;

import android.view.View;
import android.widget.ListPopupWindow;

/* JADX INFO: loaded from: classes3.dex */
public final class o99 {
    private o99() {
    }

    @Deprecated
    public static View.OnTouchListener createDragToOpenListener(Object obj, View view) {
        return createDragToOpenListener((ListPopupWindow) obj, view);
    }

    @hib
    public static View.OnTouchListener createDragToOpenListener(@efb ListPopupWindow listPopupWindow, @efb View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }
}
