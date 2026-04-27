package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class dw8 extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: Y */
    public static final int f31200Y = 8;

    /* JADX INFO: renamed from: X */
    @yfb
    public kz6<? super InterfaceC0761n, ? super rba, ? super ku2, ? extends vba> f31201X;

    public dw8(@yfb kz6<? super InterfaceC0761n, ? super rba, ? super ku2, ? extends vba> kz6Var) {
        this.f31201X = kz6Var;
    }

    @yfb
    public final kz6<InterfaceC0761n, rba, ku2, vba> getMeasureBlock() {
        return this.f31201X;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        return this.f31201X.invoke(interfaceC0761n, rbaVar, ku2.m30751boximpl(j));
    }

    public final void setMeasureBlock(@yfb kz6<? super InterfaceC0761n, ? super rba, ? super ku2, ? extends vba> kz6Var) {
        this.f31201X = kz6Var;
    }

    @yfb
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f31201X + ')';
    }
}
