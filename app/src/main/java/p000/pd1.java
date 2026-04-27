package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@ah5
@dwf({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,179:1\n728#2,2:180\n735#2,2:182\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n*L\n164#1:180,2\n171#1:182,2\n*E\n"})
@e0g(parameters = 0)
public final class pd1 extends InterfaceC0701e.d {

    /* JADX INFO: renamed from: Z */
    public static final int f70425Z = 8;

    /* JADX INFO: renamed from: X */
    @yfb
    public md1 f70426X;

    /* JADX INFO: renamed from: Y */
    public final boolean f70427Y;

    public pd1(@yfb md1 md1Var) {
        this.f70426X = md1Var;
    }

    private final void disposeRequester() {
        md1 md1Var = this.f70426X;
        if (md1Var instanceof nd1) {
            md8.checkNotNull(md1Var, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((nd1) md1Var).getModifiers().remove(this);
        }
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return this.f70427Y;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        updateRequester(this.f70426X);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        disposeRequester();
    }

    public final void updateRequester(@yfb md1 md1Var) {
        disposeRequester();
        if (md1Var instanceof nd1) {
            ((nd1) md1Var).getModifiers().add(this);
        }
        this.f70426X = md1Var;
    }
}
