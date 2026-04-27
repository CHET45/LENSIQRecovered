package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class p03 extends InterfaceC0701e.d implements rxe {

    /* JADX INFO: renamed from: M1 */
    public static final int f69318M1 = 8;

    /* JADX INFO: renamed from: X */
    public boolean f69319X;

    /* JADX INFO: renamed from: Y */
    public boolean f69320Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public qy6<? super eye, bth> f69321Z;

    public p03(boolean z, boolean z2, @yfb qy6<? super eye, bth> qy6Var) {
        this.f69319X = z;
        this.f69320Y = z2;
        this.f69321Z = qy6Var;
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        this.f69321Z.invoke(eyeVar);
    }

    public final boolean getMergeDescendants() {
        return this.f69319X;
    }

    @yfb
    public final qy6<eye, bth> getProperties() {
        return this.f69321Z;
    }

    @Override // p000.rxe
    public boolean getShouldClearDescendantSemantics() {
        return this.f69320Y;
    }

    @Override // p000.rxe
    public boolean getShouldMergeDescendantSemantics() {
        return this.f69319X;
    }

    public final boolean isClearingSemantics() {
        return this.f69320Y;
    }

    public final void setClearingSemantics(boolean z) {
        this.f69320Y = z;
    }

    public final void setMergeDescendants(boolean z) {
        this.f69319X = z;
    }

    public final void setProperties(@yfb qy6<? super eye, bth> qy6Var) {
        this.f69321Z = qy6Var;
    }
}
