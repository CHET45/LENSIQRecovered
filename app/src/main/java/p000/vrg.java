package p000;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.C0714c;
import androidx.compose.p002ui.input.key.C0743a;

/* JADX INFO: loaded from: classes.dex */
public final class vrg {

    /* JADX INFO: renamed from: vrg$a */
    public static final class C14239a extends tt8 implements qy6<kq8, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ um6 f92112a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z39 f92113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14239a(um6 um6Var, z39 z39Var) {
            super(1);
            this.f92112a = um6Var;
            this.f92113b = z39Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ Boolean invoke(kq8 kq8Var) {
            return m32814invokeZmokQxo(kq8Var.m30741unboximpl());
        }

        @yfb
        /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
        public final Boolean m32814invokeZmokQxo(@yfb KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zMo27519moveFocus3ESFkO8 = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && nq8.m31182equalsimpl0(oq8.m31587getTypeZmokQxo(keyEvent), nq8.f65270b.m31186getKeyDownCS__XNY()) && keyEvent.getSource() != 257) {
                if (vrg.m32813isKeyCodeYhN2O0w(keyEvent, 19)) {
                    zMo27519moveFocus3ESFkO8 = this.f92112a.mo27519moveFocus3ESFkO8(C0714c.f5215b.m27541getUpdhqQ8s());
                } else if (vrg.m32813isKeyCodeYhN2O0w(keyEvent, 20)) {
                    zMo27519moveFocus3ESFkO8 = this.f92112a.mo27519moveFocus3ESFkO8(C0714c.f5215b.m27534getDowndhqQ8s());
                } else if (vrg.m32813isKeyCodeYhN2O0w(keyEvent, 21)) {
                    zMo27519moveFocus3ESFkO8 = this.f92112a.mo27519moveFocus3ESFkO8(C0714c.f5215b.m27537getLeftdhqQ8s());
                } else if (vrg.m32813isKeyCodeYhN2O0w(keyEvent, 22)) {
                    zMo27519moveFocus3ESFkO8 = this.f92112a.mo27519moveFocus3ESFkO8(C0714c.f5215b.m27540getRightdhqQ8s());
                } else if (vrg.m32813isKeyCodeYhN2O0w(keyEvent, 23)) {
                    suf keyboardController = this.f92113b.getKeyboardController();
                    if (keyboardController != null) {
                        keyboardController.show();
                    }
                    zMo27519moveFocus3ESFkO8 = true;
                }
            }
            return Boolean.valueOf(zMo27519moveFocus3ESFkO8);
        }
    }

    @yfb
    public static final InterfaceC0701e interceptDPadAndMoveFocus(@yfb InterfaceC0701e interfaceC0701e, @yfb z39 z39Var, @yfb um6 um6Var) {
        return C0743a.onPreviewKeyEvent(interfaceC0701e, new C14239a(um6Var, z39Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m32813isKeyCodeYhN2O0w(KeyEvent keyEvent, int i) {
        return pr8.m31866getNativeKeyCodeYVgTNJs(oq8.m31586getKeyZmokQxo(keyEvent)) == i;
    }
}
