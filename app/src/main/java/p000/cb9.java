package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public interface cb9 extends ScheduledExecutorService, bb9 {
    @Override // java.util.concurrent.ScheduledExecutorService
    la9<?> schedule(Runnable command, long delay, TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    <V> la9<V> schedule(Callable<V> callable, long delay, TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    la9<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit);

    @Override // java.util.concurrent.ScheduledExecutorService
    la9<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit);
}
