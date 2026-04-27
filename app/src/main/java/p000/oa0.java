package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class oa0 extends AtomicLong implements fdg, lf4 {
    private static final long serialVersionUID = 7028635084060361255L;

    /* JADX INFO: renamed from: a */
    public final AtomicReference<fdg> f66958a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<lf4> f66959b;

    public oa0() {
        this.f66959b = new AtomicReference<>();
        this.f66958a = new AtomicReference<>();
    }

    @Override // p000.fdg
    public void cancel() {
        dispose();
    }

    @Override // p000.lf4
    public void dispose() {
        ldg.cancel(this.f66958a);
        zf4.dispose(this.f66959b);
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f66958a.get() == ldg.CANCELLED;
    }

    public boolean replaceResource(lf4 r) {
        return zf4.replace(this.f66959b, r);
    }

    @Override // p000.fdg
    public void request(long n) {
        ldg.deferredRequest(this.f66958a, this, n);
    }

    public boolean setResource(lf4 r) {
        return zf4.set(this.f66959b, r);
    }

    public void setSubscription(fdg s) {
        ldg.deferredSetOnce(this.f66958a, this, s);
    }

    public oa0(lf4 resource) {
        this();
        this.f66959b.lazySet(resource);
    }
}
