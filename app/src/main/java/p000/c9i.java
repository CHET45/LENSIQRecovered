package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class c9i {

    /* JADX INFO: renamed from: a */
    public static final int f16049a = 0;

    /* JADX INFO: renamed from: b */
    public static final int f16050b = 1;

    /* JADX INFO: renamed from: c9i$a */
    @c5e(21)
    public static class C2245a {
        private C2245a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m3845a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m3846b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static void m3847c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    private c9i() {
    }

    public static int getLayoutMode(@efb ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    public static int getNestedScrollAxes(@efb ViewGroup viewGroup) {
        return C2245a.m3845a(viewGroup);
    }

    public static boolean isTransitionGroup(@efb ViewGroup viewGroup) {
        return C2245a.m3846b(viewGroup);
    }

    @Deprecated
    public static boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void setLayoutMode(@efb ViewGroup viewGroup, int i) {
        viewGroup.setLayoutMode(i);
    }

    @Deprecated
    public static void setMotionEventSplittingEnabled(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    public static void setTransitionGroup(@efb ViewGroup viewGroup, boolean z) {
        C2245a.m3847c(viewGroup, z);
    }
}
