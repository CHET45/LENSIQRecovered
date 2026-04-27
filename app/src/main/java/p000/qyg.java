package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes6.dex */
public class qyg {

    /* JADX INFO: renamed from: a */
    public static volatile Thread f76322a;

    /* JADX INFO: renamed from: b */
    public static volatile Handler f76323b;

    /* JADX INFO: renamed from: c */
    public static volatile ExecutorService f76324c;

    public static void ensureMainThread() {
        if (!isMainThread()) {
            throw new RuntimeException("Must be called on the UI thread");
        }
    }

    private static synchronized ExecutorService getThreadExecutor() {
        try {
            if (f76324c == null) {
                f76324c = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f76324c;
    }

    public static Handler getUiThreadHandler() {
        if (f76323b == null) {
            f76323b = new Handler(Looper.getMainLooper());
        }
        return f76323b;
    }

    public static boolean isMainThread() {
        if (f76322a == null) {
            f76322a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f76322a;
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
