package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class oq8 {
    /* JADX INFO: renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m31586getKeyZmokQxo(@yfb KeyEvent keyEvent) {
        return pr8.Key(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m31587getTypeZmokQxo(@yfb KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? nq8.f65270b.m31188getUnknownCS__XNY() : nq8.f65270b.m31187getKeyUpCS__XNY() : nq8.f65270b.m31186getKeyDownCS__XNY();
    }

    /* JADX INFO: renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m31588getUtf16CodePointZmokQxo(@yfb KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* JADX INFO: renamed from: isAltPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m31589isAltPressedZmokQxo(@yfb KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* JADX INFO: renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m31590isCtrlPressedZmokQxo(@yfb KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* JADX INFO: renamed from: isMetaPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m31591isMetaPressedZmokQxo(@yfb KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    /* JADX INFO: renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m31592isShiftPressedZmokQxo(@yfb KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
