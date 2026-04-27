package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class eg4<T> implements l9a<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<mf4> f32932a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public void m9949a() {
    }

    @Override // p000.mf4
    public final void dispose() {
        ag4.dispose(this.f32932a);
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return this.f32932a.get() == ag4.DISPOSED;
    }

    @Override // p000.l9a
    public final void onSubscribe(@bfb mf4 mf4Var) {
        if (z15.setOnce(this.f32932a, mf4Var, getClass())) {
            m9949a();
        }
    }
}
