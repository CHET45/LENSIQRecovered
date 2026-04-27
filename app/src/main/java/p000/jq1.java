package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class jq1 extends AtomicReference<aq1> implements mf4 {
    private static final long serialVersionUID = 5718521705281392066L;

    public jq1(aq1 aq1Var) {
        super(aq1Var);
    }

    @Override // p000.mf4
    public void dispose() {
        aq1 andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e) {
            n75.throwIfFatal(e);
            pfe.onError(e);
        }
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return get() == null;
    }
}
