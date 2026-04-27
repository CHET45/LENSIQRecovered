package p000;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout_androidKt\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1155:1\n25#2:1156\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/TextLayout_androidKt\n*L\n986#1:1156\n*E\n"})
public final class nug {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final dqg f65755a = new dqg();

    /* JADX INFO: renamed from: b */
    public static final long f65756b = VerticalPaddings(0, 0);

    public static final long VerticalPaddings(int i, int i2) {
        return h5i.m29917constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt getLastLineMetrics(cug cugVar, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, i69[] i69VarArr) {
        int lineCount = cugVar.getLineCount() - 1;
        if (cugVar.getLayout().getLineStart(lineCount) != cugVar.getLayout().getLineEnd(lineCount) || i69VarArr == null || i69VarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        i69 i69Var = (i69) e80.first(i69VarArr);
        spannableString.setSpan(i69Var.copy$ui_text_release(0, spannableString.length(), (lineCount == 0 || !i69Var.getTrimLastLineBottom()) ? i69Var.getTrimLastLineBottom() : false), 0, spannableString.length(), 33);
        StaticLayout staticLayoutCreate = t3g.f83665a.create(spannableString, textPaint, Integer.MAX_VALUE, (2072512 & 8) != 0 ? 0 : 0, (2072512 & 16) != 0 ? spannableString.length() : spannableString.length(), (2072512 & 32) != 0 ? jv8.f52020a.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() : textDirectionHeuristic, (2072512 & 64) != 0 ? jv8.f52020a.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() : null, (2072512 & 128) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 256) != 0 ? null : null, (2072512 & 512) != 0 ? Integer.MAX_VALUE : 0, (2072512 & 1024) != 0 ? 1.0f : 0.0f, (2072512 & 2048) != 0 ? 0.0f : 0.0f, (2072512 & 4096) != 0 ? 0 : 0, (2072512 & 8192) != 0 ? false : cugVar.getIncludePadding(), (2072512 & 16384) != 0 ? true : cugVar.getFallbackLineSpacing(), (32768 & 2072512) != 0 ? 0 : 0, (65536 & 2072512) != 0 ? 0 : 0, (131072 & 2072512) != 0 ? 0 : 0, (262144 & 2072512) != 0 ? 0 : 0, (524288 & 2072512) != 0 ? null : null, (2072512 & 1048576) != 0 ? null : null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = staticLayoutCreate.getLineAscent(0);
        fontMetricsInt.descent = staticLayoutCreate.getLineDescent(0);
        fontMetricsInt.top = staticLayoutCreate.getLineTop(0);
        fontMetricsInt.bottom = staticLayoutCreate.getLineBottom(0);
        return fontMetricsInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLineHeightPaddings(i69[] i69VarArr) {
        int iMax = 0;
        int iMax2 = 0;
        for (i69 i69Var : i69VarArr) {
            if (i69Var.getFirstAscentDiff() < 0) {
                iMax = Math.max(iMax, Math.abs(i69Var.getFirstAscentDiff()));
            }
            if (i69Var.getLastDescentDiff() < 0) {
                iMax2 = Math.max(iMax, Math.abs(i69Var.getLastDescentDiff()));
            }
        }
        return (iMax == 0 && iMax2 == 0) ? f65756b : VerticalPaddings(iMax, iMax2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i69[] getLineHeightSpans(cug cugVar) {
        if (!(cugVar.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = cugVar.getText();
        md8.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        if (!gxf.hasSpan((Spanned) text, i69.class) && cugVar.getText().length() > 0) {
            return null;
        }
        CharSequence text2 = cugVar.getText();
        md8.checkNotNull(text2, "null cannot be cast to non-null type android.text.Spanned");
        return (i69[]) ((Spanned) text2).getSpans(0, cugVar.getText().length(), i69.class);
    }

    @yfb
    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getVerticalPaddings(cug cugVar) {
        if (cugVar.getIncludePadding() || cugVar.isFallbackLinespacingApplied$ui_text_release()) {
            return f65756b;
        }
        TextPaint paint = cugVar.getLayout().getPaint();
        CharSequence text = cugVar.getLayout().getText();
        Rect charSequenceBounds = lcc.getCharSequenceBounds(paint, text, cugVar.getLayout().getLineStart(0), cugVar.getLayout().getLineEnd(0));
        int lineAscent = cugVar.getLayout().getLineAscent(0);
        int i = charSequenceBounds.top;
        int topPadding = i < lineAscent ? lineAscent - i : cugVar.getLayout().getTopPadding();
        if (cugVar.getLineCount() != 1) {
            int lineCount = cugVar.getLineCount() - 1;
            charSequenceBounds = lcc.getCharSequenceBounds(paint, text, cugVar.getLayout().getLineStart(lineCount), cugVar.getLayout().getLineEnd(lineCount));
        }
        int lineDescent = cugVar.getLayout().getLineDescent(cugVar.getLineCount() - 1);
        int i2 = charSequenceBounds.bottom;
        int bottomPadding = i2 > lineDescent ? i2 - lineDescent : cugVar.getLayout().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? f65756b : VerticalPaddings(topPadding, bottomPadding);
    }

    public static final boolean isLineEllipsized(@yfb Layout layout, int i) {
        return layout.getEllipsisCount(i) > 0;
    }
}
