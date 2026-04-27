package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes7.dex */
public class kg1 implements LeadingMarginSpan {

    /* JADX INFO: renamed from: f */
    public static final boolean f53999f = false;

    /* JADX INFO: renamed from: a */
    public xu9 f54000a;

    /* JADX INFO: renamed from: b */
    public final Paint f54001b = qkb.m20416a();

    /* JADX INFO: renamed from: c */
    public final RectF f54002c = qkb.m20418c();

    /* JADX INFO: renamed from: d */
    public final Rect f54003d = qkb.m20417b();

    /* JADX INFO: renamed from: e */
    public final int f54004e;

    public kg1(@efb xu9 xu9Var, @h78(from = 0) int i) {
        this.f54000a = xu9Var;
        this.f54004e = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int iMin;
        int iMax;
        if (z && i39.selfStart(i6, charSequence, this)) {
            this.f54001b.set(paint);
            this.f54000a.applyListItemStyle(this.f54001b);
            int iSave = canvas.save();
            try {
                int blockMargin = this.f54000a.getBlockMargin();
                int bulletWidth = this.f54000a.getBulletWidth((int) ((this.f54001b.descent() - this.f54001b.ascent()) + 0.5f));
                int i8 = (blockMargin - bulletWidth) / 2;
                if (f53999f) {
                    int width = i2 < 0 ? i - (layout.getWidth() - (blockMargin * this.f54004e)) : (blockMargin * this.f54004e) - i;
                    int i9 = i + (i8 * i2);
                    int i10 = (i2 * bulletWidth) + i9;
                    int i11 = i2 * width;
                    iMin = Math.min(i9, i10) + i11;
                    iMax = Math.max(i9, i10) + i11;
                } else {
                    if (i2 <= 0) {
                        i -= blockMargin;
                    }
                    iMin = i + i8;
                    iMax = iMin + bulletWidth;
                }
                int iDescent = (i4 + ((int) (((this.f54001b.descent() + this.f54001b.ascent()) / 2.0f) + 0.5f))) - (bulletWidth / 2);
                int i12 = bulletWidth + iDescent;
                int i13 = this.f54004e;
                if (i13 == 0 || i13 == 1) {
                    this.f54002c.set(iMin, iDescent, iMax, i12);
                    this.f54001b.setStyle(this.f54004e == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(this.f54002c, this.f54001b);
                } else {
                    this.f54003d.set(iMin, iDescent, iMax, i12);
                    this.f54001b.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.f54003d, this.f54001b);
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z) {
        return this.f54000a.getBlockMargin();
    }
}
