package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.transition.PathMotion;
import android.transition.PatternPathMotion;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.TypedValue;
import android.view.View;
import p000.n8f;
import p000.wq1;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public class qfh {

    /* JADX INFO: renamed from: a */
    public static final int f74317a = -1;

    /* JADX INFO: renamed from: b */
    @gc0
    public static final int f74318b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f74319c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f74320d = 1;

    /* JADX INFO: renamed from: e */
    public static final RectF f74321e = new RectF();

    /* JADX INFO: renamed from: qfh$a */
    public class C11470a implements InterfaceC11471b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RectF f74322a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RectF f74323b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f74324c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f74325d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f74326e;

        public C11470a(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.f74322a = rectF;
            this.f74323b = rectF2;
            this.f74324c = f;
            this.f74325d = f2;
            this.f74326e = f3;
        }

        @Override // p000.qfh.InterfaceC11471b
        @efb
        public x03 apply(@efb x03 x03Var, @efb x03 x03Var2) {
            return new C12380s(qfh.m20341l(x03Var.getCornerSize(this.f74322a), x03Var2.getCornerSize(this.f74323b), this.f74324c, this.f74325d, this.f74326e));
        }
    }

    /* JADX INFO: renamed from: qfh$b */
    public interface InterfaceC11471b {
        @efb
        x03 apply(@efb x03 x03Var, @efb x03 x03Var2);
    }

    private qfh() {
    }

    /* JADX INFO: renamed from: b */
    public static float m20331b(@efb RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* JADX INFO: renamed from: c */
    public static n8f m20332c(n8f n8fVar, final RectF rectF) {
        return n8fVar.withTransformedCornerSizes(new n8f.InterfaceC9746c() { // from class: ofh
            @Override // p000.n8f.InterfaceC9746c
            public final x03 apply(x03 x03Var) {
                return uxd.createFromCornerSize(rectF, x03Var);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static Shader m20333d(@g92 int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    @efb
    /* JADX INFO: renamed from: e */
    public static <T> T m20334e(@hib T t, @efb T t2) {
        return t != null ? t : t2;
    }

    /* JADX INFO: renamed from: f */
    public static View m20335f(View view, @kr7 int i) {
        String resourceName = view.getResources().getResourceName(i);
        while (view != null) {
            if (view.getId() != i) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    /* JADX INFO: renamed from: g */
    public static View m20336g(View view, @kr7 int i) {
        View viewFindViewById = view.findViewById(i);
        return viewFindViewById != null ? viewFindViewById : m20335f(view, i);
    }

    /* JADX INFO: renamed from: h */
    public static RectF m20337h(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    /* JADX INFO: renamed from: i */
    public static RectF m20338i(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean isShapeAppearanceSignificant(n8f n8fVar, RectF rectF) {
        return (n8fVar.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && n8fVar.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && n8fVar.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && n8fVar.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static Rect m20339j(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: renamed from: k */
    public static float m20340k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX INFO: renamed from: l */
    public static float m20341l(float f, float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3, @y46(from = 0.0d, m25645to = 1.0d) float f4, @y46(from = 0.0d, m25645to = 1.0d) float f5) {
        return m20342m(f, f2, f3, f4, f5, false);
    }

    /* JADX INFO: renamed from: m */
    public static float m20342m(float f, float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3, @y46(from = 0.0d, m25645to = 1.0d) float f4, @y46(from = 0.0d) float f5, boolean z) {
        return (!z || (f5 >= 0.0f && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : m20340k(f, f2, (f5 - f3) / (f4 - f3)) : m20340k(f, f2, f5);
    }

    /* JADX INFO: renamed from: n */
    public static int m20343n(int i, int i2, @y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) m20340k(i, i2, (f3 - f) / (f2 - f));
    }

    /* JADX INFO: renamed from: o */
    public static n8f m20344o(n8f n8fVar, n8f n8fVar2, RectF rectF, RectF rectF2, @y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3) {
        return f3 < f ? n8fVar : f3 > f2 ? n8fVar2 : m20352w(n8fVar, n8fVar2, rectF, new C11470a(rectF, rectF2, f, f2, f3));
    }

    /* JADX INFO: renamed from: p */
    public static void m20345p(TransitionSet transitionSet, @hib Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m20346q(Transition transition, Context context, @gc0 int i) {
        int iResolveThemeDuration;
        if (i == 0 || transition.getDuration() != -1 || (iResolveThemeDuration = c0b.resolveThemeDuration(context, i, -1)) == -1) {
            return false;
        }
        transition.setDuration(iResolveThemeDuration);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m20347r(Transition transition, Context context, @gc0 int i, TimeInterpolator timeInterpolator) {
        if (i == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(c0b.resolveThemeInterpolator(context, i, timeInterpolator));
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m20348s(Transition transition, Context context, @gc0 int i) {
        PathMotion pathMotionM20350u;
        if (i == 0 || (pathMotionM20350u = m20350u(context, i)) == null) {
            return false;
        }
        transition.setPathMotion(pathMotionM20350u);
        return true;
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i) {
        RectF rectF = f74321e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    /* JADX INFO: renamed from: t */
    public static void m20349t(TransitionSet transitionSet, @hib Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    @hib
    /* JADX INFO: renamed from: u */
    public static PathMotion m20350u(Context context, @gc0 int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.type;
        if (i2 != 16) {
            if (i2 == 3) {
                return new PatternPathMotion(vjc.createPathFromPathData(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
        int i3 = typedValue.data;
        if (i3 == 0) {
            return null;
        }
        if (i3 == 1) {
            return new fw9();
        }
        throw new IllegalArgumentException("Invalid motion path type: " + i3);
    }

    /* JADX INFO: renamed from: v */
    public static void m20351v(Canvas canvas, Rect rect, float f, float f2, float f3, int i, wq1.InterfaceC14743a interfaceC14743a) {
        if (i <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            saveLayerAlphaCompat(canvas, rect, i);
        }
        interfaceC14743a.run(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: w */
    public static n8f m20352w(n8f n8fVar, n8f n8fVar2, RectF rectF, InterfaceC11471b interfaceC11471b) {
        return (isShapeAppearanceSignificant(n8fVar, rectF) ? n8fVar : n8fVar2).toBuilder().setTopLeftCornerSize(interfaceC11471b.apply(n8fVar.getTopLeftCornerSize(), n8fVar2.getTopLeftCornerSize())).setTopRightCornerSize(interfaceC11471b.apply(n8fVar.getTopRightCornerSize(), n8fVar2.getTopRightCornerSize())).setBottomLeftCornerSize(interfaceC11471b.apply(n8fVar.getBottomLeftCornerSize(), n8fVar2.getBottomLeftCornerSize())).setBottomRightCornerSize(interfaceC11471b.apply(n8fVar.getBottomRightCornerSize(), n8fVar2.getBottomRightCornerSize())).build();
    }
}
