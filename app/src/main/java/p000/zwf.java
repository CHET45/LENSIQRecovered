package p000;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import java.util.ArrayList;
import java.util.List;
import p000.C9041lz;
import p000.h69;
import p000.lwg;
import p000.qqg;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSpannableExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,566:1\n1#2:567\n235#3,3:568\n33#3,4:571\n238#3,2:575\n38#3:577\n240#3:578\n69#3,6:579\n33#3,6:585\n696#4:591\n696#4:592\n*S KotlinDebug\n*F\n+ 1 SpannableExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/SpannableExtensions_androidKt\n*L\n296#1:568,3\n296#1:571,4\n296#1:575,2\n296#1:577\n296#1:578\n364#1:579,6\n384#1:585,6\n448#1:591\n521#1:592\n*E\n"})
public final class zwf {

    /* JADX INFO: renamed from: zwf$a */
    public static final class C16290a extends tt8 implements kz6<swf, Integer, Integer, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Spannable f106260a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ oz6<do6, jp6, fp6, gp6, Typeface> f106261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C16290a(Spannable spannable, oz6<? super do6, ? super jp6, ? super fp6, ? super gp6, ? extends Typeface> oz6Var) {
            super(3);
            this.f106260a = spannable;
            this.f106261b = oz6Var;
        }

        @Override // p000.kz6
        public /* bridge */ /* synthetic */ bth invoke(swf swfVar, Integer num, Integer num2) {
            invoke(swfVar, num.intValue(), num2.intValue());
            return bth.f14751a;
        }

        public final void invoke(@yfb swf swfVar, int i, int i2) {
            Spannable spannable = this.f106260a;
            oz6<do6, jp6, fp6, gp6, Typeface> oz6Var = this.f106261b;
            do6 fontFamily = swfVar.getFontFamily();
            jp6 fontWeight = swfVar.getFontWeight();
            if (fontWeight == null) {
                fontWeight = jp6.f51403b.getNormal();
            }
            fp6 fp6VarM32352getFontStyle4Lr2A7w = swfVar.m32352getFontStyle4Lr2A7w();
            fp6 fp6VarM29572boximpl = fp6.m29572boximpl(fp6VarM32352getFontStyle4Lr2A7w != null ? fp6VarM32352getFontStyle4Lr2A7w.m29578unboximpl() : fp6.f37355b.m29582getNormal_LCdwA());
            gp6 gp6VarM32353getFontSynthesisZQGJjVo = swfVar.m32353getFontSynthesisZQGJjVo();
            spannable.setSpan(new rnh(oz6Var.invoke(fontFamily, fontWeight, fp6VarM29572boximpl, gp6.m29840boximpl(gp6VarM32353getFontSynthesisZQGJjVo != null ? gp6VarM32353getFontSynthesisZQGJjVo.m29848unboximpl() : gp6.f40694b.m29849getAllGVVA2EU()))), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: createLetterSpacingSpan-eAf_CNQ, reason: not valid java name */
    private static final MetricAffectingSpan m33565createLetterSpacingSpaneAf_CNQ(long j, c64 c64Var) {
        long jM30612getTypeUIouoOA = jwg.m30612getTypeUIouoOA(j);
        lwg.C9014a c9014a = lwg.f59101b;
        if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30923getSpUIouoOA())) {
            return new j49(c64Var.mo27172toPxR2X_6o(j));
        }
        if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30922getEmUIouoOA())) {
            return new i49(jwg.m30613getValueimpl(j));
        }
        return null;
    }

    public static final void flattenFontStylesAndApply(@gib swf swfVar, @yfb List<C9041lz.c<swf>> list, @yfb kz6<? super swf, ? super Integer, ? super Integer, bth> kz6Var) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            kz6Var.invoke(merge(swfVar, list.get(0).getItem()), Integer.valueOf(list.get(0).getStart()), Integer.valueOf(list.get(0).getEnd()));
            return;
        }
        int size = list.size();
        int i = size * 2;
        Integer[] numArr = new Integer[i];
        for (int i2 = 0; i2 < i; i2++) {
            numArr[i2] = 0;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C9041lz.c<swf> cVar = list.get(i3);
            numArr[i3] = Integer.valueOf(cVar.getStart());
            numArr[i3 + size] = Integer.valueOf(cVar.getEnd());
        }
        u70.sort((Object[]) numArr);
        int iIntValue = ((Number) e80.first(numArr)).intValue();
        for (int i4 = 0; i4 < i; i4++) {
            Integer num = numArr[i4];
            int iIntValue2 = num.intValue();
            if (iIntValue2 != iIntValue) {
                int size3 = list.size();
                swf swfVarMerge = swfVar;
                for (int i5 = 0; i5 < size3; i5++) {
                    C9041lz.c<swf> cVar2 = list.get(i5);
                    if (cVar2.getStart() != cVar2.getEnd() && C9611mz.intersect(iIntValue, iIntValue2, cVar2.getStart(), cVar2.getEnd())) {
                        swfVarMerge = merge(swfVarMerge, cVar2.getItem());
                    }
                }
                if (swfVarMerge != null) {
                    kz6Var.invoke(swfVarMerge, Integer.valueOf(iIntValue), num);
                }
                iIntValue = iIntValue2;
            }
        }
    }

    private static final boolean getNeedsLetterSpacingSpan(swf swfVar) {
        long jM30612getTypeUIouoOA = jwg.m30612getTypeUIouoOA(swfVar.m32354getLetterSpacingXSAIIZE());
        lwg.C9014a c9014a = lwg.f59101b;
        return lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30923getSpUIouoOA()) || lwg.m30918equalsimpl0(jwg.m30612getTypeUIouoOA(swfVar.m32354getLetterSpacingXSAIIZE()), c9014a.m30922getEmUIouoOA());
    }

    private static final boolean hasFontAttributes(yvg yvgVar) {
        return cvg.hasFontAttributes(yvgVar.toSpanStyle()) || yvgVar.m33440getFontSynthesisZQGJjVo() != null;
    }

    private static final boolean isNonLinearFontScalingActive(c64 c64Var) {
        return ((double) c64Var.getFontScale()) > 1.05d;
    }

    private static final swf merge(swf swfVar, swf swfVar2) {
        return swfVar == null ? swfVar2 : swfVar.merge(swfVar2);
    }

    /* JADX INFO: renamed from: resolveLineHeightInPx-o2QH7mI, reason: not valid java name */
    private static final float m33566resolveLineHeightInPxo2QH7mI(long j, float f, c64 c64Var) {
        float fM30613getValueimpl;
        long jM30612getTypeUIouoOA = jwg.m30612getTypeUIouoOA(j);
        lwg.C9014a c9014a = lwg.f59101b;
        if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30923getSpUIouoOA())) {
            if (!isNonLinearFontScalingActive(c64Var)) {
                return c64Var.mo27172toPxR2X_6o(j);
            }
            fM30613getValueimpl = jwg.m30613getValueimpl(j) / jwg.m30613getValueimpl(c64Var.mo27176toSpkPz2Gy4(f));
        } else {
            if (!lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30922getEmUIouoOA())) {
                return Float.NaN;
            }
            fM30613getValueimpl = jwg.m30613getValueimpl(j);
        }
        return fM30613getValueimpl * f;
    }

    /* JADX INFO: renamed from: setBackground-RPmYEkk, reason: not valid java name */
    public static final void m33567setBackgroundRPmYEkk(@yfb Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            setSpan(spannable, new BackgroundColorSpan(j92.m30490toArgb8_81llA(j)), i, i2);
        }
    }

    /* JADX INFO: renamed from: setBaselineShift-0ocSgnM, reason: not valid java name */
    private static final void m33568setBaselineShift0ocSgnM(Spannable spannable, gv0 gv0Var, int i, int i2) {
        if (gv0Var != null) {
            setSpan(spannable, new iv0(gv0Var.m29865unboximpl()), i, i2);
        }
    }

    private static final void setBrush(Spannable spannable, he1 he1Var, float f, int i, int i2) {
        if (he1Var != null) {
            if (he1Var instanceof bvf) {
                m33569setColorRPmYEkk(spannable, ((bvf) he1Var).m28160getValue0d7_KjU(), i, i2);
            } else if (he1Var instanceof a8f) {
                setSpan(spannable, new b8f((a8f) he1Var, f), i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: setColor-RPmYEkk, reason: not valid java name */
    public static final void m33569setColorRPmYEkk(@yfb Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            setSpan(spannable, new ForegroundColorSpan(j92.m30490toArgb8_81llA(j)), i, i2);
        }
    }

    private static final void setDrawStyle(Spannable spannable, rp4 rp4Var, int i, int i2) {
        if (rp4Var != null) {
            setSpan(spannable, new sp4(rp4Var), i, i2);
        }
    }

    private static final void setFontAttributes(Spannable spannable, yvg yvgVar, List<C9041lz.c<swf>> list, oz6<? super do6, ? super jp6, ? super fp6, ? super gp6, ? extends Typeface> oz6Var) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C9041lz.c<swf> cVar = list.get(i);
            C9041lz.c<swf> cVar2 = cVar;
            if (cvg.hasFontAttributes(cVar2.getItem()) || cVar2.getItem().m32353getFontSynthesisZQGJjVo() != null) {
                arrayList.add(cVar);
            }
        }
        flattenFontStylesAndApply(hasFontAttributes(yvgVar) ? new swf(0L, 0L, yvgVar.getFontWeight(), yvgVar.m33439getFontStyle4Lr2A7w(), yvgVar.m33440getFontSynthesisZQGJjVo(), yvgVar.getFontFamily(), (String) null, 0L, (gv0) null, (ftg) null, (ye9) null, 0L, (qqg) null, (e8f) null, (qxc) null, (rp4) null, 65475, (jt3) null) : null, arrayList, new C16290a(spannable, oz6Var));
    }

    private static final void setFontFeatureSettings(Spannable spannable, String str, int i, int i2) {
        if (str != null) {
            setSpan(spannable, new jo6(str), i, i2);
        }
    }

    /* JADX INFO: renamed from: setFontSize-KmRG4DE, reason: not valid java name */
    public static final void m33570setFontSizeKmRG4DE(@yfb Spannable spannable, long j, @yfb c64 c64Var, int i, int i2) {
        long jM30612getTypeUIouoOA = jwg.m30612getTypeUIouoOA(j);
        lwg.C9014a c9014a = lwg.f59101b;
        if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30923getSpUIouoOA())) {
            setSpan(spannable, new AbsoluteSizeSpan(p3a.roundToInt(c64Var.mo27172toPxR2X_6o(j)), false), i, i2);
        } else if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30922getEmUIouoOA())) {
            setSpan(spannable, new RelativeSizeSpan(jwg.m30613getValueimpl(j)), i, i2);
        }
    }

    private static final void setGeometricTransform(Spannable spannable, ftg ftgVar, int i, int i2) {
        if (ftgVar != null) {
            setSpan(spannable, new ScaleXSpan(ftgVar.getScaleX()), i, i2);
            setSpan(spannable, new mqf(ftgVar.getSkewX()), i, i2);
        }
    }

    /* JADX INFO: renamed from: setLineHeight-KmRG4DE, reason: not valid java name */
    public static final void m33571setLineHeightKmRG4DE(@yfb Spannable spannable, long j, float f, @yfb c64 c64Var, @yfb h69 h69Var) {
        float fM33566resolveLineHeightInPxo2QH7mI = m33566resolveLineHeightInPxo2QH7mI(j, f, c64Var);
        if (Float.isNaN(fM33566resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new i69(fM33566resolveLineHeightInPxo2QH7mI, 0, (spannable.length() == 0 || t9g.last(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), h69.C6726c.m29943isTrimFirstLineTopimpl$ui_text_release(h69Var.m29926getTrimEVpEnUU()), h69.C6726c.m29944isTrimLastLineBottomimpl$ui_text_release(h69Var.m29926getTrimEVpEnUU()), h69Var.m29925getAlignmentPIaL0Z0()), 0, spannable.length());
    }

    /* JADX INFO: renamed from: setLineHeight-r9BaKPg, reason: not valid java name */
    public static final void m33572setLineHeightr9BaKPg(@yfb Spannable spannable, long j, float f, @yfb c64 c64Var) {
        float fM33566resolveLineHeightInPxo2QH7mI = m33566resolveLineHeightInPxo2QH7mI(j, f, c64Var);
        if (Float.isNaN(fM33566resolveLineHeightInPxo2QH7mI)) {
            return;
        }
        setSpan(spannable, new g69(fM33566resolveLineHeightInPxo2QH7mI), 0, spannable.length());
    }

    public static final void setLocaleList(@yfb Spannable spannable, @gib ye9 ye9Var, int i, int i2) {
        if (ye9Var != null) {
            setSpan(spannable, df9.f29565a.localeSpan(ye9Var), i, i2);
        }
    }

    private static final void setShadow(Spannable spannable, e8f e8fVar, int i, int i2) {
        if (e8fVar != null) {
            setSpan(spannable, new j8f(j92.m30490toArgb8_81llA(e8fVar.m28817getColor0d7_KjU()), izb.m30429getXimpl(e8fVar.m28818getOffsetF1C5BW0()), izb.m30430getYimpl(e8fVar.m28818getOffsetF1C5BW0()), cvg.correctBlurRadius(e8fVar.getBlurRadius())), i, i2);
        }
    }

    public static final void setSpan(@yfb Spannable spannable, @yfb Object obj, int i, int i2) {
        spannable.setSpan(obj, i, i2, 33);
    }

    private static final void setSpanStyle(Spannable spannable, C9041lz.c<swf> cVar, c64 c64Var) {
        int start = cVar.getStart();
        int end = cVar.getEnd();
        swf item = cVar.getItem();
        m33568setBaselineShift0ocSgnM(spannable, item.m32349getBaselineShift5SSeXJ0(), start, end);
        m33569setColorRPmYEkk(spannable, item.m32350getColor0d7_KjU(), start, end);
        setBrush(spannable, item.getBrush(), item.getAlpha(), start, end);
        setTextDecoration(spannable, item.getTextDecoration(), start, end);
        m33570setFontSizeKmRG4DE(spannable, item.m32351getFontSizeXSAIIZE(), c64Var, start, end);
        setFontFeatureSettings(spannable, item.getFontFeatureSettings(), start, end);
        setGeometricTransform(spannable, item.getTextGeometricTransform(), start, end);
        setLocaleList(spannable, item.getLocaleList(), start, end);
        m33567setBackgroundRPmYEkk(spannable, item.m32348getBackground0d7_KjU(), start, end);
        setShadow(spannable, item.getShadow(), start, end);
        setDrawStyle(spannable, item.getDrawStyle(), start, end);
    }

    public static final void setSpanStyles(@yfb Spannable spannable, @yfb yvg yvgVar, @yfb List<C9041lz.c<swf>> list, @yfb c64 c64Var, @yfb oz6<? super do6, ? super jp6, ? super fp6, ? super gp6, ? extends Typeface> oz6Var) {
        MetricAffectingSpan metricAffectingSpanM33565createLetterSpacingSpaneAf_CNQ;
        setFontAttributes(spannable, yvgVar, list, oz6Var);
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C9041lz.c<swf> cVar = list.get(i);
            int start = cVar.getStart();
            int end = cVar.getEnd();
            if (start >= 0 && start < spannable.length() && end > start && end <= spannable.length()) {
                setSpanStyle(spannable, cVar, c64Var);
                if (getNeedsLetterSpacingSpan(cVar.getItem())) {
                    z = true;
                }
            }
        }
        if (z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C9041lz.c<swf> cVar2 = list.get(i2);
                int start2 = cVar2.getStart();
                int end2 = cVar2.getEnd();
                swf item = cVar2.getItem();
                if (start2 >= 0 && start2 < spannable.length() && end2 > start2 && end2 <= spannable.length() && (metricAffectingSpanM33565createLetterSpacingSpaneAf_CNQ = m33565createLetterSpacingSpaneAf_CNQ(item.m32354getLetterSpacingXSAIIZE(), c64Var)) != null) {
                    setSpan(spannable, metricAffectingSpanM33565createLetterSpacingSpaneAf_CNQ, start2, end2);
                }
            }
        }
    }

    public static final void setTextDecoration(@yfb Spannable spannable, @gib qqg qqgVar, int i, int i2) {
        if (qqgVar != null) {
            qqg.C11588a c11588a = qqg.f75141b;
            setSpan(spannable, new rqg(qqgVar.contains(c11588a.getUnderline()), qqgVar.contains(c11588a.getLineThrough())), i, i2);
        }
    }

    public static final void setTextIndent(@yfb Spannable spannable, @gib ntg ntgVar, float f, @yfb c64 c64Var) {
        if (ntgVar != null) {
            if ((jwg.m30610equalsimpl0(ntgVar.m31218getFirstLineXSAIIZE(), kwg.getSp(0)) && jwg.m30610equalsimpl0(ntgVar.m31219getRestLineXSAIIZE(), kwg.getSp(0))) || kwg.m30790isUnspecifiedR2X_6o(ntgVar.m31218getFirstLineXSAIIZE()) || kwg.m30790isUnspecifiedR2X_6o(ntgVar.m31219getRestLineXSAIIZE())) {
                return;
            }
            long jM30612getTypeUIouoOA = jwg.m30612getTypeUIouoOA(ntgVar.m31218getFirstLineXSAIIZE());
            lwg.C9014a c9014a = lwg.f59101b;
            float fM30613getValueimpl = 0.0f;
            float fMo27172toPxR2X_6o = lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30923getSpUIouoOA()) ? c64Var.mo27172toPxR2X_6o(ntgVar.m31218getFirstLineXSAIIZE()) : lwg.m30918equalsimpl0(jM30612getTypeUIouoOA, c9014a.m30922getEmUIouoOA()) ? jwg.m30613getValueimpl(ntgVar.m31218getFirstLineXSAIIZE()) * f : 0.0f;
            long jM30612getTypeUIouoOA2 = jwg.m30612getTypeUIouoOA(ntgVar.m31219getRestLineXSAIIZE());
            if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA2, c9014a.m30923getSpUIouoOA())) {
                fM30613getValueimpl = c64Var.mo27172toPxR2X_6o(ntgVar.m31219getRestLineXSAIIZE());
            } else if (lwg.m30918equalsimpl0(jM30612getTypeUIouoOA2, c9014a.m30922getEmUIouoOA())) {
                fM30613getValueimpl = jwg.m30613getValueimpl(ntgVar.m31219getRestLineXSAIIZE()) * f;
            }
            setSpan(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fMo27172toPxR2X_6o), (int) Math.ceil(fM30613getValueimpl)), 0, spannable.length());
        }
    }
}
