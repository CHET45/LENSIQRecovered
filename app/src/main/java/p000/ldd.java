package p000;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C1506a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1520a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p000.p7e;
import p000.yqi;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class ldd implements m85, dq6 {

    /* JADX INFO: renamed from: M */
    public static final String f57268M = cj9.tagWithPrefix("Processor");

    /* JADX INFO: renamed from: N */
    public static final String f57269N = "ProcessorForegroundLck";

    /* JADX INFO: renamed from: C */
    public List<roe> f57270C;

    /* JADX INFO: renamed from: b */
    public Context f57275b;

    /* JADX INFO: renamed from: c */
    public C1506a f57276c;

    /* JADX INFO: renamed from: d */
    public ong f57277d;

    /* JADX INFO: renamed from: e */
    public WorkDatabase f57278e;

    /* JADX INFO: renamed from: m */
    public Map<String, yqi> f57280m = new HashMap();

    /* JADX INFO: renamed from: f */
    public Map<String, yqi> f57279f = new HashMap();

    /* JADX INFO: renamed from: F */
    public Set<String> f57271F = new HashSet();

    /* JADX INFO: renamed from: H */
    public final List<m85> f57272H = new ArrayList();

    /* JADX INFO: renamed from: a */
    @hib
    public PowerManager.WakeLock f57274a = null;

    /* JADX INFO: renamed from: L */
    public final Object f57273L = new Object();

    /* JADX INFO: renamed from: ldd$a */
    public static class RunnableC8776a implements Runnable {

        /* JADX INFO: renamed from: a */
        @efb
        public m85 f57281a;

        /* JADX INFO: renamed from: b */
        @efb
        public String f57282b;

        /* JADX INFO: renamed from: c */
        @efb
        public ja9<Boolean> f57283c;

        public RunnableC8776a(@efb m85 executionListener, @efb String workSpecId, @efb ja9<Boolean> future) {
            this.f57281a = executionListener;
            this.f57282b = workSpecId;
            this.f57283c = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f57283c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f57281a.onExecuted(this.f57282b, zBooleanValue);
        }
    }

    public ldd(@efb Context appContext, @efb C1506a configuration, @efb ong workTaskExecutor, @efb WorkDatabase workDatabase, @efb List<roe> schedulers) {
        this.f57275b = appContext;
        this.f57276c = configuration;
        this.f57277d = workTaskExecutor;
        this.f57278e = workDatabase;
        this.f57270C = schedulers;
    }

    private static boolean interrupt(@efb String id, @hib yqi wrapper) {
        if (wrapper == null) {
            cj9.get().debug(f57268M, String.format("WorkerWrapper could not be found for %s", id), new Throwable[0]);
            return false;
        }
        wrapper.interrupt();
        cj9.get().debug(f57268M, String.format("WorkerWrapper interrupted for %s", id), new Throwable[0]);
        return true;
    }

    private void stopForegroundService() {
        synchronized (this.f57273L) {
            try {
                if (this.f57279f.isEmpty()) {
                    try {
                        this.f57275b.startService(C1520a.createStopForegroundIntent(this.f57275b));
                    } catch (Throwable th) {
                        cj9.get().error(f57268M, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f57274a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f57274a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void addExecutionListener(@efb m85 executionListener) {
        synchronized (this.f57273L) {
            this.f57272H.add(executionListener);
        }
    }

    public boolean hasWork() {
        boolean z;
        synchronized (this.f57273L) {
            try {
                z = (this.f57280m.isEmpty() && this.f57279f.isEmpty()) ? false : true;
            } finally {
            }
        }
        return z;
    }

    public boolean isCancelled(@efb String id) {
        boolean zContains;
        synchronized (this.f57273L) {
            zContains = this.f57271F.contains(id);
        }
        return zContains;
    }

    public boolean isEnqueued(@efb String workSpecId) {
        boolean z;
        synchronized (this.f57273L) {
            try {
                z = this.f57280m.containsKey(workSpecId) || this.f57279f.containsKey(workSpecId);
            } finally {
            }
        }
        return z;
    }

    public boolean isEnqueuedInForeground(@efb String workSpecId) {
        boolean zContainsKey;
        synchronized (this.f57273L) {
            zContainsKey = this.f57279f.containsKey(workSpecId);
        }
        return zContainsKey;
    }

    @Override // p000.m85
    public void onExecuted(@efb final String workSpecId, boolean needsReschedule) {
        synchronized (this.f57273L) {
            try {
                this.f57280m.remove(workSpecId);
                cj9.get().debug(f57268M, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), workSpecId, Boolean.valueOf(needsReschedule)), new Throwable[0]);
                Iterator<m85> it = this.f57272H.iterator();
                while (it.hasNext()) {
                    it.next().onExecuted(workSpecId, needsReschedule);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeExecutionListener(@efb m85 executionListener) {
        synchronized (this.f57273L) {
            this.f57272H.remove(executionListener);
        }
    }

    @Override // p000.dq6
    public void startForeground(@efb String workSpecId, @efb cq6 foregroundInfo) {
        synchronized (this.f57273L) {
            try {
                cj9.get().info(f57268M, String.format("Moving WorkSpec (%s) to the foreground", workSpecId), new Throwable[0]);
                yqi yqiVarRemove = this.f57280m.remove(workSpecId);
                if (yqiVarRemove != null) {
                    if (this.f57274a == null) {
                        PowerManager.WakeLock wakeLockNewWakeLock = dhi.newWakeLock(this.f57275b, f57269N);
                        this.f57274a = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.acquire();
                    }
                    this.f57279f.put(workSpecId, yqiVarRemove);
                    lx2.startForegroundService(this.f57275b, C1520a.createStartForegroundIntent(this.f57275b, workSpecId, foregroundInfo));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean startWork(@efb String id) {
        return startWork(id, null);
    }

    public boolean stopAndCancelWork(@efb String id) {
        boolean zInterrupt;
        synchronized (this.f57273L) {
            try {
                cj9.get().debug(f57268M, String.format("Processor cancelling %s", id), new Throwable[0]);
                this.f57271F.add(id);
                yqi yqiVarRemove = this.f57279f.remove(id);
                boolean z = yqiVarRemove != null;
                if (yqiVarRemove == null) {
                    yqiVarRemove = this.f57280m.remove(id);
                }
                zInterrupt = interrupt(id, yqiVarRemove);
                if (z) {
                    stopForegroundService();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zInterrupt;
    }

    @Override // p000.dq6
    public void stopForeground(@efb String workSpecId) {
        synchronized (this.f57273L) {
            this.f57279f.remove(workSpecId);
            stopForegroundService();
        }
    }

    public boolean stopForegroundWork(@efb String id) {
        boolean zInterrupt;
        synchronized (this.f57273L) {
            cj9.get().debug(f57268M, String.format("Processor stopping foreground work %s", id), new Throwable[0]);
            zInterrupt = interrupt(id, this.f57279f.remove(id));
        }
        return zInterrupt;
    }

    public boolean stopWork(@efb String id) {
        boolean zInterrupt;
        synchronized (this.f57273L) {
            cj9.get().debug(f57268M, String.format("Processor stopping background work %s", id), new Throwable[0]);
            zInterrupt = interrupt(id, this.f57280m.remove(id));
        }
        return zInterrupt;
    }

    public boolean startWork(@efb String id, @hib WorkerParameters.C1505a runtimeExtras) {
        synchronized (this.f57273L) {
            try {
                if (isEnqueued(id)) {
                    cj9.get().debug(f57268M, String.format("Work %s is already enqueued for processing", id), new Throwable[0]);
                    return false;
                }
                yqi yqiVarBuild = new yqi.C15772c(this.f57275b, this.f57276c, this.f57277d, this, this.f57278e, id).withSchedulers(this.f57270C).withRuntimeExtras(runtimeExtras).build();
                ja9<Boolean> future = yqiVarBuild.getFuture();
                future.addListener(new RunnableC8776a(this, id, future), this.f57277d.getMainThreadExecutor());
                this.f57280m.put(id, yqiVarBuild);
                this.f57277d.getBackgroundExecutor().execute(yqiVarBuild);
                cj9.get().debug(f57268M, String.format("%s: processing %s", getClass().getSimpleName(), id), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
