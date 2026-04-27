package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class b0f extends AtomicReference<mf4> implements mf4 {
    private static final long serialVersionUID = -754898800686245608L;

    public b0f() {
    }

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this);
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return ag4.isDisposed(get());
    }

    public boolean replace(mf4 mf4Var) {
        return ag4.replace(this, mf4Var);
    }

    public boolean update(mf4 mf4Var) {
        return ag4.set(this, mf4Var);
    }

    public b0f(mf4 mf4Var) {
        lazySet(mf4Var);
    }
}
