package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes7.dex */
public class xwg implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public final xu9 f99598a;

    /* JADX INFO: renamed from: b */
    public final Rect f99599b = qkb.m20417b();

    /* JADX INFO: renamed from: c */
    public final Paint f99600c = qkb.m20416a();

    public xwg(@efb xu9 xu9Var) {
        this.f99598a = xu9Var;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = i3 + ((i5 - i3) / 2);
        this.f99600c.set(paint);
        this.f99598a.applyThematicBreakStyle(this.f99600c);
        int strokeWidth = (int) ((((int) (this.f99600c.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        this.f99599b.set(i, i8 - strokeWidth, width, i8 + strokeWidth);
        canvas.drawRect(this.f99599b, this.f99600c);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
