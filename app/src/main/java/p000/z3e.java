package p000;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.a32;

/* JADX INFO: loaded from: classes.dex */
public class z3e {

    /* JADX INFO: renamed from: z3e$a */
    public static class ThreadFactoryC15976a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public String f104015a;

        /* JADX INFO: renamed from: b */
        public int f104016b;

        /* JADX INFO: renamed from: z3e$a$a */
        public static class a extends Thread {

            /* JADX INFO: renamed from: a */
            public final int f104017a;

            public a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f104017a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f104017a);
                super.run();
            }
        }

        public ThreadFactoryC15976a(@efb String str, int i) {
            this.f104015a = str;
            this.f104016b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable, this.f104015a, this.f104016b);
        }
    }

    /* JADX INFO: renamed from: z3e$b */
    public static class ExecutorC15977b implements Executor {

        /* JADX INFO: renamed from: a */
        public final Handler f104018a;

        public ExecutorC15977b(@efb Handler handler) {
            this.f104018a = (Handler) z7d.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@efb Runnable runnable) {
            if (this.f104018a.post((Runnable) z7d.checkNotNull(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f104018a + " is shutting down");
        }
    }

    /* JADX INFO: renamed from: z3e$c */
    public static class RunnableC15978c<T> implements Runnable {

        /* JADX INFO: renamed from: a */
        @efb
        public Callable<T> f104019a;

        /* JADX INFO: renamed from: b */
        @efb
        public vu2<T> f104020b;

        /* JADX INFO: renamed from: c */
        @efb
        public Handler f104021c;

        /* JADX INFO: renamed from: z3e$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ vu2 f104022a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Object f104023b;

            public a(vu2 vu2Var, Object obj) {
                this.f104022a = vu2Var;
                this.f104023b = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f104022a.accept(this.f104023b);
            }
        }

        public RunnableC15978c(@efb Handler handler, @efb Callable<T> callable, @efb vu2<T> vu2Var) {
            this.f104019a = callable;
            this.f104020b = vu2Var;
            this.f104021c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f104019a.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f104021c.post(new a(this.f104020b, tCall));
        }
    }

    private z3e() {
    }

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor m26554a(@efb String str, int i, @h78(from = 0) int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC15976a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m26555b(@efb Handler handler) {
        return new ExecutorC15977b(handler);
    }

    /* JADX INFO: renamed from: c */
    public static <T> void m26556c(@efb Executor executor, @efb Callable<T> callable, @efb vu2<T> vu2Var) {
        executor.execute(new RunnableC15978c(ro1.m21446a(), callable, vu2Var));
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m26557d(@efb ExecutorService executorService, @efb Callable<T> callable, @h78(from = 0) int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException(a32.C0034g.f248b);
        }
    }
}
