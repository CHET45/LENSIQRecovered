package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import p000.kn4;

/* JADX INFO: loaded from: classes.dex */
public final class fqf extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: M1 */
    public float f37522M1;

    /* JADX INFO: renamed from: V1 */
    public boolean f37523V1;

    /* JADX INFO: renamed from: X */
    public float f37524X;

    /* JADX INFO: renamed from: Y */
    public float f37525Y;

    /* JADX INFO: renamed from: Z */
    public float f37526Z;

    /* JADX INFO: renamed from: fqf$a */
    public static final class C5935a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f37527a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5935a(AbstractC0767t abstractC0767t) {
            super(1);
            this.f37527a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.placeRelative$default(aVar, this.f37527a, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ fqf(float f, float f2, float f3, float f4, boolean z, jt3 jt3Var) {
        this(f, f2, f3, f4, z);
    }

    /* JADX INFO: renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m29601getTargetConstraintsOenEA2s(c64 c64Var) {
        int iCoerceAtLeast;
        int iCoerceAtLeast2;
        float f = this.f37526Z;
        kn4.C8460a c8460a = kn4.f54774b;
        int i = 0;
        int iCoerceAtLeast3 = !kn4.m30710equalsimpl0(f, c8460a.m30725getUnspecifiedD9Ej5fM()) ? kpd.coerceAtLeast(c64Var.mo27167roundToPx0680j_4(this.f37526Z), 0) : Integer.MAX_VALUE;
        int iCoerceAtLeast4 = !kn4.m30710equalsimpl0(this.f37522M1, c8460a.m30725getUnspecifiedD9Ej5fM()) ? kpd.coerceAtLeast(c64Var.mo27167roundToPx0680j_4(this.f37522M1), 0) : Integer.MAX_VALUE;
        if (kn4.m30710equalsimpl0(this.f37524X, c8460a.m30725getUnspecifiedD9Ej5fM()) || (iCoerceAtLeast = kpd.coerceAtLeast(kpd.coerceAtMost(c64Var.mo27167roundToPx0680j_4(this.f37524X), iCoerceAtLeast3), 0)) == Integer.MAX_VALUE) {
            iCoerceAtLeast = 0;
        }
        if (!kn4.m30710equalsimpl0(this.f37525Y, c8460a.m30725getUnspecifiedD9Ej5fM()) && (iCoerceAtLeast2 = kpd.coerceAtLeast(kpd.coerceAtMost(c64Var.mo27167roundToPx0680j_4(this.f37525Y), iCoerceAtLeast4), 0)) != Integer.MAX_VALUE) {
            i = iCoerceAtLeast2;
        }
        return nu2.Constraints(iCoerceAtLeast, iCoerceAtLeast3, i, iCoerceAtLeast4);
    }

    public final boolean getEnforceIncoming() {
        return this.f37523V1;
    }

    /* JADX INFO: renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    public final float m29602getMaxHeightD9Ej5fM() {
        return this.f37522M1;
    }

    /* JADX INFO: renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m29603getMaxWidthD9Ej5fM() {
        return this.f37526Z;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m29604getMinHeightD9Ej5fM() {
        return this.f37525Y;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m29605getMinWidthD9Ej5fM() {
        return this.f37524X;
    }

    @Override // p000.ew8
    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        long jM29601getTargetConstraintsOenEA2s = m29601getTargetConstraintsOenEA2s(gd8Var);
        return ku2.m30760getHasFixedHeightimpl(jM29601getTargetConstraintsOenEA2s) ? ku2.m30762getMaxHeightimpl(jM29601getTargetConstraintsOenEA2s) : nu2.m31226constrainHeightK40F9xA(jM29601getTargetConstraintsOenEA2s, ed8Var.maxIntrinsicHeight(i));
    }

    @Override // p000.ew8
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        long jM29601getTargetConstraintsOenEA2s = m29601getTargetConstraintsOenEA2s(gd8Var);
        return ku2.m30761getHasFixedWidthimpl(jM29601getTargetConstraintsOenEA2s) ? ku2.m30763getMaxWidthimpl(jM29601getTargetConstraintsOenEA2s) : nu2.m31227constrainWidthK40F9xA(jM29601getTargetConstraintsOenEA2s, ed8Var.maxIntrinsicWidth(i));
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        long jConstraints;
        long jM29601getTargetConstraintsOenEA2s = m29601getTargetConstraintsOenEA2s(interfaceC0761n);
        if (this.f37523V1) {
            jConstraints = nu2.m31225constrainN9IONVI(j, jM29601getTargetConstraintsOenEA2s);
        } else {
            float f = this.f37524X;
            kn4.C8460a c8460a = kn4.f54774b;
            jConstraints = nu2.Constraints(!kn4.m30710equalsimpl0(f, c8460a.m30725getUnspecifiedD9Ej5fM()) ? ku2.m30765getMinWidthimpl(jM29601getTargetConstraintsOenEA2s) : kpd.coerceAtMost(ku2.m30765getMinWidthimpl(j), ku2.m30763getMaxWidthimpl(jM29601getTargetConstraintsOenEA2s)), !kn4.m30710equalsimpl0(this.f37526Z, c8460a.m30725getUnspecifiedD9Ej5fM()) ? ku2.m30763getMaxWidthimpl(jM29601getTargetConstraintsOenEA2s) : kpd.coerceAtLeast(ku2.m30763getMaxWidthimpl(j), ku2.m30765getMinWidthimpl(jM29601getTargetConstraintsOenEA2s)), !kn4.m30710equalsimpl0(this.f37525Y, c8460a.m30725getUnspecifiedD9Ej5fM()) ? ku2.m30764getMinHeightimpl(jM29601getTargetConstraintsOenEA2s) : kpd.coerceAtMost(ku2.m30764getMinHeightimpl(j), ku2.m30762getMaxHeightimpl(jM29601getTargetConstraintsOenEA2s)), !kn4.m30710equalsimpl0(this.f37522M1, c8460a.m30725getUnspecifiedD9Ej5fM()) ? ku2.m30762getMaxHeightimpl(jM29601getTargetConstraintsOenEA2s) : kpd.coerceAtLeast(ku2.m30762getMaxHeightimpl(j), ku2.m30764getMinHeightimpl(jM29601getTargetConstraintsOenEA2s)));
        }
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(jConstraints);
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C5935a(abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    @Override // p000.ew8
    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        long jM29601getTargetConstraintsOenEA2s = m29601getTargetConstraintsOenEA2s(gd8Var);
        return ku2.m30760getHasFixedHeightimpl(jM29601getTargetConstraintsOenEA2s) ? ku2.m30762getMaxHeightimpl(jM29601getTargetConstraintsOenEA2s) : nu2.m31226constrainHeightK40F9xA(jM29601getTargetConstraintsOenEA2s, ed8Var.minIntrinsicHeight(i));
    }

    @Override // p000.ew8
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        long jM29601getTargetConstraintsOenEA2s = m29601getTargetConstraintsOenEA2s(gd8Var);
        return ku2.m30761getHasFixedWidthimpl(jM29601getTargetConstraintsOenEA2s) ? ku2.m30763getMaxWidthimpl(jM29601getTargetConstraintsOenEA2s) : nu2.m31227constrainWidthK40F9xA(jM29601getTargetConstraintsOenEA2s, ed8Var.minIntrinsicWidth(i));
    }

    public final void setEnforceIncoming(boolean z) {
        this.f37523V1 = z;
    }

    /* JADX INFO: renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m29606setMaxHeight0680j_4(float f) {
        this.f37522M1 = f;
    }

    /* JADX INFO: renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m29607setMaxWidth0680j_4(float f) {
        this.f37526Z = f;
    }

    /* JADX INFO: renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m29608setMinHeight0680j_4(float f) {
        this.f37525Y = f;
    }

    /* JADX INFO: renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m29609setMinWidth0680j_4(float f) {
        this.f37524X = f;
    }

    public /* synthetic */ fqf(float f, float f2, float f3, float f4, boolean z, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? kn4.f54774b.m30725getUnspecifiedD9Ej5fM() : f, (i & 2) != 0 ? kn4.f54774b.m30725getUnspecifiedD9Ej5fM() : f2, (i & 4) != 0 ? kn4.f54774b.m30725getUnspecifiedD9Ej5fM() : f3, (i & 8) != 0 ? kn4.f54774b.m30725getUnspecifiedD9Ej5fM() : f4, z, null);
    }

    private fqf(float f, float f2, float f3, float f4, boolean z) {
        this.f37524X = f;
        this.f37525Y = f2;
        this.f37526Z = f3;
        this.f37522M1 = f4;
        this.f37523V1 = z;
    }
}
