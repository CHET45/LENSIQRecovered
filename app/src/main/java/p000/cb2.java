package p000;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineBlockElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p002ui.InterfaceC0701e;
import p000.InterfaceC9407mm;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n1#2:398\n*E\n"})
@e0g(parameters = 1)
public final class cb2 implements bb2 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final cb2 f16168a = new cb2();

    /* JADX INFO: renamed from: b */
    public static final int f16169b = 0;

    private cb2() {
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e align(@yfb InterfaceC0701e interfaceC0701e, @yfb InterfaceC9407mm.b bVar) {
        return interfaceC0701e.then(new HorizontalAlignElement(bVar));
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb f5i f5iVar) {
        return interfaceC0701e.then(new WithAlignmentLineElement(f5iVar));
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e weight(@yfb InterfaceC0701e interfaceC0701e, float f, boolean z) {
        if (f > 0.0d) {
            return interfaceC0701e.then(new LayoutWeightElement(kpd.coerceAtMost(f, Float.MAX_VALUE), z));
        }
        throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
    }

    @Override // p000.bb2
    @f0g
    @yfb
    public InterfaceC0701e alignBy(@yfb InterfaceC0701e interfaceC0701e, @yfb qy6<? super aca, Integer> qy6Var) {
        return interfaceC0701e.then(new WithAlignmentLineBlockElement(qy6Var));
    }
}
