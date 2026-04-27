package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class a0f extends AtomicReference<lf4> implements lf4 {
    private static final long serialVersionUID = -754898800686245608L;

    public a0f() {
    }

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this);
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return zf4.isDisposed(get());
    }

    public boolean replace(lf4 next) {
        return zf4.replace(this, next);
    }

    public boolean update(lf4 next) {
        return zf4.set(this, next);
    }

    public a0f(lf4 initial) {
        lazySet(initial);
    }
}
