package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class sl6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final qg6<T> f82170b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f82171c = new AtomicBoolean();

    public sl6(qg6<T> source) {
        this.f82170b = source;
    }

    /* JADX INFO: renamed from: b */
    public boolean m22090b() {
        return !this.f82171c.get() && this.f82171c.compareAndSet(false, true);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f82170b.subscribe(s);
        this.f82171c.set(true);
    }
}
