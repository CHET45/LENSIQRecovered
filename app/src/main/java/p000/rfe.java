package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class rfe extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* JADX INFO: renamed from: a */
    public final String f78162a;

    /* JADX INFO: renamed from: b */
    public final int f78163b;

    /* JADX INFO: renamed from: c */
    public final boolean f78164c;

    /* JADX INFO: renamed from: rfe$a */
    public static final class C12063a extends Thread implements ueb {
        public C12063a(Runnable run, String name) {
            super(run, name);
        }
    }

    public rfe(String prefix) {
        this(prefix, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@cfb Runnable r) {
        String str = this.f78162a + '-' + incrementAndGet();
        Thread c12063a = this.f78164c ? new C12063a(r, str) : new Thread(r, str);
        c12063a.setPriority(this.f78163b);
        c12063a.setDaemon(true);
        return c12063a;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f78162a + "]";
    }

    public rfe(String prefix, int priority) {
        this(prefix, priority, false);
    }

    public rfe(String prefix, int priority, boolean nonBlocking) {
        this.f78162a = prefix;
        this.f78163b = priority;
        this.f78164c = nonBlocking;
    }
}
