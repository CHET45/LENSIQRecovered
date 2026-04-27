package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public class ryg {

    /* JADX INFO: renamed from: a */
    public static volatile Thread f80126a;

    /* JADX INFO: renamed from: b */
    public static volatile Handler f80127b;

    /* JADX INFO: renamed from: c */
    public static volatile ExecutorService f80128c;

    public static void ensureMainThread() {
        if (!isMainThread()) {
            throw new RuntimeException("Must be called on the UI thread");
        }
    }

    private static synchronized ExecutorService getThreadExecutor() {
        try {
            if (f80128c == null) {
                f80128c = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f80128c;
    }

    public static Handler getUiThreadHandler() {
        if (f80127b == null) {
            f80127b = new Handler(Looper.getMainLooper());
        }
        return f80127b;
    }

    public static boolean isMainThread() {
        if (f80126a == null) {
            f80126a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f80126a;
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
