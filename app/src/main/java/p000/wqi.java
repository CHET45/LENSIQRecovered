package p000;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wqi {

    /* JADX INFO: renamed from: a */
    public static final String f95182a = cj9.tagWithPrefix("WorkerFactory");

    /* JADX INFO: renamed from: wqi$a */
    public class C14752a extends wqi {
        @Override // p000.wqi
        @hib
        public ListenableWorker createWorker(@efb Context appContext, @efb String workerClassName, @efb WorkerParameters workerParameters) {
            return null;
        }
    }

    @efb
    @p7e({p7e.EnumC10826a.f69935b})
    public static wqi getDefaultWorkerFactory() {
        return new C14752a();
    }

    @hib
    public abstract ListenableWorker createWorker(@efb Context appContext, @efb String workerClassName, @efb WorkerParameters workerParameters);

    @hib
    @p7e({p7e.EnumC10826a.f69935b})
    public final ListenableWorker createWorkerWithDefaultFallback(@efb Context appContext, @efb String workerClassName, @efb WorkerParameters workerParameters) {
        Class clsAsSubclass;
        ListenableWorker listenableWorkerCreateWorker = createWorker(appContext, workerClassName, workerParameters);
        if (listenableWorkerCreateWorker == null) {
            try {
                clsAsSubclass = Class.forName(workerClassName).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                cj9.get().error(f95182a, "Invalid class: " + workerClassName, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerCreateWorker = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(appContext, workerParameters);
                } catch (Throwable th2) {
                    cj9.get().error(f95182a, "Could not instantiate " + workerClassName, th2);
                }
            }
        }
        if (listenableWorkerCreateWorker == null || !listenableWorkerCreateWorker.isUsed()) {
            return listenableWorkerCreateWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), workerClassName));
    }
}
