package p000;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class b77 implements ExecutorService {

    /* JADX INFO: renamed from: C */
    public static final long f12858C = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: F */
    public static final int f12859F = 4;

    /* JADX INFO: renamed from: H */
    public static volatile int f12860H = 0;

    /* JADX INFO: renamed from: b */
    public static final String f12861b = "source";

    /* JADX INFO: renamed from: c */
    public static final String f12862c = "disk-cache";

    /* JADX INFO: renamed from: d */
    public static final int f12863d = 1;

    /* JADX INFO: renamed from: e */
    public static final String f12864e = "GlideExecutor";

    /* JADX INFO: renamed from: f */
    public static final String f12865f = "source-unlimited";

    /* JADX INFO: renamed from: m */
    public static final String f12866m = "animation";

    /* JADX INFO: renamed from: a */
    public final ExecutorService f12867a;

    /* JADX INFO: renamed from: b77$b */
    public static final class C1766b {

        /* JADX INFO: renamed from: h */
        public static final long f12868h = 0;

        /* JADX INFO: renamed from: a */
        public final boolean f12869a;

        /* JADX INFO: renamed from: b */
        public int f12870b;

        /* JADX INFO: renamed from: c */
        public int f12871c;

        /* JADX INFO: renamed from: d */
        @efb
        public final ThreadFactory f12872d = new ThreadFactoryC1767c();

        /* JADX INFO: renamed from: e */
        @efb
        public InterfaceC1769e f12873e = InterfaceC1769e.f12888d;

        /* JADX INFO: renamed from: f */
        public String f12874f;

        /* JADX INFO: renamed from: g */
        public long f12875g;

        public C1766b(boolean z) {
            this.f12869a = z;
        }

        public b77 build() {
            if (TextUtils.isEmpty(this.f12874f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f12874f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f12870b, this.f12871c, this.f12875g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC1768d(this.f12872d, this.f12874f, this.f12873e, this.f12869a));
            if (this.f12875g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new b77(threadPoolExecutor);
        }

        public C1766b setName(String str) {
            this.f12874f = str;
            return this;
        }

        public C1766b setThreadCount(@h78(from = 1) int i) {
            this.f12870b = i;
            this.f12871c = i;
            return this;
        }

        public C1766b setThreadTimeoutMillis(long j) {
            this.f12875g = j;
            return this;
        }

        public C1766b setUncaughtThrowableStrategy(@efb InterfaceC1769e interfaceC1769e) {
            this.f12873e = interfaceC1769e;
            return this;
        }
    }

    /* JADX INFO: renamed from: b77$c */
    public static final class ThreadFactoryC1767c implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public static final int f12876a = 9;

        /* JADX INFO: renamed from: b77$c$a */
        public class a extends Thread {
            public a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private ThreadFactoryC1767c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@efb Runnable runnable) {
            return new a(runnable);
        }
    }

    /* JADX INFO: renamed from: b77$d */
    public static final class ThreadFactoryC1768d implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final ThreadFactory f12878a;

        /* JADX INFO: renamed from: b */
        public final String f12879b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC1769e f12880c;

        /* JADX INFO: renamed from: d */
        public final boolean f12881d;

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f12882e = new AtomicInteger();

        /* JADX INFO: renamed from: b77$d$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Runnable f12883a;

            public a(Runnable runnable) {
                this.f12883a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ThreadFactoryC1768d.this.f12881d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f12883a.run();
                } catch (Throwable th) {
                    ThreadFactoryC1768d.this.f12880c.handle(th);
                }
            }
        }

        public ThreadFactoryC1768d(ThreadFactory threadFactory, String str, InterfaceC1769e interfaceC1769e, boolean z) {
            this.f12878a = threadFactory;
            this.f12879b = str;
            this.f12880c = interfaceC1769e;
            this.f12881d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@efb Runnable runnable) {
            Thread threadNewThread = this.f12878a.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f12879b + "-thread-" + this.f12882e.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: b77$e */
    public interface InterfaceC1769e {

        /* JADX INFO: renamed from: a */
        public static final InterfaceC1769e f12885a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC1769e f12886b;

        /* JADX INFO: renamed from: c */
        public static final InterfaceC1769e f12887c;

        /* JADX INFO: renamed from: d */
        public static final InterfaceC1769e f12888d;

        /* JADX INFO: renamed from: b77$e$a */
        public class a implements InterfaceC1769e {
            @Override // p000.b77.InterfaceC1769e
            public void handle(Throwable th) {
            }
        }

        /* JADX INFO: renamed from: b77$e$b */
        public class b implements InterfaceC1769e {
            @Override // p000.b77.InterfaceC1769e
            public void handle(Throwable th) {
                if (th == null || !Log.isLoggable(b77.f12864e, 6)) {
                    return;
                }
                Log.e(b77.f12864e, "Request threw uncaught throwable", th);
            }
        }

        /* JADX INFO: renamed from: b77$e$c */
        public class c implements InterfaceC1769e {
            @Override // p000.b77.InterfaceC1769e
            public void handle(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f12886b = bVar;
            f12887c = new c();
            f12888d = bVar;
        }

        void handle(Throwable th);
    }

    @fdi
    public b77(ExecutorService executorService) {
        this.f12867a = executorService;
    }

    public static int calculateBestThreadCount() {
        if (f12860H == 0) {
            f12860H = Math.min(4, wde.m24488a());
        }
        return f12860H;
    }

    public static C1766b newAnimationBuilder() {
        return new C1766b(true).setThreadCount(calculateBestThreadCount() >= 4 ? 2 : 1).setName(f12866m);
    }

    public static b77 newAnimationExecutor() {
        return newAnimationBuilder().build();
    }

    public static C1766b newDiskCacheBuilder() {
        return new C1766b(true).setThreadCount(1).setName(f12862c);
    }

    public static b77 newDiskCacheExecutor() {
        return newDiskCacheBuilder().build();
    }

    public static C1766b newSourceBuilder() {
        return new C1766b(false).setThreadCount(calculateBestThreadCount()).setName("source");
    }

    public static b77 newSourceExecutor() {
        return newSourceBuilder().build();
    }

    public static b77 newUnlimitedSourceExecutor() {
        return new b77(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f12858C, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC1768d(new ThreadFactoryC1767c(), f12865f, InterfaceC1769e.f12888d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, @efb TimeUnit timeUnit) throws InterruptedException {
        return this.f12867a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@efb Runnable runnable) {
        this.f12867a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @efb
    public <T> List<Future<T>> invokeAll(@efb Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f12867a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @efb
    public <T> T invokeAny(@efb Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f12867a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f12867a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f12867a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f12867a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @efb
    public List<Runnable> shutdownNow() {
        return this.f12867a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @efb
    public Future<?> submit(@efb Runnable runnable) {
        return this.f12867a.submit(runnable);
    }

    public String toString() {
        return this.f12867a.toString();
    }

    @Deprecated
    public static b77 newAnimationExecutor(int i, InterfaceC1769e interfaceC1769e) {
        return newAnimationBuilder().setThreadCount(i).setUncaughtThrowableStrategy(interfaceC1769e).build();
    }

    @Deprecated
    public static b77 newDiskCacheExecutor(InterfaceC1769e interfaceC1769e) {
        return newDiskCacheBuilder().setUncaughtThrowableStrategy(interfaceC1769e).build();
    }

    @Deprecated
    public static b77 newSourceExecutor(InterfaceC1769e interfaceC1769e) {
        return newSourceBuilder().setUncaughtThrowableStrategy(interfaceC1769e).build();
    }

    @Override // java.util.concurrent.ExecutorService
    @efb
    public <T> List<Future<T>> invokeAll(@efb Collection<? extends Callable<T>> collection, long j, @efb TimeUnit timeUnit) throws InterruptedException {
        return this.f12867a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@efb Collection<? extends Callable<T>> collection, long j, @efb TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f12867a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @efb
    public <T> Future<T> submit(@efb Runnable runnable, T t) {
        return this.f12867a.submit(runnable, t);
    }

    @Deprecated
    public static b77 newDiskCacheExecutor(int i, String str, InterfaceC1769e interfaceC1769e) {
        return newDiskCacheBuilder().setThreadCount(i).setName(str).setUncaughtThrowableStrategy(interfaceC1769e).build();
    }

    @Deprecated
    public static b77 newSourceExecutor(int i, String str, InterfaceC1769e interfaceC1769e) {
        return newSourceBuilder().setThreadCount(i).setName(str).setUncaughtThrowableStrategy(interfaceC1769e).build();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@efb Callable<T> callable) {
        return this.f12867a.submit(callable);
    }
}
