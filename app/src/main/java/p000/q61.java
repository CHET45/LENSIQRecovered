package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes7.dex */
public class q61 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final xu9 f73304a;

    /* JADX INFO: renamed from: b */
    public final Rect f73305b = qkb.m20417b();

    /* JADX INFO: renamed from: c */
    public final Paint f73306c = qkb.m20416a();

    public q61(@efb xu9 xu9Var) {
        this.f73304a = xu9Var;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int blockQuoteWidth = this.f73304a.getBlockQuoteWidth();
        this.f73306c.set(paint);
        this.f73304a.applyBlockQuoteStyle(this.f73306c);
        int i8 = i2 * blockQuoteWidth;
        int i9 = i + i8;
        int i10 = i8 + i9;
        this.f73305b.set(Math.min(i9, i10), i3, Math.max(i9, i10), i5);
        canvas.drawRect(this.f73305b, this.f73306c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.f73304a.getBlockMargin();
    }
}
