package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class kz8 extends InterfaceC0701e.d implements bhc {

    /* JADX INFO: renamed from: M1 */
    public static final int f55716M1 = 8;

    /* JADX INFO: renamed from: X */
    @gib
    public fw5<Float> f55717X;

    /* JADX INFO: renamed from: Y */
    @gib
    public fw5<a78> f55718Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public fw5<Float> f55719Z;

    public kz8(@gib fw5<Float> fw5Var, @gib fw5<a78> fw5Var2, @gib fw5<Float> fw5Var3) {
        this.f55717X = fw5Var;
        this.f55718Y = fw5Var2;
        this.f55719Z = fw5Var3;
    }

    @gib
    public final fw5<Float> getFadeInSpec() {
        return this.f55717X;
    }

    @gib
    public final fw5<Float> getFadeOutSpec() {
        return this.f55719Z;
    }

    @gib
    public final fw5<a78> getPlacementSpec() {
        return this.f55718Y;
    }

    @Override // p000.bhc
    @yfb
    public Object modifyParentData(@yfb c64 c64Var, @gib Object obj) {
        return this;
    }

    public final void setFadeInSpec(@gib fw5<Float> fw5Var) {
        this.f55717X = fw5Var;
    }

    public final void setFadeOutSpec(@gib fw5<Float> fw5Var) {
        this.f55719Z = fw5Var;
    }

    public final void setPlacementSpec(@gib fw5<a78> fw5Var) {
        this.f55718Y = fw5Var;
    }
}
