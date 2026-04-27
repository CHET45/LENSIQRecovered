package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class wb0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final AtomicInteger f93869a;

    public wb0(int i) {
        this.f93869a = new AtomicInteger(i);
    }

    public final int decrementAndGet() {
        return this.f93869a.decrementAndGet();
    }

    public final int get() {
        return this.f93869a.get();
    }

    public final int getAndIncrement() {
        return this.f93869a.getAndIncrement();
    }

    public final int incrementAndGet() {
        return this.f93869a.incrementAndGet();
    }
}
