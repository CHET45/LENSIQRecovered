package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.InterfaceC0720i;
import androidx.compose.p002ui.viewinterop.C0853b;

/* JADX INFO: loaded from: classes.dex */
public final class on6 extends InterfaceC0701e.d implements an6 {
    @Override // p000.an6
    public void applyFocusProperties(@yfb InterfaceC0720i interfaceC0720i) {
        interfaceC0720i.setCanFocus(getNode().isAttached() && C0853b.getView(this).hasFocusable());
    }
}
