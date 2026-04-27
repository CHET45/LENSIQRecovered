package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p000.ga0;

/* JADX INFO: loaded from: classes5.dex */
public class ga0 {

    /* JADX INFO: renamed from: c */
    public final ArrayList<EnumC6181d> f39088c = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<C6179b> f39087b = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public final ExecutorC6180c f39086a = new ExecutorC6180c();

    /* JADX INFO: renamed from: ga0$b */
    public class C6179b {

        /* JADX INFO: renamed from: a */
        public final EnumC6181d f39089a;

        /* JADX INFO: renamed from: b */
        public final long f39090b;

        /* JADX INFO: renamed from: c */
        public final Runnable f39091c;

        /* JADX INFO: renamed from: d */
        public ScheduledFuture f39092d;

        /* JADX INFO: Access modifiers changed from: private */
        public void handleDelayElapsed() {
            ga0.this.verifyIsCurrentThread();
            if (this.f39092d != null) {
                markDone();
                this.f39091c.run();
            }
        }

        private void markDone() {
            r80.hardAssert(this.f39092d != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f39092d = null;
            ga0.this.removeDelayedTask(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(long j) {
            this.f39092d = ga0.this.f39086a.schedule(new Runnable() { // from class: ha0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42971a.handleDelayElapsed();
                }
            }, j, TimeUnit.MILLISECONDS);
        }

        public void cancel() {
            ga0.this.verifyIsCurrentThread();
            ScheduledFuture scheduledFuture = this.f39092d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                markDone();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m11463e() {
            handleDelayElapsed();
        }

        private C6179b(EnumC6181d enumC6181d, long j, Runnable runnable) {
            this.f39089a = enumC6181d;
            this.f39090b = j;
            this.f39091c = runnable;
        }
    }

    /* JADX INFO: renamed from: ga0$c */
    public class ExecutorC6180c implements Executor {

        /* JADX INFO: renamed from: a */
        public final ScheduledThreadPoolExecutor f39094a;

        /* JADX INFO: renamed from: b */
        public boolean f39095b;

        /* JADX INFO: renamed from: c */
        public final Thread f39096c;

        /* JADX INFO: renamed from: ga0$c$a */
        public class a extends ScheduledThreadPoolExecutor {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ ga0 f39098a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, ThreadFactory threadFactory, ga0 ga0Var) {
                super(i, threadFactory);
                this.f39098a = ga0Var;
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            public void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e) {
                        th = e.getCause();
                    }
                }
                if (th != null) {
                    ga0.this.panic(th);
                }
            }
        }

        /* JADX INFO: renamed from: ga0$c$b */
        public class b implements Runnable, ThreadFactory {

            /* JADX INFO: renamed from: a */
            public final CountDownLatch f39100a;

            /* JADX INFO: renamed from: b */
            public Runnable f39101b;

            private b() {
                this.f39100a = new CountDownLatch(1);
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@efb Runnable runnable) {
                r80.hardAssert(this.f39101b == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f39101b = runnable;
                this.f39100a.countDown();
                return ExecutorC6180c.this.f39096c;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f39100a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f39101b.run();
            }
        }

        @igg({"ThreadPoolCreation"})
        public ExecutorC6180c() {
            b bVar = new b();
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(bVar);
            this.f39096c = threadNewThread;
            threadNewThread.setName("FirestoreWorker");
            threadNewThread.setDaemon(true);
            threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: ja0
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    this.f50061a.lambda$new$0(thread, th);
                }
            });
            a aVar = new a(1, bVar, ga0.this);
            this.f39094a = aVar;
            aVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
            this.f39095b = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized Task<Void> executeAndInitiateShutdown(final Runnable runnable) {
            if (!isShuttingDown()) {
                Task<Void> taskExecuteAndReportResult = executeAndReportResult(new Callable() { // from class: ia0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ga0.ExecutorC6180c.lambda$executeAndInitiateShutdown$2(runnable);
                    }
                });
                this.f39095b = true;
                return taskExecuteAndReportResult;
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <T> Task<T> executeAndReportResult(final Callable<T> callable) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                execute(new Runnable() { // from class: ka0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ga0.ExecutorC6180c.lambda$executeAndReportResult$1(taskCompletionSource, callable);
                    }
                });
            } catch (RejectedExecutionException unused) {
                fj9.warn(ga0.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean isShuttingDown() {
            return this.f39095b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void lambda$executeAndInitiateShutdown$2(Runnable runnable) throws Exception {
            runnable.run();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$executeAndReportResult$1(TaskCompletionSource taskCompletionSource, Callable callable) {
            try {
                taskCompletionSource.setResult(callable.call());
            } catch (Exception e) {
                taskCompletionSource.setException(e);
                throw new RuntimeException(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0(Thread thread, Throwable th) {
            ga0.this.panic(th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f39095b) {
                return null;
            }
            return this.f39094a.schedule(runnable, j, timeUnit);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCorePoolSize(int i) {
            this.f39094a.setCorePoolSize(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void shutdownNow() {
            this.f39094a.shutdownNow();
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            if (!this.f39095b) {
                this.f39094a.execute(runnable);
            }
        }

        public void executeEvenAfterShutdown(Runnable runnable) {
            try {
                this.f39094a.execute(runnable);
            } catch (RejectedExecutionException unused) {
                fj9.warn(ga0.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: ga0$d */
    public enum EnumC6181d {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    public static <TResult> Task<TResult> callTask(final Executor executor, final Callable<Task<TResult>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: fa0
            @Override // java.lang.Runnable
            public final void run() {
                ga0.lambda$callTask$1(callable, executor, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private C6179b createAndScheduleDelayedTask(EnumC6181d enumC6181d, long j, Runnable runnable) {
        C6179b c6179b = new C6179b(enumC6181d, System.currentTimeMillis() + j, runnable);
        c6179b.start(j);
        return c6179b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$callTask$0(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$callTask$1(Callable callable, Executor executor, final TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Continuation() { // from class: ba0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return ga0.lambda$callTask$0(taskCompletionSource, task);
                }
            });
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        } catch (Throwable th) {
            taskCompletionSource.setException(new IllegalStateException("Unhandled throwable in callTask.", th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$enqueue$2(Runnable runnable) throws Exception {
        runnable.run();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$panic$3(Throwable th) {
        if (!(th instanceof OutOfMemoryError)) {
            throw new RuntimeException("Internal error in Cloud Firestore (26.0.2).", th);
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (26.0.2) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
        outOfMemoryError.initCause(th);
        throw outOfMemoryError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$runDelayedTasksUntil$5(C6179b c6179b, C6179b c6179b2) {
        return Long.compare(c6179b.f39090b, c6179b2.f39090b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runDelayedTasksUntil$6(EnumC6181d enumC6181d) {
        r80.hardAssert(enumC6181d == EnumC6181d.ALL || containsDelayedTask(enumC6181d), "Attempted to run tasks until missing TimerId: %s", enumC6181d);
        Collections.sort(this.f39087b, new Comparator() { // from class: z90
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ga0.lambda$runDelayedTasksUntil$5((ga0.C6179b) obj, (ga0.C6179b) obj2);
            }
        });
        for (C6179b c6179b : new ArrayList(this.f39087b)) {
            c6179b.m11463e();
            if (enumC6181d != EnumC6181d.ALL && c6179b.f39089a == enumC6181d) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$runSync$4(Runnable runnable, Throwable[] thArr, Semaphore semaphore) {
        try {
            runnable.run();
        } catch (Throwable th) {
            thArr[0] = th;
        }
        semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDelayedTask(C6179b c6179b) {
        r80.hardAssert(this.f39087b.remove(c6179b), "Delayed task not found.", new Object[0]);
    }

    @fdi
    public boolean containsDelayedTask(EnumC6181d enumC6181d) {
        Iterator<C6179b> it = this.f39087b.iterator();
        while (it.hasNext()) {
            if (it.next().f39089a == enumC6181d) {
                return true;
            }
        }
        return false;
    }

    @dy1
    public <T> Task<T> enqueue(Callable<T> callable) {
        return this.f39086a.executeAndReportResult(callable);
    }

    public C6179b enqueueAfterDelay(EnumC6181d enumC6181d, long j, Runnable runnable) {
        if (this.f39088c.contains(enumC6181d)) {
            j = 0;
        }
        C6179b c6179bCreateAndScheduleDelayedTask = createAndScheduleDelayedTask(enumC6181d, j, runnable);
        this.f39087b.add(c6179bCreateAndScheduleDelayedTask);
        return c6179bCreateAndScheduleDelayedTask;
    }

    public void enqueueAndForget(Runnable runnable) {
        enqueue(runnable);
    }

    public void enqueueAndForgetEvenAfterShutdown(Runnable runnable) {
        this.f39086a.executeEvenAfterShutdown(runnable);
    }

    public Task<Void> enqueueAndInitiateShutdown(Runnable runnable) {
        return this.f39086a.executeAndInitiateShutdown(runnable);
    }

    public Executor getExecutor() {
        return this.f39086a;
    }

    public boolean isShuttingDown() {
        return this.f39086a.isShuttingDown();
    }

    public void panic(final Throwable th) {
        this.f39086a.shutdownNow();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ca0
            @Override // java.lang.Runnable
            public final void run() {
                ga0.lambda$panic$3(th);
            }
        });
    }

    @fdi
    public void runDelayedTasksUntil(final EnumC6181d enumC6181d) throws InterruptedException {
        runSync(new Runnable() { // from class: aa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f790a.lambda$runDelayedTasksUntil$6(enumC6181d);
            }
        });
    }

    @fdi
    public void runSync(final Runnable runnable) throws InterruptedException {
        final Semaphore semaphore = new Semaphore(0);
        final Throwable[] thArr = new Throwable[1];
        enqueueAndForget(new Runnable() { // from class: ea0
            @Override // java.lang.Runnable
            public final void run() {
                ga0.lambda$runSync$4(runnable, thArr, semaphore);
            }
        });
        semaphore.acquire(1);
        if (thArr[0] != null) {
            throw new RuntimeException("Synchronous task failed", thArr[0]);
        }
    }

    public void shutdown() {
        this.f39086a.setCorePoolSize(0);
    }

    @fdi
    public void skipDelaysForTimerId(EnumC6181d enumC6181d) {
        this.f39088c.add(enumC6181d);
    }

    public void verifyIsCurrentThread() {
        Thread threadCurrentThread = Thread.currentThread();
        if (this.f39086a.f39096c != threadCurrentThread) {
            throw r80.fail("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.f39086a.f39096c.getName(), Long.valueOf(this.f39086a.f39096c.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        }
    }

    @dy1
    public Task<Void> enqueue(final Runnable runnable) {
        return enqueue(new Callable() { // from class: da0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ga0.lambda$enqueue$2(runnable);
            }
        });
    }
}
