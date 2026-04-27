package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.transition.AbstractC1458q;
import androidx.transition.C1454m;
import androidx.transition.C1462v;
import p000.n8f;
import p000.wq1;

/* JADX INFO: loaded from: classes5.dex */
public class rfh {

    /* JADX INFO: renamed from: a */
    public static final int f78173a = -1;

    /* JADX INFO: renamed from: b */
    @gc0
    public static final int f78174b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f78175c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f78176d = 1;

    /* JADX INFO: renamed from: e */
    public static final RectF f78177e = new RectF();

    /* JADX INFO: renamed from: rfh$a */
    public class C12065a implements InterfaceC12066b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RectF f78178a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RectF f78179b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f78180c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f78181d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f78182e;

        public C12065a(RectF rectF, RectF rectF2, float f, float f2, float f3) {
            this.f78178a = rectF;
            this.f78179b = rectF2;
            this.f78180c = f;
            this.f78181d = f2;
            this.f78182e = f3;
        }

        @Override // p000.rfh.InterfaceC12066b
        @efb
        public x03 apply(@efb x03 x03Var, @efb x03 x03Var2) {
            return new C12380s(rfh.m21275l(x03Var.getCornerSize(this.f78178a), x03Var2.getCornerSize(this.f78179b), this.f78180c, this.f78181d, this.f78182e));
        }
    }

    /* JADX INFO: renamed from: rfh$b */
    public interface InterfaceC12066b {
        @efb
        x03 apply(@efb x03 x03Var, @efb x03 x03Var2);
    }

    private rfh() {
    }

    /* JADX INFO: renamed from: b */
    public static float m21265b(@efb RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* JADX INFO: renamed from: c */
    public static n8f m21266c(n8f n8fVar, final RectF rectF) {
        return n8fVar.withTransformedCornerSizes(new n8f.InterfaceC9746c() { // from class: pfh
            @Override // p000.n8f.InterfaceC9746c
            public final x03 apply(x03 x03Var) {
                return uxd.createFromCornerSize(rectF, x03Var);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static Shader m21267d(@g92 int i) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i, i, Shader.TileMode.CLAMP);
    }

    @efb
    /* JADX INFO: renamed from: e */
    public static <T> T m21268e(@hib T t, @efb T t2) {
        return t != null ? t : t2;
    }

    /* JADX INFO: renamed from: f */
    public static View m21269f(View view, @kr7 int i) {
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
    public static View m21270g(View view, @kr7 int i) {
        View viewFindViewById = view.findViewById(i);
        return viewFindViewById != null ? viewFindViewById : m21269f(view, i);
    }

    /* JADX INFO: renamed from: h */
    public static RectF m21271h(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    /* JADX INFO: renamed from: i */
    public static RectF m21272i(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    private static boolean isShapeAppearanceSignificant(n8f n8fVar, RectF rectF) {
        return (n8fVar.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && n8fVar.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && n8fVar.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && n8fVar.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static Rect m21273j(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: renamed from: k */
    public static float m21274k(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX INFO: renamed from: l */
    public static float m21275l(float f, float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3, @y46(from = 0.0d, m25645to = 1.0d) float f4, @y46(from = 0.0d, m25645to = 1.0d) float f5) {
        return m21276m(f, f2, f3, f4, f5, false);
    }

    /* JADX INFO: renamed from: m */
    public static float m21276m(float f, float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3, @y46(from = 0.0d, m25645to = 1.0d) float f4, @y46(from = 0.0d) float f5, boolean z) {
        return (!z || (f5 >= 0.0f && f5 <= 1.0f)) ? f5 < f3 ? f : f5 > f4 ? f2 : m21274k(f, f2, (f5 - f3) / (f4 - f3)) : m21274k(f, f2, f5);
    }

    /* JADX INFO: renamed from: n */
    public static int m21277n(int i, int i2, @y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3) {
        return f3 < f ? i : f3 > f2 ? i2 : (int) m21274k(i, i2, (f3 - f) / (f2 - f));
    }

    /* JADX INFO: renamed from: o */
    public static n8f m21278o(n8f n8fVar, n8f n8fVar2, RectF rectF, RectF rectF2, @y46(from = 0.0d, m25645to = 1.0d) float f, @y46(from = 0.0d, m25645to = 1.0d) float f2, @y46(from = 0.0d, m25645to = 1.0d) float f3) {
        return f3 < f ? n8fVar : f3 > f2 ? n8fVar2 : m21286w(n8fVar, n8fVar2, rectF, new C12065a(rectF, rectF2, f, f2, f3));
    }

    /* JADX INFO: renamed from: p */
    public static void m21279p(C1462v c1462v, @hib AbstractC1458q abstractC1458q) {
        if (abstractC1458q != null) {
            c1462v.addTransition(abstractC1458q);
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m21280q(AbstractC1458q abstractC1458q, Context context, @gc0 int i) {
        int iResolveThemeDuration;
        if (i == 0 || abstractC1458q.getDuration() != -1 || (iResolveThemeDuration = c0b.resolveThemeDuration(context, i, -1)) == -1) {
            return false;
        }
        abstractC1458q.setDuration(iResolveThemeDuration);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m21281r(AbstractC1458q abstractC1458q, Context context, @gc0 int i, TimeInterpolator timeInterpolator) {
        if (i == 0 || abstractC1458q.getInterpolator() != null) {
            return false;
        }
        abstractC1458q.setInterpolator(c0b.resolveThemeInterpolator(context, i, timeInterpolator));
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m21282s(AbstractC1458q abstractC1458q, Context context, @gc0 int i) {
        pjc pjcVarM21284u;
        if (i == 0 || (pjcVarM21284u = m21284u(context, i)) == null) {
            return false;
        }
        abstractC1458q.setPathMotion(pjcVarM21284u);
        return true;
    }

    private static int saveLayerAlphaCompat(Canvas canvas, Rect rect, int i) {
        RectF rectF = f78177e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i);
    }

    /* JADX INFO: renamed from: t */
    public static void m21283t(C1462v c1462v, @hib AbstractC1458q abstractC1458q) {
        if (abstractC1458q != null) {
            c1462v.removeTransition(abstractC1458q);
        }
    }

    @hib
    /* JADX INFO: renamed from: u */
    public static pjc m21284u(Context context, @gc0 int i) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.type;
        if (i2 != 16) {
            if (i2 == 3) {
                return new C1454m(vjc.createPathFromPathData(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
        int i3 = typedValue.data;
        if (i3 == 0) {
            return null;
        }
        if (i3 == 1) {
            return new gw9();
        }
        throw new IllegalArgumentException("Invalid motion path type: " + i3);
    }

    /* JADX INFO: renamed from: v */
    public static void m21285v(Canvas canvas, Rect rect, float f, float f2, float f3, int i, wq1.InterfaceC14743a interfaceC14743a) {
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
    public static n8f m21286w(n8f n8fVar, n8f n8fVar2, RectF rectF, InterfaceC12066b interfaceC12066b) {
        return (isShapeAppearanceSignificant(n8fVar, rectF) ? n8fVar : n8fVar2).toBuilder().setTopLeftCornerSize(interfaceC12066b.apply(n8fVar.getTopLeftCornerSize(), n8fVar2.getTopLeftCornerSize())).setTopRightCornerSize(interfaceC12066b.apply(n8fVar.getTopRightCornerSize(), n8fVar2.getTopRightCornerSize())).setBottomLeftCornerSize(interfaceC12066b.apply(n8fVar.getBottomLeftCornerSize(), n8fVar2.getBottomLeftCornerSize())).setBottomRightCornerSize(interfaceC12066b.apply(n8fVar.getBottomRightCornerSize(), n8fVar2.getBottomRightCornerSize())).build();
    }
}
