package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.List;
import p000.jvd;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,339:1\n69#2,6:340\n69#2,6:346\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n*L\n171#1:340,6\n191#1:346,6\n*E\n"})
public final class qc1 implements uba {

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC9407mm f73890a;

    /* JADX INFO: renamed from: b */
    public final boolean f73891b;

    /* JADX INFO: renamed from: qc1$a */
    public static final class C11419a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C11419a f73892a = new C11419a();

        public C11419a() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
        }
    }

    /* JADX INFO: renamed from: qc1$b */
    public static final class C11420b extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f73893a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ rba f73894b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0761n f73895c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f73896d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f73897e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ qc1 f73898f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11420b(AbstractC0767t abstractC0767t, rba rbaVar, InterfaceC0761n interfaceC0761n, int i, int i2, qc1 qc1Var) {
            super(1);
            this.f73893a = abstractC0767t;
            this.f73894b = rbaVar;
            this.f73895c = interfaceC0761n;
            this.f73896d = i;
            this.f73897e = i2;
            this.f73898f = qc1Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            pc1.placeInBox(aVar, this.f73893a, this.f73894b, this.f73895c.getLayoutDirection(), this.f73896d, this.f73897e, this.f73898f.f73890a);
        }
    }

    /* JADX INFO: renamed from: qc1$c */
    @dwf({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy$measure$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,339:1\n13644#2,3:340\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy$measure$5\n*L\n200#1:340,3\n*E\n"})
    public static final class C11421c extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t[] f73899a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List<rba> f73900b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0761n f73901c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ jvd.C8119f f73902d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ jvd.C8119f f73903e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ qc1 f73904f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11421c(AbstractC0767t[] abstractC0767tArr, List<? extends rba> list, InterfaceC0761n interfaceC0761n, jvd.C8119f c8119f, jvd.C8119f c8119f2, qc1 qc1Var) {
            super(1);
            this.f73899a = abstractC0767tArr;
            this.f73900b = list;
            this.f73901c = interfaceC0761n;
            this.f73902d = c8119f;
            this.f73903e = c8119f2;
            this.f73904f = qc1Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t[] abstractC0767tArr = this.f73899a;
            List<rba> list = this.f73900b;
            InterfaceC0761n interfaceC0761n = this.f73901c;
            jvd.C8119f c8119f = this.f73902d;
            jvd.C8119f c8119f2 = this.f73903e;
            qc1 qc1Var = this.f73904f;
            int length = abstractC0767tArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                AbstractC0767t abstractC0767t = abstractC0767tArr[i];
                md8.checkNotNull(abstractC0767t, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                pc1.placeInBox(aVar, abstractC0767t, list.get(i2), interfaceC0761n.getLayoutDirection(), c8119f.f52108a, c8119f2.f52108a, qc1Var.f73890a);
                i++;
                i2++;
            }
        }
    }

    public qc1(@yfb InterfaceC9407mm interfaceC9407mm, boolean z) {
        this.f73890a = interfaceC9407mm;
        this.f73891b = z;
    }

    private final InterfaceC9407mm component1() {
        return this.f73890a;
    }

    private final boolean component2() {
        return this.f73891b;
    }

    public static /* synthetic */ qc1 copy$default(qc1 qc1Var, InterfaceC9407mm interfaceC9407mm, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC9407mm = qc1Var.f73890a;
        }
        if ((i & 2) != 0) {
            z = qc1Var.f73891b;
        }
        return qc1Var.copy(interfaceC9407mm, z);
    }

    @yfb
    public final qc1 copy(@yfb InterfaceC9407mm interfaceC9407mm, boolean z) {
        return new qc1(interfaceC9407mm, z);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc1)) {
            return false;
        }
        qc1 qc1Var = (qc1) obj;
        return md8.areEqual(this.f73890a, qc1Var.f73890a) && this.f73891b == qc1Var.f73891b;
    }

    public int hashCode() {
        return (this.f73890a.hashCode() * 31) + Boolean.hashCode(this.f73891b);
    }

    @Override // p000.uba
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27228measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
        int iM30765getMinWidthimpl;
        int iM30764getMinHeightimpl;
        AbstractC0767t abstractC0767tMo27949measureBRTryo0;
        if (list.isEmpty()) {
            return InterfaceC0761n.layout$default(interfaceC0761n, ku2.m30765getMinWidthimpl(j), ku2.m30764getMinHeightimpl(j), null, C11419a.f73892a, 4, null);
        }
        long jM30754copyZbe2FdA$default = this.f73891b ? j : ku2.m30754copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            rba rbaVar = list.get(0);
            if (pc1.getMatchesParentSize(rbaVar)) {
                iM30765getMinWidthimpl = ku2.m30765getMinWidthimpl(j);
                iM30764getMinHeightimpl = ku2.m30764getMinHeightimpl(j);
                abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2.f55323b.m30773fixedJhjzzOo(ku2.m30765getMinWidthimpl(j), ku2.m30764getMinHeightimpl(j)));
            } else {
                abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(jM30754copyZbe2FdA$default);
                iM30765getMinWidthimpl = Math.max(ku2.m30765getMinWidthimpl(j), abstractC0767tMo27949measureBRTryo0.getWidth());
                iM30764getMinHeightimpl = Math.max(ku2.m30764getMinHeightimpl(j), abstractC0767tMo27949measureBRTryo0.getHeight());
            }
            int i = iM30765getMinWidthimpl;
            int i2 = iM30764getMinHeightimpl;
            return InterfaceC0761n.layout$default(interfaceC0761n, i, i2, null, new C11420b(abstractC0767tMo27949measureBRTryo0, rbaVar, interfaceC0761n, i, i2, this), 4, null);
        }
        AbstractC0767t[] abstractC0767tArr = new AbstractC0767t[list.size()];
        jvd.C8119f c8119f = new jvd.C8119f();
        c8119f.f52108a = ku2.m30765getMinWidthimpl(j);
        jvd.C8119f c8119f2 = new jvd.C8119f();
        c8119f2.f52108a = ku2.m30764getMinHeightimpl(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            rba rbaVar2 = list.get(i3);
            if (pc1.getMatchesParentSize(rbaVar2)) {
                z = true;
            } else {
                AbstractC0767t abstractC0767tMo27949measureBRTryo02 = rbaVar2.mo27949measureBRTryo0(jM30754copyZbe2FdA$default);
                abstractC0767tArr[i3] = abstractC0767tMo27949measureBRTryo02;
                c8119f.f52108a = Math.max(c8119f.f52108a, abstractC0767tMo27949measureBRTryo02.getWidth());
                c8119f2.f52108a = Math.max(c8119f2.f52108a, abstractC0767tMo27949measureBRTryo02.getHeight());
            }
        }
        if (z) {
            int i4 = c8119f.f52108a;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = c8119f2.f52108a;
            long jConstraints = nu2.Constraints(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                rba rbaVar3 = list.get(i7);
                if (pc1.getMatchesParentSize(rbaVar3)) {
                    abstractC0767tArr[i7] = rbaVar3.mo27949measureBRTryo0(jConstraints);
                }
            }
        }
        return InterfaceC0761n.layout$default(interfaceC0761n, c8119f.f52108a, c8119f2.f52108a, null, new C11421c(abstractC0767tArr, list, interfaceC0761n, c8119f, c8119f2, this), 4, null);
    }

    @yfb
    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f73890a + ", propagateMinConstraints=" + this.f73891b + ')';
    }
}
