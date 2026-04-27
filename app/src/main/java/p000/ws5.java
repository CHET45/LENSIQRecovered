package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes6.dex */
public class ws5 {

    /* JADX INFO: renamed from: c */
    public static final String f95278c = "FileLock";

    /* JADX INFO: renamed from: d */
    public static final long f95279d = TimeUnit.MILLISECONDS.toNanos(100);

    /* JADX INFO: renamed from: a */
    @efb
    public final Map<String, AtomicInteger> f95280a;

    /* JADX INFO: renamed from: b */
    @efb
    public final Map<String, Thread> f95281b;

    public ws5(@efb Map<String, AtomicInteger> map, @efb Map<String, Thread> map2) {
        this.f95280a = map;
        this.f95281b = map2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m24781a(AtomicInteger atomicInteger) {
        return atomicInteger.get() <= 0;
    }

    /* JADX INFO: renamed from: b */
    public void m24782b() {
        LockSupport.park(Long.valueOf(f95279d));
    }

    /* JADX INFO: renamed from: c */
    public void m24783c(@efb Thread thread) {
        LockSupport.unpark(thread);
    }

    public void decreaseLock(@efb String str) {
        AtomicInteger atomicInteger;
        Thread thread;
        synchronized (this.f95280a) {
            atomicInteger = this.f95280a.get(str);
        }
        if (atomicInteger == null || atomicInteger.decrementAndGet() != 0) {
            return;
        }
        q0i.m19913d(f95278c, "decreaseLock decrease lock-count to 0 " + str);
        synchronized (this.f95281b) {
            try {
                thread = this.f95281b.get(str);
                if (thread != null) {
                    this.f95281b.remove(str);
                }
            } finally {
            }
        }
        if (thread != null) {
            q0i.m19913d(f95278c, "decreaseLock " + str + " unpark locked thread " + atomicInteger);
            m24783c(thread);
        }
        synchronized (this.f95280a) {
            this.f95280a.remove(str);
        }
    }

    public void increaseLock(@efb String str) {
        AtomicInteger atomicInteger;
        synchronized (this.f95280a) {
            atomicInteger = this.f95280a.get(str);
        }
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            synchronized (this.f95280a) {
                this.f95280a.put(str, atomicInteger);
            }
        }
        q0i.m19913d(f95278c, "increaseLock increase lock-count to " + atomicInteger.incrementAndGet() + str);
    }

    public void waitForRelease(@efb String str) {
        AtomicInteger atomicInteger;
        synchronized (this.f95280a) {
            atomicInteger = this.f95280a.get(str);
        }
        if (atomicInteger == null || atomicInteger.get() <= 0) {
            return;
        }
        synchronized (this.f95281b) {
            this.f95281b.put(str, Thread.currentThread());
        }
        q0i.m19913d(f95278c, "waitForRelease start " + str);
        while (!m24781a(atomicInteger)) {
            m24782b();
        }
        q0i.m19913d(f95278c, "waitForRelease finish " + str);
    }

    public ws5() {
        this(new HashMap(), new HashMap());
    }
}
