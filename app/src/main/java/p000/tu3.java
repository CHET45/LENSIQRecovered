package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p000.f65;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class tu3 extends f65 implements Runnable {

    /* JADX INFO: renamed from: F */
    @yfb
    public static final tu3 f85932F;

    /* JADX INFO: renamed from: H */
    @yfb
    public static final String f85933H = "kotlinx.coroutines.DefaultExecutor";

    /* JADX INFO: renamed from: L */
    public static final long f85934L = 1000;

    /* JADX INFO: renamed from: M */
    public static final long f85935M;

    /* JADX INFO: renamed from: N */
    public static final int f85936N = 0;

    /* JADX INFO: renamed from: Q */
    public static final int f85937Q = 1;

    /* JADX INFO: renamed from: X */
    public static final int f85938X = 2;

    /* JADX INFO: renamed from: Y */
    public static final int f85939Y = 3;

    /* JADX INFO: renamed from: Z */
    public static final int f85940Z = 4;

    @gib
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        tu3 tu3Var = new tu3();
        f85932F = tu3Var;
        e65.incrementUseCount$default(tu3Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f85935M = timeUnit.toNanos(l.longValue());
    }

    private tu3() {
    }

    private final synchronized void acknowledgeShutdownIfNeeded() {
        if (isShutdownRequested()) {
            debugStatus = 3;
            m10667f();
            md8.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread createThreadSync() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, f85933H);
            _thread = thread;
            thread.setContextClassLoader(f85932F.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private static /* synthetic */ void get_thread$annotations() {
    }

    private final boolean isShutDown() {
        return debugStatus == 4;
    }

    private final boolean isShutdownRequested() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private final synchronized boolean notifyStartup() {
        if (isShutdownRequested()) {
            return false;
        }
        debugStatus = 1;
        md8.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void shutdownError() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.g65
    @yfb
    /* JADX INFO: renamed from: c */
    public Thread mo9773c() {
        Thread thread = _thread;
        return thread == null ? createThreadSync() : thread;
    }

    @Override // p000.g65
    /* JADX INFO: renamed from: d */
    public void mo11414d(long j, @yfb f65.AbstractRunnableC5633c abstractRunnableC5633c) {
        shutdownError();
    }

    @Override // p000.f65
    public void enqueue(@yfb Runnable runnable) {
        if (isShutDown()) {
            shutdownError();
        }
        super.enqueue(runnable);
    }

    public final synchronized void ensureStarted$kotlinx_coroutines_core() {
        debugStatus = 0;
        createThreadSync();
        while (debugStatus == 0) {
            md8.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        }
    }

    @Override // p000.f65, p000.o34
    @yfb
    public yf4 invokeOnTimeout(long j, @yfb Runnable runnable, @yfb e13 e13Var) {
        return m10668g(j, runnable);
    }

    public final boolean isThreadPresent$kotlinx_coroutines_core() {
        return _thread != null;
    }

    @Override // java.lang.Runnable
    public void run() {
        xxg.f99642a.setEventLoop$kotlinx_coroutines_core(this);
        AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
        if (abstractC2202c5 != null) {
            abstractC2202c5.registerTimeLoopThread();
        }
        try {
            if (!notifyStartup()) {
                _thread = null;
                acknowledgeShutdownIfNeeded();
                AbstractC2202c5 abstractC2202c52 = C4613d5.f28447a;
                if (abstractC2202c52 != null) {
                    abstractC2202c52.unregisterTimeLoopThread();
                }
                if (mo9714b()) {
                    return;
                }
                mo9773c();
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jProcessNextEvent = processNextEvent();
                if (jProcessNextEvent == Long.MAX_VALUE) {
                    AbstractC2202c5 abstractC2202c53 = C4613d5.f28447a;
                    long jNanoTime = abstractC2202c53 != null ? abstractC2202c53.nanoTime() : System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f85935M + jNanoTime;
                    }
                    long j2 = j - jNanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        acknowledgeShutdownIfNeeded();
                        AbstractC2202c5 abstractC2202c54 = C4613d5.f28447a;
                        if (abstractC2202c54 != null) {
                            abstractC2202c54.unregisterTimeLoopThread();
                        }
                        if (mo9714b()) {
                            return;
                        }
                        mo9773c();
                        return;
                    }
                    jProcessNextEvent = kpd.coerceAtMost(jProcessNextEvent, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jProcessNextEvent > 0) {
                    if (isShutdownRequested()) {
                        _thread = null;
                        acknowledgeShutdownIfNeeded();
                        AbstractC2202c5 abstractC2202c55 = C4613d5.f28447a;
                        if (abstractC2202c55 != null) {
                            abstractC2202c55.unregisterTimeLoopThread();
                        }
                        if (mo9714b()) {
                            return;
                        }
                        mo9773c();
                        return;
                    }
                    AbstractC2202c5 abstractC2202c56 = C4613d5.f28447a;
                    if (abstractC2202c56 != null) {
                        abstractC2202c56.parkNanos(this, jProcessNextEvent);
                    } else {
                        LockSupport.parkNanos(this, jProcessNextEvent);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            acknowledgeShutdownIfNeeded();
            AbstractC2202c5 abstractC2202c57 = C4613d5.f28447a;
            if (abstractC2202c57 != null) {
                abstractC2202c57.unregisterTimeLoopThread();
            }
            if (!mo9714b()) {
                mo9773c();
            }
            throw th;
        }
    }

    @Override // p000.f65, p000.e65
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void shutdownForTests(long j) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() + j;
            if (!isShutdownRequested()) {
                debugStatus = 2;
            }
            while (debugStatus != 3 && _thread != null) {
                Thread thread = _thread;
                if (thread != null) {
                    AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
                    if (abstractC2202c5 != null) {
                        abstractC2202c5.unpark(thread);
                    } else {
                        LockSupport.unpark(thread);
                    }
                }
                if (jCurrentTimeMillis - System.currentTimeMillis() <= 0) {
                    break;
                }
                md8.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                wait(j);
            }
            debugStatus = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.m13
    @yfb
    public String toString() {
        return "DefaultExecutor";
    }
}
