package p000;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class ofe {

    /* JADX INFO: renamed from: A */
    public static volatile boolean f67517A;

    /* JADX INFO: renamed from: a */
    @dib
    public static volatile uu2<? super Throwable> f67518a;

    /* JADX INFO: renamed from: b */
    @dib
    public static volatile sy6<? super Runnable, ? extends Runnable> f67519b;

    /* JADX INFO: renamed from: c */
    @dib
    public static volatile sy6<? super nfg<woe>, ? extends woe> f67520c;

    /* JADX INFO: renamed from: d */
    @dib
    public static volatile sy6<? super nfg<woe>, ? extends woe> f67521d;

    /* JADX INFO: renamed from: e */
    @dib
    public static volatile sy6<? super nfg<woe>, ? extends woe> f67522e;

    /* JADX INFO: renamed from: f */
    @dib
    public static volatile sy6<? super nfg<woe>, ? extends woe> f67523f;

    /* JADX INFO: renamed from: g */
    @dib
    public static volatile sy6<? super woe, ? extends woe> f67524g;

    /* JADX INFO: renamed from: h */
    @dib
    public static volatile sy6<? super woe, ? extends woe> f67525h;

    /* JADX INFO: renamed from: i */
    @dib
    public static volatile sy6<? super woe, ? extends woe> f67526i;

    /* JADX INFO: renamed from: j */
    @dib
    public static volatile sy6<? super woe, ? extends woe> f67527j;

    /* JADX INFO: renamed from: k */
    @dib
    public static volatile sy6<? super l86, ? extends l86> f67528k;

    /* JADX INFO: renamed from: l */
    @dib
    public static volatile sy6<? super mr2, ? extends mr2> f67529l;

    /* JADX INFO: renamed from: m */
    @dib
    public static volatile sy6<? super vkb, ? extends vkb> f67530m;

    /* JADX INFO: renamed from: n */
    @dib
    public static volatile sy6<? super or2, ? extends or2> f67531n;

    /* JADX INFO: renamed from: o */
    @dib
    public static volatile sy6<? super r4a, ? extends r4a> f67532o;

    /* JADX INFO: renamed from: p */
    @dib
    public static volatile sy6<? super kjf, ? extends kjf> f67533p;

    /* JADX INFO: renamed from: q */
    @dib
    public static volatile sy6<? super xd2, ? extends xd2> f67534q;

    /* JADX INFO: renamed from: r */
    @dib
    public static volatile sy6<? super eec, ? extends eec> f67535r;

    /* JADX INFO: renamed from: s */
    @dib
    public static volatile i11<? super l86, ? super ycg, ? extends ycg> f67536s;

    /* JADX INFO: renamed from: t */
    @dib
    public static volatile i11<? super r4a, ? super k9a, ? extends k9a> f67537t;

    /* JADX INFO: renamed from: u */
    @dib
    public static volatile i11<? super vkb, ? super pxb, ? extends pxb> f67538u;

    /* JADX INFO: renamed from: v */
    @dib
    public static volatile i11<? super kjf, ? super hnf, ? extends hnf> f67539v;

    /* JADX INFO: renamed from: w */
    @dib
    public static volatile i11<? super xd2, ? super ch2, ? extends ch2> f67540w;

    /* JADX INFO: renamed from: x */
    @dib
    public static volatile i11<? super eec, ? super ycg[], ? extends ycg[]> f67541x;

    /* JADX INFO: renamed from: y */
    @dib
    public static volatile cb1 f67542y;

    /* JADX INFO: renamed from: z */
    public static volatile boolean f67543z;

    private ofe() {
        throw new IllegalStateException("No instances!");
    }

    @cfb
    /* JADX INFO: renamed from: a */
    public static <T, U, R> R m18627a(@cfb i11<T, U, R> f, @cfb T t, @cfb U u) {
        try {
            return f.apply(t, u);
        } catch (Throwable th) {
            throw k75.wrapOrThrow(th);
        }
    }

    @cfb
    /* JADX INFO: renamed from: b */
    public static <T, R> R m18628b(@cfb sy6<T, R> f, @cfb T t) {
        try {
            return f.apply(t);
        } catch (Throwable th) {
            throw k75.wrapOrThrow(th);
        }
    }

    @cfb
    /* JADX INFO: renamed from: c */
    public static woe m18629c(@cfb sy6<? super nfg<woe>, ? extends woe> f, nfg<woe> s) {
        Object objM18628b = m18628b(f, s);
        Objects.requireNonNull(objM18628b, "Scheduler Supplier result can't be null");
        return (woe) objM18628b;
    }

    @cfb
    public static woe createComputationScheduler(@cfb ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new so2(threadFactory);
    }

    @cfb
    public static woe createExecutorScheduler(@cfb Executor executor, boolean interruptibleWorker, boolean fair) {
        return new w85(executor, interruptibleWorker, fair);
    }

    @cfb
    public static woe createIoScheduler(@cfb ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new af8(threadFactory);
    }

    @cfb
    public static woe createNewThreadScheduler(@cfb ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new ucb(threadFactory);
    }

    @cfb
    public static woe createSingleScheduler(@cfb ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new lof(threadFactory);
    }

    @cfb
    /* JADX INFO: renamed from: d */
    public static woe m18630d(@cfb nfg<woe> s) {
        try {
            woe woeVar = s.get();
            Objects.requireNonNull(woeVar, "Scheduler Supplier result can't be null");
            return woeVar;
        } catch (Throwable th) {
            throw k75.wrapOrThrow(th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18631e(Throwable error) {
        return (error instanceof p2c) || (error instanceof bwa) || (error instanceof IllegalStateException) || (error instanceof NullPointerException) || (error instanceof IllegalArgumentException) || (error instanceof qm2);
    }

    /* JADX INFO: renamed from: f */
    public static void m18632f(@cfb Throwable error) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, error);
    }

    /* JADX INFO: renamed from: g */
    public static void m18633g() {
        f67543z = false;
    }

    @dib
    public static sy6<? super woe, ? extends woe> getComputationSchedulerHandler() {
        return f67524g;
    }

    @dib
    public static uu2<? super Throwable> getErrorHandler() {
        return f67518a;
    }

    @dib
    public static sy6<? super nfg<woe>, ? extends woe> getInitComputationSchedulerHandler() {
        return f67520c;
    }

    @dib
    public static sy6<? super nfg<woe>, ? extends woe> getInitIoSchedulerHandler() {
        return f67522e;
    }

    @dib
    public static sy6<? super nfg<woe>, ? extends woe> getInitNewThreadSchedulerHandler() {
        return f67523f;
    }

    @dib
    public static sy6<? super nfg<woe>, ? extends woe> getInitSingleSchedulerHandler() {
        return f67521d;
    }

    @dib
    public static sy6<? super woe, ? extends woe> getIoSchedulerHandler() {
        return f67526i;
    }

    @dib
    public static sy6<? super woe, ? extends woe> getNewThreadSchedulerHandler() {
        return f67527j;
    }

    @dib
    public static cb1 getOnBeforeBlocking() {
        return f67542y;
    }

    @dib
    public static sy6<? super xd2, ? extends xd2> getOnCompletableAssembly() {
        return f67534q;
    }

    @dib
    public static i11<? super xd2, ? super ch2, ? extends ch2> getOnCompletableSubscribe() {
        return f67540w;
    }

    @dib
    public static sy6<? super mr2, ? extends mr2> getOnConnectableFlowableAssembly() {
        return f67529l;
    }

    @dib
    public static sy6<? super or2, ? extends or2> getOnConnectableObservableAssembly() {
        return f67531n;
    }

    @dib
    public static sy6<? super l86, ? extends l86> getOnFlowableAssembly() {
        return f67528k;
    }

    @dib
    public static i11<? super l86, ? super ycg, ? extends ycg> getOnFlowableSubscribe() {
        return f67536s;
    }

    @dib
    public static sy6<? super r4a, ? extends r4a> getOnMaybeAssembly() {
        return f67532o;
    }

    @dib
    public static i11<? super r4a, ? super k9a, ? extends k9a> getOnMaybeSubscribe() {
        return f67537t;
    }

    @dib
    public static sy6<? super vkb, ? extends vkb> getOnObservableAssembly() {
        return f67530m;
    }

    @dib
    public static i11<? super vkb, ? super pxb, ? extends pxb> getOnObservableSubscribe() {
        return f67538u;
    }

    @dib
    public static sy6<? super eec, ? extends eec> getOnParallelAssembly() {
        return f67535r;
    }

    @dib
    public static i11<? super eec, ? super ycg[], ? extends ycg[]> getOnParallelSubscribe() {
        return f67541x;
    }

    @dib
    public static sy6<? super kjf, ? extends kjf> getOnSingleAssembly() {
        return f67533p;
    }

    @dib
    public static i11<? super kjf, ? super hnf, ? extends hnf> getOnSingleSubscribe() {
        return f67539v;
    }

    @dib
    public static sy6<? super Runnable, ? extends Runnable> getScheduleHandler() {
        return f67519b;
    }

    @dib
    public static sy6<? super woe, ? extends woe> getSingleSchedulerHandler() {
        return f67525h;
    }

    @cfb
    public static woe initComputationScheduler(@cfb nfg<woe> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        sy6<? super nfg<woe>, ? extends woe> sy6Var = f67520c;
        return sy6Var == null ? m18630d(defaultScheduler) : m18629c(sy6Var, defaultScheduler);
    }

    @cfb
    public static woe initIoScheduler(@cfb nfg<woe> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        sy6<? super nfg<woe>, ? extends woe> sy6Var = f67522e;
        return sy6Var == null ? m18630d(defaultScheduler) : m18629c(sy6Var, defaultScheduler);
    }

    @cfb
    public static woe initNewThreadScheduler(@cfb nfg<woe> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        sy6<? super nfg<woe>, ? extends woe> sy6Var = f67523f;
        return sy6Var == null ? m18630d(defaultScheduler) : m18629c(sy6Var, defaultScheduler);
    }

    @cfb
    public static woe initSingleScheduler(@cfb nfg<woe> defaultScheduler) {
        Objects.requireNonNull(defaultScheduler, "Scheduler Supplier can't be null");
        sy6<? super nfg<woe>, ? extends woe> sy6Var = f67521d;
        return sy6Var == null ? m18630d(defaultScheduler) : m18629c(sy6Var, defaultScheduler);
    }

    public static boolean isFailOnNonBlockingScheduler() {
        return f67517A;
    }

    public static boolean isLockdown() {
        return f67543z;
    }

    public static void lockdown() {
        f67543z = true;
    }

    @cfb
    public static <T> r4a<T> onAssembly(@cfb r4a<T> source) {
        sy6<? super r4a, ? extends r4a> sy6Var = f67532o;
        return sy6Var != null ? (r4a) m18628b(sy6Var, source) : source;
    }

    public static boolean onBeforeBlocking() {
        cb1 cb1Var = f67542y;
        if (cb1Var == null) {
            return false;
        }
        try {
            return cb1Var.getAsBoolean();
        } catch (Throwable th) {
            throw k75.wrapOrThrow(th);
        }
    }

    @cfb
    public static woe onComputationScheduler(@cfb woe defaultScheduler) {
        sy6<? super woe, ? extends woe> sy6Var = f67524g;
        return sy6Var == null ? defaultScheduler : (woe) m18628b(sy6Var, defaultScheduler);
    }

    public static void onError(@cfb Throwable error) {
        uu2<? super Throwable> uu2Var = f67518a;
        if (error == null) {
            error = k75.createNullPointerException("onError called with a null Throwable.");
        } else if (!m18631e(error)) {
            error = new trh(error);
        }
        if (uu2Var != null) {
            try {
                uu2Var.accept(error);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                m18632f(th);
            }
        }
        error.printStackTrace();
        m18632f(error);
    }

    @cfb
    public static woe onIoScheduler(@cfb woe defaultScheduler) {
        sy6<? super woe, ? extends woe> sy6Var = f67526i;
        return sy6Var == null ? defaultScheduler : (woe) m18628b(sy6Var, defaultScheduler);
    }

    @cfb
    public static woe onNewThreadScheduler(@cfb woe defaultScheduler) {
        sy6<? super woe, ? extends woe> sy6Var = f67527j;
        return sy6Var == null ? defaultScheduler : (woe) m18628b(sy6Var, defaultScheduler);
    }

    @cfb
    public static Runnable onSchedule(@cfb Runnable run) {
        Objects.requireNonNull(run, "run is null");
        sy6<? super Runnable, ? extends Runnable> sy6Var = f67519b;
        return sy6Var == null ? run : (Runnable) m18628b(sy6Var, run);
    }

    @cfb
    public static woe onSingleScheduler(@cfb woe defaultScheduler) {
        sy6<? super woe, ? extends woe> sy6Var = f67525h;
        return sy6Var == null ? defaultScheduler : (woe) m18628b(sy6Var, defaultScheduler);
    }

    @cfb
    public static <T> ycg<? super T> onSubscribe(@cfb l86<T> source, @cfb ycg<? super T> subscriber) {
        i11<? super l86, ? super ycg, ? extends ycg> i11Var = f67536s;
        return i11Var != null ? (ycg) m18627a(i11Var, source, subscriber) : subscriber;
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
        setOnParallelSubscribe(null);
        setFailOnNonBlockingScheduler(false);
        setOnBeforeBlocking(null);
    }

    public static void setComputationSchedulerHandler(@dib sy6<? super woe, ? extends woe> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67524g = handler;
    }

    public static void setErrorHandler(@dib uu2<? super Throwable> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67518a = handler;
    }

    public static void setFailOnNonBlockingScheduler(boolean enable) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67517A = enable;
    }

    public static void setInitComputationSchedulerHandler(@dib sy6<? super nfg<woe>, ? extends woe> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67520c = handler;
    }

    public static void setInitIoSchedulerHandler(@dib sy6<? super nfg<woe>, ? extends woe> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67522e = handler;
    }

    public static void setInitNewThreadSchedulerHandler(@dib sy6<? super nfg<woe>, ? extends woe> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67523f = handler;
    }

    public static void setInitSingleSchedulerHandler(@dib sy6<? super nfg<woe>, ? extends woe> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67521d = handler;
    }

    public static void setIoSchedulerHandler(@dib sy6<? super woe, ? extends woe> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67526i = handler;
    }

    public static void setNewThreadSchedulerHandler(@dib sy6<? super woe, ? extends woe> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67527j = handler;
    }

    public static void setOnBeforeBlocking(@dib cb1 handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67542y = handler;
    }

    public static void setOnCompletableAssembly(@dib sy6<? super xd2, ? extends xd2> onCompletableAssembly) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67534q = onCompletableAssembly;
    }

    public static void setOnCompletableSubscribe(@dib i11<? super xd2, ? super ch2, ? extends ch2> onCompletableSubscribe) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67540w = onCompletableSubscribe;
    }

    public static void setOnConnectableFlowableAssembly(@dib sy6<? super mr2, ? extends mr2> onConnectableFlowableAssembly) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67529l = onConnectableFlowableAssembly;
    }

    public static void setOnConnectableObservableAssembly(@dib sy6<? super or2, ? extends or2> onConnectableObservableAssembly) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67531n = onConnectableObservableAssembly;
    }

    public static void setOnFlowableAssembly(@dib sy6<? super l86, ? extends l86> onFlowableAssembly) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67528k = onFlowableAssembly;
    }

    public static void setOnFlowableSubscribe(@dib i11<? super l86, ? super ycg, ? extends ycg> onFlowableSubscribe) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67536s = onFlowableSubscribe;
    }

    public static void setOnMaybeAssembly(@dib sy6<? super r4a, ? extends r4a> onMaybeAssembly) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67532o = onMaybeAssembly;
    }

    public static void setOnMaybeSubscribe(@dib i11<? super r4a, k9a, ? extends k9a> onMaybeSubscribe) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67537t = onMaybeSubscribe;
    }

    public static void setOnObservableAssembly(@dib sy6<? super vkb, ? extends vkb> onObservableAssembly) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67530m = onObservableAssembly;
    }

    public static void setOnObservableSubscribe(@dib i11<? super vkb, ? super pxb, ? extends pxb> onObservableSubscribe) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67538u = onObservableSubscribe;
    }

    public static void setOnParallelAssembly(@dib sy6<? super eec, ? extends eec> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67535r = handler;
    }

    public static void setOnParallelSubscribe(@dib i11<? super eec, ? super ycg[], ? extends ycg[]> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67541x = handler;
    }

    public static void setOnSingleAssembly(@dib sy6<? super kjf, ? extends kjf> onSingleAssembly) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67533p = onSingleAssembly;
    }

    public static void setOnSingleSubscribe(@dib i11<? super kjf, ? super hnf, ? extends hnf> onSingleSubscribe) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67539v = onSingleSubscribe;
    }

    public static void setScheduleHandler(@dib sy6<? super Runnable, ? extends Runnable> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67519b = handler;
    }

    public static void setSingleSchedulerHandler(@dib sy6<? super woe, ? extends woe> handler) {
        if (f67543z) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f67525h = handler;
    }

    @cfb
    public static <T> l86<T> onAssembly(@cfb l86<T> source) {
        sy6<? super l86, ? extends l86> sy6Var = f67528k;
        return sy6Var != null ? (l86) m18628b(sy6Var, source) : source;
    }

    @cfb
    public static <T> pxb<? super T> onSubscribe(@cfb vkb<T> source, @cfb pxb<? super T> observer) {
        i11<? super vkb, ? super pxb, ? extends pxb> i11Var = f67538u;
        return i11Var != null ? (pxb) m18627a(i11Var, source, observer) : observer;
    }

    @cfb
    public static <T> mr2<T> onAssembly(@cfb mr2<T> source) {
        sy6<? super mr2, ? extends mr2> sy6Var = f67529l;
        return sy6Var != null ? (mr2) m18628b(sy6Var, source) : source;
    }

    @cfb
    public static <T> hnf<? super T> onSubscribe(@cfb kjf<T> source, @cfb hnf<? super T> observer) {
        i11<? super kjf, ? super hnf, ? extends hnf> i11Var = f67539v;
        return i11Var != null ? (hnf) m18627a(i11Var, source, observer) : observer;
    }

    @cfb
    public static <T> vkb<T> onAssembly(@cfb vkb<T> source) {
        sy6<? super vkb, ? extends vkb> sy6Var = f67530m;
        return sy6Var != null ? (vkb) m18628b(sy6Var, source) : source;
    }

    @cfb
    public static ch2 onSubscribe(@cfb xd2 source, @cfb ch2 observer) {
        i11<? super xd2, ? super ch2, ? extends ch2> i11Var = f67540w;
        return i11Var != null ? (ch2) m18627a(i11Var, source, observer) : observer;
    }

    @cfb
    public static <T> or2<T> onAssembly(@cfb or2<T> source) {
        sy6<? super or2, ? extends or2> sy6Var = f67531n;
        return sy6Var != null ? (or2) m18628b(sy6Var, source) : source;
    }

    @cfb
    public static <T> k9a<? super T> onSubscribe(@cfb r4a<T> source, @cfb k9a<? super T> observer) {
        i11<? super r4a, ? super k9a, ? extends k9a> i11Var = f67537t;
        return i11Var != null ? (k9a) m18627a(i11Var, source, observer) : observer;
    }

    @cfb
    public static <T> kjf<T> onAssembly(@cfb kjf<T> source) {
        sy6<? super kjf, ? extends kjf> sy6Var = f67533p;
        return sy6Var != null ? (kjf) m18628b(sy6Var, source) : source;
    }

    @cfb
    public static <T> ycg<? super T>[] onSubscribe(@cfb eec<T> source, @cfb ycg<? super T>[] subscribers) {
        i11<? super eec, ? super ycg[], ? extends ycg[]> i11Var = f67541x;
        return i11Var != null ? (ycg[]) m18627a(i11Var, source, subscribers) : subscribers;
    }

    @cfb
    public static xd2 onAssembly(@cfb xd2 source) {
        sy6<? super xd2, ? extends xd2> sy6Var = f67534q;
        return sy6Var != null ? (xd2) m18628b(sy6Var, source) : source;
    }

    @cfb
    public static <T> eec<T> onAssembly(@cfb eec<T> source) {
        sy6<? super eec, ? extends eec> sy6Var = f67535r;
        return sy6Var != null ? (eec) m18628b(sy6Var, source) : source;
    }
}
