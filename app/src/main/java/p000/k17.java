package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,208:1\n1#2:209\n351#3,11:210\n*S KotlinDebug\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n*L\n168#1:210,11\n*E\n"})
public final class k17 {

    /* JADX INFO: renamed from: k17$a */
    public static final class C8163a implements qy6<Throwable, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CompletableFuture<T> f52369a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ bz2<T> f52370b;

        public C8163a(CompletableFuture<T> completableFuture, bz2<T> bz2Var) {
            this.f52369a = completableFuture;
            this.f52370b = bz2Var;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(Throwable th) {
            invoke2(th);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f52369a.cancel(false);
            this.f52370b.cont = null;
        }
    }

    /* JADX INFO: renamed from: k17$b */
    public static final class C8164b implements gz6 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jj8 f52371a;

        public C8164b(jj8 jj8Var) {
            this.f52371a = jj8Var;
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(obj, (Throwable) obj2);
            return bth.f14751a;
        }

        public final void invoke(Object obj, Throwable th) {
            jj8 jj8Var = this.f52371a;
            if (th != null) {
                CancellationException = th instanceof CancellationException ? (CancellationException) th : null;
                if (CancellationException == null) {
                    CancellationException = y75.CancellationException("CompletableFuture was completed exceptionally", th);
                }
            }
            jj8Var.cancel(CancellationException);
        }
    }

    @yfb
    public static final <T> CompletableFuture<T> asCompletableFuture(@yfb final a34<? extends T> a34Var) {
        final CompletableFuture<T> completableFuture = new CompletableFuture<>();
        setupCancellation(a34Var, completableFuture);
        a34Var.invokeOnCompletion(new qy6() { // from class: f17
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return k17.asCompletableFuture$lambda$1(completableFuture, a34Var, (Throwable) obj);
            }
        });
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth asCompletableFuture$lambda$1(CompletableFuture completableFuture, a34 a34Var, Throwable th) {
        try {
            completableFuture.complete(a34Var.getCompleted());
        } catch (Throwable th2) {
            completableFuture.completeExceptionally(th2);
        }
        return bth.f14751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth asCompletableFuture$lambda$2(CompletableFuture completableFuture, Throwable th) {
        if (th == null) {
            completableFuture.complete(bth.f14751a);
        } else {
            completableFuture.completeExceptionally(th);
        }
        return bth.f14751a;
    }

    @yfb
    public static final <T> a34<T> asDeferred(@yfb CompletionStage<T> completionStage) {
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (!completableFuture.isDone()) {
            final ve2 ve2VarCompletableDeferred$default = xe2.CompletableDeferred$default(null, 1, null);
            final gz6 gz6Var = new gz6() { // from class: g17
                @Override // p000.gz6
                public final Object invoke(Object obj, Object obj2) {
                    return k17.asDeferred$lambda$5(ve2VarCompletableDeferred$default, obj, (Throwable) obj2);
                }
            };
            completionStage.handle(new BiFunction() { // from class: h17
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return gz6Var.invoke(obj, (Throwable) obj2);
                }
            });
            qj8.invokeOnCompletion$default(ve2VarCompletableDeferred$default, false, new sp1(completableFuture), 1, null);
            return ve2VarCompletableDeferred$default;
        }
        try {
            return xe2.CompletableDeferred(completableFuture.get());
        } catch (Throwable th) {
            th = th;
            ExecutionException executionException = th instanceof ExecutionException ? (ExecutionException) th : null;
            if (executionException != null && (cause = executionException.getCause()) != null) {
                th = cause;
            }
            ve2 ve2VarCompletableDeferred$default2 = xe2.CompletableDeferred$default(null, 1, null);
            ve2VarCompletableDeferred$default2.completeExceptionally(th);
            return ve2VarCompletableDeferred$default2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object asDeferred$lambda$5(ve2 ve2Var, Object obj, Throwable th) {
        boolean zCompleteExceptionally;
        Throwable cause;
        try {
            if (th == null) {
                zCompleteExceptionally = ve2Var.complete(obj);
            } else {
                CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th = cause;
                }
                zCompleteExceptionally = ve2Var.completeExceptionally(th);
            }
            return Boolean.valueOf(zCompleteExceptionally);
        } catch (Throwable th2) {
            q13.handleCoroutineException(a05.f2a, th2);
            return bth.f14751a;
        }
    }

    @gib
    public static final <T> Object await(@yfb CompletionStage<T> completionStage, @yfb zy2<? super T> zy2Var) throws Throwable {
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        fq1 fq1Var = new fq1(od8.intercepted(zy2Var), 1);
        fq1Var.initCancellability();
        bz2 bz2Var = new bz2(fq1Var);
        completionStage.handle(bz2Var);
        fq1Var.invokeOnCancellation(new C8163a(completableFuture, bz2Var));
        Object result = fq1Var.getResult();
        if (result == pd8.getCOROUTINE_SUSPENDED()) {
            jk3.probeCoroutineSuspended(zy2Var);
        }
        return result;
    }

    @yfb
    public static final <T> CompletableFuture<T> future(@yfb x13 x13Var, @yfb e13 e13Var, @yfb b23 b23Var, @yfb gz6<? super x13, ? super zy2<? super T>, ? extends Object> gz6Var) {
        if (b23Var.isLazy()) {
            throw new IllegalArgumentException((b23Var + " start is not supported").toString());
        }
        e13 e13VarNewCoroutineContext = j13.newCoroutineContext(x13Var, e13Var);
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        gg2 gg2Var = new gg2(e13VarNewCoroutineContext, completableFuture);
        completableFuture.handle((BiFunction) gg2Var);
        gg2Var.start(b23Var, gg2Var, gz6Var);
        return completableFuture;
    }

    public static /* synthetic */ CompletableFuture future$default(x13 x13Var, e13 e13Var, b23 b23Var, gz6 gz6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            e13Var = a05.f2a;
        }
        if ((i & 2) != 0) {
            b23Var = b23.f12441a;
        }
        return future(x13Var, e13Var, b23Var, gz6Var);
    }

    private static final void setupCancellation(jj8 jj8Var, CompletableFuture<?> completableFuture) {
        final C8164b c8164b = new C8164b(jj8Var);
        completableFuture.handle(new BiFunction() { // from class: j17
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return k17.setupCancellation$lambda$3(c8164b, obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bth setupCancellation$lambda$3(gz6 gz6Var, Object obj, Throwable th) {
        return (bth) gz6Var.invoke(obj, th);
    }

    @yfb
    public static final CompletableFuture<bth> asCompletableFuture(@yfb jj8 jj8Var) {
        final CompletableFuture<bth> completableFuture = new CompletableFuture<>();
        setupCancellation(jj8Var, completableFuture);
        jj8Var.invokeOnCompletion(new qy6() { // from class: i17
            @Override // p000.qy6
            public final Object invoke(Object obj) {
                return k17.asCompletableFuture$lambda$2(completableFuture, (Throwable) obj);
            }
        });
        return completableFuture;
    }
}
