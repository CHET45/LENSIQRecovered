package p000;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;

/* JADX INFO: loaded from: classes.dex */
@q64(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
public interface u38 {
    void hideSoftInput();

    boolean isActive();

    void restartInput();

    void showSoftInput();

    void updateCursorAnchorInfo(@yfb CursorAnchorInfo cursorAnchorInfo);

    void updateExtractedText(int i, @yfb ExtractedText extractedText);

    void updateSelection(int i, int i2, int i3, int i4);
}
