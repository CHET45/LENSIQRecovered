package p000;

import android.graphics.Typeface;
import p000.lwg;
import p000.w82;
import p000.xug;

/* JADX INFO: loaded from: classes.dex */
public final class cvg {
    @gib
    public static final swf applySpanStyle(@yfb C10071nv c10071nv, @yfb swf swfVar, @yfb oz6<? super do6, ? super jp6, ? super fp6, ? super gp6, ? extends Typeface> oz6Var, @yfb c64 c64Var, boolean z) {
        long jM30612getTypeUIouoOA = jwg.m30612getTypeUIouoOA(swfVar.m32351getFontSizeXSAIIZE());
        lwg.C9014a c9014a = lwg.f59101b;
        if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30923getSpUIouoOA())) {
            c10071nv.setTextSize(c64Var.mo27172toPxR2X_6o(swfVar.m32351getFontSizeXSAIIZE()));
        } else if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30922getEmUIouoOA())) {
            c10071nv.setTextSize(c10071nv.getTextSize() * jwg.m30613getValueimpl(swfVar.m32351getFontSizeXSAIIZE()));
        }
        if (hasFontAttributes(swfVar)) {
            do6 fontFamily = swfVar.getFontFamily();
            jp6 fontWeight = swfVar.getFontWeight();
            if (fontWeight == null) {
                fontWeight = jp6.f51403b.getNormal();
            }
            fp6 fp6VarM32352getFontStyle4Lr2A7w = swfVar.m32352getFontStyle4Lr2A7w();
            fp6 fp6VarM29572boximpl = fp6.m29572boximpl(fp6VarM32352getFontStyle4Lr2A7w != null ? fp6VarM32352getFontStyle4Lr2A7w.m29578unboximpl() : fp6.f37355b.m29582getNormal_LCdwA());
            gp6 gp6VarM32353getFontSynthesisZQGJjVo = swfVar.m32353getFontSynthesisZQGJjVo();
            c10071nv.setTypeface(oz6Var.invoke(fontFamily, fontWeight, fp6VarM29572boximpl, gp6.m29840boximpl(gp6VarM32353getFontSynthesisZQGJjVo != null ? gp6VarM32353getFontSynthesisZQGJjVo.m29848unboximpl() : gp6.f40694b.m29849getAllGVVA2EU())));
        }
        if (swfVar.getLocaleList() != null && !md8.areEqual(swfVar.getLocaleList(), ye9.f101294c.getCurrent())) {
            df9.f29565a.setTextLocales(c10071nv, swfVar.getLocaleList());
        }
        if (swfVar.getFontFeatureSettings() != null && !md8.areEqual(swfVar.getFontFeatureSettings(), "")) {
            c10071nv.setFontFeatureSettings(swfVar.getFontFeatureSettings());
        }
        if (swfVar.getTextGeometricTransform() != null && !md8.areEqual(swfVar.getTextGeometricTransform(), ftg.f37724c.getNone$ui_text_release())) {
            c10071nv.setTextScaleX(c10071nv.getTextScaleX() * swfVar.getTextGeometricTransform().getScaleX());
            c10071nv.setTextSkewX(c10071nv.getTextSkewX() + swfVar.getTextGeometricTransform().getSkewX());
        }
        c10071nv.m31238setColor8_81llA(swfVar.m32350getColor0d7_KjU());
        c10071nv.m31236setBrush12SF9DM(swfVar.getBrush(), wpf.f95046b.m33077getUnspecifiedNHjbRc(), swfVar.getAlpha());
        c10071nv.setShadow(swfVar.getShadow());
        c10071nv.setTextDecoration(swfVar.getTextDecoration());
        c10071nv.setDrawStyle(swfVar.getDrawStyle());
        if (lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(swfVar.m32354getLetterSpacingXSAIIZE()), c9014a.m30923getSpUIouoOA()) && jwg.m30613getValueimpl(swfVar.m32354getLetterSpacingXSAIIZE()) != 0.0f) {
            float textSize = c10071nv.getTextSize() * c10071nv.getTextScaleX();
            float fMo27172toPxR2X_6o = c64Var.mo27172toPxR2X_6o(swfVar.m32354getLetterSpacingXSAIIZE());
            if (textSize != 0.0f) {
                c10071nv.setLetterSpacing(fMo27172toPxR2X_6o / textSize);
            }
        } else if (lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(swfVar.m32354getLetterSpacingXSAIIZE()), c9014a.m30922getEmUIouoOA())) {
            c10071nv.setLetterSpacing(jwg.m30613getValueimpl(swfVar.m32354getLetterSpacingXSAIIZE()));
        }
        return m28555generateFallbackSpanStyle62GTOB8(swfVar.m32354getLetterSpacingXSAIIZE(), z, swfVar.m32348getBackground0d7_KjU(), swfVar.m32349getBaselineShift5SSeXJ0());
    }

    public static /* synthetic */ swf applySpanStyle$default(C10071nv c10071nv, swf swfVar, oz6 oz6Var, c64 c64Var, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return applySpanStyle(c10071nv, swfVar, oz6Var, c64Var, z);
    }

    public static final float correctBlurRadius(float f) {
        if (f == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f;
    }

    /* JADX INFO: renamed from: generateFallbackSpanStyle-62GTOB8, reason: not valid java name */
    private static final swf m28555generateFallbackSpanStyle62GTOB8(long j, boolean z, long j2, gv0 gv0Var) {
        long jM32987getUnspecified0d7_KjU = j2;
        boolean z2 = false;
        boolean z3 = z && lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(j), lwg.f59101b.m30923getSpUIouoOA()) && jwg.m30613getValueimpl(j) != 0.0f;
        w82.C14471a c14471a = w82.f93556b;
        boolean z4 = (w82.m32952equalsimpl0(jM32987getUnspecified0d7_KjU, c14471a.m32987getUnspecified0d7_KjU()) || w82.m32952equalsimpl0(jM32987getUnspecified0d7_KjU, c14471a.m32986getTransparent0d7_KjU())) ? false : true;
        if (gv0Var != null) {
            if (!gv0.m29862equalsimpl0(gv0Var.m29865unboximpl(), gv0.f41237b.m29869getNoney9eOQZs())) {
                z2 = true;
            }
        }
        if (!z3 && !z4 && !z2) {
            return null;
        }
        long jM30624getUnspecifiedXSAIIZE = z3 ? j : jwg.f52146b.m30624getUnspecifiedXSAIIZE();
        if (!z4) {
            jM32987getUnspecified0d7_KjU = c14471a.m32987getUnspecified0d7_KjU();
        }
        return new swf(0L, 0L, (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, jM30624getUnspecifiedXSAIIZE, z2 ? gv0Var : null, (ftg) null, (ye9) null, jM32987getUnspecified0d7_KjU, (qqg) null, (e8f) null, (qxc) null, (rp4) null, 63103, (jt3) null);
    }

    public static final boolean hasFontAttributes(@yfb swf swfVar) {
        return (swfVar.getFontFamily() == null && swfVar.m32352getFontStyle4Lr2A7w() == null && swfVar.getFontWeight() == null) ? false : true;
    }

    public static final void setTextMotion(@yfb C10071nv c10071nv, @gib xug xugVar) {
        if (xugVar == null) {
            xugVar = xug.f99420c.getStatic();
        }
        c10071nv.setFlags(xugVar.getSubpixelTextPositioning$ui_text_release() ? c10071nv.getFlags() | 128 : c10071nv.getFlags() & (-129));
        int iM33306getLinearity4e0Vf04$ui_text_release = xugVar.m33306getLinearity4e0Vf04$ui_text_release();
        xug.C15308b.a aVar = xug.C15308b.f99426b;
        if (xug.C15308b.m33310equalsimpl0(iM33306getLinearity4e0Vf04$ui_text_release, aVar.m33315getLinear4e0Vf04())) {
            c10071nv.setFlags(c10071nv.getFlags() | 64);
            c10071nv.setHinting(0);
        } else if (xug.C15308b.m33310equalsimpl0(iM33306getLinearity4e0Vf04$ui_text_release, aVar.m33314getFontHinting4e0Vf04())) {
            c10071nv.getFlags();
            c10071nv.setHinting(1);
        } else if (!xug.C15308b.m33310equalsimpl0(iM33306getLinearity4e0Vf04$ui_text_release, aVar.m33316getNone4e0Vf04())) {
            c10071nv.getFlags();
        } else {
            c10071nv.getFlags();
            c10071nv.setHinting(0);
        }
    }
}
