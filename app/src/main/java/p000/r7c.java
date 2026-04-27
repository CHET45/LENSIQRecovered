package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public class r7c implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final xu9 f77334a;

    /* JADX INFO: renamed from: b */
    public final String f77335b;

    /* JADX INFO: renamed from: c */
    public final Paint f77336c = qkb.m20416a();

    /* JADX INFO: renamed from: d */
    public int f77337d;

    public r7c(@efb xu9 xu9Var, @efb String str) {
        this.f77334a = xu9Var;
        this.f77335b = str;
    }

    public static void measure(@efb TextView textView, @efb CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            r7c[] r7cVarArr = (r7c[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), r7c.class);
            if (r7cVarArr != null) {
                TextPaint paint = textView.getPaint();
                for (r7c r7cVar : r7cVarArr) {
                    r7cVar.f77337d = (int) (paint.measureText(r7cVar.f77335b) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (z && i39.selfStart(i6, charSequence, this)) {
            this.f77336c.set(paint);
            this.f77334a.applyListItemStyle(this.f77336c);
            int iMeasureText = (int) (this.f77336c.measureText(this.f77335b) + 0.5f);
            int blockMargin = this.f77334a.getBlockMargin();
            if (iMeasureText > blockMargin) {
                this.f77337d = iMeasureText;
                blockMargin = iMeasureText;
            } else {
                this.f77337d = 0;
            }
            canvas.drawText(this.f77335b, i2 > 0 ? (i + (blockMargin * i2)) - iMeasureText : i + (i2 * blockMargin) + (blockMargin - iMeasureText), i4, this.f77336c);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return Math.max(this.f77337d, this.f77334a.getBlockMargin());
    }
}
