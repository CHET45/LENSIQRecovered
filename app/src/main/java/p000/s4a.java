package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class s4a<T> implements aaa<T> {
    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> amb(Iterable<? extends aaa<? extends T>> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new u4a(null, iterable));
    }

    @by1
    @hpe("none")
    public static <T> s4a<T> ambArray(aaa<? extends T>... aaaVarArr) {
        return aaaVarArr.length == 0 ? empty() : aaaVarArr.length == 1 ? wrap(aaaVarArr[0]) : pfe.onAssembly(new u4a(aaaVarArr, null));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(Iterable<? extends aaa<? extends T>> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new e5a(iterable));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concatArray(aaa<? extends T>... aaaVarArr) {
        xjb.requireNonNull(aaaVarArr, "sources is null");
        return aaaVarArr.length == 0 ? m86.empty() : aaaVarArr.length == 1 ? pfe.onAssembly(new uaa(aaaVarArr[0])) : pfe.onAssembly(new a5a(aaaVarArr));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatArrayDelayError(aaa<? extends T>... aaaVarArr) {
        return aaaVarArr.length == 0 ? m86.empty() : aaaVarArr.length == 1 ? pfe.onAssembly(new uaa(aaaVarArr[0])) : pfe.onAssembly(new c5a(aaaVarArr));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatArrayEager(aaa<? extends T>... aaaVarArr) {
        return m86.fromArray(aaaVarArr).concatMapEager(zaa.instance());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concatDelayError(Iterable<? extends aaa<? extends T>> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return m86.fromIterable(iterable).concatMapDelayError(zaa.instance());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatEager(Iterable<? extends aaa<? extends T>> iterable) {
        return m86.fromIterable(iterable).concatMapEager(zaa.instance());
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> create(t9a<T> t9aVar) {
        xjb.requireNonNull(t9aVar, "onSubscribe is null");
        return pfe.onAssembly(new m5a(t9aVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> defer(Callable<? extends aaa<? extends T>> callable) {
        xjb.requireNonNull(callable, "maybeSupplier is null");
        return pfe.onAssembly(new p5a(callable));
    }

    @by1
    @hpe("none")
    public static <T> s4a<T> empty() {
        return pfe.onAssembly(q6a.f73331a);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> error(Throwable th) {
        xjb.requireNonNull(th, "exception is null");
        return pfe.onAssembly(new u6a(th));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> fromAction(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "run is null");
        return pfe.onAssembly(new x7a(interfaceC7178i8));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> fromCallable(@bfb Callable<? extends T> callable) {
        xjb.requireNonNull(callable, "callable is null");
        return pfe.onAssembly(new z7a(callable));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> fromCompletable(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "completableSource is null");
        return pfe.onAssembly(new a8a(qh2Var));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> fromFuture(Future<? extends T> future) {
        xjb.requireNonNull(future, "future is null");
        return pfe.onAssembly(new e8a(future, 0L, null));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> fromRunnable(Runnable runnable) {
        xjb.requireNonNull(runnable, "run is null");
        return pfe.onAssembly(new g8a(runnable));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> fromSingle(pof<T> pofVar) {
        xjb.requireNonNull(pofVar, "singleSource is null");
        return pfe.onAssembly(new h8a(pofVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> just(T t) {
        xjb.requireNonNull(t, "item is null");
        return pfe.onAssembly(new v8a(t));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> merge(Iterable<? extends aaa<? extends T>> iterable) {
        return merge(m86.fromIterable(iterable));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeArray(aaa<? extends T>... aaaVarArr) {
        xjb.requireNonNull(aaaVarArr, "sources is null");
        return aaaVarArr.length == 0 ? m86.empty() : aaaVarArr.length == 1 ? pfe.onAssembly(new uaa(aaaVarArr[0])) : pfe.onAssembly(new e9a(aaaVarArr));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeArrayDelayError(aaa<? extends T>... aaaVarArr) {
        return aaaVarArr.length == 0 ? m86.empty() : m86.fromArray(aaaVarArr).flatMap(zaa.instance(), true, aaaVarArr.length);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeDelayError(Iterable<? extends aaa<? extends T>> iterable) {
        return m86.fromIterable(iterable).flatMap(zaa.instance(), true);
    }

    @by1
    @hpe("none")
    public static <T> s4a<T> never() {
        return pfe.onAssembly(h9a.f42959a);
    }

    @by1
    @hpe("none")
    public static <T> ljf<Boolean> sequenceEqual(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2) {
        return sequenceEqual(aaaVar, aaaVar2, xjb.equalsPredicate());
    }

    @by1
    @hpe("io.reactivex:computation")
    public static s4a<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, npe.computation());
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> unsafeCreate(aaa<T> aaaVar) {
        if (aaaVar instanceof s4a) {
            throw new IllegalArgumentException("unsafeCreate(Maybe) should be upgraded");
        }
        xjb.requireNonNull(aaaVar, "onSubscribe is null");
        return pfe.onAssembly(new fba(aaaVar));
    }

    @by1
    @hpe("none")
    public static <T, D> s4a<T> using(Callable<? extends D> callable, py6<? super D, ? extends aaa<? extends T>> py6Var, tu2<? super D> tu2Var) {
        return using(callable, py6Var, tu2Var, true);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> wrap(aaa<T> aaaVar) {
        if (aaaVar instanceof s4a) {
            return pfe.onAssembly((s4a) aaaVar);
        }
        xjb.requireNonNull(aaaVar, "onSubscribe is null");
        return pfe.onAssembly(new fba(aaaVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T, R> s4a<R> zip(Iterable<? extends aaa<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var) {
        xjb.requireNonNull(py6Var, "zipper is null");
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new mba(iterable, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T, R> s4a<R> zipArray(py6<? super Object[], ? extends R> py6Var, aaa<? extends T>... aaaVarArr) {
        xjb.requireNonNull(aaaVarArr, "sources is null");
        if (aaaVarArr.length == 0) {
            return empty();
        }
        xjb.requireNonNull(py6Var, "zipper is null");
        return pfe.onAssembly(new kba(aaaVarArr, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> ambWith(aaa<? extends T> aaaVar) {
        xjb.requireNonNull(aaaVar, "other is null");
        return ambArray(this, aaaVar);
    }

    @by1
    @hpe("none")
    /* JADX INFO: renamed from: as */
    public final <R> R m21716as(@bfb j5a<T, ? extends R> j5aVar) {
        return (R) ((j5a) xjb.requireNonNull(j5aVar, "converter is null")).apply(this);
    }

    @by1
    @hpe("none")
    public final T blockingGet() {
        b81 b81Var = new b81();
        subscribe(b81Var);
        return (T) b81Var.blockingGet();
    }

    @by1
    @hpe("none")
    public final s4a<T> cache() {
        return pfe.onAssembly(new w4a(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final <U> s4a<U> cast(Class<? extends U> cls) {
        xjb.requireNonNull(cls, "clazz is null");
        return (s4a<U>) map(q07.castFunction(cls));
    }

    @by1
    @hpe("none")
    public final <R> s4a<R> compose(dba<? super T, ? extends R> dbaVar) {
        return wrap(((dba) xjb.requireNonNull(dbaVar, "transformer is null")).apply(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> s4a<R> concatMap(py6<? super T, ? extends aaa<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new s7a(this, py6Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> concatWith(aaa<? extends T> aaaVar) {
        xjb.requireNonNull(aaaVar, "other is null");
        return concat(this, aaaVar);
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<Boolean> contains(Object obj) {
        xjb.requireNonNull(obj, "item is null");
        return pfe.onAssembly(new g5a(this, obj));
    }

    @by1
    @hpe("none")
    public final ljf<Long> count() {
        return pfe.onAssembly(new k5a(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> defaultIfEmpty(T t) {
        xjb.requireNonNull(t, "defaultItem is null");
        return switchIfEmpty(just(t));
    }

    @by1
    @hpe("io.reactivex:computation")
    public final s4a<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, npe.computation());
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <U> s4a<T> delaySubscription(zjd<U> zjdVar) {
        xjb.requireNonNull(zjdVar, "subscriptionIndicator is null");
        return pfe.onAssembly(new u5a(this, zjdVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> doAfterSuccess(tu2<? super T> tu2Var) {
        xjb.requireNonNull(tu2Var, "onAfterSuccess is null");
        return pfe.onAssembly(new b6a(this, tu2Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> doAfterTerminate(InterfaceC7178i8 interfaceC7178i8) {
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer3 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i82 = q07.f72641c;
        return pfe.onAssembly(new w9a(this, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, tu2VarEmptyConsumer3, interfaceC7178i82, (InterfaceC7178i8) xjb.requireNonNull(interfaceC7178i8, "onAfterTerminate is null"), interfaceC7178i82));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> doFinally(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onFinally is null");
        return pfe.onAssembly(new d6a(this, interfaceC7178i8));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> doOnComplete(InterfaceC7178i8 interfaceC7178i8) {
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer3 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i82 = (InterfaceC7178i8) xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        InterfaceC7178i8 interfaceC7178i83 = q07.f72641c;
        return pfe.onAssembly(new w9a(this, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, tu2VarEmptyConsumer3, interfaceC7178i82, interfaceC7178i83, interfaceC7178i83));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> doOnDispose(InterfaceC7178i8 interfaceC7178i8) {
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer3 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i82 = q07.f72641c;
        return pfe.onAssembly(new w9a(this, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, tu2VarEmptyConsumer3, interfaceC7178i82, interfaceC7178i82, (InterfaceC7178i8) xjb.requireNonNull(interfaceC7178i8, "onDispose is null")));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> doOnError(tu2<? super Throwable> tu2Var) {
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        tu2 tu2Var2 = (tu2) xjb.requireNonNull(tu2Var, "onError is null");
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return pfe.onAssembly(new w9a(this, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, tu2Var2, interfaceC7178i8, interfaceC7178i8, interfaceC7178i8));
    }

    @by1
    @hpe("none")
    public final s4a<T> doOnEvent(f11<? super T, ? super Throwable> f11Var) {
        xjb.requireNonNull(f11Var, "onEvent is null");
        return pfe.onAssembly(new f6a(this, f11Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> doOnSubscribe(tu2<? super mf4> tu2Var) {
        tu2 tu2Var2 = (tu2) xjb.requireNonNull(tu2Var, "onSubscribe is null");
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return pfe.onAssembly(new w9a(this, tu2Var2, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, interfaceC7178i8, interfaceC7178i8, interfaceC7178i8));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> doOnSuccess(tu2<? super T> tu2Var) {
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2Var2 = (tu2) xjb.requireNonNull(tu2Var, "onSuccess is null");
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return pfe.onAssembly(new w9a(this, tu2VarEmptyConsumer, tu2Var2, tu2VarEmptyConsumer2, interfaceC7178i8, interfaceC7178i8, interfaceC7178i8));
    }

    @by1
    @bfb
    @fg5
    @hpe("none")
    public final s4a<T> doOnTerminate(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onTerminate is null");
        return pfe.onAssembly(new i6a(this, interfaceC7178i8));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> filter(m8d<? super T> m8dVar) {
        xjb.requireNonNull(m8dVar, "predicate is null");
        return pfe.onAssembly(new x6a(this, m8dVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> s4a<R> flatMap(py6<? super T, ? extends aaa<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new s7a(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 flatMapCompletable(py6<? super T, ? extends qh2> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new d7a(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> Observable<R> flatMapObservable(py6<? super T, ? extends xub<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new l7a(this, py6Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> flatMapPublisher(py6<? super T, ? extends zjd<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new n7a(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> ljf<R> flatMapSingle(py6<? super T, ? extends pof<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new p7a(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> s4a<R> flatMapSingleElement(py6<? super T, ? extends pof<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new r7a(this, py6Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U> m86<U> flattenAsFlowable(py6<? super T, ? extends Iterable<? extends U>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new f7a(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final <U> Observable<U> flattenAsObservable(py6<? super T, ? extends Iterable<? extends U>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new h7a(this, py6Var));
    }

    @by1
    @hpe("none")
    public final s4a<T> hide() {
        return pfe.onAssembly(new k8a(this));
    }

    @by1
    @hpe("none")
    public final yd2 ignoreElement() {
        return pfe.onAssembly(new o8a(this));
    }

    @by1
    @hpe("none")
    public final ljf<Boolean> isEmpty() {
        return pfe.onAssembly(new s8a(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> s4a<R> lift(v9a<? extends R, ? super T> v9aVar) {
        xjb.requireNonNull(v9aVar, "lift is null");
        return pfe.onAssembly(new y8a(this, v9aVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> s4a<R> map(py6<? super T, ? extends R> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new z8a(this, py6Var));
    }

    @by1
    @fg5
    @hpe("none")
    public final ljf<kgb<T>> materialize() {
        return pfe.onAssembly(new d9a(this));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> mergeWith(aaa<? extends T> aaaVar) {
        xjb.requireNonNull(aaaVar, "other is null");
        return merge(this, aaaVar);
    }

    @bfb
    @by1
    @hpe("custom")
    public final s4a<T> observeOn(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new i9a(this, voeVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @bfb
    @by1
    @hpe("none")
    public final <U> s4a<U> ofType(Class<U> cls) {
        xjb.requireNonNull(cls, "clazz is null");
        return filter(q07.isInstanceOf(cls)).cast(cls);
    }

    @by1
    @hpe("none")
    public final s4a<T> onErrorComplete() {
        return onErrorComplete(q07.alwaysTrue());
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> onErrorResumeNext(aaa<? extends T> aaaVar) {
        xjb.requireNonNull(aaaVar, "next is null");
        return onErrorResumeNext(q07.justFunction(aaaVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> onErrorReturn(py6<? super Throwable, ? extends T> py6Var) {
        xjb.requireNonNull(py6Var, "valueSupplier is null");
        return pfe.onAssembly(new q9a(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> onErrorReturnItem(T t) {
        xjb.requireNonNull(t, "item is null");
        return onErrorReturn(q07.justFunction(t));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> onExceptionResumeNext(aaa<? extends T> aaaVar) {
        xjb.requireNonNull(aaaVar, "next is null");
        return pfe.onAssembly(new o9a(this, q07.justFunction(aaaVar), false));
    }

    @by1
    @hpe("none")
    public final s4a<T> onTerminateDetach() {
        return pfe.onAssembly(new z5a(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> repeatUntil(eb1 eb1Var) {
        return toFlowable().repeatUntil(eb1Var);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> repeatWhen(py6<? super m86<Object>, ? extends zjd<?>> py6Var) {
        return toFlowable().repeatWhen(py6Var);
    }

    @by1
    @hpe("none")
    public final s4a<T> retry() {
        return retry(Long.MAX_VALUE, q07.alwaysTrue());
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> retryUntil(eb1 eb1Var) {
        xjb.requireNonNull(eb1Var, "stop is null");
        return retry(Long.MAX_VALUE, q07.predicateReverseFor(eb1Var));
    }

    @by1
    @hpe("none")
    public final s4a<T> retryWhen(py6<? super m86<Throwable>, ? extends zjd<?>> py6Var) {
        return toFlowable().retryWhen(py6Var).singleElement();
    }

    @hpe("none")
    public final mf4 subscribe() {
        return subscribe(q07.emptyConsumer(), q07.f72644f, q07.f72641c);
    }

    public abstract void subscribeActual(l9a<? super T> l9aVar);

    @bfb
    @by1
    @hpe("custom")
    public final s4a<T> subscribeOn(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new daa(this, voeVar));
    }

    @by1
    @hpe("none")
    public final <E extends l9a<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> switchIfEmpty(aaa<? extends T> aaaVar) {
        xjb.requireNonNull(aaaVar, "other is null");
        return pfe.onAssembly(new faa(this, aaaVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final <U> s4a<T> takeUntil(aaa<U> aaaVar) {
        xjb.requireNonNull(aaaVar, "other is null");
        return pfe.onAssembly(new jaa(this, aaaVar));
    }

    @by1
    @hpe("none")
    public final bpg<T> test() {
        bpg<T> bpgVar = new bpg<>();
        subscribe(bpgVar);
        return bpgVar;
    }

    @by1
    @hpe("io.reactivex:computation")
    public final s4a<T> timeout(long j, TimeUnit timeUnit) {
        return timeout(j, timeUnit, npe.computation());
    }

    @bfb
    @by1
    @hpe("none")
    /* JADX INFO: renamed from: to */
    public final <R> R m21717to(py6<? super s4a<T>, R> py6Var) {
        try {
            return (R) ((py6) xjb.requireNonNull(py6Var, "convert is null")).apply(this);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            throw j75.wrapOrThrow(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> toFlowable() {
        return this instanceof v07 ? ((v07) this).fuseToFlowable() : pfe.onAssembly(new uaa(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @hpe("none")
    public final Observable<T> toObservable() {
        return this instanceof z07 ? ((z07) this).fuseToObservable() : pfe.onAssembly(new waa(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> toSingle(T t) {
        xjb.requireNonNull(t, "defaultValue is null");
        return pfe.onAssembly(new aba(this, t));
    }

    @bfb
    @by1
    @hpe("custom")
    public final s4a<T> unsubscribeOn(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new gba(this, voeVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final <U, R> s4a<R> zipWith(aaa<? extends U> aaaVar, j11<? super T, ? super U, ? extends R> j11Var) {
        xjb.requireNonNull(aaaVar, "other is null");
        return zip(this, aaaVar, j11Var);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatEager(zjd<? extends aaa<? extends T>> zjdVar) {
        return m86.fromPublisher(zjdVar).concatMapEager(zaa.instance());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> merge(zjd<? extends aaa<? extends T>> zjdVar) {
        return merge(zjdVar, Integer.MAX_VALUE);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> mergeDelayError(zjd<? extends aaa<? extends T>> zjdVar) {
        return mergeDelayError(zjdVar, Integer.MAX_VALUE);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<Boolean> sequenceEqual(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2, m11<? super T, ? super T> m11Var) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(m11Var, "isEqual is null");
        return pfe.onAssembly(new r6a(aaaVar, aaaVar2, m11Var));
    }

    @bfb
    @by1
    @hpe("custom")
    public static s4a<Long> timer(long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new saa(Math.max(0L, j), timeUnit, voeVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T, D> s4a<T> using(Callable<? extends D> callable, py6<? super D, ? extends aaa<? extends T>> py6Var, tu2<? super D> tu2Var, boolean z) {
        xjb.requireNonNull(callable, "resourceSupplier is null");
        xjb.requireNonNull(py6Var, "sourceSupplier is null");
        xjb.requireNonNull(tu2Var, "disposer is null");
        return pfe.onAssembly(new iba(callable, py6Var, tu2Var, z));
    }

    @bfb
    @by1
    @hpe("custom")
    public final s4a<T> delay(long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new q5a(this, Math.max(0L, j), timeUnit, voeVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> onErrorComplete(m8d<? super Throwable> m8dVar) {
        xjb.requireNonNull(m8dVar, "predicate is null");
        return pfe.onAssembly(new m9a(this, m8dVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> repeat(long j) {
        return toFlowable().repeat(j);
    }

    @by1
    @hpe("none")
    public final s4a<T> retry(m11<? super Integer, ? super Throwable> m11Var) {
        return toFlowable().retry(m11Var).singleElement();
    }

    @by1
    @hpe("none")
    public final mf4 subscribe(tu2<? super T> tu2Var) {
        return subscribe(tu2Var, q07.f72644f, q07.f72641c);
    }

    @bfb
    @by1
    @hpe("io.reactivex:computation")
    public final s4a<T> timeout(long j, TimeUnit timeUnit, aaa<? extends T> aaaVar) {
        xjb.requireNonNull(aaaVar, "fallback is null");
        return timeout(j, timeUnit, npe.computation(), aaaVar);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        return concatArray(aaaVar, aaaVar2);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concatDelayError(zjd<? extends aaa<? extends T>> zjdVar) {
        return m86.fromPublisher(zjdVar).concatMapDelayError(zaa.instance());
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> error(Callable<? extends Throwable> callable) {
        xjb.requireNonNull(callable, "errorSupplier is null");
        return pfe.onAssembly(new w6a(callable));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        xjb.requireNonNull(future, "future is null");
        xjb.requireNonNull(timeUnit, "unit is null");
        return pfe.onAssembly(new e8a(future, j, timeUnit));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(zjd<? extends aaa<? extends T>> zjdVar, int i) {
        xjb.requireNonNull(zjdVar, "source is null");
        xjb.verifyPositive(i, "maxConcurrency");
        return pfe.onAssembly(new zc6(zjdVar, zaa.instance(), false, i, 1));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(zjd<? extends aaa<? extends T>> zjdVar, int i) {
        xjb.requireNonNull(zjdVar, "source is null");
        xjb.verifyPositive(i, "maxConcurrency");
        return pfe.onAssembly(new zc6(zjdVar, zaa.instance(), true, i, 1));
    }

    @by1
    @hpe("io.reactivex:computation")
    public final s4a<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, npe.computation());
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> s4a<R> flatMap(py6<? super T, ? extends aaa<? extends R>> py6Var, py6<? super Throwable, ? extends aaa<? extends R>> py6Var2, Callable<? extends aaa<? extends R>> callable) {
        xjb.requireNonNull(py6Var, "onSuccessMapper is null");
        xjb.requireNonNull(py6Var2, "onErrorMapper is null");
        xjb.requireNonNull(callable, "onCompleteSupplier is null");
        return pfe.onAssembly(new j7a(this, py6Var, py6Var2, callable));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> onErrorResumeNext(py6<? super Throwable, ? extends aaa<? extends T>> py6Var) {
        xjb.requireNonNull(py6Var, "resumeFunction is null");
        return pfe.onAssembly(new o9a(this, py6Var, true));
    }

    @by1
    @hpe("none")
    public final s4a<T> retry(long j) {
        return retry(j, q07.alwaysTrue());
    }

    @by1
    @hpe("none")
    public final mf4 subscribe(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2) {
        return subscribe(tu2Var, tu2Var2, q07.f72641c);
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> switchIfEmpty(pof<? extends T> pofVar) {
        xjb.requireNonNull(pofVar, "other is null");
        return pfe.onAssembly(new haa(this, pofVar));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <U> s4a<T> takeUntil(zjd<U> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return pfe.onAssembly(new laa(this, zjdVar));
    }

    @by1
    @hpe("none")
    public final bpg<T> test(boolean z) {
        bpg<T> bpgVar = new bpg<>();
        if (z) {
            bpgVar.cancel();
        }
        subscribe(bpgVar);
        return bpgVar;
    }

    @by1
    @hpe("none")
    public final ljf<T> toSingle() {
        return pfe.onAssembly(new aba(this, null));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, R> s4a<R> zip(aaa<? extends T1> aaaVar, aaa<? extends T2> aaaVar2, j11<? super T1, ? super T2, ? extends R> j11Var) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        return zipArray(q07.toFunction(j11Var), aaaVar, aaaVar2);
    }

    @by1
    @hpe("none")
    public final T blockingGet(T t) {
        xjb.requireNonNull(t, "defaultValue is null");
        b81 b81Var = new b81();
        subscribe(b81Var);
        return (T) b81Var.blockingGet(t);
    }

    @by1
    @hpe("custom")
    public final s4a<T> delaySubscription(long j, TimeUnit timeUnit, voe voeVar) {
        return delaySubscription(m86.timer(j, timeUnit, voeVar));
    }

    @by1
    @hpe("none")
    public final s4a<T> retry(long j, m8d<? super Throwable> m8dVar) {
        return toFlowable().retry(j, m8dVar).singleElement();
    }

    @bfb
    @by1
    @hpe("none")
    public final mf4 subscribe(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(tu2Var, "onSuccess is null");
        xjb.requireNonNull(tu2Var2, "onError is null");
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        return (mf4) subscribeWith(new z4a(tu2Var, tu2Var2, interfaceC7178i8));
    }

    @bfb
    @by1
    @hpe("custom")
    public final s4a<T> timeout(long j, TimeUnit timeUnit, voe voeVar, aaa<? extends T> aaaVar) {
        xjb.requireNonNull(aaaVar, "fallback is null");
        return timeout(timer(j, timeUnit, voeVar), aaaVar);
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <U, V> s4a<T> delay(zjd<U> zjdVar) {
        xjb.requireNonNull(zjdVar, "delayIndicator is null");
        return pfe.onAssembly(new s5a(this, zjdVar));
    }

    @by1
    @hpe("none")
    public final s4a<T> retry(m8d<? super Throwable> m8dVar) {
        return retry(Long.MAX_VALUE, m8dVar);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2, aaa<? extends T> aaaVar3) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        return concatArray(aaaVar, aaaVar2, aaaVar3);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> s4a<T> merge(aaa<? extends aaa<? extends T>> aaaVar) {
        xjb.requireNonNull(aaaVar, "source is null");
        return pfe.onAssembly(new s7a(aaaVar, q07.identity()));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        return mergeArrayDelayError(aaaVar, aaaVar2);
    }

    @by1
    @hpe("custom")
    public final s4a<T> timeout(long j, TimeUnit timeUnit, voe voeVar) {
        return timeout(timer(j, timeUnit, voeVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, R> s4a<R> zip(aaa<? extends T1> aaaVar, aaa<? extends T2> aaaVar2, aaa<? extends T3> aaaVar3, iz6<? super T1, ? super T2, ? super T3, ? extends R> iz6Var) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        return zipArray(q07.toFunction(iz6Var), aaaVar, aaaVar2, aaaVar3);
    }

    @bfb
    @by1
    @hpe("none")
    public final <U, R> s4a<R> flatMap(py6<? super T, ? extends aaa<? extends U>> py6Var, j11<? super T, ? super U, ? extends R> j11Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.requireNonNull(j11Var, "resultSelector is null");
        return pfe.onAssembly(new b7a(this, py6Var, j11Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final <U> s4a<T> timeout(aaa<U> aaaVar) {
        xjb.requireNonNull(aaaVar, "timeoutIndicator is null");
        return pfe.onAssembly(new oaa(this, aaaVar, null));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        return mergeArray(aaaVar, aaaVar2);
    }

    @Override // p000.aaa
    @hpe("none")
    public final void subscribe(l9a<? super T> l9aVar) {
        xjb.requireNonNull(l9aVar, "observer is null");
        l9a<? super T> l9aVarOnSubscribe = pfe.onSubscribe(this, l9aVar);
        xjb.requireNonNull(l9aVarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(l9aVarOnSubscribe);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2, aaa<? extends T> aaaVar3) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        return mergeArrayDelayError(aaaVar, aaaVar2, aaaVar3);
    }

    @bfb
    @by1
    @hpe("none")
    public final <U> s4a<T> timeout(aaa<U> aaaVar, aaa<? extends T> aaaVar2) {
        xjb.requireNonNull(aaaVar, "timeoutIndicator is null");
        xjb.requireNonNull(aaaVar2, "fallback is null");
        return pfe.onAssembly(new oaa(this, aaaVar, aaaVar2));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2, aaa<? extends T> aaaVar3, aaa<? extends T> aaaVar4) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        xjb.requireNonNull(aaaVar4, "source4 is null");
        return concatArray(aaaVar, aaaVar2, aaaVar3, aaaVar4);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2, aaa<? extends T> aaaVar3) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        return mergeArray(aaaVar, aaaVar2, aaaVar3);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, R> s4a<R> zip(aaa<? extends T1> aaaVar, aaa<? extends T2> aaaVar2, aaa<? extends T3> aaaVar3, aaa<? extends T4> aaaVar4, mz6<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> mz6Var) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        xjb.requireNonNull(aaaVar4, "source4 is null");
        return zipArray(q07.toFunction(mz6Var), aaaVar, aaaVar2, aaaVar3, aaaVar4);
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <U> s4a<T> timeout(zjd<U> zjdVar) {
        xjb.requireNonNull(zjdVar, "timeoutIndicator is null");
        return pfe.onAssembly(new qaa(this, zjdVar, null));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2, aaa<? extends T> aaaVar3, aaa<? extends T> aaaVar4) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        xjb.requireNonNull(aaaVar4, "source4 is null");
        return mergeArrayDelayError(aaaVar, aaaVar2, aaaVar3, aaaVar4);
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public final <U> s4a<T> timeout(zjd<U> zjdVar, aaa<? extends T> aaaVar) {
        xjb.requireNonNull(zjdVar, "timeoutIndicator is null");
        xjb.requireNonNull(aaaVar, "fallback is null");
        return pfe.onAssembly(new qaa(this, zjdVar, aaaVar));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public static <T> m86<T> concat(zjd<? extends aaa<? extends T>> zjdVar) {
        return concat(zjdVar, 2);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(aaa<? extends T> aaaVar, aaa<? extends T> aaaVar2, aaa<? extends T> aaaVar3, aaa<? extends T> aaaVar4) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        xjb.requireNonNull(aaaVar4, "source4 is null");
        return mergeArray(aaaVar, aaaVar2, aaaVar3, aaaVar4);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(zjd<? extends aaa<? extends T>> zjdVar, int i) {
        xjb.requireNonNull(zjdVar, "sources is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new ha6(zjdVar, zaa.instance(), i, f55.IMMEDIATE));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, T5, R> s4a<R> zip(aaa<? extends T1> aaaVar, aaa<? extends T2> aaaVar2, aaa<? extends T3> aaaVar3, aaa<? extends T4> aaaVar4, aaa<? extends T5> aaaVar5, sz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sz6Var) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        xjb.requireNonNull(aaaVar4, "source4 is null");
        xjb.requireNonNull(aaaVar5, "source5 is null");
        return zipArray(q07.toFunction(sz6Var), aaaVar, aaaVar2, aaaVar3, aaaVar4, aaaVar5);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, R> s4a<R> zip(aaa<? extends T1> aaaVar, aaa<? extends T2> aaaVar2, aaa<? extends T3> aaaVar3, aaa<? extends T4> aaaVar4, aaa<? extends T5> aaaVar5, aaa<? extends T6> aaaVar6, vz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> vz6Var) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        xjb.requireNonNull(aaaVar4, "source4 is null");
        xjb.requireNonNull(aaaVar5, "source5 is null");
        xjb.requireNonNull(aaaVar6, "source6 is null");
        return zipArray(q07.toFunction(vz6Var), aaaVar, aaaVar2, aaaVar3, aaaVar4, aaaVar5, aaaVar6);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> s4a<R> zip(aaa<? extends T1> aaaVar, aaa<? extends T2> aaaVar2, aaa<? extends T3> aaaVar3, aaa<? extends T4> aaaVar4, aaa<? extends T5> aaaVar5, aaa<? extends T6> aaaVar6, aaa<? extends T7> aaaVar7, yz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> yz6Var) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        xjb.requireNonNull(aaaVar4, "source4 is null");
        xjb.requireNonNull(aaaVar5, "source5 is null");
        xjb.requireNonNull(aaaVar6, "source6 is null");
        xjb.requireNonNull(aaaVar7, "source7 is null");
        return zipArray(q07.toFunction(yz6Var), aaaVar, aaaVar2, aaaVar3, aaaVar4, aaaVar5, aaaVar6, aaaVar7);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> s4a<R> zip(aaa<? extends T1> aaaVar, aaa<? extends T2> aaaVar2, aaa<? extends T3> aaaVar3, aaa<? extends T4> aaaVar4, aaa<? extends T5> aaaVar5, aaa<? extends T6> aaaVar6, aaa<? extends T7> aaaVar7, aaa<? extends T8> aaaVar8, b07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> b07Var) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        xjb.requireNonNull(aaaVar4, "source4 is null");
        xjb.requireNonNull(aaaVar5, "source5 is null");
        xjb.requireNonNull(aaaVar6, "source6 is null");
        xjb.requireNonNull(aaaVar7, "source7 is null");
        xjb.requireNonNull(aaaVar8, "source8 is null");
        return zipArray(q07.toFunction(b07Var), aaaVar, aaaVar2, aaaVar3, aaaVar4, aaaVar5, aaaVar6, aaaVar7, aaaVar8);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> s4a<R> zip(aaa<? extends T1> aaaVar, aaa<? extends T2> aaaVar2, aaa<? extends T3> aaaVar3, aaa<? extends T4> aaaVar4, aaa<? extends T5> aaaVar5, aaa<? extends T6> aaaVar6, aaa<? extends T7> aaaVar7, aaa<? extends T8> aaaVar8, aaa<? extends T9> aaaVar9, e07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> e07Var) {
        xjb.requireNonNull(aaaVar, "source1 is null");
        xjb.requireNonNull(aaaVar2, "source2 is null");
        xjb.requireNonNull(aaaVar3, "source3 is null");
        xjb.requireNonNull(aaaVar4, "source4 is null");
        xjb.requireNonNull(aaaVar5, "source5 is null");
        xjb.requireNonNull(aaaVar6, "source6 is null");
        xjb.requireNonNull(aaaVar7, "source7 is null");
        xjb.requireNonNull(aaaVar8, "source8 is null");
        xjb.requireNonNull(aaaVar9, "source9 is null");
        return zipArray(q07.toFunction(e07Var), aaaVar, aaaVar2, aaaVar3, aaaVar4, aaaVar5, aaaVar6, aaaVar7, aaaVar8, aaaVar9);
    }
}
