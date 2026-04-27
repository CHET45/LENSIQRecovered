package p000;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C1035c;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
@p7e({p7e.EnumC10826a.f69934a})
public final class cz4 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final TextView f28072a;

    /* JADX INFO: renamed from: b */
    public final C4568a f28073b;

    /* JADX INFO: renamed from: cz4$a */
    public static class C4568a {
        public boolean handleDeleteSurroundingText(@efb InputConnection inputConnection, @efb Editable editable, @h78(from = 0) int i, @h78(from = 0) int i2, boolean z) {
            return C1035c.handleDeleteSurroundingText(inputConnection, editable, i, i2, z);
        }

        public void updateEditorInfoAttrs(@efb EditorInfo editorInfo) {
            if (C1035c.isConfigured()) {
                C1035c.get().updateEditorInfo(editorInfo);
            }
        }
    }

    public cz4(@efb TextView textView, @efb InputConnection inputConnection, @efb EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C4568a());
    }

    private Editable getEditable() {
        return this.f28072a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.f28073b.handleDeleteSurroundingText(this, getEditable(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f28073b.handleDeleteSurroundingText(this, getEditable(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    public cz4(@efb TextView textView, @efb InputConnection inputConnection, @efb EditorInfo editorInfo, @efb C4568a c4568a) {
        super(inputConnection, false);
        this.f28072a = textView;
        this.f28073b = c4568a;
        c4568a.updateEditorInfoAttrs(editorInfo);
    }
}
