package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class jb1 extends Drawable {

    /* JADX INFO: renamed from: q */
    public static final float f50193q = 1.3333f;

    /* JADX INFO: renamed from: b */
    @efb
    public final Paint f50195b;

    /* JADX INFO: renamed from: h */
    @yc4
    public float f50201h;

    /* JADX INFO: renamed from: i */
    @g92
    public int f50202i;

    /* JADX INFO: renamed from: j */
    @g92
    public int f50203j;

    /* JADX INFO: renamed from: k */
    @g92
    public int f50204k;

    /* JADX INFO: renamed from: l */
    @g92
    public int f50205l;

    /* JADX INFO: renamed from: m */
    @g92
    public int f50206m;

    /* JADX INFO: renamed from: o */
    public n8f f50208o;

    /* JADX INFO: renamed from: p */
    @hib
    public ColorStateList f50209p;

    /* JADX INFO: renamed from: a */
    public final o8f f50194a = o8f.getInstance();

    /* JADX INFO: renamed from: c */
    public final Path f50196c = new Path();

    /* JADX INFO: renamed from: d */
    public final Rect f50197d = new Rect();

    /* JADX INFO: renamed from: e */
    public final RectF f50198e = new RectF();

    /* JADX INFO: renamed from: f */
    public final RectF f50199f = new RectF();

    /* JADX INFO: renamed from: g */
    public final C7839b f50200g = new C7839b();

    /* JADX INFO: renamed from: n */
    public boolean f50207n = true;

    /* JADX INFO: renamed from: jb1$b */
    public class C7839b extends Drawable.ConstantState {
        private C7839b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @efb
        public Drawable newDrawable() {
            return jb1.this;
        }
    }

    public jb1(n8f n8fVar) {
        this.f50208o = n8fVar;
        Paint paint = new Paint(1);
        this.f50195b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @efb
    private Shader createGradientShader() {
        copyBounds(this.f50197d);
        float fHeight = this.f50201h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{ua2.compositeColors(this.f50202i, this.f50206m), ua2.compositeColors(this.f50203j, this.f50206m), ua2.compositeColors(ua2.setAlphaComponent(this.f50203j, 0), this.f50206m), ua2.compositeColors(ua2.setAlphaComponent(this.f50205l, 0), this.f50206m), ua2.compositeColors(this.f50205l, this.f50206m), ua2.compositeColors(this.f50204k, this.f50206m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    @efb
    /* JADX INFO: renamed from: a */
    public RectF m13927a() {
        this.f50199f.set(getBounds());
        return this.f50199f;
    }

    /* JADX INFO: renamed from: b */
    public void m13928b(@hib ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f50206m = colorStateList.getColorForState(getState(), this.f50206m);
        }
        this.f50209p = colorStateList;
        this.f50207n = true;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: c */
    public void m13929c(@g92 int i, @g92 int i2, @g92 int i3, @g92 int i4) {
        this.f50202i = i;
        this.f50203j = i2;
        this.f50204k = i3;
        this.f50205l = i4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        if (this.f50207n) {
            this.f50195b.setShader(createGradientShader());
            this.f50207n = false;
        }
        float strokeWidth = this.f50195b.getStrokeWidth() / 2.0f;
        copyBounds(this.f50197d);
        this.f50198e.set(this.f50197d);
        float fMin = Math.min(this.f50208o.getTopLeftCornerSize().getCornerSize(m13927a()), this.f50198e.width() / 2.0f);
        if (this.f50208o.isRoundRect(m13927a())) {
            this.f50198e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f50198e, fMin, fMin, this.f50195b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @hib
    public Drawable.ConstantState getConstantState() {
        return this.f50200g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f50201h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @omg(21)
    public void getOutline(@efb Outline outline) {
        if (this.f50208o.isRoundRect(m13927a())) {
            outline.setRoundRect(getBounds(), this.f50208o.getTopLeftCornerSize().getCornerSize(m13927a()));
        } else {
            copyBounds(this.f50197d);
            this.f50198e.set(this.f50197d);
            this.f50194a.calculatePath(this.f50208o, 1.0f, this.f50198e, this.f50196c);
            rq4.setOutlineToPath(outline, this.f50196c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@efb Rect rect) {
        if (!this.f50208o.isRoundRect(m13927a())) {
            return true;
        }
        int iRound = Math.round(this.f50201h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    public n8f getShapeAppearanceModel() {
        return this.f50208o;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f50209p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f50207n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f50209p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f50206m)) != this.f50206m) {
            this.f50207n = true;
            this.f50206m = colorForState;
        }
        if (this.f50207n) {
            invalidateSelf();
        }
        return this.f50207n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@h78(from = 0, m12174to = coe.f17274d) int i) {
        this.f50195b.setAlpha(i);
        invalidateSelf();
    }

    public void setBorderWidth(@yc4 float f) {
        if (this.f50201h != f) {
            this.f50201h = f;
            this.f50195b.setStrokeWidth(f * 1.3333f);
            this.f50207n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@hib ColorFilter colorFilter) {
        this.f50195b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setShapeAppearanceModel(n8f n8fVar) {
        this.f50208o = n8fVar;
        invalidateSelf();
    }
}
