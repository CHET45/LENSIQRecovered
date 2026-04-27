package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class z50 extends AtomicReferenceArray<fdg> implements mf4 {
    private static final long serialVersionUID = 2746389416410565408L;

    public z50(int i) {
        super(i);
    }

    @Override // p000.mf4
    public void dispose() {
        fdg andSet;
        if (get(0) != mdg.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                fdg fdgVar = get(i);
                mdg mdgVar = mdg.CANCELLED;
                if (fdgVar != mdgVar && (andSet = getAndSet(i, mdgVar)) != mdgVar && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get(0) == mdg.CANCELLED;
    }

    public fdg replaceResource(int i, fdg fdgVar) {
        fdg fdgVar2;
        do {
            fdgVar2 = get(i);
            if (fdgVar2 == mdg.CANCELLED) {
                if (fdgVar == null) {
                    return null;
                }
                fdgVar.cancel();
                return null;
            }
        } while (!compareAndSet(i, fdgVar2, fdgVar));
        return fdgVar2;
    }

    public boolean setResource(int i, fdg fdgVar) {
        fdg fdgVar2;
        do {
            fdgVar2 = get(i);
            if (fdgVar2 == mdg.CANCELLED) {
                if (fdgVar == null) {
                    return false;
                }
                fdgVar.cancel();
                return false;
            }
        } while (!compareAndSet(i, fdgVar2, fdgVar));
        if (fdgVar2 == null) {
            return true;
        }
        fdgVar2.cancel();
        return true;
    }
}
