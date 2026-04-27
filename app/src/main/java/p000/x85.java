package p000;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class x85 {

    /* JADX INFO: renamed from: a */
    public static final long f97171a = 2;

    /* JADX INFO: renamed from: x85$a */
    public class ThreadFactoryC14984a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f97172a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicLong f97173b;

        /* JADX INFO: renamed from: x85$a$a */
        public class a extends do0 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Runnable f97174a;

            public a(Runnable runnable) {
                this.f97174a = runnable;
            }

            @Override // p000.do0
            public void onRun() {
                this.f97174a.run();
            }
        }

        public ThreadFactoryC14984a(String str, AtomicLong atomicLong) {
            this.f97172a = str;
            this.f97173b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new a(runnable));
            threadNewThread.setName(this.f97172a + this.f97173b.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: x85$b */
    public class C14985b extends do0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f97176a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ExecutorService f97177b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f97178c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TimeUnit f97179d;

        public C14985b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f97176a = str;
            this.f97177b = executorService;
            this.f97178c = j;
            this.f97179d = timeUnit;
        }

        @Override // p000.do0
        public void onRun() {
            try {
                ej9.getLogger().m10061d("Executing shutdown hook for " + this.f97176a);
                this.f97177b.shutdown();
                if (this.f97177b.awaitTermination(this.f97178c, this.f97179d)) {
                    return;
                }
                ej9.getLogger().m10061d(this.f97176a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f97177b.shutdownNow();
            } catch (InterruptedException unused) {
                ej9.getLogger().m10061d(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f97176a));
                this.f97177b.shutdownNow();
            }
        }
    }

    private x85() {
    }

    private static void addDelayedShutdownHook(String str, ExecutorService executorService) {
        addDelayedShutdownHook(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static Executor buildSequentialExecutor(Executor executor) {
        return tx5.newSequentialExecutor(executor);
    }

    public static ExecutorService buildSingleThreadExecutorService(String str) {
        ExecutorService executorServiceNewSingleThreadExecutor = newSingleThreadExecutor(getNamedThreadFactory(str), new ThreadPoolExecutor.DiscardPolicy());
        addDelayedShutdownHook(str, executorServiceNewSingleThreadExecutor);
        return executorServiceNewSingleThreadExecutor;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        addDelayedShutdownHook(str, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static ThreadFactory getNamedThreadFactory(String str) {
        return new ThreadFactoryC14984a(str, new AtomicLong(1L));
    }

    @igg({"ThreadPoolCreation"})
    private static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    @igg({"ThreadPoolCreation"})
    private static void addDelayedShutdownHook(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new C14985b(str, executorService, j, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }
}
