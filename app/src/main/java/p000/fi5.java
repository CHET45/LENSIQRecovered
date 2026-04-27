package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import p000.kn6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fi5 extends C5603f6 {

    /* JADX INFO: renamed from: k */
    public static final int f36774k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public static final int f36775l = -1;

    /* JADX INFO: renamed from: m */
    public static final String f36776m = "android.view.View";

    /* JADX INFO: renamed from: n */
    public static final Rect f36777n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o */
    public static final kn6.InterfaceC8461a<C6730h7> f36778o = new C5838a();

    /* JADX INFO: renamed from: p */
    public static final kn6.InterfaceC8462b<mxf<C6730h7>, C6730h7> f36779p = new C5839b();

    /* JADX INFO: renamed from: e */
    public final AccessibilityManager f36784e;

    /* JADX INFO: renamed from: f */
    public final View f36785f;

    /* JADX INFO: renamed from: g */
    public C5840c f36786g;

    /* JADX INFO: renamed from: a */
    public final Rect f36780a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f36781b = new Rect();

    /* JADX INFO: renamed from: c */
    public final Rect f36782c = new Rect();

    /* JADX INFO: renamed from: d */
    public final int[] f36783d = new int[2];

    /* JADX INFO: renamed from: h */
    public int f36787h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public int f36788i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j */
    public int f36789j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: fi5$a */
    public class C5838a implements kn6.InterfaceC8461a<C6730h7> {
        @Override // p000.kn6.InterfaceC8461a
        public void obtainBounds(C6730h7 c6730h7, Rect rect) {
            c6730h7.getBoundsInParent(rect);
        }
    }

    /* JADX INFO: renamed from: fi5$b */
    public class C5839b implements kn6.InterfaceC8462b<mxf<C6730h7>, C6730h7> {
        @Override // p000.kn6.InterfaceC8462b
        public C6730h7 get(mxf<C6730h7> mxfVar, int i) {
            return mxfVar.valueAt(i);
        }

        @Override // p000.kn6.InterfaceC8462b
        public int size(mxf<C6730h7> mxfVar) {
            return mxfVar.size();
        }
    }

    /* JADX INFO: renamed from: fi5$c */
    public class C5840c extends C9165m7 {
        public C5840c() {
        }

        @Override // p000.C9165m7
        public C6730h7 createAccessibilityNodeInfo(int i) {
            return C6730h7.obtain(fi5.this.m10922c(i));
        }

        @Override // p000.C9165m7
        public C6730h7 findFocus(int i) {
            int i2 = i == 2 ? fi5.this.f36787h : fi5.this.f36788i;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return createAccessibilityNodeInfo(i2);
        }

        @Override // p000.C9165m7
        public boolean performAction(int i, int i2, Bundle bundle) {
            return fi5.this.m10925j(i, i2, bundle);
        }
    }

    public fi5(@efb View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f36785f = view;
        this.f36784e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (o8i.getImportantForAccessibility(view) == 0) {
            o8i.setImportantForAccessibility(view, 1);
        }
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.f36787h != i) {
            return false;
        }
        this.f36787h = Integer.MIN_VALUE;
        this.f36785f.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i = this.f36788i;
        return i != Integer.MIN_VALUE && mo6090d(i, 16, null);
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        return i != -1 ? createEventForChild(i, i2) : createEventForHost(i2);
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        C6730h7 c6730h7M10922c = m10922c(i);
        accessibilityEventObtain.getText().add(c6730h7M10922c.getText());
        accessibilityEventObtain.setContentDescription(c6730h7M10922c.getContentDescription());
        accessibilityEventObtain.setScrollable(c6730h7M10922c.isScrollable());
        accessibilityEventObtain.setPassword(c6730h7M10922c.isPassword());
        accessibilityEventObtain.setEnabled(c6730h7M10922c.isEnabled());
        accessibilityEventObtain.setChecked(c6730h7M10922c.isChecked());
        m10924f(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c6730h7M10922c.getClassName());
        C9716n7.setSource(accessibilityEventObtain, this.f36785f, i);
        accessibilityEventObtain.setPackageName(this.f36785f.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.f36785f.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @efb
    private C6730h7 createNodeForChild(int i) {
        C6730h7 c6730h7Obtain = C6730h7.obtain();
        c6730h7Obtain.setEnabled(true);
        c6730h7Obtain.setFocusable(true);
        c6730h7Obtain.setClassName("android.view.View");
        Rect rect = f36777n;
        c6730h7Obtain.setBoundsInParent(rect);
        c6730h7Obtain.setBoundsInScreen(rect);
        c6730h7Obtain.setParent(this.f36785f);
        mo6092h(i, c6730h7Obtain);
        if (c6730h7Obtain.getText() == null && c6730h7Obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c6730h7Obtain.getBoundsInParent(this.f36781b);
        if (this.f36781b.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = c6730h7Obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c6730h7Obtain.setPackageName(this.f36785f.getContext().getPackageName());
        c6730h7Obtain.setSource(this.f36785f, i);
        if (this.f36787h == i) {
            c6730h7Obtain.setAccessibilityFocused(true);
            c6730h7Obtain.addAction(128);
        } else {
            c6730h7Obtain.setAccessibilityFocused(false);
            c6730h7Obtain.addAction(64);
        }
        boolean z = this.f36788i == i;
        if (z) {
            c6730h7Obtain.addAction(2);
        } else if (c6730h7Obtain.isFocusable()) {
            c6730h7Obtain.addAction(1);
        }
        c6730h7Obtain.setFocused(z);
        this.f36785f.getLocationOnScreen(this.f36783d);
        c6730h7Obtain.getBoundsInScreen(this.f36780a);
        if (this.f36780a.equals(rect)) {
            c6730h7Obtain.getBoundsInParent(this.f36780a);
            if (c6730h7Obtain.f42620b != -1) {
                C6730h7 c6730h7Obtain2 = C6730h7.obtain();
                for (int i2 = c6730h7Obtain.f42620b; i2 != -1; i2 = c6730h7Obtain2.f42620b) {
                    c6730h7Obtain2.setParent(this.f36785f, -1);
                    c6730h7Obtain2.setBoundsInParent(f36777n);
                    mo6092h(i2, c6730h7Obtain2);
                    c6730h7Obtain2.getBoundsInParent(this.f36781b);
                    Rect rect2 = this.f36780a;
                    Rect rect3 = this.f36781b;
                    rect2.offset(rect3.left, rect3.top);
                }
                c6730h7Obtain2.recycle();
            }
            this.f36780a.offset(this.f36783d[0] - this.f36785f.getScrollX(), this.f36783d[1] - this.f36785f.getScrollY());
        }
        if (this.f36785f.getLocalVisibleRect(this.f36782c)) {
            this.f36782c.offset(this.f36783d[0] - this.f36785f.getScrollX(), this.f36783d[1] - this.f36785f.getScrollY());
            if (this.f36780a.intersect(this.f36782c)) {
                c6730h7Obtain.setBoundsInScreen(this.f36780a);
                if (isVisibleToUser(this.f36780a)) {
                    c6730h7Obtain.setVisibleToUser(true);
                }
            }
        }
        return c6730h7Obtain;
    }

    @efb
    private C6730h7 createNodeForHost() {
        C6730h7 c6730h7Obtain = C6730h7.obtain(this.f36785f);
        o8i.onInitializeAccessibilityNodeInfo(this.f36785f, c6730h7Obtain);
        ArrayList arrayList = new ArrayList();
        mo6089b(arrayList);
        if (c6730h7Obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c6730h7Obtain.addChild(this.f36785f, ((Integer) arrayList.get(i)).intValue());
        }
        return c6730h7Obtain;
    }

    private mxf<C6730h7> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        mo6089b(arrayList);
        mxf<C6730h7> mxfVar = new mxf<>();
        for (int i = 0; i < arrayList.size(); i++) {
            mxfVar.put(arrayList.get(i).intValue(), createNodeForChild(arrayList.get(i).intValue()));
        }
        return mxfVar;
    }

    private void getBoundsInParent(int i, Rect rect) {
        m10922c(i).getBoundsInParent(rect);
    }

    private static Rect guessPreviouslyFocusedRect(@efb View view, int i, @efb Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f36785f.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f36785f.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int keyToDirection(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean moveFocus(int i, @hib Rect rect) {
        C6730h7 c6730h7;
        mxf<C6730h7> allNodes = getAllNodes();
        int i2 = this.f36788i;
        C6730h7 c6730h72 = i2 == Integer.MIN_VALUE ? null : allNodes.get(i2);
        if (i == 1 || i == 2) {
            c6730h7 = (C6730h7) kn6.findNextFocusInRelativeDirection(allNodes, f36779p, f36778o, c6730h72, i, o8i.getLayoutDirection(this.f36785f) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i3 = this.f36788i;
            if (i3 != Integer.MIN_VALUE) {
                getBoundsInParent(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.f36785f, i, rect2);
            }
            c6730h7 = (C6730h7) kn6.findNextFocusInAbsoluteDirection(allNodes, f36779p, f36778o, c6730h72, rect2, i);
        }
        return requestKeyboardFocusForVirtualView(c6730h7 != null ? allNodes.keyAt(allNodes.indexOfValue(c6730h7)) : Integer.MIN_VALUE);
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo6090d(i, i2, bundle) : clearAccessibilityFocus(i) : requestAccessibilityFocus(i) : clearKeyboardFocusForVirtualView(i) : requestKeyboardFocusForVirtualView(i);
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        return o8i.performAccessibilityAction(this.f36785f, i, bundle);
    }

    private boolean requestAccessibilityFocus(int i) {
        int i2;
        if (!this.f36784e.isEnabled() || !this.f36784e.isTouchExplorationEnabled() || (i2 = this.f36787h) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i2);
        }
        this.f36787h = i;
        this.f36785f.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.f36789j;
        if (i2 == i) {
            return;
        }
        this.f36789j = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo6088a(float f, float f2);

    /* JADX INFO: renamed from: b */
    public abstract void mo6089b(List<Integer> list);

    @efb
    /* JADX INFO: renamed from: c */
    public C6730h7 m10922c(int i) {
        return i == -1 ? createNodeForHost() : createNodeForChild(i);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.f36788i != i) {
            return false;
        }
        this.f36788i = Integer.MIN_VALUE;
        mo6093i(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo6090d(int i, int i2, @hib Bundle bundle);

    public final boolean dispatchHoverEvent(@efb MotionEvent motionEvent) {
        if (!this.f36784e.isEnabled() || !this.f36784e.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo6088a = mo6088a(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(iMo6088a);
            return iMo6088a != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f36789j == Integer.MIN_VALUE) {
            return false;
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final boolean dispatchKeyEvent(@efb KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return moveFocus(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return moveFocus(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iKeyToDirection = keyToDirection(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i < repeatCount && moveFocus(iKeyToDirection, null)) {
                        i++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        clickKeyboardFocusedVirtualView();
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m10923e(@efb AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: f */
    public void m10924f(int i, @efb AccessibilityEvent accessibilityEvent) {
    }

    /* JADX INFO: renamed from: g */
    public void mo6091g(@efb C6730h7 c6730h7) {
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f36787h;
    }

    @Override // p000.C5603f6
    public C9165m7 getAccessibilityNodeProvider(View view) {
        if (this.f36786g == null) {
            this.f36786g = new C5840c();
        }
        return this.f36786g;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.f36788i;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo6092h(int i, @efb C6730h7 c6730h7);

    /* JADX INFO: renamed from: i */
    public void mo6093i(int i, boolean z) {
    }

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    /* JADX INFO: renamed from: j */
    public boolean m10925j(int i, int i2, Bundle bundle) {
        return i != -1 ? performActionForChild(i, i2, bundle) : performActionForHost(i2, bundle);
    }

    public final void onFocusChanged(boolean z, int i, @hib Rect rect) {
        int i2 = this.f36788i;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    @Override // p000.C5603f6
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        m10923e(accessibilityEvent);
    }

    @Override // p000.C5603f6
    public void onInitializeAccessibilityNodeInfo(View view, C6730h7 c6730h7) {
        super.onInitializeAccessibilityNodeInfo(view, c6730h7);
        mo6091g(c6730h7);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.f36785f.isFocused() && !this.f36785f.requestFocus()) || (i2 = this.f36788i) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f36788i = i;
        mo6093i(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f36784e.isEnabled() || (parent = this.f36785f.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f36785f, createEvent(i, i2));
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f36784e.isEnabled() || (parent = this.f36785f.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i, 2048);
        C6140g6.setContentChangeTypes(accessibilityEventCreateEvent, i2);
        parent.requestSendAccessibilityEvent(this.f36785f, accessibilityEventCreateEvent);
    }
}
