package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class zrg {
    @yfb
    public static final yrg createTextFieldKeyEventHandler() {
        return new C7631iv();
    }

    /* JADX INFO: renamed from: isFromSoftKeyboard-ZmokQxo, reason: not valid java name */
    public static final boolean m33514isFromSoftKeyboardZmokQxo(@yfb KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m33515isKeyCodeYhN2O0w(KeyEvent keyEvent, int i) {
        return pr8.m31866getNativeKeyCodeYVgTNJs(oq8.m31586getKeyZmokQxo(keyEvent)) == i;
    }
}
