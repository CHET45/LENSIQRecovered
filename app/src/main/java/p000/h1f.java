package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class h1f implements Executor {

    /* JADX INFO: renamed from: c */
    public static final Logger f42014c = Logger.getLogger(h1f.class.getName());

    /* JADX INFO: renamed from: a */
    public boolean f42015a;

    /* JADX INFO: renamed from: b */
    public ArrayDeque<Runnable> f42016b;

    private void completeQueuedTasks() {
        while (true) {
            Runnable runnablePoll = this.f42016b.poll();
            if (runnablePoll == null) {
                return;
            }
            try {
                runnablePoll.run();
            } catch (Throwable th) {
                f42014c.log(Level.SEVERE, "Exception while executing runnable " + runnablePoll, th);
            }
        }
    }

    private void enqueue(Runnable runnable) {
        if (this.f42016b == null) {
            this.f42016b = new ArrayDeque<>(4);
        }
        this.f42016b.add(runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        v7d.checkNotNull(runnable, "'task' must not be null.");
        if (this.f42015a) {
            enqueue(runnable);
            return;
        }
        this.f42015a = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                f42014c.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.f42016b != null) {
                }
            } finally {
                if (this.f42016b != null) {
                    completeQueuedTasks();
                }
                this.f42015a = false;
            }
        }
    }
}
