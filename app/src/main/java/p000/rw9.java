package p000;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.google.android.material.C3146R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@c5e(21)
public class rw9 extends SharedElementCallback {

    /* JADX INFO: renamed from: f */
    @hib
    public static WeakReference<View> f79934f;

    /* JADX INFO: renamed from: d */
    @hib
    public Rect f79938d;

    /* JADX INFO: renamed from: a */
    public boolean f79935a = true;

    /* JADX INFO: renamed from: b */
    public boolean f79936b = true;

    /* JADX INFO: renamed from: c */
    public boolean f79937c = false;

    /* JADX INFO: renamed from: e */
    @hib
    public InterfaceC12334d f79939e = new C12335e();

    /* JADX INFO: renamed from: rw9$a */
    public class C12331a extends ifh {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Window f79940a;

        public C12331a(Window window) {
            this.f79940a = window;
        }

        @Override // p000.ifh, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            rw9.restoreWindowBackground(this.f79940a);
        }

        @Override // p000.ifh, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            rw9.removeWindowBackground(this.f79940a);
        }
    }

    /* JADX INFO: renamed from: rw9$b */
    public class C12332b extends ifh {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f79942a;

        public C12332b(Activity activity) {
            this.f79942a = activity;
        }

        @Override // p000.ifh, android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view;
            if (rw9.f79934f != null && (view = (View) rw9.f79934f.get()) != null) {
                view.setAlpha(1.0f);
                WeakReference unused = rw9.f79934f = null;
            }
            this.f79942a.finish();
            this.f79942a.overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: rw9$c */
    public class C12333c extends ifh {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Window f79944a;

        public C12333c(Window window) {
            this.f79944a = window;
        }

        @Override // p000.ifh, android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            rw9.removeWindowBackground(this.f79944a);
        }
    }

    /* JADX INFO: renamed from: rw9$d */
    public interface InterfaceC12334d {
        @hib
        n8f provideShape(@efb View view);
    }

    /* JADX INFO: renamed from: rw9$e */
    public static class C12335e implements InterfaceC12334d {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.rw9.InterfaceC12334d
        @hib
        public n8f provideShape(@efb View view) {
            if (view instanceof i9f) {
                return ((i9f) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    @hib
    private static Drawable getWindowBackground(Window window) {
        return window.getDecorView().getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removeWindowBackground(Window window) {
        Drawable windowBackground = getWindowBackground(window);
        if (windowBackground == null) {
            return;
        }
        windowBackground.mutate().setColorFilter(s51.createBlendModeColorFilterCompat(0, y51.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void restoreWindowBackground(Window window) {
        Drawable windowBackground = getWindowBackground(window);
        if (windowBackground == null) {
            return;
        }
        windowBackground.mutate().clearColorFilter();
    }

    private void setUpEnterTransform(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof pw9) {
            pw9 pw9Var = (pw9) sharedElementEnterTransition;
            if (!this.f79937c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f79936b) {
                updateBackgroundFadeDuration(window, pw9Var);
                pw9Var.addListener(new C12331a(window));
            }
        }
    }

    private void setUpReturnTransform(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof pw9) {
            pw9 pw9Var = (pw9) sharedElementReturnTransition;
            pw9Var.setHoldAtEndEnabled(true);
            pw9Var.addListener(new C12332b(activity));
            if (this.f79936b) {
                updateBackgroundFadeDuration(window, pw9Var);
                pw9Var.addListener(new C12333c(window));
            }
        }
    }

    private static void updateBackgroundFadeDuration(Window window, pw9 pw9Var) {
        if (pw9Var.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(pw9Var.getDuration());
        }
    }

    @hib
    public InterfaceC12334d getShapeProvider() {
        return this.f79939e;
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.f79937c;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.f79936b;
    }

    @Override // android.app.SharedElementCallback
    @hib
    public Parcelable onCaptureSharedElementSnapshot(@efb View view, @efb Matrix matrix, @efb RectF rectF) {
        f79934f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @hib
    public View onCreateSnapshotView(@efb Context context, @hib Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        n8f n8fVarProvideShape;
        View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = f79934f) != null && this.f79939e != null && (view = weakReference.get()) != null && (n8fVarProvideShape = this.f79939e.provideShape(view)) != null) {
            viewOnCreateSnapshotView.setTag(C3146R.id.mtrl_motion_snapshot_view, n8fVarProvideShape);
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@efb List<String> list, @efb Map<String, View> map) {
        View view;
        Activity activity;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (activity = jy2.getActivity(view.getContext())) == null) {
            return;
        }
        Window window = activity.getWindow();
        if (this.f79935a) {
            setUpEnterTransform(window);
        } else {
            setUpReturnTransform(activity, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@efb List<String> list, @efb List<View> list2, @efb List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(C3146R.id.mtrl_motion_snapshot_view) instanceof View)) {
            list2.get(0).setTag(C3146R.id.mtrl_motion_snapshot_view, null);
        }
        if (!this.f79935a && !list2.isEmpty()) {
            this.f79938d = qfh.m20339j(list2.get(0));
        }
        this.f79935a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@efb List<String> list, @efb List<View> list2, @efb List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(C3146R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.f79935a || list2.isEmpty() || this.f79938d == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f79938d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f79938d.height(), 1073741824));
        Rect rect = this.f79938d;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setShapeProvider(@hib InterfaceC12334d interfaceC12334d) {
        this.f79939e = interfaceC12334d;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z) {
        this.f79937c = z;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z) {
        this.f79936b = z;
    }
}
