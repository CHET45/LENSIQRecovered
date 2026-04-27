package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class o0f implements lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f66180a;

    public o0f() {
        this.f66180a = new AtomicReference<>();
    }

    @Override // p000.lf4
    public void dispose() {
        zf4.dispose(this.f66180a);
    }

    @dib
    public lf4 get() {
        lf4 lf4Var = this.f66180a.get();
        return lf4Var == zf4.DISPOSED ? lf4.disposed() : lf4Var;
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return zf4.isDisposed(this.f66180a.get());
    }

    public boolean replace(@dib lf4 next) {
        return zf4.replace(this.f66180a, next);
    }

    public boolean set(@dib lf4 next) {
        return zf4.set(this.f66180a, next);
    }

    public o0f(@dib lf4 initialDisposable) {
        this.f66180a = new AtomicReference<>(initialDisposable);
    }
}
