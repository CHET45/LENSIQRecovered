package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class pdc extends vo2 {

    /* JADX INFO: renamed from: a */
    public final boolean f70495a;

    /* JADX INFO: renamed from: b */
    public final boolean f70496b;

    /* JADX INFO: renamed from: pdc$a */
    public static class C10922a implements vde {

        /* JADX INFO: renamed from: a */
        public final ExecutorService f70497a = Executors.newCachedThreadPool();

        @Override // p000.vde
        public void finished() {
            try {
                this.f70497a.shutdown();
                this.f70497a.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
        }

        @Override // p000.vde
        public void schedule(Runnable runnable) {
            this.f70497a.submit(runnable);
        }
    }

    public pdc(boolean z, boolean z2) {
        this.f70495a = z;
        this.f70496b = z2;
    }

    public static vo2 classes() {
        return new pdc(true, false);
    }

    public static vo2 methods() {
        return new pdc(false, true);
    }

    private static tde parallelize(tde tdeVar) {
        if (tdeVar instanceof ehc) {
            ((ehc) tdeVar).setScheduler(new C10922a());
        }
        return tdeVar;
    }

    @Override // p000.vo2
    /* JADX INFO: renamed from: a */
    public tde mo19431a(ude udeVar, Class<?> cls) throws Throwable {
        tde tdeVarMo19431a = super.mo19431a(udeVar, cls);
        return this.f70496b ? parallelize(tdeVarMo19431a) : tdeVarMo19431a;
    }

    @Override // p000.vo2
    public tde getSuite(ude udeVar, Class<?>[] clsArr) throws o18 {
        tde suite = super.getSuite(udeVar, clsArr);
        return this.f70495a ? parallelize(suite) : suite;
    }
}
