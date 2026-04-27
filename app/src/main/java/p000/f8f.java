package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import com.google.android.material.C3146R;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class f8f extends DrawableWrapper {

    /* JADX INFO: renamed from: q */
    public static final double f35691q = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: r */
    public static final float f35692r = 1.5f;

    /* JADX INFO: renamed from: s */
    public static final float f35693s = 0.25f;

    /* JADX INFO: renamed from: t */
    public static final float f35694t = 0.5f;

    /* JADX INFO: renamed from: u */
    public static final float f35695u = 1.0f;

    /* JADX INFO: renamed from: a */
    @efb
    public final Paint f35696a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Paint f35697b;

    /* JADX INFO: renamed from: c */
    @efb
    public final RectF f35698c;

    /* JADX INFO: renamed from: d */
    public float f35699d;

    /* JADX INFO: renamed from: e */
    public Path f35700e;

    /* JADX INFO: renamed from: f */
    public float f35701f;

    /* JADX INFO: renamed from: g */
    public float f35702g;

    /* JADX INFO: renamed from: h */
    public float f35703h;

    /* JADX INFO: renamed from: i */
    public float f35704i;

    /* JADX INFO: renamed from: j */
    public boolean f35705j;

    /* JADX INFO: renamed from: k */
    public final int f35706k;

    /* JADX INFO: renamed from: l */
    public final int f35707l;

    /* JADX INFO: renamed from: m */
    public final int f35708m;

    /* JADX INFO: renamed from: n */
    public boolean f35709n;

    /* JADX INFO: renamed from: o */
    public float f35710o;

    /* JADX INFO: renamed from: p */
    public boolean f35711p;

    public f8f(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f35705j = true;
        this.f35709n = true;
        this.f35711p = false;
        this.f35706k = lx2.getColor(context, C3146R.color.design_fab_shadow_start_color);
        this.f35707l = lx2.getColor(context, C3146R.color.design_fab_shadow_mid_color);
        this.f35708m = lx2.getColor(context, C3146R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f35696a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f35699d = Math.round(f);
        this.f35698c = new RectF();
        Paint paint2 = new Paint(paint);
        this.f35697b = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    private void buildComponents(@efb Rect rect) {
        float f = this.f35702g;
        float f2 = 1.5f * f;
        this.f35698c.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        Drawable wrappedDrawable = getWrappedDrawable();
        RectF rectF = this.f35698c;
        wrappedDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        buildShadowCorners();
    }

    private void buildShadowCorners() {
        float f = this.f35699d;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f35703h;
        rectF2.inset(-f2, -f2);
        Path path = this.f35700e;
        if (path == null) {
            this.f35700e = new Path();
        } else {
            path.reset();
        }
        this.f35700e.setFillType(Path.FillType.EVEN_ODD);
        this.f35700e.moveTo(-this.f35699d, 0.0f);
        this.f35700e.rLineTo(-this.f35703h, 0.0f);
        this.f35700e.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f35700e.arcTo(rectF, 270.0f, -90.0f, false);
        this.f35700e.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.f35699d / f3;
            this.f35696a.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f35706k, this.f35707l, this.f35708m}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f35697b.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f35706k, this.f35707l, this.f35708m}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f35697b.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f35691q) * ((double) f2))) : f;
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f35691q) * ((double) f2))) : f * 1.5f;
    }

    private void drawShadow(@efb Canvas canvas) {
        int i;
        float f;
        int i2;
        float f2;
        float f3;
        float f4;
        int iSave = canvas.save();
        canvas.rotate(this.f35710o, this.f35698c.centerX(), this.f35698c.centerY());
        float f5 = this.f35699d;
        float f6 = (-f5) - this.f35703h;
        float f7 = f5 * 2.0f;
        boolean z = this.f35698c.width() - f7 > 0.0f;
        boolean z2 = this.f35698c.height() - f7 > 0.0f;
        float f8 = this.f35704i;
        float f9 = f5 / ((f8 - (0.5f * f8)) + f5);
        float f10 = f5 / ((f8 - (0.25f * f8)) + f5);
        float f11 = f5 / ((f8 - (f8 * 1.0f)) + f5);
        int iSave2 = canvas.save();
        RectF rectF = this.f35698c;
        canvas.translate(rectF.left + f5, rectF.top + f5);
        canvas.scale(f9, f10);
        canvas.drawPath(this.f35700e, this.f35696a);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            i = iSave2;
            f = f11;
            i2 = iSave;
            f2 = f10;
            canvas.drawRect(0.0f, f6, this.f35698c.width() - f7, -this.f35699d, this.f35697b);
        } else {
            i = iSave2;
            f = f11;
            i2 = iSave;
            f2 = f10;
        }
        canvas.restoreToCount(i);
        int iSave3 = canvas.save();
        RectF rectF2 = this.f35698c;
        canvas.translate(rectF2.right - f5, rectF2.bottom - f5);
        float f12 = f;
        canvas.scale(f9, f12);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f35700e, this.f35696a);
        if (z) {
            canvas.scale(1.0f / f9, 1.0f);
            f3 = f2;
            f4 = f12;
            canvas.drawRect(0.0f, f6, this.f35698c.width() - f7, (-this.f35699d) + this.f35703h, this.f35697b);
        } else {
            f3 = f2;
            f4 = f12;
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF3 = this.f35698c;
        canvas.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas.scale(f9, f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f35700e, this.f35696a);
        if (z2) {
            canvas.scale(1.0f / f4, 1.0f);
            canvas.drawRect(0.0f, f6, this.f35698c.height() - f7, -this.f35699d, this.f35697b);
        }
        canvas.restoreToCount(iSave4);
        int iSave5 = canvas.save();
        RectF rectF4 = this.f35698c;
        canvas.translate(rectF4.right - f5, rectF4.top + f5);
        float f13 = f3;
        canvas.scale(f9, f13);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f35700e, this.f35696a);
        if (z2) {
            canvas.scale(1.0f / f13, 1.0f);
            canvas.drawRect(0.0f, f6, this.f35698c.height() - f7, -this.f35699d, this.f35697b);
        }
        canvas.restoreToCount(iSave5);
        canvas.restoreToCount(i2);
    }

    private static int toEven(float f) {
        int iRound = Math.round(f);
        return iRound % 2 == 1 ? iRound - 1 : iRound;
    }

    /* JADX INFO: renamed from: a */
    public void m10720a(Rect rect) {
        this.f35705j = true;
    }

    public void draw(@efb Canvas canvas) {
        if (this.f35705j) {
            buildComponents(getBounds());
            this.f35705j = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius() {
        return this.f35699d;
    }

    public float getMaxShadowSize() {
        return this.f35702g;
    }

    public float getMinHeight() {
        float f = this.f35702g;
        return (Math.max(f, this.f35699d + ((f * 1.5f) / 2.0f)) * 2.0f) + (this.f35702g * 1.5f * 2.0f);
    }

    public float getMinWidth() {
        float f = this.f35702g;
        return (Math.max(f, this.f35699d + (f / 2.0f)) * 2.0f) + (this.f35702g * 2.0f);
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(@efb Rect rect) {
        int iCeil = (int) Math.ceil(calculateVerticalPadding(this.f35702g, this.f35699d, this.f35709n));
        int iCeil2 = (int) Math.ceil(calculateHorizontalPadding(this.f35702g, this.f35699d, this.f35709n));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public float getShadowSize() {
        return this.f35704i;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.f35709n = z;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        super.setAlpha(i);
        this.f35696a.setAlpha(i);
        this.f35697b.setAlpha(i);
    }

    public void setCornerRadius(float f) {
        float fRound = Math.round(f);
        if (this.f35699d == fRound) {
            return;
        }
        this.f35699d = fRound;
        this.f35705j = true;
        invalidateSelf();
    }

    public void setMaxShadowSize(float f) {
        setShadowSize(this.f35704i, f);
    }

    public final void setRotation(float f) {
        if (this.f35710o != f) {
            this.f35710o = f;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float even = toEven(f);
        float even2 = toEven(f2);
        if (even > even2) {
            if (!this.f35711p) {
                this.f35711p = true;
            }
            even = even2;
        }
        if (this.f35704i == even && this.f35702g == even2) {
            return;
        }
        this.f35704i = even;
        this.f35702g = even2;
        this.f35703h = Math.round(even * 1.5f);
        this.f35701f = even2;
        this.f35705j = true;
        invalidateSelf();
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.f35702g);
    }
}
