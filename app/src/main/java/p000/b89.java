package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b89 implements uba {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ny6<Boolean> f12964a;

    /* JADX INFO: renamed from: b89$a */
    @dwf({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/LinksTextMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,606:1\n33#2,6:607\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/LinksTextMeasurePolicy$measure$1\n*L\n436#1:607,6\n*E\n"})
    public static final class C1777a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<rba> f12965a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b89 f12966b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1777a(List<? extends rba> list, b89 b89Var) {
            super(1);
            this.f12965a = list;
            this.f12966b = b89Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            List listMeasureWithTextRangeMeasureConstraints = hw0.measureWithTextRangeMeasureConstraints(this.f12965a, this.f12966b.f12964a);
            if (listMeasureWithTextRangeMeasureConstraints != null) {
                int size = listMeasureWithTextRangeMeasureConstraints.size();
                for (int i = 0; i < size; i++) {
                    scc sccVar = (scc) listMeasureWithTextRangeMeasureConstraints.get(i);
                    AbstractC0767t abstractC0767t = (AbstractC0767t) sccVar.component1();
                    ny6 ny6Var = (ny6) sccVar.component2();
                    AbstractC0767t.a.m27711place70tqf50$default(aVar, abstractC0767t, ny6Var != null ? ((a78) ny6Var.invoke()).m27210unboximpl() : a78.f545b.m27211getZeronOccac(), 0.0f, 2, null);
                }
            }
        }
    }

    public b89(@yfb ny6<Boolean> ny6Var) {
        this.f12964a = ny6Var;
    }

    @Override // p000.uba
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
        return InterfaceC0761n.layout$default(interfaceC0761n, ku2.m30763getMaxWidthimpl(j), ku2.m30762getMaxHeightimpl(j), null, new C1777a(list, this), 4, null);
    }
}
