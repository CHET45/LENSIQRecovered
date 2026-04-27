package p000;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: renamed from: i6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7156i6 {

    /* JADX INFO: renamed from: i6$a */
    @Deprecated
    public interface a {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    /* JADX INFO: renamed from: i6$b */
    @Deprecated
    public static abstract class b implements a {
    }

    /* JADX INFO: renamed from: i6$c */
    public static class c implements AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: a */
        public a f45815a;

        public c(@efb a aVar) {
            this.f45815a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f45815a.equals(((c) obj).f45815a);
            }
            return false;
        }

        public int hashCode() {
            return this.f45815a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z) {
            this.f45815a.onAccessibilityStateChanged(z);
        }
    }

    /* JADX INFO: renamed from: i6$d */
    @c5e(34)
    public static class d {
        private d() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m12799a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    /* JADX INFO: renamed from: i6$e */
    public interface e {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* JADX INFO: renamed from: i6$f */
    public static final class f implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final e f45816a;

        public f(@efb e eVar) {
            this.f45816a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f45816a.equals(((f) obj).f45816a);
            }
            return false;
        }

        public int hashCode() {
            return this.f45816a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            this.f45816a.onTouchExplorationStateChanged(z);
        }
    }

    private C7156i6() {
    }

    @Deprecated
    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new c(aVar));
    }

    public static boolean addTouchExplorationStateChangeListener(@efb AccessibilityManager accessibilityManager, @efb e eVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new f(eVar));
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    public static boolean isRequestFromAccessibilityTool(@efb AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.m12799a(accessibilityManager);
        }
        return true;
    }

    @Deprecated
    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, a aVar) {
        if (aVar == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new c(aVar));
    }

    public static boolean removeTouchExplorationStateChangeListener(@efb AccessibilityManager accessibilityManager, @efb e eVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new f(eVar));
    }
}
