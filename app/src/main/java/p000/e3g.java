package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.inputmethod.ExtractedText;
import p000.sdh;

/* JADX INFO: loaded from: classes.dex */
public final class e3g {

    /* JADX INFO: renamed from: a */
    public static final boolean f31669a = false;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f31670b = "StatelessIC";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final String f31671c = "StatelessInputConnection";

    /* JADX INFO: renamed from: d */
    @yfb
    public static final String f31672d = "EXTRA_INPUT_CONTENT_INFO";

    @fdi
    public static /* synthetic */ void getSIC_DEBUG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText toExtractedText(jrg jrgVar) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = jrgVar;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = jrgVar.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = jvg.m30591getMinimpl(jrgVar.m30568getSelectiond9O1mEE());
        extractedText.selectionEnd = jvg.m30590getMaximpl(jrgVar.m30568getSelectiond9O1mEE());
        extractedText.flags = !m9g.contains$default((CharSequence) jrgVar, '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }

    @yfb
    public static final sdh toTransferableContent(@yfb m38 m38Var, @gib Bundle bundle) {
        u42 clipEntry = C7562iq.toClipEntry(new ClipData(m38Var.getDescription(), new ClipData.Item(m38Var.getContentUri())));
        int iM32309getKeyboardkB6V9T0 = sdh.C12541a.f81504b.m32309getKeyboardkB6V9T0();
        w42 clipMetadata = C7562iq.toClipMetadata(m38Var.getDescription());
        Uri linkUri = m38Var.getLinkUri();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new sdh(clipEntry, clipMetadata, iM32309getKeyboardkB6V9T0, new byc(linkUri, bundle), null);
    }
}
