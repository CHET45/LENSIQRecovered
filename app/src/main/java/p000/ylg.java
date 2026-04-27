package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ylg extends InterfaceC0701e.d {

    /* JADX INFO: renamed from: Y */
    public static final int f102035Y = 8;

    /* JADX INFO: renamed from: X */
    public boolean f102036X;

    public ylg() {
        setAggregateChildKindSet$ui_release(0);
    }

    public final boolean getAttachHasBeenRun() {
        return this.f102036X;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        this.f102036X = true;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        this.f102036X = false;
    }

    public final void setAttachHasBeenRun(boolean z) {
        this.f102036X = z;
    }

    @yfb
    public String toString() {
        return "<tail>";
    }
}
