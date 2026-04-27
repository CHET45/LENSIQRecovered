package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class sv8 extends InterfaceC0701e.d implements bhc, tv8 {

    /* JADX INFO: renamed from: Y */
    public static final int f82967Y = 8;

    /* JADX INFO: renamed from: X */
    @yfb
    public Object f82968X;

    public sv8(@yfb Object obj) {
        this.f82968X = obj;
    }

    @Override // p000.tv8
    @yfb
    public Object getLayoutId() {
        return this.f82968X;
    }

    @Override // p000.bhc
    @gib
    public Object modifyParentData(@yfb c64 c64Var, @gib Object obj) {
        return this;
    }

    public void setLayoutId$ui_release(@yfb Object obj) {
        this.f82968X = obj;
    }
}
