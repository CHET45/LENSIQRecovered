package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,606:1\n235#2,3:607\n33#2,4:610\n238#2,2:614\n38#2:616\n240#2:617\n298#2,3:618\n69#2,4:621\n301#2:625\n302#2:628\n74#2:629\n303#2:630\n235#2,3:631\n33#2,4:634\n238#2,2:638\n38#2:640\n240#2:641\n26#3:626\n1#4:627\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n*L\n382#1:607,3\n382#1:610,4\n382#1:614,2\n382#1:616\n382#1:617\n385#1:618,3\n385#1:621,4\n385#1:625\n385#1:628\n385#1:629\n385#1:630\n402#1:631,3\n402#1:634,4\n402#1:638,2\n402#1:640\n402#1:641\n396#1:626\n385#1:627\n*E\n"})
public final class tug implements uba {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ny6<Boolean> f86024a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ny6<List<rud>> f86025b;

    /* JADX INFO: renamed from: tug$a */
    @dwf({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,606:1\n33#2,6:607\n33#2,6:613\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy$measure$1\n*L\n412#1:607,6\n416#1:613,6\n*E\n"})
    public static final class C13249a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<scc<AbstractC0767t, a78>> f86026a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<scc<AbstractC0767t, ny6<a78>>> f86027b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C13249a(List<? extends scc<? extends AbstractC0767t, a78>> list, List<? extends scc<? extends AbstractC0767t, ? extends ny6<a78>>> list2) {
            super(1);
            this.f86026a = list;
            this.f86027b = list2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            List<scc<AbstractC0767t, a78>> list = this.f86026a;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    scc<AbstractC0767t, a78> sccVar = list.get(i);
                    AbstractC0767t.a.m27711place70tqf50$default(aVar, sccVar.component1(), sccVar.component2().m27210unboximpl(), 0.0f, 2, null);
                }
            }
            List<scc<AbstractC0767t, ny6<a78>>> list2 = this.f86027b;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    scc<AbstractC0767t, ny6<a78>> sccVar2 = list2.get(i2);
                    AbstractC0767t abstractC0767tComponent1 = sccVar2.component1();
                    ny6<a78> ny6VarComponent2 = sccVar2.component2();
                    AbstractC0767t.a.m27711place70tqf50$default(aVar, abstractC0767tComponent1, ny6VarComponent2 != null ? ny6VarComponent2.invoke().m27210unboximpl() : a78.f545b.m27211getZeronOccac(), 0.0f, 2, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tug(@yfb ny6<Boolean> ny6Var, @yfb ny6<? extends List<rud>> ny6Var2) {
        this.f86024a = ny6Var;
        this.f86025b = ny6Var2;
    }

    @Override // p000.uba
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rba rbaVar = list.get(i);
            if (!(rbaVar.getParentData() instanceof nvg)) {
                arrayList.add(rbaVar);
            }
        }
        List<rud> listInvoke = this.f86025b.invoke();
        ArrayList arrayList2 = null;
        if (listInvoke != null) {
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i2 = 0; i2 < size2; i2++) {
                rud rudVar = listInvoke.get(i2);
                scc sccVar = rudVar != null ? new scc(((rba) arrayList.get(i2)).mo27949measureBRTryo0(nu2.Constraints$default(0, (int) Math.floor(rudVar.getWidth()), 0, (int) Math.floor(rudVar.getHeight()), 5, null)), a78.m27192boximpl(b78.IntOffset(Math.round(rudVar.getLeft()), Math.round(rudVar.getTop())))) : null;
                if (sccVar != null) {
                    arrayList3.add(sccVar);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            rba rbaVar2 = list.get(i3);
            if (rbaVar2.getParentData() instanceof nvg) {
                arrayList4.add(rbaVar2);
            }
        }
        return InterfaceC0761n.layout$default(interfaceC0761n, ku2.m30763getMaxWidthimpl(j), ku2.m30762getMaxHeightimpl(j), null, new C13249a(arrayList2, hw0.measureWithTextRangeMeasureConstraints(arrayList4, this.f86024a)), 4, null);
    }
}
