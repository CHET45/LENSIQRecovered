package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class vua {

    /* JADX INFO: renamed from: a */
    public final Object f92275a;

    /* JADX INFO: renamed from: b */
    public final bde f92276b;

    /* JADX INFO: renamed from: c */
    public final j74 f92277c;

    /* JADX INFO: renamed from: d */
    public yog f92278d;

    /* JADX INFO: renamed from: vua$a */
    public class RunnableC14263a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ long f92279a;

        /* JADX INFO: renamed from: vua$a$a */
        public class a implements Callable<Object> {
            public a() {
            }

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                vua.this.m24203b();
                return null;
            }
        }

        public RunnableC14263a(long j) {
            this.f92279a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Future futureSubmit = executorServiceNewSingleThreadExecutor.submit(new a());
            executorServiceNewSingleThreadExecutor.shutdown();
            try {
                long j = this.f92279a;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!executorServiceNewSingleThreadExecutor.awaitTermination(j, timeUnit)) {
                    executorServiceNewSingleThreadExecutor.shutdownNow();
                }
                futureSubmit.get(0L, timeUnit);
            } catch (TimeoutException unused) {
                vua.this.m24202a(new qpg(this.f92279a, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
                vua.this.m24202a(e);
            }
        }
    }

    /* JADX INFO: renamed from: vua$b */
    public class RunnableC14264b implements Runnable {
        public RunnableC14264b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            vua.this.m24203b();
        }
    }

    public vua(Object obj, yog yogVar, bde bdeVar, j74 j74Var) {
        this.f92275a = obj;
        this.f92276b = bdeVar;
        this.f92277c = j74Var;
        this.f92278d = yogVar;
    }

    private void runAfters() {
        Iterator<Method> it = this.f92278d.m26262b().iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(this.f92275a, null);
            } catch (InvocationTargetException e) {
                m24202a(e.getTargetException());
            } catch (Throwable th) {
                m24202a(th);
            }
        }
    }

    private void runBefores() throws cp5 {
        try {
            try {
                Iterator<Method> it = this.f92278d.m26263c().iterator();
                while (it.hasNext()) {
                    it.next().invoke(this.f92275a, null);
                }
            } catch (g90 unused) {
                throw new cp5();
            } catch (Throwable th) {
                m24202a(th);
                throw new cp5();
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

    private void runWithTimeout(long j) {
        runBeforesThenTestThenAfters(new RunnableC14263a(j));
    }

    /* JADX INFO: renamed from: a */
    public void m24202a(Throwable th) {
        this.f92276b.fireTestFailure(new fp5(this.f92277c, th));
    }

    /* JADX INFO: renamed from: b */
    public void m24203b() {
        try {
            this.f92278d.invoke(this.f92275a);
            if (this.f92278d.m26261a()) {
                m24202a(new AssertionError("Expected exception: " + this.f92278d.m26264d().getName()));
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof g90) {
                return;
            }
            if (!this.f92278d.m26261a()) {
                m24202a(targetException);
                return;
            }
            if (this.f92278d.m26265e(targetException)) {
                m24202a(new Exception("Unexpected exception, expected<" + this.f92278d.m26264d().getName() + "> but was<" + targetException.getClass().getName() + ">", targetException));
            }
        } catch (Throwable th) {
            m24202a(th);
        }
    }

    public void run() {
        if (this.f92278d.isIgnored()) {
            this.f92276b.fireTestIgnored(this.f92277c);
            return;
        }
        this.f92276b.fireTestStarted(this.f92277c);
        try {
            long timeout = this.f92278d.getTimeout();
            if (timeout > 0) {
                runWithTimeout(timeout);
            } else {
                runTest();
            }
            this.f92276b.fireTestFinished(this.f92277c);
        } catch (Throwable th) {
            this.f92276b.fireTestFinished(this.f92277c);
            throw th;
        }
    }

    public void runBeforesThenTestThenAfters(Runnable runnable) {
        try {
            try {
                runBefores();
                runnable.run();
            } catch (cp5 unused) {
            } catch (Exception unused2) {
                throw new RuntimeException("test should never throw an exception to this level");
            }
        } finally {
            runAfters();
        }
    }

    public void runTest() {
        runBeforesThenTestThenAfters(new RunnableC14264b());
    }
}
