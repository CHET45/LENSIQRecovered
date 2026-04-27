package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class fdh implements Executor {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Executor f36235a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ArrayDeque<Runnable> f36236b;

    /* JADX INFO: renamed from: c */
    @gib
    public Runnable f36237c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Object f36238d;

    public fdh(@yfb Executor executor) {
        md8.checkNotNullParameter(executor, "executor");
        this.f36235a = executor;
        this.f36236b = new ArrayDeque<>();
        this.f36238d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$1$lambda$0(Runnable runnable, fdh fdhVar) {
        md8.checkNotNullParameter(runnable, "$command");
        md8.checkNotNullParameter(fdhVar, "this$0");
        try {
            runnable.run();
        } finally {
            fdhVar.scheduleNext();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@yfb final Runnable runnable) {
        md8.checkNotNullParameter(runnable, "command");
        synchronized (this.f36238d) {
            try {
                this.f36236b.offer(new Runnable() { // from class: edh
                    @Override // java.lang.Runnable
                    public final void run() {
                        fdh.execute$lambda$1$lambda$0(runnable, this);
                    }
                });
                if (this.f36237c == null) {
                    scheduleNext();
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void scheduleNext() {
        synchronized (this.f36238d) {
            try {
                Runnable runnablePoll = this.f36236b.poll();
                Runnable runnable = runnablePoll;
                this.f36237c = runnable;
                if (runnablePoll != null) {
                    this.f36235a.execute(runnable);
                }
                bth bthVar = bth.f14751a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
