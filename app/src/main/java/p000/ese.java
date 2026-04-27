package p000;

import androidx.compose.foundation.C0617l;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ese extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: M1 */
    public static final int f33970M1 = 8;

    /* JADX INFO: renamed from: X */
    @yfb
    public C0617l f33971X;

    /* JADX INFO: renamed from: Y */
    public boolean f33972Y;

    /* JADX INFO: renamed from: Z */
    public boolean f33973Z;

    /* JADX INFO: renamed from: ese$a */
    public static final class C5456a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f33975b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0767t f33976c;

        /* JADX INFO: renamed from: ese$a$a */
        public static final class a extends tt8 implements qy6<AbstractC0767t.a, bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractC0767t f33977a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f33978b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f33979c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC0767t abstractC0767t, int i, int i2) {
                super(1);
                this.f33977a = abstractC0767t;
                this.f33978b = i;
                this.f33979c = i2;
            }

            @Override // p000.qy6
            public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
                invoke2(aVar);
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@yfb AbstractC0767t.a aVar) {
                AbstractC0767t.a.placeRelativeWithLayer$default(aVar, this.f33977a, this.f33978b, this.f33979c, 0.0f, (qy6) null, 12, (Object) null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5456a(int i, AbstractC0767t abstractC0767t) {
            super(1);
            this.f33975b = i;
            this.f33976c = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            int iCoerceIn = kpd.coerceIn(ese.this.getScrollerState().getValue(), 0, this.f33975b);
            int i = ese.this.isReversed() ? iCoerceIn - this.f33975b : -iCoerceIn;
            aVar.withMotionFrameOfReferencePlacement(new a(this.f33976c, ese.this.isVertical() ? 0 : i, ese.this.isVertical() ? i : 0));
        }
    }

    public ese(@yfb C0617l c0617l, boolean z, boolean z2) {
        this.f33971X = c0617l;
        this.f33972Y = z;
        this.f33973Z = z2;
    }

    @yfb
    public final C0617l getScrollerState() {
        return this.f33971X;
    }

    public final boolean isReversed() {
        return this.f33972Y;
    }

    public final boolean isVertical() {
        return this.f33973Z;
    }

    @Override // p000.ew8
    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return this.f33973Z ? ed8Var.maxIntrinsicHeight(i) : ed8Var.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // p000.ew8
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return this.f33973Z ? ed8Var.maxIntrinsicWidth(Integer.MAX_VALUE) : ed8Var.maxIntrinsicWidth(i);
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        fy1.m29679checkScrollableContainerConstraintsK40F9xA(j, this.f33973Z ? t7c.Vertical : t7c.Horizontal);
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(ku2.m30754copyZbe2FdA$default(j, 0, this.f33973Z ? ku2.m30763getMaxWidthimpl(j) : Integer.MAX_VALUE, 0, this.f33973Z ? Integer.MAX_VALUE : ku2.m30762getMaxHeightimpl(j), 5, null));
        int iCoerceAtMost = kpd.coerceAtMost(abstractC0767tMo27949measureBRTryo0.getWidth(), ku2.m30763getMaxWidthimpl(j));
        int iCoerceAtMost2 = kpd.coerceAtMost(abstractC0767tMo27949measureBRTryo0.getHeight(), ku2.m30762getMaxHeightimpl(j));
        int height = abstractC0767tMo27949measureBRTryo0.getHeight() - iCoerceAtMost2;
        int width = abstractC0767tMo27949measureBRTryo0.getWidth() - iCoerceAtMost;
        if (!this.f33973Z) {
            height = width;
        }
        this.f33971X.setMaxValue$foundation_release(height);
        this.f33971X.setViewportSize$foundation_release(this.f33973Z ? iCoerceAtMost2 : iCoerceAtMost);
        return InterfaceC0761n.layout$default(interfaceC0761n, iCoerceAtMost, iCoerceAtMost2, null, new C5456a(height, abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    @Override // p000.ew8
    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return this.f33973Z ? ed8Var.minIntrinsicHeight(i) : ed8Var.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // p000.ew8
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return this.f33973Z ? ed8Var.minIntrinsicWidth(Integer.MAX_VALUE) : ed8Var.minIntrinsicWidth(i);
    }

    public final void setReversed(boolean z) {
        this.f33972Y = z;
    }

    public final void setScrollerState(@yfb C0617l c0617l) {
        this.f33971X = c0617l;
    }

    public final void setVertical(boolean z) {
        this.f33973Z = z;
    }
}
