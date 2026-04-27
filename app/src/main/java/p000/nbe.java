package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
@c5e(21)
public class nbe extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f63915a;

    /* JADX INFO: renamed from: c */
    public final RectF f63917c;

    /* JADX INFO: renamed from: d */
    public final Rect f63918d;

    /* JADX INFO: renamed from: e */
    public float f63919e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f63922h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f63923i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f63924j;

    /* JADX INFO: renamed from: f */
    public boolean f63920f = false;

    /* JADX INFO: renamed from: g */
    public boolean f63921g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f63925k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public final Paint f63916b = new Paint(5);

    public nbe(ColorStateList colorStateList, float f) {
        this.f63915a = f;
        setBackground(colorStateList);
        this.f63917c = new RectF();
        this.f63918d = new Rect();
    }

    private PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void setBackground(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f63922h = colorStateList;
        this.f63916b.setColor(colorStateList.getColorForState(getState(), this.f63922h.getDefaultColor()));
    }

    private void updateBounds(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f63917c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f63918d.set(rect);
        if (this.f63920f) {
            this.f63918d.inset((int) Math.ceil(obe.m18553a(this.f63919e, this.f63915a, this.f63921g)), (int) Math.ceil(obe.m18554b(this.f63919e, this.f63915a, this.f63921g)));
            this.f63917c.set(this.f63918d);
        }
    }

    /* JADX INFO: renamed from: a */
    public float m17835a() {
        return this.f63919e;
    }

    /* JADX INFO: renamed from: b */
    public void m17836b(float f, boolean z, boolean z2) {
        if (f == this.f63919e && this.f63920f == z && this.f63921g == z2) {
            return;
        }
        this.f63919e = f;
        this.f63920f = z;
        this.f63921g = z2;
        updateBounds(null);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public void m17837c(float f) {
        if (f == this.f63915a) {
            return;
        }
        this.f63915a = f;
        updateBounds(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f63916b;
        if (this.f63923i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f63923i);
            z = true;
        }
        RectF rectF = this.f63917c;
        float f = this.f63915a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    public ColorStateList getColor() {
        return this.f63922h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f63918d, this.f63915a);
    }

    public float getRadius() {
        return this.f63915a;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f63924j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f63922h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        updateBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f63922h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f63916b.getColor();
        if (z) {
            this.f63916b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f63924j;
        if (colorStateList2 == null || (mode = this.f63925k) == null) {
            return z;
        }
        this.f63923i = createTintFilter(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f63916b.setAlpha(i);
    }

    public void setColor(@hib ColorStateList colorStateList) {
        setBackground(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f63916b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f63924j = colorStateList;
        this.f63923i = createTintFilter(colorStateList, this.f63925k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f63925k = mode;
        this.f63923i = createTintFilter(this.f63924j, mode);
        invalidateSelf();
    }
}
