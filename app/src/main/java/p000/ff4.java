package p000;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;

/* JADX INFO: loaded from: classes3.dex */
public final class ff4 {

    /* JADX INFO: renamed from: a */
    public static final int f36352a = 3840;

    /* JADX INFO: renamed from: b */
    public static final int f36353b = 2160;

    /* JADX INFO: renamed from: ff4$a */
    @c5e(23)
    public static class C5763a {
        private C5763a() {
        }

        @efb
        /* JADX INFO: renamed from: a */
        public static C5764b m10861a(@efb Context context, @efb Display display) {
            Display.Mode mode = display.getMode();
            Point pointM10859a = ff4.m10859a(context, display);
            return (pointM10859a == null || m10863c(mode, pointM10859a)) ? new C5764b(mode, true) : new C5764b(mode, pointM10859a);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m10862b(@efb Display display) {
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m10863c(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        /* JADX INFO: renamed from: d */
        public static boolean m10864d(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }

        @efb
        @igg({"ArrayReturn"})
        public static C5764b[] getSupportedModes(@efb Context context, @efb Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            C5764b[] c5764bArr = new C5764b[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point pointM10859a = ff4.m10859a(context, display);
            if (pointM10859a == null || m10863c(mode, pointM10859a)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    c5764bArr[i] = new C5764b(supportedModes[i], m10864d(supportedModes[i], mode));
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    c5764bArr[i2] = m10864d(supportedModes[i2], mode) ? new C5764b(supportedModes[i2], pointM10859a) : new C5764b(supportedModes[i2], false);
                }
            }
            return c5764bArr;
        }
    }

    private ff4() {
    }

    /* JADX INFO: renamed from: a */
    public static Point m10859a(@efb Context context, @efb Display display) {
        Point physicalDisplaySizeFromSystemProperties = Build.VERSION.SDK_INT < 28 ? parsePhysicalDisplaySizeFromSystemProperties("sys.display-size", display) : parsePhysicalDisplaySizeFromSystemProperties("vendor.display-size", display);
        if (physicalDisplaySizeFromSystemProperties != null) {
            return physicalDisplaySizeFromSystemProperties;
        }
        if (isSonyBravia4kTv(context) && m10860b(display)) {
            return new Point(3840, f36353b);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m10860b(@efb Display display) {
        return C5763a.m10862b(display);
    }

    @efb
    private static Point getDisplaySize(@efb Context context, @efb Display display) {
        Point pointM10859a = m10859a(context, display);
        if (pointM10859a != null) {
            return pointM10859a;
        }
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    @efb
    public static C5764b getMode(@efb Context context, @efb Display display) {
        return C5763a.m10861a(context, display);
    }

    @efb
    @igg({"ArrayReturn"})
    public static C5764b[] getSupportedModes(@efb Context context, @efb Display display) {
        return C5763a.getSupportedModes(context, display);
    }

    @hib
    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean isSonyBravia4kTv(@efb Context context) {
        return isTv(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    private static boolean isTv(@efb Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    private static Point parseDisplaySize(@efb String str) throws NumberFormatException {
        String[] strArrSplit = str.trim().split("x", -1);
        if (strArrSplit.length == 2) {
            int i = Integer.parseInt(strArrSplit[0]);
            int i2 = Integer.parseInt(strArrSplit[1]);
            if (i > 0 && i2 > 0) {
                return new Point(i, i2);
            }
        }
        throw new NumberFormatException();
    }

    @hib
    private static Point parsePhysicalDisplaySizeFromSystemProperties(@efb String str, @efb Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String systemProperty = getSystemProperty(str);
        if (!TextUtils.isEmpty(systemProperty) && systemProperty != null) {
            try {
                return parseDisplaySize(systemProperty);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ff4$b */
    public static final class C5764b {

        /* JADX INFO: renamed from: a */
        public final Display.Mode f36354a;

        /* JADX INFO: renamed from: b */
        public final Point f36355b;

        /* JADX INFO: renamed from: c */
        public final boolean f36356c;

        /* JADX INFO: renamed from: ff4$b$a */
        @c5e(23)
        public static class a {
            private a() {
            }

            @ih4
            /* JADX INFO: renamed from: a */
            public static int m10865a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @ih4
            /* JADX INFO: renamed from: b */
            public static int m10866b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public C5764b(@efb Point point) {
            z7d.checkNotNull(point, "physicalSize == null");
            this.f36355b = point;
            this.f36354a = null;
            this.f36356c = true;
        }

        public int getPhysicalHeight() {
            return this.f36355b.y;
        }

        public int getPhysicalWidth() {
            return this.f36355b.x;
        }

        @Deprecated
        public boolean isNative() {
            return this.f36356c;
        }

        @c5e(23)
        @hib
        public Display.Mode toMode() {
            return this.f36354a;
        }

        @c5e(23)
        public C5764b(@efb Display.Mode mode, boolean z) {
            z7d.checkNotNull(mode, "mode == null, can't wrap a null reference");
            this.f36355b = new Point(a.m10866b(mode), a.m10865a(mode));
            this.f36354a = mode;
            this.f36356c = z;
        }

        @c5e(23)
        public C5764b(@efb Display.Mode mode, @efb Point point) {
            z7d.checkNotNull(mode, "mode == null, can't wrap a null reference");
            z7d.checkNotNull(point, "physicalSize == null");
            this.f36355b = point;
            this.f36354a = mode;
            this.f36356c = true;
        }
    }
}
