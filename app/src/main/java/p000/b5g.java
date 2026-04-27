package p000;

import androidx.work.impl.WorkDatabase;
import p000.p7e;
import p000.tpi;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class b5g implements Runnable {

    /* JADX INFO: renamed from: d */
    public static final String f12729d = cj9.tagWithPrefix("StopWorkRunnable");

    /* JADX INFO: renamed from: a */
    public final zpi f12730a;

    /* JADX INFO: renamed from: b */
    public final String f12731b;

    /* JADX INFO: renamed from: c */
    public final boolean f12732c;

    public b5g(@efb zpi workManagerImpl, @efb String workSpecId, boolean stopInForeground) {
        this.f12730a = workManagerImpl;
        this.f12731b = workSpecId;
        this.f12732c = stopInForeground;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zStopWork;
        WorkDatabase workDatabase = this.f12730a.getWorkDatabase();
        ldd processor = this.f12730a.getProcessor();
        pqi pqiVarWorkSpecDao = workDatabase.workSpecDao();
        workDatabase.beginTransaction();
        try {
            boolean zIsEnqueuedInForeground = processor.isEnqueuedInForeground(this.f12731b);
            if (this.f12732c) {
                zStopWork = this.f12730a.getProcessor().stopForegroundWork(this.f12731b);
            } else {
                if (!zIsEnqueuedInForeground && pqiVarWorkSpecDao.getState(this.f12731b) == tpi.EnumC13161a.RUNNING) {
                    pqiVarWorkSpecDao.setState(tpi.EnumC13161a.ENQUEUED, this.f12731b);
                }
                zStopWork = this.f12730a.getProcessor().stopWork(this.f12731b);
            }
            cj9.get().debug(f12729d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f12731b, Boolean.valueOf(zStopWork)), new Throwable[0]);
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
        } catch (Throwable th) {
            workDatabase.endTransaction();
            throw th;
        }
    }
}
