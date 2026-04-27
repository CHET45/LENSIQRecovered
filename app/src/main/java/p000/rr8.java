package p000;

import androidx.compose.p002ui.focus.C0714c;
import p000.mw7;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class rr8 implements sr8 {

    /* JADX INFO: renamed from: d */
    public static final int f79068d = 8;

    /* JADX INFO: renamed from: a */
    @gib
    public final suf f79069a;

    /* JADX INFO: renamed from: b */
    public tr8 f79070b;

    /* JADX INFO: renamed from: c */
    public um6 f79071c;

    public rr8(@gib suf sufVar) {
        this.f79069a = sufVar;
    }

    @Override // p000.sr8
    /* JADX INFO: renamed from: defaultKeyboardAction-KlQnJC8 */
    public void mo31989defaultKeyboardActionKlQnJC8(int i) {
        mw7.C9571a c9571a = mw7.f62552b;
        if (mw7.m31068equalsimpl0(i, c9571a.m31084getNexteUduSuo())) {
            getFocusManager().mo27519moveFocus3ESFkO8(C0714c.f5215b.m27538getNextdhqQ8s());
            return;
        }
        if (mw7.m31068equalsimpl0(i, c9571a.m31086getPreviouseUduSuo())) {
            getFocusManager().mo27519moveFocus3ESFkO8(C0714c.f5215b.m27539getPreviousdhqQ8s());
            return;
        }
        if (!mw7.m31068equalsimpl0(i, c9571a.m31082getDoneeUduSuo())) {
            if (mw7.m31068equalsimpl0(i, c9571a.m31083getGoeUduSuo()) ? true : mw7.m31068equalsimpl0(i, c9571a.m31087getSearcheUduSuo()) ? true : mw7.m31068equalsimpl0(i, c9571a.m31088getSendeUduSuo()) ? true : mw7.m31068equalsimpl0(i, c9571a.m31081getDefaulteUduSuo())) {
                return;
            }
            mw7.m31068equalsimpl0(i, c9571a.m31085getNoneeUduSuo());
        } else {
            suf sufVar = this.f79069a;
            if (sufVar != null) {
                sufVar.hide();
            }
        }
    }

    @yfb
    public final um6 getFocusManager() {
        um6 um6Var = this.f79071c;
        if (um6Var != null) {
            return um6Var;
        }
        md8.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    @yfb
    public final tr8 getKeyboardActions() {
        tr8 tr8Var = this.f79070b;
        if (tr8Var != null) {
            return tr8Var;
        }
        md8.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    /* JADX INFO: renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m32165runActionKlQnJC8(int i) {
        qy6<sr8, bth> onSend;
        mw7.C9571a c9571a = mw7.f62552b;
        bth bthVar = null;
        if (mw7.m31068equalsimpl0(i, c9571a.m31082getDoneeUduSuo())) {
            onSend = getKeyboardActions().getOnDone();
        } else if (mw7.m31068equalsimpl0(i, c9571a.m31083getGoeUduSuo())) {
            onSend = getKeyboardActions().getOnGo();
        } else if (mw7.m31068equalsimpl0(i, c9571a.m31084getNexteUduSuo())) {
            onSend = getKeyboardActions().getOnNext();
        } else if (mw7.m31068equalsimpl0(i, c9571a.m31086getPreviouseUduSuo())) {
            onSend = getKeyboardActions().getOnPrevious();
        } else if (mw7.m31068equalsimpl0(i, c9571a.m31087getSearcheUduSuo())) {
            onSend = getKeyboardActions().getOnSearch();
        } else if (mw7.m31068equalsimpl0(i, c9571a.m31088getSendeUduSuo())) {
            onSend = getKeyboardActions().getOnSend();
        } else {
            if (!(mw7.m31068equalsimpl0(i, c9571a.m31081getDefaulteUduSuo()) ? true : mw7.m31068equalsimpl0(i, c9571a.m31085getNoneeUduSuo()))) {
                throw new IllegalStateException("invalid ImeAction");
            }
            onSend = null;
        }
        if (onSend != null) {
            onSend.invoke(this);
            bthVar = bth.f14751a;
        }
        if (bthVar == null) {
            mo31989defaultKeyboardActionKlQnJC8(i);
        }
    }

    public final void setFocusManager(@yfb um6 um6Var) {
        this.f79071c = um6Var;
    }

    public final void setKeyboardActions(@yfb tr8 tr8Var) {
        this.f79070b = tr8Var;
    }
}
