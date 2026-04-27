package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class eee {

    /* JADX INFO: renamed from: a */
    public static volatile py6<Callable<voe>, voe> f32767a;

    /* JADX INFO: renamed from: b */
    public static volatile py6<voe, voe> f32768b;

    private eee() {
        throw new AssertionError("No instances.");
    }

    /* JADX INFO: renamed from: a */
    public static <T, R> R m9905a(py6<T, R> py6Var, T t) {
        try {
            return py6Var.apply(t);
        } catch (Throwable th) {
            throw n75.propagate(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static voe m9906b(py6<Callable<voe>, voe> py6Var, Callable<voe> callable) {
        voe voeVar = (voe) m9905a(py6Var, callable);
        if (voeVar != null) {
            return voeVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* JADX INFO: renamed from: c */
    public static voe m9907c(Callable<voe> callable) {
        try {
            voe voeVarCall = callable.call();
            if (voeVarCall != null) {
                return voeVarCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw n75.propagate(th);
        }
    }

    public static py6<Callable<voe>, voe> getInitMainThreadSchedulerHandler() {
        return f32767a;
    }

    public static py6<voe, voe> getOnMainThreadSchedulerHandler() {
        return f32768b;
    }

    public static voe initMainThreadScheduler(Callable<voe> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        py6<Callable<voe>, voe> py6Var = f32767a;
        return py6Var == null ? m9907c(callable) : m9906b(py6Var, callable);
    }

    public static voe onMainThreadScheduler(voe voeVar) {
        if (voeVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        py6<voe, voe> py6Var = f32768b;
        return py6Var == null ? voeVar : (voe) m9905a(py6Var, voeVar);
    }

    public static void reset() {
        setInitMainThreadSchedulerHandler(null);
        setMainThreadSchedulerHandler(null);
    }

    public static void setInitMainThreadSchedulerHandler(py6<Callable<voe>, voe> py6Var) {
        f32767a = py6Var;
    }

    public static void setMainThreadSchedulerHandler(py6<voe, voe> py6Var) {
        f32768b = py6Var;
    }
}
