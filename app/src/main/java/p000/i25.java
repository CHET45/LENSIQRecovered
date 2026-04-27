package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p000.fl3;
import p000.ko5;
import p000.m25;
import p000.p4d;

/* JADX INFO: loaded from: classes3.dex */
public class i25<R> implements fl3.InterfaceC5871b<R>, ko5.InterfaceC8472f {

    /* JADX INFO: renamed from: f2 */
    public static final C7115c f45508f2 = new C7115c();

    /* JADX INFO: renamed from: C */
    public final b77 f45509C;

    /* JADX INFO: renamed from: F */
    public final b77 f45510F;

    /* JADX INFO: renamed from: H */
    public final b77 f45511H;

    /* JADX INFO: renamed from: L */
    public final AtomicInteger f45512L;

    /* JADX INFO: renamed from: M */
    public eq8 f45513M;

    /* JADX INFO: renamed from: M1 */
    public hh3 f45514M1;

    /* JADX INFO: renamed from: N */
    public boolean f45515N;

    /* JADX INFO: renamed from: Q */
    public boolean f45516Q;

    /* JADX INFO: renamed from: V1 */
    public boolean f45517V1;

    /* JADX INFO: renamed from: X */
    public boolean f45518X;

    /* JADX INFO: renamed from: Y */
    public boolean f45519Y;

    /* JADX INFO: renamed from: Z */
    public t5e<?> f45520Z;

    /* JADX INFO: renamed from: Z1 */
    public a77 f45521Z1;

    /* JADX INFO: renamed from: a */
    public final C7117e f45522a;

    /* JADX INFO: renamed from: a2 */
    public boolean f45523a2;

    /* JADX INFO: renamed from: b */
    public final b3g f45524b;

    /* JADX INFO: renamed from: b2 */
    public m25<?> f45525b2;

    /* JADX INFO: renamed from: c */
    public final m25.InterfaceC9104a f45526c;

    /* JADX INFO: renamed from: c2 */
    public fl3<R> f45527c2;

    /* JADX INFO: renamed from: d */
    public final p4d.InterfaceC10791a<i25<?>> f45528d;

    /* JADX INFO: renamed from: d2 */
    public volatile boolean f45529d2;

    /* JADX INFO: renamed from: e */
    public final C7115c f45530e;

    /* JADX INFO: renamed from: e2 */
    public boolean f45531e2;

    /* JADX INFO: renamed from: f */
    public final j25 f45532f;

    /* JADX INFO: renamed from: m */
    public final b77 f45533m;

    /* JADX INFO: renamed from: i25$a */
    public class RunnableC7113a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final x5e f45534a;

        public RunnableC7113a(x5e x5eVar) {
            this.f45534a = x5eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f45534a.getLock()) {
                synchronized (i25.this) {
                    try {
                        if (i25.this.f45522a.m12745b(this.f45534a)) {
                            i25.this.m12733b(this.f45534a);
                        }
                        i25.this.m12736e();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i25$b */
    public class RunnableC7114b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final x5e f45536a;

        public RunnableC7114b(x5e x5eVar) {
            this.f45536a = x5eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f45536a.getLock()) {
                synchronized (i25.this) {
                    try {
                        if (i25.this.f45522a.m12745b(this.f45536a)) {
                            i25.this.f45525b2.m16580a();
                            i25.this.m12734c(this.f45536a);
                            i25.this.m12743l(this.f45536a);
                        }
                        i25.this.m12736e();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i25$c */
    @fdi
    public static class C7115c {
        public <R> m25<R> build(t5e<R> t5eVar, boolean z, eq8 eq8Var, m25.InterfaceC9104a interfaceC9104a) {
            return new m25<>(t5eVar, z, true, eq8Var, interfaceC9104a);
        }
    }

    /* JADX INFO: renamed from: i25$d */
    public static final class C7116d {

        /* JADX INFO: renamed from: a */
        public final x5e f45538a;

        /* JADX INFO: renamed from: b */
        public final Executor f45539b;

        public C7116d(x5e x5eVar, Executor executor) {
            this.f45538a = x5eVar;
            this.f45539b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C7116d) {
                return this.f45538a.equals(((C7116d) obj).f45538a);
            }
            return false;
        }

        public int hashCode() {
            return this.f45538a.hashCode();
        }
    }

    /* JADX INFO: renamed from: i25$e */
    public static final class C7117e implements Iterable<C7116d> {

        /* JADX INFO: renamed from: a */
        public final List<C7116d> f45540a;

        public C7117e() {
            this(new ArrayList(2));
        }

        private static C7116d defaultCallbackAndExecutor(x5e x5eVar) {
            return new C7116d(x5eVar, y85.directExecutor());
        }

        /* JADX INFO: renamed from: a */
        public void m12744a(x5e x5eVar, Executor executor) {
            this.f45540a.add(new C7116d(x5eVar, executor));
        }

        /* JADX INFO: renamed from: b */
        public boolean m12745b(x5e x5eVar) {
            return this.f45540a.contains(defaultCallbackAndExecutor(x5eVar));
        }

        /* JADX INFO: renamed from: c */
        public C7117e m12746c() {
            return new C7117e(new ArrayList(this.f45540a));
        }

        public void clear() {
            this.f45540a.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m12747d(x5e x5eVar) {
            this.f45540a.remove(defaultCallbackAndExecutor(x5eVar));
        }

        public boolean isEmpty() {
            return this.f45540a.isEmpty();
        }

        @Override // java.lang.Iterable
        @efb
        public Iterator<C7116d> iterator() {
            return this.f45540a.iterator();
        }

        public int size() {
            return this.f45540a.size();
        }

        public C7117e(List<C7116d> list) {
            this.f45540a = list;
        }
    }

    public i25(b77 b77Var, b77 b77Var2, b77 b77Var3, b77 b77Var4, j25 j25Var, m25.InterfaceC9104a interfaceC9104a, p4d.InterfaceC10791a<i25<?>> interfaceC10791a) {
        this(b77Var, b77Var2, b77Var3, b77Var4, j25Var, interfaceC9104a, interfaceC10791a, f45508f2);
    }

    private b77 getActiveSourceExecutor() {
        return this.f45516Q ? this.f45510F : this.f45518X ? this.f45511H : this.f45509C;
    }

    private boolean isDone() {
        return this.f45523a2 || this.f45517V1 || this.f45529d2;
    }

    private synchronized void release() {
        if (this.f45513M == null) {
            throw new IllegalArgumentException();
        }
        this.f45522a.clear();
        this.f45513M = null;
        this.f45525b2 = null;
        this.f45520Z = null;
        this.f45523a2 = false;
        this.f45529d2 = false;
        this.f45517V1 = false;
        this.f45531e2 = false;
        this.f45527c2.m10974c(false);
        this.f45527c2 = null;
        this.f45521Z1 = null;
        this.f45514M1 = null;
        this.f45528d.release(this);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m12732a(x5e x5eVar, Executor executor) {
        try {
            this.f45524b.throwIfRecycled();
            this.f45522a.m12744a(x5eVar, executor);
            if (this.f45517V1) {
                m12737f(1);
                executor.execute(new RunnableC7114b(x5eVar));
            } else if (this.f45523a2) {
                m12737f(1);
                executor.execute(new RunnableC7113a(x5eVar));
            } else {
                t7d.checkArgument(!this.f45529d2, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @xc7("this")
    /* JADX INFO: renamed from: b */
    public void m12733b(x5e x5eVar) {
        try {
            x5eVar.onLoadFailed(this.f45521Z1);
        } catch (Throwable th) {
            throw new ho1(th);
        }
    }

    @xc7("this")
    /* JADX INFO: renamed from: c */
    public void m12734c(x5e x5eVar) {
        try {
            x5eVar.onResourceReady(this.f45525b2, this.f45514M1, this.f45531e2);
        } catch (Throwable th) {
            throw new ho1(th);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m12735d() {
        if (isDone()) {
            return;
        }
        this.f45529d2 = true;
        this.f45527c2.cancel();
        this.f45532f.onEngineJobCancelled(this, this.f45513M);
    }

    /* JADX INFO: renamed from: e */
    public void m12736e() {
        m25<?> m25Var;
        synchronized (this) {
            try {
                this.f45524b.throwIfRecycled();
                t7d.checkArgument(isDone(), "Not yet complete!");
                int iDecrementAndGet = this.f45512L.decrementAndGet();
                t7d.checkArgument(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    m25Var = this.f45525b2;
                    release();
                } else {
                    m25Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m25Var != null) {
            m25Var.m16583d();
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m12737f(int i) {
        m25<?> m25Var;
        t7d.checkArgument(isDone(), "Not yet complete!");
        if (this.f45512L.getAndAdd(i) == 0 && (m25Var = this.f45525b2) != null) {
            m25Var.m16580a();
        }
    }

    @fdi
    /* JADX INFO: renamed from: g */
    public synchronized i25<R> m12738g(eq8 eq8Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f45513M = eq8Var;
        this.f45515N = z;
        this.f45516Q = z2;
        this.f45518X = z3;
        this.f45519Y = z4;
        return this;
    }

    @Override // p000.ko5.InterfaceC8472f
    @efb
    public b3g getVerifier() {
        return this.f45524b;
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m12739h() {
        return this.f45529d2;
    }

    /* JADX INFO: renamed from: i */
    public void m12740i() {
        synchronized (this) {
            try {
                this.f45524b.throwIfRecycled();
                if (this.f45529d2) {
                    release();
                    return;
                }
                if (this.f45522a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f45523a2) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f45523a2 = true;
                eq8 eq8Var = this.f45513M;
                C7117e c7117eM12746c = this.f45522a.m12746c();
                m12737f(c7117eM12746c.size() + 1);
                this.f45532f.onEngineJobComplete(this, eq8Var, null);
                for (C7116d c7116d : c7117eM12746c) {
                    c7116d.f45539b.execute(new RunnableC7113a(c7116d.f45538a));
                }
                m12736e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public void m12741j() {
        synchronized (this) {
            try {
                this.f45524b.throwIfRecycled();
                if (this.f45529d2) {
                    this.f45520Z.recycle();
                    release();
                    return;
                }
                if (this.f45522a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f45517V1) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f45525b2 = this.f45530e.build(this.f45520Z, this.f45515N, this.f45513M, this.f45526c);
                this.f45517V1 = true;
                C7117e c7117eM12746c = this.f45522a.m12746c();
                m12737f(c7117eM12746c.size() + 1);
                this.f45532f.onEngineJobComplete(this, this.f45513M, this.f45525b2);
                for (C7116d c7116d : c7117eM12746c) {
                    c7116d.f45539b.execute(new RunnableC7114b(c7116d.f45538a));
                }
                m12736e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m12742k() {
        return this.f45519Y;
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m12743l(x5e x5eVar) {
        try {
            this.f45524b.throwIfRecycled();
            this.f45522a.m12747d(x5eVar);
            if (this.f45522a.isEmpty()) {
                m12735d();
                if (this.f45517V1 || this.f45523a2) {
                    if (this.f45512L.get() == 0) {
                        release();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.fl3.InterfaceC5871b
    public void onLoadFailed(a77 a77Var) {
        synchronized (this) {
            this.f45521Z1 = a77Var;
        }
        m12740i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.fl3.InterfaceC5871b
    public void onResourceReady(t5e<R> t5eVar, hh3 hh3Var, boolean z) {
        synchronized (this) {
            this.f45520Z = t5eVar;
            this.f45514M1 = hh3Var;
            this.f45531e2 = z;
        }
        m12741j();
    }

    @Override // p000.fl3.InterfaceC5871b
    public void reschedule(fl3<?> fl3Var) {
        getActiveSourceExecutor().execute(fl3Var);
    }

    public synchronized void start(fl3<R> fl3Var) {
        try {
            this.f45527c2 = fl3Var;
            (fl3Var.m10975d() ? this.f45533m : getActiveSourceExecutor()).execute(fl3Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @fdi
    public i25(b77 b77Var, b77 b77Var2, b77 b77Var3, b77 b77Var4, j25 j25Var, m25.InterfaceC9104a interfaceC9104a, p4d.InterfaceC10791a<i25<?>> interfaceC10791a, C7115c c7115c) {
        this.f45522a = new C7117e();
        this.f45524b = b3g.newInstance();
        this.f45512L = new AtomicInteger();
        this.f45533m = b77Var;
        this.f45509C = b77Var2;
        this.f45510F = b77Var3;
        this.f45511H = b77Var4;
        this.f45532f = j25Var;
        this.f45526c = interfaceC9104a;
        this.f45528d = interfaceC10791a;
        this.f45530e = c7115c;
    }
}
