package p000;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class axa<Params, Progress, Result> {

    /* JADX INFO: renamed from: C */
    public static final int f12111C = 128;

    /* JADX INFO: renamed from: F */
    public static final int f12112F = 1;

    /* JADX INFO: renamed from: H */
    public static final ThreadFactory f12113H;

    /* JADX INFO: renamed from: L */
    public static final BlockingQueue<Runnable> f12114L;

    /* JADX INFO: renamed from: M */
    public static final Executor f12115M;

    /* JADX INFO: renamed from: N */
    public static final int f12116N = 1;

    /* JADX INFO: renamed from: Q */
    public static final int f12117Q = 2;

    /* JADX INFO: renamed from: X */
    public static HandlerC1643f f12118X = null;

    /* JADX INFO: renamed from: Y */
    public static volatile Executor f12119Y = null;

    /* JADX INFO: renamed from: f */
    public static final String f12120f = "AsyncTask";

    /* JADX INFO: renamed from: m */
    public static final int f12121m = 5;

    /* JADX INFO: renamed from: a */
    public final AbstractCallableC1645h<Params, Result> f12122a;

    /* JADX INFO: renamed from: b */
    public final FutureTask<Result> f12123b;

    /* JADX INFO: renamed from: c */
    public volatile EnumC1644g f12124c = EnumC1644g.PENDING;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f12125d = new AtomicBoolean();

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f12126e = new AtomicBoolean();

    /* JADX INFO: renamed from: axa$a */
    public static class ThreadFactoryC1638a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f12127a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f12127a.getAndIncrement());
        }
    }

    /* JADX INFO: renamed from: axa$b */
    public class C1639b extends AbstractCallableC1645h<Params, Result> {
        public C1639b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            axa.this.f12126e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) axa.this.mo2724a(this.f12137a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: axa$c */
    public class C1640c extends FutureTask<Result> {
        public C1640c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                axa.this.m2732i(get());
            } catch (InterruptedException e) {
                Log.w(axa.f12120f, e);
            } catch (CancellationException unused) {
                axa.this.m2732i(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: axa$d */
    public static /* synthetic */ class C1641d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12130a;

        static {
            int[] iArr = new int[EnumC1644g.values().length];
            f12130a = iArr;
            try {
                iArr[EnumC1644g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12130a[EnumC1644g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: axa$e */
    public static class C1642e<Data> {

        /* JADX INFO: renamed from: a */
        public final axa f12131a;

        /* JADX INFO: renamed from: b */
        public final Data[] f12132b;

        public C1642e(axa axaVar, Data... dataArr) {
            this.f12131a = axaVar;
            this.f12132b = dataArr;
        }
    }

    /* JADX INFO: renamed from: axa$f */
    public static class HandlerC1643f extends Handler {
        public HandlerC1643f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1642e c1642e = (C1642e) message.obj;
            int i = message.what;
            if (i == 1) {
                c1642e.f12131a.m2725b(c1642e.f12132b[0]);
            } else {
                if (i != 2) {
                    return;
                }
                c1642e.f12131a.m2730g(c1642e.f12132b);
            }
        }
    }

    /* JADX INFO: renamed from: axa$g */
    public enum EnumC1644g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* JADX INFO: renamed from: axa$h */
    public static abstract class AbstractCallableC1645h<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a */
        public Params[] f12137a;
    }

    static {
        ThreadFactoryC1638a threadFactoryC1638a = new ThreadFactoryC1638a();
        f12113H = threadFactoryC1638a;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f12114L = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactoryC1638a);
        f12115M = threadPoolExecutor;
        f12119Y = threadPoolExecutor;
    }

    public axa() {
        C1639b c1639b = new C1639b();
        this.f12122a = c1639b;
        this.f12123b = new C1640c(c1639b);
    }

    private static Handler getHandler() {
        HandlerC1643f handlerC1643f;
        synchronized (axa.class) {
            try {
                if (f12118X == null) {
                    f12118X = new HandlerC1643f();
                }
                handlerC1643f = f12118X;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC1643f;
    }

    @p7e({p7e.EnumC10826a.f69935b})
    public static void setDefaultExecutor(Executor executor) {
        f12119Y = executor;
    }

    /* JADX INFO: renamed from: a */
    public abstract Result mo2724a(Params... paramsArr);

    /* JADX INFO: renamed from: b */
    public void m2725b(Result result) {
        if (isCancelled()) {
            mo2727d(result);
        } else {
            mo2728e(result);
        }
        this.f12124c = EnumC1644g.FINISHED;
    }

    /* JADX INFO: renamed from: c */
    public void m2726c() {
    }

    public final boolean cancel(boolean z) {
        this.f12125d.set(true);
        return this.f12123b.cancel(z);
    }

    /* JADX INFO: renamed from: d */
    public void mo2727d(Result result) {
        m2726c();
    }

    /* JADX INFO: renamed from: e */
    public void mo2728e(Result result) {
    }

    public final axa<Params, Progress, Result> execute(Params... paramsArr) {
        return executeOnExecutor(f12119Y, paramsArr);
    }

    public final axa<Params, Progress, Result> executeOnExecutor(Executor executor, Params... paramsArr) {
        if (this.f12124c == EnumC1644g.PENDING) {
            this.f12124c = EnumC1644g.RUNNING;
            m2729f();
            this.f12122a.f12137a = paramsArr;
            executor.execute(this.f12123b);
            return this;
        }
        int i = C1641d.f12130a[this.f12124c.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    /* JADX INFO: renamed from: f */
    public void m2729f() {
    }

    /* JADX INFO: renamed from: g */
    public void m2730g(Progress... progressArr) {
    }

    public final Result get() throws ExecutionException, InterruptedException {
        return this.f12123b.get();
    }

    public final EnumC1644g getStatus() {
        return this.f12124c;
    }

    /* JADX INFO: renamed from: h */
    public Result m2731h(Result result) {
        getHandler().obtainMessage(1, new C1642e(this, result)).sendToTarget();
        return result;
    }

    /* JADX INFO: renamed from: i */
    public void m2732i(Result result) {
        if (this.f12126e.get()) {
            return;
        }
        m2731h(result);
    }

    public final boolean isCancelled() {
        return this.f12125d.get();
    }

    /* JADX INFO: renamed from: j */
    public final void m2733j(Progress... progressArr) {
        if (isCancelled()) {
            return;
        }
        getHandler().obtainMessage(2, new C1642e(this, progressArr)).sendToTarget();
    }

    public static void execute(Runnable runnable) {
        f12119Y.execute(runnable);
    }

    public final Result get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f12123b.get(j, timeUnit);
    }
}
