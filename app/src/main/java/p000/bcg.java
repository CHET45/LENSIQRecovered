package p000;

import androidx.compose.foundation.text.handwriting.C0672c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class bcg extends acg implements ew8 {

    /* JADX INFO: renamed from: b2 */
    public static final int f13364b2 = 0;

    /* JADX INFO: renamed from: bcg$a */
    public static final class C1834a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f13365a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f13366b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f13367c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1834a(AbstractC0767t abstractC0767t, int i, int i2) {
            super(1);
            this.f13365a = abstractC0767t;
            this.f13366b = i;
            this.f13367c = i2;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.place$default(aVar, this.f13365a, -this.f13366b, -this.f13367c, 0.0f, 4, null);
        }
    }

    public bcg(@yfb ny6<Boolean> ny6Var) {
        super(ny6Var);
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        int iMo27167roundToPx0680j_4 = interfaceC0761n.mo27167roundToPx0680j_4(C0672c.getHandwritingBoundsVerticalOffset());
        int iMo27167roundToPx0680j_42 = interfaceC0761n.mo27167roundToPx0680j_4(C0672c.getHandwritingBoundsHorizontalOffset());
        int i = iMo27167roundToPx0680j_42 * 2;
        int i2 = iMo27167roundToPx0680j_4 * 2;
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(nu2.m31229offsetNN6EwU(j, i, i2));
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth() - i, abstractC0767tMo27949measureBRTryo0.getHeight() - i2, null, new C1834a(abstractC0767tMo27949measureBRTryo0, iMo27167roundToPx0680j_42, iMo27167roundToPx0680j_4), 4, null);
    }

    @Override // p000.p2d
    public boolean sharePointerInputWithSiblings() {
        return true;
    }
}
