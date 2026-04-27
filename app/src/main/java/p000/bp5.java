package p000;

import java.lang.Thread;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
public class bp5 extends f3g {

    /* JADX INFO: renamed from: a */
    public final f3g f14363a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f14364b;

    /* JADX INFO: renamed from: c */
    public final long f14365c;

    /* JADX INFO: renamed from: d */
    public final boolean f14366d;

    /* JADX INFO: renamed from: e */
    public volatile ThreadGroup f14367e;

    /* JADX INFO: renamed from: bp5$b */
    public static class C1977b {

        /* JADX INFO: renamed from: a */
        public boolean f14368a;

        /* JADX INFO: renamed from: b */
        public long f14369b;

        /* JADX INFO: renamed from: c */
        public TimeUnit f14370c;

        public bp5 build(f3g f3gVar) {
            if (f3gVar != null) {
                return new bp5(this, f3gVar);
            }
            throw new NullPointerException("statement cannot be null");
        }

        public C1977b withLookingForStuckThread(boolean z) {
            this.f14368a = z;
            return this;
        }

        public C1977b withTimeout(long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException("timeout must be non-negative");
            }
            if (timeUnit == null) {
                throw new NullPointerException("TimeUnit cannot be null");
            }
            this.f14369b = j;
            this.f14370c = timeUnit;
            return this;
        }

        private C1977b() {
            this.f14368a = false;
            this.f14369b = 0L;
            this.f14370c = TimeUnit.SECONDS;
        }
    }

    /* JADX INFO: renamed from: bp5$c */
    public class CallableC1978c implements Callable<Throwable> {

        /* JADX INFO: renamed from: a */
        public final CountDownLatch f14371a;

        private CallableC1978c() {
            this.f14371a = new CountDownLatch(1);
        }

        public void awaitStarted() throws InterruptedException {
            this.f14371a.await();
        }

        @Override // java.util.concurrent.Callable
        public Throwable call() throws Exception {
            try {
                this.f14371a.countDown();
                bp5.this.f14363a.evaluate();
                return null;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                return th;
            }
        }
    }

    public static C1977b builder() {
        return new C1977b();
    }

    private Thread[] copyThreads(Thread[] threadArr, int i) {
        int iMin = Math.min(i, threadArr.length);
        Thread[] threadArr2 = new Thread[iMin];
        for (int i2 = 0; i2 < iMin; i2++) {
            threadArr2[i2] = threadArr[i2];
        }
        return threadArr2;
    }

    private long cpuTime(Thread thread) {
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        if (!threadMXBean.isThreadCpuTimeSupported()) {
            return 0L;
        }
        try {
            return threadMXBean.getThreadCpuTime(thread.getId());
        } catch (UnsupportedOperationException unused) {
            return 0L;
        }
    }

    private Exception createTimeoutException(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Thread stuckThread = this.f14366d ? getStuckThread(thread) : null;
        qpg qpgVar = new qpg(this.f14365c, this.f14364b);
        if (stackTrace != null) {
            qpgVar.setStackTrace(stackTrace);
            thread.interrupt();
        }
        if (stuckThread == null) {
            return qpgVar;
        }
        Exception exc = new Exception("Appears to be stuck in thread " + stuckThread.getName());
        exc.setStackTrace(getStackTrace(stuckThread));
        return new b4b(Arrays.asList(qpgVar, exc));
    }

    private Throwable getResult(FutureTask<Throwable> futureTask, Thread thread) {
        try {
            long j = this.f14365c;
            return j > 0 ? futureTask.get(j, this.f14364b) : futureTask.get();
        } catch (InterruptedException e) {
            return e;
        } catch (ExecutionException e2) {
            return e2.getCause();
        } catch (TimeoutException unused) {
            return createTimeoutException(thread);
        }
    }

    private StackTraceElement[] getStackTrace(Thread thread) {
        try {
            return thread.getStackTrace();
        } catch (SecurityException unused) {
            return new StackTraceElement[0];
        }
    }

    private Thread getStuckThread(Thread thread) {
        Thread[] threadArray;
        if (this.f14367e == null || (threadArray = getThreadArray(this.f14367e)) == null) {
            return null;
        }
        long j = 0;
        Thread thread2 = null;
        for (Thread thread3 : threadArray) {
            if (thread3.getState() == Thread.State.RUNNABLE) {
                long jCpuTime = cpuTime(thread3);
                if (thread2 == null || jCpuTime > j) {
                    thread2 = thread3;
                    j = jCpuTime;
                }
            }
        }
        if (thread2 == thread) {
            return null;
        }
        return thread2;
    }

    private Thread[] getThreadArray(ThreadGroup threadGroup) {
        int iMax = Math.max(threadGroup.activeCount() * 2, 100);
        int i = 0;
        do {
            Thread[] threadArr = new Thread[iMax];
            int iEnumerate = threadGroup.enumerate(threadArr);
            if (iEnumerate < iMax) {
                return copyThreads(threadArr, iEnumerate);
            }
            iMax += 100;
            i++;
        } while (i < 5);
        return null;
    }

    @Override // p000.f3g
    public void evaluate() throws Throwable {
        CallableC1978c callableC1978c = new CallableC1978c();
        FutureTask<Throwable> futureTask = new FutureTask<>(callableC1978c);
        this.f14367e = new ThreadGroup("FailOnTimeoutGroup");
        Thread thread = new Thread(this.f14367e, futureTask, "Time-limited test");
        thread.setDaemon(true);
        thread.start();
        callableC1978c.awaitStarted();
        Throwable result = getResult(futureTask, thread);
        if (result != null) {
            throw result;
        }
    }

    @Deprecated
    public bp5(f3g f3gVar, long j) {
        this(builder().withTimeout(j, TimeUnit.MILLISECONDS), f3gVar);
    }

    private bp5(C1977b c1977b, f3g f3gVar) {
        this.f14367e = null;
        this.f14363a = f3gVar;
        this.f14365c = c1977b.f14369b;
        this.f14364b = c1977b.f14370c;
        this.f14366d = c1977b.f14368a;
    }
}
