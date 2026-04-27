package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
public class p20 {
    private p20() {
    }

    /* JADX INFO: renamed from: a */
    public static InputConnection m19178a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof ipi) {
                    editorInfo.hintText = ((ipi) parent).getHint();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
