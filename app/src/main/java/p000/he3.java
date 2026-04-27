package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.C2483R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class he3<T extends View, Z> implements jmg<Z> {

    /* JADX INFO: renamed from: f */
    public static final String f43232f = "CustomViewTarget";

    /* JADX INFO: renamed from: m */
    @kr7
    public static final int f43233m = C2483R.id.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: a */
    public final C6817b f43234a;

    /* JADX INFO: renamed from: b */
    public final T f43235b;

    /* JADX INFO: renamed from: c */
    @hib
    public View.OnAttachStateChangeListener f43236c;

    /* JADX INFO: renamed from: d */
    public boolean f43237d;

    /* JADX INFO: renamed from: e */
    public boolean f43238e;

    /* JADX INFO: renamed from: he3$a */
    public class ViewOnAttachStateChangeListenerC6816a implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC6816a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            he3.this.m12330d();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            he3.this.m12329c();
        }
    }

    /* JADX INFO: renamed from: he3$b */
    @fdi
    public static final class C6817b {

        /* JADX INFO: renamed from: e */
        public static final int f43240e = 0;

        /* JADX INFO: renamed from: f */
        @hib
        @fdi
        public static Integer f43241f;

        /* JADX INFO: renamed from: a */
        public final View f43242a;

        /* JADX INFO: renamed from: b */
        public final List<gqf> f43243b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public boolean f43244c;

        /* JADX INFO: renamed from: d */
        @hib
        public a f43245d;

        /* JADX INFO: renamed from: he3$b$a */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            public final WeakReference<C6817b> f43246a;

            public a(@efb C6817b c6817b) {
                this.f43246a = new WeakReference<>(c6817b);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(he3.f43232f, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                C6817b c6817b = this.f43246a.get();
                if (c6817b == null) {
                    return true;
                }
                c6817b.m12331a();
                return true;
            }
        }

        public C6817b(@efb View view) {
            this.f43242a = view;
        }

        private static int getMaxDisplayLength(@efb Context context) {
            if (f43241f == null) {
                Display defaultDisplay = ((WindowManager) t7d.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f43241f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f43241f.intValue();
        }

        private int getTargetDimen(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f43244c && this.f43242a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f43242a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable(he3.f43232f, 4)) {
                Log.i(he3.f43232f, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return getMaxDisplayLength(this.f43242a.getContext());
        }

        private int getTargetHeight() {
            int paddingTop = this.f43242a.getPaddingTop() + this.f43242a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f43242a.getLayoutParams();
            return getTargetDimen(this.f43242a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int getTargetWidth() {
            int paddingLeft = this.f43242a.getPaddingLeft() + this.f43242a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f43242a.getLayoutParams();
            return getTargetDimen(this.f43242a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean isDimensionValid(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        private boolean isViewStateAndSizeValid(int i, int i2) {
            return isDimensionValid(i) && isDimensionValid(i2);
        }

        private void notifyCbs(int i, int i2) {
            Iterator it = new ArrayList(this.f43243b).iterator();
            while (it.hasNext()) {
                ((gqf) it.next()).onSizeReady(i, i2);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m12331a() {
            if (this.f43243b.isEmpty()) {
                return;
            }
            int targetWidth = getTargetWidth();
            int targetHeight = getTargetHeight();
            if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
                notifyCbs(targetWidth, targetHeight);
                m12332b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m12332b() {
            ViewTreeObserver viewTreeObserver = this.f43242a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f43245d);
            }
            this.f43245d = null;
            this.f43243b.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m12333c(@efb gqf gqfVar) {
            int targetWidth = getTargetWidth();
            int targetHeight = getTargetHeight();
            if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
                gqfVar.onSizeReady(targetWidth, targetHeight);
                return;
            }
            if (!this.f43243b.contains(gqfVar)) {
                this.f43243b.add(gqfVar);
            }
            if (this.f43245d == null) {
                ViewTreeObserver viewTreeObserver = this.f43242a.getViewTreeObserver();
                a aVar = new a(this);
                this.f43245d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m12334d(@efb gqf gqfVar) {
            this.f43243b.remove(gqfVar);
        }
    }

    public he3(@efb T t) {
        this.f43235b = (T) t7d.checkNotNull(t);
        this.f43234a = new C6817b(t);
    }

    @hib
    private Object getTag() {
        return this.f43235b.getTag(f43233m);
    }

    private void maybeAddAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f43236c;
        if (onAttachStateChangeListener == null || this.f43238e) {
            return;
        }
        this.f43235b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f43238e = true;
    }

    private void maybeRemoveAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f43236c;
        if (onAttachStateChangeListener == null || !this.f43238e) {
            return;
        }
        this.f43235b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f43238e = false;
    }

    private void setTag(@hib Object obj) {
        this.f43235b.setTag(f43233m, obj);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo3030a(@hib Drawable drawable);

    /* JADX INFO: renamed from: b */
    public void m12328b(@hib Drawable drawable) {
    }

    /* JADX INFO: renamed from: c */
    public final void m12329c() {
        q3e request = getRequest();
        if (request != null) {
            this.f43237d = true;
            request.clear();
            this.f43237d = false;
        }
    }

    @efb
    public final he3<T, Z> clearOnDetach() {
        if (this.f43236c != null) {
            return this;
        }
        this.f43236c = new ViewOnAttachStateChangeListenerC6816a();
        maybeAddAttachStateListener();
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m12330d() {
        q3e request = getRequest();
        if (request == null || !request.isCleared()) {
            return;
        }
        request.begin();
    }

    @Override // p000.jmg
    @hib
    public final q3e getRequest() {
        Object tag = getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof q3e) {
            return (q3e) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // p000.jmg
    public final void getSize(@efb gqf gqfVar) {
        this.f43234a.m12333c(gqfVar);
    }

    @efb
    public final T getView() {
        return this.f43235b;
    }

    @Override // p000.e59
    public void onDestroy() {
    }

    @Override // p000.jmg
    public final void onLoadCleared(@hib Drawable drawable) {
        this.f43234a.m12332b();
        mo3030a(drawable);
        if (this.f43237d) {
            return;
        }
        maybeRemoveAttachStateListener();
    }

    @Override // p000.jmg
    public final void onLoadStarted(@hib Drawable drawable) {
        maybeAddAttachStateListener();
        m12328b(drawable);
    }

    @Override // p000.e59
    public void onStart() {
    }

    @Override // p000.e59
    public void onStop() {
    }

    @Override // p000.jmg
    public final void removeCallback(@efb gqf gqfVar) {
        this.f43234a.m12334d(gqfVar);
    }

    @Override // p000.jmg
    public final void setRequest(@hib q3e q3eVar) {
        setTag(q3eVar);
    }

    public String toString() {
        return "Target for: " + this.f43235b;
    }

    @Deprecated
    public final he3<T, Z> useTagId(@kr7 int i) {
        return this;
    }

    @efb
    public final he3<T, Z> waitForLayout() {
        this.f43234a.f43244c = true;
        return this;
    }
}
