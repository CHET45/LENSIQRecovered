package p000;

import android.text.TextUtils;
import androidx.work.C1507b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Iterator;
import java.util.List;
import p000.p7e;
import p000.x5c;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public class n25 implements Runnable {

    /* JADX INFO: renamed from: c */
    public static final String f63046c = cj9.tagWithPrefix("EnqueueRunnable");

    /* JADX INFO: renamed from: a */
    public final ppi f63047a;

    /* JADX INFO: renamed from: b */
    public final d6c f63048b = new d6c();

    public n25(@efb ppi workContinuation) {
        this.f63047a = workContinuation;
    }

    private static boolean enqueueContinuation(@efb ppi workContinuation) {
        boolean zEnqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuation.getWorkManagerImpl(), workContinuation.getWork(), (String[]) ppi.prerequisitesFor(workContinuation).toArray(new String[0]), workContinuation.getName(), workContinuation.getExistingWorkPolicy());
        workContinuation.markEnqueued();
        return zEnqueueWorkWithPrerequisites;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0137 A[PHI: r0 r8 r11 r12 r13
  0x0137: PHI (r0v1 java.lang.String[]) = 
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v0 java.lang.String[])
  (r0v13 java.lang.String[])
  (r0v13 java.lang.String[])
 binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0136, B:80:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0136, B:80:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0136, B:80:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0136, B:80:0x0134] A[DONT_GENERATE, DONT_INLINE]
  0x0137: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0136, B:80:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean enqueueWorkWithPrerequisites(p000.zpi r16, @p000.efb java.util.List<? extends p000.lqi> r17, java.lang.String[] r18, java.lang.String r19, p000.s95 r20) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n25.enqueueWorkWithPrerequisites(zpi, java.util.List, java.lang.String[], java.lang.String, s95):boolean");
    }

    private static boolean processContinuation(@efb ppi workContinuation) {
        List<ppi> parents = workContinuation.getParents();
        boolean z = false;
        if (parents != null) {
            boolean zProcessContinuation = false;
            for (ppi ppiVar : parents) {
                if (ppiVar.isEnqueued()) {
                    cj9.get().warning(f63046c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", ppiVar.getIds())), new Throwable[0]);
                } else {
                    zProcessContinuation |= processContinuation(ppiVar);
                }
            }
            z = zProcessContinuation;
        }
        return enqueueContinuation(workContinuation) | z;
    }

    private static void tryDelegateConstrainedWorkSpec(oqi workSpec) {
        lu2 lu2Var = workSpec.f68346j;
        String str = workSpec.f68339c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (lu2Var.requiresBatteryNotLow() || lu2Var.requiresStorageNotLow()) {
            C1507b.a aVar = new C1507b.a();
            aVar.putAll(workSpec.f68341e).putString(ConstraintTrackingWorker.f11407M, str);
            workSpec.f68339c = ConstraintTrackingWorker.class.getName();
            workSpec.f68341e = aVar.build();
        }
    }

    private static boolean usesScheduler(@efb zpi workManager, @efb String className) {
        try {
            Class<?> cls = Class.forName(className);
            Iterator<roe> it = workManager.getSchedulers().iterator();
            while (it.hasNext()) {
                if (cls.isAssignableFrom(it.next().getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    @fdi
    public boolean addToDatabase() {
        WorkDatabase workDatabase = this.f63047a.getWorkManagerImpl().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            boolean zProcessContinuation = processContinuation(this.f63047a);
            workDatabase.setTransactionSuccessful();
            return zProcessContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    @efb
    public x5c getOperation() {
        return this.f63048b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f63047a.hasCycles()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f63047a));
            }
            if (addToDatabase()) {
                pac.setComponentEnabled(this.f63047a.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
                scheduleWorkInBackground();
            }
            this.f63048b.setState(x5c.f96833a);
        } catch (Throwable th) {
            this.f63048b.setState(new x5c.AbstractC14928b.a(th));
        }
    }

    @fdi
    public void scheduleWorkInBackground() {
        zpi workManagerImpl = this.f63047a.getWorkManagerImpl();
        ope.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }
}
