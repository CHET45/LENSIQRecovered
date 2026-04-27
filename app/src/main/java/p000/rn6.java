package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.InterfaceC0720i;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class rn6 extends InterfaceC0701e.d implements mn2, an6 {

    /* JADX INFO: renamed from: Y */
    public static final int f78791Y = 0;

    /* JADX INFO: renamed from: X */
    public final boolean f78792X;

    private final a48 getInputModeManager() {
        return (a48) nn2.currentValueOf(this, sn2.getLocalInputModeManager());
    }

    @Override // p000.an6
    public void applyFocusProperties(@yfb InterfaceC0720i interfaceC0720i) {
        interfaceC0720i.setCanFocus(!z38.m33481equalsimpl0(getInputModeManager().mo27183getInputModeaOaMEAU(), z38.f103982b.m33486getTouchaOaMEAU()));
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return this.f78792X;
    }
}
