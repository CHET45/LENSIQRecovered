package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class yp2 {

    /* JADX INFO: renamed from: a */
    public final j52 f102464a;

    /* JADX INFO: renamed from: b */
    public boolean f102465b;

    public yp2() {
        this(j52.f49539a);
    }

    public synchronized void block() throws InterruptedException {
        while (!this.f102465b) {
            this.f102464a.onThreadBlocked();
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z = false;
        while (!this.f102465b) {
            try {
                this.f102464a.onThreadBlocked();
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
        z = this.f102465b;
        this.f102465b = false;
        return z;
    }

    public synchronized boolean isOpen() {
        return this.f102465b;
    }

    public synchronized boolean open() {
        if (this.f102465b) {
            return false;
        }
        this.f102465b = true;
        notifyAll();
        return true;
    }

    public yp2(j52 j52Var) {
        this.f102464a = j52Var;
    }

    public synchronized boolean block(long j) throws InterruptedException {
        if (j <= 0) {
            return this.f102465b;
        }
        long jElapsedRealtime = this.f102464a.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        if (j2 < jElapsedRealtime) {
            block();
        } else {
            while (!this.f102465b && jElapsedRealtime < j2) {
                this.f102464a.onThreadBlocked();
                wait(j2 - jElapsedRealtime);
                jElapsedRealtime = this.f102464a.elapsedRealtime();
            }
        }
        return this.f102465b;
    }

    public synchronized boolean blockUninterruptible(long j) {
        if (j <= 0) {
            return this.f102465b;
        }
        long jElapsedRealtime = this.f102464a.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        if (j2 < jElapsedRealtime) {
            blockUninterruptible();
        } else {
            boolean z = false;
            while (!this.f102465b && jElapsedRealtime < j2) {
                try {
                    this.f102464a.onThreadBlocked();
                    wait(j2 - jElapsedRealtime);
                } catch (InterruptedException unused) {
                    z = true;
                }
                jElapsedRealtime = this.f102464a.elapsedRealtime();
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f102465b;
    }
}
