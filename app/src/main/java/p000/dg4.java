package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class dg4<T> implements k9a<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f29580a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public void m9131a() {
    }

    @Override // p000.lf4
    public final void dispose() {
        zf4.dispose(this.f29580a);
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return this.f29580a.get() == zf4.DISPOSED;
    }

    @Override // p000.k9a
    public final void onSubscribe(@cfb lf4 d) {
        if (y15.setOnce(this.f29580a, d, getClass())) {
            m9131a();
        }
    }
}
