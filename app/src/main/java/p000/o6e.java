package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class o6e<T> implements k9a<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f66563a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final s89 f66564b = new s89();

    /* JADX INFO: renamed from: a */
    public void m18384a() {
    }

    public final void add(@cfb lf4 resource) {
        Objects.requireNonNull(resource, "resource is null");
        this.f66564b.add(resource);
    }

    @Override // p000.lf4
    public final void dispose() {
        if (zf4.dispose(this.f66563a)) {
            this.f66564b.dispose();
        }
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return zf4.isDisposed(this.f66563a.get());
    }

    @Override // p000.k9a
    public final void onSubscribe(@cfb lf4 d) {
        if (y15.setOnce(this.f66563a, d, getClass())) {
            m18384a();
        }
    }
}
