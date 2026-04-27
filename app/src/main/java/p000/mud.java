package p000;

import android.view.inputmethod.ExtractedText;

/* JADX INFO: loaded from: classes.dex */
public final class mud {

    /* JADX INFO: renamed from: a */
    public static final boolean f62246a = false;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f62247b = "RecordingIC";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f62248c = "RecordingInputConnection";

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText toExtractedText(zsg zsgVar) {
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
