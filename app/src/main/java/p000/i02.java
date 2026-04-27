package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class i02 extends zq4<CircularProgressIndicatorSpec> {

    /* JADX INFO: renamed from: c */
    public int f45358c;

    /* JADX INFO: renamed from: d */
    public float f45359d;

    /* JADX INFO: renamed from: e */
    public float f45360e;

    /* JADX INFO: renamed from: f */
    public float f45361f;

    public i02(@efb CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f45358c = 1;
    }

    private void drawRoundedEnd(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f45361f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    private int getSize() {
        S s = this.f105741a;
        return ((CircularProgressIndicatorSpec) s).f22104g + (((CircularProgressIndicatorSpec) s).f22105h * 2);
    }

    @Override // p000.zq4
    /* JADX INFO: renamed from: a */
    public void mo12680a(@efb Canvas canvas, @efb Paint paint) {
        int iCompositeARGBWithAlpha = ow9.compositeARGBWithAlpha(((CircularProgressIndicatorSpec) this.f105741a).f55273d, this.f105742b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(iCompositeARGBWithAlpha);
        paint.setStrokeWidth(this.f45359d);
        float f = this.f45361f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // p000.zq4
    public void adjustCanvas(@efb Canvas canvas, @efb Rect rect, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        float fWidth = rect.width() / getPreferredWidth();
        float fHeight = rect.height() / getPreferredHeight();
        S s = this.f105741a;
        float f2 = (((CircularProgressIndicatorSpec) s).f22104g / 2.0f) + ((CircularProgressIndicatorSpec) s).f22105h;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.scale(fWidth, fHeight);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.f45358c = ((CircularProgressIndicatorSpec) this.f105741a).f22106i == 0 ? 1 : -1;
        this.f45359d = ((CircularProgressIndicatorSpec) r8).f55270a * f;
        this.f45360e = ((CircularProgressIndicatorSpec) r8).f55271b * f;
        this.f45361f = (((CircularProgressIndicatorSpec) r8).f22104g - ((CircularProgressIndicatorSpec) r8).f55270a) / 2.0f;
        if ((this.f105742b.isShowing() && ((CircularProgressIndicatorSpec) this.f105741a).f55274e == 2) || (this.f105742b.isHiding() && ((CircularProgressIndicatorSpec) this.f105741a).f55275f == 1)) {
            this.f45361f += ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f105741a).f55270a) / 2.0f;
        } else if ((this.f105742b.isShowing() && ((CircularProgressIndicatorSpec) this.f105741a).f55274e == 1) || (this.f105742b.isHiding() && ((CircularProgressIndicatorSpec) this.f105741a).f55275f == 2)) {
            this.f45361f -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f105741a).f55270a) / 2.0f;
        }
    }

    @Override // p000.zq4
    public void fillIndicator(@efb Canvas canvas, @efb Paint paint, @y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2, @g92 int i) {
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f45359d);
        int i2 = this.f45358c;
        float f3 = f * 360.0f * i2;
        float f4 = (f2 >= f ? f2 - f : (1.0f + f2) - f) * 360.0f * i2;
        float f5 = this.f45361f;
        canvas.drawArc(new RectF(-f5, -f5, f5, f5), f3, f4, false, paint);
        if (this.f45360e <= 0.0f || Math.abs(f4) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        drawRoundedEnd(canvas, paint, this.f45359d, this.f45360e, f3);
        drawRoundedEnd(canvas, paint, this.f45359d, this.f45360e, f3 + f4);
    }

    @Override // p000.zq4
    public int getPreferredHeight() {
        return getSize();
    }

    @Override // p000.zq4
    public int getPreferredWidth() {
        return getSize();
    }
}
