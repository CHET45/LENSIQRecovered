package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class bx8 extends InterfaceC0701e.d implements bhc {

    /* JADX INFO: renamed from: Z */
    public static final int f15128Z = 8;

    /* JADX INFO: renamed from: X */
    public float f15129X;

    /* JADX INFO: renamed from: Y */
    public boolean f15130Y;

    public bx8(float f, boolean z) {
        this.f15129X = f;
        this.f15130Y = z;
    }

    public final boolean getFill() {
        return this.f15130Y;
    }

    public final float getWeight() {
        return this.f15129X;
    }

    public final void setFill(boolean z) {
        this.f15130Y = z;
    }

    public final void setWeight(float f) {
        this.f15129X = f;
    }

    @Override // p000.bhc
    @yfb
    public fce modifyParentData(@yfb c64 c64Var, @gib Object obj) {
        fce fceVar = obj instanceof fce ? (fce) obj : null;
        if (fceVar == null) {
            fceVar = new fce(0.0f, false, null, null, 15, null);
        }
        fceVar.setWeight(this.f15129X);
        fceVar.setFill(this.f15130Y);
        return fceVar;
    }
}
