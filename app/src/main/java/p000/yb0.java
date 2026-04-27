package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class yb0 implements zk9 {

    /* JADX INFO: renamed from: a */
    public final AtomicLong f101027a = new AtomicLong();

    @Override // p000.zk9
    public void add(long j) {
        this.f101027a.getAndAdd(j);
    }

    @Override // p000.zk9
    public long value() {
        return this.f101027a.get();
    }
}
