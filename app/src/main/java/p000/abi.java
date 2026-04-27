package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class abi {

    /* JADX INFO: renamed from: a */
    public static final String f1051a = "ViewParentCompat";

    /* JADX INFO: renamed from: b */
    public static int[] f1052b;

    /* JADX INFO: renamed from: abi$a */
    @c5e(21)
    public static class C0171a {
        private C0171a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m412a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m413b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m414c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static void m415d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static void m416e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static boolean m417f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static void m418g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private abi() {
    }

    private static int[] getTempNestedScrollConsumed() {
        int[] iArr = f1052b;
        if (iArr == null) {
            f1052b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f1052b;
    }

    public static void notifySubtreeAccessibilityStateChanged(@efb ViewParent viewParent, @efb View view, @efb View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    public static boolean onNestedFling(@efb ViewParent viewParent, @efb View view, float f, float f2, boolean z) {
        try {
            return C0171a.m412a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e(f1051a, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean onNestedPreFling(@efb ViewParent viewParent, @efb View view, float f, float f2) {
        try {
            return C0171a.m413b(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e(f1051a, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static void onNestedPreScroll(@efb ViewParent viewParent, @efb View view, int i, int i2, @efb int[] iArr) {
        onNestedPreScroll(viewParent, view, i, i2, iArr, 0);
    }

    public static void onNestedScroll(@efb ViewParent viewParent, @efb View view, int i, int i2, int i3, int i4) {
        onNestedScroll(viewParent, view, i, i2, i3, i4, 0, getTempNestedScrollConsumed());
    }

    public static void onNestedScrollAccepted(@efb ViewParent viewParent, @efb View view, @efb View view2, int i) {
        onNestedScrollAccepted(viewParent, view, view2, i, 0);
    }

    public static boolean onStartNestedScroll(@efb ViewParent viewParent, @efb View view, @efb View view2, int i) {
        return onStartNestedScroll(viewParent, view, view2, i, 0);
    }

    public static void onStopNestedScroll(@efb ViewParent viewParent, @efb View view) {
        onStopNestedScroll(viewParent, view, 0);
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void onNestedPreScroll(@efb ViewParent viewParent, @efb View view, int i, int i2, @efb int[] iArr, int i3) {
        if (viewParent instanceof tab) {
            ((tab) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                C0171a.m414c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e(f1051a, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void onNestedScrollAccepted(@efb ViewParent viewParent, @efb View view, @efb View view2, int i, int i2) {
        if (viewParent instanceof tab) {
            ((tab) viewParent).onNestedScrollAccepted(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                C0171a.m416e(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e(f1051a, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static boolean onStartNestedScroll(@efb ViewParent viewParent, @efb View view, @efb View view2, int i, int i2) {
        if (viewParent instanceof tab) {
            return ((tab) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return C0171a.m417f(viewParent, view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e(f1051a, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    public static void onStopNestedScroll(@efb ViewParent viewParent, @efb View view, int i) {
        if (viewParent instanceof tab) {
            ((tab) viewParent).onStopNestedScroll(view, i);
            return;
        }
        if (i == 0) {
            try {
                C0171a.m418g(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e(f1051a, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static void onNestedScroll(@efb ViewParent viewParent, @efb View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(viewParent, view, i, i2, i3, i4, i5, getTempNestedScrollConsumed());
    }

    public static void onNestedScroll(@efb ViewParent viewParent, @efb View view, int i, int i2, int i3, int i4, int i5, @efb int[] iArr) {
        if (viewParent instanceof uab) {
            ((uab) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof tab) {
            ((tab) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                C0171a.m415d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e(f1051a, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }
}
