package p000;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p000.AbstractC9640n1;
import p000.kx7;
import p000.lic;
import p000.pw7;
import p000.v72;
import p000.w17;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@qx4
public final class w17 extends id7 {

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* JADX INFO: renamed from: w17$a */
    public class FutureC14343a<O> implements Future<O> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Future f93064a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ lz6 f93065b;

        public FutureC14343a(final Future val$input, final lz6 val$function) {
            this.f93064a = val$input;
            this.f93065b = val$function;
        }

        private O applyTransformation(I i) throws ExecutionException {
            try {
                return (O) this.f93065b.apply(i);
            } catch (Error | RuntimeException e) {
                throw new ExecutionException(e);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean mayInterruptIfRunning) {
            return this.f93064a.cancel(mayInterruptIfRunning);
        }

        @Override // java.util.concurrent.Future
        public O get() throws ExecutionException, InterruptedException {
            return applyTransformation(this.f93064a.get());
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f93064a.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f93064a.isDone();
        }

        @Override // java.util.concurrent.Future
        public O get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
            return applyTransformation(this.f93064a.get(timeout, unit));
        }
    }

    /* JADX INFO: renamed from: w17$b */
    public static final class RunnableC14344b<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Future<V> f93066a;

        /* JADX INFO: renamed from: b */
        public final c17<? super V> f93067b;

        public RunnableC14344b(Future<V> future, c17<? super V> callback) {
            this.f93066a = future;
            this.f93067b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable thTryInternalFastPathGetFailure;
            Future<V> future = this.f93066a;
            if ((future instanceof sa8) && (thTryInternalFastPathGetFailure = ta8.tryInternalFastPathGetFailure((sa8) future)) != null) {
                this.f93067b.onFailure(thTryInternalFastPathGetFailure);
                return;
            }
            try {
                this.f93067b.onSuccess(w17.getDone(this.f93066a));
            } catch (Error e) {
                e = e;
                this.f93067b.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f93067b.onFailure(e);
            } catch (ExecutionException e3) {
                this.f93067b.onFailure(e3.getCause());
            }
        }

        public String toString() {
            return yya.toStringHelper(this).addValue(this.f93067b).toString();
        }
    }

    /* JADX INFO: renamed from: w17$c */
    @gd7
    public static final class C14345c<V> {

        /* JADX INFO: renamed from: a */
        public final boolean f93068a;

        /* JADX INFO: renamed from: b */
        public final kx7<ja9<? extends V>> f93069b;

        /* JADX INFO: renamed from: w17$c$a */
        public class a implements Callable<Void> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Runnable f93070a;

            public a(final C14345c this$0, final Runnable val$combiner) {
                this.f93070a = val$combiner;
            }

            @Override // java.util.concurrent.Callable
            @wx1
            public Void call() throws Exception {
                this.f93070a.run();
                return null;
            }
        }

        public /* synthetic */ C14345c(boolean z, kx7 kx7Var, FutureC14343a futureC14343a) {
            this(z, kx7Var);
        }

        public <C> ja9<C> call(Callable<C> combiner, Executor executor) {
            return new kb2(this.f93069b, this.f93068a, executor, combiner);
        }

        public <C> ja9<C> callAsync(l90<C> combiner, Executor executor) {
            return new kb2(this.f93069b, this.f93068a, executor, combiner);
        }

        public ja9<?> run(final Runnable combiner, Executor executor) {
            return call(new a(this, combiner), executor);
        }

        private C14345c(boolean allMustSucceed, kx7<ja9<? extends V>> futures) {
            this.f93068a = allMustSucceed;
            this.f93069b = futures;
        }
    }

    /* JADX INFO: renamed from: w17$d */
    public static final class C14346d<T> extends AbstractC9640n1<T> {

        /* JADX INFO: renamed from: F */
        @wx1
        public C14347e<T> f93071F;

        public /* synthetic */ C14346d(C14347e c14347e, FutureC14343a futureC14343a) {
            this(c14347e);
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        public boolean cancel(boolean interruptIfRunning) {
            C14347e<T> c14347e = this.f93071F;
            if (!super.cancel(interruptIfRunning)) {
                return false;
            }
            Objects.requireNonNull(c14347e);
            c14347e.recordOutputCancellation(interruptIfRunning);
            return true;
        }

        @Override // p000.AbstractC9640n1
        /* JADX INFO: renamed from: k */
        public void mo2822k() {
            this.f93071F = null;
        }

        @Override // p000.AbstractC9640n1
        @wx1
        /* JADX INFO: renamed from: n */
        public String mo2823n() {
            C14347e<T> c14347e = this.f93071F;
            if (c14347e == null) {
                return null;
            }
            return "inputCount=[" + c14347e.f93075d.length + "], remaining=[" + c14347e.f93074c.get() + "]";
        }

        private C14346d(C14347e<T> state) {
            this.f93071F = state;
        }
    }

    /* JADX INFO: renamed from: w17$e */
    public static final class C14347e<T> {

        /* JADX INFO: renamed from: a */
        public boolean f93072a;

        /* JADX INFO: renamed from: b */
        public boolean f93073b;

        /* JADX INFO: renamed from: c */
        public final AtomicInteger f93074c;

        /* JADX INFO: renamed from: d */
        public final ja9<? extends T>[] f93075d;

        /* JADX INFO: renamed from: e */
        public volatile int f93076e;

        public /* synthetic */ C14347e(ja9[] ja9VarArr, FutureC14343a futureC14343a) {
            this(ja9VarArr);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m24318d(C14347e c14347e, kx7 kx7Var, int i) {
            c14347e.recordInputCompletion(kx7Var, i);
        }

        private void recordCompletion() {
            if (this.f93074c.decrementAndGet() == 0 && this.f93072a) {
                for (ja9<? extends T> ja9Var : this.f93075d) {
                    if (ja9Var != null) {
                        ja9Var.cancel(this.f93073b);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void recordInputCompletion(kx7<AbstractC9640n1<T>> delegates, int inputFutureIndex) {
            ja9<? extends T> ja9Var = this.f93075d[inputFutureIndex];
            Objects.requireNonNull(ja9Var);
            ja9<? extends T> ja9Var2 = ja9Var;
            this.f93075d[inputFutureIndex] = null;
            for (int i = this.f93076e; i < delegates.size(); i++) {
                if (delegates.get(i).setFuture(ja9Var2)) {
                    recordCompletion();
                    this.f93076e = i + 1;
                    return;
                }
            }
            this.f93076e = delegates.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void recordOutputCancellation(boolean interruptIfRunning) {
            this.f93072a = true;
            if (!interruptIfRunning) {
                this.f93073b = false;
            }
            recordCompletion();
        }

        private C14347e(ja9<? extends T>[] inputFutures) {
            this.f93072a = false;
            this.f93073b = true;
            this.f93076e = 0;
            this.f93075d = inputFutures;
            this.f93074c = new AtomicInteger(inputFutures.length);
        }
    }

    /* JADX INFO: renamed from: w17$f */
    public static final class RunnableC14348f<V> extends AbstractC9640n1.j<V> implements Runnable {

        /* JADX INFO: renamed from: F */
        @wx1
        public ja9<V> f93077F;

        public RunnableC14348f(final ja9<V> delegate) {
            this.f93077F = delegate;
        }

        @Override // p000.AbstractC9640n1
        /* JADX INFO: renamed from: k */
        public void mo2822k() {
            this.f93077F = null;
        }

        @Override // p000.AbstractC9640n1
        @wx1
        /* JADX INFO: renamed from: n */
        public String mo2823n() {
            ja9<V> ja9Var = this.f93077F;
            if (ja9Var == null) {
                return null;
            }
            return "delegate=[" + ja9Var + "]";
        }

        @Override // java.lang.Runnable
        public void run() {
            ja9<V> ja9Var = this.f93077F;
            if (ja9Var != null) {
                setFuture(ja9Var);
            }
        }
    }

    private w17() {
    }

    public static <V> void addCallback(final ja9<V> future, final c17<? super V> callback, Executor executor) {
        v7d.checkNotNull(callback);
        future.addListener(new RunnableC14344b(future, callback), executor);
    }

    @SafeVarargs
    public static <V> ja9<List<V>> allAsList(ja9<? extends V>... futures) {
        return new v72.C13896a(kx7.copyOf(futures), true);
    }

    @lic.InterfaceC8830a("AVAILABLE but requires exceptionType to be Throwable.class")
    @yg8
    public static <V, X extends Throwable> ja9<V> catching(ja9<? extends V> input, Class<X> exceptionType, lz6<? super X, ? extends V> fallback, Executor executor) {
        return AbstractRunnableC8150k0.m14414q(input, exceptionType, fallback, executor);
    }

    @lic.InterfaceC8830a("AVAILABLE but requires exceptionType to be Throwable.class")
    @yg8
    public static <V, X extends Throwable> ja9<V> catchingAsync(ja9<? extends V> input, Class<X> exceptionType, v90<? super X, ? extends V> fallback, Executor executor) {
        return AbstractRunnableC8150k0.m14413p(input, exceptionType, fallback, executor);
    }

    @jd7
    @yg8
    @op1
    @agc
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
        return (V) a27.m55f(future, cls);
    }

    @op1
    @agc
    public static <V> V getDone(Future<V> future) throws ExecutionException {
        v7d.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) vsh.getUninterruptibly(future);
    }

    @op1
    @agc
    public static <V> V getUnchecked(Future<V> future) {
        v7d.checkNotNull(future);
        try {
            return (V) vsh.getUninterruptibly(future);
        } catch (ExecutionException e) {
            wrapAndThrowUnchecked(e.getCause());
            throw new AssertionError();
        }
    }

    private static <T> ja9<? extends T>[] gwtCompatibleToArray(Iterable<? extends ja9<? extends T>> futures) {
        return (ja9[]) (futures instanceof Collection ? (Collection) futures : kx7.copyOf(futures)).toArray(new ja9[0]);
    }

    public static <V> ja9<V> immediateCancelledFuture() {
        pw7.C11147a<Object> c11147a = pw7.C11147a.f72265F;
        return c11147a != null ? c11147a : new pw7.C11147a();
    }

    public static <V> ja9<V> immediateFailedFuture(Throwable throwable) {
        v7d.checkNotNull(throwable);
        return new pw7.C11148b(throwable);
    }

    public static <V> ja9<V> immediateFuture(@agc V v) {
        return v == null ? (ja9<V>) pw7.f72262b : new pw7(v);
    }

    public static ja9<Void> immediateVoidFuture() {
        return pw7.f72262b;
    }

    public static <T> kx7<ja9<T>> inCompletionOrder(Iterable<? extends ja9<? extends T>> futures) {
        ja9[] ja9VarArrGwtCompatibleToArray = gwtCompatibleToArray(futures);
        FutureC14343a futureC14343a = null;
        final C14347e c14347e = new C14347e(ja9VarArrGwtCompatibleToArray, futureC14343a);
        kx7.C8541a c8541aBuilderWithExpectedSize = kx7.builderWithExpectedSize(ja9VarArrGwtCompatibleToArray.length);
        for (int i = 0; i < ja9VarArrGwtCompatibleToArray.length; i++) {
            c8541aBuilderWithExpectedSize.add(new C14346d(c14347e, futureC14343a));
        }
        final kx7<ja9<T>> kx7VarBuild = c8541aBuilderWithExpectedSize.build();
        for (final int i2 = 0; i2 < ja9VarArrGwtCompatibleToArray.length; i2++) {
            ja9VarArrGwtCompatibleToArray[i2].addListener(new Runnable() { // from class: u17
                @Override // java.lang.Runnable
                public final void run() {
                    w17.C14347e.m24318d(c14347e, kx7VarBuild, i2);
                }
            }, xya.directExecutor());
        }
        return kx7VarBuild;
    }

    @jd7
    @yg8
    public static <I, O> Future<O> lazyTransform(final Future<I> input, final lz6<? super I, ? extends O> function) {
        v7d.checkNotNull(input);
        v7d.checkNotNull(function);
        return new FutureC14343a(input, function);
    }

    public static <V> ja9<V> nonCancellationPropagating(ja9<V> future) {
        if (future.isDone()) {
            return future;
        }
        RunnableC14348f runnableC14348f = new RunnableC14348f(future);
        future.addListener(runnableC14348f, xya.directExecutor());
        return runnableC14348f;
    }

    @jd7
    @yg8
    public static <O> ja9<O> scheduleAsync(l90<O> callable, long delay, TimeUnit timeUnit, ScheduledExecutorService executorService) {
        jjh jjhVarM14136p = jjh.m14136p(callable);
        final ScheduledFuture<?> scheduledFutureSchedule = executorService.schedule(jjhVarM14136p, delay, timeUnit);
        jjhVarM14136p.addListener(new Runnable() { // from class: v17
            @Override // java.lang.Runnable
            public final void run() {
                scheduledFutureSchedule.cancel(false);
            }
        }, xya.directExecutor());
        return jjhVarM14136p;
    }

    public static <O> ja9<O> submit(Callable<O> callable, Executor executor) {
        jjh jjhVarM14138r = jjh.m14138r(callable);
        executor.execute(jjhVarM14138r);
        return jjhVarM14138r;
    }

    public static <O> ja9<O> submitAsync(l90<O> callable, Executor executor) {
        jjh jjhVarM14136p = jjh.m14136p(callable);
        executor.execute(jjhVarM14136p);
        return jjhVarM14136p;
    }

    @SafeVarargs
    public static <V> ja9<List<V>> successfulAsList(ja9<? extends V>... futures) {
        return new v72.C13896a(kx7.copyOf(futures), false);
    }

    public static <I, O> ja9<O> transform(ja9<I> input, lz6<? super I, ? extends O> function, Executor executor) {
        return AbstractRunnableC5117e5.m9680q(input, function, executor);
    }

    public static <I, O> ja9<O> transformAsync(ja9<I> input, v90<? super I, ? extends O> function, Executor executor) {
        return AbstractRunnableC5117e5.m9679p(input, function, executor);
    }

    @SafeVarargs
    public static <V> C14345c<V> whenAllComplete(ja9<? extends V>... futures) {
        return new C14345c<>(false, kx7.copyOf(futures), null);
    }

    @SafeVarargs
    public static <V> C14345c<V> whenAllSucceed(ja9<? extends V>... futures) {
        return new C14345c<>(true, kx7.copyOf(futures), null);
    }

    @jd7
    @yg8
    public static <V> ja9<V> withTimeout(ja9<V> delegate, long time, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
        return delegate.isDone() ? delegate : b2h.m2821s(delegate, time, unit, scheduledExecutor);
    }

    private static void wrapAndThrowUnchecked(Throwable cause) {
        if (!(cause instanceof Error)) {
            throw new orh(cause);
        }
        throw new k85((Error) cause);
    }

    @jd7
    @yg8
    @op1
    @agc
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
        return (V) a27.m56g(future, cls, j, timeUnit);
    }

    public static <V> ja9<List<V>> successfulAsList(Iterable<? extends ja9<? extends V>> futures) {
        return new v72.C13896a(kx7.copyOf(futures), false);
    }

    public static <V> C14345c<V> whenAllComplete(Iterable<? extends ja9<? extends V>> futures) {
        return new C14345c<>(false, kx7.copyOf(futures), null);
    }

    public static <V> C14345c<V> whenAllSucceed(Iterable<? extends ja9<? extends V>> futures) {
        return new C14345c<>(true, kx7.copyOf(futures), null);
    }

    public static <V> ja9<List<V>> allAsList(Iterable<? extends ja9<? extends V>> futures) {
        return new v72.C13896a(kx7.copyOf(futures), true);
    }

    public static ja9<Void> submit(Runnable runnable, Executor executor) {
        jjh jjhVarM14137q = jjh.m14137q(runnable, null);
        executor.execute(jjhVarM14137q);
        return jjhVarM14137q;
    }
}
