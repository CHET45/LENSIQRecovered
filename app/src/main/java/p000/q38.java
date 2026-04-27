package p000;

import android.view.KeyEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface q38 {
    void onConnectionClosed(@yfb jud judVar);

    void onEditCommands(@yfb List<? extends lw4> list);

    /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
    void mo27185onImeActionKlQnJC8(int i);

    void onKeyEvent(@yfb KeyEvent keyEvent);

    void onRequestCursorAnchorInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);
}
