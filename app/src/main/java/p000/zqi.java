package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
public final class zqi extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    @yfb
    public qd4 f105754X;

    /* JADX INFO: renamed from: Y */
    public boolean f105755Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public gz6<? super r78, ? super ov8, a78> f105756Z;

    /* JADX INFO: renamed from: zqi$a */
    public static final class C16219a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f105758b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0767t f105759c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f105760d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ InterfaceC0761n f105761e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16219a(int i, AbstractC0767t abstractC0767t, int i2, InterfaceC0761n interfaceC0761n) {
            super(1);
            this.f105758b = i;
            this.f105759c = abstractC0767t;
            this.f105760d = i2;
            this.f105761e = interfaceC0761n;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.m27711place70tqf50$default(aVar, this.f105759c, zqi.this.getAlignmentCallback().invoke(r78.m32079boximpl(s78.IntSize(this.f105758b - this.f105759c.getWidth(), this.f105760d - this.f105759c.getHeight())), this.f105761e.getLayoutDirection()).m27210unboximpl(), 0.0f, 2, null);
        }
    }

    public zqi(@yfb qd4 qd4Var, boolean z, @yfb gz6<? super r78, ? super ov8, a78> gz6Var) {
        this.f105754X = qd4Var;
        this.f105755Y = z;
        this.f105756Z = gz6Var;
    }

    @yfb
    public final gz6<r78, ov8, a78> getAlignmentCallback() {
        return this.f105756Z;
    }

    @yfb
    public final qd4 getDirection() {
        return this.f105754X;
    }

    public final boolean getUnbounded() {
        return this.f105755Y;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        qd4 qd4Var = this.f105754X;
        qd4 qd4Var2 = qd4.Vertical;
        int iM30765getMinWidthimpl = qd4Var != qd4Var2 ? 0 : ku2.m30765getMinWidthimpl(j);
        qd4 qd4Var3 = this.f105754X;
        qd4 qd4Var4 = qd4.Horizontal;
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(nu2.Constraints(iM30765getMinWidthimpl, (this.f105754X == qd4Var2 || !this.f105755Y) ? ku2.m30763getMaxWidthimpl(j) : Integer.MAX_VALUE, qd4Var3 == qd4Var4 ? ku2.m30764getMinHeightimpl(j) : 0, (this.f105754X == qd4Var4 || !this.f105755Y) ? ku2.m30762getMaxHeightimpl(j) : Integer.MAX_VALUE));
        int iCoerceIn = kpd.coerceIn(abstractC0767tMo27949measureBRTryo0.getWidth(), ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(j));
        int iCoerceIn2 = kpd.coerceIn(abstractC0767tMo27949measureBRTryo0.getHeight(), ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(j));
        return InterfaceC0761n.layout$default(interfaceC0761n, iCoerceIn, iCoerceIn2, null, new C16219a(iCoerceIn, abstractC0767tMo27949measureBRTryo0, iCoerceIn2, interfaceC0761n), 4, null);
    }

    public final void setAlignmentCallback(@yfb gz6<? super r78, ? super ov8, a78> gz6Var) {
        this.f105756Z = gz6Var;
    }

    public final void setDirection(@yfb qd4 qd4Var) {
        this.f105754X = qd4Var;
    }

    public final void setUnbounded(boolean z) {
        this.f105755Y = z;
    }
}
