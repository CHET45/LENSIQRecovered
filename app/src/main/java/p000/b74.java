package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedWidthModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,214:1\n81#2:215\n107#2,2:216\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedWidthModifier\n*L\n135#1:215\n135#1:216,2\n*E\n"})
public final class b74 extends g58 implements cw8, gxa {

    /* JADX INFO: renamed from: d */
    @yfb
    public final vli f12833d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final kz6<vli, ov8, c64, Integer> f12834e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final z6b f12835f;

    /* JADX INFO: renamed from: b74$a */
    public static final class C1762a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C1762a f12836a = new C1762a();

        public C1762a() {
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

    /* JADX INFO: renamed from: b74$b */
    public static final class C1763b extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f12837a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1763b(AbstractC0767t abstractC0767t) {
            super(1);
            this.f12837a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.placeRelative$default(aVar, this.f12837a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b74(@yfb vli vliVar, @yfb qy6<? super f58, bth> qy6Var, @yfb kz6<? super vli, ? super ov8, ? super c64, Integer> kz6Var) {
        super(qy6Var);
        this.f12833d = vliVar;
        this.f12834e = kz6Var;
        this.f12835f = xtf.mutableStateOf$default(vliVar, null, 2, null);
    }

    private final vli getUnconsumedInsets() {
        return (vli) this.f12835f.getValue();
    }

    private final void setUnconsumedInsets(vli vliVar) {
        this.f12835f.setValue(vliVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b74)) {
            return false;
        }
        b74 b74Var = (b74) obj;
        return md8.areEqual(this.f12833d, b74Var.f12833d) && this.f12834e == b74Var.f12834e;
    }

    public int hashCode() {
        return (this.f12833d.hashCode() * 31) + this.f12834e.hashCode();
    }

    @Override // p000.cw8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27254measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        int iIntValue = this.f12834e.invoke(getUnconsumedInsets(), interfaceC0761n.getLayoutDirection(), interfaceC0761n).intValue();
        if (iIntValue == 0) {
            return InterfaceC0761n.layout$default(interfaceC0761n, 0, 0, null, C1762a.f12836a, 4, null);
        }
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2.m30754copyZbe2FdA$default(j, iIntValue, iIntValue, 0, 0, 12, null));
        return InterfaceC0761n.layout$default(interfaceC0761n, iIntValue, abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C1763b(abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    @Override // p000.gxa
    public void onModifierLocalsUpdated(@yfb qxa qxaVar) {
        setUnconsumedInsets(goi.exclude(this.f12833d, (vli) qxaVar.getCurrent(soi.getModifierLocalConsumedWindowInsets())));
    }
}
