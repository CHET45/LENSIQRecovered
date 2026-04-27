package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class gg4<T> implements oxb<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<mf4> f39758a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public void m11682a() {
    }

    @Override // p000.mf4
    public final void dispose() {
        ag4.dispose(this.f39758a);
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return this.f39758a.get() == ag4.DISPOSED;
    }

    @Override // p000.oxb
    public final void onSubscribe(@bfb mf4 mf4Var) {
        if (z15.setOnce(this.f39758a, mf4Var, getClass())) {
            m11682a();
        }
    }
}
