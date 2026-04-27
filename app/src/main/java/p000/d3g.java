package p000;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.videolan.libvlc.MediaPlayer;
import p000.l38;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,583:1\n1208#2:584\n1187#2,2:585\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection\n*L\n100#1:584\n100#1:585,2\n*E\n"})
@e0g(parameters = 0)
public final class d3g implements InputConnection {

    /* JADX INFO: renamed from: f */
    public static final int f28349f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final ztg f28350a;

    /* JADX INFO: renamed from: b */
    public int f28351b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final f7b<qy6<qw4, bth>> f28352c = new f7b<>(new qy6[16], 0);

    /* JADX INFO: renamed from: d */
    @yfb
    public final C4610k f28353d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final InputConnection f28354e;

    /* JADX INFO: renamed from: d3g$a */
    public static final class C4600a implements l38.InterfaceC8602d {
        public C4600a() {
        }

        @Override // p000.l38.InterfaceC8602d
        public boolean onCommitContent(@yfb m38 m38Var, int i, @gib Bundle bundle) {
            if ((i & 1) != 0) {
                try {
                    m38Var.requestPermission();
                    Object objUnwrap = m38Var.unwrap();
                    md8.checkNotNull(objUnwrap, "null cannot be cast to non-null type android.os.Parcelable");
                    Parcelable parcelable = (Parcelable) objUnwrap;
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable(e3g.f31672d, parcelable);
                } catch (Exception e) {
                    d3g.this.logDebug("Can't insert content from IME; requestPermission() failed, " + e);
                    return false;
                }
            }
            return d3g.this.f28350a.onCommitContent(e3g.toTransferableContent(m38Var, bundle));
        }
    }

    /* JADX INFO: renamed from: d3g$b */
    public static final class C4601b extends tt8 implements qy6<qw4, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f28356a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28357b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4601b(CharSequence charSequence, int i) {
            super(1);
            this.f28356a = charSequence;
            this.f28357b = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(qw4 qw4Var) {
            invoke2(qw4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb qw4 qw4Var) {
            nw4.commitText(qw4Var, String.valueOf(this.f28356a), this.f28357b);
        }
    }

    /* JADX INFO: renamed from: d3g$c */
    public static final class C4602c extends tt8 implements qy6<qw4, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f28358a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28359b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4602c(int i, int i2) {
            super(1);
            this.f28358a = i;
            this.f28359b = i2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(qw4 qw4Var) {
            invoke2(qw4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb qw4 qw4Var) {
            nw4.deleteSurroundingText(qw4Var, this.f28358a, this.f28359b);
        }
    }

    /* JADX INFO: renamed from: d3g$d */
    public static final class C4603d extends tt8 implements qy6<qw4, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f28360a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4603d(int i, int i2) {
            super(1);
            this.f28360a = i;
            this.f28361b = i2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(qw4 qw4Var) {
            invoke2(qw4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb qw4 qw4Var) {
            nw4.deleteSurroundingTextInCodePoints(qw4Var, this.f28360a, this.f28361b);
        }
    }

    /* JADX INFO: renamed from: d3g$e */
    @dwf({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection$endBatchEditInternal$1\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,583:1\n460#2,11:584\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection$endBatchEditInternal$1\n*L\n227#1:584,11\n*E\n"})
    public static final class C4604e extends tt8 implements qy6<qw4, bth> {
        public C4604e() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(qw4 qw4Var) {
            invoke2(qw4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb qw4 qw4Var) {
            f7b f7bVar = d3g.this.f28352c;
            int size = f7bVar.getSize();
            if (size > 0) {
                Object[] content = f7bVar.getContent();
                int i = 0;
                do {
                    ((qy6) content[i]).invoke(qw4Var);
                    i++;
                } while (i < size);
            }
        }
    }

    /* JADX INFO: renamed from: d3g$f */
    public static final class C4605f extends tt8 implements qy6<qw4, bth> {

        /* JADX INFO: renamed from: a */
        public static final C4605f f28363a = new C4605f();

        public C4605f() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(qw4 qw4Var) {
            invoke2(qw4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb qw4 qw4Var) {
            nw4.finishComposingText(qw4Var);
        }
    }

    /* JADX INFO: renamed from: d3g$g */
    public static final class C4606g extends tt8 implements qy6<qw4, bth> {
        public C4606g() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(qw4 qw4Var) {
            invoke2(qw4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb qw4 qw4Var) {
            qw4Var.setSelection(0, d3g.this.getText().length());
        }
    }

    /* JADX INFO: renamed from: d3g$h */
    public static final class C4607h extends tt8 implements qy6<qw4, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f28365a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28366b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4607h(int i, int i2) {
            super(1);
            this.f28365a = i;
            this.f28366b = i2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(qw4 qw4Var) {
            invoke2(qw4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb qw4 qw4Var) {
            nw4.setComposingRegion(qw4Var, this.f28365a, this.f28366b);
        }
    }

    /* JADX INFO: renamed from: d3g$i */
    public static final class C4608i extends tt8 implements qy6<qw4, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f28367a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28368b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4608i(CharSequence charSequence, int i) {
            super(1);
            this.f28367a = charSequence;
            this.f28368b = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(qw4 qw4Var) {
            invoke2(qw4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb qw4 qw4Var) {
            nw4.setComposingText(qw4Var, String.valueOf(this.f28367a), this.f28368b);
        }
    }

    /* JADX INFO: renamed from: d3g$j */
    public static final class C4609j extends tt8 implements qy6<qw4, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f28369a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f28370b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4609j(int i, int i2) {
            super(1);
            this.f28369a = i;
            this.f28370b = i2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(qw4 qw4Var) {
            invoke2(qw4Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb qw4 qw4Var) {
            qw4Var.setSelection(this.f28369a, this.f28370b);
        }
    }

    /* JADX INFO: renamed from: d3g$k */
    public static final class C4610k extends InputConnectionWrapper {
        public C4610k(d3g d3gVar) {
            super(d3gVar, false);
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(@yfb InputContentInfo inputContentInfo, int i, @gib Bundle bundle) {
            return false;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(@gib String str, @gib Bundle bundle) {
            return true;
        }
    }

    public d3g(@yfb ztg ztgVar, @yfb EditorInfo editorInfo) {
        this.f28350a = ztgVar;
        C4610k c4610k = new C4610k(this);
        this.f28353d = c4610k;
        this.f28354e = l38.createWrapper(c4610k, editorInfo, new C4600a());
    }

    private final void addEditCommandWithBatch(qy6<? super qw4, bth> qy6Var) {
        beginBatchEditInternal();
        try {
            this.f28352c.add(qy6Var);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.f28351b++;
        return true;
    }

    private final boolean endBatchEditInternal() {
        int i = this.f28351b - 1;
        this.f28351b = i;
        if (i == 0 && this.f28352c.isNotEmpty()) {
            this.f28350a.requestEdit(new C4604e());
            this.f28352c.clear();
        }
        return this.f28351b > 0;
    }

    private static /* synthetic */ void getCommitContentDelegateInputConnection$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jrg getText() {
        return this.f28350a.getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDebug(String str) {
    }

    private final void sendSynthesizedKeyEvent(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        logDebug("beginBatchEdit()");
        return beginBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        logDebug("clearMetaKeyStates(" + i + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        logDebug("closeConnection()");
        this.f28352c.clear();
        this.f28351b = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@gib CompletionInfo completionInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("commitCompletion(");
        sb.append((Object) (completionInfo != null ? completionInfo.getText() : null));
        sb.append(')');
        logDebug(sb.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(@yfb InputContentInfo inputContentInfo, int i, @gib Bundle bundle) {
        logDebug("commitContent(" + inputContentInfo + ", " + i + ", " + bundle + ')');
        return k00.f52312a.commitContent(this.f28354e, inputContentInfo, i, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@gib CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(@gib CharSequence charSequence, int i) {
        logDebug("commitText(\"" + ((Object) charSequence) + "\", " + i + ')');
        addEditCommandWithBatch(new C4601b(charSequence, i));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        logDebug("deleteSurroundingText(" + i + ", " + i2 + ')');
        addEditCommandWithBatch(new C4602c(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        logDebug("deleteSurroundingTextInCodePoints(" + i + ", " + i2 + ')');
        addEditCommandWithBatch(new C4603d(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        logDebug("endBatchEdit()");
        return endBatchEditInternal();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        logDebug("finishComposingText()");
        addEditCommandWithBatch(C4605f.f28363a);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        logDebug("getCursorCapsMode(" + i + ')');
        return TextUtils.getCapsMode(getText(), jvg.m30591getMinimpl(getText().m30568getSelectiond9O1mEE()), i);
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public ExtractedText getExtractedText(@gib ExtractedTextRequest extractedTextRequest, int i) {
        logDebug("getExtractedText(" + extractedTextRequest + ", " + i + ')');
        return e3g.toExtractedText(getText());
    }

    @Override // android.view.inputmethod.InputConnection
    @gib
    public Handler getHandler() {
        logDebug("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @gib
    public CharSequence getSelectedText(int i) {
        String string = jvg.m30587getCollapsedimpl(getText().m30568getSelectiond9O1mEE()) ? null : krg.getSelectedText(getText()).toString();
        logDebug("getSelectedText(" + i + "): " + ((Object) string));
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public CharSequence getTextAfterCursor(int i, int i2) {
        String string = krg.getTextAfterSelection(getText(), i).toString();
        logDebug("getTextAfterCursor(" + i + ", " + i2 + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    @yfb
    public CharSequence getTextBeforeCursor(int i, int i2) {
        String string = krg.getTextBeforeSelection(getText(), i).toString();
        logDebug("getTextBeforeCursor(" + i + ", " + i2 + "): " + string);
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        logDebug("performContextMenuAction(" + i + ')');
        switch (i) {
            case R.id.selectAll:
                addEditCommandWithBatch(new C4606g());
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
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int iM31081getDefaulteUduSuo;
        logDebug("performEditorAction(" + i + ')');
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
                    logDebug("IME sent an unrecognized editor action: " + i);
                    iM31081getDefaulteUduSuo = mw7.f62552b.m31081getDefaulteUduSuo();
                    break;
            }
        } else {
            iM31081getDefaulteUduSuo = mw7.f62552b.m31081getDefaulteUduSuo();
        }
        this.f28350a.mo30777onImeActionKlQnJC8(iM31081getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(@yfb HandwritingGesture handwritingGesture, @gib Executor executor, @gib IntConsumer intConsumer) {
        logDebug("performHandwritingGesture(" + handwritingGesture + ", " + executor + ", " + intConsumer + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        a10.f93a.performHandwritingGesture(this.f28350a, handwritingGesture, executor, intConsumer);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@gib String str, @gib Bundle bundle) {
        logDebug("performPrivateCommand(" + str + ", " + bundle + ')');
        return this.f28354e.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(@yfb PreviewableHandwritingGesture previewableHandwritingGesture, @gib CancellationSignal cancellationSignal) {
        logDebug("previewHandwritingGesture(" + previewableHandwritingGesture + ", " + cancellationSignal + ')');
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return a10.f93a.previewHandwritingGesture(this.f28350a, previewableHandwritingGesture, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        logDebug("reportFullscreenMode(" + z + ')');
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        logDebug("requestCursorUpdates(" + i + ')');
        this.f28350a.requestCursorUpdates(i);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@yfb KeyEvent keyEvent) {
        logDebug("sendKeyEvent(" + keyEvent + ')');
        this.f28350a.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        logDebug("setComposingRegion(" + i + ", " + i2 + ')');
        addEditCommandWithBatch(new C4607h(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(@gib CharSequence charSequence, int i) {
        logDebug("setComposingText(\"" + ((Object) charSequence) + "\", " + i + ')');
        addEditCommandWithBatch(new C4608i(charSequence, i));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        logDebug("setSelection(" + i + ", " + i2 + ')');
        addEditCommandWithBatch(new C4609j(i, i2));
        return true;
    }
}
