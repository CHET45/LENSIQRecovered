package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.tqc;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC6019h
public class fx2 {

    /* JADX INFO: renamed from: e */
    public static final int f37908e = 1000;

    /* JADX INFO: renamed from: a */
    public final C6016e f37910a;

    /* JADX INFO: renamed from: b */
    public final tqc.InterfaceC13168d<C6022k<?>, Object> f37911b;

    /* JADX INFO: renamed from: c */
    public final int f37912c;

    /* JADX INFO: renamed from: d */
    public static final Logger f37907d = Logger.getLogger(fx2.class.getName());

    /* JADX INFO: renamed from: f */
    public static final fx2 f37909f = new fx2();

    /* JADX INFO: renamed from: fx2$a */
    public class RunnableC6012a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f37913a;

        public RunnableC6012a(Runnable runnable) {
            this.f37913a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            fx2 fx2VarAttach = fx2.this.attach();
            try {
                this.f37913a.run();
            } finally {
                fx2.this.detach(fx2VarAttach);
            }
        }
    }

    /* JADX INFO: renamed from: fx2$b */
    public final class ExecutorC6013b implements Executor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Executor f37915a;

        public ExecutorC6013b(Executor executor) {
            this.f37915a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f37915a.execute(fx2.current().wrap(runnable));
        }
    }

    /* JADX INFO: renamed from: fx2$c */
    public final class ExecutorC6014c implements Executor {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Executor f37916a;

        public ExecutorC6014c(Executor executor) {
            this.f37916a = executor;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f37916a.execute(fx2.this.wrap(runnable));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [C] */
    /* JADX INFO: renamed from: fx2$d */
    public class CallableC6015d<C> implements Callable<C> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callable f37918a;

        public CallableC6015d(Callable callable) {
            this.f37918a = callable;
        }

        @Override // java.util.concurrent.Callable
        public C call() throws Exception {
            fx2 fx2VarAttach = fx2.this.attach();
            try {
                return (C) this.f37918a.call();
            } finally {
                fx2.this.detach(fx2VarAttach);
            }
        }
    }

    /* JADX INFO: renamed from: fx2$e */
    public static final class C6016e extends fx2 implements Closeable {

        /* JADX INFO: renamed from: C */
        public final fx2 f37920C;

        /* JADX INFO: renamed from: F */
        public ArrayList<RunnableC6021j> f37921F;

        /* JADX INFO: renamed from: H */
        public InterfaceC6018g f37922H;

        /* JADX INFO: renamed from: L */
        public Throwable f37923L;

        /* JADX INFO: renamed from: M */
        public ScheduledFuture<?> f37924M;

        /* JADX INFO: renamed from: N */
        public boolean f37925N;

        /* JADX INFO: renamed from: m */
        public final sj3 f37926m;

        /* JADX INFO: renamed from: fx2$e$a */
        public class a implements InterfaceC6018g {
            public a() {
            }

            @Override // p000.fx2.InterfaceC6018g
            public void cancelled(fx2 fx2Var) {
                C6016e.this.cancel(fx2Var.cancellationCause());
            }
        }

        /* JADX INFO: renamed from: fx2$e$b */
        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C6016e.this.cancel(new TimeoutException("context timed out"));
                } catch (Throwable th) {
                    fx2.f37907d.log(Level.SEVERE, "Cancel threw an exception, which should not happen", th);
                }
            }
        }

        public /* synthetic */ C6016e(fx2 fx2Var, RunnableC6012a runnableC6012a) {
            this(fx2Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addListenerInternal(RunnableC6021j runnableC6021j) {
            synchronized (this) {
                try {
                    if (isCancelled()) {
                        runnableC6021j.m11216b();
                    } else {
                        ArrayList<RunnableC6021j> arrayList = this.f37921F;
                        if (arrayList == null) {
                            ArrayList<RunnableC6021j> arrayList2 = new ArrayList<>();
                            this.f37921F = arrayList2;
                            arrayList2.add(runnableC6021j);
                            if (this.f37910a != null) {
                                a aVar = new a();
                                this.f37922H = aVar;
                                this.f37910a.addListenerInternal(new RunnableC6021j(EnumC6020i.INSTANCE, aVar, this));
                            }
                        } else {
                            arrayList.add(runnableC6021j);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private void notifyAndClearListeners() {
            synchronized (this) {
                try {
                    ArrayList<RunnableC6021j> arrayList = this.f37921F;
                    if (arrayList == null) {
                        return;
                    }
                    InterfaceC6018g interfaceC6018g = this.f37922H;
                    this.f37922H = null;
                    this.f37921F = null;
                    for (RunnableC6021j runnableC6021j : arrayList) {
                        if (runnableC6021j.f37933c == this) {
                            runnableC6021j.m11216b();
                        }
                    }
                    for (RunnableC6021j runnableC6021j2 : arrayList) {
                        if (runnableC6021j2.f37933c != this) {
                            runnableC6021j2.m11216b();
                        }
                    }
                    C6016e c6016e = this.f37910a;
                    if (c6016e != null) {
                        c6016e.removeListener(interfaceC6018g);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeListenerInternal(InterfaceC6018g interfaceC6018g, fx2 fx2Var) {
            synchronized (this) {
                try {
                    ArrayList<RunnableC6021j> arrayList = this.f37921F;
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            RunnableC6021j runnableC6021j = this.f37921F.get(size);
                            if (runnableC6021j.f37932b == interfaceC6018g && runnableC6021j.f37933c == fx2Var) {
                                this.f37921F.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (this.f37921F.isEmpty()) {
                            C6016e c6016e = this.f37910a;
                            if (c6016e != null) {
                                c6016e.removeListener(this.f37922H);
                            }
                            this.f37922H = null;
                            this.f37921F = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpDeadlineCancellation(sj3 sj3Var, ScheduledExecutorService scheduledExecutorService) {
            if (sj3Var.isExpired()) {
                cancel(new TimeoutException("context timed out"));
            } else {
                synchronized (this) {
                    this.f37924M = sj3Var.runOnExpiration(new b(), scheduledExecutorService);
                }
            }
        }

        @Override // p000.fx2
        public void addListener(InterfaceC6018g interfaceC6018g, Executor executor) {
            fx2.m11209b(interfaceC6018g, "cancellationListener");
            fx2.m11209b(executor, "executor");
            addListenerInternal(new RunnableC6021j(executor, interfaceC6018g, this));
        }

        @Override // p000.fx2
        public fx2 attach() {
            return this.f37920C.attach();
        }

        @Override // p000.fx2
        /* JADX INFO: renamed from: c */
        public int mo11211c() {
            int size;
            synchronized (this) {
                ArrayList<RunnableC6021j> arrayList = this.f37921F;
                size = arrayList == null ? 0 : arrayList.size();
            }
            return size;
        }

        @InterfaceC6017f
        public boolean cancel(Throwable th) {
            ScheduledFuture<?> scheduledFuture;
            boolean z;
            synchronized (this) {
                try {
                    scheduledFuture = null;
                    if (this.f37925N) {
                        z = false;
                    } else {
                        z = true;
                        this.f37925N = true;
                        ScheduledFuture<?> scheduledFuture2 = this.f37924M;
                        if (scheduledFuture2 != null) {
                            this.f37924M = null;
                            scheduledFuture = scheduledFuture2;
                        }
                        this.f37923L = th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (z) {
                notifyAndClearListeners();
            }
            return z;
        }

        @Override // p000.fx2
        public Throwable cancellationCause() {
            if (isCancelled()) {
                return this.f37923L;
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            cancel(null);
        }

        @Override // p000.fx2
        public void detach(fx2 fx2Var) {
            this.f37920C.detach(fx2Var);
        }

        public void detachAndCancel(fx2 fx2Var, Throwable th) {
            try {
                detach(fx2Var);
            } finally {
                cancel(th);
            }
        }

        @Override // p000.fx2
        public sj3 getDeadline() {
            return this.f37926m;
        }

        @Override // p000.fx2
        public boolean isCancelled() {
            synchronized (this) {
                try {
                    if (this.f37925N) {
                        return true;
                    }
                    if (!super.isCancelled()) {
                        return false;
                    }
                    cancel(super.cancellationCause());
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.fx2
        @Deprecated
        public boolean isCurrent() {
            return this.f37920C.isCurrent();
        }

        @Override // p000.fx2
        public void removeListener(InterfaceC6018g interfaceC6018g) {
            removeListenerInternal(interfaceC6018g, this);
        }

        public /* synthetic */ C6016e(fx2 fx2Var, sj3 sj3Var, RunnableC6012a runnableC6012a) {
            this(fx2Var, sj3Var);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private C6016e(fx2 fx2Var) {
            RunnableC6012a runnableC6012a = null;
            super(fx2Var, fx2Var.f37911b, runnableC6012a);
            this.f37926m = fx2Var.getDeadline();
            this.f37920C = new fx2(this, this.f37911b, runnableC6012a);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private C6016e(fx2 fx2Var, sj3 sj3Var) {
            RunnableC6012a runnableC6012a = null;
            super(fx2Var, fx2Var.f37911b, runnableC6012a);
            this.f37926m = sj3Var;
            this.f37920C = new fx2(this, this.f37911b, runnableC6012a);
        }
    }

    /* JADX INFO: renamed from: fx2$f */
    public @interface InterfaceC6017f {
    }

    /* JADX INFO: renamed from: fx2$g */
    public interface InterfaceC6018g {
        void cancelled(fx2 fx2Var);
    }

    /* JADX INFO: renamed from: fx2$h */
    public @interface InterfaceC6019h {
    }

    /* JADX INFO: renamed from: fx2$i */
    public enum EnumC6020i implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Context.DirectExecutor";
        }
    }

    /* JADX INFO: renamed from: fx2$j */
    public static final class RunnableC6021j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Executor f37931a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC6018g f37932b;

        /* JADX INFO: renamed from: c */
        public final fx2 f37933c;

        public RunnableC6021j(Executor executor, InterfaceC6018g interfaceC6018g, fx2 fx2Var) {
            this.f37931a = executor;
            this.f37932b = interfaceC6018g;
            this.f37933c = fx2Var;
        }

        /* JADX INFO: renamed from: b */
        public void m11216b() {
            try {
                this.f37931a.execute(this);
            } catch (Throwable th) {
                fx2.f37907d.log(Level.INFO, "Exception notifying context listener", th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37932b.cancelled(this.f37933c);
        }
    }

    /* JADX INFO: renamed from: fx2$k */
    public static final class C6022k<T> {

        /* JADX INFO: renamed from: a */
        public final String f37934a;

        /* JADX INFO: renamed from: b */
        public final T f37935b;

        public C6022k(String str) {
            this(str, null);
        }

        public T get() {
            return get(fx2.current());
        }

        public String toString() {
            return this.f37934a;
        }

        public C6022k(String str, T t) {
            this.f37934a = (String) fx2.m11209b(str, "name");
            this.f37935b = t;
        }

        public T get(fx2 fx2Var) {
            T t = (T) tqc.m22749a(fx2Var.f37911b, this);
            return t == null ? this.f37935b : t;
        }
    }

    /* JADX INFO: renamed from: fx2$l */
    public static final class C6023l {

        /* JADX INFO: renamed from: a */
        public static final AbstractC6024m f37936a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f37936a = createStorage(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                fx2.f37907d.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        private C6023l() {
        }

        private static AbstractC6024m createStorage(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (AbstractC6024m) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(AbstractC6024m.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                return new vxg();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
        }
    }

    /* JADX INFO: renamed from: fx2$m */
    public static abstract class AbstractC6024m {
        public abstract fx2 current();

        public abstract void detach(fx2 fx2Var, fx2 fx2Var2);

        public abstract fx2 doAttach(fx2 fx2Var);
    }

    public /* synthetic */ fx2(fx2 fx2Var, tqc.InterfaceC13168d interfaceC13168d, RunnableC6012a runnableC6012a) {
        this(fx2Var, (tqc.InterfaceC13168d<C6022k<?>, Object>) interfaceC13168d);
    }

    /* JADX INFO: renamed from: a */
    public static C6016e m11208a(fx2 fx2Var) {
        return fx2Var instanceof C6016e ? (C6016e) fx2Var : fx2Var.f37910a;
    }

    @InterfaceC6017f
    /* JADX INFO: renamed from: b */
    public static <T> T m11209b(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static fx2 current() {
        fx2 fx2VarCurrent = m11210d().current();
        return fx2VarCurrent == null ? f37909f : fx2VarCurrent;
    }

    public static Executor currentContextExecutor(Executor executor) {
        return new ExecutorC6013b(executor);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC6024m m11210d() {
        return C6023l.f37936a;
    }

    public static <T> C6022k<T> key(String str) {
        return new C6022k<>(str);
    }

    public static <T> C6022k<T> keyWithDefault(String str, T t) {
        return new C6022k<>(str, t);
    }

    private static void validateGeneration(int i) {
        if (i == 1000) {
            f37907d.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public void addListener(InterfaceC6018g interfaceC6018g, Executor executor) {
        m11209b(interfaceC6018g, "cancellationListener");
        m11209b(executor, "executor");
        C6016e c6016e = this.f37910a;
        if (c6016e == null) {
            return;
        }
        c6016e.addListenerInternal(new RunnableC6021j(executor, interfaceC6018g, this));
    }

    public fx2 attach() {
        fx2 fx2VarDoAttach = m11210d().doAttach(this);
        return fx2VarDoAttach == null ? f37909f : fx2VarDoAttach;
    }

    /* JADX INFO: renamed from: c */
    public int mo11211c() {
        C6016e c6016e = this.f37910a;
        if (c6016e == null) {
            return 0;
        }
        return c6016e.mo11211c();
    }

    @InterfaceC6017f
    public <V> V call(Callable<V> callable) throws Exception {
        fx2 fx2VarAttach = attach();
        try {
            return callable.call();
        } finally {
            detach(fx2VarAttach);
        }
    }

    public Throwable cancellationCause() {
        C6016e c6016e = this.f37910a;
        if (c6016e == null) {
            return null;
        }
        return c6016e.cancellationCause();
    }

    public void detach(fx2 fx2Var) {
        m11209b(fx2Var, "toAttach");
        m11210d().detach(this, fx2Var);
    }

    public Executor fixedContextExecutor(Executor executor) {
        return new ExecutorC6014c(executor);
    }

    public fx2 fork() {
        return new fx2(this.f37911b, this.f37912c + 1);
    }

    public sj3 getDeadline() {
        C6016e c6016e = this.f37910a;
        if (c6016e == null) {
            return null;
        }
        return c6016e.getDeadline();
    }

    public boolean isCancelled() {
        C6016e c6016e = this.f37910a;
        if (c6016e == null) {
            return false;
        }
        return c6016e.isCancelled();
    }

    public boolean isCurrent() {
        return current() == this;
    }

    public void removeListener(InterfaceC6018g interfaceC6018g) {
        C6016e c6016e = this.f37910a;
        if (c6016e == null) {
            return;
        }
        c6016e.removeListenerInternal(interfaceC6018g, this);
    }

    public void run(Runnable runnable) {
        fx2 fx2VarAttach = attach();
        try {
            runnable.run();
        } finally {
            detach(fx2VarAttach);
        }
    }

    public C6016e withCancellation() {
        return new C6016e(this, (RunnableC6012a) null);
    }

    public C6016e withDeadline(sj3 sj3Var, ScheduledExecutorService scheduledExecutorService) {
        boolean z;
        m11209b(sj3Var, "deadline");
        m11209b(scheduledExecutorService, "scheduler");
        sj3 deadline = getDeadline();
        if (deadline == null || deadline.compareTo(sj3Var) > 0) {
            z = true;
        } else {
            z = false;
            sj3Var = deadline;
        }
        C6016e c6016e = new C6016e(this, sj3Var, null);
        if (z) {
            c6016e.setUpDeadlineCancellation(sj3Var, scheduledExecutorService);
        }
        return c6016e;
    }

    public C6016e withDeadlineAfter(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return withDeadline(sj3.after(j, timeUnit), scheduledExecutorService);
    }

    public <V> fx2 withValue(C6022k<V> c6022k, V v) {
        return new fx2(this, (tqc.InterfaceC13168d<C6022k<?>, Object>) tqc.m22750b(this.f37911b, c6022k, v));
    }

    public <V1, V2> fx2 withValues(C6022k<V1> c6022k, V1 v1, C6022k<V2> c6022k2, V2 v2) {
        return new fx2(this, (tqc.InterfaceC13168d<C6022k<?>, Object>) tqc.m22750b(tqc.m22750b(this.f37911b, c6022k, v1), c6022k2, v2));
    }

    public Runnable wrap(Runnable runnable) {
        return new RunnableC6012a(runnable);
    }

    private fx2(tqc.InterfaceC13168d<C6022k<?>, Object> interfaceC13168d, int i) {
        this.f37910a = null;
        this.f37911b = interfaceC13168d;
        this.f37912c = i;
        validateGeneration(i);
    }

    public <C> Callable<C> wrap(Callable<C> callable) {
        return new CallableC6015d(callable);
    }

    public <V1, V2, V3> fx2 withValues(C6022k<V1> c6022k, V1 v1, C6022k<V2> c6022k2, V2 v2, C6022k<V3> c6022k3, V3 v3) {
        return new fx2(this, (tqc.InterfaceC13168d<C6022k<?>, Object>) tqc.m22750b(tqc.m22750b(tqc.m22750b(this.f37911b, c6022k, v1), c6022k2, v2), c6022k3, v3));
    }

    private fx2(fx2 fx2Var, tqc.InterfaceC13168d<C6022k<?>, Object> interfaceC13168d) {
        this.f37910a = m11208a(fx2Var);
        this.f37911b = interfaceC13168d;
        int i = fx2Var.f37912c + 1;
        this.f37912c = i;
        validateGeneration(i);
    }

    public <V1, V2, V3, V4> fx2 withValues(C6022k<V1> c6022k, V1 v1, C6022k<V2> c6022k2, V2 v2, C6022k<V3> c6022k3, V3 v3, C6022k<V4> c6022k4, V4 v4) {
        return new fx2(this, (tqc.InterfaceC13168d<C6022k<?>, Object>) tqc.m22750b(tqc.m22750b(tqc.m22750b(tqc.m22750b(this.f37911b, c6022k, v1), c6022k2, v2), c6022k3, v3), c6022k4, v4));
    }

    private fx2() {
        this.f37910a = null;
        this.f37911b = null;
        this.f37912c = 0;
        validateGeneration(0);
    }
}
