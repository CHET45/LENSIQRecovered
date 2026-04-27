package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class yd2 implements qh2 {
    @bfb
    @by1
    @hpe("none")
    public static yd2 amb(Iterable<? extends qh2> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new zd2(null, iterable));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 ambArray(qh2... qh2VarArr) {
        xjb.requireNonNull(qh2VarArr, "sources is null");
        return qh2VarArr.length == 0 ? complete() : qh2VarArr.length == 1 ? wrap(qh2VarArr[0]) : pfe.onAssembly(new zd2(qh2VarArr, null));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 complete() {
        return pfe.onAssembly(lf2.f57457a);
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 concat(Iterable<? extends qh2> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new ne2(iterable));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 concatArray(qh2... qh2VarArr) {
        xjb.requireNonNull(qh2VarArr, "sources is null");
        return qh2VarArr.length == 0 ? complete() : qh2VarArr.length == 1 ? wrap(qh2VarArr[0]) : pfe.onAssembly(new le2(qh2VarArr));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 create(ih2 ih2Var) {
        xjb.requireNonNull(ih2Var, "source is null");
        return pfe.onAssembly(new re2(ih2Var));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 defer(Callable<? extends qh2> callable) {
        xjb.requireNonNull(callable, "completableSupplier");
        return pfe.onAssembly(new ue2(callable));
    }

    @bfb
    @by1
    @hpe("none")
    private yd2 doOnLifecycle(tu2<? super mf4> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, InterfaceC7178i8 interfaceC7178i82, InterfaceC7178i8 interfaceC7178i83, InterfaceC7178i8 interfaceC7178i84) {
        xjb.requireNonNull(tu2Var, "onSubscribe is null");
        xjb.requireNonNull(tu2Var2, "onError is null");
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        xjb.requireNonNull(interfaceC7178i82, "onTerminate is null");
        xjb.requireNonNull(interfaceC7178i83, "onAfterTerminate is null");
        xjb.requireNonNull(interfaceC7178i84, "onDispose is null");
        return pfe.onAssembly(new lh2(this, tu2Var, tu2Var2, interfaceC7178i8, interfaceC7178i82, interfaceC7178i83, interfaceC7178i84));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 error(Callable<? extends Throwable> callable) {
        xjb.requireNonNull(callable, "errorSupplier is null");
        return pfe.onAssembly(new pf2(callable));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 fromAction(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "run is null");
        return pfe.onAssembly(new rf2(interfaceC7178i8));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 fromCallable(Callable<?> callable) {
        xjb.requireNonNull(callable, "callable is null");
        return pfe.onAssembly(new tf2(callable));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 fromFuture(Future<?> future) {
        xjb.requireNonNull(future, "future is null");
        return fromAction(q07.futureAction(future));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> yd2 fromMaybe(aaa<T> aaaVar) {
        xjb.requireNonNull(aaaVar, "maybe is null");
        return pfe.onAssembly(new o8a(aaaVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> yd2 fromObservable(xub<T> xubVar) {
        xjb.requireNonNull(xubVar, "observable is null");
        return pfe.onAssembly(new vf2(xubVar));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public static <T> yd2 fromPublisher(zjd<T> zjdVar) {
        xjb.requireNonNull(zjdVar, "publisher is null");
        return pfe.onAssembly(new xf2(zjdVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 fromRunnable(Runnable runnable) {
        xjb.requireNonNull(runnable, "run is null");
        return pfe.onAssembly(new ag2(runnable));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> yd2 fromSingle(pof<T> pofVar) {
        xjb.requireNonNull(pofVar, "single is null");
        return pfe.onAssembly(new bg2(pofVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 merge(Iterable<? extends qh2> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new wg2(iterable));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    private static yd2 merge0(zjd<? extends qh2> zjdVar, int i, boolean z) {
        xjb.requireNonNull(zjdVar, "sources is null");
        xjb.verifyPositive(i, "maxConcurrency");
        return pfe.onAssembly(new og2(zjdVar, i, z));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 mergeArray(qh2... qh2VarArr) {
        xjb.requireNonNull(qh2VarArr, "sources is null");
        return qh2VarArr.length == 0 ? complete() : qh2VarArr.length == 1 ? wrap(qh2VarArr[0]) : pfe.onAssembly(new qg2(qh2VarArr));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 mergeArrayDelayError(qh2... qh2VarArr) {
        xjb.requireNonNull(qh2VarArr, "sources is null");
        return pfe.onAssembly(new tg2(qh2VarArr));
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 mergeDelayError(Iterable<? extends qh2> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new vg2(iterable));
    }

    @by1
    @hpe("none")
    public static yd2 never() {
        return pfe.onAssembly(zg2.f105037a);
    }

    @bfb
    @by1
    @hpe("custom")
    private yd2 timeout0(long j, TimeUnit timeUnit, voe voeVar, qh2 qh2Var) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new xh2(this, j, timeUnit, voeVar, qh2Var));
    }

    @by1
    @hpe("io.reactivex:computation")
    public static yd2 timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, npe.computation());
    }

    private static NullPointerException toNpe(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 unsafeCreate(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "source is null");
        if (qh2Var instanceof yd2) {
            throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
        }
        return pfe.onAssembly(new fg2(qh2Var));
    }

    @by1
    @hpe("none")
    public static <R> yd2 using(Callable<R> callable, py6<? super R, ? extends qh2> py6Var, tu2<? super R> tu2Var) {
        return using(callable, py6Var, tu2Var, true);
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 wrap(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "source is null");
        return qh2Var instanceof yd2 ? pfe.onAssembly((yd2) qh2Var) : pfe.onAssembly(new fg2(qh2Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 ambWith(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return ambArray(this, qh2Var);
    }

    @bfb
    @by1
    @hpe("none")
    public final <T> Observable<T> andThen(xub<T> xubVar) {
        xjb.requireNonNull(xubVar, "next is null");
        return pfe.onAssembly(new de2(this, xubVar));
    }

    @by1
    @hpe("none")
    /* JADX INFO: renamed from: as */
    public final <R> R m25868as(@bfb qe2<? extends R> qe2Var) {
        return (R) ((qe2) xjb.requireNonNull(qe2Var, "converter is null")).apply(this);
    }

    @hpe("none")
    public final void blockingAwait() {
        b81 b81Var = new b81();
        subscribe(b81Var);
        b81Var.blockingGet();
    }

    @by1
    @hpe("none")
    @cib
    public final Throwable blockingGet() {
        b81 b81Var = new b81();
        subscribe(b81Var);
        return b81Var.blockingGetError();
    }

    @by1
    @hpe("none")
    public final yd2 cache() {
        return pfe.onAssembly(new he2(this));
    }

    @by1
    @hpe("none")
    public final yd2 compose(ii2 ii2Var) {
        return wrap(((ii2) xjb.requireNonNull(ii2Var, "transformer is null")).apply(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 concatWith(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return pfe.onAssembly(new be2(this, qh2Var));
    }

    @by1
    @hpe("io.reactivex:computation")
    public final yd2 delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, npe.computation(), false);
    }

    @by1
    @fg5
    @hpe("io.reactivex:computation")
    public final yd2 delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, npe.computation());
    }

    @by1
    @hpe("none")
    public final yd2 doAfterTerminate(InterfaceC7178i8 interfaceC7178i8) {
        tu2<? super mf4> tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2<? super Throwable> tu2VarEmptyConsumer2 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i82 = q07.f72641c;
        return doOnLifecycle(tu2VarEmptyConsumer, tu2VarEmptyConsumer2, interfaceC7178i82, interfaceC7178i82, interfaceC7178i8, interfaceC7178i82);
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 doFinally(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onFinally is null");
        return pfe.onAssembly(new ef2(this, interfaceC7178i8));
    }

    @by1
    @hpe("none")
    public final yd2 doOnComplete(InterfaceC7178i8 interfaceC7178i8) {
        tu2<? super mf4> tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2<? super Throwable> tu2VarEmptyConsumer2 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i82 = q07.f72641c;
        return doOnLifecycle(tu2VarEmptyConsumer, tu2VarEmptyConsumer2, interfaceC7178i8, interfaceC7178i82, interfaceC7178i82, interfaceC7178i82);
    }

    @by1
    @hpe("none")
    public final yd2 doOnDispose(InterfaceC7178i8 interfaceC7178i8) {
        tu2<? super mf4> tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2<? super Throwable> tu2VarEmptyConsumer2 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i82 = q07.f72641c;
        return doOnLifecycle(tu2VarEmptyConsumer, tu2VarEmptyConsumer2, interfaceC7178i82, interfaceC7178i82, interfaceC7178i82, interfaceC7178i8);
    }

    @by1
    @hpe("none")
    public final yd2 doOnError(tu2<? super Throwable> tu2Var) {
        tu2<? super mf4> tu2VarEmptyConsumer = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return doOnLifecycle(tu2VarEmptyConsumer, tu2Var, interfaceC7178i8, interfaceC7178i8, interfaceC7178i8, interfaceC7178i8);
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 doOnEvent(tu2<? super Throwable> tu2Var) {
        xjb.requireNonNull(tu2Var, "onEvent is null");
        return pfe.onAssembly(new gf2(this, tu2Var));
    }

    @by1
    @hpe("none")
    public final yd2 doOnSubscribe(tu2<? super mf4> tu2Var) {
        tu2<? super Throwable> tu2VarEmptyConsumer = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return doOnLifecycle(tu2Var, tu2VarEmptyConsumer, interfaceC7178i8, interfaceC7178i8, interfaceC7178i8, interfaceC7178i8);
    }

    @by1
    @hpe("none")
    public final yd2 doOnTerminate(InterfaceC7178i8 interfaceC7178i8) {
        tu2<? super mf4> tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2<? super Throwable> tu2VarEmptyConsumer2 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i82 = q07.f72641c;
        return doOnLifecycle(tu2VarEmptyConsumer, tu2VarEmptyConsumer2, interfaceC7178i82, interfaceC7178i8, interfaceC7178i82, interfaceC7178i82);
    }

    @by1
    @hpe("none")
    public final yd2 hide() {
        return pfe.onAssembly(new hg2(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 lift(kh2 kh2Var) {
        xjb.requireNonNull(kh2Var, "onLift is null");
        return pfe.onAssembly(new lg2(this, kh2Var));
    }

    @by1
    @fg5
    @hpe("none")
    public final <T> ljf<kgb<T>> materialize() {
        return pfe.onAssembly(new ng2(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 mergeWith(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return mergeArray(this, qh2Var);
    }

    @bfb
    @by1
    @hpe("custom")
    public final yd2 observeOn(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new ah2(this, voeVar));
    }

    @by1
    @hpe("none")
    public final yd2 onErrorComplete() {
        return onErrorComplete(q07.alwaysTrue());
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 onErrorResumeNext(py6<? super Throwable, ? extends qh2> py6Var) {
        xjb.requireNonNull(py6Var, "errorMapper is null");
        return pfe.onAssembly(new nh2(this, py6Var));
    }

    @by1
    @hpe("none")
    public final yd2 onTerminateDetach() {
        return pfe.onAssembly(new af2(this));
    }

    @by1
    @hpe("none")
    public final yd2 repeat() {
        return fromPublisher(toFlowable().repeat());
    }

    @by1
    @hpe("none")
    public final yd2 repeatUntil(eb1 eb1Var) {
        return fromPublisher(toFlowable().repeatUntil(eb1Var));
    }

    @by1
    @hpe("none")
    public final yd2 repeatWhen(py6<? super m86<Object>, ? extends zjd<?>> py6Var) {
        return fromPublisher(toFlowable().repeatWhen(py6Var));
    }

    @by1
    @hpe("none")
    public final yd2 retry() {
        return fromPublisher(toFlowable().retry());
    }

    @by1
    @hpe("none")
    public final yd2 retryWhen(py6<? super m86<Throwable>, ? extends zjd<?>> py6Var) {
        return fromPublisher(toFlowable().retryWhen(py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 startWith(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return concatArray(qh2Var, this);
    }

    @hpe("none")
    public final mf4 subscribe() {
        wz4 wz4Var = new wz4();
        subscribe(wz4Var);
        return wz4Var;
    }

    public abstract void subscribeActual(dh2 dh2Var);

    @bfb
    @by1
    @hpe("custom")
    public final yd2 subscribeOn(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new th2(this, voeVar));
    }

    @by1
    @hpe("none")
    public final <E extends dh2> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 takeUntil(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return pfe.onAssembly(new vh2(this, qh2Var));
    }

    @by1
    @hpe("none")
    public final bpg<Void> test() {
        bpg<Void> bpgVar = new bpg<>();
        subscribe(bpgVar);
        return bpgVar;
    }

    @by1
    @hpe("io.reactivex:computation")
    public final yd2 timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, npe.computation(), null);
    }

    @by1
    @hpe("none")
    /* JADX INFO: renamed from: to */
    public final <U> U m25869to(py6<? super yd2, U> py6Var) {
        try {
            return (U) ((py6) xjb.requireNonNull(py6Var, "converter is null")).apply(this);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            throw j75.wrapOrThrow(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <T> m86<T> toFlowable() {
        return this instanceof v07 ? ((v07) this).fuseToFlowable() : pfe.onAssembly(new ci2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @hpe("none")
    public final <T> s4a<T> toMaybe() {
        return this instanceof x07 ? ((x07) this).fuseToMaybe() : pfe.onAssembly(new a8a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @hpe("none")
    public final <T> Observable<T> toObservable() {
        return this instanceof z07 ? ((z07) this).fuseToObservable() : pfe.onAssembly(new di2(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final <T> ljf<T> toSingle(Callable<? extends T> callable) {
        xjb.requireNonNull(callable, "completionValueSupplier is null");
        return pfe.onAssembly(new fi2(this, callable, null));
    }

    @bfb
    @by1
    @hpe("none")
    public final <T> ljf<T> toSingleDefault(T t) {
        xjb.requireNonNull(t, "completionValue is null");
        return pfe.onAssembly(new fi2(this, null, t));
    }

    @bfb
    @by1
    @hpe("custom")
    public final yd2 unsubscribeOn(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new cf2(this, voeVar));
    }

    @bfb
    @by1
    @hpe("custom")
    public static yd2 timer(long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new zh2(j, timeUnit, voeVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <R> yd2 using(Callable<R> callable, py6<? super R, ? extends qh2> py6Var, tu2<? super R> tu2Var, boolean z) {
        xjb.requireNonNull(callable, "resourceSupplier is null");
        xjb.requireNonNull(py6Var, "completableFunction is null");
        xjb.requireNonNull(tu2Var, "disposer is null");
        return pfe.onAssembly(new ji2(callable, py6Var, tu2Var, z));
    }

    @by1
    @hpe("custom")
    public final yd2 delay(long j, TimeUnit timeUnit, voe voeVar) {
        return delay(j, timeUnit, voeVar, false);
    }

    @by1
    @fg5
    @hpe("custom")
    public final yd2 delaySubscription(long j, TimeUnit timeUnit, voe voeVar) {
        return timer(j, timeUnit, voeVar).andThen(this);
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 onErrorComplete(m8d<? super Throwable> m8dVar) {
        xjb.requireNonNull(m8dVar, "predicate is null");
        return pfe.onAssembly(new eh2(this, m8dVar));
    }

    @by1
    @hpe("none")
    public final yd2 repeat(long j) {
        return fromPublisher(toFlowable().repeat(j));
    }

    @by1
    @hpe("none")
    public final yd2 retry(m11<? super Integer, ? super Throwable> m11Var) {
        return fromPublisher(toFlowable().retry(m11Var));
    }

    @bfb
    @by1
    @hpe("io.reactivex:computation")
    public final yd2 timeout(long j, TimeUnit timeUnit, qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return timeout0(j, timeUnit, npe.computation(), qh2Var);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static yd2 concat(zjd<? extends qh2> zjdVar) {
        return concat(zjdVar, 2);
    }

    @bfb
    @by1
    @hpe("none")
    public static yd2 error(Throwable th) {
        xjb.requireNonNull(th, "error is null");
        return pfe.onAssembly(new nf2(th));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public static yd2 merge(zjd<? extends qh2> zjdVar) {
        return merge0(zjdVar, Integer.MAX_VALUE, false);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public static yd2 mergeDelayError(zjd<? extends qh2> zjdVar) {
        return merge0(zjdVar, Integer.MAX_VALUE, true);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <T> m86<T> andThen(zjd<T> zjdVar) {
        xjb.requireNonNull(zjdVar, "next is null");
        return pfe.onAssembly(new fe2(this, zjdVar));
    }

    @bfb
    @by1
    @hpe("custom")
    public final yd2 delay(long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new ye2(this, j, timeUnit, voeVar, z));
    }

    @by1
    @hpe("none")
    public final yd2 retry(long j) {
        return fromPublisher(toFlowable().retry(j));
    }

    @bfb
    @by1
    @hpe("none")
    public final <T> Observable<T> startWith(Observable<T> observable) {
        xjb.requireNonNull(observable, "other is null");
        return observable.concatWith(toObservable());
    }

    @Override // p000.qh2
    @hpe("none")
    public final void subscribe(dh2 dh2Var) {
        xjb.requireNonNull(dh2Var, "observer is null");
        try {
            dh2 dh2VarOnSubscribe = pfe.onSubscribe(this, dh2Var);
            xjb.requireNonNull(dh2VarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(dh2VarOnSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
            throw toNpe(th);
        }
    }

    @by1
    @hpe("none")
    public final bpg<Void> test(boolean z) {
        bpg<Void> bpgVar = new bpg<>();
        if (z) {
            bpgVar.cancel();
        }
        subscribe(bpgVar);
        return bpgVar;
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static yd2 concat(zjd<? extends qh2> zjdVar, int i) {
        xjb.requireNonNull(zjdVar, "sources is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new je2(zjdVar, i));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static yd2 merge(zjd<? extends qh2> zjdVar, int i) {
        return merge0(zjdVar, i, false);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static yd2 mergeDelayError(zjd<? extends qh2> zjdVar, int i) {
        return merge0(zjdVar, i, true);
    }

    @bfb
    @by1
    @hpe("none")
    public final boolean blockingAwait(long j, TimeUnit timeUnit) {
        xjb.requireNonNull(timeUnit, "unit is null");
        b81 b81Var = new b81();
        subscribe(b81Var);
        return b81Var.blockingAwait(j, timeUnit);
    }

    @by1
    @hpe("none")
    @cib
    public final Throwable blockingGet(long j, TimeUnit timeUnit) {
        xjb.requireNonNull(timeUnit, "unit is null");
        b81 b81Var = new b81();
        subscribe(b81Var);
        return b81Var.blockingGetError(j, timeUnit);
    }

    @by1
    @hpe("none")
    public final yd2 retry(long j, m8d<? super Throwable> m8dVar) {
        return fromPublisher(toFlowable().retry(j, m8dVar));
    }

    @by1
    @hpe("custom")
    public final yd2 timeout(long j, TimeUnit timeUnit, voe voeVar) {
        return timeout0(j, timeUnit, voeVar, null);
    }

    @bfb
    @by1
    @hpe("none")
    public final <T> ljf<T> andThen(pof<T> pofVar) {
        xjb.requireNonNull(pofVar, "next is null");
        return pfe.onAssembly(new bkf(pofVar, this));
    }

    @by1
    @hpe("none")
    public final yd2 retry(m8d<? super Throwable> m8dVar) {
        return fromPublisher(toFlowable().retry(m8dVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <T> m86<T> startWith(zjd<T> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return toFlowable().startWith((zjd) zjdVar);
    }

    @bfb
    @by1
    @hpe("custom")
    public final yd2 timeout(long j, TimeUnit timeUnit, voe voeVar, qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return timeout0(j, timeUnit, voeVar, qh2Var);
    }

    @bfb
    @by1
    @hpe("none")
    public final <T> s4a<T> andThen(aaa<T> aaaVar) {
        xjb.requireNonNull(aaaVar, "next is null");
        return pfe.onAssembly(new w5a(aaaVar, this));
    }

    @by1
    @hpe("none")
    public final yd2 andThen(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "next is null");
        return pfe.onAssembly(new be2(this, qh2Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final mf4 subscribe(InterfaceC7178i8 interfaceC7178i8, tu2<? super Throwable> tu2Var) {
        xjb.requireNonNull(tu2Var, "onError is null");
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        fo1 fo1Var = new fo1(tu2Var, interfaceC7178i8);
        subscribe(fo1Var);
        return fo1Var;
    }

    @bfb
    @by1
    @hpe("none")
    public final mf4 subscribe(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        fo1 fo1Var = new fo1(interfaceC7178i8);
        subscribe(fo1Var);
        return fo1Var;
    }
}
