package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class csg {
    /* JADX INFO: renamed from: isTypedEvent-ZmokQxo, reason: not valid java name */
    public static final boolean m28542isTypedEventZmokQxo(@yfb KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
