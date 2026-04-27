package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public class ezb {

    /* JADX INFO: renamed from: a */
    public static volatile Thread f34610a;

    /* JADX INFO: renamed from: b */
    public static volatile Handler f34611b;

    /* JADX INFO: renamed from: c */
    public static volatile ExecutorService f34612c;

    public static void ensureMainThread() {
        if (!isMainThread()) {
            throw new RuntimeException("Must be called on the UI thread");
        }
    }

    private static synchronized ExecutorService getThreadExecutor() {
        try {
            if (f34612c == null) {
                f34612c = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f34612c;
    }

    public static Handler getUiThreadHandler() {
        if (f34611b == null) {
            f34611b = new Handler(Looper.getMainLooper());
        }
        return f34611b;
    }

    public static boolean isMainThread() {
        if (f34610a == null) {
            f34610a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f34610a;
    }

    public static Future<?> postOnBackgroundThread(@efb Runnable runnable) {
        return getThreadExecutor().submit(runnable);
    }

    public static void postOnMainThread(@efb Runnable runnable) {
        getUiThreadHandler().post(runnable);
    }

    public static void postOnMainThreadDelayed(Runnable runnable, long j) {
        getUiThreadHandler().postDelayed(runnable, j);
    }

    public static Future<?> postOnBackgroundThread(@efb Callable<?> callable) {
        return getThreadExecutor().submit(callable);
    }
}
