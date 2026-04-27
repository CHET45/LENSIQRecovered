package p000;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class x8i {

    /* JADX INFO: renamed from: a */
    public static final String f97209a = "ViewConfigCompat";

    /* JADX INFO: renamed from: b */
    public static final int f97210b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public static final int f97211c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public static final int f97212d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f97213e = -1;

    /* JADX INFO: renamed from: f */
    public static Method f97214f;

    /* JADX INFO: renamed from: x8i$a */
    @c5e(26)
    public static class C14991a {
        private C14991a() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static float m25049a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static float m25050b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* JADX INFO: renamed from: x8i$b */
    @c5e(28)
    public static class C14992b {
        private C14992b() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m25051a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static boolean m25052b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* JADX INFO: renamed from: x8i$c */
    @c5e(34)
    public static class C14993c {
        private C14993c() {
        }

        @ih4
        /* JADX INFO: renamed from: a */
        public static int m25053a(@efb ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        @ih4
        /* JADX INFO: renamed from: b */
        public static int m25054b(@efb ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    private x8i() {
    }

    private static int getCompatFlingVelocityThreshold(Resources resources, int i, ofg<Integer> ofgVar, int i2) {
        int dimensionPixelSize;
        return i != -1 ? (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize : ofgVar.get().intValue();
    }

    private static float getLegacyScrollFactor(ViewConfiguration viewConfiguration, Context context) {
        if (f97214f != null) {
            try {
                return ((Integer) r0.invoke(viewConfiguration, null)).intValue();
            } catch (Exception unused) {
                Log.i(f97209a, "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    private static int getPlatformResId(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    private static int getPreApi34MaximumFlingVelocityResId(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return getPlatformResId(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    private static int getPreApi34MinimumFlingVelocityResId(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return getPlatformResId(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float getScaledHorizontalScrollFactor(@efb ViewConfiguration viewConfiguration, @efb Context context) {
        return C14991a.m25049a(viewConfiguration);
    }

    public static int getScaledHoverSlop(@efb ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? C14992b.m25051a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int getScaledMaximumFlingVelocity(@efb Context context, @efb final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C14993c.m25053a(viewConfiguration, i, i2, i3);
        }
        if (!isInputDeviceInfoValid(i, i2, i3)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int preApi34MaximumFlingVelocityResId = getPreApi34MaximumFlingVelocityResId(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return getCompatFlingVelocityThreshold(resources, preApi34MaximumFlingVelocityResId, new ofg() { // from class: v8i
            @Override // p000.ofg
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int getScaledMinimumFlingVelocity(@efb Context context, @efb final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C14993c.m25054b(viewConfiguration, i, i2, i3);
        }
        if (!isInputDeviceInfoValid(i, i2, i3)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int preApi34MinimumFlingVelocityResId = getPreApi34MinimumFlingVelocityResId(resources, i3, i2);
        Objects.requireNonNull(viewConfiguration);
        return getCompatFlingVelocityThreshold(resources, preApi34MinimumFlingVelocityResId, new ofg() { // from class: w8i
            @Override // p000.ofg
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    @Deprecated
    public static int getScaledPagingTouchSlop(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    public static float getScaledVerticalScrollFactor(@efb ViewConfiguration viewConfiguration, @efb Context context) {
        return C14991a.m25050b(viewConfiguration);
    }

    @Deprecated
    public static boolean hasPermanentMenuKey(ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }

    private static boolean isInputDeviceInfoValid(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(@efb ViewConfiguration viewConfiguration, @efb Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C14992b.m25052b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int platformResId = getPlatformResId(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return platformResId != 0 && resources.getBoolean(platformResId);
    }
}
