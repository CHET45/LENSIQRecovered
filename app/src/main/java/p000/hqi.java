package p000;

import android.content.Context;
import androidx.work.C1507b;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p000.p7e;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class hqi implements qed {

    /* JADX INFO: renamed from: c */
    public static final String f44609c = cj9.tagWithPrefix("WorkProgressUpdater");

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f44610a;

    /* JADX INFO: renamed from: b */
    public final ong f44611b;

    /* JADX INFO: renamed from: hqi$a */
    public class RunnableC6976a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UUID f44612a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1507b f44613b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ z6f f44614c;

        public RunnableC6976a(final UUID val$id, final C1507b val$data, final z6f val$future) {
            this.f44612a = val$id;
            this.f44613b = val$data;
            this.f44614c = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            oqi workSpec;
            String string = this.f44612a.toString();
            cj9 cj9Var = cj9.get();
            String str = hqi.f44609c;
            cj9Var.debug(str, String.format("Updating progress for %s (%s)", this.f44612a, this.f44613b), new Throwable[0]);
            hqi.this.f44610a.beginTransaction();
            try {
                workSpec = hqi.this.f44610a.workSpecDao().getWorkSpec(string);
            } finally {
                try {
                } finally {
                }
            }
            if (workSpec == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (workSpec.f68338b == tpi.EnumC13161a.RUNNING) {
                hqi.this.f44610a.workProgressDao().insert(new eqi(string, this.f44613b));
            } else {
                cj9.get().warning(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
            }
            this.f44614c.set(null);
            hqi.this.f44610a.setTransactionSuccessful();
        }
    }

    public hqi(@efb WorkDatabase workDatabase, @efb ong taskExecutor) {
        this.f44610a = workDatabase;
        this.f44611b = taskExecutor;
    }

    @Override // p000.qed
    @efb
    public ja9<Void> updateProgress(@efb final Context context, @efb final UUID id, @efb final C1507b data) {
        z6f z6fVarCreate = z6f.create();
        this.f44611b.executeOnBackgroundThread(new RunnableC6976a(id, data, z6fVarCreate));
        return z6fVarCreate;
    }
}
