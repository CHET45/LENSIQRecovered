package p000;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi21\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
public class jl2 extends il2 {

    /* JADX INFO: renamed from: d */
    @gib
    public BaseInputConnection f51102d;

    public jl2(@yfb View view) {
        super(view);
    }

    @Override // p000.hl2
    public void sendKeyEvent(@yfb KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.f51102d;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(m13160a(), false);
            this.f51102d = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}
