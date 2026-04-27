package p000;

import io.reactivex.Observable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class mqb {

    /* JADX INFO: renamed from: mqb$a */
    public static final class CallableC9470a<T> implements Callable<pr2<T>> {

        /* JADX INFO: renamed from: a */
        public final Observable<T> f61743a;

        /* JADX INFO: renamed from: b */
        public final int f61744b;

        public CallableC9470a(Observable<T> observable, int i) {
            this.f61743a = observable;
            this.f61744b = i;
        }

        @Override // java.util.concurrent.Callable
        public pr2<T> call() {
            return this.f61743a.replay(this.f61744b);
        }
    }

    /* JADX INFO: renamed from: mqb$b */
    public static final class CallableC9471b<T> implements Callable<pr2<T>> {

        /* JADX INFO: renamed from: a */
        public final Observable<T> f61745a;

        /* JADX INFO: renamed from: b */
        public final int f61746b;

        /* JADX INFO: renamed from: c */
        public final long f61747c;

        /* JADX INFO: renamed from: d */
        public final TimeUnit f61748d;

        /* JADX INFO: renamed from: e */
        public final voe f61749e;

        public CallableC9471b(Observable<T> observable, int i, long j, TimeUnit timeUnit, voe voeVar) {
            this.f61745a = observable;
            this.f61746b = i;
            this.f61747c = j;
            this.f61748d = timeUnit;
            this.f61749e = voeVar;
        }

        @Override // java.util.concurrent.Callable
        public pr2<T> call() {
            return this.f61745a.replay(this.f61746b, this.f61747c, this.f61748d, this.f61749e);
        }
    }

    /* JADX INFO: renamed from: mqb$c */
    public static final class C9472c<T, U> implements py6<T, xub<U>> {

        /* JADX INFO: renamed from: a */
        public final py6<? super T, ? extends Iterable<? extends U>> f61750a;

        public C9472c(py6<? super T, ? extends Iterable<? extends U>> py6Var) {
            this.f61750a = py6Var;
        }

        @Override // p000.py6
        public xub<U> apply(T t) throws Exception {
            return new rpb((Iterable) xjb.requireNonNull(this.f61750a.apply(t), "The mapper returned a null Iterable"));
        }
    }

    /* JADX INFO: renamed from: mqb$d */
    public static final class C9473d<U, R, T> implements py6<U, R> {

        /* JADX INFO: renamed from: a */
        public final j11<? super T, ? super U, ? extends R> f61751a;

        /* JADX INFO: renamed from: b */
        public final T f61752b;

        public C9473d(j11<? super T, ? super U, ? extends R> j11Var, T t) {
            this.f61751a = j11Var;
            this.f61752b = t;
        }

        @Override // p000.py6
        public R apply(U u) throws Exception {
            return this.f61751a.apply(this.f61752b, u);
        }
    }

    /* JADX INFO: renamed from: mqb$e */
    public static final class C9474e<T, R, U> implements py6<T, xub<R>> {

        /* JADX INFO: renamed from: a */
        public final j11<? super T, ? super U, ? extends R> f61753a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<? extends U>> f61754b;

        public C9474e(j11<? super T, ? super U, ? extends R> j11Var, py6<? super T, ? extends xub<? extends U>> py6Var) {
            this.f61753a = j11Var;
            this.f61754b = py6Var;
        }

        @Override // p000.py6
        public xub<R> apply(T t) throws Exception {
            return new grb((xub) xjb.requireNonNull(this.f61754b.apply(t), "The mapper returned a null ObservableSource"), new C9473d(this.f61753a, t));
        }
    }

    /* JADX INFO: renamed from: mqb$f */
    public static final class C9475f<T, U> implements py6<T, xub<T>> {

        /* JADX INFO: renamed from: a */
        public final py6<? super T, ? extends xub<U>> f61755a;

        public C9475f(py6<? super T, ? extends xub<U>> py6Var) {
            this.f61755a = py6Var;
        }

        @Override // p000.py6
        public xub<T> apply(T t) throws Exception {
            return new lvb((xub) xjb.requireNonNull(this.f61755a.apply(t), "The itemDelay returned a null ObservableSource"), 1L).map(q07.justFunction(t)).defaultIfEmpty(t);
        }
    }

    /* JADX INFO: renamed from: mqb$g */
    public enum EnumC9476g implements py6<Object, Object> {
        INSTANCE;

        @Override // p000.py6
        public Object apply(Object obj) throws Exception {
            return 0;
        }
    }

    /* JADX INFO: renamed from: mqb$h */
    public static final class C9477h<T> implements InterfaceC7178i8 {

        /* JADX INFO: renamed from: a */
        public final oxb<T> f61758a;

        public C9477h(oxb<T> oxbVar) {
            this.f61758a = oxbVar;
        }

        @Override // p000.InterfaceC7178i8
        public void run() throws Exception {
            this.f61758a.onComplete();
        }
    }

    /* JADX INFO: renamed from: mqb$i */
    public static final class C9478i<T> implements tu2<Throwable> {

        /* JADX INFO: renamed from: a */
        public final oxb<T> f61759a;

        public C9478i(oxb<T> oxbVar) {
            this.f61759a = oxbVar;
        }

        @Override // p000.tu2
        public void accept(Throwable th) throws Exception {
            this.f61759a.onError(th);
        }
    }

    /* JADX INFO: renamed from: mqb$j */
    public static final class C9479j<T> implements tu2<T> {

        /* JADX INFO: renamed from: a */
        public final oxb<T> f61760a;

        public C9479j(oxb<T> oxbVar) {
            this.f61760a = oxbVar;
        }

        @Override // p000.tu2
        public void accept(T t) throws Exception {
            this.f61760a.onNext(t);
        }
    }

    /* JADX INFO: renamed from: mqb$k */
    public static final class CallableC9480k<T> implements Callable<pr2<T>> {

        /* JADX INFO: renamed from: a */
        public final Observable<T> f61761a;

        public CallableC9480k(Observable<T> observable) {
            this.f61761a = observable;
        }

        @Override // java.util.concurrent.Callable
        public pr2<T> call() {
            return this.f61761a.replay();
        }
    }

    /* JADX INFO: renamed from: mqb$l */
    public static final class C9481l<T, R> implements py6<Observable<T>, xub<R>> {

        /* JADX INFO: renamed from: a */
        public final py6<? super Observable<T>, ? extends xub<R>> f61762a;

        /* JADX INFO: renamed from: b */
        public final voe f61763b;

        public C9481l(py6<? super Observable<T>, ? extends xub<R>> py6Var, voe voeVar) {
            this.f61762a = py6Var;
            this.f61763b = voeVar;
        }

        @Override // p000.py6
        public xub<R> apply(Observable<T> observable) throws Exception {
            return Observable.wrap((xub) xjb.requireNonNull(this.f61762a.apply(observable), "The selector returned a null ObservableSource")).observeOn(this.f61763b);
        }
    }

    /* JADX INFO: renamed from: mqb$m */
    public static final class C9482m<T, S> implements j11<S, ry4<T>, S> {

        /* JADX INFO: renamed from: a */
        public final f11<S, ry4<T>> f61764a;

        public C9482m(f11<S, ry4<T>> f11Var) {
            this.f61764a = f11Var;
        }

        @Override // p000.j11
        public S apply(S s, ry4<T> ry4Var) throws Exception {
            this.f61764a.accept(s, ry4Var);
            return s;
        }
    }

    /* JADX INFO: renamed from: mqb$n */
    public static final class C9483n<T, S> implements j11<S, ry4<T>, S> {

        /* JADX INFO: renamed from: a */
        public final tu2<ry4<T>> f61765a;

        public C9483n(tu2<ry4<T>> tu2Var) {
            this.f61765a = tu2Var;
        }

        @Override // p000.j11
        public S apply(S s, ry4<T> ry4Var) throws Exception {
            this.f61765a.accept(ry4Var);
            return s;
        }
    }

    /* JADX INFO: renamed from: mqb$o */
    public static final class CallableC9484o<T> implements Callable<pr2<T>> {

        /* JADX INFO: renamed from: a */
        public final Observable<T> f61766a;

        /* JADX INFO: renamed from: b */
        public final long f61767b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f61768c;

        /* JADX INFO: renamed from: d */
        public final voe f61769d;

        public CallableC9484o(Observable<T> observable, long j, TimeUnit timeUnit, voe voeVar) {
            this.f61766a = observable;
            this.f61767b = j;
            this.f61768c = timeUnit;
            this.f61769d = voeVar;
        }

        @Override // java.util.concurrent.Callable
        public pr2<T> call() {
            return this.f61766a.replay(this.f61767b, this.f61768c, this.f61769d);
        }
    }

    /* JADX INFO: renamed from: mqb$p */
    public static final class C9485p<T, R> implements py6<List<xub<? extends T>>, xub<? extends R>> {

        /* JADX INFO: renamed from: a */
        public final py6<? super Object[], ? extends R> f61770a;

        public C9485p(py6<? super Object[], ? extends R> py6Var) {
            this.f61770a = py6Var;
        }

        @Override // p000.py6
        public xub<? extends R> apply(List<xub<? extends T>> list) {
            return Observable.zipIterable(list, this.f61770a, false, Observable.bufferSize());
        }
    }

    private mqb() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> py6<T, xub<U>> flatMapIntoIterable(py6<? super T, ? extends Iterable<? extends U>> py6Var) {
        return new C9472c(py6Var);
    }

    public static <T, U, R> py6<T, xub<R>> flatMapWithCombiner(py6<? super T, ? extends xub<? extends U>> py6Var, j11<? super T, ? super U, ? extends R> j11Var) {
        return new C9474e(j11Var, py6Var);
    }

    public static <T, U> py6<T, xub<T>> itemDelay(py6<? super T, ? extends xub<U>> py6Var) {
        return new C9475f(py6Var);
    }

    public static <T> InterfaceC7178i8 observerOnComplete(oxb<T> oxbVar) {
        return new C9477h(oxbVar);
    }

    public static <T> tu2<Throwable> observerOnError(oxb<T> oxbVar) {
        return new C9478i(oxbVar);
    }

    public static <T> tu2<T> observerOnNext(oxb<T> oxbVar) {
        return new C9479j(oxbVar);
    }

    public static <T> Callable<pr2<T>> replayCallable(Observable<T> observable) {
        return new CallableC9480k(observable);
    }

    public static <T, R> py6<Observable<T>, xub<R>> replayFunction(py6<? super Observable<T>, ? extends xub<R>> py6Var, voe voeVar) {
        return new C9481l(py6Var, voeVar);
    }

    public static <T, S> j11<S, ry4<T>, S> simpleBiGenerator(f11<S, ry4<T>> f11Var) {
        return new C9482m(f11Var);
    }

    public static <T, S> j11<S, ry4<T>, S> simpleGenerator(tu2<ry4<T>> tu2Var) {
        return new C9483n(tu2Var);
    }

    public static <T, R> py6<List<xub<? extends T>>, xub<? extends R>> zipIterable(py6<? super Object[], ? extends R> py6Var) {
        return new C9485p(py6Var);
    }

    public static <T> Callable<pr2<T>> replayCallable(Observable<T> observable, int i) {
        return new CallableC9470a(observable, i);
    }

    public static <T> Callable<pr2<T>> replayCallable(Observable<T> observable, int i, long j, TimeUnit timeUnit, voe voeVar) {
        return new CallableC9471b(observable, i, j, timeUnit, voeVar);
    }

    public static <T> Callable<pr2<T>> replayCallable(Observable<T> observable, long j, TimeUnit timeUnit, voe voeVar) {
        return new CallableC9484o(observable, j, timeUnit, voeVar);
    }
}
