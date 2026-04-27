package p000;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes7.dex */
public abstract class eec<T> {
    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> eec<T> from(@cfb zjd<? extends T> source) {
        return from(source, Runtime.getRuntime().availableProcessors(), l86.bufferSize());
    }

    @cy1
    @gpe("none")
    @SafeVarargs
    @zo0(to0.PASS_THROUGH)
    @cfb
    public static <T> eec<T> fromArray(@cfb zjd<T>... publishers) {
        Objects.requireNonNull(publishers, "publishers is null");
        if (publishers.length != 0) {
            return ofe.onAssembly(new iec(publishers));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9902a(@cfb ycg<?>[] subscribers) {
        Objects.requireNonNull(subscribers, "subscribers is null");
        int iParallelism = parallelism();
        if (subscribers.length == iParallelism) {
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("parallelism = " + iParallelism + ", subscribers = " + subscribers.length);
        int length = subscribers.length;
        for (int i = 0; i < length; i++) {
            w05.error(illegalArgumentException, subscribers[i]);
        }
        return false;
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <C> eec<C> collect(@cfb nfg<? extends C> collectionSupplier, @cfb e11<? super C, ? super T> collector) {
        Objects.requireNonNull(collectionSupplier, "collectionSupplier is null");
        Objects.requireNonNull(collector, "collector is null");
        return ofe.onAssembly(new ndc(this, collectionSupplier, collector));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <U> eec<U> compose(@cfb hfc<T, U> composer) {
        Objects.requireNonNull(composer, "composer is null");
        return ofe.onAssembly(composer.apply(this));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> eec<R> concatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper) {
        return concatMap(mapper, 2);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> eec<R> concatMapDelayError(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean tillTheEnd) {
        return concatMapDelayError(mapper, 2, tillTheEnd);
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> doAfterNext(@cfb uu2<? super T> onAfterNext) {
        Objects.requireNonNull(onAfterNext, "onAfterNext is null");
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new vec(this, uu2VarEmptyConsumer, onAfterNext, uu2VarEmptyConsumer2, interfaceC7776j8, interfaceC7776j8, r07.emptyConsumer(), r07.f76643g, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> doAfterTerminated(@cfb InterfaceC7776j8 onAfterTerminate) {
        Objects.requireNonNull(onAfterTerminate, "onAfterTerminate is null");
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer3 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new vec(this, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, uu2VarEmptyConsumer3, interfaceC7776j8, onAfterTerminate, r07.emptyConsumer(), r07.f76643g, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> doOnCancel(@cfb InterfaceC7776j8 onCancel) {
        Objects.requireNonNull(onCancel, "onCancel is null");
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer3 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new vec(this, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, uu2VarEmptyConsumer3, interfaceC7776j8, interfaceC7776j8, r07.emptyConsumer(), r07.f76643g, onCancel));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> doOnComplete(@cfb InterfaceC7776j8 onComplete) {
        Objects.requireNonNull(onComplete, "onComplete is null");
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer3 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new vec(this, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, uu2VarEmptyConsumer3, onComplete, interfaceC7776j8, r07.emptyConsumer(), r07.f76643g, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> doOnError(@cfb uu2<? super Throwable> onError) {
        Objects.requireNonNull(onError, "onError is null");
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new vec(this, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, onError, interfaceC7776j8, interfaceC7776j8, r07.emptyConsumer(), r07.f76643g, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> doOnNext(@cfb uu2<? super T> onNext) {
        Objects.requireNonNull(onNext, "onNext is null");
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new vec(this, onNext, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, interfaceC7776j8, interfaceC7776j8, r07.emptyConsumer(), r07.f76643g, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> doOnRequest(@cfb xk9 onRequest) {
        Objects.requireNonNull(onRequest, "onRequest is null");
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer3 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new vec(this, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, uu2VarEmptyConsumer3, interfaceC7776j8, interfaceC7776j8, r07.emptyConsumer(), onRequest, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> doOnSubscribe(@cfb uu2<? super fdg> onSubscribe) {
        Objects.requireNonNull(onSubscribe, "onSubscribe is null");
        uu2 uu2VarEmptyConsumer = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer2 = r07.emptyConsumer();
        uu2 uu2VarEmptyConsumer3 = r07.emptyConsumer();
        InterfaceC7776j8 interfaceC7776j8 = r07.f76639c;
        return ofe.onAssembly(new vec(this, uu2VarEmptyConsumer, uu2VarEmptyConsumer2, uu2VarEmptyConsumer3, interfaceC7776j8, interfaceC7776j8, onSubscribe, r07.f76643g, interfaceC7776j8));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> filter(@cfb n8d<? super T> predicate) {
        Objects.requireNonNull(predicate, "predicate is null");
        return ofe.onAssembly(new xdc(this, predicate));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> eec<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper) {
        return flatMap(mapper, false, l86.bufferSize(), l86.bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> eec<U> flatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper) {
        return flatMapIterable(mapper, l86.bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> eec<R> flatMapStream(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper) {
        return flatMapStream(mapper, l86.bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> eec<R> map(@cfb sy6<? super T, ? extends R> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new pec(this, mapper));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> eec<R> mapOptional(@cfb sy6<? super T, Optional<? extends R>> mapper) {
        Objects.requireNonNull(mapper, "mapper is null");
        return ofe.onAssembly(new qec(this, mapper));
    }

    @cy1
    public abstract int parallelism();

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> reduce(@cfb i11<T, T, T> reducer) {
        Objects.requireNonNull(reducer, "reducer is null");
        return ofe.onAssembly(new zec(this, reducer));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final eec<T> runOn(@cfb woe scheduler) {
        return runOn(scheduler, l86.bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> sequential() {
        return sequential(l86.bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> sequentialDelayError() {
        return sequentialDelayError(l86.bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> sorted(@cfb Comparator<? super T> comparator) {
        return sorted(comparator, 16);
    }

    @gpe("none")
    @zo0(to0.SPECIAL)
    public abstract void subscribe(@cfb ycg<? super T>[] subscribers);

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    /* JADX INFO: renamed from: to */
    public final <R> R m9903to(@cfb gec<T, R> converter) {
        Objects.requireNonNull(converter, "converter is null");
        return converter.apply(this);
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<List<T>> toSortedList(@cfb Comparator<? super T> comparator) {
        return toSortedList(comparator, 16);
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> eec<T> from(@cfb zjd<? extends T> source, int parallelism) {
        return from(source, parallelism, l86.bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> eec<R> concatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new qdc(this, mapper, prefetch, e55.IMMEDIATE));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> eec<R> concatMapDelayError(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch, boolean tillTheEnd) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new qdc(this, mapper, prefetch, tillTheEnd ? e55.END : e55.BOUNDARY));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> eec<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean delayError) {
        return flatMap(mapper, delayError, l86.bufferSize(), l86.bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <U> eec<U> flatMapIterable(@cfb sy6<? super T, ? extends Iterable<? extends U>> mapper, int bufferSize) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(bufferSize, "bufferSize");
        return ofe.onAssembly(new cec(this, mapper, bufferSize));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> eec<R> flatMapStream(@cfb sy6<? super T, ? extends Stream<? extends R>> mapper, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new dec(this, mapper, prefetch));
    }

    @cy1
    @gpe("custom")
    @zo0(to0.FULL)
    @cfb
    public final eec<T> runOn(@cfb woe scheduler, int prefetch) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new bfc(this, scheduler, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> sequential(int prefetch) {
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new nec(this, prefetch, false));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final l86<T> sequentialDelayError(int prefetch) {
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new nec(this, prefetch, true));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<T> sorted(@cfb Comparator<? super T> comparator, int capacityHint) {
        Objects.requireNonNull(comparator, "comparator is null");
        yjb.verifyPositive(capacityHint, "capacityHint");
        return ofe.onAssembly(new gfc(reduce(r07.createArrayList((capacityHint / parallelism()) + 1), d89.instance()).map(new tvf(comparator)), comparator));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final l86<List<T>> toSortedList(@cfb Comparator<? super T> comparator, int capacityHint) {
        Objects.requireNonNull(comparator, "comparator is null");
        yjb.verifyPositive(capacityHint, "capacityHint");
        return ofe.onAssembly(reduce(r07.createArrayList((capacityHint / parallelism()) + 1), d89.instance()).map(new tvf(comparator)).reduce(new rra(comparator)));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public static <T> eec<T> from(@cfb zjd<? extends T> source, int parallelism, int prefetch) {
        Objects.requireNonNull(source, "source is null");
        yjb.verifyPositive(parallelism, "parallelism");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new lec(source, parallelism, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> filter(@cfb n8d<? super T> predicate, @cfb udc errorHandler) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return ofe.onAssembly(new zdc(this, predicate, errorHandler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> eec<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean delayError, int maxConcurrency) {
        return flatMap(mapper, delayError, maxConcurrency, l86.bufferSize());
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> eec<R> map(@cfb sy6<? super T, ? extends R> mapper, @cfb udc errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return ofe.onAssembly(new sec(this, mapper, errorHandler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> eec<R> mapOptional(@cfb sy6<? super T, Optional<? extends R>> mapper, @cfb udc errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return ofe.onAssembly(new tec(this, mapper, errorHandler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <R> eec<R> reduce(@cfb nfg<R> initialSupplier, @cfb i11<R, ? super T, R> reducer) {
        Objects.requireNonNull(initialSupplier, "initialSupplier is null");
        Objects.requireNonNull(reducer, "reducer is null");
        return ofe.onAssembly(new xec(this, initialSupplier, reducer));
    }

    @cy1
    @gpe("none")
    @zo0(to0.UNBOUNDED_IN)
    @cfb
    public final <A, R> l86<R> collect(@cfb Collector<T, A, R> collector) {
        Objects.requireNonNull(collector, "collector is null");
        return ofe.onAssembly(new odc(this, collector));
    }

    @cy1
    @gpe("none")
    @zo0(to0.FULL)
    @cfb
    public final <R> eec<R> flatMap(@cfb sy6<? super T, ? extends zjd<? extends R>> mapper, boolean delayError, int maxConcurrency, int prefetch) {
        Objects.requireNonNull(mapper, "mapper is null");
        yjb.verifyPositive(maxConcurrency, "maxConcurrency");
        yjb.verifyPositive(prefetch, "prefetch");
        return ofe.onAssembly(new aec(this, mapper, delayError, maxConcurrency, prefetch));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> filter(@cfb n8d<? super T> predicate, @cfb i11<? super Long, ? super Throwable, udc> errorHandler) {
        Objects.requireNonNull(predicate, "predicate is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return ofe.onAssembly(new zdc(this, predicate, errorHandler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> eec<R> map(@cfb sy6<? super T, ? extends R> mapper, @cfb i11<? super Long, ? super Throwable, udc> errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return ofe.onAssembly(new sec(this, mapper, errorHandler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final <R> eec<R> mapOptional(@cfb sy6<? super T, Optional<? extends R>> mapper, @cfb i11<? super Long, ? super Throwable, udc> errorHandler) {
        Objects.requireNonNull(mapper, "mapper is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return ofe.onAssembly(new tec(this, mapper, errorHandler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> doOnNext(@cfb uu2<? super T> onNext, @cfb udc errorHandler) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return ofe.onAssembly(new tdc(this, onNext, errorHandler));
    }

    @cy1
    @gpe("none")
    @zo0(to0.PASS_THROUGH)
    @cfb
    public final eec<T> doOnNext(@cfb uu2<? super T> onNext, @cfb i11<? super Long, ? super Throwable, udc> errorHandler) {
        Objects.requireNonNull(onNext, "onNext is null");
        Objects.requireNonNull(errorHandler, "errorHandler is null");
        return ofe.onAssembly(new tdc(this, onNext, errorHandler));
    }
}
