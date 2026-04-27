package p000;

import io.reactivex.Observable;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ljf<T> implements pof<T> {
    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> amb(Iterable<? extends pof<? extends T>> iterable) {
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new mjf(null, iterable));
    }

    @by1
    @hpe("none")
    public static <T> ljf<T> ambArray(pof<? extends T>... pofVarArr) {
        return pofVarArr.length == 0 ? error(qmf.emptyThrower()) : pofVarArr.length == 1 ? wrap(pofVarArr[0]) : pfe.onAssembly(new mjf(pofVarArr, null));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(Iterable<? extends pof<? extends T>> iterable) {
        return concat(m86.fromIterable(iterable));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concatArray(pof<? extends T>... pofVarArr) {
        return pfe.onAssembly(new w96(m86.fromArray(pofVarArr), qmf.toFlowable(), 2, f55.BOUNDARY));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concatArrayEager(pof<? extends T>... pofVarArr) {
        return m86.fromArray(pofVarArr).concatMapEager(qmf.toFlowable());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concatEager(zjd<? extends pof<? extends T>> zjdVar) {
        return m86.fromPublisher(zjdVar).concatMapEager(qmf.toFlowable());
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> create(nnf<T> nnfVar) {
        xjb.requireNonNull(nnfVar, "source is null");
        return pfe.onAssembly(new vjf(nnfVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> defer(Callable<? extends pof<? extends T>> callable) {
        xjb.requireNonNull(callable, "singleSupplier is null");
        return pfe.onAssembly(new yjf(callable));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<Boolean> equals(pof<? extends T> pofVar, pof<? extends T> pofVar2) {
        xjb.requireNonNull(pofVar, "first is null");
        xjb.requireNonNull(pofVar2, "second is null");
        return pfe.onAssembly(new klf(pofVar, pofVar2));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> error(Callable<? extends Throwable> callable) {
        xjb.requireNonNull(callable, "errorSupplier is null");
        return pfe.onAssembly(new nlf(callable));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> fromCallable(Callable<? extends T> callable) {
        xjb.requireNonNull(callable, "callable is null");
        return pfe.onAssembly(new hmf(callable));
    }

    @by1
    @hpe("none")
    public static <T> ljf<T> fromFuture(Future<? extends T> future) {
        return toSingle(m86.fromFuture(future));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> fromObservable(xub<? extends T> xubVar) {
        xjb.requireNonNull(xubVar, "observableSource is null");
        return pfe.onAssembly(new jub(xubVar, null));
    }

    @by1
    @ap0(uo0.UNBOUNDED_IN)
    @bfb
    @hpe("none")
    public static <T> ljf<T> fromPublisher(zjd<? extends T> zjdVar) {
        xjb.requireNonNull(zjdVar, "publisher is null");
        return pfe.onAssembly(new jmf(zjdVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> just(T t) {
        xjb.requireNonNull(t, "item is null");
        return pfe.onAssembly(new tmf(t));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(Iterable<? extends pof<? extends T>> iterable) {
        return merge(m86.fromIterable(iterable));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(Iterable<? extends pof<? extends T>> iterable) {
        return mergeDelayError(m86.fromIterable(iterable));
    }

    @by1
    @hpe("none")
    public static <T> ljf<T> never() {
        return pfe.onAssembly(enf.f33626a);
    }

    private ljf<T> timeout0(long j, TimeUnit timeUnit, voe voeVar, pof<? extends T> pofVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new xof(this, j, timeUnit, voeVar, pofVar));
    }

    @by1
    @hpe("io.reactivex:computation")
    public static ljf<Long> timer(long j, TimeUnit timeUnit) {
        return timer(j, timeUnit, npe.computation());
    }

    private static <T> ljf<T> toSingle(m86<T> m86Var) {
        return pfe.onAssembly(new ui6(m86Var, null));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> unsafeCreate(pof<T> pofVar) {
        xjb.requireNonNull(pofVar, "onSubscribe is null");
        if (pofVar instanceof ljf) {
            throw new IllegalArgumentException("unsafeCreate(Single) should be upgraded");
        }
        return pfe.onAssembly(new nmf(pofVar));
    }

    @by1
    @hpe("none")
    public static <T, U> ljf<T> using(Callable<U> callable, py6<? super U, ? extends pof<? extends T>> py6Var, tu2<? super U> tu2Var) {
        return using(callable, py6Var, tu2Var, true);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> wrap(pof<T> pofVar) {
        xjb.requireNonNull(pofVar, "source is null");
        return pofVar instanceof ljf ? pfe.onAssembly((ljf) pofVar) : pfe.onAssembly(new nmf(pofVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T, R> ljf<R> zip(Iterable<? extends pof<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var) {
        xjb.requireNonNull(py6Var, "zipper is null");
        xjb.requireNonNull(iterable, "sources is null");
        return pfe.onAssembly(new opf(iterable, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T, R> ljf<R> zipArray(py6<? super Object[], ? extends R> py6Var, pof<? extends T>... pofVarArr) {
        xjb.requireNonNull(py6Var, "zipper is null");
        xjb.requireNonNull(pofVarArr, "sources is null");
        return pofVarArr.length == 0 ? error(new NoSuchElementException()) : pfe.onAssembly(new mpf(pofVarArr, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> ambWith(pof<? extends T> pofVar) {
        xjb.requireNonNull(pofVar, "other is null");
        return ambArray(this, pofVar);
    }

    @by1
    @hpe("none")
    /* JADX INFO: renamed from: as */
    public final <R> R m16184as(@bfb ujf<T, ? extends R> ujfVar) {
        return (R) ((ujf) xjb.requireNonNull(ujfVar, "converter is null")).apply(this);
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
    public final ljf<T> cache() {
        return pfe.onAssembly(new ojf(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final <U> ljf<U> cast(Class<? extends U> cls) {
        xjb.requireNonNull(cls, "clazz is null");
        return (ljf<U>) map(q07.castFunction(cls));
    }

    @by1
    @hpe("none")
    public final <R> ljf<R> compose(gpf<? super T, ? extends R> gpfVar) {
        return wrap(((gpf) xjb.requireNonNull(gpfVar, "transformer is null")).apply(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> concatWith(pof<? extends T> pofVar) {
        return concat(this, pofVar);
    }

    @by1
    @hpe("none")
    public final ljf<Boolean> contains(Object obj) {
        return contains(obj, xjb.equalsPredicate());
    }

    @by1
    @hpe("io.reactivex:computation")
    public final ljf<T> delay(long j, TimeUnit timeUnit) {
        return delay(j, timeUnit, npe.computation(), false);
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> delaySubscription(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return pfe.onAssembly(new bkf(this, qh2Var));
    }

    @by1
    @bfb
    @fg5
    @hpe("none")
    public final <R> s4a<R> dematerialize(py6<? super T, kgb<R>> py6Var) {
        xjb.requireNonNull(py6Var, "selector is null");
        return pfe.onAssembly(new jkf(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> doAfterSuccess(tu2<? super T> tu2Var) {
        xjb.requireNonNull(tu2Var, "onAfterSuccess is null");
        return pfe.onAssembly(new nkf(this, tu2Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> doAfterTerminate(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onAfterTerminate is null");
        return pfe.onAssembly(new pkf(this, interfaceC7178i8));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> doFinally(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onFinally is null");
        return pfe.onAssembly(new rkf(this, interfaceC7178i8));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> doOnDispose(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onDispose is null");
        return pfe.onAssembly(new tkf(this, interfaceC7178i8));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> doOnError(tu2<? super Throwable> tu2Var) {
        xjb.requireNonNull(tu2Var, "onError is null");
        return pfe.onAssembly(new vkf(this, tu2Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> doOnEvent(f11<? super T, ? super Throwable> f11Var) {
        xjb.requireNonNull(f11Var, "onEvent is null");
        return pfe.onAssembly(new xkf(this, f11Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> doOnSubscribe(tu2<? super mf4> tu2Var) {
        xjb.requireNonNull(tu2Var, "onSubscribe is null");
        return pfe.onAssembly(new alf(this, tu2Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> doOnSuccess(tu2<? super T> tu2Var) {
        xjb.requireNonNull(tu2Var, "onSuccess is null");
        return pfe.onAssembly(new clf(this, tu2Var));
    }

    @by1
    @bfb
    @fg5
    @hpe("none")
    public final ljf<T> doOnTerminate(InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onTerminate is null");
        return pfe.onAssembly(new elf(this, interfaceC7178i8));
    }

    @bfb
    @by1
    @hpe("none")
    public final s4a<T> filter(m8d<? super T> m8dVar) {
        xjb.requireNonNull(m8dVar, "predicate is null");
        return pfe.onAssembly(new z6a(this, m8dVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> ljf<R> flatMap(py6<? super T, ? extends pof<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new olf(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final yd2 flatMapCompletable(py6<? super T, ? extends qh2> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new rlf(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> s4a<R> flatMapMaybe(py6<? super T, ? extends aaa<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new xlf(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> Observable<R> flatMapObservable(py6<? super T, ? extends xub<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new amf(this, py6Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <R> m86<R> flatMapPublisher(py6<? super T, ? extends zjd<? extends R>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new cmf(this, py6Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U> m86<U> flattenAsFlowable(py6<? super T, ? extends Iterable<? extends U>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new tlf(this, py6Var));
    }

    @bfb
    @by1
    @hpe("none")
    public final <U> Observable<U> flattenAsObservable(py6<? super T, ? extends Iterable<? extends U>> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new vlf(this, py6Var));
    }

    @by1
    @hpe("none")
    public final ljf<T> hide() {
        return pfe.onAssembly(new omf(this));
    }

    @by1
    @hpe("none")
    public final yd2 ignoreElement() {
        return pfe.onAssembly(new bg2(this));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> ljf<R> lift(pnf<? extends R, ? super T> pnfVar) {
        xjb.requireNonNull(pnfVar, "lift is null");
        return pfe.onAssembly(new vmf(this, pnfVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final <R> ljf<R> map(py6<? super T, ? extends R> py6Var) {
        xjb.requireNonNull(py6Var, "mapper is null");
        return pfe.onAssembly(new ymf(this, py6Var));
    }

    @by1
    @fg5
    @hpe("none")
    public final ljf<kgb<T>> materialize() {
        return pfe.onAssembly(new cnf(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> mergeWith(pof<? extends T> pofVar) {
        return merge(this, pofVar);
    }

    @bfb
    @by1
    @hpe("custom")
    public final ljf<T> observeOn(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new fnf(this, voeVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> onErrorResumeNext(ljf<? extends T> ljfVar) {
        xjb.requireNonNull(ljfVar, "resumeSingleInCaseOfError is null");
        return onErrorResumeNext(q07.justFunction(ljfVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> onErrorReturn(py6<Throwable, ? extends T> py6Var) {
        xjb.requireNonNull(py6Var, "resumeFunction is null");
        return pfe.onAssembly(new knf(this, py6Var, null));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> onErrorReturnItem(T t) {
        xjb.requireNonNull(t, "value is null");
        return pfe.onAssembly(new knf(this, null, t));
    }

    @by1
    @hpe("none")
    public final ljf<T> onTerminateDetach() {
        return pfe.onAssembly(new lkf(this));
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> repeat() {
        return toFlowable().repeat();
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
    public final ljf<T> retry() {
        return toSingle(toFlowable().retry());
    }

    @by1
    @hpe("none")
    public final ljf<T> retryWhen(py6<? super m86<Throwable>, ? extends zjd<?>> py6Var) {
        return toSingle(toFlowable().retryWhen(py6Var));
    }

    @hpe("none")
    public final mf4 subscribe() {
        return subscribe(q07.emptyConsumer(), q07.f72644f);
    }

    public abstract void subscribeActual(@bfb inf<? super T> infVar);

    @bfb
    @by1
    @hpe("custom")
    public final ljf<T> subscribeOn(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new sof(this, voeVar));
    }

    @by1
    @hpe("none")
    public final <E extends inf<? super T>> E subscribeWith(E e) {
        subscribe(e);
        return e;
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> takeUntil(qh2 qh2Var) {
        xjb.requireNonNull(qh2Var, "other is null");
        return takeUntil(new ci2(qh2Var));
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
    public final ljf<T> timeout(long j, TimeUnit timeUnit) {
        return timeout0(j, timeUnit, npe.computation(), null);
    }

    @by1
    @hpe("none")
    /* JADX INFO: renamed from: to */
    public final <R> R m16185to(py6<? super ljf<T>, R> py6Var) {
        try {
            return (R) ((py6) xjb.requireNonNull(py6Var, "convert is null")).apply(this);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            throw j75.wrapOrThrow(th);
        }
    }

    @by1
    @hpe("none")
    @Deprecated
    public final yd2 toCompletable() {
        return pfe.onAssembly(new bg2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> toFlowable() {
        return this instanceof v07 ? ((v07) this).fuseToFlowable() : pfe.onAssembly(new bpf(this));
    }

    @by1
    @hpe("none")
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new p17());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @hpe("none")
    public final s4a<T> toMaybe() {
        return this instanceof x07 ? ((x07) this).fuseToMaybe() : pfe.onAssembly(new h8a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @by1
    @hpe("none")
    public final Observable<T> toObservable() {
        return this instanceof z07 ? ((z07) this).fuseToObservable() : pfe.onAssembly(new dpf(this));
    }

    @bfb
    @by1
    @hpe("custom")
    public final ljf<T> unsubscribeOn(voe voeVar) {
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new hpf(this, voeVar));
    }

    @by1
    @hpe("none")
    public final <U, R> ljf<R> zipWith(pof<U> pofVar, j11<? super T, ? super U, ? extends R> j11Var) {
        return zip(this, pofVar, j11Var);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> Observable<T> concat(xub<? extends pof<? extends T>> xubVar) {
        xjb.requireNonNull(xubVar, "sources is null");
        return pfe.onAssembly(new fmb(xubVar, qmf.toObservable(), 2, f55.IMMEDIATE));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concatEager(Iterable<? extends pof<? extends T>> iterable) {
        return m86.fromIterable(iterable).concatMapEager(qmf.toFlowable());
    }

    @by1
    @hpe("none")
    public static <T> ljf<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        return toSingle(m86.fromFuture(future, j, timeUnit));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(zjd<? extends pof<? extends T>> zjdVar) {
        xjb.requireNonNull(zjdVar, "sources is null");
        return pfe.onAssembly(new zc6(zjdVar, qmf.toFlowable(), false, Integer.MAX_VALUE, m86.bufferSize()));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(zjd<? extends pof<? extends T>> zjdVar) {
        xjb.requireNonNull(zjdVar, "sources is null");
        return pfe.onAssembly(new zc6(zjdVar, qmf.toFlowable(), true, Integer.MAX_VALUE, m86.bufferSize()));
    }

    @bfb
    @by1
    @hpe("custom")
    public static ljf<Long> timer(long j, TimeUnit timeUnit, voe voeVar) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new zof(j, timeUnit, voeVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T, U> ljf<T> using(Callable<U> callable, py6<? super U, ? extends pof<? extends T>> py6Var, tu2<? super U> tu2Var, boolean z) {
        xjb.requireNonNull(callable, "resourceSupplier is null");
        xjb.requireNonNull(py6Var, "singleFunction is null");
        xjb.requireNonNull(tu2Var, "disposer is null");
        return pfe.onAssembly(new jpf(callable, py6Var, tu2Var, z));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<Boolean> contains(Object obj, m11<Object, Object> m11Var) {
        xjb.requireNonNull(obj, "value is null");
        xjb.requireNonNull(m11Var, "comparer is null");
        return pfe.onAssembly(new rjf(this, obj, m11Var));
    }

    @by1
    @hpe("io.reactivex:computation")
    public final ljf<T> delay(long j, TimeUnit timeUnit, boolean z) {
        return delay(j, timeUnit, npe.computation(), z);
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> repeat(long j) {
        return toFlowable().repeat(j);
    }

    @by1
    @hpe("none")
    public final ljf<T> retry(long j) {
        return toSingle(toFlowable().retry(j));
    }

    @bfb
    @by1
    @hpe("none")
    public final mf4 subscribe(f11<? super T, ? super Throwable> f11Var) {
        xjb.requireNonNull(f11Var, "onCallback is null");
        h11 h11Var = new h11(f11Var);
        subscribe(h11Var);
        return h11Var;
    }

    @by1
    @hpe("custom")
    public final ljf<T> timeout(long j, TimeUnit timeUnit, voe voeVar) {
        return timeout0(j, timeUnit, voeVar, null);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> error(Throwable th) {
        xjb.requireNonNull(th, "exception is null");
        return error((Callable<? extends Throwable>) q07.justCallable(th));
    }

    @by1
    @hpe("custom")
    public static <T> ljf<T> fromFuture(Future<? extends T> future, long j, TimeUnit timeUnit, voe voeVar) {
        return toSingle(m86.fromFuture(future, j, timeUnit, voeVar));
    }

    @by1
    @hpe("custom")
    public final ljf<T> delay(long j, TimeUnit timeUnit, voe voeVar) {
        return delay(j, timeUnit, voeVar, false);
    }

    @bfb
    @by1
    @hpe("none")
    public final <U> ljf<T> delaySubscription(pof<U> pofVar) {
        xjb.requireNonNull(pofVar, "other is null");
        return pfe.onAssembly(new hkf(this, pofVar));
    }

    @bfb
    @by1
    @hpe("none")
    public final ljf<T> onErrorResumeNext(py6<? super Throwable, ? extends pof<? extends T>> py6Var) {
        xjb.requireNonNull(py6Var, "resumeFunctionInCaseOfError is null");
        return pfe.onAssembly(new znf(this, py6Var));
    }

    @by1
    @hpe("none")
    public final ljf<T> retry(m11<? super Integer, ? super Throwable> m11Var) {
        return toSingle(toFlowable().retry(m11Var));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <E> ljf<T> takeUntil(zjd<E> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return pfe.onAssembly(new uof(this, zjdVar));
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

    @bfb
    @by1
    @hpe("custom")
    public final ljf<T> timeout(long j, TimeUnit timeUnit, voe voeVar, pof<? extends T> pofVar) {
        xjb.requireNonNull(pofVar, "other is null");
        return timeout0(j, timeUnit, voeVar, pofVar);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(zjd<? extends pof<? extends T>> zjdVar) {
        return concat(zjdVar, 2);
    }

    @by1
    @hpe("custom")
    public static <T> ljf<T> fromFuture(Future<? extends T> future, voe voeVar) {
        return toSingle(m86.fromFuture(future, voeVar));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T> ljf<T> merge(pof<? extends pof<? extends T>> pofVar) {
        xjb.requireNonNull(pofVar, "source is null");
        return pfe.onAssembly(new olf(pofVar, q07.identity()));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(pof<? extends T> pofVar, pof<? extends T> pofVar2) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        return mergeDelayError(m86.fromArray(pofVar, pofVar2));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, R> ljf<R> zip(pof<? extends T1> pofVar, pof<? extends T2> pofVar2, j11<? super T1, ? super T2, ? extends R> j11Var) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        return zipArray(q07.toFunction(j11Var), pofVar, pofVar2);
    }

    @bfb
    @by1
    @hpe("custom")
    public final ljf<T> delay(long j, TimeUnit timeUnit, voe voeVar, boolean z) {
        xjb.requireNonNull(timeUnit, "unit is null");
        xjb.requireNonNull(voeVar, "scheduler is null");
        return pfe.onAssembly(new zjf(this, j, timeUnit, voeVar, z));
    }

    @by1
    @hpe("none")
    public final ljf<T> retry(long j, m8d<? super Throwable> m8dVar) {
        return toSingle(toFlowable().retry(j, m8dVar));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(zjd<? extends pof<? extends T>> zjdVar, int i) {
        xjb.requireNonNull(zjdVar, "sources is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new ha6(zjdVar, qmf.toFlowable(), i, f55.IMMEDIATE));
    }

    @bfb
    @by1
    @hpe("none")
    public final <U> ljf<T> delaySubscription(xub<U> xubVar) {
        xjb.requireNonNull(xubVar, "other is null");
        return pfe.onAssembly(new dkf(this, xubVar));
    }

    @by1
    @hpe("none")
    public final ljf<T> retry(m8d<? super Throwable> m8dVar) {
        return toSingle(toFlowable().retry(m8dVar));
    }

    @by1
    @hpe("none")
    public final mf4 subscribe(tu2<? super T> tu2Var) {
        return subscribe(tu2Var, q07.f72644f);
    }

    @bfb
    @by1
    @hpe("none")
    public final <E> ljf<T> takeUntil(pof<? extends E> pofVar) {
        xjb.requireNonNull(pofVar, "other is null");
        return takeUntil(new bpf(pofVar));
    }

    @bfb
    @by1
    @hpe("io.reactivex:computation")
    public final ljf<T> timeout(long j, TimeUnit timeUnit, pof<? extends T> pofVar) {
        xjb.requireNonNull(pofVar, "other is null");
        return timeout0(j, timeUnit, npe.computation(), pofVar);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(pof<? extends T> pofVar, pof<? extends T> pofVar2) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        return merge(m86.fromArray(pofVar, pofVar2));
    }

    @bfb
    @by1
    @hpe("none")
    public final mf4 subscribe(tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2) {
        xjb.requireNonNull(tu2Var, "onSuccess is null");
        xjb.requireNonNull(tu2Var2, "onError is null");
        zu2 zu2Var = new zu2(tu2Var, tu2Var2);
        subscribe(zu2Var);
        return zu2Var;
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(pof<? extends T> pofVar, pof<? extends T> pofVar2, pof<? extends T> pofVar3) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        return mergeDelayError(m86.fromArray(pofVar, pofVar2, pofVar3));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, R> ljf<R> zip(pof<? extends T1> pofVar, pof<? extends T2> pofVar2, pof<? extends T3> pofVar3, iz6<? super T1, ? super T2, ? super T3, ? extends R> iz6Var) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        return zipArray(q07.toFunction(iz6Var), pofVar, pofVar2, pofVar3);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final <U> ljf<T> delaySubscription(zjd<U> zjdVar) {
        xjb.requireNonNull(zjdVar, "other is null");
        return pfe.onAssembly(new fkf(this, zjdVar));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(pof<? extends T> pofVar, pof<? extends T> pofVar2) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        return concat(m86.fromArray(pofVar, pofVar2));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(pof<? extends T> pofVar, pof<? extends T> pofVar2, pof<? extends T> pofVar3) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        return merge(m86.fromArray(pofVar, pofVar2, pofVar3));
    }

    @by1
    @hpe("io.reactivex:computation")
    public final ljf<T> delaySubscription(long j, TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, npe.computation());
    }

    @by1
    @hpe("custom")
    public final ljf<T> delaySubscription(long j, TimeUnit timeUnit, voe voeVar) {
        return delaySubscription(Observable.timer(j, timeUnit, voeVar));
    }

    @Override // p000.pof
    @hpe("none")
    public final void subscribe(inf<? super T> infVar) {
        xjb.requireNonNull(infVar, "observer is null");
        inf<? super T> infVarOnSubscribe = pfe.onSubscribe(this, infVar);
        xjb.requireNonNull(infVarOnSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            subscribeActual(infVarOnSubscribe);
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
    public static <T> m86<T> concat(pof<? extends T> pofVar, pof<? extends T> pofVar2, pof<? extends T> pofVar3) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        return concat(m86.fromArray(pofVar, pofVar2, pofVar3));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> mergeDelayError(pof<? extends T> pofVar, pof<? extends T> pofVar2, pof<? extends T> pofVar3, pof<? extends T> pofVar4) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        xjb.requireNonNull(pofVar4, "source4 is null");
        return mergeDelayError(m86.fromArray(pofVar, pofVar2, pofVar3, pofVar4));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, R> ljf<R> zip(pof<? extends T1> pofVar, pof<? extends T2> pofVar2, pof<? extends T3> pofVar3, pof<? extends T4> pofVar4, mz6<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> mz6Var) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        xjb.requireNonNull(pofVar4, "source4 is null");
        return zipArray(q07.toFunction(mz6Var), pofVar, pofVar2, pofVar3, pofVar4);
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> merge(pof<? extends T> pofVar, pof<? extends T> pofVar2, pof<? extends T> pofVar3, pof<? extends T> pofVar4) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        xjb.requireNonNull(pofVar4, "source4 is null");
        return merge(m86.fromArray(pofVar, pofVar2, pofVar3, pofVar4));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public static <T> m86<T> concat(pof<? extends T> pofVar, pof<? extends T> pofVar2, pof<? extends T> pofVar3, pof<? extends T> pofVar4) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        xjb.requireNonNull(pofVar4, "source4 is null");
        return concat(m86.fromArray(pofVar, pofVar2, pofVar3, pofVar4));
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, T5, R> ljf<R> zip(pof<? extends T1> pofVar, pof<? extends T2> pofVar2, pof<? extends T3> pofVar3, pof<? extends T4> pofVar4, pof<? extends T5> pofVar5, sz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sz6Var) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        xjb.requireNonNull(pofVar4, "source4 is null");
        xjb.requireNonNull(pofVar5, "source5 is null");
        return zipArray(q07.toFunction(sz6Var), pofVar, pofVar2, pofVar3, pofVar4, pofVar5);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, R> ljf<R> zip(pof<? extends T1> pofVar, pof<? extends T2> pofVar2, pof<? extends T3> pofVar3, pof<? extends T4> pofVar4, pof<? extends T5> pofVar5, pof<? extends T6> pofVar6, vz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> vz6Var) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        xjb.requireNonNull(pofVar4, "source4 is null");
        xjb.requireNonNull(pofVar5, "source5 is null");
        xjb.requireNonNull(pofVar6, "source6 is null");
        return zipArray(q07.toFunction(vz6Var), pofVar, pofVar2, pofVar3, pofVar4, pofVar5, pofVar6);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, R> ljf<R> zip(pof<? extends T1> pofVar, pof<? extends T2> pofVar2, pof<? extends T3> pofVar3, pof<? extends T4> pofVar4, pof<? extends T5> pofVar5, pof<? extends T6> pofVar6, pof<? extends T7> pofVar7, yz6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> yz6Var) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        xjb.requireNonNull(pofVar4, "source4 is null");
        xjb.requireNonNull(pofVar5, "source5 is null");
        xjb.requireNonNull(pofVar6, "source6 is null");
        xjb.requireNonNull(pofVar7, "source7 is null");
        return zipArray(q07.toFunction(yz6Var), pofVar, pofVar2, pofVar3, pofVar4, pofVar5, pofVar6, pofVar7);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> ljf<R> zip(pof<? extends T1> pofVar, pof<? extends T2> pofVar2, pof<? extends T3> pofVar3, pof<? extends T4> pofVar4, pof<? extends T5> pofVar5, pof<? extends T6> pofVar6, pof<? extends T7> pofVar7, pof<? extends T8> pofVar8, b07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> b07Var) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        xjb.requireNonNull(pofVar4, "source4 is null");
        xjb.requireNonNull(pofVar5, "source5 is null");
        xjb.requireNonNull(pofVar6, "source6 is null");
        xjb.requireNonNull(pofVar7, "source7 is null");
        xjb.requireNonNull(pofVar8, "source8 is null");
        return zipArray(q07.toFunction(b07Var), pofVar, pofVar2, pofVar3, pofVar4, pofVar5, pofVar6, pofVar7, pofVar8);
    }

    @bfb
    @by1
    @hpe("none")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> ljf<R> zip(pof<? extends T1> pofVar, pof<? extends T2> pofVar2, pof<? extends T3> pofVar3, pof<? extends T4> pofVar4, pof<? extends T5> pofVar5, pof<? extends T6> pofVar6, pof<? extends T7> pofVar7, pof<? extends T8> pofVar8, pof<? extends T9> pofVar9, e07<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> e07Var) {
        xjb.requireNonNull(pofVar, "source1 is null");
        xjb.requireNonNull(pofVar2, "source2 is null");
        xjb.requireNonNull(pofVar3, "source3 is null");
        xjb.requireNonNull(pofVar4, "source4 is null");
        xjb.requireNonNull(pofVar5, "source5 is null");
        xjb.requireNonNull(pofVar6, "source6 is null");
        xjb.requireNonNull(pofVar7, "source7 is null");
        xjb.requireNonNull(pofVar8, "source8 is null");
        xjb.requireNonNull(pofVar9, "source9 is null");
        return zipArray(q07.toFunction(e07Var), pofVar, pofVar2, pofVar3, pofVar4, pofVar5, pofVar6, pofVar7, pofVar8, pofVar9);
    }
}
