package p000;

import p000.btg;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class dvg {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final dvg f31086a = new dvg();

    /* JADX INFO: renamed from: b */
    public static final int f31087b = 0;

    private dvg() {
    }

    public final void paint(@yfb vq1 vq1Var, @yfb hug hugVar) {
        boolean z = hugVar.getHasVisualOverflow() && !bvg.m28164equalsimpl0(hugVar.getLayoutInput().m29858getOverflowgIe3tQ8(), bvg.f14961b.m28173getVisiblegIe3tQ8());
        if (z) {
            rud rudVarM33303Recttz77jQw = xud.m33303Recttz77jQw(izb.f49009b.m30445getZeroF1C5BW0(), eqf.Size(r78.m32087getWidthimpl(hugVar.m30130getSizeYbymL2g()), r78.m32086getHeightimpl(hugVar.m30130getSizeYbymL2g())));
            vq1Var.save();
            vq1.m32781clipRectmtrdDE$default(vq1Var, rudVarM33303Recttz77jQw, 0, 2, null);
        }
        swf spanStyle$ui_text_release = hugVar.getLayoutInput().getStyle().getSpanStyle$ui_text_release();
        qqg textDecoration = spanStyle$ui_text_release.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = qqg.f75141b.getNone();
        }
        qqg qqgVar = textDecoration;
        e8f shadow = spanStyle$ui_text_release.getShadow();
        if (shadow == null) {
            shadow = e8f.f32134d.getNone();
        }
        e8f e8fVar = shadow;
        rp4 drawStyle = spanStyle$ui_text_release.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = nu5.f65694a;
        }
        rp4 rp4Var = drawStyle;
        try {
            he1 brush = spanStyle$ui_text_release.getBrush();
            if (brush != null) {
                hugVar.getMultiParagraph().m32537painthn5TExg(vq1Var, brush, (64 & 4) != 0 ? Float.NaN : spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != btg.C2052b.f14747b ? spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().getAlpha() : 1.0f, (64 & 8) != 0 ? null : e8fVar, (64 & 16) != 0 ? null : qqgVar, (64 & 32) != 0 ? null : rp4Var, (64 & 64) != 0 ? ip4.f47823w.m30275getDefaultBlendMode0nO6VwU() : 0);
            } else {
                hugVar.getMultiParagraph().m32535paintLG529CI(vq1Var, (32 & 2) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release() != btg.C2052b.f14747b ? spanStyle$ui_text_release.getTextForegroundStyle$ui_text_release().mo28155getColor0d7_KjU() : w82.f93556b.m32977getBlack0d7_KjU(), (32 & 4) != 0 ? null : e8fVar, (32 & 8) != 0 ? null : qqgVar, (32 & 16) == 0 ? rp4Var : null, (32 & 32) != 0 ? ip4.f47823w.m30275getDefaultBlendMode0nO6VwU() : 0);
            }
            if (z) {
                vq1Var.restore();
            }
        } catch (Throwable th) {
            if (z) {
                vq1Var.restore();
            }
            throw th;
        }
    }
}
