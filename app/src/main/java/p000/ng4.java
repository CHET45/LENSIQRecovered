package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ng4<T> implements kj6<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<fdg> f64461a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final void m17930a() {
        dispose();
    }

    /* JADX INFO: renamed from: b */
    public void m17931b() {
        this.f64461a.get().request(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public final void m17932c(long n) {
        this.f64461a.get().request(n);
    }

    @Override // p000.lf4
    public final void dispose() {
        ldg.cancel(this.f64461a);
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return this.f64461a.get() == ldg.CANCELLED;
    }

    @Override // p000.kj6, p000.ycg
    public final void onSubscribe(fdg s) {
        if (y15.setOnce(this.f64461a, s, getClass())) {
            m17931b();
        }
    }
}
