package p000;

import android.content.Context;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class hi9 {

    /* JADX INFO: renamed from: a */
    public static final String f43736a = "LogFileWriter";

    /* JADX INFO: renamed from: b */
    public static final String f43737b = "android_log_";

    /* JADX INFO: renamed from: c */
    public static final String f43738c = ".txt";

    /* JADX INFO: renamed from: d */
    public static final int f43739d = 10000;

    /* JADX INFO: renamed from: e */
    public static final int f43740e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f43741f = 2048;

    /* JADX INFO: renamed from: h */
    public static volatile long f43743h;

    /* JADX INFO: renamed from: i */
    public static Context f43744i;

    /* JADX INFO: renamed from: m */
    public static ThreadPoolExecutor f43748m;

    /* JADX INFO: renamed from: n */
    public static BlockingQueue<Runnable> f43749n;

    /* JADX INFO: renamed from: o */
    public static ScheduledExecutorService f43750o;

    /* JADX INFO: renamed from: p */
    public static ScheduledFuture<?> f43751p;

    /* JADX INFO: renamed from: q */
    public static BufferedOutputStream f43752q;

    /* JADX INFO: renamed from: r */
    public static String f43753r;

    /* JADX INFO: renamed from: g */
    public static final AtomicInteger f43742g = new AtomicInteger(0);

    /* JADX INFO: renamed from: j */
    public static String f43745j = "unknown";

    /* JADX INFO: renamed from: k */
    public static String f43746k = "unknown";

    /* JADX INFO: renamed from: l */
    public static String f43747l = "unknown";

    /* JADX INFO: renamed from: s */
    public static volatile boolean f43754s = false;

    /* JADX INFO: renamed from: hi9$a */
    public class RejectedExecutionHandlerC6859a implements RejectedExecutionHandler {
        @Override // java.util.concurrent.RejectedExecutionHandler
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            if (threadPoolExecutor.isShutdown()) {
                return;
            }
            threadPoolExecutor.getQueue().poll();
            threadPoolExecutor.execute(runnable);
        }
    }

    /* JADX INFO: renamed from: hi9$b */
    public class RunnableC6860b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (hi9.f43754s) {
                hi9.flushOutputStream();
                long unused = hi9.f43743h = System.currentTimeMillis();
                hi9.f43742g.set(0);
            }
        }
    }

    /* JADX INFO: renamed from: hi9$c */
    public class RunnableC6861c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(100L);
                hi9.ensureOutputStream();
            } catch (Exception e) {
                Log.e(hi9.f43736a, "Re-initialize output stream failed", e);
            }
        }
    }

    /* JADX INFO: renamed from: hi9$d */
    public class RunnableC6862d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CountDownLatch f43755a;

        public RunnableC6862d(CountDownLatch countDownLatch) {
            this.f43755a = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                hi9.flushOutputStream();
            } finally {
                this.f43755a.countDown();
            }
        }
    }

    /* JADX INFO: renamed from: hi9$e */
    public static class RunnableC6863e implements Runnable {
        private RunnableC6863e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            hi9.flushOutputStream();
        }
    }

    /* JADX INFO: renamed from: hi9$f */
    public static class RunnableC6864f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final String f43756a;

        /* JADX INFO: renamed from: b */
        public final String f43757b;

        /* JADX INFO: renamed from: c */
        public final String f43758c;

        public RunnableC6864f(String str, String str2, String str3) {
            this.f43756a = str;
            this.f43757b = str2;
            this.f43758c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (hi9.doWrite(this.f43756a, this.f43757b, this.f43758c)) {
                int iIncrementAndGet = hi9.f43742g.incrementAndGet();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (iIncrementAndGet >= 3 || jCurrentTimeMillis - hi9.f43743h > 1000) {
                    hi9.flushOutputStream();
                    long unused = hi9.f43743h = jCurrentTimeMillis;
                    hi9.f43742g.set(0);
                }
            }
        }
    }

    private static void checkFileStatus() {
        try {
            if (f43753r != null) {
                File file = new File(f43744i.getFilesDir(), f43753r);
                if (file.exists()) {
                    long length = file.length();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Current log file size: ");
                    sb.append(length);
                    sb.append(" bytes");
                    if (length == 0) {
                        Log.w(f43736a, "Log file is 0 bytes, potential issue detected");
                        closeOutputStream();
                        ensureOutputStream();
                    }
                } else {
                    Log.w(f43736a, "Log file does not exist, reinitializing");
                    closeOutputStream();
                    ensureOutputStream();
                }
            }
        } catch (Exception e) {
            Log.e(f43736a, "Check file status failed", e);
        }
    }

    private static synchronized void closeOutputStream() {
        BufferedOutputStream bufferedOutputStream = f43752q;
        if (bufferedOutputStream != null) {
            try {
                try {
                    bufferedOutputStream.flush();
                    f43752q.close();
                } catch (Exception e) {
                    Log.e(f43736a, "Error closing output stream", e);
                }
            } finally {
                f43752q = null;
            }
        }
    }

    public static void debug(String str, String str2) {
        save("DEBUG", str, str2);
    }

    public static void delete() {
        File logFile = getLogFile();
        if (logFile == null || !logFile.exists()) {
            return;
        }
        logFile.delete();
        if (f43754s) {
            forceNewFile();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean doWrite(String str, String str2, String str3) {
        if (!f43754s) {
            Log.e(f43736a, "LogFileWriter not initialized");
            return false;
        }
        if (f43744i == null) {
            Log.e(f43736a, "App context is null");
            return false;
        }
        try {
            ensureOutputStream();
            if (f43752q == null) {
                Log.e(f43736a, "OutputStream is null after ensureOutputStream");
                return false;
            }
            String str4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date());
            String str5 = f43746k;
            String str6 = f43747l;
            if (str6 == null) {
                str6 = "unknown";
            }
            f43752q.write(String.format("%s   %s   %s   %s   UID:%s   IP:%s   App:%s\n", str4, str, str2, str3, str5, str6, f43745j).getBytes("UTF-8"));
            return true;
        } catch (Exception e) {
            Log.e(f43736a, "Write log failed: " + str3, e);
            handleWriteException(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void ensureOutputStream() {
        try {
            try {
                String str = f43737b + new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()) + f43738c;
                if (f43752q == null || !str.equals(f43753r)) {
                    closeOutputStream();
                    File file = new File(f43744i.getFilesDir(), str);
                    f43752q = new BufferedOutputStream(new FileOutputStream(file, true), 2048);
                    f43753r = str;
                    Log.i(f43736a, "Log file created: " + file.getAbsolutePath());
                }
            } catch (Exception e) {
                Log.e(f43736a, "Error ensuring output stream", e);
                f43752q = null;
                f43753r = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void error(String str, String str2) {
        save("ERROR", str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void flushOutputStream() {
        BufferedOutputStream bufferedOutputStream = f43752q;
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.flush();
                checkFileStatus();
            } catch (Exception e) {
                Log.e(f43736a, "Error flushing output stream", e);
                closeOutputStream();
                ensureOutputStream();
            }
        }
    }

    public static void flushSync() {
        if (!f43754s) {
            Log.w(f43736a, "Not initialized, cannot flush");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ThreadPoolExecutor threadPoolExecutor = f43748m;
        if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
            flushOutputStream();
            return;
        }
        try {
            f43748m.execute(new RunnableC6862d(countDownLatch));
            if (countDownLatch.await(3L, TimeUnit.SECONDS)) {
                return;
            }
            Log.w(f43736a, "Flush timeout, forcing direct flush");
            flushOutputStream();
        } catch (Exception e) {
            Log.e(f43736a, "Sync flush failed", e);
            flushOutputStream();
        }
    }

    public static void forceNewFile() {
        if (f43754s) {
            closeOutputStream();
            ensureOutputStream();
            flushOutputStream();
        }
    }

    public static File getLogFile() {
        if (!f43754s) {
            Log.e(f43736a, "LogFileWriter not initialized");
            return null;
        }
        flushSync();
        try {
            File file = new File(f43744i.getFilesDir(), f43737b + new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()) + f43738c);
            if (file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Log file retrieved: ");
                sb.append(file.getAbsolutePath());
                sb.append(", size: ");
                sb.append(file.length());
                sb.append(" bytes");
            } else {
                Log.w(f43736a, "Log file does not exist: " + file.getAbsolutePath());
            }
            return file;
        } catch (Exception e) {
            Log.e(f43736a, "Get log file failed", e);
            return null;
        }
    }

    public static String getStatus() {
        Boolean boolValueOf = Boolean.valueOf(f43754s);
        BlockingQueue<Runnable> blockingQueue = f43749n;
        return String.format("Initialized: %s, QueueSize: %d, FlushCount: %d, LastFlush: %dms ago, File: %s", boolValueOf, Integer.valueOf(blockingQueue != null ? blockingQueue.size() : 0), Integer.valueOf(f43742g.get()), Long.valueOf(System.currentTimeMillis() - f43743h), f43753r);
    }

    private static void handleWriteException(Exception exc) {
        closeOutputStream();
        ThreadPoolExecutor threadPoolExecutor = f43748m;
        if (threadPoolExecutor == null || threadPoolExecutor.isShutdown()) {
            return;
        }
        f43748m.execute(new RunnableC6861c());
    }

    public static void info(String str, String str2) {
        save("INFO", str, str2);
    }

    public static void init(Context context, String str, String str2, String str3) {
        if (context == null) {
            Log.e(f43736a, "Context cannot be null");
            return;
        }
        f43744i = context.getApplicationContext();
        if (str != null) {
            f43745j = str;
        }
        if (str2 != null) {
            f43746k = str2;
        }
        if (str3 != null) {
            f43747l = str3;
        }
        try {
            f43749n = new LinkedBlockingQueue(10000);
            f43748m = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, f43749n, Executors.defaultThreadFactory(), new RejectedExecutionHandlerC6859a());
            ensureOutputStream();
            f43743h = System.currentTimeMillis();
            String str4 = String.format("%s   INFO   %s   LogFileWriter initialized - App:%s\n", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date()), f43736a, f43745j);
            BufferedOutputStream bufferedOutputStream = f43752q;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.write(str4.getBytes("UTF-8"));
                f43752q.flush();
            }
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            f43750o = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            f43751p = scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC6860b(), 1L, 1L, TimeUnit.SECONDS);
            f43754s = true;
            Log.i(f43736a, "LogFileWriter initialized successfully");
        } catch (Exception e) {
            Log.e(f43736a, "Initialization failed", e);
            f43754s = false;
        }
    }

    public static boolean isInitialized() {
        return f43754s;
    }

    public static void save(String str, String str2, String str3) {
        ThreadPoolExecutor threadPoolExecutor;
        if (f43754s && (threadPoolExecutor = f43748m) != null && !threadPoolExecutor.isShutdown()) {
            f43748m.execute(new RunnableC6864f(str, str2, str3));
            return;
        }
        Log.w(f43736a, "LogFileWriter not initialized or shutdown, log discarded: " + str3);
    }

    public static void setUserIp(String str) {
        if (str != null) {
            f43747l = str;
        }
    }

    public static void shutdown() {
        f43754s = false;
        ScheduledFuture<?> scheduledFuture = f43751p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = f43750o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        flushOutputStream();
        ThreadPoolExecutor threadPoolExecutor = f43748m;
        if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
            f43748m.shutdown();
            try {
                if (!f43748m.awaitTermination(3L, TimeUnit.SECONDS)) {
                    f43748m.shutdownNow();
                }
            } catch (InterruptedException unused) {
                f43748m.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
        closeOutputStream();
        Log.i(f43736a, "LogFileWriter shutdown completed");
    }

    public static void warn(String str, String str2) {
        save("WARN", str, str2);
    }

    public static void error(String str, String str2, Throwable th) {
        save("ERROR", str, str2 + ": " + Log.getStackTraceString(th));
    }
}
