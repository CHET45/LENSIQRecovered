package p000;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public class c53 implements Executor {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f15795a;

    /* JADX INFO: renamed from: b */
    public final Object f15796b = new Object();

    /* JADX INFO: renamed from: c */
    public Task<?> f15797c = Tasks.forResult(null);

    public c53(ExecutorService executorService) {
        this.f15795a = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$await$6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$0(Callable callable, Task task) throws Exception {
        return Tasks.forResult(callable.call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$1(Runnable runnable, Task task) throws Exception {
        runnable.run();
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$2(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$3(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$4(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$5(SuccessContinuation successContinuation, Task task) throws Exception {
        return task.isSuccessful() ? successContinuation.then(task.getResult()) : task.getException() != null ? Tasks.forException(task.getException()) : Tasks.forCanceled();
    }

    @fdi
    public void await() throws ExecutionException, InterruptedException, TimeoutException {
        Tasks.await(submit(new Runnable() { // from class: x43
            @Override // java.lang.Runnable
            public final void run() {
                c53.lambda$await$6();
            }
        }), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f15795a.execute(runnable);
    }

    public ExecutorService getExecutor() {
        return this.f15795a;
    }

    @op1
    public <T> Task<T> submit(final Callable<T> callable) {
        zzw zzwVar;
        synchronized (this.f15796b) {
            zzwVar = (Task<T>) this.f15797c.continueWithTask(this.f15795a, new Continuation() { // from class: w43
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return c53.lambda$submit$0(callable, task);
                }
            });
            this.f15797c = zzwVar;
        }
        return zzwVar;
    }

    @op1
    public <T> Task<T> submitTask(final Callable<Task<T>> callable) {
        zzw zzwVar;
        synchronized (this.f15796b) {
            zzwVar = (Task<T>) this.f15797c.continueWithTask(this.f15795a, new Continuation() { // from class: y43
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return c53.lambda$submitTask$2(callable, task);
                }
            });
            this.f15797c = zzwVar;
        }
        return zzwVar;
    }

    @op1
    public <T, R> Task<R> submitTaskOnSuccess(final Callable<Task<T>> callable, final SuccessContinuation<T, R> successContinuation) {
        zzw zzwVar;
        synchronized (this.f15796b) {
            zzwVar = (Task<R>) this.f15797c.continueWithTask(this.f15795a, new Continuation() { // from class: a53
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return c53.lambda$submitTaskOnSuccess$4(callable, task);
                }
            }).continueWithTask(this.f15795a, new Continuation() { // from class: b53
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return c53.lambda$submitTaskOnSuccess$5(successContinuation, task);
                }
            });
            this.f15797c = zzwVar;
        }
        return zzwVar;
    }

    @op1
    public Task<Void> submit(final Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f15796b) {
            taskContinueWithTask = this.f15797c.continueWithTask(this.f15795a, new Continuation() { // from class: v43
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return c53.lambda$submit$1(runnable, task);
                }
            });
            this.f15797c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @op1
    public <T, R> Task<R> submitTask(final Callable<Task<T>> callable, Continuation<T, Task<R>> continuation) {
        zzw zzwVar;
        synchronized (this.f15796b) {
            zzwVar = (Task<R>) this.f15797c.continueWithTask(this.f15795a, new Continuation() { // from class: z43
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return c53.lambda$submitTask$3(callable, task);
                }
            }).continueWithTask(this.f15795a, continuation);
            this.f15797c = zzwVar;
        }
        return zzwVar;
    }
}
