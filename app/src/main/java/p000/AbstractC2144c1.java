package p000;

/* JADX INFO: renamed from: c1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC2144c1<T> implements bod<T>, tmd<T> {
    @Override // p000.fdg
    public void cancel() {
    }

    @Override // p000.zif
    public final void clear() {
    }

    @Override // p000.lf4
    public void dispose() {
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return false;
    }

    @Override // p000.zif
    public final boolean isEmpty() {
        return true;
    }

    @Override // p000.zif
    public final boolean offer(@cfb T value) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.zif
    public final T poll() throws Throwable {
        return null;
    }

    @Override // p000.fdg
    public final void request(long n) {
    }

    @Override // p000.vnd
    public final int requestFusion(int mode) {
        return mode & 2;
    }

    @Override // p000.zif
    public final boolean offer(@cfb T v1, @cfb T v2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
