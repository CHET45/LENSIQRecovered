package p000;

import android.view.inputmethod.ExtractedText;

/* JADX INFO: loaded from: classes.dex */
public final class e48 {
    @yfb
    public static final ExtractedText toExtractedText(@yfb zsg zsgVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = zsgVar.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = zsgVar.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = jvg.m30591getMinimpl(zsgVar.m33527getSelectiond9O1mEE());
        extractedText.selectionEnd = jvg.m30590getMaximpl(zsgVar.m33527getSelectiond9O1mEE());
        extractedText.flags = !m9g.contains$default((CharSequence) zsgVar.getText(), '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }
}
