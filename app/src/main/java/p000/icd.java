package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class icd {

    /* JADX INFO: renamed from: a */
    public final Object f46499a = new Object();

    /* JADX INFO: renamed from: b */
    public final PriorityQueue<Integer> f46500b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c */
    public int f46501c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: icd$a */
    public static class C7233a extends IOException {
        public C7233a(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + "]");
        }
    }

    public void add(int i) {
        synchronized (this.f46499a) {
            this.f46500b.add(Integer.valueOf(i));
            this.f46501c = Math.max(this.f46501c, i);
        }
    }

    public void proceed(int i) throws InterruptedException {
        synchronized (this.f46499a) {
            while (this.f46501c != i) {
                try {
                    this.f46499a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i) {
        boolean z;
        synchronized (this.f46499a) {
            z = this.f46501c == i;
        }
        return z;
    }

    public void proceedOrThrow(int i) throws C7233a {
        synchronized (this.f46499a) {
            try {
                if (this.f46501c != i) {
                    throw new C7233a(i, this.f46501c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void remove(int i) {
        synchronized (this.f46499a) {
            this.f46500b.remove(Integer.valueOf(i));
            this.f46501c = this.f46500b.isEmpty() ? Integer.MIN_VALUE : ((Integer) t0i.castNonNull(this.f46500b.peek())).intValue();
            this.f46499a.notifyAll();
        }
    }
}
