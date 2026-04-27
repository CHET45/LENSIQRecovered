package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.C1035c;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(19)
@p7e({p7e.EnumC10826a.f69935b})
public final class mnh extends fz4 {

    /* JADX INFO: renamed from: m */
    @hib
    public static Paint f61585m;

    /* JADX INFO: renamed from: f */
    @hib
    public TextPaint f61586f;

    public mnh(@efb lnh lnhVar) {
        super(lnhVar);
    }

    @hib
    private TextPaint applyCharacterSpanStyles(@hib CharSequence charSequence, int i, int i2, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.f61586f;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.f61586f = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    characterStyle.updateDrawState(textPaint);
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    @efb
    private static Paint getDebugPaint() {
        if (f61585m == null) {
            TextPaint textPaint = new TextPaint();
            f61585m = textPaint;
            textPaint.setColor(C1035c.get().getEmojiSpanIndicatorColor());
            f61585m.setStyle(Paint.Style.FILL);
        }
        return f61585m;
    }

    /* JADX INFO: renamed from: c */
    public void m17474c(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@efb Canvas canvas, @igg({"UnknownNullness"}) CharSequence charSequence, @h78(from = 0) int i, @h78(from = 0) int i2, float f, int i3, int i4, int i5, @efb Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaintApplyCharacterSpanStyles = applyCharacterSpanStyles(charSequence, i, i2, paint2);
        if (textPaintApplyCharacterSpanStyles != null && textPaintApplyCharacterSpanStyles.bgColor != 0) {
            m17474c(canvas, textPaintApplyCharacterSpanStyles, f, f + m11237b(), i3, i5);
        }
        if (C1035c.get().isEmojiSpanIndicatorEnabled()) {
            canvas.drawRect(f, i3, f + m11237b(), i5, getDebugPaint());
        }
        lnh typefaceRasterizer = getTypefaceRasterizer();
        float f2 = i4;
        if (textPaintApplyCharacterSpanStyles != null) {
            paint2 = textPaintApplyCharacterSpanStyles;
        }
        typefaceRasterizer.draw(canvas, f, f2, paint2);
    }
}
