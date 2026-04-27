package p000;

import com.google.android.material.timepicker.RadialViewGroup;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.Spliterators;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vkb<T> implements wub<T> {

    /* JADX INFO: renamed from: vkb$a */
    public static /* synthetic */ class C14144a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f91526a;

        static {
            int[] iArr = new int[xo0.values().length];
            f91526a = iArr;
            try {
                iArr[xo0.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91526a[xo0.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91526a[xo0.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91526a[xo0.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> amb(@cfb Iterable<? extends wub<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new blb(null, sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> ambArray(@cfb wub<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        int length = sources.length;
        return length == 0 ? empty() : length == 1 ? wrap(sources[0]) : ofe.onAssembly(new blb(sources, null));
    }

    @cy1
    public static int bufferSize() {
        return l86.bufferSize();
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> vkb<R> combineLatest(@cfb Iterable<? extends wub<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> combiner) {
        return combineLatest(sources, combiner, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> vkb<R> combineLatestArray(@cfb wub<? extends T>[] sources, @cfb sy6<? super Object[], ? extends R> combiner) {
        return combineLatestArray(sources, combiner, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> vkb<R> combineLatestArrayDelayError(@cfb wub<? extends T>[] sources, @cfb sy6<? super Object[], ? extends R> combiner) {
        return combineLatestArrayDelayError(sources, combiner, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> vkb<R> combineLatestDelayError(@cfb Iterable<? extends wub<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> combiner) {
        return combineLatestDelayError(sources, combiner, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concat(@cfb Iterable<? extends wub<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return fromIterable(sources).concatMapDelayError(r07.identity(), false, bufferSize());
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> concatArray(@cfb wub<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? empty() : sources.length == 1 ? wrap(sources[0]) : ofe.onAssembly(new gmb(fromArray(sources), r07.identity(), bufferSize(), e55.BOUNDARY));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> concatArrayDelayError(@cfb wub<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? empty() : sources.length == 1 ? wrap(sources[0]) : concatDelayError(fromArray(sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> concatArrayEager(@cfb wub<? extends T>... sources) {
        return concatArrayEager(bufferSize(), bufferSize(), sources);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> concatArrayEagerDelayError(@cfb wub<? extends T>... sources) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), sources);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatDelayError(@cfb Iterable<? extends wub<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return concatDelayError(fromIterable(sources));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatEager(@cfb Iterable<? extends wub<? extends T>> sources) {
        return concatEager(sources, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatEagerDelayError(@cfb Iterable<? extends wub<? extends T>> sources) {
        return concatEagerDelayError(sources, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> create(@cfb csb<T> source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new enb(source));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> defer(@cfb nfg<? extends wub<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new jnb(supplier));
    }

    @cy1
    @gpe("none")
    @cfb
    private vkb<T> doOnEach(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete, @cfb InterfaceC7776j8 onAfterTerminate) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        return ofe.onAssembly(new cob(this, onNext, onError, onComplete, onAfterTerminate));
    }

    @gpe("none")
    @cfb
    @cy1
    public static <T> vkb<T> empty() {
        return ofe.onAssembly(nob.f65139a);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> error(@cfb nfg<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new pob(supplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromAction(@cfb InterfaceC7776j8 action) {
        Objects.requireNonNull(action, "action is null");
        return ofe.onAssembly(new ipb(action));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> fromArray(@cfb T... items) {
        Objects.requireNonNull(items, "items is null");
        return items.length == 0 ? empty() : items.length == 1 ? just(items[0]) : ofe.onAssembly(new kpb(items));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromCallable(@cfb Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return ofe.onAssembly(new lpb(callable));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromCompletable(@cfb ph2 completableSource) {
        Objects.requireNonNull(completableSource, "completableSource is null");
        return ofe.onAssembly(new npb(completableSource));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromCompletionStage(@cfb CompletionStage<T> stage) {
        Objects.requireNonNull(stage, "stage is null");
        return ofe.onAssembly(new opb(stage));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromFuture(@cfb Future<? extends T> future) {
        Objects.requireNonNull(future, "future is null");
        return ofe.onAssembly(new ppb(future, 0L, null));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromIterable(@cfb Iterable<? extends T> source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new spb(source));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromMaybe(@cfb z9a<T> maybe) {
        Objects.requireNonNull(maybe, "maybe is null");
        return ofe.onAssembly(new xaa(maybe));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromOptional(@cfb Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (vkb) optional.map(new Function() { // from class: rkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return vkb.just(obj);
            }
        }).orElseGet(new Supplier() { // from class: skb
            @Override // java.util.function.Supplier
            public final Object get() {
                return vkb.empty();
            }
        });
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public static <T> vkb<T> fromPublisher(@cfb zjd<? extends T> publisher) {
        Objects.requireNonNull(publisher, "publisher is null");
        return ofe.onAssembly(new upb(publisher));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromRunnable(@cfb Runnable run) {
        Objects.requireNonNull(run, "run is null");
        return ofe.onAssembly(new vpb(run));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromSingle(@cfb oof<T> source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new epf(source));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromStream(@cfb Stream<T> stream) {
        Objects.requireNonNull(stream, "stream is null");
        return ofe.onAssembly(new wpb(stream));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromSupplier(@cfb nfg<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new xpb(supplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> generate(@cfb uu2<qy4<T>> generator) {
        Objects.requireNonNull(generator, "generator is null");
        return generate(r07.nullSupplier(), nqb.simpleGenerator(generator), r07.emptyConsumer());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public static vkb<Long> interval(long initialDelay, long period, @cfb TimeUnit unit) {
        return interval(initialDelay, period, unit, mpe.computation());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public static vkb<Long> intervalRange(long start, long count, long initialDelay, long period, @cfb TimeUnit unit) {
        return intervalRange(start, count, initialDelay, period, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> just(@cfb T item) {
        Objects.requireNonNull(item, "item is null");
        return ofe.onAssembly(new uqb(item));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> merge(@cfb Iterable<? extends wub<? extends T>> sources, int maxConcurrency, int bufferSize) {
        return fromIterable(sources).flatMap(r07.identity(), false, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> mergeArray(int maxConcurrency, int bufferSize, @cfb wub<? extends T>... sources) {
        return fromArray(sources).flatMap(r07.identity(), false, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> mergeArrayDelayError(int maxConcurrency, int bufferSize, @cfb wub<? extends T>... sources) {
        return fromArray(sources).flatMap(r07.identity(), true, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> mergeDelayError(@cfb Iterable<? extends wub<? extends T>> sources) {
        return fromIterable(sources).flatMap(r07.identity(), true);
    }

    @gpe("none")
    @cfb
    @cy1
    public static <T> vkb<T> never() {
        return ofe.onAssembly(trb.f85674a);
    }

    @cy1
    @gpe("none")
    @cfb
    public static vkb<Integer> range(int start, int count) {
        if (count < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + count);
        }
        if (count == 0) {
            return empty();
        }
        if (count == 1) {
            return just(Integer.valueOf(start));
        }
        if (((long) start) + ((long) (count - 1)) <= 2147483647L) {
            return ofe.onAssembly(new qsb(start, count));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @cy1
    @gpe("none")
    @cfb
    public static vkb<Long> rangeLong(long start, long count) {
        if (count < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + count);
        }
        if (count == 0) {
            return empty();
        }
        if (count == 1) {
            return just(Long.valueOf(start));
        }
        long j = (count - 1) + start;
        if (start <= 0 || j >= 0) {
            return ofe.onAssembly(new ssb(start, count));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2) {
        return sequenceEqual(source1, source2, yjb.equalsPredicate(), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> switchOnNext(@cfb wub<? extends wub<? extends T>> sources, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new evb(sources, r07.identity(), bufferSize, false));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> switchOnNextDelayError(@cfb wub<? extends wub<? extends T>> sources) {
        return switchOnNextDelayError(sources, bufferSize());
    }

    @cfb
    private vkb<T> timeout0(long timeout, @cfb TimeUnit unit, @dib wub<? extends T> fallback, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new iwb(this, timeout, unit, scheduler, fallback));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public static vkb<Long> timer(long delay, @cfb TimeUnit unit) {
        return timer(delay, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> unsafeCreate(@cfb wub<T> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        if (onSubscribe instanceof vkb) {
            throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
        }
        return ofe.onAssembly(new ypb(onSubscribe));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, D> vkb<T> using(@cfb nfg<? extends D> resourceSupplier, @cfb sy6<? super D, ? extends wub<? extends T>> sourceSupplier, @cfb uu2<? super D> resourceCleanup) {
        return using(resourceSupplier, sourceSupplier, resourceCleanup, true);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> wrap(@cfb wub<T> source) {
        Objects.requireNonNull(source, "source is null");
        return source instanceof vkb ? ofe.onAssembly((vkb) source) : ofe.onAssembly(new ypb(source));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> vkb<R> zip(@cfb Iterable<? extends wub<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> zipper) {
        Objects.requireNonNull(zipper, "zipper is null");
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new lxb(null, sources, zipper, bufferSize(), false));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T, R> vkb<R> zipArray(@cfb sy6<? super Object[], ? extends R> zipper, boolean delayError, int bufferSize, @cfb wub<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return empty();
        }
        Objects.requireNonNull(zipper, "zipper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new lxb(sources, null, zipper, bufferSize, delayError));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<Boolean> all(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new zkb(this, predicate));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> ambWith(@cfb wub<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ambArray(this, other);
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<Boolean> any(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new flb(this, predicate));
    }

    @gpe("none")
    @cfb
    @cy1
    public final T blockingFirst() {
        g71 g71Var = new g71();
        subscribe(g71Var);
        T tBlockingGet = g71Var.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @gpe("none")
    public final void blockingForEach(@cfb uu2<? super T> onNext) {
        blockingForEach(onNext, bufferSize());
    }

    @gpe("none")
    @cfb
    @cy1
    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    @gpe("none")
    @cfb
    @cy1
    public final T blockingLast() {
        w71 w71Var = new w71();
        subscribe(w71Var);
        T tBlockingGet = w71Var.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @gpe("none")
    @cfb
    @cy1
    public final Iterable<T> blockingLatest() {
        return new f81(this);
    }

    @cy1
    @gpe("none")
    @cfb
    public final Iterable<T> blockingMostRecent(@cfb T initialItem) {
        Objects.requireNonNull(initialItem, "initialItem is null");
        return new h81(this, initialItem);
    }

    @gpe("none")
    @cfb
    @cy1
    public final Iterable<T> blockingNext() {
        return new j81(this);
    }

    @gpe("none")
    @cfb
    @cy1
    public final T blockingSingle() {
        T tBlockingGet = singleElement().blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @gpe("none")
    @cfb
    @cy1
    public final Stream<T> blockingStream() {
        return blockingStream(bufferSize());
    }

    @gpe("none")
    public final void blockingSubscribe() {
        klb.subscribe(this);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<List<T>> buffer(int count) {
        return buffer(count, count);
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> cacheWithInitialCapacity(int initialCapacity) {
        yjb.verifyPositive(initialCapacity, "initialCapacity");
        return ofe.onAssembly(new wlb(this, initialCapacity));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<U> cast(@cfb Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (vkb<U>) map(r07.castFunction(cls));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> kjf<U> collect(@cfb nfg<? extends U> initialItemSupplier, @cfb e11<? super U, ? super T> collector) {
        Objects.requireNonNull(initialItemSupplier, "initialItemSupplier is null");
        Objects.requireNonNull(collector, "collector is null");
        return ofe.onAssembly(new amb(this, initialItemSupplier, collector));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> kjf<U> collectInto(@cfb U initialItem, @cfb e11<? super U, ? super T> collector) {
        Objects.requireNonNull(initialItem, "initialItem is null");
        return collect(r07.justSupplier(initialItem), collector);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> compose(@cfb pwb<? super T, ? extends R> composer) {
        Objects.requireNonNull(composer, "composer is null");
        return wrap(composer.apply2(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMap(@cfb sy6<? super T, ? extends wub<? extends R>> mapper) {
        return concatMap(mapper, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 concatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper) {
        return concatMapCompletable(mapper, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 concatMapCompletableDelayError(@cfb sy6<? super T, ? extends ph2> mapper) {
        return concatMapCompletableDelayError(mapper, true, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapDelayError(@cfb sy6<? super T, ? extends wub<? extends R>> mapper) {
        return concatMapDelayError(mapper, true, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapEager(@cfb sy6<? super T, ? extends wub<? extends R>> mapper) {
        return concatMapEager(mapper, Integer.MAX_VALUE, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapEagerDelayError(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, boolean tillTheEnd) {
        return concatMapEagerDelayError(mapper, tillTheEnd, Integer.MAX_VALUE, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<U> concatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new hpb(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        return concatMapMaybe(mapper, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapMaybeDelayError(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        return concatMapMaybeDelayError(mapper, true, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        return concatMapSingle(mapper, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapSingleDelayError(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        return concatMapSingleDelayError(mapper, true, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapStream(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper) {
        return flatMapStream(mapper);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> concatWith(@cfb wub<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return concat(this, other);
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<Boolean> contains(@cfb Object item) {
        Objects.requireNonNull(item, "item is null");
        return any(r07.equalsWith(item));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<Long> count() {
        return ofe.onAssembly(new cnb(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<T> debounce(@cfb sy6<? super T, ? extends wub<U>> debounceIndicator) {
        Objects.requireNonNull(debounceIndicator, "debounceIndicator is null");
        return ofe.onAssembly(new gnb(this, debounceIndicator));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> defaultIfEmpty(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        return switchIfEmpty(just(defaultItem));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<T> delay(@cfb sy6<? super T, ? extends wub<U>> sy6Var) {
        Objects.requireNonNull(sy6Var, "itemDelayIndicator is null");
        return (vkb<T>) flatMap(nqb.itemDelay(sy6Var));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<T> delaySubscription(@cfb wub<U> subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return ofe.onAssembly(new onb(this, subscriptionIndicator));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> dematerialize(@cfb sy6<? super T, jgb<R>> selector) {
        Objects.requireNonNull(selector, "selector is null");
        return ofe.onAssembly(new qnb(this, selector));
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> distinct() {
        return distinct(r07.identity(), r07.createHashSet());
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> distinctUntilChanged() {
        return distinctUntilChanged(r07.identity());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doAfterNext(@cfb uu2<? super T> onAfterNext) {
        Objects.requireNonNull(onAfterNext, "onAfterNext is null");
        return ofe.onAssembly(new ynb(this, onAfterNext));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doAfterTerminate(@cfb InterfaceC7776j8 onAfterTerminate) {
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        return doOnEach(r07.emptyConsumer(), r07.emptyConsumer(), r07.f76639c, onAfterTerminate);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doFinally(@cfb InterfaceC7776j8 onFinally) {
        Objects.requireNonNull(onFinally, "onFinally is null");
        return ofe.onAssembly(new aob(this, onFinally));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doOnComplete(@cfb InterfaceC7776j8 onComplete) {
        return doOnEach(r07.emptyConsumer(), r07.emptyConsumer(), onComplete, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doOnDispose(@cfb InterfaceC7776j8 onDispose) {
        return doOnLifecycle(r07.emptyConsumer(), onDispose);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doOnError(@cfb uu2<? super Throwable> onError) {
        uu2<? super T> uu2VarEmptyConsumer = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnEach(uu2VarEmptyConsumer, onError, interfaceC7776j8, interfaceC7776j8);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doOnLifecycle(@cfb uu2<? super lf4> onSubscribe, @cfb InterfaceC7776j8 onDispose) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        Objects.requireNonNull(onDispose, "onDispose is null");
        return ofe.onAssembly(new dob(this, onSubscribe, onDispose));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doOnNext(@cfb uu2<? super T> onNext) {
        uu2<? super Throwable> uu2VarEmptyConsumer = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnEach(onNext, uu2VarEmptyConsumer, interfaceC7776j8, interfaceC7776j8);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doOnSubscribe(@cfb uu2<? super lf4> onSubscribe) {
        return doOnLifecycle(onSubscribe, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doOnTerminate(@cfb InterfaceC7776j8 onTerminate) {
        Objects.requireNonNull(onTerminate, "onTerminate is null");
        return doOnEach(r07.emptyConsumer(), r07.actionConsumer(onTerminate), onTerminate, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> elementAt(long index) {
        if (index >= 0) {
            return ofe.onAssembly(new iob(this, index));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + index);
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> elementAtOrError(long index) {
        if (index >= 0) {
            return ofe.onAssembly(new kob(this, index, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + index);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> filter(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new tob(this, predicate));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> first(@cfb T defaultItem) {
        return elementAt(0L, defaultItem);
    }

    @gpe("none")
    @cfb
    @cy1
    public final r4a<T> firstElement() {
        return elementAt(0L);
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<T> firstOrError() {
        return elementAtOrError(0L);
    }

    @gpe("none")
    @cfb
    @cy1
    public final CompletionStage<T> firstOrErrorStage() {
        return (CompletionStage) subscribeWith(new uob(false, null));
    }

    @cy1
    @gpe("none")
    @cfb
    public final CompletionStage<T> firstStage(@dib T defaultItem) {
        return (CompletionStage) subscribeWith(new uob(true, defaultItem));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends R>> mapper) {
        return flatMap((sy6) mapper, false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 flatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper) {
        return flatMapCompletable(mapper, false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<U> flatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new hpb(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        return flatMapMaybe(mapper, false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        return flatMapSingle(mapper, false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMapStream(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new fpb(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 forEach(@cfb uu2<? super T> onNext) {
        return subscribe(onNext);
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 forEachWhile(@cfb n8d<? super T> onNext) {
        return forEachWhile(onNext, r07.f76642f, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K> vkb<ub7<K, T>> groupBy(@cfb sy6<? super T, ? extends K> sy6Var) {
        return (vkb<ub7<K, T>>) groupBy(sy6Var, r07.identity(), false, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <TRight, TLeftEnd, TRightEnd, R> vkb<R> groupJoin(@cfb wub<? extends TRight> other, @cfb sy6<? super T, ? extends wub<TLeftEnd>> leftEnd, @cfb sy6<? super TRight, ? extends wub<TRightEnd>> rightEnd, @cfb i11<? super T, ? super vkb<TRight>, ? extends R> resultSelector) {
        Objects.requireNonNull(other, "other is null");
        Objects.requireNonNull(leftEnd, "leftEnd is null");
        Objects.requireNonNull(rightEnd, "rightEnd is null");
        Objects.requireNonNull(resultSelector, "resultSelector is null");
        return ofe.onAssembly(new fqb(this, other, leftEnd, rightEnd, resultSelector));
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> hide() {
        return ofe.onAssembly(new hqb(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final xd2 ignoreElements() {
        return ofe.onAssembly(new lqb(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<Boolean> isEmpty() {
        return all(r07.alwaysFalse());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <TRight, TLeftEnd, TRightEnd, R> vkb<R> join(@cfb wub<? extends TRight> other, @cfb sy6<? super T, ? extends wub<TLeftEnd>> leftEnd, @cfb sy6<? super TRight, ? extends wub<TRightEnd>> rightEnd, @cfb i11<? super T, ? super TRight, ? extends R> resultSelector) {
        Objects.requireNonNull(other, "other is null");
        Objects.requireNonNull(leftEnd, "leftEnd is null");
        Objects.requireNonNull(rightEnd, "rightEnd is null");
        Objects.requireNonNull(resultSelector, "resultSelector is null");
        return ofe.onAssembly(new tqb(this, other, leftEnd, rightEnd, resultSelector));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> last(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        return ofe.onAssembly(new zqb(this, defaultItem));
    }

    @gpe("none")
    @cfb
    @cy1
    public final r4a<T> lastElement() {
        return ofe.onAssembly(new xqb(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<T> lastOrError() {
        return ofe.onAssembly(new zqb(this, null));
    }

    @gpe("none")
    @cfb
    @cy1
    public final CompletionStage<T> lastOrErrorStage() {
        return (CompletionStage) subscribeWith(new arb(false, null));
    }

    @cy1
    @gpe("none")
    @cfb
    public final CompletionStage<T> lastStage(@dib T defaultItem) {
        return (CompletionStage) subscribeWith(new arb(true, defaultItem));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> lift(@cfb esb<? extends R, ? super T> lifter) {
        Objects.requireNonNull(lifter, "lifter is null");
        return ofe.onAssembly(new brb(this, lifter));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> map(@cfb sy6<? super T, ? extends R> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new hrb(this, mapper));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> mapOptional(@cfb sy6<? super T, Optional<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new krb(this, mapper));
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<jgb<T>> materialize() {
        return ofe.onAssembly(new mrb(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> mergeWith(@cfb wub<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return merge(this, other);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> observeOn(@cfb woe scheduler) {
        return observeOn(scheduler, false, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<U> ofType(@cfb Class<U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return filter(r07.isInstanceOf(clazz)).cast(clazz);
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> onErrorComplete() {
        return onErrorComplete(r07.alwaysTrue());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> onErrorResumeNext(@cfb sy6<? super Throwable, ? extends wub<? extends T>> fallbackSupplier) {
        Objects.requireNonNull(fallbackSupplier, "fallbackSupplier is null");
        return ofe.onAssembly(new zrb(this, fallbackSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> onErrorResumeWith(@cfb wub<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return onErrorResumeNext(r07.justFunction(fallback));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> onErrorReturn(@cfb sy6<? super Throwable, ? extends T> itemSupplier) {
        Objects.requireNonNull(itemSupplier, "itemSupplier is null");
        return ofe.onAssembly(new bsb(this, itemSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> onErrorReturnItem(@cfb T item) {
        Objects.requireNonNull(item, "item is null");
        return onErrorReturn(r07.justFunction(item));
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> onTerminateDetach() {
        return ofe.onAssembly(new snb(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final or2<T> publish() {
        return ofe.onAssembly((or2) new isb(this));
    }

    @cy1
    @gpe("none")
    @cfb
    public final r4a<T> reduce(@cfb i11<T, T, T> reducer) {
        Objects.requireNonNull(reducer, "reducer is null");
        return ofe.onAssembly(new usb(this, reducer));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> kjf<R> reduceWith(@cfb nfg<R> seedSupplier, @cfb i11<R, ? super T, R> reducer) {
        Objects.requireNonNull(seedSupplier, "seedSupplier is null");
        Objects.requireNonNull(reducer, "reducer is null");
        return ofe.onAssembly(new xsb(this, seedSupplier, reducer));
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> repeatUntil(@cfb cb1 stop) {
        Objects.requireNonNull(stop, "stop is null");
        return ofe.onAssembly(new ftb(this, stop));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> repeatWhen(@cfb sy6<? super vkb<Object>, ? extends wub<?>> handler) {
        Objects.requireNonNull(handler, "handler is null");
        return ofe.onAssembly(new htb(this, handler));
    }

    @gpe("none")
    @cfb
    @cy1
    public final or2<T> replay() {
        return jtb.createFrom(this);
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> retry() {
        return retry(Long.MAX_VALUE, r07.alwaysTrue());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> retryUntil(@cfb cb1 stop) {
        Objects.requireNonNull(stop, "stop is null");
        return retry(Long.MAX_VALUE, r07.predicateReverseFor(stop));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> retryWhen(@cfb sy6<? super vkb<Throwable>, ? extends wub<?>> handler) {
        Objects.requireNonNull(handler, "handler is null");
        return ofe.onAssembly(new ptb(this, handler));
    }

    @gpe("none")
    public final void safeSubscribe(@cfb pxb<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        if (observer instanceof vke) {
            subscribe(observer);
        } else {
            subscribe(new vke(observer));
        }
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> sample(long period, @cfb TimeUnit unit) {
        return sample(period, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> scan(@cfb i11<T, T, T> accumulator) {
        Objects.requireNonNull(accumulator, "accumulator is null");
        return ofe.onAssembly(new xtb(this, accumulator));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> scanWith(@cfb nfg<R> seedSupplier, @cfb i11<R, ? super T, R> accumulator) {
        Objects.requireNonNull(seedSupplier, "seedSupplier is null");
        Objects.requireNonNull(accumulator, "accumulator is null");
        return ofe.onAssembly(new ztb(this, seedSupplier, accumulator));
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> serialize() {
        return ofe.onAssembly(new fub(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> share() {
        return publish().refCount();
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> single(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        return ofe.onAssembly(new kub(this, defaultItem));
    }

    @gpe("none")
    @cfb
    @cy1
    public final r4a<T> singleElement() {
        return ofe.onAssembly(new iub(this));
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<T> singleOrError() {
        return ofe.onAssembly(new kub(this, null));
    }

    @gpe("none")
    @cfb
    @cy1
    public final CompletionStage<T> singleOrErrorStage() {
        return (CompletionStage) subscribeWith(new lub(false, null));
    }

    @cy1
    @gpe("none")
    @cfb
    public final CompletionStage<T> singleStage(@dib T defaultItem) {
        return (CompletionStage) subscribeWith(new lub(true, defaultItem));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> skip(long count) {
        if (count >= 0) {
            return count == 0 ? ofe.onAssembly(this) : ofe.onAssembly(new nub(this, count));
        }
        throw new IllegalArgumentException("count >= 0 expected but it was " + count);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> skipLast(int count) {
        if (count >= 0) {
            return count == 0 ? ofe.onAssembly(this) : ofe.onAssembly(new pub(this, count));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + count);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<T> skipUntil(@cfb wub<U> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new tub(this, other));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> skipWhile(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new vub(this, predicate));
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<T> sorted() {
        return toList().toObservable().map(r07.listSorter(r07.naturalComparator())).flatMapIterable(r07.identity());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> startWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return concat(xd2.wrap(other).toObservable(), this);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public final vkb<T> startWithArray(@cfb T... items) {
        vkb vkbVarFromArray = fromArray(items);
        return vkbVarFromArray == empty() ? ofe.onAssembly(this) : concatArray(vkbVarFromArray, this);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> startWithItem(@cfb T item) {
        return concatArray(just(item), this);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> startWithIterable(@cfb Iterable<? extends T> items) {
        return concatArray(fromIterable(items), this);
    }

    @gpe("none")
    @cfb
    public final lf4 subscribe() {
        return subscribe(r07.emptyConsumer(), r07.f76642f, r07.f76639c);
    }

    public abstract void subscribeActual(@cfb pxb<? super T> observer);

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> subscribeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new avb(this, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <E extends pxb<? super T>> E subscribeWith(E observer) {
        subscribe(observer);
        return observer;
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> switchIfEmpty(@cfb wub<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new cvb(this, other));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> switchMap(@cfb sy6<? super T, ? extends wub<? extends R>> mapper) {
        return switchMap(mapper, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 switchMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new gvb(this, mapper, false));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 switchMapCompletableDelayError(@cfb sy6<? super T, ? extends ph2> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new gvb(this, mapper, true));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> switchMapDelayError(@cfb sy6<? super T, ? extends wub<? extends R>> mapper) {
        return switchMapDelayError(mapper, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> switchMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new ivb(this, mapper, false));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> switchMapMaybeDelayError(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new ivb(this, mapper, true));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> switchMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new kvb(this, mapper, false));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> switchMapSingleDelayError(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new kvb(this, mapper, true));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> take(long count) {
        if (count >= 0) {
            return ofe.onAssembly(new mvb(this, count));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + count);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> takeLast(int count) {
        if (count >= 0) {
            return count == 0 ? ofe.onAssembly(new jqb(this)) : count == 1 ? ofe.onAssembly(new qvb(this)) : ofe.onAssembly(new ovb(this, count));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + count);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<T> takeUntil(@cfb wub<U> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new uvb(this, other));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> takeWhile(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new yvb(this, predicate));
    }

    @gpe("none")
    @cfb
    @cy1
    public final cpg<T> test() {
        cpg<T> cpgVar = new cpg<>();
        subscribe(cpgVar);
        return cpgVar;
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> throttleFirst(long windowDuration, @cfb TimeUnit unit) {
        return throttleFirst(windowDuration, unit, mpe.computation());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> throttleLast(long intervalDuration, @cfb TimeUnit unit) {
        return sample(intervalDuration, unit);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> throttleLatest(long timeout, @cfb TimeUnit unit) {
        return throttleLatest(timeout, unit, mpe.computation(), false);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> throttleWithTimeout(long timeout, @cfb TimeUnit unit) {
        return debounce(timeout, unit);
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<j1h<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <V> vkb<T> timeout(@cfb sy6<? super T, ? extends wub<V>> itemTimeoutIndicator) {
        return timeout0(null, itemTimeoutIndicator, null);
    }

    @gpe("none")
    @cfb
    @cy1
    public final vkb<j1h<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    /* JADX INFO: renamed from: to */
    public final <R> R m24047to(@cfb xmb<T, ? extends R> converter) {
        Objects.requireNonNull(converter, "converter is null");
        return converter.apply(this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final l86<T> toFlowable(@cfb xo0 strategy) {
        Objects.requireNonNull(strategy, "strategy is null");
        sd6 sd6Var = new sd6(this);
        int i = C14144a.f91526a[strategy.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? sd6Var.onBackpressureBuffer() : ofe.onAssembly(new cg6(sd6Var)) : sd6Var : sd6Var.onBackpressureLatest() : sd6Var.onBackpressureDrop();
    }

    @gpe("none")
    @cfb
    @cy1
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new n17());
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<List<T>> toList() {
        return toList(16);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K> kjf<Map<K, T>> toMap(@cfb sy6<? super T, ? extends K> sy6Var) {
        Objects.requireNonNull(sy6Var, "keySelector is null");
        return (kjf<Map<K, T>>) collect(oh7.asSupplier(), r07.toMapKeySelector(sy6Var));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K> kjf<Map<K, Collection<T>>> toMultimap(@cfb sy6<? super T, ? extends K> sy6Var) {
        return (kjf<Map<K, Collection<T>>>) toMultimap(sy6Var, r07.identity(), oh7.asSupplier(), u60.asFunction());
    }

    @gpe("none")
    @cfb
    @cy1
    public final kjf<List<T>> toSortedList() {
        return toSortedList(r07.naturalComparator());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> unsubscribeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new swb(this, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<vkb<T>> window(long count) {
        return window(count, count, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> vkb<R> withLatestFrom(@cfb wub<? extends U> other, @cfb i11<? super T, ? super U, ? extends R> combiner) {
        Objects.requireNonNull(other, "other is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return ofe.onAssembly(new hxb(this, combiner, other));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> vkb<R> zipWith(@cfb Iterable<U> other, @cfb i11<? super T, ? super U, ? extends R> zipper) {
        Objects.requireNonNull(other, "other is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return ofe.onAssembly(new nxb(this, other, zipper));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> vkb<R> combineLatest(@cfb Iterable<? extends wub<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> combiner, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        Objects.requireNonNull(combiner, "combiner is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new emb(null, sources, combiner, bufferSize << 1, false));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> vkb<R> combineLatestArray(@cfb wub<? extends T>[] sources, @cfb sy6<? super Object[], ? extends R> combiner, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return empty();
        }
        Objects.requireNonNull(combiner, "combiner is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new emb(sources, null, combiner, bufferSize << 1, false));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> vkb<R> combineLatestArrayDelayError(@cfb wub<? extends T>[] sources, @cfb sy6<? super Object[], ? extends R> combiner, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        Objects.requireNonNull(combiner, "combiner is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return sources.length == 0 ? empty() : ofe.onAssembly(new emb(sources, null, combiner, bufferSize << 1, true));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> vkb<R> combineLatestDelayError(@cfb Iterable<? extends wub<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> combiner, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        Objects.requireNonNull(combiner, "combiner is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new emb(null, sources, combiner, bufferSize << 1, true));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> concatArrayEager(int maxConcurrency, int bufferSize, @cfb wub<? extends T>... sources) {
        return fromArray(sources).concatMapEagerDelayError(r07.identity(), false, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> concatArrayEagerDelayError(int maxConcurrency, int bufferSize, @cfb wub<? extends T>... sources) {
        return fromArray(sources).concatMapEagerDelayError(r07.identity(), true, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatEager(@cfb Iterable<? extends wub<? extends T>> sources, int maxConcurrency, int bufferSize) {
        return fromIterable(sources).concatMapEagerDelayError(r07.identity(), false, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatEagerDelayError(@cfb Iterable<? extends wub<? extends T>> sources, int maxConcurrency, int bufferSize) {
        return fromIterable(sources).concatMapEagerDelayError(r07.identity(), true, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("custom")
    @cfb
    public static vkb<Long> interval(long initialDelay, long period, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new pqb(Math.max(0L, initialDelay), Math.max(0L, period), unit, scheduler));
    }

    @cy1
    @gpe("custom")
    @cfb
    public static vkb<Long> intervalRange(long start, long count, long initialDelay, long period, @cfb TimeUnit unit, @cfb woe scheduler) {
        if (count < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + count);
        }
        if (count == 0) {
            return empty().delay(initialDelay, unit, scheduler);
        }
        long j = start + (count - 1);
        if (start > 0 && j < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new rqb(start, j, Math.max(0L, initialDelay), Math.max(0L, period), unit, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> merge(@cfb Iterable<? extends wub<? extends T>> sources) {
        return fromIterable(sources).flatMap(r07.identity());
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> mergeArray(@cfb wub<? extends T>... sources) {
        return fromArray(sources).flatMap(r07.identity(), sources.length);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @cfb
    public static <T> vkb<T> mergeArrayDelayError(@cfb wub<? extends T>... sources) {
        return fromArray(sources).flatMap(r07.identity(), true, sources.length);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> mergeDelayError(@cfb Iterable<? extends wub<? extends T>> sources, int maxConcurrency, int bufferSize) {
        return fromIterable(sources).flatMap(r07.identity(), true, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2, @cfb l11<? super T, ? super T> isEqual) {
        return sequenceEqual(source1, source2, isEqual, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> switchOnNextDelayError(@cfb wub<? extends wub<? extends T>> sources, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new evb(sources, r07.identity(), bufferSize, true));
    }

    @cy1
    @gpe("custom")
    @cfb
    public static vkb<Long> timer(long delay, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new kwb(Math.max(delay, 0L), unit, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, D> vkb<T> using(@cfb nfg<? extends D> resourceSupplier, @cfb sy6<? super D, ? extends wub<? extends T>> sourceSupplier, @cfb uu2<? super D> resourceCleanup, boolean eager) {
        Objects.requireNonNull(resourceSupplier, "resourceSupplier is null");
        Objects.requireNonNull(sourceSupplier, "sourceSupplier is null");
        Objects.requireNonNull(resourceCleanup, "resourceCleanup is null");
        return ofe.onAssembly(new uwb(resourceSupplier, sourceSupplier, resourceCleanup, eager));
    }

    @gpe("none")
    public final void blockingForEach(@cfb uu2<? super T> onNext, int capacityHint) {
        Objects.requireNonNull(onNext, "onNext is null");
        Iterator<T> it = blockingIterable(capacityHint).iterator();
        while (it.hasNext()) {
            try {
                onNext.accept(it.next());
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ((lf4) it).dispose();
                throw k75.wrapOrThrow(th);
            }
        }
    }

    @cy1
    @gpe("none")
    @cfb
    public final Iterable<T> blockingIterable(int capacityHint) {
        yjb.verifyPositive(capacityHint, "capacityHint");
        return new d81(this, capacityHint);
    }

    @cy1
    @gpe("none")
    @cfb
    public final Stream<T> blockingStream(int capacityHint) {
        Iterator<T> it = blockingIterable(capacityHint).iterator();
        Stream stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false);
        lf4 lf4Var = (lf4) it;
        lf4Var.getClass();
        return (Stream) stream.onClose(new i86(lf4Var));
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb uu2<? super T> onNext) {
        klb.subscribe(this, onNext, r07.f76642f, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<List<T>> buffer(int i, int i2) {
        return (vkb<List<T>>) buffer(i, i2, u60.asSupplier());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMap(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        if (!(this instanceof lme)) {
            return ofe.onAssembly(new gmb(this, mapper, bufferSize, e55.IMMEDIATE));
        }
        Object obj = ((lme) this).get();
        return obj == null ? empty() : vtb.scalarXMap(obj, mapper);
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 concatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper, int capacityHint) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(capacityHint, "capacityHint");
        return ofe.onAssembly(new imb(this, mapper, e55.IMMEDIATE, capacityHint));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 concatMapCompletableDelayError(@cfb sy6<? super T, ? extends ph2> mapper, boolean tillTheEnd) {
        return concatMapCompletableDelayError(mapper, tillTheEnd, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapDelayError(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, boolean tillTheEnd, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        if (!(this instanceof lme)) {
            return ofe.onAssembly(new gmb(this, mapper, bufferSize, tillTheEnd ? e55.END : e55.BOUNDARY));
        }
        Object obj = ((lme) this).get();
        return obj == null ? empty() : vtb.scalarXMap(obj, mapper);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapEager(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, int maxConcurrency, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new kmb(this, mapper, e55.IMMEDIATE, maxConcurrency, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapEagerDelayError(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, boolean tillTheEnd, int maxConcurrency, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new kmb(this, mapper, tillTheEnd ? e55.END : e55.BOUNDARY, maxConcurrency, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new mmb(this, mapper, e55.IMMEDIATE, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapMaybeDelayError(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper, boolean tillTheEnd) {
        return concatMapMaybeDelayError(mapper, tillTheEnd, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new pmb(this, mapper, e55.IMMEDIATE, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapSingleDelayError(@cfb sy6<? super T, ? extends oof<? extends R>> mapper, boolean tillTheEnd) {
        return concatMapSingleDelayError(mapper, tillTheEnd, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K> vkb<T> distinct(@cfb sy6<? super T, K> keySelector) {
        return distinct(keySelector, r07.createHashSet());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K> vkb<T> distinctUntilChanged(@cfb sy6<? super T, K> keySelector) {
        Objects.requireNonNull(keySelector, "keySelector is null");
        return ofe.onAssembly(new wnb(this, keySelector, yjb.equalsPredicate()));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, boolean delayErrors) {
        return flatMap(mapper, delayErrors, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 flatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper, boolean delayErrors) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new apb(this, mapper, delayErrors));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayErrors) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new cpb(this, mapper, delayErrors));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayErrors) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new epb(this, mapper, delayErrors));
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 forEachWhile(@cfb n8d<? super T> onNext, @cfb uu2<? super Throwable> onError) {
        return forEachWhile(onNext, onError, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K> vkb<ub7<K, T>> groupBy(@cfb sy6<? super T, ? extends K> sy6Var, boolean z) {
        return (vkb<ub7<K, T>>) groupBy(sy6Var, r07.identity(), z, bufferSize());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> observeOn(@cfb woe scheduler, boolean delayError) {
        return observeOn(scheduler, delayError, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> onErrorComplete(@cfb n8d<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new xrb(this, predicate));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> publish(@cfb sy6<? super vkb<T>, ? extends wub<R>> selector) {
        Objects.requireNonNull(selector, "selector is null");
        return ofe.onAssembly(new msb(this, selector));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> repeat(long times) {
        if (times >= 0) {
            return times == 0 ? empty() : ofe.onAssembly(new dtb(this, times));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + times);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> replay(@cfb sy6<? super vkb<T>, ? extends wub<R>> selector) {
        Objects.requireNonNull(selector, "selector is null");
        return jtb.multicastSelector(nqb.replaySupplier(this), selector);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> retry(@cfb l11<? super Integer, ? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new ltb(this, predicate));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> sample(long period, @cfb TimeUnit unit, boolean emitLast) {
        return sample(period, unit, mpe.computation(), emitLast);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> sorted(@cfb Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return toList().toObservable().map(r07.listSorter(comparator)).flatMapIterable(r07.identity());
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onNext) {
        return subscribe(onNext, r07.f76642f, r07.f76639c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> switchMap(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        if (!(this instanceof lme)) {
            return ofe.onAssembly(new evb(this, mapper, bufferSize, false));
        }
        Object obj = ((lme) this).get();
        return obj == null ? empty() : vtb.scalarXMap(obj, mapper);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> switchMapDelayError(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        if (!(this instanceof lme)) {
            return ofe.onAssembly(new evb(this, mapper, bufferSize, true));
        }
        Object obj = ((lme) this).get();
        return obj == null ? empty() : vtb.scalarXMap(obj, mapper);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> throttleFirst(long skipDuration, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new awb(this, skipDuration, unit, scheduler));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> throttleLast(long intervalDuration, @cfb TimeUnit unit, @cfb woe scheduler) {
        return sample(intervalDuration, unit, scheduler);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> throttleLatest(long timeout, @cfb TimeUnit unit, boolean emitLast) {
        return throttleLatest(timeout, unit, mpe.computation(), emitLast);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> throttleWithTimeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return debounce(timeout, unit, scheduler);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<j1h<T>> timeInterval(@cfb woe scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <V> vkb<T> timeout(@cfb sy6<? super T, ? extends wub<V>> itemTimeoutIndicator, @cfb wub<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(null, itemTimeoutIndicator, fallback);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<j1h<T>> timestamp(@cfb woe scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<List<T>> toList(int capacityHint) {
        yjb.verifyPositive(capacityHint, "capacityHint");
        return ofe.onAssembly(new owb(this, capacityHint));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<List<T>> toSortedList(@cfb Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (kjf<List<T>>) toList().map(r07.listSorter(comparator));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<vkb<T>> window(long count, long skip) {
        return window(count, skip, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concat(@cfb wub<? extends wub<? extends T>> sources) {
        return concat(sources, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatDelayError(@cfb wub<? extends wub<? extends T>> sources) {
        return concatDelayError(sources, bufferSize(), true);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatEager(@cfb wub<? extends wub<? extends T>> sources) {
        return concatEager(sources, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatEagerDelayError(@cfb wub<? extends wub<? extends T>> sources) {
        return concatEagerDelayError(sources, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> error(@cfb Throwable throwable) {
        Objects.requireNonNull(throwable, "throwable is null");
        return error((nfg<? extends Throwable>) r07.justSupplier(throwable));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> fromFuture(@cfb Future<? extends T> future, long timeout, @cfb TimeUnit unit) {
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(unit, "unit is null");
        return ofe.onAssembly(new ppb(future, timeout, unit));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> just(@cfb T item1, @cfb T item2) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        return fromArray(item1, item2);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> merge(@cfb Iterable<? extends wub<? extends T>> sources, int maxConcurrency) {
        return fromIterable(sources).flatMap(r07.identity(), maxConcurrency);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> mergeDelayError(@cfb Iterable<? extends wub<? extends T>> sources, int maxConcurrency) {
        return fromIterable(sources).flatMap(r07.identity(), true, maxConcurrency);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2, @cfb l11<? super T, ? super T> isEqual, int bufferSize) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(isEqual, "isEqual is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new eub(source1, source2, isEqual, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final T blockingSingle(@cfb T defaultItem) {
        return single(defaultItem).blockingGet();
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError) {
        klb.subscribe(this, onNext, onError, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U extends Collection<? super T>> vkb<U> buffer(int count, int skip, @cfb nfg<U> bufferSupplier) {
        yjb.verifyPositive(count, "count");
        yjb.verifyPositive(skip, RadialViewGroup.f22860u2);
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
        return ofe.onAssembly(new nlb(this, count, skip, bufferSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final xd2 concatMapCompletableDelayError(@cfb sy6<? super T, ? extends ph2> mapper, boolean tillTheEnd, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new imb(this, mapper, tillTheEnd ? e55.END : e55.BOUNDARY, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapMaybeDelayError(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper, boolean tillTheEnd, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new mmb(this, mapper, tillTheEnd ? e55.END : e55.BOUNDARY, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> concatMapSingleDelayError(@cfb sy6<? super T, ? extends oof<? extends R>> mapper, boolean tillTheEnd, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new pmb(this, mapper, tillTheEnd ? e55.END : e55.BOUNDARY, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> concatWith(@cfb oof<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new vmb(this, other));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> debounce(long timeout, @cfb TimeUnit unit) {
        return debounce(timeout, unit, mpe.computation());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> delay(long time, @cfb TimeUnit unit) {
        return delay(time, unit, mpe.computation(), false);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> delaySubscription(long time, @cfb TimeUnit unit) {
        return delaySubscription(time, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K> vkb<T> distinct(@cfb sy6<? super T, K> keySelector, @cfb nfg<? extends Collection<? super K>> collectionSupplier) {
        Objects.requireNonNull(keySelector, "keySelector is null");
        Objects.requireNonNull(collectionSupplier, "collectionSupplier is null");
        return ofe.onAssembly(new unb(this, keySelector, collectionSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<T> elementAt(long index, @cfb T defaultItem) {
        if (index >= 0) {
            Objects.requireNonNull(defaultItem, "defaultItem is null");
            return ofe.onAssembly(new kob(this, index, defaultItem));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + index);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, boolean delayErrors, int maxConcurrency) {
        return flatMap(mapper, delayErrors, maxConcurrency, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <U, V> vkb<V> flatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> sy6Var, @cfb i11<? super T, ? super U, ? extends V> i11Var) {
        Objects.requireNonNull(sy6Var, "mapper is null");
        Objects.requireNonNull(i11Var, "combiner is null");
        return (vkb<V>) flatMap(nqb.flatMapIntoIterable(sy6Var), i11Var, false, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 forEachWhile(@cfb n8d<? super T> onNext, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        qp6 qp6Var = new qp6(onNext, onError, onComplete);
        subscribe(qp6Var);
        return qp6Var;
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K, V> vkb<ub7<K, V>> groupBy(@cfb sy6<? super T, ? extends K> keySelector, sy6<? super T, ? extends V> valueSelector) {
        return groupBy(keySelector, valueSelector, false, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> mergeWith(@cfb oof<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new srb(this, other));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> observeOn(@cfb woe scheduler, boolean delayError, int bufferSize) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new wrb(this, scheduler, delayError, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> kjf<R> reduce(R seed, @cfb i11<R, ? super T, R> reducer) {
        Objects.requireNonNull(seed, "seed is null");
        Objects.requireNonNull(reducer, "reducer is null");
        return ofe.onAssembly(new wsb(this, seed, reducer));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> sample(long period, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new rtb(this, period, unit, scheduler, false));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> scan(@cfb R initialValue, @cfb i11<R, ? super T, R> accumulator) {
        Objects.requireNonNull(initialValue, "initialValue is null");
        return scanWith(r07.justSupplier(initialValue), accumulator);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> startWith(@cfb oof<T> other) {
        Objects.requireNonNull(other, "other is null");
        return concat(kjf.wrap(other).toObservable(), this);
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError) {
        return subscribe(onNext, onError, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> take(long time, @cfb TimeUnit unit) {
        return takeUntil(timer(time, unit));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> takeUntil(@cfb n8d<? super T> stopPredicate) {
        Objects.requireNonNull(stopPredicate, "stopPredicate is null");
        return ofe.onAssembly(new wvb(this, stopPredicate));
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
    @gpe("custom")
    @cfb
    public final vkb<T> throttleLatest(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return throttleLatest(timeout, unit, scheduler, false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<j1h<T>> timeInterval(@cfb TimeUnit unit) {
        return timeInterval(unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<j1h<T>> timestamp(@cfb TimeUnit unit) {
        return timestamp(unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K, V> kjf<Map<K, V>> toMap(@cfb sy6<? super T, ? extends K> sy6Var, @cfb sy6<? super T, ? extends V> sy6Var2) {
        Objects.requireNonNull(sy6Var, "keySelector is null");
        Objects.requireNonNull(sy6Var2, "valueSelector is null");
        return (kjf<Map<K, V>>) collect(oh7.asSupplier(), r07.toMapKeyValueSelector(sy6Var, sy6Var2));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<vkb<T>> window(long count, long skip, int bufferSize) {
        yjb.verifyPositive(count, "count");
        yjb.verifyPositive(skip, RadialViewGroup.f22860u2);
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new xwb(this, count, skip, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concat(@cfb wub<? extends wub<? extends T>> sources, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new gmb(sources, r07.identity(), bufferSize, e55.IMMEDIATE));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatDelayError(@cfb wub<? extends wub<? extends T>> sources, int bufferSize, boolean tillTheEnd) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(bufferSize, "bufferSize is null");
        return ofe.onAssembly(new gmb(sources, r07.identity(), bufferSize, tillTheEnd ? e55.END : e55.BOUNDARY));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatEager(@cfb wub<? extends wub<? extends T>> sources, int maxConcurrency, int bufferSize) {
        return wrap(sources).concatMapEager(r07.identity(), maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concatEagerDelayError(@cfb wub<? extends wub<? extends T>> sources, int maxConcurrency, int bufferSize) {
        return wrap(sources).concatMapEagerDelayError(r07.identity(), true, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> merge(@cfb wub<? extends wub<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new wob(sources, r07.identity(), false, Integer.MAX_VALUE, bufferSize()));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> mergeDelayError(@cfb wub<? extends wub<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new wob(sources, r07.identity(), true, Integer.MAX_VALUE, bufferSize()));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> switchOnNext(@cfb wub<? extends wub<? extends T>> sources) {
        return switchOnNext(sources, bufferSize());
    }

    @cfb
    private <U, V> vkb<T> timeout0(@cfb wub<U> firstTimeoutIndicator, @cfb sy6<? super T, ? extends wub<V>> itemTimeoutIndicator, @dib wub<? extends T> fallback) {
        Objects.requireNonNull(itemTimeoutIndicator, "itemTimeoutIndicator is null");
        return ofe.onAssembly(new gwb(this, firstTimeoutIndicator, itemTimeoutIndicator, fallback));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, R> vkb<R> zip(@cfb Iterable<? extends wub<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> zipper, boolean delayError, int bufferSize) {
        Objects.requireNonNull(zipper, "zipper is null");
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new lxb(null, sources, zipper, bufferSize, delayError));
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete) {
        klb.subscribe(this, onNext, onError, onComplete);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R, A> kjf<R> collect(@cfb Collector<? super T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return ofe.onAssembly(new cmb(this, collector));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> debounce(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new inb(this, timeout, unit, scheduler));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> delay(long time, @cfb TimeUnit unit, boolean delayError) {
        return delay(time, unit, mpe.computation(), delayError);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> delaySubscription(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return delaySubscription(timer(time, unit, scheduler));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> distinctUntilChanged(@cfb l11<? super T, ? super T> comparer) {
        Objects.requireNonNull(comparer, "comparer is null");
        return ofe.onAssembly(new wnb(this, r07.identity(), comparer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(bufferSize, "bufferSize");
        if (this instanceof lme) {
            Object obj = ((lme) this).get();
            if (obj == null) {
                return empty();
            }
            return vtb.scalarXMap(obj, mapper);
        }
        return ofe.onAssembly(new wob(this, mapper, delayErrors, maxConcurrency, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K, V> vkb<ub7<K, V>> groupBy(@cfb sy6<? super T, ? extends K> keySelector, @cfb sy6<? super T, ? extends V> valueSelector, boolean delayError) {
        return groupBy(keySelector, valueSelector, delayError, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> replay(@cfb sy6<? super vkb<T>, ? extends wub<R>> selector, int bufferSize) {
        Objects.requireNonNull(selector, "selector is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return jtb.multicastSelector(nqb.replaySupplier(this, bufferSize, false), selector);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> retry(long times) {
        return retry(times, r07.alwaysTrue());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> skip(long time, @cfb TimeUnit unit) {
        return skipUntil(timer(time, unit));
    }

    @cy1
    @gpe("io.reactivex:trampoline")
    @cfb
    public final vkb<T> skipLast(long time, @cfb TimeUnit unit) {
        return skipLast(time, unit, mpe.trampoline(), false, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        wt8 wt8Var = new wt8(onNext, onError, onComplete, r07.emptyConsumer());
        subscribe(wt8Var);
        return wt8Var;
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> take(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return takeUntil(timer(time, unit, scheduler));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> throttleLatest(long timeout, @cfb TimeUnit unit, @cfb woe scheduler, boolean emitLast) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new cwb(this, timeout, unit, scheduler, emitLast));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<j1h<T>> timeInterval(@cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new ewb(this, unit, scheduler));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> timeout(long timeout, @cfb TimeUnit unit) {
        return timeout0(timeout, unit, null, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<j1h<T>> timestamp(@cfb TimeUnit timeUnit, @cfb woe woeVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(woeVar, "scheduler is null");
        return (vkb<j1h<T>>) map(r07.timestampWith(timeUnit, woeVar));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U extends Collection<? super T>> kjf<U> toList(@cfb nfg<U> collectionSupplier) {
        Objects.requireNonNull(collectionSupplier, "collectionSupplier is null");
        return ofe.onAssembly(new owb(this, collectionSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<List<T>> toSortedList(@cfb Comparator<? super T> comparator, int i) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (kjf<List<T>>) toList(i).map(r07.listSorter(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <T1, T2, R> vkb<R> withLatestFrom(@cfb wub<T1> source1, @cfb wub<T2> source2, @cfb jz6<? super T, ? super T1, ? super T2, R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return withLatestFrom((wub<?>[]) new wub[]{source1, source2}, r07.toFunction(combiner));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> vkb<R> zipWith(@cfb wub<? extends U> other, @cfb i11<? super T, ? super U, ? extends R> zipper) {
        Objects.requireNonNull(other, "other is null");
        return zip(this, other, zipper);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, S> vkb<T> generate(@cfb nfg<S> initialState, @cfb e11<S, qy4<T>> generator) {
        Objects.requireNonNull(generator, "generator is null");
        return generate(initialState, nqb.simpleBiGenerator(generator), r07.emptyConsumer());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public static vkb<Long> interval(long period, @cfb TimeUnit unit) {
        return interval(period, period, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final T blockingFirst(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        g71 g71Var = new g71();
        subscribe(g71Var);
        T tBlockingGet = g71Var.blockingGet();
        return tBlockingGet != null ? tBlockingGet : defaultItem;
    }

    @cy1
    @gpe("none")
    @cfb
    public final T blockingLast(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        w71 w71Var = new w71();
        subscribe(w71Var);
        T tBlockingGet = w71Var.blockingGet();
        return tBlockingGet != null ? tBlockingGet : defaultItem;
    }

    @gpe("none")
    public final void blockingSubscribe(@cfb pxb<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        klb.subscribe(this, observer);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> concatWith(@cfb z9a<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new tmb(this, other));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> delay(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return delay(time, unit, scheduler, false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K, V> vkb<ub7<K, V>> groupBy(@cfb sy6<? super T, ? extends K> keySelector, @cfb sy6<? super T, ? extends V> valueSelector, boolean delayError, int bufferSize) {
        Objects.requireNonNull(keySelector, "keySelector is null");
        Objects.requireNonNull(valueSelector, "valueSelector is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new dqb(this, keySelector, valueSelector, bufferSize, delayError));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> mergeWith(@cfb z9a<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new qrb(this, other));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> retry(long times, @cfb n8d<? super Throwable> predicate) {
        if (times >= 0) {
            Objects.requireNonNull(predicate, "predicate is null");
            return ofe.onAssembly(new ntb(this, times, predicate));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + times);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> skip(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return skipUntil(timer(time, unit, scheduler));
    }

    @cy1
    @gpe("io.reactivex:trampoline")
    @cfb
    public final vkb<T> skipLast(long time, @cfb TimeUnit unit, boolean delayError) {
        return skipLast(time, unit, mpe.trampoline(), delayError, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> startWith(@cfb z9a<T> other) {
        Objects.requireNonNull(other, "other is null");
        return concat(r4a.wrap(other).toObservable(), this);
    }

    @cy1
    @gpe("io.reactivex:trampoline")
    @cfb
    public final vkb<T> takeLast(long count, long time, @cfb TimeUnit unit) {
        return takeLast(count, time, unit, mpe.trampoline(), false, bufferSize());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<T> timeout(long timeout, @cfb TimeUnit unit, @cfb wub<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(timeout, unit, fallback, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K, V> kjf<Map<K, Collection<V>>> toMultimap(@cfb sy6<? super T, ? extends K> keySelector, sy6<? super T, ? extends V> valueSelector) {
        return toMultimap(keySelector, valueSelector, oh7.asSupplier(), u60.asFunction());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, R> vkb<R> combineLatest(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb i11<? super T1, ? super T2, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new wub[]{source1, source2}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("custom")
    @cfb
    public static vkb<Long> interval(long period, @cfb TimeUnit unit, @cfb woe scheduler) {
        return interval(period, period, unit, scheduler);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> just(@cfb T item1, @cfb T item2, @cfb T item3) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        return fromArray(item1, item2, item3);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> merge(@cfb wub<? extends wub<? extends T>> sources, int maxConcurrency) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        return ofe.onAssembly(new wob(sources, r07.identity(), false, maxConcurrency, bufferSize()));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> mergeDelayError(@cfb wub<? extends wub<? extends T>> sources, int maxConcurrency) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        return ofe.onAssembly(new wob(sources, r07.identity(), true, maxConcurrency, bufferSize()));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> delay(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new mnb(this, time, unit, scheduler, delayError));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doOnEach(@cfb uu2<? super jgb<T>> onNotification) {
        Objects.requireNonNull(onNotification, "onNotification is null");
        return doOnEach(r07.notificationOnNext(onNotification), r07.notificationOnError(onNotification), r07.notificationOnComplete(onNotification), r07.f76639c);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> sample(long period, @cfb TimeUnit unit, @cfb woe scheduler, boolean emitLast) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new rtb(this, period, unit, scheduler, emitLast));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> skipLast(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return skipLast(time, unit, scheduler, false, bufferSize());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> takeLast(long count, long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return takeLast(count, time, unit, scheduler, false, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <K, V> kjf<Map<K, V>> toMap(@cfb sy6<? super T, ? extends K> sy6Var, @cfb sy6<? super T, ? extends V> sy6Var2, @cfb nfg<? extends Map<K, V>> nfgVar) {
        Objects.requireNonNull(sy6Var, "keySelector is null");
        Objects.requireNonNull(sy6Var2, "valueSelector is null");
        Objects.requireNonNull(nfgVar, "mapSupplier is null");
        return (kjf<Map<K, V>>) collect(nfgVar, r07.toMapKeyValueSelector(sy6Var, sy6Var2));
    }

    @cy1
    @gpe("none")
    @cfb
    public final kjf<List<T>> toSortedList(int capacityHint) {
        return toSortedList(r07.naturalComparator(), capacityHint);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> vkb<R> zipWith(@cfb wub<? extends U> other, @cfb i11<? super T, ? super U, ? extends R> zipper, boolean delayError) {
        return zip(this, other, zipper, delayError);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concat(@cfb wub<? extends T> source1, wub<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return concatArray(source1, source2);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, S> vkb<T> generate(@cfb nfg<S> initialState, @cfb e11<S, qy4<T>> generator, @cfb uu2<? super S> disposeState) {
        Objects.requireNonNull(generator, "generator is null");
        return generate(initialState, nqb.simpleBiGenerator(generator), disposeState);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U extends Collection<? super T>> vkb<U> buffer(int count, @cfb nfg<U> bufferSupplier) {
        return buffer(count, count, bufferSupplier);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> concatWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new rmb(this, other));
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> mergeWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new orb(this, other));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> replay(@cfb sy6<? super vkb<T>, ? extends wub<R>> selector, int bufferSize, boolean eagerTruncate) {
        Objects.requireNonNull(selector, "selector is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return jtb.multicastSelector(nqb.replaySupplier(this, bufferSize, eagerTruncate), selector);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> skipLast(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError) {
        return skipLast(time, unit, scheduler, delayError, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> startWith(@cfb wub<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return concatArray(other, this);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> takeLast(long count, long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError, int bufferSize) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        if (count >= 0) {
            return ofe.onAssembly(new svb(this, count, time, unit, scheduler, bufferSize, delayError));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + count);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> timeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler, @cfb wub<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(timeout, unit, fallback, scheduler);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<vkb<T>> window(long timespan, long timeskip, @cfb TimeUnit unit) {
        return window(timespan, timeskip, unit, mpe.computation(), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> vkb<R> zipWith(@cfb wub<? extends U> other, @cfb i11<? super T, ? super U, ? extends R> zipper, boolean delayError, int bufferSize) {
        return zip(this, other, zipper, delayError, bufferSize);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2, int bufferSize) {
        return sequenceEqual(source1, source2, yjb.equalsPredicate(), bufferSize);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, R> vkb<R> zip(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb i11<? super T1, ? super T2, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<List<T>> buffer(long j, long j2, @cfb TimeUnit timeUnit) {
        return (vkb<List<T>>) buffer(j, j2, timeUnit, mpe.computation(), u60.asSupplier());
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> retry(@cfb n8d<? super Throwable> predicate) {
        return retry(Long.MAX_VALUE, predicate);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> skipLast(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError, int bufferSize) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new rub(this, time, unit, scheduler, bufferSize << 1, delayError));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <K, V> kjf<Map<K, Collection<V>>> toMultimap(@cfb sy6<? super T, ? extends K> sy6Var, @cfb sy6<? super T, ? extends V> sy6Var2, @cfb nfg<? extends Map<K, Collection<V>>> nfgVar, @cfb sy6<? super K, ? extends Collection<? super V>> sy6Var3) {
        Objects.requireNonNull(sy6Var, "keySelector is null");
        Objects.requireNonNull(sy6Var2, "valueSelector is null");
        Objects.requireNonNull(nfgVar, "mapSupplier is null");
        Objects.requireNonNull(sy6Var3, "collectionFactory is null");
        return (kjf<Map<K, Collection<V>>>) collect(nfgVar, r07.toMultimapKeyValueSelector(sy6Var, sy6Var2, sy6Var3));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<vkb<T>> window(long timespan, long timeskip, @cfb TimeUnit unit, @cfb woe scheduler) {
        return window(timespan, timeskip, unit, scheduler, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, S> vkb<T> generate(@cfb nfg<S> initialState, @cfb i11<S, qy4<T>, S> generator) {
        return generate(initialState, generator, r07.emptyConsumer());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> merge(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return fromArray(source1, source2).flatMap(r07.identity(), false, 2);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> mergeDelayError(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return fromArray(source1, source2).flatMap(r07.identity(), true, 2);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<List<T>> buffer(long j, long j2, @cfb TimeUnit timeUnit, @cfb woe woeVar) {
        return (vkb<List<T>>) buffer(j, j2, timeUnit, woeVar, u60.asSupplier());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final <R> vkb<R> concatMap(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, int bufferSize, @cfb woe scheduler) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new nmb(this, mapper, bufferSize, e55.IMMEDIATE, scheduler));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final <R> vkb<R> concatMapDelayError(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, boolean tillTheEnd, int bufferSize, @cfb woe scheduler) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new nmb(this, mapper, bufferSize, tillTheEnd ? e55.END : e55.BOUNDARY, scheduler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <U, V> vkb<T> delay(@cfb wub<U> subscriptionIndicator, @cfb sy6<? super T, ? extends wub<V>> itemDelayIndicator) {
        return delaySubscription(subscriptionIndicator).delay(itemDelayIndicator);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<T> sample(@cfb wub<U> sampler) {
        Objects.requireNonNull(sampler, "sampler is null");
        return ofe.onAssembly(new ttb(this, sampler, false));
    }

    @gpe("none")
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete, @cfb sf4 container) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        Objects.requireNonNull(container, "container is null");
        of4 of4Var = new of4(container, onNext, onError, onComplete);
        container.add(of4Var);
        subscribe(of4Var);
        return of4Var;
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> timeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return timeout0(timeout, unit, null, scheduler);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<vkb<T>> window(long timespan, long timeskip, @cfb TimeUnit unit, @cfb woe scheduler, int bufferSize) {
        yjb.verifyPositive(timespan, "timespan");
        yjb.verifyPositive(timeskip, "timeskip");
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(unit, "unit is null");
        return ofe.onAssembly(new fxb(this, timespan, timeskip, unit, scheduler, Long.MAX_VALUE, bufferSize, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <T1, T2, T3, R> vkb<R> withLatestFrom(@cfb wub<T1> source1, @cfb wub<T2> source2, @cfb wub<T3> source3, @cfb nz6<? super T, ? super T1, ? super T2, ? super T3, R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return withLatestFrom((wub<?>[]) new wub[]{source1, source2, source3}, r07.toFunction(combiner));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, R> vkb<R> combineLatest(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb jz6<? super T1, ? super T2, ? super T3, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new wub[]{source1, source2, source3}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concat(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2, @cfb wub<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return concatArray(source1, source2, source3);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T, S> vkb<T> generate(@cfb nfg<S> initialState, @cfb i11<S, qy4<T>, S> generator, @cfb uu2<? super S> disposeState) {
        Objects.requireNonNull(initialState, "initialState is null");
        Objects.requireNonNull(generator, "generator is null");
        Objects.requireNonNull(disposeState, "disposeState is null");
        return ofe.onAssembly(new bqb(initialState, generator, disposeState));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> just(@cfb T item1, @cfb T item2, @cfb T item3, @cfb T item4) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        Objects.requireNonNull(item4, "item4 is null");
        return fromArray(item1, item2, item3, item4);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final <U extends Collection<? super T>> vkb<U> buffer(long timespan, long timeskip, @cfb TimeUnit unit, @cfb woe scheduler, @cfb nfg<U> bufferSupplier) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
        return ofe.onAssembly(new ulb(this, timespan, timeskip, unit, scheduler, bufferSupplier, Integer.MAX_VALUE, false));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final <R> vkb<R> replay(@cfb sy6<? super vkb<T>, ? extends wub<R>> selector, int bufferSize, long time, @cfb TimeUnit unit) {
        return replay(selector, bufferSize, time, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, V> vkb<T> timeout(@cfb wub<U> firstTimeoutIndicator, @cfb sy6<? super T, ? extends wub<V>> itemTimeoutIndicator) {
        Objects.requireNonNull(firstTimeoutIndicator, "firstTimeoutIndicator is null");
        return timeout0(firstTimeoutIndicator, itemTimeoutIndicator, null);
    }

    @cy1
    @gpe("none")
    @cfb
    public final vkb<T> doOnEach(@cfb pxb<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        return doOnEach(nqb.observerOnNext(observer), nqb.observerOnError(observer), nqb.observerOnComplete(observer), r07.f76639c);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final <R> vkb<R> replay(@cfb sy6<? super vkb<T>, ? extends wub<R>> selector, int bufferSize, long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(selector, "selector is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return jtb.multicastSelector(nqb.replaySupplier(this, bufferSize, time, unit, scheduler, false), selector);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U> vkb<T> sample(@cfb wub<U> sampler, boolean emitLast) {
        Objects.requireNonNull(sampler, "sampler is null");
        return ofe.onAssembly(new ttb(this, sampler, emitLast));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> merge(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2, @cfb wub<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return fromArray(source1, source2, source3).flatMap(r07.identity(), false, 3);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> mergeDelayError(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2, @cfb wub<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return fromArray(source1, source2, source3).flatMap(r07.identity(), true, 3);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, R> vkb<R> zip(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb i11<? super T1, ? super T2, ? extends R> zipper, boolean delayError) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), delayError, bufferSize(), source1, source2);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends R>> onNextMapper, @cfb sy6<? super Throwable, ? extends wub<? extends R>> onErrorMapper, @cfb nfg<? extends wub<? extends R>> onCompleteSupplier) {
        Objects.requireNonNull(onNextMapper, "onNextMapper is null");
        Objects.requireNonNull(onErrorMapper, "onErrorMapper is null");
        Objects.requireNonNull(onCompleteSupplier, "onCompleteSupplier is null");
        return merge(new jrb(this, onNextMapper, onErrorMapper, onCompleteSupplier));
    }

    @cy1
    @gpe("io.reactivex:trampoline")
    @cfb
    public final vkb<T> takeLast(long time, @cfb TimeUnit unit) {
        return takeLast(time, unit, mpe.trampoline(), false, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, V> vkb<T> timeout(@cfb wub<U> firstTimeoutIndicator, @cfb sy6<? super T, ? extends wub<V>> itemTimeoutIndicator, @cfb wub<? extends T> fallback) {
        Objects.requireNonNull(firstTimeoutIndicator, "firstTimeoutIndicator is null");
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(firstTimeoutIndicator, itemTimeoutIndicator, fallback);
    }

    @cy1
    @gpe("io.reactivex:trampoline")
    @cfb
    public final vkb<T> takeLast(long time, @cfb TimeUnit unit, boolean delayError) {
        return takeLast(time, unit, mpe.trampoline(), delayError, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <K, V> kjf<Map<K, Collection<V>>> toMultimap(@cfb sy6<? super T, ? extends K> keySelector, @cfb sy6<? super T, ? extends V> valueSelector, @cfb nfg<Map<K, Collection<V>>> mapSupplier) {
        return toMultimap(keySelector, valueSelector, mapSupplier, u60.asFunction());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> concat(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2, @cfb wub<? extends T> source3, @cfb wub<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return concatArray(source1, source2, source3, source4);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<List<T>> buffer(long timespan, @cfb TimeUnit unit) {
        return buffer(timespan, unit, mpe.computation(), Integer.MAX_VALUE);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> takeLast(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return takeLast(time, unit, scheduler, false, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, R> vkb<R> combineLatest(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb nz6<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new wub[]{source1, source2, source3, source4}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> just(@cfb T item1, @cfb T item2, @cfb T item3, @cfb T item4, @cfb T item5) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        Objects.requireNonNull(item4, "item4 is null");
        Objects.requireNonNull(item5, "item5 is null");
        return fromArray(item1, item2, item3, item4, item5);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<List<T>> buffer(long timespan, @cfb TimeUnit unit, int count) {
        return buffer(timespan, unit, mpe.computation(), count);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> takeLast(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError) {
        return takeLast(time, unit, scheduler, delayError, bufferSize());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<vkb<T>> window(long timespan, @cfb TimeUnit unit) {
        return window(timespan, unit, mpe.computation(), Long.MAX_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @cfb
    public final <T1, T2, T3, T4, R> vkb<R> withLatestFrom(@cfb wub<T1> source1, @cfb wub<T2> source2, @cfb wub<T3> source3, @cfb wub<T4> source4, @cfb qz6<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return withLatestFrom((wub<?>[]) new wub[]{source1, source2, source3, source4}, r07.toFunction(combiner));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> merge(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2, @cfb wub<? extends T> source3, @cfb wub<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return fromArray(source1, source2, source3, source4).flatMap(r07.identity(), false, 4);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> mergeDelayError(@cfb wub<? extends T> source1, @cfb wub<? extends T> source2, @cfb wub<? extends T> source3, @cfb wub<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return fromArray(source1, source2, source3, source4).flatMap(r07.identity(), true, 4);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, R> vkb<R> zip(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb i11<? super T1, ? super T2, ? extends R> zipper, boolean delayError, int bufferSize) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), delayError, bufferSize, source1, source2);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<List<T>> buffer(long j, @cfb TimeUnit timeUnit, @cfb woe woeVar, int i) {
        return (vkb<List<T>>) buffer(j, timeUnit, woeVar, i, u60.asSupplier(), false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends R>> onNextMapper, @cfb sy6<Throwable, ? extends wub<? extends R>> onErrorMapper, @cfb nfg<? extends wub<? extends R>> onCompleteSupplier, int maxConcurrency) {
        Objects.requireNonNull(onNextMapper, "onNextMapper is null");
        Objects.requireNonNull(onErrorMapper, "onErrorMapper is null");
        Objects.requireNonNull(onCompleteSupplier, "onCompleteSupplier is null");
        return merge(new jrb(this, onNextMapper, onErrorMapper, onCompleteSupplier), maxConcurrency);
    }

    @Override // p000.wub
    @gpe("none")
    public final void subscribe(@cfb pxb<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        try {
            pxb<? super T> pxbVarOnSubscribe = ofe.onSubscribe(this, observer);
            Objects.requireNonNull(pxbVarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(pxbVarOnSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<T> takeLast(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError, int bufferSize) {
        return takeLast(Long.MAX_VALUE, time, unit, scheduler, delayError, bufferSize);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<vkb<T>> window(long timespan, @cfb TimeUnit unit, long count) {
        return window(timespan, unit, mpe.computation(), count, false);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final <U extends Collection<? super T>> vkb<U> buffer(long timespan, @cfb TimeUnit unit, @cfb woe scheduler, int count, @cfb nfg<U> bufferSupplier, boolean restartTimerOnMaxSize) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
        yjb.verifyPositive(count, "count");
        return ofe.onAssembly(new ulb(this, timespan, timespan, unit, scheduler, bufferSupplier, count, restartTimerOnMaxSize));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final <R> vkb<R> replay(@cfb sy6<? super vkb<T>, ? extends wub<R>> selector, int bufferSize, long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean eagerTruncate) {
        Objects.requireNonNull(selector, "selector is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return jtb.multicastSelector(nqb.replaySupplier(this, bufferSize, time, unit, scheduler, eagerTruncate), selector);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final vkb<vkb<T>> window(long timespan, @cfb TimeUnit unit, long count, boolean restart) {
        return window(timespan, unit, mpe.computation(), count, restart);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<vkb<T>> window(long timespan, @cfb TimeUnit unit, @cfb woe scheduler) {
        return window(timespan, unit, scheduler, Long.MAX_VALUE, false);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<vkb<T>> window(long timespan, @cfb TimeUnit unit, @cfb woe scheduler, long count) {
        return window(timespan, unit, scheduler, count, false);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, R> vkb<R> zip(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb jz6<? super T1, ? super T2, ? super T3, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2, source3);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends R>> mapper, int maxConcurrency) {
        return flatMap((sy6) mapper, false, maxConcurrency, bufferSize());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<vkb<T>> window(long timespan, @cfb TimeUnit unit, @cfb woe scheduler, long count, boolean restart) {
        return window(timespan, unit, scheduler, count, restart, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, R> vkb<R> combineLatest(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb wub<? extends T5> source5, @cfb qz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new wub[]{source1, source2, source3, source4, source5}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> just(@cfb T item1, @cfb T item2, @cfb T item3, @cfb T item4, @cfb T item5, @cfb T item6) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        Objects.requireNonNull(item4, "item4 is null");
        Objects.requireNonNull(item5, "item5 is null");
        Objects.requireNonNull(item6, "item6 is null");
        return fromArray(item1, item2, item3, item4, item5, item6);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner) {
        return flatMap(mapper, combiner, false, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<vkb<T>> window(long timespan, @cfb TimeUnit unit, @cfb woe scheduler, long count, boolean restart, int bufferSize) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(unit, "unit is null");
        yjb.verifyPositive(count, "count");
        return ofe.onAssembly(new fxb(this, timespan, timespan, unit, scheduler, count, bufferSize, restart));
    }

    @cy1
    @gpe("custom")
    @cfb
    public final vkb<List<T>> buffer(long j, @cfb TimeUnit timeUnit, @cfb woe woeVar) {
        return (vkb<List<T>>) buffer(j, timeUnit, woeVar, Integer.MAX_VALUE, u60.asSupplier(), false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner, boolean delayErrors) {
        return flatMap(mapper, combiner, delayErrors, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> withLatestFrom(@cfb wub<?>[] others, @cfb sy6<? super Object[], R> combiner) {
        Objects.requireNonNull(others, "others is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return ofe.onAssembly(new jxb(this, others, combiner));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <TOpening, TClosing> vkb<List<T>> buffer(@cfb wub<? extends TOpening> wubVar, @cfb sy6<? super TOpening, ? extends wub<? extends TClosing>> sy6Var) {
        return (vkb<List<T>>) buffer(wubVar, sy6Var, u60.asSupplier());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner, boolean delayErrors, int maxConcurrency) {
        return flatMap(mapper, combiner, delayErrors, maxConcurrency, bufferSize());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final <R> vkb<R> replay(@cfb sy6<? super vkb<T>, ? extends wub<R>> selector, long time, @cfb TimeUnit unit) {
        return replay(selector, time, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <TOpening, TClosing, U extends Collection<? super T>> vkb<U> buffer(@cfb wub<? extends TOpening> openingIndicator, @cfb sy6<? super TOpening, ? extends wub<? extends TClosing>> closingIndicator, @cfb nfg<U> bufferSupplier) {
        Objects.requireNonNull(openingIndicator, "openingIndicator is null");
        Objects.requireNonNull(closingIndicator, "closingIndicator is null");
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
        return ofe.onAssembly(new plb(this, openingIndicator, closingIndicator, bufferSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner, boolean delayErrors, int maxConcurrency, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return flatMap(nqb.flatMapWithCombiner(mapper, combiner), delayErrors, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final <R> vkb<R> replay(@cfb sy6<? super vkb<T>, ? extends wub<R>> selector, long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(selector, "selector is null");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return jtb.multicastSelector(nqb.replaySupplier(this, time, unit, scheduler, false), selector);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, R> vkb<R> zip(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb nz6<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2, source3, source4);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <R> vkb<R> withLatestFrom(@cfb Iterable<? extends wub<?>> others, @cfb sy6<? super Object[], R> combiner) {
        Objects.requireNonNull(others, "others is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return ofe.onAssembly(new jxb(this, others, combiner));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <B> vkb<vkb<T>> window(@cfb wub<B> boundaryIndicator) {
        return window(boundaryIndicator, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, R> vkb<R> flatMap(@cfb sy6<? super T, ? extends wub<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner, int maxConcurrency) {
        return flatMap(mapper, combiner, false, maxConcurrency, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public final <B> vkb<vkb<T>> window(@cfb wub<B> boundaryIndicator, int bufferSize) {
        Objects.requireNonNull(boundaryIndicator, "boundaryIndicator is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new zwb(this, boundaryIndicator, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, R> vkb<R> combineLatest(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb wub<? extends T5> source5, @cfb wub<? extends T6> source6, @cfb tz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new wub[]{source1, source2, source3, source4, source5, source6}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> just(@cfb T item1, @cfb T item2, @cfb T item3, @cfb T item4, @cfb T item5, @cfb T item6, @cfb T item7) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        Objects.requireNonNull(item4, "item4 is null");
        Objects.requireNonNull(item5, "item5 is null");
        Objects.requireNonNull(item6, "item6 is null");
        Objects.requireNonNull(item7, "item7 is null");
        return fromArray(item1, item2, item3, item4, item5, item6, item7);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <B> vkb<List<T>> buffer(@cfb wub<B> wubVar) {
        return (vkb<List<T>>) buffer(wubVar, u60.asSupplier());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final <R> vkb<R> replay(@cfb sy6<? super vkb<T>, ? extends wub<R>> selector, long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean eagerTruncate) {
        Objects.requireNonNull(selector, "selector is null");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return jtb.multicastSelector(nqb.replaySupplier(this, time, unit, scheduler, eagerTruncate), selector);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <B> vkb<List<T>> buffer(@cfb wub<B> wubVar, int i) {
        yjb.verifyPositive(i, "initialCapacity");
        return (vkb<List<T>>) buffer(wubVar, r07.createArrayList(i));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, V> vkb<vkb<T>> window(@cfb wub<U> openingIndicator, @cfb sy6<? super U, ? extends wub<V>> closingIndicator) {
        return window(openingIndicator, closingIndicator, bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, R> vkb<R> zip(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb wub<? extends T5> source5, @cfb qz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2, source3, source4, source5);
    }

    @cy1
    @gpe("none")
    @cfb
    public final <B, U extends Collection<? super T>> vkb<U> buffer(@cfb wub<B> boundaryIndicator, @cfb nfg<U> bufferSupplier) {
        Objects.requireNonNull(boundaryIndicator, "boundaryIndicator is null");
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
        return ofe.onAssembly(new slb(this, boundaryIndicator, bufferSupplier));
    }

    @cy1
    @gpe("none")
    @cfb
    public final <U, V> vkb<vkb<T>> window(@cfb wub<U> openingIndicator, @cfb sy6<? super U, ? extends wub<V>> closingIndicator, int bufferSize) {
        Objects.requireNonNull(openingIndicator, "openingIndicator is null");
        Objects.requireNonNull(closingIndicator, "closingIndicator is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new bxb(this, openingIndicator, closingIndicator, bufferSize));
    }

    @cy1
    @gpe("none")
    @cfb
    public final or2<T> replay(int bufferSize) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        return jtb.create(this, bufferSize, false);
    }

    @cy1
    @gpe("none")
    @cfb
    public final or2<T> replay(int bufferSize, boolean eagerTruncate) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        return jtb.create(this, bufferSize, eagerTruncate);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, R> vkb<R> combineLatest(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb wub<? extends T5> source5, @cfb wub<? extends T6> source6, @cfb wub<? extends T7> source7, @cfb wz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new wub[]{source1, source2, source3, source4, source5, source6, source7}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> just(@cfb T item1, @cfb T item2, @cfb T item3, @cfb T item4, @cfb T item5, @cfb T item6, @cfb T item7, @cfb T item8) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        Objects.requireNonNull(item4, "item4 is null");
        Objects.requireNonNull(item5, "item5 is null");
        Objects.requireNonNull(item6, "item6 is null");
        Objects.requireNonNull(item7, "item7 is null");
        Objects.requireNonNull(item8, "item8 is null");
        return fromArray(item1, item2, item3, item4, item5, item6, item7, item8);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final or2<T> replay(int bufferSize, long time, @cfb TimeUnit unit) {
        return replay(bufferSize, time, unit, mpe.computation());
    }

    @cy1
    @gpe("custom")
    @cfb
    public final or2<T> replay(int bufferSize, long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return jtb.create(this, time, unit, scheduler, bufferSize, false);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, R> vkb<R> zip(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb wub<? extends T5> source5, @cfb wub<? extends T6> source6, @cfb tz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2, source3, source4, source5, source6);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final or2<T> replay(int bufferSize, long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean eagerTruncate) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return jtb.create(this, time, unit, scheduler, bufferSize, eagerTruncate);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> vkb<R> combineLatest(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb wub<? extends T5> source5, @cfb wub<? extends T6> source6, @cfb wub<? extends T7> source7, @cfb wub<? extends T8> source8, @cfb zz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(source8, "source8 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new wub[]{source1, source2, source3, source4, source5, source6, source7, source8}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> just(@cfb T item1, @cfb T item2, @cfb T item3, @cfb T item4, @cfb T item5, @cfb T item6, @cfb T item7, @cfb T item8, @cfb T item9) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        Objects.requireNonNull(item4, "item4 is null");
        Objects.requireNonNull(item5, "item5 is null");
        Objects.requireNonNull(item6, "item6 is null");
        Objects.requireNonNull(item7, "item7 is null");
        Objects.requireNonNull(item8, "item8 is null");
        Objects.requireNonNull(item9, "item9 is null");
        return fromArray(item1, item2, item3, item4, item5, item6, item7, item8, item9);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @cfb
    public final or2<T> replay(long time, @cfb TimeUnit unit) {
        return replay(time, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, R> vkb<R> zip(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb wub<? extends T5> source5, @cfb wub<? extends T6> source6, @cfb wub<? extends T7> source7, @cfb wz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2, source3, source4, source5, source6, source7);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final or2<T> replay(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return jtb.create(this, time, unit, scheduler, false);
    }

    @cy1
    @gpe("custom")
    @cfb
    public final or2<T> replay(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean eagerTruncate) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return jtb.create(this, time, unit, scheduler, eagerTruncate);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> vkb<R> combineLatest(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb wub<? extends T5> source5, @cfb wub<? extends T6> source6, @cfb wub<? extends T7> source7, @cfb wub<? extends T8> source8, @cfb wub<? extends T9> source9, @cfb c07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(source8, "source8 is null");
        Objects.requireNonNull(source9, "source9 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new wub[]{source1, source2, source3, source4, source5, source6, source7, source8, source9}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T> vkb<T> just(@cfb T item1, @cfb T item2, @cfb T item3, @cfb T item4, @cfb T item5, @cfb T item6, @cfb T item7, @cfb T item8, @cfb T item9, @cfb T item10) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        Objects.requireNonNull(item4, "item4 is null");
        Objects.requireNonNull(item5, "item5 is null");
        Objects.requireNonNull(item6, "item6 is null");
        Objects.requireNonNull(item7, "item7 is null");
        Objects.requireNonNull(item8, "item8 is null");
        Objects.requireNonNull(item9, "item9 is null");
        Objects.requireNonNull(item10, "item10 is null");
        return fromArray(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> vkb<R> zip(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb wub<? extends T5> source5, @cfb wub<? extends T6> source6, @cfb wub<? extends T7> source7, @cfb wub<? extends T8> source8, @cfb zz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(source8, "source8 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2, source3, source4, source5, source6, source7, source8);
    }

    @cy1
    @gpe("none")
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> vkb<R> zip(@cfb wub<? extends T1> source1, @cfb wub<? extends T2> source2, @cfb wub<? extends T3> source3, @cfb wub<? extends T4> source4, @cfb wub<? extends T5> source5, @cfb wub<? extends T6> source6, @cfb wub<? extends T7> source7, @cfb wub<? extends T8> source8, @cfb wub<? extends T9> source9, @cfb c07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> zipper) {
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
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2, source3, source4, source5, source6, source7, source8, source9);
    }
}
