package p000;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.C1506a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p000.p7e;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class gb7 implements roe, mpi, m85 {

    /* JADX INFO: renamed from: F */
    public static final String f39243F = cj9.tagWithPrefix("GreedyScheduler");

    /* JADX INFO: renamed from: C */
    public Boolean f39244C;

    /* JADX INFO: renamed from: a */
    public final Context f39245a;

    /* JADX INFO: renamed from: b */
    public final zpi f39246b;

    /* JADX INFO: renamed from: c */
    public final npi f39247c;

    /* JADX INFO: renamed from: e */
    public u34 f39249e;

    /* JADX INFO: renamed from: f */
    public boolean f39250f;

    /* JADX INFO: renamed from: d */
    public final Set<oqi> f39248d = new HashSet();

    /* JADX INFO: renamed from: m */
    public final Object f39251m = new Object();

    public gb7(@efb Context context, @efb C1506a configuration, @efb ong taskExecutor, @efb zpi workManagerImpl) {
        this.f39245a = context;
        this.f39246b = workManagerImpl;
        this.f39247c = new npi(context, taskExecutor, this);
        this.f39249e = new u34(this, configuration.getRunnableScheduler());
    }

    private void checkDefaultProcess() {
        this.f39244C = Boolean.valueOf(kdd.isDefaultProcess(this.f39245a, this.f39246b.getConfiguration()));
    }

    private void registerExecutionListenerIfNeeded() {
        if (this.f39250f) {
            return;
        }
        this.f39246b.getProcessor().addExecutionListener(this);
        this.f39250f = true;
    }

    private void removeConstraintTrackingFor(@efb String workSpecId) {
        synchronized (this.f39251m) {
            try {
                Iterator<oqi> it = this.f39248d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    oqi next = it.next();
                    if (next.f68337a.equals(workSpecId)) {
                        cj9.get().debug(f39243F, String.format("Stopping tracking for %s", workSpecId), new Throwable[0]);
                        this.f39248d.remove(next);
                        this.f39247c.replace(this.f39248d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.roe
    public void cancel(@efb String workSpecId) {
        if (this.f39244C == null) {
            checkDefaultProcess();
        }
        if (!this.f39244C.booleanValue()) {
            cj9.get().info(f39243F, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        registerExecutionListenerIfNeeded();
        cj9.get().debug(f39243F, String.format("Cancelling work ID %s", workSpecId), new Throwable[0]);
        u34 u34Var = this.f39249e;
        if (u34Var != null) {
            u34Var.unschedule(workSpecId);
        }
        this.f39246b.stopWork(workSpecId);
    }

    @Override // p000.roe
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    @Override // p000.mpi
    public void onAllConstraintsMet(@efb List<String> workSpecIds) {
        for (String str : workSpecIds) {
            cj9.get().debug(f39243F, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f39246b.startWork(str);
        }
    }

    @Override // p000.mpi
    public void onAllConstraintsNotMet(@efb List<String> workSpecIds) {
        for (String str : workSpecIds) {
            cj9.get().debug(f39243F, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f39246b.stopWork(str);
        }
    }

    @Override // p000.m85
    public void onExecuted(@efb String workSpecId, boolean needsReschedule) {
        removeConstraintTrackingFor(workSpecId);
    }

    @Override // p000.roe
    public void schedule(@efb oqi... workSpecs) {
        if (this.f39244C == null) {
            checkDefaultProcess();
        }
        if (!this.f39244C.booleanValue()) {
            cj9.get().info(f39243F, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        registerExecutionListenerIfNeeded();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (oqi oqiVar : workSpecs) {
            long jCalculateNextRunTime = oqiVar.calculateNextRunTime();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (oqiVar.f68338b == tpi.EnumC13161a.ENQUEUED) {
                if (jCurrentTimeMillis < jCalculateNextRunTime) {
                    u34 u34Var = this.f39249e;
                    if (u34Var != null) {
                        u34Var.schedule(oqiVar);
                    }
                } else if (!oqiVar.hasConstraints()) {
                    cj9.get().debug(f39243F, String.format("Starting work for %s", oqiVar.f68337a), new Throwable[0]);
                    this.f39246b.startWork(oqiVar.f68337a);
                } else if (oqiVar.f68346j.requiresDeviceIdle()) {
                    cj9.get().debug(f39243F, String.format("Ignoring WorkSpec %s, Requires device idle.", oqiVar), new Throwable[0]);
                } else if (oqiVar.f68346j.hasContentUriTriggers()) {
                    cj9.get().debug(f39243F, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", oqiVar), new Throwable[0]);
                } else {
                    hashSet.add(oqiVar);
                    hashSet2.add(oqiVar.f68337a);
                }
            }
        }
        synchronized (this.f39251m) {
            try {
                if (!hashSet.isEmpty()) {
                    cj9.get().debug(f39243F, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.f39248d.addAll(hashSet);
                    this.f39247c.replace(this.f39248d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @fdi
    public void setDelayedWorkTracker(@efb u34 delayedWorkTracker) {
        this.f39249e = delayedWorkTracker;
    }

    @fdi
    public gb7(@efb Context context, @efb zpi workManagerImpl, @efb npi workConstraintsTracker) {
        this.f39245a = context;
        this.f39246b = workManagerImpl;
        this.f39247c = workConstraintsTracker;
    }
}
