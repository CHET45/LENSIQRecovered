package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qf4 implements ch2, lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f74275a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public void m20315a() {
    }

    @Override // p000.lf4
    public final void dispose() {
        zf4.dispose(this.f74275a);
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return this.f74275a.get() == zf4.DISPOSED;
    }

    @Override // p000.ch2
    public final void onSubscribe(@cfb lf4 d) {
        if (y15.setOnce(this.f74275a, d, getClass())) {
            m20315a();
        }
    }
}
