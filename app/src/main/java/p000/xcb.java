package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public class xcb extends voe.AbstractC14185c implements mf4 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f97521a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f97522b;

    public xcb(ThreadFactory threadFactory) {
        this.f97521a = cpe.create(threadFactory);
    }

    @Override // p000.mf4
    public void dispose() {
        if (this.f97522b) {
            return;
        }
        this.f97522b = true;
        this.f97521a.shutdownNow();
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f97522b;
    }

    @Override // p000.voe.AbstractC14185c
    @bfb
    public mf4 schedule(@bfb Runnable runnable) {
        return schedule(runnable, 0L, null);
    }

    @bfb
    public qoe scheduleActual(Runnable runnable, long j, @bfb TimeUnit timeUnit, @cib tf4 tf4Var) {
        qoe qoeVar = new qoe(pfe.onSchedule(runnable), tf4Var);
        if (tf4Var != null && !tf4Var.add(qoeVar)) {
            return qoeVar;
        }
        try {
            qoeVar.setFuture(j <= 0 ? this.f97521a.submit((Callable) qoeVar) : this.f97521a.schedule((Callable) qoeVar, j, timeUnit));
        } catch (RejectedExecutionException e) {
            if (tf4Var != null) {
                tf4Var.remove(qoeVar);
            }
            pfe.onError(e);
        }
        return qoeVar;
    }

    public mf4 scheduleDirect(Runnable runnable, long j, TimeUnit timeUnit) {
        ooe ooeVar = new ooe(pfe.onSchedule(runnable));
        try {
            ooeVar.setFuture(j <= 0 ? this.f97521a.submit(ooeVar) : this.f97521a.schedule(ooeVar, j, timeUnit));
            return ooeVar;
        } catch (RejectedExecutionException e) {
            pfe.onError(e);
            return c05.INSTANCE;
        }
    }

    public mf4 schedulePeriodicallyDirect(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = pfe.onSchedule(runnable);
        if (j2 <= 0) {
            r58 r58Var = new r58(runnableOnSchedule, this.f97521a);
            try {
                r58Var.m21021a(j <= 0 ? this.f97521a.submit(r58Var) : this.f97521a.schedule(r58Var, j, timeUnit));
                return r58Var;
            } catch (RejectedExecutionException e) {
                pfe.onError(e);
                return c05.INSTANCE;
            }
        }
        moe moeVar = new moe(runnableOnSchedule);
        try {
            moeVar.setFuture(this.f97521a.scheduleAtFixedRate(moeVar, j, j2, timeUnit));
            return moeVar;
        } catch (RejectedExecutionException e2) {
            pfe.onError(e2);
            return c05.INSTANCE;
        }
    }

    public void shutdown() {
        if (this.f97522b) {
            return;
        }
        this.f97522b = true;
        this.f97521a.shutdown();
    }

    @Override // p000.voe.AbstractC14185c
    @bfb
    public mf4 schedule(@bfb Runnable runnable, long j, @bfb TimeUnit timeUnit) {
        return this.f97522b ? c05.INSTANCE : scheduleActual(runnable, j, timeUnit, null);
    }
}
