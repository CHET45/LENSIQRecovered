package p000;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import p000.C9041lz;
import p000.b79;
import p000.do6;
import p000.p7e;
import p000.qqg;

/* JADX INFO: renamed from: po */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidAccessibilitySpannableString.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n33#2,6:206\n33#2,6:212\n33#2,6:218\n33#2,6:224\n*S KotlinDebug\n*F\n+ 1 AndroidAccessibilitySpannableString.android.kt\nandroidx/compose/ui/text/platform/AndroidAccessibilitySpannableString_androidKt\n*L\n60#1:206,6\n67#1:212,6\n77#1:218,6\n86#1:224,6\n*E\n"})
public final class C11042po {
    private static final void setSpanStyle(SpannableString spannableString, swf swfVar, int i, int i2, c64 c64Var, do6.InterfaceC4891b interfaceC4891b) {
        zwf.m33569setColorRPmYEkk(spannableString, swfVar.m32350getColor0d7_KjU(), i, i2);
        zwf.m33570setFontSizeKmRG4DE(spannableString, swfVar.m32351getFontSizeXSAIIZE(), c64Var, i, i2);
        if (swfVar.getFontWeight() != null || swfVar.m32352getFontStyle4Lr2A7w() != null) {
            jp6 fontWeight = swfVar.getFontWeight();
            if (fontWeight == null) {
                fontWeight = jp6.f51403b.getNormal();
            }
            fp6 fp6VarM32352getFontStyle4Lr2A7w = swfVar.m32352getFontStyle4Lr2A7w();
            spannableString.setSpan(new StyleSpan(C15792ys.m33403getAndroidTypefaceStyleFO1MlWM(fontWeight, fp6VarM32352getFontStyle4Lr2A7w != null ? fp6VarM32352getFontStyle4Lr2A7w.m29578unboximpl() : fp6.f37355b.m29582getNormal_LCdwA())), i, i2, 33);
        }
        if (swfVar.getFontFamily() != null) {
            if (swfVar.getFontFamily() instanceof z27) {
                spannableString.setSpan(new TypefaceSpan(((z27) swfVar.getFontFamily()).getName()), i, i2, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                do6 fontFamily = swfVar.getFontFamily();
                gp6 gp6VarM32353getFontSynthesisZQGJjVo = swfVar.m32353getFontSynthesisZQGJjVo();
                Object value = do6.InterfaceC4891b.m28658resolveDPcqOEQ$default(interfaceC4891b, fontFamily, null, 0, gp6VarM32353getFontSynthesisZQGJjVo != null ? gp6VarM32353getFontSynthesisZQGJjVo.m29848unboximpl() : gp6.f40694b.m29849getAllGVVA2EU(), 6, null).getValue();
                md8.checkNotNull(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(r00.f76426a.createTypefaceSpan((Typeface) value), i, i2, 33);
            }
        }
        if (swfVar.getTextDecoration() != null) {
            qqg textDecoration = swfVar.getTextDecoration();
            qqg.C11588a c11588a = qqg.f75141b;
            if (textDecoration.contains(c11588a.getUnderline())) {
                spannableString.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (swfVar.getTextDecoration().contains(c11588a.getLineThrough())) {
                spannableString.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
        }
        if (swfVar.getTextGeometricTransform() != null) {
            spannableString.setSpan(new ScaleXSpan(swfVar.getTextGeometricTransform().getScaleX()), i, i2, 33);
        }
        zwf.setLocaleList(spannableString, swfVar.getLocaleList(), i, i2);
        zwf.m33567setBackgroundRPmYEkk(spannableString, swfVar.m32348getBackground0d7_KjU(), i, i2);
    }

    @vb8
    @yfb
    @p7e({p7e.EnumC10826a.f69935b})
    public static final SpannableString toAccessibilitySpannableString(@yfb C9041lz c9041lz, @yfb c64 c64Var, @yfb do6.InterfaceC4891b interfaceC4891b, @yfb cqh cqhVar) {
        SpannableString spannableString = new SpannableString(c9041lz.getText());
        List<C9041lz.c<swf>> spanStylesOrNull$ui_text_release = c9041lz.getSpanStylesOrNull$ui_text_release();
        if (spanStylesOrNull$ui_text_release != null) {
            int size = spanStylesOrNull$ui_text_release.size();
            for (int i = 0; i < size; i++) {
                C9041lz.c<swf> cVar = spanStylesOrNull$ui_text_release.get(i);
                swf swfVarComponent1 = cVar.component1();
                setSpanStyle(spannableString, swfVarComponent1.m32345copyGSF8kmg((65503 & 1) != 0 ? swfVarComponent1.m32350getColor0d7_KjU() : 0L, (65503 & 2) != 0 ? swfVarComponent1.f83171b : 0L, (65503 & 4) != 0 ? swfVarComponent1.f83172c : null, (65503 & 8) != 0 ? swfVarComponent1.f83173d : null, (65503 & 16) != 0 ? swfVarComponent1.f83174e : null, (65503 & 32) != 0 ? swfVarComponent1.f83175f : null, (65503 & 64) != 0 ? swfVarComponent1.f83176g : null, (65503 & 128) != 0 ? swfVarComponent1.f83177h : 0L, (65503 & 256) != 0 ? swfVarComponent1.f83178i : null, (65503 & 512) != 0 ? swfVarComponent1.f83179j : null, (65503 & 1024) != 0 ? swfVarComponent1.f83180k : null, (65503 & 2048) != 0 ? swfVarComponent1.f83181l : 0L, (65503 & 4096) != 0 ? swfVarComponent1.f83182m : null, (65503 & 8192) != 0 ? swfVarComponent1.f83183n : null, (65503 & 16384) != 0 ? swfVarComponent1.f83184o : null, (65503 & 32768) != 0 ? swfVarComponent1.f83185p : null), cVar.component2(), cVar.component3(), c64Var, interfaceC4891b);
            }
        }
        List<C9041lz.c<skh>> ttsAnnotations = c9041lz.getTtsAnnotations(0, c9041lz.length());
        int size2 = ttsAnnotations.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C9041lz.c<skh> cVar2 = ttsAnnotations.get(i2);
            spannableString.setSpan(tkh.toSpan(cVar2.component1()), cVar2.component2(), cVar2.component3(), 33);
        }
        List<C9041lz.c<eyh>> urlAnnotations = c9041lz.getUrlAnnotations(0, c9041lz.length());
        int size3 = urlAnnotations.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C9041lz.c<eyh> cVar3 = urlAnnotations.get(i3);
            spannableString.setSpan(cqhVar.toURLSpan(cVar3.component1()), cVar3.component2(), cVar3.component3(), 33);
        }
        List<C9041lz.c<b79>> linkAnnotations = c9041lz.getLinkAnnotations(0, c9041lz.length());
        int size4 = linkAnnotations.size();
        for (int i4 = 0; i4 < size4; i4++) {
            C9041lz.c<b79> cVar4 = linkAnnotations.get(i4);
            b79 item = cVar4.getItem();
            if ((item instanceof b79.C1771b) && item.getLinkInteractionListener() == null) {
                spannableString.setSpan(cqhVar.toURLSpan(toUrlLink(cVar4)), cVar4.getStart(), cVar4.getEnd(), 33);
            } else {
                spannableString.setSpan(cqhVar.toClickableSpan(cVar4), cVar4.getStart(), cVar4.getEnd(), 33);
            }
        }
        return spannableString;
    }

    private static final C9041lz.c<b79.C1771b> toUrlLink(C9041lz.c<b79> cVar) {
        b79 item = cVar.getItem();
        md8.checkNotNull(item, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new C9041lz.c<>((b79.C1771b) item, cVar.getStart(), cVar.getEnd());
    }
}
