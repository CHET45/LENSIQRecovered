package p000;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class ke6 {

    /* JADX INFO: renamed from: ke6$a */
    public static final class CallableC8298a<T> implements Callable<nr2<T>> {

        /* JADX INFO: renamed from: a */
        public final m86<T> f53707a;

        /* JADX INFO: renamed from: b */
        public final int f53708b;

        public CallableC8298a(m86<T> m86Var, int i) {
            this.f53707a = m86Var;
            this.f53708b = i;
        }

        @Override // java.util.concurrent.Callable
        public nr2<T> call() {
            return this.f53707a.replay(this.f53708b);
        }
    }

    /* JADX INFO: renamed from: ke6$b */
    public static final class CallableC8299b<T> implements Callable<nr2<T>> {

        /* JADX INFO: renamed from: a */
        public final m86<T> f53709a;

        /* JADX INFO: renamed from: b */
        public final int f53710b;

        /* JADX INFO: renamed from: c */
        public final long f53711c;

        /* JADX INFO: renamed from: d */
        public final TimeUnit f53712d;

        /* JADX INFO: renamed from: e */
        public final voe f53713e;

        public CallableC8299b(m86<T> m86Var, int i, long j, TimeUnit timeUnit, voe voeVar) {
            this.f53709a = m86Var;
            this.f53710b = i;
            this.f53711c = j;
            this.f53712d = timeUnit;
            this.f53713e = voeVar;
        }

        @Override // java.util.concurrent.Callable
        public nr2<T> call() {
            return this.f53709a.replay(this.f53710b, this.f53711c, this.f53712d, this.f53713e);
        }
    }

    /* JADX INFO: renamed from: ke6$c */
    public static final class C8300c<T, U> implements py6<T, zjd<U>> {

        /* JADX INFO: renamed from: a */
        public final py6<? super T, ? extends Iterable<? extends U>> f53714a;

        public C8300c(py6<? super T, ? extends Iterable<? extends U>> py6Var) {
            this.f53714a = py6Var;
        }

        @Override // p000.py6
        public zjd<U> apply(T t) throws Exception {
            return new pd6((Iterable) xjb.requireNonNull(this.f53714a.apply(t), "The mapper returned a null Iterable"));
        }
    }

    /* JADX INFO: renamed from: ke6$d */
    public static final class C8301d<U, R, T> implements py6<U, R> {

        /* JADX INFO: renamed from: a */
        public final j11<? super T, ? super U, ? extends R> f53715a;

        /* JADX INFO: renamed from: b */
        public final T f53716b;

        public C8301d(j11<? super T, ? super U, ? extends R> j11Var, T t) {
            this.f53715a = j11Var;
            this.f53716b = t;
        }

        @Override // p000.py6
        public R apply(U u) throws Exception {
            return this.f53715a.apply(this.f53716b, u);
        }
    }

    /* JADX INFO: renamed from: ke6$e */
    public static final class C8302e<T, R, U> implements py6<T, zjd<R>> {

        /* JADX INFO: renamed from: a */
        public final j11<? super T, ? super U, ? extends R> f53717a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends zjd<? extends U>> f53718b;

        public C8302e(j11<? super T, ? super U, ? extends R> j11Var, py6<? super T, ? extends zjd<? extends U>> py6Var) {
            this.f53717a = j11Var;
            this.f53718b = py6Var;
        }

        @Override // p000.py6
        public zjd<R> apply(T t) throws Exception {
            return new if6((zjd) xjb.requireNonNull(this.f53718b.apply(t), "The mapper returned a null Publisher"), new C8301d(this.f53717a, t));
        }
    }

    /* JADX INFO: renamed from: ke6$f */
    public static final class C8303f<T, U> implements py6<T, zjd<T>> {

        /* JADX INFO: renamed from: a */
        public final py6<? super T, ? extends zjd<U>> f53719a;

        public C8303f(py6<? super T, ? extends zjd<U>> py6Var) {
            this.f53719a = py6Var;
        }

        @Override // p000.py6
        public zjd<T> apply(T t) throws Exception {
            return new ik6((zjd) xjb.requireNonNull(this.f53719a.apply(t), "The itemDelay returned a null Publisher"), 1L).map(q07.justFunction(t)).defaultIfEmpty(t);
        }
    }

    /* JADX INFO: renamed from: ke6$g */
    public static final class CallableC8304g<T> implements Callable<nr2<T>> {

        /* JADX INFO: renamed from: a */
        public final m86<T> f53720a;

        public CallableC8304g(m86<T> m86Var) {
            this.f53720a = m86Var;
        }

        @Override // java.util.concurrent.Callable
        public nr2<T> call() {
            return this.f53720a.replay();
        }
    }

    /* JADX INFO: renamed from: ke6$h */
    public static final class C8305h<T, R> implements py6<m86<T>, zjd<R>> {

        /* JADX INFO: renamed from: a */
        public final py6<? super m86<T>, ? extends zjd<R>> f53721a;

        /* JADX INFO: renamed from: b */
        public final voe f53722b;

        public C8305h(py6<? super m86<T>, ? extends zjd<R>> py6Var, voe voeVar) {
            this.f53721a = py6Var;
            this.f53722b = voeVar;
        }

        @Override // p000.py6
        public zjd<R> apply(m86<T> m86Var) throws Exception {
            return m86.fromPublisher((zjd) xjb.requireNonNull(this.f53721a.apply(m86Var), "The selector returned a null Publisher")).observeOn(this.f53722b);
        }
    }

    /* JADX INFO: renamed from: ke6$i */
    public enum EnumC8306i implements tu2<fdg> {
        INSTANCE;

        @Override // p000.tu2
        public void accept(fdg fdgVar) throws Exception {
            fdgVar.request(Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: ke6$j */
    public static final class C8307j<T, S> implements j11<S, ry4<T>, S> {

        /* JADX INFO: renamed from: a */
        public final f11<S, ry4<T>> f53725a;

        public C8307j(f11<S, ry4<T>> f11Var) {
            this.f53725a = f11Var;
        }

        @Override // p000.j11
        public S apply(S s, ry4<T> ry4Var) throws Exception {
            this.f53725a.accept(s, ry4Var);
            return s;
        }
    }

    /* JADX INFO: renamed from: ke6$k */
    public static final class C8308k<T, S> implements j11<S, ry4<T>, S> {

        /* JADX INFO: renamed from: a */
        public final tu2<ry4<T>> f53726a;

        public C8308k(tu2<ry4<T>> tu2Var) {
            this.f53726a = tu2Var;
        }

        @Override // p000.j11
        public S apply(S s, ry4<T> ry4Var) throws Exception {
            this.f53726a.accept(ry4Var);
            return s;
        }
    }

    /* JADX INFO: renamed from: ke6$l */
    public static final class C8309l<T> implements InterfaceC7178i8 {

        /* JADX INFO: renamed from: a */
        public final ycg<T> f53727a;

        public C8309l(ycg<T> ycgVar) {
            this.f53727a = ycgVar;
        }

        @Override // p000.InterfaceC7178i8
        public void run() throws Exception {
            this.f53727a.onComplete();
        }
    }

    /* JADX INFO: renamed from: ke6$m */
    public static final class C8310m<T> implements tu2<Throwable> {

        /* JADX INFO: renamed from: a */
        public final ycg<T> f53728a;

        public C8310m(ycg<T> ycgVar) {
            this.f53728a = ycgVar;
        }

        @Override // p000.tu2
        public void accept(Throwable th) throws Exception {
            this.f53728a.onError(th);
        }
    }

    /* JADX INFO: renamed from: ke6$n */
    public static final class C8311n<T> implements tu2<T> {

        /* JADX INFO: renamed from: a */
        public final ycg<T> f53729a;

        public C8311n(ycg<T> ycgVar) {
            this.f53729a = ycgVar;
        }

        @Override // p000.tu2
        public void accept(T t) throws Exception {
            this.f53729a.onNext(t);
        }
    }

    /* JADX INFO: renamed from: ke6$o */
    public static final class CallableC8312o<T> implements Callable<nr2<T>> {

        /* JADX INFO: renamed from: a */
        public final m86<T> f53730a;

        /* JADX INFO: renamed from: b */
        public final long f53731b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f53732c;

        /* JADX INFO: renamed from: d */
        public final voe f53733d;

        public CallableC8312o(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar) {
            this.f53730a = m86Var;
            this.f53731b = j;
            this.f53732c = timeUnit;
            this.f53733d = voeVar;
        }

        @Override // java.util.concurrent.Callable
        public nr2<T> call() {
            return this.f53730a.replay(this.f53731b, this.f53732c, this.f53733d);
        }
    }

    /* JADX INFO: renamed from: ke6$p */
    public static final class C8313p<T, R> implements py6<List<zjd<? extends T>>, zjd<? extends R>> {

        /* JADX INFO: renamed from: a */
        public final py6<? super Object[], ? extends R> f53734a;

        public C8313p(py6<? super Object[], ? extends R> py6Var) {
            this.f53734a = py6Var;
        }

        @Override // p000.py6
        public zjd<? extends R> apply(List<zjd<? extends T>> list) {
            return m86.zipIterable(list, this.f53734a, false, m86.bufferSize());
        }
    }

    private ke6() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> py6<T, zjd<U>> flatMapIntoIterable(py6<? super T, ? extends Iterable<? extends U>> py6Var) {
        return new C8300c(py6Var);
    }

    public static <T, U, R> py6<T, zjd<R>> flatMapWithCombiner(py6<? super T, ? extends zjd<? extends U>> py6Var, j11<? super T, ? super U, ? extends R> j11Var) {
        return new C8302e(j11Var, py6Var);
    }

    public static <T, U> py6<T, zjd<T>> itemDelay(py6<? super T, ? extends zjd<U>> py6Var) {
        return new C8303f(py6Var);
    }

    public static <T> Callable<nr2<T>> replayCallable(m86<T> m86Var) {
        return new CallableC8304g(m86Var);
    }

    public static <T, R> py6<m86<T>, zjd<R>> replayFunction(py6<? super m86<T>, ? extends zjd<R>> py6Var, voe voeVar) {
        return new C8305h(py6Var, voeVar);
    }

    public static <T, S> j11<S, ry4<T>, S> simpleBiGenerator(f11<S, ry4<T>> f11Var) {
        return new C8307j(f11Var);
    }

    public static <T, S> j11<S, ry4<T>, S> simpleGenerator(tu2<ry4<T>> tu2Var) {
        return new C8308k(tu2Var);
    }

    public static <T> InterfaceC7178i8 subscriberOnComplete(ycg<T> ycgVar) {
        return new C8309l(ycgVar);
    }

    public static <T> tu2<Throwable> subscriberOnError(ycg<T> ycgVar) {
        return new C8310m(ycgVar);
    }

    public static <T> tu2<T> subscriberOnNext(ycg<T> ycgVar) {
        return new C8311n(ycgVar);
    }

    public static <T, R> py6<List<zjd<? extends T>>, zjd<? extends R>> zipIterable(py6<? super Object[], ? extends R> py6Var) {
        return new C8313p(py6Var);
    }

    public static <T> Callable<nr2<T>> replayCallable(m86<T> m86Var, int i) {
        return new CallableC8298a(m86Var, i);
    }

    public static <T> Callable<nr2<T>> replayCallable(m86<T> m86Var, int i, long j, TimeUnit timeUnit, voe voeVar) {
        return new CallableC8299b(m86Var, i, j, timeUnit, voeVar);
    }

    public static <T> Callable<nr2<T>> replayCallable(m86<T> m86Var, long j, TimeUnit timeUnit, voe voeVar) {
        return new CallableC8312o(m86Var, j, timeUnit, voeVar);
    }
}
