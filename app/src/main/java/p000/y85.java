package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class y85 {

    /* JADX INFO: renamed from: a */
    public static final Executor f100746a = new ExecutorC15546a();

    /* JADX INFO: renamed from: b */
    public static final Executor f100747b = new ExecutorC15547b();

    /* JADX INFO: renamed from: y85$a */
    public class ExecutorC15546a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@efb Runnable runnable) {
            v0i.postOnUiThread(runnable);
        }
    }

    /* JADX INFO: renamed from: y85$b */
    public class ExecutorC15547b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@efb Runnable runnable) {
            runnable.run();
        }
    }

    private y85() {
    }

    public static Executor directExecutor() {
        return f100747b;
    }

    public static Executor mainThreadExecutor() {
        return f100746a;
    }

    @fdi
    public static void shutdownAndAwaitTermination(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
            } else {
                throw new RuntimeException("Failed to shutdown");
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
