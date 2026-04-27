package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public final class fi9 implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final Logger f36805b = Logger.getLogger(fi9.class.getName());

    /* JADX INFO: renamed from: a */
    public final Runnable f36806a;

    public fi9(Runnable runnable) {
        this.f36806a = (Runnable) v7d.checkNotNull(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f36806a.run();
        } catch (Throwable th) {
            f36805b.log(Level.SEVERE, "Exception while executing runnable " + this.f36806a, th);
            bzg.throwIfUnchecked(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f36806a + c0b.f15434d;
    }
}
