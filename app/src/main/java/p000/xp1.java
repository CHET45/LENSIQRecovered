package p000;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import p000.p7e;
import p000.tpi;
import p000.x5c;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public abstract class xp1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final d6c f98844a = new d6c();

    /* JADX INFO: renamed from: xp1$a */
    public class C15239a extends xp1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zpi f98845b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ UUID f98846c;

        public C15239a(final zpi val$workManagerImpl, final UUID val$id) {
            this.f98845b = val$workManagerImpl;
            this.f98846c = val$id;
        }

        @Override // p000.xp1
        @xqi
        /* JADX INFO: renamed from: c */
        public void mo25371c() {
            WorkDatabase workDatabase = this.f98845b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                m25369a(this.f98845b, this.f98846c.toString());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                m25370b(this.f98845b);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: xp1$b */
    public class C15240b extends xp1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zpi f98847b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f98848c;

        public C15240b(final zpi val$workManagerImpl, final String val$tag) {
            this.f98847b = val$workManagerImpl;
            this.f98848c = val$tag;
        }

        @Override // p000.xp1
        @xqi
        /* JADX INFO: renamed from: c */
        public void mo25371c() {
            WorkDatabase workDatabase = this.f98847b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithTag(this.f98848c).iterator();
                while (it.hasNext()) {
                    m25369a(this.f98847b, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                m25370b(this.f98847b);
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: xp1$c */
    public class C15241c extends xp1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zpi f98849b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f98850c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f98851d;

        public C15241c(final zpi val$workManagerImpl, final String val$name, final boolean val$allowReschedule) {
            this.f98849b = val$workManagerImpl;
            this.f98850c = val$name;
            this.f98851d = val$allowReschedule;
        }

        @Override // p000.xp1
        @xqi
        /* JADX INFO: renamed from: c */
        public void mo25371c() {
            WorkDatabase workDatabase = this.f98849b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getUnfinishedWorkWithName(this.f98850c).iterator();
                while (it.hasNext()) {
                    m25369a(this.f98849b, it.next());
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (this.f98851d) {
                    m25370b(this.f98849b);
                }
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: xp1$d */
    public class C15242d extends xp1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zpi f98852b;

        public C15242d(final zpi val$workManagerImpl) {
            this.f98852b = val$workManagerImpl;
        }

        @Override // p000.xp1
        @xqi
        /* JADX INFO: renamed from: c */
        public void mo25371c() {
            WorkDatabase workDatabase = this.f98852b.getWorkDatabase();
            workDatabase.beginTransaction();
            try {
                Iterator<String> it = workDatabase.workSpecDao().getAllUnfinishedWork().iterator();
                while (it.hasNext()) {
                    m25369a(this.f98852b, it.next());
                }
                new c9d(this.f98852b.getWorkDatabase()).setLastCancelAllTimeMillis(System.currentTimeMillis());
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    public static xp1 forAll(@efb final zpi workManagerImpl) {
        return new C15242d(workManagerImpl);
    }

    public static xp1 forId(@efb final UUID id, @efb final zpi workManagerImpl) {
        return new C15239a(workManagerImpl, id);
    }

    public static xp1 forName(@efb final String name, @efb final zpi workManagerImpl, final boolean allowReschedule) {
        return new C15241c(workManagerImpl, name, allowReschedule);
    }

    public static xp1 forTag(@efb final String tag, @efb final zpi workManagerImpl) {
        return new C15240b(workManagerImpl, tag);
    }

    private void iterativelyCancelWorkAndDependents(WorkDatabase workDatabase, String workSpecId) {
        pqi pqiVarWorkSpecDao = workDatabase.workSpecDao();
        l64 l64VarDependencyDao = workDatabase.dependencyDao();
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            tpi.EnumC13161a state = pqiVarWorkSpecDao.getState(str);
            if (state != tpi.EnumC13161a.SUCCEEDED && state != tpi.EnumC13161a.FAILED) {
                pqiVarWorkSpecDao.setState(tpi.EnumC13161a.CANCELLED, str);
            }
            linkedList.addAll(l64VarDependencyDao.getDependentWorkIds(str));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25369a(zpi workManagerImpl, String workSpecId) {
        iterativelyCancelWorkAndDependents(workManagerImpl.getWorkDatabase(), workSpecId);
        workManagerImpl.getProcessor().stopAndCancelWork(workSpecId);
        Iterator<roe> it = workManagerImpl.getSchedulers().iterator();
        while (it.hasNext()) {
            it.next().cancel(workSpecId);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25370b(zpi workManagerImpl) {
        ope.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo25371c();

    public x5c getOperation() {
        return this.f98844a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo25371c();
            this.f98844a.setState(x5c.f96833a);
        } catch (Throwable th) {
            this.f98844a.setState(new x5c.AbstractC14928b.a(th));
        }
    }
}
