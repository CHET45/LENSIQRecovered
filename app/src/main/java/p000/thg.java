package p000;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public final class thg implements Executor {

    /* JADX INFO: renamed from: a */
    public final Thread.UncaughtExceptionHandler f84883a;

    /* JADX INFO: renamed from: b */
    public final Queue<Runnable> f84884b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c */
    public final AtomicReference<Thread> f84885c = new AtomicReference<>();

    /* JADX INFO: renamed from: thg$a */
    public class RunnableC13050a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RunnableC13052c f84886a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f84887b;

        public RunnableC13050a(RunnableC13052c runnableC13052c, Runnable runnable) {
            this.f84886a = runnableC13052c;
            this.f84887b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            thg.this.execute(this.f84886a);
        }

        public String toString() {
            return this.f84887b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* JADX INFO: renamed from: thg$b */
    public class RunnableC13051b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RunnableC13052c f84889a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f84890b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f84891c;

        public RunnableC13051b(RunnableC13052c runnableC13052c, Runnable runnable, long j) {
            this.f84889a = runnableC13052c;
            this.f84890b = runnable;
            this.f84891c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            thg.this.execute(this.f84889a);
        }

        public String toString() {
            return this.f84890b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f84891c + c0b.f15434d;
        }
    }

    /* JADX INFO: renamed from: thg$c */
    public static class RunnableC13052c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f84893a;

        /* JADX INFO: renamed from: b */
        public boolean f84894b;

        /* JADX INFO: renamed from: c */
        public boolean f84895c;

        public RunnableC13052c(Runnable runnable) {
            this.f84893a = (Runnable) v7d.checkNotNull(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f84894b) {
                return;
            }
            this.f84895c = true;
            this.f84893a.run();
        }
    }

    /* JADX INFO: renamed from: thg$d */
    public static final class C13053d {

        /* JADX INFO: renamed from: a */
        public final RunnableC13052c f84896a;

        /* JADX INFO: renamed from: b */
        public final ScheduledFuture<?> f84897b;

        public /* synthetic */ C13053d(RunnableC13052c runnableC13052c, ScheduledFuture scheduledFuture, RunnableC13050a runnableC13050a) {
            this(runnableC13052c, scheduledFuture);
        }

        public void cancel() {
            this.f84896a.f84894b = true;
            this.f84897b.cancel(false);
        }

        public boolean isPending() {
            RunnableC13052c runnableC13052c = this.f84896a;
            return (runnableC13052c.f84895c || runnableC13052c.f84894b) ? false : true;
        }

        private C13053d(RunnableC13052c runnableC13052c, ScheduledFuture<?> scheduledFuture) {
            this.f84896a = (RunnableC13052c) v7d.checkNotNull(runnableC13052c, "runnable");
            this.f84897b = (ScheduledFuture) v7d.checkNotNull(scheduledFuture, "future");
        }
    }

    public thg(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f84883a = (Thread.UncaughtExceptionHandler) v7d.checkNotNull(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void drain() {
        while (v7b.m23844a(this.f84885c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnablePoll = this.f84884b.poll();
                    if (runnablePoll == null) {
                        break;
                    }
                    try {
                        runnablePoll.run();
                    } catch (Throwable th) {
                        this.f84883a.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.f84885c.set(null);
                    throw th2;
                }
            }
            this.f84885c.set(null);
            if (this.f84884b.isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        executeLater(runnable);
        drain();
    }

    public final void executeLater(Runnable runnable) {
        this.f84884b.add((Runnable) v7d.checkNotNull(runnable, "runnable is null"));
    }

    public final C13053d schedule(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        RunnableC13052c runnableC13052c = new RunnableC13052c(runnable);
        return new C13053d(runnableC13052c, scheduledExecutorService.schedule(new RunnableC13050a(runnableC13052c, runnable), j, timeUnit), null);
    }

    public final C13053d scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        RunnableC13052c runnableC13052c = new RunnableC13052c(runnable);
        return new C13053d(runnableC13052c, scheduledExecutorService.scheduleWithFixedDelay(new RunnableC13051b(runnableC13052c, runnable, j2), j, j2, timeUnit), null);
    }

    public void throwIfNotInThisSynchronizationContext() {
        v7d.checkState(Thread.currentThread() == this.f84885c.get(), "Not called from the SynchronizationContext");
    }
}
