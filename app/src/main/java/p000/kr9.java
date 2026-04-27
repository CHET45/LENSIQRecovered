package p000;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kr9 implements mf4 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f55162a = new AtomicBoolean();

    /* JADX INFO: renamed from: kr9$a */
    public class RunnableC8506a implements Runnable {
        public RunnableC8506a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            kr9.this.m14972a();
        }
    }

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }

    /* JADX INFO: renamed from: a */
    public abstract void m14972a();

    @Override // p000.mf4
    public final void dispose() {
        if (this.f55162a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                m14972a();
            } else {
                C2062bv.mainThread().scheduleDirect(new RunnableC8506a());
            }
        }
    }

    @Override // p000.mf4
    public final boolean isDisposed() {
        return this.f55162a.get();
    }
}
