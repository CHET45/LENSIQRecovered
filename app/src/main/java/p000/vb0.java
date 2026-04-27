package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class vb0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final AtomicInteger f90536a;

    public vb0(int i) {
        this.f90536a = new AtomicInteger(i);
    }

    public final int decrementAndGet() {
        return this.f90536a.decrementAndGet();
    }

    public final int get() {
        return this.f90536a.get();
    }

    public final int getAndIncrement() {
        return this.f90536a.getAndIncrement();
    }

    public final int incrementAndGet() {
        return this.f90536a.incrementAndGet();
    }

    public /* synthetic */ vb0(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
