package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class yvg {

    /* JADX INFO: renamed from: e */
    public static final int f103161e = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final swf f103163a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final kdc f103164b;

    /* JADX INFO: renamed from: c */
    @gib
    public final zxc f103165c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C15852a f103160d = new C15852a(null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final yvg f103162f = new yvg(0, 0, (jp6) null, (fp6) null, (gp6) null, (do6) null, (String) null, 0, (gv0) null, (ftg) null, (ye9) null, 0, (qqg) null, (e8f) null, (rp4) null, 0, 0, 0, (ntg) null, (zxc) null, (h69) null, 0, 0, (xug) null, 16777215, (jt3) null);

    /* JADX INFO: renamed from: yvg$a */
    public static final class C15852a {
        public /* synthetic */ C15852a(jt3 jt3Var) {
            this();
        }

        @f0g
        public static /* synthetic */ void getDefault$annotations() {
        }

        @yfb
        public final yvg getDefault() {
            return yvg.f103162f;
        }

        private C15852a() {
        }
    }

    public /* synthetic */ yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, rp4 rp4Var, int i, int i2, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, int i3, int i4, xug xugVar, jt3 jt3Var) {
        this(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, rp4Var, i, i2, j5, ntgVar, zxcVar, h69Var, i3, i4, xugVar);
    }

    /* JADX INFO: renamed from: copy-Ns73l9s$default, reason: not valid java name */
    public static /* synthetic */ yvg m33418copyNs73l9s$default(yvg yvgVar, he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, rp4 rp4Var, int i, int i2, long j4, ntg ntgVar, zxc zxcVar, h69 h69Var, int i3, int i4, xug xugVar, int i5, Object obj) {
        e8f e8fVar2;
        rp4 drawStyle;
        rp4 rp4Var2;
        int iM30680getTextAligne0LSkKk;
        int i6;
        int iM30682getTextDirections_7Xco;
        int i7;
        long jM30678getLineHeightXSAIIZE;
        ntg ntgVar2;
        zxc zxcVar2;
        zxc zxcVar3;
        h69 lineHeightStyle;
        h69 h69Var2;
        int iM30677getLineBreakrAG3T2k;
        int i8;
        int iM30675getHyphensvmbZdU8;
        float alpha = (i5 & 2) != 0 ? yvgVar.f103163a.getAlpha() : f;
        long jM32351getFontSizeXSAIIZE = (i5 & 4) != 0 ? yvgVar.f103163a.m32351getFontSizeXSAIIZE() : j;
        jp6 fontWeight = (i5 & 8) != 0 ? yvgVar.f103163a.getFontWeight() : jp6Var;
        fp6 fp6VarM32352getFontStyle4Lr2A7w = (i5 & 16) != 0 ? yvgVar.f103163a.m32352getFontStyle4Lr2A7w() : fp6Var;
        gp6 gp6VarM32353getFontSynthesisZQGJjVo = (i5 & 32) != 0 ? yvgVar.f103163a.m32353getFontSynthesisZQGJjVo() : gp6Var;
        do6 fontFamily = (i5 & 64) != 0 ? yvgVar.f103163a.getFontFamily() : do6Var;
        String fontFeatureSettings = (i5 & 128) != 0 ? yvgVar.f103163a.getFontFeatureSettings() : str;
        long jM32354getLetterSpacingXSAIIZE = (i5 & 256) != 0 ? yvgVar.f103163a.m32354getLetterSpacingXSAIIZE() : j2;
        gv0 gv0VarM32349getBaselineShift5SSeXJ0 = (i5 & 512) != 0 ? yvgVar.f103163a.m32349getBaselineShift5SSeXJ0() : gv0Var;
        ftg textGeometricTransform = (i5 & 1024) != 0 ? yvgVar.f103163a.getTextGeometricTransform() : ftgVar;
        ye9 localeList = (i5 & 2048) != 0 ? yvgVar.f103163a.getLocaleList() : ye9Var;
        long jM32348getBackground0d7_KjU = (i5 & 4096) != 0 ? yvgVar.f103163a.m32348getBackground0d7_KjU() : j3;
        qqg textDecoration = (i5 & 8192) != 0 ? yvgVar.f103163a.getTextDecoration() : qqgVar;
        e8f shadow = (i5 & 16384) != 0 ? yvgVar.f103163a.getShadow() : e8fVar;
        if ((i5 & 32768) != 0) {
            e8fVar2 = shadow;
            drawStyle = yvgVar.f103163a.getDrawStyle();
        } else {
            e8fVar2 = shadow;
            drawStyle = rp4Var;
        }
        if ((i5 & 65536) != 0) {
            rp4Var2 = drawStyle;
            iM30680getTextAligne0LSkKk = yvgVar.f103164b.m30680getTextAligne0LSkKk();
        } else {
            rp4Var2 = drawStyle;
            iM30680getTextAligne0LSkKk = i;
        }
        if ((i5 & 131072) != 0) {
            i6 = iM30680getTextAligne0LSkKk;
            iM30682getTextDirections_7Xco = yvgVar.f103164b.m30682getTextDirections_7Xco();
        } else {
            i6 = iM30680getTextAligne0LSkKk;
            iM30682getTextDirections_7Xco = i2;
        }
        if ((i5 & 262144) != 0) {
            i7 = iM30682getTextDirections_7Xco;
            jM30678getLineHeightXSAIIZE = yvgVar.f103164b.m30678getLineHeightXSAIIZE();
        } else {
            i7 = iM30682getTextDirections_7Xco;
            jM30678getLineHeightXSAIIZE = j4;
        }
        ntg textIndent = (524288 & i5) != 0 ? yvgVar.f103164b.getTextIndent() : ntgVar;
        if ((i5 & 1048576) != 0) {
            ntgVar2 = textIndent;
            zxcVar2 = yvgVar.f103165c;
        } else {
            ntgVar2 = textIndent;
            zxcVar2 = zxcVar;
        }
        if ((i5 & 2097152) != 0) {
            zxcVar3 = zxcVar2;
            lineHeightStyle = yvgVar.f103164b.getLineHeightStyle();
        } else {
            zxcVar3 = zxcVar2;
            lineHeightStyle = h69Var;
        }
        if ((i5 & 4194304) != 0) {
            h69Var2 = lineHeightStyle;
            iM30677getLineBreakrAG3T2k = yvgVar.f103164b.m30677getLineBreakrAG3T2k();
        } else {
            h69Var2 = lineHeightStyle;
            iM30677getLineBreakrAG3T2k = i3;
        }
        if ((i5 & 8388608) != 0) {
            i8 = iM30677getLineBreakrAG3T2k;
            iM30675getHyphensvmbZdU8 = yvgVar.f103164b.m30675getHyphensvmbZdU8();
        } else {
            i8 = iM30677getLineBreakrAG3T2k;
            iM30675getHyphensvmbZdU8 = i4;
        }
        return yvgVar.m33431copyNs73l9s(he1Var, alpha, jM32351getFontSizeXSAIIZE, fontWeight, fp6VarM32352getFontStyle4Lr2A7w, gp6VarM32353getFontSynthesisZQGJjVo, fontFamily, fontFeatureSettings, jM32354getLetterSpacingXSAIIZE, gv0VarM32349getBaselineShift5SSeXJ0, textGeometricTransform, localeList, jM32348getBackground0d7_KjU, textDecoration, e8fVar2, rp4Var2, i6, i7, jM30678getLineHeightXSAIIZE, ntgVar2, zxcVar3, h69Var2, i8, iM30675getHyphensvmbZdU8, (i5 & 16777216) != 0 ? yvgVar.f103164b.getTextMotion() : xugVar);
    }

    /* JADX INFO: renamed from: copy-aIRg9q4$default, reason: not valid java name */
    public static /* synthetic */ yvg m33419copyaIRg9q4$default(yvg yvgVar, he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, rp4 rp4Var, bqg bqgVar, wqg wqgVar, long j4, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar, int i, Object obj) {
        e8f e8fVar2;
        rp4 drawStyle;
        rp4 rp4Var2;
        bqg bqgVarM28034boximpl;
        bqg bqgVar2;
        wqg wqgVarM33084boximpl;
        wqg wqgVar2;
        long jM30678getLineHeightXSAIIZE;
        ntg ntgVar2;
        zxc zxcVar2;
        zxc zxcVar3;
        h69 lineHeightStyle;
        h69 h69Var2;
        d69 d69VarM28570boximpl;
        d69 d69Var2;
        bp7 bp7VarM28021boximpl;
        float alpha = (i & 2) != 0 ? yvgVar.f103163a.getAlpha() : f;
        long jM32351getFontSizeXSAIIZE = (i & 4) != 0 ? yvgVar.f103163a.m32351getFontSizeXSAIIZE() : j;
        jp6 fontWeight = (i & 8) != 0 ? yvgVar.f103163a.getFontWeight() : jp6Var;
        fp6 fp6VarM32352getFontStyle4Lr2A7w = (i & 16) != 0 ? yvgVar.f103163a.m32352getFontStyle4Lr2A7w() : fp6Var;
        gp6 gp6VarM32353getFontSynthesisZQGJjVo = (i & 32) != 0 ? yvgVar.f103163a.m32353getFontSynthesisZQGJjVo() : gp6Var;
        do6 fontFamily = (i & 64) != 0 ? yvgVar.f103163a.getFontFamily() : do6Var;
        String fontFeatureSettings = (i & 128) != 0 ? yvgVar.f103163a.getFontFeatureSettings() : str;
        long jM32354getLetterSpacingXSAIIZE = (i & 256) != 0 ? yvgVar.f103163a.m32354getLetterSpacingXSAIIZE() : j2;
        gv0 gv0VarM32349getBaselineShift5SSeXJ0 = (i & 512) != 0 ? yvgVar.f103163a.m32349getBaselineShift5SSeXJ0() : gv0Var;
        ftg textGeometricTransform = (i & 1024) != 0 ? yvgVar.f103163a.getTextGeometricTransform() : ftgVar;
        ye9 localeList = (i & 2048) != 0 ? yvgVar.f103163a.getLocaleList() : ye9Var;
        long jM32348getBackground0d7_KjU = (i & 4096) != 0 ? yvgVar.f103163a.m32348getBackground0d7_KjU() : j3;
        qqg textDecoration = (i & 8192) != 0 ? yvgVar.f103163a.getTextDecoration() : qqgVar;
        e8f shadow = (i & 16384) != 0 ? yvgVar.f103163a.getShadow() : e8fVar;
        if ((i & 32768) != 0) {
            e8fVar2 = shadow;
            drawStyle = yvgVar.f103163a.getDrawStyle();
        } else {
            e8fVar2 = shadow;
            drawStyle = rp4Var;
        }
        if ((i & 65536) != 0) {
            rp4Var2 = drawStyle;
            bqgVarM28034boximpl = bqg.m28034boximpl(yvgVar.f103164b.m30680getTextAligne0LSkKk());
        } else {
            rp4Var2 = drawStyle;
            bqgVarM28034boximpl = bqgVar;
        }
        if ((i & 131072) != 0) {
            bqgVar2 = bqgVarM28034boximpl;
            wqgVarM33084boximpl = wqg.m33084boximpl(yvgVar.f103164b.m30682getTextDirections_7Xco());
        } else {
            bqgVar2 = bqgVarM28034boximpl;
            wqgVarM33084boximpl = wqgVar;
        }
        if ((i & 262144) != 0) {
            wqgVar2 = wqgVarM33084boximpl;
            jM30678getLineHeightXSAIIZE = yvgVar.f103164b.m30678getLineHeightXSAIIZE();
        } else {
            wqgVar2 = wqgVarM33084boximpl;
            jM30678getLineHeightXSAIIZE = j4;
        }
        ntg textIndent = (524288 & i) != 0 ? yvgVar.f103164b.getTextIndent() : ntgVar;
        if ((i & 1048576) != 0) {
            ntgVar2 = textIndent;
            zxcVar2 = yvgVar.f103165c;
        } else {
            ntgVar2 = textIndent;
            zxcVar2 = zxcVar;
        }
        if ((i & 2097152) != 0) {
            zxcVar3 = zxcVar2;
            lineHeightStyle = yvgVar.f103164b.getLineHeightStyle();
        } else {
            zxcVar3 = zxcVar2;
            lineHeightStyle = h69Var;
        }
        if ((i & 4194304) != 0) {
            h69Var2 = lineHeightStyle;
            d69VarM28570boximpl = d69.m28570boximpl(yvgVar.f103164b.m30677getLineBreakrAG3T2k());
        } else {
            h69Var2 = lineHeightStyle;
            d69VarM28570boximpl = d69Var;
        }
        if ((i & 8388608) != 0) {
            d69Var2 = d69VarM28570boximpl;
            bp7VarM28021boximpl = bp7.m28021boximpl(yvgVar.f103164b.m30675getHyphensvmbZdU8());
        } else {
            d69Var2 = d69VarM28570boximpl;
            bp7VarM28021boximpl = bp7Var;
        }
        return yvgVar.m33432copyaIRg9q4(he1Var, alpha, jM32351getFontSizeXSAIIZE, fontWeight, fp6VarM32352getFontStyle4Lr2A7w, gp6VarM32353getFontSynthesisZQGJjVo, fontFamily, fontFeatureSettings, jM32354getLetterSpacingXSAIIZE, gv0VarM32349getBaselineShift5SSeXJ0, textGeometricTransform, localeList, jM32348getBackground0d7_KjU, textDecoration, e8fVar2, rp4Var2, bqgVar2, wqgVar2, jM30678getLineHeightXSAIIZE, ntgVar2, zxcVar3, h69Var2, d69Var2, bp7VarM28021boximpl, (i & 16777216) != 0 ? yvgVar.f103164b.getTextMotion() : xugVar);
    }

    @q64(level = u64.f86865a, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getHyphens-EaSxIns$annotations, reason: not valid java name */
    public static /* synthetic */ void m33422getHyphensEaSxIns$annotations() {
    }

    @q64(level = u64.f86865a, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getLineBreak-LgCVezo$annotations, reason: not valid java name */
    public static /* synthetic */ void m33423getLineBreakLgCVezo$annotations() {
    }

    @q64(level = u64.f86865a, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getTextAlign-buA522U$annotations, reason: not valid java name */
    public static /* synthetic */ void m33424getTextAlignbuA522U$annotations() {
    }

    @q64(level = u64.f86865a, message = "Kept for backwards compatibility.")
    /* JADX INFO: renamed from: getTextDirection-mmuk1to$annotations, reason: not valid java name */
    public static /* synthetic */ void m33425getTextDirectionmmuk1to$annotations() {
    }

    public static /* synthetic */ yvg merge$default(yvg yvgVar, yvg yvgVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            yvgVar2 = null;
        }
        return yvgVar.merge(yvgVar2);
    }

    @q64(level = u64.f86867c, message = "TextStyle copy constructors that do not take new stable parameters like LineBreak, Hyphens, and TextMotion are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-CXVQc50, reason: not valid java name */
    public final /* synthetic */ yvg m33428copyCXVQc50(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var) {
        return new yvg(new swf(w82.m32952equalsimpl0(j, this.f103163a.m32350getColor0d7_KjU()) ? this.f103163a.getTextForegroundStyle$ui_text_release() : btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, getDrawStyle(), (jt3) null), new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j5, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), getTextMotion(), (jt3) null), zxcVar);
    }

    @q64(level = u64.f86867c, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-HL5avdY, reason: not valid java name */
    public final /* synthetic */ yvg m33429copyHL5avdY(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar) {
        return new yvg(new swf(w82.m32952equalsimpl0(j, this.f103163a.m32350getColor0d7_KjU()) ? this.f103163a.getTextForegroundStyle$ui_text_release() : btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, this.f103163a.getPlatformStyle(), this.f103163a.getDrawStyle(), (jt3) null), new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j5, ntgVar, this.f103164b.getPlatformStyle(), getLineHeightStyle(), m33445getLineBreakrAG3T2k(), m33442getHyphensvmbZdU8(), getTextMotion(), (jt3) null), this.f103165c);
    }

    @q64(level = u64.f86867c, message = "TextStyle copy constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable copy constructor.")
    /* JADX INFO: renamed from: copy-NOaFTUo, reason: not valid java name */
    public final /* synthetic */ yvg m33430copyNOaFTUo(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var) {
        return new yvg(new swf(w82.m32952equalsimpl0(j, this.f103163a.m32350getColor0d7_KjU()) ? this.f103163a.getTextForegroundStyle$ui_text_release() : btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, this.f103163a.getDrawStyle(), (jt3) null), new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j5, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, m33445getLineBreakrAG3T2k(), m33442getHyphensvmbZdU8(), getTextMotion(), (jt3) null), zxcVar);
    }

    @yfb
    /* JADX INFO: renamed from: copy-Ns73l9s, reason: not valid java name */
    public final yvg m33431copyNs73l9s(@gib he1 he1Var, float f, long j, @gib jp6 jp6Var, @gib fp6 fp6Var, @gib gp6 gp6Var, @gib do6 do6Var, @gib String str, long j2, @gib gv0 gv0Var, @gib ftg ftgVar, @gib ye9 ye9Var, long j3, @gib qqg qqgVar, @gib e8f e8fVar, @gib rp4 rp4Var, int i, int i2, long j4, @gib ntg ntgVar, @gib zxc zxcVar, @gib h69 h69Var, int i3, int i4, @gib xug xugVar) {
        return new yvg(new swf(he1Var, f, j, jp6Var, fp6Var, gp6Var, do6Var, str, j2, gv0Var, ftgVar, ye9Var, j3, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, rp4Var, (jt3) null), new kdc(i, i2, j4, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, i3, i4, xugVar, (jt3) null), zxcVar);
    }

    @q64(level = u64.f86867c, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* JADX INFO: renamed from: copy-aIRg9q4, reason: not valid java name */
    public final /* synthetic */ yvg m33432copyaIRg9q4(he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, rp4 rp4Var, bqg bqgVar, wqg wqgVar, long j4, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar) {
        return new yvg(new swf(he1Var, f, j, jp6Var, fp6Var, gp6Var, do6Var, str, j2, gv0Var, ftgVar, ye9Var, j3, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, rp4Var, (jt3) null), new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j4, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), xugVar, (jt3) null), zxcVar);
    }

    @yfb
    /* JADX INFO: renamed from: copy-p1EtxEg, reason: not valid java name */
    public final yvg m33433copyp1EtxEg(long j, long j2, @gib jp6 jp6Var, @gib fp6 fp6Var, @gib gp6 gp6Var, @gib do6 do6Var, @gib String str, long j3, @gib gv0 gv0Var, @gib ftg ftgVar, @gib ye9 ye9Var, long j4, @gib qqg qqgVar, @gib e8f e8fVar, @gib rp4 rp4Var, int i, int i2, long j5, @gib ntg ntgVar, @gib zxc zxcVar, @gib h69 h69Var, int i3, int i4, @gib xug xugVar) {
        return new yvg(new swf(w82.m32952equalsimpl0(j, this.f103163a.m32350getColor0d7_KjU()) ? this.f103163a.getTextForegroundStyle$ui_text_release() : btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, rp4Var, (jt3) null), new kdc(i, i2, j5, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, i3, i4, xugVar, (jt3) null), zxcVar);
    }

    @q64(level = u64.f86867c, message = "copy constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* JADX INFO: renamed from: copy-v2rsoow, reason: not valid java name */
    public final /* synthetic */ yvg m33434copyv2rsoow(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, rp4 rp4Var, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar) {
        return new yvg(new swf(w82.m32952equalsimpl0(j, this.f103163a.m32350getColor0d7_KjU()) ? this.f103163a.getTextForegroundStyle$ui_text_release() : btg.f14745a.m28156from8_81llA(j), j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, rp4Var, (jt3) null), new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j5, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), xugVar, (jt3) null), zxcVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvg)) {
            return false;
        }
        yvg yvgVar = (yvg) obj;
        return md8.areEqual(this.f103163a, yvgVar.f103163a) && md8.areEqual(this.f103164b, yvgVar.f103164b) && md8.areEqual(this.f103165c, yvgVar.f103165c);
    }

    public final float getAlpha() {
        return this.f103163a.getAlpha();
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m33435getBackground0d7_KjU() {
        return this.f103163a.m32348getBackground0d7_KjU();
    }

    @gib
    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final gv0 m33436getBaselineShift5SSeXJ0() {
        return this.f103163a.m32349getBaselineShift5SSeXJ0();
    }

    @gib
    public final he1 getBrush() {
        return this.f103163a.getBrush();
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m33437getColor0d7_KjU() {
        return this.f103163a.m32350getColor0d7_KjU();
    }

    @gib
    public final rp4 getDrawStyle() {
        return this.f103163a.getDrawStyle();
    }

    @gib
    public final do6 getFontFamily() {
        return this.f103163a.getFontFamily();
    }

    @gib
    public final String getFontFeatureSettings() {
        return this.f103163a.getFontFeatureSettings();
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m33438getFontSizeXSAIIZE() {
        return this.f103163a.m32351getFontSizeXSAIIZE();
    }

    @gib
    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final fp6 m33439getFontStyle4Lr2A7w() {
        return this.f103163a.m32352getFontStyle4Lr2A7w();
    }

    @gib
    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final gp6 m33440getFontSynthesisZQGJjVo() {
        return this.f103163a.m32353getFontSynthesisZQGJjVo();
    }

    @gib
    public final jp6 getFontWeight() {
        return this.f103163a.getFontWeight();
    }

    @gib
    @xn8(name = "getHyphens-EaSxIns")
    /* JADX INFO: renamed from: getHyphens-EaSxIns, reason: not valid java name */
    public final bp7 m33441getHyphensEaSxIns() {
        return bp7.m28021boximpl(m33442getHyphensvmbZdU8());
    }

    /* JADX INFO: renamed from: getHyphens-vmbZdU8, reason: not valid java name */
    public final int m33442getHyphensvmbZdU8() {
        return this.f103164b.m30675getHyphensvmbZdU8();
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m33443getLetterSpacingXSAIIZE() {
        return this.f103163a.m32354getLetterSpacingXSAIIZE();
    }

    @gib
    @xn8(name = "getLineBreak-LgCVezo")
    /* JADX INFO: renamed from: getLineBreak-LgCVezo, reason: not valid java name */
    public final d69 m33444getLineBreakLgCVezo() {
        return d69.m28570boximpl(m33445getLineBreakrAG3T2k());
    }

    /* JADX INFO: renamed from: getLineBreak-rAG3T2k, reason: not valid java name */
    public final int m33445getLineBreakrAG3T2k() {
        return this.f103164b.m30677getLineBreakrAG3T2k();
    }

    /* JADX INFO: renamed from: getLineHeight-XSAIIZE, reason: not valid java name */
    public final long m33446getLineHeightXSAIIZE() {
        return this.f103164b.m30678getLineHeightXSAIIZE();
    }

    @gib
    public final h69 getLineHeightStyle() {
        return this.f103164b.getLineHeightStyle();
    }

    @gib
    public final ye9 getLocaleList() {
        return this.f103163a.getLocaleList();
    }

    @yfb
    public final kdc getParagraphStyle$ui_text_release() {
        return this.f103164b;
    }

    @gib
    public final zxc getPlatformStyle() {
        return this.f103165c;
    }

    @gib
    public final e8f getShadow() {
        return this.f103163a.getShadow();
    }

    @yfb
    public final swf getSpanStyle$ui_text_release() {
        return this.f103163a;
    }

    @gib
    @xn8(name = "getTextAlign-buA522U")
    /* JADX INFO: renamed from: getTextAlign-buA522U, reason: not valid java name */
    public final bqg m33447getTextAlignbuA522U() {
        return bqg.m28034boximpl(m33448getTextAligne0LSkKk());
    }

    /* JADX INFO: renamed from: getTextAlign-e0LSkKk, reason: not valid java name */
    public final int m33448getTextAligne0LSkKk() {
        return this.f103164b.m30680getTextAligne0LSkKk();
    }

    @gib
    public final qqg getTextDecoration() {
        return this.f103163a.getTextDecoration();
    }

    @gib
    @xn8(name = "getTextDirection-mmuk1to")
    /* JADX INFO: renamed from: getTextDirection-mmuk1to, reason: not valid java name */
    public final wqg m33449getTextDirectionmmuk1to() {
        return wqg.m33084boximpl(m33450getTextDirections_7Xco());
    }

    /* JADX INFO: renamed from: getTextDirection-s_7X-co, reason: not valid java name */
    public final int m33450getTextDirections_7Xco() {
        return this.f103164b.m30682getTextDirections_7Xco();
    }

    @gib
    public final ftg getTextGeometricTransform() {
        return this.f103163a.getTextGeometricTransform();
    }

    @gib
    public final ntg getTextIndent() {
        return this.f103164b.getTextIndent();
    }

    @gib
    public final xug getTextMotion() {
        return this.f103164b.getTextMotion();
    }

    public final boolean hasSameDrawAffectingAttributes(@yfb yvg yvgVar) {
        return this == yvgVar || this.f103163a.hasSameNonLayoutAttributes$ui_text_release(yvgVar.f103163a);
    }

    public final boolean hasSameLayoutAffectingAttributes(@yfb yvg yvgVar) {
        return this == yvgVar || (md8.areEqual(this.f103164b, yvgVar.f103164b) && this.f103163a.hasSameLayoutAffectingAttributes$ui_text_release(yvgVar.f103163a));
    }

    public int hashCode() {
        int iHashCode = ((this.f103163a.hashCode() * 31) + this.f103164b.hashCode()) * 31;
        zxc zxcVar = this.f103165c;
        return iHashCode + (zxcVar != null ? zxcVar.hashCode() : 0);
    }

    public final int hashCodeLayoutAffectingAttributes$ui_text_release() {
        int iHashCodeLayoutAffectingAttributes$ui_text_release = ((this.f103163a.hashCodeLayoutAffectingAttributes$ui_text_release() * 31) + this.f103164b.hashCode()) * 31;
        zxc zxcVar = this.f103165c;
        return iHashCodeLayoutAffectingAttributes$ui_text_release + (zxcVar != null ? zxcVar.hashCode() : 0);
    }

    @f0g
    @yfb
    public final yvg merge(@gib yvg yvgVar) {
        return (yvgVar == null || md8.areEqual(yvgVar, f103162f)) ? this : new yvg(toSpanStyle().merge(yvgVar.toSpanStyle()), toParagraphStyle().merge(yvgVar.toParagraphStyle()));
    }

    @f0g
    @q64(level = u64.f86867c, message = "merge that takes nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    /* JADX INFO: renamed from: merge-Z1GrekI, reason: not valid java name */
    public final /* synthetic */ yvg m33451mergeZ1GrekI(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, rp4 rp4Var, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, h69 h69Var, d69 d69Var, bp7 bp7Var, zxc zxcVar, xug xugVar) {
        swf swfVarM32446fastMergedSHsh3o = twf.m32446fastMergedSHsh3o(this.f103163a, j, null, Float.NaN, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, rp4Var);
        kdc kdcVarM30862fastMergej5T8yCg = ldc.m30862fastMergej5T8yCg(this.f103164b, bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j5, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), xugVar);
        return (this.f103163a == swfVarM32446fastMergedSHsh3o && this.f103164b == kdcVarM30862fastMergej5T8yCg) ? this : new yvg(swfVarM32446fastMergedSHsh3o, kdcVarM30862fastMergej5T8yCg);
    }

    @f0g
    @yfb
    /* JADX INFO: renamed from: merge-dA7vx0o, reason: not valid java name */
    public final yvg m33452mergedA7vx0o(long j, long j2, @gib jp6 jp6Var, @gib fp6 fp6Var, @gib gp6 gp6Var, @gib do6 do6Var, @gib String str, long j3, @gib gv0 gv0Var, @gib ftg ftgVar, @gib ye9 ye9Var, long j4, @gib qqg qqgVar, @gib e8f e8fVar, @gib rp4 rp4Var, int i, int i2, long j5, @gib ntg ntgVar, @gib h69 h69Var, int i3, int i4, @gib zxc zxcVar, @gib xug xugVar) {
        swf swfVarM32446fastMergedSHsh3o = twf.m32446fastMergedSHsh3o(this.f103163a, j, null, Float.NaN, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, rp4Var);
        kdc kdcVarM30862fastMergej5T8yCg = ldc.m30862fastMergej5T8yCg(this.f103164b, i, i2, j5, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, i3, i4, xugVar);
        return (this.f103163a == swfVarM32446fastMergedSHsh3o && this.f103164b == kdcVarM30862fastMergej5T8yCg) ? this : new yvg(swfVarM32446fastMergedSHsh3o, kdcVarM30862fastMergej5T8yCg);
    }

    @f0g
    @yfb
    public final yvg plus(@yfb yvg yvgVar) {
        return merge(yvgVar);
    }

    @f0g
    @yfb
    public final kdc toParagraphStyle() {
        return this.f103164b;
    }

    @f0g
    @yfb
    public final swf toSpanStyle() {
        return this.f103163a;
    }

    @yfb
    public String toString() {
        return "TextStyle(color=" + ((Object) w82.m32959toStringimpl(m33437getColor0d7_KjU())) + ", brush=" + getBrush() + ", alpha=" + getAlpha() + ", fontSize=" + ((Object) jwg.m30620toStringimpl(m33438getFontSizeXSAIIZE())) + ", fontWeight=" + getFontWeight() + ", fontStyle=" + m33439getFontStyle4Lr2A7w() + ", fontSynthesis=" + m33440getFontSynthesisZQGJjVo() + ", fontFamily=" + getFontFamily() + ", fontFeatureSettings=" + getFontFeatureSettings() + ", letterSpacing=" + ((Object) jwg.m30620toStringimpl(m33443getLetterSpacingXSAIIZE())) + ", baselineShift=" + m33436getBaselineShift5SSeXJ0() + ", textGeometricTransform=" + getTextGeometricTransform() + ", localeList=" + getLocaleList() + ", background=" + ((Object) w82.m32959toStringimpl(m33435getBackground0d7_KjU())) + ", textDecoration=" + getTextDecoration() + ", shadow=" + getShadow() + ", drawStyle=" + getDrawStyle() + ", textAlign=" + ((Object) bqg.m28039toStringimpl(m33448getTextAligne0LSkKk())) + ", textDirection=" + ((Object) wqg.m33089toStringimpl(m33450getTextDirections_7Xco())) + ", lineHeight=" + ((Object) jwg.m30620toStringimpl(m33446getLineHeightXSAIIZE())) + ", textIndent=" + getTextIndent() + ", platformStyle=" + this.f103165c + ", lineHeightStyle=" + getLineHeightStyle() + ", lineBreak=" + ((Object) d69.m28581toStringimpl(m33445getLineBreakrAG3T2k())) + ", hyphens=" + ((Object) bp7.m28026toStringimpl(m33442getHyphensvmbZdU8())) + ", textMotion=" + getTextMotion() + ')';
    }

    @q64(level = u64.f86867c, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, rp4 rp4Var, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar, jt3 jt3Var) {
        this(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, rp4Var, bqgVar, wqgVar, j5, ntgVar, zxcVar, h69Var, d69Var, bp7Var, xugVar);
    }

    @f0g
    @yfb
    public final yvg plus(@yfb kdc kdcVar) {
        return merge(kdcVar);
    }

    @q64(level = u64.f86867c, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, jt3 jt3Var) {
        this(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, bqgVar, wqgVar, j5, ntgVar);
    }

    @f0g
    @yfb
    public final yvg plus(@yfb swf swfVar) {
        return merge(swfVar);
    }

    @q64(level = u64.f86867c, message = "TextStyle constructors that do not take new stable parameters like LineHeightStyle, LineBreak, Hyphens are deprecated. Please use the new stable constructor.")
    public /* synthetic */ yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, jt3 jt3Var) {
        this(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, bqgVar, wqgVar, j5, ntgVar, zxcVar, h69Var);
    }

    @q64(level = u64.f86867c, message = "TextStyle constructors that do not take new stable parameters like TextMotion are deprecated. Please use the new stable constructor.")
    public /* synthetic */ yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, jt3 jt3Var) {
        this(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, bqgVar, wqgVar, j5, ntgVar, zxcVar, h69Var, d69Var, bp7Var);
    }

    public /* synthetic */ yvg(he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, rp4 rp4Var, int i, int i2, long j4, ntg ntgVar, zxc zxcVar, h69 h69Var, int i3, int i4, xug xugVar, jt3 jt3Var) {
        this(he1Var, f, j, jp6Var, fp6Var, gp6Var, do6Var, str, j2, gv0Var, ftgVar, ye9Var, j3, qqgVar, e8fVar, rp4Var, i, i2, j4, ntgVar, zxcVar, h69Var, i3, i4, xugVar);
    }

    @f0g
    @yfb
    public final yvg merge(@yfb swf swfVar) {
        return new yvg(toSpanStyle().merge(swfVar), toParagraphStyle());
    }

    @q64(level = u64.f86867c, message = "TextStyle constructors that take nullable TextAlign, TextDirection, LineBreak, and Hyphens are deprecated. Please use a new constructor where these parameters are non-nullable. Null value has been replaced by a special Unspecified object for performance reason.")
    public /* synthetic */ yvg(he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, rp4 rp4Var, bqg bqgVar, wqg wqgVar, long j4, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar, jt3 jt3Var) {
        this(he1Var, f, j, jp6Var, fp6Var, gp6Var, do6Var, str, j2, gv0Var, ftgVar, ye9Var, j3, qqgVar, e8fVar, rp4Var, bqgVar, wqgVar, j4, ntgVar, zxcVar, h69Var, d69Var, bp7Var, xugVar);
    }

    public yvg(@yfb swf swfVar, @yfb kdc kdcVar, @gib zxc zxcVar) {
        this.f103163a = swfVar;
        this.f103164b = kdcVar;
        this.f103165c = zxcVar;
    }

    @f0g
    @yfb
    public final yvg merge(@yfb kdc kdcVar) {
        return new yvg(toSpanStyle(), toParagraphStyle().merge(kdcVar));
    }

    public /* synthetic */ yvg(swf swfVar, kdc kdcVar, zxc zxcVar, int i, jt3 jt3Var) {
        this(swfVar, kdcVar, (i & 4) != 0 ? null : zxcVar);
    }

    public yvg(@yfb swf swfVar, @yfb kdc kdcVar) {
        this(swfVar, kdcVar, zvg.createPlatformTextStyleInternal(swfVar.getPlatformStyle(), kdcVar.getPlatformStyle()));
    }

    public /* synthetic */ yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i & 2) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : jp6Var, (i & 8) != 0 ? null : fp6Var, (i & 16) != 0 ? null : gp6Var, (i & 32) != 0 ? null : do6Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : gv0Var, (i & 512) != 0 ? null : ftgVar, (i & 1024) != 0 ? null : ye9Var, (i & 2048) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : qqgVar, (i & 8192) != 0 ? null : e8fVar, (i & 16384) != 0 ? null : bqgVar, (i & 32768) != 0 ? null : wqgVar, (i & 65536) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j5, (i & 131072) != 0 ? null : ntgVar, null);
    }

    private yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar) {
        swf swfVar = new swf(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, (qxc) null, (rp4) null, (jt3) null);
        this(swfVar, new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j5, ntgVar, (mxc) null, (h69) null, d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7.f14380b.m28030getUnspecifiedvmbZdU8(), (xug) null, (jt3) null), null);
    }

    public /* synthetic */ yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i & 2) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : jp6Var, (i & 8) != 0 ? null : fp6Var, (i & 16) != 0 ? null : gp6Var, (i & 32) != 0 ? null : do6Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : gv0Var, (i & 512) != 0 ? null : ftgVar, (i & 1024) != 0 ? null : ye9Var, (i & 2048) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : qqgVar, (i & 8192) != 0 ? null : e8fVar, (i & 16384) != 0 ? null : bqgVar, (i & 32768) != 0 ? null : wqgVar, (i & 65536) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j5, (i & 131072) != 0 ? null : ntgVar, (i & 262144) != 0 ? null : zxcVar, (i & 524288) != 0 ? null : h69Var, null);
    }

    private yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var) {
        this(new swf(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, (rp4) null, (jt3) null), new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j5, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7.f14380b.m28030getUnspecifiedvmbZdU8(), (xug) null, (jt3) null), zxcVar);
    }

    public /* synthetic */ yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i & 2) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : jp6Var, (i & 8) != 0 ? null : fp6Var, (i & 16) != 0 ? null : gp6Var, (i & 32) != 0 ? null : do6Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : gv0Var, (i & 512) != 0 ? null : ftgVar, (i & 1024) != 0 ? null : ye9Var, (i & 2048) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : qqgVar, (i & 8192) != 0 ? null : e8fVar, (i & 16384) != 0 ? null : bqgVar, (i & 32768) != 0 ? null : wqgVar, (i & 65536) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j5, (i & 131072) != 0 ? null : ntgVar, (i & 262144) != 0 ? null : zxcVar, (i & 524288) != 0 ? null : h69Var, (i & 1048576) != 0 ? null : d69Var, (i & 2097152) != 0 ? null : bp7Var, null);
    }

    private yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var) {
        this(new swf(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, (rp4) null, 32768, (jt3) null), new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j5, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), (xug) null, 256, (jt3) null), zxcVar);
    }

    public /* synthetic */ yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, rp4 rp4Var, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i & 2) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i & 4) != 0 ? null : jp6Var, (i & 8) != 0 ? null : fp6Var, (i & 16) != 0 ? null : gp6Var, (i & 32) != 0 ? null : do6Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j3, (i & 256) != 0 ? null : gv0Var, (i & 512) != 0 ? null : ftgVar, (i & 1024) != 0 ? null : ye9Var, (i & 2048) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j4, (i & 4096) != 0 ? null : qqgVar, (i & 8192) != 0 ? null : e8fVar, (i & 16384) != 0 ? null : rp4Var, (i & 32768) != 0 ? null : bqgVar, (i & 65536) != 0 ? null : wqgVar, (i & 131072) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j5, (i & 262144) != 0 ? null : ntgVar, (i & 524288) != 0 ? null : zxcVar, (i & 1048576) != 0 ? null : h69Var, (i & 2097152) != 0 ? null : d69Var, (i & 4194304) != 0 ? null : bp7Var, (i & 8388608) != 0 ? null : xugVar, (jt3) null);
    }

    private yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, rp4 rp4Var, bqg bqgVar, wqg wqgVar, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar) {
        this(new swf(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, rp4Var, (jt3) null), new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j5, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), xugVar, (jt3) null), zxcVar);
    }

    public /* synthetic */ yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, rp4 rp4Var, int i, int i2, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, int i3, int i4, xug xugVar, int i5, jt3 jt3Var) {
        this((i5 & 1) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j, (i5 & 2) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i5 & 4) != 0 ? null : jp6Var, (i5 & 8) != 0 ? null : fp6Var, (i5 & 16) != 0 ? null : gp6Var, (i5 & 32) != 0 ? null : do6Var, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j3, (i5 & 256) != 0 ? null : gv0Var, (i5 & 512) != 0 ? null : ftgVar, (i5 & 1024) != 0 ? null : ye9Var, (i5 & 2048) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j4, (i5 & 4096) != 0 ? null : qqgVar, (i5 & 8192) != 0 ? null : e8fVar, (i5 & 16384) != 0 ? null : rp4Var, (i5 & 32768) != 0 ? bqg.f14513b.m28047getUnspecifiede0LSkKk() : i, (i5 & 65536) != 0 ? wqg.f95173b.m33096getUnspecifieds_7Xco() : i2, (i5 & 131072) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j5, (i5 & 262144) != 0 ? null : ntgVar, (i5 & 524288) != 0 ? null : zxcVar, (i5 & 1048576) != 0 ? null : h69Var, (i5 & 2097152) != 0 ? d69.f28526b.m28590getUnspecifiedrAG3T2k() : i3, (i5 & 4194304) != 0 ? bp7.f14380b.m28030getUnspecifiedvmbZdU8() : i4, (i5 & 8388608) != 0 ? null : xugVar, (jt3) null);
    }

    private yvg(long j, long j2, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j3, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j4, qqg qqgVar, e8f e8fVar, rp4 rp4Var, int i, int i2, long j5, ntg ntgVar, zxc zxcVar, h69 h69Var, int i3, int i4, xug xugVar) {
        this(new swf(j, j2, jp6Var, fp6Var, gp6Var, do6Var, str, j3, gv0Var, ftgVar, ye9Var, j4, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, rp4Var, (jt3) null), new kdc(i, i2, j5, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, i3, i4, xugVar, (jt3) null), zxcVar);
    }

    public /* synthetic */ yvg(he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, rp4 rp4Var, int i, int i2, long j4, ntg ntgVar, zxc zxcVar, h69 h69Var, int i3, int i4, xug xugVar, int i5, jt3 jt3Var) {
        this(he1Var, (i5 & 2) != 0 ? Float.NaN : f, (i5 & 4) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j, (i5 & 8) != 0 ? null : jp6Var, (i5 & 16) != 0 ? null : fp6Var, (i5 & 32) != 0 ? null : gp6Var, (i5 & 64) != 0 ? null : do6Var, (i5 & 128) != 0 ? null : str, (i5 & 256) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i5 & 512) != 0 ? null : gv0Var, (i5 & 1024) != 0 ? null : ftgVar, (i5 & 2048) != 0 ? null : ye9Var, (i5 & 4096) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j3, (i5 & 8192) != 0 ? null : qqgVar, (i5 & 16384) != 0 ? null : e8fVar, (32768 & i5) != 0 ? null : rp4Var, (65536 & i5) != 0 ? bqg.f14513b.m28047getUnspecifiede0LSkKk() : i, (131072 & i5) != 0 ? wqg.f95173b.m33096getUnspecifieds_7Xco() : i2, (262144 & i5) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j4, (524288 & i5) != 0 ? null : ntgVar, (1048576 & i5) != 0 ? null : zxcVar, (2097152 & i5) != 0 ? null : h69Var, (4194304 & i5) != 0 ? d69.f28526b.m28590getUnspecifiedrAG3T2k() : i3, (8388608 & i5) != 0 ? bp7.f14380b.m28030getUnspecifiedvmbZdU8() : i4, (i5 & 16777216) != 0 ? null : xugVar, (jt3) null);
    }

    private yvg(he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, rp4 rp4Var, int i, int i2, long j4, ntg ntgVar, zxc zxcVar, h69 h69Var, int i3, int i4, xug xugVar) {
        this(new swf(he1Var, f, j, jp6Var, fp6Var, gp6Var, do6Var, str, j2, gv0Var, ftgVar, ye9Var, j3, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, rp4Var, (jt3) null), new kdc(i, i2, j4, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, i3, i4, xugVar, (jt3) null), zxcVar);
    }

    public /* synthetic */ yvg(he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, rp4 rp4Var, bqg bqgVar, wqg wqgVar, long j4, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar, int i, jt3 jt3Var) {
        this(he1Var, (i & 2) != 0 ? Float.NaN : f, (i & 4) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j, (i & 8) != 0 ? null : jp6Var, (i & 16) != 0 ? null : fp6Var, (i & 32) != 0 ? null : gp6Var, (i & 64) != 0 ? null : do6Var, (i & 128) != 0 ? null : str, (i & 256) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j2, (i & 512) != 0 ? null : gv0Var, (i & 1024) != 0 ? null : ftgVar, (i & 2048) != 0 ? null : ye9Var, (i & 4096) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : j3, (i & 8192) != 0 ? null : qqgVar, (i & 16384) != 0 ? null : e8fVar, (32768 & i) != 0 ? null : rp4Var, (65536 & i) != 0 ? null : bqgVar, (131072 & i) != 0 ? null : wqgVar, (262144 & i) != 0 ? jwg.f52146b.m30624getUnspecifiedXSAIIZE() : j4, (524288 & i) != 0 ? null : ntgVar, (1048576 & i) != 0 ? null : zxcVar, (2097152 & i) != 0 ? null : h69Var, (4194304 & i) != 0 ? null : d69Var, (8388608 & i) != 0 ? null : bp7Var, (i & 16777216) != 0 ? null : xugVar, (jt3) null);
    }

    private yvg(he1 he1Var, float f, long j, jp6 jp6Var, fp6 fp6Var, gp6 gp6Var, do6 do6Var, String str, long j2, gv0 gv0Var, ftg ftgVar, ye9 ye9Var, long j3, qqg qqgVar, e8f e8fVar, rp4 rp4Var, bqg bqgVar, wqg wqgVar, long j4, ntg ntgVar, zxc zxcVar, h69 h69Var, d69 d69Var, bp7 bp7Var, xug xugVar) {
        this(new swf(he1Var, f, j, jp6Var, fp6Var, gp6Var, do6Var, str, j2, gv0Var, ftgVar, ye9Var, j3, qqgVar, e8fVar, zxcVar != null ? zxcVar.getSpanStyle() : null, rp4Var, (jt3) null), new kdc(bqgVar != null ? bqgVar.m28040unboximpl() : bqg.f14513b.m28047getUnspecifiede0LSkKk(), wqgVar != null ? wqgVar.m33090unboximpl() : wqg.f95173b.m33096getUnspecifieds_7Xco(), j4, ntgVar, zxcVar != null ? zxcVar.getParagraphStyle() : null, h69Var, d69Var != null ? d69Var.m28582unboximpl() : d69.f28526b.m28590getUnspecifiedrAG3T2k(), bp7Var != null ? bp7Var.m28027unboximpl() : bp7.f14380b.m28030getUnspecifiedvmbZdU8(), xugVar, (jt3) null), zxcVar);
    }
}
