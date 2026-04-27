package p000;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class oe4 {

    /* JADX INFO: renamed from: a */
    public final Map<String, C10340a> f67388a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final C10341b f67389b = new C10341b();

    /* JADX INFO: renamed from: oe4$a */
    public static class C10340a {

        /* JADX INFO: renamed from: a */
        public final Lock f67390a = new ReentrantLock();

        /* JADX INFO: renamed from: b */
        public int f67391b;
    }

    /* JADX INFO: renamed from: oe4$b */
    public static class C10341b {

        /* JADX INFO: renamed from: b */
        public static final int f67392b = 10;

        /* JADX INFO: renamed from: a */
        public final Queue<C10340a> f67393a = new ArrayDeque();

        /* JADX INFO: renamed from: a */
        public C10340a m18607a() {
            C10340a c10340aPoll;
            synchronized (this.f67393a) {
                c10340aPoll = this.f67393a.poll();
            }
            return c10340aPoll == null ? new C10340a() : c10340aPoll;
        }

        /* JADX INFO: renamed from: b */
        public void m18608b(C10340a c10340a) {
            synchronized (this.f67393a) {
                try {
                    if (this.f67393a.size() < 10) {
                        this.f67393a.offer(c10340a);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m18605a(String str) {
        C10340a c10340aM18607a;
        synchronized (this) {
            try {
                c10340aM18607a = this.f67388a.get(str);
                if (c10340aM18607a == null) {
                    c10340aM18607a = this.f67389b.m18607a();
                    this.f67388a.put(str, c10340aM18607a);
                }
                c10340aM18607a.f67391b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        c10340aM18607a.f67390a.lock();
    }

    /* JADX INFO: renamed from: b */
    public void m18606b(String str) {
        C10340a c10340a;
        synchronized (this) {
            try {
                c10340a = (C10340a) t7d.checkNotNull(this.f67388a.get(str));
                int i = c10340a.f67391b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c10340a.f67391b);
                }
                int i2 = i - 1;
                c10340a.f67391b = i2;
                if (i2 == 0) {
                    C10340a c10340aRemove = this.f67388a.remove(str);
                    if (!c10340aRemove.equals(c10340a)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c10340a + ", but actually removed: " + c10340aRemove + ", safeKey: " + str);
                    }
                    this.f67389b.m18608b(c10340aRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c10340a.f67390a.unlock();
    }
}
