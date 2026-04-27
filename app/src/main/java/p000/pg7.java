package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class pg7 {

    /* JADX INFO: renamed from: g */
    public static final String f70687g = "HardwareConfig";

    /* JADX INFO: renamed from: h */
    public static final boolean f70688h;

    /* JADX INFO: renamed from: i */
    public static final boolean f70689i;

    /* JADX INFO: renamed from: j */
    @fdi
    public static final int f70690j = 128;

    /* JADX INFO: renamed from: k */
    public static final int f70691k = 0;

    /* JADX INFO: renamed from: l */
    public static final File f70692l;

    /* JADX INFO: renamed from: m */
    public static final int f70693m = 50;

    /* JADX INFO: renamed from: n */
    public static final int f70694n = 700;

    /* JADX INFO: renamed from: o */
    public static final int f70695o = 20000;

    /* JADX INFO: renamed from: p */
    public static final int f70696p = -1;

    /* JADX INFO: renamed from: q */
    public static volatile pg7 f70697q;

    /* JADX INFO: renamed from: r */
    public static volatile int f70698r;

    /* JADX INFO: renamed from: b */
    public final int f70700b;

    /* JADX INFO: renamed from: c */
    public final int f70701c;

    /* JADX INFO: renamed from: d */
    @xc7("this")
    public int f70702d;

    /* JADX INFO: renamed from: e */
    @xc7("this")
    public boolean f70703e = true;

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f70704f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final boolean f70699a = isHardwareConfigAllowedByDeviceModel();

    static {
        f70688h = Build.VERSION.SDK_INT < 29;
        f70689i = true;
        f70692l = new File("/proc/self/fd");
        f70698r = -1;
    }

    @fdi
    public pg7() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f70700b = 20000;
            this.f70701c = 0;
        } else {
            this.f70700b = 700;
            this.f70701c = 128;
        }
    }

    private boolean areHardwareBitmapsBlockedByAppState() {
        return f70688h && !this.f70704f.get();
    }

    public static pg7 getInstance() {
        if (f70697q == null) {
            synchronized (pg7.class) {
                try {
                    if (f70697q == null) {
                        f70697q = new pg7();
                    }
                } finally {
                }
            }
        }
        return f70697q;
    }

    private int getMaxFdCount() {
        return f70698r != -1 ? f70698r : this.f70700b;
    }

    private synchronized boolean isFdSizeBelowHardwareLimit() {
        try {
            boolean z = true;
            int i = this.f70702d + 1;
            this.f70702d = i;
            if (i >= 50) {
                this.f70702d = 0;
                int length = f70692l.list().length;
                long maxFdCount = getMaxFdCount();
                if (length >= maxFdCount) {
                    z = false;
                }
                this.f70703e = z;
                if (!z && Log.isLoggable(in4.f47579f, 5)) {
                    Log.w(in4.f47579f, "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + maxFdCount);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f70703e;
    }

    private static boolean isHardwareConfigAllowedByDeviceModel() {
        return (isHardwareConfigDisallowedByB112551574() || isHardwareConfigDisallowedByB147430447()) ? false : true;
    }

    private static boolean isHardwareConfigDisallowedByB112551574() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        Iterator it = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isHardwareConfigDisallowedByB147430447() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL);
    }

    @omg(26)
    /* JADX INFO: renamed from: a */
    public boolean m19481a(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zIsHardwareConfigAllowed = isHardwareConfigAllowed(i, i2, z, z2);
        if (zIsHardwareConfigAllowed) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zIsHardwareConfigAllowed;
    }

    public boolean areHardwareBitmapsBlocked() {
        v0i.assertMainThread();
        return !this.f70704f.get();
    }

    public void blockHardwareBitmaps() {
        v0i.assertMainThread();
        this.f70704f.set(false);
    }

    public boolean isHardwareConfigAllowed(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            Log.isLoggable(f70687g, 2);
            return false;
        }
        if (!this.f70699a) {
            Log.isLoggable(f70687g, 2);
            return false;
        }
        if (!f70689i) {
            Log.isLoggable(f70687g, 2);
            return false;
        }
        if (areHardwareBitmapsBlockedByAppState()) {
            Log.isLoggable(f70687g, 2);
            return false;
        }
        if (z2) {
            Log.isLoggable(f70687g, 2);
            return false;
        }
        int i3 = this.f70701c;
        if (i < i3) {
            Log.isLoggable(f70687g, 2);
            return false;
        }
        if (i2 < i3) {
            Log.isLoggable(f70687g, 2);
            return false;
        }
        if (isFdSizeBelowHardwareLimit()) {
            return true;
        }
        Log.isLoggable(f70687g, 2);
        return false;
    }

    public void unblockHardwareBitmaps() {
        v0i.assertMainThread();
        this.f70704f.set(true);
    }
}
