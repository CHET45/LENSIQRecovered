package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public interface cbe {
    @q64(message = "Use PlatformTextInputModifierNode instead.")
    static /* synthetic */ void getTextInputService$annotations() {
    }

    @ug5
    default void forceAccessibilityForTesting(boolean z) {
    }

    @yfb
    c64 getDensity();

    @yfb
    xxe getSemanticsOwner();

    @yfb
    stg getTextInputService();

    @ug5
    default void measureAndLayoutForTest() {
    }

    /* JADX INFO: renamed from: sendKeyEvent-ZmokQxo */
    boolean mo27746sendKeyEventZmokQxo(@yfb KeyEvent keyEvent);

    @ug5
    default void setAccessibilityEventBatchIntervalMillis(long j) {
    }
}
