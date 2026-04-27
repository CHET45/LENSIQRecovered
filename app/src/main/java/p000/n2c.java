package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class n2c {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f63062a = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f63063b = new AtomicInteger();

    public int getDroppedOnDemandExceptions() {
        return this.f63063b.get();
    }

    public int getRecordedOnDemandExceptions() {
        return this.f63062a.get();
    }

    public void incrementDroppedOnDemandExceptions() {
        this.f63063b.getAndIncrement();
    }

    public void incrementRecordedOnDemandExceptions() {
        this.f63062a.getAndIncrement();
    }

    public void resetDroppedOnDemandExceptions() {
        this.f63063b.set(0);
    }
}
