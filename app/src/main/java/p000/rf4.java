package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class rf4 implements dh2, mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<mf4> f78148a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public void m21255a() {
    }

    @Override // p000.mf4
    public final void dispose() {
        ag4.dispose(this.f78148a);
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return this.f78148a.get() == ag4.DISPOSED;
    }

    @Override // p000.dh2
    public final void onSubscribe(@bfb mf4 mf4Var) {
        if (z15.setOnce(this.f78148a, mf4Var, getClass())) {
            m21255a();
        }
    }
}
