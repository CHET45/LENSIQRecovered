package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class nme {
    private nme() {
        throw new IllegalStateException("No instances!");
    }

    /* JADX INFO: renamed from: a */
    public static <T> boolean m18009a(Object obj, py6<? super T, ? extends qh2> py6Var, dh2 dh2Var) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) ((Callable) obj).call();
            qh2 qh2Var = interfaceC0000a != null ? (qh2) xjb.requireNonNull(py6Var.apply(interfaceC0000a), "The mapper returned a null CompletableSource") : null;
            if (qh2Var == null) {
                c05.complete(dh2Var);
            } else {
                qh2Var.subscribe(dh2Var);
            }
            return true;
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, dh2Var);
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T, R> boolean m18010b(Object obj, py6<? super T, ? extends aaa<? extends R>> py6Var, oxb<? super R> oxbVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) ((Callable) obj).call();
            aaa aaaVar = interfaceC0000a != null ? (aaa) xjb.requireNonNull(py6Var.apply(interfaceC0000a), "The mapper returned a null MaybeSource") : null;
            if (aaaVar == null) {
                c05.complete(oxbVar);
            } else {
                aaaVar.subscribe(waa.create(oxbVar));
            }
            return true;
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, oxbVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public static <T, R> boolean m18011c(Object obj, py6<? super T, ? extends pof<? extends R>> py6Var, oxb<? super R> oxbVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            InterfaceC0000a interfaceC0000a = (Object) ((Callable) obj).call();
            pof pofVar = interfaceC0000a != null ? (pof) xjb.requireNonNull(py6Var.apply(interfaceC0000a), "The mapper returned a null SingleSource") : null;
            if (pofVar == null) {
                c05.complete(oxbVar);
            } else {
                pofVar.subscribe(dpf.create(oxbVar));
            }
            return true;
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            c05.error(th, oxbVar);
            return true;
        }
    }
}
