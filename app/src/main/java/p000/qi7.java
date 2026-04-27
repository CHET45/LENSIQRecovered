package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes7.dex */
public class qi7 extends MetricAffectingSpan implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final xu9 f74499a;

    /* JADX INFO: renamed from: b */
    public final Rect f74500b = qkb.m20417b();

    /* JADX INFO: renamed from: c */
    public final Paint f74501c = qkb.m20416a();

    /* JADX INFO: renamed from: d */
    public final int f74502d;

    public qi7(@efb xu9 xu9Var, @h78(from = 1, m12174to = MediaDescriptionCompat.BT_FOLDER_TYPE_YEARS) int i) {
        this.f74499a = xu9Var;
        this.f74502d = i;
    }

    private void apply(TextPaint textPaint) {
        this.f74499a.applyHeadingTextStyle(textPaint, this.f74502d);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = this.f74502d;
        if ((i8 == 1 || i8 == 2) && i39.selfEnd(i7, charSequence, this)) {
            this.f74501c.set(paint);
            this.f74499a.applyHeadingBreakStyle(this.f74501c);
            float strokeWidth = this.f74501c.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i9 = (int) ((i5 - strokeWidth) + 0.5f);
                if (i2 > 0) {
                    width = canvas.getWidth();
                } else {
                    width = i;
                    i -= canvas.getWidth();
                }
                this.f74500b.set(i, i9, width, i5);
                canvas.drawRect(this.f74500b, this.f74501c);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }

    public int getLevel() {
        return this.f74502d;
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
