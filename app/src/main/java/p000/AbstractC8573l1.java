package p000;

import com.blankj.utilcode.util.C2473f;
import java.util.Locale;
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
import p000.p7e;

/* JADX INFO: renamed from: l1 */
/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69935b})
public abstract class AbstractC8573l1<V> implements ja9<V> {

    /* JADX INFO: renamed from: C */
    public static final Object f55898C;

    /* JADX INFO: renamed from: d */
    public static final boolean f55899d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f55900e = Logger.getLogger(AbstractC8573l1.class.getName());

    /* JADX INFO: renamed from: f */
    public static final long f55901f = 1000;

    /* JADX INFO: renamed from: m */
    public static final b f55902m;

    /* JADX INFO: renamed from: a */
    @hib
    public volatile Object f55903a;

    /* JADX INFO: renamed from: b */
    @hib
    public volatile e f55904b;

    /* JADX INFO: renamed from: c */
    @hib
    public volatile i f55905c;

    /* JADX INFO: renamed from: l1$b */
    public static abstract class b {
        private b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo15244a(AbstractC8573l1<?> future, e expect, e update);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo15245b(AbstractC8573l1<?> future, Object expect, Object update);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo15246c(AbstractC8573l1<?> future, i expect, i update);

        /* JADX INFO: renamed from: d */
        public abstract void mo15247d(i waiter, i newValue);

        /* JADX INFO: renamed from: e */
        public abstract void mo15248e(i waiter, Thread newValue);
    }

    /* JADX INFO: renamed from: l1$c */
    public static final class c {

        /* JADX INFO: renamed from: c */
        public static final c f55906c;

        /* JADX INFO: renamed from: d */
        public static final c f55907d;

        /* JADX INFO: renamed from: a */
        public final boolean f55908a;

        /* JADX INFO: renamed from: b */
        @hib
        public final Throwable f55909b;

        static {
            if (AbstractC8573l1.f55899d) {
                f55907d = null;
                f55906c = null;
            } else {
                f55907d = new c(false, null);
                f55906c = new c(true, null);
            }
        }

        public c(boolean wasInterrupted, @hib Throwable cause) {
            this.f55908a = wasInterrupted;
            this.f55909b = cause;
        }
    }

    /* JADX INFO: renamed from: l1$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f55910b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        public final Throwable f55911a;

        /* JADX INFO: renamed from: l1$d$a */
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
            this.f55911a = (Throwable) AbstractC8573l1.m15236b(exception);
        }
    }

    /* JADX INFO: renamed from: l1$e */
    public static final class e {

        /* JADX INFO: renamed from: d */
        public static final e f55912d = new e(null, null);

        /* JADX INFO: renamed from: a */
        public final Runnable f55913a;

        /* JADX INFO: renamed from: b */
        public final Executor f55914b;

        /* JADX INFO: renamed from: c */
        @hib
        public e f55915c;

        public e(Runnable task, Executor executor) {
            this.f55913a = task;
            this.f55914b = executor;
        }
    }

    /* JADX INFO: renamed from: l1$f */
    public static final class f extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<i, Thread> f55916a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<i, i> f55917b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC8573l1, i> f55918c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC8573l1, e> f55919d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC8573l1, Object> f55920e;

        public f(AtomicReferenceFieldUpdater<i, Thread> waiterThreadUpdater, AtomicReferenceFieldUpdater<i, i> waiterNextUpdater, AtomicReferenceFieldUpdater<AbstractC8573l1, i> waitersUpdater, AtomicReferenceFieldUpdater<AbstractC8573l1, e> listenersUpdater, AtomicReferenceFieldUpdater<AbstractC8573l1, Object> valueUpdater) {
            super();
            this.f55916a = waiterThreadUpdater;
            this.f55917b = waiterNextUpdater;
            this.f55918c = waitersUpdater;
            this.f55919d = listenersUpdater;
            this.f55920e = valueUpdater;
        }

        @Override // p000.AbstractC8573l1.b
        /* JADX INFO: renamed from: a */
        public boolean mo15244a(AbstractC8573l1<?> future, e expect, e update) {
            return C0051a4.m134a(this.f55919d, future, expect, update);
        }

        @Override // p000.AbstractC8573l1.b
        /* JADX INFO: renamed from: b */
        public boolean mo15245b(AbstractC8573l1<?> future, Object expect, Object update) {
            return C0051a4.m134a(this.f55920e, future, expect, update);
        }

        @Override // p000.AbstractC8573l1.b
        /* JADX INFO: renamed from: c */
        public boolean mo15246c(AbstractC8573l1<?> future, i expect, i update) {
            return C0051a4.m134a(this.f55918c, future, expect, update);
        }

        @Override // p000.AbstractC8573l1.b
        /* JADX INFO: renamed from: d */
        public void mo15247d(i waiter, i newValue) {
            this.f55917b.lazySet(waiter, newValue);
        }

        @Override // p000.AbstractC8573l1.b
        /* JADX INFO: renamed from: e */
        public void mo15248e(i waiter, Thread newValue) {
            this.f55916a.lazySet(waiter, newValue);
        }
    }

    /* JADX INFO: renamed from: l1$g */
    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractC8573l1<V> f55921a;

        /* JADX INFO: renamed from: b */
        public final ja9<? extends V> f55922b;

        public g(AbstractC8573l1<V> owner, ja9<? extends V> future) {
            this.f55921a = owner;
            this.f55922b = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f55921a.f55903a != this) {
                return;
            }
            if (AbstractC8573l1.f55902m.mo15245b(this.f55921a, this, AbstractC8573l1.m15238d(this.f55922b))) {
                AbstractC8573l1.m15237c(this.f55921a);
            }
        }
    }

    /* JADX INFO: renamed from: l1$h */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // p000.AbstractC8573l1.b
        /* JADX INFO: renamed from: a */
        public boolean mo15244a(AbstractC8573l1<?> future, e expect, e update) {
            synchronized (future) {
                try {
                    if (future.f55904b != expect) {
                        return false;
                    }
                    future.f55904b = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.AbstractC8573l1.b
        /* JADX INFO: renamed from: b */
        public boolean mo15245b(AbstractC8573l1<?> future, Object expect, Object update) {
            synchronized (future) {
                try {
                    if (future.f55903a != expect) {
                        return false;
                    }
                    future.f55903a = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.AbstractC8573l1.b
        /* JADX INFO: renamed from: c */
        public boolean mo15246c(AbstractC8573l1<?> future, i expect, i update) {
            synchronized (future) {
                try {
                    if (future.f55905c != expect) {
                        return false;
                    }
                    future.f55905c = update;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.AbstractC8573l1.b
        /* JADX INFO: renamed from: d */
        public void mo15247d(i waiter, i newValue) {
            waiter.f55925b = newValue;
        }

        @Override // p000.AbstractC8573l1.b
        /* JADX INFO: renamed from: e */
        public void mo15248e(i waiter, Thread newValue) {
            waiter.f55924a = newValue;
        }
    }

    /* JADX INFO: renamed from: l1$i */
    public static final class i {

        /* JADX INFO: renamed from: c */
        public static final i f55923c = new i(false);

        /* JADX INFO: renamed from: a */
        @hib
        public volatile Thread f55924a;

        /* JADX INFO: renamed from: b */
        @hib
        public volatile i f55925b;

        public i(boolean unused) {
        }

        /* JADX INFO: renamed from: a */
        public void m15249a(i next) {
            AbstractC8573l1.f55902m.mo15247d(this, next);
        }

        /* JADX INFO: renamed from: b */
        public void m15250b() {
            Thread thread = this.f55924a;
            if (thread != null) {
                this.f55924a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            AbstractC8573l1.f55902m.mo15248e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8573l1.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8573l1.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8573l1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f55902m = hVar;
        if (th != null) {
            f55900e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f55898C = new Object();
    }

    private void addDoneString(StringBuilder builder) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            builder.append("SUCCESS, result=[");
            builder.append(userObjectToString(uninterruptibly));
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

    @efb
    /* JADX INFO: renamed from: b */
    public static <T> T m15236b(@hib T reference) {
        reference.getClass();
        return reference;
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
    /* JADX INFO: renamed from: c */
    public static void m15237c(AbstractC8573l1<?> abstractC8573l1) {
        e eVar = null;
        while (true) {
            abstractC8573l1.releaseWaiters();
            abstractC8573l1.m15239a();
            e eVarClearListeners = abstractC8573l1.clearListeners(eVar);
            while (eVarClearListeners != null) {
                eVar = eVarClearListeners.f55915c;
                Runnable runnable = eVarClearListeners.f55913a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC8573l1 = gVar.f55921a;
                    if (abstractC8573l1.f55903a == gVar) {
                        if (f55902m.mo15245b(abstractC8573l1, gVar, m15238d(gVar.f55922b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, eVarClearListeners.f55914b);
                }
                eVarClearListeners = eVar;
            }
            return;
        }
    }

    private static CancellationException cancellationExceptionWithCause(@hib String message, @hib Throwable cause) {
        CancellationException cancellationException = new CancellationException(message);
        cancellationException.initCause(cause);
        return cancellationException;
    }

    private e clearListeners(e onto) {
        e eVar;
        do {
            eVar = this.f55904b;
        } while (!f55902m.mo15244a(this, eVar, e.f55912d));
        e eVar2 = onto;
        e eVar3 = eVar;
        while (eVar3 != null) {
            e eVar4 = eVar3.f55915c;
            eVar3.f55915c = eVar2;
            eVar2 = eVar3;
            eVar3 = eVar4;
        }
        return eVar2;
    }

    /* JADX INFO: renamed from: d */
    public static Object m15238d(ja9<?> future) {
        if (future instanceof AbstractC8573l1) {
            Object obj = ((AbstractC8573l1) future).f55903a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f55908a ? cVar.f55909b != null ? new c(false, cVar.f55909b) : c.f55907d : obj;
        }
        boolean zIsCancelled = future.isCancelled();
        if ((!f55899d) && zIsCancelled) {
            return c.f55907d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(future);
            return uninterruptibly == null ? f55898C : uninterruptibly;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + future, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f55900e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((c) obj).f55909b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f55911a);
        }
        if (obj == f55898C) {
            return null;
        }
        return obj;
    }

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
        i iVar;
        do {
            iVar = this.f55905c;
        } while (!f55902m.mo15246c(this, iVar, i.f55923c));
        while (iVar != null) {
            iVar.m15250b();
            iVar = iVar.f55925b;
        }
    }

    private void removeWaiter(i node) {
        node.f55924a = null;
        while (true) {
            i iVar = this.f55905c;
            if (iVar == i.f55923c) {
                return;
            }
            i iVar2 = null;
            while (iVar != null) {
                i iVar3 = iVar.f55925b;
                if (iVar.f55924a != null) {
                    iVar2 = iVar;
                } else if (iVar2 != null) {
                    iVar2.f55925b = iVar3;
                    if (iVar2.f55924a == null) {
                        break;
                    }
                } else if (!f55902m.mo15246c(this, iVar, iVar3)) {
                    break;
                }
                iVar = iVar3;
            }
            return;
        }
    }

    private String userObjectToString(Object o) {
        return o == this ? "this future" : String.valueOf(o);
    }

    /* JADX INFO: renamed from: a */
    public void m15239a() {
    }

    @Override // p000.ja9
    public final void addListener(Runnable listener, Executor executor) {
        m15236b(listener);
        m15236b(executor);
        e eVar = this.f55904b;
        if (eVar != e.f55912d) {
            e eVar2 = new e(listener, executor);
            do {
                eVar2.f55915c = eVar;
                if (f55902m.mo15244a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f55904b;
                }
            } while (eVar != e.f55912d);
        }
        executeListener(listener, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean mayInterruptIfRunning) {
        Object obj = this.f55903a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f55899d ? new c(mayInterruptIfRunning, new CancellationException("Future.cancel() was called.")) : mayInterruptIfRunning ? c.f55906c : c.f55907d;
        AbstractC8573l1<V> abstractC8573l1 = this;
        boolean z = false;
        while (true) {
            if (f55902m.mo15245b(abstractC8573l1, obj, cVar)) {
                if (mayInterruptIfRunning) {
                    abstractC8573l1.m15240e();
                }
                m15237c(abstractC8573l1);
                if (!(obj instanceof g)) {
                    return true;
                }
                ja9<? extends V> ja9Var = ((g) obj).f55922b;
                if (!(ja9Var instanceof AbstractC8573l1)) {
                    ja9Var.cancel(mayInterruptIfRunning);
                    return true;
                }
                abstractC8573l1 = (AbstractC8573l1) ja9Var;
                obj = abstractC8573l1.f55903a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z = true;
            } else {
                obj = abstractC8573l1.f55903a;
                if (!(obj instanceof g)) {
                    return z;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m15240e() {
    }

    /* JADX INFO: renamed from: f */
    public final void m15241f(@hib Future<?> related) {
        if ((related != null) && isCancelled()) {
            related.cancel(m15243h());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @hib
    /* JADX INFO: renamed from: g */
    public String m15242g() {
        Object obj = this.f55903a;
        if (obj instanceof g) {
            return "setFuture=[" + userObjectToString(((g) obj).f55922b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final V get(long timeout, TimeUnit unit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = unit.toNanos(timeout);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f55903a;
        if ((obj != null) && (!(obj instanceof g))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f55905c;
            if (iVar != i.f55923c) {
                i iVar2 = new i();
                do {
                    iVar2.m15249a(iVar);
                    if (f55902m.mo15246c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f55903a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(iVar2);
                    } else {
                        iVar = this.f55905c;
                    }
                } while (iVar != i.f55923c);
            }
            return getDoneValue(this.f55903a);
        }
        while (nanos > 0) {
            Object obj3 = this.f55903a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return getDoneValue(obj3);
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
            long j = -nanos;
            long jConvert = unit.convert(j, TimeUnit.NANOSECONDS);
            long nanos2 = j - unit.toNanos(jConvert);
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

    /* JADX INFO: renamed from: h */
    public final boolean m15243h() {
        Object obj = this.f55903a;
        return (obj instanceof c) && ((c) obj).f55908a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f55903a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f55903a != null);
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
    public boolean set(@hib V v) {
        if (v == null) {
            v = (V) f55898C;
        }
        if (!f55902m.mo15245b(this, null, v)) {
            return false;
        }
        m15237c(this);
        return true;
    }

    public boolean setException(Throwable throwable) {
        if (!f55902m.mo15245b(this, null, new d((Throwable) m15236b(throwable)))) {
            return false;
        }
        m15237c(this);
        return true;
    }

    public boolean setFuture(ja9<? extends V> future) {
        d dVar;
        m15236b(future);
        Object obj = this.f55903a;
        if (obj == null) {
            if (future.isDone()) {
                if (!f55902m.mo15245b(this, null, m15238d(future))) {
                    return false;
                }
                m15237c(this);
                return true;
            }
            g gVar = new g(this, future);
            if (f55902m.mo15245b(this, null, gVar)) {
                try {
                    future.addListener(gVar, ed4.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f55910b;
                    }
                    f55902m.mo15245b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f55903a;
        }
        if (obj instanceof c) {
            future.cancel(((c) obj).f55908a);
        }
        return false;
    }

    public String toString() {
        String strM15242g;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            try {
                strM15242g = m15242g();
            } catch (RuntimeException e2) {
                strM15242g = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strM15242g != null && !strM15242g.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM15242g);
                sb.append("]");
            } else if (isDone()) {
                addDoneString(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f55903a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return getDoneValue(obj2);
            }
            i iVar = this.f55905c;
            if (iVar != i.f55923c) {
                i iVar2 = new i();
                do {
                    iVar2.m15249a(iVar);
                    if (f55902m.mo15246c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f55903a;
                            } else {
                                removeWaiter(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return getDoneValue(obj);
                    }
                    iVar = this.f55905c;
                } while (iVar != i.f55923c);
            }
            return getDoneValue(this.f55903a);
        }
        throw new InterruptedException();
    }
}
