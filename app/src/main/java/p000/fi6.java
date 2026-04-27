package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class fi6 {

    /* JADX INFO: renamed from: fi6$a */
    public static final class C5841a<T, R> extends l86<R> {

        /* JADX INFO: renamed from: b */
        public final T f36791b;

        /* JADX INFO: renamed from: c */
        public final sy6<? super T, ? extends zjd<? extends R>> f36792c;

        public C5841a(T value, sy6<? super T, ? extends zjd<? extends R>> mapper) {
            this.f36791b = value;
            this.f36792c = mapper;
        }

        @Override // p000.l86
        public void subscribeActual(ycg<? super R> ycgVar) {
            try {
                zjd<? extends R> zjdVarApply = this.f36792c.apply(this.f36791b);
                Objects.requireNonNull(zjdVarApply, "The mapper returned a null Publisher");
                zjd<? extends R> zjdVar = zjdVarApply;
                if (!(zjdVar instanceof nfg)) {
                    zjdVar.subscribe(ycgVar);
                    return;
                }
                try {
                    Object obj = ((nfg) zjdVar).get();
                    if (obj == null) {
                        w05.complete(ycgVar);
                    } else {
                        ycgVar.onSubscribe(new jme(ycgVar, obj));
                    }
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    w05.error(th, ycgVar);
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                w05.error(th2, ycgVar);
            }
        }
    }

    private fi6() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> l86<U> scalarXMap(final T value, final sy6<? super T, ? extends zjd<? extends U>> mapper) {
        return ofe.onAssembly(new C5841a(value, mapper));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(zjd<T> zjdVar, ycg<? super R> ycgVar, sy6<? super T, ? extends zjd<? extends R>> sy6Var) {
        if (!(zjdVar instanceof nfg)) {
            return false;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) ((nfg) zjdVar).get();
            if (interfaceC0000a == null) {
                w05.complete(ycgVar);
                return true;
            }
            try {
                zjd<? extends R> zjdVarApply = sy6Var.apply(interfaceC0000a);
                Objects.requireNonNull(zjdVarApply, "The mapper returned a null Publisher");
                zjd<? extends R> zjdVar2 = zjdVarApply;
                if (zjdVar2 instanceof nfg) {
                    try {
                        Object obj = ((nfg) zjdVar2).get();
                        if (obj == null) {
                            w05.complete(ycgVar);
                            return true;
                        }
                        ycgVar.onSubscribe(new jme(ycgVar, obj));
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        w05.error(th, ycgVar);
                        return true;
                    }
                } else {
                    zjdVar2.subscribe(ycgVar);
                }
                return true;
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                w05.error(th2, ycgVar);
                return true;
            }
        } catch (Throwable th3) {
            o75.throwIfFatal(th3);
            w05.error(th3, ycgVar);
            return true;
        }
    }
}
