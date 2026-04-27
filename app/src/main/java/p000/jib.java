package p000;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class jib implements iib {

    /* JADX INFO: renamed from: a */
    @yfb
    public final qy6<iib, bth> f50669a;

    /* JADX INFO: renamed from: b */
    @gib
    public InputConnection f50670b;

    /* JADX WARN: Multi-variable type inference failed */
    public jib(@yfb InputConnection inputConnection, @yfb qy6<? super iib, bth> qy6Var) {
        this.f50669a = qy6Var;
        this.f50670b = inputConnection;
    }

    /* JADX INFO: renamed from: a */
    public void mo14113a(@yfb InputConnection inputConnection) {
    }

    @gib
    /* JADX INFO: renamed from: b */
    public final InputConnection m14114b() {
        return this.f50670b;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        if (this.f50670b != null) {
            disposeDelegate();
            this.f50669a.invoke(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@gib CompletionInfo completionInfo) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@yfb InputContentInfo inputContentInfo, int i, @gib Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@gib CorrectionInfo correctionInfo) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@gib CharSequence charSequence, int i) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return false;
    }

    @Override // p000.iib
    public final void disposeDelegate() {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            mo14113a(inputConnection);
            this.f50670b = null;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.endBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public ExtractedText getExtractedText(@gib ExtractedTextRequest extractedTextRequest, int i) {
        ExtractedText extractedText;
        InputConnection inputConnection = this.f50670b;
        return (inputConnection == null || (extractedText = inputConnection.getExtractedText(extractedTextRequest, i)) == null) ? new ExtractedText() : extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    @gib
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public CharSequence getSelectedText(int i) {
        CharSequence selectedText;
        InputConnection inputConnection = this.f50670b;
        return (inputConnection == null || (selectedText = inputConnection.getSelectedText(i)) == null) ? "" : selectedText;
    }

    @Override // android.view.inputmethod.InputConnection
    @gib
    public CharSequence getTextAfterCursor(int i, int i2) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @gib
    public CharSequence getTextBeforeCursor(int i, int i2) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@gib String str, @gib Bundle bundle) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.reportFullscreenMode(z);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@gib KeyEvent keyEvent) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@gib CharSequence charSequence, int i) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        InputConnection inputConnection = this.f50670b;
        if (inputConnection != null) {
            return inputConnection.setSelection(i, i2);
        }
        return false;
    }
}
