package p000;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class if4 {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f46727a;

    /* JADX INFO: renamed from: if4$a */
    @c5e(28)
    public static class C7264a {
        private C7264a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static DisplayCutout m13000a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static List<Rect> m13001b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static int m13002c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @ih4
        /* JADX INFO: renamed from: d */
        public static int m13003d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @ih4
        /* JADX INFO: renamed from: e */
        public static int m13004e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @ih4
        /* JADX INFO: renamed from: f */
        public static int m13005f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* JADX INFO: renamed from: if4$b */
    @c5e(29)
    public static class C7265b {
        private C7265b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static DisplayCutout m13006a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* JADX INFO: renamed from: if4$c */
    @c5e(30)
    public static class C7266c {
        private C7266c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static DisplayCutout m13007a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static Insets m13008b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public if4(@hib Rect rect, @hib List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? C7264a.m13000a(rect, list) : null);
    }

    /* JADX INFO: renamed from: b */
    public static if4 m12998b(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new if4(displayCutout);
    }

    private static DisplayCutout constructDisplayCutout(@efb r48 r48Var, @hib Rect rect, @hib Rect rect2, @hib Rect rect3, @hib Rect rect4, @efb r48 r48Var2) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C7266c.m13007a(r48Var.toPlatformInsets(), rect, rect2, rect3, rect4, r48Var2.toPlatformInsets());
        }
        if (i >= 29) {
            return C7265b.m13006a(r48Var.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (i < 28) {
            return null;
        }
        Rect rect5 = new Rect(r48Var.f77014a, r48Var.f77015b, r48Var.f77016c, r48Var.f77017d);
        ArrayList arrayList = new ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return C7264a.m13000a(rect5, arrayList);
    }

    @c5e(28)
    /* JADX INFO: renamed from: a */
    public DisplayCutout m12999a() {
        return this.f46727a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || if4.class != obj.getClass()) {
            return false;
        }
        return pkb.equals(this.f46727a, ((if4) obj).f46727a);
    }

    @efb
    public List<Rect> getBoundingRects() {
        return Build.VERSION.SDK_INT >= 28 ? C7264a.m13001b(this.f46727a) : Collections.emptyList();
    }

    public int getSafeInsetBottom() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C7264a.m13002c(this.f46727a);
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C7264a.m13003d(this.f46727a);
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C7264a.m13004e(this.f46727a);
        }
        return 0;
    }

    public int getSafeInsetTop() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C7264a.m13005f(this.f46727a);
        }
        return 0;
    }

    @efb
    public r48 getWaterfallInsets() {
        return Build.VERSION.SDK_INT >= 30 ? r48.toCompatInsets(C7266c.m13008b(this.f46727a)) : r48.f77013e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f46727a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @efb
    public String toString() {
        return "DisplayCutoutCompat{" + this.f46727a + "}";
    }

    public if4(@efb r48 r48Var, @hib Rect rect, @hib Rect rect2, @hib Rect rect3, @hib Rect rect4, @efb r48 r48Var2) {
        this(constructDisplayCutout(r48Var, rect, rect2, rect3, rect4, r48Var2));
    }

    private if4(DisplayCutout displayCutout) {
        this.f46727a = displayCutout;
    }
}
