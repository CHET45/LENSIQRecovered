package p000;

import java.lang.Thread;
import pl.droidsonroids.gif.C11006b;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yke implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C11006b f101931a;

    public yke(C11006b c11006b) {
        this.f101931a = c11006b;
    }

    public abstract void doWork();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f101931a.isRecycled()) {
                return;
            }
            doWork();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
