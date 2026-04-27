package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class wp2 {

    /* JADX INFO: renamed from: a */
    public final h52 f95004a;

    /* JADX INFO: renamed from: b */
    public boolean f95005b;

    public wp2() {
        this(h52.f42390a);
    }

    public synchronized void block() throws InterruptedException {
        while (!this.f95005b) {
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z = false;
        while (!this.f95005b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean close() {
        boolean z;
        z = this.f95005b;
        this.f95005b = false;
        return z;
    }

    public synchronized boolean isOpen() {
        return this.f95005b;
    }

    public synchronized boolean open() {
        if (this.f95005b) {
            return false;
        }
        this.f95005b = true;
        notifyAll();
        return true;
    }

    public wp2(h52 h52Var) {
        this.f95004a = h52Var;
    }

    public synchronized boolean block(long j) throws InterruptedException {
        if (j <= 0) {
            return this.f95005b;
        }
        long jElapsedRealtime = this.f95004a.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        if (j2 < jElapsedRealtime) {
            block();
        } else {
            while (!this.f95005b && jElapsedRealtime < j2) {
                wait(j2 - jElapsedRealtime);
                jElapsedRealtime = this.f95004a.elapsedRealtime();
            }
        }
        return this.f95005b;
    }
}
