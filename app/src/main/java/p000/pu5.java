package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class pu5 extends InterfaceC0701e.d implements bhc {

    /* JADX INFO: renamed from: Y */
    public static final int f72079Y = 8;

    /* JADX INFO: renamed from: X */
    public float f72080X;

    public pu5(float f) {
        this.f72080X = f;
    }

    public final float getFraction() {
        return this.f72080X;
    }

    public final void setFraction(float f) {
        this.f72080X = f;
    }

    @Override // p000.bhc
    @yfb
    public fce modifyParentData(@yfb c64 c64Var, @gib Object obj) {
        fce fceVar = obj instanceof fce ? (fce) obj : null;
        if (fceVar == null) {
            fceVar = new fce(0.0f, false, null, null, 15, null);
        }
        z76 flowLayoutData = fceVar.getFlowLayoutData();
        if (flowLayoutData == null) {
            flowLayoutData = new z76(this.f72080X);
        }
        fceVar.setFlowLayoutData(flowLayoutData);
        z76 flowLayoutData2 = fceVar.getFlowLayoutData();
        md8.checkNotNull(flowLayoutData2);
        flowLayoutData2.setFillCrossAxisFraction(this.f72080X);
        return fceVar;
    }
}
