package p000;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.videolan.libvlc.MediaPlayer;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n1#1,570:1\n109#1,5:571\n109#1,5:576\n109#1,5:581\n109#1,5:586\n109#1,5:591\n109#1,5:596\n109#1,5:601\n109#1,5:606\n109#1,5:611\n109#1,5:616\n109#1,5:621\n109#1,5:626\n109#1,5:631\n109#1,5:636\n109#1,5:641\n109#1,5:646\n109#1,5:651\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n166#1:571,5\n201#1:576,5\n206#1:581,5\n212#1:586,5\n220#1:591,5\n231#1:596,5\n237#1:601,5\n243#1:606,5\n249#1:611,5\n284#1:616,5\n367#1:621,5\n393#1:626,5\n451#1:631,5\n461#1:636,5\n473#1:641,5\n493#1:646,5\n502#1:651,5\n*E\n"})
@e0g(parameters = 0)
public final class jud implements InputConnection {

    /* JADX INFO: renamed from: l */
    public static final int f51964l = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final q38 f51965a;

    /* JADX INFO: renamed from: b */
    public final boolean f51966b;

    /* JADX INFO: renamed from: c */
    @gib
    public final z39 f51967c;

    /* JADX INFO: renamed from: d */
    @gib
    public final osg f51968d;

    /* JADX INFO: renamed from: e */
    @gib
    public final u8i f51969e;

    /* JADX INFO: renamed from: f */
    public int f51970f;

    /* JADX INFO: renamed from: g */
    @yfb
    public zsg f51971g;

    /* JADX INFO: renamed from: h */
    public int f51972h;

    /* JADX INFO: renamed from: i */
    public boolean f51973i;

    /* JADX INFO: renamed from: j */
    @yfb
    public final List<lw4> f51974j;

    /* JADX INFO: renamed from: k */
    public boolean f51975k;

    /* JADX INFO: renamed from: jud$a */
    public static final class C8099a extends tt8 implements qy6<lw4, bth> {
        public C8099a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(lw4 lw4Var) {
            invoke2(lw4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb lw4 lw4Var) {
            jud.this.addEditCommandWithBatch(lw4Var);
        }
    }

    public jud(@yfb zsg zsgVar, @yfb q38 q38Var, boolean z, @gib z39 z39Var, @gib osg osgVar, @gib u8i u8iVar) {
        this.f51965a = q38Var;
        this.f51966b = z;
        this.f51967c = z39Var;
        this.f51968d = osgVar;
        this.f51969e = u8iVar;
        this.f51971g = zsgVar;
        this.f51974j = new ArrayList();
        this.f51975k = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEditCommandWithBatch(lw4 lw4Var) {
        beginBatchEditInternal();
        try {
            this.f51974j.add(lw4Var);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.f51970f++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i = this.f51970f - 1;
        this.f51970f = i;
        if (i == 0 && !this.f51974j.isEmpty()) {
            this.f51965a.onEditCommands(v82.toMutableList((Collection) this.f51974j));
            this.f51974j.clear();
        }
        return this.f51970f > 0;
    }

    private final boolean ensureActive(ny6<bth> ny6Var) {
        boolean z = this.f51975k;
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
        boolean z = this.f51975k;
        return z ? beginBatchEditInternal() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.f51975k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f51974j.clear();
        this.f51970f = 0;
        this.f51975k = false;
        this.f51965a.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@gib CompletionInfo completionInfo) {
        boolean z = this.f51975k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@yfb InputContentInfo inputContentInfo, int i, @gib Bundle bundle) {
        boolean z = this.f51975k;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@gib CorrectionInfo correctionInfo) {
        boolean z = this.f51975k;
        return z ? this.f51966b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@gib CharSequence charSequence, int i) {
        boolean z = this.f51975k;
        if (z) {
            addEditCommandWithBatch(new ac2(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.f51975k;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new f54(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.f51975k;
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
        boolean z = this.f51975k;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new ew5());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.f51966b;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.f51971g.getText(), jvg.m30591getMinimpl(this.f51971g.m33527getSelectiond9O1mEE()), i);
    }

    @yfb
    public final q38 getEventCallback() {
        return this.f51965a;
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public ExtractedText getExtractedText(@gib ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f51973i = z;
        if (z) {
            this.f51972h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return mud.toExtractedText(this.f51971g);
    }

    @Override // android.view.inputmethod.InputConnection
    @gib
    public Handler getHandler() {
        return null;
    }

    @gib
    public final z39 getLegacyTextFieldState() {
        return this.f51967c;
    }

    @Override // android.view.inputmethod.InputConnection
    @gib
    public CharSequence getSelectedText(int i) {
        if (jvg.m30587getCollapsedimpl(this.f51971g.m33527getSelectiond9O1mEE())) {
            return null;
        }
        return atg.getSelectedText(this.f51971g).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public CharSequence getTextAfterCursor(int i, int i2) {
        return atg.getTextAfterSelection(this.f51971g, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return atg.getTextBeforeSelection(this.f51971g, i).toString();
    }

    @gib
    public final osg getTextFieldSelectionManager() {
        return this.f51968d;
    }

    @yfb
    public final zsg getTextFieldValue$foundation_release() {
        return this.f51971g;
    }

    @gib
    public final u8i getViewConfiguration() {
        return this.f51969e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.f51975k;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new s6f(0, this.f51971g.getText().length()));
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
        boolean z = this.f51975k;
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
        this.f51965a.mo27185onImeActionKlQnJC8(iM31081getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(@yfb HandwritingGesture handwritingGesture, @gib Executor executor, @gib IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            y00.f99812a.performHandwritingGesture(this.f51967c, this.f51968d, handwritingGesture, this.f51969e, executor, intConsumer, new C8099a());
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@gib String str, @gib Bundle bundle) {
        boolean z = this.f51975k;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(@yfb PreviewableHandwritingGesture previewableHandwritingGesture, @gib CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return y00.f99812a.previewHandwritingGesture(this.f51967c, this.f51968d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
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
        boolean z5 = this.f51975k;
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
        this.f51965a.onRequestCursorAnchorInfo(z7, z8, z3, z4, z, z2);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@yfb KeyEvent keyEvent) {
        boolean z = this.f51975k;
        if (!z) {
            return z;
        }
        this.f51965a.onKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.f51975k;
        if (z) {
            addEditCommandWithBatch(new j6f(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@gib CharSequence charSequence, int i) {
        boolean z = this.f51975k;
        if (z) {
            addEditCommandWithBatch(new k6f(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.f51975k;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new s6f(i, i2));
        return true;
    }

    public final void setTextFieldValue$foundation_release(@yfb zsg zsgVar) {
        this.f51971g = zsgVar;
    }

    public final void updateInputState(@yfb zsg zsgVar, @yfb v38 v38Var) {
        if (this.f51975k) {
            setTextFieldValue$foundation_release(zsgVar);
            if (this.f51973i) {
                v38Var.updateExtractedText(this.f51972h, mud.toExtractedText(zsgVar));
            }
            jvg jvgVarM33526getCompositionMzsxiRA = zsgVar.m33526getCompositionMzsxiRA();
            int iM30591getMinimpl = jvgVarM33526getCompositionMzsxiRA != null ? jvg.m30591getMinimpl(jvgVarM33526getCompositionMzsxiRA.m30597unboximpl()) : -1;
            jvg jvgVarM33526getCompositionMzsxiRA2 = zsgVar.m33526getCompositionMzsxiRA();
            v38Var.updateSelection(jvg.m30591getMinimpl(zsgVar.m33527getSelectiond9O1mEE()), jvg.m30590getMaximpl(zsgVar.m33527getSelectiond9O1mEE()), iM30591getMinimpl, jvgVarM33526getCompositionMzsxiRA2 != null ? jvg.m30590getMaximpl(jvgVarM33526getCompositionMzsxiRA2.m30597unboximpl()) : -1);
        }
    }

    public /* synthetic */ jud(zsg zsgVar, q38 q38Var, boolean z, z39 z39Var, osg osgVar, u8i u8iVar, int i, jt3 jt3Var) {
        this(zsgVar, q38Var, z, (i & 8) != 0 ? null : z39Var, (i & 16) != 0 ? null : osgVar, (i & 32) != 0 ? null : u8iVar);
    }
}
