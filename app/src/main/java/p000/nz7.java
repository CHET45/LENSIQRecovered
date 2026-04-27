package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class nz7 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a */
    public static final int f66112a = 0;

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@gib Canvas canvas, @gib Paint paint, int i, int i2, int i3, int i4, int i5, @gib CharSequence charSequence, int i6, int i7, boolean z, @gib Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1 || !nug.isLineEllipsized(layout, lineForOffset)) {
            return;
        }
        float ellipsizedLeftPadding = oz7.getEllipsizedLeftPadding(layout, lineForOffset, paint) + oz7.getEllipsizedRightPadding(layout, lineForOffset, paint);
        if (ellipsizedLeftPadding == 0.0f) {
            return;
        }
        md8.checkNotNull(canvas);
        canvas.translate(ellipsizedLeftPadding, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
