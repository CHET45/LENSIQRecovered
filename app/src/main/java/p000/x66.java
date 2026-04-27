package p000;

import androidx.compose.foundation.layout.FillCrossAxisSizeElement;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowColumnScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1544:1\n1#2:1545\n*E\n"})
@e0g(parameters = 1)
public final class x66 implements bb2, w66 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final x66 f96862b = new x66();

    /* JADX INFO: renamed from: c */
    public static final int f96863c = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cb2 f96864a = cb2.f16168a;

    private x66() {
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.b bVar) {
        return this.f96864a.align(interfaceC0701e, bVar);
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var) {
        return this.f96864a.alignBy(interfaceC0701e, qy6Var);
    }

    @Override // p000.w66
    @yfb
    public InterfaceC0701e fillMaxColumnWidth(@yfb InterfaceC0701e interfaceC0701e, float f) {
        double d = f;
        if (d < 0.0d) {
            throw new IllegalArgumentException(("invalid fraction " + f + "; must be greater than or equal to zero").toString());
        }
        if (d <= 1.0d) {
            return interfaceC0701e.then(new FillCrossAxisSizeElement(f));
        }
        throw new IllegalArgumentException(("invalid fraction " + f + "; must not be greater than 1.0").toString());
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, fromInclusive = false) float f, boolean z) {
        return this.f96864a.weight(interfaceC0701e, f, z);
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb f5i f5iVar) {
        return this.f96864a.alignBy(interfaceC0701e, f5iVar);
    }
}
