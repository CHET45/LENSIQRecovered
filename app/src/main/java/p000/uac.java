package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,484:1\n148#2:485\n148#2:486\n148#2:487\n148#2:488\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingNode\n*L\n399#1:485\n400#1:486\n401#1:487\n402#1:488\n*E\n"})
public final class uac extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: M1 */
    public float f87297M1;

    /* JADX INFO: renamed from: V1 */
    public boolean f87298V1;

    /* JADX INFO: renamed from: X */
    public float f87299X;

    /* JADX INFO: renamed from: Y */
    public float f87300Y;

    /* JADX INFO: renamed from: Z */
    public float f87301Z;

    /* JADX INFO: renamed from: uac$a */
    public static final class C13431a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0767t f87303b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0761n f87304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13431a(AbstractC0767t abstractC0767t, InterfaceC0761n interfaceC0761n) {
            super(1);
            this.f87303b = abstractC0767t;
            this.f87304c = interfaceC0761n;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            if (uac.this.getRtlAware()) {
                AbstractC0767t.a.placeRelative$default(aVar, this.f87303b, this.f87304c.mo27167roundToPx0680j_4(uac.this.m32587getStartD9Ej5fM()), this.f87304c.mo27167roundToPx0680j_4(uac.this.m32588getTopD9Ej5fM()), 0.0f, 4, null);
            } else {
                AbstractC0767t.a.place$default(aVar, this.f87303b, this.f87304c.mo27167roundToPx0680j_4(uac.this.m32587getStartD9Ej5fM()), this.f87304c.mo27167roundToPx0680j_4(uac.this.m32588getTopD9Ej5fM()), 0.0f, 4, null);
            }
        }
    }

    public /* synthetic */ uac(float f, float f2, float f3, float f4, boolean z, jt3 jt3Var) {
        this(f, f2, f3, f4, z);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m32585getBottomD9Ej5fM() {
        return this.f87297M1;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m32586getEndD9Ej5fM() {
        return this.f87301Z;
    }

    public final boolean getRtlAware() {
        return this.f87298V1;
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m32587getStartD9Ej5fM() {
        return this.f87299X;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m32588getTopD9Ej5fM() {
        return this.f87300Y;
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        int iMo27167roundToPx0680j_4 = interfaceC0761n.mo27167roundToPx0680j_4(this.f87299X) + interfaceC0761n.mo27167roundToPx0680j_4(this.f87301Z);
        int iMo27167roundToPx0680j_42 = interfaceC0761n.mo27167roundToPx0680j_4(this.f87300Y) + interfaceC0761n.mo27167roundToPx0680j_4(this.f87297M1);
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(nu2.m31229offsetNN6EwU(j, -iMo27167roundToPx0680j_4, -iMo27167roundToPx0680j_42));
        return InterfaceC0761n.layout$default(interfaceC0761n, nu2.m31227constrainWidthK40F9xA(j, abstractC0767tMo27949measureBRTryo0.getWidth() + iMo27167roundToPx0680j_4), nu2.m31226constrainHeightK40F9xA(j, abstractC0767tMo27949measureBRTryo0.getHeight() + iMo27167roundToPx0680j_42), null, new C13431a(abstractC0767tMo27949measureBRTryo0, interfaceC0761n), 4, null);
    }

    /* JADX INFO: renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m32589setBottom0680j_4(float f) {
        this.f87297M1 = f;
    }

    /* JADX INFO: renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m32590setEnd0680j_4(float f) {
        this.f87301Z = f;
    }

    public final void setRtlAware(boolean z) {
        this.f87298V1 = z;
    }

    /* JADX INFO: renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m32591setStart0680j_4(float f) {
        this.f87299X = f;
    }

    /* JADX INFO: renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m32592setTop0680j_4(float f) {
        this.f87300Y = f;
    }

    private uac(float f, float f2, float f3, float f4, boolean z) {
        this.f87299X = f;
        this.f87300Y = f2;
        this.f87301Z = f3;
        this.f87297M1 = f4;
        this.f87298V1 = z;
    }

    public /* synthetic */ uac(float f, float f2, float f3, float f4, boolean z, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? kn4.m30705constructorimpl(0) : f, (i & 2) != 0 ? kn4.m30705constructorimpl(0) : f2, (i & 4) != 0 ? kn4.m30705constructorimpl(0) : f3, (i & 8) != 0 ? kn4.m30705constructorimpl(0) : f4, z, null);
    }
}
