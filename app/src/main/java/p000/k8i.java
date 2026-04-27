package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.databinding.library.baseAdapters.C1011R;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@x21({@w21(attribute = "android:backgroundTint", method = "setBackgroundTintList", type = View.class), @w21(attribute = "android:fadeScrollbars", method = "setScrollbarFadingEnabled", type = View.class), @w21(attribute = "android:getOutline", method = "setOutlineProvider", type = View.class), @w21(attribute = "android:nextFocusForward", method = "setNextFocusForwardId", type = View.class), @w21(attribute = "android:nextFocusLeft", method = "setNextFocusLeftId", type = View.class), @w21(attribute = "android:nextFocusRight", method = "setNextFocusRightId", type = View.class), @w21(attribute = "android:nextFocusUp", method = "setNextFocusUpId", type = View.class), @w21(attribute = "android:nextFocusDown", method = "setNextFocusDownId", type = View.class), @w21(attribute = "android:requiresFadingEdge", method = "setVerticalFadingEdgeEnabled", type = View.class), @w21(attribute = "android:scrollbarDefaultDelayBeforeFade", method = "setScrollBarDefaultDelayBeforeFade", type = View.class), @w21(attribute = "android:scrollbarFadeDuration", method = "setScrollBarFadeDuration", type = View.class), @w21(attribute = "android:scrollbarSize", method = "setScrollBarSize", type = View.class), @w21(attribute = "android:scrollbarStyle", method = "setScrollBarStyle", type = View.class), @w21(attribute = "android:transformPivotX", method = "setPivotX", type = View.class), @w21(attribute = "android:transformPivotY", method = "setPivotY", type = View.class), @w21(attribute = "android:onDrag", method = "setOnDragListener", type = View.class), @w21(attribute = "android:onClick", method = "setOnClickListener", type = View.class), @w21(attribute = "android:onApplyWindowInsets", method = "setOnApplyWindowInsetsListener", type = View.class), @w21(attribute = "android:onCreateContextMenu", method = "setOnCreateContextMenuListener", type = View.class), @w21(attribute = "android:onFocusChange", method = "setOnFocusChangeListener", type = View.class), @w21(attribute = "android:onGenericMotion", method = "setOnGenericMotionListener", type = View.class), @w21(attribute = "android:onHover", method = "setOnHoverListener", type = View.class), @w21(attribute = "android:onKey", method = "setOnKeyListener", type = View.class), @w21(attribute = "android:onLongClick", method = "setOnLongClickListener", type = View.class), @w21(attribute = "android:onSystemUiVisibilityChange", method = "setOnSystemUiVisibilityChangeListener", type = View.class), @w21(attribute = "android:onTouch", method = "setOnTouchListener", type = View.class)})
@p7e({p7e.EnumC10826a.f69934a})
public class k8i {

    /* JADX INFO: renamed from: a */
    public static final int f52812a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f52813b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f52814c = 2;

    /* JADX INFO: renamed from: k8i$a */
    public class ViewOnAttachStateChangeListenerC8236a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8237b f52815a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC8238c f52816b;

        public ViewOnAttachStateChangeListenerC8236a(InterfaceC8237b interfaceC8237b, InterfaceC8238c interfaceC8238c) {
            this.f52815a = interfaceC8237b;
            this.f52816b = interfaceC8238c;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            InterfaceC8237b interfaceC8237b = this.f52815a;
            if (interfaceC8237b != null) {
                interfaceC8237b.onViewAttachedToWindow(view);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            InterfaceC8238c interfaceC8238c = this.f52816b;
            if (interfaceC8238c != null) {
                interfaceC8238c.onViewDetachedFromWindow(view);
            }
        }
    }

    /* JADX INFO: renamed from: k8i$b */
    @omg(12)
    public interface InterfaceC8237b {
        void onViewAttachedToWindow(View view);
    }

    /* JADX INFO: renamed from: k8i$c */
    @omg(12)
    public interface InterfaceC8238c {
        void onViewDetachedFromWindow(View view);
    }

    private static int pixelsToDimensionPixelSize(float f) {
        int i = (int) (0.5f + f);
        if (i != 0) {
            return i;
        }
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    @q21({"android:background"})
    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @q21({"android:onClickListener", "android:clickable"})
    public static void setClickListener(View view, View.OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }

    @q21(requireAll = false, value = {"android:onViewDetachedFromWindow", "android:onViewAttachedToWindow"})
    public static void setOnAttachStateChangeListener(View view, InterfaceC8238c interfaceC8238c, InterfaceC8237b interfaceC8237b) {
        ViewOnAttachStateChangeListenerC8236a viewOnAttachStateChangeListenerC8236a = (interfaceC8238c == null && interfaceC8237b == null) ? null : new ViewOnAttachStateChangeListenerC8236a(interfaceC8237b, interfaceC8238c);
        View.OnAttachStateChangeListener onAttachStateChangeListener = (View.OnAttachStateChangeListener) ab9.trackListener(view, viewOnAttachStateChangeListenerC8236a, C1011R.id.onAttachStateChangeListener);
        if (onAttachStateChangeListener != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        if (viewOnAttachStateChangeListenerC8236a != null) {
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC8236a);
        }
    }

    @q21({"android:onClick", "android:clickable"})
    public static void setOnClick(View view, View.OnClickListener onClickListener, boolean z) {
        view.setOnClickListener(onClickListener);
        view.setClickable(z);
    }

    @q21({"android:onLayoutChange"})
    public static void setOnLayoutChangeListener(View view, View.OnLayoutChangeListener onLayoutChangeListener, View.OnLayoutChangeListener onLayoutChangeListener2) {
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        if (onLayoutChangeListener2 != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener2);
        }
    }

    @q21({"android:onLongClick", "android:longClickable"})
    public static void setOnLongClick(View view, View.OnLongClickListener onLongClickListener, boolean z) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z);
    }

    @q21({"android:onLongClickListener", "android:longClickable"})
    public static void setOnLongClickListener(View view, View.OnLongClickListener onLongClickListener, boolean z) {
        view.setOnLongClickListener(onLongClickListener);
        view.setLongClickable(z);
    }

    @q21({"android:padding"})
    public static void setPadding(View view, float f) {
        int iPixelsToDimensionPixelSize = pixelsToDimensionPixelSize(f);
        view.setPadding(iPixelsToDimensionPixelSize, iPixelsToDimensionPixelSize, iPixelsToDimensionPixelSize, iPixelsToDimensionPixelSize);
    }

    @q21({"android:paddingBottom"})
    public static void setPaddingBottom(View view, float f) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), pixelsToDimensionPixelSize(f));
    }

    @q21({"android:paddingEnd"})
    public static void setPaddingEnd(View view, float f) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), pixelsToDimensionPixelSize(f), view.getPaddingBottom());
    }

    @q21({"android:paddingLeft"})
    public static void setPaddingLeft(View view, float f) {
        view.setPadding(pixelsToDimensionPixelSize(f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    @q21({"android:paddingRight"})
    public static void setPaddingRight(View view, float f) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), pixelsToDimensionPixelSize(f), view.getPaddingBottom());
    }

    @q21({"android:paddingStart"})
    public static void setPaddingStart(View view, float f) {
        view.setPaddingRelative(pixelsToDimensionPixelSize(f), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    @q21({"android:paddingTop"})
    public static void setPaddingTop(View view, float f) {
        view.setPadding(view.getPaddingLeft(), pixelsToDimensionPixelSize(f), view.getPaddingRight(), view.getPaddingBottom());
    }

    @q21({"android:requiresFadingEdge"})
    public static void setRequiresFadingEdge(View view, int i) {
        boolean z = (i & 2) != 0;
        boolean z2 = (i & 1) != 0;
        view.setVerticalFadingEdgeEnabled(z);
        view.setHorizontalFadingEdgeEnabled(z2);
    }
}
