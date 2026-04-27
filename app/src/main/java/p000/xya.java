package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.AbstractC9640n1;
import p000.is6;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@qx4
public final class xya {

    /* JADX INFO: renamed from: xya$a */
    public class RunnableC15347a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BlockingQueue f99661a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ja9 f99662b;

        public RunnableC15347a(final BlockingQueue val$queue, final ja9 val$future) {
            this.f99661a = val$queue;
            this.f99662b = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f99661a.add(this.f99662b);
        }
    }

    /* JADX INFO: renamed from: xya$b */
    public class ExecutorC15348b implements Executor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Executor f99663a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ lfg f99664b;

        public ExecutorC15348b(final Executor val$executor, final lfg val$nameSupplier) {
            this.f99663a = val$executor;
            this.f99664b = val$nameSupplier;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            this.f99663a.execute(co1.m4101e(command, this.f99664b));
        }
    }

    /* JADX INFO: renamed from: xya$c */
    public class C15349c extends pri {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ lfg f99665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15349c(ExecutorService delegate, final lfg val$nameSupplier) {
            super(delegate);
            this.f99665b = val$nameSupplier;
        }

        @Override // p000.pri
        /* JADX INFO: renamed from: b */
        public Runnable mo19725b(Runnable command) {
            return co1.m4101e(command, this.f99665b);
        }

        @Override // p000.pri
        /* JADX INFO: renamed from: c */
        public <T> Callable<T> mo19726c(Callable<T> callable) {
            return co1.m4102f(callable, this.f99665b);
        }
    }

    /* JADX INFO: renamed from: xya$d */
    public class C15350d extends sri {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ lfg f99666c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15350d(ScheduledExecutorService delegate, final lfg val$nameSupplier) {
            super(delegate);
            this.f99666c = val$nameSupplier;
        }

        @Override // p000.pri
        /* JADX INFO: renamed from: b */
        public Runnable mo19725b(Runnable command) {
            return co1.m4101e(command, this.f99666c);
        }

        @Override // p000.pri
        /* JADX INFO: renamed from: c */
        public <T> Callable<T> mo19726c(Callable<T> callable) {
            return co1.m4102f(callable, this.f99666c);
        }
    }

    /* JADX INFO: renamed from: xya$e */
    public class ExecutorC15351e implements Executor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Executor f99667a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC9640n1 f99668b;

        public ExecutorC15351e(final Executor val$delegate, final AbstractC9640n1 val$future) {
            this.f99667a = val$delegate;
            this.f99668b = val$future;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            try {
                this.f99667a.execute(command);
            } catch (RejectedExecutionException e) {
                this.f99668b.setException(e);
            }
        }
    }

    /* JADX INFO: renamed from: xya$f */
    @jd7
    @yg8
    @gdi
    public static class C15352f {

        /* JADX INFO: renamed from: xya$f$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ExecutorService f99669a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f99670b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ TimeUnit f99671c;

            public a(final C15352f this$0, final ExecutorService val$service, final long val$terminationTimeout, final TimeUnit val$timeUnit) {
                this.f99669a = val$service;
                this.f99670b = val$terminationTimeout;
                this.f99671c = val$timeUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f99669a.shutdown();
                    this.f99669a.awaitTermination(this.f99670b, this.f99671c);
                } catch (InterruptedException unused) {
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m25564a(final ExecutorService service, final long terminationTimeout, final TimeUnit timeUnit) {
            v7d.checkNotNull(service);
            v7d.checkNotNull(timeUnit);
            m25565b(xya.m25559c("DelayedShutdownHook-for-" + service, new a(this, service, terminationTimeout, timeUnit)));
        }

        @gdi
        /* JADX INFO: renamed from: b */
        public void m25565b(Thread hook) {
            Runtime.getRuntime().addShutdownHook(hook);
        }

        /* JADX INFO: renamed from: c */
        public final ExecutorService m25566c(ThreadPoolExecutor executor) {
            return m25567d(executor, 120L, TimeUnit.SECONDS);
        }

        /* JADX INFO: renamed from: d */
        public final ExecutorService m25567d(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
            xya.useDaemonThreadFactory(executor);
            ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(executor);
            m25564a(executor, terminationTimeout, timeUnit);
            return executorServiceUnconfigurableExecutorService;
        }

        /* JADX INFO: renamed from: e */
        public final ScheduledExecutorService m25568e(ScheduledThreadPoolExecutor executor) {
            return m25569f(executor, 120L, TimeUnit.SECONDS);
        }

        /* JADX INFO: renamed from: f */
        public final ScheduledExecutorService m25569f(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
            xya.useDaemonThreadFactory(executor);
            ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(executor);
            m25564a(executor, terminationTimeout, timeUnit);
            return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
        }
    }

    /* JADX INFO: renamed from: xya$h */
    @jd7
    @yg8
    public static class C15354h extends AbstractC8576l2 {

        /* JADX INFO: renamed from: a */
        public final ExecutorService f99675a;

        public C15354h(ExecutorService delegate) {
            this.f99675a = (ExecutorService) v7d.checkNotNull(delegate);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
            return this.f99675a.awaitTermination(timeout, unit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable command) {
            this.f99675a.execute(command);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f99675a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f99675a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f99675a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f99675a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f99675a + "]";
        }
    }

    /* JADX INFO: renamed from: xya$i */
    @jd7
    @yg8
    public static final class C15355i extends C15354h implements cb9 {

        /* JADX INFO: renamed from: b */
        public final ScheduledExecutorService f99676b;

        /* JADX INFO: renamed from: xya$i$a */
        public static final class a<V> extends is6.AbstractC7582a<V> implements la9<V> {

            /* JADX INFO: renamed from: b */
            public final ScheduledFuture<?> f99677b;

            public a(ja9<V> listenableDelegate, ScheduledFuture<?> scheduledDelegate) {
                super(listenableDelegate);
                this.f99677b = scheduledDelegate;
            }

            @Override // p000.yr6, java.util.concurrent.Future
            public boolean cancel(boolean mayInterruptIfRunning) {
                boolean zCancel = super.cancel(mayInterruptIfRunning);
                if (zCancel) {
                    this.f99677b.cancel(mayInterruptIfRunning);
                }
                return zCancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit unit) {
                return this.f99677b.getDelay(unit);
            }

            @Override // java.lang.Comparable
            public int compareTo(Delayed other) {
                return this.f99677b.compareTo(other);
            }
        }

        /* JADX INFO: renamed from: xya$i$b */
        @jd7
        @yg8
        public static final class b extends AbstractC9640n1.j<Void> implements Runnable {

            /* JADX INFO: renamed from: F */
            public final Runnable f99678F;

            public b(Runnable delegate) {
                this.f99678F = (Runnable) v7d.checkNotNull(delegate);
            }

            @Override // p000.AbstractC9640n1
            /* JADX INFO: renamed from: n */
            public String mo2823n() {
                return "task=[" + this.f99678F + "]";
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f99678F.run();
                } catch (Error | RuntimeException e) {
                    setException(e);
                    throw e;
                }
            }
        }

        public C15355i(ScheduledExecutorService delegate) {
            super(delegate);
            this.f99676b = (ScheduledExecutorService) v7d.checkNotNull(delegate);
        }

        @Override // p000.cb9, java.util.concurrent.ScheduledExecutorService
        public la9<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
            b bVar = new b(command);
            return new a(bVar, this.f99676b.scheduleAtFixedRate(bVar, initialDelay, period, unit));
        }

        @Override // p000.cb9, java.util.concurrent.ScheduledExecutorService
        public la9<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
            b bVar = new b(command);
            return new a(bVar, this.f99676b.scheduleWithFixedDelay(bVar, initialDelay, delay, unit));
        }

        @Override // p000.cb9, java.util.concurrent.ScheduledExecutorService
        public la9<?> schedule(Runnable command, long delay, TimeUnit unit) {
            jjh jjhVarM14137q = jjh.m14137q(command, null);
            return new a(jjhVarM14137q, this.f99676b.schedule(jjhVarM14137q, delay, unit));
        }

        @Override // p000.cb9, java.util.concurrent.ScheduledExecutorService
        public <V> la9<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
            jjh jjhVarM14138r = jjh.m14138r(callable);
            return new a(jjhVarM14138r, this.f99676b.schedule(jjhVarM14138r, delay, unit));
        }
    }

    private xya() {
    }

    @jd7
    @yg8
    public static void addDelayedShutdownHook(ExecutorService service, long terminationTimeout, TimeUnit timeUnit) {
        new C15352f().m25564a(service, terminationTimeout, timeUnit);
    }

    @jd7
    @yg8
    @agc
    /* JADX INFO: renamed from: b */
    public static <T> T m25558b(bb9 bb9Var, Collection<? extends Callable<T>> collection, boolean z, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long jNanoTime;
        long jNanoTime2;
        v7d.checkNotNull(bb9Var);
        v7d.checkNotNull(timeUnit);
        int size = collection.size();
        v7d.checkArgument(size > 0);
        ArrayList arrayListNewArrayListWithCapacity = eb9.newArrayListWithCapacity(size);
        LinkedBlockingQueue linkedBlockingQueueNewLinkedBlockingQueue = dod.newLinkedBlockingQueue();
        long nanos = timeUnit.toNanos(j);
        if (z) {
            try {
                jNanoTime = System.nanoTime();
            } catch (Throwable th) {
                Iterator it = arrayListNewArrayListWithCapacity.iterator();
                while (it.hasNext()) {
                    ((Future) it.next()).cancel(true);
                }
                throw th;
            }
        } else {
            jNanoTime = 0;
        }
        Iterator<? extends Callable<T>> it2 = collection.iterator();
        arrayListNewArrayListWithCapacity.add(submitAndAddQueueListener(bb9Var, it2.next(), linkedBlockingQueueNewLinkedBlockingQueue));
        int i = size - 1;
        int i2 = 1;
        ExecutionException executionException = null;
        while (true) {
            Future future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.poll();
            if (future != null) {
                jNanoTime2 = jNanoTime;
            } else {
                if (i > 0) {
                    i--;
                    arrayListNewArrayListWithCapacity.add(submitAndAddQueueListener(bb9Var, it2.next(), linkedBlockingQueueNewLinkedBlockingQueue));
                    i2++;
                } else {
                    if (i2 == 0) {
                        if (executionException == null) {
                            throw new ExecutionException((Throwable) null);
                        }
                        throw executionException;
                    }
                    if (z) {
                        future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.poll(nanos, TimeUnit.NANOSECONDS);
                        if (future == null) {
                            throw new TimeoutException();
                        }
                        jNanoTime2 = System.nanoTime();
                        nanos -= jNanoTime2 - jNanoTime;
                    } else {
                        future = (Future) linkedBlockingQueueNewLinkedBlockingQueue.take();
                    }
                }
                jNanoTime2 = jNanoTime;
            }
            long j2 = nanos;
            int i3 = i;
            if (future != null) {
                i2--;
                try {
                    T t = (T) future.get();
                    Iterator it3 = arrayListNewArrayListWithCapacity.iterator();
                    while (it3.hasNext()) {
                        ((Future) it3.next()).cancel(true);
                    }
                    return t;
                } catch (RuntimeException e) {
                    executionException = new ExecutionException(e);
                    i = i3;
                    nanos = j2;
                    jNanoTime = jNanoTime2;
                } catch (ExecutionException e2) {
                    executionException = e2;
                    i = i3;
                    nanos = j2;
                    jNanoTime = jNanoTime2;
                }
            }
            i = i3;
            nanos = j2;
            jNanoTime = jNanoTime2;
        }
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: c */
    public static Thread m25559c(String name, Runnable runnable) {
        v7d.checkNotNull(name);
        v7d.checkNotNull(runnable);
        Thread threadNewThread = platformThreadFactory().newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        try {
            threadNewThread.setName(name);
        } catch (SecurityException unused) {
        }
        return threadNewThread;
    }

    /* JADX INFO: renamed from: d */
    public static Executor m25560d(final Executor delegate, final AbstractC9640n1<?> future) {
        v7d.checkNotNull(delegate);
        v7d.checkNotNull(future);
        return delegate == directExecutor() ? delegate : new ExecutorC15351e(delegate, future);
    }

    public static Executor directExecutor() {
        return fd4.INSTANCE;
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: e */
    public static Executor m25561e(final Executor executor, final lfg<String> nameSupplier) {
        v7d.checkNotNull(executor);
        v7d.checkNotNull(nameSupplier);
        return new ExecutorC15348b(executor, nameSupplier);
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: f */
    public static ExecutorService m25562f(final ExecutorService service, final lfg<String> nameSupplier) {
        v7d.checkNotNull(service);
        v7d.checkNotNull(nameSupplier);
        return new C15349c(service, nameSupplier);
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: g */
    public static ScheduledExecutorService m25563g(final ScheduledExecutorService service, final lfg<String> nameSupplier) {
        v7d.checkNotNull(service);
        v7d.checkNotNull(nameSupplier);
        return new C15350d(service, nameSupplier);
    }

    @jd7
    @yg8
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        return new C15352f().m25567d(executor, terminationTimeout, timeUnit);
    }

    @jd7
    @yg8
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        return new C15352f().m25569f(executor, terminationTimeout, timeUnit);
    }

    @jd7
    @yg8
    private static boolean isAppEngineWithApiClasses() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
            return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", null).invoke(null, null) != null;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    @jd7
    @yg8
    public static bb9 listeningDecorator(ExecutorService delegate) {
        if (delegate instanceof bb9) {
            return (bb9) delegate;
        }
        return delegate instanceof ScheduledExecutorService ? new C15355i((ScheduledExecutorService) delegate) : new C15354h(delegate);
    }

    @jd7
    @yg8
    public static bb9 newDirectExecutorService() {
        return new C15353g(null);
    }

    @jd7
    @yg8
    public static Executor newSequentialExecutor(Executor delegate) {
        return new d0f(delegate);
    }

    @jd7
    @yg8
    public static ThreadFactory platformThreadFactory() {
        if (!isAppEngineWithApiClasses()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", null).invoke(null, null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e3);
        } catch (InvocationTargetException e4) {
            throw bzg.propagate(e4.getCause());
        }
    }

    @op1
    @jd7
    @yg8
    public static boolean shutdownAndAwaitTermination(ExecutorService service, long timeout, TimeUnit unit) {
        long nanos = unit.toNanos(timeout) / 2;
        service.shutdown();
        try {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (!service.awaitTermination(nanos, timeUnit)) {
                service.shutdownNow();
                service.awaitTermination(nanos, timeUnit);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            service.shutdownNow();
        }
        return service.isTerminated();
    }

    @jd7
    @yg8
    private static <T> ja9<T> submitAndAddQueueListener(bb9 executorService, Callable<T> task, final BlockingQueue<Future<T>> queue) {
        ja9<T> ja9VarSubmit = executorService.submit((Callable) task);
        ja9VarSubmit.addListener(new RunnableC15347a(queue, ja9VarSubmit), directExecutor());
        return ja9VarSubmit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @jd7
    @yg8
    public static void useDaemonThreadFactory(ThreadPoolExecutor executor) {
        executor.setThreadFactory(new txg().setDaemon(true).setThreadFactory(executor.getThreadFactory()).build());
    }

    @jd7
    @yg8
    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor executor) {
        return new C15352f().m25566c(executor);
    }

    @jd7
    @yg8
    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor executor) {
        return new C15352f().m25568e(executor);
    }

    /* JADX INFO: renamed from: xya$g */
    @jd7
    @yg8
    public static final class C15353g extends AbstractC8576l2 {

        /* JADX INFO: renamed from: a */
        public final Object f99672a;

        /* JADX INFO: renamed from: b */
        @uc7("lock")
        public int f99673b;

        /* JADX INFO: renamed from: c */
        @uc7("lock")
        public boolean f99674c;

        private C15353g() {
            this.f99672a = new Object();
            this.f99673b = 0;
            this.f99674c = false;
        }

        private void endTask() {
            synchronized (this.f99672a) {
                try {
                    int i = this.f99673b - 1;
                    this.f99673b = i;
                    if (i == 0) {
                        this.f99672a.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void startTask() {
            synchronized (this.f99672a) {
                try {
                    if (this.f99674c) {
                        throw new RejectedExecutionException("Executor already shutdown");
                    }
                    this.f99673b++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
            long nanos = unit.toNanos(timeout);
            synchronized (this.f99672a) {
                while (true) {
                    try {
                        if (this.f99674c && this.f99673b == 0) {
                            return true;
                        }
                        if (nanos <= 0) {
                            return false;
                        }
                        long jNanoTime = System.nanoTime();
                        TimeUnit.NANOSECONDS.timedWait(this.f99672a, nanos);
                        nanos -= System.nanoTime() - jNanoTime;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            startTask();
            try {
                command.run();
            } finally {
                endTask();
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            boolean z;
            synchronized (this.f99672a) {
                z = this.f99674c;
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            boolean z;
            synchronized (this.f99672a) {
                try {
                    z = this.f99674c && this.f99673b == 0;
                } finally {
                }
            }
            return z;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            synchronized (this.f99672a) {
                try {
                    this.f99674c = true;
                    if (this.f99673b == 0) {
                        this.f99672a.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            shutdown();
            return Collections.emptyList();
        }

        public /* synthetic */ C15353g(RunnableC15347a runnableC15347a) {
            this();
        }
    }

    @jd7
    @yg8
    public static cb9 listeningDecorator(ScheduledExecutorService delegate) {
        if (delegate instanceof cb9) {
            return (cb9) delegate;
        }
        return new C15355i(delegate);
    }
}
