package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.o34;

/* JADX INFO: loaded from: classes7.dex */
public final class u85 extends t85 implements o34 {

    /* JADX INFO: renamed from: d */
    @yfb
    public final Executor f87041d;

    public u85(@yfb Executor executor) {
        this.f87041d = executor;
        if (getExecutor() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) getExecutor()).setRemoveOnCancelPolicy(true);
        }
    }

    private final void cancelJobOnRejection(e13 e13Var, RejectedExecutionException rejectedExecutionException) {
        oj8.cancel(e13Var, y75.CancellationException("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> scheduleBlock(ScheduledExecutorService scheduledExecutorService, Runnable runnable, e13 e13Var, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            cancelJobOnRejection(e13Var, e);
            return null;
        }
    }

    @Override // p000.t85, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = getExecutor();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // p000.o34
    @gib
    @q64(level = u64.f86866b, message = "Deprecated without replacement as an internal method never intended for public use")
    public Object delay(long j, @yfb zy2<? super bth> zy2Var) {
        return o34.C10164a.delay(this, j, zy2Var);
    }

    @Override // p000.m13
    /* JADX INFO: renamed from: dispatch */
    public void mo29873dispatch(@yfb e13 e13Var, @yfb Runnable runnable) {
        Runnable runnableWrapTask;
        try {
            Executor executor = getExecutor();
            AbstractC2202c5 abstractC2202c5 = C4613d5.f28447a;
            if (abstractC2202c5 == null || (runnableWrapTask = abstractC2202c5.wrapTask(runnable)) == null) {
                runnableWrapTask = runnable;
            }
            executor.execute(runnableWrapTask);
        } catch (RejectedExecutionException e) {
            AbstractC2202c5 abstractC2202c52 = C4613d5.f28447a;
            if (abstractC2202c52 != null) {
                abstractC2202c52.unTrackTask();
            }
            cancelJobOnRejection(e13Var, e);
            df4.getIO().mo29873dispatch(e13Var, runnable);
        }
    }

    public boolean equals(@gib Object obj) {
        return (obj instanceof u85) && ((u85) obj).getExecutor() == getExecutor();
    }

    @Override // p000.t85
    @yfb
    public Executor getExecutor() {
        return this.f87041d;
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // p000.o34
    @yfb
    public yf4 invokeOnTimeout(long j, @yfb Runnable runnable, @yfb e13 e13Var) {
        Executor executor = getExecutor();
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> scheduledFutureScheduleBlock = scheduledExecutorService != null ? scheduleBlock(scheduledExecutorService, runnable, e13Var, j) : null;
        return scheduledFutureScheduleBlock != null ? new xf4(scheduledFutureScheduleBlock) : tu3.f85932F.invokeOnTimeout(j, runnable, e13Var);
    }

    @Override // p000.o34
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo29874scheduleResumeAfterDelay(long j, @yfb dq1<? super bth> dq1Var) {
        Executor executor = getExecutor();
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> scheduledFutureScheduleBlock = scheduledExecutorService != null ? scheduleBlock(scheduledExecutorService, new h8e(this, dq1Var), dq1Var.getContext(), j) : null;
        if (scheduledFutureScheduleBlock != null) {
            hq1.invokeOnCancellation(dq1Var, new rp1(scheduledFutureScheduleBlock));
        } else {
            tu3.f85932F.mo29874scheduleResumeAfterDelay(j, dq1Var);
        }
    }

    @Override // p000.m13
    @yfb
    public String toString() {
        return getExecutor().toString();
    }
}
