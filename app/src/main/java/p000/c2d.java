package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.input.pointer.PointerHoverIconModifierElement;

/* JADX INFO: loaded from: classes.dex */
public final class c2d {
    @f0g
    @yfb
    public static final InterfaceC0701e pointerHoverIcon(@yfb InterfaceC0701e interfaceC0701e, @yfb a2d a2dVar, boolean z) {
        return interfaceC0701e.then(new PointerHoverIconModifierElement(a2dVar, z));
    }

    public static /* synthetic */ InterfaceC0701e pointerHoverIcon$default(InterfaceC0701e interfaceC0701e, a2d a2dVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return pointerHoverIcon(interfaceC0701e, a2dVar, z);
    }
}
