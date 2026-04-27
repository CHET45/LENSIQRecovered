package p000;

import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@q64(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
public interface p38 {
    void onConnectionClosed(@yfb kud kudVar);

    void onEditCommands(@yfb List<? extends lw4> list);

    /* JADX INFO: renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void mo31718onImeActionKlQnJC8(int i);

    void onKeyEvent(@yfb KeyEvent keyEvent);

    void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);
}
