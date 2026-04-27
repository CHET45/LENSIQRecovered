package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public abstract class sbe extends Drawable {

    /* JADX INFO: renamed from: n */
    public static final int f81152n = 3;

    /* JADX INFO: renamed from: a */
    public final Bitmap f81153a;

    /* JADX INFO: renamed from: b */
    public int f81154b;

    /* JADX INFO: renamed from: e */
    public final BitmapShader f81157e;

    /* JADX INFO: renamed from: g */
    public float f81159g;

    /* JADX INFO: renamed from: k */
    public boolean f81163k;

    /* JADX INFO: renamed from: l */
    public int f81164l;

    /* JADX INFO: renamed from: m */
    public int f81165m;

    /* JADX INFO: renamed from: c */
    public int f81155c = 119;

    /* JADX INFO: renamed from: d */
    public final Paint f81156d = new Paint(3);

    /* JADX INFO: renamed from: f */
    public final Matrix f81158f = new Matrix();

    /* JADX INFO: renamed from: h */
    public final Rect f81160h = new Rect();

    /* JADX INFO: renamed from: i */
    public final RectF f81161i = new RectF();

    /* JADX INFO: renamed from: j */
    public boolean f81162j = true;

    public sbe(Resources resources, Bitmap bitmap) {
        this.f81154b = 160;
        if (resources != null) {
            this.f81154b = resources.getDisplayMetrics().densityDpi;
        }
        this.f81153a = bitmap;
        if (bitmap != null) {
            computeBitmapSize();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f81157e = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f81165m = -1;
            this.f81164l = -1;
            this.f81157e = null;
        }
    }

    private void computeBitmapSize() {
        this.f81164l = this.f81153a.getScaledWidth(this.f81154b);
        this.f81165m = this.f81153a.getScaledHeight(this.f81154b);
    }

    private static boolean isGreaterThanZero(float f) {
        return f > 0.05f;
    }

    private void updateCircularCornerRadius() {
        this.f81159g = Math.min(this.f81165m, this.f81164l) / 2;
    }

    /* JADX INFO: renamed from: a */
    public void mo21113a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public void m21808b() {
        if (this.f81162j) {
            if (this.f81163k) {
                int iMin = Math.min(this.f81164l, this.f81165m);
                mo21113a(this.f81155c, iMin, iMin, getBounds(), this.f81160h);
                int iMin2 = Math.min(this.f81160h.width(), this.f81160h.height());
                this.f81160h.inset(Math.max(0, (this.f81160h.width() - iMin2) / 2), Math.max(0, (this.f81160h.height() - iMin2) / 2));
                this.f81159g = iMin2 * 0.5f;
            } else {
                mo21113a(this.f81155c, this.f81164l, this.f81165m, getBounds(), this.f81160h);
            }
            this.f81161i.set(this.f81160h);
            if (this.f81157e != null) {
                Matrix matrix = this.f81158f;
                RectF rectF = this.f81161i;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f81158f.preScale(this.f81161i.width() / this.f81153a.getWidth(), this.f81161i.height() / this.f81153a.getHeight());
                this.f81157e.setLocalMatrix(this.f81158f);
                this.f81156d.setShader(this.f81157e);
            }
            this.f81162j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        Bitmap bitmap = this.f81153a;
        if (bitmap == null) {
            return;
        }
        m21808b();
        if (this.f81156d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f81160h, this.f81156d);
            return;
        }
        RectF rectF = this.f81161i;
        float f = this.f81159g;
        canvas.drawRoundRect(rectF, f, f, this.f81156d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f81156d.getAlpha();
    }

    @hib
    public final Bitmap getBitmap() {
        return this.f81153a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f81156d.getColorFilter();
    }

    public float getCornerRadius() {
        return this.f81159g;
    }

    public int getGravity() {
        return this.f81155c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f81165m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f81164l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f81155c != 119 || this.f81163k || (bitmap = this.f81153a) == null || bitmap.hasAlpha() || this.f81156d.getAlpha() < 255 || isGreaterThanZero(this.f81159g)) ? -3 : -1;
    }

    @efb
    public final Paint getPaint() {
        return this.f81156d;
    }

    public boolean hasAntiAlias() {
        return this.f81156d.isAntiAlias();
    }

    public boolean hasMipMap() {
        throw new UnsupportedOperationException();
    }

    public boolean isCircular() {
        return this.f81163k;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@efb Rect rect) {
        super.onBoundsChange(rect);
        if (this.f81163k) {
            updateCircularCornerRadius();
        }
        this.f81162j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f81156d.getAlpha()) {
            this.f81156d.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setAntiAlias(boolean z) {
        this.f81156d.setAntiAlias(z);
        invalidateSelf();
    }

    public void setCircular(boolean z) {
        this.f81163k = z;
        this.f81162j = true;
        if (!z) {
            setCornerRadius(0.0f);
            return;
        }
        updateCircularCornerRadius();
        this.f81156d.setShader(this.f81157e);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f81156d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setCornerRadius(float f) {
        if (this.f81159g == f) {
            return;
        }
        this.f81163k = false;
        if (isGreaterThanZero(f)) {
            this.f81156d.setShader(this.f81157e);
        } else {
            this.f81156d.setShader(null);
        }
        this.f81159g = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f81156d.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f81156d.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setGravity(int i) {
        if (this.f81155c != i) {
            this.f81155c = i;
            this.f81162j = true;
            invalidateSelf();
        }
    }

    public void setMipMap(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void setTargetDensity(@efb Canvas canvas) {
        setTargetDensity(canvas.getDensity());
    }

    public void setTargetDensity(@efb DisplayMetrics displayMetrics) {
        setTargetDensity(displayMetrics.densityDpi);
    }

    public void setTargetDensity(int i) {
        if (this.f81154b != i) {
            if (i == 0) {
                i = 160;
            }
            this.f81154b = i;
            if (this.f81153a != null) {
                computeBitmapSize();
            }
            invalidateSelf();
        }
    }
}
