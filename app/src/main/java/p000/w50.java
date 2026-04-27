package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class w50 extends AtomicReferenceArray<lf4> implements lf4 {
    private static final long serialVersionUID = 2746389416410565408L;

    public w50(int capacity) {
        super(capacity);
    }

    @Override // p000.lf4
    public void dispose() {
        lf4 andSet;
        if (get(0) != zf4.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                lf4 lf4Var = get(i);
                zf4 zf4Var = zf4.DISPOSED;
                if (lf4Var != zf4Var && (andSet = getAndSet(i, zf4Var)) != zf4Var && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get(0) == zf4.DISPOSED;
    }

    public lf4 replaceResource(int index, lf4 resource) {
        lf4 lf4Var;
        do {
            lf4Var = get(index);
            if (lf4Var == zf4.DISPOSED) {
                resource.dispose();
                return null;
            }
        } while (!compareAndSet(index, lf4Var, resource));
        return lf4Var;
    }

    public boolean setResource(int index, lf4 resource) {
        lf4 lf4Var;
        do {
            lf4Var = get(index);
            if (lf4Var == zf4.DISPOSED) {
                resource.dispose();
                return false;
            }
        } while (!compareAndSet(index, lf4Var, resource));
        if (lf4Var == null) {
            return true;
        }
        lf4Var.dispose();
        return true;
    }
}
