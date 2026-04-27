package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class uog implements g52 {

    /* JADX INFO: renamed from: a */
    public final AtomicLong f88690a;

    public uog(long j) {
        this.f88690a = new AtomicLong(j);
    }

    public void advance(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("cannot advance time backwards.");
        }
        this.f88690a.addAndGet(j);
    }

    @Override // p000.g52
    public long getTime() {
        return this.f88690a.get();
    }

    public void tick() {
        advance(1L);
    }
}
