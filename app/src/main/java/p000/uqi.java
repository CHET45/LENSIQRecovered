package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class uqi {

    /* JADX INFO: renamed from: f */
    public static final String f88817f = cj9.tagWithPrefix("WorkTimer");

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f88818a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f88819b;

    /* JADX INFO: renamed from: c */
    public final Map<String, RunnableC13659c> f88820c;

    /* JADX INFO: renamed from: d */
    public final Map<String, InterfaceC13658b> f88821d;

    /* JADX INFO: renamed from: e */
    public final Object f88822e;

    /* JADX INFO: renamed from: uqi$a */
    public class ThreadFactoryC13657a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public int f88823a = 0;

        public ThreadFactoryC13657a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@efb Runnable r) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(r);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f88823a);
            this.f88823a = this.f88823a + 1;
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: uqi$b */
    @p7e({p7e.EnumC10826a.f69935b})
    public interface InterfaceC13658b {
        void onTimeLimitExceeded(@efb String workSpecId);
    }

    /* JADX INFO: renamed from: uqi$c */
    @p7e({p7e.EnumC10826a.f69935b})
    public static class RunnableC13659c implements Runnable {

        /* JADX INFO: renamed from: c */
        public static final String f88825c = "WrkTimerRunnable";

        /* JADX INFO: renamed from: a */
        public final uqi f88826a;

        /* JADX INFO: renamed from: b */
        public final String f88827b;

        public RunnableC13659c(@efb uqi workTimer, @efb String workSpecId) {
            this.f88826a = workTimer;
            this.f88827b = workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f88826a.f88822e) {
                try {
                    if (this.f88826a.f88820c.remove(this.f88827b) != null) {
                        InterfaceC13658b interfaceC13658bRemove = this.f88826a.f88821d.remove(this.f88827b);
                        if (interfaceC13658bRemove != null) {
                            interfaceC13658bRemove.onTimeLimitExceeded(this.f88827b);
                        }
                    } else {
                        cj9.get().debug(f88825c, String.format("Timer with %s is already marked as complete.", this.f88827b), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public uqi() {
        ThreadFactoryC13657a threadFactoryC13657a = new ThreadFactoryC13657a();
        this.f88818a = threadFactoryC13657a;
        this.f88820c = new HashMap();
        this.f88821d = new HashMap();
        this.f88822e = new Object();
        this.f88819b = Executors.newSingleThreadScheduledExecutor(threadFactoryC13657a);
    }

    @efb
    @fdi
    public ScheduledExecutorService getExecutorService() {
        return this.f88819b;
    }

    @efb
    @fdi
    public synchronized Map<String, InterfaceC13658b> getListeners() {
        return this.f88821d;
    }

    @efb
    @fdi
    public synchronized Map<String, RunnableC13659c> getTimerMap() {
        return this.f88820c;
    }

    public void onDestroy() {
        if (this.f88819b.isShutdown()) {
            return;
        }
        this.f88819b.shutdownNow();
    }

    public void startTimer(@efb final String workSpecId, long processingTimeMillis, @efb InterfaceC13658b listener) {
        synchronized (this.f88822e) {
            cj9.get().debug(f88817f, String.format("Starting timer for %s", workSpecId), new Throwable[0]);
            stopTimer(workSpecId);
            RunnableC13659c runnableC13659c = new RunnableC13659c(this, workSpecId);
            this.f88820c.put(workSpecId, runnableC13659c);
            this.f88821d.put(workSpecId, listener);
            this.f88819b.schedule(runnableC13659c, processingTimeMillis, TimeUnit.MILLISECONDS);
        }
    }

    public void stopTimer(@efb final String workSpecId) {
        synchronized (this.f88822e) {
            try {
                if (this.f88820c.remove(workSpecId) != null) {
                    cj9.get().debug(f88817f, String.format("Stopping timer for %s", workSpecId), new Throwable[0]);
                    this.f88821d.remove(workSpecId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
