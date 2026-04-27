package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.C0915R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import p000.C5603f6;
import p000.C6730h7;
import p000.p7e;
import p000.smi;
import p000.xli;

/* JADX INFO: loaded from: classes3.dex */
@igg({"PrivateConstructorForUtilityClass"})
public class o8i {

    /* JADX INFO: renamed from: A */
    @Deprecated
    public static final int f66737A = 16777216;

    /* JADX INFO: renamed from: B */
    public static final int f66738B = 0;

    /* JADX INFO: renamed from: C */
    public static final int f66739C = 1;

    /* JADX INFO: renamed from: D */
    public static final int f66740D = 2;

    /* JADX INFO: renamed from: E */
    public static final int f66741E = 0;

    /* JADX INFO: renamed from: F */
    public static final int f66742F = 1;

    /* JADX INFO: renamed from: G */
    public static final int f66743G = 1;

    /* JADX INFO: renamed from: H */
    public static final int f66744H = 2;

    /* JADX INFO: renamed from: I */
    public static final int f66745I = 4;

    /* JADX INFO: renamed from: J */
    public static final int f66746J = 8;

    /* JADX INFO: renamed from: K */
    public static final int f66747K = 16;

    /* JADX INFO: renamed from: L */
    public static final int f66748L = 32;

    /* JADX INFO: renamed from: M */
    public static Method f66749M = null;

    /* JADX INFO: renamed from: N */
    public static Method f66750N = null;

    /* JADX INFO: renamed from: O */
    public static boolean f66751O = false;

    /* JADX INFO: renamed from: P */
    public static WeakHashMap<View, String> f66752P = null;

    /* JADX INFO: renamed from: Q */
    public static WeakHashMap<View, ebi> f66753Q = null;

    /* JADX INFO: renamed from: R */
    public static Method f66754R = null;

    /* JADX INFO: renamed from: S */
    public static Field f66755S = null;

    /* JADX INFO: renamed from: T */
    public static boolean f66756T = false;

    /* JADX INFO: renamed from: U */
    public static ThreadLocal<Rect> f66757U = null;

    /* JADX INFO: renamed from: V */
    public static final int[] f66758V = {C0915R.id.accessibility_custom_action_0, C0915R.id.accessibility_custom_action_1, C0915R.id.accessibility_custom_action_2, C0915R.id.accessibility_custom_action_3, C0915R.id.accessibility_custom_action_4, C0915R.id.accessibility_custom_action_5, C0915R.id.accessibility_custom_action_6, C0915R.id.accessibility_custom_action_7, C0915R.id.accessibility_custom_action_8, C0915R.id.accessibility_custom_action_9, C0915R.id.accessibility_custom_action_10, C0915R.id.accessibility_custom_action_11, C0915R.id.accessibility_custom_action_12, C0915R.id.accessibility_custom_action_13, C0915R.id.accessibility_custom_action_14, C0915R.id.accessibility_custom_action_15, C0915R.id.accessibility_custom_action_16, C0915R.id.accessibility_custom_action_17, C0915R.id.accessibility_custom_action_18, C0915R.id.accessibility_custom_action_19, C0915R.id.accessibility_custom_action_20, C0915R.id.accessibility_custom_action_21, C0915R.id.accessibility_custom_action_22, C0915R.id.accessibility_custom_action_23, C0915R.id.accessibility_custom_action_24, C0915R.id.accessibility_custom_action_25, C0915R.id.accessibility_custom_action_26, C0915R.id.accessibility_custom_action_27, C0915R.id.accessibility_custom_action_28, C0915R.id.accessibility_custom_action_29, C0915R.id.accessibility_custom_action_30, C0915R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: W */
    public static final k4c f66759W = new k4c() { // from class: n8i
        @Override // p000.k4c
        public final uv2 onReceiveContent(uv2 uv2Var) {
            return o8i.lambda$static$0(uv2Var);
        }
    };

    /* JADX INFO: renamed from: X */
    public static final ViewTreeObserverOnGlobalLayoutListenerC10237e f66760X = new ViewTreeObserverOnGlobalLayoutListenerC10237e();

    /* JADX INFO: renamed from: a */
    public static final String f66761a = "ViewCompat";

    /* JADX INFO: renamed from: b */
    @Deprecated
    public static final int f66762b = 0;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final int f66763c = 1;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final int f66764d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f66765e = 0;

    /* JADX INFO: renamed from: f */
    public static final int f66766f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f66767g = 2;

    /* JADX INFO: renamed from: h */
    public static final int f66768h = 4;

    /* JADX INFO: renamed from: i */
    public static final int f66769i = 8;

    /* JADX INFO: renamed from: j */
    @Deprecated
    public static final int f66770j = 0;

    /* JADX INFO: renamed from: k */
    @Deprecated
    public static final int f66771k = 1;

    /* JADX INFO: renamed from: l */
    @Deprecated
    public static final int f66772l = 2;

    /* JADX INFO: renamed from: m */
    @Deprecated
    public static final int f66773m = 4;

    /* JADX INFO: renamed from: n */
    public static final int f66774n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f66775o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f66776p = 2;

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final int f66777q = 0;

    /* JADX INFO: renamed from: r */
    @Deprecated
    public static final int f66778r = 1;

    /* JADX INFO: renamed from: s */
    @Deprecated
    public static final int f66779s = 2;

    /* JADX INFO: renamed from: t */
    @Deprecated
    public static final int f66780t = 0;

    /* JADX INFO: renamed from: u */
    @Deprecated
    public static final int f66781u = 1;

    /* JADX INFO: renamed from: v */
    @Deprecated
    public static final int f66782v = 2;

    /* JADX INFO: renamed from: w */
    @Deprecated
    public static final int f66783w = 3;

    /* JADX INFO: renamed from: x */
    @Deprecated
    public static final int f66784x = 16777215;

    /* JADX INFO: renamed from: y */
    @Deprecated
    public static final int f66785y = -16777216;

    /* JADX INFO: renamed from: z */
    @Deprecated
    public static final int f66786z = 16;

    /* JADX INFO: renamed from: o8i$a */
    public class C10233a extends AbstractC10238f<Boolean> {
        public C10233a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // p000.o8i.AbstractC10238f
        @c5e(28)
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean mo18431b(@efb View view) {
            return Boolean.valueOf(C10244l.m18506d(view));
        }

        @Override // p000.o8i.AbstractC10238f
        @c5e(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo18432c(@efb View view, Boolean bool) {
            C10244l.m18511i(view, bool.booleanValue());
        }

        @Override // p000.o8i.AbstractC10238f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean mo18433f(Boolean bool, Boolean bool2) {
            return !m18448a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: o8i$b */
    public class C10234b extends AbstractC10238f<CharSequence> {
        public C10234b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // p000.o8i.AbstractC10238f
        @c5e(28)
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public CharSequence mo18431b(View view) {
            return C10244l.m18504b(view);
        }

        @Override // p000.o8i.AbstractC10238f
        @c5e(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo18432c(View view, CharSequence charSequence) {
            C10244l.m18510h(view, charSequence);
        }

        @Override // p000.o8i.AbstractC10238f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean mo18433f(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: o8i$c */
    public class C10235c extends AbstractC10238f<CharSequence> {
        public C10235c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // p000.o8i.AbstractC10238f
        @c5e(30)
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public CharSequence mo18431b(View view) {
            return C10246n.m18519b(view);
        }

        @Override // p000.o8i.AbstractC10238f
        @c5e(30)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo18432c(View view, CharSequence charSequence) {
            C10246n.m18522e(view, charSequence);
        }

        @Override // p000.o8i.AbstractC10238f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean mo18433f(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: o8i$d */
    public class C10236d extends AbstractC10238f<Boolean> {
        public C10236d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // p000.o8i.AbstractC10238f
        @c5e(28)
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean mo18431b(View view) {
            return Boolean.valueOf(C10244l.m18505c(view));
        }

        @Override // p000.o8i.AbstractC10238f
        @c5e(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo18432c(View view, Boolean bool) {
            C10244l.m18509g(view, bool.booleanValue());
        }

        @Override // p000.o8i.AbstractC10238f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean mo18433f(Boolean bool, Boolean bool2) {
            return !m18448a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: o8i$e */
    public static class ViewTreeObserverOnGlobalLayoutListenerC10237e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final WeakHashMap<View, Boolean> f66787a = new WeakHashMap<>();

        private void checkPaneVisibility(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z) {
                o8i.m18430e(key, z ? 16 : 32);
                entry.setValue(Boolean.valueOf(z));
            }
        }

        private void registerForLayoutCallback(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void unregisterForLayoutCallback(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX INFO: renamed from: a */
        public void m18446a(View view) {
            this.f66787a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                registerForLayoutCallback(view);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m18447b(View view) {
            this.f66787a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            unregisterForLayoutCallback(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f66787a.entrySet().iterator();
                while (it.hasNext()) {
                    checkPaneVisibility(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            registerForLayoutCallback(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: o8i$f */
    public static abstract class AbstractC10238f<T> {

        /* JADX INFO: renamed from: a */
        public final int f66788a;

        /* JADX INFO: renamed from: b */
        public final Class<T> f66789b;

        /* JADX INFO: renamed from: c */
        public final int f66790c;

        /* JADX INFO: renamed from: d */
        public final int f66791d;

        public AbstractC10238f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        private boolean frameworkAvailable() {
            return Build.VERSION.SDK_INT >= this.f66790c;
        }

        /* JADX INFO: renamed from: a */
        public boolean m18448a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* JADX INFO: renamed from: b */
        public abstract T mo18431b(View view);

        /* JADX INFO: renamed from: c */
        public abstract void mo18432c(View view, T t);

        /* JADX INFO: renamed from: d */
        public T m18449d(View view) {
            if (frameworkAvailable()) {
                return mo18431b(view);
            }
            T t = (T) view.getTag(this.f66788a);
            if (this.f66789b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public void m18450e(View view, T t) {
            if (frameworkAvailable()) {
                mo18432c(view, t);
            } else if (mo18433f(m18449d(view), t)) {
                o8i.m18429d(view);
                view.setTag(this.f66788a, t);
                o8i.m18430e(view, this.f66791d);
            }
        }

        /* JADX INFO: renamed from: f */
        public boolean mo18433f(T t, T t2) {
            return !t2.equals(t);
        }

        public AbstractC10238f(int i, Class<T> cls, int i2, int i3) {
            this.f66788a = i;
            this.f66789b = cls;
            this.f66791d = i2;
            this.f66790c = i3;
        }
    }

    /* JADX INFO: renamed from: o8i$g */
    @c5e(20)
    public static class C10239g {
        private C10239g() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static WindowInsets m18451a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static WindowInsets m18452b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m18453c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: o8i$h */
    @c5e(21)
    public static class C10240h {

        /* JADX INFO: renamed from: o8i$h$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public smi f66792a = null;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f66793b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ t1c f66794c;

            public a(View view, t1c t1cVar) {
                this.f66793b = view;
                this.f66794c = t1cVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                smi windowInsetsCompat = smi.toWindowInsetsCompat(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C10240h.m18454a(windowInsets, this.f66793b);
                    if (windowInsetsCompat.equals(this.f66792a)) {
                        return this.f66794c.onApplyWindowInsets(view, windowInsetsCompat).toWindowInsets();
                    }
                }
                this.f66792a = windowInsetsCompat;
                smi smiVarOnApplyWindowInsets = this.f66794c.onApplyWindowInsets(view, windowInsetsCompat);
                if (i >= 30) {
                    return smiVarOnApplyWindowInsets.toWindowInsets();
                }
                o8i.requestApplyInsets(view);
                return smiVarOnApplyWindowInsets.toWindowInsets();
            }
        }

        private C10240h() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m18454a(@efb WindowInsets windowInsets, @efb View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C0915R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static smi m18455b(@efb View view, @efb smi smiVar, @efb Rect rect) {
            WindowInsets windowInsets = smiVar.toWindowInsets();
            if (windowInsets != null) {
                return smi.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return smiVar;
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static boolean m18456c(@efb View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static boolean m18457d(@efb View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static boolean m18458e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static boolean m18459f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static ColorStateList m18460g(View view) {
            return view.getBackgroundTintList();
        }

        @hib
        @ih4
        public static smi getRootWindowInsets(@efb View view) {
            return smi.C12666a.getRootWindowInsets(view);
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static PorterDuff.Mode m18461h(View view) {
            return view.getBackgroundTintMode();
        }

        @ih4
        /* JADX INFO: renamed from: i */
        public static float m18462i(View view) {
            return view.getElevation();
        }

        @ih4
        /* JADX INFO: renamed from: j */
        public static String m18463j(View view) {
            return view.getTransitionName();
        }

        @ih4
        /* JADX INFO: renamed from: k */
        public static float m18464k(View view) {
            return view.getTranslationZ();
        }

        @ih4
        /* JADX INFO: renamed from: l */
        public static float m18465l(@efb View view) {
            return view.getZ();
        }

        @ih4
        /* JADX INFO: renamed from: m */
        public static boolean m18466m(View view) {
            return view.hasNestedScrollingParent();
        }

        @ih4
        /* JADX INFO: renamed from: n */
        public static boolean m18467n(View view) {
            return view.isImportantForAccessibility();
        }

        @ih4
        /* JADX INFO: renamed from: o */
        public static boolean m18468o(View view) {
            return view.isNestedScrollingEnabled();
        }

        @ih4
        /* JADX INFO: renamed from: p */
        public static void m18469p(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @ih4
        /* JADX INFO: renamed from: q */
        public static void m18470q(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @ih4
        /* JADX INFO: renamed from: r */
        public static void m18471r(View view, float f) {
            view.setElevation(f);
        }

        @ih4
        /* JADX INFO: renamed from: s */
        public static void m18472s(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        @ih4
        /* JADX INFO: renamed from: t */
        public static void m18473t(@efb View view, @hib t1c t1cVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C0915R.id.tag_on_apply_window_listener, t1cVar);
            }
            if (t1cVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C0915R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, t1cVar));
            }
        }

        @ih4
        /* JADX INFO: renamed from: u */
        public static void m18474u(View view, String str) {
            view.setTransitionName(str);
        }

        @ih4
        /* JADX INFO: renamed from: v */
        public static void m18475v(View view, float f) {
            view.setTranslationZ(f);
        }

        @ih4
        /* JADX INFO: renamed from: w */
        public static void m18476w(@efb View view, float f) {
            view.setZ(f);
        }

        @ih4
        /* JADX INFO: renamed from: x */
        public static boolean m18477x(View view, int i) {
            return view.startNestedScroll(i);
        }

        @ih4
        /* JADX INFO: renamed from: y */
        public static void m18478y(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: o8i$i */
    @c5e(23)
    public static class C10241i {
        private C10241i() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m18479a(@efb View view) {
            return view.getScrollIndicators();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m18480b(@efb View view, int i) {
            view.setScrollIndicators(i);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m18481c(@efb View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }

        @hib
        public static smi getRootWindowInsets(@efb View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            smi windowInsetsCompat = smi.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.m22115e(windowInsetsCompat);
            windowInsetsCompat.m22112a(view.getRootView());
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: o8i$j */
    @c5e(24)
    public static class C10242j {
        private C10242j() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m18482a(@efb View view) {
            view.cancelDragAndDrop();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m18483b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m18484c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m18485d(@efb View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static boolean m18486e(@efb View view, @hib ClipData clipData, @efb View.DragShadowBuilder dragShadowBuilder, @hib Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static void m18487f(@efb View view, @efb View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* JADX INFO: renamed from: o8i$k */
    @c5e(26)
    public static class C10243k {
        private C10243k() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m18488a(@efb View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static int m18489b(View view) {
            return view.getImportantForAutofill();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static int m18490c(@efb View view) {
            return view.getNextClusterForwardId();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static boolean m18491d(@efb View view) {
            return view.hasExplicitFocusable();
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static boolean m18492e(@efb View view) {
            return view.isFocusedByDefault();
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static boolean m18493f(View view) {
            return view.isImportantForAutofill();
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static boolean m18494g(@efb View view) {
            return view.isKeyboardNavigationCluster();
        }

        @ih4
        public static AutofillId getAutofillId(View view) {
            return view.getAutofillId();
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static View m18495h(@efb View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        @ih4
        /* JADX INFO: renamed from: i */
        public static boolean m18496i(@efb View view) {
            return view.restoreDefaultFocus();
        }

        @ih4
        /* JADX INFO: renamed from: j */
        public static void m18497j(@efb View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @ih4
        /* JADX INFO: renamed from: k */
        public static void m18498k(@efb View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        @ih4
        /* JADX INFO: renamed from: l */
        public static void m18499l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        @ih4
        /* JADX INFO: renamed from: m */
        public static void m18500m(@efb View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        @ih4
        /* JADX INFO: renamed from: n */
        public static void m18501n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        @ih4
        /* JADX INFO: renamed from: o */
        public static void m18502o(@efb View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: renamed from: o8i$l */
    @c5e(28)
    public static class C10244l {
        private C10244l() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m18503a(@efb View view, @efb final InterfaceC10253u interfaceC10253u) {
            scf scfVar = (scf) view.getTag(C0915R.id.tag_unhandled_key_listeners);
            if (scfVar == null) {
                scfVar = new scf();
                view.setTag(C0915R.id.tag_unhandled_key_listeners, scfVar);
            }
            Objects.requireNonNull(interfaceC10253u);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: p8i
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return interfaceC10253u.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            scfVar.put(interfaceC10253u, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static CharSequence m18504b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static boolean m18505c(View view) {
            return view.isAccessibilityHeading();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static boolean m18506d(View view) {
            return view.isScreenReaderFocusable();
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m18507e(@efb View view, @efb InterfaceC10253u interfaceC10253u) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            scf scfVar = (scf) view.getTag(C0915R.id.tag_unhandled_key_listeners);
            if (scfVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) scfVar.get(interfaceC10253u)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static <T> T m18508f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static void m18509g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static void m18510h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @ih4
        /* JADX INFO: renamed from: i */
        public static void m18511i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }

        @ih4
        public static void setAutofillId(View view, jm0 jm0Var) {
            view.setAutofillId(jm0Var == null ? null : jm0Var.toAutofillId());
        }
    }

    /* JADX INFO: renamed from: o8i$m */
    @c5e(29)
    public static class C10245m {
        private C10245m() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static View.AccessibilityDelegate m18512a(View view) {
            return view.getAccessibilityDelegate();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static ContentCaptureSession m18513b(View view) {
            return view.getContentCaptureSession();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static List<Rect> m18514c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m18515d(@efb View view, @efb Context context, @efb int[] iArr, @hib AttributeSet attributeSet, @efb TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m18516e(View view, kv2 kv2Var) {
            view.setContentCaptureSession(kv2Var == null ? null : kv2Var.toContentCaptureSession());
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static void m18517f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: renamed from: o8i$n */
    @c5e(30)
    public static class C10246n {
        private C10246n() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m18518a(View view) {
            return view.getImportantForContentCapture();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static CharSequence m18519b(View view) {
            return view.getStateDescription();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static boolean m18520c(View view) {
            return view.isImportantForContentCapture();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m18521d(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m18522e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        @hib
        public static xni getWindowInsetsController(@efb View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return xni.toWindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: o8i$o */
    @c5e(31)
    public static final class C10247o {
        private C10247o() {
        }

        @hib
        @ih4
        public static String[] getReceiveContentMimeTypes(@efb View view) {
            return view.getReceiveContentMimeTypes();
        }

        @hib
        @ih4
        public static uv2 performReceiveContent(@efb View view, @efb uv2 uv2Var) {
            ContentInfo contentInfo = uv2Var.toContentInfo();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfo);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfo ? uv2Var : uv2.toContentInfoCompat(contentInfoPerformReceiveContent);
        }

        @ih4
        public static void setOnReceiveContentListener(@efb View view, @hib String[] strArr, @hib j4c j4cVar) {
            if (j4cVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC10252t(j4cVar));
            }
        }
    }

    /* JADX INFO: renamed from: o8i$p */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC10248p {
    }

    /* JADX INFO: renamed from: o8i$q */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC10249q {
    }

    /* JADX INFO: renamed from: o8i$r */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC10250r {
    }

    /* JADX INFO: renamed from: o8i$s */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC10251s {
    }

    /* JADX INFO: renamed from: o8i$t */
    @c5e(31)
    public static final class OnReceiveContentListenerC10252t implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a */
        @efb
        public final j4c f66795a;

        public OnReceiveContentListenerC10252t(@efb j4c j4cVar) {
            this.f66795a = j4cVar;
        }

        @hib
        public ContentInfo onReceiveContent(@efb View view, @efb ContentInfo contentInfo) {
            uv2 contentInfoCompat = uv2.toContentInfoCompat(contentInfo);
            uv2 uv2VarOnReceiveContent = this.f66795a.onReceiveContent(view, contentInfoCompat);
            if (uv2VarOnReceiveContent == null) {
                return null;
            }
            return uv2VarOnReceiveContent == contentInfoCompat ? contentInfo : uv2VarOnReceiveContent.toContentInfo();
        }
    }

    /* JADX INFO: renamed from: o8i$u */
    public interface InterfaceC10253u {
        boolean onUnhandledKeyEvent(@efb View view, @efb KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: o8i$v */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC10254v {
    }

    /* JADX INFO: renamed from: o8i$w */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC10255w {
    }

    /* JADX INFO: renamed from: o8i$x */
    public static class C10256x {

        /* JADX INFO: renamed from: d */
        public static final ArrayList<WeakReference<View>> f66796d = new ArrayList<>();

        /* JADX INFO: renamed from: a */
        @hib
        public WeakHashMap<View, Boolean> f66797a = null;

        /* JADX INFO: renamed from: b */
        public SparseArray<WeakReference<View>> f66798b = null;

        /* JADX INFO: renamed from: c */
        public WeakReference<KeyEvent> f66799c = null;

        /* JADX INFO: renamed from: a */
        public static C10256x m18523a(View view) {
            C10256x c10256x = (C10256x) view.getTag(C0915R.id.tag_unhandled_key_event_manager);
            if (c10256x != null) {
                return c10256x;
            }
            C10256x c10256x2 = new C10256x();
            view.setTag(C0915R.id.tag_unhandled_key_event_manager, c10256x2);
            return c10256x2;
        }

        /* JADX INFO: renamed from: d */
        public static void m18524d(View view) {
            ArrayList<WeakReference<View>> arrayList = f66796d;
            synchronized (arrayList) {
                try {
                    Iterator<WeakReference<View>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == view) {
                            return;
                        }
                    }
                    f66796d.add(new WeakReference<>(view));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @hib
        private View dispatchInOrder(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f66797a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewDispatchInOrder = dispatchInOrder(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewDispatchInOrder != null) {
                            return viewDispatchInOrder;
                        }
                    }
                }
                if (onUnhandledKeyEvent(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public static void m18525e(View view) {
            synchronized (f66796d) {
                int i = 0;
                while (true) {
                    try {
                        ArrayList<WeakReference<View>> arrayList = f66796d;
                        if (i >= arrayList.size()) {
                            return;
                        }
                        if (arrayList.get(i).get() == view) {
                            arrayList.remove(i);
                            return;
                        }
                        i++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        private SparseArray<WeakReference<View>> getCapturedKeys() {
            if (this.f66798b == null) {
                this.f66798b = new SparseArray<>();
            }
            return this.f66798b;
        }

        private boolean onUnhandledKeyEvent(@efb View view, @efb KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0915R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((InterfaceC10253u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void recalcViewsWithUnhandled() {
            WeakHashMap<View, Boolean> weakHashMap = this.f66797a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f66796d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f66797a == null) {
                        this.f66797a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f66796d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f66797a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f66797a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m18526b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                recalcViewsWithUnhandled();
            }
            View viewDispatchInOrder = dispatchInOrder(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewDispatchInOrder != null && !KeyEvent.isModifierKey(keyCode)) {
                    getCapturedKeys().put(keyCode, new WeakReference<>(viewDispatchInOrder));
                }
            }
            return viewDispatchInOrder != null;
        }

        /* JADX INFO: renamed from: c */
        public boolean m18527c(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f66799c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f66799c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> capturedKeys = getCapturedKeys();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = capturedKeys.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = capturedKeys.valueAt(iIndexOfKey);
                capturedKeys.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = capturedKeys.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                onUnhandledKeyEvent(view, keyEvent);
            }
            return true;
        }
    }

    @Deprecated
    public o8i() {
    }

    private static AbstractC10238f<Boolean> accessibilityHeadingProperty() {
        return new C10236d(C0915R.id.tag_accessibility_heading, Boolean.class, 28);
    }

    public static int addAccessibilityAction(@efb View view, @efb CharSequence charSequence, @efb InterfaceC10809p7 interfaceC10809p7) {
        int availableActionIdFromResources = getAvailableActionIdFromResources(view, charSequence);
        if (availableActionIdFromResources != -1) {
            addAccessibilityAction(view, new C6730h7.a(availableActionIdFromResources, charSequence, interfaceC10809p7));
        }
        return availableActionIdFromResources;
    }

    public static void addKeyboardNavigationClusters(@efb View view, @efb Collection<View> collection, int i) {
        C10243k.m18488a(view, collection, i);
    }

    public static void addOnUnhandledKeyEventListener(@efb View view, @efb InterfaceC10253u interfaceC10253u) {
        if (Build.VERSION.SDK_INT >= 28) {
            C10244l.m18503a(view, interfaceC10253u);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C0915R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(C0915R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(interfaceC10253u);
        if (arrayList.size() == 1) {
            C10256x.m18524d(view);
        }
    }

    @efb
    @Deprecated
    public static ebi animate(@efb View view) {
        if (f66753Q == null) {
            f66753Q = new WeakHashMap<>();
        }
        ebi ebiVar = f66753Q.get(view);
        if (ebiVar != null) {
            return ebiVar;
        }
        ebi ebiVar2 = new ebi(view);
        f66753Q.put(view, ebiVar2);
        return ebiVar2;
    }

    @erh
    /* JADX INFO: renamed from: b */
    public static boolean m18427b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C10256x.m18523a(view).m18526b(view, keyEvent);
    }

    private static void bindTempDetach() {
        try {
            f66749M = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", null);
            f66750N = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", null);
        } catch (NoSuchMethodException e) {
            Log.e(f66761a, "Couldn't find method", e);
        }
        f66751O = true;
    }

    @erh
    /* JADX INFO: renamed from: c */
    public static boolean m18428c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C10256x.m18523a(view).m18527c(keyEvent);
    }

    @Deprecated
    public static boolean canScrollHorizontally(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Deprecated
    public static boolean canScrollVertically(View view, int i) {
        return view.canScrollVertically(i);
    }

    public static void cancelDragAndDrop(@efb View view) {
        C10242j.m18482a(view);
    }

    @Deprecated
    public static int combineMeasuredStates(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    private static void compatOffsetLeftAndRight(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    private static void compatOffsetTopAndBottom(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    @efb
    public static smi computeSystemWindowInsets(@efb View view, @efb smi smiVar, @efb Rect rect) {
        return C10240h.m18455b(view, smiVar, rect);
    }

    /* JADX INFO: renamed from: d */
    public static void m18429d(@efb View view) {
        C5603f6 accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new C5603f6();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    @efb
    public static smi dispatchApplyWindowInsets(@efb View view, @efb smi smiVar) {
        WindowInsets windowInsets = smiVar.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsM18451a = C10239g.m18451a(view, windowInsets);
            if (!windowInsetsM18451a.equals(windowInsets)) {
                return smi.toWindowInsetsCompat(windowInsetsM18451a, view);
            }
        }
        return smiVar;
    }

    public static void dispatchFinishTemporaryDetach(@efb View view) {
        C10242j.m18483b(view);
    }

    public static boolean dispatchNestedFling(@efb View view, float f, float f2, boolean z) {
        return C10240h.m18456c(view, f, f2, z);
    }

    public static boolean dispatchNestedPreFling(@efb View view, float f, float f2) {
        return C10240h.m18457d(view, f, f2);
    }

    public static boolean dispatchNestedPreScroll(@efb View view, int i, int i2, @hib int[] iArr, @hib int[] iArr2) {
        return C10240h.m18458e(view, i, i2, iArr, iArr2);
    }

    public static boolean dispatchNestedScroll(@efb View view, int i, int i2, int i3, int i4, @hib int[] iArr) {
        return C10240h.m18459f(view, i, i2, i3, i4, iArr);
    }

    public static void dispatchStartTemporaryDetach(@efb View view) {
        C10242j.m18484c(view);
    }

    /* JADX INFO: renamed from: e */
    public static void m18430e(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(getAccessibilityPaneTitle(view));
                    setImportantForAccessibilityIfNeeded(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(getAccessibilityPaneTitle(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e(f66761a, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    public static void enableAccessibleClickableSpanSupport(@efb View view) {
        m18429d(view);
    }

    @Deprecated
    public static int generateViewId() {
        return View.generateViewId();
    }

    @hib
    public static C5603f6 getAccessibilityDelegate(@efb View view) {
        View.AccessibilityDelegate accessibilityDelegateInternal = getAccessibilityDelegateInternal(view);
        if (accessibilityDelegateInternal == null) {
            return null;
        }
        return accessibilityDelegateInternal instanceof C5603f6.a ? ((C5603f6.a) accessibilityDelegateInternal).f35390a : new C5603f6(accessibilityDelegateInternal);
    }

    @hib
    private static View.AccessibilityDelegate getAccessibilityDelegateInternal(@efb View view) {
        return Build.VERSION.SDK_INT >= 29 ? C10245m.m18512a(view) : getAccessibilityDelegateThroughReflection(view);
    }

    @hib
    private static View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(@efb View view) {
        if (f66756T) {
            return null;
        }
        if (f66755S == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f66755S = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f66756T = true;
                return null;
            }
        }
        try {
            Object obj = f66755S.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f66756T = true;
            return null;
        }
    }

    @Deprecated
    public static int getAccessibilityLiveRegion(@efb View view) {
        return view.getAccessibilityLiveRegion();
    }

    @hib
    public static C9165m7 getAccessibilityNodeProvider(@efb View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new C9165m7(accessibilityNodeProvider);
        }
        return null;
    }

    @hib
    @erh
    public static CharSequence getAccessibilityPaneTitle(@efb View view) {
        return paneTitleProperty().m18449d(view);
    }

    private static List<C6730h7.a> getActionList(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(C0915R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(C0915R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    @Deprecated
    public static float getAlpha(View view) {
        return view.getAlpha();
    }

    @hib
    public static jm0 getAutofillId(@efb View view) {
        return jm0.toAutofillIdCompat(C10243k.getAutofillId(view));
    }

    private static int getAvailableActionIdFromResources(View view, @efb CharSequence charSequence) {
        List<C6730h7.a> actionList = getActionList(view);
        for (int i = 0; i < actionList.size(); i++) {
            if (TextUtils.equals(charSequence, actionList.get(i).getLabel())) {
                return actionList.get(i).getId();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f66758V;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < actionList.size(); i5++) {
                z &= actionList.get(i5).getId() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    @hib
    public static ColorStateList getBackgroundTintList(@efb View view) {
        return C10240h.m18460g(view);
    }

    @hib
    public static PorterDuff.Mode getBackgroundTintMode(@efb View view) {
        return C10240h.m18461h(view);
    }

    @hib
    @Deprecated
    public static Rect getClipBounds(@efb View view) {
        return view.getClipBounds();
    }

    @hib
    public static kv2 getContentCaptureSession(@efb View view) {
        ContentCaptureSession contentCaptureSessionM18513b;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionM18513b = C10245m.m18513b(view)) == null) {
            return null;
        }
        return kv2.toContentCaptureSessionCompat(contentCaptureSessionM18513b, view);
    }

    @hib
    @Deprecated
    public static Display getDisplay(@efb View view) {
        return view.getDisplay();
    }

    public static float getElevation(@efb View view) {
        return C10240h.m18462i(view);
    }

    private static Rect getEmptyTempRect() {
        if (f66757U == null) {
            f66757U = new ThreadLocal<>();
        }
        Rect rect = f66757U.get();
        if (rect == null) {
            rect = new Rect();
            f66757U.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static k4c getFallback(@efb View view) {
        return view instanceof k4c ? (k4c) view : f66759W;
    }

    @Deprecated
    public static boolean getFitsSystemWindows(@efb View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static int getImportantForAccessibility(@efb View view) {
        return view.getImportantForAccessibility();
    }

    @igg({"InlinedApi"})
    public static int getImportantForAutofill(@efb View view) {
        return C10243k.m18489b(view);
    }

    public static int getImportantForContentCapture(@efb View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C10246n.m18518a(view);
        }
        return 0;
    }

    @Deprecated
    public static int getLabelFor(@efb View view) {
        return view.getLabelFor();
    }

    @Deprecated
    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    @Deprecated
    public static int getLayoutDirection(@efb View view) {
        return view.getLayoutDirection();
    }

    @hib
    @Deprecated
    public static Matrix getMatrix(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static int getMeasuredHeightAndState(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static int getMeasuredState(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static int getMeasuredWidthAndState(View view) {
        return view.getMeasuredWidthAndState();
    }

    @Deprecated
    public static int getMinimumHeight(@efb View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static int getMinimumWidth(@efb View view) {
        return view.getMinimumWidth();
    }

    public static int getNextClusterForwardId(@efb View view) {
        return C10243k.m18490c(view);
    }

    @hib
    public static String[] getOnReceiveContentMimeTypes(@efb View view) {
        return Build.VERSION.SDK_INT >= 31 ? C10247o.getReceiveContentMimeTypes(view) : (String[]) view.getTag(C0915R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    @fkd
    @Deprecated
    public static int getPaddingEnd(@efb View view) {
        return view.getPaddingEnd();
    }

    @fkd
    @Deprecated
    public static int getPaddingStart(@efb View view) {
        return view.getPaddingStart();
    }

    @hib
    @Deprecated
    public static ViewParent getParentForAccessibility(@efb View view) {
        return view.getParentForAccessibility();
    }

    @Deprecated
    public static float getPivotX(View view) {
        return view.getPivotX();
    }

    @Deprecated
    public static float getPivotY(View view) {
        return view.getPivotY();
    }

    @hib
    public static smi getRootWindowInsets(@efb View view) {
        return C10241i.getRootWindowInsets(view);
    }

    @Deprecated
    public static float getRotation(View view) {
        return view.getRotation();
    }

    @Deprecated
    public static float getRotationX(View view) {
        return view.getRotationX();
    }

    @Deprecated
    public static float getRotationY(View view) {
        return view.getRotationY();
    }

    @Deprecated
    public static float getScaleX(View view) {
        return view.getScaleX();
    }

    @Deprecated
    public static float getScaleY(View view) {
        return view.getScaleY();
    }

    public static int getScrollIndicators(@efb View view) {
        return C10241i.m18479a(view);
    }

    @hib
    @erh
    public static CharSequence getStateDescription(@efb View view) {
        return stateDescriptionProperty().m18449d(view);
    }

    @efb
    public static List<Rect> getSystemGestureExclusionRects(@efb View view) {
        return Build.VERSION.SDK_INT >= 29 ? C10245m.m18514c(view) : Collections.emptyList();
    }

    @hib
    public static String getTransitionName(@efb View view) {
        return C10240h.m18463j(view);
    }

    @Deprecated
    public static float getTranslationX(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float getTranslationY(View view) {
        return view.getTranslationY();
    }

    public static float getTranslationZ(@efb View view) {
        return C10240h.m18464k(view);
    }

    @hib
    @Deprecated
    public static xni getWindowInsetsController(@efb View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C10246n.getWindowInsetsController(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return oli.getInsetsController(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    public static int getWindowSystemUiVisibility(@efb View view) {
        return view.getWindowSystemUiVisibility();
    }

    @Deprecated
    public static float getX(View view) {
        return view.getX();
    }

    @Deprecated
    public static float getY(View view) {
        return view.getY();
    }

    public static float getZ(@efb View view) {
        return C10240h.m18465l(view);
    }

    public static boolean hasAccessibilityDelegate(@efb View view) {
        return getAccessibilityDelegateInternal(view) != null;
    }

    public static boolean hasExplicitFocusable(@efb View view) {
        return C10243k.m18491d(view);
    }

    public static boolean hasNestedScrollingParent(@efb View view) {
        return C10240h.m18466m(view);
    }

    @Deprecated
    public static boolean hasOnClickListeners(@efb View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean hasOverlappingRendering(@efb View view) {
        return view.hasOverlappingRendering();
    }

    @Deprecated
    public static boolean hasTransientState(@efb View view) {
        return view.hasTransientState();
    }

    @erh
    public static boolean isAccessibilityHeading(@efb View view) {
        Boolean boolM18449d = accessibilityHeadingProperty().m18449d(view);
        return boolM18449d != null && boolM18449d.booleanValue();
    }

    @Deprecated
    public static boolean isAttachedToWindow(@efb View view) {
        return view.isAttachedToWindow();
    }

    public static boolean isFocusedByDefault(@efb View view) {
        return C10243k.m18492e(view);
    }

    public static boolean isImportantForAccessibility(@efb View view) {
        return C10240h.m18467n(view);
    }

    public static boolean isImportantForAutofill(@efb View view) {
        return C10243k.m18493f(view);
    }

    public static boolean isImportantForContentCapture(@efb View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C10246n.m18520c(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isInLayout(@efb View view) {
        return view.isInLayout();
    }

    public static boolean isKeyboardNavigationCluster(@efb View view) {
        return C10243k.m18494g(view);
    }

    @Deprecated
    public static boolean isLaidOut(@efb View view) {
        return view.isLaidOut();
    }

    @Deprecated
    public static boolean isLayoutDirectionResolved(@efb View view) {
        return view.isLayoutDirectionResolved();
    }

    public static boolean isNestedScrollingEnabled(@efb View view) {
        return C10240h.m18468o(view);
    }

    @Deprecated
    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    @Deprecated
    public static boolean isPaddingRelative(@efb View view) {
        return view.isPaddingRelative();
    }

    @erh
    public static boolean isScreenReaderFocusable(@efb View view) {
        Boolean boolM18449d = screenReaderFocusableProperty().m18449d(view);
        return boolM18449d != null && boolM18449d.booleanValue();
    }

    @Deprecated
    public static void jumpDrawablesToCurrentState(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @hib
    public static View keyboardNavigationClusterSearch(@efb View view, @hib View view2, int i) {
        return C10243k.m18495h(view, view2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ uv2 lambda$static$0(uv2 uv2Var) {
        return uv2Var;
    }

    public static void offsetLeftAndRight(@efb View view, int i) {
        view.offsetLeftAndRight(i);
    }

    public static void offsetTopAndBottom(@efb View view, int i) {
        view.offsetTopAndBottom(i);
    }

    @efb
    public static smi onApplyWindowInsets(@efb View view, @efb smi smiVar) {
        WindowInsets windowInsets = smiVar.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsM18452b = C10239g.m18452b(view, windowInsets);
            if (!windowInsetsM18452b.equals(windowInsets)) {
                return smi.toWindowInsetsCompat(windowInsetsM18452b, view);
            }
        }
        return smiVar;
    }

    @Deprecated
    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void onInitializeAccessibilityNodeInfo(@efb View view, @efb C6730h7 c6730h7) {
        view.onInitializeAccessibilityNodeInfo(c6730h7.unwrap());
    }

    @Deprecated
    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    private static AbstractC10238f<CharSequence> paneTitleProperty() {
        return new C10234b(C0915R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Deprecated
    public static boolean performAccessibilityAction(@efb View view, int i, @hib Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static boolean performHapticFeedback(@efb View view, int i) {
        int iM17293a = mg7.m17293a(i);
        if (iM17293a == -1) {
            return false;
        }
        return view.performHapticFeedback(iM17293a);
    }

    @hib
    public static uv2 performReceiveContent(@efb View view, @efb uv2 uv2Var) {
        if (Log.isLoggable(f66761a, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(uv2Var);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C10247o.performReceiveContent(view, uv2Var);
        }
        j4c j4cVar = (j4c) view.getTag(C0915R.id.tag_on_receive_content_listener);
        if (j4cVar == null) {
            return getFallback(view).onReceiveContent(uv2Var);
        }
        uv2 uv2VarOnReceiveContent = j4cVar.onReceiveContent(view, uv2Var);
        if (uv2VarOnReceiveContent == null) {
            return null;
        }
        return getFallback(view).onReceiveContent(uv2VarOnReceiveContent);
    }

    @Deprecated
    public static void postInvalidateOnAnimation(@efb View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void postOnAnimation(@efb View view, @efb Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @igg({"LambdaLast"})
    @Deprecated
    public static void postOnAnimationDelayed(@efb View view, @efb Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static void removeAccessibilityAction(@efb View view, int i) {
        removeActionWithId(i, view);
        m18430e(view, 0);
    }

    private static void removeActionWithId(int i, View view) {
        List<C6730h7.a> actionList = getActionList(view);
        for (int i2 = 0; i2 < actionList.size(); i2++) {
            if (actionList.get(i2).getId() == i) {
                actionList.remove(i2);
                return;
            }
        }
    }

    public static void removeOnUnhandledKeyEventListener(@efb View view, @efb InterfaceC10253u interfaceC10253u) {
        if (Build.VERSION.SDK_INT >= 28) {
            C10244l.m18507e(view, interfaceC10253u);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C0915R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(interfaceC10253u);
            if (arrayList.size() == 0) {
                C10256x.m18525e(view);
            }
        }
    }

    public static void replaceAccessibilityAction(@efb View view, @efb C6730h7.a aVar, @hib CharSequence charSequence, @hib InterfaceC10809p7 interfaceC10809p7) {
        if (interfaceC10809p7 == null && charSequence == null) {
            removeAccessibilityAction(view, aVar.getId());
        } else {
            addAccessibilityAction(view, aVar.createReplacementAction(charSequence, interfaceC10809p7));
        }
    }

    public static void requestApplyInsets(@efb View view) {
        C10239g.m18453c(view);
    }

    @efb
    public static <T extends View> T requireViewById(@efb View view, @kr7 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C10244l.m18508f(view, i);
        }
        T t = (T) view.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static int resolveSizeAndState(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static boolean restoreDefaultFocus(@efb View view) {
        return C10243k.m18496i(view);
    }

    public static void saveAttributeDataForStyleable(@efb View view, @efb @igg({"ContextFirst"}) Context context, @efb int[] iArr, @hib AttributeSet attributeSet, @efb TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C10245m.m18515d(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    private static AbstractC10238f<Boolean> screenReaderFocusableProperty() {
        return new C10233a(C0915R.id.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static void setAccessibilityDelegate(@efb View view, @hib C5603f6 c5603f6) {
        if (c5603f6 == null && (getAccessibilityDelegateInternal(view) instanceof C5603f6.a)) {
            c5603f6 = new C5603f6();
        }
        setImportantForAccessibilityIfNeeded(view);
        view.setAccessibilityDelegate(c5603f6 == null ? null : c5603f6.getBridge());
    }

    @erh
    public static void setAccessibilityHeading(@efb View view, boolean z) {
        accessibilityHeadingProperty().m18450e(view, Boolean.valueOf(z));
    }

    @Deprecated
    public static void setAccessibilityLiveRegion(@efb View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    @erh
    public static void setAccessibilityPaneTitle(@efb View view, @hib CharSequence charSequence) {
        paneTitleProperty().m18450e(view, charSequence);
        if (charSequence != null) {
            f66760X.m18446a(view);
        } else {
            f66760X.m18447b(view);
        }
    }

    @Deprecated
    public static void setActivated(View view, boolean z) {
        view.setActivated(z);
    }

    @Deprecated
    public static void setAlpha(View view, @y46(from = 0.0d, m25645to = 1.0d) float f) {
        view.setAlpha(f);
    }

    public static void setAutofillHints(@efb View view, @hib String... strArr) {
        C10243k.m18497j(view, strArr);
    }

    public static void setAutofillId(@efb View view, @hib jm0 jm0Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            C10244l.setAutofillId(view, jm0Var);
        }
    }

    @Deprecated
    public static void setBackground(@efb View view, @hib Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setBackgroundTintList(@efb View view, @hib ColorStateList colorStateList) {
        C10240h.m18469p(view, colorStateList);
    }

    public static void setBackgroundTintMode(@efb View view, @hib PorterDuff.Mode mode) {
        C10240h.m18470q(view, mode);
    }

    @igg({"BanUncheckedReflection"})
    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z) {
        if (f66754R == null) {
            try {
                f66754R = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                Log.e(f66761a, "Unable to find childrenDrawingOrderEnabled", e);
            }
            f66754R.setAccessible(true);
        }
        try {
            f66754R.invoke(viewGroup, Boolean.valueOf(z));
        } catch (IllegalAccessException e2) {
            Log.e(f66761a, "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (IllegalArgumentException e3) {
            Log.e(f66761a, "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (InvocationTargetException e4) {
            Log.e(f66761a, "Unable to invoke childrenDrawingOrderEnabled", e4);
        }
    }

    @Deprecated
    public static void setClipBounds(@efb View view, @hib Rect rect) {
        view.setClipBounds(rect);
    }

    public static void setContentCaptureSession(@efb View view, @hib kv2 kv2Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            C10245m.m18516e(view, kv2Var);
        }
    }

    public static void setElevation(@efb View view, float f) {
        C10240h.m18471r(view, f);
    }

    @Deprecated
    public static void setFitsSystemWindows(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void setFocusedByDefault(@efb View view, boolean z) {
        C10243k.m18498k(view, z);
    }

    @Deprecated
    public static void setHasTransientState(@efb View view, boolean z) {
        view.setHasTransientState(z);
    }

    @erh
    @Deprecated
    public static void setImportantForAccessibility(@efb View view, int i) {
        view.setImportantForAccessibility(i);
    }

    private static void setImportantForAccessibilityIfNeeded(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void setImportantForAutofill(@efb View view, int i) {
        C10243k.m18499l(view, i);
    }

    public static void setImportantForContentCapture(@efb View view, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C10246n.m18521d(view, i);
        }
    }

    public static void setKeyboardNavigationCluster(@efb View view, boolean z) {
        C10243k.m18500m(view, z);
    }

    @Deprecated
    public static void setLabelFor(@efb View view, @kr7 int i) {
        view.setLabelFor(i);
    }

    @Deprecated
    public static void setLayerPaint(@efb View view, @hib Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    public static void setLayerType(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    @Deprecated
    public static void setLayoutDirection(@efb View view, int i) {
        view.setLayoutDirection(i);
    }

    public static void setNestedScrollingEnabled(@efb View view, boolean z) {
        C10240h.m18472s(view, z);
    }

    public static void setNextClusterForwardId(@efb View view, int i) {
        C10243k.m18501n(view, i);
    }

    public static void setOnApplyWindowInsetsListener(@efb View view, @hib t1c t1cVar) {
        C10240h.m18473t(view, t1cVar);
    }

    public static void setOnReceiveContentListener(@efb View view, @hib String[] strArr, @hib j4c j4cVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            C10247o.setOnReceiveContentListener(view, strArr, j4cVar);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        if (j4cVar != null) {
            z7d.checkArgument(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (strArr[i].startsWith("*")) {
                    z = true;
                    break;
                }
                i++;
            }
            z7d.checkArgument(!z, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(C0915R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(C0915R.id.tag_on_receive_content_listener, j4cVar);
    }

    @Deprecated
    public static void setOverScrollMode(View view, int i) {
        view.setOverScrollMode(i);
    }

    @Deprecated
    public static void setPaddingRelative(@efb View view, @fkd int i, @fkd int i2, @fkd int i3, @fkd int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    @Deprecated
    public static void setPivotX(View view, float f) {
        view.setPivotX(f);
    }

    @Deprecated
    public static void setPivotY(View view, float f) {
        view.setPivotY(f);
    }

    public static void setPointerIcon(@efb View view, @hib b2d b2dVar) {
        C10242j.m18485d(view, (PointerIcon) (b2dVar != null ? b2dVar.getPointerIcon() : null));
    }

    @Deprecated
    public static void setRotation(View view, float f) {
        view.setRotation(f);
    }

    @Deprecated
    public static void setRotationX(View view, float f) {
        view.setRotationX(f);
    }

    @Deprecated
    public static void setRotationY(View view, float f) {
        view.setRotationY(f);
    }

    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    @Deprecated
    public static void setScaleX(View view, float f) {
        view.setScaleX(f);
    }

    @Deprecated
    public static void setScaleY(View view, float f) {
        view.setScaleY(f);
    }

    @erh
    public static void setScreenReaderFocusable(@efb View view, boolean z) {
        screenReaderFocusableProperty().m18450e(view, Boolean.valueOf(z));
    }

    public static void setScrollIndicators(@efb View view, int i) {
        C10241i.m18480b(view, i);
    }

    @erh
    public static void setStateDescription(@efb View view, @hib CharSequence charSequence) {
        stateDescriptionProperty().m18450e(view, charSequence);
    }

    public static void setSystemGestureExclusionRects(@efb View view, @efb List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            C10245m.m18517f(view, list);
        }
    }

    public static void setTooltipText(@efb View view, @hib CharSequence charSequence) {
        C10243k.m18502o(view, charSequence);
    }

    public static void setTransitionName(@efb View view, @hib String str) {
        C10240h.m18474u(view, str);
    }

    @Deprecated
    public static void setTranslationX(View view, float f) {
        view.setTranslationX(f);
    }

    @Deprecated
    public static void setTranslationY(View view, float f) {
        view.setTranslationY(f);
    }

    public static void setTranslationZ(@efb View view, float f) {
        C10240h.m18475v(view, f);
    }

    public static void setWindowInsetsAnimationCallback(@efb View view, @hib xli.AbstractC15190b abstractC15190b) {
        xli.m25291a(view, abstractC15190b);
    }

    @Deprecated
    public static void setX(View view, float f) {
        view.setX(f);
    }

    @Deprecated
    public static void setY(View view, float f) {
        view.setY(f);
    }

    public static void setZ(@efb View view, float f) {
        C10240h.m18476w(view, f);
    }

    public static boolean startDragAndDrop(@efb View view, @hib ClipData clipData, @efb View.DragShadowBuilder dragShadowBuilder, @hib Object obj, int i) {
        return C10242j.m18486e(view, clipData, dragShadowBuilder, obj, i);
    }

    public static boolean startNestedScroll(@efb View view, int i) {
        return C10240h.m18477x(view, i);
    }

    private static AbstractC10238f<CharSequence> stateDescriptionProperty() {
        return new C10235c(C0915R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    public static void stopNestedScroll(@efb View view) {
        C10240h.m18478y(view);
    }

    private static void tickleInvalidationFlag(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void updateDragShadow(@efb View view, @efb View.DragShadowBuilder dragShadowBuilder) {
        C10242j.m18487f(view, dragShadowBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(@efb View view, int i, int i2, @hib int[] iArr, @hib int[] iArr2, int i3) {
        if (view instanceof pab) {
            return ((pab) view).dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return dispatchNestedPreScroll(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(@efb View view, int i, int i2, int i3, int i4, @hib int[] iArr, int i5, @efb int[] iArr2) {
        if (view instanceof qab) {
            ((qab) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            dispatchNestedScroll(view, i, i2, i3, i4, iArr, i5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(@efb View view, int i) {
        if (view instanceof pab) {
            ((pab) view).hasNestedScrollingParent(i);
            return false;
        }
        if (i == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    @Deprecated
    public static void postInvalidateOnAnimation(@efb View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    public static void setScrollIndicators(@efb View view, int i, int i2) {
        C10241i.m18481c(view, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(@efb View view, int i, int i2) {
        if (view instanceof pab) {
            return ((pab) view).startNestedScroll(i, i2);
        }
        if (i2 == 0) {
            return startNestedScroll(view, i);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(@efb View view, int i) {
        if (view instanceof pab) {
            ((pab) view).stopNestedScroll(i);
        } else if (i == 0) {
            stopNestedScroll(view);
        }
    }

    public static boolean performHapticFeedback(@efb View view, int i, int i2) {
        int iM17293a = mg7.m17293a(i);
        if (iM17293a == -1) {
            return false;
        }
        return view.performHapticFeedback(iM17293a, i2);
    }

    private static void addAccessibilityAction(@efb View view, @efb C6730h7.a aVar) {
        m18429d(view);
        removeActionWithId(aVar.getId(), view);
        getActionList(view).add(aVar);
        m18430e(view, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(@efb View view, int i, int i2, int i3, int i4, @hib int[] iArr, int i5) {
        if (view instanceof pab) {
            return ((pab) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return dispatchNestedScroll(view, i, i2, i3, i4, iArr);
        }
        return false;
    }
}
