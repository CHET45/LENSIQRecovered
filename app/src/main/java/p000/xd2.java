package p000;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xd2 implements ph2 {
    @cy1
    @gpe("none")
    @cfb
    public static xd2 amb(@cfb Iterable<? extends ph2> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new ae2(null, sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static xd2 ambArray(@cfb ph2... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? complete() : sources.length == 1 ? wrap(sources[0]) : ofe.onAssembly(new ae2(sources, null));
    }

    @gpe("none")
    @cfb
    @cy1
    public static xd2 complete() {
        return ofe.onAssembly(kf2.f53861a);
    }

    @cy1
    @gpe("none")
    @cfb
    public static xd2 concat(@cfb Iterable<? extends ph2> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new oe2(sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static xd2 concatArray(@cfb ph2... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? complete() : sources.length == 1 ? wrap(sources[0]) : ofe.onAssembly(new me2(sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static xd2 concatArrayDelayError(@cfb ph2... sources) {
        return l86.fromArray(sources).concatMapCompletableDelayError(r07.identity(), true, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public static xd2 concatDelayError(@cfb Iterable<? extends ph2> sources) {
        return l86.fromIterable(sources).concatMapCompletableDelayError(r07.identity());
    }

    @gpe("none")
    @cfb
    @cy1
    public static xd2 create(@cfb hh2 source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new se2(source));
    }

    @cy1
    @gpe("none")
    @cfb
    public static xd2 defer(@cfb nfg<? extends ph2> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new te2(supplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public static xd2 error(@cfb nfg<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new of2(supplier));
    }

    @gpe("none")
    @cfb
    @cy1
    public static xd2 fromAction(@cfb InterfaceC7776j8 action) {
        Objects.requireNonNull(action, "action is null");
        return ofe.onAssembly(new qf2(action));
    }

    @cy1
    @gpe("none")
    @cfb
    public static xd2 fromCallable(@cfb Callable<?> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return ofe.onAssembly(new sf2(callable));
    }

    @cy1
    @gpe("none")
    @cfb
    public static xd2 fromCompletionStage(@cfb CompletionStage<?> stage) {
        Objects.requireNonNull(stage, "stage is null");
        return ofe.onAssembly(new uf2(stage));
    }

    @cy1
    @gpe("none")
    @cfb
    public static xd2 fromFuture(@cfb Future<?> future) {
        Objects.requireNonNull(future, "future is null");
        return fromAction(r07.futureAction(future));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> xd2 fromMaybe(@cfb z9a<T> maybe) {
        Objects.requireNonNull(maybe, "maybe is null");
        return ofe.onAssembly(new p8a(maybe));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> xd2 fromObservable(@cfb wub<T> observable) {
        Objects.requireNonNull(observable, "observable is null");
        return ofe.onAssembly(new wf2(observable));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public static <T> xd2 fromPublisher(@cfb zjd<T> publisher) {
        Objects.requireNonNull(publisher, "publisher is null");
        return ofe.onAssembly(new yf2(publisher));
    }

    @gpe("none")
    @cfb
    @cy1
    public static xd2 fromRunnable(@cfb Runnable run) {
        Objects.requireNonNull(run, "run is null");
        return ofe.onAssembly(new zf2(run));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> xd2 fromSingle(@cfb oof<T> single) {
        Objects.requireNonNull(single, "single is null");
        return ofe.onAssembly(new cg2(single));
    }

    @cy1
    @gpe("none")
    @cfb
    public static xd2 fromSupplier(@cfb nfg<?> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new dg2(supplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public static xd2 merge(@cfb Iterable<? extends ph2> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new xg2(sources));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    private static xd2 merge0(@cfb zjd<? extends ph2> sources, int maxConcurrency, boolean delayErrors) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        return ofe.onAssembly(new pg2(sources, maxConcurrency, delayErrors));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static xd2 mergeArray(@cfb ph2... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? complete() : sources.length == 1 ? wrap(sources[0]) : ofe.onAssembly(new rg2(sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static xd2 mergeArrayDelayError(@cfb ph2... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new sg2(sources));
    }

    @cy1
    @gpe("none")
    @cfb
    public static xd2 mergeDelayError(@cfb Iterable<? extends ph2> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new ug2(sources));
    }

    @gpe("none")
    @cfb
    @cy1
    public static xd2 never() {
        return ofe.onAssembly(yg2.f101420a);
    }

    @cy1
    @gpe("none")
    @cfb
    public static kjf<Boolean> sequenceEqual(@cfb ph2 source1, @cfb ph2 source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return mergeArrayDelayError(source1, source2).andThen(kjf.just(Boolean.TRUE));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public static xd2 switchOnNext(@cfb zjd<? extends ph2> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new sj6(sources, r07.identity(), false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public static xd2 switchOnNextDelayError(@cfb zjd<? extends ph2> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new sj6(sources, r07.identity(), true));
    }

    @gpe("custom")
    @cfb
    @cy1
    private xd2 timeout0(long timeout, TimeUnit unit, woe scheduler, ph2 fallback) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new yh2(this, timeout, unit, scheduler, fallback));
    }

    @gpe("io.reactivex:computation")
    @cfb
    @cy1
    public static xd2 timer(long delay, @cfb TimeUnit unit) {
        return timer(delay, unit, mpe.computation());
    }

    private static NullPointerException toNpe(Throwable ex) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(ex);
        return nullPointerException;
    }

    @gpe("none")
    @cfb
    @cy1
    public static xd2 unsafeCreate(@cfb ph2 onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        if (onSubscribe instanceof xd2) {
            throw new IllegalArgumentException("Use of unsafeCreate(Completable)!");
        }
        return ofe.onAssembly(new eg2(onSubscribe));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <R> xd2 using(@cfb nfg<R> resourceSupplier, @cfb sy6<? super R, ? extends ph2> sourceSupplier, @cfb uu2<? super R> resourceCleanup) {
        return using(resourceSupplier, sourceSupplier, resourceCleanup, true);
    }

    @gpe("none")
    @cfb
    @cy1
    public static xd2 wrap(@cfb ph2 source) {
        Objects.requireNonNull(source, "source is null");
        return source instanceof xd2 ? ofe.onAssembly((xd2) source) : ofe.onAssembly(new eg2(source));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 ambWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return ambArray(this, other);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <T> vkb<T> andThen(@cfb wub<T> next) {
        Objects.requireNonNull(next, "next is null");
        return ofe.onAssembly(new ee2(this, next));
    }

    @gpe("none")
    public final void blockingAwait() {
        a81 a81Var = new a81();
        subscribe(a81Var);
        a81Var.blockingGet();
    }

    @gpe("none")
    public final void blockingSubscribe() {
        blockingSubscribe(r07.f76639c, r07.f76641e);
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 cache() {
        return ofe.onAssembly(new ie2(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 compose(@cfb hi2 transformer) {
        Objects.requireNonNull(transformer, "transformer is null");
        return wrap(transformer.apply(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 concatWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new ce2(this, other));
    }

    @gpe("io.reactivex:computation")
    @cfb
    @cy1
    public final xd2 delay(long time, @cfb TimeUnit unit) {
        return delay(time, unit, mpe.computation(), false);
    }

    @gpe("io.reactivex:computation")
    @cfb
    @cy1
    public final xd2 delaySubscription(long time, @cfb TimeUnit unit) {
        return delaySubscription(time, unit, mpe.computation());
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 doAfterTerminate(@cfb InterfaceC7776j8 onAfterTerminate) {
        uu2<? super lf4> uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2<? super Throwable> uu2VarEmptyConsumer2 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnLifecycle(uu2VarEmptyConsumer, uu2VarEmptyConsumer2, interfaceC7776j8, interfaceC7776j8, onAfterTerminate, interfaceC7776j8);
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 doFinally(@cfb InterfaceC7776j8 onFinally) {
        Objects.requireNonNull(onFinally, "onFinally is null");
        return ofe.onAssembly(new ff2(this, onFinally));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 doOnComplete(@cfb InterfaceC7776j8 onComplete) {
        uu2<? super lf4> uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2<? super Throwable> uu2VarEmptyConsumer2 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnLifecycle(uu2VarEmptyConsumer, uu2VarEmptyConsumer2, onComplete, interfaceC7776j8, interfaceC7776j8, interfaceC7776j8);
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 doOnDispose(@cfb InterfaceC7776j8 onDispose) {
        uu2<? super lf4> uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2<? super Throwable> uu2VarEmptyConsumer2 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnLifecycle(uu2VarEmptyConsumer, uu2VarEmptyConsumer2, interfaceC7776j8, interfaceC7776j8, interfaceC7776j8, onDispose);
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 doOnError(@cfb uu2<? super Throwable> onError) {
        uu2<? super lf4> uu2VarEmptyConsumer = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnLifecycle(uu2VarEmptyConsumer, onError, interfaceC7776j8, interfaceC7776j8, interfaceC7776j8, interfaceC7776j8);
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 doOnEvent(@cfb uu2<? super Throwable> onEvent) {
        Objects.requireNonNull(onEvent, "onEvent is null");
        return ofe.onAssembly(new hf2(this, onEvent));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 doOnLifecycle(@cfb uu2<? super lf4> onSubscribe, @cfb InterfaceC7776j8 onDispose) {
        uu2<? super Throwable> uu2VarEmptyConsumer = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnLifecycle(onSubscribe, uu2VarEmptyConsumer, interfaceC7776j8, interfaceC7776j8, interfaceC7776j8, onDispose);
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 doOnSubscribe(@cfb uu2<? super lf4> onSubscribe) {
        uu2<? super Throwable> uu2VarEmptyConsumer = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnLifecycle(onSubscribe, uu2VarEmptyConsumer, interfaceC7776j8, interfaceC7776j8, interfaceC7776j8, interfaceC7776j8);
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 doOnTerminate(@cfb InterfaceC7776j8 onTerminate) {
        uu2<? super lf4> uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2<? super Throwable> uu2VarEmptyConsumer2 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnLifecycle(uu2VarEmptyConsumer, uu2VarEmptyConsumer2, interfaceC7776j8, onTerminate, interfaceC7776j8, interfaceC7776j8);
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 hide() {
        return ofe.onAssembly(new ig2(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 lift(@cfb jh2 onLift) {
        Objects.requireNonNull(onLift, "onLift is null");
        return ofe.onAssembly(new kg2(this, onLift));
    }

    @gpe("none")
    @cfb
    @cy1
    public final <T> kjf<jgb<T>> materialize() {
        return ofe.onAssembly(new mg2(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 mergeWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return mergeArray(this, other);
    }

    @gpe("custom")
    @cfb
    @cy1
    public final xd2 observeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new bh2(this, scheduler));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 onErrorComplete() {
        return onErrorComplete(r07.alwaysTrue());
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 onErrorResumeNext(@cfb sy6<? super Throwable, ? extends ph2> fallbackSupplier) {
        Objects.requireNonNull(fallbackSupplier, "fallbackSupplier is null");
        return ofe.onAssembly(new oh2(this, fallbackSupplier));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 onErrorResumeWith(@cfb ph2 fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return onErrorResumeNext(r07.justFunction(fallback));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <T> r4a<T> onErrorReturn(@cfb sy6<? super Throwable, ? extends T> itemSupplier) {
        Objects.requireNonNull(itemSupplier, "itemSupplier is null");
        return ofe.onAssembly(new gh2(this, itemSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <T> r4a<T> onErrorReturnItem(@cfb T item) {
        Objects.requireNonNull(item, "item is null");
        return onErrorReturn(r07.justFunction(item));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 onTerminateDetach() {
        return ofe.onAssembly(new bf2(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 repeat() {
        return fromPublisher(toFlowable().repeat());
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 repeatUntil(@cfb cb1 stop) {
        return fromPublisher(toFlowable().repeatUntil(stop));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 repeatWhen(@cfb sy6<? super l86<Object>, ? extends zjd<?>> handler) {
        return fromPublisher(toFlowable().repeatWhen(handler));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 retry() {
        return fromPublisher(toFlowable().retry());
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 retryUntil(@cfb cb1 stop) {
        Objects.requireNonNull(stop, "stop is null");
        return retry(Long.MAX_VALUE, r07.predicateReverseFor(stop));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 retryWhen(@cfb sy6<? super l86<Throwable>, ? extends zjd<?>> handler) {
        return fromPublisher(toFlowable().retryWhen(handler));
    }

    @gpe("none")
    public final void safeSubscribe(@cfb ch2 observer) {
        Objects.requireNonNull(observer, "observer is null");
        subscribe(new nke(observer));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 startWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return concatArray(other, this);
    }

    @gpe("none")
    @cfb
    public final lf4 subscribe() {
        vz4 vz4Var = new vz4();
        subscribe(vz4Var);
        return vz4Var;
    }

    public abstract void subscribeActual(@cfb ch2 observer);

    @gpe("custom")
    @cfb
    @cy1
    public final xd2 subscribeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new uh2(this, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <E extends ch2> E subscribeWith(E observer) {
        subscribe(observer);
        return observer;
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 takeUntil(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new wh2(this, other));
    }

    @gpe("none")
    @cfb
    @cy1
    public final cpg<Void> test() {
        cpg<Void> cpgVar = new cpg<>();
        subscribe(cpgVar);
        return cpgVar;
    }

    @gpe("io.reactivex:computation")
    @cfb
    @cy1
    public final xd2 timeout(long timeout, @cfb TimeUnit unit) {
        return timeout0(timeout, unit, mpe.computation(), null);
    }

    @gpe("none")
    @cy1
    /* JADX INFO: renamed from: to */
    public final <R> R m25099to(@cfb pe2<? extends R> converter) {
        Objects.requireNonNull(converter, "converter is null");
        return converter.apply(this);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <T> CompletionStage<T> toCompletionStage(T defaultItem) {
        return (CompletionStage) subscribeWith(new qi2(true, defaultItem));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <T> l86<T> toFlowable() {
        return this instanceof u07 ? ((u07) this).fuseToFlowable() : ofe.onAssembly(new bi2(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final Future<Void> toFuture() {
        return (Future) subscribeWith(new m17());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gpe("none")
    @cfb
    @cy1
    public final <T> r4a<T> toMaybe() {
        return this instanceof w07 ? ((w07) this).fuseToMaybe() : ofe.onAssembly(new b8a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gpe("none")
    @cfb
    @cy1
    public final <T> vkb<T> toObservable() {
        return this instanceof y07 ? ((y07) this).fuseToObservable() : ofe.onAssembly(new ei2(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <T> kjf<T> toSingle(@cfb nfg<? extends T> completionValueSupplier) {
        Objects.requireNonNull(completionValueSupplier, "completionValueSupplier is null");
        return ofe.onAssembly(new gi2(this, completionValueSupplier, null));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <T> kjf<T> toSingleDefault(T completionValue) {
        Objects.requireNonNull(completionValue, "completionValue is null");
        return ofe.onAssembly(new gi2(this, null, completionValue));
    }

    @gpe("custom")
    @cfb
    @cy1
    public final xd2 unsubscribeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new df2(this, scheduler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static xd2 concatDelayError(@cfb zjd<? extends ph2> sources) {
        return concatDelayError(sources, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    private xd2 doOnLifecycle(final uu2<? super lf4> onSubscribe, final uu2<? super Throwable> onError, final InterfaceC7776j8 onComplete, final InterfaceC7776j8 onTerminate, final InterfaceC7776j8 onAfterTerminate, final InterfaceC7776j8 onDispose) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        Objects.requireNonNull(onTerminate, "onTerminate is null");
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        Objects.requireNonNull(onDispose, "onDispose is null");
        return ofe.onAssembly(new mh2(this, onSubscribe, onError, onComplete, onTerminate, onAfterTerminate, onDispose));
    }

    @gpe("custom")
    @cfb
    @cy1
    public static xd2 timer(long delay, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new ai2(delay, unit, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <R> xd2 using(@cfb nfg<R> resourceSupplier, @cfb sy6<? super R, ? extends ph2> sourceSupplier, @cfb uu2<? super R> resourceCleanup, boolean eager) {
        Objects.requireNonNull(resourceSupplier, "resourceSupplier is null");
        Objects.requireNonNull(sourceSupplier, "sourceSupplier is null");
        Objects.requireNonNull(resourceCleanup, "resourceCleanup is null");
        return ofe.onAssembly(new ki2(resourceSupplier, sourceSupplier, resourceCleanup, eager));
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb InterfaceC7776j8 onComplete) {
        blockingSubscribe(onComplete, r07.f76641e);
    }

    @gpe("custom")
    @cfb
    @cy1
    public final xd2 delay(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return delay(time, unit, scheduler, false);
    }

    @gpe("custom")
    @cfb
    @cy1
    public final xd2 delaySubscription(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return timer(time, unit, scheduler).andThen(this);
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 onErrorComplete(@cfb n8d<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new fh2(this, predicate));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 repeat(long times) {
        return fromPublisher(toFlowable().repeat(times));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 retry(@cfb l11<? super Integer, ? super Throwable> predicate) {
        return fromPublisher(toFlowable().retry(predicate));
    }

    @gpe("io.reactivex:computation")
    @cfb
    @cy1
    public final xd2 timeout(long timeout, @cfb TimeUnit unit, @cfb ph2 fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(timeout, unit, mpe.computation(), fallback);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static xd2 concat(@cfb zjd<? extends ph2> sources) {
        return concat(sources, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static xd2 concatDelayError(@cfb zjd<? extends ph2> sources, int prefetch) {
        return l86.fromPublisher(sources).concatMapCompletableDelayError(r07.identity(), true, prefetch);
    }

    @gpe("none")
    @cfb
    @cy1
    public static xd2 error(@cfb Throwable throwable) {
        Objects.requireNonNull(throwable, "throwable is null");
        return ofe.onAssembly(new mf2(throwable));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public static xd2 merge(@cfb zjd<? extends ph2> sources) {
        return merge0(sources, Integer.MAX_VALUE, false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public static xd2 mergeDelayError(@cfb zjd<? extends ph2> sources) {
        return merge0(sources, Integer.MAX_VALUE, true);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <T> l86<T> andThen(@cfb zjd<T> next) {
        Objects.requireNonNull(next, "next is null");
        return ofe.onAssembly(new ge2(this, next));
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb InterfaceC7776j8 onComplete, @cfb uu2<? super Throwable> onError) {
        Objects.requireNonNull(onComplete, "onComplete is null");
        Objects.requireNonNull(onError, "onError is null");
        a81 a81Var = new a81();
        subscribe(a81Var);
        a81Var.blockingConsume(r07.emptyConsumer(), onError, onComplete);
    }

    @gpe("custom")
    @cfb
    @cy1
    public final xd2 delay(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new ze2(this, time, unit, scheduler, delayError));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 retry(long times) {
        return fromPublisher(toFlowable().retry(times));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <T> l86<T> startWith(@cfb oof<T> other) {
        Objects.requireNonNull(other, "other is null");
        return l86.concat(kjf.wrap(other).toFlowable(), toFlowable());
    }

    @Override // p000.ph2
    @gpe("none")
    public final void subscribe(@cfb ch2 observer) {
        Objects.requireNonNull(observer, "observer is null");
        try {
            ch2 ch2VarOnSubscribe = ofe.onSubscribe(this, observer);
            Objects.requireNonNull(ch2VarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(ch2VarOnSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
            throw toNpe(th);
        }
    }

    @cy1
    @gpe("none")
    @cfb
    public final cpg<Void> test(boolean dispose) {
        cpg<Void> cpgVar = new cpg<>();
        if (dispose) {
            cpgVar.dispose();
        }
        subscribe(cpgVar);
        return cpgVar;
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static xd2 concat(@cfb zjd<? extends ph2> sources, int prefetch) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ke2(sources, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static xd2 merge(@cfb zjd<? extends ph2> sources, int maxConcurrency) {
        return merge0(sources, maxConcurrency, false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static xd2 mergeDelayError(@cfb zjd<? extends ph2> sources, int maxConcurrency) {
        return merge0(sources, maxConcurrency, true);
    }

    @gpe("none")
    @cy1
    public final boolean blockingAwait(long timeout, @cfb TimeUnit unit) {
        Objects.requireNonNull(unit, "unit is null");
        a81 a81Var = new a81();
        subscribe(a81Var);
        return a81Var.blockingAwait(timeout, unit);
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 retry(long times, @cfb n8d<? super Throwable> predicate) {
        return fromPublisher(toFlowable().retry(times, predicate));
    }

    @gpe("custom")
    @cfb
    @cy1
    public final xd2 timeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return timeout0(timeout, unit, scheduler, null);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <T> kjf<T> andThen(@cfb oof<T> next) {
        Objects.requireNonNull(next, "next is null");
        return ofe.onAssembly(new ckf(next, this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 retry(@cfb n8d<? super Throwable> predicate) {
        return fromPublisher(toFlowable().retry(predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <T> l86<T> startWith(@cfb z9a<T> other) {
        Objects.requireNonNull(other, "other is null");
        return l86.concat(r4a.wrap(other).toFlowable(), toFlowable());
    }

    @gpe("custom")
    @cfb
    @cy1
    public final xd2 timeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler, @cfb ph2 fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(timeout, unit, scheduler, fallback);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <T> r4a<T> andThen(@cfb z9a<T> next) {
        Objects.requireNonNull(next, "next is null");
        return ofe.onAssembly(new x5a(next, this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <T> vkb<T> startWith(@cfb wub<T> other) {
        Objects.requireNonNull(other, "other is null");
        return vkb.wrap(other).concatWith(toObservable());
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb ch2 observer) {
        Objects.requireNonNull(observer, "observer is null");
        d71 d71Var = new d71();
        observer.onSubscribe(d71Var);
        subscribe(d71Var);
        d71Var.blockingConsume(observer);
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 andThen(@cfb ph2 next) {
        Objects.requireNonNull(next, "next is null");
        return ofe.onAssembly(new ce2(this, next));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <T> l86<T> startWith(@cfb zjd<T> other) {
        Objects.requireNonNull(other, "other is null");
        return toFlowable().startWith(other);
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb InterfaceC7776j8 onComplete, @cfb uu2<? super Throwable> onError) {
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        eo1 eo1Var = new eo1(onError, onComplete);
        subscribe(eo1Var);
        return eo1Var;
    }

    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb InterfaceC7776j8 onComplete, @cfb uu2<? super Throwable> onError, @cfb sf4 container) {
        Objects.requireNonNull(onComplete, "onComplete is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(container, "container is null");
        nf4 nf4Var = new nf4(container, r07.emptyConsumer(), onError, onComplete);
        container.add(nf4Var);
        subscribe(nf4Var);
        return nf4Var;
    }

    @gpe("none")
    @cfb
    @cy1
    public final lf4 subscribe(@cfb InterfaceC7776j8 onComplete) {
        return subscribe(onComplete, r07.f76642f);
    }
}
