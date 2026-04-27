package p000;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lr9 implements lf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f58541a = new AtomicBoolean();

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    /* JADX INFO: renamed from: a */
    public abstract void m16331a();

    @Override // p000.lf4
    public final void dispose() {
        if (this.f58541a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m16331a();
            } else {
                C4517cv.mainThread().scheduleDirect(new Runnable() { // from class: jr9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51605a.m16331a();
                    }
                });
            }
        }
    }

    @Override // p000.lf4
    public final boolean isDisposed() {
        return this.f58541a.get();
    }
}
