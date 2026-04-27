package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ilb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final or2<? extends T> f47350a;

    /* JADX INFO: renamed from: b */
    public final int f47351b;

    /* JADX INFO: renamed from: c */
    public final uu2<? super lf4> f47352c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f47353d = new AtomicInteger();

    public ilb(or2<? extends T> source, int numberOfObservers, uu2<? super lf4> connection) {
        this.f47350a = source;
        this.f47351b = numberOfObservers;
        this.f47352c = connection;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> child) {
        this.f47350a.subscribe((pxb<? super Object>) child);
        if (this.f47353d.incrementAndGet() == this.f47351b) {
            this.f47350a.connect(this.f47352c);
        }
    }
}
