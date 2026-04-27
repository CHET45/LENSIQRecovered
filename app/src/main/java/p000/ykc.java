package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class ykc implements xkc {

    /* JADX INFO: renamed from: a */
    public volatile boolean f101928a;

    /* JADX INFO: renamed from: b */
    public final Executor f101929b;

    /* JADX INFO: renamed from: c */
    @fdi
    public final LinkedBlockingQueue<Runnable> f101930c = new LinkedBlockingQueue<>();

    public ykc(boolean z, Executor executor) {
        this.f101928a = z;
        this.f101929b = executor;
    }

    private void maybeEnqueueNext() {
        if (this.f101928a) {
            return;
        }
        Runnable runnablePoll = this.f101930c.poll();
        while (runnablePoll != null) {
            this.f101929b.execute(runnablePoll);
            runnablePoll = !this.f101928a ? this.f101930c.poll() : null;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f101930c.offer(runnable);
        maybeEnqueueNext();
    }

    @Override // p000.xkc
    public boolean isPaused() {
        return this.f101928a;
    }

    @Override // p000.xkc
    public void pause() {
        this.f101928a = true;
    }

    @Override // p000.xkc
    public void resume() {
        this.f101928a = false;
        maybeEnqueueNext();
    }
}
