package p000;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.C1035c;
import java.util.concurrent.Executor;
import p000.mw7;
import p000.vr8;
import p000.xr8;

/* JADX INFO: loaded from: classes.dex */
public final class xtg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f99249a = "TextInputServiceAndroid";

    @yfb
    public static final Executor asExecutor(@yfb final Choreographer choreographer) {
        return new Executor() { // from class: wtg
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                xtg.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: vtg
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final void update(@yfb EditorInfo editorInfo, @yfb nw7 nw7Var, @yfb zsg zsgVar) {
        String privateImeOptions;
        int iM31264getImeActioneUduSuo = nw7Var.m31264getImeActioneUduSuo();
        mw7.C9571a c9571a = mw7.f62552b;
        int i = 6;
        if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31081getDefaulteUduSuo())) {
            if (!nw7Var.getSingleLine()) {
                i = 0;
            }
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31085getNoneeUduSuo())) {
            i = 1;
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31083getGoeUduSuo())) {
            i = 2;
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31084getNexteUduSuo())) {
            i = 5;
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31086getPreviouseUduSuo())) {
            i = 7;
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31087getSearcheUduSuo())) {
            i = 3;
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31088getSendeUduSuo())) {
            i = 4;
        } else if (!mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31082getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i;
        bxc platformImeOptions = nw7Var.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int iM31265getKeyboardTypePjHm6EE = nw7Var.m31265getKeyboardTypePjHm6EE();
        xr8.C15260a c15260a = xr8.f99029b;
        if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33262getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33255getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33258getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33261getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33264getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33257getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33260getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33259getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33256getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!nw7Var.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (mw7.m31068equalsimpl0(nw7Var.m31264getImeActioneUduSuo(), c9571a.m31081getDefaulteUduSuo())) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int iM31263getCapitalizationIUNYP9k = nw7Var.m31263getCapitalizationIUNYP9k();
            vr8.C14227a c14227a = vr8.f92051b;
            if (vr8.m32798equalsimpl0(iM31263getCapitalizationIUNYP9k, c14227a.m32807getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (vr8.m32798equalsimpl0(iM31263getCapitalizationIUNYP9k, c14227a.m32811getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (vr8.m32798equalsimpl0(iM31263getCapitalizationIUNYP9k, c14227a.m32809getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (nw7Var.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = jvg.m30593getStartimpl(zsgVar.m33527getSelectiond9O1mEE());
        editorInfo.initialSelEnd = jvg.m30588getEndimpl(zsgVar.m33527getSelectiond9O1mEE());
        ex4.setInitialSurroundingText(editorInfo, zsgVar.getText());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (C1035c.isConfigured()) {
            C1035c.get().updateEditorInfo(editorInfo);
        }
    }
}
