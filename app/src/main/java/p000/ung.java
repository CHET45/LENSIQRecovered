package p000;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import p000.dq1;
import p000.e13;
import p000.jj8;
import p000.v7e;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,164:1\n351#2,11:165\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n*L\n136#1:165,11\n*E\n"})
public final class ung {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: ung$a */
    public static final class C13619a<T> implements a34<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ve2<T> f88632a;

        public C13619a(ve2<T> ve2Var) {
            this.f88632a = ve2Var;
        }

        @Override // p000.jj8
        @la8
        public wy1 attachChild(yy1 yy1Var) {
            return this.f88632a.attachChild(yy1Var);
        }

        @Override // p000.a34
        public Object await(zy2<? super T> zy2Var) {
            return this.f88632a.await(zy2Var);
        }

        @Override // p000.jj8
        @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ void cancel() {
            this.f88632a.cancel();
        }

        @Override // p000.e13.InterfaceC5040b, p000.e13
        public <R> R fold(R r, gz6<? super R, ? super e13.InterfaceC5040b, ? extends R> gz6Var) {
            return (R) this.f88632a.fold(r, gz6Var);
        }

        @Override // p000.e13.InterfaceC5040b, p000.e13
        public <E extends e13.InterfaceC5040b> E get(e13.InterfaceC5041c<E> interfaceC5041c) {
            return (E) this.f88632a.get(interfaceC5041c);
        }

        @Override // p000.jj8
        @la8
        public CancellationException getCancellationException() {
            return this.f88632a.getCancellationException();
        }

        @Override // p000.jj8
        public vye<jj8> getChildren() {
            return this.f88632a.getChildren();
        }

        @Override // p000.a34
        @wg5
        public T getCompleted() {
            return this.f88632a.getCompleted();
        }

        @Override // p000.a34
        @wg5
        public Throwable getCompletionExceptionOrNull() {
            return this.f88632a.getCompletionExceptionOrNull();
        }

        @Override // p000.e13.InterfaceC5040b
        public e13.InterfaceC5041c<?> getKey() {
            return this.f88632a.getKey();
        }

        @Override // p000.a34
        public jve<T> getOnAwait() {
            return this.f88632a.getOnAwait();
        }

        @Override // p000.jj8
        public hve getOnJoin() {
            return this.f88632a.getOnJoin();
        }

        @Override // p000.jj8
        public jj8 getParent() {
            return this.f88632a.getParent();
        }

        @Override // p000.jj8
        public yf4 invokeOnCompletion(qy6<? super Throwable, bth> qy6Var) {
            return this.f88632a.invokeOnCompletion(qy6Var);
        }

        @Override // p000.jj8
        public boolean isActive() {
            return this.f88632a.isActive();
        }

        @Override // p000.jj8
        public boolean isCancelled() {
            return this.f88632a.isCancelled();
        }

        @Override // p000.jj8
        public boolean isCompleted() {
            return this.f88632a.isCompleted();
        }

        @Override // p000.jj8
        public Object join(zy2<? super bth> zy2Var) {
            return this.f88632a.join(zy2Var);
        }

        @Override // p000.e13.InterfaceC5040b, p000.e13
        public e13 minusKey(e13.InterfaceC5041c<?> interfaceC5041c) {
            return this.f88632a.minusKey(interfaceC5041c);
        }

        @Override // p000.e13
        public e13 plus(e13 e13Var) {
            return this.f88632a.plus(e13Var);
        }

        @Override // p000.jj8
        public boolean start() {
            return this.f88632a.start();
        }

        @Override // p000.jj8
        public void cancel(CancellationException cancellationException) {
            this.f88632a.cancel(cancellationException);
        }

        @Override // p000.jj8
        @la8
        public yf4 invokeOnCompletion(boolean z, boolean z2, qy6<? super Throwable, bth> qy6Var) {
            return this.f88632a.invokeOnCompletion(z, z2, qy6Var);
        }

        @Override // p000.jj8
        @q64(level = u64.f86866b, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public jj8 plus(jj8 jj8Var) {
            return this.f88632a.plus(jj8Var);
        }

        @Override // p000.jj8
        @q64(level = u64.f86867c, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ boolean cancel(Throwable th) {
            return this.f88632a.cancel(th);
        }
    }

    /* JADX INFO: renamed from: ung$b */
    public static final class C13620b<TResult> implements OnCompleteListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dq1<T> f88633a;

        /* JADX WARN: Multi-variable type inference failed */
        public C13620b(dq1<? super T> dq1Var) {
            this.f88633a = dq1Var;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                zy2 zy2Var = this.f88633a;
                v7e.C13927a c13927a = v7e.f90266b;
                zy2Var.resumeWith(v7e.m32723constructorimpl(y7e.createFailure(exception)));
            } else {
                if (task.isCanceled()) {
                    dq1.C4906a.cancel$default(this.f88633a, null, 1, null);
                    return;
                }
                zy2 zy2Var2 = this.f88633a;
                v7e.C13927a c13927a2 = v7e.f90266b;
                zy2Var2.resumeWith(v7e.m32723constructorimpl(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: ung$c */
    public static final class C13621c implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CancellationTokenSource f88634a;

        public C13621c(CancellationTokenSource cancellationTokenSource) {
            this.f88634a = cancellationTokenSource;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f88634a.cancel();
        }
    }

    @yfb
    public static final <T> a34<T> asDeferred(@yfb Task<T> task) {
        return asDeferredImpl(task, null);
    }

    private static final <T> a34<T> asDeferredImpl(Task<T> task, final CancellationTokenSource cancellationTokenSource) {
        final ve2 ve2VarCompletableDeferred$default = xe2.CompletableDeferred$default(null, 1, null);
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                ve2VarCompletableDeferred$default.completeExceptionally(exception);
            } else if (task.isCanceled()) {
                jj8.C7916a.cancel$default((jj8) ve2VarCompletableDeferred$default, (CancellationException) null, 1, (Object) null);
            } else {
                ve2VarCompletableDeferred$default.complete(task.getResult());
            }
        } else {
            task.addOnCompleteListener(gd4.f39384a, new OnCompleteListener() { // from class: rng
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    ung.asDeferredImpl$lambda$1(ve2VarCompletableDeferred$default, task2);
                }
            });
        }
        if (cancellationTokenSource != null) {
            ve2VarCompletableDeferred$default.invokeOnCompletion(new qy6() { // from class: sng
                @Override // p000.qy6
                public final Object invoke(Object obj) {
                    return ung.asDeferredImpl$lambda$2(cancellationTokenSource, (Throwable) obj);
                }
            });
        }
        return new C13619a(ve2VarCompletableDeferred$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asDeferredImpl$lambda$1(ve2 ve2Var, Task task) {
        Exception exception = task.getException();
        if (exception != null) {
            ve2Var.completeExceptionally(exception);
        } else if (task.isCanceled()) {
            jj8.C7916a.cancel$default((jj8) ve2Var, (CancellationException) null, 1, (Object) null);
        } else {
            ve2Var.complete(task.getResult());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth asDeferredImpl$lambda$2(CancellationTokenSource cancellationTokenSource, Throwable th) {
        cancellationTokenSource.cancel();
        return bth.f14751a;
    }

    @yfb
    public static final <T> Task<T> asTask(@yfb final a34<? extends T> a34Var) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        a34Var.invokeOnCompletion(new qy6() { // from class: tng
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return ung.asTask$lambda$0(cancellationTokenSource, a34Var, taskCompletionSource, (Throwable) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth asTask$lambda$0(CancellationTokenSource cancellationTokenSource, a34 a34Var, TaskCompletionSource taskCompletionSource, Throwable th) {
        if (th instanceof CancellationException) {
            cancellationTokenSource.cancel();
            return bth.f14751a;
        }
        Throwable completionExceptionOrNull = a34Var.getCompletionExceptionOrNull();
        if (completionExceptionOrNull == null) {
            taskCompletionSource.setResult(a34Var.getCompleted());
        } else {
            Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
            if (runtimeExecutionException == null) {
                runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
            }
            taskCompletionSource.setException(runtimeExecutionException);
        }
        return bth.f14751a;
    }

    @gib
    public static final <T> Object await(@yfb Task<T> task, @yfb zy2<? super T> zy2Var) {
        return awaitImpl(task, null, zy2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object awaitImpl(Task<T> task, CancellationTokenSource cancellationTokenSource, zy2<? super T> zy2Var) throws Exception {
        if (!task.isComplete()) {
            fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
            fq1Var.initCancellability();
            task.addOnCompleteListener(gd4.f39384a, new C13620b(fq1Var));
            if (cancellationTokenSource != null) {
                fq1Var.invokeOnCancellation(new C13621c(cancellationTokenSource));
            }
            Object result = fq1Var.getResult();
            if (result == pd8.getCOROUTINE_SUSPENDED()) {
                jk3.probeCoroutineSuspended(zy2Var);
            }
            return result;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    @wg5
    @yfb
    public static final <T> a34<T> asDeferred(@yfb Task<T> task, @yfb CancellationTokenSource cancellationTokenSource) {
        return asDeferredImpl(task, cancellationTokenSource);
    }

    @gib
    @wg5
    public static final <T> Object await(@yfb Task<T> task, @yfb CancellationTokenSource cancellationTokenSource, @yfb zy2<? super T> zy2Var) {
        return awaitImpl(task, cancellationTokenSource, zy2Var);
    }
}
