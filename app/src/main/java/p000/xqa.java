package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class xqa {

    /* JADX INFO: renamed from: e */
    public static final String f98976e = "MemorySizeCalculator";

    /* JADX INFO: renamed from: f */
    @fdi
    public static final int f98977f = 4;

    /* JADX INFO: renamed from: g */
    public static final int f98978g = 2;

    /* JADX INFO: renamed from: a */
    public final int f98979a;

    /* JADX INFO: renamed from: b */
    public final int f98980b;

    /* JADX INFO: renamed from: c */
    public final Context f98981c;

    /* JADX INFO: renamed from: d */
    public final int f98982d;

    /* JADX INFO: renamed from: xqa$a */
    public static final class C15254a {

        /* JADX INFO: renamed from: i */
        @fdi
        public static final int f98983i = 2;

        /* JADX INFO: renamed from: j */
        public static final int f98984j = 1;

        /* JADX INFO: renamed from: k */
        public static final float f98985k = 0.4f;

        /* JADX INFO: renamed from: l */
        public static final float f98986l = 0.33f;

        /* JADX INFO: renamed from: m */
        public static final int f98987m = 4194304;

        /* JADX INFO: renamed from: a */
        public final Context f98988a;

        /* JADX INFO: renamed from: b */
        public ActivityManager f98989b;

        /* JADX INFO: renamed from: c */
        public InterfaceC15256c f98990c;

        /* JADX INFO: renamed from: e */
        public float f98992e;

        /* JADX INFO: renamed from: d */
        public float f98991d = 2.0f;

        /* JADX INFO: renamed from: f */
        public float f98993f = 0.4f;

        /* JADX INFO: renamed from: g */
        public float f98994g = 0.33f;

        /* JADX INFO: renamed from: h */
        public int f98995h = 4194304;

        public C15254a(Context context) {
            this.f98992e = f98984j;
            this.f98988a = context;
            this.f98989b = (ActivityManager) context.getSystemService("activity");
            this.f98990c = new C15255b(context.getResources().getDisplayMetrics());
            if (xqa.m25416a(this.f98989b)) {
                this.f98992e = 0.0f;
            }
        }

        @fdi
        /* JADX INFO: renamed from: a */
        public C15254a m25417a(ActivityManager activityManager) {
            this.f98989b = activityManager;
            return this;
        }

        @fdi
        /* JADX INFO: renamed from: b */
        public C15254a m25418b(InterfaceC15256c interfaceC15256c) {
            this.f98990c = interfaceC15256c;
            return this;
        }

        public xqa build() {
            return new xqa(this);
        }

        public C15254a setArrayPoolSize(int i) {
            this.f98995h = i;
            return this;
        }

        public C15254a setBitmapPoolScreens(float f) {
            t7d.checkArgument(f >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.f98992e = f;
            return this;
        }

        public C15254a setLowMemoryMaxSizeMultiplier(float f) {
            t7d.checkArgument(f >= 0.0f && f <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.f98994g = f;
            return this;
        }

        public C15254a setMaxSizeMultiplier(float f) {
            t7d.checkArgument(f >= 0.0f && f <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f98993f = f;
            return this;
        }

        public C15254a setMemoryCacheScreens(float f) {
            t7d.checkArgument(f >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.f98991d = f;
            return this;
        }
    }

    /* JADX INFO: renamed from: xqa$b */
    public static final class C15255b implements InterfaceC15256c {

        /* JADX INFO: renamed from: a */
        public final DisplayMetrics f98996a;

        public C15255b(DisplayMetrics displayMetrics) {
            this.f98996a = displayMetrics;
        }

        @Override // p000.xqa.InterfaceC15256c
        public int getHeightPixels() {
            return this.f98996a.heightPixels;
        }

        @Override // p000.xqa.InterfaceC15256c
        public int getWidthPixels() {
            return this.f98996a.widthPixels;
        }
    }

    /* JADX INFO: renamed from: xqa$c */
    public interface InterfaceC15256c {
        int getHeightPixels();

        int getWidthPixels();
    }

    public xqa(C15254a c15254a) {
        this.f98981c = c15254a.f98988a;
        int i = m25416a(c15254a.f98989b) ? c15254a.f98995h / 2 : c15254a.f98995h;
        this.f98982d = i;
        int maxSize = getMaxSize(c15254a.f98989b, c15254a.f98993f, c15254a.f98994g);
        float widthPixels = c15254a.f98990c.getWidthPixels() * c15254a.f98990c.getHeightPixels() * 4;
        int iRound = Math.round(c15254a.f98992e * widthPixels);
        int iRound2 = Math.round(widthPixels * c15254a.f98991d);
        int i2 = maxSize - i;
        int i3 = iRound2 + iRound;
        if (i3 <= i2) {
            this.f98980b = iRound2;
            this.f98979a = iRound;
        } else {
            float f = i2;
            float f2 = c15254a.f98992e;
            float f3 = c15254a.f98991d;
            float f4 = f / (f2 + f3);
            this.f98980b = Math.round(f3 * f4);
            this.f98979a = Math.round(f4 * c15254a.f98992e);
        }
        if (Log.isLoggable(f98976e, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(toMb(this.f98980b));
            sb.append(", pool size: ");
            sb.append(toMb(this.f98979a));
            sb.append(", byte array size: ");
            sb.append(toMb(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > maxSize);
            sb.append(", max size: ");
            sb.append(toMb(maxSize));
            sb.append(", memoryClass: ");
            sb.append(c15254a.f98989b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m25416a(c15254a.f98989b));
        }
    }

    @omg(19)
    /* JADX INFO: renamed from: a */
    public static boolean m25416a(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private static int getMaxSize(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (m25416a(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    private String toMb(int i) {
        return Formatter.formatFileSize(this.f98981c, i);
    }

    public int getArrayPoolSizeInBytes() {
        return this.f98982d;
    }

    public int getBitmapPoolSize() {
        return this.f98979a;
    }

    public int getMemoryCacheSize() {
        return this.f98980b;
    }
}
