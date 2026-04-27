package p000;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class pq1 {

    /* JADX INFO: renamed from: a */
    public boolean f71635a;

    /* JADX INFO: renamed from: b */
    public InterfaceC11071a f71636b;

    /* JADX INFO: renamed from: c */
    public Object f71637c;

    /* JADX INFO: renamed from: d */
    public boolean f71638d;

    /* JADX INFO: renamed from: pq1$a */
    public interface InterfaceC11071a {
        void onCancel();
    }

    private void waitForCancelFinishedLocked() {
        while (this.f71638d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void cancel() {
        synchronized (this) {
            try {
                if (this.f71635a) {
                    return;
                }
                this.f71635a = true;
                this.f71638d = true;
                InterfaceC11071a interfaceC11071a = this.f71636b;
                Object obj = this.f71637c;
                if (interfaceC11071a != null) {
                    try {
                        interfaceC11071a.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f71638d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f71638d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    @hib
    public Object getCancellationSignalObject() {
        Object obj;
        synchronized (this) {
            try {
                if (this.f71637c == null) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.f71637c = cancellationSignal;
                    if (this.f71635a) {
                        cancellationSignal.cancel();
                    }
                }
                obj = this.f71637c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this) {
            z = this.f71635a;
        }
        return z;
    }

    public void setOnCancelListener(@hib InterfaceC11071a interfaceC11071a) {
        synchronized (this) {
            try {
                waitForCancelFinishedLocked();
                if (this.f71636b == interfaceC11071a) {
                    return;
                }
                this.f71636b = interfaceC11071a;
                if (this.f71635a && interfaceC11071a != null) {
                    interfaceC11071a.onCancel();
                }
            } finally {
            }
        }
    }

    public void throwIfCanceled() {
        if (isCanceled()) {
            throw new b6c();
        }
    }
}
