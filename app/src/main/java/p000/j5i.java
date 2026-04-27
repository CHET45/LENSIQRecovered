package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public final class j5i implements cw8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final nsg f49586a;

    /* JADX INFO: renamed from: b */
    public final int f49587b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ieh f49588c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ny6<iug> f49589d;

    /* JADX INFO: renamed from: j5i$a */
    @dwf({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/VerticalScrollLayoutModifier$measure$1\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,371:1\n26#2:372\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/VerticalScrollLayoutModifier$measure$1\n*L\n165#1:372\n*E\n"})
    public static final class C7749a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0761n f49590a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ j5i f49591b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0767t f49592c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f49593d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7749a(InterfaceC0761n interfaceC0761n, j5i j5iVar, AbstractC0767t abstractC0767t, int i) {
            super(1);
            this.f49590a = interfaceC0761n;
            this.f49591b = j5iVar;
            this.f49592c = abstractC0767t;
            this.f49593d = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            InterfaceC0761n interfaceC0761n = this.f49590a;
            int cursorOffset = this.f49591b.getCursorOffset();
            ieh transformedText = this.f49591b.getTransformedText();
            iug iugVarInvoke = this.f49591b.getTextLayoutResultProvider().invoke();
            this.f49591b.getScrollerPosition().update(t7c.Vertical, msg.getCursorRectInScroller(interfaceC0761n, cursorOffset, transformedText, iugVarInvoke != null ? iugVarInvoke.getValue() : null, false, this.f49592c.getWidth()), this.f49593d, this.f49592c.getHeight());
            AbstractC0767t.a.placeRelative$default(aVar, this.f49592c, 0, Math.round(-this.f49591b.getScrollerPosition().getOffset()), 0.0f, 4, null);
        }
    }

    public j5i(@yfb nsg nsgVar, int i, @yfb ieh iehVar, @yfb ny6<iug> ny6Var) {
        this.f49586a = nsgVar;
        this.f49587b = i;
        this.f49588c = iehVar;
        this.f49589d = ny6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j5i copy$default(j5i j5iVar, nsg nsgVar, int i, ieh iehVar, ny6 ny6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nsgVar = j5iVar.f49586a;
        }
        if ((i2 & 2) != 0) {
            i = j5iVar.f49587b;
        }
        if ((i2 & 4) != 0) {
            iehVar = j5iVar.f49588c;
        }
        if ((i2 & 8) != 0) {
            ny6Var = j5iVar.f49589d;
        }
        return j5iVar.copy(nsgVar, i, iehVar, ny6Var);
    }

    @yfb
    public final nsg component1() {
        return this.f49586a;
    }

    public final int component2() {
        return this.f49587b;
    }

    @yfb
    public final ieh component3() {
        return this.f49588c;
    }

    @yfb
    public final ny6<iug> component4() {
        return this.f49589d;
    }

    @yfb
    public final j5i copy(@yfb nsg nsgVar, int i, @yfb ieh iehVar, @yfb ny6<iug> ny6Var) {
        return new j5i(nsgVar, i, iehVar, ny6Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5i)) {
            return false;
        }
        j5i j5iVar = (j5i) obj;
        return md8.areEqual(this.f49586a, j5iVar.f49586a) && this.f49587b == j5iVar.f49587b && md8.areEqual(this.f49588c, j5iVar.f49588c) && md8.areEqual(this.f49589d, j5iVar.f49589d);
    }

    public final int getCursorOffset() {
        return this.f49587b;
    }

    @yfb
    public final nsg getScrollerPosition() {
        return this.f49586a;
    }

    @yfb
    public final ny6<iug> getTextLayoutResultProvider() {
        return this.f49589d;
    }

    @yfb
    public final ieh getTransformedText() {
        return this.f49588c;
    }

    public int hashCode() {
        return (((((this.f49586a.hashCode() * 31) + Integer.hashCode(this.f49587b)) * 31) + this.f49588c.hashCode()) * 31) + this.f49589d.hashCode();
    }

    @Override // p000.cw8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27254measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2.m30754copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int iMin = Math.min(abstractC0767tMo27949measureBRTryo0.getHeight(), ku2.m30762getMaxHeightimpl(j));
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), iMin, null, new C7749a(interfaceC0761n, this, abstractC0767tMo27949measureBRTryo0, iMin), 4, null);
    }

    @yfb
    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f49586a + ", cursorOffset=" + this.f49587b + ", transformedText=" + this.f49588c + ", textLayoutResultProvider=" + this.f49589d + ')';
    }
}
