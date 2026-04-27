package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public abstract class y6e<T> implements hnf<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<lf4> f100515a = new AtomicReference<>();

    /* JADX INFO: renamed from: b */
    public final s89 f100516b = new s89();

    /* JADX INFO: renamed from: a */
    public void m25668a() {
    }

    public final void add(@cfb lf4 resource) {
        Objects.requireNonNull(resource, "resource is null");
        this.f100516b.add(resource);
    }

    @Override // p000.lf4
    public final void dispose() {
        if (zf4.dispose(this.f100515a)) {
            this.f100516b.dispose();
        }
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return zf4.isDisposed(this.f100515a.get());
    }

    @Override // p000.hnf
    public final void onSubscribe(@cfb lf4 d) {
        if (y15.setOnce(this.f100515a, d, getClass())) {
            m25668a();
        }
    }
}
