package p000;

import android.os.Process;

/* JADX INFO: loaded from: classes5.dex */
public abstract class do0 implements Runnable {
    public abstract void onRun();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        onRun();
    }
}
