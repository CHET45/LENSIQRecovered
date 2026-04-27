package p000;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class fec<T> {
    @by1
    public static <T> fec<T> from(@bfb zjd<? extends T> zjdVar) {
        return from(zjdVar, Runtime.getRuntime().availableProcessors(), m86.bufferSize());
    }

    @bfb
    @by1
    public static <T> fec<T> fromArray(@bfb zjd<T>... zjdVarArr) {
        if (zjdVarArr.length != 0) {
            return pfe.onAssembly(new jec(zjdVarArr));
        }
        throw new IllegalArgumentException("Zero publishers not supported");
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10853a(@bfb ycg<?>[] ycgVarArr) {
        int iParallelism = parallelism();
        if (ycgVarArr.length == iParallelism) {
            return true;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("parallelism = " + iParallelism + ", subscribers = " + ycgVarArr.length);
        int length = ycgVarArr.length;
        for (int i = 0; i < length; i++) {
            x05.error(illegalArgumentException, ycgVarArr[i]);
        }
        return false;
    }

    @bfb
    @by1
    /* JADX INFO: renamed from: as */
    public final <R> R m10854as(@bfb hec<T, R> hecVar) {
        return (R) ((hec) xjb.requireNonNull(hecVar, "converter is null")).apply(this);
    }

    @bfb
    @by1
    public final <C> fec<C> collect(@bfb Callable<? extends C> callable, @bfb f11<? super C, ? super T> f11Var) {
        xjb.requireNonNull(callable, "collectionSupplier is null");
        xjb.requireNonNull(f11Var, "collector is null");
        return pfe.onAssembly(new mdc(this, callable, f11Var));
    }

    @bfb
    @by1
    public final <U> fec<U> compose(@bfb ifc<T, U> ifcVar) {
        return pfe.onAssembly(((ifc) xjb.requireNonNull(ifcVar, "composer is null")).apply(this));
    }

    @bfb
    @by1
    public final <R> fec<R> concatMap(@bfb py6<? super T, ? extends zjd<? extends R>> py6Var) {
        return concatMap(py6Var, 2);
    }

    @bfb
    @by1
    public final <R> fec<R> concatMapDelayError(@bfb py6<? super T, ? extends zjd<? extends R>> py6Var, boolean z) {
        return concatMapDelayError(py6Var, 2, z);
    }

    @bfb
    @by1
    public final fec<T> doAfterNext(@bfb tu2<? super T> tu2Var) {
        xjb.requireNonNull(tu2Var, "onAfterNext is null");
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return pfe.onAssembly(new uec(this, tu2VarEmptyConsumer, tu2Var, tu2VarEmptyConsumer2, interfaceC7178i8, interfaceC7178i8, q07.emptyConsumer(), q07.f72645g, interfaceC7178i8));
    }

    @bfb
    @by1
    public final fec<T> doAfterTerminated(@bfb InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onAfterTerminate is null");
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer3 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i82 = q07.f72641c;
        return pfe.onAssembly(new uec(this, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, tu2VarEmptyConsumer3, interfaceC7178i82, interfaceC7178i8, q07.emptyConsumer(), q07.f72645g, interfaceC7178i82));
    }

    @bfb
    @by1
    public final fec<T> doOnCancel(@bfb InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onCancel is null");
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer3 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i82 = q07.f72641c;
        return pfe.onAssembly(new uec(this, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, tu2VarEmptyConsumer3, interfaceC7178i82, interfaceC7178i82, q07.emptyConsumer(), q07.f72645g, interfaceC7178i8));
    }

    @bfb
    @by1
    public final fec<T> doOnComplete(@bfb InterfaceC7178i8 interfaceC7178i8) {
        xjb.requireNonNull(interfaceC7178i8, "onComplete is null");
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer3 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i82 = q07.f72641c;
        return pfe.onAssembly(new uec(this, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, tu2VarEmptyConsumer3, interfaceC7178i8, interfaceC7178i82, q07.emptyConsumer(), q07.f72645g, interfaceC7178i82));
    }

    @bfb
    @by1
    public final fec<T> doOnError(@bfb tu2<Throwable> tu2Var) {
        xjb.requireNonNull(tu2Var, "onError is null");
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return pfe.onAssembly(new uec(this, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, tu2Var, interfaceC7178i8, interfaceC7178i8, q07.emptyConsumer(), q07.f72645g, interfaceC7178i8));
    }

    @bfb
    @by1
    public final fec<T> doOnNext(@bfb tu2<? super T> tu2Var) {
        xjb.requireNonNull(tu2Var, "onNext is null");
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return pfe.onAssembly(new uec(this, tu2Var, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, interfaceC7178i8, interfaceC7178i8, q07.emptyConsumer(), q07.f72645g, interfaceC7178i8));
    }

    @bfb
    @by1
    public final fec<T> doOnRequest(@bfb yk9 yk9Var) {
        xjb.requireNonNull(yk9Var, "onRequest is null");
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer3 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return pfe.onAssembly(new uec(this, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, tu2VarEmptyConsumer3, interfaceC7178i8, interfaceC7178i8, q07.emptyConsumer(), yk9Var, interfaceC7178i8));
    }

    @bfb
    @by1
    public final fec<T> doOnSubscribe(@bfb tu2<? super fdg> tu2Var) {
        xjb.requireNonNull(tu2Var, "onSubscribe is null");
        tu2 tu2VarEmptyConsumer = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer2 = q07.emptyConsumer();
        tu2 tu2VarEmptyConsumer3 = q07.emptyConsumer();
        InterfaceC7178i8 interfaceC7178i8 = q07.f72641c;
        return pfe.onAssembly(new uec(this, tu2VarEmptyConsumer, tu2VarEmptyConsumer2, tu2VarEmptyConsumer3, interfaceC7178i8, interfaceC7178i8, tu2Var, q07.f72645g, interfaceC7178i8));
    }

    @by1
    public final fec<T> filter(@bfb m8d<? super T> m8dVar) {
        xjb.requireNonNull(m8dVar, "predicate");
        return pfe.onAssembly(new wdc(this, m8dVar));
    }

    @bfb
    @by1
    public final <R> fec<R> flatMap(@bfb py6<? super T, ? extends zjd<? extends R>> py6Var) {
        return flatMap(py6Var, false, Integer.MAX_VALUE, m86.bufferSize());
    }

    @bfb
    @by1
    public final <R> fec<R> map(@bfb py6<? super T, ? extends R> py6Var) {
        xjb.requireNonNull(py6Var, "mapper");
        return pfe.onAssembly(new oec(this, py6Var));
    }

    public abstract int parallelism();

    @bfb
    @by1
    public final m86<T> reduce(@bfb j11<T, T, T> j11Var) {
        xjb.requireNonNull(j11Var, "reducer");
        return pfe.onAssembly(new yec(this, j11Var));
    }

    @bfb
    @by1
    public final fec<T> runOn(@bfb voe voeVar) {
        return runOn(voeVar, m86.bufferSize());
    }

    @by1
    @hpe("none")
    @ap0(uo0.FULL)
    public final m86<T> sequential() {
        return sequential(m86.bufferSize());
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> sequentialDelayError() {
        return sequentialDelayError(m86.bufferSize());
    }

    @bfb
    @by1
    public final m86<T> sorted(@bfb Comparator<? super T> comparator) {
        return sorted(comparator, 16);
    }

    public abstract void subscribe(@bfb ycg<? super T>[] ycgVarArr);

    @bfb
    @by1
    /* JADX INFO: renamed from: to */
    public final <U> U m10855to(@bfb py6<? super fec<T>, U> py6Var) {
        try {
            return (U) ((py6) xjb.requireNonNull(py6Var, "converter is null")).apply(this);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            throw j75.wrapOrThrow(th);
        }
    }

    @bfb
    @by1
    public final m86<List<T>> toSortedList(@bfb Comparator<? super T> comparator) {
        return toSortedList(comparator, 16);
    }

    @by1
    public static <T> fec<T> from(@bfb zjd<? extends T> zjdVar, int i) {
        return from(zjdVar, i, m86.bufferSize());
    }

    @bfb
    @by1
    public final <R> fec<R> concatMap(@bfb py6<? super T, ? extends zjd<? extends R>> py6Var, int i) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new rdc(this, py6Var, i, f55.IMMEDIATE));
    }

    @bfb
    @by1
    public final <R> fec<R> concatMapDelayError(@bfb py6<? super T, ? extends zjd<? extends R>> py6Var, int i, boolean z) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new rdc(this, py6Var, i, z ? f55.END : f55.BOUNDARY));
    }

    @bfb
    @by1
    public final <R> fec<R> flatMap(@bfb py6<? super T, ? extends zjd<? extends R>> py6Var, boolean z) {
        return flatMap(py6Var, z, Integer.MAX_VALUE, m86.bufferSize());
    }

    @bfb
    @by1
    public final fec<T> runOn(@bfb voe voeVar, int i) {
        xjb.requireNonNull(voeVar, "scheduler");
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new afc(this, voeVar, i));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> sequential(int i) {
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new mec(this, i, false));
    }

    @by1
    @ap0(uo0.FULL)
    @bfb
    @hpe("none")
    public final m86<T> sequentialDelayError(int i) {
        xjb.verifyPositive(i, "prefetch");
        return pfe.onAssembly(new mec(this, i, true));
    }

    @bfb
    @by1
    public final m86<T> sorted(@bfb Comparator<? super T> comparator, int i) {
        xjb.requireNonNull(comparator, "comparator is null");
        xjb.verifyPositive(i, "capacityHint");
        return pfe.onAssembly(new ffc(reduce(q07.createArrayList((i / parallelism()) + 1), e89.instance()).map(new uvf(comparator)), comparator));
    }

    @bfb
    @by1
    public final m86<List<T>> toSortedList(@bfb Comparator<? super T> comparator, int i) {
        xjb.requireNonNull(comparator, "comparator is null");
        xjb.verifyPositive(i, "capacityHint");
        return pfe.onAssembly(reduce(q07.createArrayList((i / parallelism()) + 1), e89.instance()).map(new uvf(comparator)).reduce(new sra(comparator)));
    }

    @bfb
    @by1
    public static <T> fec<T> from(@bfb zjd<? extends T> zjdVar, int i, int i2) {
        xjb.requireNonNull(zjdVar, "source");
        xjb.verifyPositive(i, "parallelism");
        xjb.verifyPositive(i2, "prefetch");
        return pfe.onAssembly(new kec(zjdVar, i, i2));
    }

    @by1
    public final fec<T> filter(@bfb m8d<? super T> m8dVar, @bfb vdc vdcVar) {
        xjb.requireNonNull(m8dVar, "predicate");
        xjb.requireNonNull(vdcVar, "errorHandler is null");
        return pfe.onAssembly(new ydc(this, m8dVar, vdcVar));
    }

    @bfb
    @by1
    public final <R> fec<R> flatMap(@bfb py6<? super T, ? extends zjd<? extends R>> py6Var, boolean z, int i) {
        return flatMap(py6Var, z, i, m86.bufferSize());
    }

    @bfb
    @by1
    public final <R> fec<R> map(@bfb py6<? super T, ? extends R> py6Var, @bfb vdc vdcVar) {
        xjb.requireNonNull(py6Var, "mapper");
        xjb.requireNonNull(vdcVar, "errorHandler is null");
        return pfe.onAssembly(new rec(this, py6Var, vdcVar));
    }

    @bfb
    @by1
    public final <R> fec<R> reduce(@bfb Callable<R> callable, @bfb j11<R, ? super T, R> j11Var) {
        xjb.requireNonNull(callable, "initialSupplier");
        xjb.requireNonNull(j11Var, "reducer");
        return pfe.onAssembly(new wec(this, callable, j11Var));
    }

    @bfb
    @by1
    public final <R> fec<R> flatMap(@bfb py6<? super T, ? extends zjd<? extends R>> py6Var, boolean z, int i, int i2) {
        xjb.requireNonNull(py6Var, "mapper is null");
        xjb.verifyPositive(i, "maxConcurrency");
        xjb.verifyPositive(i2, "prefetch");
        return pfe.onAssembly(new bec(this, py6Var, z, i, i2));
    }

    @by1
    public final fec<T> filter(@bfb m8d<? super T> m8dVar, @bfb j11<? super Long, ? super Throwable, vdc> j11Var) {
        xjb.requireNonNull(m8dVar, "predicate");
        xjb.requireNonNull(j11Var, "errorHandler is null");
        return pfe.onAssembly(new ydc(this, m8dVar, j11Var));
    }

    @bfb
    @by1
    public final <R> fec<R> map(@bfb py6<? super T, ? extends R> py6Var, @bfb j11<? super Long, ? super Throwable, vdc> j11Var) {
        xjb.requireNonNull(py6Var, "mapper");
        xjb.requireNonNull(j11Var, "errorHandler is null");
        return pfe.onAssembly(new rec(this, py6Var, j11Var));
    }

    @bfb
    @by1
    public final fec<T> doOnNext(@bfb tu2<? super T> tu2Var, @bfb vdc vdcVar) {
        xjb.requireNonNull(tu2Var, "onNext is null");
        xjb.requireNonNull(vdcVar, "errorHandler is null");
        return pfe.onAssembly(new sdc(this, tu2Var, vdcVar));
    }

    @bfb
    @by1
    public final fec<T> doOnNext(@bfb tu2<? super T> tu2Var, @bfb j11<? super Long, ? super Throwable, vdc> j11Var) {
        xjb.requireNonNull(tu2Var, "onNext is null");
        xjb.requireNonNull(j11Var, "errorHandler is null");
        return pfe.onAssembly(new sdc(this, tu2Var, j11Var));
    }
}
