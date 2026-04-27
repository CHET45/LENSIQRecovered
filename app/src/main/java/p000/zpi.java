package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1158q;
import androidx.work.C1503R;
import androidx.work.C1506a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1520a;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p000.cj9;
import p000.oqi;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class zpi extends ypi {

    /* JADX INFO: renamed from: l */
    public static final int f105715l = 22;

    /* JADX INFO: renamed from: m */
    public static final int f105716m = 23;

    /* JADX INFO: renamed from: n */
    public static final String f105717n = "androidx.work.multiprocess.RemoteWorkManagerClient";

    /* JADX INFO: renamed from: a */
    public Context f105721a;

    /* JADX INFO: renamed from: b */
    public C1506a f105722b;

    /* JADX INFO: renamed from: c */
    public WorkDatabase f105723c;

    /* JADX INFO: renamed from: d */
    public ong f105724d;

    /* JADX INFO: renamed from: e */
    public List<roe> f105725e;

    /* JADX INFO: renamed from: f */
    public ldd f105726f;

    /* JADX INFO: renamed from: g */
    public c9d f105727g;

    /* JADX INFO: renamed from: h */
    public boolean f105728h;

    /* JADX INFO: renamed from: i */
    public BroadcastReceiver.PendingResult f105729i;

    /* JADX INFO: renamed from: j */
    public volatile yyd f105730j;

    /* JADX INFO: renamed from: k */
    public static final String f105714k = cj9.tagWithPrefix("WorkManagerImpl");

    /* JADX INFO: renamed from: o */
    public static zpi f105718o = null;

    /* JADX INFO: renamed from: p */
    public static zpi f105719p = null;

    /* JADX INFO: renamed from: q */
    public static final Object f105720q = new Object();

    /* JADX INFO: renamed from: zpi$a */
    public class RunnableC16213a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z6f f105731a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c9d f105732b;

        public RunnableC16213a(final z6f val$future, final c9d val$preferenceUtils) {
            this.f105731a = val$future;
            this.f105732b = val$preferenceUtils;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f105731a.set(Long.valueOf(this.f105732b.getLastCancelAllTimeMillis()));
            } catch (Throwable th) {
                this.f105731a.setException(th);
            }
        }
    }

    /* JADX INFO: renamed from: zpi$b */
    public class C16214b implements f07<List<oqi.C10507c>, tpi> {
        public C16214b() {
        }

        @Override // p000.f07
        public tpi apply(List<oqi.C10507c> input) {
            if (input == null || input.size() <= 0) {
                return null;
            }
            return input.get(0).toWorkInfo();
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public zpi(@efb Context context, @efb C1506a configuration, @efb ong workTaskExecutor) {
        this(context, configuration, workTaskExecutor, context.getResources().getBoolean(C1503R.bool.workmanager_test_configuration));
    }

    @hib
    @Deprecated
    @p7e({p7e.EnumC10826a.f69935b})
    public static zpi getInstance() {
        synchronized (f105720q) {
            try {
                zpi zpiVar = f105718o;
                if (zpiVar != null) {
                    return zpiVar;
                }
                return f105719p;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public static void initialize(@efb Context context, @efb C1506a configuration) {
        synchronized (f105720q) {
            try {
                zpi zpiVar = f105718o;
                if (zpiVar != null && f105719p != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (zpiVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f105719p == null) {
                        f105719p = new zpi(applicationContext, configuration, new aqi(configuration.getTaskExecutor()));
                    }
                    f105718o = f105719p;
                }
            } finally {
            }
        }
    }

    private void internalInit(@efb Context context, @efb C1506a configuration, @efb ong workTaskExecutor, @efb WorkDatabase workDatabase, @efb List<roe> schedulers, @efb ldd processor) {
        Context applicationContext = context.getApplicationContext();
        this.f105721a = applicationContext;
        this.f105722b = configuration;
        this.f105724d = workTaskExecutor;
        this.f105723c = workDatabase;
        this.f105725e = schedulers;
        this.f105726f = processor;
        this.f105727g = new c9d(workDatabase);
        this.f105728h = false;
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f105724d.executeOnBackgroundThread(new ForceStopRunnable(applicationContext, this));
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public static void setDelegate(@hib zpi delegate) {
        synchronized (f105720q) {
            f105718o = delegate;
        }
    }

    private void tryInitializeMultiProcessSupport() {
        try {
            this.f105730j = (yyd) Class.forName(f105717n).getConstructor(Context.class, zpi.class).newInstance(this.f105721a, this);
        } catch (Throwable th) {
            cj9.get().debug(f105714k, "Unable to initialize multi-process support", th);
        }
    }

    /* JADX INFO: renamed from: a */
    public AbstractC1158q<List<tpi>> m26950a(@efb List<String> workSpecIds) {
        return nb9.dedupedMappedLiveDataFor(this.f105723c.workSpecDao().getWorkStatusPojoLiveDataForIds(workSpecIds), oqi.f68336u, this.f105724d);
    }

    @Override // p000.ypi
    @efb
    public opi beginUniqueWork(@efb String uniqueWorkName, @efb s95 existingWorkPolicy, @efb List<e5c> work) {
        if (work.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        return new ppi(this, uniqueWorkName, existingWorkPolicy, work);
    }

    @Override // p000.ypi
    @efb
    public opi beginWith(@efb List<e5c> work) {
        if (work.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        return new ppi(this, work);
    }

    @Override // p000.ypi
    @efb
    public x5c cancelAllWork() {
        xp1 xp1VarForAll = xp1.forAll(this);
        this.f105724d.executeOnBackgroundThread(xp1VarForAll);
        return xp1VarForAll.getOperation();
    }

    @Override // p000.ypi
    @efb
    public x5c cancelAllWorkByTag(@efb final String tag) {
        xp1 xp1VarForTag = xp1.forTag(tag, this);
        this.f105724d.executeOnBackgroundThread(xp1VarForTag);
        return xp1VarForTag.getOperation();
    }

    @Override // p000.ypi
    @efb
    public x5c cancelUniqueWork(@efb String uniqueWorkName) {
        xp1 xp1VarForName = xp1.forName(uniqueWorkName, this, true);
        this.f105724d.executeOnBackgroundThread(xp1VarForName);
        return xp1VarForName.getOperation();
    }

    @Override // p000.ypi
    @efb
    public x5c cancelWorkById(@efb UUID id) {
        xp1 xp1VarForId = xp1.forId(id, this);
        this.f105724d.executeOnBackgroundThread(xp1VarForId);
        return xp1VarForId.getOperation();
    }

    @Override // p000.ypi
    @efb
    public PendingIntent createCancelPendingIntent(@efb UUID id) {
        return PendingIntent.getService(this.f105721a, 0, C1520a.createCancelWorkIntent(this.f105721a, id.toString()), nf1.isAtLeastS() ? 167772160 : 134217728);
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public List<roe> createSchedulers(@efb Context context, @efb C1506a configuration, @efb ong taskExecutor) {
        return Arrays.asList(ope.m18807a(context, this), new gb7(context, configuration, taskExecutor, this));
    }

    @efb
    public ppi createWorkContinuationForUniquePeriodicWork(@efb String uniqueWorkName, @efb r95 existingPeriodicWorkPolicy, @efb wnc periodicWork) {
        return new ppi(this, uniqueWorkName, existingPeriodicWorkPolicy == r95.KEEP ? s95.KEEP : s95.REPLACE, Collections.singletonList(periodicWork));
    }

    @Override // p000.ypi
    @efb
    public x5c enqueue(@efb List<? extends lqi> requests) {
        if (requests.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new ppi(this, requests).enqueue();
    }

    @Override // p000.ypi
    @efb
    public x5c enqueueUniquePeriodicWork(@efb String uniqueWorkName, @efb r95 existingPeriodicWorkPolicy, @efb wnc periodicWork) {
        return createWorkContinuationForUniquePeriodicWork(uniqueWorkName, existingPeriodicWorkPolicy, periodicWork).enqueue();
    }

    @Override // p000.ypi
    @efb
    public x5c enqueueUniqueWork(@efb String uniqueWorkName, @efb s95 existingWorkPolicy, @efb List<e5c> work) {
        return new ppi(this, uniqueWorkName, existingWorkPolicy, work).enqueue();
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public Context getApplicationContext() {
        return this.f105721a;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public C1506a getConfiguration() {
        return this.f105722b;
    }

    @Override // p000.ypi
    @efb
    public ja9<Long> getLastCancelAllTimeMillis() {
        z6f z6fVarCreate = z6f.create();
        this.f105724d.executeOnBackgroundThread(new RunnableC16213a(z6fVarCreate, this.f105727g));
        return z6fVarCreate;
    }

    @Override // p000.ypi
    @efb
    public AbstractC1158q<Long> getLastCancelAllTimeMillisLiveData() {
        return this.f105727g.getLastCancelAllTimeMillisLiveData();
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public c9d getPreferenceUtils() {
        return this.f105727g;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public ldd getProcessor() {
        return this.f105726f;
    }

    @hib
    @p7e({p7e.EnumC10826a.f69935b})
    public yyd getRemoteWorkManager() {
        if (this.f105730j == null) {
            synchronized (f105720q) {
                try {
                    if (this.f105730j == null) {
                        tryInitializeMultiProcessSupport();
                        if (this.f105730j == null && !TextUtils.isEmpty(this.f105722b.getDefaultProcessName())) {
                            throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f105730j;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public List<roe> getSchedulers() {
        return this.f105725e;
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public WorkDatabase getWorkDatabase() {
        return this.f105723c;
    }

    @Override // p000.ypi
    @efb
    public ja9<tpi> getWorkInfoById(@efb UUID id) {
        u4g<tpi> u4gVarForUUID = u4g.forUUID(this, id);
        this.f105724d.getBackgroundExecutor().execute(u4gVarForUUID);
        return u4gVarForUUID.getFuture();
    }

    @Override // p000.ypi
    @efb
    public AbstractC1158q<tpi> getWorkInfoByIdLiveData(@efb UUID id) {
        return nb9.dedupedMappedLiveDataFor(this.f105723c.workSpecDao().getWorkStatusPojoLiveDataForIds(Collections.singletonList(id.toString())), new C16214b(), this.f105724d);
    }

    @Override // p000.ypi
    @efb
    public ja9<List<tpi>> getWorkInfos(@efb iqi workQuery) {
        u4g<List<tpi>> u4gVarForWorkQuerySpec = u4g.forWorkQuerySpec(this, workQuery);
        this.f105724d.getBackgroundExecutor().execute(u4gVarForWorkQuerySpec);
        return u4gVarForWorkQuerySpec.getFuture();
    }

    @Override // p000.ypi
    @efb
    public ja9<List<tpi>> getWorkInfosByTag(@efb String tag) {
        u4g<List<tpi>> u4gVarForTag = u4g.forTag(this, tag);
        this.f105724d.getBackgroundExecutor().execute(u4gVarForTag);
        return u4gVarForTag.getFuture();
    }

    @Override // p000.ypi
    @efb
    public AbstractC1158q<List<tpi>> getWorkInfosByTagLiveData(@efb String tag) {
        return nb9.dedupedMappedLiveDataFor(this.f105723c.workSpecDao().getWorkStatusPojoLiveDataForTag(tag), oqi.f68336u, this.f105724d);
    }

    @Override // p000.ypi
    @efb
    public ja9<List<tpi>> getWorkInfosForUniqueWork(@efb String uniqueWorkName) {
        u4g<List<tpi>> u4gVarForUniqueWork = u4g.forUniqueWork(this, uniqueWorkName);
        this.f105724d.getBackgroundExecutor().execute(u4gVarForUniqueWork);
        return u4gVarForUniqueWork.getFuture();
    }

    @Override // p000.ypi
    @efb
    public AbstractC1158q<List<tpi>> getWorkInfosForUniqueWorkLiveData(@efb String uniqueWorkName) {
        return nb9.dedupedMappedLiveDataFor(this.f105723c.workSpecDao().getWorkStatusPojoLiveDataForName(uniqueWorkName), oqi.f68336u, this.f105724d);
    }

    @Override // p000.ypi
    @efb
    public AbstractC1158q<List<tpi>> getWorkInfosLiveData(@efb iqi workQuery) {
        return nb9.dedupedMappedLiveDataFor(this.f105723c.rawWorkInfoDao().getWorkInfoPojosLiveData(upd.workQueryToRawQuery(workQuery)), oqi.f68336u, this.f105724d);
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public ong getWorkTaskExecutor() {
        return this.f105724d;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void onForceStopRunnableCompleted() {
        synchronized (f105720q) {
            try {
                this.f105728h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f105729i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f105729i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ypi
    @efb
    public x5c pruneWork() {
        vid vidVar = new vid(this);
        this.f105724d.executeOnBackgroundThread(vidVar);
        return vidVar.getOperation();
    }

    public void rescheduleEligibleWork() {
        ojg.cancelAll(getApplicationContext());
        getWorkDatabase().workSpecDao().resetScheduledState();
        ope.schedule(getConfiguration(), getWorkDatabase(), getSchedulers());
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void setReschedulePendingResult(@efb BroadcastReceiver.PendingResult rescheduleReceiverResult) {
        synchronized (f105720q) {
            try {
                this.f105729i = rescheduleReceiverResult;
                if (this.f105728h) {
                    rescheduleReceiverResult.finish();
                    this.f105729i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void startWork(@efb String workSpecId) {
        startWork(workSpecId, null);
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void stopForegroundWork(@efb String workSpecId) {
        this.f105724d.executeOnBackgroundThread(new b5g(this, workSpecId, true));
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void stopWork(@efb String workSpecId) {
        this.f105724d.executeOnBackgroundThread(new b5g(this, workSpecId, false));
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public void startWork(@efb String workSpecId, @hib WorkerParameters.C1505a runtimeExtras) {
        this.f105724d.executeOnBackgroundThread(new y1g(this, workSpecId, runtimeExtras));
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public zpi(@efb Context context, @efb C1506a configuration, @efb ong workTaskExecutor, boolean useTestDatabase) {
        this(context, configuration, workTaskExecutor, WorkDatabase.create(context.getApplicationContext(), workTaskExecutor.getBackgroundExecutor(), useTestDatabase));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public static zpi getInstance(@efb Context context) {
        zpi zpiVar;
        synchronized (f105720q) {
            try {
                zpiVar = getInstance();
                if (zpiVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof C1506a.c) {
                        initialize(applicationContext, ((C1506a.c) applicationContext).getWorkManagerConfiguration());
                        zpiVar = getInstance(applicationContext);
                    } else {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zpiVar;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public zpi(@efb Context context, @efb C1506a configuration, @efb ong workTaskExecutor, @efb WorkDatabase database) {
        Context applicationContext = context.getApplicationContext();
        cj9.setLogger(new cj9.C2332a(configuration.getMinimumLoggingLevel()));
        List<roe> listCreateSchedulers = createSchedulers(applicationContext, configuration, workTaskExecutor);
        internalInit(context, configuration, workTaskExecutor, database, listCreateSchedulers, new ldd(context, configuration, workTaskExecutor, database, listCreateSchedulers));
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public zpi(@efb Context context, @efb C1506a configuration, @efb ong workTaskExecutor, @efb WorkDatabase workDatabase, @efb List<roe> schedulers, @efb ldd processor) {
        internalInit(context, configuration, workTaskExecutor, workDatabase, schedulers, processor);
    }
}
