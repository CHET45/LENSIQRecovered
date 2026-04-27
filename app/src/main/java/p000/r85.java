package p000;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class r85 {

    /* JADX INFO: renamed from: r85$a */
    public static class ExecutorC11941a implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f77380a;

        public ExecutorC11941a(@efb Handler handler) {
            this.f77380a = (Handler) z7d.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@efb Runnable runnable) {
            if (this.f77380a.post((Runnable) z7d.checkNotNull(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f77380a + " is shutting down");
        }
    }

    private r85() {
    }

    @efb
    public static Executor create(@efb Handler handler) {
        return new ExecutorC11941a(handler);
    }
}
