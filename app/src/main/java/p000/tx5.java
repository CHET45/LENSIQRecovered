package p000;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public class tx5 {

    /* JADX INFO: renamed from: tx5$a */
    public enum EnumC13267a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    private tx5() {
    }

    public static Executor directExecutor() {
        return EnumC13267a.INSTANCE;
    }

    public static Executor newLimitedConcurrencyExecutor(Executor executor, int i) {
        return new x59(executor, i);
    }

    public static ExecutorService newLimitedConcurrencyExecutorService(ExecutorService executorService, int i) {
        return new a69(executorService, i);
    }

    public static ScheduledExecutorService newLimitedConcurrencyScheduledExecutorService(ExecutorService executorService, int i) {
        return new r44(newLimitedConcurrencyExecutorService(executorService, i), ExecutorsRegistrar.f23458d.get());
    }

    public static xkc newPausableExecutor(Executor executor) {
        return new ykc(false, executor);
    }

    public static zkc newPausableExecutorService(ExecutorService executorService) {
        return new clc(false, executorService);
    }

    public static elc newPausableScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return new flc(newPausableExecutorService(scheduledExecutorService), ExecutorsRegistrar.f23458d.get());
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new c0f(executor);
    }
}
