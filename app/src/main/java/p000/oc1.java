package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class oc1 extends InterfaceC0701e.d implements bhc {

    /* JADX INFO: renamed from: X */
    @yfb
    public InterfaceC9407mm f67113X;

    /* JADX INFO: renamed from: Y */
    public boolean f67114Y;

    public oc1(@yfb InterfaceC9407mm interfaceC9407mm, boolean z) {
        this.f67113X = interfaceC9407mm;
        this.f67114Y = z;
    }

    @yfb
    public final InterfaceC9407mm getAlignment() {
        return this.f67113X;
    }

    public final boolean getMatchParentSize() {
        return this.f67114Y;
    }

    public final void setAlignment(@yfb InterfaceC9407mm interfaceC9407mm) {
        this.f67113X = interfaceC9407mm;
    }

    public final void setMatchParentSize(boolean z) {
        this.f67114Y = z;
    }

    @Override // p000.bhc
    @yfb
    public oc1 modifyParentData(@yfb c64 c64Var, @gib Object obj) {
        return this;
    }
}
