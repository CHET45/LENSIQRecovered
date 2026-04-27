package p000;

import java.util.List;
import p000.C9041lz;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,399:1\n272#2,14:400\n272#2,14:414\n272#2,9:428\n282#2,4:440\n272#2,14:444\n702#3:437\n708#3:438\n696#3:439\n205#4:458\n205#4:461\n26#5:459\n26#5:460\n26#5:462\n26#5:463\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n167#1:400,14\n233#1:414,14\n277#1:428,9\n277#1:440,4\n337#1:444,14\n284#1:437\n297#1:438\n297#1:439\n375#1:458\n387#1:461\n378#1:459\n380#1:460\n390#1:462\n392#1:463\n*E\n"})
public final class evg {
    private static final void clip(tp4 tp4Var, hug hugVar) {
        if (!hugVar.getHasVisualOverflow() || bvg.m28164equalsimpl0(hugVar.getLayoutInput().m29858getOverflowgIe3tQ8(), bvg.f14961b.m28173getVisiblegIe3tQ8())) {
            return;
        }
        tp4.m32428clipRectN_I0leg$default(tp4Var, 0.0f, 0.0f, r78.m32087getWidthimpl(hugVar.m30130getSizeYbymL2g()), r78.m32086getHeightimpl(hugVar.m30130getSizeYbymL2g()), 0, 16, null);
    }

    /* JADX INFO: renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m28858drawTextJFhB2K4(@yfb ip4 ip4Var, @yfb uug uugVar, @yfb C9041lz c9041lz, long j, @yfb yvg yvgVar, int i, boolean z, int i2, @yfb List<C9041lz.c<ewc>> list, long j2, int i3) {
        hug hugVarM32662measurexDpz5zY$default = uug.m32662measurexDpz5zY$default(uugVar, c9041lz, yvgVar, i, z, i2, list, m28866textLayoutConstraintsv_w8tDc(ip4Var, j2, j), ip4Var.getLayoutDirection(), ip4Var, null, false, 1536, null);
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            tp4 transform = drawContext.getTransform();
            transform.translate(izb.m30429getXimpl(j), izb.m30430getYimpl(j));
            clip(transform, hugVarM32662measurexDpz5zY$default);
            hugVarM32662measurexDpz5zY$default.getMultiParagraph().m32535paintLG529CI(ip4Var.getDrawContext().getCanvas(), (32 & 2) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? ip4.f47823w.m30275getDefaultBlendMode0nO6VwU() : i3);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m28860drawTextLVfH_YU(@yfb ip4 ip4Var, @yfb hug hugVar, @yfb he1 he1Var, long j, float f, @gib e8f e8fVar, @gib qqg qqgVar, @gib rp4 rp4Var, int i) {
        e8f shadow = e8fVar == null ? hugVar.getLayoutInput().getStyle().getShadow() : e8fVar;
        qqg textDecoration = qqgVar == null ? hugVar.getLayoutInput().getStyle().getTextDecoration() : qqgVar;
        rp4 drawStyle = rp4Var == null ? hugVar.getLayoutInput().getStyle().getDrawStyle() : rp4Var;
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            tp4 transform = drawContext.getTransform();
            transform.translate(izb.m30429getXimpl(j), izb.m30430getYimpl(j));
            clip(transform, hugVar);
            hugVar.getMultiParagraph().m32537painthn5TExg(ip4Var.getDrawContext().getCanvas(), he1Var, !Float.isNaN(f) ? f : hugVar.getLayoutInput().getStyle().getAlpha(), shadow, textDecoration, drawStyle, i);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m28862drawTextTPWCCtM(@yfb ip4 ip4Var, @yfb uug uugVar, @yfb String str, long j, @yfb yvg yvgVar, int i, boolean z, int i2, long j2, int i3) {
        hug hugVarM32662measurexDpz5zY$default = uug.m32662measurexDpz5zY$default(uugVar, new C9041lz(str, null, null, 6, null), yvgVar, i, z, i2, null, m28866textLayoutConstraintsv_w8tDc(ip4Var, j2, j), ip4Var.getLayoutDirection(), ip4Var, null, false, 1568, null);
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            tp4 transform = drawContext.getTransform();
            transform.translate(izb.m30429getXimpl(j), izb.m30430getYimpl(j));
            clip(transform, hugVarM32662measurexDpz5zY$default);
            hugVarM32662measurexDpz5zY$default.getMultiParagraph().m32535paintLG529CI(ip4Var.getDrawContext().getCanvas(), (32 & 2) != 0 ? w82.f93556b.m32987getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? ip4.f47823w.m30275getDefaultBlendMode0nO6VwU() : i3);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
        }
    }

    /* JADX INFO: renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m28864drawTextd8rzKo(@yfb ip4 ip4Var, @yfb hug hugVar, long j, long j2, float f, @gib e8f e8fVar, @gib qqg qqgVar, @gib rp4 rp4Var, int i) {
        e8f shadow = e8fVar == null ? hugVar.getLayoutInput().getStyle().getShadow() : e8fVar;
        qqg textDecoration = qqgVar == null ? hugVar.getLayoutInput().getStyle().getTextDecoration() : qqgVar;
        rp4 drawStyle = rp4Var == null ? hugVar.getLayoutInput().getStyle().getDrawStyle() : rp4Var;
        bp4 drawContext = ip4Var.getDrawContext();
        long jMo28019getSizeNHjbRc = drawContext.mo28019getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            tp4 transform = drawContext.getTransform();
            transform.translate(izb.m30429getXimpl(j2), izb.m30430getYimpl(j2));
            clip(transform, hugVar);
            he1 brush = hugVar.getLayoutInput().getStyle().getBrush();
            if (brush == null || j != 16) {
                hugVar.getMultiParagraph().m32535paintLG529CI(ip4Var.getDrawContext().getCanvas(), arg.m27876modulateDxMtmZc(j != 16 ? j : hugVar.getLayoutInput().getStyle().m33437getColor0d7_KjU(), f), shadow, textDecoration, drawStyle, i);
            } else {
                hugVar.getMultiParagraph().m32537painthn5TExg(ip4Var.getDrawContext().getCanvas(), brush, !Float.isNaN(f) ? f : hugVar.getLayoutInput().getStyle().getAlpha(), shadow, textDecoration, drawStyle, i);
            }
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
        } catch (Throwable th) {
            drawContext.getCanvas().restore();
            drawContext.mo28020setSizeuvyYCjk(jMo28019getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX INFO: renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m28866textLayoutConstraintsv_w8tDc(ip4 ip4Var, long j, long j2) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4 = 0;
        if (j == j28.f49422d || Float.isNaN(wpf.m33069getWidthimpl(j))) {
            iRound = Math.round((float) Math.ceil(wpf.m33069getWidthimpl(ip4Var.mo30273getSizeNHjbRc()) - izb.m30429getXimpl(j2)));
            iRound2 = 0;
        } else {
            iRound2 = Math.round((float) Math.ceil(wpf.m33069getWidthimpl(j)));
            iRound = iRound2;
        }
        if (j == j28.f49422d || Float.isNaN(wpf.m33066getHeightimpl(j))) {
            iRound3 = Math.round((float) Math.ceil(wpf.m33066getHeightimpl(ip4Var.mo30273getSizeNHjbRc()) - izb.m30430getYimpl(j2)));
        } else {
            iRound4 = Math.round((float) Math.ceil(wpf.m33066getHeightimpl(j)));
            iRound3 = iRound4;
        }
        return nu2.Constraints(iRound2, iRound, iRound4, iRound3);
    }
}
