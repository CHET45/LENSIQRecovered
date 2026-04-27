package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class y50 extends AtomicReferenceArray<fdg> implements lf4 {
    private static final long serialVersionUID = 2746389416410565408L;

    public y50(int capacity) {
        super(capacity);
    }

    @Override // p000.lf4
    public void dispose() {
        fdg andSet;
        if (get(0) != ldg.CANCELLED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                fdg fdgVar = get(i);
                ldg ldgVar = ldg.CANCELLED;
                if (fdgVar != ldgVar && (andSet = getAndSet(i, ldgVar)) != ldgVar && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return get(0) == ldg.CANCELLED;
    }

    public fdg replaceResource(int index, fdg resource) {
        fdg fdgVar;
        do {
            fdgVar = get(index);
            if (fdgVar == ldg.CANCELLED) {
                if (resource == null) {
                    return null;
                }
                resource.cancel();
                return null;
            }
        } while (!compareAndSet(index, fdgVar, resource));
        return fdgVar;
    }

    public boolean setResource(int index, fdg resource) {
        fdg fdgVar;
        do {
            fdgVar = get(index);
            if (fdgVar == ldg.CANCELLED) {
                if (resource == null) {
                    return false;
                }
                resource.cancel();
                return false;
            }
        } while (!compareAndSet(index, fdgVar, resource));
        if (fdgVar == null) {
            return true;
        }
        fdgVar.cancel();
        return true;
    }
}
