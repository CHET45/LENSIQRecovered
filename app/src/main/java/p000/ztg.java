package p000;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;

/* JADX INFO: loaded from: classes.dex */
public interface ztg {
    @yfb
    jrg getText();

    boolean onCommitContent(@yfb sdh sdhVar);

    /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
    void mo30777onImeActionKlQnJC8(int i);

    int performHandwritingGesture(@yfb HandwritingGesture handwritingGesture);

    boolean previewHandwritingGesture(@yfb PreviewableHandwritingGesture previewableHandwritingGesture, @gib CancellationSignal cancellationSignal);

    void requestCursorUpdates(int i);

    void requestEdit(@yfb qy6<? super qw4, bth> qy6Var);

    void sendKeyEvent(@yfb KeyEvent keyEvent);
}
