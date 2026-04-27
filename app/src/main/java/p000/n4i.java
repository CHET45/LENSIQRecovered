package p000;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public final class n4i {

    /* JADX INFO: renamed from: a */
    public static Map<VelocityTracker, o4i> f63303a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: n4i$a */
    @c5e(34)
    public static class C9697a {
        private C9697a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static float m17782a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static float m17783b(VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        @ih4
        /* JADX INFO: renamed from: c */
        public static boolean m17784c(VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }
    }

    /* JADX INFO: renamed from: n4i$b */
    @Retention(RetentionPolicy.SOURCE)
    @p7e({p7e.EnumC10826a.f69936c})
    public @interface InterfaceC9698b {
    }

    private n4i() {
    }

    public static void addMovement(@efb VelocityTracker velocityTracker, @efb MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f63303a.containsKey(velocityTracker)) {
                f63303a.put(velocityTracker, new o4i());
            }
            f63303a.get(velocityTracker).m18349a(motionEvent);
        }
    }

    public static void clear(@efb VelocityTracker velocityTracker) {
        velocityTracker.clear();
        removeFallbackForTracker(velocityTracker);
    }

    public static void computeCurrentVelocity(@efb VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        o4i fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            fallbackTrackerOrNull.m18351c(i, f);
        }
    }

    public static float getAxisVelocity(@efb VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C9697a.m17782a(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        o4i fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            return fallbackTrackerOrNull.m18352d(i);
        }
        return 0.0f;
    }

    @hib
    private static o4i getFallbackTrackerOrNull(VelocityTracker velocityTracker) {
        return f63303a.get(velocityTracker);
    }

    @Deprecated
    public static float getXVelocity(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    @Deprecated
    public static float getYVelocity(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }

    public static boolean isAxisSupported(@efb VelocityTracker velocityTracker, int i) {
        return Build.VERSION.SDK_INT >= 34 ? C9697a.m17784c(velocityTracker, i) : i == 26 || i == 0 || i == 1;
    }

    public static void recycle(@efb VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        removeFallbackForTracker(velocityTracker);
    }

    private static void removeFallbackForTracker(VelocityTracker velocityTracker) {
        f63303a.remove(velocityTracker);
    }

    public static void computeCurrentVelocity(@efb VelocityTracker velocityTracker, int i) {
        computeCurrentVelocity(velocityTracker, i, Float.MAX_VALUE);
    }

    public static float getAxisVelocity(@efb VelocityTracker velocityTracker, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C9697a.m17783b(velocityTracker, i, i2);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity(i2);
        }
        if (i == 1) {
            return velocityTracker.getYVelocity(i2);
        }
        return 0.0f;
    }
}
