package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class q6e<T> implements pxb<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f73338a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final s89 f73339b = new s89();

    /* JADX INFO: renamed from: a */
    public void m20080a() {
    }

    public final void add(@cfb lf4 resource) {
        Objects.requireNonNull(resource, "resource is null");
        this.f73339b.add(resource);
    }

    @Override // p000.lf4
    public final void dispose() {
        if (zf4.dispose(this.f73338a)) {
            this.f73339b.dispose();
        }
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return zf4.isDisposed(this.f73338a.get());
    }

    @Override // p000.pxb
    public final void onSubscribe(lf4 d) {
        if (y15.setOnce(this.f73338a, d, getClass())) {
            m20080a();
        }
    }
}
