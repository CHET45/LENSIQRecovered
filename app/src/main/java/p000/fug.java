package p000;

import java.util.List;
import p000.C9041lz;
import p000.do6;

/* JADX INFO: loaded from: classes.dex */
public final class fug {
    /* JADX INFO: renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m29666canReuse7_7YC6M(@yfb hug hugVar, @yfb C9041lz c9041lz, @yfb yvg yvgVar, @yfb List<C9041lz.c<ewc>> list, int i, boolean z, int i2, @yfb c64 c64Var, @yfb ov8 ov8Var, @yfb do6.InterfaceC4891b interfaceC4891b, long j) {
        gug layoutInput = hugVar.getLayoutInput();
        if (hugVar.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !md8.areEqual(layoutInput.getText(), c9041lz) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(yvgVar) || !md8.areEqual(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i || layoutInput.getSoftWrap() != z || !bvg.m28164equalsimpl0(layoutInput.m29858getOverflowgIe3tQ8(), i2) || !md8.areEqual(layoutInput.getDensity(), c64Var) || layoutInput.getLayoutDirection() != ov8Var || !md8.areEqual(layoutInput.getFontFamilyResolver(), interfaceC4891b) || ku2.m30765getMinWidthimpl(j) != ku2.m30765getMinWidthimpl(layoutInput.m29857getConstraintsmsEJaDk())) {
            return false;
        }
        if (z || bvg.m28164equalsimpl0(i2, bvg.f14961b.m28172getEllipsisgIe3tQ8())) {
            return ku2.m30763getMaxWidthimpl(j) == ku2.m30763getMaxWidthimpl(layoutInput.m29857getConstraintsmsEJaDk()) && ku2.m30762getMaxHeightimpl(j) == ku2.m30762getMaxHeightimpl(layoutInput.m29857getConstraintsmsEJaDk());
        }
        return true;
    }
}
