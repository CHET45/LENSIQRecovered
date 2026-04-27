package p000;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
@c5e(24)
public class kl2 extends jl2 {
    public kl2(@yfb View view) {
        super(view);
    }

    @Override // p000.jl2, p000.hl2
    public void sendKeyEvent(@yfb KeyEvent keyEvent) {
        m13161b().dispatchKeyEventFromInputMethod(m13160a(), keyEvent);
    }
}
