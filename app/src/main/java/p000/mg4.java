package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class mg4<T> implements lj6<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<fdg> f60934a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public final void m17290a() {
        dispose();
    }

    /* JADX INFO: renamed from: b */
    public void m17291b() {
        this.f60934a.get().request(Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: c */
    public final void m17292c(long j) {
        this.f60934a.get().request(j);
    }

    @Override // p000.mf4
    public final void dispose() {
        mdg.cancel(this.f60934a);
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return this.f60934a.get() == mdg.CANCELLED;
    }

    @Override // p000.lj6, p000.ycg
    public final void onSubscribe(fdg fdgVar) {
        if (z15.setOnce(this.f60934a, fdgVar, getClass())) {
            m17291b();
        }
    }
}
