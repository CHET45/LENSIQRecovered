package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class mq8 {
    /* JADX INFO: renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m31038cancelsTextSelectionZmokQxo(@yfb KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && nq8.m31182equalsimpl0(oq8.m31587getTypeZmokQxo(keyEvent), nq8.f65270b.m31187getKeyUpCS__XNY());
    }

    public static final void showCharacterPalette() {
    }
}
