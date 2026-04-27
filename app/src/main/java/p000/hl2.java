package p000;

import android.view.KeyEvent;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;

/* JADX INFO: loaded from: classes.dex */
public interface hl2 {
    void acceptStylusHandwritingDelegation();

    void hideSoftInput();

    void prepareStylusHandwritingDelegation();

    void restartInput();

    void sendKeyEvent(@yfb KeyEvent keyEvent);

    void showSoftInput();

    void startStylusHandwriting();

    void updateCursorAnchorInfo(@yfb CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i, @yfb ExtractedText extractedText);

    void updateSelection(int i, int i2, int i3, int i4);
}
