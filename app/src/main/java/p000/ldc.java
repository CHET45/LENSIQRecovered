package p000;

import p000.bp7;
import p000.bqg;
import p000.d69;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,538:1\n251#2:539\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n*L\n500#1:539\n*E\n"})
public final class ldc {

    /* JADX INFO: renamed from: a */
    public static final long f57267a = jwg.f52146b.m30624getUnspecifiedXSAIIZE();

    @yfb
    /* JADX INFO: renamed from: fastMerge-j5T8yCg, reason: not valid java name */
    public static final kdc m30862fastMergej5T8yCg(@yfb kdc kdcVar, int i, int i2, long j, @gib ntg ntgVar, @gib mxc mxcVar, @gib h69 h69Var, int i3, int i4, @gib xug xugVar) {
        long j2;
        int iM30680getTextAligne0LSkKk = i;
        ntg textIndent = ntgVar;
        bqg.C2006a c2006a = bqg.f14513b;
        if (bqg.m28037equalsimpl0(iM30680getTextAligne0LSkKk, c2006a.m28047getUnspecifiede0LSkKk()) || bqg.m28037equalsimpl0(iM30680getTextAligne0LSkKk, kdcVar.m30680getTextAligne0LSkKk())) {
            if (kwg.m30790isUnspecifiedR2X_6o(j)) {
                j2 = j;
            } else {
                j2 = j;
                if (jwg.m30610equalsimpl0(j2, kdcVar.m30678getLineHeightXSAIIZE())) {
                }
            }
            if ((textIndent == null || md8.areEqual(textIndent, kdcVar.getTextIndent())) && ((wqg.m33087equalsimpl0(i2, wqg.f95173b.m33096getUnspecifieds_7Xco()) || wqg.m33087equalsimpl0(i2, kdcVar.m30682getTextDirections_7Xco())) && ((mxcVar == null || md8.areEqual(mxcVar, kdcVar.getPlatformStyle())) && ((h69Var == null || md8.areEqual(h69Var, kdcVar.getLineHeightStyle())) && ((d69.m28576equalsimpl0(i3, d69.f28526b.m28590getUnspecifiedrAG3T2k()) || d69.m28576equalsimpl0(i3, kdcVar.m30677getLineBreakrAG3T2k())) && ((bp7.m28024equalsimpl0(i4, bp7.f14380b.m28030getUnspecifiedvmbZdU8()) || bp7.m28024equalsimpl0(i4, kdcVar.m30675getHyphensvmbZdU8())) && (xugVar == null || md8.areEqual(xugVar, kdcVar.getTextMotion())))))))) {
                return kdcVar;
            }
        } else {
            j2 = j;
        }
        long jM30678getLineHeightXSAIIZE = kwg.m30790isUnspecifiedR2X_6o(j) ? kdcVar.m30678getLineHeightXSAIIZE() : j2;
        if (textIndent == null) {
            textIndent = kdcVar.getTextIndent();
        }
        ntg ntgVar2 = textIndent;
        if (bqg.m28037equalsimpl0(iM30680getTextAligne0LSkKk, c2006a.m28047getUnspecifiede0LSkKk())) {
            iM30680getTextAligne0LSkKk = kdcVar.m30680getTextAligne0LSkKk();
        }
        return new kdc(iM30680getTextAligne0LSkKk, !wqg.m33087equalsimpl0(i2, wqg.f95173b.m33096getUnspecifieds_7Xco()) ? i2 : kdcVar.m30682getTextDirections_7Xco(), jM30678getLineHeightXSAIIZE, ntgVar2, mergePlatformStyle(kdcVar, mxcVar), h69Var == null ? kdcVar.getLineHeightStyle() : h69Var, !d69.m28576equalsimpl0(i3, d69.f28526b.m28590getUnspecifiedrAG3T2k()) ? i3 : kdcVar.m30677getLineBreakrAG3T2k(), !bp7.m28024equalsimpl0(i4, bp7.f14380b.m28030getUnspecifiedvmbZdU8()) ? i4 : kdcVar.m30675getHyphensvmbZdU8(), xugVar == null ? kdcVar.getTextMotion() : xugVar, (jt3) null);
    }

    @f0g
    @yfb
    public static final kdc lerp(@yfb kdc kdcVar, @yfb kdc kdcVar2, float f) {
        int iM28040unboximpl = ((bqg) twf.lerpDiscrete(bqg.m28034boximpl(kdcVar.m30680getTextAligne0LSkKk()), bqg.m28034boximpl(kdcVar2.m30680getTextAligne0LSkKk()), f)).m28040unboximpl();
        int iM33090unboximpl = ((wqg) twf.lerpDiscrete(wqg.m33084boximpl(kdcVar.m30682getTextDirections_7Xco()), wqg.m33084boximpl(kdcVar2.m30682getTextDirections_7Xco()), f)).m33090unboximpl();
        long jM32447lerpTextUnitInheritableC3pnCVY = twf.m32447lerpTextUnitInheritableC3pnCVY(kdcVar.m30678getLineHeightXSAIIZE(), kdcVar2.m30678getLineHeightXSAIIZE(), f);
        ntg textIndent = kdcVar.getTextIndent();
        if (textIndent == null) {
            textIndent = ntg.f65666c.getNone();
        }
        ntg textIndent2 = kdcVar2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = ntg.f65666c.getNone();
        }
        return new kdc(iM28040unboximpl, iM33090unboximpl, jM32447lerpTextUnitInheritableC3pnCVY, otg.lerp(textIndent, textIndent2, f), lerpPlatformStyle(kdcVar.getPlatformStyle(), kdcVar2.getPlatformStyle(), f), (h69) twf.lerpDiscrete(kdcVar.getLineHeightStyle(), kdcVar2.getLineHeightStyle(), f), ((d69) twf.lerpDiscrete(d69.m28570boximpl(kdcVar.m30677getLineBreakrAG3T2k()), d69.m28570boximpl(kdcVar2.m30677getLineBreakrAG3T2k()), f)).m28582unboximpl(), ((bp7) twf.lerpDiscrete(bp7.m28021boximpl(kdcVar.m30675getHyphensvmbZdU8()), bp7.m28021boximpl(kdcVar2.m30675getHyphensvmbZdU8()), f)).m28027unboximpl(), (xug) twf.lerpDiscrete(kdcVar.getTextMotion(), kdcVar2.getTextMotion(), f), (jt3) null);
    }

    private static final mxc lerpPlatformStyle(mxc mxcVar, mxc mxcVar2, float f) {
        if (mxcVar == null && mxcVar2 == null) {
            return null;
        }
        if (mxcVar == null) {
            mxcVar = mxc.f62709c.getDefault();
        }
        if (mxcVar2 == null) {
            mxcVar2 = mxc.f62709c.getDefault();
        }
        return C11142pv.lerp(mxcVar, mxcVar2, f);
    }

    private static final mxc mergePlatformStyle(kdc kdcVar, mxc mxcVar) {
        return kdcVar.getPlatformStyle() == null ? mxcVar : mxcVar == null ? kdcVar.getPlatformStyle() : kdcVar.getPlatformStyle().merge(mxcVar);
    }

    @yfb
    public static final kdc resolveParagraphStyleDefaults(@yfb kdc kdcVar, @yfb ov8 ov8Var) {
        int iM30680getTextAligne0LSkKk = kdcVar.m30680getTextAligne0LSkKk();
        bqg.C2006a c2006a = bqg.f14513b;
        int iM28046getStarte0LSkKk = bqg.m28037equalsimpl0(iM30680getTextAligne0LSkKk, c2006a.m28047getUnspecifiede0LSkKk()) ? c2006a.m28046getStarte0LSkKk() : kdcVar.m30680getTextAligne0LSkKk();
        int iM33537resolveTextDirectionIhaHGbI = zvg.m33537resolveTextDirectionIhaHGbI(ov8Var, kdcVar.m30682getTextDirections_7Xco());
        long jM30678getLineHeightXSAIIZE = kwg.m30790isUnspecifiedR2X_6o(kdcVar.m30678getLineHeightXSAIIZE()) ? f57267a : kdcVar.m30678getLineHeightXSAIIZE();
        ntg textIndent = kdcVar.getTextIndent();
        if (textIndent == null) {
            textIndent = ntg.f65666c.getNone();
        }
        ntg ntgVar = textIndent;
        mxc platformStyle = kdcVar.getPlatformStyle();
        h69 lineHeightStyle = kdcVar.getLineHeightStyle();
        int iM30677getLineBreakrAG3T2k = kdcVar.m30677getLineBreakrAG3T2k();
        d69.C4630a c4630a = d69.f28526b;
        int iM28589getSimplerAG3T2k = d69.m28576equalsimpl0(iM30677getLineBreakrAG3T2k, c4630a.m28590getUnspecifiedrAG3T2k()) ? c4630a.m28589getSimplerAG3T2k() : kdcVar.m30677getLineBreakrAG3T2k();
        int iM30675getHyphensvmbZdU8 = kdcVar.m30675getHyphensvmbZdU8();
        bp7.C1979a c1979a = bp7.f14380b;
        int iM28029getNonevmbZdU8 = bp7.m28024equalsimpl0(iM30675getHyphensvmbZdU8, c1979a.m28030getUnspecifiedvmbZdU8()) ? c1979a.m28029getNonevmbZdU8() : kdcVar.m30675getHyphensvmbZdU8();
        xug textMotion = kdcVar.getTextMotion();
        if (textMotion == null) {
            textMotion = xug.f99420c.getStatic();
        }
        return new kdc(iM28046getStarte0LSkKk, iM33537resolveTextDirectionIhaHGbI, jM30678getLineHeightXSAIIZE, ntgVar, platformStyle, lineHeightStyle, iM28589getSimplerAG3T2k, iM28029getNonevmbZdU8, textMotion, (jt3) null);
    }
}
