package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.InterfaceC0761n;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nPainterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,362:1\n198#2:363\n26#3:364\n26#3:365\n26#3:366\n26#3:367\n26#3:368\n26#3:369\n128#4,7:370\n*S KotlinDebug\n*F\n+ 1 PainterModifier.kt\nandroidx/compose/ui/draw/PainterNode\n*L\n163#1:363\n273#1:364\n280#1:365\n299#1:366\n300#1:367\n329#1:368\n330#1:369\n341#1:370,7\n*E\n"})
public final class pcc extends InterfaceC0701e.d implements ew8, fp4 {

    /* JADX INFO: renamed from: M1 */
    @yfb
    public ww2 f70325M1;

    /* JADX INFO: renamed from: V1 */
    public float f70326V1;

    /* JADX INFO: renamed from: X */
    @yfb
    public occ f70327X;

    /* JADX INFO: renamed from: Y */
    public boolean f70328Y;

    /* JADX INFO: renamed from: Z */
    @yfb
    public InterfaceC9407mm f70329Z;

    /* JADX INFO: renamed from: Z1 */
    @gib
    public b92 f70330Z1;

    /* JADX INFO: renamed from: pcc$a */
    public static final class C10902a extends tt8 implements qy6<AbstractC0767t.a, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0767t f70331a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10902a(AbstractC0767t abstractC0767t) {
            super(1);
            this.f70331a = abstractC0767t;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(AbstractC0767t.a aVar) {
            invoke2(aVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb AbstractC0767t.a aVar) {
            AbstractC0767t.a.placeRelative$default(aVar, this.f70331a, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ pcc(occ occVar, boolean z, InterfaceC9407mm interfaceC9407mm, ww2 ww2Var, float f, b92 b92Var, int i, jt3 jt3Var) {
        this(occVar, z, (i & 4) != 0 ? InterfaceC9407mm.f61437a.getCenter() : interfaceC9407mm, (i & 8) != 0 ? ww2.f95584a.getInside() : ww2Var, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : b92Var);
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m31778calculateScaledSizeE7KxVPU(long j) {
        if (!getUseIntrinsicSize()) {
            return j;
        }
        long jSize = eqf.Size(!m31780hasSpecifiedAndFiniteWidthuvyYCjk(this.f70327X.mo28196getIntrinsicSizeNHjbRc()) ? wpf.m33069getWidthimpl(j) : wpf.m33069getWidthimpl(this.f70327X.mo28196getIntrinsicSizeNHjbRc()), !m31779hasSpecifiedAndFiniteHeightuvyYCjk(this.f70327X.mo28196getIntrinsicSizeNHjbRc()) ? wpf.m33066getHeightimpl(j) : wpf.m33066getHeightimpl(this.f70327X.mo28196getIntrinsicSizeNHjbRc()));
        return (wpf.m33069getWidthimpl(j) == 0.0f || wpf.m33066getHeightimpl(j) == 0.0f) ? wpf.f95046b.m33078getZeroNHjbRc() : qme.m31957timesUQTWf7w(jSize, this.f70325M1.mo29683computeScaleFactorH7hwNQA(jSize, j));
    }

    private final boolean getUseIntrinsicSize() {
        return this.f70328Y && this.f70327X.mo28196getIntrinsicSizeNHjbRc() != j28.f49422d;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m31779hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        if (!wpf.m33065equalsimpl0(j, wpf.f95046b.m33077getUnspecifiedNHjbRc())) {
            float fM33066getHeightimpl = wpf.m33066getHeightimpl(j);
            if (!Float.isInfinite(fM33066getHeightimpl) && !Float.isNaN(fM33066getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m31780hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        if (!wpf.m33065equalsimpl0(j, wpf.f95046b.m33077getUnspecifiedNHjbRc())) {
            float fM33069getWidthimpl = wpf.m33069getWidthimpl(j);
            if (!Float.isInfinite(fM33069getWidthimpl) && !Float.isNaN(fM33069getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m31781modifyConstraintsZezNO4M(long j) {
        boolean z = false;
        boolean z2 = ku2.m30759getHasBoundedWidthimpl(j) && ku2.m30758getHasBoundedHeightimpl(j);
        if (ku2.m30761getHasFixedWidthimpl(j) && ku2.m30760getHasFixedHeightimpl(j)) {
            z = true;
        }
        if ((!getUseIntrinsicSize() && z2) || z) {
            return ku2.m30754copyZbe2FdA$default(j, ku2.m30763getMaxWidthimpl(j), 0, ku2.m30762getMaxHeightimpl(j), 0, 10, null);
        }
        long jMo28196getIntrinsicSizeNHjbRc = this.f70327X.mo28196getIntrinsicSizeNHjbRc();
        long jM31778calculateScaledSizeE7KxVPU = m31778calculateScaledSizeE7KxVPU(eqf.Size(nu2.m31227constrainWidthK40F9xA(j, m31780hasSpecifiedAndFiniteWidthuvyYCjk(jMo28196getIntrinsicSizeNHjbRc) ? Math.round(wpf.m33069getWidthimpl(jMo28196getIntrinsicSizeNHjbRc)) : ku2.m30765getMinWidthimpl(j)), nu2.m31226constrainHeightK40F9xA(j, m31779hasSpecifiedAndFiniteHeightuvyYCjk(jMo28196getIntrinsicSizeNHjbRc) ? Math.round(wpf.m33066getHeightimpl(jMo28196getIntrinsicSizeNHjbRc)) : ku2.m30764getMinHeightimpl(j))));
        return ku2.m30754copyZbe2FdA$default(j, nu2.m31227constrainWidthK40F9xA(j, Math.round(wpf.m33069getWidthimpl(jM31778calculateScaledSizeE7KxVPU))), 0, nu2.m31226constrainHeightK40F9xA(j, Math.round(wpf.m33066getHeightimpl(jM31778calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        long jMo28196getIntrinsicSizeNHjbRc = this.f70327X.mo28196getIntrinsicSizeNHjbRc();
        long jSize = eqf.Size(m31780hasSpecifiedAndFiniteWidthuvyYCjk(jMo28196getIntrinsicSizeNHjbRc) ? wpf.m33069getWidthimpl(jMo28196getIntrinsicSizeNHjbRc) : wpf.m33069getWidthimpl(ov2Var.mo30273getSizeNHjbRc()), m31779hasSpecifiedAndFiniteHeightuvyYCjk(jMo28196getIntrinsicSizeNHjbRc) ? wpf.m33066getHeightimpl(jMo28196getIntrinsicSizeNHjbRc) : wpf.m33066getHeightimpl(ov2Var.mo30273getSizeNHjbRc()));
        long jM33078getZeroNHjbRc = (wpf.m33069getWidthimpl(ov2Var.mo30273getSizeNHjbRc()) == 0.0f || wpf.m33066getHeightimpl(ov2Var.mo30273getSizeNHjbRc()) == 0.0f) ? wpf.f95046b.m33078getZeroNHjbRc() : qme.m31957timesUQTWf7w(jSize, this.f70325M1.mo29683computeScaleFactorH7hwNQA(jSize, ov2Var.mo30273getSizeNHjbRc()));
        long jMo30996alignKFBX0sM = this.f70329Z.mo30996alignKFBX0sM(s78.IntSize(Math.round(wpf.m33069getWidthimpl(jM33078getZeroNHjbRc)), Math.round(wpf.m33066getHeightimpl(jM33078getZeroNHjbRc))), s78.IntSize(Math.round(wpf.m33069getWidthimpl(ov2Var.mo30273getSizeNHjbRc())), Math.round(wpf.m33066getHeightimpl(ov2Var.mo30273getSizeNHjbRc()))), ov2Var.getLayoutDirection());
        float fM27201getXimpl = a78.m27201getXimpl(jMo30996alignKFBX0sM);
        float fM27202getYimpl = a78.m27202getYimpl(jMo30996alignKFBX0sM);
        ov2Var.getDrawContext().getTransform().translate(fM27201getXimpl, fM27202getYimpl);
        try {
            this.f70327X.m31327drawx_KDEd0(ov2Var, jM33078getZeroNHjbRc, this.f70326V1, this.f70330Z1);
            ov2Var.getDrawContext().getTransform().translate(-fM27201getXimpl, -fM27202getYimpl);
            ov2Var.drawContent();
        } catch (Throwable th) {
            ov2Var.getDrawContext().getTransform().translate(-fM27201getXimpl, -fM27202getYimpl);
            throw th;
        }
    }

    @yfb
    public final InterfaceC9407mm getAlignment() {
        return this.f70329Z;
    }

    public final float getAlpha() {
        return this.f70326V1;
    }

    @gib
    public final b92 getColorFilter() {
        return this.f70330Z1;
    }

    @yfb
    public final ww2 getContentScale() {
        return this.f70325M1;
    }

    @yfb
    public final occ getPainter() {
        return this.f70327X;
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.f70328Y;
    }

    @Override // p000.ew8
    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        if (!getUseIntrinsicSize()) {
            return ed8Var.maxIntrinsicHeight(i);
        }
        long jM31781modifyConstraintsZezNO4M = m31781modifyConstraintsZezNO4M(nu2.Constraints$default(0, i, 0, 0, 13, null));
        return Math.max(ku2.m30764getMinHeightimpl(jM31781modifyConstraintsZezNO4M), ed8Var.maxIntrinsicHeight(i));
    }

    @Override // p000.ew8
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        if (!getUseIntrinsicSize()) {
            return ed8Var.maxIntrinsicWidth(i);
        }
        long jM31781modifyConstraintsZezNO4M = m31781modifyConstraintsZezNO4M(nu2.Constraints$default(0, 0, 0, i, 7, null));
        return Math.max(ku2.m30765getMinWidthimpl(jM31781modifyConstraintsZezNO4M), ed8Var.maxIntrinsicWidth(i));
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        AbstractC0767t abstractC0767tMo27949measureBRTryo0 = rbaVar.mo27949measureBRTryo0(m31781modifyConstraintsZezNO4M(j));
        return InterfaceC0761n.layout$default(interfaceC0761n, abstractC0767tMo27949measureBRTryo0.getWidth(), abstractC0767tMo27949measureBRTryo0.getHeight(), null, new C10902a(abstractC0767tMo27949measureBRTryo0), 4, null);
    }

    @Override // p000.ew8
    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        if (!getUseIntrinsicSize()) {
            return ed8Var.minIntrinsicHeight(i);
        }
        long jM31781modifyConstraintsZezNO4M = m31781modifyConstraintsZezNO4M(nu2.Constraints$default(0, i, 0, 0, 13, null));
        return Math.max(ku2.m30764getMinHeightimpl(jM31781modifyConstraintsZezNO4M), ed8Var.minIntrinsicHeight(i));
    }

    @Override // p000.ew8
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        if (!getUseIntrinsicSize()) {
            return ed8Var.minIntrinsicWidth(i);
        }
        long jM31781modifyConstraintsZezNO4M = m31781modifyConstraintsZezNO4M(nu2.Constraints$default(0, 0, 0, i, 7, null));
        return Math.max(ku2.m30765getMinWidthimpl(jM31781modifyConstraintsZezNO4M), ed8Var.minIntrinsicWidth(i));
    }

    public final void setAlignment(@yfb InterfaceC9407mm interfaceC9407mm) {
        this.f70329Z = interfaceC9407mm;
    }

    public final void setAlpha(float f) {
        this.f70326V1 = f;
    }

    public final void setColorFilter(@gib b92 b92Var) {
        this.f70330Z1 = b92Var;
    }

    public final void setContentScale(@yfb ww2 ww2Var) {
        this.f70325M1 = ww2Var;
    }

    public final void setPainter(@yfb occ occVar) {
        this.f70327X = occVar;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.f70328Y = z;
    }

    @yfb
    public String toString() {
        return "PainterModifier(painter=" + this.f70327X + ", sizeToIntrinsics=" + this.f70328Y + ", alignment=" + this.f70329Z + ", alpha=" + this.f70326V1 + ", colorFilter=" + this.f70330Z1 + ')';
    }

    public pcc(@yfb occ occVar, boolean z, @yfb InterfaceC9407mm interfaceC9407mm, @yfb ww2 ww2Var, float f, @gib b92 b92Var) {
        this.f70327X = occVar;
        this.f70328Y = z;
        this.f70329Z = interfaceC9407mm;
        this.f70325M1 = ww2Var;
        this.f70326V1 = f;
        this.f70330Z1 = b92Var;
    }
}
