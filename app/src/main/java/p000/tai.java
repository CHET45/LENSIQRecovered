package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p000.p7e;

/* JADX INFO: loaded from: classes5.dex */
public class tai implements wai {

    /* JADX INFO: renamed from: a */
    public C12965a f84102a;

    public tai(Context context, ViewGroup viewGroup, View view) {
        this.f84102a = new C12965a(context, viewGroup, view, this);
    }

    /* JADX INFO: renamed from: a */
    public static tai m22445a(View view) {
        ViewGroup contentView = cci.getContentView(view);
        if (contentView == null) {
            return null;
        }
        int childCount = contentView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = contentView.getChildAt(i);
            if (childAt instanceof C12965a) {
                return ((C12965a) childAt).f84107d;
            }
        }
        return new e9i(contentView.getContext(), contentView, view);
    }

    @Override // p000.wai
    public void add(@efb Drawable drawable) {
        this.f84102a.add(drawable);
    }

    @Override // p000.wai
    public void remove(@efb Drawable drawable) {
        this.f84102a.remove(drawable);
    }

    /* JADX INFO: renamed from: tai$a */
    @igg({"ViewConstructor", "PrivateApi"})
    public static class C12965a extends ViewGroup {

        /* JADX INFO: renamed from: f */
        public static Method f84103f;

        /* JADX INFO: renamed from: a */
        public ViewGroup f84104a;

        /* JADX INFO: renamed from: b */
        public View f84105b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Drawable> f84106c;

        /* JADX INFO: renamed from: d */
        public tai f84107d;

        /* JADX INFO: renamed from: e */
        public boolean f84108e;

        static {
            try {
                Class cls = Integer.TYPE;
                f84103f = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public C12965a(Context context, ViewGroup viewGroup, View view, tai taiVar) {
            super(context);
            this.f84106c = null;
            this.f84104a = viewGroup;
            this.f84105b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f84107d = taiVar;
        }

        private void assertNotDisposed() {
            if (this.f84108e) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void disposeIfEmpty() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f84106c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f84108e = true;
                    this.f84104a.removeView(this);
                }
            }
        }

        private void getOffset(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f84104a.getLocationOnScreen(iArr2);
            this.f84105b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @p7e({p7e.EnumC10826a.f69936c})
        /* JADX INFO: renamed from: a */
        public ViewParent m22446a(int i, int i2, Rect rect) {
            if (this.f84104a == null || f84103f == null) {
                return null;
            }
            try {
                getOffset(new int[2]);
                f84103f.invoke(this.f84104a, Integer.valueOf(i), Integer.valueOf(i2), rect);
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public void add(Drawable drawable) {
            assertNotDisposed();
            if (this.f84106c == null) {
                this.f84106c = new ArrayList<>();
            }
            if (this.f84106c.contains(drawable)) {
                return;
            }
            this.f84106c.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.f84104a.getLocationOnScreen(new int[2]);
            this.f84105b.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f84105b.getWidth(), this.f84105b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f84106c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f84106c.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f84104a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f84104a == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            getOffset(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@efb Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        public void remove(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f84106c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                disposeIfEmpty();
            }
        }

        @Override // android.view.View
        public boolean verifyDrawable(@efb Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f84106c) != null && arrayList.contains(drawable));
        }

        public void remove(View view) {
            super.removeView(view);
            disposeIfEmpty();
        }

        public void add(View view) {
            assertNotDisposed();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f84104a && viewGroup.getParent() != null && o8i.isAttachedToWindow(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f84104a.getLocationOnScreen(iArr2);
                    o8i.offsetLeftAndRight(view, iArr[0] - iArr2[0]);
                    o8i.offsetTopAndBottom(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }
    }
}
