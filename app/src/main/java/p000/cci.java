package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.C3146R;
import java.util.ArrayList;
import java.util.List;
import p000.p7e;
import p000.smi;

/* JADX INFO: loaded from: classes5.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class cci {

    /* JADX INFO: renamed from: a */
    @c5e(16)
    public static final int f16248a = 768;

    /* JADX INFO: renamed from: cci$a */
    public class RunnableC2268a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f16249a;

        public RunnableC2268a(View view) {
            this.f16249a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f16249a.getContext().getSystemService("input_method")).showSoftInput(this.f16249a, 1);
        }
    }

    /* JADX INFO: renamed from: cci$b */
    public class C2269b implements InterfaceC2272e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f16250a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f16251b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f16252c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC2272e f16253d;

        public C2269b(boolean z, boolean z2, boolean z3, InterfaceC2272e interfaceC2272e) {
            this.f16250a = z;
            this.f16251b = z2;
            this.f16252c = z3;
            this.f16253d = interfaceC2272e;
        }

        @Override // p000.cci.InterfaceC2272e
        @efb
        public smi onApplyWindowInsets(View view, @efb smi smiVar, @efb C2273f c2273f) {
            if (this.f16250a) {
                c2273f.f16259d += smiVar.getSystemWindowInsetBottom();
            }
            boolean zIsLayoutRtl = cci.isLayoutRtl(view);
            if (this.f16251b) {
                if (zIsLayoutRtl) {
                    c2273f.f16258c += smiVar.getSystemWindowInsetLeft();
                } else {
                    c2273f.f16256a += smiVar.getSystemWindowInsetLeft();
                }
            }
            if (this.f16252c) {
                if (zIsLayoutRtl) {
                    c2273f.f16256a += smiVar.getSystemWindowInsetRight();
                } else {
                    c2273f.f16258c += smiVar.getSystemWindowInsetRight();
                }
            }
            c2273f.applyToView(view);
            InterfaceC2272e interfaceC2272e = this.f16253d;
            return interfaceC2272e != null ? interfaceC2272e.onApplyWindowInsets(view, smiVar, c2273f) : smiVar;
        }
    }

    /* JADX INFO: renamed from: cci$c */
    public class C2270c implements t1c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2272e f16254a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2273f f16255b;

        public C2270c(InterfaceC2272e interfaceC2272e, C2273f c2273f) {
            this.f16254a = interfaceC2272e;
            this.f16255b = c2273f;
        }

        @Override // p000.t1c
        public smi onApplyWindowInsets(View view, smi smiVar) {
            return this.f16254a.onApplyWindowInsets(view, smiVar, new C2273f(this.f16255b));
        }
    }

    /* JADX INFO: renamed from: cci$d */
    public class ViewOnAttachStateChangeListenerC2271d implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@efb View view) {
            view.removeOnAttachStateChangeListener(this);
            o8i.requestApplyInsets(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: cci$e */
    public interface InterfaceC2272e {
        smi onApplyWindowInsets(View view, smi smiVar, C2273f c2273f);
    }

    private cci() {
    }

    public static void addOnGlobalLayoutListener(@hib View view, @efb ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @efb
    public static Rect calculateRectFromBounds(@efb View view) {
        return calculateRectFromBounds(view, 0);
    }

    public static void doOnApplyWindowInsets(@efb View view, @hib AttributeSet attributeSet, int i, int i2) {
        doOnApplyWindowInsets(view, attributeSet, i, i2, null);
    }

    public static float dpToPx(@efb Context context, @yc4(unit = 0) int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @hib
    public static Integer getBackgroundColor(@efb View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    @efb
    public static List<View> getChildren(@hib View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                arrayList.add(viewGroup.getChildAt(i));
            }
        }
        return arrayList;
    }

    @hib
    public static ViewGroup getContentView(@hib View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @hib
    public static wai getContentViewOverlay(@efb View view) {
        return getOverlay(getContentView(view));
    }

    @hib
    private static InputMethodManager getInputMethodManager(@efb View view) {
        return (InputMethodManager) lx2.getSystemService(view.getContext(), InputMethodManager.class);
    }

    @hib
    public static wai getOverlay(@hib View view) {
        if (view == null) {
            return null;
        }
        return new uai(view);
    }

    public static float getParentAbsoluteElevation(@efb View view) {
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += o8i.getElevation((View) parent);
        }
        return elevation;
    }

    public static void hideKeyboard(@efb View view) {
        hideKeyboard(view, true);
    }

    public static boolean isLayoutRtl(View view) {
        return o8i.getLayoutDirection(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void removeOnGlobalLayoutListener(@hib View view, @efb ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void requestApplyInsetsWhenAttached(@efb View view) {
        if (o8i.isAttachedToWindow(view)) {
            o8i.requestApplyInsets(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2271d());
        }
    }

    public static void requestFocusAndShowKeyboard(@efb View view) {
        view.requestFocus();
        view.post(new RunnableC2268a(view));
    }

    public static void setBoundsFromRect(@efb View view, @efb Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static void showKeyboard(@efb View view) {
        showKeyboard(view, true);
    }

    @efb
    public static Rect calculateRectFromBounds(@efb View view, int i) {
        return new Rect(view.getLeft(), view.getTop() + i, view.getRight(), view.getBottom() + i);
    }

    public static void doOnApplyWindowInsets(@efb View view, @hib AttributeSet attributeSet, int i, int i2, @hib InterfaceC2272e interfaceC2272e) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C3146R.styleable.Insets, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C3146R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C3146R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C3146R.styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new C2269b(z, z2, z3, interfaceC2272e));
    }

    public static void hideKeyboard(@efb View view, boolean z) {
        xni windowInsetsController;
        if (z && (windowInsetsController = o8i.getWindowInsetsController(view)) != null) {
            windowInsetsController.hide(smi.C12678m.ime());
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void removeOnGlobalLayoutListener(@efb ViewTreeObserver viewTreeObserver, @efb ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void showKeyboard(@efb View view, boolean z) {
        xni windowInsetsController;
        if (!z || (windowInsetsController = o8i.getWindowInsetsController(view)) == null) {
            getInputMethodManager(view).showSoftInput(view, 1);
        } else {
            windowInsetsController.show(smi.C12678m.ime());
        }
    }

    /* JADX INFO: renamed from: cci$f */
    public static class C2273f {

        /* JADX INFO: renamed from: a */
        public int f16256a;

        /* JADX INFO: renamed from: b */
        public int f16257b;

        /* JADX INFO: renamed from: c */
        public int f16258c;

        /* JADX INFO: renamed from: d */
        public int f16259d;

        public C2273f(int i, int i2, int i3, int i4) {
            this.f16256a = i;
            this.f16257b = i2;
            this.f16258c = i3;
            this.f16259d = i4;
        }

        public void applyToView(View view) {
            o8i.setPaddingRelative(view, this.f16256a, this.f16257b, this.f16258c, this.f16259d);
        }

        public C2273f(@efb C2273f c2273f) {
            this.f16256a = c2273f.f16256a;
            this.f16257b = c2273f.f16257b;
            this.f16258c = c2273f.f16258c;
            this.f16259d = c2273f.f16259d;
        }
    }

    public static void doOnApplyWindowInsets(@efb View view, @efb InterfaceC2272e interfaceC2272e) {
        o8i.setOnApplyWindowInsetsListener(view, new C2270c(interfaceC2272e, new C2273f(o8i.getPaddingStart(view), view.getPaddingTop(), o8i.getPaddingEnd(view), view.getPaddingBottom())));
        requestApplyInsetsWhenAttached(view);
    }
}
