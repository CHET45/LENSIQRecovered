package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public final class v0i {

    /* JADX INFO: renamed from: a */
    public static final int f89638a = 31;

    /* JADX INFO: renamed from: b */
    public static final int f89639b = 17;

    /* JADX INFO: renamed from: c */
    public static final char[] f89640c = tj7.f85043a.toCharArray();

    /* JADX INFO: renamed from: d */
    public static final char[] f89641d = new char[64];

    /* JADX INFO: renamed from: e */
    @hib
    public static volatile Handler f89642e;

    /* JADX INFO: renamed from: v0i$a */
    public static /* synthetic */ class C13809a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f89643a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f89643a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89643a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89643a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89643a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89643a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private v0i() {
    }

    public static void assertBackgroundThread() {
        if (!isOnBackgroundThread()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void assertMainThread() {
        if (!isOnMainThread()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean bothModelsNullEquivalentOrEquals(@hib Object obj, @hib Object obj2) {
        return obj == null ? obj2 == null : obj instanceof twa ? ((twa) obj).isEquivalentTo(obj2) : obj.equals(obj2);
    }

    public static boolean bothNullOrEqual(@hib Object obj, @hib Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @efb
    private static String bytesToHex(@efb byte[] bArr, @efb char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f89640c;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @efb
    public static <T> Queue<T> createQueue(int i) {
        return new ArrayDeque(i);
    }

    @omg(19)
    public static int getBitmapByteSize(@efb Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int getBytesPerPixel(@hib Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C13809a.f89643a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    @Deprecated
    public static int getSize(@efb Bitmap bitmap) {
        return getBitmapByteSize(bitmap);
    }

    @efb
    public static <T> List<T> getSnapshot(@efb Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private static Handler getUiThreadHandler() {
        if (f89642e == null) {
            synchronized (v0i.class) {
                try {
                    if (f89642e == null) {
                        f89642e = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f89642e;
    }

    public static int hashCode(int i) {
        return hashCode(i, 17);
    }

    public static boolean isOnBackgroundThread() {
        return !isOnMainThread();
    }

    public static boolean isOnMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean isValidDimension(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean isValidDimensions(int i, int i2) {
        return isValidDimension(i) && isValidDimension(i2);
    }

    public static void postOnUiThread(Runnable runnable) {
        getUiThreadHandler().post(runnable);
    }

    public static void removeCallbacksOnUiThread(Runnable runnable) {
        getUiThreadHandler().removeCallbacks(runnable);
    }

    @efb
    public static String sha256BytesToHex(@efb byte[] bArr) {
        String strBytesToHex;
        char[] cArr = f89641d;
        synchronized (cArr) {
            strBytesToHex = bytesToHex(bArr, cArr);
        }
        return strBytesToHex;
    }

    public static int hashCode(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int hashCode(float f) {
        return hashCode(f, 17);
    }

    public static int hashCode(float f, int i) {
        return hashCode(Float.floatToIntBits(f), i);
    }

    public static int hashCode(@hib Object obj, int i) {
        return hashCode(obj == null ? 0 : obj.hashCode(), i);
    }

    public static int hashCode(boolean z, int i) {
        return hashCode(z ? 1 : 0, i);
    }

    public static int hashCode(boolean z) {
        return hashCode(z, 17);
    }

    public static int getBitmapByteSize(int i, int i2, @hib Bitmap.Config config) {
        return i * i2 * getBytesPerPixel(config);
    }
}
