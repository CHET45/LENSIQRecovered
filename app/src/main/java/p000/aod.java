package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class aod implements ynd, smd {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f11459a = new AtomicBoolean(false);

    @Override // p000.smd
    public synchronized void awaitRelease() throws InterruptedException {
        while (!this.f11459a.get()) {
            try {
                wait();
            } catch (InterruptedException e) {
                if (!this.f11459a.get()) {
                    kfe.m14731w(e, "Queue's awaitRelease() has been interrupted abruptly while it wasn't released by the release() method.", new Object[0]);
                }
            }
        }
    }

    @Override // p000.ynd
    public synchronized void release() {
        if (this.f11459a.compareAndSet(false, true)) {
            notify();
        }
    }
}
