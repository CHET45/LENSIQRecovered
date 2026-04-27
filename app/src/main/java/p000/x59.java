package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes5.dex */
public class x59 implements Executor {

    /* JADX INFO: renamed from: a */
    public final Executor f96822a;

    /* JADX INFO: renamed from: b */
    public final Semaphore f96823b;

    /* JADX INFO: renamed from: c */
    public final LinkedBlockingQueue<Runnable> f96824c = new LinkedBlockingQueue<>();

    public x59(Executor executor, int i) {
        w7d.checkArgument(i > 0, "concurrency must be positive.");
        this.f96822a = executor;
        this.f96823b = new Semaphore(i, true);
    }

    private Runnable decorate(final Runnable runnable) {
        return new Runnable() { // from class: w59
            @Override // java.lang.Runnable
            public final void run() {
                this.f93286a.lambda$decorate$0(runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$decorate$0(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f96823b.release();
            maybeEnqueueNext();
        }
    }

    private void maybeEnqueueNext() {
        while (this.f96823b.tryAcquire()) {
            Runnable runnablePoll = this.f96824c.poll();
            if (runnablePoll == null) {
                this.f96823b.release();
                return;
            }
            this.f96822a.execute(decorate(runnablePoll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f96824c.offer(runnable);
        maybeEnqueueNext();
    }
}
