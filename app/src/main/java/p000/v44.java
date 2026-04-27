package p000;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class v44 extends wqi {

    /* JADX INFO: renamed from: c */
    public static final String f89894c = cj9.tagWithPrefix("DelegatingWkrFctry");

    /* JADX INFO: renamed from: b */
    public final List<wqi> f89895b = new CopyOnWriteArrayList();

    @efb
    @fdi
    /* JADX INFO: renamed from: a */
    public List<wqi> m23772a() {
        return this.f89895b;
    }

    public final void addFactory(@efb wqi workerFactory) {
        this.f89895b.add(workerFactory);
    }

    @Override // p000.wqi
    @hib
    public final ListenableWorker createWorker(@efb Context appContext, @efb String workerClassName, @efb WorkerParameters workerParameters) {
        Iterator<wqi> it = this.f89895b.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker listenableWorkerCreateWorker = it.next().createWorker(appContext, workerClassName, workerParameters);
                if (listenableWorkerCreateWorker != null) {
                    return listenableWorkerCreateWorker;
                }
            } catch (Throwable th) {
                cj9.get().error(f89894c, String.format("Unable to instantiate a ListenableWorker (%s)", workerClassName), th);
                throw th;
            }
        }
        return null;
    }
}
