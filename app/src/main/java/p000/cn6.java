package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.InterfaceC0720i;

/* JADX INFO: loaded from: classes.dex */
public final class cn6 extends InterfaceC0701e.d implements an6 {

    /* JADX INFO: renamed from: X */
    @yfb
    public dn6 f17070X;

    public cn6(@yfb dn6 dn6Var) {
        this.f17070X = dn6Var;
    }

    @Override // p000.an6
    public void applyFocusProperties(@yfb InterfaceC0720i interfaceC0720i) {
        this.f17070X.apply(interfaceC0720i);
    }

    @yfb
    public final dn6 getFocusPropertiesScope() {
        return this.f17070X;
    }

    public final void setFocusPropertiesScope(@yfb dn6 dn6Var) {
        this.f17070X = dn6Var;
    }
}
