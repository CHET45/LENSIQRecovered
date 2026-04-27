package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class pa0 extends AtomicLong implements fdg, mf4 {
    private static final long serialVersionUID = 7028635084060361255L;

    /* JADX INFO: renamed from: a */
    public final AtomicReference<fdg> f70143a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<mf4> f70144b;

    public pa0() {
        this.f70144b = new AtomicReference<>();
        this.f70143a = new AtomicReference<>();
    }

    @Override // p000.fdg
    public void cancel() {
        dispose();
    }

    @Override // p000.mf4
    public void dispose() {
        mdg.cancel(this.f70143a);
        ag4.dispose(this.f70144b);
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f70143a.get() == mdg.CANCELLED;
    }

    public boolean replaceResource(mf4 mf4Var) {
        return ag4.replace(this.f70144b, mf4Var);
    }

    @Override // p000.fdg
    public void request(long j) {
        mdg.deferredRequest(this.f70143a, this, j);
    }

    public boolean setResource(mf4 mf4Var) {
        return ag4.set(this.f70144b, mf4Var);
    }

    public void setSubscription(fdg fdgVar) {
        mdg.deferredSetOnce(this.f70143a, this, fdgVar);
    }

    public pa0(mf4 mf4Var) {
        this();
        this.f70144b.lazySet(mf4Var);
    }
}
