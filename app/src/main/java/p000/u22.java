package p000;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class u22 {

    /* JADX INFO: renamed from: a */
    public static final long f86577a = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return f86577a;
    }

    /* JADX INFO: renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m32525isClickZmokQxo(@yfb KeyEvent keyEvent) {
        return nq8.m31182equalsimpl0(oq8.m31587getTypeZmokQxo(keyEvent), nq8.f65270b.m31187getKeyUpCS__XNY()) && m32526isEnterZmokQxo(keyEvent);
    }

    public static final boolean isComposeRootInScrollableContainer(@yfb v34 v34Var) {
        return isInScrollableViewGroup(x34.requireView(v34Var));
    }

    /* JADX INFO: renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m32526isEnterZmokQxo(KeyEvent keyEvent) {
        int iM31866getNativeKeyCodeYVgTNJs = pr8.m31866getNativeKeyCodeYVgTNJs(oq8.m31586getKeyZmokQxo(keyEvent));
        return iM31866getNativeKeyCodeYVgTNJs == 23 || iM31866getNativeKeyCodeYVgTNJs == 66 || iM31866getNativeKeyCodeYVgTNJs == 160;
    }

    private static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX INFO: renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m32527isPressZmokQxo(@yfb KeyEvent keyEvent) {
        return nq8.m31182equalsimpl0(oq8.m31587getTypeZmokQxo(keyEvent), nq8.f65270b.m31186getKeyDownCS__XNY()) && m32526isEnterZmokQxo(keyEvent);
    }
}
