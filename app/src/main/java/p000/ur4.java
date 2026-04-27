package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.C0392R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000.nf1;

/* JADX INFO: loaded from: classes.dex */
public class ur4 extends ListView {

    /* JADX INFO: renamed from: M1 */
    public static final int f88835M1 = -1;

    /* JADX INFO: renamed from: Q */
    public static final int f88836Q = -1;

    /* JADX INFO: renamed from: C */
    public boolean f88837C;

    /* JADX INFO: renamed from: F */
    public boolean f88838F;

    /* JADX INFO: renamed from: H */
    public boolean f88839H;

    /* JADX INFO: renamed from: L */
    public ebi f88840L;

    /* JADX INFO: renamed from: M */
    public ba9 f88841M;

    /* JADX INFO: renamed from: N */
    public RunnableC13666f f88842N;

    /* JADX INFO: renamed from: a */
    public final Rect f88843a;

    /* JADX INFO: renamed from: b */
    public int f88844b;

    /* JADX INFO: renamed from: c */
    public int f88845c;

    /* JADX INFO: renamed from: d */
    public int f88846d;

    /* JADX INFO: renamed from: e */
    public int f88847e;

    /* JADX INFO: renamed from: f */
    public int f88848f;

    /* JADX INFO: renamed from: m */
    public C13664d f88849m;

    /* JADX INFO: renamed from: ur4$a */
    @c5e(21)
    public static class C13661a {
        private C13661a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m23528a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* JADX INFO: renamed from: ur4$b */
    @c5e(30)
    public static class C13662b {

        /* JADX INFO: renamed from: a */
        public static Method f88850a;

        /* JADX INFO: renamed from: b */
        public static Method f88851b;

        /* JADX INFO: renamed from: c */
        public static Method f88852c;

        /* JADX INFO: renamed from: d */
        public static boolean f88853d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f88850a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f88851b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f88852c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f88853d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        private C13662b() {
        }

        /* JADX INFO: renamed from: a */
        public static boolean m23529a() {
            return f88853d;
        }

        @igg({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: b */
        public static void m23530b(ur4 ur4Var, int i, View view) {
            try {
                f88850a.invoke(ur4Var, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f88851b.invoke(ur4Var, Integer.valueOf(i));
                f88852c.invoke(ur4Var, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: ur4$c */
    @c5e(33)
    public static class C13663c {
        private C13663c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m23531a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m23532b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ur4$d */
    public static class C13664d extends vq4 {

        /* JADX INFO: renamed from: b */
        public boolean f88854b;

        public C13664d(Drawable drawable) {
            super(drawable);
            this.f88854b = true;
        }

        /* JADX INFO: renamed from: a */
        public void m23533a(boolean z) {
            this.f88854b = z;
        }

        @Override // p000.vq4, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f88854b) {
                super.draw(canvas);
            }
        }

        @Override // p000.vq4, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f88854b) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p000.vq4, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f88854b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p000.vq4, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f88854b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p000.vq4, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f88854b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ur4$e */
    public static class C13665e {

        /* JADX INFO: renamed from: a */
        public static final Field f88855a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f88855a = declaredField;
        }

        private C13665e() {
        }

        /* JADX INFO: renamed from: a */
        public static boolean m23534a(AbsListView absListView) {
            Field field = f88855a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m23535b(AbsListView absListView, boolean z) {
            Field field = f88855a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ur4$f */
    public class RunnableC13666f implements Runnable {
        public RunnableC13666f() {
        }

        public void cancel() {
            ur4 ur4Var = ur4.this;
            ur4Var.f88842N = null;
            ur4Var.removeCallbacks(this);
        }

        public void post() {
            ur4.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            ur4 ur4Var = ur4.this;
            ur4Var.f88842N = null;
            ur4Var.drawableStateChanged();
        }
    }

    public ur4(@efb Context context, boolean z) {
        super(context, null, C0392R.attr.dropDownListViewStyle);
        this.f88843a = new Rect();
        this.f88844b = 0;
        this.f88845c = 0;
        this.f88846d = 0;
        this.f88847e = 0;
        this.f88838F = z;
        setCacheColorHint(0);
    }

    private void clearPressedItem() {
        this.f88839H = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f88848f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ebi ebiVar = this.f88840L;
        if (ebiVar != null) {
            ebiVar.cancel();
            this.f88840L = null;
        }
    }

    private void clickPressedItem(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    private void drawSelectorCompat(Canvas canvas) {
        Drawable selector;
        if (this.f88843a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f88843a);
        selector.draw(canvas);
    }

    private void positionSelectorCompat(int i, View view) {
        Rect rect = this.f88843a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f88844b;
        rect.top -= this.f88845c;
        rect.right += this.f88846d;
        rect.bottom += this.f88847e;
        boolean zSuperIsSelectedChildViewEnabled = superIsSelectedChildViewEnabled();
        if (view.isEnabled() != zSuperIsSelectedChildViewEnabled) {
            superSetSelectedChildViewEnabled(!zSuperIsSelectedChildViewEnabled);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    private void positionSelectorLikeFocusCompat(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        positionSelectorCompat(i, view);
        if (z) {
            Rect rect = this.f88843a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            yp4.setHotspot(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void positionSelectorLikeTouchCompat(int i, View view, float f, float f2) {
        positionSelectorLikeFocusCompat(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        yp4.setHotspot(selector, f, f2);
    }

    private void setPressedItem(View view, int i, float f, float f2) {
        View childAt;
        this.f88839H = true;
        C13661a.m23528a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f88848f;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f88848f = i;
        C13661a.m23528a(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        positionSelectorLikeTouchCompat(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private void setSelectorEnabled(boolean z) {
        C13664d c13664d = this.f88849m;
        if (c13664d != null) {
            c13664d.m23533a(z);
        }
    }

    @r6c(markerClass = {nf1.InterfaceC9839b.class})
    private boolean superIsSelectedChildViewEnabled() {
        return nf1.isAtLeastT() ? C13663c.m23531a(this) : C13665e.m23534a(this);
    }

    @r6c(markerClass = {nf1.InterfaceC9839b.class})
    private void superSetSelectedChildViewEnabled(boolean z) {
        if (nf1.isAtLeastT()) {
            C13663c.m23532b(this, z);
        } else {
            C13665e.m23535b(this, z);
        }
    }

    private boolean touchModeDrawsInPressedStateCompat() {
        return this.f88839H;
    }

    private void updateSelectorStateCompat() {
        Drawable selector = getSelector();
        if (selector != null && touchModeDrawsInPressedStateCompat() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f88842N != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        updateSelectorStateCompat();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f88838F || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f88838F || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f88838F || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f88838F && this.f88837C) || super.isInTouchMode();
    }

    public int lookForSelectablePosition(int i, boolean z) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    iMin = Math.max(0, i);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i >= 0 && i < count) {
                return i;
            }
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = measuredHeight;
            }
            i6++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f88842N = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onForwardedEvent(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.setPressedItem(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.clickPressedItem(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.clearPressedItem()
        L4d:
            if (r3 == 0) goto L65
            ba9 r9 = r7.f88841M
            if (r9 != 0) goto L5a
            ba9 r9 = new ba9
            r9.<init>(r7)
            r7.f88841M = r9
        L5a:
            ba9 r9 = r7.f88841M
            r9.setEnabled(r1)
            ba9 r9 = r7.f88841M
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            ba9 r8 = r7.f88841M
            if (r8 == 0) goto L6c
            r8.setEnabled(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ur4.onForwardedEvent(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public boolean onHoverEvent(@efb MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f88842N == null) {
            RunnableC13666f runnableC13666f = new RunnableC13666f();
            this.f88842N = runnableC13666f;
            runnableC13666f.post();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C13662b.m23529a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        C13662b.m23530b(this, iPointToPosition, childAt);
                    }
                }
                updateSelectorStateCompat();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f88848f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC13666f runnableC13666f = this.f88842N;
        if (runnableC13666f != null) {
            runnableC13666f.cancel();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f88837C = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C13664d c13664d = drawable != null ? new C13664d(drawable) : null;
        this.f88849m = c13664d;
        super.setSelector(c13664d);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f88844b = rect.left;
        this.f88845c = rect.top;
        this.f88846d = rect.right;
        this.f88847e = rect.bottom;
    }
}
