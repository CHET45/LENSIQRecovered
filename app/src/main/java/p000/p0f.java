package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class p0f implements mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<mf4> f69342a;

    public p0f() {
        this.f69342a = new AtomicReference<>();
    }

    @Override // p000.mf4
    public void dispose() {
        ag4.dispose(this.f69342a);
    }

    @cib
    public mf4 get() {
        mf4 mf4Var = this.f69342a.get();
        return mf4Var == ag4.DISPOSED ? pg4.disposed() : mf4Var;
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return ag4.isDisposed(this.f69342a.get());
    }

    public boolean replace(@cib mf4 mf4Var) {
        return ag4.replace(this.f69342a, mf4Var);
    }

    public boolean set(@cib mf4 mf4Var) {
        return ag4.set(this.f69342a, mf4Var);
    }

    public p0f(@cib mf4 mf4Var) {
        this.f69342a = new AtomicReference<>(mf4Var);
    }
}
