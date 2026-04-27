package p000;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public abstract class r4a<T> implements z9a<T> {
    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> amb(@cfb Iterable<? extends z9a<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new v4a(null, sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> r4a<T> ambArray(@cfb z9a<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? empty() : sources.length == 1 ? wrap(sources[0]) : ofe.onAssembly(new v4a(sources, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb Iterable<? extends z9a<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new f5a(sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArray(@cfb z9a<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? l86.empty() : sources.length == 1 ? ofe.onAssembly(new vaa(sources[0])) : ofe.onAssembly(new b5a(sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayDelayError(@cfb z9a<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? l86.empty() : sources.length == 1 ? ofe.onAssembly(new vaa(sources[0])) : ofe.onAssembly(new d5a(sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayEager(@cfb z9a<? extends T>... sources) {
        return l86.fromArray(sources).concatMapEager(yaa.instance());
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayEagerDelayError(@cfb z9a<? extends T>... sources) {
        return l86.fromArray(sources).concatMapEagerDelayError(yaa.instance(), true);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatDelayError(@cfb Iterable<? extends z9a<? extends T>> sources) {
        return l86.fromIterable(sources).concatMapMaybeDelayError(r07.identity());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb Iterable<? extends z9a<? extends T>> sources) {
        return l86.fromIterable(sources).concatMapEagerDelayError(yaa.instance(), false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb Iterable<? extends z9a<? extends T>> sources) {
        return l86.fromIterable(sources).concatMapEagerDelayError(yaa.instance(), true);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> create(@cfb s9a<T> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        return ofe.onAssembly(new n5a(onSubscribe));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> defer(@cfb nfg<? extends z9a<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new o5a(supplier));
    }

    @gpe("none")
    @cfb
    @cy1
    public static <T> r4a<T> empty() {
        return ofe.onAssembly(p6a.f69844a);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> error(@cfb Throwable throwable) {
        Objects.requireNonNull(throwable, "throwable is null");
        return ofe.onAssembly(new t6a(throwable));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromAction(@cfb InterfaceC7776j8 action) {
        Objects.requireNonNull(action, "action is null");
        return ofe.onAssembly(new w7a(action));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromCallable(@cfb Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return ofe.onAssembly(new y7a(callable));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromCompletable(@cfb ph2 completableSource) {
        Objects.requireNonNull(completableSource, "completableSource is null");
        return ofe.onAssembly(new b8a(completableSource));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromCompletionStage(@cfb CompletionStage<T> stage) {
        Objects.requireNonNull(stage, "stage is null");
        return ofe.onAssembly(new c8a(stage));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromFuture(@cfb Future<? extends T> future) {
        Objects.requireNonNull(future, "future is null");
        return ofe.onAssembly(new d8a(future, 0L, null));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromObservable(@cfb wub<T> source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new iob(source, 0L));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromOptional(@cfb Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (r4a) optional.map(new Function() { // from class: p4a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return r4a.just(obj);
            }
        }).orElseGet(new Supplier() { // from class: q4a
            @Override // java.util.function.Supplier
            public final Object get() {
                return r4a.empty();
            }
        });
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public static <T> r4a<T> fromPublisher(@cfb zjd<T> source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new ec6(source, 0L));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromRunnable(@cfb Runnable run) {
        Objects.requireNonNull(run, "run is null");
        return ofe.onAssembly(new f8a(run));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromSingle(@cfb oof<T> single) {
        Objects.requireNonNull(single, "single is null");
        return ofe.onAssembly(new i8a(single));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromSupplier(@cfb nfg<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new j8a(supplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> just(T item) {
        Objects.requireNonNull(item, "item is null");
        return ofe.onAssembly(new u8a(item));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb Iterable<? extends z9a<? extends T>> sources) {
        return l86.fromIterable(sources).flatMapMaybe(r07.identity(), false, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeArray(z9a<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? l86.empty() : sources.length == 1 ? ofe.onAssembly(new vaa(sources[0])) : ofe.onAssembly(new f9a(sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeArrayDelayError(@cfb z9a<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return l86.fromArray(sources).flatMapMaybe(r07.identity(), true, Math.max(1, sources.length));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb Iterable<? extends z9a<? extends T>> sources) {
        return l86.fromIterable(sources).flatMapMaybe(r07.identity(), true, Integer.MAX_VALUE);
    }

    @gpe("none")
    @cfb
    @cy1
    public static <T> r4a<T> never() {
        return ofe.onAssembly(g9a.f39057a);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2) {
        return sequenceEqual(source1, source2, yjb.equalsPredicate());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public static <T> l86<T> switchOnNext(@cfb zjd<? extends z9a<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new vj6(sources, r07.identity(), false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> switchOnNextDelayError(@cfb zjd<? extends z9a<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new vj6(sources, r07.identity(), true));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public static r4a<Long> timer(long delay, @cfb TimeUnit unit) {
        return timer(delay, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> unsafeCreate(@cfb z9a<T> onSubscribe) {
        if (onSubscribe instanceof r4a) {
            throw new IllegalArgumentException("unsafeCreate(Maybe) should be upgraded");
        }
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        return ofe.onAssembly(new eba(onSubscribe));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, D> r4a<T> using(@cfb nfg<? extends D> resourceSupplier, @cfb sy6<? super D, ? extends z9a<? extends T>> sourceSupplier, @cfb uu2<? super D> resourceCleanup) {
        return using(resourceSupplier, sourceSupplier, resourceCleanup, true);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> wrap(@cfb z9a<T> source) {
        if (source instanceof r4a) {
            return ofe.onAssembly((r4a) source);
        }
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new eba(source));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> r4a<R> zip(@cfb Iterable<? extends z9a<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> zipper) {
        Objects.requireNonNull(zipper, "zipper is null");
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new nba(sources, zipper));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T, R> r4a<R> zipArray(@cfb sy6<? super Object[], ? extends R> zipper, @cfb z9a<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return empty();
        }
        Objects.requireNonNull(zipper, "zipper is null");
        return ofe.onAssembly(new lba(sources, zipper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> ambWith(@cfb z9a<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ambArray(this, other);
    }

    @dib
    @gpe("none")
    @cy1
    public final T blockingGet() {
        a81 a81Var = new a81();
        subscribe(a81Var);
        return (T) a81Var.blockingGet();
    }

    @gpe("none")
    public final void blockingSubscribe() {
        blockingSubscribe(r07.emptyConsumer(), r07.f76641e, r07.f76639c);
    }

    @gpe("none")
    @cfb
    @cy1
    public final r4a<T> cache() {
        return ofe.onAssembly(new x4a(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> r4a<U> cast(@cfb Class<? extends U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (r4a<U>) map(r07.castFunction(cls));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> compose(@cfb cba<? super T, ? extends R> transformer) {
        Objects.requireNonNull(transformer, "transformer is null");
        return wrap(transformer.apply(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> concatMap(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        return flatMap(mapper);
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
    public final <R> r4a<R> concatMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        return flatMapSingle(mapper);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> concatWith(@cfb z9a<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return concat(this, other);
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<Boolean> contains(@cfb Object item) {
        Objects.requireNonNull(item, "item is null");
        return ofe.onAssembly(new h5a(this, item));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<Long> count() {
        return ofe.onAssembly(new l5a(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> defaultIfEmpty(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        return ofe.onAssembly(new bba(this, defaultItem));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final r4a<T> delay(long time, @cfb TimeUnit unit) {
        return delay(time, unit, mpe.computation(), false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <U> r4a<T> delaySubscription(@cfb zjd<U> subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return ofe.onAssembly(new v5a(this, subscriptionIndicator));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> dematerialize(@cfb sy6<? super T, jgb<R>> selector) {
        Objects.requireNonNull(selector, "selector is null");
        return ofe.onAssembly(new y5a(this, selector));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doAfterSuccess(@cfb uu2<? super T> onAfterSuccess) {
        Objects.requireNonNull(onAfterSuccess, "onAfterSuccess is null");
        return ofe.onAssembly(new c6a(this, onAfterSuccess));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doAfterTerminate(@cfb InterfaceC7776j8 onAfterTerminate) {
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer3 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        return ofe.onAssembly(new x9a(this, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, uu2VarEmptyConsumer3, interfaceC7776j8, onAfterTerminate, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doFinally(@cfb InterfaceC7776j8 onFinally) {
        Objects.requireNonNull(onFinally, "onFinally is null");
        return ofe.onAssembly(new e6a(this, onFinally));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doOnComplete(@cfb InterfaceC7776j8 onComplete) {
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer3 = r07.emptyConsumer();
        Objects.requireNonNull(onComplete, "onComplete is null");
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new x9a(this, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, uu2VarEmptyConsumer3, onComplete, interfaceC7776j8, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doOnDispose(@cfb InterfaceC7776j8 onDispose) {
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer3 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        Objects.requireNonNull(onDispose, "onDispose is null");
        return ofe.onAssembly(new x9a(this, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, uu2VarEmptyConsumer3, interfaceC7776j8, interfaceC7776j8, onDispose));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doOnError(@cfb uu2<? super Throwable> onError) {
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        Objects.requireNonNull(onError, "onError is null");
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new x9a(this, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, onError, interfaceC7776j8, interfaceC7776j8, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doOnEvent(@cfb e11<? super T, ? super Throwable> onEvent) {
        Objects.requireNonNull(onEvent, "onEvent is null");
        return ofe.onAssembly(new g6a(this, onEvent));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doOnLifecycle(@cfb uu2<? super lf4> onSubscribe, @cfb InterfaceC7776j8 onDispose) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        Objects.requireNonNull(onDispose, "onDispose is null");
        return ofe.onAssembly(new h6a(this, onSubscribe, onDispose));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doOnSubscribe(@cfb uu2<? super lf4> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new x9a(this, onSubscribe, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, interfaceC7776j8, interfaceC7776j8, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doOnSuccess(@cfb uu2<? super T> onSuccess) {
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new x9a(this, uu2VarEmptyConsumer, onSuccess, uu2VarEmptyConsumer2, interfaceC7776j8, interfaceC7776j8, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> doOnTerminate(@cfb InterfaceC7776j8 onTerminate) {
        Objects.requireNonNull(onTerminate, "onTerminate is null");
        return ofe.onAssembly(new j6a(this, onTerminate));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> filter(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new y6a(this, predicate));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> flatMap(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new t7a(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 flatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new e7a(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMapObservable(@cfb sy6<? super T, ? extends wub<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new m7a(this, mapper));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMapPublisher(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new o7a(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> flatMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new q7a(this, mapper));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> l86<U> flattenAsFlowable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new g7a(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<U> flattenAsObservable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new i7a(this, mapper));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flattenStreamAsFlowable(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new u7a(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flattenStreamAsObservable(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new v7a(this, mapper));
    }

    @gpe("none")
    @cfb
    @cy1
    public final r4a<T> hide() {
        return ofe.onAssembly(new l8a(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 ignoreElement() {
        return ofe.onAssembly(new p8a(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<Boolean> isEmpty() {
        return ofe.onAssembly(new t8a(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> lift(@cfb u9a<? extends R, ? super T> lift) {
        Objects.requireNonNull(lift, "lift is null");
        return ofe.onAssembly(new x8a(this, lift));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> map(@cfb sy6<? super T, ? extends R> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new a9a(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> mapOptional(@cfb sy6<? super T, Optional<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new b9a(this, mapper));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<jgb<T>> materialize() {
        return ofe.onAssembly(new c9a(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> mergeWith(@cfb z9a<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return merge(this, other);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<T> observeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new j9a(this, scheduler));
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
    public final r4a<T> onErrorResumeNext(@cfb sy6<? super Throwable, ? extends z9a<? extends T>> fallbackSupplier) {
        Objects.requireNonNull(fallbackSupplier, "fallbackSupplier is null");
        return ofe.onAssembly(new p9a(this, fallbackSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> onErrorResumeWith(@cfb z9a<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return onErrorResumeNext(r07.justFunction(fallback));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> onErrorReturn(@cfb sy6<? super Throwable, ? extends T> itemSupplier) {
        Objects.requireNonNull(itemSupplier, "itemSupplier is null");
        return ofe.onAssembly(new r9a(this, itemSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> onErrorReturnItem(@cfb T item) {
        Objects.requireNonNull(item, "item is null");
        return onErrorReturn(r07.justFunction(item));
    }

    @gpe("none")
    @cfb
    @cy1
    public final r4a<T> onTerminateDetach() {
        return ofe.onAssembly(new a6a(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> repeat() {
        return repeat(Long.MAX_VALUE);
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
    public final r4a<T> retry() {
        return retry(Long.MAX_VALUE, r07.alwaysTrue());
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> retryUntil(@cfb cb1 stop) {
        Objects.requireNonNull(stop, "stop is null");
        return retry(Long.MAX_VALUE, r07.predicateReverseFor(stop));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> retryWhen(@cfb sy6<? super l86<Throwable>, ? extends zjd<?>> handler) {
        return toFlowable().retryWhen(handler).singleElement();
    }

    @gpe("none")
    public final void safeSubscribe(@cfb k9a<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        subscribe(new uke(observer));
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
        return subscribe(r07.emptyConsumer(), r07.f76642f, r07.f76639c);
    }

    public abstract void subscribeActual(@cfb k9a<? super T> observer);

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<T> subscribeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new eaa(this, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <E extends k9a<? super T>> E subscribeWith(E observer) {
        subscribe(observer);
        return observer;
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> switchIfEmpty(@cfb z9a<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new gaa(this, other));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> r4a<T> takeUntil(@cfb z9a<U> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new kaa(this, other));
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
    public final r4a<j1h<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, mpe.computation());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final r4a<T> timeout(long timeout, @cfb TimeUnit unit) {
        return timeout(timeout, unit, mpe.computation());
    }

    @gpe("io.reactivex:computation")
    @cfb
    @cy1
    public final r4a<j1h<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, mpe.computation());
    }

    @gpe("none")
    @cy1
    /* JADX INFO: renamed from: to */
    public final <R> R m21007to(@cfb i5a<T, ? extends R> converter) {
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
        return this instanceof u07 ? ((u07) this).fuseToFlowable() : ofe.onAssembly(new vaa(this));
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
    public final vkb<T> toObservable() {
        return this instanceof y07 ? ((y07) this).fuseToObservable() : ofe.onAssembly(new xaa(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<T> toSingle() {
        return ofe.onAssembly(new bba(this, null));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<T> unsubscribeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new hba(this, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> r4a<R> zipWith(@cfb z9a<? extends U> other, @cfb i11<? super T, ? super U, ? extends R> zipper) {
        Objects.requireNonNull(other, "other is null");
        return zip(this, other, zipper);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatDelayError(@cfb zjd<? extends z9a<? extends T>> sources) {
        return l86.fromPublisher(sources).concatMapMaybeDelayError(r07.identity());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb Iterable<? extends z9a<? extends T>> sources, int maxConcurrency) {
        return l86.fromIterable(sources).concatMapEagerDelayError(yaa.instance(), false, maxConcurrency, 1);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb Iterable<? extends z9a<? extends T>> sources, int maxConcurrency) {
        return l86.fromIterable(sources).concatMapEagerDelayError(yaa.instance(), true, maxConcurrency, 1);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb zjd<? extends z9a<? extends T>> sources) {
        return merge(sources, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb zjd<? extends z9a<? extends T>> sources) {
        return mergeDelayError(sources, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2, @cfb l11<? super T, ? super T> isEqual) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(isEqual, "isEqual is null");
        return ofe.onAssembly(new s6a(source1, source2, isEqual));
    }

    @cy1
    @gpe("custom")
    @cfb
    public static r4a<Long> timer(long delay, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new taa(Math.max(0L, delay), unit, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, D> r4a<T> using(@cfb nfg<? extends D> resourceSupplier, @cfb sy6<? super D, ? extends z9a<? extends T>> sourceSupplier, @cfb uu2<? super D> resourceCleanup, boolean eager) {
        Objects.requireNonNull(resourceSupplier, "resourceSupplier is null");
        Objects.requireNonNull(sourceSupplier, "sourceSupplier is null");
        Objects.requireNonNull(resourceCleanup, "resourceCleanup is null");
        return ofe.onAssembly(new jba(resourceSupplier, sourceSupplier, resourceCleanup, eager));
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb uu2<? super T> onSuccess) {
        blockingSubscribe(onSuccess, r07.f76641e, r07.f76639c);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final r4a<T> delay(long time, @cfb TimeUnit unit, boolean delayError) {
        return delay(time, unit, mpe.computation(), delayError);
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> onErrorComplete(@cfb n8d<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new n9a(this, predicate));
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
    public final r4a<T> retry(@cfb l11<? super Integer, ? super Throwable> predicate) {
        return toFlowable().retry(predicate).singleElement();
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onSuccess) {
        return subscribe(onSuccess, r07.f76642f, r07.f76639c);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<j1h<T>> timeInterval(@cfb woe scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final r4a<T> timeout(long timeout, @cfb TimeUnit unit, @cfb z9a<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout(timeout, unit, mpe.computation(), fallback);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<j1h<T>> timestamp(@cfb woe scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    @cy1
    @gpe("none")
    @cfb
    public final CompletionStage<T> toCompletionStage(@dib T defaultItem) {
        return (CompletionStage) subscribeWith(new qi2(true, defaultItem));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return concatArray(source1, source2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatDelayError(@cfb zjd<? extends z9a<? extends T>> sources, int prefetch) {
        return l86.fromPublisher(sources).concatMapMaybeDelayError(r07.identity(), true, prefetch);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb zjd<? extends z9a<? extends T>> sources) {
        return l86.fromPublisher(sources).concatMapEager(yaa.instance());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb zjd<? extends z9a<? extends T>> sources) {
        return l86.fromPublisher(sources).concatMapEagerDelayError(yaa.instance(), true);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> error(@cfb nfg<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new v6a(supplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> fromFuture(@cfb Future<? extends T> future, long timeout, @cfb TimeUnit unit) {
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(unit, "unit is null");
        return ofe.onAssembly(new d8a(future, timeout, unit));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb zjd<? extends z9a<? extends T>> sources, int maxConcurrency) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        return ofe.onAssembly(new yc6(sources, r07.identity(), false, maxConcurrency));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb zjd<? extends z9a<? extends T>> sources, int maxConcurrency) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        return ofe.onAssembly(new yc6(sources, r07.identity(), true, maxConcurrency));
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb uu2<? super T> onSuccess, @cfb uu2<? super Throwable> onError) {
        blockingSubscribe(onSuccess, onError, r07.f76639c);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<T> delay(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return delay(time, unit, scheduler, false);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final r4a<T> delaySubscription(long time, @cfb TimeUnit unit) {
        return delaySubscription(time, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> r4a<R> flatMap(@cfb sy6<? super T, ? extends z9a<? extends R>> onSuccessMapper, @cfb sy6<? super Throwable, ? extends z9a<? extends R>> onErrorMapper, @cfb nfg<? extends z9a<? extends R>> onCompleteSupplier) {
        Objects.requireNonNull(onSuccessMapper, "onSuccessMapper is null");
        Objects.requireNonNull(onErrorMapper, "onErrorMapper is null");
        Objects.requireNonNull(onCompleteSupplier, "onCompleteSupplier is null");
        return ofe.onAssembly(new k7a(this, onSuccessMapper, onErrorMapper, onCompleteSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> retry(long times) {
        return retry(times, r07.alwaysTrue());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWith(@cfb oof<T> other) {
        Objects.requireNonNull(other, "other is null");
        return l86.concat(kjf.wrap(other).toFlowable(), toFlowable());
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onSuccess, @cfb uu2<? super Throwable> onError) {
        return subscribe(onSuccess, onError, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> switchIfEmpty(@cfb oof<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new iaa(this, other));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <U> r4a<T> takeUntil(@cfb zjd<U> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new maa(this, other));
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
    public final r4a<j1h<T>> timeInterval(@cfb TimeUnit unit) {
        return timeInterval(unit, mpe.computation());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final r4a<j1h<T>> timestamp(@cfb TimeUnit unit) {
        return timestamp(unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb zjd<? extends z9a<? extends T>> sources, int maxConcurrency) {
        return l86.fromPublisher(sources).concatMapEager(yaa.instance(), maxConcurrency, 1);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb zjd<? extends z9a<? extends T>> sources, int maxConcurrency) {
        return l86.fromPublisher(sources).concatMapEagerDelayError(yaa.instance(), true, maxConcurrency, 1);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, R> r4a<R> zip(@cfb z9a<? extends T1> source1, @cfb z9a<? extends T2> source2, @cfb i11<? super T1, ? super T2, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final T blockingGet(@cfb T t) {
        Objects.requireNonNull(t, "defaultValue is null");
        a81 a81Var = new a81();
        subscribe(a81Var);
        return (T) a81Var.blockingGet(t);
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb uu2<? super T> onSuccess, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        a81 a81Var = new a81();
        subscribe(a81Var);
        a81Var.blockingConsume(onSuccess, onError, onComplete);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<T> delay(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new r5a(this, Math.max(0L, time), unit, scheduler, delayError));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<T> delaySubscription(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return delaySubscription(l86.timer(time, unit, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> retry(long times, @cfb n8d<? super Throwable> predicate) {
        return toFlowable().retry(times, predicate).singleElement();
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onSuccess, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        return (lf4) subscribeWith(new y4a(onSuccess, onError, onComplete));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<j1h<T>> timeInterval(@cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new naa(this, unit, scheduler, true));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<T> timeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler, @cfb z9a<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout(timer(timeout, unit, scheduler), fallback);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<j1h<T>> timestamp(@cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new naa(this, unit, scheduler, false));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> retry(@cfb n8d<? super Throwable> predicate) {
        return retry(Long.MAX_VALUE, predicate);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWith(@cfb z9a<T> other) {
        Objects.requireNonNull(other, "other is null");
        return l86.concat(wrap(other).toFlowable(), toFlowable());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2, @cfb z9a<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return concatArray(source1, source2, source3);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> r4a<T> merge(@cfb z9a<? extends z9a<? extends T>> source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new t7a(source, r07.identity()));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return mergeArrayDelayError(source1, source2);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final r4a<T> timeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return timeout(timer(timeout, unit, scheduler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <U> r4a<T> delay(@cfb zjd<U> delayIndicator) {
        Objects.requireNonNull(delayIndicator, "delayIndicator is null");
        return ofe.onAssembly(new t5a(this, delayIndicator));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> r4a<R> flatMap(@cfb sy6<? super T, ? extends z9a<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return ofe.onAssembly(new c7a(this, mapper, combiner));
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
    @cfb
    public final <U> r4a<T> timeout(@cfb z9a<U> timeoutIndicator) {
        Objects.requireNonNull(timeoutIndicator, "timeoutIndicator is null");
        return ofe.onAssembly(new paa(this, timeoutIndicator, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return mergeArray(source1, source2);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, R> r4a<R> zip(@cfb z9a<? extends T1> source1, @cfb z9a<? extends T2> source2, @cfb z9a<? extends T3> source3, @cfb jz6<? super T1, ? super T2, ? super T3, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2, source3);
    }

    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onSuccess, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete, @cfb sf4 container) {
        Objects.requireNonNull(onSuccess, "onSuccess is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        Objects.requireNonNull(container, "container is null");
        nf4 nf4Var = new nf4(container, onSuccess, onError, onComplete);
        container.add(nf4Var);
        subscribe(nf4Var);
        return nf4Var;
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2, @cfb z9a<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return mergeArrayDelayError(source1, source2, source3);
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
    @gpe("none")
    @cfb
    public final <U> r4a<T> timeout(@cfb z9a<U> timeoutIndicator, @cfb z9a<? extends T> fallback) {
        Objects.requireNonNull(timeoutIndicator, "timeoutIndicator is null");
        Objects.requireNonNull(fallback, "fallback is null");
        return ofe.onAssembly(new paa(this, timeoutIndicator, fallback));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2, @cfb z9a<? extends T> source3, @cfb z9a<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return concatArray(source1, source2, source3, source4);
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb k9a<? super T> observer) {
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
    public static <T> l86<T> merge(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2, @cfb z9a<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return mergeArray(source1, source2, source3);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <U> r4a<T> timeout(@cfb zjd<U> timeoutIndicator) {
        Objects.requireNonNull(timeoutIndicator, "timeoutIndicator is null");
        return ofe.onAssembly(new raa(this, timeoutIndicator, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2, @cfb z9a<? extends T> source3, @cfb z9a<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return mergeArrayDelayError(source1, source2, source3, source4);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, R> r4a<R> zip(@cfb z9a<? extends T1> source1, @cfb z9a<? extends T2> source2, @cfb z9a<? extends T3> source3, @cfb z9a<? extends T4> source4, @cfb nz6<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), source1, source2, source3, source4);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <U> r4a<T> timeout(@cfb zjd<U> timeoutIndicator, @cfb z9a<? extends T> fallback) {
        Objects.requireNonNull(timeoutIndicator, "timeoutIndicator is null");
        Objects.requireNonNull(fallback, "fallback is null");
        return ofe.onAssembly(new raa(this, timeoutIndicator, fallback));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb zjd<? extends z9a<? extends T>> sources) {
        return concat(sources, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb z9a<? extends T> source1, @cfb z9a<? extends T> source2, @cfb z9a<? extends T> source3, @cfb z9a<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return mergeArray(source1, source2, source3, source4);
    }

    @Override // p000.z9a
    @gpe("none")
    public final void subscribe(@cfb k9a<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        k9a<? super T> k9aVarOnSubscribe = ofe.onSubscribe(this, observer);
        Objects.requireNonNull(k9aVarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(k9aVarOnSubscribe);
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
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb zjd<? extends z9a<? extends T>> sources, int prefetch) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ga6(sources, r07.identity(), e55.IMMEDIATE, prefetch));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, R> r4a<R> zip(@cfb z9a<? extends T1> source1, @cfb z9a<? extends T2> source2, @cfb z9a<? extends T3> source3, @cfb z9a<? extends T4> source4, @cfb z9a<? extends T5> source5, @cfb qz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> zipper) {
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
    public static <T1, T2, T3, T4, T5, T6, R> r4a<R> zip(@cfb z9a<? extends T1> source1, @cfb z9a<? extends T2> source2, @cfb z9a<? extends T3> source3, @cfb z9a<? extends T4> source4, @cfb z9a<? extends T5> source5, @cfb z9a<? extends T6> source6, @cfb tz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> zipper) {
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
    public static <T1, T2, T3, T4, T5, T6, T7, R> r4a<R> zip(@cfb z9a<? extends T1> source1, @cfb z9a<? extends T2> source2, @cfb z9a<? extends T3> source3, @cfb z9a<? extends T4> source4, @cfb z9a<? extends T5> source5, @cfb z9a<? extends T6> source6, @cfb z9a<? extends T7> source7, @cfb wz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> zipper) {
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
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> r4a<R> zip(@cfb z9a<? extends T1> source1, @cfb z9a<? extends T2> source2, @cfb z9a<? extends T3> source3, @cfb z9a<? extends T4> source4, @cfb z9a<? extends T5> source5, @cfb z9a<? extends T6> source6, @cfb z9a<? extends T7> source7, @cfb z9a<? extends T8> source8, @cfb zz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> zipper) {
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
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> r4a<R> zip(@cfb z9a<? extends T1> source1, @cfb z9a<? extends T2> source2, @cfb z9a<? extends T3> source3, @cfb z9a<? extends T4> source4, @cfb z9a<? extends T5> source5, @cfb z9a<? extends T6> source6, @cfb z9a<? extends T7> source7, @cfb z9a<? extends T8> source8, @cfb z9a<? extends T9> source9, @cfb c07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> zipper) {
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
