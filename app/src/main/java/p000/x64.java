package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@f0g
@dwf({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,214:1\n81#2:215\n107#2,2:216\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n*L\n180#1:215\n180#1:216,2\n*E\n"})
public final class x64 extends g58 implements cw8, gxa {

    /* JADX INFO: renamed from: d */
    @yfb
    public final vli f96856d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final gz6<vli, c64, Integer> f96857e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final z6b f96858f;

    /* JADX INFO: renamed from: x64$a */
    public static final class C14936a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public static final C14936a f96859a = new C14936a();

        public C14936a() {
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

    /* JADX INFO: renamed from: x64$b */
    public static final class C14937b extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f96860a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14937b(AbstractC0767t abstractC0767t) {
            super(1);
            this.f96860a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.placeRelative$default(aVar, this.f96860a, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x64(@yfb vli vliVar, @yfb qy6<? super f58, bth> qy6Var, @yfb gz6<? super vli, ? super c64, Integer> gz6Var) {
        super(qy6Var);
        this.f96856d = vliVar;
        this.f96857e = gz6Var;
        this.f96858f = xtf.mutableStateOf$default(vliVar, null, 2, null);
    }

    private final vli getUnconsumedInsets() {
        return (vli) this.f96858f.getValue();
    }

    private final void setUnconsumedInsets(vli vliVar) {
        this.f96858f.setValue(vliVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x64)) {
            return false;
        }
        x64 x64Var = (x64) obj;
        return md8.areEqual(this.f96856d, x64Var.f96856d) && this.f96857e == x64Var.f96857e;
    }

    public int hashCode() {
        return (this.f96856d.hashCode() * 31) + this.f96857e.hashCode();
    }

    @Override // p000.cw8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27254measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        int iIntValue = this.f96857e.invoke(getUnconsumedInsets(), interfaceC0761n).intValue();
        if (iIntValue == 0) {
            return InterfaceC0761n.layout$default(interfaceC0761n, 0, 0, null, C14936a.f96859a, 4, null);
        }
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2.m30754copyZbe2FdA$default(j, 0, 0, iIntValue, iIntValue, 3, null));
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), iIntValue, null, new C14937b(abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    @Override // p000.gxa
    public void onModifierLocalsUpdated(@yfb qxa qxaVar) {
        setUnconsumedInsets(goi.exclude(this.f96856d, (vli) qxaVar.getCurrent(soi.getModifierLocalConsumedWindowInsets())));
    }
}
