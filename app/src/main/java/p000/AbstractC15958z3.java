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

/* JADX INFO: renamed from: z3 */
/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public abstract class AbstractC15958z3<V> implements ja9<V> {

    /* JADX INFO: renamed from: C */
    public static final Object f103918C;

    /* JADX INFO: renamed from: d */
    public static final boolean f103919d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e */
    public static final Logger f103920e = Logger.getLogger(AbstractC15958z3.class.getName());

    /* JADX INFO: renamed from: f */
    public static final long f103921f = 1000;

    /* JADX INFO: renamed from: m */
    public static final b f103922m;

    /* JADX INFO: renamed from: a */
    @hib
    public volatile Object f103923a;

    /* JADX INFO: renamed from: b */
    @hib
    public volatile e f103924b;

    /* JADX INFO: renamed from: c */
    @hib
    public volatile i f103925c;

    /* JADX INFO: renamed from: z3$b */
    public static abstract class b {
        private b() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo26540a(AbstractC15958z3<?> abstractC15958z3, e eVar, e eVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo26541b(AbstractC15958z3<?> abstractC15958z3, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo26542c(AbstractC15958z3<?> abstractC15958z3, i iVar, i iVar2);

        /* JADX INFO: renamed from: d */
        public abstract void mo26543d(i iVar, i iVar2);

        /* JADX INFO: renamed from: e */
        public abstract void mo26544e(i iVar, Thread thread);
    }

    /* JADX INFO: renamed from: z3$c */
    public static final class c {

        /* JADX INFO: renamed from: c */
        public static final c f103926c;

        /* JADX INFO: renamed from: d */
        public static final c f103927d;

        /* JADX INFO: renamed from: a */
        public final boolean f103928a;

        /* JADX INFO: renamed from: b */
        @hib
        public final Throwable f103929b;

        static {
            if (AbstractC15958z3.f103919d) {
                f103927d = null;
                f103926c = null;
            } else {
                f103927d = new c(false, null);
                f103926c = new c(true, null);
            }
        }

        public c(boolean z, @hib Throwable th) {
            this.f103928a = z;
            this.f103929b = th;
        }
    }

    /* JADX INFO: renamed from: z3$d */
    public static final class d {

        /* JADX INFO: renamed from: b */
        public static final d f103930b = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a */
        public final Throwable f103931a;

        /* JADX INFO: renamed from: z3$d$a */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f103931a = (Throwable) AbstractC15958z3.m26533b(th);
        }
    }

    /* JADX INFO: renamed from: z3$e */
    public static final class e {

        /* JADX INFO: renamed from: d */
        public static final e f103932d = new e(null, null);

        /* JADX INFO: renamed from: a */
        public final Runnable f103933a;

        /* JADX INFO: renamed from: b */
        public final Executor f103934b;

        /* JADX INFO: renamed from: c */
        @hib
        public e f103935c;

        public e(Runnable runnable, Executor executor) {
            this.f103933a = runnable;
            this.f103934b = executor;
        }
    }

    /* JADX INFO: renamed from: z3$f */
    public static final class f extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<i, Thread> f103936a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<i, i> f103937b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC15958z3, i> f103938c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC15958z3, e> f103939d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC15958z3, Object> f103940e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC15958z3, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC15958z3, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC15958z3, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f103936a = atomicReferenceFieldUpdater;
            this.f103937b = atomicReferenceFieldUpdater2;
            this.f103938c = atomicReferenceFieldUpdater3;
            this.f103939d = atomicReferenceFieldUpdater4;
            this.f103940e = atomicReferenceFieldUpdater5;
        }

        @Override // p000.AbstractC15958z3.b
        /* JADX INFO: renamed from: a */
        public boolean mo26540a(AbstractC15958z3<?> abstractC15958z3, e eVar, e eVar2) {
            return C0051a4.m134a(this.f103939d, abstractC15958z3, eVar, eVar2);
        }

        @Override // p000.AbstractC15958z3.b
        /* JADX INFO: renamed from: b */
        public boolean mo26541b(AbstractC15958z3<?> abstractC15958z3, Object obj, Object obj2) {
            return C0051a4.m134a(this.f103940e, abstractC15958z3, obj, obj2);
        }

        @Override // p000.AbstractC15958z3.b
        /* JADX INFO: renamed from: c */
        public boolean mo26542c(AbstractC15958z3<?> abstractC15958z3, i iVar, i iVar2) {
            return C0051a4.m134a(this.f103938c, abstractC15958z3, iVar, iVar2);
        }

        @Override // p000.AbstractC15958z3.b
        /* JADX INFO: renamed from: d */
        public void mo26543d(i iVar, i iVar2) {
            this.f103937b.lazySet(iVar, iVar2);
        }

        @Override // p000.AbstractC15958z3.b
        /* JADX INFO: renamed from: e */
        public void mo26544e(i iVar, Thread thread) {
            this.f103936a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: renamed from: z3$g */
    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractC15958z3<V> f103941a;

        /* JADX INFO: renamed from: b */
        public final ja9<? extends V> f103942b;

        public g(AbstractC15958z3<V> abstractC15958z3, ja9<? extends V> ja9Var) {
            this.f103941a = abstractC15958z3;
            this.f103942b = ja9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f103941a.f103923a != this) {
                return;
            }
            if (AbstractC15958z3.f103922m.mo26541b(this.f103941a, this, AbstractC15958z3.m26535d(this.f103942b))) {
                AbstractC15958z3.m26534c(this.f103941a);
            }
        }
    }

    /* JADX INFO: renamed from: z3$h */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // p000.AbstractC15958z3.b
        /* JADX INFO: renamed from: a */
        public boolean mo26540a(AbstractC15958z3<?> abstractC15958z3, e eVar, e eVar2) {
            synchronized (abstractC15958z3) {
                try {
                    if (abstractC15958z3.f103924b != eVar) {
                        return false;
                    }
                    abstractC15958z3.f103924b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.AbstractC15958z3.b
        /* JADX INFO: renamed from: b */
        public boolean mo26541b(AbstractC15958z3<?> abstractC15958z3, Object obj, Object obj2) {
            synchronized (abstractC15958z3) {
                try {
                    if (abstractC15958z3.f103923a != obj) {
                        return false;
                    }
                    abstractC15958z3.f103923a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.AbstractC15958z3.b
        /* JADX INFO: renamed from: c */
        public boolean mo26542c(AbstractC15958z3<?> abstractC15958z3, i iVar, i iVar2) {
            synchronized (abstractC15958z3) {
                try {
                    if (abstractC15958z3.f103925c != iVar) {
                        return false;
                    }
                    abstractC15958z3.f103925c = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.AbstractC15958z3.b
        /* JADX INFO: renamed from: d */
        public void mo26543d(i iVar, i iVar2) {
            iVar.f103945b = iVar2;
        }

        @Override // p000.AbstractC15958z3.b
        /* JADX INFO: renamed from: e */
        public void mo26544e(i iVar, Thread thread) {
            iVar.f103944a = thread;
        }
    }

    /* JADX INFO: renamed from: z3$i */
    public static final class i {

        /* JADX INFO: renamed from: c */
        public static final i f103943c = new i(false);

        /* JADX INFO: renamed from: a */
        @hib
        public volatile Thread f103944a;

        /* JADX INFO: renamed from: b */
        @hib
        public volatile i f103945b;

        public i(boolean z) {
        }

        /* JADX INFO: renamed from: a */
        public void m26545a(i iVar) {
            AbstractC15958z3.f103922m.mo26543d(this, iVar);
        }

        /* JADX INFO: renamed from: b */
        public void m26546b() {
            Thread thread = this.f103944a;
            if (thread != null) {
                this.f103944a = null;
                LockSupport.unpark(thread);
            }
        }

        public i() {
            AbstractC15958z3.f103922m.mo26544e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC15958z3.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC15958z3.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC15958z3.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f103922m = hVar;
        if (th != null) {
            f103920e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f103918C = new Object();
    }

    private void addDoneString(StringBuilder sb) {
        try {
            Object objM26536e = m26536e(this);
            sb.append("SUCCESS, result=[");
            sb.append(userObjectToString(objM26536e));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @efb
    /* JADX INFO: renamed from: b */
    public static <T> T m26533b(@hib T t) {
        t.getClass();
        return t;
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
    public static void m26534c(AbstractC15958z3<?> abstractC15958z3) {
        e eVar = null;
        while (true) {
            abstractC15958z3.releaseWaiters();
            abstractC15958z3.mo21714a();
            e eVarClearListeners = abstractC15958z3.clearListeners(eVar);
            while (eVarClearListeners != null) {
                eVar = eVarClearListeners.f103935c;
                Runnable runnable = eVarClearListeners.f103933a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC15958z3 = gVar.f103941a;
                    if (abstractC15958z3.f103923a == gVar) {
                        if (f103922m.mo26541b(abstractC15958z3, gVar, m26535d(gVar.f103942b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, eVarClearListeners.f103934b);
                }
                eVarClearListeners = eVar;
            }
            return;
        }
    }

    private static CancellationException cancellationExceptionWithCause(@hib String str, @hib Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    private e clearListeners(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f103924b;
        } while (!f103922m.mo26540a(this, eVar2, e.f103932d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f103935c;
            eVar4.f103935c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX INFO: renamed from: d */
    public static Object m26535d(ja9<?> ja9Var) {
        if (ja9Var instanceof AbstractC15958z3) {
            Object obj = ((AbstractC15958z3) ja9Var).f103923a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f103928a ? cVar.f103929b != null ? new c(false, cVar.f103929b) : c.f103927d : obj;
        }
        boolean zIsCancelled = ja9Var.isCancelled();
        if ((!f103919d) && zIsCancelled) {
            return c.f103927d;
        }
        try {
            Object objM26536e = m26536e(ja9Var);
            return objM26536e == null ? f103918C : objM26536e;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ja9Var, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    @p7e({p7e.EnumC10826a.f69935b})
    /* JADX INFO: renamed from: e */
    public static <V> V m26536e(Future<V> future) throws ExecutionException {
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

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f103920e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((c) obj).f103929b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f103931a);
        }
        if (obj == f103918C) {
            return null;
        }
        return obj;
    }

    private void releaseWaiters() {
        i iVar;
        do {
            iVar = this.f103925c;
        } while (!f103922m.mo26542c(this, iVar, i.f103943c));
        while (iVar != null) {
            iVar.m26546b();
            iVar = iVar.f103945b;
        }
    }

    private void removeWaiter(i iVar) {
        iVar.f103944a = null;
        while (true) {
            i iVar2 = this.f103925c;
            if (iVar2 == i.f103943c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f103945b;
                if (iVar2.f103944a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f103945b = iVar4;
                    if (iVar3.f103944a == null) {
                        break;
                    }
                } else if (!f103922m.mo26542c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* JADX INFO: renamed from: a */
    public void mo21714a() {
    }

    @Override // p000.ja9
    public final void addListener(Runnable runnable, Executor executor) {
        m26533b(runnable);
        m26533b(executor);
        e eVar = this.f103924b;
        if (eVar != e.f103932d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f103935c = eVar;
                if (f103922m.mo26540a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f103924b;
                }
            } while (eVar != e.f103932d);
        }
        executeListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f103923a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f103919d ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.f103926c : c.f103927d;
        AbstractC15958z3<V> abstractC15958z3 = this;
        boolean z2 = false;
        while (true) {
            if (f103922m.mo26541b(abstractC15958z3, obj, cVar)) {
                if (z) {
                    abstractC15958z3.m26537f();
                }
                m26534c(abstractC15958z3);
                if (!(obj instanceof g)) {
                    return true;
                }
                ja9<? extends V> ja9Var = ((g) obj).f103942b;
                if (!(ja9Var instanceof AbstractC15958z3)) {
                    ja9Var.cancel(z);
                    return true;
                }
                abstractC15958z3 = (AbstractC15958z3) ja9Var;
                obj = abstractC15958z3.f103923a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC15958z3.f103923a;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m26537f() {
    }

    /* JADX INFO: renamed from: g */
    public final void m26538g(@hib Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m26539i());
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f103923a;
        if ((obj != null) && (!(obj instanceof g))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f103925c;
            if (iVar != i.f103943c) {
                i iVar2 = new i();
                do {
                    iVar2.m26545a(iVar);
                    if (f103922m.mo26542c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f103923a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(iVar2);
                    } else {
                        iVar = this.f103925c;
                    }
                } while (iVar != i.f103943c);
            }
            return getDoneValue(this.f103923a);
        }
        while (nanos > 0) {
            Object obj3 = this.f103923a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return getDoneValue(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j + C2473f.f17566z + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
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

    /* JADX WARN: Multi-variable type inference failed */
    @hib
    /* JADX INFO: renamed from: h */
    public String mo16265h() {
        Object obj = this.f103923a;
        if (obj instanceof g) {
            return "setFuture=[" + userObjectToString(((g) obj).f103942b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: i */
    public final boolean m26539i() {
        Object obj = this.f103923a;
        return (obj instanceof c) && ((c) obj).f103928a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f103923a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f103923a != null);
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
            v = (V) f103918C;
        }
        if (!f103922m.mo26541b(this, null, v)) {
            return false;
        }
        m26534c(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!f103922m.mo26541b(this, null, new d((Throwable) m26533b(th)))) {
            return false;
        }
        m26534c(this);
        return true;
    }

    public boolean setFuture(ja9<? extends V> ja9Var) {
        d dVar;
        m26533b(ja9Var);
        Object obj = this.f103923a;
        if (obj == null) {
            if (ja9Var.isDone()) {
                if (!f103922m.mo26541b(this, null, m26535d(ja9Var))) {
                    return false;
                }
                m26534c(this);
                return true;
            }
            g gVar = new g(this, ja9Var);
            if (f103922m.mo26541b(this, null, gVar)) {
                try {
                    ja9Var.addListener(gVar, hd4.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f103930b;
                    }
                    f103922m.mo26541b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f103923a;
        }
        if (obj instanceof c) {
            ja9Var.cancel(((c) obj).f103928a);
        }
        return false;
    }

    public String toString() {
        String strMo16265h;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            try {
                strMo16265h = mo16265h();
            } catch (RuntimeException e2) {
                strMo16265h = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strMo16265h != null && !strMo16265h.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo16265h);
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
            Object obj2 = this.f103923a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return getDoneValue(obj2);
            }
            i iVar = this.f103925c;
            if (iVar != i.f103943c) {
                i iVar2 = new i();
                do {
                    iVar2.m26545a(iVar);
                    if (f103922m.mo26542c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f103923a;
                            } else {
                                removeWaiter(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return getDoneValue(obj);
                    }
                    iVar = this.f103925c;
                } while (iVar != i.f103943c);
            }
            return getDoneValue(this.f103923a);
        }
        throw new InterruptedException();
    }
}
