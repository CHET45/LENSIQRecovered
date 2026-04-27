package p000;

import android.content.Context;
import androidx.work.C1507b;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yyd {
    @p7e({p7e.EnumC10826a.f69935b})
    public yyd() {
    }

    @efb
    public static yyd getInstance(@efb Context context) {
        yyd remoteWorkManager = zpi.getInstance(context).getRemoteWorkManager();
        if (remoteWorkManager != null) {
            return remoteWorkManager;
        }
        throw new IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    @efb
    public final xyd beginUniqueWork(@efb String uniqueWorkName, @efb s95 existingWorkPolicy, @efb e5c work) {
        return beginUniqueWork(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @efb
    public abstract xyd beginUniqueWork(@efb String uniqueWorkName, @efb s95 existingWorkPolicy, @efb List<e5c> work);

    @efb
    public final xyd beginWith(@efb e5c work) {
        return beginWith(Collections.singletonList(work));
    }

    @efb
    public abstract xyd beginWith(@efb List<e5c> work);

    @efb
    public abstract ja9<Void> cancelAllWork();

    @efb
    public abstract ja9<Void> cancelAllWorkByTag(@efb String tag);

    @efb
    public abstract ja9<Void> cancelUniqueWork(@efb String uniqueWorkName);

    @efb
    public abstract ja9<Void> cancelWorkById(@efb UUID id);

    @efb
    public abstract ja9<Void> enqueue(@efb List<lqi> requests);

    @efb
    public abstract ja9<Void> enqueue(@efb lqi request);

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public abstract ja9<Void> enqueue(@efb opi continuation);

    @efb
    public abstract ja9<Void> enqueueUniquePeriodicWork(@efb String uniqueWorkName, @efb r95 existingPeriodicWorkPolicy, @efb wnc periodicWork);

    @efb
    public final ja9<Void> enqueueUniqueWork(@efb String uniqueWorkName, @efb s95 existingWorkPolicy, @efb e5c work) {
        return enqueueUniqueWork(uniqueWorkName, existingWorkPolicy, Collections.singletonList(work));
    }

    @efb
    public abstract ja9<Void> enqueueUniqueWork(@efb String uniqueWorkName, @efb s95 existingWorkPolicy, @efb List<e5c> work);

    @efb
    public abstract ja9<List<tpi>> getWorkInfos(@efb iqi workQuery);

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public abstract ja9<Void> setProgress(@efb UUID id, @efb C1507b data);
}
