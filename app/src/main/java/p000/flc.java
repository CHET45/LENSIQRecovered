package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class flc extends r44 implements elc {

    /* JADX INFO: renamed from: c */
    public final zkc f37055c;

    public flc(zkc zkcVar, ScheduledExecutorService scheduledExecutorService) {
        super(zkcVar, scheduledExecutorService);
        this.f37055c = zkcVar;
    }

    @Override // p000.xkc
    public boolean isPaused() {
        return this.f37055c.isPaused();
    }

    @Override // p000.xkc
    public void pause() {
        this.f37055c.pause();
    }

    @Override // p000.xkc
    public void resume() {
        this.f37055c.resume();
    }

    @Override // p000.r44, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.r44, java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }
}
