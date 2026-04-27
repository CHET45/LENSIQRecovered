package p000;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
@qx4
@yg8
public final class q85 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<ja9<Void>> f73478a = new AtomicReference<>(w17.immediateVoidFuture());

    /* JADX INFO: renamed from: b */
    public C11351e f73479b = new C11351e(null);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: q85$a */
    public class C11347a<T> implements l90<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callable f73480a;

        public C11347a(final q85 this$0, final Callable val$callable) {
            this.f73480a = val$callable;
        }

        @Override // p000.l90
        public ja9<T> call() throws Exception {
            return w17.immediateFuture(this.f73480a.call());
        }

        public String toString() {
            return this.f73480a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: q85$b */
    public class C11348b<T> implements l90<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ExecutorC11350d f73481a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ l90 f73482b;

        public C11348b(final q85 this$0, final ExecutorC11350d val$taskExecutor, final l90 val$callable) {
            this.f73481a = val$taskExecutor;
            this.f73482b = val$callable;
        }

        @Override // p000.l90
        public ja9<T> call() throws Exception {
            return !this.f73481a.trySetStarted() ? w17.immediateCancelledFuture() : this.f73482b.call();
        }

        public String toString() {
            return this.f73482b.toString();
        }
    }

    /* JADX INFO: renamed from: q85$c */
    public enum EnumC11349c {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    /* JADX INFO: renamed from: q85$d */
    public static final class ExecutorC11350d extends AtomicReference<EnumC11349c> implements Executor, Runnable {

        /* JADX INFO: renamed from: a */
        @wx1
        public q85 f73487a;

        /* JADX INFO: renamed from: b */
        @wx1
        public Executor f73488b;

        /* JADX INFO: renamed from: c */
        @wx1
        public Runnable f73489c;

        /* JADX INFO: renamed from: d */
        @wx1
        public Thread f73490d;

        public /* synthetic */ ExecutorC11350d(Executor executor, q85 q85Var, C11347a c11347a) {
            this(executor, q85Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetCancelled() {
            return compareAndSet(EnumC11349c.NOT_RUN, EnumC11349c.CANCELLED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean trySetStarted() {
            return compareAndSet(EnumC11349c.NOT_RUN, EnumC11349c.STARTED);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable task) {
            if (get() == EnumC11349c.CANCELLED) {
                this.f73488b = null;
                this.f73487a = null;
                return;
            }
            this.f73490d = Thread.currentThread();
            try {
                q85 q85Var = this.f73487a;
                Objects.requireNonNull(q85Var);
                C11351e c11351e = q85Var.f73479b;
                if (c11351e.f73491a == this.f73490d) {
                    this.f73487a = null;
                    v7d.checkState(c11351e.f73492b == null);
                    c11351e.f73492b = task;
                    Executor executor = this.f73488b;
                    Objects.requireNonNull(executor);
                    c11351e.f73493c = executor;
                    this.f73488b = null;
                } else {
                    Executor executor2 = this.f73488b;
                    Objects.requireNonNull(executor2);
                    this.f73488b = null;
                    this.f73489c = task;
                    executor2.execute(this);
                }
                this.f73490d = null;
            } catch (Throwable th) {
                this.f73490d = null;
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executor;
            Thread threadCurrentThread = Thread.currentThread();
            Thread thread = null;
            byte b = 0;
            if (threadCurrentThread != this.f73490d) {
                Runnable runnable = this.f73489c;
                Objects.requireNonNull(runnable);
                this.f73489c = null;
                runnable.run();
                return;
            }
            C11351e c11351e = new C11351e(b == true ? 1 : 0);
            c11351e.f73491a = threadCurrentThread;
            q85 q85Var = this.f73487a;
            Objects.requireNonNull(q85Var);
            q85Var.f73479b = c11351e;
            this.f73487a = null;
            try {
                Runnable runnable2 = this.f73489c;
                Objects.requireNonNull(runnable2);
                this.f73489c = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = c11351e.f73492b;
                    if (runnable3 == null || (executor = c11351e.f73493c) == null) {
                        break;
                    }
                    c11351e.f73492b = null;
                    c11351e.f73493c = null;
                    executor.execute(runnable3);
                }
            } finally {
                c11351e.f73491a = null;
            }
        }

        private ExecutorC11350d(Executor delegate, q85 sequencer) {
            super(EnumC11349c.NOT_RUN);
            this.f73488b = delegate;
            this.f73487a = sequencer;
        }
    }

    /* JADX INFO: renamed from: q85$e */
    public static final class C11351e {

        /* JADX INFO: renamed from: a */
        @wx1
        public Thread f73491a;

        /* JADX INFO: renamed from: b */
        @wx1
        public Runnable f73492b;

        /* JADX INFO: renamed from: c */
        @wx1
        public Executor f73493c;

        private C11351e() {
        }

        public /* synthetic */ C11351e(C11347a c11347a) {
            this();
        }
    }

    private q85() {
    }

    public static q85 create() {
        return new q85();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$submitAsync$0(jjh jjhVar, y6f y6fVar, ja9 ja9Var, ja9 ja9Var2, ExecutorC11350d executorC11350d) {
        if (jjhVar.isDone()) {
            y6fVar.setFuture(ja9Var);
        } else if (ja9Var2.isCancelled() && executorC11350d.trySetCancelled()) {
            jjhVar.cancel(false);
        }
    }

    public <T> ja9<T> submit(Callable<T> callable, Executor executor) {
        v7d.checkNotNull(callable);
        v7d.checkNotNull(executor);
        return submitAsync(new C11347a(this, callable), executor);
    }

    public <T> ja9<T> submitAsync(l90<T> callable, Executor executor) {
        v7d.checkNotNull(callable);
        v7d.checkNotNull(executor);
        final ExecutorC11350d executorC11350d = new ExecutorC11350d(executor, this, null);
        C11348b c11348b = new C11348b(this, executorC11350d, callable);
        final y6f y6fVarCreate = y6f.create();
        final ja9<Void> andSet = this.f73478a.getAndSet(y6fVarCreate);
        final jjh jjhVarM14136p = jjh.m14136p(c11348b);
        andSet.addListener(jjhVarM14136p, executorC11350d);
        final ja9<T> ja9VarNonCancellationPropagating = w17.nonCancellationPropagating(jjhVarM14136p);
        Runnable runnable = new Runnable() { // from class: p85
            @Override // java.lang.Runnable
            public final void run() {
                q85.lambda$submitAsync$0(jjhVarM14136p, y6fVarCreate, andSet, ja9VarNonCancellationPropagating, executorC11350d);
            }
        };
        ja9VarNonCancellationPropagating.addListener(runnable, xya.directExecutor());
        jjhVarM14136p.addListener(runnable, xya.directExecutor());
        return ja9VarNonCancellationPropagating;
    }
}
