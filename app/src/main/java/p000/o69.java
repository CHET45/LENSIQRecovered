package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* JADX INFO: loaded from: classes5.dex */
public final class o69 extends zq4<LinearProgressIndicatorSpec> {

    /* JADX INFO: renamed from: c */
    public float f66548c;

    /* JADX INFO: renamed from: d */
    public float f66549d;

    /* JADX INFO: renamed from: e */
    public float f66550e;

    /* JADX INFO: renamed from: f */
    public Path f66551f;

    public o69(@efb LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f66548c = 300.0f;
    }

    @Override // p000.zq4
    /* JADX INFO: renamed from: a */
    public void mo12680a(@efb Canvas canvas, @efb Paint paint) {
        int iCompositeARGBWithAlpha = ow9.compositeARGBWithAlpha(((LinearProgressIndicatorSpec) this.f105741a).f55273d, this.f105742b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(iCompositeARGBWithAlpha);
        Path path = new Path();
        this.f66551f = path;
        float f = this.f66548c;
        float f2 = this.f66549d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f66550e;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CCW);
        canvas.drawPath(this.f66551f, paint);
    }

    @Override // p000.zq4
    public void adjustCanvas(@efb Canvas canvas, @efb Rect rect, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f66548c = rect.width();
        float f2 = ((LinearProgressIndicatorSpec) this.f105741a).f55270a;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) this.f105741a).f55270a) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f105741a).f22116i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f105742b.isShowing() && ((LinearProgressIndicatorSpec) this.f105741a).f55274e == 1) || (this.f105742b.isHiding() && ((LinearProgressIndicatorSpec) this.f105741a).f55275f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f105742b.isShowing() || this.f105742b.isHiding()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f105741a).f55270a * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f66548c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f105741a;
        this.f66549d = ((LinearProgressIndicatorSpec) s).f55270a * f;
        this.f66550e = ((LinearProgressIndicatorSpec) s).f55271b * f;
    }

    @Override // p000.zq4
    public void fillIndicator(@efb Canvas canvas, @efb Paint paint, @y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2, @g92 int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f66548c;
        float f4 = (-f3) / 2.0f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.save();
        canvas.clipPath(this.f66551f);
        float f5 = this.f66549d;
        RectF rectF = new RectF(((f * f3) + f4) - (this.f66550e * 2.0f), (-f5) / 2.0f, f4 + (f2 * f3), f5 / 2.0f);
        float f6 = this.f66550e;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        canvas.restore();
    }

    @Override // p000.zq4
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.f105741a).f55270a;
    }

    @Override // p000.zq4
    public int getPreferredWidth() {
        return -1;
    }
}
