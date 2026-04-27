package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class jcd {

    /* JADX INFO: renamed from: a */
    public final Object f50327a = new Object();

    /* JADX INFO: renamed from: b */
    public final PriorityQueue<Integer> f50328b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c */
    public int f50329c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: jcd$a */
    public static class C7873a extends IOException {
        public C7873a(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + "]");
        }
    }

    public void add(int i) {
        synchronized (this.f50327a) {
            this.f50328b.add(Integer.valueOf(i));
            this.f50329c = Math.max(this.f50329c, i);
        }
    }

    public void proceed(int i) throws InterruptedException {
        synchronized (this.f50327a) {
            while (this.f50329c != i) {
                try {
                    this.f50327a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i) {
        boolean z;
        synchronized (this.f50327a) {
            z = this.f50329c == i;
        }
        return z;
    }

    public void proceedOrThrow(int i) throws C7873a {
        synchronized (this.f50327a) {
            try {
                if (this.f50329c != i) {
                    throw new C7873a(i, this.f50329c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void remove(int i) {
        synchronized (this.f50327a) {
            this.f50328b.remove(Integer.valueOf(i));
            this.f50329c = this.f50328b.isEmpty() ? Integer.MIN_VALUE : ((Integer) x0i.castNonNull(this.f50328b.peek())).intValue();
            this.f50327a.notifyAll();
        }
    }
}
