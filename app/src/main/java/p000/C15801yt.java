package p000;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.C1035c;
import java.util.List;
import p000.C9041lz;

/* JADX INFO: renamed from: yt */
/* JADX INFO: loaded from: classes.dex */
public final class C15801yt {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final a f102927a = new a();

    /* JADX INFO: renamed from: yt$a */
    public static final class a extends CharacterStyle {
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(@gib TextPaint textPaint) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.emoji2.text.c] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @yfb
    public static final CharSequence createCharSequence(@yfb String str, float f, @yfb yvg yvgVar, @yfb List<C9041lz.c<swf>> list, @yfb List<C9041lz.c<ewc>> list2, @yfb c64 c64Var, @yfb oz6<? super do6, ? super jp6, ? super fp6, ? super gp6, ? extends Typeface> oz6Var, boolean z) {
        CharSequence charSequenceProcess;
        mxc paragraphStyle;
        if (z && C1035c.isConfigured()) {
            zxc platformStyle = yvgVar.getPlatformStyle();
            gz4 gz4VarM29879boximpl = (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : gz4.m29879boximpl(paragraphStyle.m31090getEmojiSupportMatch_3YsG6Y());
            charSequenceProcess = C1035c.get().process(str, 0, str.length(), Integer.MAX_VALUE, gz4VarM29879boximpl == null ? 0 : gz4.m29882equalsimpl0(gz4VarM29879boximpl.m29885unboximpl(), gz4.f41853b.m29886getAll_3YsG6Y()));
            md8.checkNotNull(charSequenceProcess);
        } else {
            charSequenceProcess = str;
        }
        if (list.isEmpty() && list2.isEmpty() && md8.areEqual(yvgVar.getTextIndent(), ntg.f65666c.getNone()) && kwg.m30790isUnspecifiedR2X_6o(yvgVar.m33446getLineHeightXSAIIZE())) {
            return charSequenceProcess;
        }
        Spannable spannableString = charSequenceProcess instanceof Spannable ? (Spannable) charSequenceProcess : new SpannableString(charSequenceProcess);
        if (md8.areEqual(yvgVar.getTextDecoration(), qqg.f75141b.getUnderline())) {
            zwf.setSpan(spannableString, f102927a, 0, str.length());
        }
        if (isIncludeFontPaddingEnabled(yvgVar) && yvgVar.getLineHeightStyle() == null) {
            zwf.m33572setLineHeightr9BaKPg(spannableString, yvgVar.m33446getLineHeightXSAIIZE(), f, c64Var);
        } else {
            h69 lineHeightStyle = yvgVar.getLineHeightStyle();
            if (lineHeightStyle == null) {
                lineHeightStyle = h69.f42479c.getDefault();
            }
            zwf.m33571setLineHeightKmRG4DE(spannableString, yvgVar.m33446getLineHeightXSAIIZE(), f, c64Var, lineHeightStyle);
        }
        zwf.setTextIndent(spannableString, yvgVar.getTextIndent(), f, c64Var);
        zwf.setSpanStyles(spannableString, yvgVar, list, c64Var, oz6Var);
        jwc.setPlaceholders(spannableString, list2, c64Var);
        return spannableString;
    }

    public static final boolean isIncludeFontPaddingEnabled(@yfb yvg yvgVar) {
        mxc paragraphStyle;
        zxc platformStyle = yvgVar.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            return false;
        }
        return paragraphStyle.getIncludeFontPadding();
    }
}
