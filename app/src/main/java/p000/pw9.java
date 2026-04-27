package p000;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.C3146R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;
import p000.wq1;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public final class pw9 extends Transition {

    /* JADX INFO: renamed from: f2 */
    public static final int f72268f2 = 0;

    /* JADX INFO: renamed from: g2 */
    public static final int f72269g2 = 1;

    /* JADX INFO: renamed from: h2 */
    public static final int f72270h2 = 2;

    /* JADX INFO: renamed from: i2 */
    public static final int f72271i2 = 0;

    /* JADX INFO: renamed from: j2 */
    public static final int f72272j2 = 1;

    /* JADX INFO: renamed from: k2 */
    public static final int f72273k2 = 2;

    /* JADX INFO: renamed from: l2 */
    public static final int f72274l2 = 3;

    /* JADX INFO: renamed from: m2 */
    public static final int f72275m2 = 0;

    /* JADX INFO: renamed from: n2 */
    public static final int f72276n2 = 1;

    /* JADX INFO: renamed from: o2 */
    public static final int f72277o2 = 2;

    /* JADX INFO: renamed from: p2 */
    public static final String f72278p2 = "pw9";

    /* JADX INFO: renamed from: q2 */
    public static final String f72279q2 = "materialContainerTransition:bounds";

    /* JADX INFO: renamed from: r2 */
    public static final String f72280r2 = "materialContainerTransition:shapeAppearance";

    /* JADX INFO: renamed from: u2 */
    public static final C11155g f72283u2;

    /* JADX INFO: renamed from: w2 */
    public static final C11155g f72285w2;

    /* JADX INFO: renamed from: x2 */
    public static final float f72286x2 = -1.0f;

    /* JADX INFO: renamed from: C */
    @g92
    public int f72287C;

    /* JADX INFO: renamed from: F */
    @g92
    public int f72288F;

    /* JADX INFO: renamed from: H */
    @g92
    public int f72289H;

    /* JADX INFO: renamed from: L */
    @g92
    public int f72290L;

    /* JADX INFO: renamed from: M */
    public int f72291M;

    /* JADX INFO: renamed from: M1 */
    @hib
    public n8f f72292M1;

    /* JADX INFO: renamed from: N */
    public int f72293N;

    /* JADX INFO: renamed from: Q */
    public int f72294Q;

    /* JADX INFO: renamed from: V1 */
    @hib
    public C11154f f72295V1;

    /* JADX INFO: renamed from: X */
    @hib
    public View f72296X;

    /* JADX INFO: renamed from: Y */
    @hib
    public View f72297Y;

    /* JADX INFO: renamed from: Z */
    @hib
    public n8f f72298Z;

    /* JADX INFO: renamed from: Z1 */
    @hib
    public C11154f f72299Z1;

    /* JADX INFO: renamed from: a */
    public boolean f72300a;

    /* JADX INFO: renamed from: a2 */
    @hib
    public C11154f f72301a2;

    /* JADX INFO: renamed from: b */
    public boolean f72302b;

    /* JADX INFO: renamed from: b2 */
    @hib
    public C11154f f72303b2;

    /* JADX INFO: renamed from: c */
    public boolean f72304c;

    /* JADX INFO: renamed from: c2 */
    public boolean f72305c2;

    /* JADX INFO: renamed from: d */
    public boolean f72306d;

    /* JADX INFO: renamed from: d2 */
    public float f72307d2;

    /* JADX INFO: renamed from: e */
    @kr7
    public int f72308e;

    /* JADX INFO: renamed from: e2 */
    public float f72309e2;

    /* JADX INFO: renamed from: f */
    @kr7
    public int f72310f;

    /* JADX INFO: renamed from: m */
    @kr7
    public int f72311m;

    /* JADX INFO: renamed from: s2 */
    public static final String[] f72281s2 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* JADX INFO: renamed from: t2 */
    public static final C11155g f72282t2 = new C11155g(new C11154f(0.0f, 0.25f), new C11154f(0.0f, 1.0f), new C11154f(0.0f, 1.0f), new C11154f(0.0f, 0.75f), null);

    /* JADX INFO: renamed from: v2 */
    public static final C11155g f72284v2 = new C11155g(new C11154f(0.1f, 0.4f), new C11154f(0.1f, 1.0f), new C11154f(0.1f, 1.0f), new C11154f(0.1f, 0.9f), null);

    /* JADX INFO: renamed from: pw9$a */
    public class C11149a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11151c f72312a;

        public C11149a(C11151c c11151c) {
            this.f72312a = c11151c;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f72312a.setProgress(valueAnimator.getAnimatedFraction());
        }
    }

    /* JADX INFO: renamed from: pw9$b */
    public class C11150b extends ifh {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f72314a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C11151c f72315b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f72316c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f72317d;

        public C11150b(View view, C11151c c11151c, View view2, View view3) {
            this.f72314a = view;
            this.f72315b = c11151c;
            this.f72316c = view2;
            this.f72317d = view3;
        }

        @Override // p000.ifh, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@efb Transition transition) {
            pw9.this.removeListener(this);
            if (pw9.this.f72302b) {
                return;
            }
            this.f72316c.setAlpha(1.0f);
            this.f72317d.setAlpha(1.0f);
            cci.getOverlay(this.f72314a).remove(this.f72315b);
        }

        @Override // p000.ifh, android.transition.Transition.TransitionListener
        public void onTransitionStart(@efb Transition transition) {
            cci.getOverlay(this.f72314a).add(this.f72315b);
            this.f72316c.setAlpha(0.0f);
            this.f72317d.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: pw9$c */
    public static final class C11151c extends Drawable {

        /* JADX INFO: renamed from: M */
        public static final int f72319M = 754974720;

        /* JADX INFO: renamed from: N */
        public static final int f72320N = -7829368;

        /* JADX INFO: renamed from: O */
        public static final float f72321O = 0.3f;

        /* JADX INFO: renamed from: P */
        public static final float f72322P = 1.5f;

        /* JADX INFO: renamed from: A */
        public final C11155g f72323A;

        /* JADX INFO: renamed from: B */
        public final mo5 f72324B;

        /* JADX INFO: renamed from: C */
        public final o16 f72325C;

        /* JADX INFO: renamed from: D */
        public final boolean f72326D;

        /* JADX INFO: renamed from: E */
        public final Paint f72327E;

        /* JADX INFO: renamed from: F */
        public final Path f72328F;

        /* JADX INFO: renamed from: G */
        public qo5 f72329G;

        /* JADX INFO: renamed from: H */
        public s16 f72330H;

        /* JADX INFO: renamed from: I */
        public RectF f72331I;

        /* JADX INFO: renamed from: J */
        public float f72332J;

        /* JADX INFO: renamed from: K */
        public float f72333K;

        /* JADX INFO: renamed from: L */
        public float f72334L;

        /* JADX INFO: renamed from: a */
        public final View f72335a;

        /* JADX INFO: renamed from: b */
        public final RectF f72336b;

        /* JADX INFO: renamed from: c */
        public final n8f f72337c;

        /* JADX INFO: renamed from: d */
        public final float f72338d;

        /* JADX INFO: renamed from: e */
        public final View f72339e;

        /* JADX INFO: renamed from: f */
        public final RectF f72340f;

        /* JADX INFO: renamed from: g */
        public final n8f f72341g;

        /* JADX INFO: renamed from: h */
        public final float f72342h;

        /* JADX INFO: renamed from: i */
        public final Paint f72343i;

        /* JADX INFO: renamed from: j */
        public final Paint f72344j;

        /* JADX INFO: renamed from: k */
        public final Paint f72345k;

        /* JADX INFO: renamed from: l */
        public final Paint f72346l;

        /* JADX INFO: renamed from: m */
        public final Paint f72347m;

        /* JADX INFO: renamed from: n */
        public final gv9 f72348n;

        /* JADX INFO: renamed from: o */
        public final PathMeasure f72349o;

        /* JADX INFO: renamed from: p */
        public final float f72350p;

        /* JADX INFO: renamed from: q */
        public final float[] f72351q;

        /* JADX INFO: renamed from: r */
        public final boolean f72352r;

        /* JADX INFO: renamed from: s */
        public final float f72353s;

        /* JADX INFO: renamed from: t */
        public final float f72354t;

        /* JADX INFO: renamed from: u */
        public final boolean f72355u;

        /* JADX INFO: renamed from: v */
        public final b3a f72356v;

        /* JADX INFO: renamed from: w */
        public final RectF f72357w;

        /* JADX INFO: renamed from: x */
        public final RectF f72358x;

        /* JADX INFO: renamed from: y */
        public final RectF f72359y;

        /* JADX INFO: renamed from: z */
        public final RectF f72360z;

        /* JADX INFO: renamed from: pw9$c$a */
        public class a implements wq1.InterfaceC14743a {
            public a() {
            }

            @Override // p000.wq1.InterfaceC14743a
            public void run(Canvas canvas) {
                C11151c.this.f72335a.draw(canvas);
            }
        }

        /* JADX INFO: renamed from: pw9$c$b */
        public class b implements wq1.InterfaceC14743a {
            public b() {
            }

            @Override // p000.wq1.InterfaceC14743a
            public void run(Canvas canvas) {
                C11151c.this.f72339e.draw(canvas);
            }
        }

        public /* synthetic */ C11151c(PathMotion pathMotion, View view, RectF rectF, n8f n8fVar, float f, View view2, RectF rectF2, n8f n8fVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, mo5 mo5Var, o16 o16Var, C11155g c11155g, boolean z3, C11149a c11149a) {
            this(pathMotion, view, rectF, n8fVar, f, view2, rectF2, n8fVar2, f2, i, i2, i3, i4, z, z2, mo5Var, o16Var, c11155g, z3);
        }

        private static float calculateElevationDxMultiplier(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        private static float calculateElevationDyMultiplier(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        private void drawDebugCumulativePath(Canvas canvas, RectF rectF, Path path, @g92 int i) {
            PointF motionPathPoint = getMotionPathPoint(rectF);
            if (this.f72334L == 0.0f) {
                path.reset();
                path.moveTo(motionPathPoint.x, motionPathPoint.y);
            } else {
                path.lineTo(motionPathPoint.x, motionPathPoint.y);
                this.f72327E.setColor(i);
                canvas.drawPath(path, this.f72327E);
            }
        }

        private void drawDebugRect(Canvas canvas, RectF rectF, @g92 int i) {
            this.f72327E.setColor(i);
            canvas.drawRect(rectF, this.f72327E);
        }

        private void drawElevationShadow(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f72348n.m11999d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                drawElevationShadowWithPaintShadowLayer(canvas);
            } else {
                drawElevationShadowWithMaterialShapeDrawable(canvas);
            }
            canvas.restore();
        }

        private void drawElevationShadowWithMaterialShapeDrawable(Canvas canvas) {
            b3a b3aVar = this.f72356v;
            RectF rectF = this.f72331I;
            b3aVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f72356v.setElevation(this.f72332J);
            this.f72356v.setShadowVerticalOffset((int) this.f72333K);
            this.f72356v.setShapeAppearanceModel(this.f72348n.m11998c());
            this.f72356v.draw(canvas);
        }

        private void drawElevationShadowWithPaintShadowLayer(Canvas canvas) {
            n8f n8fVarM11998c = this.f72348n.m11998c();
            if (!n8fVarM11998c.isRoundRect(this.f72331I)) {
                canvas.drawPath(this.f72348n.m11999d(), this.f72346l);
            } else {
                float cornerSize = n8fVarM11998c.getTopLeftCornerSize().getCornerSize(this.f72331I);
                canvas.drawRoundRect(this.f72331I, cornerSize, cornerSize, this.f72346l);
            }
        }

        private void drawEndView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.f72345k);
            Rect bounds = getBounds();
            RectF rectF = this.f72359y;
            qfh.m20351v(canvas, bounds, rectF.left, rectF.top, this.f72330H.f80378b, this.f72329G.f75037b, new b());
        }

        private void drawStartView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.f72344j);
            Rect bounds = getBounds();
            RectF rectF = this.f72357w;
            qfh.m20351v(canvas, bounds, rectF.left, rectF.top, this.f72330H.f80377a, this.f72329G.f75036a, new a());
        }

        private static PointF getMotionPathPoint(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        private void maybeDrawContainerColor(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProgress(float f) {
            if (this.f72334L != f) {
                updateProgress(f);
            }
        }

        private void updateProgress(float f) {
            float f2;
            float f3;
            this.f72334L = f;
            this.f72347m.setAlpha((int) (this.f72352r ? qfh.m20340k(0.0f, 255.0f, f) : qfh.m20340k(255.0f, 0.0f, f)));
            this.f72349o.getPosTan(this.f72350p * f, this.f72351q, null);
            float[] fArr = this.f72351q;
            float f4 = fArr[0];
            float f5 = fArr[1];
            if (f > 1.0f || f < 0.0f) {
                if (f > 1.0f) {
                    f3 = (f - 1.0f) / 0.00999999f;
                    f2 = 0.99f;
                } else {
                    f2 = 0.01f;
                    f3 = (f / 0.01f) * (-1.0f);
                }
                this.f72349o.getPosTan(this.f72350p * f2, fArr, null);
                float[] fArr2 = this.f72351q;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            s16 s16VarEvaluate = this.f72325C.evaluate(f, ((Float) z7d.checkNotNull(Float.valueOf(this.f72323A.f72366b.f72363a))).floatValue(), ((Float) z7d.checkNotNull(Float.valueOf(this.f72323A.f72366b.f72364b))).floatValue(), this.f72336b.width(), this.f72336b.height(), this.f72340f.width(), this.f72340f.height());
            this.f72330H = s16VarEvaluate;
            RectF rectF = this.f72357w;
            float f8 = s16VarEvaluate.f80379c;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, s16VarEvaluate.f80380d + f7);
            RectF rectF2 = this.f72359y;
            s16 s16Var = this.f72330H;
            float f9 = s16Var.f80381e;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), s16Var.f80382f + f7);
            this.f72358x.set(this.f72357w);
            this.f72360z.set(this.f72359y);
            float fFloatValue = ((Float) z7d.checkNotNull(Float.valueOf(this.f72323A.f72367c.f72363a))).floatValue();
            float fFloatValue2 = ((Float) z7d.checkNotNull(Float.valueOf(this.f72323A.f72367c.f72364b))).floatValue();
            boolean zShouldMaskStartBounds = this.f72325C.shouldMaskStartBounds(this.f72330H);
            RectF rectF3 = zShouldMaskStartBounds ? this.f72358x : this.f72360z;
            float fM20341l = qfh.m20341l(0.0f, 1.0f, fFloatValue, fFloatValue2, f);
            if (!zShouldMaskStartBounds) {
                fM20341l = 1.0f - fM20341l;
            }
            this.f72325C.applyMask(rectF3, fM20341l, this.f72330H);
            this.f72331I = new RectF(Math.min(this.f72358x.left, this.f72360z.left), Math.min(this.f72358x.top, this.f72360z.top), Math.max(this.f72358x.right, this.f72360z.right), Math.max(this.f72358x.bottom, this.f72360z.bottom));
            this.f72348n.m11997b(f, this.f72337c, this.f72341g, this.f72357w, this.f72358x, this.f72360z, this.f72323A.f72368d);
            this.f72332J = qfh.m20340k(this.f72338d, this.f72342h, f);
            float fCalculateElevationDxMultiplier = calculateElevationDxMultiplier(this.f72331I, this.f72353s);
            float fCalculateElevationDyMultiplier = calculateElevationDyMultiplier(this.f72331I, this.f72354t);
            float f10 = this.f72332J;
            float f11 = (int) (fCalculateElevationDyMultiplier * f10);
            this.f72333K = f11;
            this.f72346l.setShadowLayer(f10, (int) (fCalculateElevationDxMultiplier * f10), f11, 754974720);
            this.f72329G = this.f72324B.evaluate(f, ((Float) z7d.checkNotNull(Float.valueOf(this.f72323A.f72365a.f72363a))).floatValue(), ((Float) z7d.checkNotNull(Float.valueOf(this.f72323A.f72365a.f72364b))).floatValue(), 0.35f);
            if (this.f72344j.getColor() != 0) {
                this.f72344j.setAlpha(this.f72329G.f75036a);
            }
            if (this.f72345k.getColor() != 0) {
                this.f72345k.setAlpha(this.f72329G.f75037b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@efb Canvas canvas) {
            if (this.f72347m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f72347m);
            }
            int iSave = this.f72326D ? canvas.save() : -1;
            if (this.f72355u && this.f72332J > 0.0f) {
                drawElevationShadow(canvas);
            }
            this.f72348n.m11996a(canvas);
            maybeDrawContainerColor(canvas, this.f72343i);
            if (this.f72329G.f75038c) {
                drawStartView(canvas);
                drawEndView(canvas);
            } else {
                drawEndView(canvas);
                drawStartView(canvas);
            }
            if (this.f72326D) {
                canvas.restoreToCount(iSave);
                drawDebugCumulativePath(canvas, this.f72357w, this.f72328F, -65281);
                drawDebugRect(canvas, this.f72358x, -256);
                drawDebugRect(canvas, this.f72357w, -16711936);
                drawDebugRect(canvas, this.f72360z, -16711681);
                drawDebugRect(canvas, this.f72359y, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@hib ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        private C11151c(PathMotion pathMotion, View view, RectF rectF, n8f n8fVar, float f, View view2, RectF rectF2, n8f n8fVar2, float f2, @g92 int i, @g92 int i2, @g92 int i3, int i4, boolean z, boolean z2, mo5 mo5Var, o16 o16Var, C11155g c11155g, boolean z3) {
            Paint paint = new Paint();
            this.f72343i = paint;
            Paint paint2 = new Paint();
            this.f72344j = paint2;
            Paint paint3 = new Paint();
            this.f72345k = paint3;
            this.f72346l = new Paint();
            Paint paint4 = new Paint();
            this.f72347m = paint4;
            this.f72348n = new gv9();
            this.f72351q = new float[]{rectF.centerX(), rectF.top};
            b3a b3aVar = new b3a();
            this.f72356v = b3aVar;
            Paint paint5 = new Paint();
            this.f72327E = paint5;
            this.f72328F = new Path();
            this.f72335a = view;
            this.f72336b = rectF;
            this.f72337c = n8fVar;
            this.f72338d = f;
            this.f72339e = view2;
            this.f72340f = rectF2;
            this.f72341g = n8fVar2;
            this.f72342h = f2;
            this.f72352r = z;
            this.f72355u = z2;
            this.f72324B = mo5Var;
            this.f72325C = o16Var;
            this.f72323A = c11155g;
            this.f72326D = z3;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f72353s = r12.widthPixels;
            this.f72354t = r12.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            b3aVar.setFillColor(ColorStateList.valueOf(0));
            b3aVar.setShadowCompatibilityMode(2);
            b3aVar.setShadowBitmapDrawingEnable(false);
            b3aVar.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f72357w = rectF3;
            this.f72358x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f72359y = rectF4;
            this.f72360z = new RectF(rectF4);
            PointF motionPathPoint = getMotionPathPoint(rectF);
            PointF motionPathPoint2 = getMotionPathPoint(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(motionPathPoint.x, motionPathPoint.y, motionPathPoint2.x, motionPathPoint2.y), false);
            this.f72349o = pathMeasure;
            this.f72350p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(qfh.m20333d(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            updateProgress(0.0f);
        }
    }

    /* JADX INFO: renamed from: pw9$d */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC11152d {
    }

    /* JADX INFO: renamed from: pw9$e */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC11153e {
    }

    /* JADX INFO: renamed from: pw9$f */
    public static class C11154f {

        /* JADX INFO: renamed from: a */
        @y46(from = 0.0d, m25645to = 1.0d)
        public final float f72363a;

        /* JADX INFO: renamed from: b */
        @y46(from = 0.0d, m25645to = 1.0d)
        public final float f72364b;

        public C11154f(@y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2) {
            this.f72363a = f;
            this.f72364b = f2;
        }

        @y46(from = 0.0d, m25645to = 1.0d)
        public float getEnd() {
            return this.f72364b;
        }

        @y46(from = 0.0d, m25645to = 1.0d)
        public float getStart() {
            return this.f72363a;
        }
    }

    /* JADX INFO: renamed from: pw9$g */
    public static class C11155g {

        /* JADX INFO: renamed from: a */
        @efb
        public final C11154f f72365a;

        /* JADX INFO: renamed from: b */
        @efb
        public final C11154f f72366b;

        /* JADX INFO: renamed from: c */
        @efb
        public final C11154f f72367c;

        /* JADX INFO: renamed from: d */
        @efb
        public final C11154f f72368d;

        public /* synthetic */ C11155g(C11154f c11154f, C11154f c11154f2, C11154f c11154f3, C11154f c11154f4, C11149a c11149a) {
            this(c11154f, c11154f2, c11154f3, c11154f4);
        }

        private C11155g(@efb C11154f c11154f, @efb C11154f c11154f2, @efb C11154f c11154f3, @efb C11154f c11154f4) {
            this.f72365a = c11154f;
            this.f72366b = c11154f2;
            this.f72367c = c11154f3;
            this.f72368d = c11154f4;
        }
    }

    /* JADX INFO: renamed from: pw9$h */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC11156h {
    }

    static {
        C11149a c11149a = null;
        f72283u2 = new C11155g(new C11154f(0.6f, 0.9f), new C11154f(0.0f, 1.0f), new C11154f(0.0f, 0.9f), new C11154f(0.3f, 0.9f), c11149a);
        f72285w2 = new C11155g(new C11154f(0.6f, 0.9f), new C11154f(0.0f, 0.9f), new C11154f(0.0f, 0.9f), new C11154f(0.2f, 0.9f), c11149a);
    }

    public pw9() {
        this.f72300a = false;
        this.f72302b = false;
        this.f72304c = false;
        this.f72306d = false;
        this.f72308e = R.id.content;
        this.f72310f = -1;
        this.f72311m = -1;
        this.f72287C = 0;
        this.f72288F = 0;
        this.f72289H = 0;
        this.f72290L = 1375731712;
        this.f72291M = 0;
        this.f72293N = 0;
        this.f72294Q = 0;
        this.f72305c2 = Build.VERSION.SDK_INT >= 28;
        this.f72307d2 = -1.0f;
        this.f72309e2 = -1.0f;
    }

    private C11155g buildThresholdsGroup(boolean z) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof fw9)) ? getThresholdsOrDefault(z, f72284v2, f72285w2) : getThresholdsOrDefault(z, f72282t2, f72283u2);
    }

    private static RectF calculateDrawableBounds(View view, @hib View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFM20337h = qfh.m20337h(view2);
        rectFM20337h.offset(f, f2);
        return rectFM20337h;
    }

    private static n8f captureShapeAppearance(@efb View view, @efb RectF rectF, @hib n8f n8fVar) {
        return qfh.m20332c(getShapeAppearance(view, n8fVar), rectF);
    }

    private static void captureValues(@efb TransitionValues transitionValues, @hib View view, @kr7 int i, @hib n8f n8fVar) {
        if (i != -1) {
            transitionValues.view = qfh.m20336g(transitionValues.view, i);
        } else if (view != null) {
            transitionValues.view = view;
        } else if (transitionValues.view.getTag(C3146R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) transitionValues.view.getTag(C3146R.id.mtrl_motion_snapshot_view);
            transitionValues.view.setTag(C3146R.id.mtrl_motion_snapshot_view, null);
            transitionValues.view = view2;
        }
        View view3 = transitionValues.view;
        if (!o8i.isLaidOut(view3) && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        RectF rectFM20338i = view3.getParent() == null ? qfh.m20338i(view3) : qfh.m20337h(view3);
        transitionValues.values.put("materialContainerTransition:bounds", rectFM20338i);
        transitionValues.values.put("materialContainerTransition:shapeAppearance", captureShapeAppearance(view3, rectFM20338i, n8fVar));
    }

    private static float getElevationOrDefault(float f, View view) {
        return f != -1.0f ? f : o8i.getElevation(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static n8f getShapeAppearance(@efb View view, @hib n8f n8fVar) {
        if (n8fVar != null) {
            return n8fVar;
        }
        if (view.getTag(C3146R.id.mtrl_motion_snapshot_view) instanceof n8f) {
            return (n8f) view.getTag(C3146R.id.mtrl_motion_snapshot_view);
        }
        Context context = view.getContext();
        int transitionShapeAppearanceResId = getTransitionShapeAppearanceResId(context);
        return transitionShapeAppearanceResId != -1 ? n8f.builder(context, transitionShapeAppearanceResId, 0).build() : view instanceof i9f ? ((i9f) view).getShapeAppearanceModel() : n8f.builder().build();
    }

    private C11155g getThresholdsOrDefault(boolean z, C11155g c11155g, C11155g c11155g2) {
        if (!z) {
            c11155g = c11155g2;
        }
        return new C11155g((C11154f) qfh.m20334e(this.f72295V1, c11155g.f72365a), (C11154f) qfh.m20334e(this.f72299Z1, c11155g.f72366b), (C11154f) qfh.m20334e(this.f72301a2, c11155g.f72367c), (C11154f) qfh.m20334e(this.f72303b2, c11155g.f72368d), null);
    }

    @dbg
    private static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{C3146R.attr.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean isEntering(@efb RectF rectF, @efb RectF rectF2) {
        int i = this.f72291M;
        if (i == 0) {
            return qfh.m20331b(rectF2) > qfh.m20331b(rectF);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f72291M);
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        qfh.m20347r(this, context, C3146R.attr.motionEasingEmphasizedInterpolator, C13280ty.f86290b);
        qfh.m20346q(this, context, z ? C3146R.attr.motionDurationLong2 : C3146R.attr.motionDurationMedium4);
        if (this.f72304c) {
            return;
        }
        qfh.m20348s(this, context, C3146R.attr.motionPath);
    }

    @Override // android.transition.Transition
    public void captureEndValues(@efb TransitionValues transitionValues) {
        captureValues(transitionValues, this.f72297Y, this.f72311m, this.f72292M1);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@efb TransitionValues transitionValues) {
        captureValues(transitionValues, this.f72296X, this.f72310f, this.f72298Z);
    }

    @Override // android.transition.Transition
    @hib
    public Animator createAnimator(@efb ViewGroup viewGroup, @hib TransitionValues transitionValues, @hib TransitionValues transitionValues2) {
        View viewM20335f;
        View view;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            n8f n8fVar = (n8f) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF != null && n8fVar != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                n8f n8fVar2 = (n8f) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 == null || n8fVar2 == null) {
                    Log.w(f72278p2, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view2 = transitionValues.view;
                View view3 = transitionValues2.view;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f72308e == view4.getId()) {
                    viewM20335f = (View) view4.getParent();
                    view = view4;
                } else {
                    viewM20335f = qfh.m20335f(view4, this.f72308e);
                    view = null;
                }
                RectF rectFM20337h = qfh.m20337h(viewM20335f);
                float f = -rectFM20337h.left;
                float f2 = -rectFM20337h.top;
                RectF rectFCalculateDrawableBounds = calculateDrawableBounds(viewM20335f, view, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean zIsEntering = isEntering(rectF, rectF2);
                if (!this.f72306d) {
                    maybeApplyThemeValues(view4.getContext(), zIsEntering);
                }
                C11151c c11151c = new C11151c(getPathMotion(), view2, rectF, n8fVar, getElevationOrDefault(this.f72307d2, view2), view3, rectF2, n8fVar2, getElevationOrDefault(this.f72309e2, view3), this.f72287C, this.f72288F, this.f72289H, this.f72290L, zIsEntering, this.f72305c2, po5.m19634a(this.f72293N, zIsEntering), r16.m20760a(this.f72294Q, zIsEntering, rectF, rectF2), buildThresholdsGroup(zIsEntering), this.f72300a, null);
                c11151c.setBounds(Math.round(rectFCalculateDrawableBounds.left), Math.round(rectFCalculateDrawableBounds.top), Math.round(rectFCalculateDrawableBounds.right), Math.round(rectFCalculateDrawableBounds.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new C11149a(c11151c));
                addListener(new C11150b(viewM20335f, c11151c, view2, view3));
                return valueAnimatorOfFloat;
            }
            Log.w(f72278p2, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @g92
    public int getContainerColor() {
        return this.f72287C;
    }

    @kr7
    public int getDrawingViewId() {
        return this.f72308e;
    }

    @g92
    public int getEndContainerColor() {
        return this.f72289H;
    }

    public float getEndElevation() {
        return this.f72309e2;
    }

    @hib
    public n8f getEndShapeAppearanceModel() {
        return this.f72292M1;
    }

    @hib
    public View getEndView() {
        return this.f72297Y;
    }

    @kr7
    public int getEndViewId() {
        return this.f72311m;
    }

    public int getFadeMode() {
        return this.f72293N;
    }

    @hib
    public C11154f getFadeProgressThresholds() {
        return this.f72295V1;
    }

    public int getFitMode() {
        return this.f72294Q;
    }

    @hib
    public C11154f getScaleMaskProgressThresholds() {
        return this.f72301a2;
    }

    @hib
    public C11154f getScaleProgressThresholds() {
        return this.f72299Z1;
    }

    @g92
    public int getScrimColor() {
        return this.f72290L;
    }

    @hib
    public C11154f getShapeMaskProgressThresholds() {
        return this.f72303b2;
    }

    @g92
    public int getStartContainerColor() {
        return this.f72288F;
    }

    public float getStartElevation() {
        return this.f72307d2;
    }

    @hib
    public n8f getStartShapeAppearanceModel() {
        return this.f72298Z;
    }

    @hib
    public View getStartView() {
        return this.f72296X;
    }

    @kr7
    public int getStartViewId() {
        return this.f72310f;
    }

    public int getTransitionDirection() {
        return this.f72291M;
    }

    @Override // android.transition.Transition
    @hib
    public String[] getTransitionProperties() {
        return f72281s2;
    }

    public boolean isDrawDebugEnabled() {
        return this.f72300a;
    }

    public boolean isElevationShadowEnabled() {
        return this.f72305c2;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f72302b;
    }

    public void setAllContainerColors(@g92 int i) {
        this.f72287C = i;
        this.f72288F = i;
        this.f72289H = i;
    }

    public void setContainerColor(@g92 int i) {
        this.f72287C = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.f72300a = z;
    }

    public void setDrawingViewId(@kr7 int i) {
        this.f72308e = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.f72305c2 = z;
    }

    public void setEndContainerColor(@g92 int i) {
        this.f72289H = i;
    }

    public void setEndElevation(float f) {
        this.f72309e2 = f;
    }

    public void setEndShapeAppearanceModel(@hib n8f n8fVar) {
        this.f72292M1 = n8fVar;
    }

    public void setEndView(@hib View view) {
        this.f72297Y = view;
    }

    public void setEndViewId(@kr7 int i) {
        this.f72311m = i;
    }

    public void setFadeMode(int i) {
        this.f72293N = i;
    }

    public void setFadeProgressThresholds(@hib C11154f c11154f) {
        this.f72295V1 = c11154f;
    }

    public void setFitMode(int i) {
        this.f72294Q = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.f72302b = z;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@hib PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f72304c = true;
    }

    public void setScaleMaskProgressThresholds(@hib C11154f c11154f) {
        this.f72301a2 = c11154f;
    }

    public void setScaleProgressThresholds(@hib C11154f c11154f) {
        this.f72299Z1 = c11154f;
    }

    public void setScrimColor(@g92 int i) {
        this.f72290L = i;
    }

    public void setShapeMaskProgressThresholds(@hib C11154f c11154f) {
        this.f72303b2 = c11154f;
    }

    public void setStartContainerColor(@g92 int i) {
        this.f72288F = i;
    }

    public void setStartElevation(float f) {
        this.f72307d2 = f;
    }

    public void setStartShapeAppearanceModel(@hib n8f n8fVar) {
        this.f72298Z = n8fVar;
    }

    public void setStartView(@hib View view) {
        this.f72296X = view;
    }

    public void setStartViewId(@kr7 int i) {
        this.f72310f = i;
    }

    public void setTransitionDirection(int i) {
        this.f72291M = i;
    }

    public pw9(@efb Context context, boolean z) {
        this.f72300a = false;
        this.f72302b = false;
        this.f72304c = false;
        this.f72306d = false;
        this.f72308e = R.id.content;
        this.f72310f = -1;
        this.f72311m = -1;
        this.f72287C = 0;
        this.f72288F = 0;
        this.f72289H = 0;
        this.f72290L = 1375731712;
        this.f72291M = 0;
        this.f72293N = 0;
        this.f72294Q = 0;
        this.f72305c2 = Build.VERSION.SDK_INT >= 28;
        this.f72307d2 = -1.0f;
        this.f72309e2 = -1.0f;
        maybeApplyThemeValues(context, z);
        this.f72306d = true;
    }
}
