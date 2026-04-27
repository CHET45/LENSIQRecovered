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

/* JADX INFO: loaded from: classes3.dex */
public class sai implements xai {

    /* JADX INFO: renamed from: a */
    public C12501a f81070a;

    public sai(Context context, ViewGroup viewGroup, View view) {
        this.f81070a = new C12501a(context, viewGroup, view, this);
    }

    /* JADX INFO: renamed from: a */
    public static sai m21802a(View view) {
        ViewGroup viewGroupM21803b = m21803b(view);
        if (viewGroupM21803b == null) {
            return null;
        }
        int childCount = viewGroupM21803b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroupM21803b.getChildAt(i);
            if (childAt instanceof C12501a) {
                return ((C12501a) childAt).f81075d;
            }
        }
        return new f9i(viewGroupM21803b.getContext(), viewGroupM21803b, view);
    }

    /* JADX INFO: renamed from: b */
    public static ViewGroup m21803b(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // p000.xai
    public void add(@efb Drawable drawable) {
        this.f81070a.add(drawable);
    }

    @Override // p000.xai
    public void remove(@efb Drawable drawable) {
        this.f81070a.remove(drawable);
    }

    /* JADX INFO: renamed from: sai$a */
    public static class C12501a extends ViewGroup {

        /* JADX INFO: renamed from: f */
        public static Method f81071f;

        /* JADX INFO: renamed from: a */
        public ViewGroup f81072a;

        /* JADX INFO: renamed from: b */
        public View f81073b;

        /* JADX INFO: renamed from: c */
        public ArrayList<Drawable> f81074c;

        /* JADX INFO: renamed from: d */
        public sai f81075d;

        /* JADX INFO: renamed from: e */
        public boolean f81076e;

        static {
            try {
                Class cls = Integer.TYPE;
                f81071f = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public C12501a(Context context, ViewGroup viewGroup, View view, sai saiVar) {
            super(context);
            this.f81074c = null;
            this.f81072a = viewGroup;
            this.f81073b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f81075d = saiVar;
        }

        private void assertNotDisposed() {
            if (this.f81076e) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        private void disposeIfEmpty() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f81074c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f81076e = true;
                    this.f81072a.removeView(this);
                }
            }
        }

        private void getOffset(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f81072a.getLocationOnScreen(iArr2);
            this.f81073b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @p7e({p7e.EnumC10826a.f69936c})
        /* JADX INFO: renamed from: a */
        public ViewParent m21804a(int i, int i2, Rect rect) {
            if (this.f81072a == null || f81071f == null) {
                return null;
            }
            try {
                getOffset(new int[2]);
                f81071f.invoke(this.f81072a, Integer.valueOf(i), Integer.valueOf(i2), rect);
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
            if (this.f81074c == null) {
                this.f81074c = new ArrayList<>();
            }
            if (this.f81074c.contains(drawable)) {
                return;
            }
            this.f81074c.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.f81072a.getLocationOnScreen(new int[2]);
            this.f81073b.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f81073b.getWidth(), this.f81073b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f81074c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f81074c.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f81072a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f81072a == null) {
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
            ArrayList<Drawable> arrayList = this.f81074c;
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
            return super.verifyDrawable(drawable) || ((arrayList = this.f81074c) != null && arrayList.contains(drawable));
        }

        public void remove(View view) {
            super.removeView(view);
            disposeIfEmpty();
        }

        public void add(View view) {
            assertNotDisposed();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f81072a && viewGroup.getParent() != null && o8i.isAttachedToWindow(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f81072a.getLocationOnScreen(iArr2);
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
