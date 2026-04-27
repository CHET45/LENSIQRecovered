package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public enum ag4 implements mf4 {
    DISPOSED;

    public static boolean dispose(AtomicReference<mf4> atomicReference) {
        mf4 andSet;
        mf4 mf4Var = atomicReference.get();
        ag4 ag4Var = DISPOSED;
        if (mf4Var == ag4Var || (andSet = atomicReference.getAndSet(ag4Var)) == ag4Var) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(mf4 mf4Var) {
        return mf4Var == DISPOSED;
    }

    public static boolean replace(AtomicReference<mf4> atomicReference, mf4 mf4Var) {
        mf4 mf4Var2;
        do {
            mf4Var2 = atomicReference.get();
            if (mf4Var2 == DISPOSED) {
                if (mf4Var == null) {
                    return false;
                }
                mf4Var.dispose();
                return false;
            }
        } while (!v7b.m23844a(atomicReference, mf4Var2, mf4Var));
        return true;
    }

    public static void reportDisposableSet() {
        pfe.onError(new yhd("Disposable already set!"));
    }

    public static boolean set(AtomicReference<mf4> atomicReference, mf4 mf4Var) {
        mf4 mf4Var2;
        do {
            mf4Var2 = atomicReference.get();
            if (mf4Var2 == DISPOSED) {
                if (mf4Var == null) {
                    return false;
                }
                mf4Var.dispose();
                return false;
            }
        } while (!v7b.m23844a(atomicReference, mf4Var2, mf4Var));
        if (mf4Var2 == null) {
            return true;
        }
        mf4Var2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<mf4> atomicReference, mf4 mf4Var) {
        xjb.requireNonNull(mf4Var, "d is null");
        if (v7b.m23844a(atomicReference, null, mf4Var)) {
            return true;
        }
        mf4Var.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<mf4> atomicReference, mf4 mf4Var) {
        if (v7b.m23844a(atomicReference, null, mf4Var)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        mf4Var.dispose();
        return false;
    }

    public static boolean validate(mf4 mf4Var, mf4 mf4Var2) {
        if (mf4Var2 == null) {
            pfe.onError(new NullPointerException("next is null"));
            return false;
        }
        if (mf4Var == null) {
            return true;
        }
        mf4Var2.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return true;
    }

    @Override // p000.mf4
    public void dispose() {
    }
}
