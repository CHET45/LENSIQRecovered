package p000;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class cpe {

    /* JADX INFO: renamed from: a */
    public static final String f26732a = "rx2.purge-enabled";

    /* JADX INFO: renamed from: b */
    public static final boolean f26733b;

    /* JADX INFO: renamed from: c */
    public static final String f26734c = "rx2.purge-period-seconds";

    /* JADX INFO: renamed from: d */
    public static final int f26735d;

    /* JADX INFO: renamed from: e */
    public static final AtomicReference<ScheduledExecutorService> f26736e = new AtomicReference<>();

    /* JADX INFO: renamed from: f */
    public static final Map<ScheduledThreadPoolExecutor, Object> f26737f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: cpe$a */
    public static final class RunnableC4449a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(cpe.f26737f.keySet())) {
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    cpe.f26737f.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* JADX INFO: renamed from: cpe$b */
    public static final class C4450b implements py6<String, String> {
        @Override // p000.py6
        public String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    static {
        C4450b c4450b = new C4450b();
        boolean zM8641a = m8641a(true, f26732a, true, true, c4450b);
        f26733b = zM8641a;
        f26735d = m8642b(zM8641a, f26734c, 1, 1, c4450b);
        start();
    }

    private cpe() {
        throw new IllegalStateException("No instances!");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8641a(boolean z, String str, boolean z2, boolean z3, py6<String, String> py6Var) {
        if (!z) {
            return z3;
        }
        try {
            String strApply = py6Var.apply(str);
            return strApply == null ? z2 : "true".equals(strApply);
        } catch (Throwable unused) {
            return z2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m8642b(boolean z, String str, int i, int i2, py6<String, String> py6Var) {
        if (!z) {
            return i2;
        }
        try {
            String strApply = py6Var.apply(str);
            return strApply == null ? i : Integer.parseInt(strApply);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8643c(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f26737f.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m8643c(f26733b, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    /* JADX INFO: renamed from: d */
    public static void m8644d(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f26736e;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new qfe("RxSchedulerPurge"));
            if (v7b.m23844a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                RunnableC4449a runnableC4449a = new RunnableC4449a();
                int i = f26735d;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(runnableC4449a, i, i, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }

    public static void shutdown() {
        ScheduledExecutorService andSet = f26736e.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        f26737f.clear();
    }

    public static void start() {
        m8644d(f26733b);
    }
}
