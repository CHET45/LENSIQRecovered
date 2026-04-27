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
@Deprecated
public abstract class tbi<T extends View, Z> extends gu0<Z> {

    /* JADX INFO: renamed from: C */
    public static int f84181C = C2483R.id.glide_custom_view_target_tag;

    /* JADX INFO: renamed from: f */
    public static final String f84182f = "ViewTarget";

    /* JADX INFO: renamed from: m */
    public static boolean f84183m;

    /* JADX INFO: renamed from: a */
    public final T f84184a;

    /* JADX INFO: renamed from: b */
    public final C12972b f84185b;

    /* JADX INFO: renamed from: c */
    @hib
    public View.OnAttachStateChangeListener f84186c;

    /* JADX INFO: renamed from: d */
    public boolean f84187d;

    /* JADX INFO: renamed from: e */
    public boolean f84188e;

    /* JADX INFO: renamed from: tbi$a */
    public class ViewOnAttachStateChangeListenerC12971a implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC12971a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            tbi.this.m22451b();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            tbi.this.m22450a();
        }
    }

    /* JADX INFO: renamed from: tbi$b */
    @fdi
    public static final class C12972b {

        /* JADX INFO: renamed from: e */
        public static final int f84190e = 0;

        /* JADX INFO: renamed from: f */
        @hib
        @fdi
        public static Integer f84191f;

        /* JADX INFO: renamed from: a */
        public final View f84192a;

        /* JADX INFO: renamed from: b */
        public final List<gqf> f84193b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public boolean f84194c;

        /* JADX INFO: renamed from: d */
        @hib
        public a f84195d;

        /* JADX INFO: renamed from: tbi$b$a */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: a */
            public final WeakReference<C12972b> f84196a;

            public a(@efb C12972b c12972b) {
                this.f84196a = new WeakReference<>(c12972b);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(tbi.f84182f, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                C12972b c12972b = this.f84196a.get();
                if (c12972b == null) {
                    return true;
                }
                c12972b.m22452a();
                return true;
            }
        }

        public C12972b(@efb View view) {
            this.f84192a = view;
        }

        private static int getMaxDisplayLength(@efb Context context) {
            if (f84191f == null) {
                Display defaultDisplay = ((WindowManager) t7d.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f84191f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f84191f.intValue();
        }

        private int getTargetDimen(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f84194c && this.f84192a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f84192a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable(tbi.f84182f, 4)) {
                Log.i(tbi.f84182f, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return getMaxDisplayLength(this.f84192a.getContext());
        }

        private int getTargetHeight() {
            int paddingTop = this.f84192a.getPaddingTop() + this.f84192a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f84192a.getLayoutParams();
            return getTargetDimen(this.f84192a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int getTargetWidth() {
            int paddingLeft = this.f84192a.getPaddingLeft() + this.f84192a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f84192a.getLayoutParams();
            return getTargetDimen(this.f84192a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean isDimensionValid(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        private boolean isViewStateAndSizeValid(int i, int i2) {
            return isDimensionValid(i) && isDimensionValid(i2);
        }

        private void notifyCbs(int i, int i2) {
            Iterator it = new ArrayList(this.f84193b).iterator();
            while (it.hasNext()) {
                ((gqf) it.next()).onSizeReady(i, i2);
            }
        }

        /* JADX INFO: renamed from: a */
        public void m22452a() {
            if (this.f84193b.isEmpty()) {
                return;
            }
            int targetWidth = getTargetWidth();
            int targetHeight = getTargetHeight();
            if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
                notifyCbs(targetWidth, targetHeight);
                m22453b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m22453b() {
            ViewTreeObserver viewTreeObserver = this.f84192a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f84195d);
            }
            this.f84195d = null;
            this.f84193b.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m22454c(@efb gqf gqfVar) {
            int targetWidth = getTargetWidth();
            int targetHeight = getTargetHeight();
            if (isViewStateAndSizeValid(targetWidth, targetHeight)) {
                gqfVar.onSizeReady(targetWidth, targetHeight);
                return;
            }
            if (!this.f84193b.contains(gqfVar)) {
                this.f84193b.add(gqfVar);
            }
            if (this.f84195d == null) {
                ViewTreeObserver viewTreeObserver = this.f84192a.getViewTreeObserver();
                a aVar = new a(this);
                this.f84195d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m22455d(@efb gqf gqfVar) {
            this.f84193b.remove(gqfVar);
        }
    }

    public tbi(@efb T t) {
        this.f84184a = (T) t7d.checkNotNull(t);
        this.f84185b = new C12972b(t);
    }

    @hib
    private Object getTag() {
        return this.f84184a.getTag(f84181C);
    }

    private void maybeAddAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f84186c;
        if (onAttachStateChangeListener == null || this.f84188e) {
            return;
        }
        this.f84184a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f84188e = true;
    }

    private void maybeRemoveAttachStateListener() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f84186c;
        if (onAttachStateChangeListener == null || !this.f84188e) {
            return;
        }
        this.f84184a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f84188e = false;
    }

    private void setTag(@hib Object obj) {
        f84183m = true;
        this.f84184a.setTag(f84181C, obj);
    }

    @Deprecated
    public static void setTagId(int i) {
        if (f84183m) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f84181C = i;
    }

    /* JADX INFO: renamed from: a */
    public void m22450a() {
        q3e request = getRequest();
        if (request != null) {
            this.f84187d = true;
            request.clear();
            this.f84187d = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m22451b() {
        q3e request = getRequest();
        if (request == null || !request.isCleared()) {
            return;
        }
        request.begin();
    }

    @efb
    public final tbi<T, Z> clearOnDetach() {
        if (this.f84186c != null) {
            return this;
        }
        this.f84186c = new ViewOnAttachStateChangeListenerC12971a();
        maybeAddAttachStateListener();
        return this;
    }

    @Override // p000.gu0, p000.jmg
    @hib
    public q3e getRequest() {
        Object tag = getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof q3e) {
            return (q3e) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p000.jmg
    @un1
    public void getSize(@efb gqf gqfVar) {
        this.f84185b.m22454c(gqfVar);
    }

    @efb
    public T getView() {
        return this.f84184a;
    }

    @Override // p000.gu0, p000.jmg
    @un1
    public void onLoadCleared(@hib Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f84185b.m22453b();
        if (this.f84187d) {
            return;
        }
        maybeRemoveAttachStateListener();
    }

    @Override // p000.gu0, p000.jmg
    @un1
    public void onLoadStarted(@hib Drawable drawable) {
        super.onLoadStarted(drawable);
        maybeAddAttachStateListener();
    }

    @Override // p000.jmg
    @un1
    public void removeCallback(@efb gqf gqfVar) {
        this.f84185b.m22455d(gqfVar);
    }

    @Override // p000.gu0, p000.jmg
    public void setRequest(@hib q3e q3eVar) {
        setTag(q3eVar);
    }

    public String toString() {
        return "Target for: " + this.f84184a;
    }

    @efb
    public final tbi<T, Z> waitForLayout() {
        this.f84185b.f84194c = true;
        return this;
    }

    @Deprecated
    public tbi(@efb T t, boolean z) {
        this(t);
        if (z) {
            waitForLayout();
        }
    }
}
