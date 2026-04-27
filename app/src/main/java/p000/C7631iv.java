package p000;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.p002ui.focus.C0714c;

/* JADX INFO: renamed from: iv */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C7631iv extends yrg {

    /* JADX INFO: renamed from: e */
    public static final int f48536e = 0;

    @Override // p000.yrg
    /* JADX INFO: renamed from: onKeyEvent-6ptp14s, reason: not valid java name */
    public boolean mo30410onKeyEvent6ptp14s(@yfb KeyEvent keyEvent, @yfb jeh jehVar, @yfb lug lugVar, @yfb rsg rsgVar, boolean z, boolean z2, @yfb ny6<bth> ny6Var) {
        if (nq8.m31182equalsimpl0(oq8.m31587getTypeZmokQxo(keyEvent), nq8.f65270b.m31186getKeyDownCS__XNY()) && keyEvent.isFromSource(257) && !zrg.m33514isFromSoftKeyboardZmokQxo(keyEvent)) {
            rsgVar.setInTouchMode(false);
        }
        return super.mo30410onKeyEvent6ptp14s(keyEvent, jehVar, lugVar, rsgVar, z, z2, ny6Var);
    }

    @Override // p000.yrg
    /* JADX INFO: renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public boolean mo30411onPreKeyEventMyFupTE(@yfb KeyEvent keyEvent, @yfb jeh jehVar, @yfb rsg rsgVar, @yfb um6 um6Var, @yfb suf sufVar) {
        if (super.mo30411onPreKeyEventMyFupTE(keyEvent, jehVar, rsgVar, um6Var, sufVar)) {
            return true;
        }
        InputDevice device = keyEvent.getDevice();
        if (device != null && device.supportsSource(513) && !device.isVirtual() && nq8.m31182equalsimpl0(oq8.m31587getTypeZmokQxo(keyEvent), nq8.f65270b.m31186getKeyDownCS__XNY()) && keyEvent.getSource() != 257) {
            if (zrg.m33515isKeyCodeYhN2O0w(keyEvent, 19)) {
                return um6Var.mo27519moveFocus3ESFkO8(C0714c.f5215b.m27541getUpdhqQ8s());
            }
            if (zrg.m33515isKeyCodeYhN2O0w(keyEvent, 20)) {
                return um6Var.mo27519moveFocus3ESFkO8(C0714c.f5215b.m27534getDowndhqQ8s());
            }
            if (zrg.m33515isKeyCodeYhN2O0w(keyEvent, 21)) {
                return um6Var.mo27519moveFocus3ESFkO8(C0714c.f5215b.m27537getLeftdhqQ8s());
            }
            if (zrg.m33515isKeyCodeYhN2O0w(keyEvent, 22)) {
                return um6Var.mo27519moveFocus3ESFkO8(C0714c.f5215b.m27540getRightdhqQ8s());
            }
            if (zrg.m33515isKeyCodeYhN2O0w(keyEvent, 23)) {
                sufVar.show();
                return true;
            }
        }
        return false;
    }
}
