package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class pfe {

    /* JADX INFO: renamed from: a */
    @cib
    public static volatile tu2<? super Throwable> f70621a;

    /* JADX INFO: renamed from: b */
    @cib
    public static volatile py6<? super Runnable, ? extends Runnable> f70622b;

    /* JADX INFO: renamed from: c */
    @cib
    public static volatile py6<? super Callable<voe>, ? extends voe> f70623c;

    /* JADX INFO: renamed from: d */
    @cib
    public static volatile py6<? super Callable<voe>, ? extends voe> f70624d;

    /* JADX INFO: renamed from: e */
    @cib
    public static volatile py6<? super Callable<voe>, ? extends voe> f70625e;

    /* JADX INFO: renamed from: f */
    @cib
    public static volatile py6<? super Callable<voe>, ? extends voe> f70626f;

    /* JADX INFO: renamed from: g */
    @cib
    public static volatile py6<? super voe, ? extends voe> f70627g;

    /* JADX INFO: renamed from: h */
    @cib
    public static volatile py6<? super voe, ? extends voe> f70628h;

    /* JADX INFO: renamed from: i */
    @cib
    public static volatile py6<? super voe, ? extends voe> f70629i;

    /* JADX INFO: renamed from: j */
    @cib
    public static volatile py6<? super voe, ? extends voe> f70630j;

    /* JADX INFO: renamed from: k */
    @cib
    public static volatile py6<? super m86, ? extends m86> f70631k;

    /* JADX INFO: renamed from: l */
    @cib
    public static volatile py6<? super nr2, ? extends nr2> f70632l;

    /* JADX INFO: renamed from: m */
    @cib
    public static volatile py6<? super Observable, ? extends Observable> f70633m;

    /* JADX INFO: renamed from: n */
    @cib
    public static volatile py6<? super pr2, ? extends pr2> f70634n;

    /* JADX INFO: renamed from: o */
    @cib
    public static volatile py6<? super s4a, ? extends s4a> f70635o;

    /* JADX INFO: renamed from: p */
    @cib
    public static volatile py6<? super ljf, ? extends ljf> f70636p;

    /* JADX INFO: renamed from: q */
    @cib
    public static volatile py6<? super yd2, ? extends yd2> f70637q;

    /* JADX INFO: renamed from: r */
    @cib
    public static volatile py6<? super fec, ? extends fec> f70638r;

    /* JADX INFO: renamed from: s */
    @cib
    public static volatile j11<? super m86, ? super ycg, ? extends ycg> f70639s;

    /* JADX INFO: renamed from: t */
    @cib
    public static volatile j11<? super s4a, ? super l9a, ? extends l9a> f70640t;

    /* JADX INFO: renamed from: u */
    @cib
    public static volatile j11<? super Observable, ? super oxb, ? extends oxb> f70641u;

    /* JADX INFO: renamed from: v */
    @cib
    public static volatile j11<? super ljf, ? super inf, ? extends inf> f70642v;

    /* JADX INFO: renamed from: w */
    @cib
    public static volatile j11<? super yd2, ? super dh2, ? extends dh2> f70643w;

    /* JADX INFO: renamed from: x */
    @cib
    public static volatile eb1 f70644x;

    /* JADX INFO: renamed from: y */
    public static volatile boolean f70645y;

    /* JADX INFO: renamed from: z */
    public static volatile boolean f70646z;

    private pfe() {
        throw new IllegalStateException("No instances!");
    }

    @bfb
    /* JADX INFO: renamed from: a */
    public static <T, U, R> R m19465a(@bfb j11<T, U, R> j11Var, @bfb T t, @bfb U u) {
        try {
            return j11Var.apply(t, u);
        } catch (Throwable th) {
            throw j75.wrapOrThrow(th);
        }
    }

    @bfb
    /* JADX INFO: renamed from: b */
    public static <T, R> R m19466b(@bfb py6<T, R> py6Var, @bfb T t) {
        try {
            return py6Var.apply(t);
        } catch (Throwable th) {
            throw j75.wrapOrThrow(th);
        }
    }

    @bfb
    /* JADX INFO: renamed from: c */
    public static voe m19467c(@bfb py6<? super Callable<voe>, ? extends voe> py6Var, Callable<voe> callable) {
        return (voe) xjb.requireNonNull(m19466b(py6Var, callable), "Scheduler Callable result can't be null");
    }

    @bfb
    public static voe createComputationScheduler(@bfb ThreadFactory threadFactory) {
        return new ro2((ThreadFactory) xjb.requireNonNull(threadFactory, "threadFactory is null"));
    }

    @bfb
    public static voe createIoScheduler(@bfb ThreadFactory threadFactory) {
        return new ze8((ThreadFactory) xjb.requireNonNull(threadFactory, "threadFactory is null"));
    }

    @bfb
    public static voe createNewThreadScheduler(@bfb ThreadFactory threadFactory) {
        return new vcb((ThreadFactory) xjb.requireNonNull(threadFactory, "threadFactory is null"));
    }

    @bfb
    public static voe createSingleScheduler(@bfb ThreadFactory threadFactory) {
        return new kof((ThreadFactory) xjb.requireNonNull(threadFactory, "threadFactory is null"));
    }

    @bfb
    /* JADX INFO: renamed from: d */
    public static voe m19468d(@bfb Callable<voe> callable) {
        try {
            return (voe) xjb.requireNonNull(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw j75.wrapOrThrow(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m19469e(Throwable th) {
        return (th instanceof q2c) || (th instanceof cwa) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof pm2);
    }

    /* JADX INFO: renamed from: f */
    public static void m19470f(@bfb Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }

    /* JADX INFO: renamed from: g */
    public static void m19471g() {
        f70645y = false;
    }

    @cib
    public static py6<? super voe, ? extends voe> getComputationSchedulerHandler() {
        return f70627g;
    }

    @cib
    public static tu2<? super Throwable> getErrorHandler() {
        return f70621a;
    }

    @cib
    public static py6<? super Callable<voe>, ? extends voe> getInitComputationSchedulerHandler() {
        return f70623c;
    }

    @cib
    public static py6<? super Callable<voe>, ? extends voe> getInitIoSchedulerHandler() {
        return f70625e;
    }

    @cib
    public static py6<? super Callable<voe>, ? extends voe> getInitNewThreadSchedulerHandler() {
        return f70626f;
    }

    @cib
    public static py6<? super Callable<voe>, ? extends voe> getInitSingleSchedulerHandler() {
        return f70624d;
    }

    @cib
    public static py6<? super voe, ? extends voe> getIoSchedulerHandler() {
        return f70629i;
    }

    @cib
    public static py6<? super voe, ? extends voe> getNewThreadSchedulerHandler() {
        return f70630j;
    }

    @cib
    public static eb1 getOnBeforeBlocking() {
        return f70644x;
    }

    @cib
    public static py6<? super yd2, ? extends yd2> getOnCompletableAssembly() {
        return f70637q;
    }

    @cib
    public static j11<? super yd2, ? super dh2, ? extends dh2> getOnCompletableSubscribe() {
        return f70643w;
    }

    @cib
    public static py6<? super nr2, ? extends nr2> getOnConnectableFlowableAssembly() {
        return f70632l;
    }

    @cib
    public static py6<? super pr2, ? extends pr2> getOnConnectableObservableAssembly() {
        return f70634n;
    }

    @cib
    public static py6<? super m86, ? extends m86> getOnFlowableAssembly() {
        return f70631k;
    }

    @cib
    public static j11<? super m86, ? super ycg, ? extends ycg> getOnFlowableSubscribe() {
        return f70639s;
    }

    @cib
    public static py6<? super s4a, ? extends s4a> getOnMaybeAssembly() {
        return f70635o;
    }

    @cib
    public static j11<? super s4a, ? super l9a, ? extends l9a> getOnMaybeSubscribe() {
        return f70640t;
    }

    @cib
    public static py6<? super Observable, ? extends Observable> getOnObservableAssembly() {
        return f70633m;
    }

    @cib
    public static j11<? super Observable, ? super oxb, ? extends oxb> getOnObservableSubscribe() {
        return f70641u;
    }

    @cib
    public static py6<? super fec, ? extends fec> getOnParallelAssembly() {
        return f70638r;
    }

    @cib
    public static py6<? super ljf, ? extends ljf> getOnSingleAssembly() {
        return f70636p;
    }

    @cib
    public static j11<? super ljf, ? super inf, ? extends inf> getOnSingleSubscribe() {
        return f70642v;
    }

    @cib
    public static py6<? super Runnable, ? extends Runnable> getScheduleHandler() {
        return f70622b;
    }

    @cib
    public static py6<? super voe, ? extends voe> getSingleSchedulerHandler() {
        return f70628h;
    }

    @bfb
    public static voe initComputationScheduler(@bfb Callable<voe> callable) {
        xjb.requireNonNull(callable, "Scheduler Callable can't be null");
        py6<? super Callable<voe>, ? extends voe> py6Var = f70623c;
        return py6Var == null ? m19468d(callable) : m19467c(py6Var, callable);
    }

    @bfb
    public static voe initIoScheduler(@bfb Callable<voe> callable) {
        xjb.requireNonNull(callable, "Scheduler Callable can't be null");
        py6<? super Callable<voe>, ? extends voe> py6Var = f70625e;
        return py6Var == null ? m19468d(callable) : m19467c(py6Var, callable);
    }

    @bfb
    public static voe initNewThreadScheduler(@bfb Callable<voe> callable) {
        xjb.requireNonNull(callable, "Scheduler Callable can't be null");
        py6<? super Callable<voe>, ? extends voe> py6Var = f70626f;
        return py6Var == null ? m19468d(callable) : m19467c(py6Var, callable);
    }

    @bfb
    public static voe initSingleScheduler(@bfb Callable<voe> callable) {
        xjb.requireNonNull(callable, "Scheduler Callable can't be null");
        py6<? super Callable<voe>, ? extends voe> py6Var = f70624d;
        return py6Var == null ? m19468d(callable) : m19467c(py6Var, callable);
    }

    public static boolean isFailOnNonBlockingScheduler() {
        return f70646z;
    }

    public static boolean isLockdown() {
        return f70645y;
    }

    public static void lockdown() {
        f70645y = true;
    }

    @bfb
    public static <T> s4a<T> onAssembly(@bfb s4a<T> s4aVar) {
        py6<? super s4a, ? extends s4a> py6Var = f70635o;
        return py6Var != null ? (s4a) m19466b(py6Var, s4aVar) : s4aVar;
    }

    public static boolean onBeforeBlocking() {
        eb1 eb1Var = f70644x;
        if (eb1Var == null) {
            return false;
        }
        try {
            return eb1Var.getAsBoolean();
        } catch (Throwable th) {
            throw j75.wrapOrThrow(th);
        }
    }

    @bfb
    public static voe onComputationScheduler(@bfb voe voeVar) {
        py6<? super voe, ? extends voe> py6Var = f70627g;
        return py6Var == null ? voeVar : (voe) m19466b(py6Var, voeVar);
    }

    public static void onError(@bfb Throwable th) {
        tu2<? super Throwable> tu2Var = f70621a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!m19469e(th)) {
            th = new urh(th);
        }
        if (tu2Var != null) {
            try {
                tu2Var.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                m19470f(th2);
            }
        }
        th.printStackTrace();
        m19470f(th);
    }

    @bfb
    public static voe onIoScheduler(@bfb voe voeVar) {
        py6<? super voe, ? extends voe> py6Var = f70629i;
        return py6Var == null ? voeVar : (voe) m19466b(py6Var, voeVar);
    }

    @bfb
    public static voe onNewThreadScheduler(@bfb voe voeVar) {
        py6<? super voe, ? extends voe> py6Var = f70630j;
        return py6Var == null ? voeVar : (voe) m19466b(py6Var, voeVar);
    }

    @bfb
    public static Runnable onSchedule(@bfb Runnable runnable) {
        xjb.requireNonNull(runnable, "run is null");
        py6<? super Runnable, ? extends Runnable> py6Var = f70622b;
        return py6Var == null ? runnable : (Runnable) m19466b(py6Var, runnable);
    }

    @bfb
    public static voe onSingleScheduler(@bfb voe voeVar) {
        py6<? super voe, ? extends voe> py6Var = f70628h;
        return py6Var == null ? voeVar : (voe) m19466b(py6Var, voeVar);
    }

    @bfb
    public static <T> ycg<? super T> onSubscribe(@bfb m86<T> m86Var, @bfb ycg<? super T> ycgVar) {
        j11<? super m86, ? super ycg, ? extends ycg> j11Var = f70639s;
        return j11Var != null ? (ycg) m19465a(j11Var, m86Var, ycgVar) : ycgVar;
    }

    public static void reset() {
        setErrorHandler(null);
        setScheduleHandler(null);
        setComputationSchedulerHandler(null);
        setInitComputationSchedulerHandler(null);
        setIoSchedulerHandler(null);
        setInitIoSchedulerHandler(null);
        setSingleSchedulerHandler(null);
        setInitSingleSchedulerHandler(null);
        setNewThreadSchedulerHandler(null);
        setInitNewThreadSchedulerHandler(null);
        setOnFlowableAssembly(null);
        setOnFlowableSubscribe(null);
        setOnObservableAssembly(null);
        setOnObservableSubscribe(null);
        setOnSingleAssembly(null);
        setOnSingleSubscribe(null);
        setOnCompletableAssembly(null);
        setOnCompletableSubscribe(null);
        setOnConnectableFlowableAssembly(null);
        setOnConnectableObservableAssembly(null);
        setOnMaybeAssembly(null);
        setOnMaybeSubscribe(null);
        setOnParallelAssembly(null);
        setFailOnNonBlockingScheduler(false);
        setOnBeforeBlocking(null);
    }

    public static void setComputationSchedulerHandler(@cib py6<? super voe, ? extends voe> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70627g = py6Var;
    }

    public static void setErrorHandler(@cib tu2<? super Throwable> tu2Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70621a = tu2Var;
    }

    public static void setFailOnNonBlockingScheduler(boolean z) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70646z = z;
    }

    public static void setInitComputationSchedulerHandler(@cib py6<? super Callable<voe>, ? extends voe> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70623c = py6Var;
    }

    public static void setInitIoSchedulerHandler(@cib py6<? super Callable<voe>, ? extends voe> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70625e = py6Var;
    }

    public static void setInitNewThreadSchedulerHandler(@cib py6<? super Callable<voe>, ? extends voe> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70626f = py6Var;
    }

    public static void setInitSingleSchedulerHandler(@cib py6<? super Callable<voe>, ? extends voe> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70624d = py6Var;
    }

    public static void setIoSchedulerHandler(@cib py6<? super voe, ? extends voe> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70629i = py6Var;
    }

    public static void setNewThreadSchedulerHandler(@cib py6<? super voe, ? extends voe> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70630j = py6Var;
    }

    public static void setOnBeforeBlocking(@cib eb1 eb1Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70644x = eb1Var;
    }

    public static void setOnCompletableAssembly(@cib py6<? super yd2, ? extends yd2> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70637q = py6Var;
    }

    public static void setOnCompletableSubscribe(@cib j11<? super yd2, ? super dh2, ? extends dh2> j11Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70643w = j11Var;
    }

    public static void setOnConnectableFlowableAssembly(@cib py6<? super nr2, ? extends nr2> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70632l = py6Var;
    }

    public static void setOnConnectableObservableAssembly(@cib py6<? super pr2, ? extends pr2> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70634n = py6Var;
    }

    public static void setOnFlowableAssembly(@cib py6<? super m86, ? extends m86> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70631k = py6Var;
    }

    public static void setOnFlowableSubscribe(@cib j11<? super m86, ? super ycg, ? extends ycg> j11Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70639s = j11Var;
    }

    public static void setOnMaybeAssembly(@cib py6<? super s4a, ? extends s4a> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70635o = py6Var;
    }

    public static void setOnMaybeSubscribe(@cib j11<? super s4a, l9a, ? extends l9a> j11Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70640t = j11Var;
    }

    public static void setOnObservableAssembly(@cib py6<? super Observable, ? extends Observable> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70633m = py6Var;
    }

    public static void setOnObservableSubscribe(@cib j11<? super Observable, ? super oxb, ? extends oxb> j11Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70641u = j11Var;
    }

    public static void setOnParallelAssembly(@cib py6<? super fec, ? extends fec> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70638r = py6Var;
    }

    public static void setOnSingleAssembly(@cib py6<? super ljf, ? extends ljf> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70636p = py6Var;
    }

    public static void setOnSingleSubscribe(@cib j11<? super ljf, ? super inf, ? extends inf> j11Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70642v = j11Var;
    }

    public static void setScheduleHandler(@cib py6<? super Runnable, ? extends Runnable> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70622b = py6Var;
    }

    public static void setSingleSchedulerHandler(@cib py6<? super voe, ? extends voe> py6Var) {
        if (f70645y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f70628h = py6Var;
    }

    @bfb
    public static <T> m86<T> onAssembly(@bfb m86<T> m86Var) {
        py6<? super m86, ? extends m86> py6Var = f70631k;
        return py6Var != null ? (m86) m19466b(py6Var, m86Var) : m86Var;
    }

    @bfb
    public static <T> oxb<? super T> onSubscribe(@bfb Observable<T> observable, @bfb oxb<? super T> oxbVar) {
        j11<? super Observable, ? super oxb, ? extends oxb> j11Var = f70641u;
        return j11Var != null ? (oxb) m19465a(j11Var, observable, oxbVar) : oxbVar;
    }

    @bfb
    public static <T> nr2<T> onAssembly(@bfb nr2<T> nr2Var) {
        py6<? super nr2, ? extends nr2> py6Var = f70632l;
        return py6Var != null ? (nr2) m19466b(py6Var, nr2Var) : nr2Var;
    }

    @bfb
    public static <T> inf<? super T> onSubscribe(@bfb ljf<T> ljfVar, @bfb inf<? super T> infVar) {
        j11<? super ljf, ? super inf, ? extends inf> j11Var = f70642v;
        return j11Var != null ? (inf) m19465a(j11Var, ljfVar, infVar) : infVar;
    }

    @bfb
    public static <T> Observable<T> onAssembly(@bfb Observable<T> observable) {
        py6<? super Observable, ? extends Observable> py6Var = f70633m;
        return py6Var != null ? (Observable) m19466b(py6Var, observable) : observable;
    }

    @bfb
    public static dh2 onSubscribe(@bfb yd2 yd2Var, @bfb dh2 dh2Var) {
        j11<? super yd2, ? super dh2, ? extends dh2> j11Var = f70643w;
        return j11Var != null ? (dh2) m19465a(j11Var, yd2Var, dh2Var) : dh2Var;
    }

    @bfb
    public static <T> pr2<T> onAssembly(@bfb pr2<T> pr2Var) {
        py6<? super pr2, ? extends pr2> py6Var = f70634n;
        return py6Var != null ? (pr2) m19466b(py6Var, pr2Var) : pr2Var;
    }

    @bfb
    public static <T> l9a<? super T> onSubscribe(@bfb s4a<T> s4aVar, @bfb l9a<? super T> l9aVar) {
        j11<? super s4a, ? super l9a, ? extends l9a> j11Var = f70640t;
        return j11Var != null ? (l9a) m19465a(j11Var, s4aVar, l9aVar) : l9aVar;
    }

    @bfb
    public static <T> ljf<T> onAssembly(@bfb ljf<T> ljfVar) {
        py6<? super ljf, ? extends ljf> py6Var = f70636p;
        return py6Var != null ? (ljf) m19466b(py6Var, ljfVar) : ljfVar;
    }

    @bfb
    public static yd2 onAssembly(@bfb yd2 yd2Var) {
        py6<? super yd2, ? extends yd2> py6Var = f70637q;
        return py6Var != null ? (yd2) m19466b(py6Var, yd2Var) : yd2Var;
    }

    @bfb
    public static <T> fec<T> onAssembly(@bfb fec<T> fecVar) {
        py6<? super fec, ? extends fec> py6Var = f70638r;
        return py6Var != null ? (fec) m19466b(py6Var, fecVar) : fecVar;
    }
}
