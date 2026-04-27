package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class ei6 {

    /* JADX INFO: renamed from: ei6$a */
    public static final class C5319a<T, R> extends m86<R> {

        /* JADX INFO: renamed from: b */
        public final T f33065b;

        /* JADX INFO: renamed from: c */
        public final py6<? super T, ? extends zjd<? extends R>> f33066c;

        public C5319a(T t, py6<? super T, ? extends zjd<? extends R>> py6Var) {
            this.f33065b = t;
            this.f33066c = py6Var;
        }

        @Override // p000.m86
        public void subscribeActual(ycg<? super R> ycgVar) {
            try {
                zjd zjdVar = (zjd) xjb.requireNonNull(this.f33066c.apply(this.f33065b), "The mapper returned a null Publisher");
                if (!(zjdVar instanceof Callable)) {
                    zjdVar.subscribe(ycgVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) zjdVar).call();
                    if (objCall == null) {
                        x05.complete(ycgVar);
                    } else {
                        ycgVar.onSubscribe(new kme(ycgVar, objCall));
                    }
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    x05.error(th, ycgVar);
                }
            } catch (Throwable th2) {
                x05.error(th2, ycgVar);
            }
        }
    }

    private ei6() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> m86<U> scalarXMap(T t, py6<? super T, ? extends zjd<? extends U>> py6Var) {
        return pfe.onAssembly(new C5319a(t, py6Var));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(zjd<T> zjdVar, ycg<? super R> ycgVar, py6<? super T, ? extends zjd<? extends R>> py6Var) {
        if (!(zjdVar instanceof Callable)) {
            return false;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) ((Callable) zjdVar).call();
            if (interfaceC0000a == null) {
                x05.complete(ycgVar);
                return true;
            }
            try {
                zjd zjdVar2 = (zjd) xjb.requireNonNull(py6Var.apply(interfaceC0000a), "The mapper returned a null Publisher");
                if (zjdVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) zjdVar2).call();
                        if (objCall == null) {
                            x05.complete(ycgVar);
                            return true;
                        }
                        ycgVar.onSubscribe(new kme(ycgVar, objCall));
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        x05.error(th, ycgVar);
                        return true;
                    }
                } else {
                    zjdVar2.subscribe(ycgVar);
                }
                return true;
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                x05.error(th2, ycgVar);
                return true;
            }
        } catch (Throwable th3) {
            n75.throwIfFatal(th3);
            x05.error(th3, ycgVar);
            return true;
        }
    }
}
