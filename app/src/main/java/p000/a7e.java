package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a7e<T> implements lj6<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<fdg> f572a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final t89 f573b = new t89();

    /* JADX INFO: renamed from: c */
    public final AtomicLong f574c = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public void m176a() {
        m177b(Long.MAX_VALUE);
    }

    public final void add(mf4 mf4Var) {
        xjb.requireNonNull(mf4Var, "resource is null");
        this.f573b.add(mf4Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m177b(long j) {
        mdg.deferredRequest(this.f572a, this.f574c, j);
    }

    @Override // p000.mf4
    public final void dispose() {
        if (mdg.cancel(this.f572a)) {
            this.f573b.dispose();
        }
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return this.f572a.get() == mdg.CANCELLED;
    }

    @Override // p000.lj6, p000.ycg
    public final void onSubscribe(fdg fdgVar) {
        if (z15.setOnce(this.f572a, fdgVar, getClass())) {
            long andSet = this.f574c.getAndSet(0L);
            if (andSet != 0) {
                fdgVar.request(andSet);
            }
            m176a();
        }
    }
}
