package p000;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WithAlignmentLineBlockElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,428:1\n1#2:429\n*E\n"})
@e0g(parameters = 1)
public final class hce implements gce {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final hce f43146a = new hce();

    /* JADX INFO: renamed from: b */
    public static final int f43147b = 0;

    private hce() {
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.c cVar) {
        return interfaceC0701e.then(new VerticalAlignElement(cVar));
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb kl7 kl7Var) {
        return interfaceC0701e.then(new WithAlignmentLineElement(kl7Var));
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e alignByBaseline(@yfb InterfaceC0701e interfaceC0701e) {
        return alignBy(interfaceC0701e, C10463om.getFirstBaseline());
    }

    @Override // p000.gce
    @f0g
    @yfb
    public InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, float f, boolean z) {
        if (f > 0.0d) {
            return interfaceC0701e.then(new LayoutWeightElement(kpd.coerceAtMost(f, Float.MAX_VALUE), z));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    @Override // p000.gce
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var) {
        return interfaceC0701e.then(new WithAlignmentLineBlockElement(qy6Var));
    }
}
