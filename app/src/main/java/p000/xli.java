package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.C0915R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p000.p7e;
import p000.smi;

/* JADX INFO: loaded from: classes3.dex */
public final class xli {

    /* JADX INFO: renamed from: b */
    public static final boolean f98445b = false;

    /* JADX INFO: renamed from: c */
    public static final String f98446c = "WindowInsetsAnimCompat";

    /* JADX INFO: renamed from: a */
    public C15193e f98447a;

    /* JADX INFO: renamed from: xli$b */
    public static abstract class AbstractC15190b {

        /* JADX INFO: renamed from: c */
        public static final int f98450c = 0;

        /* JADX INFO: renamed from: d */
        public static final int f98451d = 1;

        /* JADX INFO: renamed from: a */
        public WindowInsets f98452a;

        /* JADX INFO: renamed from: b */
        public final int f98453b;

        /* JADX INFO: renamed from: xli$b$a */
        @Retention(RetentionPolicy.SOURCE)
        @p7e({p7e.EnumC10826a.f69935b})
        public @interface a {
        }

        public AbstractC15190b(int i) {
            this.f98453b = i;
        }

        public final int getDispatchMode() {
            return this.f98453b;
        }

        public void onEnd(@efb xli xliVar) {
        }

        public void onPrepare(@efb xli xliVar) {
        }

        @efb
        public abstract smi onProgress(@efb smi smiVar, @efb List<xli> list);

        @efb
        public C15189a onStart(@efb xli xliVar, @efb C15189a c15189a) {
            return c15189a;
        }
    }

    /* JADX INFO: renamed from: xli$c */
    @c5e(21)
    public static class C15191c extends C15193e {

        /* JADX INFO: renamed from: f */
        public static final Interpolator f98454f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g */
        public static final Interpolator f98455g = new mp5();

        /* JADX INFO: renamed from: h */
        public static final Interpolator f98456h = new DecelerateInterpolator();

        /* JADX INFO: renamed from: xli$c$a */
        @c5e(21)
        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: c */
            public static final int f98457c = 160;

            /* JADX INFO: renamed from: a */
            public final AbstractC15190b f98458a;

            /* JADX INFO: renamed from: b */
            public smi f98459b;

            /* JADX INFO: renamed from: xli$c$a$a, reason: collision with other inner class name */
            public class C16560a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ xli f98460a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ smi f98461b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ smi f98462c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f98463d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ View f98464e;

                public C16560a(xli xliVar, smi smiVar, smi smiVar2, int i, View view) {
                    this.f98460a = xliVar;
                    this.f98461b = smiVar;
                    this.f98462c = smiVar2;
                    this.f98463d = i;
                    this.f98464e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f98460a.setFraction(valueAnimator.getAnimatedFraction());
                    C15191c.m25298f(this.f98464e, C15191c.m25302j(this.f98461b, this.f98462c, this.f98460a.getInterpolatedFraction(), this.f98463d), Collections.singletonList(this.f98460a));
                }
            }

            /* JADX INFO: renamed from: xli$c$a$b */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ xli f98466a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f98467b;

                public b(xli xliVar, View view) {
                    this.f98466a = xliVar;
                    this.f98467b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f98466a.setFraction(1.0f);
                    C15191c.m25296d(this.f98467b, this.f98466a);
                }
            }

            /* JADX INFO: renamed from: xli$c$a$c */
            public class c implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f98469a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ xli f98470b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C15189a f98471c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ValueAnimator f98472d;

                public c(View view, xli xliVar, C15189a c15189a, ValueAnimator valueAnimator) {
                    this.f98469a = view;
                    this.f98470b = xliVar;
                    this.f98471c = c15189a;
                    this.f98472d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C15191c.m25299g(this.f98469a, this.f98470b, this.f98471c);
                    this.f98472d.start();
                }
            }

            public a(@efb View view, @efb AbstractC15190b abstractC15190b) {
                this.f98458a = abstractC15190b;
                smi rootWindowInsets = o8i.getRootWindowInsets(view);
                this.f98459b = rootWindowInsets != null ? new smi.C12667b(rootWindowInsets).build() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int iM25293a;
                if (!view.isLaidOut()) {
                    this.f98459b = smi.toWindowInsetsCompat(windowInsets, view);
                    return C15191c.m25300h(view, windowInsets);
                }
                smi windowInsetsCompat = smi.toWindowInsetsCompat(windowInsets, view);
                if (this.f98459b == null) {
                    this.f98459b = o8i.getRootWindowInsets(view);
                }
                if (this.f98459b == null) {
                    this.f98459b = windowInsetsCompat;
                    return C15191c.m25300h(view, windowInsets);
                }
                AbstractC15190b abstractC15190bM25301i = C15191c.m25301i(view);
                if ((abstractC15190bM25301i == null || !Objects.equals(abstractC15190bM25301i.f98452a, windowInsets)) && (iM25293a = C15191c.m25293a(windowInsetsCompat, this.f98459b)) != 0) {
                    smi smiVar = this.f98459b;
                    xli xliVar = new xli(iM25293a, C15191c.m25295c(iM25293a, windowInsetsCompat, smiVar), 160L);
                    xliVar.setFraction(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(xliVar.getDurationMillis());
                    C15189a c15189aM25294b = C15191c.m25294b(windowInsetsCompat, smiVar, iM25293a);
                    C15191c.m25297e(view, xliVar, windowInsets, false);
                    duration.addUpdateListener(new C16560a(xliVar, windowInsetsCompat, smiVar, iM25293a, view));
                    duration.addListener(new b(xliVar, view));
                    d5c.add(view, new c(view, xliVar, c15189aM25294b, duration));
                    this.f98459b = windowInsetsCompat;
                    return C15191c.m25300h(view, windowInsets);
                }
                return C15191c.m25300h(view, windowInsets);
            }
        }

        public C15191c(int i, @hib Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @igg({"WrongConstant"})
        /* JADX INFO: renamed from: a */
        public static int m25293a(@efb smi smiVar, @efb smi smiVar2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!smiVar.getInsets(i2).equals(smiVar2.getInsets(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        @efb
        /* JADX INFO: renamed from: b */
        public static C15189a m25294b(@efb smi smiVar, @efb smi smiVar2, int i) {
            r48 insets = smiVar.getInsets(i);
            r48 insets2 = smiVar2.getInsets(i);
            return new C15189a(r48.m21004of(Math.min(insets.f77014a, insets2.f77014a), Math.min(insets.f77015b, insets2.f77015b), Math.min(insets.f77016c, insets2.f77016c), Math.min(insets.f77017d, insets2.f77017d)), r48.m21004of(Math.max(insets.f77014a, insets2.f77014a), Math.max(insets.f77015b, insets2.f77015b), Math.max(insets.f77016c, insets2.f77016c), Math.max(insets.f77017d, insets2.f77017d)));
        }

        /* JADX INFO: renamed from: c */
        public static Interpolator m25295c(int i, smi smiVar, smi smiVar2) {
            return (i & 8) != 0 ? smiVar.getInsets(smi.C12678m.ime()).f77017d > smiVar2.getInsets(smi.C12678m.ime()).f77017d ? f98454f : f98455g : f98456h;
        }

        @efb
        private static View.OnApplyWindowInsetsListener createProxyListener(@efb View view, @efb AbstractC15190b abstractC15190b) {
            return new a(view, abstractC15190b);
        }

        /* JADX INFO: renamed from: d */
        public static void m25296d(@efb View view, @efb xli xliVar) {
            AbstractC15190b abstractC15190bM25301i = m25301i(view);
            if (abstractC15190bM25301i != null) {
                abstractC15190bM25301i.onEnd(xliVar);
                if (abstractC15190bM25301i.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25296d(viewGroup.getChildAt(i), xliVar);
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public static void m25297e(View view, xli xliVar, WindowInsets windowInsets, boolean z) {
            AbstractC15190b abstractC15190bM25301i = m25301i(view);
            if (abstractC15190bM25301i != null) {
                abstractC15190bM25301i.f98452a = windowInsets;
                if (!z) {
                    abstractC15190bM25301i.onPrepare(xliVar);
                    z = abstractC15190bM25301i.getDispatchMode() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25297e(viewGroup.getChildAt(i), xliVar, windowInsets, z);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static void m25298f(@efb View view, @efb smi smiVar, @efb List<xli> list) {
            AbstractC15190b abstractC15190bM25301i = m25301i(view);
            if (abstractC15190bM25301i != null) {
                smiVar = abstractC15190bM25301i.onProgress(smiVar, list);
                if (abstractC15190bM25301i.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25298f(viewGroup.getChildAt(i), smiVar, list);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public static void m25299g(View view, xli xliVar, C15189a c15189a) {
            AbstractC15190b abstractC15190bM25301i = m25301i(view);
            if (abstractC15190bM25301i != null) {
                abstractC15190bM25301i.onStart(xliVar, c15189a);
                if (abstractC15190bM25301i.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25299g(viewGroup.getChildAt(i), xliVar, c15189a);
                }
            }
        }

        @efb
        /* JADX INFO: renamed from: h */
        public static WindowInsets m25300h(@efb View view, @efb WindowInsets windowInsets) {
            return view.getTag(C0915R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @hib
        /* JADX INFO: renamed from: i */
        public static AbstractC15190b m25301i(View view) {
            Object tag = view.getTag(C0915R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f98458a;
            }
            return null;
        }

        @igg({"WrongConstant"})
        /* JADX INFO: renamed from: j */
        public static smi m25302j(smi smiVar, smi smiVar2, float f, int i) {
            smi.C12667b c12667b = new smi.C12667b(smiVar);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    c12667b.setInsets(i2, smiVar.getInsets(i2));
                } else {
                    r48 insets = smiVar.getInsets(i2);
                    r48 insets2 = smiVar2.getInsets(i2);
                    float f2 = 1.0f - f;
                    c12667b.setInsets(i2, smi.m22111b(insets, (int) (((double) ((insets.f77014a - insets2.f77014a) * f2)) + 0.5d), (int) (((double) ((insets.f77015b - insets2.f77015b) * f2)) + 0.5d), (int) (((double) ((insets.f77016c - insets2.f77016c) * f2)) + 0.5d), (int) (((double) ((insets.f77017d - insets2.f77017d) * f2)) + 0.5d)));
                }
            }
            return c12667b.build();
        }

        public static void setCallback(@efb View view, @hib AbstractC15190b abstractC15190b) {
            Object tag = view.getTag(C0915R.id.tag_on_apply_window_listener);
            if (abstractC15190b == null) {
                view.setTag(C0915R.id.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerCreateProxyListener = createProxyListener(view, abstractC15190b);
            view.setTag(C0915R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListenerCreateProxyListener);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerCreateProxyListener);
            }
        }
    }

    /* JADX INFO: renamed from: xli$e */
    public static class C15193e {

        /* JADX INFO: renamed from: a */
        public final int f98479a;

        /* JADX INFO: renamed from: b */
        public float f98480b;

        /* JADX INFO: renamed from: c */
        @hib
        public final Interpolator f98481c;

        /* JADX INFO: renamed from: d */
        public final long f98482d;

        /* JADX INFO: renamed from: e */
        public float f98483e;

        public C15193e(int i, @hib Interpolator interpolator, long j) {
            this.f98479a = i;
            this.f98481c = interpolator;
            this.f98482d = j;
        }

        public float getAlpha() {
            return this.f98483e;
        }

        public long getDurationMillis() {
            return this.f98482d;
        }

        public float getFraction() {
            return this.f98480b;
        }

        public float getInterpolatedFraction() {
            Interpolator interpolator = this.f98481c;
            return interpolator != null ? interpolator.getInterpolation(this.f98480b) : this.f98480b;
        }

        @hib
        public Interpolator getInterpolator() {
            return this.f98481c;
        }

        public int getTypeMask() {
            return this.f98479a;
        }

        public void setAlpha(float f) {
            this.f98483e = f;
        }

        public void setFraction(float f) {
            this.f98480b = f;
        }
    }

    public xli(int i, @hib Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f98447a = new C15192d(i, interpolator, j);
        } else {
            this.f98447a = new C15191c(i, interpolator, j);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m25291a(@efb View view, @hib AbstractC15190b abstractC15190b) {
        if (Build.VERSION.SDK_INT >= 30) {
            C15192d.setCallback(view, abstractC15190b);
        } else {
            C15191c.setCallback(view, abstractC15190b);
        }
    }

    @c5e(30)
    /* JADX INFO: renamed from: b */
    public static xli m25292b(WindowInsetsAnimation windowInsetsAnimation) {
        return new xli(windowInsetsAnimation);
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getAlpha() {
        return this.f98447a.getAlpha();
    }

    public long getDurationMillis() {
        return this.f98447a.getDurationMillis();
    }

    @y46(from = 0.0d, m25645to = 1.0d)
    public float getFraction() {
        return this.f98447a.getFraction();
    }

    public float getInterpolatedFraction() {
        return this.f98447a.getInterpolatedFraction();
    }

    @hib
    public Interpolator getInterpolator() {
        return this.f98447a.getInterpolator();
    }

    public int getTypeMask() {
        return this.f98447a.getTypeMask();
    }

    public void setAlpha(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f98447a.setAlpha(f);
    }

    public void setFraction(@y46(from = 0.0d, m25645to = 1.0d) float f) {
        this.f98447a.setFraction(f);
    }

    /* JADX INFO: renamed from: xli$d */
    @c5e(30)
    public static class C15192d extends C15193e {

        /* JADX INFO: renamed from: f */
        @efb
        public final WindowInsetsAnimation f98474f;

        /* JADX INFO: renamed from: xli$d$a */
        @c5e(30)
        public static class a extends WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a */
            public final AbstractC15190b f98475a;

            /* JADX INFO: renamed from: b */
            public List<xli> f98476b;

            /* JADX INFO: renamed from: c */
            public ArrayList<xli> f98477c;

            /* JADX INFO: renamed from: d */
            public final HashMap<WindowInsetsAnimation, xli> f98478d;

            public a(@efb AbstractC15190b abstractC15190b) {
                super(abstractC15190b.getDispatchMode());
                this.f98478d = new HashMap<>();
                this.f98475a = abstractC15190b;
            }

            @efb
            private xli getWindowInsetsAnimationCompat(@efb WindowInsetsAnimation windowInsetsAnimation) {
                xli xliVar = this.f98478d.get(windowInsetsAnimation);
                if (xliVar != null) {
                    return xliVar;
                }
                xli xliVarM25292b = xli.m25292b(windowInsetsAnimation);
                this.f98478d.put(windowInsetsAnimation, xliVarM25292b);
                return xliVarM25292b;
            }

            public void onEnd(@efb WindowInsetsAnimation windowInsetsAnimation) {
                this.f98475a.onEnd(getWindowInsetsAnimationCompat(windowInsetsAnimation));
                this.f98478d.remove(windowInsetsAnimation);
            }

            public void onPrepare(@efb WindowInsetsAnimation windowInsetsAnimation) {
                this.f98475a.onPrepare(getWindowInsetsAnimationCompat(windowInsetsAnimation));
            }

            @efb
            public WindowInsets onProgress(@efb WindowInsets windowInsets, @efb List<WindowInsetsAnimation> list) {
                ArrayList<xli> arrayList = this.f98477c;
                if (arrayList == null) {
                    ArrayList<xli> arrayList2 = new ArrayList<>(list.size());
                    this.f98477c = arrayList2;
                    this.f98476b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationM14827a = kmi.m14827a(list.get(size));
                    xli windowInsetsAnimationCompat = getWindowInsetsAnimationCompat(windowInsetsAnimationM14827a);
                    windowInsetsAnimationCompat.setFraction(windowInsetsAnimationM14827a.getFraction());
                    this.f98477c.add(windowInsetsAnimationCompat);
                }
                return this.f98475a.onProgress(smi.toWindowInsetsCompat(windowInsets), this.f98476b).toWindowInsets();
            }

            @efb
            public WindowInsetsAnimation.Bounds onStart(@efb WindowInsetsAnimation windowInsetsAnimation, @efb WindowInsetsAnimation.Bounds bounds) {
                return this.f98475a.onStart(getWindowInsetsAnimationCompat(windowInsetsAnimation), C15189a.toBoundsCompat(bounds)).toBounds();
            }
        }

        public C15192d(@efb WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f98474f = windowInsetsAnimation;
        }

        @efb
        public static WindowInsetsAnimation.Bounds createPlatformBounds(@efb C15189a c15189a) {
            ami.m931a();
            return zli.m26893a(c15189a.getLowerBound().toPlatformInsets(), c15189a.getUpperBound().toPlatformInsets());
        }

        @efb
        public static r48 getHigherBounds(@efb WindowInsetsAnimation.Bounds bounds) {
            return r48.toCompatInsets(bounds.getUpperBound());
        }

        @efb
        public static r48 getLowerBounds(@efb WindowInsetsAnimation.Bounds bounds) {
            return r48.toCompatInsets(bounds.getLowerBound());
        }

        public static void setCallback(@efb View view, @hib AbstractC15190b abstractC15190b) {
            view.setWindowInsetsAnimationCallback(abstractC15190b != null ? new a(abstractC15190b) : null);
        }

        @Override // p000.xli.C15193e
        public long getDurationMillis() {
            return this.f98474f.getDurationMillis();
        }

        @Override // p000.xli.C15193e
        public float getFraction() {
            return this.f98474f.getFraction();
        }

        @Override // p000.xli.C15193e
        public float getInterpolatedFraction() {
            return this.f98474f.getInterpolatedFraction();
        }

        @Override // p000.xli.C15193e
        @hib
        public Interpolator getInterpolator() {
            return this.f98474f.getInterpolator();
        }

        @Override // p000.xli.C15193e
        public int getTypeMask() {
            return this.f98474f.getTypeMask();
        }

        @Override // p000.xli.C15193e
        public void setFraction(float f) {
            this.f98474f.setFraction(f);
        }

        public C15192d(int i, Interpolator interpolator, long j) {
            this(jmi.m14184a(i, interpolator, j));
        }
    }

    /* JADX INFO: renamed from: xli$a */
    public static final class C15189a {

        /* JADX INFO: renamed from: a */
        public final r48 f98448a;

        /* JADX INFO: renamed from: b */
        public final r48 f98449b;

        public C15189a(@efb r48 r48Var, @efb r48 r48Var2) {
            this.f98448a = r48Var;
            this.f98449b = r48Var2;
        }

        @c5e(30)
        @efb
        public static C15189a toBoundsCompat(@efb WindowInsetsAnimation.Bounds bounds) {
            return new C15189a(bounds);
        }

        @efb
        public r48 getLowerBound() {
            return this.f98448a;
        }

        @efb
        public r48 getUpperBound() {
            return this.f98449b;
        }

        @efb
        public C15189a inset(@efb r48 r48Var) {
            return new C15189a(smi.m22111b(this.f98448a, r48Var.f77014a, r48Var.f77015b, r48Var.f77016c, r48Var.f77017d), smi.m22111b(this.f98449b, r48Var.f77014a, r48Var.f77015b, r48Var.f77016c, r48Var.f77017d));
        }

        @c5e(30)
        @efb
        public WindowInsetsAnimation.Bounds toBounds() {
            return C15192d.createPlatformBounds(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f98448a + " upper=" + this.f98449b + "}";
        }

        @c5e(30)
        private C15189a(@efb WindowInsetsAnimation.Bounds bounds) {
            this.f98448a = C15192d.getLowerBounds(bounds);
            this.f98449b = C15192d.getHigherBounds(bounds);
        }
    }

    @c5e(30)
    private xli(@efb WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f98447a = new C15192d(windowInsetsAnimation);
        }
    }
}
