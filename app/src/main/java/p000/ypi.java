package p000;

import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.AbstractC1158q;
import androidx.work.C1506a;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@igg({"AddedAbstractMethod"})
public abstract class ypi {
    @p7e({p7e.EnumC10826a.f69935b})
    public ypi() {
    }

    @efb
    @Deprecated
    public static ypi getInstance() {
        zpi zpiVar = zpi.getInstance();
        if (zpiVar != null) {
            return zpiVar;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    public static void initialize(@efb Context context, @efb C1506a configuration) {
        zpi.initialize(context, configuration);
    }

    @efb
    public final opi beginUniqueWork(@efb String uniqueWorkName, @efb s95 existingWorkPolicy, @efb e5c work) {
        return beginUniqueWork(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @efb
    public abstract opi beginUniqueWork(@efb String uniqueWorkName, @efb s95 existingWorkPolicy, @efb List<e5c> work);

    @efb
    public final opi beginWith(@efb e5c work) {
        return beginWith(Collections.singletonList(work));
    }

    @efb
    public abstract opi beginWith(@efb List<e5c> work);

    @efb
    public abstract x5c cancelAllWork();

    @efb
    public abstract x5c cancelAllWorkByTag(@efb String tag);

    @efb
    public abstract x5c cancelUniqueWork(@efb String uniqueWorkName);

    @efb
    public abstract x5c cancelWorkById(@efb UUID id);

    @efb
    public abstract PendingIntent createCancelPendingIntent(@efb UUID id);

    @efb
    public abstract x5c enqueue(@efb List<? extends lqi> requests);

    @efb
    public final x5c enqueue(@efb lqi workRequest) {
        return enqueue(Collections.singletonList(workRequest));
    }

    @efb
    public abstract x5c enqueueUniquePeriodicWork(@efb String uniqueWorkName, @efb r95 existingPeriodicWorkPolicy, @efb wnc periodicWork);

    @efb
    public x5c enqueueUniqueWork(@efb String uniqueWorkName, @efb s95 existingWorkPolicy, @efb e5c work) {
        return enqueueUniqueWork(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @efb
    public abstract x5c enqueueUniqueWork(@efb String uniqueWorkName, @efb s95 existingWorkPolicy, @efb List<e5c> work);

    @efb
    public abstract ja9<Long> getLastCancelAllTimeMillis();

    @efb
    public abstract AbstractC1158q<Long> getLastCancelAllTimeMillisLiveData();

    @efb
    public abstract ja9<tpi> getWorkInfoById(@efb UUID id);

    @efb
    public abstract AbstractC1158q<tpi> getWorkInfoByIdLiveData(@efb UUID id);

    @efb
    public abstract ja9<List<tpi>> getWorkInfos(@efb iqi workQuery);

    @efb
    public abstract ja9<List<tpi>> getWorkInfosByTag(@efb String tag);

    @efb
    public abstract AbstractC1158q<List<tpi>> getWorkInfosByTagLiveData(@efb String tag);

    @efb
    public abstract ja9<List<tpi>> getWorkInfosForUniqueWork(@efb String uniqueWorkName);

    @efb
    public abstract AbstractC1158q<List<tpi>> getWorkInfosForUniqueWorkLiveData(@efb String uniqueWorkName);

    @efb
    public abstract AbstractC1158q<List<tpi>> getWorkInfosLiveData(@efb iqi workQuery);

    @efb
    public abstract x5c pruneWork();

    @efb
    public static ypi getInstance(@efb Context context) {
        return zpi.getInstance(context);
    }
}
