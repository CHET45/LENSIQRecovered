package p000;

import androidx.compose.foundation.layout.FillCrossAxisSizeElement;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowRowScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1544:1\n1#2:1545\n*E\n"})
@e0g(parameters = 1)
public final class h86 implements gce, g86 {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final h86 f42900b = new h86();

    /* JADX INFO: renamed from: c */
    public static final int f42901c = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hce f42902a = hce.f43146a;

    private h86() {
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.c cVar) {
        return this.f42902a.align(interfaceC0701e, cVar);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var) {
        return this.f42902a.alignBy(interfaceC0701e, qy6Var);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignByBaseline(@yfb InterfaceC0701e interfaceC0701e) {
        return this.f42902a.alignByBaseline(interfaceC0701e);
    }

    @Override // p000.g86
    @yfb
    public InterfaceC0701e fillMaxRowHeight(@yfb InterfaceC0701e interfaceC0701e, float f) {
        double d = f;
        if (d < 0.0d) {
            throw new IllegalArgumentException(("invalid fraction " + f + "; must be greater than or equal to zero").toString());
        }
        if (d <= 1.0d) {
            return interfaceC0701e.then(new FillCrossAxisSizeElement(f));
        }
        throw new IllegalArgumentException(("invalid fraction " + f + "; must not be greater than 1.0").toString());
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, @y46(from = 0.0d, fromInclusive = false) float f, boolean z) {
        return this.f42902a.weight(interfaceC0701e, f, z);
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb kl7 kl7Var) {
        return this.f42902a.alignBy(interfaceC0701e, kl7Var);
    }
}
