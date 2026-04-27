package p000;

import android.view.View;
import android.widget.PopupMenu;

/* JADX INFO: loaded from: classes3.dex */
public final class w4d {
    private w4d() {
    }

    @hib
    public static View.OnTouchListener getDragToOpenListener(@efb Object obj) {
        return ((PopupMenu) obj).getDragToOpenListener();
    }
}
