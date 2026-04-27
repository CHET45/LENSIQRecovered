package p000;

import android.view.inputmethod.EditorInfo;
import p000.mw7;
import p000.vr8;
import p000.xr8;

/* JADX INFO: loaded from: classes.dex */
public final class fx4 {
    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m29677updatepLxbY9I(@yfb EditorInfo editorInfo, @yfb CharSequence charSequence, long j, @yfb nw7 nw7Var, @gib String[] strArr) {
        String privateImeOptions;
        int iM31264getImeActioneUduSuo = nw7Var.m31264getImeActioneUduSuo();
        mw7.C9571a c9571a = mw7.f62552b;
        int i = 3;
        int i2 = 6;
        if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31081getDefaulteUduSuo())) {
            if (!nw7Var.getSingleLine()) {
                i2 = 0;
            }
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31085getNoneeUduSuo())) {
            i2 = 1;
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31083getGoeUduSuo())) {
            i2 = 2;
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31084getNexteUduSuo())) {
            i2 = 5;
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31086getPreviouseUduSuo())) {
            i2 = 7;
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31087getSearcheUduSuo())) {
            i2 = 3;
        } else if (mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31088getSendeUduSuo())) {
            i2 = 4;
        } else if (!mw7.m31068equalsimpl0(iM31264getImeActioneUduSuo, c9571a.m31082getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i2;
        bxc platformImeOptions = nw7Var.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        cf9.f16418a.setHintLocales(editorInfo, nw7Var.getHintLocales());
        int iM31265getKeyboardTypePjHm6EE = nw7Var.m31265getKeyboardTypePjHm6EE();
        xr8.C15260a c15260a = xr8.f99029b;
        if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33262getTextPjHm6EE())) {
            i = 1;
        } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33255getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i = 1;
        } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33258getNumberPjHm6EE())) {
            i = 2;
        } else if (!xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33261getPhonePjHm6EE())) {
            if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33264getUriPjHm6EE())) {
                i = 17;
            } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33257getEmailPjHm6EE())) {
                i = 33;
            } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33260getPasswordPjHm6EE())) {
                i = 129;
            } else if (xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33259getNumberPasswordPjHm6EE())) {
                i = 18;
            } else {
                if (!xr8.m33241equalsimpl0(iM31265getKeyboardTypePjHm6EE, c15260a.m33256getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                i = 8194;
            }
        }
        editorInfo.inputType = i;
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
        editorInfo.initialSelStart = jvg.m30593getStartimpl(j);
        editorInfo.initialSelEnd = jvg.m30588getEndimpl(j);
        ex4.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            ex4.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (!ccg.isStylusHandwritingSupported() || xr8.m33241equalsimpl0(nw7Var.m31265getKeyboardTypePjHm6EE(), c15260a.m33260getPasswordPjHm6EE()) || xr8.m33241equalsimpl0(nw7Var.m31265getKeyboardTypePjHm6EE(), c15260a.m33259getNumberPasswordPjHm6EE())) {
            ex4.setStylusHandwritingEnabled(editorInfo, false);
        } else {
            ex4.setStylusHandwritingEnabled(editorInfo, true);
            dx4.f31225a.setHandwritingGestures(editorInfo);
        }
    }

    /* JADX INFO: renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m29678updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j, nw7 nw7Var, String[] strArr, int i, Object obj) {
        if ((i & 8) != 0) {
            strArr = null;
        }
        m29677updatepLxbY9I(editorInfo, charSequence, j, nw7Var, strArr);
    }
}
