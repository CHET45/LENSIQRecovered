package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public enum zf4 implements lf4 {
    DISPOSED;

    public static boolean dispose(AtomicReference<lf4> field) {
        lf4 andSet;
        lf4 lf4Var = field.get();
        zf4 zf4Var = DISPOSED;
        if (lf4Var == zf4Var || (andSet = field.getAndSet(zf4Var)) == zf4Var) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(lf4 d) {
        return d == DISPOSED;
    }

    public static boolean replace(AtomicReference<lf4> field, lf4 d) {
        lf4 lf4Var;
        do {
            lf4Var = field.get();
            if (lf4Var == DISPOSED) {
                if (d == null) {
                    return false;
                }
                d.dispose();
                return false;
            }
        } while (!v7b.m23844a(field, lf4Var, d));
        return true;
    }

    public static void reportDisposableSet() {
        ofe.onError(new xhd("Disposable already set!"));
    }

    public static boolean set(AtomicReference<lf4> field, lf4 d) {
        lf4 lf4Var;
        do {
            lf4Var = field.get();
            if (lf4Var == DISPOSED) {
                if (d == null) {
                    return false;
                }
                d.dispose();
                return false;
            }
        } while (!v7b.m23844a(field, lf4Var, d));
        if (lf4Var == null) {
            return true;
        }
        lf4Var.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<lf4> field, lf4 d) {
        Objects.requireNonNull(d, "d is null");
        if (v7b.m23844a(field, null, d)) {
            return true;
        }
        d.dispose();
        if (field.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<lf4> field, lf4 d) {
        if (v7b.m23844a(field, null, d)) {
            return true;
        }
        if (field.get() != DISPOSED) {
            return false;
        }
        d.dispose();
        return false;
    }

    public static boolean validate(lf4 current, lf4 next) {
        if (next == null) {
            ofe.onError(new NullPointerException("next is null"));
            return false;
        }
        if (current == null) {
            return true;
        }
        next.dispose();
        reportDisposableSet();
        return false;
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return true;
    }

    @Override // p000.lf4
    public void dispose() {
    }
}
