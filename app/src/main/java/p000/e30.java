package p000;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class e30 {

    /* JADX INFO: renamed from: a */
    public static final int f31617a = 4;

    /* JADX INFO: renamed from: b */
    public static final int f31618b = 8;

    /* JADX INFO: renamed from: c */
    public static final long f31619c = 60;

    /* JADX INFO: renamed from: d */
    public static final TimeUnit f31620d;

    /* JADX INFO: renamed from: e */
    public static final BlockingQueue<Runnable> f31621e;

    /* JADX INFO: renamed from: f */
    public static final ThreadPoolExecutor f31622f;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f31620d = timeUnit;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(100);
        f31621e = linkedBlockingQueue;
        f31622f = new ThreadPoolExecutor(4, 8, 60L, timeUnit, linkedBlockingQueue, new ThreadPoolExecutor.AbortPolicy());
    }

    public static ExecutorService getExecutor() {
        return f31622f;
    }

    public static void shutdown() {
        ThreadPoolExecutor threadPoolExecutor = f31622f;
        threadPoolExecutor.shutdown();
        try {
            if (threadPoolExecutor.awaitTermination(5L, TimeUnit.SECONDS)) {
                return;
            }
            threadPoolExecutor.shutdownNow();
        } catch (InterruptedException unused) {
            f31622f.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
