package p000;

/* JADX INFO: loaded from: classes8.dex */
public class xp2 {

    /* JADX INFO: renamed from: a */
    public volatile boolean f98853a;

    /* JADX INFO: renamed from: a */
    public synchronized void m25372a() throws InterruptedException {
        while (!this.f98853a) {
            wait();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m25373b() {
        this.f98853a = false;
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m25374c() {
        boolean z = this.f98853a;
        this.f98853a = true;
        if (!z) {
            notify();
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m25375d(boolean z) {
        try {
            if (z) {
                m25374c();
            } else {
                m25373b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
