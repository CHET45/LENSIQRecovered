package p000;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kjf<T> implements oof<T> {
    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> amb(@cfb Iterable<? extends oof<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new njf(null, sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> kjf<T> ambArray(@cfb oof<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? error(rmf.emptyThrower()) : sources.length == 1 ? wrap(sources[0]) : ofe.onAssembly(new njf(sources, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb Iterable<? extends oof<? extends T>> sources) {
        return l86.fromIterable(sources).concatMapSingleDelayError(r07.identity(), false);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArray(@cfb oof<? extends T>... sources) {
        return l86.fromArray(sources).concatMapSingleDelayError(r07.identity(), false);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayDelayError(@cfb oof<? extends T>... sources) {
        return l86.fromArray(sources).concatMapSingleDelayError(r07.identity(), true);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayEager(@cfb oof<? extends T>... sources) {
        return l86.fromArray(sources).concatMapEager(rmf.toFlowable());
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayEagerDelayError(@cfb oof<? extends T>... sources) {
        return l86.fromArray(sources).concatMapEagerDelayError(rmf.toFlowable(), true);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatDelayError(@cfb Iterable<? extends oof<? extends T>> sources) {
        return l86.fromIterable(sources).concatMapSingleDelayError(r07.identity());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb Iterable<? extends oof<? extends T>> sources) {
        return l86.fromIterable(sources).concatMapEagerDelayError(rmf.toFlowable(), false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb Iterable<? extends oof<? extends T>> sources) {
        return l86.fromIterable(sources).concatMapEagerDelayError(rmf.toFlowable(), true);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> create(@cfb mnf<T> source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new wjf(source));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> defer(@cfb nfg<? extends oof<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new xjf(supplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> error(@cfb nfg<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new mlf(supplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> fromCallable(@cfb Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return ofe.onAssembly(new gmf(callable));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> fromCompletionStage(@cfb CompletionStage<T> stage) {
        Objects.requireNonNull(stage, "stage is null");
        return ofe.onAssembly(new imf(stage));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> fromFuture(@cfb Future<? extends T> future) {
        return toSingle(l86.fromFuture(future));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> fromMaybe(@cfb z9a<T> maybe) {
        Objects.requireNonNull(maybe, "maybe is null");
        return ofe.onAssembly(new bba(maybe, null));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> fromObservable(@cfb wub<? extends T> observable) {
        Objects.requireNonNull(observable, "observable is null");
        return ofe.onAssembly(new kub(observable, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public static <T> kjf<T> fromPublisher(@cfb zjd<? extends T> publisher) {
        Objects.requireNonNull(publisher, "publisher is null");
        return ofe.onAssembly(new kmf(publisher));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> fromSupplier(@cfb nfg<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new lmf(supplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> just(T item) {
        Objects.requireNonNull(item, "item is null");
        return ofe.onAssembly(new smf(item));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb Iterable<? extends oof<? extends T>> sources) {
        return l86.fromIterable(sources).flatMapSingle(r07.identity());
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeArray(oof<? extends T>... sources) {
        return l86.fromArray(sources).flatMapSingle(r07.identity(), false, Math.max(1, sources.length));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeArrayDelayError(@cfb oof<? extends T>... sources) {
        return l86.fromArray(sources).flatMapSingle(r07.identity(), true, Math.max(1, sources.length));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb Iterable<? extends oof<? extends T>> sources) {
        return l86.fromIterable(sources).flatMapSingle(r07.identity(), true, Integer.MAX_VALUE);
    }

    @gpe("none")
    @cfb
    @cy1
    public static <T> kjf<T> never() {
        return ofe.onAssembly(dnf.f30233a);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb oof<? extends T> source1, @cfb oof<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return ofe.onAssembly(new llf(source1, source2));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> switchOnNext(@cfb zjd<? extends oof<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new yj6(sources, r07.identity(), false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> switchOnNextDelayError(@cfb zjd<? extends oof<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new yj6(sources, r07.identity(), true));
    }

    private kjf<T> timeout0(final long timeout, final TimeUnit unit, final woe scheduler, final oof<? extends T> fallback) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new yof(this, timeout, unit, scheduler, fallback));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public static kjf<Long> timer(long delay, @cfb TimeUnit unit) {
        return timer(delay, unit, mpe.computation());
    }

    @cfb
    private static <T> kjf<T> toSingle(@cfb l86<T> source) {
        return ofe.onAssembly(new vi6(source, null));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> unsafeCreate(@cfb oof<T> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        if (onSubscribe instanceof kjf) {
            throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
        }
        return ofe.onAssembly(new mmf(onSubscribe));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, U> kjf<T> using(@cfb nfg<U> resourceSupplier, @cfb sy6<? super U, ? extends oof<? extends T>> sourceSupplier, @cfb uu2<? super U> resourceCleanup) {
        return using(resourceSupplier, sourceSupplier, resourceCleanup, true);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> wrap(@cfb oof<T> source) {
        Objects.requireNonNull(source, "source is null");
        return source instanceof kjf ? ofe.onAssembly((kjf) source) : ofe.onAssembly(new mmf(source));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> kjf<R> zip(@cfb Iterable<? extends oof<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> zipper) {
        Objects.requireNonNull(zipper, "zipper is null");
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new ppf(sources, zipper));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T, R> kjf<R> zipArray(@cfb sy6<? super Object[], ? extends R> zipper, @cfb oof<? extends T>... sources) {
        Objects.requireNonNull(zipper, "zipper is null");
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? error(new NoSuchElementException()) : ofe.onAssembly(new npf(sources, zipper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> ambWith(@cfb oof<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ambArray(this, other);
    }

    @gpe("none")
    @cfb
    @cy1
    public final T blockingGet() {
        a81 a81Var = new a81();
        subscribe(a81Var);
        return (T) a81Var.blockingGet();
    }

    @gpe("none")
    public final void blockingSubscribe() {
        blockingSubscribe(r07.emptyConsumer(), r07.f76641e);
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<T> cache() {
        return ofe.onAssembly(new pjf(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> kjf<U> cast(@cfb Class<? extends U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (kjf<U>) map(r07.castFunction(cls));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> kjf<R> compose(@cfb fpf<? super T, ? extends R> transformer) {
        Objects.requireNonNull(transformer, "transformer is null");
        return wrap(transformer.apply2(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> kjf<R> concatMap(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new plf(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 concatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper) {
        return flatMapCompletable(mapper);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> concatMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        return flatMapMaybe(mapper);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> concatWith(@cfb oof<? extends T> other) {
        return concat(this, other);
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<Boolean> contains(@cfb Object item) {
        return contains(item, yjb.equalsPredicate());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final kjf<T> delay(long time, @cfb TimeUnit unit) {
        return delay(time, unit, mpe.computation(), false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> delaySubscription(@cfb ph2 subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return ofe.onAssembly(new ckf(this, subscriptionIndicator));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> dematerialize(@cfb sy6<? super T, jgb<R>> selector) {
        Objects.requireNonNull(selector, "selector is null");
        return ofe.onAssembly(new kkf(this, selector));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> doAfterSuccess(@cfb uu2<? super T> onAfterSuccess) {
        Objects.requireNonNull(onAfterSuccess, "onAfterSuccess is null");
        return ofe.onAssembly(new okf(this, onAfterSuccess));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> doAfterTerminate(@cfb InterfaceC7776j8 onAfterTerminate) {
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        return ofe.onAssembly(new qkf(this, onAfterTerminate));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> doFinally(@cfb InterfaceC7776j8 onFinally) {
        Objects.requireNonNull(onFinally, "onFinally is null");
        return ofe.onAssembly(new skf(this, onFinally));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> doOnDispose(@cfb InterfaceC7776j8 onDispose) {
        Objects.requireNonNull(onDispose, "onDispose is null");
        return ofe.onAssembly(new ukf(this, onDispose));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> doOnError(@cfb uu2<? super Throwable> onError) {
        Objects.requireNonNull(onError, "onError is null");
        return ofe.onAssembly(new wkf(this, onError));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> doOnEvent(@cfb e11<? super T, ? super Throwable> onEvent) {
        Objects.requireNonNull(onEvent, "onEvent is null");
        return ofe.onAssembly(new ykf(this, onEvent));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> doOnLifecycle(@cfb uu2<? super lf4> onSubscribe, @cfb InterfaceC7776j8 onDispose) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        Objects.requireNonNull(onDispose, "onDispose is null");
        return ofe.onAssembly(new zkf(this, onSubscribe, onDispose));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> doOnSubscribe(@cfb uu2<? super lf4> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        return ofe.onAssembly(new blf(this, onSubscribe));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> doOnSuccess(@cfb uu2<? super T> onSuccess) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        return ofe.onAssembly(new dlf(this, onSuccess));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> doOnTerminate(@cfb InterfaceC7776j8 onTerminate) {
        Objects.requireNonNull(onTerminate, "onTerminate is null");
        return ofe.onAssembly(new flf(this, onTerminate));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> filter(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new a7a(this, predicate));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> kjf<R> flatMap(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new plf(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 flatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new slf(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> flatMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new ylf(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMapObservable(@cfb sy6<? super T, ? extends wub<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new bmf(this, mapper));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMapPublisher(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new dmf(this, mapper));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> l86<U> flattenAsFlowable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new ulf(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<U> flattenAsObservable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new wlf(this, mapper));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flattenStreamAsFlowable(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new emf(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flattenStreamAsObservable(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new fmf(this, mapper));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<T> hide() {
        return ofe.onAssembly(new pmf(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 ignoreElement() {
        return ofe.onAssembly(new cg2(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> kjf<R> lift(@cfb onf<? extends R, ? super T> lift) {
        Objects.requireNonNull(lift, "lift is null");
        return ofe.onAssembly(new umf(this, lift));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> kjf<R> map(@cfb sy6<? super T, ? extends R> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new zmf(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> mapOptional(@cfb sy6<? super T, Optional<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new anf(this, mapper));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<jgb<T>> materialize() {
        return ofe.onAssembly(new bnf(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> mergeWith(@cfb oof<? extends T> other) {
        return merge(this, other);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<T> observeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new gnf(this, scheduler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <U> r4a<U> ofType(@cfb Class<U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return filter(r07.isInstanceOf(clazz)).cast(clazz);
    }

    @gpe("none")
    @cfb
    @cy1
    public final r4a<T> onErrorComplete() {
        return onErrorComplete(r07.alwaysTrue());
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> onErrorResumeNext(@cfb sy6<? super Throwable, ? extends oof<? extends T>> fallbackSupplier) {
        Objects.requireNonNull(fallbackSupplier, "fallbackSupplier is null");
        return ofe.onAssembly(new aof(this, fallbackSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> onErrorResumeWith(@cfb oof<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return onErrorResumeNext(r07.justFunction(fallback));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> onErrorReturn(@cfb sy6<Throwable, ? extends T> itemSupplier) {
        Objects.requireNonNull(itemSupplier, "itemSupplier is null");
        return ofe.onAssembly(new lnf(this, itemSupplier, null));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> onErrorReturnItem(@cfb T item) {
        Objects.requireNonNull(item, "item is null");
        return ofe.onAssembly(new lnf(this, null, item));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<T> onTerminateDetach() {
        return ofe.onAssembly(new mkf(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> repeat() {
        return toFlowable().repeat();
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> repeatUntil(@cfb cb1 stop) {
        return toFlowable().repeatUntil(stop);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> repeatWhen(@cfb sy6<? super l86<Object>, ? extends zjd<?>> handler) {
        return toFlowable().repeatWhen(handler);
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<T> retry() {
        return toSingle(toFlowable().retry());
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> retryUntil(@cfb cb1 stop) {
        Objects.requireNonNull(stop, "stop is null");
        return retry(Long.MAX_VALUE, r07.predicateReverseFor(stop));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> retryWhen(@cfb sy6<? super l86<Throwable>, ? extends zjd<?>> handler) {
        return toSingle(toFlowable().retryWhen(handler));
    }

    @gpe("none")
    public final void safeSubscribe(@cfb hnf<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        subscribe(new zke(observer));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return l86.concat(xd2.wrap(other).toFlowable(), toFlowable());
    }

    @gpe("none")
    @cfb
    public final lf4 subscribe() {
        return subscribe(r07.emptyConsumer(), r07.f76642f);
    }

    public abstract void subscribeActual(@cfb hnf<? super T> observer);

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<T> subscribeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new tof(this, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <E extends hnf<? super T>> E subscribeWith(E observer) {
        subscribe(observer);
        return observer;
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> takeUntil(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return takeUntil(new bi2(other));
    }

    @gpe("none")
    @cfb
    @cy1
    public final cpg<T> test() {
        cpg<T> cpgVar = new cpg<>();
        subscribe(cpgVar);
        return cpgVar;
    }

    @gpe("io.reactivex:computation")
    @cfb
    @cy1
    public final kjf<j1h<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, mpe.computation());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final kjf<T> timeout(long timeout, @cfb TimeUnit unit) {
        return timeout0(timeout, unit, mpe.computation(), null);
    }

    @gpe("io.reactivex:computation")
    @cfb
    @cy1
    public final kjf<j1h<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, mpe.computation());
    }

    @gpe("none")
    @cy1
    /* JADX INFO: renamed from: to */
    public final <R> R m14800to(@cfb tjf<T, ? extends R> converter) {
        Objects.requireNonNull(converter, "converter is null");
        return converter.apply(this);
    }

    @gpe("none")
    @cfb
    @cy1
    public final CompletionStage<T> toCompletionStage() {
        return (CompletionStage) subscribeWith(new qi2(false, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> toFlowable() {
        return this instanceof u07 ? ((u07) this).fuseToFlowable() : ofe.onAssembly(new cpf(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new m17());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gpe("none")
    @cfb
    @cy1
    public final r4a<T> toMaybe() {
        return this instanceof w07 ? ((w07) this).fuseToMaybe() : ofe.onAssembly(new i8a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> toObservable() {
        return this instanceof y07 ? ((y07) this).fuseToObservable() : ofe.onAssembly(new epf(this));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<T> unsubscribeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new ipf(this, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> kjf<R> zipWith(@cfb oof<U> other, @cfb i11<? super T, ? super U, ? extends R> zipper) {
        return zip(this, other, zipper);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concat(@cfb wub<? extends oof<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new pmb(sources, r07.identity(), e55.IMMEDIATE, 2));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatDelayError(@cfb zjd<? extends oof<? extends T>> sources) {
        return l86.fromPublisher(sources).concatMapSingleDelayError(r07.identity());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb Iterable<? extends oof<? extends T>> sources, int maxConcurrency) {
        return l86.fromIterable(sources).concatMapEagerDelayError(rmf.toFlowable(), false, maxConcurrency, 1);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb Iterable<? extends oof<? extends T>> sources, int maxConcurrency) {
        return l86.fromIterable(sources).concatMapEagerDelayError(rmf.toFlowable(), true, maxConcurrency, 1);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> fromFuture(@cfb Future<? extends T> future, long timeout, @cfb TimeUnit unit) {
        return toSingle(l86.fromFuture(future, timeout, unit));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb zjd<? extends oof<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new cd6(sources, r07.identity(), false, Integer.MAX_VALUE));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb zjd<? extends oof<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new cd6(sources, r07.identity(), true, Integer.MAX_VALUE));
    }

    @cy1
    @gpe("custom")
    @cfb
    public static kjf<Long> timer(long delay, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new apf(delay, unit, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, U> kjf<T> using(@cfb nfg<U> resourceSupplier, @cfb sy6<? super U, ? extends oof<? extends T>> sourceSupplier, @cfb uu2<? super U> resourceCleanup, boolean eager) {
        Objects.requireNonNull(resourceSupplier, "resourceSupplier is null");
        Objects.requireNonNull(sourceSupplier, "sourceSupplier is null");
        Objects.requireNonNull(resourceCleanup, "resourceCleanup is null");
        return ofe.onAssembly(new kpf(resourceSupplier, sourceSupplier, resourceCleanup, eager));
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb uu2<? super T> onSuccess) {
        blockingSubscribe(onSuccess, r07.f76641e);
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<Boolean> contains(@cfb Object item, @cfb l11<Object, Object> comparer) {
        Objects.requireNonNull(item, "item is null");
        Objects.requireNonNull(comparer, "comparer is null");
        return ofe.onAssembly(new sjf(this, item, comparer));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final kjf<T> delay(long time, @cfb TimeUnit unit, boolean delayError) {
        return delay(time, unit, mpe.computation(), delayError);
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> onErrorComplete(@cfb n8d<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new jnf(this, predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> repeat(long times) {
        return toFlowable().repeat(times);
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> retry(long times) {
        return toSingle(toFlowable().retry(times));
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb e11<? super T, ? super Throwable> onCallback) {
        Objects.requireNonNull(onCallback, "onCallback is null");
        g11 g11Var = new g11(onCallback);
        subscribe(g11Var);
        return g11Var;
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<j1h<T>> timeInterval(@cfb woe scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<T> timeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return timeout0(timeout, unit, scheduler, null);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<j1h<T>> timestamp(@cfb woe scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatDelayError(@cfb zjd<? extends oof<? extends T>> sources, int prefetch) {
        return l86.fromPublisher(sources).concatMapSingleDelayError(r07.identity(), true, prefetch);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb zjd<? extends oof<? extends T>> sources) {
        return l86.fromPublisher(sources).concatMapEager(rmf.toFlowable());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb zjd<? extends oof<? extends T>> sources) {
        return l86.fromPublisher(sources).concatMapEagerDelayError(rmf.toFlowable(), true);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> error(@cfb Throwable throwable) {
        Objects.requireNonNull(throwable, "throwable is null");
        return error((nfg<? extends Throwable>) r07.justSupplier(throwable));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> fromMaybe(@cfb z9a<T> maybe, @cfb T defaultItem) {
        Objects.requireNonNull(maybe, "maybe is null");
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        return ofe.onAssembly(new bba(maybe, defaultItem));
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb uu2<? super T> onSuccess, @cfb uu2<? super Throwable> onError) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onError, "onError is null");
        a81 a81Var = new a81();
        subscribe(a81Var);
        a81Var.blockingConsume(onSuccess, onError, r07.f76639c);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<T> delay(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return delay(time, unit, scheduler, false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> kjf<T> delaySubscription(@cfb oof<U> subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return ofe.onAssembly(new ikf(this, subscriptionIndicator));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> kjf<R> flatMap(@cfb sy6<? super T, ? extends oof<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return ofe.onAssembly(new qlf(this, mapper, combiner));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> retry(@cfb l11<? super Integer, ? super Throwable> predicate) {
        return toSingle(toFlowable().retry(predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWith(@cfb oof<T> other) {
        Objects.requireNonNull(other, "other is null");
        return l86.concat(wrap(other).toFlowable(), toFlowable());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <E> kjf<T> takeUntil(@cfb zjd<E> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new vof(this, other));
    }

    @cy1
    @gpe("none")
    @cfb
    public final cpg<T> test(boolean dispose) {
        cpg<T> cpgVar = new cpg<>();
        if (dispose) {
            cpgVar.dispose();
        }
        subscribe(cpgVar);
        return cpgVar;
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final kjf<j1h<T>> timeInterval(@cfb TimeUnit unit) {
        return timeInterval(unit, mpe.computation());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<T> timeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler, @cfb oof<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(timeout, unit, scheduler, fallback);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final kjf<j1h<T>> timestamp(@cfb TimeUnit unit) {
        return timestamp(unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb zjd<? extends oof<? extends T>> sources) {
        return concat(sources, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb zjd<? extends oof<? extends T>> sources, int maxConcurrency) {
        return l86.fromPublisher(sources).concatMapEager(rmf.toFlowable(), maxConcurrency, 1);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb zjd<? extends oof<? extends T>> sources, int maxConcurrency) {
        return l86.fromPublisher(sources).concatMapEagerDelayError(rmf.toFlowable(), true, maxConcurrency, 1);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<T> merge(@cfb oof<? extends oof<? extends T>> source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new plf(source, r07.identity()));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb oof<? extends T> source1, @cfb oof<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return l86.fromArray(source1, source2).flatMapSingle(r07.identity(), true, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, R> kjf<R> zip(@cfb oof<? extends T1> source1, @cfb oof<? extends T2> source2, @cfb i11<? super T1, ? super T2, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<T> delay(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new akf(this, time, unit, scheduler, delayError));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> retry(long times, @cfb n8d<? super Throwable> predicate) {
        return toSingle(toFlowable().retry(times, predicate));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<j1h<T>> timeInterval(@cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new wof(this, unit, scheduler, true));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<j1h<T>> timestamp(@cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new wof(this, unit, scheduler, false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb zjd<? extends oof<? extends T>> sources, int prefetch) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new la6(sources, r07.identity(), e55.IMMEDIATE, prefetch));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> kjf<T> delaySubscription(@cfb wub<U> subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return ofe.onAssembly(new ekf(this, subscriptionIndicator));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> retry(@cfb n8d<? super Throwable> predicate) {
        return toSingle(toFlowable().retry(predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWith(@cfb z9a<T> other) {
        Objects.requireNonNull(other, "other is null");
        return l86.concat(r4a.wrap(other).toFlowable(), toFlowable());
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onSuccess) {
        return subscribe(onSuccess, r07.f76642f);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <E> kjf<T> takeUntil(@cfb oof<? extends E> other) {
        Objects.requireNonNull(other, "other is null");
        return takeUntil(new cpf(other));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final kjf<T> timeout(long timeout, @cfb TimeUnit unit, @cfb oof<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(timeout, unit, mpe.computation(), fallback);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb oof<? extends T> source1, @cfb oof<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return l86.fromArray(source1, source2).flatMapSingle(r07.identity(), false, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> kjf<R> flatMap(@cfb sy6<? super T, ? extends oof<? extends R>> onSuccessMapper, @cfb sy6<? super Throwable, ? extends oof<? extends R>> onErrorMapper) {
        Objects.requireNonNull(onSuccessMapper, "onSuccessMapper is null");
        Objects.requireNonNull(onErrorMapper, "onErrorMapper is null");
        return ofe.onAssembly(new zlf(this, onSuccessMapper, onErrorMapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onSuccess, @cfb uu2<? super Throwable> onError) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onError, "onError is null");
        yu2 yu2Var = new yu2(onSuccess, onError);
        subscribe(yu2Var);
        return yu2Var;
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb oof<? extends T> source1, @cfb oof<? extends T> source2, @cfb oof<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return l86.fromArray(source1, source2, source3).flatMapSingle(r07.identity(), true, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> kjf<T> delaySubscription(@cfb zjd<U> subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return ofe.onAssembly(new gkf(this, subscriptionIndicator));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> startWith(@cfb wub<T> other) {
        Objects.requireNonNull(other, "other is null");
        return vkb.wrap(other).concatWith(toObservable());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb oof<? extends T> source1, @cfb oof<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return l86.fromArray(source1, source2).concatMapSingleDelayError(r07.identity(), false);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, R> kjf<R> zip(@cfb oof<? extends T1> source1, @cfb oof<? extends T2> source2, @cfb oof<? extends T3> source3, @cfb jz6<? super T1, ? super T2, ? super T3, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2, source3);
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb hnf<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        d71 d71Var = new d71();
        observer.onSubscribe(d71Var);
        subscribe(d71Var);
        d71Var.blockingConsume(observer);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb oof<? extends T> source1, @cfb oof<? extends T> source2, @cfb oof<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return l86.fromArray(source1, source2, source3).flatMapSingle(r07.identity(), false, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final kjf<T> delaySubscription(long time, @cfb TimeUnit unit) {
        return delaySubscription(time, unit, mpe.computation());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWith(@cfb zjd<T> other) {
        Objects.requireNonNull(other, "other is null");
        return toFlowable().startWith(other);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final kjf<T> delaySubscription(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return delaySubscription(vkb.timer(time, unit, scheduler));
    }

    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onSuccess, @cfb uu2<? super Throwable> onError, @cfb sf4 container) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(container, "container is null");
        nf4 nf4Var = new nf4(container, onSuccess, onError, r07.f76639c);
        container.add(nf4Var);
        subscribe(nf4Var);
        return nf4Var;
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb oof<? extends T> source1, @cfb oof<? extends T> source2, @cfb oof<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return l86.fromArray(source1, source2, source3).concatMapSingleDelayError(r07.identity(), false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb oof<? extends T> source1, @cfb oof<? extends T> source2, @cfb oof<? extends T> source3, @cfb oof<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return l86.fromArray(source1, source2, source3, source4).flatMapSingle(r07.identity(), true, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb oof<? extends T> source1, @cfb oof<? extends T> source2, @cfb oof<? extends T> source3, @cfb oof<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return l86.fromArray(source1, source2, source3, source4).flatMapSingle(r07.identity(), false, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, R> kjf<R> zip(@cfb oof<? extends T1> source1, @cfb oof<? extends T2> source2, @cfb oof<? extends T3> source3, @cfb oof<? extends T4> source4, @cfb nz6<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2, source3, source4);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb oof<? extends T> source1, @cfb oof<? extends T> source2, @cfb oof<? extends T> source3, @cfb oof<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return l86.fromArray(source1, source2, source3, source4).concatMapSingleDelayError(r07.identity(), false);
    }

    @Override // p000.oof
    @gpe("none")
    public final void subscribe(@cfb hnf<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        hnf<? super T> hnfVarOnSubscribe = ofe.onSubscribe(this, observer);
        Objects.requireNonNull(hnfVarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(hnfVarOnSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, R> kjf<R> zip(@cfb oof<? extends T1> source1, @cfb oof<? extends T2> source2, @cfb oof<? extends T3> source3, @cfb oof<? extends T4> source4, @cfb oof<? extends T5> source5, @cfb qz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2, source3, source4, source5);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, R> kjf<R> zip(@cfb oof<? extends T1> source1, @cfb oof<? extends T2> source2, @cfb oof<? extends T3> source3, @cfb oof<? extends T4> source4, @cfb oof<? extends T5> source5, @cfb oof<? extends T6> source6, @cfb tz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2, source3, source4, source5, source6);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, R> kjf<R> zip(@cfb oof<? extends T1> source1, @cfb oof<? extends T2> source2, @cfb oof<? extends T3> source3, @cfb oof<? extends T4> source4, @cfb oof<? extends T5> source5, @cfb oof<? extends T6> source6, @cfb oof<? extends T7> source7, @cfb wz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2, source3, source4, source5, source6, source7);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> kjf<R> zip(@cfb oof<? extends T1> source1, @cfb oof<? extends T2> source2, @cfb oof<? extends T3> source3, @cfb oof<? extends T4> source4, @cfb oof<? extends T5> source5, @cfb oof<? extends T6> source6, @cfb oof<? extends T7> source7, @cfb oof<? extends T8> source8, @cfb zz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(source8, "source8 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2, source3, source4, source5, source6, source7, source8);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> kjf<R> zip(@cfb oof<? extends T1> source1, @cfb oof<? extends T2> source2, @cfb oof<? extends T3> source3, @cfb oof<? extends T4> source4, @cfb oof<? extends T5> source5, @cfb oof<? extends T6> source6, @cfb oof<? extends T7> source7, @cfb oof<? extends T8> source8, @cfb oof<? extends T9> source9, @cfb c07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(source8, "source8 is null");
        Objects.requireNonNull(source9, "source9 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2, source3, source4, source5, source6, source7, source8, source9);
    }
}
