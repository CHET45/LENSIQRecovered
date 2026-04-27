package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes5.dex */
public class vyg implements Executor {

    /* JADX INFO: renamed from: a */
    public final Executor f92748a;

    /* JADX INFO: renamed from: b */
    public final Semaphore f92749b;

    public vyg(int i, Executor executor) {
        this.f92749b = new Semaphore(i);
        this.f92748a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Runnable runnable) {
        runnable.run();
        this.f92749b.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (!this.f92749b.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.f92748a.execute(new Runnable() { // from class: uyg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89510a.lambda$execute$0(runnable);
                }
            });
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
