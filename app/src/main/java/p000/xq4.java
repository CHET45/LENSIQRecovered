package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.C0392R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
public class xq4 extends Drawable {

    /* JADX INFO: renamed from: m */
    public static final int f98897m = 0;

    /* JADX INFO: renamed from: n */
    public static final int f98898n = 1;

    /* JADX INFO: renamed from: o */
    public static final int f98899o = 2;

    /* JADX INFO: renamed from: p */
    public static final int f98900p = 3;

    /* JADX INFO: renamed from: q */
    public static final float f98901q = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a */
    public final Paint f98902a;

    /* JADX INFO: renamed from: b */
    public float f98903b;

    /* JADX INFO: renamed from: c */
    public float f98904c;

    /* JADX INFO: renamed from: d */
    public float f98905d;

    /* JADX INFO: renamed from: e */
    public float f98906e;

    /* JADX INFO: renamed from: f */
    public boolean f98907f;

    /* JADX INFO: renamed from: g */
    public final Path f98908g;

    /* JADX INFO: renamed from: h */
    public final int f98909h;

    /* JADX INFO: renamed from: i */
    public boolean f98910i;

    /* JADX INFO: renamed from: j */
    public float f98911j;

    /* JADX INFO: renamed from: k */
    public float f98912k;

    /* JADX INFO: renamed from: l */
    public int f98913l;

    /* JADX INFO: renamed from: xq4$a */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC15249a {
    }

    public xq4(Context context) {
        Paint paint = new Paint();
        this.f98902a = paint;
        this.f98908g = new Path();
        this.f98910i = false;
        this.f98913l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0392R.styleable.DrawerArrowToggle, C0392R.attr.drawerArrowStyle, C0392R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(typedArrayObtainStyledAttributes.getColor(C0392R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(typedArrayObtainStyledAttributes.getDimension(C0392R.styleable.DrawerArrowToggle_thickness, 0.0f));
        setSpinEnabled(typedArrayObtainStyledAttributes.getBoolean(C0392R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize(Math.round(typedArrayObtainStyledAttributes.getDimension(C0392R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f98909h = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0392R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.f98904c = Math.round(typedArrayObtainStyledAttributes.getDimension(C0392R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.f98903b = Math.round(typedArrayObtainStyledAttributes.getDimension(C0392R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f98905d = typedArrayObtainStyledAttributes.getDimension(C0392R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float lerp(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f98913l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? yp4.getLayoutDirection(this) == 0 : yp4.getLayoutDirection(this) == 1))) {
            z = true;
        }
        float f = this.f98903b;
        float fLerp = lerp(this.f98904c, (float) Math.sqrt(f * f * 2.0f), this.f98911j);
        float fLerp2 = lerp(this.f98904c, this.f98905d, this.f98911j);
        float fRound = Math.round(lerp(0.0f, this.f98912k, this.f98911j));
        float fLerp3 = lerp(0.0f, f98901q, this.f98911j);
        float fLerp4 = lerp(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f98911j);
        double d = fLerp;
        double d2 = fLerp3;
        boolean z2 = z;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(d * Math.sin(d2));
        this.f98908g.rewind();
        float fLerp5 = lerp(this.f98906e + this.f98902a.getStrokeWidth(), -this.f98912k, this.f98911j);
        float f2 = (-fLerp2) / 2.0f;
        this.f98908g.moveTo(f2 + fRound, 0.0f);
        this.f98908g.rLineTo(fLerp2 - (fRound * 2.0f), 0.0f);
        this.f98908g.moveTo(f2, fLerp5);
        this.f98908g.rLineTo(fRound2, fRound3);
        this.f98908g.moveTo(f2, -fLerp5);
        this.f98908g.rLineTo(fRound2, -fRound3);
        this.f98908g.close();
        canvas.save();
        float strokeWidth = this.f98902a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (2.0f * r5))) / 4) * 2) + (strokeWidth * 1.5f) + this.f98906e);
        if (this.f98907f) {
            canvas.rotate(fLerp4 * (this.f98910i ^ z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f98908g, this.f98902a);
        canvas.restore();
    }

    public float getArrowHeadLength() {
        return this.f98903b;
    }

    public float getArrowShaftLength() {
        return this.f98905d;
    }

    public float getBarLength() {
        return this.f98904c;
    }

    public float getBarThickness() {
        return this.f98902a.getStrokeWidth();
    }

    @g92
    public int getColor() {
        return this.f98902a.getColor();
    }

    public int getDirection() {
        return this.f98913l;
    }

    public float getGapSize() {
        return this.f98906e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f98909h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f98909h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint getPaint() {
        return this.f98902a;
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getProgress() {
        return this.f98911j;
    }

    public boolean isSpinEnabled() {
        return this.f98907f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f98902a.getAlpha()) {
            this.f98902a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f) {
        if (this.f98903b != f) {
            this.f98903b = f;
            invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f) {
        if (this.f98905d != f) {
            this.f98905d = f;
            invalidateSelf();
        }
    }

    public void setBarLength(float f) {
        if (this.f98904c != f) {
            this.f98904c = f;
            invalidateSelf();
        }
    }

    public void setBarThickness(float f) {
        if (this.f98902a.getStrokeWidth() != f) {
            this.f98902a.setStrokeWidth(f);
            this.f98912k = (float) (((double) (f / 2.0f)) * Math.cos(f98901q));
            invalidateSelf();
        }
    }

    public void setColor(@g92 int i) {
        if (i != this.f98902a.getColor()) {
            this.f98902a.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f98902a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(int i) {
        if (i != this.f98913l) {
            this.f98913l = i;
            invalidateSelf();
        }
    }

    public void setGapSize(float f) {
        if (f != this.f98906e) {
            this.f98906e = f;
            invalidateSelf();
        }
    }

    public void setProgress(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        if (this.f98911j != f) {
            this.f98911j = f;
            invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean z) {
        if (this.f98907f != z) {
            this.f98907f = z;
            invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean z) {
        if (this.f98910i != z) {
            this.f98910i = z;
            invalidateSelf();
        }
    }
}
