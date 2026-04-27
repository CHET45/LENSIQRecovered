package p000;

import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public final class ol7 implements cw8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final nsg f68048a;

    /* JADX INFO: renamed from: b */
    public final int f68049b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final ieh f68050c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ny6<iug> f68051d;

    /* JADX INFO: renamed from: ol7$a */
    @dwf({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/HorizontalScrollLayoutModifier$measure$1\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,371:1\n26#2:372\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/HorizontalScrollLayoutModifier$measure$1\n*L\n209#1:372\n*E\n"})
    public static final class C10453a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0761n f68052a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ol7 f68053b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0767t f68054c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f68055d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10453a(InterfaceC0761n interfaceC0761n, ol7 ol7Var, AbstractC0767t abstractC0767t, int i) {
            super(1);
            this.f68052a = interfaceC0761n;
            this.f68053b = ol7Var;
            this.f68054c = abstractC0767t;
            this.f68055d = i;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            InterfaceC0761n interfaceC0761n = this.f68052a;
            int cursorOffset = this.f68053b.getCursorOffset();
            ieh transformedText = this.f68053b.getTransformedText();
            iug iugVarInvoke = this.f68053b.getTextLayoutResultProvider().invoke();
            this.f68053b.getScrollerPosition().update(t7c.Horizontal, msg.getCursorRectInScroller(interfaceC0761n, cursorOffset, transformedText, iugVarInvoke != null ? iugVarInvoke.getValue() : null, this.f68052a.getLayoutDirection() == ov8.Rtl, this.f68054c.getWidth()), this.f68055d, this.f68054c.getWidth());
            AbstractC0767t.a.placeRelative$default(aVar, this.f68054c, Math.round(-this.f68053b.getScrollerPosition().getOffset()), 0, 0.0f, 4, null);
        }
    }

    public ol7(@yfb nsg nsgVar, int i, @yfb ieh iehVar, @yfb ny6<iug> ny6Var) {
        this.f68048a = nsgVar;
        this.f68049b = i;
        this.f68050c = iehVar;
        this.f68051d = ny6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ol7 copy$default(ol7 ol7Var, nsg nsgVar, int i, ieh iehVar, ny6 ny6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nsgVar = ol7Var.f68048a;
        }
        if ((i2 & 2) != 0) {
            i = ol7Var.f68049b;
        }
        if ((i2 & 4) != 0) {
            iehVar = ol7Var.f68050c;
        }
        if ((i2 & 8) != 0) {
            ny6Var = ol7Var.f68051d;
        }
        return ol7Var.copy(nsgVar, i, iehVar, ny6Var);
    }

    @yfb
    public final nsg component1() {
        return this.f68048a;
    }

    public final int component2() {
        return this.f68049b;
    }

    @yfb
    public final ieh component3() {
        return this.f68050c;
    }

    @yfb
    public final ny6<iug> component4() {
        return this.f68051d;
    }

    @yfb
    public final ol7 copy(@yfb nsg nsgVar, int i, @yfb ieh iehVar, @yfb ny6<iug> ny6Var) {
        return new ol7(nsgVar, i, iehVar, ny6Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol7)) {
            return false;
        }
        ol7 ol7Var = (ol7) obj;
        return md8.areEqual(this.f68048a, ol7Var.f68048a) && this.f68049b == ol7Var.f68049b && md8.areEqual(this.f68050c, ol7Var.f68050c) && md8.areEqual(this.f68051d, ol7Var.f68051d);
    }

    public final int getCursorOffset() {
        return this.f68049b;
    }

    @yfb
    public final nsg getScrollerPosition() {
        return this.f68048a;
    }

    @yfb
    public final ny6<iug> getTextLayoutResultProvider() {
        return this.f68051d;
    }

    @yfb
    public final ieh getTransformedText() {
        return this.f68050c;
    }

    public int hashCode() {
        return (((((this.f68048a.hashCode() * 31) + Integer.hashCode(this.f68049b)) * 31) + this.f68050c.hashCode()) * 31) + this.f68051d.hashCode();
    }

    @Override // p000.cw8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27254measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(rbaVar.maxIntrinsicWidth(ku2.m30762getMaxHeightimpl(j)) < ku2.m30763getMaxWidthimpl(j) ? j : ku2.m30754copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        int iMin = Math.min(abstractC0767tMo27949measureBRTryo0.getWidth(), ku2.m30763getMaxWidthimpl(j));
        return InterfaceC0761n.layout$default(interfaceC0761n, iMin, abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C10453a(interfaceC0761n, this, abstractC0767tMo27949measureBRTryo0, iMin), 4, null);
    }

    @yfb
    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f68048a + ", cursorOffset=" + this.f68049b + ", transformedText=" + this.f68050c + ", textLayoutResultProvider=" + this.f68051d + ')';
    }
}
