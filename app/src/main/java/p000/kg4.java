package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kg4<T> implements hnf<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f54009a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public void m14734a() {
    }

    @Override // p000.lf4
    public final void dispose() {
        zf4.dispose(this.f54009a);
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return this.f54009a.get() == zf4.DISPOSED;
    }

    @Override // p000.hnf
    public final void onSubscribe(@cfb lf4 d) {
        if (y15.setOnce(this.f54009a, d, getClass())) {
            m14734a();
        }
    }
}
