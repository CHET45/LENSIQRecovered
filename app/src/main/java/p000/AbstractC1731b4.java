package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import p000.g4f;

/* JADX INFO: renamed from: b4 */
/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public abstract class AbstractC1731b4 implements g4f {

    /* JADX INFO: renamed from: b */
    public static final Logger f12616b = Logger.getLogger(AbstractC1731b4.class.getName());

    /* JADX INFO: renamed from: a */
    public final AbstractC6698h4 f12617a = new g(this, null);

    /* JADX INFO: renamed from: b4$a */
    public class a extends g4f.AbstractC6129a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ScheduledExecutorService f12618a;

        public a(final AbstractC1731b4 this$0, final ScheduledExecutorService val$executor) {
            this.f12618a = val$executor;
        }

        @Override // p000.g4f.AbstractC6129a
        public void failed(g4f.EnumC6130b from, Throwable failure) {
            this.f12618a.shutdown();
        }

        @Override // p000.g4f.AbstractC6129a
        public void terminated(g4f.EnumC6130b from) {
            this.f12618a.shutdown();
        }
    }

    /* JADX INFO: renamed from: b4$b */
    public class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return xya.m25559c(AbstractC1731b4.this.m2898f(), runnable);
        }
    }

    /* JADX INFO: renamed from: b4$c */
    public interface c {
        void cancel(boolean mayInterruptIfRunning);

        boolean isCancelled();
    }

    /* JADX INFO: renamed from: b4$d */
    public static abstract class d extends f {

        /* JADX INFO: renamed from: b4$d$a */
        public final class a implements Callable<Void> {

            /* JADX INFO: renamed from: a */
            public final Runnable f12620a;

            /* JADX INFO: renamed from: b */
            public final ScheduledExecutorService f12621b;

            /* JADX INFO: renamed from: c */
            public final AbstractC6698h4 f12622c;

            /* JADX INFO: renamed from: d */
            public final ReentrantLock f12623d = new ReentrantLock();

            /* JADX INFO: renamed from: e */
            @wx1
            @uc7("lock")
            public c f12624e;

            public a(AbstractC6698h4 service, ScheduledExecutorService executor, Runnable runnable) {
                this.f12620a = runnable;
                this.f12621b = executor;
                this.f12622c = service;
            }

            @uc7("lock")
            private c initializeOrUpdateCancellationDelegate(b schedule) {
                c cVar = this.f12624e;
                if (cVar == null) {
                    c cVar2 = new c(this.f12623d, submitToExecutor(schedule));
                    this.f12624e = cVar2;
                    return cVar2;
                }
                if (!cVar.f12629b.isCancelled()) {
                    this.f12624e.f12629b = submitToExecutor(schedule);
                }
                return this.f12624e;
            }

            private ScheduledFuture<Void> submitToExecutor(b schedule) {
                return this.f12621b.schedule(this, schedule.f12626a, schedule.f12627b);
            }

            @op1
            public c reschedule() {
                Throwable th;
                c eVar;
                try {
                    b bVarM2901a = d.this.m2901a();
                    this.f12623d.lock();
                    try {
                        try {
                            eVar = initializeOrUpdateCancellationDelegate(bVarM2901a);
                            this.f12623d.unlock();
                            th = null;
                        } catch (Error | RuntimeException e) {
                            th = e;
                            eVar = new e(w17.immediateCancelledFuture());
                        }
                        if (th != null) {
                            this.f12622c.m12128e(th);
                        }
                        return eVar;
                    } finally {
                        this.f12623d.unlock();
                    }
                } catch (Throwable th2) {
                    uwc.m23618b(th2);
                    this.f12622c.m12128e(th2);
                    return new e(w17.immediateCancelledFuture());
                }
            }

            @Override // java.util.concurrent.Callable
            @wx1
            public Void call() throws Exception {
                this.f12620a.run();
                reschedule();
                return null;
            }
        }

        /* JADX INFO: renamed from: b4$d$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public final long f12626a;

            /* JADX INFO: renamed from: b */
            public final TimeUnit f12627b;

            public b(long delay, TimeUnit unit) {
                this.f12626a = delay;
                this.f12627b = (TimeUnit) v7d.checkNotNull(unit);
            }
        }

        /* JADX INFO: renamed from: b4$d$c */
        public static final class c implements c {

            /* JADX INFO: renamed from: a */
            public final ReentrantLock f12628a;

            /* JADX INFO: renamed from: b */
            @uc7("lock")
            public Future<Void> f12629b;

            public c(ReentrantLock lock, Future<Void> currentFuture) {
                this.f12628a = lock;
                this.f12629b = currentFuture;
            }

            @Override // p000.AbstractC1731b4.c
            public void cancel(boolean mayInterruptIfRunning) {
                this.f12628a.lock();
                try {
                    this.f12629b.cancel(mayInterruptIfRunning);
                } finally {
                    this.f12628a.unlock();
                }
            }

            @Override // p000.AbstractC1731b4.c
            public boolean isCancelled() {
                this.f12628a.lock();
                try {
                    return this.f12629b.isCancelled();
                } finally {
                    this.f12628a.unlock();
                }
            }
        }

        public d() {
            super(null);
        }

        /* JADX INFO: renamed from: a */
        public abstract b m2901a() throws Exception;

        @Override // p000.AbstractC1731b4.f
        public final c schedule(AbstractC6698h4 service, ScheduledExecutorService executor, Runnable runnable) {
            return new a(service, executor, runnable).reschedule();
        }
    }

    /* JADX INFO: renamed from: b4$e */
    public static final class e implements c {

        /* JADX INFO: renamed from: a */
        public final Future<?> f12630a;

        public e(Future<?> delegate) {
            this.f12630a = delegate;
        }

        @Override // p000.AbstractC1731b4.c
        public void cancel(boolean mayInterruptIfRunning) {
            this.f12630a.cancel(mayInterruptIfRunning);
        }

        @Override // p000.AbstractC1731b4.c
        public boolean isCancelled() {
            return this.f12630a.isCancelled();
        }
    }

    /* JADX INFO: renamed from: b4$f */
    public static abstract class f {

        /* JADX INFO: renamed from: b4$f$a */
        public class a extends f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f12631a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f12632b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ TimeUnit f12633c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(final long val$initialDelay, final long val$delay, final TimeUnit val$unit) {
                super(null);
                this.f12631a = val$initialDelay;
                this.f12632b = val$delay;
                this.f12633c = val$unit;
            }

            @Override // p000.AbstractC1731b4.f
            public c schedule(AbstractC6698h4 service, ScheduledExecutorService executor, Runnable task) {
                return new e(executor.scheduleWithFixedDelay(task, this.f12631a, this.f12632b, this.f12633c));
            }
        }

        /* JADX INFO: renamed from: b4$f$b */
        public class b extends f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long f12634a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f12635b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ TimeUnit f12636c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(final long val$initialDelay, final long val$period, final TimeUnit val$unit) {
                super(null);
                this.f12634a = val$initialDelay;
                this.f12635b = val$period;
                this.f12636c = val$unit;
            }

            @Override // p000.AbstractC1731b4.f
            public c schedule(AbstractC6698h4 service, ScheduledExecutorService executor, Runnable task) {
                return new e(executor.scheduleAtFixedRate(task, this.f12634a, this.f12635b, this.f12636c));
            }
        }

        public /* synthetic */ f(a aVar) {
            this();
        }

        public static f newFixedDelaySchedule(final long initialDelay, final long delay, final TimeUnit unit) {
            v7d.checkNotNull(unit);
            v7d.checkArgument(delay > 0, "delay must be > 0, found %s", delay);
            return new a(initialDelay, delay, unit);
        }

        public static f newFixedRateSchedule(final long initialDelay, final long period, final TimeUnit unit) {
            v7d.checkNotNull(unit);
            v7d.checkArgument(period > 0, "period must be > 0, found %s", period);
            return new b(initialDelay, period, unit);
        }

        public abstract c schedule(AbstractC6698h4 service, ScheduledExecutorService executor, Runnable runnable);

        private f() {
        }
    }

    @Override // p000.g4f
    public final void addListener(g4f.AbstractC6129a listener, Executor executor) {
        this.f12617a.addListener(listener, executor);
    }

    @Override // p000.g4f
    public final void awaitRunning() {
        this.f12617a.awaitRunning();
    }

    @Override // p000.g4f
    public final void awaitTerminated() {
        this.f12617a.awaitTerminated();
    }

    /* JADX INFO: renamed from: c */
    public ScheduledExecutorService m2895c() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new b());
        addListener(new a(this, scheduledExecutorServiceNewSingleThreadScheduledExecutor), xya.directExecutor());
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    /* JADX INFO: renamed from: d */
    public abstract void m2896d() throws Exception;

    /* JADX INFO: renamed from: e */
    public abstract f m2897e();

    /* JADX INFO: renamed from: f */
    public String m2898f() {
        return getClass().getSimpleName();
    }

    @Override // p000.g4f
    public final Throwable failureCause() {
        return this.f12617a.failureCause();
    }

    /* JADX INFO: renamed from: g */
    public void m2899g() throws Exception {
    }

    /* JADX INFO: renamed from: h */
    public void m2900h() throws Exception {
    }

    @Override // p000.g4f
    public final boolean isRunning() {
        return this.f12617a.isRunning();
    }

    @Override // p000.g4f
    @op1
    public final g4f startAsync() {
        this.f12617a.startAsync();
        return this;
    }

    @Override // p000.g4f
    public final g4f.EnumC6130b state() {
        return this.f12617a.state();
    }

    @Override // p000.g4f
    @op1
    public final g4f stopAsync() {
        this.f12617a.stopAsync();
        return this;
    }

    public String toString() {
        return m2898f() + " [" + state() + "]";
    }

    @Override // p000.g4f
    public final void awaitRunning(long timeout, TimeUnit unit) throws TimeoutException {
        this.f12617a.awaitRunning(timeout, unit);
    }

    @Override // p000.g4f
    public final void awaitTerminated(long timeout, TimeUnit unit) throws TimeoutException {
        this.f12617a.awaitTerminated(timeout, unit);
    }

    /* JADX INFO: renamed from: b4$g */
    public final class g extends AbstractC6698h4 {

        /* JADX INFO: renamed from: p */
        @wx1
        public volatile c f12637p;

        /* JADX INFO: renamed from: q */
        @wx1
        public volatile ScheduledExecutorService f12638q;

        /* JADX INFO: renamed from: r */
        public final ReentrantLock f12639r;

        /* JADX INFO: renamed from: s */
        public final Runnable f12640s;

        /* JADX INFO: renamed from: b4$g$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f12639r.lock();
                try {
                    c cVar = g.this.f12637p;
                    Objects.requireNonNull(cVar);
                    if (cVar.isCancelled()) {
                    } else {
                        AbstractC1731b4.this.m2896d();
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        private g() {
            this.f12639r = new ReentrantLock();
            this.f12640s = new a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String lambda$doStart$0() {
            return AbstractC1731b4.this.m2898f() + C2473f.f17566z + state();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doStart$1() {
            this.f12639r.lock();
            try {
                AbstractC1731b4.this.m2900h();
                Objects.requireNonNull(this.f12638q);
                this.f12637p = AbstractC1731b4.this.m2897e().schedule(AbstractC1731b4.this.f12617a, this.f12638q, this.f12640s);
                m12129f();
            } finally {
                try {
                } finally {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doStop$2() {
            try {
                this.f12639r.lock();
                try {
                    if (state() != g4f.EnumC6130b.STOPPING) {
                        return;
                    }
                    AbstractC1731b4.this.m2899g();
                    this.f12639r.unlock();
                    m12130g();
                } finally {
                    this.f12639r.unlock();
                }
            } catch (Throwable th) {
                uwc.m23618b(th);
                m12128e(th);
            }
        }

        @Override // p000.AbstractC6698h4
        /* JADX INFO: renamed from: c */
        public final void mo2911c() {
            this.f12638q = xya.m25563g(AbstractC1731b4.this.m2895c(), new lfg() { // from class: c4
                @Override // p000.lfg
                public final Object get() {
                    return this.f15740a.lambda$doStart$0();
                }
            });
            this.f12638q.execute(new Runnable() { // from class: d4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28378a.lambda$doStart$1();
                }
            });
        }

        @Override // p000.AbstractC6698h4
        /* JADX INFO: renamed from: d */
        public final void mo2912d() {
            Objects.requireNonNull(this.f12637p);
            Objects.requireNonNull(this.f12638q);
            this.f12637p.cancel(false);
            this.f12638q.execute(new Runnable() { // from class: e4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31727a.lambda$doStop$2();
                }
            });
        }

        @Override // p000.AbstractC6698h4
        public String toString() {
            return AbstractC1731b4.this.toString();
        }

        public /* synthetic */ g(AbstractC1731b4 abstractC1731b4, a aVar) {
            this();
        }
    }
}
