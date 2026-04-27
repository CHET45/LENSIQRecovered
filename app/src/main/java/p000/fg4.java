package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class fg4<T> implements pxb<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f36509a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public void m10900a() {
    }

    @Override // p000.lf4
    public final void dispose() {
        zf4.dispose(this.f36509a);
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return this.f36509a.get() == zf4.DISPOSED;
    }

    @Override // p000.pxb
    public final void onSubscribe(@cfb lf4 d) {
        if (y15.setOnce(this.f36509a, d, getClass())) {
            m10900a();
        }
    }
}
