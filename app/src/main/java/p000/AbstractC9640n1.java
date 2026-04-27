package p000;

import com.blankj.utilcode.util.C2473f;
import com.google.j2objc.annotations.ReflectionSupport;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: n1 */
/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
@qx4
public abstract class AbstractC9640n1<V> extends sa8 implements ja9<V> {

    /* JADX INFO: renamed from: C */
    public static final Object f62905C;

    /* JADX INFO: renamed from: d */
    public static final boolean f62906d;

    /* JADX INFO: renamed from: e */
    public static final Logger f62907e;

    /* JADX INFO: renamed from: f */
    public static final long f62908f = 1000;

    /* JADX INFO: renamed from: m */
    public static final b f62909m;

    /* JADX INFO: renamed from: a */
    @wx1
    public volatile Object f62910a;

    /* JADX INFO: renamed from: b */
    @wx1
    public volatile e f62911b;

    /* JADX INFO: renamed from: c */
    @wx1
    public volatile l f62912c;

    /* JADX INFO: renamed from: n1$b */
    public static abstract class b {
        private b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo17709a(AbstractC9640n1<?> future, @wx1 e expect, e update);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo17710b(AbstractC9640n1<?> future, @wx1 Object expect, Object update);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo17711c(AbstractC9640n1<?> future, @wx1 l expect, @wx1 l update);

        /* JADX INFO: renamed from: d */
        public abstract e mo17712d(AbstractC9640n1<?> future, e update);

        /* JADX INFO: renamed from: e */
        public abstract l mo17713e(AbstractC9640n1<?> future, l update);

        /* JADX INFO: renamed from: f */
        public abstract void mo17714f(l waiter, @wx1 l newValue);

        /* JADX INFO: renamed from: g */
        public abstract void mo17715g(l waiter, Thread newValue);
    }

    /* JADX INFO: renamed from: n1$c */
    public static final class c {

        /* JADX INFO: renamed from: c */
        @wx1
        public static final c f62913c;

        /* JADX INFO: renamed from: d */
        @wx1
        public static final c f62914d;

        /* JADX INFO: renamed from: a */
        public final boolean f62915a;

        /* JADX INFO: renamed from: b */
        @wx1
        public final Throwable f62916b;

        static {
            if (AbstractC9640n1.f62906d) {
                f62914d = null;
                f62913c = null;
            } else {
                f62914d = new c(false, null);
                f62913c = new c(true, null);
            }
        }

        public c(boolean wasInterrupted, @wx1 Throwable cause) {
            this.f62915a = wasInterrupted;
            this.f62916b = cause;
        }
    }

    /* JADX INFO: renamed from: n1$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f62917b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        public final Throwable f62918a;

        /* JADX INFO: renamed from: n1$d$a */
        public class a extends Throwable {
            public a(String message) {
                super(message);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable exception) {
            this.f62918a = (Throwable) v7d.checkNotNull(exception);
        }
    }

    /* JADX INFO: renamed from: n1$f */
    public static final class f extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<l, Thread> f62923a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<l, l> f62924b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC9640n1, l> f62925c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC9640n1, e> f62926d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC9640n1, Object> f62927e;

        public f(AtomicReferenceFieldUpdater<l, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<l, l> waiterNextUpdater, AtomicReferenceFieldUpdater<AbstractC9640n1, l> waitersUpdater, AtomicReferenceFieldUpdater<AbstractC9640n1, e> listenersUpdater, AtomicReferenceFieldUpdater<AbstractC9640n1, Object> valueUpdater) {
            super();
            this.f62923a = waiterThreadUpdater;
            this.f62924b = waiterNextUpdater;
            this.f62925c = waitersUpdater;
            this.f62926d = listenersUpdater;
            this.f62927e = valueUpdater;
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: a */
        public boolean mo17709a(AbstractC9640n1<?> future, @wx1 e expect, e update) {
            return C0051a4.m134a(this.f62926d, future, expect, update);
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: b */
        public boolean mo17710b(AbstractC9640n1<?> future, @wx1 Object expect, Object update) {
            return C0051a4.m134a(this.f62927e, future, expect, update);
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: c */
        public boolean mo17711c(AbstractC9640n1<?> future, @wx1 l expect, @wx1 l update) {
            return C0051a4.m134a(this.f62925c, future, expect, update);
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: d */
        public e mo17712d(AbstractC9640n1<?> future, e update) {
            return this.f62926d.getAndSet(future, update);
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: e */
        public l mo17713e(AbstractC9640n1<?> future, l update) {
            return this.f62925c.getAndSet(future, update);
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: f */
        public void mo17714f(l waiter, @wx1 l newValue) {
            this.f62924b.lazySet(waiter, newValue);
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: g */
        public void mo17715g(l waiter, Thread newValue) {
            this.f62923a.lazySet(waiter, newValue);
        }
    }

    /* JADX INFO: renamed from: n1$g */
    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractC9640n1<V> f62928a;

        /* JADX INFO: renamed from: b */
        public final ja9<? extends V> f62929b;

        public g(AbstractC9640n1<V> owner, ja9<? extends V> future) {
            this.f62928a = owner;
            this.f62929b = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62928a.f62910a != this) {
                return;
            }
            if (AbstractC9640n1.f62909m.mo17710b(this.f62928a, this, AbstractC9640n1.getFutureValue(this.f62929b))) {
                AbstractC9640n1.complete(this.f62928a, false);
            }
        }
    }

    /* JADX INFO: renamed from: n1$h */
    public static final class h extends b {
        private h() {
            super();
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: a */
        public boolean mo17709a(AbstractC9640n1<?> future, @wx1 e expect, e update) {
            synchronized (future) {
                try {
                    if (future.f62911b != expect) {
                        return false;
                    }
                    future.f62911b = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: b */
        public boolean mo17710b(AbstractC9640n1<?> future, @wx1 Object expect, Object update) {
            synchronized (future) {
                try {
                    if (future.f62910a != expect) {
                        return false;
                    }
                    future.f62910a = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: c */
        public boolean mo17711c(AbstractC9640n1<?> future, @wx1 l expect, @wx1 l update) {
            synchronized (future) {
                try {
                    if (future.f62912c != expect) {
                        return false;
                    }
                    future.f62912c = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: d */
        public e mo17712d(AbstractC9640n1<?> future, e update) {
            e eVar;
            synchronized (future) {
                try {
                    eVar = future.f62911b;
                    if (eVar != update) {
                        future.f62911b = update;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVar;
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: e */
        public l mo17713e(AbstractC9640n1<?> future, l update) {
            l lVar;
            synchronized (future) {
                try {
                    lVar = future.f62912c;
                    if (lVar != update) {
                        future.f62912c = update;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lVar;
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: f */
        public void mo17714f(l waiter, @wx1 l newValue) {
            waiter.f62938b = newValue;
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: g */
        public void mo17715g(l waiter, Thread newValue) {
            waiter.f62937a = newValue;
        }
    }

    /* JADX INFO: renamed from: n1$i */
    public interface i<V> extends ja9<V> {
    }

    /* JADX INFO: renamed from: n1$j */
    public static abstract class j<V> extends AbstractC9640n1<V> implements i<V> {
        @Override // p000.AbstractC9640n1, p000.ja9
        public void addListener(Runnable listener, Executor executor) {
            super.addListener(listener, executor);
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        @op1
        public boolean cancel(boolean mayInterruptIfRunning) {
            return super.cancel(mayInterruptIfRunning);
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        @op1
        @agc
        public V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        public boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // p000.AbstractC9640n1, java.util.concurrent.Future
        @op1
        @agc
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }
    }

    /* JADX INFO: renamed from: n1$k */
    public static final class k extends b {

        /* JADX INFO: renamed from: a */
        public static final Unsafe f62930a;

        /* JADX INFO: renamed from: b */
        public static final long f62931b;

        /* JADX INFO: renamed from: c */
        public static final long f62932c;

        /* JADX INFO: renamed from: d */
        public static final long f62933d;

        /* JADX INFO: renamed from: e */
        public static final long f62934e;

        /* JADX INFO: renamed from: f */
        public static final long f62935f;

        /* JADX INFO: renamed from: n1$k$a */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            public Unsafe run() throws Exception {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    f62932c = unsafe.objectFieldOffset(AbstractC9640n1.class.getDeclaredField("c"));
                    f62931b = unsafe.objectFieldOffset(AbstractC9640n1.class.getDeclaredField("b"));
                    f62933d = unsafe.objectFieldOffset(AbstractC9640n1.class.getDeclaredField("a"));
                    f62934e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                    f62935f = unsafe.objectFieldOffset(l.class.getDeclaredField("b"));
                    f62930a = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        private k() {
            super();
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: a */
        public boolean mo17709a(AbstractC9640n1<?> future, @wx1 e expect, e update) {
            return C9074m1.m16545a(f62930a, future, f62931b, expect, update);
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: b */
        public boolean mo17710b(AbstractC9640n1<?> future, @wx1 Object expect, Object update) {
            return C9074m1.m16545a(f62930a, future, f62933d, expect, update);
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: c */
        public boolean mo17711c(AbstractC9640n1<?> future, @wx1 l expect, @wx1 l update) {
            return C9074m1.m16545a(f62930a, future, f62932c, expect, update);
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: d */
        public e mo17712d(AbstractC9640n1<?> future, e update) {
            e eVar;
            do {
                eVar = future.f62911b;
                if (update == eVar) {
                    return eVar;
                }
            } while (!mo17709a(future, eVar, update));
            return eVar;
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: e */
        public l mo17713e(AbstractC9640n1<?> future, l update) {
            l lVar;
            do {
                lVar = future.f62912c;
                if (update == lVar) {
                    return lVar;
                }
            } while (!mo17711c(future, lVar, update));
            return lVar;
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: f */
        public void mo17714f(l waiter, @wx1 l newValue) {
            f62930a.putObject(waiter, f62935f, newValue);
        }

        @Override // p000.AbstractC9640n1.b
        /* JADX INFO: renamed from: g */
        public void mo17715g(l waiter, Thread newValue) {
            f62930a.putObject(waiter, f62934e, newValue);
        }
    }

    /* JADX INFO: renamed from: n1$l */
    public static final class l {

        /* JADX INFO: renamed from: c */
        public static final l f62936c = new l(false);

        /* JADX INFO: renamed from: a */
        @wx1
        public volatile Thread f62937a;

        /* JADX INFO: renamed from: b */
        @wx1
        public volatile l f62938b;

        public l(boolean unused) {
        }

        /* JADX INFO: renamed from: a */
        public void m17716a(@wx1 l next) {
            AbstractC9640n1.f62909m.mo17714f(this, next);
        }

        /* JADX INFO: renamed from: b */
        public void m17717b() {
            Thread thread = this.f62937a;
            if (thread != null) {
                this.f62937a = null;
                LockSupport.unpark(thread);
            }
        }

        public l() {
            AbstractC9640n1.f62909m.mo17715g(this, Thread.currentThread());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r4v2, types: [n1$a] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    static {
        boolean z;
        b hVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f62906d = z;
        f62907e = Logger.getLogger(AbstractC9640n1.class.getName());
        ?? r4 = 0;
        r4 = 0;
        try {
            hVar = new k();
            e = null;
        } catch (Error | RuntimeException e2) {
            e = e2;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC9640n1.class, l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC9640n1.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC9640n1.class, Object.class, "a"));
            } catch (Error | RuntimeException e3) {
                hVar = new h();
                r4 = e3;
            }
        }
        f62909m = hVar;
        if (r4 != 0) {
            ?? r0 = f62907e;
            Level level = Level.SEVERE;
            r0.log(level, "UnsafeAtomicHelper is broken!", e);
            r0.log(level, "SafeAtomicHelper is broken!", r4);
        }
        f62905C = new Object();
    }

    private void addDoneString(StringBuilder builder) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            builder.append("SUCCESS, result=[");
            appendResultObject(builder, uninterruptibly);
            builder.append("]");
        } catch (CancellationException unused) {
            builder.append("CANCELLED");
        } catch (RuntimeException e2) {
            builder.append("UNKNOWN, cause=[");
            builder.append(e2.getClass());
            builder.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            builder.append("FAILURE, cause=[");
            builder.append(e3.getCause());
            builder.append("]");
        }
    }

    private void addPendingString(StringBuilder builder) {
        String strEmptyToNull;
        int length = builder.length();
        builder.append("PENDING");
        Object obj = this.f62910a;
        if (obj instanceof g) {
            builder.append(", setFuture=[");
            appendUserObject(builder, ((g) obj).f62929b);
            builder.append("]");
        } else {
            try {
                strEmptyToNull = u8g.emptyToNull(mo2823n());
            } catch (RuntimeException | StackOverflowError e2) {
                strEmptyToNull = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strEmptyToNull != null) {
                builder.append(", info=[");
                builder.append(strEmptyToNull);
                builder.append("]");
            }
        }
        if (isDone()) {
            builder.delete(length, builder.length());
            addDoneString(builder);
        }
    }

    private void appendResultObject(StringBuilder builder, @wx1 Object o) {
        if (o == null) {
            builder.append("null");
        } else {
            if (o == this) {
                builder.append("this future");
                return;
            }
            builder.append(o.getClass().getName());
            builder.append("@");
            builder.append(Integer.toHexString(System.identityHashCode(o)));
        }
    }

    private void appendUserObject(StringBuilder builder, @wx1 Object o) {
        try {
            if (o == this) {
                builder.append("this future");
            } else {
                builder.append(o);
            }
        } catch (RuntimeException e2) {
            e = e2;
            builder.append("Exception thrown from implementation: ");
            builder.append(e.getClass());
        } catch (StackOverflowError e3) {
            e = e3;
            builder.append("Exception thrown from implementation: ");
            builder.append(e.getClass());
        }
    }

    private static CancellationException cancellationExceptionWithCause(String message, @wx1 Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    @wx1
    private e clearListeners(@wx1 e onto) {
        e eVar = onto;
        e eVarMo17712d = f62909m.mo17712d(this, e.f62919d);
        while (eVarMo17712d != null) {
            e eVar2 = eVarMo17712d.f62922c;
            eVarMo17712d.f62922c = eVar;
            eVar = eVarMo17712d;
            eVarMo17712d = eVar2;
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static void complete(AbstractC9640n1<?> abstractC9640n1, boolean z) {
        e eVar = null;
        while (true) {
            abstractC9640n1.releaseWaiters();
            if (z) {
                abstractC9640n1.mo14637l();
                z = false;
            }
            abstractC9640n1.mo2822k();
            e eVarClearListeners = abstractC9640n1.clearListeners(eVar);
            while (eVarClearListeners != null) {
                eVar = eVarClearListeners.f62922c;
                Runnable runnable = eVarClearListeners.f62920a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    abstractC9640n1 = gVar.f62928a;
                    if (abstractC9640n1.f62910a == gVar) {
                        if (f62909m.mo17710b(abstractC9640n1, gVar, getFutureValue(gVar.f62929b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = eVarClearListeners.f62921b;
                    Objects.requireNonNull(executor);
                    executeListener(runnable2, executor);
                }
                eVarClearListeners = eVar;
            }
            return;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f62907e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @agc
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((c) obj).f62916b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f62918a);
        }
        return obj == f62905C ? (V) tib.m22677b() : obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object getFutureValue(ja9<?> future) {
        Throwable thTryInternalFastPathGetFailure;
        if (future instanceof i) {
            Object cVar = ((AbstractC9640n1) future).f62910a;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f62915a) {
                    cVar = cVar2.f62916b != null ? new c(false, cVar2.f62916b) : c.f62914d;
                }
            }
            Objects.requireNonNull(cVar);
            return cVar;
        }
        if ((future instanceof sa8) && (thTryInternalFastPathGetFailure = ta8.tryInternalFastPathGetFailure((sa8) future)) != null) {
            return new d(thTryInternalFastPathGetFailure);
        }
        boolean zIsCancelled = future.isCancelled();
        if ((!f62906d) && zIsCancelled) {
            c cVar3 = c.f62914d;
            Objects.requireNonNull(cVar3);
            return cVar3;
        }
        try {
            Object uninterruptibly = getUninterruptibly(future);
            if (!zIsCancelled) {
                return uninterruptibly == null ? f62905C : uninterruptibly;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + future));
        } catch (Error e2) {
            e = e2;
            return new d(e);
        } catch (CancellationException e3) {
            if (zIsCancelled) {
                return new c(false, e3);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e3));
        } catch (RuntimeException e4) {
            e = e4;
            return new d(e);
        } catch (ExecutionException e5) {
            if (!zIsCancelled) {
                return new d(e5.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + future, e5));
        }
    }

    @agc
    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private void releaseWaiters() {
        for (l lVarMo17713e = f62909m.mo17713e(this, l.f62936c); lVarMo17713e != null; lVarMo17713e = lVarMo17713e.f62938b) {
            lVarMo17713e.m17717b();
        }
    }

    private void removeWaiter(l node) {
        node.f62937a = null;
        while (true) {
            l lVar = this.f62912c;
            if (lVar == l.f62936c) {
                return;
            }
            l lVar2 = null;
            while (lVar != null) {
                l lVar3 = lVar.f62938b;
                if (lVar.f62937a != null) {
                    lVar2 = lVar;
                } else if (lVar2 != null) {
                    lVar2.f62938b = lVar3;
                    if (lVar2.f62937a == null) {
                        break;
                    }
                } else if (!f62909m.mo17711c(this, lVar, lVar3)) {
                    break;
                }
                lVar = lVar3;
            }
            return;
        }
    }

    @Override // p000.sa8
    @wx1
    /* JADX INFO: renamed from: a */
    public final Throwable mo17706a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f62910a;
        if (obj instanceof d) {
            return ((d) obj).f62918a;
        }
        return null;
    }

    public void addListener(Runnable listener, Executor executor) {
        e eVar;
        v7d.checkNotNull(listener, "Runnable was null.");
        v7d.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f62911b) != e.f62919d) {
            e eVar2 = new e(listener, executor);
            do {
                eVar2.f62922c = eVar;
                if (f62909m.mo17709a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f62911b;
                }
            } while (eVar != e.f62919d);
        }
        executeListener(listener, executor);
    }

    @op1
    public boolean cancel(boolean mayInterruptIfRunning) {
        c cVar;
        Object obj = this.f62910a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f62906d) {
            cVar = new c(mayInterruptIfRunning, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = mayInterruptIfRunning ? c.f62913c : c.f62914d;
            Objects.requireNonNull(cVar);
        }
        AbstractC9640n1<V> abstractC9640n1 = this;
        boolean z = false;
        while (true) {
            if (f62909m.mo17710b(abstractC9640n1, obj, cVar)) {
                complete(abstractC9640n1, mayInterruptIfRunning);
                if (!(obj instanceof g)) {
                    return true;
                }
                ja9<? extends V> ja9Var = ((g) obj).f62929b;
                if (!(ja9Var instanceof i)) {
                    ja9Var.cancel(mayInterruptIfRunning);
                    return true;
                }
                abstractC9640n1 = (AbstractC9640n1) ja9Var;
                obj = abstractC9640n1.f62910a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z = true;
            } else {
                obj = abstractC9640n1.f62910a;
                if (!(obj instanceof g)) {
                    return z;
                }
            }
        }
    }

    @op1
    @agc
    public V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = unit.toNanos(timeout);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f62910a;
        if ((obj != null) && (!(obj instanceof g))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f62912c;
            if (lVar != l.f62936c) {
                l lVar2 = new l();
                do {
                    lVar2.m17716a(lVar);
                    if (f62909m.mo17711c(this, lVar, lVar2)) {
                        do {
                            m9c.m17166a(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f62910a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(lVar2);
                    } else {
                        lVar = this.f62912c;
                    }
                } while (lVar != l.f62936c);
            }
            Object obj3 = this.f62910a;
            Objects.requireNonNull(obj3);
            return getDoneValue(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f62910a;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return getDoneValue(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = unit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + timeout + C2473f.f17566z + unit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long jConvert = unit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - unit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + C2473f.f17566z + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + C2473f.f17566z;
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    public boolean isCancelled() {
        return this.f62910a instanceof c;
    }

    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f62910a != null);
    }

    @vp6
    /* JADX INFO: renamed from: k */
    public void mo2822k() {
    }

    /* JADX INFO: renamed from: l */
    public void mo14637l() {
    }

    /* JADX INFO: renamed from: m */
    public final void m17707m(@wx1 Future<?> related) {
        if ((related != null) && isCancelled()) {
            related.cancel(m17708o());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @wx1
    /* JADX INFO: renamed from: n */
    public String mo2823n() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: o */
    public final boolean m17708o() {
        Object obj = this.f62910a;
        return (obj instanceof c) && ((c) obj).f62915a;
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
    @op1
    public boolean set(@agc V v) {
        if (v == null) {
            v = (V) f62905C;
        }
        if (!f62909m.mo17710b(this, null, v)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    @op1
    public boolean setException(Throwable throwable) {
        if (!f62909m.mo17710b(this, null, new d((Throwable) v7d.checkNotNull(throwable)))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    @op1
    public boolean setFuture(ja9<? extends V> future) {
        d dVar;
        v7d.checkNotNull(future);
        Object obj = this.f62910a;
        if (obj == null) {
            if (future.isDone()) {
                if (!f62909m.mo17710b(this, null, getFutureValue(future))) {
                    return false;
                }
                complete(this, false);
                return true;
            }
            g gVar = new g(this, future);
            if (f62909m.mo17710b(this, null, gVar)) {
                try {
                    future.addListener(gVar, fd4.INSTANCE);
                } catch (Error | RuntimeException e2) {
                    try {
                        dVar = new d(e2);
                    } catch (Error | RuntimeException unused) {
                        dVar = d.f62917b;
                    }
                    f62909m.mo17710b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f62910a;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).f62915a);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            addPendingString(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: n1$e */
    public static final class e {

        /* JADX INFO: renamed from: d */
        public static final e f62919d = new e();

        /* JADX INFO: renamed from: a */
        @wx1
        public final Runnable f62920a;

        /* JADX INFO: renamed from: b */
        @wx1
        public final Executor f62921b;

        /* JADX INFO: renamed from: c */
        @wx1
        public e f62922c;

        public e(Runnable task, Executor executor) {
            this.f62920a = task;
            this.f62921b = executor;
        }

        public e() {
            this.f62920a = null;
            this.f62921b = null;
        }
    }

    @op1
    @agc
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f62910a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return getDoneValue(obj2);
            }
            l lVar = this.f62912c;
            if (lVar != l.f62936c) {
                l lVar2 = new l();
                do {
                    lVar2.m17716a(lVar);
                    if (f62909m.mo17711c(this, lVar, lVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f62910a;
                            } else {
                                removeWaiter(lVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return getDoneValue(obj);
                    }
                    lVar = this.f62912c;
                } while (lVar != l.f62936c);
            }
            Object obj3 = this.f62910a;
            Objects.requireNonNull(obj3);
            return getDoneValue(obj3);
        }
        throw new InterruptedException();
    }
}
