package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class dee {

    /* JADX INFO: renamed from: a */
    public static volatile sy6<Callable<woe>, woe> f29537a;

    /* JADX INFO: renamed from: b */
    public static volatile sy6<woe, woe> f29538b;

    private dee() {
        throw new AssertionError("No instances.");
    }

    /* JADX INFO: renamed from: a */
    public static <T, R> R m9118a(sy6<T, R> f, T t) {
        try {
            return f.apply(t);
        } catch (Throwable th) {
            throw o75.propagate(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static woe m9119b(sy6<Callable<woe>, woe> f, Callable<woe> s) {
        woe woeVar = (woe) m9118a(f, s);
        if (woeVar != null) {
            return woeVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    /* JADX INFO: renamed from: c */
    public static woe m9120c(Callable<woe> s) {
        try {
            woe woeVarCall = s.call();
            if (woeVarCall != null) {
                return woeVarCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw o75.propagate(th);
        }
    }

    public static sy6<Callable<woe>, woe> getInitMainThreadSchedulerHandler() {
        return f29537a;
    }

    public static sy6<woe, woe> getOnMainThreadSchedulerHandler() {
        return f29538b;
    }

    public static woe initMainThreadScheduler(Callable<woe> scheduler) {
        if (scheduler == null) {
            throw new NullPointerException("scheduler == null");
        }
        sy6<Callable<woe>, woe> sy6Var = f29537a;
        return sy6Var == null ? m9120c(scheduler) : m9119b(sy6Var, scheduler);
    }

    public static woe onMainThreadScheduler(woe scheduler) {
        if (scheduler == null) {
            throw new NullPointerException("scheduler == null");
        }
        sy6<woe, woe> sy6Var = f29538b;
        return sy6Var == null ? scheduler : (woe) m9118a(sy6Var, scheduler);
    }

    public static void reset() {
        setInitMainThreadSchedulerHandler(null);
        setMainThreadSchedulerHandler(null);
    }

    public static void setInitMainThreadSchedulerHandler(sy6<Callable<woe>, woe> handler) {
        f29537a = handler;
    }

    public static void setMainThreadSchedulerHandler(sy6<woe, woe> handler) {
        f29538b = handler;
    }
}
