package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public abstract class jd8 extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: jd8$a */
    public static final class C7875a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f50352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7875a(AbstractC0767t abstractC0767t) {
            super(1);
            this.f50352a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.m27712placeRelative70tqf50$default(aVar, this.f50352a, a78.f545b.m27211getZeronOccac(), 0.0f, 2, null);
        }
    }

    /* JADX INFO: renamed from: calculateContentConstraints-l58MMJ0 */
    public abstract long mo28642calculateContentConstraintsl58MMJ0(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j);

    public abstract boolean getEnforceIncoming();

    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return ed8Var.maxIntrinsicHeight(i);
    }

    @Override // p000.ew8
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return ed8Var.maxIntrinsicWidth(i);
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        long jMo28642calculateContentConstraintsl58MMJ0 = mo28642calculateContentConstraintsl58MMJ0(interfaceC0761n, rbaVar, j);
        if (getEnforceIncoming()) {
            jMo28642calculateContentConstraintsl58MMJ0 = nu2.m31225constrainN9IONVI(j, jMo28642calculateContentConstraintsl58MMJ0);
        }
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(jMo28642calculateContentConstraintsl58MMJ0);
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C7875a(abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return ed8Var.minIntrinsicHeight(i);
    }

    @Override // p000.ew8
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return ed8Var.minIntrinsicWidth(i);
    }
}
