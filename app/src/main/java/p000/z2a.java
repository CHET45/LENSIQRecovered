package p000;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class z2a extends Drawable implements Animatable {

    /* JADX INFO: renamed from: M1 */
    public static final float f103788M1 = 2.5f;

    /* JADX INFO: renamed from: N */
    public static final float f103789N = 1080.0f;

    /* JADX INFO: renamed from: Q */
    public static final byte f103790Q = 0;

    /* JADX INFO: renamed from: V1 */
    public static final byte f103791V1 = 56;

    /* JADX INFO: renamed from: X */
    public static final byte f103792X = 1;

    /* JADX INFO: renamed from: Y */
    public static final byte f103793Y = 40;

    /* JADX INFO: renamed from: Z */
    public static final float f103794Z = 8.75f;

    /* JADX INFO: renamed from: Z1 */
    public static final float f103795Z1 = 12.5f;

    /* JADX INFO: renamed from: a2 */
    public static final float f103796a2 = 3.0f;

    /* JADX INFO: renamed from: c2 */
    public static final float f103798c2 = 0.75f;

    /* JADX INFO: renamed from: d2 */
    public static final float f103799d2 = 0.5f;

    /* JADX INFO: renamed from: e2 */
    public static final float f103800e2 = 0.5f;

    /* JADX INFO: renamed from: f2 */
    public static final int f103801f2 = 1332;

    /* JADX INFO: renamed from: g2 */
    public static final byte f103802g2 = 5;

    /* JADX INFO: renamed from: h2 */
    public static final byte f103803h2 = 10;

    /* JADX INFO: renamed from: i2 */
    public static final byte f103804i2 = 5;

    /* JADX INFO: renamed from: j2 */
    public static final float f103805j2 = 5.0f;

    /* JADX INFO: renamed from: k2 */
    public static final byte f103806k2 = 12;

    /* JADX INFO: renamed from: l2 */
    public static final byte f103807l2 = 6;

    /* JADX INFO: renamed from: m2 */
    public static final float f103808m2 = 0.8f;

    /* JADX INFO: renamed from: C */
    public float f103809C;

    /* JADX INFO: renamed from: F */
    public boolean f103810F;

    /* JADX INFO: renamed from: H */
    public boolean f103811H;

    /* JADX INFO: renamed from: a */
    public final List<Animation> f103812a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final C15952d f103813b = new C15952d();

    /* JADX INFO: renamed from: c */
    public float f103814c;

    /* JADX INFO: renamed from: d */
    public View f103815d;

    /* JADX INFO: renamed from: e */
    public Animation f103816e;

    /* JADX INFO: renamed from: f */
    public float f103817f;

    /* JADX INFO: renamed from: m */
    public float f103818m;

    /* JADX INFO: renamed from: L */
    public static final Interpolator f103786L = new LinearInterpolator();

    /* JADX INFO: renamed from: M */
    public static final Interpolator f103787M = new np5();

    /* JADX INFO: renamed from: b2 */
    public static final int[] f103797b2 = {-16777216};

    /* JADX INFO: renamed from: z2a$a */
    public class C15949a extends Animation {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C15952d f103819a;

        public C15949a(C15952d c15952d) {
            this.f103819a = c15952d;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f, Transformation transformation) {
            z2a z2aVar = z2a.this;
            if (z2aVar.f103810F) {
                z2aVar.m26504a(f, this.f103819a);
                return;
            }
            float fM26505b = z2aVar.m26505b(this.f103819a);
            C15952d c15952d = this.f103819a;
            float f2 = c15952d.f103834l;
            float f3 = c15952d.f103833k;
            float f4 = c15952d.f103835m;
            z2a.this.m26507d(f, c15952d);
            if (f <= 0.5f) {
                this.f103819a.f103826d = f3 + ((0.8f - fM26505b) * z2a.f103787M.getInterpolation(f / 0.5f));
            }
            if (f > 0.5f) {
                this.f103819a.f103827e = f2 + ((0.8f - fM26505b) * z2a.f103787M.getInterpolation((f - 0.5f) / 0.5f));
            }
            z2a.this.setProgressRotation(f4 + (0.25f * f));
            z2a z2aVar2 = z2a.this;
            z2aVar2.m26506c((f * 216.0f) + ((z2aVar2.f103817f / 5.0f) * 1080.0f));
        }
    }

    /* JADX INFO: renamed from: z2a$b */
    public class AnimationAnimationListenerC15950b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C15952d f103821a;

        public AnimationAnimationListenerC15950b(C15952d c15952d) {
            this.f103821a = c15952d;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            this.f103821a.storeOriginals();
            this.f103821a.goToNextColor();
            C15952d c15952d = this.f103821a;
            c15952d.f103826d = c15952d.f103827e;
            z2a z2aVar = z2a.this;
            if (!z2aVar.f103810F) {
                z2aVar.f103817f = (z2aVar.f103817f + 1.0f) % 5.0f;
                return;
            }
            z2aVar.f103810F = false;
            animation.setDuration(1332L);
            z2a.this.showArrow(false);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            z2a.this.f103817f = 0.0f;
        }
    }

    /* JADX INFO: renamed from: z2a$c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC15951c {
    }

    /* JADX INFO: renamed from: z2a$d */
    public class C15952d {

        /* JADX INFO: renamed from: a */
        public final RectF f103823a = new RectF();

        /* JADX INFO: renamed from: b */
        public final Paint f103824b;

        /* JADX INFO: renamed from: c */
        public final Paint f103825c;

        /* JADX INFO: renamed from: d */
        public float f103826d;

        /* JADX INFO: renamed from: e */
        public float f103827e;

        /* JADX INFO: renamed from: f */
        public float f103828f;

        /* JADX INFO: renamed from: g */
        public float f103829g;

        /* JADX INFO: renamed from: h */
        public float f103830h;

        /* JADX INFO: renamed from: i */
        public int[] f103831i;

        /* JADX INFO: renamed from: j */
        public int f103832j;

        /* JADX INFO: renamed from: k */
        public float f103833k;

        /* JADX INFO: renamed from: l */
        public float f103834l;

        /* JADX INFO: renamed from: m */
        public float f103835m;

        /* JADX INFO: renamed from: n */
        public boolean f103836n;

        /* JADX INFO: renamed from: o */
        public Path f103837o;

        /* JADX INFO: renamed from: p */
        public float f103838p;

        /* JADX INFO: renamed from: q */
        public double f103839q;

        /* JADX INFO: renamed from: r */
        public int f103840r;

        /* JADX INFO: renamed from: s */
        public int f103841s;

        /* JADX INFO: renamed from: t */
        public int f103842t;

        public C15952d() {
            Paint paint = new Paint();
            this.f103824b = paint;
            Paint paint2 = new Paint();
            this.f103825c = paint2;
            this.f103826d = 0.0f;
            this.f103827e = 0.0f;
            this.f103828f = 0.0f;
            this.f103829g = 5.0f;
            this.f103830h = 2.5f;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        private void drawTriangle(Canvas canvas, float f, float f2, Rect rect) {
            if (this.f103836n) {
                Path path = this.f103837o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f103837o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float f3 = (((int) this.f103830h) / 2) * this.f103838p;
                float fCos = (float) ((this.f103839q * Math.cos(0.0d)) + ((double) rect.exactCenterX()));
                float fSin = (float) ((this.f103839q * Math.sin(0.0d)) + ((double) rect.exactCenterY()));
                this.f103837o.moveTo(0.0f, 0.0f);
                this.f103837o.lineTo(this.f103840r * this.f103838p, 0.0f);
                Path path3 = this.f103837o;
                float f4 = this.f103840r;
                float f5 = this.f103838p;
                path3.lineTo((f4 * f5) / 2.0f, this.f103841s * f5);
                this.f103837o.offset(fCos - f3, fSin);
                this.f103837o.close();
                this.f103825c.setColor(this.f103842t);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f103837o, this.f103825c);
            }
        }

        private int getNextColorIndex() {
            return (this.f103832j + 1) % this.f103831i.length;
        }

        public void draw(Canvas canvas, Rect rect) {
            RectF rectF = this.f103823a;
            rectF.set(rect);
            float f = this.f103830h;
            rectF.inset(f, f);
            float f2 = this.f103826d;
            float f3 = this.f103828f;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.f103827e + f3) * 360.0f) - f4;
            if (f5 != 0.0f) {
                this.f103824b.setColor(this.f103842t);
                canvas.drawArc(rectF, f4, f5, false, this.f103824b);
            }
            drawTriangle(canvas, f4, f5, rect);
        }

        public int getNextColor() {
            return this.f103831i[getNextColorIndex()];
        }

        public int getStartingColor() {
            return this.f103831i[this.f103832j];
        }

        public void goToNextColor() {
            setColorIndex(getNextColorIndex());
        }

        public void resetOriginals() {
            this.f103833k = 0.0f;
            this.f103834l = 0.0f;
            this.f103835m = 0.0f;
            this.f103826d = 0.0f;
            this.f103827e = 0.0f;
            this.f103828f = 0.0f;
        }

        public void setColorIndex(int i) {
            this.f103832j = i;
            this.f103842t = this.f103831i[i];
        }

        public void setInsets(int i, int i2) {
            float fMin = Math.min(i, i2);
            double d = this.f103839q;
            this.f103830h = (float) ((d <= 0.0d || fMin < 0.0f) ? Math.ceil(this.f103829g / 2.0f) : ((double) (fMin / 2.0f)) - d);
        }

        public void storeOriginals() {
            this.f103833k = this.f103826d;
            this.f103834l = this.f103827e;
            this.f103835m = this.f103828f;
        }
    }

    public z2a(View view) {
        this.f103815d = view;
        setColorSchemeColors(f103797b2);
        updateSizes(1);
        setupAnimators();
    }

    private int evaluateColorChange(float f, int i, int i2) {
        return ((((i >> 24) & 255) + ((int) ((((i2 >> 24) & 255) - r0) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r1) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r2) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r8))));
    }

    private void setSizeParameters(int i, int i2, float f, float f2, float f3, float f4) {
        float f5 = Resources.getSystem().getDisplayMetrics().density;
        this.f103818m = i * f5;
        this.f103809C = i2 * f5;
        this.f103813b.setColorIndex(0);
        float f6 = f2 * f5;
        this.f103813b.f103824b.setStrokeWidth(f6);
        C15952d c15952d = this.f103813b;
        c15952d.f103829g = f6;
        c15952d.f103839q = f * f5;
        c15952d.f103840r = (int) (f3 * f5);
        c15952d.f103841s = (int) (f4 * f5);
        c15952d.setInsets((int) this.f103818m, (int) this.f103809C);
        invalidateSelf();
    }

    private void setupAnimators() {
        C15952d c15952d = this.f103813b;
        C15949a c15949a = new C15949a(c15952d);
        c15949a.setRepeatCount(-1);
        c15949a.setRepeatMode(1);
        c15949a.setInterpolator(f103786L);
        c15949a.setAnimationListener(new AnimationAnimationListenerC15950b(c15952d));
        this.f103816e = c15949a;
    }

    /* JADX INFO: renamed from: a */
    public void m26504a(float f, C15952d c15952d) {
        m26507d(f, c15952d);
        float fFloor = (float) (Math.floor(c15952d.f103835m / 0.8f) + 1.0d);
        float fM26505b = m26505b(c15952d);
        float f2 = c15952d.f103833k;
        float f3 = c15952d.f103834l;
        setStartEndTrim(f2 + (((f3 - fM26505b) - f2) * f), f3);
        float f4 = c15952d.f103835m;
        setProgressRotation(f4 + ((fFloor - f4) * f));
    }

    /* JADX INFO: renamed from: b */
    public float m26505b(C15952d c15952d) {
        return (float) Math.toRadians(((double) c15952d.f103829g) / (c15952d.f103839q * 6.283185307179586d));
    }

    /* JADX INFO: renamed from: c */
    public void m26506c(float f) {
        this.f103814c = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public void m26507d(float f, C15952d c15952d) {
        if (f > 0.75f) {
            c15952d.f103842t = evaluateColorChange((f - 0.75f) / 0.25f, c15952d.getStartingColor(), c15952d.getNextColor());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@efb Canvas canvas) {
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.rotate(this.f103814c, bounds.exactCenterX(), bounds.exactCenterY());
        this.f103813b.draw(canvas, bounds);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f103809C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) this.f103818m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f103811H;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    public void setArrowScale(float f) {
        C15952d c15952d = this.f103813b;
        if (c15952d.f103838p != f) {
            c15952d.f103838p = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f103813b.f103824b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(@g92 int... iArr) {
        C15952d c15952d = this.f103813b;
        c15952d.f103831i = iArr;
        c15952d.setColorIndex(0);
    }

    public void setProgressRotation(float f) {
        this.f103813b.f103828f = f;
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f2) {
        C15952d c15952d = this.f103813b;
        c15952d.f103826d = f;
        c15952d.f103827e = f2;
        invalidateSelf();
    }

    public void showArrow(boolean z) {
        C15952d c15952d = this.f103813b;
        if (c15952d.f103836n != z) {
            c15952d.f103836n = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f103811H) {
            return;
        }
        this.f103816e.reset();
        this.f103813b.storeOriginals();
        C15952d c15952d = this.f103813b;
        if (c15952d.f103827e != c15952d.f103826d) {
            this.f103810F = true;
            this.f103816e.setDuration(666L);
            this.f103815d.startAnimation(this.f103816e);
        } else {
            c15952d.setColorIndex(0);
            this.f103813b.resetOriginals();
            this.f103816e.setDuration(1332L);
            this.f103815d.startAnimation(this.f103816e);
        }
        this.f103811H = true;
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f103811H) {
            this.f103815d.clearAnimation();
            this.f103813b.setColorIndex(0);
            this.f103813b.resetOriginals();
            showArrow(false);
            m26506c(0.0f);
            this.f103811H = false;
        }
    }

    public void updateSizes(int i) {
        if (i == 0) {
            setSizeParameters(56, 56, 12.5f, 3.0f, 12.0f, 6.0f);
        } else {
            setSizeParameters(40, 40, 8.75f, 2.5f, 10.0f, 5.0f);
        }
    }
}
