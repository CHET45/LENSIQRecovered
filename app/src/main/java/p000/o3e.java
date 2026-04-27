package p000;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public abstract class o3e {

    /* JADX INFO: renamed from: o3e$a */
    public static class C10180a extends o3e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ tde f66417a;

        public C10180a(tde tdeVar) {
            this.f66417a = tdeVar;
        }

        @Override // p000.o3e
        public tde getRunner() {
            return this.f66417a;
        }
    }

    public static o3e aClass(Class<?> cls) {
        return new i12(cls);
    }

    public static o3e classWithoutSuiteMethod(Class<?> cls) {
        return new i12(cls, false);
    }

    public static o3e classes(vo2 vo2Var, Class<?>... clsArr) {
        try {
            return runner(vo2Var.getSuite(new C14677wm(true), clsArr));
        } catch (o18 unused) {
            throw new RuntimeException("Bug in saff's brain: Suite constructor, called as above, should always complete");
        }
    }

    public static o3e errorReport(Class<?> cls, Throwable th) {
        return runner(new h55(cls, th));
    }

    public static o3e method(Class<?> cls, String str) {
        return aClass(cls).filterWith(j74.createTestDescription(cls, str));
    }

    public static o3e runner(tde tdeVar) {
        return new C10180a(tdeVar);
    }

    public o3e filterWith(ru5 ru5Var) {
        return new yu5(this, ru5Var);
    }

    public abstract tde getRunner();

    public o3e sortWith(Comparator<j74> comparator) {
        return new vvf(this, comparator);
    }

    public o3e filterWith(j74 j74Var) {
        return filterWith(ru5.matchMethodDescription(j74Var));
    }

    public static o3e classes(Class<?>... clsArr) {
        return classes(fi8.m10929a(), clsArr);
    }
}
