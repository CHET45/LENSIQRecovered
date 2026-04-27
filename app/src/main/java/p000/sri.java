package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class sri extends pri implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f82725b;

    public sri(ScheduledExecutorService delegate) {
        super(delegate);
        this.f82725b = delegate;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return this.f82725b.schedule(mo19725b(command), delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return this.f82725b.scheduleAtFixedRate(mo19725b(command), initialDelay, period, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        return this.f82725b.scheduleWithFixedDelay(mo19725b(command), initialDelay, delay, unit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final <V> ScheduledFuture<V> schedule(Callable<V> task, long delay, TimeUnit unit) {
        return this.f82725b.schedule(mo19726c(task), delay, unit);
    }
}
