package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes7.dex */
public class q90 extends ReplacementSpan {

    /* JADX INFO: renamed from: e */
    public static final int f73666e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f73667f = 1;

    /* JADX INFO: renamed from: m */
    public static final int f73668m = 2;

    /* JADX INFO: renamed from: a */
    public final xu9 f73669a;

    /* JADX INFO: renamed from: b */
    public final m90 f73670b;

    /* JADX INFO: renamed from: c */
    public final int f73671c;

    /* JADX INFO: renamed from: d */
    public final boolean f73672d;

    public q90(@efb xu9 xu9Var, @efb m90 m90Var, int i, boolean z) {
        this.f73669a = xu9Var;
        this.f73670b = m90Var;
        this.f73671c = i;
        this.f73672d = z;
    }

    private static float textCenterY(int i, int i2, @efb Paint paint) {
        return (int) ((i + ((i2 - i) / 2)) - (((paint.descent() + paint.ascent()) / 2.0f) + 0.5f));
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@efb Canvas canvas, CharSequence charSequence, @h78(from = 0) int i, @h78(from = 0) int i2, float f, int i3, int i4, int i5, @efb Paint paint) {
        int iHeight;
        this.f73670b.initWithKnownDimensions(wwf.width(canvas, charSequence), paint.getTextSize());
        m90 m90Var = this.f73670b;
        if (!m90Var.hasResult()) {
            float fTextCenterY = textCenterY(i3, i5, paint);
            if (this.f73672d) {
                this.f73669a.applyLinkStyle(paint);
            }
            canvas.drawText(charSequence, i, i2, f, fTextCenterY, paint);
            return;
        }
        int i6 = i5 - m90Var.getBounds().bottom;
        int iSave = canvas.save();
        try {
            int i7 = this.f73671c;
            if (2 != i7) {
                if (1 == i7) {
                    iHeight = paint.getFontMetricsInt().descent;
                }
                canvas.translate(f, i6);
                m90Var.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            iHeight = ((i5 - i3) - m90Var.getBounds().height()) / 2;
            i6 -= iHeight;
            canvas.translate(f, i6);
            m90Var.draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    @efb
    public m90 getDrawable() {
        return this.f73670b;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@efb Paint paint, CharSequence charSequence, @h78(from = 0) int i, @h78(from = 0) int i2, @hib Paint.FontMetricsInt fontMetricsInt) {
        if (!this.f73670b.hasResult()) {
            if (this.f73672d) {
                this.f73669a.applyLinkStyle(paint);
            }
            return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
        }
        Rect bounds = this.f73670b.getBounds();
        if (fontMetricsInt != null) {
            int i3 = -bounds.bottom;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
