package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class l02 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: F */
    public static final int f55794F = 0;

    /* JADX INFO: renamed from: H */
    public static final float f55795H = 11.0f;

    /* JADX INFO: renamed from: L */
    public static final float f55796L = 3.0f;

    /* JADX INFO: renamed from: M */
    public static final int f55797M = 12;

    /* JADX INFO: renamed from: M1 */
    public static final int f55798M1 = 5;

    /* JADX INFO: renamed from: N */
    public static final int f55799N = 6;

    /* JADX INFO: renamed from: Q */
    public static final int f55800Q = 1;

    /* JADX INFO: renamed from: X */
    public static final float f55802X = 7.5f;

    /* JADX INFO: renamed from: Y */
    public static final float f55803Y = 2.5f;

    /* JADX INFO: renamed from: Z */
    public static final int f55804Z = 10;

    /* JADX INFO: renamed from: Z1 */
    public static final float f55805Z1 = 0.75f;

    /* JADX INFO: renamed from: a2 */
    public static final float f55806a2 = 0.5f;

    /* JADX INFO: renamed from: b2 */
    public static final int f55807b2 = 1332;

    /* JADX INFO: renamed from: c2 */
    public static final float f55808c2 = 216.0f;

    /* JADX INFO: renamed from: d2 */
    public static final float f55809d2 = 0.8f;

    /* JADX INFO: renamed from: e2 */
    public static final float f55810e2 = 0.01f;

    /* JADX INFO: renamed from: f2 */
    public static final float f55811f2 = 0.20999998f;

    /* JADX INFO: renamed from: a */
    public final C8567d f55813a;

    /* JADX INFO: renamed from: b */
    public float f55814b;

    /* JADX INFO: renamed from: c */
    public Resources f55815c;

    /* JADX INFO: renamed from: d */
    public Animator f55816d;

    /* JADX INFO: renamed from: e */
    public float f55817e;

    /* JADX INFO: renamed from: f */
    public boolean f55818f;

    /* JADX INFO: renamed from: m */
    public static final Interpolator f55812m = new LinearInterpolator();

    /* JADX INFO: renamed from: C */
    public static final Interpolator f55793C = new np5();

    /* JADX INFO: renamed from: V1 */
    public static final int[] f55801V1 = {-16777216};

    /* JADX INFO: renamed from: l02$a */
    public class C8564a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8567d f55819a;

        public C8564a(C8567d c8567d) {
            this.f55819a = c8567d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            l02.this.m15187b(fFloatValue, this.f55819a);
            l02.this.m15186a(fFloatValue, this.f55819a, false);
            l02.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: l02$b */
    public class C8565b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C8567d f55821a;

        public C8565b(C8567d c8567d) {
            this.f55821a = c8567d;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            l02.this.m15186a(1.0f, this.f55821a, true);
            this.f55821a.m15200M();
            this.f55821a.m15222v();
            l02 l02Var = l02.this;
            if (!l02Var.f55818f) {
                l02Var.f55817e += 1.0f;
                return;
            }
            l02Var.f55818f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f55821a.m15196I(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l02.this.f55817e = 0.0f;
        }
    }

    /* JADX INFO: renamed from: l02$c */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC8566c {
    }

    /* JADX INFO: renamed from: l02$d */
    public static class C8567d {

        /* JADX INFO: renamed from: a */
        public final RectF f55823a = new RectF();

        /* JADX INFO: renamed from: b */
        public final Paint f55824b;

        /* JADX INFO: renamed from: c */
        public final Paint f55825c;

        /* JADX INFO: renamed from: d */
        public final Paint f55826d;

        /* JADX INFO: renamed from: e */
        public float f55827e;

        /* JADX INFO: renamed from: f */
        public float f55828f;

        /* JADX INFO: renamed from: g */
        public float f55829g;

        /* JADX INFO: renamed from: h */
        public float f55830h;

        /* JADX INFO: renamed from: i */
        public int[] f55831i;

        /* JADX INFO: renamed from: j */
        public int f55832j;

        /* JADX INFO: renamed from: k */
        public float f55833k;

        /* JADX INFO: renamed from: l */
        public float f55834l;

        /* JADX INFO: renamed from: m */
        public float f55835m;

        /* JADX INFO: renamed from: n */
        public boolean f55836n;

        /* JADX INFO: renamed from: o */
        public Path f55837o;

        /* JADX INFO: renamed from: p */
        public float f55838p;

        /* JADX INFO: renamed from: q */
        public float f55839q;

        /* JADX INFO: renamed from: r */
        public int f55840r;

        /* JADX INFO: renamed from: s */
        public int f55841s;

        /* JADX INFO: renamed from: t */
        public int f55842t;

        /* JADX INFO: renamed from: u */
        public int f55843u;

        public C8567d() {
            Paint paint = new Paint();
            this.f55824b = paint;
            Paint paint2 = new Paint();
            this.f55825c = paint2;
            Paint paint3 = new Paint();
            this.f55826d = paint3;
            this.f55827e = 0.0f;
            this.f55828f = 0.0f;
            this.f55829g = 0.0f;
            this.f55830h = 5.0f;
            this.f55838p = 1.0f;
            this.f55842t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* JADX INFO: renamed from: A */
        public void m15188A(int i) {
            this.f55826d.setColor(i);
        }

        /* JADX INFO: renamed from: B */
        public void m15189B(float f) {
            this.f55839q = f;
        }

        /* JADX INFO: renamed from: C */
        public void m15190C(int i) {
            this.f55843u = i;
        }

        /* JADX INFO: renamed from: D */
        public void m15191D(ColorFilter colorFilter) {
            this.f55824b.setColorFilter(colorFilter);
        }

        /* JADX INFO: renamed from: E */
        public void m15192E(int i) {
            this.f55832j = i;
            this.f55843u = this.f55831i[i];
        }

        /* JADX INFO: renamed from: F */
        public void m15193F(@efb int[] iArr) {
            this.f55831i = iArr;
            m15192E(0);
        }

        /* JADX INFO: renamed from: G */
        public void m15194G(float f) {
            this.f55828f = f;
        }

        /* JADX INFO: renamed from: H */
        public void m15195H(float f) {
            this.f55829g = f;
        }

        /* JADX INFO: renamed from: I */
        public void m15196I(boolean z) {
            if (this.f55836n != z) {
                this.f55836n = z;
            }
        }

        /* JADX INFO: renamed from: J */
        public void m15197J(float f) {
            this.f55827e = f;
        }

        /* JADX INFO: renamed from: K */
        public void m15198K(Paint.Cap cap) {
            this.f55824b.setStrokeCap(cap);
        }

        /* JADX INFO: renamed from: L */
        public void m15199L(float f) {
            this.f55830h = f;
            this.f55824b.setStrokeWidth(f);
        }

        /* JADX INFO: renamed from: M */
        public void m15200M() {
            this.f55833k = this.f55827e;
            this.f55834l = this.f55828f;
            this.f55835m = this.f55829g;
        }

        /* JADX INFO: renamed from: a */
        public void m15201a(Canvas canvas, Rect rect) {
            RectF rectF = this.f55823a;
            float f = this.f55839q;
            float fMin = (this.f55830h / 2.0f) + f;
            if (f <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f55840r * this.f55838p) / 2.0f, this.f55830h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f2 = this.f55827e;
            float f3 = this.f55829g;
            float f4 = (f2 + f3) * 360.0f;
            float f5 = ((this.f55828f + f3) * 360.0f) - f4;
            this.f55824b.setColor(this.f55843u);
            this.f55824b.setAlpha(this.f55842t);
            float f6 = this.f55830h / 2.0f;
            rectF.inset(f6, f6);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f55826d);
            float f7 = -f6;
            rectF.inset(f7, f7);
            canvas.drawArc(rectF, f4, f5, false, this.f55824b);
            m15202b(canvas, f4, f5, rectF);
        }

        /* JADX INFO: renamed from: b */
        public void m15202b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f55836n) {
                Path path = this.f55837o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f55837o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.f55840r * this.f55838p) / 2.0f;
                this.f55837o.moveTo(0.0f, 0.0f);
                this.f55837o.lineTo(this.f55840r * this.f55838p, 0.0f);
                Path path3 = this.f55837o;
                float f4 = this.f55840r;
                float f5 = this.f55838p;
                path3.lineTo((f4 * f5) / 2.0f, this.f55841s * f5);
                this.f55837o.offset((fMin + rectF.centerX()) - f3, rectF.centerY() + (this.f55830h / 2.0f));
                this.f55837o.close();
                this.f55825c.setColor(this.f55843u);
                this.f55825c.setAlpha(this.f55842t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f55837o, this.f55825c);
                canvas.restore();
            }
        }

        /* JADX INFO: renamed from: c */
        public int m15203c() {
            return this.f55842t;
        }

        /* JADX INFO: renamed from: d */
        public float m15204d() {
            return this.f55841s;
        }

        /* JADX INFO: renamed from: e */
        public float m15205e() {
            return this.f55838p;
        }

        /* JADX INFO: renamed from: f */
        public float m15206f() {
            return this.f55840r;
        }

        /* JADX INFO: renamed from: g */
        public int m15207g() {
            return this.f55826d.getColor();
        }

        /* JADX INFO: renamed from: h */
        public float m15208h() {
            return this.f55839q;
        }

        /* JADX INFO: renamed from: i */
        public int[] m15209i() {
            return this.f55831i;
        }

        /* JADX INFO: renamed from: j */
        public float m15210j() {
            return this.f55828f;
        }

        /* JADX INFO: renamed from: k */
        public int m15211k() {
            return this.f55831i[m15212l()];
        }

        /* JADX INFO: renamed from: l */
        public int m15212l() {
            return (this.f55832j + 1) % this.f55831i.length;
        }

        /* JADX INFO: renamed from: m */
        public float m15213m() {
            return this.f55829g;
        }

        /* JADX INFO: renamed from: n */
        public boolean m15214n() {
            return this.f55836n;
        }

        /* JADX INFO: renamed from: o */
        public float m15215o() {
            return this.f55827e;
        }

        /* JADX INFO: renamed from: p */
        public int m15216p() {
            return this.f55831i[this.f55832j];
        }

        /* JADX INFO: renamed from: q */
        public float m15217q() {
            return this.f55834l;
        }

        /* JADX INFO: renamed from: r */
        public float m15218r() {
            return this.f55835m;
        }

        /* JADX INFO: renamed from: s */
        public float m15219s() {
            return this.f55833k;
        }

        /* JADX INFO: renamed from: t */
        public Paint.Cap m15220t() {
            return this.f55824b.getStrokeCap();
        }

        /* JADX INFO: renamed from: u */
        public float m15221u() {
            return this.f55830h;
        }

        /* JADX INFO: renamed from: v */
        public void m15222v() {
            m15192E(m15212l());
        }

        /* JADX INFO: renamed from: w */
        public void m15223w() {
            this.f55833k = 0.0f;
            this.f55834l = 0.0f;
            this.f55835m = 0.0f;
            m15197J(0.0f);
            m15194G(0.0f);
            m15195H(0.0f);
        }

        /* JADX INFO: renamed from: x */
        public void m15224x(int i) {
            this.f55842t = i;
        }

        /* JADX INFO: renamed from: y */
        public void m15225y(float f, float f2) {
            this.f55840r = (int) f;
            this.f55841s = (int) f2;
        }

        /* JADX INFO: renamed from: z */
        public void m15226z(float f) {
            if (f != this.f55838p) {
                this.f55838p = f;
            }
        }
    }

    public l02(@efb Context context) {
        this.f55815c = ((Context) z7d.checkNotNull(context)).getResources();
        C8567d c8567d = new C8567d();
        this.f55813a = c8567d;
        c8567d.m15193F(f55801V1);
        setStrokeWidth(2.5f);
        setupAnimators();
    }

    private void applyFinishTranslation(float f, C8567d c8567d) {
        m15187b(f, c8567d);
        float fFloor = (float) (Math.floor(c8567d.m15218r() / 0.8f) + 1.0d);
        c8567d.m15197J(c8567d.m15219s() + (((c8567d.m15217q() - 0.01f) - c8567d.m15219s()) * f));
        c8567d.m15194G(c8567d.m15217q());
        c8567d.m15195H(c8567d.m15218r() + ((fFloor - c8567d.m15218r()) * f));
    }

    private int evaluateColorChange(float f, int i, int i2) {
        return ((((i >> 24) & 255) + ((int) ((((i2 >> 24) & 255) - r0) * f))) << 24) | ((((i >> 16) & 255) + ((int) ((((i2 >> 16) & 255) - r1) * f))) << 16) | ((((i >> 8) & 255) + ((int) ((((i2 >> 8) & 255) - r2) * f))) << 8) | ((i & 255) + ((int) (f * ((i2 & 255) - r8))));
    }

    private float getRotation() {
        return this.f55814b;
    }

    private void setRotation(float f) {
        this.f55814b = f;
    }

    private void setSizeParameters(float f, float f2, float f3, float f4) {
        C8567d c8567d = this.f55813a;
        float f5 = this.f55815c.getDisplayMetrics().density;
        c8567d.m15199L(f2 * f5);
        c8567d.m15189B(f * f5);
        c8567d.m15192E(0);
        c8567d.m15225y(f3 * f5, f4 * f5);
    }

    private void setupAnimators() {
        C8567d c8567d = this.f55813a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C8564a(c8567d));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f55812m);
        valueAnimatorOfFloat.addListener(new C8565b(c8567d));
        this.f55816d = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: a */
    public void m15186a(float f, C8567d c8567d, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f55818f) {
            applyFinishTranslation(f, c8567d);
            return;
        }
        if (f != 1.0f || z) {
            float fM15218r = c8567d.m15218r();
            if (f < 0.5f) {
                interpolation = c8567d.m15219s();
                interpolation2 = (f55793C.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fM15219s = c8567d.m15219s() + 0.79f;
                interpolation = fM15219s - (((1.0f - f55793C.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fM15219s;
            }
            float f2 = fM15218r + (0.20999998f * f);
            float f3 = (f + this.f55817e) * 216.0f;
            c8567d.m15197J(interpolation);
            c8567d.m15194G(interpolation2);
            c8567d.m15195H(f2);
            setRotation(f3);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15187b(float f, C8567d c8567d) {
        if (f > 0.75f) {
            c8567d.m15190C(evaluateColorChange((f - 0.75f) / 0.25f, c8567d.m15216p(), c8567d.m15211k()));
        } else {
            c8567d.m15190C(c8567d.m15216p());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f55814b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f55813a.m15201a(canvas, bounds);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f55813a.m15203c();
    }

    public boolean getArrowEnabled() {
        return this.f55813a.m15214n();
    }

    public float getArrowHeight() {
        return this.f55813a.m15204d();
    }

    public float getArrowScale() {
        return this.f55813a.m15205e();
    }

    public float getArrowWidth() {
        return this.f55813a.m15206f();
    }

    public int getBackgroundColor() {
        return this.f55813a.m15207g();
    }

    public float getCenterRadius() {
        return this.f55813a.m15208h();
    }

    @efb
    public int[] getColorSchemeColors() {
        return this.f55813a.m15209i();
    }

    public float getEndTrim() {
        return this.f55813a.m15210j();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float getProgressRotation() {
        return this.f55813a.m15213m();
    }

    public float getStartTrim() {
        return this.f55813a.m15215o();
    }

    @efb
    public Paint.Cap getStrokeCap() {
        return this.f55813a.m15220t();
    }

    public float getStrokeWidth() {
        return this.f55813a.m15221u();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f55816d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f55813a.m15224x(i);
        invalidateSelf();
    }

    public void setArrowDimensions(float f, float f2) {
        this.f55813a.m15225y(f, f2);
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z) {
        this.f55813a.m15196I(z);
        invalidateSelf();
    }

    public void setArrowScale(float f) {
        this.f55813a.m15226z(f);
        invalidateSelf();
    }

    public void setBackgroundColor(int i) {
        this.f55813a.m15188A(i);
        invalidateSelf();
    }

    public void setCenterRadius(float f) {
        this.f55813a.m15189B(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f55813a.m15191D(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(@efb int... iArr) {
        this.f55813a.m15193F(iArr);
        this.f55813a.m15192E(0);
        invalidateSelf();
    }

    public void setProgressRotation(float f) {
        this.f55813a.m15195H(f);
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f2) {
        this.f55813a.m15197J(f);
        this.f55813a.m15194G(f2);
        invalidateSelf();
    }

    public void setStrokeCap(@efb Paint.Cap cap) {
        this.f55813a.m15198K(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f) {
        this.f55813a.m15199L(f);
        invalidateSelf();
    }

    public void setStyle(int i) {
        if (i == 0) {
            setSizeParameters(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            setSizeParameters(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f55816d.cancel();
        this.f55813a.m15200M();
        if (this.f55813a.m15210j() != this.f55813a.m15215o()) {
            this.f55818f = true;
            this.f55816d.setDuration(666L);
            this.f55816d.start();
        } else {
            this.f55813a.m15192E(0);
            this.f55813a.m15223w();
            this.f55816d.setDuration(1332L);
            this.f55816d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f55816d.cancel();
        setRotation(0.0f);
        this.f55813a.m15196I(false);
        this.f55813a.m15192E(0);
        this.f55813a.m15223w();
        invalidateSelf();
    }
}
