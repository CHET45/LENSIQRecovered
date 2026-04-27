package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes7.dex */
public class v62 extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final xu9 f90046a;

    /* JADX INFO: renamed from: b */
    public final Rect f90047b = qkb.m20417b();

    /* JADX INFO: renamed from: c */
    public final Paint f90048c = qkb.m20416a();

    public v62(@efb xu9 xu9Var) {
        this.f90046a = xu9Var;
    }

    private void apply(TextPaint textPaint) {
        this.f90046a.applyCodeBlockTextStyle(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        this.f90048c.setStyle(Paint.Style.FILL);
        this.f90048c.setColor(this.f90046a.getCodeBlockBackgroundColor(paint));
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            width = i;
        }
        this.f90047b.set(i, i3, width, i5);
        canvas.drawRect(this.f90047b, this.f90048c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.f90046a.getCodeBlockMargin();
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }
}
