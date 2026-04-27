package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public class wcb extends woe.AbstractC14729c implements lf4 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f93942a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f93943b;

    public wcb(ThreadFactory threadFactory) {
        this.f93942a = dpe.create(threadFactory);
    }

    @Override // p000.lf4
    public void dispose() {
        if (this.f93943b) {
            return;
        }
        this.f93943b = true;
        this.f93942a.shutdownNow();
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f93943b;
    }

    @Override // p000.woe.AbstractC14729c
    @cfb
    public lf4 schedule(@cfb final Runnable run) {
        return schedule(run, 0L, null);
    }

    @cfb
    public poe scheduleActual(final Runnable run, long delayTime, @cfb TimeUnit unit, @dib sf4 parent) {
        poe poeVar = new poe(ofe.onSchedule(run), parent);
        if (parent != null && !parent.add(poeVar)) {
            return poeVar;
        }
        try {
            poeVar.setFuture(delayTime <= 0 ? this.f93942a.submit((Callable) poeVar) : this.f93942a.schedule((Callable) poeVar, delayTime, unit));
        } catch (RejectedExecutionException e) {
            if (parent != null) {
                parent.remove(poeVar);
            }
            ofe.onError(e);
        }
        return poeVar;
    }

    public lf4 scheduleDirect(final Runnable run, long delayTime, TimeUnit unit) {
        noe noeVar = new noe(ofe.onSchedule(run), true);
        try {
            noeVar.setFuture(delayTime <= 0 ? this.f93942a.submit(noeVar) : this.f93942a.schedule(noeVar, delayTime, unit));
            return noeVar;
        } catch (RejectedExecutionException e) {
            ofe.onError(e);
            return b05.INSTANCE;
        }
    }

    public lf4 schedulePeriodicallyDirect(Runnable run, long initialDelay, long period, TimeUnit unit) {
        Runnable runnableOnSchedule = ofe.onSchedule(run);
        if (period <= 0) {
            q58 q58Var = new q58(runnableOnSchedule, this.f93942a);
            try {
                q58Var.m20072a(initialDelay <= 0 ? this.f93942a.submit(q58Var) : this.f93942a.schedule(q58Var, initialDelay, unit));
                return q58Var;
            } catch (RejectedExecutionException e) {
                ofe.onError(e);
                return b05.INSTANCE;
            }
        }
        loe loeVar = new loe(runnableOnSchedule, true);
        try {
            loeVar.setFuture(this.f93942a.scheduleAtFixedRate(loeVar, initialDelay, period, unit));
            return loeVar;
        } catch (RejectedExecutionException e2) {
            ofe.onError(e2);
            return b05.INSTANCE;
        }
    }

    public void shutdown() {
        if (this.f93943b) {
            return;
        }
        this.f93943b = true;
        this.f93942a.shutdown();
    }

    @Override // p000.woe.AbstractC14729c
    @cfb
    public lf4 schedule(@cfb final Runnable action, long delayTime, @cfb TimeUnit unit) {
        return this.f93943b ? b05.INSTANCE : scheduleActual(action, delayTime, unit, null);
    }
}
