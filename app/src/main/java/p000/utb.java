package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class utb {

    /* JADX INFO: renamed from: utb$a */
    public static final class RunnableC13697a<T> extends AtomicInteger implements umd<T>, Runnable {

        /* JADX INFO: renamed from: c */
        public static final int f89082c = 0;

        /* JADX INFO: renamed from: d */
        public static final int f89083d = 1;

        /* JADX INFO: renamed from: e */
        public static final int f89084e = 2;

        /* JADX INFO: renamed from: f */
        public static final int f89085f = 3;
        private static final long serialVersionUID = 3880992722410194083L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f89086a;

        /* JADX INFO: renamed from: b */
        public final T f89087b;

        public RunnableC13697a(oxb<? super T> oxbVar, T t) {
            this.f89086a = oxbVar;
            this.f89087b = t;
        }

        @Override // p000.ajf
        public void clear() {
            lazySet(3);
        }

        @Override // p000.mf4
        public void dispose() {
            set(3);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // p000.ajf
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f89087b;
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f89086a.onNext(this.f89087b);
                if (get() == 2) {
                    lazySet(3);
                    this.f89086a.onComplete();
                }
            }
        }

        @Override // p000.ajf
        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    /* JADX INFO: renamed from: utb$b */
    public static final class C13698b<T, R> extends Observable<R> {

        /* JADX INFO: renamed from: a */
        public final T f89088a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<? extends R>> f89089b;

        public C13698b(T t, py6<? super T, ? extends xub<? extends R>> py6Var) {
            this.f89088a = t;
            this.f89089b = py6Var;
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(oxb<? super R> oxbVar) {
            try {
                xub xubVar = (xub) xjb.requireNonNull(this.f89089b.apply(this.f89088a), "The mapper returned a null ObservableSource");
                if (!(xubVar instanceof Callable)) {
                    xubVar.subscribe(oxbVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) xubVar).call();
                    if (objCall == null) {
                        c05.complete(oxbVar);
                        return;
                    }
                    RunnableC13697a runnableC13697a = new RunnableC13697a(oxbVar, objCall);
                    oxbVar.onSubscribe(runnableC13697a);
                    runnableC13697a.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    c05.error(th, oxbVar);
                }
            } catch (Throwable th2) {
                c05.error(th2, oxbVar);
            }
        }
    }

    private utb() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Observable<U> scalarXMap(T t, py6<? super T, ? extends xub<? extends U>> py6Var) {
        return pfe.onAssembly(new C13698b(t, py6Var));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(xub<T> xubVar, oxb<? super R> oxbVar, py6<? super T, ? extends xub<? extends R>> py6Var) {
        if (!(xubVar instanceof Callable)) {
            return false;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) ((Callable) xubVar).call();
            if (interfaceC0000a == null) {
                c05.complete(oxbVar);
                return true;
            }
            try {
                xub xubVar2 = (xub) xjb.requireNonNull(py6Var.apply(interfaceC0000a), "The mapper returned a null ObservableSource");
                if (xubVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) xubVar2).call();
                        if (objCall == null) {
                            c05.complete(oxbVar);
                            return true;
                        }
                        RunnableC13697a runnableC13697a = new RunnableC13697a(oxbVar, objCall);
                        oxbVar.onSubscribe(runnableC13697a);
                        runnableC13697a.run();
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        c05.error(th, oxbVar);
                        return true;
                    }
                } else {
                    xubVar2.subscribe(oxbVar);
                }
                return true;
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                c05.error(th2, oxbVar);
                return true;
            }
        } catch (Throwable th3) {
            n75.throwIfFatal(th3);
            c05.error(th3, oxbVar);
            return true;
        }
    }
}
