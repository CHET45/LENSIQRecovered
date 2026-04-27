package p000;

import androidx.compose.p002ui.InterfaceC0701e;

/* JADX INFO: loaded from: classes.dex */
public final class opg extends InterfaceC0701e.d implements rxe {

    /* JADX INFO: renamed from: X */
    @yfb
    public String f68283X;

    public opg(@yfb String str) {
        this.f68283X = str;
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        bye.setTestTag(eyeVar, this.f68283X);
    }

    @yfb
    public final String getTag() {
        return this.f68283X;
    }

    public final void setTag(@yfb String str) {
        this.f68283X = str;
    }
}
