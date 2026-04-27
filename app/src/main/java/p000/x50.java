package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class x50 extends AtomicReferenceArray<mf4> implements mf4 {
    private static final long serialVersionUID = 2746389416410565408L;

    public x50(int i) {
        super(i);
    }

    @Override // p000.mf4
    public void dispose() {
        mf4 andSet;
        if (get(0) != ag4.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                mf4 mf4Var = get(i);
                ag4 ag4Var = ag4.DISPOSED;
                if (mf4Var != ag4Var && (andSet = getAndSet(i, ag4Var)) != ag4Var && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get(0) == ag4.DISPOSED;
    }

    public mf4 replaceResource(int i, mf4 mf4Var) {
        mf4 mf4Var2;
        do {
            mf4Var2 = get(i);
            if (mf4Var2 == ag4.DISPOSED) {
                mf4Var.dispose();
                return null;
            }
        } while (!compareAndSet(i, mf4Var2, mf4Var));
        return mf4Var2;
    }

    public boolean setResource(int i, mf4 mf4Var) {
        mf4 mf4Var2;
        do {
            mf4Var2 = get(i);
            if (mf4Var2 == ag4.DISPOSED) {
                mf4Var.dispose();
                return false;
            }
        } while (!compareAndSet(i, mf4Var2, mf4Var));
        if (mf4Var2 == null) {
            return true;
        }
        mf4Var2.dispose();
        return true;
    }
}
