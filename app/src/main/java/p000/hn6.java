package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.C0723l;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,81:1\n728#2,2:82\n735#2,2:84\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterNode\n*L\n73#1:82,2\n77#1:84,2\n*E\n"})
public final class hn6 extends InterfaceC0701e.d implements gn6 {

    /* JADX INFO: renamed from: X */
    @yfb
    public C0723l f44206X;

    public hn6(@yfb C0723l c0723l) {
        this.f44206X = c0723l;
    }

    @yfb
    public final C0723l getFocusRequester() {
        return this.f44206X;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        super.onAttach();
        this.f44206X.getFocusRequesterNodes$ui_release().add(this);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        this.f44206X.getFocusRequesterNodes$ui_release().remove(this);
        super.onDetach();
    }

    public final void setFocusRequester(@yfb C0723l c0723l) {
        this.f44206X = c0723l;
    }
}
