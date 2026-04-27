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
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.transition.AbstractC1458q;
import androidx.transition.C1443b;
import com.google.android.material.C3146R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.p7e;
import p000.wq1;

/* JADX INFO: loaded from: classes5.dex */
public final class qw9 extends AbstractC1458q {

    /* JADX INFO: renamed from: b3 */
    public static final int f76079b3 = 0;

    /* JADX INFO: renamed from: c3 */
    public static final int f76080c3 = 1;

    /* JADX INFO: renamed from: d3 */
    public static final int f76081d3 = 2;

    /* JADX INFO: renamed from: e3 */
    public static final int f76082e3 = 0;

    /* JADX INFO: renamed from: f3 */
    public static final int f76083f3 = 1;

    /* JADX INFO: renamed from: g3 */
    public static final int f76084g3 = 2;

    /* JADX INFO: renamed from: h3 */
    public static final int f76085h3 = 3;

    /* JADX INFO: renamed from: i3 */
    public static final int f76086i3 = 0;

    /* JADX INFO: renamed from: j3 */
    public static final int f76087j3 = 1;

    /* JADX INFO: renamed from: k3 */
    public static final int f76088k3 = 2;

    /* JADX INFO: renamed from: l3 */
    public static final String f76089l3 = "qw9";

    /* JADX INFO: renamed from: m3 */
    public static final String f76090m3 = "materialContainerTransition:bounds";

    /* JADX INFO: renamed from: n3 */
    public static final String f76091n3 = "materialContainerTransition:shapeAppearance";

    /* JADX INFO: renamed from: q3 */
    public static final C11732f f76094q3;

    /* JADX INFO: renamed from: s3 */
    public static final C11732f f76096s3;

    /* JADX INFO: renamed from: t3 */
    public static final float f76097t3 = -1.0f;

    /* JADX INFO: renamed from: C2 */
    public boolean f76098C2;

    /* JADX INFO: renamed from: D2 */
    public boolean f76099D2;

    /* JADX INFO: renamed from: E2 */
    public boolean f76100E2;

    /* JADX INFO: renamed from: F2 */
    public boolean f76101F2;

    /* JADX INFO: renamed from: G2 */
    @kr7
    public int f76102G2;

    /* JADX INFO: renamed from: H2 */
    @kr7
    public int f76103H2;

    /* JADX INFO: renamed from: I2 */
    @kr7
    public int f76104I2;

    /* JADX INFO: renamed from: J2 */
    @g92
    public int f76105J2;

    /* JADX INFO: renamed from: K2 */
    @g92
    public int f76106K2;

    /* JADX INFO: renamed from: L2 */
    @g92
    public int f76107L2;

    /* JADX INFO: renamed from: M2 */
    @g92
    public int f76108M2;

    /* JADX INFO: renamed from: N2 */
    public int f76109N2;

    /* JADX INFO: renamed from: O2 */
    public int f76110O2;

    /* JADX INFO: renamed from: P2 */
    public int f76111P2;

    /* JADX INFO: renamed from: Q2 */
    @hib
    public View f76112Q2;

    /* JADX INFO: renamed from: R2 */
    @hib
    public View f76113R2;

    /* JADX INFO: renamed from: S2 */
    @hib
    public n8f f76114S2;

    /* JADX INFO: renamed from: T2 */
    @hib
    public n8f f76115T2;

    /* JADX INFO: renamed from: U2 */
    @hib
    public C11731e f76116U2;

    /* JADX INFO: renamed from: V2 */
    @hib
    public C11731e f76117V2;

    /* JADX INFO: renamed from: W2 */
    @hib
    public C11731e f76118W2;

    /* JADX INFO: renamed from: X2 */
    @hib
    public C11731e f76119X2;

    /* JADX INFO: renamed from: Y2 */
    public boolean f76120Y2;

    /* JADX INFO: renamed from: Z2 */
    public float f76121Z2;

    /* JADX INFO: renamed from: a3 */
    public float f76122a3;

    /* JADX INFO: renamed from: o3 */
    public static final String[] f76092o3 = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* JADX INFO: renamed from: p3 */
    public static final C11732f f76093p3 = new C11732f(new C11731e(0.0f, 0.25f), new C11731e(0.0f, 1.0f), new C11731e(0.0f, 1.0f), new C11731e(0.0f, 0.75f), null);

    /* JADX INFO: renamed from: r3 */
    public static final C11732f f76095r3 = new C11732f(new C11731e(0.1f, 0.4f), new C11731e(0.1f, 1.0f), new C11731e(0.1f, 1.0f), new C11731e(0.1f, 0.9f), null);

    /* JADX INFO: renamed from: qw9$a */
    public class C11727a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11734h f76123a;

        public C11727a(C11734h c11734h) {
            this.f76123a = c11734h;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f76123a.setProgress(valueAnimator.getAnimatedFraction());
        }
    }

    /* JADX INFO: renamed from: qw9$b */
    public class C11728b extends jfh {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f76125a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C11734h f76126b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f76127c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ View f76128d;

        public C11728b(View view, C11734h c11734h, View view2, View view3) {
            this.f76125a = view;
            this.f76126b = c11734h;
            this.f76127c = view2;
            this.f76128d = view3;
        }

        @Override // p000.jfh, androidx.transition.AbstractC1458q.h
        public void onTransitionEnd(@efb AbstractC1458q abstractC1458q) {
            qw9.this.removeListener(this);
            if (qw9.this.f76099D2) {
                return;
            }
            this.f76127c.setAlpha(1.0f);
            this.f76128d.setAlpha(1.0f);
            cci.getOverlay(this.f76125a).remove(this.f76126b);
        }

        @Override // p000.jfh, androidx.transition.AbstractC1458q.h
        public void onTransitionStart(@efb AbstractC1458q abstractC1458q) {
            cci.getOverlay(this.f76125a).add(this.f76126b);
            this.f76127c.setAlpha(0.0f);
            this.f76128d.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: qw9$c */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC11729c {
    }

    /* JADX INFO: renamed from: qw9$d */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC11730d {
    }

    /* JADX INFO: renamed from: qw9$e */
    public static class C11731e {

        /* JADX INFO: renamed from: a */
        @y46(from = 0.0d, m25645to = 1.0d)
        public final float f76130a;

        /* JADX INFO: renamed from: b */
        @y46(from = 0.0d, m25645to = 1.0d)
        public final float f76131b;

        public C11731e(@y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2) {
            this.f76130a = f;
            this.f76131b = f2;
        }

        @y46(from = 0.0d, m25645to = 1.0d)
        public float getEnd() {
            return this.f76131b;
        }

        @y46(from = 0.0d, m25645to = 1.0d)
        public float getStart() {
            return this.f76130a;
        }
    }

    /* JADX INFO: renamed from: qw9$f */
    public static class C11732f {

        /* JADX INFO: renamed from: a */
        @efb
        public final C11731e f76132a;

        /* JADX INFO: renamed from: b */
        @efb
        public final C11731e f76133b;

        /* JADX INFO: renamed from: c */
        @efb
        public final C11731e f76134c;

        /* JADX INFO: renamed from: d */
        @efb
        public final C11731e f76135d;

        public /* synthetic */ C11732f(C11731e c11731e, C11731e c11731e2, C11731e c11731e3, C11731e c11731e4, C11727a c11727a) {
            this(c11731e, c11731e2, c11731e3, c11731e4);
        }

        private C11732f(@efb C11731e c11731e, @efb C11731e c11731e2, @efb C11731e c11731e3, @efb C11731e c11731e4) {
            this.f76132a = c11731e;
            this.f76133b = c11731e2;
            this.f76134c = c11731e3;
            this.f76135d = c11731e4;
        }
    }

    /* JADX INFO: renamed from: qw9$g */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69935b})
    public @interface InterfaceC11733g {
    }

    /* JADX INFO: renamed from: qw9$h */
    public static final class C11734h extends Drawable {

        /* JADX INFO: renamed from: M */
        public static final int f76136M = 754974720;

        /* JADX INFO: renamed from: N */
        public static final int f76137N = -7829368;

        /* JADX INFO: renamed from: O */
        public static final float f76138O = 0.3f;

        /* JADX INFO: renamed from: P */
        public static final float f76139P = 1.5f;

        /* JADX INFO: renamed from: A */
        public final C11732f f76140A;

        /* JADX INFO: renamed from: B */
        public final no5 f76141B;

        /* JADX INFO: renamed from: C */
        public final p16 f76142C;

        /* JADX INFO: renamed from: D */
        public final boolean f76143D;

        /* JADX INFO: renamed from: E */
        public final Paint f76144E;

        /* JADX INFO: renamed from: F */
        public final Path f76145F;

        /* JADX INFO: renamed from: G */
        public ro5 f76146G;

        /* JADX INFO: renamed from: H */
        public t16 f76147H;

        /* JADX INFO: renamed from: I */
        public RectF f76148I;

        /* JADX INFO: renamed from: J */
        public float f76149J;

        /* JADX INFO: renamed from: K */
        public float f76150K;

        /* JADX INFO: renamed from: L */
        public float f76151L;

        /* JADX INFO: renamed from: a */
        public final View f76152a;

        /* JADX INFO: renamed from: b */
        public final RectF f76153b;

        /* JADX INFO: renamed from: c */
        public final n8f f76154c;

        /* JADX INFO: renamed from: d */
        public final float f76155d;

        /* JADX INFO: renamed from: e */
        public final View f76156e;

        /* JADX INFO: renamed from: f */
        public final RectF f76157f;

        /* JADX INFO: renamed from: g */
        public final n8f f76158g;

        /* JADX INFO: renamed from: h */
        public final float f76159h;

        /* JADX INFO: renamed from: i */
        public final Paint f76160i;

        /* JADX INFO: renamed from: j */
        public final Paint f76161j;

        /* JADX INFO: renamed from: k */
        public final Paint f76162k;

        /* JADX INFO: renamed from: l */
        public final Paint f76163l;

        /* JADX INFO: renamed from: m */
        public final Paint f76164m;

        /* JADX INFO: renamed from: n */
        public final hv9 f76165n;

        /* JADX INFO: renamed from: o */
        public final PathMeasure f76166o;

        /* JADX INFO: renamed from: p */
        public final float f76167p;

        /* JADX INFO: renamed from: q */
        public final float[] f76168q;

        /* JADX INFO: renamed from: r */
        public final boolean f76169r;

        /* JADX INFO: renamed from: s */
        public final float f76170s;

        /* JADX INFO: renamed from: t */
        public final float f76171t;

        /* JADX INFO: renamed from: u */
        public final boolean f76172u;

        /* JADX INFO: renamed from: v */
        public final b3a f76173v;

        /* JADX INFO: renamed from: w */
        public final RectF f76174w;

        /* JADX INFO: renamed from: x */
        public final RectF f76175x;

        /* JADX INFO: renamed from: y */
        public final RectF f76176y;

        /* JADX INFO: renamed from: z */
        public final RectF f76177z;

        /* JADX INFO: renamed from: qw9$h$a */
        public class a implements wq1.InterfaceC14743a {
            public a() {
            }

            @Override // p000.wq1.InterfaceC14743a
            public void run(Canvas canvas) {
                C11734h.this.f76152a.draw(canvas);
            }
        }

        /* JADX INFO: renamed from: qw9$h$b */
        public class b implements wq1.InterfaceC14743a {
            public b() {
            }

            @Override // p000.wq1.InterfaceC14743a
            public void run(Canvas canvas) {
                C11734h.this.f76156e.draw(canvas);
            }
        }

        public /* synthetic */ C11734h(pjc pjcVar, View view, RectF rectF, n8f n8fVar, float f, View view2, RectF rectF2, n8f n8fVar2, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, no5 no5Var, p16 p16Var, C11732f c11732f, boolean z3, C11727a c11727a) {
            this(pjcVar, view, rectF, n8fVar, f, view2, rectF2, n8fVar2, f2, i, i2, i3, i4, z, z2, no5Var, p16Var, c11732f, z3);
        }

        private static float calculateElevationDxMultiplier(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        private static float calculateElevationDyMultiplier(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        private void drawDebugCumulativePath(Canvas canvas, RectF rectF, Path path, @g92 int i) {
            PointF motionPathPoint = getMotionPathPoint(rectF);
            if (this.f76151L == 0.0f) {
                path.reset();
                path.moveTo(motionPathPoint.x, motionPathPoint.y);
            } else {
                path.lineTo(motionPathPoint.x, motionPathPoint.y);
                this.f76144E.setColor(i);
                canvas.drawPath(path, this.f76144E);
            }
        }

        private void drawDebugRect(Canvas canvas, RectF rectF, @g92 int i) {
            this.f76144E.setColor(i);
            canvas.drawRect(rectF, this.f76144E);
        }

        private void drawElevationShadow(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f76165n.m12616d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                drawElevationShadowWithPaintShadowLayer(canvas);
            } else {
                drawElevationShadowWithMaterialShapeDrawable(canvas);
            }
            canvas.restore();
        }

        private void drawElevationShadowWithMaterialShapeDrawable(Canvas canvas) {
            b3a b3aVar = this.f76173v;
            RectF rectF = this.f76148I;
            b3aVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f76173v.setElevation(this.f76149J);
            this.f76173v.setShadowVerticalOffset((int) this.f76150K);
            this.f76173v.setShapeAppearanceModel(this.f76165n.m12615c());
            this.f76173v.draw(canvas);
        }

        private void drawElevationShadowWithPaintShadowLayer(Canvas canvas) {
            n8f n8fVarM12615c = this.f76165n.m12615c();
            if (!n8fVarM12615c.isRoundRect(this.f76148I)) {
                canvas.drawPath(this.f76165n.m12616d(), this.f76163l);
            } else {
                float cornerSize = n8fVarM12615c.getTopLeftCornerSize().getCornerSize(this.f76148I);
                canvas.drawRoundRect(this.f76148I, cornerSize, cornerSize, this.f76163l);
            }
        }

        private void drawEndView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.f76162k);
            Rect bounds = getBounds();
            RectF rectF = this.f76176y;
            rfh.m21285v(canvas, bounds, rectF.left, rectF.top, this.f76147H.f83348b, this.f76146G.f78861b, new b());
        }

        private void drawStartView(Canvas canvas) {
            maybeDrawContainerColor(canvas, this.f76161j);
            Rect bounds = getBounds();
            RectF rectF = this.f76174w;
            rfh.m21285v(canvas, bounds, rectF.left, rectF.top, this.f76147H.f83347a, this.f76146G.f78860a, new a());
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
            if (this.f76151L != f) {
                updateProgress(f);
            }
        }

        private void updateProgress(float f) {
            float f2;
            float f3;
            this.f76151L = f;
            this.f76164m.setAlpha((int) (this.f76169r ? rfh.m21274k(0.0f, 255.0f, f) : rfh.m21274k(255.0f, 0.0f, f)));
            this.f76166o.getPosTan(this.f76167p * f, this.f76168q, null);
            float[] fArr = this.f76168q;
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
                this.f76166o.getPosTan(this.f76167p * f2, fArr, null);
                float[] fArr2 = this.f76168q;
                f4 += (f4 - fArr2[0]) * f3;
                f5 += (f5 - fArr2[1]) * f3;
            }
            float f6 = f4;
            float f7 = f5;
            t16 t16VarEvaluate = this.f76142C.evaluate(f, ((Float) z7d.checkNotNull(Float.valueOf(this.f76140A.f76133b.f76130a))).floatValue(), ((Float) z7d.checkNotNull(Float.valueOf(this.f76140A.f76133b.f76131b))).floatValue(), this.f76153b.width(), this.f76153b.height(), this.f76157f.width(), this.f76157f.height());
            this.f76147H = t16VarEvaluate;
            RectF rectF = this.f76174w;
            float f8 = t16VarEvaluate.f83349c;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, t16VarEvaluate.f83350d + f7);
            RectF rectF2 = this.f76176y;
            t16 t16Var = this.f76147H;
            float f9 = t16Var.f83351e;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), t16Var.f83352f + f7);
            this.f76175x.set(this.f76174w);
            this.f76177z.set(this.f76176y);
            float fFloatValue = ((Float) z7d.checkNotNull(Float.valueOf(this.f76140A.f76134c.f76130a))).floatValue();
            float fFloatValue2 = ((Float) z7d.checkNotNull(Float.valueOf(this.f76140A.f76134c.f76131b))).floatValue();
            boolean zShouldMaskStartBounds = this.f76142C.shouldMaskStartBounds(this.f76147H);
            RectF rectF3 = zShouldMaskStartBounds ? this.f76175x : this.f76177z;
            float fM21275l = rfh.m21275l(0.0f, 1.0f, fFloatValue, fFloatValue2, f);
            if (!zShouldMaskStartBounds) {
                fM21275l = 1.0f - fM21275l;
            }
            this.f76142C.applyMask(rectF3, fM21275l, this.f76147H);
            this.f76148I = new RectF(Math.min(this.f76175x.left, this.f76177z.left), Math.min(this.f76175x.top, this.f76177z.top), Math.max(this.f76175x.right, this.f76177z.right), Math.max(this.f76175x.bottom, this.f76177z.bottom));
            this.f76165n.m12614b(f, this.f76154c, this.f76158g, this.f76174w, this.f76175x, this.f76177z, this.f76140A.f76135d);
            this.f76149J = rfh.m21274k(this.f76155d, this.f76159h, f);
            float fCalculateElevationDxMultiplier = calculateElevationDxMultiplier(this.f76148I, this.f76170s);
            float fCalculateElevationDyMultiplier = calculateElevationDyMultiplier(this.f76148I, this.f76171t);
            float f10 = this.f76149J;
            float f11 = (int) (fCalculateElevationDyMultiplier * f10);
            this.f76150K = f11;
            this.f76163l.setShadowLayer(f10, (int) (fCalculateElevationDxMultiplier * f10), f11, 754974720);
            this.f76146G = this.f76141B.evaluate(f, ((Float) z7d.checkNotNull(Float.valueOf(this.f76140A.f76132a.f76130a))).floatValue(), ((Float) z7d.checkNotNull(Float.valueOf(this.f76140A.f76132a.f76131b))).floatValue(), 0.35f);
            if (this.f76161j.getColor() != 0) {
                this.f76161j.setAlpha(this.f76146G.f78860a);
            }
            if (this.f76162k.getColor() != 0) {
                this.f76162k.setAlpha(this.f76146G.f78861b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@efb Canvas canvas) {
            if (this.f76164m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f76164m);
            }
            int iSave = this.f76143D ? canvas.save() : -1;
            if (this.f76172u && this.f76149J > 0.0f) {
                drawElevationShadow(canvas);
            }
            this.f76165n.m12613a(canvas);
            maybeDrawContainerColor(canvas, this.f76160i);
            if (this.f76146G.f78862c) {
                drawStartView(canvas);
                drawEndView(canvas);
            } else {
                drawEndView(canvas);
                drawStartView(canvas);
            }
            if (this.f76143D) {
                canvas.restoreToCount(iSave);
                drawDebugCumulativePath(canvas, this.f76174w, this.f76145F, -65281);
                drawDebugRect(canvas, this.f76175x, -256);
                drawDebugRect(canvas, this.f76174w, -16711936);
                drawDebugRect(canvas, this.f76177z, -16711681);
                drawDebugRect(canvas, this.f76176y, -16776961);
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

        private C11734h(pjc pjcVar, View view, RectF rectF, n8f n8fVar, float f, View view2, RectF rectF2, n8f n8fVar2, float f2, @g92 int i, @g92 int i2, @g92 int i3, int i4, boolean z, boolean z2, no5 no5Var, p16 p16Var, C11732f c11732f, boolean z3) {
            Paint paint = new Paint();
            this.f76160i = paint;
            Paint paint2 = new Paint();
            this.f76161j = paint2;
            Paint paint3 = new Paint();
            this.f76162k = paint3;
            this.f76163l = new Paint();
            Paint paint4 = new Paint();
            this.f76164m = paint4;
            this.f76165n = new hv9();
            this.f76168q = new float[]{rectF.centerX(), rectF.top};
            b3a b3aVar = new b3a();
            this.f76173v = b3aVar;
            Paint paint5 = new Paint();
            this.f76144E = paint5;
            this.f76145F = new Path();
            this.f76152a = view;
            this.f76153b = rectF;
            this.f76154c = n8fVar;
            this.f76155d = f;
            this.f76156e = view2;
            this.f76157f = rectF2;
            this.f76158g = n8fVar2;
            this.f76159h = f2;
            this.f76169r = z;
            this.f76172u = z2;
            this.f76141B = no5Var;
            this.f76142C = p16Var;
            this.f76140A = c11732f;
            this.f76143D = z3;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f76170s = r12.widthPixels;
            this.f76171t = r12.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            b3aVar.setFillColor(ColorStateList.valueOf(0));
            b3aVar.setShadowCompatibilityMode(2);
            b3aVar.setShadowBitmapDrawingEnable(false);
            b3aVar.setShadowColor(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f76174w = rectF3;
            this.f76175x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f76176y = rectF4;
            this.f76177z = new RectF(rectF4);
            PointF motionPathPoint = getMotionPathPoint(rectF);
            PointF motionPathPoint2 = getMotionPathPoint(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pjcVar.getPath(motionPathPoint.x, motionPathPoint.y, motionPathPoint2.x, motionPathPoint2.y), false);
            this.f76166o = pathMeasure;
            this.f76167p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(rfh.m21267d(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            updateProgress(0.0f);
        }
    }

    static {
        C11727a c11727a = null;
        f76094q3 = new C11732f(new C11731e(0.6f, 0.9f), new C11731e(0.0f, 1.0f), new C11731e(0.0f, 0.9f), new C11731e(0.3f, 0.9f), c11727a);
        f76096s3 = new C11732f(new C11731e(0.6f, 0.9f), new C11731e(0.0f, 0.9f), new C11731e(0.0f, 0.9f), new C11731e(0.2f, 0.9f), c11727a);
    }

    public qw9() {
        this.f76098C2 = false;
        this.f76099D2 = false;
        this.f76100E2 = false;
        this.f76101F2 = false;
        this.f76102G2 = R.id.content;
        this.f76103H2 = -1;
        this.f76104I2 = -1;
        this.f76105J2 = 0;
        this.f76106K2 = 0;
        this.f76107L2 = 0;
        this.f76108M2 = 1375731712;
        this.f76109N2 = 0;
        this.f76110O2 = 0;
        this.f76111P2 = 0;
        this.f76120Y2 = Build.VERSION.SDK_INT >= 28;
        this.f76121Z2 = -1.0f;
        this.f76122a3 = -1.0f;
    }

    private C11732f buildThresholdsGroup(boolean z) {
        pjc pathMotion = getPathMotion();
        return ((pathMotion instanceof C1443b) || (pathMotion instanceof gw9)) ? getThresholdsOrDefault(z, f76095r3, f76096s3) : getThresholdsOrDefault(z, f76093p3, f76094q3);
    }

    private static RectF calculateDrawableBounds(View view, @hib View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFM21271h = rfh.m21271h(view2);
        rectFM21271h.offset(f, f2);
        return rectFM21271h;
    }

    private static n8f captureShapeAppearance(@efb View view, @efb RectF rectF, @hib n8f n8fVar) {
        return rfh.m21266c(getShapeAppearance(view, n8fVar), rectF);
    }

    private static void captureValues(@efb sfh sfhVar, @hib View view, @kr7 int i, @hib n8f n8fVar) {
        if (i != -1) {
            sfhVar.f81693b = rfh.m21270g(sfhVar.f81693b, i);
        } else if (view != null) {
            sfhVar.f81693b = view;
        } else if (sfhVar.f81693b.getTag(C3146R.id.mtrl_motion_snapshot_view) instanceof View) {
            View view2 = (View) sfhVar.f81693b.getTag(C3146R.id.mtrl_motion_snapshot_view);
            sfhVar.f81693b.setTag(C3146R.id.mtrl_motion_snapshot_view, null);
            sfhVar.f81693b = view2;
        }
        View view3 = sfhVar.f81693b;
        if (!o8i.isLaidOut(view3) && view3.getWidth() == 0 && view3.getHeight() == 0) {
            return;
        }
        RectF rectFM21272i = view3.getParent() == null ? rfh.m21272i(view3) : rfh.m21271h(view3);
        sfhVar.f81692a.put("materialContainerTransition:bounds", rectFM21272i);
        sfhVar.f81692a.put("materialContainerTransition:shapeAppearance", captureShapeAppearance(view3, rectFM21272i, n8fVar));
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

    private C11732f getThresholdsOrDefault(boolean z, C11732f c11732f, C11732f c11732f2) {
        if (!z) {
            c11732f = c11732f2;
        }
        return new C11732f((C11731e) rfh.m21268e(this.f76116U2, c11732f.f76132a), (C11731e) rfh.m21268e(this.f76117V2, c11732f.f76133b), (C11731e) rfh.m21268e(this.f76118W2, c11732f.f76134c), (C11731e) rfh.m21268e(this.f76119X2, c11732f.f76135d), null);
    }

    @dbg
    private static int getTransitionShapeAppearanceResId(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{C3146R.attr.transitionShapeAppearance});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private boolean isEntering(@efb RectF rectF, @efb RectF rectF2) {
        int i = this.f76109N2;
        if (i == 0) {
            return rfh.m21265b(rectF2) > rfh.m21265b(rectF);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f76109N2);
    }

    private void maybeApplyThemeValues(Context context, boolean z) {
        rfh.m21281r(this, context, C3146R.attr.motionEasingEmphasizedInterpolator, C13280ty.f86290b);
        rfh.m21280q(this, context, z ? C3146R.attr.motionDurationLong2 : C3146R.attr.motionDurationMedium4);
        if (this.f76100E2) {
            return;
        }
        rfh.m21282s(this, context, C3146R.attr.motionPath);
    }

    @Override // androidx.transition.AbstractC1458q
    public void captureEndValues(@efb sfh sfhVar) {
        captureValues(sfhVar, this.f76113R2, this.f76104I2, this.f76115T2);
    }

    @Override // androidx.transition.AbstractC1458q
    public void captureStartValues(@efb sfh sfhVar) {
        captureValues(sfhVar, this.f76112Q2, this.f76103H2, this.f76114S2);
    }

    @Override // androidx.transition.AbstractC1458q
    @hib
    public Animator createAnimator(@efb ViewGroup viewGroup, @hib sfh sfhVar, @hib sfh sfhVar2) {
        View viewM21269f;
        View view;
        if (sfhVar != null && sfhVar2 != null) {
            RectF rectF = (RectF) sfhVar.f81692a.get("materialContainerTransition:bounds");
            n8f n8fVar = (n8f) sfhVar.f81692a.get("materialContainerTransition:shapeAppearance");
            if (rectF != null && n8fVar != null) {
                RectF rectF2 = (RectF) sfhVar2.f81692a.get("materialContainerTransition:bounds");
                n8f n8fVar2 = (n8f) sfhVar2.f81692a.get("materialContainerTransition:shapeAppearance");
                if (rectF2 == null || n8fVar2 == null) {
                    Log.w(f76089l3, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view2 = sfhVar.f81693b;
                View view3 = sfhVar2.f81693b;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f76102G2 == view4.getId()) {
                    viewM21269f = (View) view4.getParent();
                    view = view4;
                } else {
                    viewM21269f = rfh.m21269f(view4, this.f76102G2);
                    view = null;
                }
                RectF rectFM21271h = rfh.m21271h(viewM21269f);
                float f = -rectFM21271h.left;
                float f2 = -rectFM21271h.top;
                RectF rectFCalculateDrawableBounds = calculateDrawableBounds(viewM21269f, view, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean zIsEntering = isEntering(rectF, rectF2);
                if (!this.f76101F2) {
                    maybeApplyThemeValues(view4.getContext(), zIsEntering);
                }
                C11734h c11734h = new C11734h(getPathMotion(), view2, rectF, n8fVar, getElevationOrDefault(this.f76121Z2, view2), view3, rectF2, n8fVar2, getElevationOrDefault(this.f76122a3, view3), this.f76105J2, this.f76106K2, this.f76107L2, this.f76108M2, zIsEntering, this.f76120Y2, oo5.m18799a(this.f76110O2, zIsEntering), q16.m19987a(this.f76111P2, zIsEntering, rectF, rectF2), buildThresholdsGroup(zIsEntering), this.f76098C2, null);
                c11734h.setBounds(Math.round(rectFCalculateDrawableBounds.left), Math.round(rectFCalculateDrawableBounds.top), Math.round(rectFCalculateDrawableBounds.right), Math.round(rectFCalculateDrawableBounds.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new C11727a(c11734h));
                addListener(new C11728b(viewM21269f, c11734h, view2, view3));
                return valueAnimatorOfFloat;
            }
            Log.w(f76089l3, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @g92
    public int getContainerColor() {
        return this.f76105J2;
    }

    @kr7
    public int getDrawingViewId() {
        return this.f76102G2;
    }

    @g92
    public int getEndContainerColor() {
        return this.f76107L2;
    }

    public float getEndElevation() {
        return this.f76122a3;
    }

    @hib
    public n8f getEndShapeAppearanceModel() {
        return this.f76115T2;
    }

    @hib
    public View getEndView() {
        return this.f76113R2;
    }

    @kr7
    public int getEndViewId() {
        return this.f76104I2;
    }

    public int getFadeMode() {
        return this.f76110O2;
    }

    @hib
    public C11731e getFadeProgressThresholds() {
        return this.f76116U2;
    }

    public int getFitMode() {
        return this.f76111P2;
    }

    @hib
    public C11731e getScaleMaskProgressThresholds() {
        return this.f76118W2;
    }

    @hib
    public C11731e getScaleProgressThresholds() {
        return this.f76117V2;
    }

    @g92
    public int getScrimColor() {
        return this.f76108M2;
    }

    @hib
    public C11731e getShapeMaskProgressThresholds() {
        return this.f76119X2;
    }

    @g92
    public int getStartContainerColor() {
        return this.f76106K2;
    }

    public float getStartElevation() {
        return this.f76121Z2;
    }

    @hib
    public n8f getStartShapeAppearanceModel() {
        return this.f76114S2;
    }

    @hib
    public View getStartView() {
        return this.f76112Q2;
    }

    @kr7
    public int getStartViewId() {
        return this.f76103H2;
    }

    public int getTransitionDirection() {
        return this.f76109N2;
    }

    @Override // androidx.transition.AbstractC1458q
    @hib
    public String[] getTransitionProperties() {
        return f76092o3;
    }

    public boolean isDrawDebugEnabled() {
        return this.f76098C2;
    }

    public boolean isElevationShadowEnabled() {
        return this.f76120Y2;
    }

    public boolean isHoldAtEndEnabled() {
        return this.f76099D2;
    }

    public void setAllContainerColors(@g92 int i) {
        this.f76105J2 = i;
        this.f76106K2 = i;
        this.f76107L2 = i;
    }

    public void setContainerColor(@g92 int i) {
        this.f76105J2 = i;
    }

    public void setDrawDebugEnabled(boolean z) {
        this.f76098C2 = z;
    }

    public void setDrawingViewId(@kr7 int i) {
        this.f76102G2 = i;
    }

    public void setElevationShadowEnabled(boolean z) {
        this.f76120Y2 = z;
    }

    public void setEndContainerColor(@g92 int i) {
        this.f76107L2 = i;
    }

    public void setEndElevation(float f) {
        this.f76122a3 = f;
    }

    public void setEndShapeAppearanceModel(@hib n8f n8fVar) {
        this.f76115T2 = n8fVar;
    }

    public void setEndView(@hib View view) {
        this.f76113R2 = view;
    }

    public void setEndViewId(@kr7 int i) {
        this.f76104I2 = i;
    }

    public void setFadeMode(int i) {
        this.f76110O2 = i;
    }

    public void setFadeProgressThresholds(@hib C11731e c11731e) {
        this.f76116U2 = c11731e;
    }

    public void setFitMode(int i) {
        this.f76111P2 = i;
    }

    public void setHoldAtEndEnabled(boolean z) {
        this.f76099D2 = z;
    }

    @Override // androidx.transition.AbstractC1458q
    public void setPathMotion(@hib pjc pjcVar) {
        super.setPathMotion(pjcVar);
        this.f76100E2 = true;
    }

    public void setScaleMaskProgressThresholds(@hib C11731e c11731e) {
        this.f76118W2 = c11731e;
    }

    public void setScaleProgressThresholds(@hib C11731e c11731e) {
        this.f76117V2 = c11731e;
    }

    public void setScrimColor(@g92 int i) {
        this.f76108M2 = i;
    }

    public void setShapeMaskProgressThresholds(@hib C11731e c11731e) {
        this.f76119X2 = c11731e;
    }

    public void setStartContainerColor(@g92 int i) {
        this.f76106K2 = i;
    }

    public void setStartElevation(float f) {
        this.f76121Z2 = f;
    }

    public void setStartShapeAppearanceModel(@hib n8f n8fVar) {
        this.f76114S2 = n8fVar;
    }

    public void setStartView(@hib View view) {
        this.f76112Q2 = view;
    }

    public void setStartViewId(@kr7 int i) {
        this.f76103H2 = i;
    }

    public void setTransitionDirection(int i) {
        this.f76109N2 = i;
    }

    public qw9(@efb Context context, boolean z) {
        this.f76098C2 = false;
        this.f76099D2 = false;
        this.f76100E2 = false;
        this.f76101F2 = false;
        this.f76102G2 = R.id.content;
        this.f76103H2 = -1;
        this.f76104I2 = -1;
        this.f76105J2 = 0;
        this.f76106K2 = 0;
        this.f76107L2 = 0;
        this.f76108M2 = 1375731712;
        this.f76109N2 = 0;
        this.f76110O2 = 0;
        this.f76111P2 = 0;
        this.f76120Y2 = Build.VERSION.SDK_INT >= 28;
        this.f76121Z2 = -1.0f;
        this.f76122a3 = -1.0f;
        maybeApplyThemeValues(context, z);
        this.f76101F2 = true;
    }
}
