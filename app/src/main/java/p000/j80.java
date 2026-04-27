package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import p000.r78;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n26#2:237\n26#2:238\n26#2:239\n26#2:240\n26#2:242\n26#2:243\n26#2:244\n26#2:245\n1#3:241\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n*L\n129#1:237\n138#1:238\n147#1:239\n156#1:240\n187#1:242\n201#1:243\n214#1:244\n226#1:245\n*E\n"})
public final class j80 extends InterfaceC0701e.d implements ew8 {

    /* JADX INFO: renamed from: X */
    public float f49804X;

    /* JADX INFO: renamed from: Y */
    public boolean f49805Y;

    /* JADX INFO: renamed from: j80$a */
    public static final class C7777a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f49806a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7777a(AbstractC0767t abstractC0767t) {
            super(1);
            this.f49806a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.placeRelative$default(aVar, this.f49806a, 0, 0, 0.0f, 4, null);
        }
    }

    public j80(float f, boolean z) {
        this.f49804X = f;
        this.f49805Y = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ long m13834a(j80 j80Var, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return j80Var.m30475tryMaxHeightJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ long m13835b(j80 j80Var, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return j80Var.m30476tryMaxWidthJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ long m13836c(j80 j80Var, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return j80Var.m30477tryMinHeightJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m13837d(j80 j80Var, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return j80Var.m30478tryMinWidthJN0ABg(j, z);
    }

    /* JADX INFO: renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m30474findSizeToXhtMw(long j) {
        if (this.f49805Y) {
            long jM13834a = m13834a(this, j, false, 1, null);
            r78.C11932a c11932a = r78.f77324b;
            if (!r78.m32085equalsimpl0(jM13834a, c11932a.m32092getZeroYbymL2g())) {
                return jM13834a;
            }
            long jM13835b = m13835b(this, j, false, 1, null);
            if (!r78.m32085equalsimpl0(jM13835b, c11932a.m32092getZeroYbymL2g())) {
                return jM13835b;
            }
            long jM13836c = m13836c(this, j, false, 1, null);
            if (!r78.m32085equalsimpl0(jM13836c, c11932a.m32092getZeroYbymL2g())) {
                return jM13836c;
            }
            long jM13837d = m13837d(this, j, false, 1, null);
            if (!r78.m32085equalsimpl0(jM13837d, c11932a.m32092getZeroYbymL2g())) {
                return jM13837d;
            }
            long jM30475tryMaxHeightJN0ABg = m30475tryMaxHeightJN0ABg(j, false);
            if (!r78.m32085equalsimpl0(jM30475tryMaxHeightJN0ABg, c11932a.m32092getZeroYbymL2g())) {
                return jM30475tryMaxHeightJN0ABg;
            }
            long jM30476tryMaxWidthJN0ABg = m30476tryMaxWidthJN0ABg(j, false);
            if (!r78.m32085equalsimpl0(jM30476tryMaxWidthJN0ABg, c11932a.m32092getZeroYbymL2g())) {
                return jM30476tryMaxWidthJN0ABg;
            }
            long jM30477tryMinHeightJN0ABg = m30477tryMinHeightJN0ABg(j, false);
            if (!r78.m32085equalsimpl0(jM30477tryMinHeightJN0ABg, c11932a.m32092getZeroYbymL2g())) {
                return jM30477tryMinHeightJN0ABg;
            }
            long jM30478tryMinWidthJN0ABg = m30478tryMinWidthJN0ABg(j, false);
            if (!r78.m32085equalsimpl0(jM30478tryMinWidthJN0ABg, c11932a.m32092getZeroYbymL2g())) {
                return jM30478tryMinWidthJN0ABg;
            }
        } else {
            long jM13835b2 = m13835b(this, j, false, 1, null);
            r78.C11932a c11932a2 = r78.f77324b;
            if (!r78.m32085equalsimpl0(jM13835b2, c11932a2.m32092getZeroYbymL2g())) {
                return jM13835b2;
            }
            long jM13834a2 = m13834a(this, j, false, 1, null);
            if (!r78.m32085equalsimpl0(jM13834a2, c11932a2.m32092getZeroYbymL2g())) {
                return jM13834a2;
            }
            long jM13837d2 = m13837d(this, j, false, 1, null);
            if (!r78.m32085equalsimpl0(jM13837d2, c11932a2.m32092getZeroYbymL2g())) {
                return jM13837d2;
            }
            long jM13836c2 = m13836c(this, j, false, 1, null);
            if (!r78.m32085equalsimpl0(jM13836c2, c11932a2.m32092getZeroYbymL2g())) {
                return jM13836c2;
            }
            long jM30476tryMaxWidthJN0ABg2 = m30476tryMaxWidthJN0ABg(j, false);
            if (!r78.m32085equalsimpl0(jM30476tryMaxWidthJN0ABg2, c11932a2.m32092getZeroYbymL2g())) {
                return jM30476tryMaxWidthJN0ABg2;
            }
            long jM30475tryMaxHeightJN0ABg2 = m30475tryMaxHeightJN0ABg(j, false);
            if (!r78.m32085equalsimpl0(jM30475tryMaxHeightJN0ABg2, c11932a2.m32092getZeroYbymL2g())) {
                return jM30475tryMaxHeightJN0ABg2;
            }
            long jM30478tryMinWidthJN0ABg2 = m30478tryMinWidthJN0ABg(j, false);
            if (!r78.m32085equalsimpl0(jM30478tryMinWidthJN0ABg2, c11932a2.m32092getZeroYbymL2g())) {
                return jM30478tryMinWidthJN0ABg2;
            }
            long jM30477tryMinHeightJN0ABg2 = m30477tryMinHeightJN0ABg(j, false);
            if (!r78.m32085equalsimpl0(jM30477tryMinHeightJN0ABg2, c11932a2.m32092getZeroYbymL2g())) {
                return jM30477tryMinHeightJN0ABg2;
            }
        }
        return r78.f77324b.m32092getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m30475tryMaxHeightJN0ABg(long j, boolean z) {
        int iRound;
        int iM30762getMaxHeightimpl = ku2.m30762getMaxHeightimpl(j);
        if (iM30762getMaxHeightimpl != Integer.MAX_VALUE && (iRound = Math.round(iM30762getMaxHeightimpl * this.f49804X)) > 0) {
            long jIntSize = s78.IntSize(iRound, iM30762getMaxHeightimpl);
            if (!z || nu2.m31228isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return r78.f77324b.m32092getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m30476tryMaxWidthJN0ABg(long j, boolean z) {
        int iRound;
        int iM30763getMaxWidthimpl = ku2.m30763getMaxWidthimpl(j);
        if (iM30763getMaxWidthimpl != Integer.MAX_VALUE && (iRound = Math.round(iM30763getMaxWidthimpl / this.f49804X)) > 0) {
            long jIntSize = s78.IntSize(iM30763getMaxWidthimpl, iRound);
            if (!z || nu2.m31228isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return r78.f77324b.m32092getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m30477tryMinHeightJN0ABg(long j, boolean z) {
        int iM30764getMinHeightimpl = ku2.m30764getMinHeightimpl(j);
        int iRound = Math.round(iM30764getMinHeightimpl * this.f49804X);
        if (iRound > 0) {
            long jIntSize = s78.IntSize(iRound, iM30764getMinHeightimpl);
            if (!z || nu2.m31228isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return r78.f77324b.m32092getZeroYbymL2g();
    }

    /* JADX INFO: renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m30478tryMinWidthJN0ABg(long j, boolean z) {
        int iM30765getMinWidthimpl = ku2.m30765getMinWidthimpl(j);
        int iRound = Math.round(iM30765getMinWidthimpl / this.f49804X);
        if (iRound > 0) {
            long jIntSize = s78.IntSize(iM30765getMinWidthimpl, iRound);
            if (!z || nu2.m31228isSatisfiedBy4WqzIAM(j, jIntSize)) {
                return jIntSize;
            }
        }
        return r78.f77324b.m32092getZeroYbymL2g();
    }

    public final float getAspectRatio() {
        return this.f49804X;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.f49805Y;
    }

    @Override // p000.ew8
    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f49804X) : ed8Var.maxIntrinsicHeight(i);
    }

    @Override // p000.ew8
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f49804X) : ed8Var.maxIntrinsicWidth(i);
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        long jM30474findSizeToXhtMw = m30474findSizeToXhtMw(j);
        if (!r78.m32085equalsimpl0(jM30474findSizeToXhtMw, r78.f77324b.m32092getZeroYbymL2g())) {
            j = ku2.f55323b.m30773fixedJhjzzOo(r78.m32087getWidthimpl(jM30474findSizeToXhtMw), r78.m32086getHeightimpl(jM30474findSizeToXhtMw));
        }
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(j);
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C7777a(abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    @Override // p000.ew8
    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f49804X) : ed8Var.minIntrinsicHeight(i);
    }

    @Override // p000.ew8
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f49804X) : ed8Var.minIntrinsicWidth(i);
    }

    public final void setAspectRatio(float f) {
        this.f49804X = f;
    }

    public final void setMatchHeightConstraintsFirst(boolean z) {
        this.f49805Y = z;
    }
}
