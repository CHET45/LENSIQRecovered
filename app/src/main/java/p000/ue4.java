package p000;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class ue4 {

    /* JADX INFO: renamed from: b */
    public boolean f87771b;

    /* JADX INFO: renamed from: c */
    public boolean f87772c;

    /* JADX INFO: renamed from: a */
    public boolean f87770a = true;

    /* JADX INFO: renamed from: d */
    @yfb
    public final Queue<Runnable> f87773d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchAndEnqueue$lambda$2$lambda$1(ue4 ue4Var, Runnable runnable) {
        md8.checkNotNullParameter(ue4Var, "this$0");
        md8.checkNotNullParameter(runnable, "$runnable");
        ue4Var.enqueue(runnable);
    }

    @ir9
    private final void enqueue(Runnable runnable) {
        if (!this.f87773d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        drainQueue();
    }

    @ir9
    public final boolean canRun() {
        return this.f87771b || !this.f87770a;
    }

    @f00
    public final void dispatchAndEnqueue(@yfb e13 e13Var, @yfb final Runnable runnable) {
        md8.checkNotNullParameter(e13Var, "context");
        md8.checkNotNullParameter(runnable, "runnable");
        dr9 immediate = df4.getMain().getImmediate();
        if (immediate.isDispatchNeeded(e13Var) || canRun()) {
            immediate.mo29873dispatch(e13Var, new Runnable() { // from class: te4
                @Override // java.lang.Runnable
                public final void run() {
                    ue4.dispatchAndEnqueue$lambda$2$lambda$1(this.f84378a, runnable);
                }
            });
        } else {
            enqueue(runnable);
        }
    }

    @ir9
    public final void drainQueue() {
        if (this.f87772c) {
            return;
        }
        try {
            this.f87772c = true;
            while (!this.f87773d.isEmpty() && canRun()) {
                Runnable runnablePoll = this.f87773d.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
        } finally {
            this.f87772c = false;
        }
    }

    @ir9
    public final void finish() {
        this.f87771b = true;
        drainQueue();
    }

    @ir9
    public final void pause() {
        this.f87770a = true;
    }

    @ir9
    public final void resume() {
        if (this.f87770a) {
            if (this.f87771b) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.f87770a = false;
            drainQueue();
        }
    }
}
