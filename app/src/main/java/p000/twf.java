package p000;

import p000.w82;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,950:1\n708#2:951\n696#2:952\n696#2:954\n696#2:956\n708#2:957\n696#2:958\n251#3:953\n251#3:955\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n848#1:951\n848#1:952\n890#1:954\n905#1:956\n937#1:957\n937#1:958\n889#1:953\n895#1:955\n*E\n"})
public final class twf {

    /* JADX INFO: renamed from: a */
    public static final long f86205a = kwg.getSp(14);

    /* JADX INFO: renamed from: b */
    public static final long f86206b = kwg.getSp(0);

    /* JADX INFO: renamed from: c */
    public static final long f86207c;

    /* JADX INFO: renamed from: d */
    public static final long f86208d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final btg f86209e;

    /* JADX INFO: renamed from: twf$a */
    public static final class C13261a extends tt8 implements ny6<btg> {

        /* JADX INFO: renamed from: a */
        public static final C13261a f86210a = new C13261a();

        public C13261a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p000.ny6
        @yfb
        public final btg invoke() {
            return twf.f86209e;
        }
    }

    static {
        w82.C14471a c14471a = w82.f93556b;
        f86207c = c14471a.m32986getTransparent0d7_KjU();
        long jM32977getBlack0d7_KjU = c14471a.m32977getBlack0d7_KjU();
        f86208d = jM32977getBlack0d7_KjU;
        f86209e = btg.f14745a.m28156from8_81llA(jM32977getBlack0d7_KjU);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    @p000.yfb
    /* JADX INFO: renamed from: fastMerge-dSHsh3o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.swf m32446fastMergedSHsh3o(@p000.yfb p000.swf r21, long r22, @p000.gib p000.he1 r24, float r25, long r26, @p000.gib p000.jp6 r28, @p000.gib p000.fp6 r29, @p000.gib p000.gp6 r30, @p000.gib p000.do6 r31, @p000.gib java.lang.String r32, long r33, @p000.gib p000.gv0 r35, @p000.gib p000.ftg r36, @p000.gib p000.ye9 r37, long r38, @p000.gib p000.qqg r40, @p000.gib p000.e8f r41, @p000.gib p000.qxc r42, @p000.gib p000.rp4 r43) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.twf.m32446fastMergedSHsh3o(swf, long, he1, float, long, jp6, fp6, gp6, do6, java.lang.String, long, gv0, ftg, ye9, long, qqg, e8f, qxc, rp4):swf");
    }

    @yfb
    public static final swf lerp(@yfb swf swfVar, @yfb swf swfVar2, float f) {
        btg btgVarLerp = arg.lerp(swfVar.getTextForegroundStyle$ui_text_release(), swfVar2.getTextForegroundStyle$ui_text_release(), f);
        do6 do6Var = (do6) lerpDiscrete(swfVar.getFontFamily(), swfVar2.getFontFamily(), f);
        long jM32447lerpTextUnitInheritableC3pnCVY = m32447lerpTextUnitInheritableC3pnCVY(swfVar.m32351getFontSizeXSAIIZE(), swfVar2.m32351getFontSizeXSAIIZE(), f);
        jp6 fontWeight = swfVar.getFontWeight();
        if (fontWeight == null) {
            fontWeight = jp6.f51403b.getNormal();
        }
        jp6 fontWeight2 = swfVar2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = jp6.f51403b.getNormal();
        }
        jp6 jp6VarLerp = mp6.lerp(fontWeight, fontWeight2, f);
        fp6 fp6Var = (fp6) lerpDiscrete(swfVar.m32352getFontStyle4Lr2A7w(), swfVar2.m32352getFontStyle4Lr2A7w(), f);
        gp6 gp6Var = (gp6) lerpDiscrete(swfVar.m32353getFontSynthesisZQGJjVo(), swfVar2.m32353getFontSynthesisZQGJjVo(), f);
        String str = (String) lerpDiscrete(swfVar.getFontFeatureSettings(), swfVar2.getFontFeatureSettings(), f);
        long jM32447lerpTextUnitInheritableC3pnCVY2 = m32447lerpTextUnitInheritableC3pnCVY(swfVar.m32354getLetterSpacingXSAIIZE(), swfVar2.m32354getLetterSpacingXSAIIZE(), f);
        gv0 gv0VarM32349getBaselineShift5SSeXJ0 = swfVar.m32349getBaselineShift5SSeXJ0();
        float fM29865unboximpl = gv0VarM32349getBaselineShift5SSeXJ0 != null ? gv0VarM32349getBaselineShift5SSeXJ0.m29865unboximpl() : gv0.m29860constructorimpl(0.0f);
        gv0 gv0VarM32349getBaselineShift5SSeXJ02 = swfVar2.m32349getBaselineShift5SSeXJ0();
        float fM30132lerpjWV1Mfo = hv0.m30132lerpjWV1Mfo(fM29865unboximpl, gv0VarM32349getBaselineShift5SSeXJ02 != null ? gv0VarM32349getBaselineShift5SSeXJ02.m29865unboximpl() : gv0.m29860constructorimpl(0.0f), f);
        ftg textGeometricTransform = swfVar.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = ftg.f37724c.getNone$ui_text_release();
        }
        ftg textGeometricTransform2 = swfVar2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = ftg.f37724c.getNone$ui_text_release();
        }
        ftg ftgVarLerp = gtg.lerp(textGeometricTransform, textGeometricTransform2, f);
        ye9 ye9Var = (ye9) lerpDiscrete(swfVar.getLocaleList(), swfVar2.getLocaleList(), f);
        long jM30487lerpjxsXWHM = j92.m30487lerpjxsXWHM(swfVar.m32348getBackground0d7_KjU(), swfVar2.m32348getBackground0d7_KjU(), f);
        qqg qqgVar = (qqg) lerpDiscrete(swfVar.getTextDecoration(), swfVar2.getTextDecoration(), f);
        e8f shadow = swfVar.getShadow();
        if (shadow == null) {
            shadow = new e8f(0L, 0L, 0.0f, 7, null);
        }
        e8f shadow2 = swfVar2.getShadow();
        if (shadow2 == null) {
            shadow2 = new e8f(0L, 0L, 0.0f, 7, null);
        }
        return new swf(btgVarLerp, jM32447lerpTextUnitInheritableC3pnCVY, jp6VarLerp, fp6Var, gp6Var, do6Var, str, jM32447lerpTextUnitInheritableC3pnCVY2, gv0.m29859boximpl(fM30132lerpjWV1Mfo), ftgVarLerp, ye9Var, jM30487lerpjxsXWHM, qqgVar, g8f.lerp(shadow, shadow2, f), lerpPlatformStyle(swfVar.getPlatformStyle(), swfVar2.getPlatformStyle(), f), (rp4) lerpDiscrete(swfVar.getDrawStyle(), swfVar2.getDrawStyle(), f), (jt3) null);
    }

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    private static final qxc lerpPlatformStyle(qxc qxcVar, qxc qxcVar2, float f) {
        if (qxcVar == null && qxcVar2 == null) {
            return null;
        }
        if (qxcVar == null) {
            qxcVar = qxc.f76276a.getDefault();
        }
        if (qxcVar2 == null) {
            qxcVar2 = qxc.f76276a.getDefault();
        }
        return C11142pv.lerp(qxcVar, qxcVar2, f);
    }

    /* JADX INFO: renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m32447lerpTextUnitInheritableC3pnCVY(long j, long j2, float f) {
        return (kwg.m30790isUnspecifiedR2X_6o(j) || kwg.m30790isUnspecifiedR2X_6o(j2)) ? ((jwg) lerpDiscrete(jwg.m30603boximpl(j), jwg.m30603boximpl(j2), f)).m30622unboximpl() : kwg.m30792lerpC3pnCVY(j, j2, f);
    }

    private static final qxc mergePlatformStyle(swf swfVar, qxc qxcVar) {
        return swfVar.getPlatformStyle() == null ? qxcVar : qxcVar == null ? swfVar.getPlatformStyle() : swfVar.getPlatformStyle().merge(qxcVar);
    }

    @yfb
    public static final swf resolveSpanStyleDefaults(@yfb swf swfVar) {
        btg btgVarTakeOrElse = swfVar.getTextForegroundStyle$ui_text_release().takeOrElse(C13261a.f86210a);
        long jM32351getFontSizeXSAIIZE = kwg.m30790isUnspecifiedR2X_6o(swfVar.m32351getFontSizeXSAIIZE()) ? f86205a : swfVar.m32351getFontSizeXSAIIZE();
        jp6 fontWeight = swfVar.getFontWeight();
        if (fontWeight == null) {
            fontWeight = jp6.f51403b.getNormal();
        }
        jp6 jp6Var = fontWeight;
        fp6 fp6VarM32352getFontStyle4Lr2A7w = swfVar.m32352getFontStyle4Lr2A7w();
        fp6 fp6VarM29572boximpl = fp6.m29572boximpl(fp6VarM32352getFontStyle4Lr2A7w != null ? fp6VarM32352getFontStyle4Lr2A7w.m29578unboximpl() : fp6.f37355b.m29582getNormal_LCdwA());
        gp6 gp6VarM32353getFontSynthesisZQGJjVo = swfVar.m32353getFontSynthesisZQGJjVo();
        gp6 gp6VarM29840boximpl = gp6.m29840boximpl(gp6VarM32353getFontSynthesisZQGJjVo != null ? gp6VarM32353getFontSynthesisZQGJjVo.m29848unboximpl() : gp6.f40694b.m29849getAllGVVA2EU());
        do6 fontFamily = swfVar.getFontFamily();
        if (fontFamily == null) {
            fontFamily = do6.f30259b.getDefault();
        }
        do6 do6Var = fontFamily;
        String fontFeatureSettings = swfVar.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long jM32354getLetterSpacingXSAIIZE = kwg.m30790isUnspecifiedR2X_6o(swfVar.m32354getLetterSpacingXSAIIZE()) ? f86206b : swfVar.m32354getLetterSpacingXSAIIZE();
        gv0 gv0VarM32349getBaselineShift5SSeXJ0 = swfVar.m32349getBaselineShift5SSeXJ0();
        gv0 gv0VarM29859boximpl = gv0.m29859boximpl(gv0VarM32349getBaselineShift5SSeXJ0 != null ? gv0VarM32349getBaselineShift5SSeXJ0.m29865unboximpl() : gv0.f41237b.m29869getNoney9eOQZs());
        ftg textGeometricTransform = swfVar.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = ftg.f37724c.getNone$ui_text_release();
        }
        ftg ftgVar = textGeometricTransform;
        ye9 localeList = swfVar.getLocaleList();
        if (localeList == null) {
            localeList = ye9.f101294c.getCurrent();
        }
        ye9 ye9Var = localeList;
        long jM32348getBackground0d7_KjU = swfVar.m32348getBackground0d7_KjU();
        if (jM32348getBackground0d7_KjU == 16) {
            jM32348getBackground0d7_KjU = f86207c;
        }
        long j = jM32348getBackground0d7_KjU;
        qqg textDecoration = swfVar.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = qqg.f75141b.getNone();
        }
        qqg qqgVar = textDecoration;
        e8f shadow = swfVar.getShadow();
        if (shadow == null) {
            shadow = e8f.f32134d.getNone();
        }
        e8f e8fVar = shadow;
        qxc platformStyle = swfVar.getPlatformStyle();
        rp4 drawStyle = swfVar.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = nu5.f65694a;
        }
        return new swf(btgVarTakeOrElse, jM32351getFontSizeXSAIIZE, jp6Var, fp6VarM29572boximpl, gp6VarM29840boximpl, do6Var, str, jM32354getLetterSpacingXSAIIZE, gv0VarM29859boximpl, ftgVar, ye9Var, j, qqgVar, e8fVar, platformStyle, drawStyle, (jt3) null);
    }
}
