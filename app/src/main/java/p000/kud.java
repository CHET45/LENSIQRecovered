package p000;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.videolan.libvlc.MediaPlayer;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,459:1\n86#1,5:460\n86#1,5:465\n86#1,5:470\n86#1,5:475\n86#1,5:480\n86#1,5:485\n86#1,5:490\n86#1,5:495\n86#1,5:500\n86#1,5:505\n86#1,5:510\n86#1,5:515\n86#1,5:520\n86#1,5:525\n86#1,5:530\n86#1,5:535\n86#1,5:540\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n146#1:460,5\n182#1:465,5\n187#1:470,5\n193#1:475,5\n201#1:480,5\n212#1:485,5\n218#1:490,5\n224#1:495,5\n230#1:500,5\n266#1:505,5\n350#1:510,5\n376#1:515,5\n399#1:520,5\n409#1:525,5\n421#1:530,5\n441#1:535,5\n450#1:540,5\n*E\n"})
@e0g(parameters = 0)
@q64(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
public final class kud implements InputConnection {

    /* JADX INFO: renamed from: i */
    public static final int f55374i = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final p38 f55375a;

    /* JADX INFO: renamed from: b */
    public final boolean f55376b;

    /* JADX INFO: renamed from: c */
    public int f55377c;

    /* JADX INFO: renamed from: d */
    @yfb
    public zsg f55378d;

    /* JADX INFO: renamed from: e */
    public int f55379e;

    /* JADX INFO: renamed from: f */
    public boolean f55380f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final List<lw4> f55381g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f55382h = true;

    public kud(@yfb zsg zsgVar, @yfb p38 p38Var, boolean z) {
        this.f55375a = p38Var;
        this.f55376b = z;
        this.f55378d = zsgVar;
    }

    private final void addEditCommandWithBatch(lw4 lw4Var) {
        beginBatchEditInternal();
        try {
            this.f55381g.add(lw4Var);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.f55377c++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i = this.f55377c - 1;
        this.f55377c = i;
        if (i == 0 && !this.f55381g.isEmpty()) {
            this.f55375a.onEditCommands(v82.toMutableList((Collection) this.f55381g));
            this.f55381g.clear();
        }
        return this.f55377c > 0;
    }

    private final boolean ensureActive(ny6<bth> ny6Var) {
        boolean z = this.f55382h;
        if (z) {
            ny6Var.invoke();
        }
        return z;
    }

    private final void logDebug(String str) {
    }

    private final void sendSynthesizedKeyEvent(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.f55382h;
        return z ? beginBatchEditInternal() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.f55382h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f55381g.clear();
        this.f55377c = 0;
        this.f55382h = false;
        this.f55375a.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@gib CompletionInfo completionInfo) {
        boolean z = this.f55382h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@yfb InputContentInfo inputContentInfo, int i, @gib Bundle bundle) {
        boolean z = this.f55382h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@gib CorrectionInfo correctionInfo) {
        boolean z = this.f55382h;
        return z ? this.f55376b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@gib CharSequence charSequence, int i) {
        boolean z = this.f55382h;
        if (z) {
            addEditCommandWithBatch(new ac2(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f55382h;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new f54(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f55382h;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new g54(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.f55382h;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new ew5());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.f55376b;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.f55378d.getText(), jvg.m30591getMinimpl(this.f55378d.m33527getSelectiond9O1mEE()), i);
    }

    @yfb
    public final p38 getEventCallback() {
        return this.f55375a;
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public ExtractedText getExtractedText(@gib ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f55380f = z;
        if (z) {
            this.f55379e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return e48.toExtractedText(this.f55378d);
    }

    @Override // android.view.inputmethod.InputConnection
    @gib
    public Handler getHandler() {
        return null;
    }

    @yfb
    public final zsg getMTextFieldValue$ui_release() {
        return this.f55378d;
    }

    @Override // android.view.inputmethod.InputConnection
    @gib
    public CharSequence getSelectedText(int i) {
        if (jvg.m30587getCollapsedimpl(this.f55378d.m33527getSelectiond9O1mEE())) {
            return null;
        }
        return atg.getSelectedText(this.f55378d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public CharSequence getTextAfterCursor(int i, int i2) {
        return atg.getTextAfterSelection(this.f55378d, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return atg.getTextBeforeSelection(this.f55378d, i).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.f55382h;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new s6f(0, this.f55378d.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(MediaPlayer.Event.ESDeleted);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int iM31081getDefaulteUduSuo;
        boolean z = this.f55382h;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    iM31081getDefaulteUduSuo = mw7.f62552b.m31083getGoeUduSuo();
                    break;
                case 3:
                    iM31081getDefaulteUduSuo = mw7.f62552b.m31087getSearcheUduSuo();
                    break;
                case 4:
                    iM31081getDefaulteUduSuo = mw7.f62552b.m31088getSendeUduSuo();
                    break;
                case 5:
                    iM31081getDefaulteUduSuo = mw7.f62552b.m31084getNexteUduSuo();
                    break;
                case 6:
                    iM31081getDefaulteUduSuo = mw7.f62552b.m31082getDoneeUduSuo();
                    break;
                case 7:
                    iM31081getDefaulteUduSuo = mw7.f62552b.m31086getPreviouseUduSuo();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                    iM31081getDefaulteUduSuo = mw7.f62552b.m31081getDefaulteUduSuo();
                    break;
            }
        } else {
            iM31081getDefaulteUduSuo = mw7.f62552b.m31081getDefaulteUduSuo();
        }
        this.f55375a.mo31718onImeActionKlQnJC8(iM31081getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@gib String str, @gib Bundle bundle) {
        boolean z = this.f55382h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.f55382h;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (i & 1) != 0;
        boolean z8 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            boolean z9 = (i & 16) != 0;
            boolean z10 = (i & 8) != 0;
            boolean z11 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z6 = true;
            }
            if (z9 || z10 || z11 || z6) {
                z2 = z6;
                z = z11;
                z4 = z10;
                z3 = z9;
            } else if (i2 >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z6;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        this.f55375a.onRequestCursorAnchorInfo(z7, z8, z3, z4, z, z2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@yfb KeyEvent keyEvent) {
        boolean z = this.f55382h;
        if (!z) {
            return z;
        }
        this.f55375a.onKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.f55382h;
        if (z) {
            addEditCommandWithBatch(new j6f(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@gib CharSequence charSequence, int i) {
        boolean z = this.f55382h;
        if (z) {
            addEditCommandWithBatch(new k6f(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final void setMTextFieldValue$ui_release(@yfb zsg zsgVar) {
        this.f55378d = zsgVar;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.f55382h;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new s6f(i, i2));
        return true;
    }

    public final void updateInputState(@yfb zsg zsgVar, @yfb u38 u38Var) {
        if (this.f55382h) {
            setMTextFieldValue$ui_release(zsgVar);
            if (this.f55380f) {
                u38Var.updateExtractedText(this.f55379e, e48.toExtractedText(zsgVar));
            }
            jvg jvgVarM33526getCompositionMzsxiRA = zsgVar.m33526getCompositionMzsxiRA();
            int iM30591getMinimpl = jvgVarM33526getCompositionMzsxiRA != null ? jvg.m30591getMinimpl(jvgVarM33526getCompositionMzsxiRA.m30597unboximpl()) : -1;
            jvg jvgVarM33526getCompositionMzsxiRA2 = zsgVar.m33526getCompositionMzsxiRA();
            u38Var.updateSelection(jvg.m30591getMinimpl(zsgVar.m33527getSelectiond9O1mEE()), jvg.m30590getMaximpl(zsgVar.m33527getSelectiond9O1mEE()), iM30591getMinimpl, jvgVarM33526getCompositionMzsxiRA2 != null ? jvg.m30590getMaximpl(jvgVarM33526getCompositionMzsxiRA2.m30597unboximpl()) : -1);
        }
    }
}
