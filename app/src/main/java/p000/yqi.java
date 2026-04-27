package p000;

import android.content.Context;
import androidx.work.C1506a;
import androidx.work.C1507b;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p000.p7e;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class yqi implements Runnable {

    /* JADX INFO: renamed from: Z1 */
    public static final String f102682Z1 = cj9.tagWithPrefix("WorkerWrapper");

    /* JADX INFO: renamed from: F */
    public C1506a f102684F;

    /* JADX INFO: renamed from: H */
    public dq6 f102685H;

    /* JADX INFO: renamed from: L */
    public WorkDatabase f102686L;

    /* JADX INFO: renamed from: M */
    public pqi f102687M;

    /* JADX INFO: renamed from: N */
    public l64 f102689N;

    /* JADX INFO: renamed from: Q */
    public sqi f102690Q;

    /* JADX INFO: renamed from: V1 */
    public volatile boolean f102691V1;

    /* JADX INFO: renamed from: X */
    public List<String> f102692X;

    /* JADX INFO: renamed from: Y */
    public String f102693Y;

    /* JADX INFO: renamed from: a */
    public Context f102695a;

    /* JADX INFO: renamed from: b */
    public String f102696b;

    /* JADX INFO: renamed from: c */
    public List<roe> f102697c;

    /* JADX INFO: renamed from: d */
    public WorkerParameters.C1505a f102698d;

    /* JADX INFO: renamed from: e */
    public oqi f102699e;

    /* JADX INFO: renamed from: f */
    public ListenableWorker f102700f;

    /* JADX INFO: renamed from: m */
    public ong f102701m;

    /* JADX INFO: renamed from: C */
    @efb
    public ListenableWorker.AbstractC1502a f102683C = ListenableWorker.AbstractC1502a.failure();

    /* JADX INFO: renamed from: Z */
    @efb
    public z6f<Boolean> f102694Z = z6f.create();

    /* JADX INFO: renamed from: M1 */
    @hib
    public ja9<ListenableWorker.AbstractC1502a> f102688M1 = null;

    /* JADX INFO: renamed from: yqi$a */
    public class RunnableC15770a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ja9 f102702a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z6f f102703b;

        public RunnableC15770a(final ja9 val$runExpedited, final z6f val$future) {
            this.f102702a = val$runExpedited;
            this.f102703b = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f102702a.get();
                cj9.get().debug(yqi.f102682Z1, String.format("Starting work for %s", yqi.this.f102699e.f68339c), new Throwable[0]);
                yqi yqiVar = yqi.this;
                yqiVar.f102688M1 = yqiVar.f102700f.startWork();
                this.f102703b.setFuture(yqi.this.f102688M1);
            } catch (Throwable th) {
                this.f102703b.setException(th);
            }
        }
    }

    /* JADX INFO: renamed from: yqi$b */
    public class RunnableC15771b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z6f f102705a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f102706b;

        public RunnableC15771b(final z6f val$future, final String val$workDescription) {
            this.f102705a = val$future;
            this.f102706b = val$workDescription;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @igg({"SyntheticAccessor"})
        public void run() {
            try {
                try {
                    ListenableWorker.AbstractC1502a abstractC1502a = (ListenableWorker.AbstractC1502a) this.f102705a.get();
                    if (abstractC1502a == null) {
                        cj9.get().error(yqi.f102682Z1, String.format("%s returned a null result. Treating it as a failure.", yqi.this.f102699e.f68339c), new Throwable[0]);
                    } else {
                        cj9.get().debug(yqi.f102682Z1, String.format("%s returned a %s result.", yqi.this.f102699e.f68339c, abstractC1502a), new Throwable[0]);
                        yqi.this.f102683C = abstractC1502a;
                    }
                } catch (InterruptedException e) {
                    e = e;
                    cj9.get().error(yqi.f102682Z1, String.format("%s failed because it threw an exception/error", this.f102706b), e);
                } catch (CancellationException e2) {
                    cj9.get().info(yqi.f102682Z1, String.format("%s was cancelled", this.f102706b), e2);
                } catch (ExecutionException e3) {
                    e = e3;
                    cj9.get().error(yqi.f102682Z1, String.format("%s failed because it threw an exception/error", this.f102706b), e);
                }
                yqi.this.m26303a();
            } catch (Throwable th) {
                yqi.this.m26303a();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: yqi$c */
    @p7e({p7e.EnumC10826a.f69935b})
    public static class C15772c {

        /* JADX INFO: renamed from: a */
        @efb
        public Context f102708a;

        /* JADX INFO: renamed from: b */
        @hib
        public ListenableWorker f102709b;

        /* JADX INFO: renamed from: c */
        @efb
        public dq6 f102710c;

        /* JADX INFO: renamed from: d */
        @efb
        public ong f102711d;

        /* JADX INFO: renamed from: e */
        @efb
        public C1506a f102712e;

        /* JADX INFO: renamed from: f */
        @efb
        public WorkDatabase f102713f;

        /* JADX INFO: renamed from: g */
        @efb
        public String f102714g;

        /* JADX INFO: renamed from: h */
        public List<roe> f102715h;

        /* JADX INFO: renamed from: i */
        @efb
        public WorkerParameters.C1505a f102716i = new WorkerParameters.C1505a();

        public C15772c(@efb Context context, @efb C1506a configuration, @efb ong workTaskExecutor, @efb dq6 foregroundProcessor, @efb WorkDatabase database, @efb String workSpecId) {
            this.f102708a = context.getApplicationContext();
            this.f102711d = workTaskExecutor;
            this.f102710c = foregroundProcessor;
            this.f102712e = configuration;
            this.f102713f = database;
            this.f102714g = workSpecId;
        }

        @efb
        public yqi build() {
            return new yqi(this);
        }

        @efb
        public C15772c withRuntimeExtras(@hib WorkerParameters.C1505a runtimeExtras) {
            if (runtimeExtras != null) {
                this.f102716i = runtimeExtras;
            }
            return this;
        }

        @efb
        public C15772c withSchedulers(@efb List<roe> schedulers) {
            this.f102715h = schedulers;
            return this;
        }

        @efb
        @fdi
        public C15772c withWorker(@efb ListenableWorker worker) {
            this.f102709b = worker;
            return this;
        }
    }

    public yqi(@efb C15772c builder) {
        this.f102695a = builder.f102708a;
        this.f102701m = builder.f102711d;
        this.f102685H = builder.f102710c;
        this.f102696b = builder.f102714g;
        this.f102697c = builder.f102715h;
        this.f102698d = builder.f102716i;
        this.f102700f = builder.f102709b;
        this.f102684F = builder.f102712e;
        WorkDatabase workDatabase = builder.f102713f;
        this.f102686L = workDatabase;
        this.f102687M = workDatabase.workSpecDao();
        this.f102689N = this.f102686L.dependencyDao();
        this.f102690Q = this.f102686L.workTagDao();
    }

    private String createWorkDescription(List<String> tags) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f102696b);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : tags) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void handleResult(ListenableWorker.AbstractC1502a result) {
        if (result instanceof ListenableWorker.AbstractC1502a.c) {
            cj9.get().info(f102682Z1, String.format("Worker result SUCCESS for %s", this.f102693Y), new Throwable[0]);
            if (this.f102699e.isPeriodic()) {
                resetPeriodicAndResolve();
                return;
            } else {
                setSucceededAndResolve();
                return;
            }
        }
        if (result instanceof ListenableWorker.AbstractC1502a.b) {
            cj9.get().info(f102682Z1, String.format("Worker result RETRY for %s", this.f102693Y), new Throwable[0]);
            rescheduleAndResolve();
            return;
        }
        cj9.get().info(f102682Z1, String.format("Worker result FAILURE for %s", this.f102693Y), new Throwable[0]);
        if (this.f102699e.isPeriodic()) {
            resetPeriodicAndResolve();
        } else {
            m26304b();
        }
    }

    private void iterativelyFailWorkAndDependents(String workSpecId) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            if (this.f102687M.getState(str) != tpi.EnumC13161a.CANCELLED) {
                this.f102687M.setState(tpi.EnumC13161a.FAILED, str);
            }
            linkedList.addAll(this.f102689N.getDependentWorkIds(str));
        }
    }

    private void rescheduleAndResolve() {
        this.f102686L.beginTransaction();
        try {
            this.f102687M.setState(tpi.EnumC13161a.ENQUEUED, this.f102696b);
            this.f102687M.setPeriodStartTime(this.f102696b, System.currentTimeMillis());
            this.f102687M.markWorkSpecScheduled(this.f102696b, -1L);
            this.f102686L.setTransactionSuccessful();
        } finally {
            this.f102686L.endTransaction();
            resolve(true);
        }
    }

    private void resetPeriodicAndResolve() {
        this.f102686L.beginTransaction();
        try {
            this.f102687M.setPeriodStartTime(this.f102696b, System.currentTimeMillis());
            this.f102687M.setState(tpi.EnumC13161a.ENQUEUED, this.f102696b);
            this.f102687M.resetWorkSpecRunAttemptCount(this.f102696b);
            this.f102687M.markWorkSpecScheduled(this.f102696b, -1L);
            this.f102686L.setTransactionSuccessful();
        } finally {
            this.f102686L.endTransaction();
            resolve(false);
        }
    }

    private void resolve(final boolean needsReschedule) {
        ListenableWorker listenableWorker;
        this.f102686L.beginTransaction();
        try {
            if (!this.f102686L.workSpecDao().hasUnfinishedWork()) {
                pac.setComponentEnabled(this.f102695a, RescheduleReceiver.class, false);
            }
            if (needsReschedule) {
                this.f102687M.setState(tpi.EnumC13161a.ENQUEUED, this.f102696b);
                this.f102687M.markWorkSpecScheduled(this.f102696b, -1L);
            }
            if (this.f102699e != null && (listenableWorker = this.f102700f) != null && listenableWorker.isRunInForeground()) {
                this.f102685H.stopForeground(this.f102696b);
            }
            this.f102686L.setTransactionSuccessful();
            this.f102686L.endTransaction();
            this.f102694Z.set(Boolean.valueOf(needsReschedule));
        } catch (Throwable th) {
            this.f102686L.endTransaction();
            throw th;
        }
    }

    private void resolveIncorrectStatus() {
        tpi.EnumC13161a state = this.f102687M.getState(this.f102696b);
        if (state == tpi.EnumC13161a.RUNNING) {
            cj9.get().debug(f102682Z1, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f102696b), new Throwable[0]);
            resolve(true);
        } else {
            cj9.get().debug(f102682Z1, String.format("Status for %s is %s; not doing any work", this.f102696b, state), new Throwable[0]);
            resolve(false);
        }
    }

    private void runWorker() {
        C1507b c1507bMerge;
        if (tryCheckForInterruptionAndResolve()) {
            return;
        }
        this.f102686L.beginTransaction();
        try {
            oqi workSpec = this.f102687M.getWorkSpec(this.f102696b);
            this.f102699e = workSpec;
            if (workSpec == null) {
                cj9.get().error(f102682Z1, String.format("Didn't find WorkSpec for id %s", this.f102696b), new Throwable[0]);
                resolve(false);
                this.f102686L.setTransactionSuccessful();
                return;
            }
            if (workSpec.f68338b != tpi.EnumC13161a.ENQUEUED) {
                resolveIncorrectStatus();
                this.f102686L.setTransactionSuccessful();
                cj9.get().debug(f102682Z1, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f102699e.f68339c), new Throwable[0]);
                return;
            }
            if (workSpec.isPeriodic() || this.f102699e.isBackedOff()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                oqi oqiVar = this.f102699e;
                if (oqiVar.f68350n != 0 && jCurrentTimeMillis < oqiVar.calculateNextRunTime()) {
                    cj9.get().debug(f102682Z1, String.format("Delaying execution for %s because it is being executed before schedule.", this.f102699e.f68339c), new Throwable[0]);
                    resolve(true);
                    this.f102686L.setTransactionSuccessful();
                    return;
                }
            }
            this.f102686L.setTransactionSuccessful();
            this.f102686L.endTransaction();
            if (this.f102699e.isPeriodic()) {
                c1507bMerge = this.f102699e.f68341e;
            } else {
                s38 s38VarCreateInputMergerWithDefaultFallback = this.f102684F.getInputMergerFactory().createInputMergerWithDefaultFallback(this.f102699e.f68340d);
                if (s38VarCreateInputMergerWithDefaultFallback == null) {
                    cj9.get().error(f102682Z1, String.format("Could not create Input Merger %s", this.f102699e.f68340d), new Throwable[0]);
                    m26304b();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f102699e.f68341e);
                    arrayList.addAll(this.f102687M.getInputsFromPrerequisites(this.f102696b));
                    c1507bMerge = s38VarCreateInputMergerWithDefaultFallback.merge(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f102696b), c1507bMerge, this.f102692X, this.f102698d, this.f102699e.f68347k, this.f102684F.getExecutor(), this.f102701m, this.f102684F.getWorkerFactory(), new hqi(this.f102686L, this.f102701m), new spi(this.f102686L, this.f102685H, this.f102701m));
            if (this.f102700f == null) {
                this.f102700f = this.f102684F.getWorkerFactory().createWorkerWithDefaultFallback(this.f102695a, this.f102699e.f68339c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f102700f;
            if (listenableWorker == null) {
                cj9.get().error(f102682Z1, String.format("Could not create Worker %s", this.f102699e.f68339c), new Throwable[0]);
                m26304b();
                return;
            }
            if (listenableWorker.isUsed()) {
                cj9.get().error(f102682Z1, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f102699e.f68339c), new Throwable[0]);
                m26304b();
                return;
            }
            this.f102700f.setUsed();
            if (!trySetRunning()) {
                resolveIncorrectStatus();
                return;
            }
            if (tryCheckForInterruptionAndResolve()) {
                return;
            }
            z6f z6fVarCreate = z6f.create();
            rpi rpiVar = new rpi(this.f102695a, this.f102699e, this.f102700f, workerParameters.getForegroundUpdater(), this.f102701m);
            this.f102701m.getMainThreadExecutor().execute(rpiVar);
            ja9<Void> future = rpiVar.getFuture();
            future.addListener(new RunnableC15770a(future, z6fVarCreate), this.f102701m.getMainThreadExecutor());
            z6fVarCreate.addListener(new RunnableC15771b(z6fVarCreate, this.f102693Y), this.f102701m.getBackgroundExecutor());
        } finally {
            this.f102686L.endTransaction();
        }
    }

    private void setSucceededAndResolve() {
        this.f102686L.beginTransaction();
        try {
            this.f102687M.setState(tpi.EnumC13161a.SUCCEEDED, this.f102696b);
            this.f102687M.setOutput(this.f102696b, ((ListenableWorker.AbstractC1502a.c) this.f102683C).getOutputData());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f102689N.getDependentWorkIds(this.f102696b)) {
                if (this.f102687M.getState(str) == tpi.EnumC13161a.BLOCKED && this.f102689N.hasCompletedAllPrerequisites(str)) {
                    cj9.get().info(f102682Z1, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f102687M.setState(tpi.EnumC13161a.ENQUEUED, str);
                    this.f102687M.setPeriodStartTime(str, jCurrentTimeMillis);
                }
            }
            this.f102686L.setTransactionSuccessful();
            this.f102686L.endTransaction();
            resolve(false);
        } catch (Throwable th) {
            this.f102686L.endTransaction();
            resolve(false);
            throw th;
        }
    }

    private boolean tryCheckForInterruptionAndResolve() {
        if (!this.f102691V1) {
            return false;
        }
        cj9.get().debug(f102682Z1, String.format("Work interrupted for %s", this.f102693Y), new Throwable[0]);
        if (this.f102687M.getState(this.f102696b) == null) {
            resolve(false);
        } else {
            resolve(!r0.isFinished());
        }
        return true;
    }

    private boolean trySetRunning() {
        boolean z;
        this.f102686L.beginTransaction();
        try {
            if (this.f102687M.getState(this.f102696b) == tpi.EnumC13161a.ENQUEUED) {
                this.f102687M.setState(tpi.EnumC13161a.RUNNING, this.f102696b);
                this.f102687M.incrementWorkSpecRunAttemptCount(this.f102696b);
                z = true;
            } else {
                z = false;
            }
            this.f102686L.setTransactionSuccessful();
            this.f102686L.endTransaction();
            return z;
        } catch (Throwable th) {
            this.f102686L.endTransaction();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m26303a() {
        if (!tryCheckForInterruptionAndResolve()) {
            this.f102686L.beginTransaction();
            try {
                tpi.EnumC13161a state = this.f102687M.getState(this.f102696b);
                this.f102686L.workProgressDao().delete(this.f102696b);
                if (state == null) {
                    resolve(false);
                } else if (state == tpi.EnumC13161a.RUNNING) {
                    handleResult(this.f102683C);
                } else if (!state.isFinished()) {
                    rescheduleAndResolve();
                }
                this.f102686L.setTransactionSuccessful();
                this.f102686L.endTransaction();
            } catch (Throwable th) {
                this.f102686L.endTransaction();
                throw th;
            }
        }
        List<roe> list = this.f102697c;
        if (list != null) {
            Iterator<roe> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(this.f102696b);
            }
            ope.schedule(this.f102684F, this.f102686L, this.f102697c);
        }
    }

    @fdi
    /* JADX INFO: renamed from: b */
    public void m26304b() {
        this.f102686L.beginTransaction();
        try {
            iterativelyFailWorkAndDependents(this.f102696b);
            this.f102687M.setOutput(this.f102696b, ((ListenableWorker.AbstractC1502a.a) this.f102683C).getOutputData());
            this.f102686L.setTransactionSuccessful();
        } finally {
            this.f102686L.endTransaction();
            resolve(false);
        }
    }

    @efb
    public ja9<Boolean> getFuture() {
        return this.f102694Z;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void interrupt() {
        boolean zIsDone;
        this.f102691V1 = true;
        tryCheckForInterruptionAndResolve();
        ja9<ListenableWorker.AbstractC1502a> ja9Var = this.f102688M1;
        if (ja9Var != null) {
            zIsDone = ja9Var.isDone();
            this.f102688M1.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f102700f;
        if (listenableWorker != null && !zIsDone) {
            listenableWorker.stop();
        } else {
            cj9.get().debug(f102682Z1, String.format("WorkSpec %s is already done. Not interrupting.", this.f102699e), new Throwable[0]);
        }
    }

    @Override // java.lang.Runnable
    @xqi
    public void run() {
        List<String> tagsForWorkSpecId = this.f102690Q.getTagsForWorkSpecId(this.f102696b);
        this.f102692X = tagsForWorkSpecId;
        this.f102693Y = createWorkDescription(tagsForWorkSpecId);
        runWorker();
    }
}
