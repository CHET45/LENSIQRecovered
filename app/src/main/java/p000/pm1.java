package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class pm1 {

    /* JADX INFO: renamed from: b */
    public static final int f71366b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final gug f71367a;

    public pm1(@yfb gug gugVar) {
        this.f71367a = gugVar;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm1)) {
            return false;
        }
        gug gugVar = this.f71367a;
        pm1 pm1Var = (pm1) obj;
        return md8.areEqual(gugVar.getText(), pm1Var.f71367a.getText()) && gugVar.getStyle().hasSameLayoutAffectingAttributes(pm1Var.f71367a.getStyle()) && md8.areEqual(gugVar.getPlaceholders(), pm1Var.f71367a.getPlaceholders()) && gugVar.getMaxLines() == pm1Var.f71367a.getMaxLines() && gugVar.getSoftWrap() == pm1Var.f71367a.getSoftWrap() && bvg.m28164equalsimpl0(gugVar.m29858getOverflowgIe3tQ8(), pm1Var.f71367a.m29858getOverflowgIe3tQ8()) && md8.areEqual(gugVar.getDensity(), pm1Var.f71367a.getDensity()) && gugVar.getLayoutDirection() == pm1Var.f71367a.getLayoutDirection() && gugVar.getFontFamilyResolver() == pm1Var.f71367a.getFontFamilyResolver() && ku2.m30763getMaxWidthimpl(gugVar.m29857getConstraintsmsEJaDk()) == ku2.m30763getMaxWidthimpl(pm1Var.f71367a.m29857getConstraintsmsEJaDk()) && ku2.m30762getMaxHeightimpl(gugVar.m29857getConstraintsmsEJaDk()) == ku2.m30762getMaxHeightimpl(pm1Var.f71367a.m29857getConstraintsmsEJaDk());
    }

    @yfb
    public final gug getTextLayoutInput() {
        return this.f71367a;
    }

    public int hashCode() {
        gug gugVar = this.f71367a;
        return (((((((((((((((((((gugVar.getText().hashCode() * 31) + gugVar.getStyle().hashCodeLayoutAffectingAttributes$ui_text_release()) * 31) + gugVar.getPlaceholders().hashCode()) * 31) + gugVar.getMaxLines()) * 31) + Boolean.hashCode(gugVar.getSoftWrap())) * 31) + bvg.m28165hashCodeimpl(gugVar.m29858getOverflowgIe3tQ8())) * 31) + gugVar.getDensity().hashCode()) * 31) + gugVar.getLayoutDirection().hashCode()) * 31) + gugVar.getFontFamilyResolver().hashCode()) * 31) + Integer.hashCode(ku2.m30763getMaxWidthimpl(gugVar.m29857getConstraintsmsEJaDk()))) * 31) + Integer.hashCode(ku2.m30762getMaxHeightimpl(gugVar.m29857getConstraintsmsEJaDk()));
    }
}
