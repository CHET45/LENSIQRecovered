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
import p000.le6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l86<T> implements zjd<T> {

    /* JADX INFO: renamed from: a */
    public static final int f56753a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    /* JADX INFO: renamed from: l86$a */
    public static /* synthetic */ class C8712a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56754a;

        static {
            int[] iArr = new int[xo0.values().length];
            f56754a = iArr;
            try {
                iArr[xo0.DROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56754a[xo0.LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56754a[xo0.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f56754a[xo0.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> amb(@cfb Iterable<? extends zjd<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new s86(null, sources));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> ambArray(@cfb zjd<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        int length = sources.length;
        return length == 0 ? empty() : length == 1 ? fromPublisher(sources[0]) : ofe.onAssembly(new s86(sources, null));
    }

    @cy1
    public static int bufferSize() {
        return f56753a;
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> combineLatest(@cfb Iterable<? extends zjd<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> combiner) {
        return combineLatest(sources, combiner, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> combineLatestArray(@cfb zjd<? extends T>[] sources, @cfb sy6<? super Object[], ? extends R> combiner) {
        return combineLatestArray(sources, combiner, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> combineLatestArrayDelayError(@cfb zjd<? extends T>[] sources, @cfb sy6<? super Object[], ? extends R> combiner) {
        return combineLatestArrayDelayError(sources, combiner, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> combineLatestDelayError(@cfb Iterable<? extends zjd<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> combiner) {
        return combineLatestDelayError(sources, combiner, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb Iterable<? extends zjd<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return fromIterable(sources).concatMapDelayError(r07.identity(), false, 2);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArray(@cfb zjd<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? empty() : sources.length == 1 ? fromPublisher(sources[0]) : ofe.onAssembly(new v96(sources, false));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayDelayError(@cfb zjd<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        return sources.length == 0 ? empty() : sources.length == 1 ? fromPublisher(sources[0]) : ofe.onAssembly(new v96(sources, true));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayEager(@cfb zjd<? extends T>... sources) {
        return concatArrayEager(bufferSize(), bufferSize(), sources);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayEagerDelayError(@cfb zjd<? extends T>... sources) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), sources);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatDelayError(@cfb Iterable<? extends zjd<? extends T>> sources) {
        Objects.requireNonNull(sources, "sources is null");
        return fromIterable(sources).concatMapDelayError(r07.identity());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb Iterable<? extends zjd<? extends T>> sources) {
        return concatEager(sources, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb Iterable<? extends zjd<? extends T>> sources) {
        return concatEagerDelayError(sources, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public static <T> l86<T> create(@cfb mg6<T> source, @cfb xo0 mode) {
        Objects.requireNonNull(source, "source is null");
        Objects.requireNonNull(mode, "mode is null");
        return ofe.onAssembly(new za6(source, mode));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> defer(@cfb nfg<? extends zjd<? extends T>> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new eb6(supplier));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    private l86<T> doOnEach(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, InterfaceC7776j8 onAfterTerminate) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        return ofe.onAssembly(new xb6(this, onNext, onError, onComplete, onAfterTerminate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> empty() {
        return ofe.onAssembly(jc6.f50290b);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> error(@cfb nfg<? extends Throwable> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new lc6(supplier));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> fromAction(@cfb InterfaceC7776j8 action) {
        Objects.requireNonNull(action, "action is null");
        return ofe.onAssembly(new gd6(action));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromArray(@cfb T... items) {
        Objects.requireNonNull(items, "items is null");
        return items.length == 0 ? empty() : items.length == 1 ? just(items[0]) : ofe.onAssembly(new id6(items));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromCallable(@cfb Callable<? extends T> callable) {
        Objects.requireNonNull(callable, "callable is null");
        return ofe.onAssembly(new jd6(callable));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> fromCompletable(@cfb ph2 completableSource) {
        Objects.requireNonNull(completableSource, "completableSource is null");
        return ofe.onAssembly(new ld6(completableSource));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromCompletionStage(@cfb CompletionStage<T> stage) {
        Objects.requireNonNull(stage, "stage is null");
        return ofe.onAssembly(new md6(stage));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromFuture(@cfb Future<? extends T> future) {
        Objects.requireNonNull(future, "future is null");
        return ofe.onAssembly(new nd6(future, 0L, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromIterable(@cfb Iterable<? extends T> source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new qd6(source));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromMaybe(@cfb z9a<T> maybe) {
        Objects.requireNonNull(maybe, "maybe is null");
        return ofe.onAssembly(new vaa(maybe));
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public static <T> l86<T> fromObservable(@cfb wub<T> source, @cfb xo0 strategy) {
        Objects.requireNonNull(source, "source is null");
        Objects.requireNonNull(strategy, "strategy is null");
        sd6 sd6Var = new sd6(source);
        int i = C8712a.f56754a[strategy.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? sd6Var.onBackpressureBuffer() : ofe.onAssembly(new cg6(sd6Var)) : sd6Var : sd6Var.onBackpressureLatest() : sd6Var.onBackpressureDrop();
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromOptional(@cfb Optional<T> optional) {
        Objects.requireNonNull(optional, "optional is null");
        return (l86) optional.map(new Function() { // from class: j86
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return l86.just(obj);
            }
        }).orElseGet(new Supplier() { // from class: k86
            @Override // java.util.function.Supplier
            public final Object get() {
                return l86.empty();
            }
        });
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> fromPublisher(@cfb zjd<? extends T> publisher) {
        if (publisher instanceof l86) {
            return ofe.onAssembly((l86) publisher);
        }
        Objects.requireNonNull(publisher, "publisher is null");
        return ofe.onAssembly(new td6(publisher));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> fromRunnable(@cfb Runnable run) {
        Objects.requireNonNull(run, "run is null");
        return ofe.onAssembly(new vd6(run));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromSingle(@cfb oof<T> source) {
        Objects.requireNonNull(source, "source is null");
        return ofe.onAssembly(new cpf(source));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromStream(@cfb Stream<T> stream) {
        Objects.requireNonNull(stream, "stream is null");
        return ofe.onAssembly(new wd6(stream));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromSupplier(@cfb nfg<? extends T> supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return ofe.onAssembly(new xd6(supplier));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> generate(@cfb uu2<qy4<T>> generator) {
        Objects.requireNonNull(generator, "generator is null");
        return generate(r07.nullSupplier(), le6.simpleGenerator(generator), r07.emptyConsumer());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public static l86<Long> interval(long initialDelay, long period, @cfb TimeUnit unit) {
        return interval(initialDelay, period, unit, mpe.computation());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public static l86<Long> intervalRange(long start, long count, long initialDelay, long period, @cfb TimeUnit unit) {
        return intervalRange(start, count, initialDelay, period, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> just(T item) {
        Objects.requireNonNull(item, "item is null");
        return ofe.onAssembly(new se6(item));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb Iterable<? extends zjd<? extends T>> sources, int maxConcurrency, int bufferSize) {
        return fromIterable(sources).flatMap(r07.identity(), false, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeArray(int maxConcurrency, int bufferSize, @cfb zjd<? extends T>... sources) {
        return fromArray(sources).flatMap(r07.identity(), false, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeArrayDelayError(int maxConcurrency, int bufferSize, @cfb zjd<? extends T>... sources) {
        return fromArray(sources).flatMap(r07.identity(), true, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb Iterable<? extends zjd<? extends T>> sources) {
        return fromIterable(sources).flatMap(r07.identity(), true);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> never() {
        return ofe.onAssembly(rf6.f78151b);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static l86<Integer> range(int start, int count) {
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
            return ofe.onAssembly(new zg6(start, count));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static l86<Long> rangeLong(long start, long count) {
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
            return ofe.onAssembly(new bh6(start, count));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2) {
        return sequenceEqual(source1, source2, yjb.equalsPredicate(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> switchOnNext(@cfb zjd<? extends zjd<? extends T>> sources, int bufferSize) {
        return fromPublisher(sources).switchMap(r07.identity(), bufferSize);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> switchOnNextDelayError(@cfb zjd<? extends zjd<? extends T>> sources) {
        return switchOnNextDelayError(sources, bufferSize());
    }

    private l86<T> timeout0(long timeout, TimeUnit unit, zjd<? extends T> fallback, woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new yk6(this, timeout, unit, scheduler, fallback));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public static l86<Long> timer(long delay, @cfb TimeUnit unit) {
        return timer(delay, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.NONE)
    @cfb
    public static <T> l86<T> unsafeCreate(@cfb zjd<T> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        if (onSubscribe instanceof l86) {
            throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
        }
        return ofe.onAssembly(new td6(onSubscribe));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T, D> l86<T> using(@cfb nfg<? extends D> resourceSupplier, @cfb sy6<? super D, ? extends zjd<? extends T>> sourceSupplier, @cfb uu2<? super D> resourceCleanup) {
        return using(resourceSupplier, sourceSupplier, resourceCleanup, true);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> zip(@cfb Iterable<? extends zjd<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> zipper) {
        Objects.requireNonNull(zipper, "zipper is null");
        Objects.requireNonNull(sources, "sources is null");
        return ofe.onAssembly(new am6(null, sources, zipper, bufferSize(), false));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> zipArray(@cfb sy6<? super Object[], ? extends R> zipper, boolean delayError, int bufferSize, @cfb zjd<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return empty();
        }
        Objects.requireNonNull(zipper, "zipper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new am6(sources, null, zipper, bufferSize, delayError));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <R> l86<R> m15963a(sy6<? super T, ? extends zjd<? extends R>> mapper, int bufferSize, boolean delayError) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        if (!(this instanceof lme)) {
            return ofe.onAssembly(new pj6(this, mapper, bufferSize, delayError));
        }
        Object obj = ((lme) this).get();
        return obj == null ? empty() : fi6.scalarXMap(obj, mapper);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<Boolean> all(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new q86(this, predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> ambWith(@cfb zjd<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ambArray(this, other);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<Boolean> any(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new w86(this, predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final T blockingFirst() {
        i71 i71Var = new i71();
        subscribe((kj6) i71Var);
        T tBlockingGet = i71Var.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @gpe("none")
    @zo0(to0.FULL)
    public final void blockingForEach(@cfb uu2<? super T> onNext) {
        blockingForEach(onNext, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final T blockingLast() {
        y71 y71Var = new y71();
        subscribe((kj6) y71Var);
        T tBlockingGet = y71Var.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final Iterable<T> blockingLatest() {
        return new n71(this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final Iterable<T> blockingMostRecent(@cfb T initialItem) {
        Objects.requireNonNull(initialItem, "initialItem is null");
        return new p71(this, initialItem);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final Iterable<T> blockingNext() {
        return new r71(this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final T blockingSingle() {
        return singleOrError().blockingGet();
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final Stream<T> blockingStream() {
        return blockingStream(bufferSize());
    }

    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    public final void blockingSubscribe() {
        z86.subscribe(this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<List<T>> buffer(int count) {
        return buffer(count, count);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> cacheWithInitialCapacity(int initialCapacity) {
        yjb.verifyPositive(initialCapacity, "initialCapacity");
        return ofe.onAssembly(new l96(this, initialCapacity));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <U> l86<U> cast(@cfb Class<U> cls) {
        Objects.requireNonNull(cls, "clazz is null");
        return (l86<U>) map(r07.castFunction(cls));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <U> kjf<U> collect(@cfb nfg<? extends U> initialItemSupplier, @cfb e11<? super U, ? super T> collector) {
        Objects.requireNonNull(initialItemSupplier, "initialItemSupplier is null");
        Objects.requireNonNull(collector, "collector is null");
        return ofe.onAssembly(new p96(this, initialItemSupplier, collector));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <U> kjf<U> collectInto(U initialItem, @cfb e11<? super U, ? super T> collector) {
        Objects.requireNonNull(initialItem, "initialItem is null");
        return collect(r07.justSupplier(initialItem), collector);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> l86<R> compose(@cfb fl6<? super T, ? extends R> composer) {
        Objects.requireNonNull(composer, "composer is null");
        return fromPublisher(composer.apply(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper) {
        return concatMap(mapper, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final xd2 concatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper) {
        return concatMapCompletable(mapper, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final xd2 concatMapCompletableDelayError(@cfb sy6<? super T, ? extends ph2> mapper) {
        return concatMapCompletableDelayError(mapper, true, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapDelayError(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper) {
        return concatMapDelayError(mapper, true, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapEager(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper) {
        return concatMapEager(mapper, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapEagerDelayError(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean tillTheEnd) {
        return concatMapEagerDelayError(mapper, tillTheEnd, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> l86<U> concatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        return concatMapIterable(mapper, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        return concatMapMaybe(mapper, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapMaybeDelayError(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        return concatMapMaybeDelayError(mapper, true, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        return concatMapSingle(mapper, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapSingleDelayError(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        return concatMapSingleDelayError(mapper, true, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapStream(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper) {
        return flatMapStream(mapper, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> concatWith(@cfb zjd<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return concat(this, other);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<Boolean> contains(@cfb Object item) {
        Objects.requireNonNull(item, "item is null");
        return any(r07.equalsWith(item));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<Long> count() {
        return ofe.onAssembly(new xa6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <U> l86<T> debounce(@cfb sy6<? super T, ? extends zjd<U>> debounceIndicator) {
        Objects.requireNonNull(debounceIndicator, "debounceIndicator is null");
        return ofe.onAssembly(new bb6(this, debounceIndicator));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> defaultIfEmpty(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        return switchIfEmpty(just(defaultItem));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> l86<T> delay(@cfb sy6<? super T, ? extends zjd<U>> sy6Var) {
        Objects.requireNonNull(sy6Var, "itemDelayIndicator is null");
        return (l86<T>) flatMap(le6.itemDelay(sy6Var));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> l86<T> delaySubscription(@cfb zjd<U> subscriptionIndicator) {
        Objects.requireNonNull(subscriptionIndicator, "subscriptionIndicator is null");
        return ofe.onAssembly(new jb6(this, subscriptionIndicator));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> l86<R> dematerialize(@cfb sy6<? super T, jgb<R>> selector) {
        Objects.requireNonNull(selector, "selector is null");
        return ofe.onAssembly(new lb6(this, selector));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> distinct() {
        return distinct(r07.identity(), r07.createHashSet());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> distinctUntilChanged() {
        return distinctUntilChanged(r07.identity());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doAfterNext(@cfb uu2<? super T> onAfterNext) {
        Objects.requireNonNull(onAfterNext, "onAfterNext is null");
        return ofe.onAssembly(new tb6(this, onAfterNext));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doAfterTerminate(@cfb InterfaceC7776j8 onAfterTerminate) {
        return doOnEach(r07.emptyConsumer(), r07.emptyConsumer(), r07.f76639c, onAfterTerminate);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doFinally(@cfb InterfaceC7776j8 onFinally) {
        Objects.requireNonNull(onFinally, "onFinally is null");
        return ofe.onAssembly(new vb6(this, onFinally));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doOnCancel(@cfb InterfaceC7776j8 onCancel) {
        return doOnLifecycle(r07.emptyConsumer(), r07.f76643g, onCancel);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doOnComplete(@cfb InterfaceC7776j8 onComplete) {
        return doOnEach(r07.emptyConsumer(), r07.emptyConsumer(), onComplete, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doOnError(@cfb uu2<? super Throwable> onError) {
        uu2<? super T> uu2VarEmptyConsumer = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnEach(uu2VarEmptyConsumer, onError, interfaceC7776j8, interfaceC7776j8);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doOnLifecycle(@cfb uu2<? super fdg> onSubscribe, @cfb xk9 onRequest, @cfb InterfaceC7776j8 onCancel) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        Objects.requireNonNull(onRequest, "onRequest is null");
        Objects.requireNonNull(onCancel, "onCancel is null");
        return ofe.onAssembly(new zb6(this, onSubscribe, onRequest, onCancel));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doOnNext(@cfb uu2<? super T> onNext) {
        uu2<? super Throwable> uu2VarEmptyConsumer = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return doOnEach(onNext, uu2VarEmptyConsumer, interfaceC7776j8, interfaceC7776j8);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doOnRequest(@cfb xk9 onRequest) {
        return doOnLifecycle(r07.emptyConsumer(), onRequest, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doOnSubscribe(@cfb uu2<? super fdg> onSubscribe) {
        return doOnLifecycle(onSubscribe, r07.f76643g, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doOnTerminate(@cfb InterfaceC7776j8 onTerminate) {
        return doOnEach(r07.emptyConsumer(), r07.actionConsumer(onTerminate), onTerminate, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final r4a<T> elementAt(long index) {
        if (index >= 0) {
            return ofe.onAssembly(new dc6(this, index));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + index);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final kjf<T> elementAtOrError(long index) {
        if (index >= 0) {
            return ofe.onAssembly(new gc6(this, index, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + index);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> filter(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new oc6(this, predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final kjf<T> first(@cfb T defaultItem) {
        return elementAt(0L, defaultItem);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final r4a<T> firstElement() {
        return elementAt(0L);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final kjf<T> firstOrError() {
        return elementAtOrError(0L);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final CompletionStage<T> firstOrErrorStage() {
        return (CompletionStage) subscribeWith(new pc6(false, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final CompletionStage<T> firstStage(@dib T defaultItem) {
        return (CompletionStage) subscribeWith(new pc6(true, defaultItem));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper) {
        return flatMap((sy6) mapper, false, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final xd2 flatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper) {
        return flatMapCompletable(mapper, false, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> l86<U> flatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        return flatMapIterable(mapper, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> l86<R> flatMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        return flatMapMaybe(mapper, false, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> l86<R> flatMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        return flatMapSingle(mapper, false, Integer.MAX_VALUE);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMapStream(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper) {
        return flatMapStream(mapper, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.NONE)
    @cfb
    public final lf4 forEach(@cfb uu2<? super T> onNext) {
        return subscribe(onNext);
    }

    @cy1
    @gpe("none")
    @zo0(to0.NONE)
    @cfb
    public final lf4 forEachWhile(@cfb n8d<? super T> onNext) {
        return forEachWhile(onNext, r07.f76642f, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <K> l86<rb7<K, T>> groupBy(@cfb sy6<? super T, ? extends K> sy6Var) {
        return (l86<rb7<K, T>>) groupBy(sy6Var, r07.identity(), false, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <TRight, TLeftEnd, TRightEnd, R> l86<R> groupJoin(@cfb zjd<? extends TRight> other, @cfb sy6<? super T, ? extends zjd<TLeftEnd>> leftEnd, @cfb sy6<? super TRight, ? extends zjd<TRightEnd>> rightEnd, @cfb i11<? super T, ? super l86<TRight>, ? extends R> resultSelector) {
        Objects.requireNonNull(other, "other is null");
        Objects.requireNonNull(leftEnd, "leftEnd is null");
        Objects.requireNonNull(rightEnd, "rightEnd is null");
        Objects.requireNonNull(resultSelector, "resultSelector is null");
        return ofe.onAssembly(new de6(this, other, leftEnd, rightEnd, resultSelector));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> hide() {
        return ofe.onAssembly(new fe6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final xd2 ignoreElements() {
        return ofe.onAssembly(new je6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<Boolean> isEmpty() {
        return all(r07.alwaysFalse());
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <TRight, TLeftEnd, TRightEnd, R> l86<R> join(@cfb zjd<? extends TRight> other, @cfb sy6<? super T, ? extends zjd<TLeftEnd>> leftEnd, @cfb sy6<? super TRight, ? extends zjd<TRightEnd>> rightEnd, @cfb i11<? super T, ? super TRight, ? extends R> resultSelector) {
        Objects.requireNonNull(other, "other is null");
        Objects.requireNonNull(leftEnd, "leftEnd is null");
        Objects.requireNonNull(rightEnd, "rightEnd is null");
        Objects.requireNonNull(resultSelector, "resultSelector is null");
        return ofe.onAssembly(new re6(this, other, leftEnd, rightEnd, resultSelector));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<T> last(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        return ofe.onAssembly(new xe6(this, defaultItem));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final r4a<T> lastElement() {
        return ofe.onAssembly(new ve6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<T> lastOrError() {
        return ofe.onAssembly(new xe6(this, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final CompletionStage<T> lastOrErrorStage() {
        return (CompletionStage) subscribeWith(new ye6(false, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final CompletionStage<T> lastStage(@dib T defaultItem) {
        return (CompletionStage) subscribeWith(new ye6(true, defaultItem));
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final <R> l86<R> lift(@cfb og6<? extends R, ? super T> lifter) {
        Objects.requireNonNull(lifter, "lifter is null");
        return ofe.onAssembly(new ze6(this, lifter));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> l86<R> map(@cfb sy6<? super T, ? extends R> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new df6(this, mapper));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> mapOptional(@cfb sy6<? super T, Optional<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new gf6(this, mapper));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<jgb<T>> materialize() {
        return ofe.onAssembly(new kf6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> mergeWith(@cfb zjd<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return merge(this, other);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> observeOn(@cfb woe scheduler) {
        return observeOn(scheduler, false, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <U> l86<U> ofType(@cfb Class<U> clazz) {
        Objects.requireNonNull(clazz, "clazz is null");
        return filter(r07.isInstanceOf(clazz)).cast(clazz);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> onBackpressureBuffer() {
        return onBackpressureBuffer(bufferSize(), false, true);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> onBackpressureDrop() {
        return ofe.onAssembly(new ag6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> onBackpressureLatest() {
        return ofe.onAssembly(new eg6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> onBackpressureReduce(@cfb i11<T, T, T> reducer) {
        Objects.requireNonNull(reducer, "reducer is null");
        return ofe.onAssembly(new fg6(this, reducer));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> onErrorComplete() {
        return onErrorComplete(r07.alwaysTrue());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> onErrorResumeNext(@cfb sy6<? super Throwable, ? extends zjd<? extends T>> fallbackSupplier) {
        Objects.requireNonNull(fallbackSupplier, "fallbackSupplier is null");
        return ofe.onAssembly(new jg6(this, fallbackSupplier));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> onErrorResumeWith(@cfb zjd<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return onErrorResumeNext(r07.justFunction(fallback));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> onErrorReturn(@cfb sy6<? super Throwable, ? extends T> itemSupplier) {
        Objects.requireNonNull(itemSupplier, "itemSupplier is null");
        return ofe.onAssembly(new lg6(this, itemSupplier));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> onErrorReturnItem(@cfb T item) {
        Objects.requireNonNull(item, "item is null");
        return onErrorReturn(r07.justFunction(item));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> onTerminateDetach() {
        return ofe.onAssembly(new nb6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final eec<T> parallel() {
        return eec.from(this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> publish() {
        return publish(bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> rebatchRequests(int n) {
        return observeOn(sw7.f83154c, true, n);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final r4a<T> reduce(@cfb i11<T, T, T> reducer) {
        Objects.requireNonNull(reducer, "reducer is null");
        return ofe.onAssembly(new fh6(this, reducer));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> kjf<R> reduceWith(@cfb nfg<R> seedSupplier, @cfb i11<R, ? super T, R> reducer) {
        Objects.requireNonNull(seedSupplier, "seedSupplier is null");
        Objects.requireNonNull(reducer, "reducer is null");
        return ofe.onAssembly(new ih6(this, seedSupplier, reducer));
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
        Objects.requireNonNull(stop, "stop is null");
        return ofe.onAssembly(new ph6(this, stop));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> repeatWhen(@cfb sy6<? super l86<Object>, ? extends zjd<?>> handler) {
        Objects.requireNonNull(handler, "handler is null");
        return ofe.onAssembly(new rh6(this, handler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> replay() {
        return th6.createFrom(this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> retry() {
        return retry(Long.MAX_VALUE, r07.alwaysTrue());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> retryUntil(@cfb cb1 stop) {
        Objects.requireNonNull(stop, "stop is null");
        return retry(Long.MAX_VALUE, r07.predicateReverseFor(stop));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> retryWhen(@cfb sy6<? super l86<Throwable>, ? extends zjd<?>> handler) {
        Objects.requireNonNull(handler, "handler is null");
        return ofe.onAssembly(new zh6(this, handler));
    }

    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    public final void safeSubscribe(@cfb ycg<? super T> subscriber) {
        Objects.requireNonNull(subscriber, "subscriber is null");
        if (subscriber instanceof ble) {
            subscribe((kj6) subscriber);
        } else {
            subscribe((kj6) new ble(subscriber));
        }
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> sample(long period, @cfb TimeUnit unit) {
        return sample(period, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> scan(@cfb i11<T, T, T> accumulator) {
        Objects.requireNonNull(accumulator, "accumulator is null");
        return ofe.onAssembly(new hi6(this, accumulator));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> scanWith(@cfb nfg<R> seedSupplier, @cfb i11<R, ? super T, R> accumulator) {
        Objects.requireNonNull(seedSupplier, "seedSupplier is null");
        Objects.requireNonNull(accumulator, "accumulator is null");
        return ofe.onAssembly(new ji6(this, seedSupplier, accumulator));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> serialize() {
        return ofe.onAssembly(new oi6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> share() {
        return publish().refCount();
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<T> single(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        return ofe.onAssembly(new vi6(this, defaultItem));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final r4a<T> singleElement() {
        return ofe.onAssembly(new ti6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<T> singleOrError() {
        return ofe.onAssembly(new vi6(this, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final CompletionStage<T> singleOrErrorStage() {
        return (CompletionStage) subscribeWith(new wi6(false, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final CompletionStage<T> singleStage(@dib T defaultItem) {
        return (CompletionStage) subscribeWith(new wi6(true, defaultItem));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> skip(long count) {
        if (count >= 0) {
            return count == 0 ? ofe.onAssembly(this) : ofe.onAssembly(new yi6(this, count));
        }
        throw new IllegalArgumentException("count >= 0 expected but it was " + count);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> skipLast(int count) {
        if (count >= 0) {
            return count == 0 ? ofe.onAssembly(this) : ofe.onAssembly(new aj6(this, count));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + count);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> l86<T> skipUntil(@cfb zjd<U> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new ej6(this, other));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> skipWhile(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new gj6(this, predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> sorted() {
        return toList().toFlowable().map(r07.listSorter(r07.naturalComparator())).flatMapIterable(r07.identity());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return concat(xd2.wrap(other).toFlowable(), this);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWithArray(@cfb T... items) {
        l86 l86VarFromArray = fromArray(items);
        return l86VarFromArray == empty() ? ofe.onAssembly(this) : concatArray(l86VarFromArray, this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWithItem(@cfb T item) {
        Objects.requireNonNull(item, "item is null");
        return concatArray(just(item), this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWithIterable(@cfb Iterable<? extends T> items) {
        return concatArray(fromIterable(items), this);
    }

    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final lf4 subscribe() {
        return subscribe(r07.emptyConsumer(), r07.f76642f, r07.f76639c);
    }

    public abstract void subscribeActual(@cfb ycg<? super T> subscriber);

    @cy1
    @gpe("custom")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> subscribeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return subscribeOn(scheduler, !(this instanceof za6));
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final <E extends ycg<? super T>> E subscribeWith(E subscriber) {
        subscribe(subscriber);
        return subscriber;
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> switchIfEmpty(@cfb zjd<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new nj6(this, other));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> switchMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper) {
        return switchMap(mapper, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final xd2 switchMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new rj6(this, mapper, false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final xd2 switchMapCompletableDelayError(@cfb sy6<? super T, ? extends ph2> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new rj6(this, mapper, true));
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final <R> l86<R> switchMapDelayError(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper) {
        return switchMapDelayError(mapper, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> l86<R> switchMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new uj6(this, mapper, false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> l86<R> switchMapMaybeDelayError(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new uj6(this, mapper, true));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> l86<R> switchMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new xj6(this, mapper, false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> l86<R> switchMapSingleDelayError(@cfb sy6<? super T, ? extends oof<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new xj6(this, mapper, true));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> take(long count) {
        if (count >= 0) {
            return ofe.onAssembly(new ak6(this, count));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + count);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> takeLast(int count) {
        if (count >= 0) {
            return count == 0 ? ofe.onAssembly(new he6(this)) : count == 1 ? ofe.onAssembly(new ek6(this)) : ofe.onAssembly(new ck6(this, count));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + count);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> takeUntil(@cfb n8d<? super T> stopPredicate) {
        Objects.requireNonNull(stopPredicate, "stopPredicate is null");
        return ofe.onAssembly(new mk6(this, stopPredicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> takeWhile(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new ok6(this, predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final lpg<T> test() {
        lpg<T> lpgVar = new lpg<>();
        subscribe((kj6) lpgVar);
        return lpgVar;
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> throttleFirst(long windowDuration, @cfb TimeUnit unit) {
        return throttleFirst(windowDuration, unit, mpe.computation());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> throttleLast(long intervalDuration, @cfb TimeUnit unit) {
        return sample(intervalDuration, unit);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> throttleLatest(long timeout, @cfb TimeUnit unit) {
        return throttleLatest(timeout, unit, mpe.computation(), false);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> throttleWithTimeout(long timeout, @cfb TimeUnit unit) {
        return debounce(timeout, unit);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<j1h<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <V> l86<T> timeout(@cfb sy6<? super T, ? extends zjd<V>> itemTimeoutIndicator) {
        return timeout0(null, itemTimeoutIndicator, null);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<j1h<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    /* JADX INFO: renamed from: to */
    public final <R> R m15964to(@cfb sa6<T, ? extends R> converter) {
        Objects.requireNonNull(converter, "converter is null");
        return converter.apply(this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new q17());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<List<T>> toList() {
        return ofe.onAssembly(new el6(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <K> kjf<Map<K, T>> toMap(@cfb sy6<? super T, ? extends K> sy6Var) {
        Objects.requireNonNull(sy6Var, "keySelector is null");
        return (kjf<Map<K, T>>) collect(oh7.asSupplier(), r07.toMapKeySelector(sy6Var));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <K> kjf<Map<K, Collection<T>>> toMultimap(@cfb sy6<? super T, ? extends K> sy6Var) {
        return (kjf<Map<K, Collection<T>>>) toMultimap(sy6Var, r07.identity(), oh7.asSupplier(), u60.asFunction());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final vkb<T> toObservable() {
        return ofe.onAssembly(new upb(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<List<T>> toSortedList() {
        return toSortedList(r07.naturalComparator());
    }

    @cy1
    @gpe("custom")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> unsubscribeOn(@cfb woe scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new il6(this, scheduler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<l86<T>> window(long count) {
        return window(count, count, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <U, R> l86<R> withLatestFrom(@cfb zjd<? extends U> other, @cfb i11<? super T, ? super U, ? extends R> combiner) {
        Objects.requireNonNull(other, "other is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return ofe.onAssembly(new wl6(this, combiner, other));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, R> l86<R> zipWith(@cfb Iterable<U> other, @cfb i11<? super T, ? super U, ? extends R> zipper) {
        Objects.requireNonNull(other, "other is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return ofe.onAssembly(new cm6(this, other, zipper));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> combineLatest(@cfb Iterable<? extends zjd<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> combiner, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        Objects.requireNonNull(combiner, "combiner is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new t96((Iterable) sources, (sy6) combiner, bufferSize, false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> combineLatestArray(@cfb zjd<? extends T>[] sources, @cfb sy6<? super Object[], ? extends R> combiner, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        if (sources.length == 0) {
            return empty();
        }
        Objects.requireNonNull(combiner, "combiner is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new t96((zjd[]) sources, (sy6) combiner, bufferSize, false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> combineLatestArrayDelayError(@cfb zjd<? extends T>[] sources, @cfb sy6<? super Object[], ? extends R> combiner, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        Objects.requireNonNull(combiner, "combiner is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return sources.length == 0 ? empty() : ofe.onAssembly(new t96((zjd[]) sources, (sy6) combiner, bufferSize, true));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> combineLatestDelayError(@cfb Iterable<? extends zjd<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> combiner, int bufferSize) {
        Objects.requireNonNull(sources, "sources is null");
        Objects.requireNonNull(combiner, "combiner is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new t96((Iterable) sources, (sy6) combiner, bufferSize, true));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayEager(int maxConcurrency, int prefetch, @cfb zjd<? extends T>... sources) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ba6(new id6(sources), r07.identity(), maxConcurrency, prefetch, e55.IMMEDIATE));
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatArrayEagerDelayError(int maxConcurrency, int prefetch, @cfb zjd<? extends T>... sources) {
        return fromArray(sources).concatMapEagerDelayError(r07.identity(), true, maxConcurrency, prefetch);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb Iterable<? extends zjd<? extends T>> sources, int maxConcurrency, int prefetch) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ba6(new qd6(sources), r07.identity(), maxConcurrency, prefetch, e55.BOUNDARY));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb Iterable<? extends zjd<? extends T>> sources, int maxConcurrency, int prefetch) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ba6(new qd6(sources), r07.identity(), maxConcurrency, prefetch, e55.END));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public static l86<Long> interval(long initialDelay, long period, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new ne6(Math.max(0L, initialDelay), Math.max(0L, period), unit, scheduler));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public static l86<Long> intervalRange(long start, long count, long initialDelay, long period, @cfb TimeUnit unit, @cfb woe scheduler) {
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
        return ofe.onAssembly(new pe6(start, j, Math.max(0L, initialDelay), Math.max(0L, period), unit, scheduler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb Iterable<? extends zjd<? extends T>> sources) {
        return fromIterable(sources).flatMap(r07.identity());
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeArray(@cfb zjd<? extends T>... sources) {
        return fromArray(sources).flatMap(r07.identity(), sources.length);
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeArrayDelayError(@cfb zjd<? extends T>... sources) {
        return fromArray(sources).flatMap(r07.identity(), true, sources.length);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb Iterable<? extends zjd<? extends T>> sources, int maxConcurrency, int bufferSize) {
        return fromIterable(sources).flatMap(r07.identity(), true, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2, @cfb l11<? super T, ? super T> isEqual) {
        return sequenceEqual(source1, source2, isEqual, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> switchOnNext(@cfb zjd<? extends zjd<? extends T>> sources) {
        return fromPublisher(sources).switchMap(r07.identity());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> switchOnNextDelayError(@cfb zjd<? extends zjd<? extends T>> sources, int prefetch) {
        return fromPublisher(sources).switchMapDelayError(r07.identity(), prefetch);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public static l86<Long> timer(long delay, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new al6(Math.max(0L, delay), unit, scheduler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T, D> l86<T> using(@cfb nfg<? extends D> resourceSupplier, @cfb sy6<? super D, ? extends zjd<? extends T>> sourceSupplier, @cfb uu2<? super D> resourceCleanup, boolean eager) {
        Objects.requireNonNull(resourceSupplier, "resourceSupplier is null");
        Objects.requireNonNull(sourceSupplier, "sourceSupplier is null");
        Objects.requireNonNull(resourceCleanup, "resourceCleanup is null");
        return ofe.onAssembly(new kl6(resourceSupplier, sourceSupplier, resourceCleanup, eager));
    }

    @gpe("none")
    @zo0(to0.FULL)
    public final void blockingForEach(@cfb uu2<? super T> onNext, int bufferSize) {
        Objects.requireNonNull(onNext, "onNext is null");
        Iterator<T> it = blockingIterable(bufferSize).iterator();
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
    @zo0(to0.FULL)
    @cfb
    public final Iterable<T> blockingIterable(int bufferSize) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        return new l71(this, bufferSize);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final T blockingSingle(@cfb T defaultItem) {
        return single(defaultItem).blockingGet();
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final Stream<T> blockingStream(int prefetch) {
        Iterator<T> it = blockingIterable(prefetch).iterator();
        Stream stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false);
        lf4 lf4Var = (lf4) it;
        lf4Var.getClass();
        return (Stream) stream.onClose(new i86(lf4Var));
    }

    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    public final void blockingSubscribe(@cfb uu2<? super T> onNext) {
        z86.subscribe(this, onNext, r07.f76642f, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<List<T>> buffer(int i, int i2) {
        return (l86<List<T>>) buffer(i, i2, u60.asSupplier());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        if (!(this instanceof lme)) {
            return ofe.onAssembly(new x96(this, mapper, prefetch, e55.IMMEDIATE));
        }
        Object obj = ((lme) this).get();
        return obj == null ? empty() : fi6.scalarXMap(obj, mapper);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final xd2 concatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new z96(this, mapper, e55.IMMEDIATE, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final xd2 concatMapCompletableDelayError(@cfb sy6<? super T, ? extends ph2> mapper, boolean tillTheEnd) {
        return concatMapCompletableDelayError(mapper, tillTheEnd, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapDelayError(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean tillTheEnd, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        if (!(this instanceof lme)) {
            return ofe.onAssembly(new x96(this, mapper, prefetch, tillTheEnd ? e55.END : e55.BOUNDARY));
        }
        Object obj = ((lme) this).get();
        return obj == null ? empty() : fi6.scalarXMap(obj, mapper);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapEager(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, int maxConcurrency, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ba6(this, mapper, maxConcurrency, prefetch, e55.IMMEDIATE));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapEagerDelayError(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean tillTheEnd, int maxConcurrency, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ba6(this, mapper, maxConcurrency, prefetch, tillTheEnd ? e55.END : e55.BOUNDARY));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> l86<U> concatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new fd6(this, mapper, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new fa6(this, mapper, e55.IMMEDIATE, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapMaybeDelayError(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper, boolean tillTheEnd) {
        return concatMapMaybeDelayError(mapper, tillTheEnd, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ka6(this, mapper, e55.IMMEDIATE, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapSingleDelayError(@cfb sy6<? super T, ? extends oof<? extends R>> mapper, boolean tillTheEnd) {
        return concatMapSingleDelayError(mapper, tillTheEnd, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapStream(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new dd6(this, mapper, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <K> l86<T> distinct(@cfb sy6<? super T, K> keySelector) {
        return distinct(keySelector, r07.createHashSet());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <K> l86<T> distinctUntilChanged(@cfb sy6<? super T, K> keySelector) {
        Objects.requireNonNull(keySelector, "keySelector is null");
        return ofe.onAssembly(new rb6(this, keySelector, yjb.equalsPredicate()));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean delayErrors) {
        return flatMap(mapper, delayErrors, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final xd2 flatMapCompletable(@cfb sy6<? super T, ? extends ph2> mapper, boolean delayErrors, int maxConcurrency) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        return ofe.onAssembly(new vc6(this, mapper, delayErrors, maxConcurrency));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> l86<U> flatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new fd6(this, mapper, bufferSize));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> l86<R> flatMapMaybe(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayErrors, int maxConcurrency) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        return ofe.onAssembly(new xc6(this, mapper, delayErrors, maxConcurrency));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> l86<R> flatMapSingle(@cfb sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayErrors, int maxConcurrency) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        return ofe.onAssembly(new bd6(this, mapper, delayErrors, maxConcurrency));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMapStream(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new dd6(this, mapper, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.NONE)
    @cfb
    public final lf4 forEachWhile(@cfb n8d<? super T> onNext, @cfb uu2<? super Throwable> onError) {
        return forEachWhile(onNext, onError, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <K> l86<rb7<K, T>> groupBy(@cfb sy6<? super T, ? extends K> sy6Var, boolean z) {
        return (l86<rb7<K, T>>) groupBy(sy6Var, r07.identity(), z, bufferSize());
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> observeOn(@cfb woe scheduler, boolean delayError) {
        return observeOn(scheduler, delayError, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> onBackpressureBuffer(boolean delayError) {
        return onBackpressureBuffer(bufferSize(), delayError, true);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> onBackpressureDrop(@cfb uu2<? super T> onDrop) {
        Objects.requireNonNull(onDrop, "onDrop is null");
        return ofe.onAssembly(new ag6(this, onDrop));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> onErrorComplete(@cfb n8d<? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new hg6(this, predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final eec<T> parallel(int parallelism) {
        return eec.from(this, parallelism);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> publish(@cfb sy6<? super l86<T>, ? extends zjd<R>> selector) {
        return publish(selector, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> repeat(long times) {
        if (times >= 0) {
            return times == 0 ? empty() : ofe.onAssembly(new nh6(this, times));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + times);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> replay(@cfb sy6<? super l86<T>, ? extends zjd<R>> selector) {
        Objects.requireNonNull(selector, "selector is null");
        return th6.multicastSelector(le6.replaySupplier(this), selector);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> retry(@cfb l11<? super Integer, ? super Throwable> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new vh6(this, predicate));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> sample(long period, @cfb TimeUnit unit, boolean emitLast) {
        return sample(period, unit, mpe.computation(), emitLast);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> sorted(@cfb Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return toList().toFlowable().map(r07.listSorter(comparator)).flatMapIterable(r07.identity());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onNext) {
        return subscribe(onNext, r07.f76642f, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> switchMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, int bufferSize) {
        return m15963a(mapper, bufferSize, false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final <R> l86<R> switchMapDelayError(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, int bufferSize) {
        return m15963a(mapper, bufferSize, true);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> throttleFirst(long skipDuration, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new qk6(this, skipDuration, unit, scheduler));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> throttleLast(long intervalDuration, @cfb TimeUnit unit, @cfb woe scheduler) {
        return sample(intervalDuration, unit, scheduler);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> throttleLatest(long timeout, @cfb TimeUnit unit, boolean emitLast) {
        return throttleLatest(timeout, unit, mpe.computation(), emitLast);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> throttleWithTimeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return debounce(timeout, unit, scheduler);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<j1h<T>> timeInterval(@cfb woe scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <V> l86<T> timeout(@cfb sy6<? super T, ? extends zjd<V>> itemTimeoutIndicator, @cfb zjd<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(null, itemTimeoutIndicator, fallback);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<j1h<T>> timestamp(@cfb woe scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<List<T>> toList(int capacityHint) {
        yjb.verifyPositive(capacityHint, "capacityHint");
        return ofe.onAssembly(new el6(this, r07.createArrayList(capacityHint)));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<List<T>> toSortedList(@cfb Comparator<? super T> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (kjf<List<T>>) toList().map(r07.listSorter(comparator));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<l86<T>> window(long count, long skip) {
        return window(count, skip, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb zjd<? extends zjd<? extends T>> sources) {
        return concat(sources, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatDelayError(@cfb zjd<? extends zjd<? extends T>> sources) {
        return concatDelayError(sources, bufferSize(), true);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> l86<T> error(@cfb Throwable throwable) {
        Objects.requireNonNull(throwable, "throwable is null");
        return error((nfg<? extends Throwable>) r07.justSupplier(throwable));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> fromFuture(@cfb Future<? extends T> future, long timeout, @cfb TimeUnit unit) {
        Objects.requireNonNull(future, "future is null");
        Objects.requireNonNull(unit, "unit is null");
        return ofe.onAssembly(new nd6(future, timeout, unit));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> just(T item1, T item2) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        return fromArray(item1, item2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb Iterable<? extends zjd<? extends T>> sources, int maxConcurrency) {
        return fromIterable(sources).flatMap(r07.identity(), maxConcurrency);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb Iterable<? extends zjd<? extends T>> sources, int maxConcurrency) {
        return fromIterable(sources).flatMap(r07.identity(), true, maxConcurrency);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2, @cfb l11<? super T, ? super T> isEqual, int bufferSize) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(isEqual, "isEqual is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new ni6(source1, source2, isEqual, bufferSize));
    }

    @gpe("none")
    @zo0(to0.FULL)
    public final void blockingSubscribe(@cfb uu2<? super T> onNext, int bufferSize) {
        z86.subscribe(this, onNext, r07.f76642f, r07.f76639c, bufferSize);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U extends Collection<? super T>> l86<U> buffer(int count, int skip, @cfb nfg<U> bufferSupplier) {
        yjb.verifyPositive(count, "count");
        yjb.verifyPositive(skip, RadialViewGroup.f22860u2);
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
        return ofe.onAssembly(new c96(this, count, skip, bufferSupplier));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final xd2 concatMapCompletableDelayError(@cfb sy6<? super T, ? extends ph2> mapper, boolean tillTheEnd, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new z96(this, mapper, tillTheEnd ? e55.END : e55.BOUNDARY, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapMaybeDelayError(@cfb sy6<? super T, ? extends z9a<? extends R>> mapper, boolean tillTheEnd, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new fa6(this, mapper, tillTheEnd ? e55.END : e55.BOUNDARY, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapSingleDelayError(@cfb sy6<? super T, ? extends oof<? extends R>> mapper, boolean tillTheEnd, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ka6(this, mapper, tillTheEnd ? e55.END : e55.BOUNDARY, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> concatWith(@cfb oof<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new ra6(this, other));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> debounce(long timeout, @cfb TimeUnit unit) {
        return debounce(timeout, unit, mpe.computation());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> delay(long time, @cfb TimeUnit unit) {
        return delay(time, unit, mpe.computation(), false);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> delaySubscription(long time, @cfb TimeUnit unit) {
        return delaySubscription(time, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <K> l86<T> distinct(@cfb sy6<? super T, K> keySelector, @cfb nfg<? extends Collection<? super K>> collectionSupplier) {
        Objects.requireNonNull(keySelector, "keySelector is null");
        Objects.requireNonNull(collectionSupplier, "collectionSupplier is null");
        return ofe.onAssembly(new pb6(this, keySelector, collectionSupplier));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final kjf<T> elementAt(long index, @cfb T defaultItem) {
        if (index >= 0) {
            Objects.requireNonNull(defaultItem, "defaultItem is null");
            return ofe.onAssembly(new gc6(this, index, defaultItem));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + index);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, int maxConcurrency) {
        return flatMap((sy6) mapper, false, maxConcurrency, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.NONE)
    @cfb
    public final lf4 forEachWhile(@cfb n8d<? super T> onNext, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        sp6 sp6Var = new sp6(onNext, onError, onComplete);
        subscribe((kj6) sp6Var);
        return sp6Var;
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <K, V> l86<rb7<K, V>> groupBy(@cfb sy6<? super T, ? extends K> keySelector, @cfb sy6<? super T, ? extends V> valueSelector) {
        return groupBy(keySelector, valueSelector, false, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> mergeWith(@cfb oof<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new qf6(this, other));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> observeOn(@cfb woe scheduler, boolean delayError, int bufferSize) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new uf6(this, scheduler, delayError, bufferSize));
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> onBackpressureBuffer(int capacity) {
        return onBackpressureBuffer(capacity, false, false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> l86<R> onBackpressureReduce(@cfb nfg<R> supplier, @cfb i11<R, ? super T, R> reducer) {
        Objects.requireNonNull(supplier, "supplier is null");
        Objects.requireNonNull(reducer, "reducer is null");
        return ofe.onAssembly(new gg6(this, supplier, reducer));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final eec<T> parallel(int parallelism, int prefetch) {
        return eec.from(this, parallelism, prefetch);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> publish(@cfb sy6<? super l86<T>, ? extends zjd<? extends R>> selector, int prefetch) {
        Objects.requireNonNull(selector, "selector is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new xg6(this, selector, prefetch, false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> kjf<R> reduce(R seed, @cfb i11<R, ? super T, R> reducer) {
        Objects.requireNonNull(seed, "seed is null");
        Objects.requireNonNull(reducer, "reducer is null");
        return ofe.onAssembly(new hh6(this, seed, reducer));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> sample(long period, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new di6(this, period, unit, scheduler, false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> scan(R initialValue, @cfb i11<R, ? super T, R> accumulator) {
        Objects.requireNonNull(initialValue, "initialValue is null");
        return scanWith(r07.justSupplier(initialValue), accumulator);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWith(@cfb oof<T> other) {
        Objects.requireNonNull(other, "other is null");
        return concat(kjf.wrap(other).toFlowable(), this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError) {
        return subscribe(onNext, onError, r07.f76639c);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> subscribeOn(@cfb woe scheduler, boolean requestOn) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new jj6(this, scheduler, requestOn));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> take(long time, @cfb TimeUnit unit) {
        return takeUntil(timer(time, unit));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <U> l86<T> takeUntil(@cfb zjd<U> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new kk6(this, other));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final lpg<T> test(long initialRequest) {
        lpg<T> lpgVar = new lpg<>(initialRequest);
        subscribe((kj6) lpgVar);
        return lpgVar;
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> throttleLatest(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return throttleLatest(timeout, unit, scheduler, false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<j1h<T>> timeInterval(@cfb TimeUnit unit) {
        return timeInterval(unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<j1h<T>> timestamp(@cfb TimeUnit unit) {
        return timestamp(unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <K, V> kjf<Map<K, V>> toMap(@cfb sy6<? super T, ? extends K> sy6Var, @cfb sy6<? super T, ? extends V> sy6Var2) {
        Objects.requireNonNull(sy6Var, "keySelector is null");
        Objects.requireNonNull(sy6Var2, "valueSelector is null");
        return (kjf<Map<K, V>>) collect(oh7.asSupplier(), r07.toMapKeyValueSelector(sy6Var, sy6Var2));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<l86<T>> window(long count, long skip, int bufferSize) {
        yjb.verifyPositive(skip, RadialViewGroup.f22860u2);
        yjb.verifyPositive(count, "count");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new ml6(this, count, skip, bufferSize));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb zjd<? extends zjd<? extends T>> sources, int prefetch) {
        return fromPublisher(sources).concatMap(r07.identity(), prefetch);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatDelayError(@cfb zjd<? extends zjd<? extends T>> sources, int prefetch, boolean tillTheEnd) {
        return fromPublisher(sources).concatMapDelayError(r07.identity(), tillTheEnd, prefetch);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb zjd<? extends zjd<? extends T>> sources) {
        return merge(sources, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb zjd<? extends zjd<? extends T>> sources) {
        return mergeDelayError(sources, bufferSize());
    }

    private <U, V> l86<T> timeout0(zjd<U> firstTimeoutIndicator, sy6<? super T, ? extends zjd<V>> itemTimeoutIndicator, zjd<? extends T> fallback) {
        Objects.requireNonNull(itemTimeoutIndicator, "itemTimeoutIndicator is null");
        return ofe.onAssembly(new wk6(this, firstTimeoutIndicator, itemTimeoutIndicator, fallback));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, R> l86<R> zip(@cfb Iterable<? extends zjd<? extends T>> sources, @cfb sy6<? super Object[], ? extends R> zipper, boolean delayError, int bufferSize) {
        Objects.requireNonNull(zipper, "zipper is null");
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new am6(null, sources, zipper, bufferSize, delayError));
    }

    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    public final void blockingSubscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError) {
        z86.subscribe(this, onNext, onError, r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R, A> kjf<R> collect(@cfb Collector<? super T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return ofe.onAssembly(new r96(this, collector));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> debounce(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new db6(this, timeout, unit, scheduler));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> delay(long time, @cfb TimeUnit unit, boolean delayError) {
        return delay(time, unit, mpe.computation(), delayError);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> delaySubscription(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return delaySubscription(timer(time, unit, scheduler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> distinctUntilChanged(@cfb l11<? super T, ? super T> comparer) {
        Objects.requireNonNull(comparer, "comparer is null");
        return ofe.onAssembly(new rb6(this, r07.identity(), comparer));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean delayErrors, int maxConcurrency) {
        return flatMap(mapper, delayErrors, maxConcurrency, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <K, V> l86<rb7<K, V>> groupBy(@cfb sy6<? super T, ? extends K> keySelector, @cfb sy6<? super T, ? extends V> valueSelector, boolean delayError) {
        return groupBy(keySelector, valueSelector, delayError, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> onBackpressureBuffer(int capacity, boolean delayError) {
        return onBackpressureBuffer(capacity, delayError, false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> replay(@cfb sy6<? super l86<T>, ? extends zjd<R>> selector, int bufferSize) {
        Objects.requireNonNull(selector, "selector is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return th6.multicastSelector(le6.replaySupplier(this, bufferSize, false), selector);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> retry(long times) {
        return retry(times, r07.alwaysTrue());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> skip(long time, @cfb TimeUnit unit) {
        return skipUntil(timer(time, unit));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> skipLast(long time, @cfb TimeUnit unit) {
        return skipLast(time, unit, mpe.computation(), false, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        yt8 yt8Var = new yt8(onNext, onError, onComplete, le6.EnumC8792h.INSTANCE);
        subscribe((kj6) yt8Var);
        return yt8Var;
    }

    @cy1
    @gpe("custom")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> take(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return takeUntil(timer(time, unit, scheduler));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> throttleLatest(long timeout, @cfb TimeUnit unit, @cfb woe scheduler, boolean emitLast) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new sk6(this, timeout, unit, scheduler, emitLast));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<j1h<T>> timeInterval(@cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new uk6(this, unit, scheduler));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> timeout(long timeout, @cfb TimeUnit unit) {
        return timeout0(timeout, unit, null, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<j1h<T>> timestamp(@cfb TimeUnit timeUnit, @cfb woe woeVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(woeVar, "scheduler is null");
        return (l86<j1h<T>>) map(r07.timestampWith(timeUnit, woeVar));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <U extends Collection<? super T>> kjf<U> toList(@cfb nfg<U> collectionSupplier) {
        Objects.requireNonNull(collectionSupplier, "collectionSupplier is null");
        return ofe.onAssembly(new el6(this, collectionSupplier));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<List<T>> toSortedList(@cfb Comparator<? super T> comparator, int i) {
        Objects.requireNonNull(comparator, "comparator is null");
        return (kjf<List<T>>) toList(i).map(r07.listSorter(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <T1, T2, R> l86<R> withLatestFrom(@cfb zjd<T1> source1, @cfb zjd<T2> source2, @cfb jz6<? super T, ? super T1, ? super T2, R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return withLatestFrom((zjd<?>[]) new zjd[]{source1, source2}, r07.toFunction(combiner));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, R> l86<R> zipWith(@cfb zjd<? extends U> other, @cfb i11<? super T, ? super U, ? extends R> zipper) {
        Objects.requireNonNull(other, "other is null");
        return zip(this, other, zipper);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return concatArray(source1, source2);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public static l86<Long> interval(long period, @cfb TimeUnit unit) {
        return interval(period, period, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb zjd<? extends zjd<? extends T>> sources, int maxConcurrency) {
        return fromPublisher(sources).flatMap(r07.identity(), maxConcurrency);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb zjd<? extends zjd<? extends T>> sources, int maxConcurrency) {
        return fromPublisher(sources).flatMap(r07.identity(), true, maxConcurrency);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final T blockingFirst(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        i71 i71Var = new i71();
        subscribe((kj6) i71Var);
        T tBlockingGet = i71Var.blockingGet();
        return tBlockingGet != null ? tBlockingGet : defaultItem;
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final T blockingLast(@cfb T defaultItem) {
        Objects.requireNonNull(defaultItem, "defaultItem is null");
        y71 y71Var = new y71();
        subscribe((kj6) y71Var);
        T tBlockingGet = y71Var.blockingGet();
        return tBlockingGet != null ? tBlockingGet : defaultItem;
    }

    @gpe("none")
    @zo0(to0.FULL)
    public final void blockingSubscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError, int bufferSize) {
        z86.subscribe(this, onNext, onError, r07.f76639c, bufferSize);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> concatWith(@cfb z9a<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new pa6(this, other));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> delay(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return delay(time, unit, scheduler, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean delayErrors, int maxConcurrency, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(bufferSize, "bufferSize");
        if (this instanceof lme) {
            Object obj = ((lme) this).get();
            if (obj == null) {
                return empty();
            }
            return fi6.scalarXMap(obj, mapper);
        }
        return ofe.onAssembly(new rc6(this, mapper, delayErrors, maxConcurrency, bufferSize));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, V> l86<V> flatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> sy6Var, @cfb i11<? super T, ? super U, ? extends V> i11Var) {
        Objects.requireNonNull(sy6Var, "mapper is null");
        Objects.requireNonNull(i11Var, "combiner is null");
        return (l86<V>) flatMap(le6.flatMapIntoIterable(sy6Var), i11Var, false, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final <K, V> l86<rb7<K, V>> groupBy(@cfb sy6<? super T, ? extends K> keySelector, @cfb sy6<? super T, ? extends V> valueSelector, boolean delayError, int bufferSize) {
        Objects.requireNonNull(keySelector, "keySelector is null");
        Objects.requireNonNull(valueSelector, "valueSelector is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new be6(this, keySelector, valueSelector, bufferSize, delayError, null));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> mergeWith(@cfb z9a<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new of6(this, other));
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final l86<T> onBackpressureBuffer(int capacity, boolean delayError, boolean unbounded) {
        yjb.verifyPositive(capacity, "capacity");
        return ofe.onAssembly(new wf6(this, capacity, unbounded, delayError, r07.f76639c));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> retry(long times, @cfb n8d<? super Throwable> predicate) {
        if (times >= 0) {
            Objects.requireNonNull(predicate, "predicate is null");
            return ofe.onAssembly(new xh6(this, times, predicate));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + times);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> skip(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return skipUntil(timer(time, unit, scheduler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> skipLast(long time, @cfb TimeUnit unit, boolean delayError) {
        return skipLast(time, unit, mpe.computation(), delayError, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWith(@cfb z9a<T> other) {
        Objects.requireNonNull(other, "other is null");
        return concat(r4a.wrap(other).toFlowable(), this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> takeLast(long count, long time, @cfb TimeUnit unit) {
        return takeLast(count, time, unit, mpe.computation(), false, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final lpg<T> test(long initialRequest, boolean cancel) {
        lpg<T> lpgVar = new lpg<>(initialRequest);
        if (cancel) {
            lpgVar.cancel();
        }
        subscribe((kj6) lpgVar);
        return lpgVar;
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> timeout(long timeout, @cfb TimeUnit unit, @cfb zjd<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(timeout, unit, fallback, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <K, V> kjf<Map<K, Collection<V>>> toMultimap(@cfb sy6<? super T, ? extends K> keySelector, @cfb sy6<? super T, ? extends V> valueSelector) {
        return toMultimap(keySelector, valueSelector, oh7.asSupplier(), u60.asFunction());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, R> l86<R> combineLatest(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb i11<? super T1, ? super T2, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new zjd[]{source1, source2}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb zjd<? extends zjd<? extends T>> sources) {
        return concatEager(sources, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb zjd<? extends zjd<? extends T>> sources) {
        return concatEagerDelayError(sources, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, S> l86<T> generate(@cfb nfg<S> initialState, @cfb e11<S, qy4<T>> generator) {
        Objects.requireNonNull(generator, "generator is null");
        return generate(initialState, le6.simpleBiGenerator(generator), r07.emptyConsumer());
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public static l86<Long> interval(long period, @cfb TimeUnit unit, @cfb woe scheduler) {
        return interval(period, period, unit, scheduler);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> just(T item1, T item2, T item3) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        return fromArray(item1, item2, item3);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return fromArray(source1, source2).flatMap(r07.identity(), false, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        return fromArray(source1, source2).flatMap(r07.identity(), true, 2);
    }

    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    public final void blockingSubscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete) {
        z86.subscribe(this, onNext, onError, onComplete);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> delay(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new hb6(this, Math.max(0L, time), unit, scheduler, delayError));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doOnEach(@cfb uu2<? super jgb<T>> onNotification) {
        Objects.requireNonNull(onNotification, "onNotification is null");
        return doOnEach(r07.notificationOnNext(onNotification), r07.notificationOnError(onNotification), r07.notificationOnComplete(onNotification), r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> publish(int bufferSize) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly((mr2) new tg6(this, bufferSize));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> sample(long period, @cfb TimeUnit unit, @cfb woe scheduler, boolean emitLast) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new di6(this, period, unit, scheduler, emitLast));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> skipLast(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return skipLast(time, unit, scheduler, false, bufferSize());
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> takeLast(long count, long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return takeLast(count, time, unit, scheduler, false, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <K, V> kjf<Map<K, V>> toMap(@cfb sy6<? super T, ? extends K> sy6Var, @cfb sy6<? super T, ? extends V> sy6Var2, @cfb nfg<? extends Map<K, V>> nfgVar) {
        Objects.requireNonNull(sy6Var, "keySelector is null");
        Objects.requireNonNull(sy6Var2, "valueSelector is null");
        return (kjf<Map<K, V>>) collect(nfgVar, r07.toMapKeyValueSelector(sy6Var, sy6Var2));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final kjf<List<T>> toSortedList(int capacityHint) {
        return toSortedList(r07.naturalComparator(), capacityHint);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, R> l86<R> zipWith(@cfb zjd<? extends U> other, @cfb i11<? super T, ? super U, ? extends R> zipper, boolean delayError) {
        return zip(this, other, zipper, delayError);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEager(@cfb zjd<? extends zjd<? extends T>> sources, int maxConcurrency, int prefetch) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ca6(sources, r07.identity(), maxConcurrency, prefetch, e55.IMMEDIATE));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concatEagerDelayError(@cfb zjd<? extends zjd<? extends T>> sources, int maxConcurrency, int prefetch) {
        Objects.requireNonNull(sources, "sources is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new ca6(sources, r07.identity(), maxConcurrency, prefetch, e55.END));
    }

    @gpe("none")
    @zo0(to0.FULL)
    public final void blockingSubscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete, int bufferSize) {
        z86.subscribe(this, onNext, onError, onComplete, bufferSize);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U extends Collection<? super T>> l86<U> buffer(int count, @cfb nfg<U> bufferSupplier) {
        return buffer(count, count, bufferSupplier);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> concatWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new na6(this, other));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> mergeWith(@cfb ph2 other) {
        Objects.requireNonNull(other, "other is null");
        return ofe.onAssembly(new mf6(this, other));
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final l86<T> onBackpressureBuffer(int capacity, boolean delayError, boolean unbounded, @cfb InterfaceC7776j8 onOverflow) {
        Objects.requireNonNull(onOverflow, "onOverflow is null");
        yjb.verifyPositive(capacity, "capacity");
        return ofe.onAssembly(new wf6(this, capacity, unbounded, delayError, onOverflow));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> replay(@cfb sy6<? super l86<T>, ? extends zjd<R>> selector, int bufferSize, boolean eagerTruncate) {
        Objects.requireNonNull(selector, "selector is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return th6.multicastSelector(le6.replaySupplier(this, bufferSize, eagerTruncate), selector);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> skipLast(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError) {
        return skipLast(time, unit, scheduler, delayError, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> startWith(@cfb zjd<? extends T> other) {
        Objects.requireNonNull(other, "other is null");
        return concatArray(other, this);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> takeLast(long count, long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError, int bufferSize) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        if (count >= 0) {
            return ofe.onAssembly(new gk6(this, count, time, unit, scheduler, bufferSize, delayError));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + count);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> timeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler, @cfb zjd<? extends T> fallback) {
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(timeout, unit, fallback, scheduler);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<l86<T>> window(long timespan, long timeskip, @cfb TimeUnit unit) {
        return window(timespan, timeskip, unit, mpe.computation(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, R> l86<R> zipWith(@cfb zjd<? extends U> other, @cfb i11<? super T, ? super U, ? extends R> zipper, boolean delayError, int bufferSize) {
        return zip(this, other, zipper, delayError, bufferSize);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2, @cfb zjd<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return concatArray(source1, source2, source3);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> kjf<Boolean> sequenceEqual(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2, int bufferSize) {
        return sequenceEqual(source1, source2, yjb.equalsPredicate(), bufferSize);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, R> l86<R> zip(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb i11<? super T1, ? super T2, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2);
    }

    @gpe("none")
    @zo0(to0.SPECIAL)
    public final void blockingSubscribe(@cfb ycg<? super T> subscriber) {
        Objects.requireNonNull(subscriber, "subscriber is null");
        z86.subscribe(this, subscriber);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<List<T>> buffer(long j, long j2, @cfb TimeUnit timeUnit) {
        return (l86<List<T>>) buffer(j, j2, timeUnit, mpe.computation(), u60.asSupplier());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, V> l86<V> flatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> sy6Var, @cfb i11<? super T, ? super U, ? extends V> i11Var, int i) {
        Objects.requireNonNull(sy6Var, "mapper is null");
        Objects.requireNonNull(i11Var, "combiner is null");
        return (l86<V>) flatMap(le6.flatMapIntoIterable(sy6Var), i11Var, false, bufferSize(), i);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> retry(@cfb n8d<? super Throwable> predicate) {
        return retry(Long.MAX_VALUE, predicate);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> skipLast(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError, int bufferSize) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new cj6(this, time, unit, scheduler, bufferSize << 1, delayError));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
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
    @zo0(to0.ERROR)
    @cfb
    public final l86<l86<T>> window(long timespan, long timeskip, @cfb TimeUnit unit, @cfb woe scheduler) {
        return window(timespan, timeskip, unit, scheduler, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2, @cfb zjd<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return fromArray(source1, source2, source3).flatMap(r07.identity(), false, 3);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2, @cfb zjd<? extends T> source3) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        return fromArray(source1, source2, source3).flatMap(r07.identity(), true, 3);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<List<T>> buffer(long j, long j2, @cfb TimeUnit timeUnit, @cfb woe woeVar) {
        return (l86<List<T>>) buffer(j, j2, timeUnit, woeVar, u60.asSupplier());
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch, @cfb woe scheduler) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new ia6(this, mapper, prefetch, e55.IMMEDIATE, scheduler));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> concatMapDelayError(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean tillTheEnd, int prefetch, @cfb woe scheduler) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return ofe.onAssembly(new ia6(this, mapper, prefetch, tillTheEnd ? e55.END : e55.BOUNDARY, scheduler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, V> l86<T> delay(@cfb zjd<U> subscriptionIndicator, @cfb sy6<? super T, ? extends zjd<V>> itemDelayIndicator) {
        return delaySubscription(subscriptionIndicator).delay(itemDelayIndicator);
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final <K, V> l86<rb7<K, V>> groupBy(@cfb sy6<? super T, ? extends K> keySelector, @cfb sy6<? super T, ? extends V> valueSelector, boolean delayError, int bufferSize, @cfb sy6<? super uu2<Object>, ? extends Map<K, Object>> evictingMapFactory) {
        Objects.requireNonNull(keySelector, "keySelector is null");
        Objects.requireNonNull(valueSelector, "valueSelector is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(evictingMapFactory, "evictingMapFactory is null");
        return ofe.onAssembly(new be6(this, keySelector, valueSelector, bufferSize, delayError, evictingMapFactory));
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <U> l86<T> sample(@cfb zjd<U> sampler) {
        Objects.requireNonNull(sampler, "sampler is null");
        return ofe.onAssembly(new bi6(this, sampler, false));
    }

    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final lf4 subscribe(@cfb uu2<? super T> onNext, @cfb uu2<? super Throwable> onError, @cfb InterfaceC7776j8 onComplete, @cfb sf4 container) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(onError, "onError is null");
        Objects.requireNonNull(onComplete, "onComplete is null");
        Objects.requireNonNull(container, "container is null");
        pf4 pf4Var = new pf4(container, onNext, onError, onComplete);
        container.add(pf4Var);
        subscribe((kj6) pf4Var);
        return pf4Var;
    }

    @cy1
    @gpe("custom")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> timeout(long timeout, @cfb TimeUnit unit, @cfb woe scheduler) {
        return timeout0(timeout, unit, null, scheduler);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<l86<T>> window(long timespan, long timeskip, @cfb TimeUnit unit, @cfb woe scheduler, int bufferSize) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        yjb.verifyPositive(timespan, "timespan");
        yjb.verifyPositive(timeskip, "timeskip");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(unit, "unit is null");
        return ofe.onAssembly(new ul6(this, timespan, timeskip, unit, scheduler, Long.MAX_VALUE, bufferSize, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <T1, T2, T3, R> l86<R> withLatestFrom(@cfb zjd<T1> source1, @cfb zjd<T2> source2, @cfb zjd<T3> source3, @cfb nz6<? super T, ? super T1, ? super T2, ? super T3, R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return withLatestFrom((zjd<?>[]) new zjd[]{source1, source2, source3}, r07.toFunction(combiner));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, R> l86<R> combineLatest(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb jz6<? super T1, ? super T2, ? super T3, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new zjd[]{source1, source2, source3}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, S> l86<T> generate(@cfb nfg<S> initialState, @cfb e11<S, qy4<T>> generator, @cfb uu2<? super S> disposeState) {
        Objects.requireNonNull(generator, "generator is null");
        return generate(initialState, le6.simpleBiGenerator(generator), disposeState);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> just(T item1, T item2, T item3, T item4) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        Objects.requireNonNull(item4, "item4 is null");
        return fromArray(item1, item2, item3, item4);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final <U extends Collection<? super T>> l86<U> buffer(long timespan, long timeskip, @cfb TimeUnit unit, @cfb woe scheduler, @cfb nfg<U> bufferSupplier) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
        return ofe.onAssembly(new j96(this, timespan, timeskip, unit, scheduler, bufferSupplier, Integer.MAX_VALUE, false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final l86<T> onBackpressureBuffer(int capacity, @cfb InterfaceC7776j8 onOverflow) {
        return onBackpressureBuffer(capacity, false, false, onOverflow);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> replay(@cfb sy6<? super l86<T>, ? extends zjd<R>> selector, int bufferSize, long time, @cfb TimeUnit unit) {
        return replay(selector, bufferSize, time, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <U, V> l86<T> timeout(@cfb zjd<U> firstTimeoutIndicator, @cfb sy6<? super T, ? extends zjd<V>> itemTimeoutIndicator) {
        Objects.requireNonNull(firstTimeoutIndicator, "firstTimeoutIndicator is null");
        return timeout0(firstTimeoutIndicator, itemTimeoutIndicator, null);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final l86<T> doOnEach(@cfb ycg<? super T> subscriber) {
        Objects.requireNonNull(subscriber, "subscriber is null");
        return doOnEach(le6.subscriberOnNext(subscriber), le6.subscriberOnError(subscriber), le6.subscriberOnComplete(subscriber), r07.f76639c);
    }

    @cy1
    @gpe("none")
    @zo0(to0.SPECIAL)
    @cfb
    public final l86<T> onBackpressureBuffer(long capacity, @dib InterfaceC7776j8 onOverflow, @cfb vo0 overflowStrategy) {
        Objects.requireNonNull(overflowStrategy, "overflowStrategy is null");
        yjb.verifyPositive(capacity, "capacity");
        return ofe.onAssembly(new yf6(this, capacity, onOverflow, overflowStrategy));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> replay(@cfb sy6<? super l86<T>, ? extends zjd<R>> selector, int bufferSize, long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(selector, "selector is null");
        Objects.requireNonNull(unit, "unit is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return th6.multicastSelector(le6.replaySupplier(this, bufferSize, time, unit, scheduler, false), selector);
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <U> l86<T> sample(@cfb zjd<U> sampler, boolean emitLast) {
        Objects.requireNonNull(sampler, "sampler is null");
        return ofe.onAssembly(new bi6(this, sampler, emitLast));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> concat(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2, @cfb zjd<? extends T> source3, @cfb zjd<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return concatArray(source1, source2, source3, source4);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, S> l86<T> generate(@cfb nfg<S> initialState, @cfb i11<S, qy4<T>, S> generator) {
        return generate(initialState, generator, r07.emptyConsumer());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, R> l86<R> zip(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb i11<? super T1, ? super T2, ? extends R> zipper, boolean delayError) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), delayError, bufferSize(), source1, source2);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> takeLast(long time, @cfb TimeUnit unit) {
        return takeLast(time, unit, mpe.computation(), false, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, V> l86<T> timeout(@cfb zjd<U> firstTimeoutIndicator, @cfb sy6<? super T, ? extends zjd<V>> itemTimeoutIndicator, @cfb zjd<? extends T> fallback) {
        Objects.requireNonNull(firstTimeoutIndicator, "firstTimeoutIndicator is null");
        Objects.requireNonNull(fallback, "fallback is null");
        return timeout0(firstTimeoutIndicator, itemTimeoutIndicator, fallback);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T, S> l86<T> generate(@cfb nfg<S> initialState, @cfb i11<S, qy4<T>, S> generator, @cfb uu2<? super S> disposeState) {
        Objects.requireNonNull(initialState, "initialState is null");
        Objects.requireNonNull(generator, "generator is null");
        Objects.requireNonNull(disposeState, "disposeState is null");
        return ofe.onAssembly(new zd6(initialState, generator, disposeState));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> merge(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2, @cfb zjd<? extends T> source3, @cfb zjd<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return fromArray(source1, source2, source3, source4).flatMap(r07.identity(), false, 4);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> mergeDelayError(@cfb zjd<? extends T> source1, @cfb zjd<? extends T> source2, @cfb zjd<? extends T> source3, @cfb zjd<? extends T> source4) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        return fromArray(source1, source2, source3, source4).flatMap(r07.identity(), true, 4);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> onNextMapper, @cfb sy6<? super Throwable, ? extends zjd<? extends R>> onErrorMapper, @cfb nfg<? extends zjd<? extends R>> onCompleteSupplier) {
        Objects.requireNonNull(onNextMapper, "onNextMapper is null");
        Objects.requireNonNull(onErrorMapper, "onErrorMapper is null");
        Objects.requireNonNull(onCompleteSupplier, "onCompleteSupplier is null");
        return merge(new ff6(this, onNextMapper, onErrorMapper, onCompleteSupplier));
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> takeLast(long time, @cfb TimeUnit unit, boolean delayError) {
        return takeLast(time, unit, mpe.computation(), delayError, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <K, V> kjf<Map<K, Collection<V>>> toMultimap(@cfb sy6<? super T, ? extends K> keySelector, @cfb sy6<? super T, ? extends V> valueSelector, @cfb nfg<Map<K, Collection<V>>> mapSupplier) {
        return toMultimap(keySelector, valueSelector, mapSupplier, u60.asFunction());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<List<T>> buffer(long timespan, @cfb TimeUnit unit) {
        return buffer(timespan, unit, mpe.computation(), Integer.MAX_VALUE);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> takeLast(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        return takeLast(time, unit, scheduler, false, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, R> l86<R> combineLatest(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb nz6<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new zjd[]{source1, source2, source3, source4}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> just(T item1, T item2, T item3, T item4, T item5) {
        Objects.requireNonNull(item1, "item1 is null");
        Objects.requireNonNull(item2, "item2 is null");
        Objects.requireNonNull(item3, "item3 is null");
        Objects.requireNonNull(item4, "item4 is null");
        Objects.requireNonNull(item5, "item5 is null");
        return fromArray(item1, item2, item3, item4, item5);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<List<T>> buffer(long timespan, @cfb TimeUnit unit, int count) {
        return buffer(timespan, unit, mpe.computation(), count);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> takeLast(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError) {
        return takeLast(time, unit, scheduler, delayError, bufferSize());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<l86<T>> window(long timespan, @cfb TimeUnit unit) {
        return window(timespan, unit, mpe.computation(), Long.MAX_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <T1, T2, T3, T4, R> l86<R> withLatestFrom(@cfb zjd<T1> source1, @cfb zjd<T2> source2, @cfb zjd<T3> source3, @cfb zjd<T4> source4, @cfb qz6<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return withLatestFrom((zjd<?>[]) new zjd[]{source1, source2, source3, source4}, r07.toFunction(combiner));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, R> l86<R> zip(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb i11<? super T1, ? super T2, ? extends R> zipper, boolean delayError, int bufferSize) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), delayError, bufferSize, source1, source2);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<List<T>> buffer(long j, @cfb TimeUnit timeUnit, @cfb woe woeVar, int i) {
        return (l86<List<T>>) buffer(j, timeUnit, woeVar, i, u60.asSupplier(), false);
    }

    @Override // p000.zjd
    @gpe("none")
    @zo0(to0.SPECIAL)
    public final void subscribe(@cfb ycg<? super T> subscriber) {
        if (subscriber instanceof kj6) {
            subscribe((kj6) subscriber);
        } else {
            Objects.requireNonNull(subscriber, "subscriber is null");
            subscribe((kj6) new f7g(subscriber));
        }
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> takeLast(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean delayError, int bufferSize) {
        return takeLast(Long.MAX_VALUE, time, unit, scheduler, delayError, bufferSize);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<l86<T>> window(long timespan, @cfb TimeUnit unit, long count) {
        return window(timespan, unit, mpe.computation(), count, false);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final <U extends Collection<? super T>> l86<U> buffer(long timespan, @cfb TimeUnit unit, @cfb woe scheduler, int count, @cfb nfg<U> bufferSupplier, boolean restartTimerOnMaxSize) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
        yjb.verifyPositive(count, "count");
        return ofe.onAssembly(new j96(this, timespan, timespan, unit, scheduler, bufferSupplier, count, restartTimerOnMaxSize));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> onNextMapper, @cfb sy6<Throwable, ? extends zjd<? extends R>> onErrorMapper, @cfb nfg<? extends zjd<? extends R>> onCompleteSupplier, int maxConcurrency) {
        Objects.requireNonNull(onNextMapper, "onNextMapper is null");
        Objects.requireNonNull(onErrorMapper, "onErrorMapper is null");
        Objects.requireNonNull(onCompleteSupplier, "onCompleteSupplier is null");
        return merge(new ff6(this, onNextMapper, onErrorMapper, onCompleteSupplier), maxConcurrency);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> replay(@cfb sy6<? super l86<T>, ? extends zjd<R>> selector, int bufferSize, long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean eagerTruncate) {
        Objects.requireNonNull(selector, "selector is null");
        Objects.requireNonNull(unit, "unit is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return th6.multicastSelector(le6.replaySupplier(this, bufferSize, time, unit, scheduler, eagerTruncate), selector);
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.ERROR)
    @cfb
    public final l86<l86<T>> window(long timespan, @cfb TimeUnit unit, long count, boolean restart) {
        return window(timespan, unit, mpe.computation(), count, restart);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<l86<T>> window(long timespan, @cfb TimeUnit unit, @cfb woe scheduler) {
        return window(timespan, unit, scheduler, Long.MAX_VALUE, false);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<l86<T>> window(long timespan, @cfb TimeUnit unit, @cfb woe scheduler, long count) {
        return window(timespan, unit, scheduler, count, false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, R> l86<R> zip(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb jz6<? super T1, ? super T2, ? super T3, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2, source3);
    }

    @gpe("none")
    @zo0(to0.SPECIAL)
    public final void subscribe(@cfb kj6<? super T> subscriber) {
        Objects.requireNonNull(subscriber, "subscriber is null");
        try {
            ycg<? super T> ycgVarOnSubscribe = ofe.onSubscribe(this, subscriber);
            Objects.requireNonNull(ycgVarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(ycgVarOnSubscribe);
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
    @zo0(to0.ERROR)
    @cfb
    public final l86<l86<T>> window(long timespan, @cfb TimeUnit unit, @cfb woe scheduler, long count, boolean restart) {
        return window(timespan, unit, scheduler, count, restart, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, T5, R> l86<R> combineLatest(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb zjd<? extends T5> source5, @cfb qz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new zjd[]{source1, source2, source3, source4, source5}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> just(T item1, T item2, T item3, T item4, T item5, T item6) {
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
    @zo0(to0.FULL)
    @cfb
    public final <U, R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner) {
        return flatMap(mapper, combiner, false, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<l86<T>> window(long timespan, @cfb TimeUnit unit, @cfb woe scheduler, long count, boolean restart, int bufferSize) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        Objects.requireNonNull(scheduler, "scheduler is null");
        Objects.requireNonNull(unit, "unit is null");
        yjb.verifyPositive(count, "count");
        return ofe.onAssembly(new ul6(this, timespan, timespan, unit, scheduler, count, bufferSize, restart));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.ERROR)
    @cfb
    public final l86<List<T>> buffer(long j, @cfb TimeUnit timeUnit, @cfb woe woeVar) {
        return (l86<List<T>>) buffer(j, timeUnit, woeVar, Integer.MAX_VALUE, u60.asSupplier(), false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner, boolean delayErrors) {
        return flatMap(mapper, combiner, delayErrors, bufferSize(), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> l86<R> withLatestFrom(@cfb zjd<?>[] others, @cfb sy6<? super Object[], R> combiner) {
        Objects.requireNonNull(others, "others is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return ofe.onAssembly(new yl6(this, others, combiner));
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <TOpening, TClosing> l86<List<T>> buffer(@cfb zjd<? extends TOpening> zjdVar, @cfb sy6<? super TOpening, ? extends zjd<? extends TClosing>> sy6Var) {
        return (l86<List<T>>) buffer(zjdVar, sy6Var, u60.asSupplier());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner, boolean delayErrors, int maxConcurrency) {
        return flatMap(mapper, combiner, delayErrors, maxConcurrency, bufferSize());
    }

    @cy1
    @gpe("io.reactivex:computation")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> replay(@cfb sy6<? super l86<T>, ? extends zjd<R>> selector, long time, @cfb TimeUnit unit) {
        return replay(selector, time, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <TOpening, TClosing, U extends Collection<? super T>> l86<U> buffer(@cfb zjd<? extends TOpening> openingIndicator, @cfb sy6<? super TOpening, ? extends zjd<? extends TClosing>> closingIndicator, @cfb nfg<U> bufferSupplier) {
        Objects.requireNonNull(openingIndicator, "openingIndicator is null");
        Objects.requireNonNull(closingIndicator, "closingIndicator is null");
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
        return ofe.onAssembly(new e96(this, openingIndicator, closingIndicator, bufferSupplier));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner, boolean delayErrors, int maxConcurrency, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(combiner, "combiner is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return flatMap(le6.flatMapWithCombiner(mapper, combiner), delayErrors, maxConcurrency, bufferSize);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> replay(@cfb sy6<? super l86<T>, ? extends zjd<R>> selector, long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(selector, "selector is null");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return th6.multicastSelector(le6.replaySupplier(this, time, unit, scheduler, false), selector);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, R> l86<R> zip(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb nz6<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> zipper) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(zipper, "zipper is null");
        return zipArray(r07.toFunction(zipper), false, bufferSize(), source1, source2, source3, source4);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> l86<R> withLatestFrom(@cfb Iterable<? extends zjd<?>> others, @cfb sy6<? super Object[], R> combiner) {
        Objects.requireNonNull(others, "others is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return ofe.onAssembly(new yl6(this, others, combiner));
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <B> l86<l86<T>> window(@cfb zjd<B> boundaryIndicator) {
        return window(boundaryIndicator, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <B> l86<l86<T>> window(@cfb zjd<B> boundaryIndicator, int bufferSize) {
        Objects.requireNonNull(boundaryIndicator, "boundaryIndicator is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new ol6(this, boundaryIndicator, bufferSize));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, T5, T6, R> l86<R> combineLatest(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb zjd<? extends T5> source5, @cfb zjd<? extends T6> source6, @cfb tz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new zjd[]{source1, source2, source3, source4, source5, source6}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> just(T item1, T item2, T item3, T item4, T item5, T item6, T item7) {
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
    @zo0(to0.ERROR)
    @cfb
    public final <B> l86<List<T>> buffer(@cfb zjd<B> zjdVar) {
        return (l86<List<T>>) buffer(zjdVar, u60.asSupplier());
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final <R> l86<R> replay(@cfb sy6<? super l86<T>, ? extends zjd<R>> selector, long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean eagerTruncate) {
        Objects.requireNonNull(selector, "selector is null");
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return th6.multicastSelector(le6.replaySupplier(this, time, unit, scheduler, eagerTruncate), selector);
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <B> l86<List<T>> buffer(@cfb zjd<B> zjdVar, int i) {
        yjb.verifyPositive(i, "initialCapacity");
        return (l86<List<T>>) buffer(zjdVar, r07.createArrayList(i));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U, R> l86<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends U>> mapper, @cfb i11<? super T, ? super U, ? extends R> combiner, int maxConcurrency) {
        return flatMap(mapper, combiner, false, maxConcurrency, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <U, V> l86<l86<T>> window(@cfb zjd<U> openingIndicator, @cfb sy6<? super U, ? extends zjd<V>> closingIndicator) {
        return window(openingIndicator, closingIndicator, bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, T5, R> l86<R> zip(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb zjd<? extends T5> source5, @cfb qz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> zipper) {
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
    @zo0(to0.ERROR)
    @cfb
    public final <B, U extends Collection<? super T>> l86<U> buffer(@cfb zjd<B> boundaryIndicator, @cfb nfg<U> bufferSupplier) {
        Objects.requireNonNull(boundaryIndicator, "boundaryIndicator is null");
        Objects.requireNonNull(bufferSupplier, "bufferSupplier is null");
        return ofe.onAssembly(new h96(this, boundaryIndicator, bufferSupplier));
    }

    @cy1
    @gpe("none")
    @zo0(to0.ERROR)
    @cfb
    public final <U, V> l86<l86<T>> window(@cfb zjd<U> openingIndicator, @cfb sy6<? super U, ? extends zjd<V>> closingIndicator, int bufferSize) {
        Objects.requireNonNull(openingIndicator, "openingIndicator is null");
        Objects.requireNonNull(closingIndicator, "closingIndicator is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new ql6(this, openingIndicator, closingIndicator, bufferSize));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> replay(int bufferSize) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        return th6.create(this, bufferSize, false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> replay(int bufferSize, boolean eagerTruncate) {
        yjb.verifyPositive(bufferSize, "bufferSize");
        return th6.create(this, bufferSize, eagerTruncate);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, R> l86<R> combineLatest(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb zjd<? extends T5> source5, @cfb zjd<? extends T6> source6, @cfb zjd<? extends T7> source7, @cfb wz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new zjd[]{source1, source2, source3, source4, source5, source6, source7}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> just(T item1, T item2, T item3, T item4, T item5, T item6, T item7, T item8) {
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
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> replay(int bufferSize, long time, @cfb TimeUnit unit) {
        return replay(bufferSize, time, unit, mpe.computation());
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> replay(int bufferSize, long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return th6.create(this, time, unit, scheduler, bufferSize, false);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, T5, T6, R> l86<R> zip(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb zjd<? extends T5> source5, @cfb zjd<? extends T6> source6, @cfb tz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> zipper) {
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
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> replay(int bufferSize, long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean eagerTruncate) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return th6.create(this, time, unit, scheduler, bufferSize, eagerTruncate);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l86<R> combineLatest(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb zjd<? extends T5> source5, @cfb zjd<? extends T6> source6, @cfb zjd<? extends T7> source7, @cfb zjd<? extends T8> source8, @cfb zz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> combiner) {
        Objects.requireNonNull(source1, "source1 is null");
        Objects.requireNonNull(source2, "source2 is null");
        Objects.requireNonNull(source3, "source3 is null");
        Objects.requireNonNull(source4, "source4 is null");
        Objects.requireNonNull(source5, "source5 is null");
        Objects.requireNonNull(source6, "source6 is null");
        Objects.requireNonNull(source7, "source7 is null");
        Objects.requireNonNull(source8, "source8 is null");
        Objects.requireNonNull(combiner, "combiner is null");
        return combineLatestArray(new zjd[]{source1, source2, source3, source4, source5, source6, source7, source8}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> just(T item1, T item2, T item3, T item4, T item5, T item6, T item7, T item8, T item9) {
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
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> replay(long time, @cfb TimeUnit unit) {
        return replay(time, unit, mpe.computation());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, R> l86<R> zip(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb zjd<? extends T5> source5, @cfb zjd<? extends T6> source6, @cfb zjd<? extends T7> source7, @cfb wz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> zipper) {
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
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> replay(long time, @cfb TimeUnit unit, @cfb woe scheduler) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return th6.create(this, time, unit, scheduler, false);
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final mr2<T> replay(long time, @cfb TimeUnit unit, @cfb woe scheduler, boolean eagerTruncate) {
        Objects.requireNonNull(unit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        return th6.create(this, time, unit, scheduler, eagerTruncate);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l86<R> combineLatest(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb zjd<? extends T5> source5, @cfb zjd<? extends T6> source6, @cfb zjd<? extends T7> source7, @cfb zjd<? extends T8> source8, @cfb zjd<? extends T9> source9, @cfb c07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> combiner) {
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
        return combineLatestArray(new zjd[]{source1, source2, source3, source4, source5, source6, source7, source8, source9}, r07.toFunction(combiner), bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> l86<T> just(T item1, T item2, T item3, T item4, T item5, T item6, T item7, T item8, T item9, T item10) {
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
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> l86<R> zip(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb zjd<? extends T5> source5, @cfb zjd<? extends T6> source6, @cfb zjd<? extends T7> source7, @cfb zjd<? extends T8> source8, @cfb zz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> zipper) {
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
    @zo0(to0.FULL)
    @cfb
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> l86<R> zip(@cfb zjd<? extends T1> source1, @cfb zjd<? extends T2> source2, @cfb zjd<? extends T3> source3, @cfb zjd<? extends T4> source4, @cfb zjd<? extends T5> source5, @cfb zjd<? extends T6> source6, @cfb zjd<? extends T7> source7, @cfb zjd<? extends T8> source8, @cfb zjd<? extends T9> source9, @cfb c07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> zipper) {
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
