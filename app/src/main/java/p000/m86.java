package p000;

import com.google.android.material.timepicker.RadialViewGroup;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p000.ke6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class m86<T> implements zjd<T> {

    /* JADX INFO: renamed from: a */
    public static final int f60180a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public static <T> m86<T> amb(Iterable<? extends zjd<? extends T>> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new r86(null, iterable));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public static <T> m86<T> ambArray(zjd<? extends T>... zjdVarArr) {
        xjb.requireNonNull(zjdVarArr, "sources is null");
        int length = zjdVarArr.length;
        return length == 0 ? empty() : length == 1 ? fromPublisher(zjdVarArr[0]) : pfe.onAssembly(new r86(zjdVarArr, null));
    }

    public static int bufferSize() {
        return f60180a;
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T, R> m86<R> combineLatest(zjd<? extends T>[] zjdVarArr, py6<? super Object[], ? extends R> py6Var) {
        return combineLatest(zjdVarArr, py6Var, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T, R> m86<R> combineLatestDelayError(zjd<? extends T>[] zjdVarArr, py6<? super Object[], ? extends R> py6Var) {
        return combineLatestDelayError(zjdVarArr, py6Var, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(Iterable<? extends zjd<? extends T>> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(q07.identity(), 2, false);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatArray(zjd<? extends T>... zjdVarArr) {
        return zjdVarArr.length == 0 ? empty() : zjdVarArr.length == 1 ? fromPublisher(zjdVarArr[0]) : pfe.onAssembly(new u96(zjdVarArr, false));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatArrayDelayError(zjd<? extends T>... zjdVarArr) {
        return zjdVarArr.length == 0 ? empty() : zjdVarArr.length == 1 ? fromPublisher(zjdVarArr[0]) : pfe.onAssembly(new u96(zjdVarArr, true));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatArrayEager(zjd<? extends T>... zjdVarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), zjdVarArr);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatArrayEagerDelayError(zjd<? extends T>... zjdVarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), zjdVarArr);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concatDelayError(Iterable<? extends zjd<? extends T>> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(q07.identity());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatEager(zjd<? extends zjd<? extends T>> zjdVar) {
        return concatEager(zjdVar, bufferSize(), bufferSize());
    }

    @by1
    @ap0(uo0.SPECIAL)
    @bfb
    @hpe("none")
    public static <T> m86<T> create(ng6<T> ng6Var, yo0 yo0Var) {
        xjb.requireNonNull(ng6Var, "source is null");
        xjb.requireNonNull(yo0Var, "mode is null");
        return pfe.onAssembly(new ya6(ng6Var, yo0Var));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public static <T> m86<T> defer(Callable<? extends zjd<? extends T>> callable) {
        xjb.requireNonNull(callable, "supplier is null");
        return pfe.onAssembly(new fb6(callable));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    private m86<T> doOnEach(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, InterfaceC7178i8 interfaceC7178i82) {
        xjb.requireNonNull(tu2Var, "onNext is null");
        xjb.requireNonNull(tu2Var2, "onError is null");
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        xjb.requireNonNull(interfaceC7178i82, "onAfterTerminate is null");
        return pfe.onAssembly(new wb6(this, tu2Var, tu2Var2, interfaceC7178i8, interfaceC7178i82));
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public static <T> m86<T> empty() {
        return pfe.onAssembly(kc6.f53580b);
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public static <T> m86<T> error(Callable<? extends Throwable> callable) {
        xjb.requireNonNull(callable, "supplier is null");
        return pfe.onAssembly(new mc6(callable));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> fromArray(T... tArr) {
        xjb.requireNonNull(tArr, "items is null");
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : pfe.onAssembly(new hd6(tArr));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> fromCallable(Callable<? extends T> callable) {
        xjb.requireNonNull(callable, "supplier is null");
        return pfe.onAssembly(new kd6(callable));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> fromFuture(Future<? extends T> future) {
        xjb.requireNonNull(future, "future is null");
        return pfe.onAssembly(new od6(future, 0L, null));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> fromIterable(Iterable<? extends T> iterable) {
        xjb.requireNonNull(iterable, "source is null");
        return pfe.onAssembly(new pd6(iterable));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public static <T> m86<T> fromPublisher(zjd<? extends T> zjdVar) {
        if (zjdVar instanceof m86) {
            return pfe.onAssembly((m86) zjdVar);
        }
        xjb.requireNonNull(zjdVar, "source is null");
        return pfe.onAssembly(new ud6(zjdVar));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> generate(tu2<ry4<T>> tu2Var) {
        xjb.requireNonNull(tu2Var, "generator is null");
        return generate(q07.nullSupplier(), ke6.simpleGenerator(tu2Var), q07.emptyConsumer());
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public static m86<Long> interval(long j, long j2, TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, npe.computation());
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public static m86<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return intervalRange(j, j2, j3, j4, timeUnit, npe.computation());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> just(T t) {
        xjb.requireNonNull(t, "item is null");
        return pfe.onAssembly(new te6(t));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> merge(Iterable<? extends zjd<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(q07.identity(), false, i, i2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeArray(int i, int i2, zjd<? extends T>... zjdVarArr) {
        return fromArray(zjdVarArr).flatMap(q07.identity(), false, i, i2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeArrayDelayError(int i, int i2, zjd<? extends T>... zjdVarArr) {
        return fromArray(zjdVarArr).flatMap(q07.identity(), true, i, i2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeDelayError(Iterable<? extends zjd<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(q07.identity(), true);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public static <T> m86<T> never() {
        return pfe.onAssembly(sf6.f81655b);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static m86<Integer> range(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + i2);
        }
        if (i2 == 0) {
            return empty();
        }
        if (i2 == 1) {
            return just(Integer.valueOf(i));
        }
        if (((long) i) + ((long) (i2 - 1)) <= 2147483647L) {
            return pfe.onAssembly(new yg6(i, i2));
        }
        throw new IllegalArgumentException("Integer overflow");
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static m86<Long> rangeLong(long j, long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j2);
        }
        if (j2 == 0) {
            return empty();
        }
        if (j2 == 1) {
            return just(Long.valueOf(j));
        }
        long j3 = (j2 - 1) + j;
        if (j <= 0 || j3 >= 0) {
            return pfe.onAssembly(new ah6(j, j2));
        }
        throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> ljf<Boolean> sequenceEqual(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2) {
        return sequenceEqual(zjdVar, zjdVar2, xjb.equalsPredicate(), bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> switchOnNext(zjd<? extends zjd<? extends T>> zjdVar, int i) {
        return fromPublisher(zjdVar).switchMap(q07.identity(), i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> switchOnNextDelayError(zjd<? extends zjd<? extends T>> zjdVar) {
        return switchOnNextDelayError(zjdVar, bufferSize());
    }

    private m86<T> timeout0(long j, TimeUnit timeUnit, zjd<? extends T> zjdVar, voe voeVar) {
        xjb.requireNonNull(timeUnit, "timeUnit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new xk6(this, j, timeUnit, voeVar, zjdVar));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public static m86<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, npe.computation());
    }

    @by1
    @ap0(uo0.NONE)
    @bfb
    @hpe("none")
    public static <T> m86<T> unsafeCreate(zjd<T> zjdVar) {
        xjb.requireNonNull(zjdVar, "onSubscribe is null");
        if (zjdVar instanceof m86) {
            throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
        }
        return pfe.onAssembly(new ud6(zjdVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public static <T, D> m86<T> using(Callable<? extends D> callable, py6<? super D, ? extends zjd<? extends T>> py6Var, tu2<? super D> tu2Var) {
        return using(callable, py6Var, tu2Var, true);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T, R> m86<R> zip(Iterable<? extends zjd<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var) {
        xjb.requireNonNull(py6Var, "zipper is null");
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new zl6(null, iterable, py6Var, bufferSize(), false));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T, R> m86<R> zipArray(py6<? super Object[], ? extends R> py6Var, boolean z, int i, zjd<? extends T>... zjdVarArr) {
        if (zjdVarArr.length == 0) {
            return empty();
        }
        xjb.requireNonNull(py6Var, "zipper is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new zl6(zjdVarArr, null, py6Var, i, z));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T, R> m86<R> zipIterable(Iterable<? extends zjd<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var, boolean z, int i) {
        xjb.requireNonNull(py6Var, "zipper is null");
        xjb.requireNonNull(iterable, "sources is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new zl6(null, iterable, py6Var, i, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public <R> m86<R> m17126a(py6<? super T, ? extends zjd<? extends R>> py6Var, int i, boolean z) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "bufferSize");
        if (!(this instanceof ime)) {
            return pfe.onAssembly(new oj6(this, py6Var, i, z));
        }
        Object objCall = ((ime) this).call();
        return objCall == null ? empty() : ei6.scalarXMap(objCall, py6Var);
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final ljf<Boolean> all(m8d<? super T> m8dVar) {
        xjb.requireNonNull(m8dVar, "predicate is null");
        return pfe.onAssembly(new p86(this, m8dVar));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> ambWith(zjd<? extends T> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return ambArray(this, zjdVar);
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final ljf<Boolean> any(m8d<? super T> m8dVar) {
        xjb.requireNonNull(m8dVar, "predicate is null");
        return pfe.onAssembly(new v86(this, m8dVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    /* JADX INFO: renamed from: as */
    public final <R> R m17127as(@bfb ta6<T, ? extends R> ta6Var) {
        return (R) ((ta6) xjb.requireNonNull(ta6Var, "converter is null")).apply(this);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final T blockingFirst() {
        j71 j71Var = new j71();
        subscribe((lj6) j71Var);
        T tBlockingGet = j71Var.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final void blockingForEach(tu2<? super T> tu2Var) {
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                tu2Var.accept(it.next());
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                ((mf4) it).dispose();
                throw j75.wrapOrThrow(th);
            }
        }
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final T blockingLast() {
        z71 z71Var = new z71();
        subscribe((lj6) z71Var);
        T tBlockingGet = z71Var.blockingGet();
        if (tBlockingGet != null) {
            return tBlockingGet;
        }
        throw new NoSuchElementException();
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final Iterable<T> blockingLatest() {
        return new m71(this);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final Iterable<T> blockingMostRecent(T t) {
        return new o71(this, t);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final Iterable<T> blockingNext() {
        return new q71(this);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final T blockingSingle() {
        return singleOrError().blockingGet();
    }

    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final void blockingSubscribe() {
        a96.subscribe(this);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<List<T>> buffer(int i) {
        return buffer(i, i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> cacheWithInitialCapacity(int i) {
        xjb.verifyPositive(i, "initialCapacity");
        return pfe.onAssembly(new k96(this, i));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <U> m86<U> cast(Class<U> cls) {
        xjb.requireNonNull(cls, "clazz is null");
        return (m86<U>) map(q07.castFunction(cls));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <U> ljf<U> collect(Callable<? extends U> callable, f11<? super U, ? super T> f11Var) {
        xjb.requireNonNull(callable, "initialItemSupplier is null");
        xjb.requireNonNull(f11Var, "collector is null");
        return pfe.onAssembly(new o96(this, callable, f11Var));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <U> ljf<U> collectInto(U u, f11<? super U, ? super T> f11Var) {
        xjb.requireNonNull(u, "initialItem is null");
        return collect(q07.justCallable(u), f11Var);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final <R> m86<R> compose(gl6<? super T, ? extends R> gl6Var) {
        return fromPublisher(((gl6) xjb.requireNonNull(gl6Var, "composer is null")).apply(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> concatMap(py6<? super T, ? extends zjd<? extends R>> py6Var) {
        return concatMap(py6Var, 2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final yd2 concatMapCompletable(py6<? super T, ? extends qh2> py6Var) {
        return concatMapCompletable(py6Var, 2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final yd2 concatMapCompletableDelayError(py6<? super T, ? extends qh2> py6Var) {
        return concatMapCompletableDelayError(py6Var, true, 2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> concatMapDelayError(py6<? super T, ? extends zjd<? extends R>> py6Var) {
        return concatMapDelayError(py6Var, 2, true);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> concatMapEager(py6<? super T, ? extends zjd<? extends R>> py6Var) {
        return concatMapEager(py6Var, bufferSize(), bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> concatMapEagerDelayError(py6<? super T, ? extends zjd<? extends R>> py6Var, boolean z) {
        return concatMapEagerDelayError(py6Var, bufferSize(), bufferSize(), z);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <U> m86<U> concatMapIterable(py6<? super T, ? extends Iterable<? extends U>> py6Var) {
        return concatMapIterable(py6Var, 2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> concatMapMaybe(py6<? super T, ? extends aaa<? extends R>> py6Var) {
        return concatMapMaybe(py6Var, 2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> concatMapMaybeDelayError(py6<? super T, ? extends aaa<? extends R>> py6Var) {
        return concatMapMaybeDelayError(py6Var, true, 2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> concatMapSingle(py6<? super T, ? extends pof<? extends R>> py6Var) {
        return concatMapSingle(py6Var, 2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> concatMapSingleDelayError(py6<? super T, ? extends pof<? extends R>> py6Var) {
        return concatMapSingleDelayError(py6Var, true, 2);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> concatWith(zjd<? extends T> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return concat(this, zjdVar);
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final ljf<Boolean> contains(Object obj) {
        xjb.requireNonNull(obj, "item is null");
        return any(q07.equalsWith(obj));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final ljf<Long> count() {
        return pfe.onAssembly(new wa6(this));
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("none")
    public final <U> m86<T> debounce(py6<? super T, ? extends zjd<U>> py6Var) {
        xjb.requireNonNull(py6Var, "debounceIndicator is null");
        return pfe.onAssembly(new ab6(this, py6Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> defaultIfEmpty(T t) {
        xjb.requireNonNull(t, "defaultItem is null");
        return switchIfEmpty(just(t));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U> m86<T> delay(py6<? super T, ? extends zjd<U>> py6Var) {
        xjb.requireNonNull(py6Var, "itemDelayIndicator is null");
        return (m86<T>) flatMap(ke6.itemDelay(py6Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U> m86<T> delaySubscription(zjd<U> zjdVar) {
        xjb.requireNonNull(zjdVar, "subscriptionIndicator is null");
        return pfe.onAssembly(new ib6(this, zjdVar));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @Deprecated
    @hpe("none")
    public final <T2> m86<T2> dematerialize() {
        return pfe.onAssembly(new kb6(this, q07.identity()));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> distinct() {
        return distinct(q07.identity(), q07.createHashSet());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> distinctUntilChanged() {
        return distinctUntilChanged(q07.identity());
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> doAfterNext(tu2<? super T> tu2Var) {
        xjb.requireNonNull(tu2Var, "onAfterNext is null");
        return pfe.onAssembly(new sb6(this, tu2Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> doAfterTerminate(InterfaceC7178i8 interfaceC7178i8) {
        return doOnEach(q07.emptyConsumer(), q07.emptyConsumer(), q07.f72641c, interfaceC7178i8);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> doFinally(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onFinally is null");
        return pfe.onAssembly(new ub6(this, interfaceC7178i8));
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> doOnCancel(InterfaceC7178i8 interfaceC7178i8) {
        return doOnLifecycle(q07.emptyConsumer(), q07.f72645g, interfaceC7178i8);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> doOnComplete(InterfaceC7178i8 interfaceC7178i8) {
        return doOnEach(q07.emptyConsumer(), q07.emptyConsumer(), interfaceC7178i8, q07.f72641c);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> doOnError(tu2<? super Throwable> tu2Var) {
        tu2<? super T> tu2VarEmptyConsumer = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return doOnEach(tu2VarEmptyConsumer, tu2Var, interfaceC7178i8, interfaceC7178i8);
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final m86<T> doOnLifecycle(tu2<? super fdg> tu2Var, yk9 yk9Var, InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(tu2Var, "onSubscribe is null");
        xjb.requireNonNull(yk9Var, "onRequest is null");
        xjb.requireNonNull(interfaceC7178i8, "onCancel is null");
        return pfe.onAssembly(new yb6(this, tu2Var, yk9Var, interfaceC7178i8));
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> doOnNext(tu2<? super T> tu2Var) {
        tu2<? super Throwable> tu2VarEmptyConsumer = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return doOnEach(tu2Var, tu2VarEmptyConsumer, interfaceC7178i8, interfaceC7178i8);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> doOnRequest(yk9 yk9Var) {
        return doOnLifecycle(q07.emptyConsumer(), yk9Var, q07.f72641c);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> doOnSubscribe(tu2<? super fdg> tu2Var) {
        return doOnLifecycle(tu2Var, q07.f72645g, q07.f72641c);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> doOnTerminate(InterfaceC7178i8 interfaceC7178i8) {
        return doOnEach(q07.emptyConsumer(), q07.actionConsumer(interfaceC7178i8), interfaceC7178i8, q07.f72641c);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final s4a<T> elementAt(long j) {
        if (j >= 0) {
            return pfe.onAssembly(new cc6(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final ljf<T> elementAtOrError(long j) {
        if (j >= 0) {
            return pfe.onAssembly(new fc6(this, j, null));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final m86<T> filter(m8d<? super T> m8dVar) {
        xjb.requireNonNull(m8dVar, "predicate is null");
        return pfe.onAssembly(new nc6(this, m8dVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final ljf<T> first(T t) {
        return elementAt(0L, t);
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final s4a<T> firstElement() {
        return elementAt(0L);
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final ljf<T> firstOrError() {
        return elementAtOrError(0L);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends R>> py6Var) {
        return flatMap((py6) py6Var, false, bufferSize(), bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final yd2 flatMapCompletable(py6<? super T, ? extends qh2> py6Var) {
        return flatMapCompletable(py6Var, false, Integer.MAX_VALUE);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <U> m86<U> flatMapIterable(py6<? super T, ? extends Iterable<? extends U>> py6Var) {
        return flatMapIterable(py6Var, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final <R> m86<R> flatMapMaybe(py6<? super T, ? extends aaa<? extends R>> py6Var) {
        return flatMapMaybe(py6Var, false, Integer.MAX_VALUE);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final <R> m86<R> flatMapSingle(py6<? super T, ? extends pof<? extends R>> py6Var) {
        return flatMapSingle(py6Var, false, Integer.MAX_VALUE);
    }

    @by1
    @hpe("none")
    @ap0(uo0.NONE)
    public final mf4 forEach(tu2<? super T> tu2Var) {
        return subscribe(tu2Var);
    }

    @by1
    @hpe("none")
    @ap0(uo0.NONE)
    public final mf4 forEachWhile(m8d<? super T> m8dVar) {
        return forEachWhile(m8dVar, q07.f72644f, q07.f72641c);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <K> m86<sb7<K, T>> groupBy(py6<? super T, ? extends K> py6Var) {
        return (m86<sb7<K, T>>) groupBy(py6Var, q07.identity(), false, bufferSize());
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("none")
    public final <TRight, TLeftEnd, TRightEnd, R> m86<R> groupJoin(zjd<? extends TRight> zjdVar, py6<? super T, ? extends zjd<TLeftEnd>> py6Var, py6<? super TRight, ? extends zjd<TRightEnd>> py6Var2, j11<? super T, ? super m86<TRight>, ? extends R> j11Var) {
        xjb.requireNonNull(zjdVar, "other is null");
        xjb.requireNonNull(py6Var, "leftEnd is null");
        xjb.requireNonNull(py6Var2, "rightEnd is null");
        xjb.requireNonNull(j11Var, "resultSelector is null");
        return pfe.onAssembly(new ce6(this, zjdVar, py6Var, py6Var2, j11Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> hide() {
        return pfe.onAssembly(new ee6(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final yd2 ignoreElements() {
        return pfe.onAssembly(new ie6(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final ljf<Boolean> isEmpty() {
        return all(q07.alwaysFalse());
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("none")
    public final <TRight, TLeftEnd, TRightEnd, R> m86<R> join(zjd<? extends TRight> zjdVar, py6<? super T, ? extends zjd<TLeftEnd>> py6Var, py6<? super TRight, ? extends zjd<TRightEnd>> py6Var2, j11<? super T, ? super TRight, ? extends R> j11Var) {
        xjb.requireNonNull(zjdVar, "other is null");
        xjb.requireNonNull(py6Var, "leftEnd is null");
        xjb.requireNonNull(py6Var2, "rightEnd is null");
        xjb.requireNonNull(j11Var, "resultSelector is null");
        return pfe.onAssembly(new qe6(this, zjdVar, py6Var, py6Var2, j11Var));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final ljf<T> last(T t) {
        xjb.requireNonNull(t, "defaultItem");
        return pfe.onAssembly(new we6(this, t));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final s4a<T> lastElement() {
        return pfe.onAssembly(new ue6(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final ljf<T> lastOrError() {
        return pfe.onAssembly(new we6(this, null));
    }

    @by1
    @ap0(uo0.SPECIAL)
    @bfb
    @hpe("none")
    public final <R> m86<R> lift(pg6<? extends R, ? super T> pg6Var) {
        xjb.requireNonNull(pg6Var, "lifter is null");
        return pfe.onAssembly(new af6(this, pg6Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final m86<T> limit(long j) {
        if (j >= 0) {
            return pfe.onAssembly(new bf6(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <R> m86<R> map(py6<? super T, ? extends R> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new cf6(this, py6Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<kgb<T>> materialize() {
        return pfe.onAssembly(new jf6(this));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> mergeWith(zjd<? extends T> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return merge(this, zjdVar);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final m86<T> observeOn(voe voeVar) {
        return observeOn(voeVar, false, bufferSize());
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <U> m86<U> ofType(Class<U> cls) {
        xjb.requireNonNull(cls, "clazz is null");
        return filter(q07.isInstanceOf(cls)).cast(cls);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final m86<T> onBackpressureBuffer() {
        return onBackpressureBuffer(bufferSize(), false, true);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final m86<T> onBackpressureDrop() {
        return pfe.onAssembly(new zf6(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final m86<T> onBackpressureLatest() {
        return pfe.onAssembly(new dg6(this));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> onErrorResumeNext(py6<? super Throwable, ? extends zjd<? extends T>> py6Var) {
        xjb.requireNonNull(py6Var, "resumeFunction is null");
        return pfe.onAssembly(new ig6(this, py6Var, false));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> onErrorReturn(py6<? super Throwable, ? extends T> py6Var) {
        xjb.requireNonNull(py6Var, "valueSupplier is null");
        return pfe.onAssembly(new kg6(this, py6Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> onErrorReturnItem(T t) {
        xjb.requireNonNull(t, "item is null");
        return onErrorReturn(q07.justFunction(t));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> onExceptionResumeNext(zjd<? extends T> zjdVar) {
        xjb.requireNonNull(zjdVar, "next is null");
        return pfe.onAssembly(new ig6(this, q07.justFunction(zjdVar), true));
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> onTerminateDetach() {
        return pfe.onAssembly(new mb6(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final fec<T> parallel() {
        return fec.from(this);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final nr2<T> publish() {
        return publish(bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> rebatchRequests(int i) {
        return observeOn(rw7.f79930c, true, i);
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final s4a<T> reduce(j11<T, T, T> j11Var) {
        xjb.requireNonNull(j11Var, "reducer is null");
        return pfe.onAssembly(new eh6(this, j11Var));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <R> ljf<R> reduceWith(Callable<R> callable, j11<R, ? super T, R> j11Var) {
        xjb.requireNonNull(callable, "seedSupplier is null");
        xjb.requireNonNull(j11Var, "reducer is null");
        return pfe.onAssembly(new jh6(this, callable, j11Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> repeatUntil(eb1 eb1Var) {
        xjb.requireNonNull(eb1Var, "stop is null");
        return pfe.onAssembly(new oh6(this, eb1Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> repeatWhen(py6<? super m86<Object>, ? extends zjd<?>> py6Var) {
        xjb.requireNonNull(py6Var, "handler is null");
        return pfe.onAssembly(new qh6(this, py6Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final nr2<T> replay() {
        return sh6.createFrom(this);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> retry() {
        return retry(Long.MAX_VALUE, q07.alwaysTrue());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> retryUntil(eb1 eb1Var) {
        xjb.requireNonNull(eb1Var, "stop is null");
        return retry(Long.MAX_VALUE, q07.predicateReverseFor(eb1Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> retryWhen(py6<? super m86<Throwable>, ? extends zjd<?>> py6Var) {
        xjb.requireNonNull(py6Var, "handler is null");
        return pfe.onAssembly(new yh6(this, py6Var));
    }

    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final void safeSubscribe(ycg<? super T> ycgVar) {
        xjb.requireNonNull(ycgVar, "s is null");
        if (ycgVar instanceof ale) {
            subscribe((lj6) ycgVar);
        } else {
            subscribe((lj6) new ale(ycgVar));
        }
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<T> sample(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit, npe.computation());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> scan(j11<T, T, T> j11Var) {
        xjb.requireNonNull(j11Var, "accumulator is null");
        return pfe.onAssembly(new gi6(this, j11Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> scanWith(Callable<R> callable, j11<R, ? super T, R> j11Var) {
        xjb.requireNonNull(callable, "seedSupplier is null");
        xjb.requireNonNull(j11Var, "accumulator is null");
        return pfe.onAssembly(new ii6(this, callable, j11Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> serialize() {
        return pfe.onAssembly(new pi6(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> share() {
        return publish().refCount();
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final ljf<T> single(T t) {
        xjb.requireNonNull(t, "defaultItem is null");
        return pfe.onAssembly(new ui6(this, t));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final s4a<T> singleElement() {
        return pfe.onAssembly(new si6(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final ljf<T> singleOrError() {
        return pfe.onAssembly(new ui6(this, null));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> skip(long j) {
        return j <= 0 ? pfe.onAssembly(this) : pfe.onAssembly(new xi6(this, j));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> skipLast(int i) {
        if (i >= 0) {
            return i == 0 ? pfe.onAssembly(this) : pfe.onAssembly(new zi6(this, i));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U> m86<T> skipUntil(zjd<U> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return pfe.onAssembly(new dj6(this, zjdVar));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> skipWhile(m8d<? super T> m8dVar) {
        xjb.requireNonNull(m8dVar, "predicate is null");
        return pfe.onAssembly(new fj6(this, m8dVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> sorted() {
        return toList().toFlowable().map(q07.listSorter(q07.naturalComparator())).flatMapIterable(q07.identity());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> startWithArray(T... tArr) {
        m86 m86VarFromArray = fromArray(tArr);
        return m86VarFromArray == empty() ? pfe.onAssembly(this) : concatArray(m86VarFromArray, this);
    }

    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final mf4 subscribe() {
        return subscribe(q07.emptyConsumer(), q07.f72644f, q07.f72641c, ke6.EnumC8306i.INSTANCE);
    }

    public abstract void subscribeActual(ycg<? super T> ycgVar);

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("custom")
    public final m86<T> subscribeOn(@bfb voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return subscribeOn(voeVar, !(this instanceof ya6));
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final <E extends ycg<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> switchIfEmpty(zjd<? extends T> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return pfe.onAssembly(new mj6(this, zjdVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> switchMap(py6<? super T, ? extends zjd<? extends R>> py6Var) {
        return switchMap(py6Var, bufferSize());
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final yd2 switchMapCompletable(@bfb py6<? super T, ? extends qh2> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new qj6(this, py6Var, false));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final yd2 switchMapCompletableDelayError(@bfb py6<? super T, ? extends qh2> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new qj6(this, py6Var, true));
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final <R> m86<R> switchMapDelayError(py6<? super T, ? extends zjd<? extends R>> py6Var) {
        return switchMapDelayError(py6Var, bufferSize());
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <R> m86<R> switchMapMaybe(@bfb py6<? super T, ? extends aaa<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new tj6(this, py6Var, false));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <R> m86<R> switchMapMaybeDelayError(@bfb py6<? super T, ? extends aaa<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new tj6(this, py6Var, true));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <R> m86<R> switchMapSingle(@bfb py6<? super T, ? extends pof<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new wj6(this, py6Var, false));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <R> m86<R> switchMapSingleDelayError(@bfb py6<? super T, ? extends pof<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new wj6(this, py6Var, true));
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final m86<T> take(long j) {
        if (j >= 0) {
            return pfe.onAssembly(new zj6(this, j));
        }
        throw new IllegalArgumentException("count >= 0 required but it was " + j);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> takeLast(int i) {
        if (i >= 0) {
            return i == 0 ? pfe.onAssembly(new ge6(this)) : i == 1 ? pfe.onAssembly(new dk6(this)) : pfe.onAssembly(new bk6(this, i));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + i);
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final m86<T> takeUntil(m8d<? super T> m8dVar) {
        xjb.requireNonNull(m8dVar, "stopPredicate is null");
        return pfe.onAssembly(new lk6(this, m8dVar));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final m86<T> takeWhile(m8d<? super T> m8dVar) {
        xjb.requireNonNull(m8dVar, "predicate is null");
        return pfe.onAssembly(new nk6(this, m8dVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final mpg<T> test() {
        mpg<T> mpgVar = new mpg<>();
        subscribe((lj6) mpgVar);
        return mpgVar;
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<T> throttleFirst(long j, TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, npe.computation());
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<T> throttleLast(long j, TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<T> throttleLatest(long j, TimeUnit timeUnit) {
        return throttleLatest(j, timeUnit, npe.computation(), false);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<T> throttleWithTimeout(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<i1h<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, npe.computation());
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final <V> m86<T> timeout(py6<? super T, ? extends zjd<V>> py6Var) {
        return timeout0(null, py6Var, null);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<i1h<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, npe.computation());
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    /* JADX INFO: renamed from: to */
    public final <R> R m17128to(py6<? super m86<T>, R> py6Var) {
        try {
            return (R) ((py6) xjb.requireNonNull(py6Var, "converter is null")).apply(this);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            throw j75.wrapOrThrow(th);
        }
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new r17());
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final ljf<List<T>> toList() {
        return pfe.onAssembly(new dl6(this));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <K> ljf<Map<K, T>> toMap(py6<? super T, ? extends K> py6Var) {
        xjb.requireNonNull(py6Var, "keySelector is null");
        return (ljf<Map<K, T>>) collect(ph7.asCallable(), q07.toMapKeySelector(py6Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final <K> ljf<Map<K, Collection<T>>> toMultimap(py6<? super T, ? extends K> py6Var) {
        return (ljf<Map<K, Collection<T>>>) toMultimap(py6Var, q07.identity(), ph7.asCallable(), v60.asFunction());
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final Observable<T> toObservable() {
        return pfe.onAssembly(new tpb(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final ljf<List<T>> toSortedList() {
        return toSortedList(q07.naturalComparator());
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("custom")
    public final m86<T> unsubscribeOn(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new hl6(this, voeVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<m86<T>> window(long j) {
        return window(j, j, bufferSize());
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <U, R> m86<R> withLatestFrom(zjd<? extends U> zjdVar, j11<? super T, ? super U, ? extends R> j11Var) {
        xjb.requireNonNull(zjdVar, "other is null");
        xjb.requireNonNull(j11Var, "combiner is null");
        return pfe.onAssembly(new vl6(this, j11Var, zjdVar));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U, R> m86<R> zipWith(Iterable<U> iterable, j11<? super T, ? super U, ? extends R> j11Var) {
        xjb.requireNonNull(iterable, "other is null");
        xjb.requireNonNull(j11Var, "zipper is null");
        return pfe.onAssembly(new bm6(this, iterable, j11Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T, R> m86<R> combineLatest(py6<? super Object[], ? extends R> py6Var, zjd<? extends T>... zjdVarArr) {
        return combineLatest(zjdVarArr, py6Var, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T, R> m86<R> combineLatestDelayError(py6<? super Object[], ? extends R> py6Var, zjd<? extends T>... zjdVarArr) {
        return combineLatestDelayError(zjdVarArr, py6Var, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concatArrayEager(int i, int i2, zjd<? extends T>... zjdVarArr) {
        xjb.requireNonNull(zjdVarArr, "sources is null");
        xjb.verifyPositive(i, "maxConcurrency");
        xjb.verifyPositive(i2, "prefetch");
        return pfe.onAssembly(new aa6(new hd6(zjdVarArr), q07.identity(), i, i2, f55.IMMEDIATE));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatArrayEagerDelayError(int i, int i2, zjd<? extends T>... zjdVarArr) {
        return fromArray(zjdVarArr).concatMapEagerDelayError(q07.identity(), i, i2, true);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concatEager(zjd<? extends zjd<? extends T>> zjdVar, int i, int i2) {
        xjb.requireNonNull(zjdVar, "sources is null");
        xjb.verifyPositive(i, "maxConcurrency");
        xjb.verifyPositive(i2, "prefetch");
        return pfe.onAssembly(new da6(zjdVar, q07.identity(), i, i2, f55.IMMEDIATE));
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public static m86<Long> interval(long j, long j2, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new me6(Math.max(0L, j), Math.max(0L, j2), timeUnit, voeVar));
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public static m86<Long> intervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, voe voeVar) {
        if (j2 < 0) {
            throw new IllegalArgumentException("count >= 0 required but it was " + j2);
        }
        if (j2 == 0) {
            return empty().delay(j3, timeUnit, voeVar);
        }
        long j5 = j + (j2 - 1);
        if (j > 0 && j5 < 0) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new oe6(j, j5, Math.max(0L, j3), Math.max(0L, j4), timeUnit, voeVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> merge(Iterable<? extends zjd<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(q07.identity());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeArray(zjd<? extends T>... zjdVarArr) {
        return fromArray(zjdVarArr).flatMap(q07.identity(), zjdVarArr.length);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeArrayDelayError(zjd<? extends T>... zjdVarArr) {
        return fromArray(zjdVarArr).flatMap(q07.identity(), true, zjdVarArr.length);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeDelayError(Iterable<? extends zjd<? extends T>> iterable, int i, int i2) {
        return fromIterable(iterable).flatMap(q07.identity(), true, i, i2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> ljf<Boolean> sequenceEqual(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, m11<? super T, ? super T> m11Var) {
        return sequenceEqual(zjdVar, zjdVar2, m11Var, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> switchOnNext(zjd<? extends zjd<? extends T>> zjdVar) {
        return fromPublisher(zjdVar).switchMap(q07.identity());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> switchOnNextDelayError(zjd<? extends zjd<? extends T>> zjdVar, int i) {
        return fromPublisher(zjdVar).switchMapDelayError(q07.identity(), i);
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public static m86<Long> timer(long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new zk6(Math.max(0L, j), timeUnit, voeVar));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public static <T, D> m86<T> using(Callable<? extends D> callable, py6<? super D, ? extends zjd<? extends T>> py6Var, tu2<? super D> tu2Var, boolean z) {
        xjb.requireNonNull(callable, "resourceSupplier is null");
        xjb.requireNonNull(py6Var, "sourceSupplier is null");
        xjb.requireNonNull(tu2Var, "resourceDisposer is null");
        return pfe.onAssembly(new jl6(callable, py6Var, tu2Var, z));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final Iterable<T> blockingIterable(int i) {
        xjb.verifyPositive(i, "bufferSize");
        return new k71(this, i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final T blockingSingle(T t) {
        return single(t).blockingGet();
    }

    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final void blockingSubscribe(tu2<? super T> tu2Var) {
        a96.subscribe(this, tu2Var, q07.f72644f, q07.f72641c);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<List<T>> buffer(int i, int i2) {
        return (m86<List<T>>) buffer(i, i2, v60.asCallable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> concatMap(py6<? super T, ? extends zjd<? extends R>> py6Var, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        if (!(this instanceof ime)) {
            return pfe.onAssembly(new w96(this, py6Var, i, f55.IMMEDIATE));
        }
        Object objCall = ((ime) this).call();
        return objCall == null ? empty() : ei6.scalarXMap(objCall, py6Var);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final yd2 concatMapCompletable(py6<? super T, ? extends qh2> py6Var, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new y96(this, py6Var, f55.IMMEDIATE, i));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final yd2 concatMapCompletableDelayError(py6<? super T, ? extends qh2> py6Var, boolean z) {
        return concatMapCompletableDelayError(py6Var, z, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> concatMapDelayError(py6<? super T, ? extends zjd<? extends R>> py6Var, int i, boolean z) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        if (!(this instanceof ime)) {
            return pfe.onAssembly(new w96(this, py6Var, i, z ? f55.END : f55.BOUNDARY));
        }
        Object objCall = ((ime) this).call();
        return objCall == null ? empty() : ei6.scalarXMap(objCall, py6Var);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> concatMapEager(py6<? super T, ? extends zjd<? extends R>> py6Var, int i, int i2) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "maxConcurrency");
        xjb.verifyPositive(i2, "prefetch");
        return pfe.onAssembly(new aa6(this, py6Var, i, i2, f55.IMMEDIATE));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> concatMapEagerDelayError(py6<? super T, ? extends zjd<? extends R>> py6Var, int i, int i2, boolean z) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "maxConcurrency");
        xjb.verifyPositive(i2, "prefetch");
        return pfe.onAssembly(new aa6(this, py6Var, i, i2, z ? f55.END : f55.BOUNDARY));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U> m86<U> concatMapIterable(py6<? super T, ? extends Iterable<? extends U>> py6Var, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new ed6(this, py6Var, i));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> concatMapMaybe(py6<? super T, ? extends aaa<? extends R>> py6Var, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new ea6(this, py6Var, f55.IMMEDIATE, i));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> concatMapMaybeDelayError(py6<? super T, ? extends aaa<? extends R>> py6Var, boolean z) {
        return concatMapMaybeDelayError(py6Var, z, 2);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> concatMapSingle(py6<? super T, ? extends pof<? extends R>> py6Var, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new ja6(this, py6Var, f55.IMMEDIATE, i));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> concatMapSingleDelayError(py6<? super T, ? extends pof<? extends R>> py6Var, boolean z) {
        return concatMapSingleDelayError(py6Var, z, 2);
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @fg5
    @hpe("none")
    public final <R> m86<R> dematerialize(py6<? super T, kgb<R>> py6Var) {
        xjb.requireNonNull(py6Var, "selector is null");
        return pfe.onAssembly(new kb6(this, py6Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <K> m86<T> distinct(py6<? super T, K> py6Var) {
        return distinct(py6Var, q07.createHashSet());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <K> m86<T> distinctUntilChanged(py6<? super T, K> py6Var) {
        xjb.requireNonNull(py6Var, "keySelector is null");
        return pfe.onAssembly(new qb6(this, py6Var, xjb.equalsPredicate()));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends R>> py6Var, boolean z) {
        return flatMap(py6Var, z, bufferSize(), bufferSize());
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final yd2 flatMapCompletable(py6<? super T, ? extends qh2> py6Var, boolean z, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "maxConcurrency");
        return pfe.onAssembly(new uc6(this, py6Var, z, i));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U> m86<U> flatMapIterable(py6<? super T, ? extends Iterable<? extends U>> py6Var, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new ed6(this, py6Var, i));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <R> m86<R> flatMapMaybe(py6<? super T, ? extends aaa<? extends R>> py6Var, boolean z, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "maxConcurrency");
        return pfe.onAssembly(new wc6(this, py6Var, z, i));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <R> m86<R> flatMapSingle(py6<? super T, ? extends pof<? extends R>> py6Var, boolean z, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "maxConcurrency");
        return pfe.onAssembly(new ad6(this, py6Var, z, i));
    }

    @by1
    @hpe("none")
    @ap0(uo0.NONE)
    public final mf4 forEachWhile(m8d<? super T> m8dVar, tu2<? super Throwable> tu2Var) {
        return forEachWhile(m8dVar, tu2Var, q07.f72641c);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <K> m86<sb7<K, T>> groupBy(py6<? super T, ? extends K> py6Var, boolean z) {
        return (m86<sb7<K, T>>) groupBy(py6Var, q07.identity(), z, bufferSize());
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final m86<T> observeOn(voe voeVar, boolean z) {
        return observeOn(voeVar, z, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final m86<T> onBackpressureBuffer(boolean z) {
        return onBackpressureBuffer(bufferSize(), z, true);
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final m86<T> onBackpressureDrop(tu2<? super T> tu2Var) {
        xjb.requireNonNull(tu2Var, "onDrop is null");
        return pfe.onAssembly(new zf6(this, tu2Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final fec<T> parallel(int i) {
        xjb.verifyPositive(i, "parallelism");
        return fec.from(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> publish(py6<? super m86<T>, ? extends zjd<R>> py6Var) {
        return publish(py6Var, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> repeat(long j) {
        if (j >= 0) {
            return j == 0 ? empty() : pfe.onAssembly(new mh6(this, j));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> replay(py6<? super m86<T>, ? extends zjd<R>> py6Var) {
        xjb.requireNonNull(py6Var, "selector is null");
        return sh6.multicastSelector(ke6.replayCallable(this), py6Var);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> retry(m11<? super Integer, ? super Throwable> m11Var) {
        xjb.requireNonNull(m11Var, "predicate is null");
        return pfe.onAssembly(new uh6(this, m11Var));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<T> sample(long j, TimeUnit timeUnit, boolean z) {
        return sample(j, timeUnit, npe.computation(), z);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> sorted(Comparator<? super T> comparator) {
        xjb.requireNonNull(comparator, "sortFunction");
        return toList().toFlowable().map(q07.listSorter(comparator)).flatMapIterable(q07.identity());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> startWith(zjd<? extends T> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return concatArray(zjdVar, this);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final mf4 subscribe(tu2<? super T> tu2Var) {
        return subscribe(tu2Var, q07.f72644f, q07.f72641c, ke6.EnumC8306i.INSTANCE);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> switchMap(py6<? super T, ? extends zjd<? extends R>> py6Var, int i) {
        return m17126a(py6Var, i, false);
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final <R> m86<R> switchMapDelayError(py6<? super T, ? extends zjd<? extends R>> py6Var, int i) {
        return m17126a(py6Var, i, true);
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public final m86<T> throttleFirst(long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new pk6(this, j, timeUnit, voeVar));
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final m86<T> throttleLast(long j, TimeUnit timeUnit, voe voeVar) {
        return sample(j, timeUnit, voeVar);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<T> throttleLatest(long j, TimeUnit timeUnit, boolean z) {
        return throttleLatest(j, timeUnit, npe.computation(), z);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final m86<T> throttleWithTimeout(long j, TimeUnit timeUnit, voe voeVar) {
        return debounce(j, timeUnit, voeVar);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<i1h<T>> timeInterval(voe voeVar) {
        return timeInterval(TimeUnit.MILLISECONDS, voeVar);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <V> m86<T> timeout(py6<? super T, ? extends zjd<V>> py6Var, m86<? extends T> m86Var) {
        xjb.requireNonNull(m86Var, "other is null");
        return timeout0(null, py6Var, m86Var);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<i1h<T>> timestamp(voe voeVar) {
        return timestamp(TimeUnit.MILLISECONDS, voeVar);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final ljf<List<T>> toList(int i) {
        xjb.verifyPositive(i, "capacityHint");
        return pfe.onAssembly(new dl6(this, q07.createArrayList(i)));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final ljf<List<T>> toSortedList(Comparator<? super T> comparator) {
        xjb.requireNonNull(comparator, "comparator is null");
        return (ljf<List<T>>) toList().map(q07.listSorter(comparator));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<m86<T>> window(long j, long j2) {
        return window(j, j2, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T, R> m86<R> combineLatest(zjd<? extends T>[] zjdVarArr, py6<? super Object[], ? extends R> py6Var, int i) {
        xjb.requireNonNull(zjdVarArr, "sources is null");
        if (zjdVarArr.length == 0) {
            return empty();
        }
        xjb.requireNonNull(py6Var, "combiner is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new s96((zjd[]) zjdVarArr, (py6) py6Var, i, false));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T, R> m86<R> combineLatestDelayError(py6<? super Object[], ? extends R> py6Var, int i, zjd<? extends T>... zjdVarArr) {
        return combineLatestDelayError(zjdVarArr, py6Var, i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concat(zjd<? extends zjd<? extends T>> zjdVar) {
        return concat(zjdVar, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatDelayError(zjd<? extends zjd<? extends T>> zjdVar) {
        return concatDelayError(zjdVar, bufferSize(), true);
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public static <T> m86<T> error(Throwable th) {
        xjb.requireNonNull(th, "throwable is null");
        return error((Callable<? extends Throwable>) q07.justCallable(th));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        xjb.requireNonNull(future, "future is null");
        xjb.requireNonNull(timeUnit, "unit is null");
        return pfe.onAssembly(new od6(future, j, timeUnit));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> just(T t, T t2) {
        xjb.requireNonNull(t, "item1 is null");
        xjb.requireNonNull(t2, "item2 is null");
        return fromArray(t, t2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> merge(Iterable<? extends zjd<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(q07.identity(), i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeDelayError(Iterable<? extends zjd<? extends T>> iterable, int i) {
        return fromIterable(iterable).flatMap(q07.identity(), true, i);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> ljf<Boolean> sequenceEqual(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, m11<? super T, ? super T> m11Var, int i) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(m11Var, "isEqual is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new mi6(zjdVar, zjdVar2, m11Var, i));
    }

    @hpe("none")
    @ap0(uo0.FULL)
    public final void blockingSubscribe(tu2<? super T> tu2Var, int i) {
        a96.subscribe(this, tu2Var, q07.f72644f, q07.f72641c, i);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U extends Collection<? super T>> m86<U> buffer(int i, int i2, Callable<U> callable) {
        xjb.verifyPositive(i, "count");
        xjb.verifyPositive(i2, RadialViewGroup.f22860u2);
        xjb.requireNonNull(callable, "bufferSupplier is null");
        return pfe.onAssembly(new b96(this, i, i2, callable));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final yd2 concatMapCompletableDelayError(py6<? super T, ? extends qh2> py6Var, boolean z, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new y96(this, py6Var, z ? f55.END : f55.BOUNDARY, i));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> concatMapMaybeDelayError(py6<? super T, ? extends aaa<? extends R>> py6Var, boolean z, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new ea6(this, py6Var, z ? f55.END : f55.BOUNDARY, i));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> concatMapSingleDelayError(py6<? super T, ? extends pof<? extends R>> py6Var, boolean z, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new ja6(this, py6Var, z ? f55.END : f55.BOUNDARY, i));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> concatWith(@bfb pof<? extends T> pofVar) {
        xjb.requireNonNull(pofVar, "other is null");
        return pfe.onAssembly(new qa6(this, pofVar));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<T> debounce(long j, TimeUnit timeUnit) {
        return debounce(j, timeUnit, npe.computation());
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.FULL)
    public final m86<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, npe.computation(), false);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.FULL)
    public final m86<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, npe.computation());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <K> m86<T> distinct(py6<? super T, K> py6Var, Callable<? extends Collection<? super K>> callable) {
        xjb.requireNonNull(py6Var, "keySelector is null");
        xjb.requireNonNull(callable, "collectionSupplier is null");
        return pfe.onAssembly(new ob6(this, py6Var, callable));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final ljf<T> elementAt(long j, T t) {
        if (j >= 0) {
            xjb.requireNonNull(t, "defaultItem is null");
            return pfe.onAssembly(new fc6(this, j, t));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends R>> py6Var, int i) {
        return flatMap((py6) py6Var, false, i, bufferSize());
    }

    @by1
    @ap0(uo0.NONE)
    @bfb
    @hpe("none")
    public final mf4 forEachWhile(m8d<? super T> m8dVar, tu2<? super Throwable> tu2Var, InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(m8dVar, "onNext is null");
        xjb.requireNonNull(tu2Var, "onError is null");
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        tp6 tp6Var = new tp6(m8dVar, tu2Var, interfaceC7178i8);
        subscribe((lj6) tp6Var);
        return tp6Var;
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <K, V> m86<sb7<K, V>> groupBy(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2) {
        return groupBy(py6Var, py6Var2, false, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> mergeWith(@bfb pof<? extends T> pofVar) {
        xjb.requireNonNull(pofVar, "other is null");
        return pfe.onAssembly(new pf6(this, pofVar));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("custom")
    public final m86<T> observeOn(voe voeVar, boolean z, int i) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new tf6(this, voeVar, z, i));
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final m86<T> onBackpressureBuffer(int i) {
        return onBackpressureBuffer(i, false, false);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> onErrorResumeNext(zjd<? extends T> zjdVar) {
        xjb.requireNonNull(zjdVar, "next is null");
        return onErrorResumeNext(q07.justFunction(zjdVar));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> publish(py6<? super m86<T>, ? extends zjd<? extends R>> py6Var, int i) {
        xjb.requireNonNull(py6Var, "selector is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new wg6(this, py6Var, i, false));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <R> ljf<R> reduce(R r, j11<R, ? super T, R> j11Var) {
        xjb.requireNonNull(r, "seed is null");
        xjb.requireNonNull(j11Var, "reducer is null");
        return pfe.onAssembly(new gh6(this, r, j11Var));
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public final m86<T> sample(long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new ci6(this, j, timeUnit, voeVar, false));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> scan(R r, j11<R, ? super T, R> j11Var) {
        xjb.requireNonNull(r, "initialValue is null");
        return scanWith(q07.justCallable(r), j11Var);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> skip(long j, TimeUnit timeUnit) {
        return skipUntil(timer(j, timeUnit));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final mf4 subscribe(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2) {
        return subscribe(tu2Var, tu2Var2, q07.f72641c, ke6.EnumC8306i.INSTANCE);
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("custom")
    public final m86<T> subscribeOn(@bfb voe voeVar, boolean z) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new ij6(this, voeVar, z));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> take(long j, TimeUnit timeUnit) {
        return takeUntil(timer(j, timeUnit));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <U> m86<T> takeUntil(zjd<U> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return pfe.onAssembly(new jk6(this, zjdVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final mpg<T> test(long j) {
        mpg<T> mpgVar = new mpg<>(j);
        subscribe((lj6) mpgVar);
        return mpgVar;
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final m86<T> throttleLatest(long j, TimeUnit timeUnit, voe voeVar) {
        return throttleLatest(j, timeUnit, voeVar, false);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<i1h<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, npe.computation());
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<i1h<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, npe.computation());
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <K, V> ljf<Map<K, V>> toMap(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2) {
        xjb.requireNonNull(py6Var, "keySelector is null");
        xjb.requireNonNull(py6Var2, "valueSelector is null");
        return (ljf<Map<K, V>>) collect(ph7.asCallable(), q07.toMapKeyValueSelector(py6Var, py6Var2));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<m86<T>> window(long j, long j2, int i) {
        xjb.verifyPositive(j2, RadialViewGroup.f22860u2);
        xjb.verifyPositive(j, "count");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new ll6(this, j, j2, i));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T, R> m86<R> combineLatestDelayError(zjd<? extends T>[] zjdVarArr, py6<? super Object[], ? extends R> py6Var, int i) {
        xjb.requireNonNull(zjdVarArr, "sources is null");
        xjb.requireNonNull(py6Var, "combiner is null");
        xjb.verifyPositive(i, "bufferSize");
        if (zjdVarArr.length == 0) {
            return empty();
        }
        return pfe.onAssembly(new s96((zjd[]) zjdVarArr, (py6) py6Var, i, true));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concat(zjd<? extends zjd<? extends T>> zjdVar, int i) {
        return fromPublisher(zjdVar).concatMap(q07.identity(), i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatDelayError(zjd<? extends zjd<? extends T>> zjdVar, int i, boolean z) {
        return fromPublisher(zjdVar).concatMapDelayError(q07.identity(), i, z);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> merge(zjd<? extends zjd<? extends T>> zjdVar) {
        return merge(zjdVar, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeDelayError(zjd<? extends zjd<? extends T>> zjdVar) {
        return mergeDelayError(zjdVar, bufferSize());
    }

    private <U, V> m86<T> timeout0(zjd<U> zjdVar, py6<? super T, ? extends zjd<V>> py6Var, zjd<? extends T> zjdVar2) {
        xjb.requireNonNull(py6Var, "itemTimeoutIndicator is null");
        return pfe.onAssembly(new vk6(this, zjdVar, py6Var, zjdVar2));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T, R> m86<R> zip(zjd<? extends zjd<? extends T>> zjdVar, py6<? super Object[], ? extends R> py6Var) {
        xjb.requireNonNull(py6Var, "zipper is null");
        return fromPublisher(zjdVar).toList().flatMapPublisher(ke6.zipIterable(py6Var));
    }

    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final void blockingSubscribe(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2) {
        a96.subscribe(this, tu2Var, tu2Var2, q07.f72641c);
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public final m86<T> debounce(long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new cb6(this, j, timeUnit, voeVar));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.FULL)
    public final m86<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, npe.computation(), z);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final m86<T> delaySubscription(long j, TimeUnit timeUnit, voe voeVar) {
        return delaySubscription(timer(j, timeUnit, voeVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> distinctUntilChanged(m11<? super T, ? super T> m11Var) {
        xjb.requireNonNull(m11Var, "comparer is null");
        return pfe.onAssembly(new qb6(this, q07.identity(), m11Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends R>> py6Var, boolean z, int i) {
        return flatMap(py6Var, z, i, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <K, V> m86<sb7<K, V>> groupBy(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, boolean z) {
        return groupBy(py6Var, py6Var2, z, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final m86<T> onBackpressureBuffer(int i, boolean z) {
        return onBackpressureBuffer(i, z, false);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final fec<T> parallel(int i, int i2) {
        xjb.verifyPositive(i, "parallelism");
        xjb.verifyPositive(i2, "prefetch");
        return fec.from(this, i, i2);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> replay(py6<? super m86<T>, ? extends zjd<R>> py6Var, int i) {
        xjb.requireNonNull(py6Var, "selector is null");
        xjb.verifyPositive(i, "bufferSize");
        return sh6.multicastSelector(ke6.replayCallable(this, i), py6Var);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> retry(long j) {
        return retry(j, q07.alwaysTrue());
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final m86<T> skip(long j, TimeUnit timeUnit, voe voeVar) {
        return skipUntil(timer(j, timeUnit, voeVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final m86<T> skipLast(long j, TimeUnit timeUnit) {
        return skipLast(j, timeUnit, npe.computation(), false, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> startWith(T t) {
        xjb.requireNonNull(t, "value is null");
        return concatArray(just(t), this);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final mf4 subscribe(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8) {
        return subscribe(tu2Var, tu2Var2, interfaceC7178i8, ke6.EnumC8306i.INSTANCE);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> take(long j, TimeUnit timeUnit, voe voeVar) {
        return takeUntil(timer(j, timeUnit, voeVar));
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public final m86<T> throttleLatest(long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new rk6(this, j, timeUnit, voeVar, z));
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<i1h<T>> timeInterval(TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new tk6(this, timeUnit, voeVar));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, null, npe.computation());
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final m86<i1h<T>> timestamp(TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return (m86<i1h<T>>) map(q07.timestampWith(timeUnit, voeVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final <U extends Collection<? super T>> ljf<U> toList(Callable<U> callable) {
        xjb.requireNonNull(callable, "collectionSupplier is null");
        return pfe.onAssembly(new dl6(this, callable));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final ljf<List<T>> toSortedList(Comparator<? super T> comparator, int i) {
        xjb.requireNonNull(comparator, "comparator is null");
        return (ljf<List<T>>) toList(i).map(q07.listSorter(comparator));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <T1, T2, R> m86<R> withLatestFrom(zjd<T1> zjdVar, zjd<T2> zjdVar2, iz6<? super T, ? super T1, ? super T2, R> iz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        return withLatestFrom((zjd<?>[]) new zjd[]{zjdVar, zjdVar2}, q07.toFunction(iz6Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U, R> m86<R> zipWith(zjd<? extends U> zjdVar, j11<? super T, ? super U, ? extends R> j11Var) {
        xjb.requireNonNull(zjdVar, "other is null");
        return zip(this, zjdVar, j11Var);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        return concatArray(zjdVar, zjdVar2);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public static m86<Long> interval(long j, TimeUnit timeUnit) {
        return interval(j, j, timeUnit, npe.computation());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> merge(zjd<? extends zjd<? extends T>> zjdVar, int i) {
        return fromPublisher(zjdVar).flatMap(q07.identity(), i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeDelayError(zjd<? extends zjd<? extends T>> zjdVar, int i) {
        return fromPublisher(zjdVar).flatMap(q07.identity(), true, i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final T blockingFirst(T t) {
        j71 j71Var = new j71();
        subscribe((lj6) j71Var);
        T tBlockingGet = j71Var.blockingGet();
        return tBlockingGet != null ? tBlockingGet : t;
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final T blockingLast(T t) {
        z71 z71Var = new z71();
        subscribe((lj6) z71Var);
        T tBlockingGet = z71Var.blockingGet();
        return tBlockingGet != null ? tBlockingGet : t;
    }

    @hpe("none")
    @ap0(uo0.FULL)
    public final void blockingSubscribe(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, int i) {
        a96.subscribe(this, tu2Var, tu2Var2, q07.f72641c, i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> concatWith(@bfb aaa<? extends T> aaaVar) {
        xjb.requireNonNull(aaaVar, "other is null");
        return pfe.onAssembly(new oa6(this, aaaVar));
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final m86<T> delay(long j, TimeUnit timeUnit, voe voeVar) {
        return delay(j, timeUnit, voeVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends R>> py6Var, boolean z, int i, int i2) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "maxConcurrency");
        xjb.verifyPositive(i2, "bufferSize");
        if (this instanceof ime) {
            Object objCall = ((ime) this).call();
            if (objCall == null) {
                return empty();
            }
            return ei6.scalarXMap(objCall, py6Var);
        }
        return pfe.onAssembly(new qc6(this, py6Var, z, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U, V> m86<V> flatMapIterable(py6<? super T, ? extends Iterable<? extends U>> py6Var, j11<? super T, ? super U, ? extends V> j11Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.requireNonNull(j11Var, "resultSelector is null");
        return (m86<V>) flatMap(ke6.flatMapIntoIterable(py6Var), j11Var, false, bufferSize(), bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <K, V> m86<sb7<K, V>> groupBy(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, boolean z, int i) {
        xjb.requireNonNull(py6Var, "keySelector is null");
        xjb.requireNonNull(py6Var2, "valueSelector is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new ae6(this, py6Var, py6Var2, i, z, null));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> mergeWith(@bfb aaa<? extends T> aaaVar) {
        xjb.requireNonNull(aaaVar, "other is null");
        return pfe.onAssembly(new nf6(this, aaaVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final m86<T> onBackpressureBuffer(int i, boolean z, boolean z2) {
        xjb.verifyPositive(i, "capacity");
        return pfe.onAssembly(new vf6(this, i, z2, z, q07.f72641c));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> retry(long j, m8d<? super Throwable> m8dVar) {
        if (j >= 0) {
            xjb.requireNonNull(m8dVar, "predicate is null");
            return pfe.onAssembly(new wh6(this, j, m8dVar));
        }
        throw new IllegalArgumentException("times >= 0 required but it was " + j);
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final m86<T> skipLast(long j, TimeUnit timeUnit, boolean z) {
        return skipLast(j, timeUnit, npe.computation(), z, bufferSize());
    }

    @by1
    @ap0(uo0.SPECIAL)
    @bfb
    @hpe("none")
    public final mf4 subscribe(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, tu2<? super fdg> tu2Var3) {
        xjb.requireNonNull(tu2Var, "onNext is null");
        xjb.requireNonNull(tu2Var2, "onError is null");
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        xjb.requireNonNull(tu2Var3, "onSubscribe is null");
        zt8 zt8Var = new zt8(tu2Var, tu2Var2, interfaceC7178i8, tu2Var3);
        subscribe((lj6) zt8Var);
        return zt8Var;
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> takeLast(long j, long j2, TimeUnit timeUnit) {
        return takeLast(j, j2, timeUnit, npe.computation(), false, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final mpg<T> test(long j, boolean z) {
        mpg<T> mpgVar = new mpg<>(j);
        if (z) {
            mpgVar.cancel();
        }
        subscribe((lj6) mpgVar);
        return mpgVar;
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("io.reactivex:computation")
    public final m86<T> timeout(long j, TimeUnit timeUnit, zjd<? extends T> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return timeout0(j, timeUnit, zjdVar, npe.computation());
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final <K, V> ljf<Map<K, Collection<V>>> toMultimap(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2) {
        return toMultimap(py6Var, py6Var2, ph7.asCallable(), v60.asFunction());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatEager(Iterable<? extends zjd<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("custom")
    public static <T> m86<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return fromFuture(future, j, timeUnit).subscribeOn(voeVar);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T, S> m86<T> generate(Callable<S> callable, f11<S, ry4<T>> f11Var) {
        xjb.requireNonNull(f11Var, "generator is null");
        return generate(callable, ke6.simpleBiGenerator(f11Var), q07.emptyConsumer());
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public static m86<Long> interval(long j, TimeUnit timeUnit, voe voeVar) {
        return interval(j, j, timeUnit, voeVar);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> just(T t, T t2, T t3) {
        xjb.requireNonNull(t, "item1 is null");
        xjb.requireNonNull(t2, "item2 is null");
        xjb.requireNonNull(t3, "item3 is null");
        return fromArray(t, t2, t3);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        return fromArray(zjdVar, zjdVar2).flatMap(q07.identity(), false, 2);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        return fromArray(zjdVar, zjdVar2).flatMap(q07.identity(), true, 2);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, R> m86<R> zip(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, j11<? super T1, ? super T2, ? extends R> j11Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        return zipArray(q07.toFunction(j11Var), false, bufferSize(), zjdVar, zjdVar2);
    }

    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final void blockingSubscribe(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8) {
        a96.subscribe(this, tu2Var, tu2Var2, interfaceC7178i8);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("custom")
    public final m86<T> delay(long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new gb6(this, Math.max(0L, j), timeUnit, voeVar, z));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final m86<T> doOnEach(tu2<? super kgb<T>> tu2Var) {
        xjb.requireNonNull(tu2Var, "onNotification is null");
        return doOnEach(q07.notificationOnNext(tu2Var), q07.notificationOnError(tu2Var), q07.notificationOnComplete(tu2Var), q07.f72641c);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final nr2<T> publish(int i) {
        xjb.verifyPositive(i, "bufferSize");
        return sg6.create(this, i);
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public final m86<T> sample(long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new ci6(this, j, timeUnit, voeVar, z));
    }

    @by1
    @hpe("custom")
    @ap0(uo0.UNBOUNDED_IN)
    public final m86<T> skipLast(long j, TimeUnit timeUnit, voe voeVar) {
        return skipLast(j, timeUnit, voeVar, false, bufferSize());
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final m86<T> takeLast(long j, long j2, TimeUnit timeUnit, voe voeVar) {
        return takeLast(j, j2, timeUnit, voeVar, false, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <K, V> ljf<Map<K, V>> toMap(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, Callable<? extends Map<K, V>> callable) {
        xjb.requireNonNull(py6Var, "keySelector is null");
        xjb.requireNonNull(py6Var2, "valueSelector is null");
        return (ljf<Map<K, V>>) collect(callable, q07.toMapKeyValueSelector(py6Var, py6Var2));
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final ljf<List<T>> toSortedList(int i) {
        return toSortedList(q07.naturalComparator(), i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <U, R> m86<R> zipWith(zjd<? extends U> zjdVar, j11<? super T, ? super U, ? extends R> j11Var, boolean z) {
        return zip(this, zjdVar, j11Var, z);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concatEager(Iterable<? extends zjd<? extends T>> iterable, int i, int i2) {
        xjb.requireNonNull(iterable, "sources is null");
        xjb.verifyPositive(i, "maxConcurrency");
        xjb.verifyPositive(i2, "prefetch");
        return pfe.onAssembly(new aa6(new pd6(iterable), q07.identity(), i, i2, f55.IMMEDIATE));
    }

    @hpe("none")
    @ap0(uo0.FULL)
    public final void blockingSubscribe(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, int i) {
        a96.subscribe(this, tu2Var, tu2Var2, interfaceC7178i8, i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <U extends Collection<? super T>> m86<U> buffer(int i, Callable<U> callable) {
        return buffer(i, i, callable);
    }

    @by1
    @hpe("none")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> concatWith(@bfb qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return pfe.onAssembly(new ma6(this, qh2Var));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final m86<T> mergeWith(@bfb qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return pfe.onAssembly(new lf6(this, qh2Var));
    }

    @by1
    @ap0(uo0.SPECIAL)
    @bfb
    @hpe("none")
    public final m86<T> onBackpressureBuffer(int i, boolean z, boolean z2, InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onOverflow is null");
        xjb.verifyPositive(i, "capacity");
        return pfe.onAssembly(new vf6(this, i, z2, z, interfaceC7178i8));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.FULL)
    public final <R> m86<R> replay(py6<? super m86<T>, ? extends zjd<R>> py6Var, int i, long j, TimeUnit timeUnit) {
        return replay(py6Var, i, j, timeUnit, npe.computation());
    }

    @by1
    @hpe("custom")
    @ap0(uo0.UNBOUNDED_IN)
    public final m86<T> skipLast(long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        return skipLast(j, timeUnit, voeVar, z, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("custom")
    public final m86<T> takeLast(long j, long j2, TimeUnit timeUnit, voe voeVar, boolean z, int i) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        xjb.verifyPositive(i, "bufferSize");
        if (j >= 0) {
            return pfe.onAssembly(new fk6(this, j, j2, timeUnit, voeVar, i, z));
        }
        throw new IndexOutOfBoundsException("count >= 0 required but it was " + j);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("custom")
    public final m86<T> timeout(long j, TimeUnit timeUnit, voe voeVar, zjd<? extends T> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return timeout0(j, timeUnit, zjdVar, voeVar);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<m86<T>> window(long j, long j2, TimeUnit timeUnit) {
        return window(j, j2, timeUnit, npe.computation(), bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <U, R> m86<R> zipWith(zjd<? extends U> zjdVar, j11<? super T, ? super U, ? extends R> j11Var, boolean z, int i) {
        return zip(this, zjdVar, j11Var, z, i);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, zjd<? extends T> zjdVar3) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        return concatArray(zjdVar, zjdVar2, zjdVar3);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("custom")
    public static <T> m86<T> fromFuture(Future<? extends T> future, voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return fromFuture(future).subscribeOn(voeVar);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> ljf<Boolean> sequenceEqual(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, int i) {
        return sequenceEqual(zjdVar, zjdVar2, xjb.equalsPredicate(), i);
    }

    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final void blockingSubscribe(ycg<? super T> ycgVar) {
        a96.subscribe(this, ycgVar);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<List<T>> buffer(long j, long j2, TimeUnit timeUnit) {
        return (m86<List<T>>) buffer(j, j2, timeUnit, npe.computation(), v60.asCallable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U, V> m86<V> flatMapIterable(py6<? super T, ? extends Iterable<? extends U>> py6Var, j11<? super T, ? super U, ? extends V> j11Var, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.requireNonNull(j11Var, "resultSelector is null");
        return (m86<V>) flatMap(ke6.flatMapIntoIterable(py6Var), j11Var, false, bufferSize(), i);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("custom")
    public final <R> m86<R> replay(py6<? super m86<T>, ? extends zjd<R>> py6Var, int i, long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(py6Var, "selector is null");
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.verifyPositive(i, "bufferSize");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return sh6.multicastSelector(ke6.replayCallable(this, i, j, timeUnit, voeVar), py6Var);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> retry(m8d<? super Throwable> m8dVar) {
        return retry(Long.MAX_VALUE, m8dVar);
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("custom")
    public final m86<T> skipLast(long j, TimeUnit timeUnit, voe voeVar, boolean z, int i) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new bj6(this, j, timeUnit, voeVar, i << 1, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <K, V> ljf<Map<K, Collection<V>>> toMultimap(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, Callable<? extends Map<K, Collection<V>>> callable, py6<? super K, ? extends Collection<? super V>> py6Var3) {
        xjb.requireNonNull(py6Var, "keySelector is null");
        xjb.requireNonNull(py6Var2, "valueSelector is null");
        xjb.requireNonNull(callable, "mapSupplier is null");
        xjb.requireNonNull(py6Var3, "collectionFactory is null");
        return (ljf<Map<K, Collection<V>>>) collect(callable, q07.toMultimapKeyValueSelector(py6Var, py6Var2, py6Var3));
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final m86<m86<T>> window(long j, long j2, TimeUnit timeUnit, voe voeVar) {
        return window(j, j2, timeUnit, voeVar, bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <T1, T2, T3, R> m86<R> withLatestFrom(zjd<T1> zjdVar, zjd<T2> zjdVar2, zjd<T3> zjdVar3, mz6<? super T, ? super T1, ? super T2, ? super T3, R> mz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        return withLatestFrom((zjd<?>[]) new zjd[]{zjdVar, zjdVar2, zjdVar3}, q07.toFunction(mz6Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T, R> m86<R> combineLatest(Iterable<? extends zjd<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var) {
        return combineLatest(iterable, py6Var, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, zjd<? extends T> zjdVar3) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        return fromArray(zjdVar, zjdVar2, zjdVar3).flatMap(q07.identity(), false, 3);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, zjd<? extends T> zjdVar3) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        return fromArray(zjdVar, zjdVar2, zjdVar3).flatMap(q07.identity(), true, 3);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, R> m86<R> zip(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, j11<? super T1, ? super T2, ? extends R> j11Var, boolean z) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        return zipArray(q07.toFunction(j11Var), z, bufferSize(), zjdVar, zjdVar2);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final m86<List<T>> buffer(long j, long j2, TimeUnit timeUnit, voe voeVar) {
        return (m86<List<T>>) buffer(j, j2, timeUnit, voeVar, v60.asCallable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <U, V> m86<T> delay(zjd<U> zjdVar, py6<? super T, ? extends zjd<V>> py6Var) {
        return delaySubscription(zjdVar).delay(py6Var);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <K, V> m86<sb7<K, V>> groupBy(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, boolean z, int i, py6<? super tu2<Object>, ? extends Map<K, Object>> py6Var3) {
        xjb.requireNonNull(py6Var, "keySelector is null");
        xjb.requireNonNull(py6Var2, "valueSelector is null");
        xjb.verifyPositive(i, "bufferSize");
        xjb.requireNonNull(py6Var3, "evictingMapFactory is null");
        return pfe.onAssembly(new ae6(this, py6Var, py6Var2, i, z, py6Var3));
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("none")
    public final <U> m86<T> sample(zjd<U> zjdVar) {
        xjb.requireNonNull(zjdVar, "sampler is null");
        return pfe.onAssembly(new ai6(this, zjdVar, false));
    }

    @by1
    @hpe("custom")
    @ap0(uo0.PASS_THROUGH)
    public final m86<T> timeout(long j, TimeUnit timeUnit, voe voeVar) {
        return timeout0(j, timeUnit, null, voeVar);
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public final m86<m86<T>> window(long j, long j2, TimeUnit timeUnit, voe voeVar, int i) {
        xjb.verifyPositive(i, "bufferSize");
        xjb.verifyPositive(j, "timespan");
        xjb.verifyPositive(j2, "timeskip");
        xjb.requireNonNull(voeVar, "scheduler is null");
        xjb.requireNonNull(timeUnit, "unit is null");
        return pfe.onAssembly(new tl6(this, j, j2, timeUnit, voeVar, Long.MAX_VALUE, i, false));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T, R> m86<R> combineLatest(Iterable<? extends zjd<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var, int i) {
        xjb.requireNonNull(iterable, "sources is null");
        xjb.requireNonNull(py6Var, "combiner is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new s96((Iterable) iterable, (py6) py6Var, i, false));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T, R> m86<R> combineLatestDelayError(Iterable<? extends zjd<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var) {
        return combineLatestDelayError(iterable, py6Var, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T, S> m86<T> generate(Callable<S> callable, f11<S, ry4<T>> f11Var, tu2<? super S> tu2Var) {
        xjb.requireNonNull(f11Var, "generator is null");
        return generate(callable, ke6.simpleBiGenerator(f11Var), tu2Var);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> just(T t, T t2, T t3, T t4) {
        xjb.requireNonNull(t, "item1 is null");
        xjb.requireNonNull(t2, "item2 is null");
        xjb.requireNonNull(t3, "item3 is null");
        xjb.requireNonNull(t4, "item4 is null");
        return fromArray(t, t2, t3, t4);
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public final <U extends Collection<? super T>> m86<U> buffer(long j, long j2, TimeUnit timeUnit, voe voeVar, Callable<U> callable) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        xjb.requireNonNull(callable, "bufferSupplier is null");
        return pfe.onAssembly(new i96(this, j, j2, timeUnit, voeVar, callable, Integer.MAX_VALUE, false));
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final m86<T> onBackpressureBuffer(int i, InterfaceC7178i8 interfaceC7178i8) {
        return onBackpressureBuffer(i, false, false, interfaceC7178i8);
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <U, V> m86<T> timeout(zjd<U> zjdVar, py6<? super T, ? extends zjd<V>> py6Var) {
        xjb.requireNonNull(zjdVar, "firstTimeoutIndicator is null");
        return timeout0(zjdVar, py6Var, null);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T, R> m86<R> combineLatestDelayError(Iterable<? extends zjd<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var, int i) {
        xjb.requireNonNull(iterable, "sources is null");
        xjb.requireNonNull(py6Var, "combiner is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new s96((Iterable) iterable, (py6) py6Var, i, true));
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final m86<T> doOnEach(ycg<? super T> ycgVar) {
        xjb.requireNonNull(ycgVar, "subscriber is null");
        return doOnEach(ke6.subscriberOnNext(ycgVar), ke6.subscriberOnError(ycgVar), ke6.subscriberOnComplete(ycgVar), q07.f72641c);
    }

    @by1
    @ap0(uo0.SPECIAL)
    @bfb
    @hpe("none")
    public final m86<T> onBackpressureBuffer(long j, InterfaceC7178i8 interfaceC7178i8, wo0 wo0Var) {
        xjb.requireNonNull(wo0Var, "overflowStrategy is null");
        xjb.verifyPositive(j, "capacity");
        return pfe.onAssembly(new xf6(this, j, interfaceC7178i8, wo0Var));
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("none")
    public final <U> m86<T> sample(zjd<U> zjdVar, boolean z) {
        xjb.requireNonNull(zjdVar, "sampler is null");
        return pfe.onAssembly(new ai6(this, zjdVar, z));
    }

    @Override // p000.zjd
    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final void subscribe(ycg<? super T> ycgVar) {
        if (ycgVar instanceof lj6) {
            subscribe((lj6) ycgVar);
        } else {
            xjb.requireNonNull(ycgVar, "s is null");
            subscribe((lj6) new g7g(ycgVar));
        }
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, zjd<? extends T> zjdVar3, zjd<? extends T> zjdVar4) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        return concatArray(zjdVar, zjdVar2, zjdVar3, zjdVar4);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T, S> m86<T> generate(Callable<S> callable, j11<S, ry4<T>, S> j11Var) {
        return generate(callable, j11Var, q07.emptyConsumer());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, R> m86<R> zip(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, j11<? super T1, ? super T2, ? extends R> j11Var, boolean z, int i) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        return zipArray(q07.toFunction(j11Var), z, i, zjdVar, zjdVar2);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.FULL)
    public final m86<T> takeLast(long j, TimeUnit timeUnit) {
        return takeLast(j, timeUnit, npe.computation(), false, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U, V> m86<T> timeout(zjd<U> zjdVar, py6<? super T, ? extends zjd<V>> py6Var, zjd<? extends T> zjdVar2) {
        xjb.requireNonNull(zjdVar, "firstTimeoutSelector is null");
        xjb.requireNonNull(zjdVar2, "other is null");
        return timeout0(zjdVar, py6Var, zjdVar2);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T, S> m86<T> generate(Callable<S> callable, j11<S, ry4<T>, S> j11Var, tu2<? super S> tu2Var) {
        xjb.requireNonNull(callable, "initialState is null");
        xjb.requireNonNull(j11Var, "generator is null");
        xjb.requireNonNull(tu2Var, "disposeState is null");
        return pfe.onAssembly(new yd6(callable, j11Var, tu2Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, zjd<? extends T> zjdVar3, zjd<? extends T> zjdVar4) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        return fromArray(zjdVar, zjdVar2, zjdVar3, zjdVar4).flatMap(q07.identity(), false, 4);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(zjd<? extends T> zjdVar, zjd<? extends T> zjdVar2, zjd<? extends T> zjdVar3, zjd<? extends T> zjdVar4) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        return fromArray(zjdVar, zjdVar2, zjdVar3, zjdVar4).flatMap(q07.identity(), true, 4);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends R>> py6Var, py6<? super Throwable, ? extends zjd<? extends R>> py6Var2, Callable<? extends zjd<? extends R>> callable) {
        xjb.requireNonNull(py6Var, "onNextMapper is null");
        xjb.requireNonNull(py6Var2, "onErrorMapper is null");
        xjb.requireNonNull(callable, "onCompleteSupplier is null");
        return merge(new ef6(this, py6Var, py6Var2, callable));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.FULL)
    public final m86<T> takeLast(long j, TimeUnit timeUnit, boolean z) {
        return takeLast(j, timeUnit, npe.computation(), z, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.UNBOUNDED_IN)
    public final <K, V> ljf<Map<K, Collection<V>>> toMultimap(py6<? super T, ? extends K> py6Var, py6<? super T, ? extends V> py6Var2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(py6Var, py6Var2, callable, v60.asFunction());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <T1, T2, T3, T4, R> m86<R> withLatestFrom(zjd<T1> zjdVar, zjd<T2> zjdVar2, zjd<T3> zjdVar3, zjd<T4> zjdVar4, sz6<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> sz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        return withLatestFrom((zjd<?>[]) new zjd[]{zjdVar, zjdVar2, zjdVar3, zjdVar4}, q07.toFunction(sz6Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T1, T2, R> m86<R> combineLatest(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, j11<? super T1, ? super T2, ? extends R> j11Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        return combineLatest(q07.toFunction(j11Var), zjdVar, zjdVar2);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<List<T>> buffer(long j, TimeUnit timeUnit) {
        return buffer(j, timeUnit, npe.computation(), Integer.MAX_VALUE);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("custom")
    public final <R> m86<R> replay(py6<? super m86<T>, ? extends zjd<R>> py6Var, int i, voe voeVar) {
        xjb.requireNonNull(py6Var, "selector is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        xjb.verifyPositive(i, "bufferSize");
        return sh6.multicastSelector(ke6.replayCallable(this, i), ke6.replayFunction(py6Var, voeVar));
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final m86<T> takeLast(long j, TimeUnit timeUnit, voe voeVar) {
        return takeLast(j, timeUnit, voeVar, false, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> just(T t, T t2, T t3, T t4, T t5) {
        xjb.requireNonNull(t, "item1 is null");
        xjb.requireNonNull(t2, "item2 is null");
        xjb.requireNonNull(t3, "item3 is null");
        xjb.requireNonNull(t4, "item4 is null");
        xjb.requireNonNull(t5, "item5 is null");
        return fromArray(t, t2, t3, t4, t5);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, R> m86<R> zip(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, iz6<? super T1, ? super T2, ? super T3, ? extends R> iz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        return zipArray(q07.toFunction(iz6Var), false, bufferSize(), zjdVar, zjdVar2, zjdVar3);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<List<T>> buffer(long j, TimeUnit timeUnit, int i) {
        return buffer(j, timeUnit, npe.computation(), i);
    }

    @hpe("none")
    @ap0(uo0.SPECIAL)
    public final void subscribe(lj6<? super T> lj6Var) {
        xjb.requireNonNull(lj6Var, "s is null");
        try {
            ycg<? super T> ycgVarOnSubscribe = pfe.onSubscribe(this, lj6Var);
            xjb.requireNonNull(ycgVarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(ycgVarOnSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final m86<T> takeLast(long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        return takeLast(j, timeUnit, voeVar, z, bufferSize());
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<m86<T>> window(long j, TimeUnit timeUnit) {
        return window(j, timeUnit, npe.computation(), Long.MAX_VALUE, false);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final m86<List<T>> buffer(long j, TimeUnit timeUnit, voe voeVar, int i) {
        return (m86<List<T>>) buffer(j, timeUnit, voeVar, i, v60.asCallable(), false);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final m86<T> takeLast(long j, TimeUnit timeUnit, voe voeVar, boolean z, int i) {
        return takeLast(Long.MAX_VALUE, j, timeUnit, voeVar, z, i);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<m86<T>> window(long j, TimeUnit timeUnit, long j2) {
        return window(j, timeUnit, npe.computation(), j2, false);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final <U extends Collection<? super T>> m86<U> buffer(long j, TimeUnit timeUnit, voe voeVar, int i, Callable<U> callable, boolean z) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        xjb.requireNonNull(callable, "bufferSupplier is null");
        xjb.verifyPositive(i, "count");
        return pfe.onAssembly(new i96(this, j, j, timeUnit, voeVar, callable, i, z));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends R>> py6Var, py6<Throwable, ? extends zjd<? extends R>> py6Var2, Callable<? extends zjd<? extends R>> callable, int i) {
        xjb.requireNonNull(py6Var, "onNextMapper is null");
        xjb.requireNonNull(py6Var2, "onErrorMapper is null");
        xjb.requireNonNull(callable, "onCompleteSupplier is null");
        return merge(new ef6(this, py6Var, py6Var2, callable), i);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.ERROR)
    public final m86<m86<T>> window(long j, TimeUnit timeUnit, long j2, boolean z) {
        return window(j, timeUnit, npe.computation(), j2, z);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, R> m86<R> combineLatest(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, iz6<? super T1, ? super T2, ? super T3, ? extends R> iz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        return combineLatest(q07.toFunction(iz6Var), zjdVar, zjdVar2, zjdVar3);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final m86<m86<T>> window(long j, TimeUnit timeUnit, voe voeVar) {
        return window(j, timeUnit, voeVar, Long.MAX_VALUE, false);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, R> m86<R> zip(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, mz6<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> mz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        return zipArray(q07.toFunction(mz6Var), false, bufferSize(), zjdVar, zjdVar2, zjdVar3, zjdVar4);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final m86<m86<T>> window(long j, TimeUnit timeUnit, voe voeVar, long j2) {
        return window(j, timeUnit, voeVar, j2, false);
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <R> m86<R> withLatestFrom(zjd<?>[] zjdVarArr, py6<? super Object[], R> py6Var) {
        xjb.requireNonNull(zjdVarArr, "others is null");
        xjb.requireNonNull(py6Var, "combiner is null");
        return pfe.onAssembly(new xl6(this, zjdVarArr, py6Var));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.FULL)
    public final <R> m86<R> replay(py6<? super m86<T>, ? extends zjd<R>> py6Var, long j, TimeUnit timeUnit) {
        return replay(py6Var, j, timeUnit, npe.computation());
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final m86<m86<T>> window(long j, TimeUnit timeUnit, voe voeVar, long j2, boolean z) {
        return window(j, timeUnit, voeVar, j2, z, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        xjb.requireNonNull(t, "item1 is null");
        xjb.requireNonNull(t2, "item2 is null");
        xjb.requireNonNull(t3, "item3 is null");
        xjb.requireNonNull(t4, "item4 is null");
        xjb.requireNonNull(t5, "item5 is null");
        xjb.requireNonNull(t6, "item6 is null");
        return fromArray(t, t2, t3, t4, t5, t6);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <U, R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends U>> py6Var, j11<? super T, ? super U, ? extends R> j11Var) {
        return flatMap(py6Var, j11Var, false, bufferSize(), bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("custom")
    public final <R> m86<R> replay(py6<? super m86<T>, ? extends zjd<R>> py6Var, long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(py6Var, "selector is null");
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return sh6.multicastSelector(ke6.replayCallable(this, j, timeUnit, voeVar), py6Var);
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("custom")
    public final m86<m86<T>> window(long j, TimeUnit timeUnit, voe voeVar, long j2, boolean z, int i) {
        xjb.verifyPositive(i, "bufferSize");
        xjb.requireNonNull(voeVar, "scheduler is null");
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.verifyPositive(j2, "count");
        return pfe.onAssembly(new tl6(this, j, j, timeUnit, voeVar, j2, i, z));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, R> m86<R> combineLatest(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, mz6<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> mz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        return combineLatest(q07.toFunction(mz6Var), zjdVar, zjdVar2, zjdVar3, zjdVar4);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.ERROR)
    public final m86<List<T>> buffer(long j, TimeUnit timeUnit, voe voeVar) {
        return (m86<List<T>>) buffer(j, timeUnit, voeVar, Integer.MAX_VALUE, v60.asCallable(), false);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <U, R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends U>> py6Var, j11<? super T, ? super U, ? extends R> j11Var, boolean z) {
        return flatMap(py6Var, j11Var, z, bufferSize(), bufferSize());
    }

    @by1
    @ap0(uo0.PASS_THROUGH)
    @bfb
    @hpe("none")
    public final <R> m86<R> withLatestFrom(Iterable<? extends zjd<?>> iterable, py6<? super Object[], R> py6Var) {
        xjb.requireNonNull(iterable, "others is null");
        xjb.requireNonNull(py6Var, "combiner is null");
        return pfe.onAssembly(new xl6(this, iterable, py6Var));
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final <TOpening, TClosing> m86<List<T>> buffer(m86<? extends TOpening> m86Var, py6<? super TOpening, ? extends zjd<? extends TClosing>> py6Var) {
        return (m86<List<T>>) buffer(m86Var, py6Var, v60.asCallable());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <U, R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends U>> py6Var, j11<? super T, ? super U, ? extends R> j11Var, boolean z, int i) {
        return flatMap(py6Var, j11Var, z, i, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, T5, R> m86<R> zip(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, zjd<? extends T5> zjdVar5, sz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        xjb.requireNonNull(zjdVar5, "source5 is null");
        return zipArray(q07.toFunction(sz6Var), false, bufferSize(), zjdVar, zjdVar2, zjdVar3, zjdVar4, zjdVar5);
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final <TOpening, TClosing, U extends Collection<? super T>> m86<U> buffer(m86<? extends TOpening> m86Var, py6<? super TOpening, ? extends zjd<? extends TClosing>> py6Var, Callable<U> callable) {
        xjb.requireNonNull(m86Var, "openingIndicator is null");
        xjb.requireNonNull(py6Var, "closingIndicator is null");
        xjb.requireNonNull(callable, "bufferSupplier is null");
        return pfe.onAssembly(new d96(this, m86Var, py6Var, callable));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U, R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends U>> py6Var, j11<? super T, ? super U, ? extends R> j11Var, boolean z, int i, int i2) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.requireNonNull(j11Var, "combiner is null");
        xjb.verifyPositive(i, "maxConcurrency");
        xjb.verifyPositive(i2, "bufferSize");
        return flatMap(ke6.flatMapWithCombiner(py6Var, j11Var), z, i, i2);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("custom")
    public final <R> m86<R> replay(py6<? super m86<T>, ? extends zjd<R>> py6Var, voe voeVar) {
        xjb.requireNonNull(py6Var, "selector is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return sh6.multicastSelector(ke6.replayCallable(this), ke6.replayFunction(py6Var, voeVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final <B> m86<m86<T>> window(zjd<B> zjdVar) {
        return window(zjdVar, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, T5, R> m86<R> combineLatest(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, zjd<? extends T5> zjdVar5, sz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        xjb.requireNonNull(zjdVar5, "source5 is null");
        return combineLatest(q07.toFunction(sz6Var), zjdVar, zjdVar2, zjdVar3, zjdVar4, zjdVar5);
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("none")
    public final <B> m86<m86<T>> window(zjd<B> zjdVar, int i) {
        xjb.requireNonNull(zjdVar, "boundaryIndicator is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new nl6(this, zjdVar, i));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        xjb.requireNonNull(t, "item1 is null");
        xjb.requireNonNull(t2, "item2 is null");
        xjb.requireNonNull(t3, "item3 is null");
        xjb.requireNonNull(t4, "item4 is null");
        xjb.requireNonNull(t5, "item5 is null");
        xjb.requireNonNull(t6, "item6 is null");
        xjb.requireNonNull(t7, "item7 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7);
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final <B> m86<List<T>> buffer(zjd<B> zjdVar) {
        return (m86<List<T>>) buffer(zjdVar, v60.asCallable());
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final <B> m86<List<T>> buffer(zjd<B> zjdVar, int i) {
        xjb.verifyPositive(i, "initialCapacity");
        return (m86<List<T>>) buffer(zjdVar, q07.createArrayList(i));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final <U, R> m86<R> flatMap(py6<? super T, ? extends zjd<? extends U>> py6Var, j11<? super T, ? super U, ? extends R> j11Var, int i) {
        return flatMap(py6Var, j11Var, false, i, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, R> m86<R> zip(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, zjd<? extends T5> zjdVar5, zjd<? extends T6> zjdVar6, vz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> vz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        xjb.requireNonNull(zjdVar5, "source5 is null");
        xjb.requireNonNull(zjdVar6, "source6 is null");
        return zipArray(q07.toFunction(vz6Var), false, bufferSize(), zjdVar, zjdVar2, zjdVar3, zjdVar4, zjdVar5, zjdVar6);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final nr2<T> replay(int i) {
        xjb.verifyPositive(i, "bufferSize");
        return sh6.create(this, i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final <U, V> m86<m86<T>> window(zjd<U> zjdVar, py6<? super U, ? extends zjd<V>> py6Var) {
        return window(zjdVar, py6Var, bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final <B, U extends Collection<? super T>> m86<U> buffer(zjd<B> zjdVar, Callable<U> callable) {
        xjb.requireNonNull(zjdVar, "boundaryIndicator is null");
        xjb.requireNonNull(callable, "bufferSupplier is null");
        return pfe.onAssembly(new g96(this, zjdVar, callable));
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("none")
    public final <U, V> m86<m86<T>> window(zjd<U> zjdVar, py6<? super U, ? extends zjd<V>> py6Var, int i) {
        xjb.requireNonNull(zjdVar, "openingIndicator is null");
        xjb.requireNonNull(py6Var, "closingIndicator is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new pl6(this, zjdVar, py6Var, i));
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.FULL)
    public final nr2<T> replay(int i, long j, TimeUnit timeUnit) {
        return replay(i, j, timeUnit, npe.computation());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, R> m86<R> combineLatest(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, zjd<? extends T5> zjdVar5, zjd<? extends T6> zjdVar6, vz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> vz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        xjb.requireNonNull(zjdVar5, "source5 is null");
        xjb.requireNonNull(zjdVar6, "source6 is null");
        return combineLatest(q07.toFunction(vz6Var), zjdVar, zjdVar2, zjdVar3, zjdVar4, zjdVar5, zjdVar6);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final nr2<T> replay(int i, long j, TimeUnit timeUnit, voe voeVar) {
        xjb.verifyPositive(i, "bufferSize");
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        xjb.verifyPositive(i, "bufferSize");
        return sh6.create(this, j, timeUnit, voeVar, i);
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final <B> m86<List<T>> buffer(Callable<? extends zjd<B>> callable) {
        return (m86<List<T>>) buffer(callable, v60.asCallable());
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final <B, U extends Collection<? super T>> m86<U> buffer(Callable<? extends zjd<B>> callable, Callable<U> callable2) {
        xjb.requireNonNull(callable, "boundaryIndicatorSupplier is null");
        xjb.requireNonNull(callable2, "bufferSupplier is null");
        return pfe.onAssembly(new f96(this, callable, callable2));
    }

    @by1
    @hpe("none")
    @ap0(uo0.ERROR)
    public final <B> m86<m86<T>> window(Callable<? extends zjd<B>> callable) {
        return window(callable, bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        xjb.requireNonNull(t, "item1 is null");
        xjb.requireNonNull(t2, "item2 is null");
        xjb.requireNonNull(t3, "item3 is null");
        xjb.requireNonNull(t4, "item4 is null");
        xjb.requireNonNull(t5, "item5 is null");
        xjb.requireNonNull(t6, "item6 is null");
        xjb.requireNonNull(t7, "item7 is null");
        xjb.requireNonNull(t8, "item8 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8);
    }

    @by1
    @ap0(uo0.ERROR)
    @bfb
    @hpe("none")
    public final <B> m86<m86<T>> window(Callable<? extends zjd<B>> callable, int i) {
        xjb.requireNonNull(callable, "boundaryIndicatorSupplier is null");
        xjb.verifyPositive(i, "bufferSize");
        return pfe.onAssembly(new rl6(this, callable, i));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> m86<R> zip(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, zjd<? extends T5> zjdVar5, zjd<? extends T6> zjdVar6, zjd<? extends T7> zjdVar7, yz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> yz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        xjb.requireNonNull(zjdVar5, "source5 is null");
        xjb.requireNonNull(zjdVar6, "source6 is null");
        xjb.requireNonNull(zjdVar7, "source7 is null");
        return zipArray(q07.toFunction(yz6Var), false, bufferSize(), zjdVar, zjdVar2, zjdVar3, zjdVar4, zjdVar5, zjdVar6, zjdVar7);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final nr2<T> replay(int i, voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return sh6.observeOn(replay(i), voeVar);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> m86<R> combineLatest(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, zjd<? extends T5> zjdVar5, zjd<? extends T6> zjdVar6, zjd<? extends T7> zjdVar7, yz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> yz6Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        xjb.requireNonNull(zjdVar5, "source5 is null");
        xjb.requireNonNull(zjdVar6, "source6 is null");
        xjb.requireNonNull(zjdVar7, "source7 is null");
        return combineLatest(q07.toFunction(yz6Var), zjdVar, zjdVar2, zjdVar3, zjdVar4, zjdVar5, zjdVar6, zjdVar7);
    }

    @by1
    @hpe("io.reactivex:computation")
    @ap0(uo0.FULL)
    public final nr2<T> replay(long j, TimeUnit timeUnit) {
        return replay(j, timeUnit, npe.computation());
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final nr2<T> replay(long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return sh6.create(this, j, timeUnit, voeVar);
    }

    @by1
    @hpe("custom")
    @ap0(uo0.FULL)
    public final nr2<T> replay(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return sh6.observeOn(replay(), voeVar);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        xjb.requireNonNull(t, "item1 is null");
        xjb.requireNonNull(t2, "item2 is null");
        xjb.requireNonNull(t3, "item3 is null");
        xjb.requireNonNull(t4, "item4 is null");
        xjb.requireNonNull(t5, "item5 is null");
        xjb.requireNonNull(t6, "item6 is null");
        xjb.requireNonNull(t7, "item7 is null");
        xjb.requireNonNull(t8, "item8 is null");
        xjb.requireNonNull(t9, "item9 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> m86<R> zip(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, zjd<? extends T5> zjdVar5, zjd<? extends T6> zjdVar6, zjd<? extends T7> zjdVar7, zjd<? extends T8> zjdVar8, b07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> b07Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        xjb.requireNonNull(zjdVar5, "source5 is null");
        xjb.requireNonNull(zjdVar6, "source6 is null");
        xjb.requireNonNull(zjdVar7, "source7 is null");
        xjb.requireNonNull(zjdVar8, "source8 is null");
        return zipArray(q07.toFunction(b07Var), false, bufferSize(), zjdVar, zjdVar2, zjdVar3, zjdVar4, zjdVar5, zjdVar6, zjdVar7, zjdVar8);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> m86<R> combineLatest(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, zjd<? extends T5> zjdVar5, zjd<? extends T6> zjdVar6, zjd<? extends T7> zjdVar7, zjd<? extends T8> zjdVar8, b07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> b07Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        xjb.requireNonNull(zjdVar5, "source5 is null");
        xjb.requireNonNull(zjdVar6, "source6 is null");
        xjb.requireNonNull(zjdVar7, "source7 is null");
        xjb.requireNonNull(zjdVar8, "source8 is null");
        return combineLatest(q07.toFunction(b07Var), zjdVar, zjdVar2, zjdVar3, zjdVar4, zjdVar5, zjdVar6, zjdVar7, zjdVar8);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> m86<R> zip(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, zjd<? extends T5> zjdVar5, zjd<? extends T6> zjdVar6, zjd<? extends T7> zjdVar7, zjd<? extends T8> zjdVar8, zjd<? extends T9> zjdVar9, e07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> e07Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        xjb.requireNonNull(zjdVar5, "source5 is null");
        xjb.requireNonNull(zjdVar6, "source6 is null");
        xjb.requireNonNull(zjdVar7, "source7 is null");
        xjb.requireNonNull(zjdVar8, "source8 is null");
        xjb.requireNonNull(zjdVar9, "source9 is null");
        return zipArray(q07.toFunction(e07Var), false, bufferSize(), zjdVar, zjdVar2, zjdVar3, zjdVar4, zjdVar5, zjdVar6, zjdVar7, zjdVar8, zjdVar9);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        xjb.requireNonNull(t, "item1 is null");
        xjb.requireNonNull(t2, "item2 is null");
        xjb.requireNonNull(t3, "item3 is null");
        xjb.requireNonNull(t4, "item4 is null");
        xjb.requireNonNull(t5, "item5 is null");
        xjb.requireNonNull(t6, "item6 is null");
        xjb.requireNonNull(t7, "item7 is null");
        xjb.requireNonNull(t8, "item8 is null");
        xjb.requireNonNull(t9, "item9 is null");
        xjb.requireNonNull(t10, "item10 is null");
        return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> m86<R> combineLatest(zjd<? extends T1> zjdVar, zjd<? extends T2> zjdVar2, zjd<? extends T3> zjdVar3, zjd<? extends T4> zjdVar4, zjd<? extends T5> zjdVar5, zjd<? extends T6> zjdVar6, zjd<? extends T7> zjdVar7, zjd<? extends T8> zjdVar8, zjd<? extends T9> zjdVar9, e07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> e07Var) {
        xjb.requireNonNull(zjdVar, "source1 is null");
        xjb.requireNonNull(zjdVar2, "source2 is null");
        xjb.requireNonNull(zjdVar3, "source3 is null");
        xjb.requireNonNull(zjdVar4, "source4 is null");
        xjb.requireNonNull(zjdVar5, "source5 is null");
        xjb.requireNonNull(zjdVar6, "source6 is null");
        xjb.requireNonNull(zjdVar7, "source7 is null");
        xjb.requireNonNull(zjdVar8, "source8 is null");
        xjb.requireNonNull(zjdVar9, "source9 is null");
        return combineLatest(q07.toFunction(e07Var), zjdVar, zjdVar2, zjdVar3, zjdVar4, zjdVar5, zjdVar6, zjdVar7, zjdVar8, zjdVar9);
    }
}
