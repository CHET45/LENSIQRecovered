package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class mme {
    private mme() {
        throw new IllegalStateException("No instances!");
    }

    /* JADX INFO: renamed from: a */
    public static <T> boolean m17404a(Object obj, sy6<? super T, ? extends ph2> sy6Var, ch2 ch2Var) {
        ph2 ph2Var;
        if (!(obj instanceof nfg)) {
            return false;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) ((nfg) obj).get();
            if (interfaceC0000a != null) {
                ph2 ph2VarApply = sy6Var.apply(interfaceC0000a);
                Objects.requireNonNull(ph2VarApply, "The mapper returned a null CompletableSource");
                ph2Var = ph2VarApply;
            } else {
                ph2Var = null;
            }
            if (ph2Var == null) {
                b05.complete(ch2Var);
            } else {
                ph2Var.subscribe(ch2Var);
            }
            return true;
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, ch2Var);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T, R> boolean m17405b(Object obj, sy6<? super T, ? extends z9a<? extends R>> sy6Var, pxb<? super R> pxbVar) {
        z9a<? extends R> z9aVar;
        if (!(obj instanceof nfg)) {
            return false;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) ((nfg) obj).get();
            if (interfaceC0000a != null) {
                z9a<? extends R> z9aVarApply = sy6Var.apply(interfaceC0000a);
                Objects.requireNonNull(z9aVarApply, "The mapper returned a null MaybeSource");
                z9aVar = z9aVarApply;
            } else {
                z9aVar = null;
            }
            if (z9aVar == null) {
                b05.complete(pxbVar);
            } else {
                z9aVar.subscribe(xaa.create(pxbVar));
            }
            return true;
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, pxbVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public static <T, R> boolean m17406c(Object obj, sy6<? super T, ? extends oof<? extends R>> sy6Var, pxb<? super R> pxbVar) {
        oof<? extends R> oofVar;
        if (!(obj instanceof nfg)) {
            return false;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) ((nfg) obj).get();
            if (interfaceC0000a != null) {
                oof<? extends R> oofVarApply = sy6Var.apply(interfaceC0000a);
                Objects.requireNonNull(oofVarApply, "The mapper returned a null SingleSource");
                oofVar = oofVarApply;
            } else {
                oofVar = null;
            }
            if (oofVar == null) {
                b05.complete(pxbVar);
            } else {
                oofVar.subscribe(epf.create(pxbVar));
            }
            return true;
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, pxbVar);
            return true;
        }
    }
}
