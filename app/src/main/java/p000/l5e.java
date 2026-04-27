package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class l5e {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f56238a;

    /* JADX INFO: renamed from: b */
    public final Executor f56239b;

    /* JADX INFO: renamed from: c */
    public final Runnable f56240c;

    /* JADX INFO: renamed from: d */
    public final d5g f56241d;

    /* JADX INFO: renamed from: e */
    public long f56242e;

    /* JADX INFO: renamed from: f */
    public boolean f56243f;

    /* JADX INFO: renamed from: g */
    public ScheduledFuture<?> f56244g;

    /* JADX INFO: renamed from: l5e$b */
    public final class RunnableC8626b implements Runnable {
        private RunnableC8626b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!l5e.this.f56243f) {
                l5e.this.f56244g = null;
                return;
            }
            long jNanoTime = l5e.this.nanoTime();
            if (l5e.this.f56242e - jNanoTime > 0) {
                l5e l5eVar = l5e.this;
                l5eVar.f56244g = l5eVar.f56238a.schedule(new RunnableC8627c(), l5e.this.f56242e - jNanoTime, TimeUnit.NANOSECONDS);
            } else {
                l5e.this.f56243f = false;
                l5e.this.f56244g = null;
                l5e.this.f56240c.run();
            }
        }
    }

    /* JADX INFO: renamed from: l5e$c */
    public final class RunnableC8627c implements Runnable {
        private RunnableC8627c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isEnabled() {
            return l5e.this.f56243f;
        }

        @Override // java.lang.Runnable
        public void run() {
            l5e.this.f56239b.execute(new RunnableC8626b());
        }
    }

    public l5e(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, d5g d5gVar) {
        this.f56240c = runnable;
        this.f56239b = executor;
        this.f56238a = scheduledExecutorService;
        this.f56241d = d5gVar;
        d5gVar.start();
    }

    @gdi
    /* JADX INFO: renamed from: j */
    public static boolean m15325j(Runnable runnable) {
        return ((RunnableC8627c) runnable).isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long nanoTime() {
        return this.f56241d.elapsed(TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: i */
    public void m15326i(boolean z) {
        ScheduledFuture<?> scheduledFuture;
        this.f56243f = false;
        if (!z || (scheduledFuture = this.f56244g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f56244g = null;
    }

    /* JADX INFO: renamed from: k */
    public void m15327k(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long jNanoTime = nanoTime() + nanos;
        this.f56243f = true;
        if (jNanoTime - this.f56242e < 0 || this.f56244g == null) {
            ScheduledFuture<?> scheduledFuture = this.f56244g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f56244g = this.f56238a.schedule(new RunnableC8627c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f56242e = jNanoTime;
    }
}
