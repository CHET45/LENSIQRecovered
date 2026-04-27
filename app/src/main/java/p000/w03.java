package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes8.dex */
public class w03 implements udh {

    /* JADX INFO: renamed from: a */
    public float f93033a;

    /* JADX INFO: renamed from: b */
    public Shader f93034b;

    /* JADX INFO: renamed from: c */
    public final RectF f93035c = new RectF();

    public w03(@y46(from = 0.0d) float f) {
        setCornerRadiusSafely(f);
    }

    private void setCornerRadiusSafely(@y46(from = 0.0d) float f) {
        float fMax = Math.max(0.0f, f);
        if (fMax != this.f93033a) {
            this.f93033a = fMax;
            this.f93034b = null;
        }
    }

    @efb
    public RectF getBounds() {
        return this.f93035c;
    }

    @y46(from = 0.0d)
    public float getCornerRadius() {
        return this.f93033a;
    }

    @Override // p000.udh
    public void onBoundsChange(Rect rect) {
        this.f93035c.set(rect);
        this.f93034b = null;
    }

    @Override // p000.udh
    public void onDraw(Canvas canvas, Paint paint, Bitmap bitmap) {
        if (this.f93033a == 0.0f) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f93035c, paint);
            return;
        }
        if (this.f93034b == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f93034b = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = new Matrix();
            RectF rectF = this.f93035c;
            matrix.setTranslate(rectF.left, rectF.top);
            matrix.preScale(this.f93035c.width() / bitmap.getWidth(), this.f93035c.height() / bitmap.getHeight());
            this.f93034b.setLocalMatrix(matrix);
        }
        paint.setShader(this.f93034b);
        RectF rectF2 = this.f93035c;
        float f = this.f93033a;
        canvas.drawRoundRect(rectF2, f, f, paint);
    }

    public void setCornerRadius(@y46(from = 0.0d) float f) {
        setCornerRadiusSafely(f);
    }
}
