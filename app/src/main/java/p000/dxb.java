package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class dxb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final ncg<T> f31252a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f31253b = new AtomicBoolean();

    public dxb(ncg<T> source) {
        this.f31252a = source;
    }

    /* JADX INFO: renamed from: a */
    public boolean m9520a() {
        return !this.f31253b.get() && this.f31253b.compareAndSet(false, true);
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> s) {
        this.f31252a.subscribe(s);
        this.f31253b.set(true);
    }
}
