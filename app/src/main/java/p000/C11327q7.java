package p000;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

/* JADX INFO: renamed from: q7 */
/* JADX INFO: loaded from: classes3.dex */
public class C11327q7 {

    /* JADX INFO: renamed from: b */
    public static final int f73353b = -1;

    /* JADX INFO: renamed from: c */
    public static final int f73354c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f73355d = 2;

    /* JADX INFO: renamed from: e */
    public static final int f73356e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f73357f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f73358g = 5;

    /* JADX INFO: renamed from: h */
    public static final int f73359h = 6;

    /* JADX INFO: renamed from: a */
    public final Object f73360a;

    /* JADX INFO: renamed from: q7$a */
    @c5e(21)
    public static class a {
        private a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static void m20082a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static AccessibilityWindowInfo m20083b(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static int m20084c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static int m20085d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static int m20086e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static AccessibilityWindowInfo m20087f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @ih4
        /* JADX INFO: renamed from: g */
        public static AccessibilityNodeInfo m20088g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @ih4
        /* JADX INFO: renamed from: h */
        public static int m20089h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @ih4
        /* JADX INFO: renamed from: i */
        public static boolean m20090i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @ih4
        /* JADX INFO: renamed from: j */
        public static boolean m20091j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @ih4
        /* JADX INFO: renamed from: k */
        public static boolean m20092k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @ih4
        /* JADX INFO: renamed from: l */
        public static AccessibilityWindowInfo m20093l() {
            return AccessibilityWindowInfo.obtain();
        }

        @ih4
        /* JADX INFO: renamed from: m */
        public static AccessibilityWindowInfo m20094m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    /* JADX INFO: renamed from: q7$b */
    @c5e(24)
    public static class b {
        private b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static AccessibilityNodeInfo m20095a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static CharSequence m20096b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    /* JADX INFO: renamed from: q7$c */
    @c5e(26)
    public static class c {
        private c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static boolean m20097a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    /* JADX INFO: renamed from: q7$d */
    @c5e(30)
    public static class d {
        private d() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static AccessibilityWindowInfo m20098a() {
            return new AccessibilityWindowInfo();
        }
    }

    /* JADX INFO: renamed from: q7$e */
    @c5e(33)
    public static class e {
        private e() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m20099a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static void m20100b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @ih4
        public static C6730h7 getRoot(Object obj, int i) {
            return C6730h7.m12171b(((AccessibilityWindowInfo) obj).getRoot(i));
        }
    }

    /* JADX INFO: renamed from: q7$f */
    @c5e(34)
    public static class f {
        private f() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static LocaleList m20101a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        @ih4
        public static long getTransitionTimeMillis(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public C11327q7() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f73360a = d.m20098a();
        } else {
            this.f73360a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C11327q7 m20081a(Object obj) {
        if (obj != null) {
            return new C11327q7(obj);
        }
        return null;
    }

    @hib
    public static C11327q7 obtain() {
        return m20081a(a.m20093l());
    }

    private static String typeToString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11327q7)) {
            return false;
        }
        C11327q7 c11327q7 = (C11327q7) obj;
        Object obj2 = this.f73360a;
        return obj2 == null ? c11327q7.f73360a == null : obj2.equals(c11327q7.f73360a);
    }

    @hib
    public C6730h7 getAnchor() {
        return C6730h7.m12171b(b.m20095a((AccessibilityWindowInfo) this.f73360a));
    }

    public void getBoundsInScreen(@efb Rect rect) {
        a.m20082a((AccessibilityWindowInfo) this.f73360a, rect);
    }

    @hib
    public C11327q7 getChild(int i) {
        return m20081a(a.m20083b((AccessibilityWindowInfo) this.f73360a, i));
    }

    public int getChildCount() {
        return a.m20084c((AccessibilityWindowInfo) this.f73360a);
    }

    public int getDisplayId() {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.m20099a((AccessibilityWindowInfo) this.f73360a);
        }
        return 0;
    }

    public int getId() {
        return a.m20085d((AccessibilityWindowInfo) this.f73360a);
    }

    public int getLayer() {
        return a.m20086e((AccessibilityWindowInfo) this.f73360a);
    }

    @efb
    public af9 getLocales() {
        return Build.VERSION.SDK_INT >= 34 ? af9.wrap(f.m20101a((AccessibilityWindowInfo) this.f73360a)) : af9.getEmptyLocaleList();
    }

    @hib
    public C11327q7 getParent() {
        return m20081a(a.m20087f((AccessibilityWindowInfo) this.f73360a));
    }

    public void getRegionInScreen(@efb Region region) {
        if (Build.VERSION.SDK_INT >= 33) {
            e.m20100b((AccessibilityWindowInfo) this.f73360a, region);
            return;
        }
        Rect rect = new Rect();
        a.m20082a((AccessibilityWindowInfo) this.f73360a, rect);
        region.set(rect);
    }

    @hib
    public C6730h7 getRoot() {
        return C6730h7.m12171b(a.m20088g((AccessibilityWindowInfo) this.f73360a));
    }

    @hib
    public CharSequence getTitle() {
        return b.m20096b((AccessibilityWindowInfo) this.f73360a);
    }

    public long getTransitionTimeMillis() {
        if (Build.VERSION.SDK_INT >= 34) {
            return f.getTransitionTimeMillis((AccessibilityWindowInfo) this.f73360a);
        }
        return 0L;
    }

    public int getType() {
        return a.m20089h((AccessibilityWindowInfo) this.f73360a);
    }

    public int hashCode() {
        Object obj = this.f73360a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return a.m20090i((AccessibilityWindowInfo) this.f73360a);
    }

    public boolean isActive() {
        return a.m20091j((AccessibilityWindowInfo) this.f73360a);
    }

    public boolean isFocused() {
        return a.m20092k((AccessibilityWindowInfo) this.f73360a);
    }

    public boolean isInPictureInPictureMode() {
        return c.m20097a((AccessibilityWindowInfo) this.f73360a);
    }

    @Deprecated
    public void recycle() {
    }

    @efb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        getBoundsInScreen(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(getId());
        sb.append(", type=");
        sb.append(typeToString(getType()));
        sb.append(", layer=");
        sb.append(getLayer());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(isFocused());
        sb.append(", active=");
        sb.append(isActive());
        sb.append(", hasParent=");
        sb.append(getParent() != null);
        sb.append(", hasChildren=");
        sb.append(getChildCount() > 0);
        sb.append(", transitionTime=");
        sb.append(getTransitionTimeMillis());
        sb.append(", locales=");
        sb.append(getLocales());
        sb.append(C4584d2.f28243l);
        return sb.toString();
    }

    @hib
    public AccessibilityWindowInfo unwrap() {
        return (AccessibilityWindowInfo) this.f73360a;
    }

    @hib
    public static C11327q7 obtain(@hib C11327q7 c11327q7) {
        if (c11327q7 == null) {
            return null;
        }
        return m20081a(a.m20094m((AccessibilityWindowInfo) c11327q7.f73360a));
    }

    @hib
    public C6730h7 getRoot(int i) {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.getRoot(this.f73360a, i);
        }
        return getRoot();
    }

    private C11327q7(Object obj) {
        this.f73360a = obj;
    }
}
