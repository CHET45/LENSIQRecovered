package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b7e<T> implements kj6<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<fdg> f12908a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final s89 f12909b = new s89();

    /* JADX INFO: renamed from: c */
    public final AtomicLong f12910c = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public void m2969a() {
        m2970b(Long.MAX_VALUE);
    }

    public final void add(lf4 resource) {
        Objects.requireNonNull(resource, "resource is null");
        this.f12909b.add(resource);
    }

    /* JADX INFO: renamed from: b */
    public final void m2970b(long n) {
        ldg.deferredRequest(this.f12908a, this.f12910c, n);
    }

    @Override // p000.lf4
    public final void dispose() {
        if (ldg.cancel(this.f12908a)) {
            this.f12909b.dispose();
        }
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return this.f12908a.get() == ldg.CANCELLED;
    }

    @Override // p000.kj6, p000.ycg
    public final void onSubscribe(fdg s) {
        if (y15.setOnce(this.f12908a, s, getClass())) {
            long andSet = this.f12910c.getAndSet(0L);
            if (andSet != 0) {
                s.request(andSet);
            }
            m2969a();
        }
    }
}
