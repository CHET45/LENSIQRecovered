package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class vtb {

    /* JADX INFO: renamed from: vtb$a */
    public static final class RunnableC14256a<T> extends AtomicInteger implements tmd<T>, Runnable {

        /* JADX INFO: renamed from: c */
        public static final int f92230c = 0;

        /* JADX INFO: renamed from: d */
        public static final int f92231d = 1;

        /* JADX INFO: renamed from: e */
        public static final int f92232e = 2;

        /* JADX INFO: renamed from: f */
        public static final int f92233f = 3;
        private static final long serialVersionUID = 3880992722410194083L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f92234a;

        /* JADX INFO: renamed from: b */
        public final T f92235b;

        public RunnableC14256a(pxb<? super T> observer, T value) {
            this.f92234a = observer;
            this.f92235b = value;
        }

        @Override // p000.zif
        public void clear() {
            lazySet(3);
        }

        @Override // p000.lf4
        public void dispose() {
            set(3);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // p000.zif
        public boolean offer(T value) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p000.zif
        @dib
        public T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f92235b;
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f92234a.onNext(this.f92235b);
                if (get() == 2) {
                    lazySet(3);
                    this.f92234a.onComplete();
                }
            }
        }

        @Override // p000.zif
        public boolean offer(T v1, T v2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    /* JADX INFO: renamed from: vtb$b */
    public static final class C14257b<T, R> extends vkb<R> {

        /* JADX INFO: renamed from: a */
        public final T f92236a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends R>> f92237b;

        public C14257b(T value, sy6<? super T, ? extends wub<? extends R>> mapper) {
            this.f92236a = value;
            this.f92237b = mapper;
        }

        @Override // p000.vkb
        public void subscribeActual(pxb<? super R> pxbVar) {
            try {
                wub<? extends R> wubVarApply = this.f92237b.apply(this.f92236a);
                Objects.requireNonNull(wubVarApply, "The mapper returned a null ObservableSource");
                wub<? extends R> wubVar = wubVarApply;
                if (!(wubVar instanceof nfg)) {
                    wubVar.subscribe(pxbVar);
                    return;
                }
                try {
                    Object obj = ((nfg) wubVar).get();
                    if (obj == null) {
                        b05.complete(pxbVar);
                        return;
                    }
                    RunnableC14256a runnableC14256a = new RunnableC14256a(pxbVar, obj);
                    pxbVar.onSubscribe(runnableC14256a);
                    runnableC14256a.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    b05.error(th, pxbVar);
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                b05.error(th2, pxbVar);
            }
        }
    }

    private vtb() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> vkb<U> scalarXMap(T value, sy6<? super T, ? extends wub<? extends U>> mapper) {
        return ofe.onAssembly(new C14257b(value, mapper));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(wub<T> wubVar, pxb<? super R> pxbVar, sy6<? super T, ? extends wub<? extends R>> sy6Var) {
        if (!(wubVar instanceof nfg)) {
            return false;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) ((nfg) wubVar).get();
            if (interfaceC0000a == null) {
                b05.complete(pxbVar);
                return true;
            }
            try {
                wub<? extends R> wubVarApply = sy6Var.apply(interfaceC0000a);
                Objects.requireNonNull(wubVarApply, "The mapper returned a null ObservableSource");
                wub<? extends R> wubVar2 = wubVarApply;
                if (wubVar2 instanceof nfg) {
                    try {
                        Object obj = ((nfg) wubVar2).get();
                        if (obj == null) {
                            b05.complete(pxbVar);
                            return true;
                        }
                        RunnableC14256a runnableC14256a = new RunnableC14256a(pxbVar, obj);
                        pxbVar.onSubscribe(runnableC14256a);
                        runnableC14256a.run();
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        b05.error(th, pxbVar);
                        return true;
                    }
                } else {
                    wubVar2.subscribe(pxbVar);
                }
                return true;
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                b05.error(th2, pxbVar);
                return true;
            }
        } catch (Throwable th3) {
            o75.throwIfFatal(th3);
            b05.error(th3, pxbVar);
            return true;
        }
    }
}
