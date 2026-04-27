package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class x86<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final mr2<? extends T> f97180b;

    /* JADX INFO: renamed from: c */
    public final int f97181c;

    /* JADX INFO: renamed from: d */
    public final uu2<? super lf4> f97182d;

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f97183e = new AtomicInteger();

    public x86(mr2<? extends T> source, int numberOfSubscribers, uu2<? super lf4> connection) {
        this.f97180b = source;
        this.f97181c = numberOfSubscribers;
        this.f97182d = connection;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> child) {
        this.f97180b.subscribe((ycg<? super Object>) child);
        if (this.f97183e.incrementAndGet() == this.f97181c) {
            this.f97180b.connect(this.f97182d);
        }
    }
}
