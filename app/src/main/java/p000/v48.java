package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,490:1\n81#2:491\n107#2,2:492\n81#2:494\n107#2,2:495\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n343#1:491\n343#1:492,2\n344#1:494\n344#1:495,2\n*E\n"})
@e0g(parameters = 1)
public final class v48 implements cw8, gxa, oxa<vli> {

    /* JADX INFO: renamed from: d */
    public static final int f89903d = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final vli f89904a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f89905b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f89906c;

    /* JADX INFO: renamed from: v48$a */
    public static final class C13860a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f89907a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f89908b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f89909c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13860a(AbstractC0767t abstractC0767t, int i, int i2) {
            super(1);
            this.f89907a = abstractC0767t;
            this.f89908b = i;
            this.f89909c = i2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.place$default(aVar, this.f89907a, this.f89908b, this.f89909c, 0.0f, 4, null);
        }
    }

    public v48(@yfb vli vliVar) {
        this.f89904a = vliVar;
        this.f89905b = xtf.mutableStateOf$default(vliVar, null, 2, null);
        this.f89906c = xtf.mutableStateOf$default(vliVar, null, 2, null);
    }

    private final vli getConsumedInsets() {
        return (vli) this.f89906c.getValue();
    }

    private final vli getUnconsumedInsets() {
        return (vli) this.f89905b.getValue();
    }

    private final void setConsumedInsets(vli vliVar) {
        this.f89906c.setValue(vliVar);
    }

    private final void setUnconsumedInsets(vli vliVar) {
        this.f89905b.setValue(vliVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v48) {
            return md8.areEqual(((v48) obj).f89904a, this.f89904a);
        }
        return false;
    }

    @Override // p000.oxa
    @yfb
    public aid<vli> getKey() {
        return soi.getModifierLocalConsumedWindowInsets();
    }

    public int hashCode() {
        return this.f89904a.hashCode();
    }

    @Override // p000.cw8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27254measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        int left = getUnconsumedInsets().getLeft(interfaceC0761n, interfaceC0761n.getLayoutDirection());
        int top = getUnconsumedInsets().getTop(interfaceC0761n);
        int right = getUnconsumedInsets().getRight(interfaceC0761n, interfaceC0761n.getLayoutDirection()) + left;
        int bottom = getUnconsumedInsets().getBottom(interfaceC0761n) + top;
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(nu2.m31229offsetNN6EwU(j, -right, -bottom));
        return InterfaceC0761n.layout$default(interfaceC0761n, nu2.m31227constrainWidthK40F9xA(j, abstractC0767tMo27949measureBRTryo0.getWidth() + right), nu2.m31226constrainHeightK40F9xA(j, abstractC0767tMo27949measureBRTryo0.getHeight() + bottom), null, new C13860a(abstractC0767tMo27949measureBRTryo0, left, top), 4, null);
    }

    @Override // p000.gxa
    public void onModifierLocalsUpdated(@yfb qxa qxaVar) {
        vli vliVar = (vli) qxaVar.getCurrent(soi.getModifierLocalConsumedWindowInsets());
        setUnconsumedInsets(goi.exclude(this.f89904a, vliVar));
        setConsumedInsets(goi.union(vliVar, this.f89904a));
    }

    @Override // p000.oxa
    @yfb
    public vli getValue() {
        return getConsumedInsets();
    }
}
