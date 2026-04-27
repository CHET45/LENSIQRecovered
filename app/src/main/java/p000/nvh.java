package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import p000.kn4;

/* JADX INFO: loaded from: classes.dex */
public final class nvh extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    public float f65834X;

    /* JADX INFO: renamed from: Y */
    public float f65835Y;

    /* JADX INFO: renamed from: nvh$a */
    public static final class C10089a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f65836a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10089a(AbstractC0767t abstractC0767t) {
            super(1);
            this.f65836a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.placeRelative$default(aVar, this.f65836a, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ nvh(float f, float f2, jt3 jt3Var) {
        this(f, f2);
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m31252getMinHeightD9Ej5fM() {
        return this.f65835Y;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m31253getMinWidthD9Ej5fM() {
        return this.f65834X;
    }

    @Override // p000.ew8
    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return kpd.coerceAtLeast(ed8Var.maxIntrinsicHeight(i), !kn4.m30710equalsimpl0(this.f65835Y, kn4.f54774b.m30725getUnspecifiedD9Ej5fM()) ? gd8Var.mo27167roundToPx0680j_4(this.f65835Y) : 0);
    }

    @Override // p000.ew8
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return kpd.coerceAtLeast(ed8Var.maxIntrinsicWidth(i), !kn4.m30710equalsimpl0(this.f65834X, kn4.f54774b.m30725getUnspecifiedD9Ej5fM()) ? gd8Var.mo27167roundToPx0680j_4(this.f65834X) : 0);
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        float f = this.f65834X;
        kn4.C8460a c8460a = kn4.f54774b;
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(nu2.Constraints((kn4.m30710equalsimpl0(f, c8460a.m30725getUnspecifiedD9Ej5fM()) || ku2.m30765getMinWidthimpl(j) != 0) ? ku2.m30765getMinWidthimpl(j) : kpd.coerceAtLeast(kpd.coerceAtMost(interfaceC0761n.mo27167roundToPx0680j_4(this.f65834X), ku2.m30763getMaxWidthimpl(j)), 0), ku2.m30763getMaxWidthimpl(j), (kn4.m30710equalsimpl0(this.f65835Y, c8460a.m30725getUnspecifiedD9Ej5fM()) || ku2.m30764getMinHeightimpl(j) != 0) ? ku2.m30764getMinHeightimpl(j) : kpd.coerceAtLeast(kpd.coerceAtMost(interfaceC0761n.mo27167roundToPx0680j_4(this.f65835Y), ku2.m30762getMaxHeightimpl(j)), 0), ku2.m30762getMaxHeightimpl(j)));
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C10089a(abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    @Override // p000.ew8
    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return kpd.coerceAtLeast(ed8Var.minIntrinsicHeight(i), !kn4.m30710equalsimpl0(this.f65835Y, kn4.f54774b.m30725getUnspecifiedD9Ej5fM()) ? gd8Var.mo27167roundToPx0680j_4(this.f65835Y) : 0);
    }

    @Override // p000.ew8
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return kpd.coerceAtLeast(ed8Var.minIntrinsicWidth(i), !kn4.m30710equalsimpl0(this.f65834X, kn4.f54774b.m30725getUnspecifiedD9Ej5fM()) ? gd8Var.mo27167roundToPx0680j_4(this.f65834X) : 0);
    }

    /* JADX INFO: renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m31254setMinHeight0680j_4(float f) {
        this.f65835Y = f;
    }

    /* JADX INFO: renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m31255setMinWidth0680j_4(float f) {
        this.f65834X = f;
    }

    public /* synthetic */ nvh(float f, float f2, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? kn4.f54774b.m30725getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? kn4.f54774b.m30725getUnspecifiedD9Ej5fM() : f2, null);
    }

    private nvh(float f, float f2) {
        this.f65834X = f;
        this.f65835Y = f2;
    }
}
