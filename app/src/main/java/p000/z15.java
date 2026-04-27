package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class z15 {
    private z15() {
        throw new IllegalStateException("No instances!");
    }

    public static String composeMessage(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void reportDoubleSubscription(Class<?> cls) {
        pfe.onError(new yhd(composeMessage(cls.getName())));
    }

    public static boolean setOnce(AtomicReference<mf4> atomicReference, mf4 mf4Var, Class<?> cls) {
        xjb.requireNonNull(mf4Var, "next is null");
        if (v7b.m23844a(atomicReference, null, mf4Var)) {
            return true;
        }
        mf4Var.dispose();
        if (atomicReference.get() == ag4.DISPOSED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static boolean validate(mf4 mf4Var, mf4 mf4Var2, Class<?> cls) {
        xjb.requireNonNull(mf4Var2, "next is null");
        if (mf4Var == null) {
            return true;
        }
        mf4Var2.dispose();
        if (mf4Var == ag4.DISPOSED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static boolean validate(fdg fdgVar, fdg fdgVar2, Class<?> cls) {
        xjb.requireNonNull(fdgVar2, "next is null");
        if (fdgVar == null) {
            return true;
        }
        fdgVar2.cancel();
        if (fdgVar == mdg.CANCELLED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }

    public static boolean setOnce(AtomicReference<fdg> atomicReference, fdg fdgVar, Class<?> cls) {
        xjb.requireNonNull(fdgVar, "next is null");
        if (v7b.m23844a(atomicReference, null, fdgVar)) {
            return true;
        }
        fdgVar.cancel();
        if (atomicReference.get() == mdg.CANCELLED) {
            return false;
        }
        reportDoubleSubscription(cls);
        return false;
    }
}
