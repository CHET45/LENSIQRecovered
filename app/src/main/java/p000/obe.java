package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.cardview.C0564R;

/* JADX INFO: loaded from: classes.dex */
public class obe extends Drawable {

    /* JADX INFO: renamed from: q */
    public static final double f67076q = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: r */
    public static final float f67077r = 1.5f;

    /* JADX INFO: renamed from: s */
    public static InterfaceC10290a f67078s;

    /* JADX INFO: renamed from: a */
    public final int f67079a;

    /* JADX INFO: renamed from: c */
    public Paint f67081c;

    /* JADX INFO: renamed from: d */
    public Paint f67082d;

    /* JADX INFO: renamed from: e */
    public final RectF f67083e;

    /* JADX INFO: renamed from: f */
    public float f67084f;

    /* JADX INFO: renamed from: g */
    public Path f67085g;

    /* JADX INFO: renamed from: h */
    public float f67086h;

    /* JADX INFO: renamed from: i */
    public float f67087i;

    /* JADX INFO: renamed from: j */
    public float f67088j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f67089k;

    /* JADX INFO: renamed from: m */
    public final int f67091m;

    /* JADX INFO: renamed from: n */
    public final int f67092n;

    /* JADX INFO: renamed from: l */
    public boolean f67090l = true;

    /* JADX INFO: renamed from: o */
    public boolean f67093o = true;

    /* JADX INFO: renamed from: p */
    public boolean f67094p = false;

    /* JADX INFO: renamed from: b */
    public Paint f67080b = new Paint(5);

    /* JADX INFO: renamed from: obe$a */
    public interface InterfaceC10290a {
        void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public obe(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f67091m = resources.getColor(C0564R.color.cardview_shadow_start_color);
        this.f67092n = resources.getColor(C0564R.color.cardview_shadow_end_color);
        this.f67079a = resources.getDimensionPixelSize(C0564R.dimen.cardview_compat_inset_shadow);
        setBackground(colorStateList);
        Paint paint = new Paint(5);
        this.f67081c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f67084f = (int) (f + 0.5f);
        this.f67083e = new RectF();
        Paint paint2 = new Paint(this.f67081c);
        this.f67082d = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public static float m18553a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f67076q) * ((double) f2))) : f;
    }

    /* JADX INFO: renamed from: b */
    public static float m18554b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f67076q) * ((double) f2))) : f * 1.5f;
    }

    private void buildComponents(Rect rect) {
        float f = this.f67086h;
        float f2 = 1.5f * f;
        this.f67083e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        buildShadowCorners();
    }

    private void buildShadowCorners() {
        float f = this.f67084f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f67087i;
        rectF2.inset(-f2, -f2);
        Path path = this.f67085g;
        if (path == null) {
            this.f67085g = new Path();
        } else {
            path.reset();
        }
        this.f67085g.setFillType(Path.FillType.EVEN_ODD);
        this.f67085g.moveTo(-this.f67084f, 0.0f);
        this.f67085g.rLineTo(-this.f67087i, 0.0f);
        this.f67085g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f67085g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f67085g.close();
        float f3 = this.f67084f;
        float f4 = f3 / (this.f67087i + f3);
        Paint paint = this.f67081c;
        float f5 = this.f67084f + this.f67087i;
        int i = this.f67091m;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f67092n}, new float[]{0.0f, f4, 1.0f}, tileMode));
        Paint paint2 = this.f67082d;
        float f6 = this.f67084f;
        float f7 = this.f67087i;
        float f8 = (-f6) + f7;
        float f9 = (-f6) - f7;
        int i2 = this.f67091m;
        paint2.setShader(new LinearGradient(0.0f, f8, 0.0f, f9, new int[]{i2, i2, this.f67092n}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.f67082d.setAntiAlias(false);
    }

    private void drawShadow(Canvas canvas) {
        float f = this.f67084f;
        float f2 = (-f) - this.f67087i;
        float f3 = f + this.f67079a + (this.f67088j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f67083e.width() - f4 > 0.0f;
        boolean z2 = this.f67083e.height() - f4 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f67083e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f67085g, this.f67081c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f67083e.width() - f4, -this.f67084f, this.f67082d);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF2 = this.f67083e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f67085g, this.f67081c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f67083e.width() - f4, (-this.f67084f) + this.f67087i, this.f67082d);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF3 = this.f67083e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f67085g, this.f67081c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f67083e.height() - f4, -this.f67084f, this.f67082d);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF4 = this.f67083e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f67085g, this.f67081c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f67083e.height() - f4, -this.f67084f, this.f67082d);
        }
        canvas.restoreToCount(iSave4);
    }

    private void setBackground(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f67089k = colorStateList;
        this.f67080b.setColor(colorStateList.getColorForState(getState(), this.f67089k.getDefaultColor()));
    }

    private void setShadowSize(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        float even = toEven(f);
        float even2 = toEven(f2);
        if (even > even2) {
            if (!this.f67094p) {
                this.f67094p = true;
            }
            even = even2;
        }
        if (this.f67088j == even && this.f67086h == even2) {
            return;
        }
        this.f67088j = even;
        this.f67086h = even2;
        this.f67087i = (int) ((even * 1.5f) + this.f67079a + 0.5f);
        this.f67090l = true;
        invalidateSelf();
    }

    private int toEven(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    /* JADX INFO: renamed from: c */
    public ColorStateList m18555c() {
        return this.f67089k;
    }

    /* JADX INFO: renamed from: d */
    public float m18556d() {
        return this.f67084f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f67090l) {
            buildComponents(getBounds());
            this.f67090l = false;
        }
        canvas.translate(0.0f, this.f67088j / 2.0f);
        drawShadow(canvas);
        canvas.translate(0.0f, (-this.f67088j) / 2.0f);
        f67078s.drawRoundRect(canvas, this.f67083e, this.f67084f, this.f67080b);
    }

    /* JADX INFO: renamed from: e */
    public void m18557e(Rect rect) {
        getPadding(rect);
    }

    /* JADX INFO: renamed from: f */
    public float m18558f() {
        return this.f67086h;
    }

    /* JADX INFO: renamed from: g */
    public float m18559g() {
        float f = this.f67086h;
        return (Math.max(f, this.f67084f + this.f67079a + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f67086h * 1.5f) + this.f67079a) * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(m18554b(this.f67086h, this.f67084f, this.f67093o));
        int iCeil2 = (int) Math.ceil(m18553a(this.f67086h, this.f67084f, this.f67093o));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public float m18560h() {
        float f = this.f67086h;
        return (Math.max(f, this.f67084f + this.f67079a + (f / 2.0f)) * 2.0f) + ((this.f67086h + this.f67079a) * 2.0f);
    }

    /* JADX INFO: renamed from: i */
    public float m18561i() {
        return this.f67088j;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f67089k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public void m18562j(boolean z) {
        this.f67093o = z;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m18563k(@hib ColorStateList colorStateList) {
        setBackground(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l */
    public void m18564l(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f67084f == f2) {
            return;
        }
        this.f67084f = f2;
        this.f67090l = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: m */
    public void m18565m(float f) {
        setShadowSize(this.f67088j, f);
    }

    /* JADX INFO: renamed from: n */
    public void m18566n(float f) {
        setShadowSize(f, this.f67086h);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f67090l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f67089k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f67080b.getColor() == colorForState) {
            return false;
        }
        this.f67080b.setColor(colorForState);
        this.f67090l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f67080b.setAlpha(i);
        this.f67081c.setAlpha(i);
        this.f67082d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f67080b.setColorFilter(colorFilter);
    }
}
