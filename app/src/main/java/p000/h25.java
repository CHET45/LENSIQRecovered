package p000;

import android.util.Log;
import com.bumptech.glide.C2487c;
import com.bumptech.glide.Priority;
import java.util.Map;
import java.util.concurrent.Executor;
import p000.fl3;
import p000.gqa;
import p000.ko5;
import p000.le4;
import p000.m25;
import p000.p4d;

/* JADX INFO: loaded from: classes3.dex */
public class h25 implements j25, gqa.InterfaceC6464a, m25.InterfaceC9104a {

    /* JADX INFO: renamed from: j */
    public static final int f42066j = 150;

    /* JADX INFO: renamed from: a */
    public final uj8 f42068a;

    /* JADX INFO: renamed from: b */
    public final l25 f42069b;

    /* JADX INFO: renamed from: c */
    public final gqa f42070c;

    /* JADX INFO: renamed from: d */
    public final C6682b f42071d;

    /* JADX INFO: renamed from: e */
    public final u6e f42072e;

    /* JADX INFO: renamed from: f */
    public final C6683c f42073f;

    /* JADX INFO: renamed from: g */
    public final C6681a f42074g;

    /* JADX INFO: renamed from: h */
    public final C0093a9 f42075h;

    /* JADX INFO: renamed from: i */
    public static final String f42065i = "Engine";

    /* JADX INFO: renamed from: k */
    public static final boolean f42067k = Log.isLoggable(f42065i, 2);

    /* JADX INFO: renamed from: h25$a */
    @fdi
    public static class C6681a {

        /* JADX INFO: renamed from: a */
        public final fl3.InterfaceC5874e f42076a;

        /* JADX INFO: renamed from: b */
        public final p4d.InterfaceC10791a<fl3<?>> f42077b = ko5.threadSafe(150, new a());

        /* JADX INFO: renamed from: c */
        public int f42078c;

        /* JADX INFO: renamed from: h25$a$a */
        public class a implements ko5.InterfaceC8470d<fl3<?>> {
            public a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ko5.InterfaceC8470d
            public fl3<?> create() {
                C6681a c6681a = C6681a.this;
                return new fl3<>(c6681a.f42076a, c6681a.f42077b);
            }
        }

        public C6681a(fl3.InterfaceC5874e interfaceC5874e) {
            this.f42076a = interfaceC5874e;
        }

        /* JADX INFO: renamed from: a */
        public <R> fl3<R> m12083a(C2487c c2487c, Object obj, k25 k25Var, eq8 eq8Var, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, ne4 ne4Var, Map<Class<?>, ceh<?>> map, boolean z, boolean z2, boolean z3, i7c i7cVar, fl3.InterfaceC5871b<R> interfaceC5871b) {
            fl3 fl3Var = (fl3) t7d.checkNotNull(this.f42077b.acquire());
            int i3 = this.f42078c;
            this.f42078c = i3 + 1;
            return fl3Var.m10972a(c2487c, obj, k25Var, eq8Var, i, i2, cls, cls2, priority, ne4Var, map, z, z2, z3, i7cVar, interfaceC5871b, i3);
        }
    }

    /* JADX INFO: renamed from: h25$b */
    @fdi
    public static class C6682b {

        /* JADX INFO: renamed from: a */
        public final b77 f42080a;

        /* JADX INFO: renamed from: b */
        public final b77 f42081b;

        /* JADX INFO: renamed from: c */
        public final b77 f42082c;

        /* JADX INFO: renamed from: d */
        public final b77 f42083d;

        /* JADX INFO: renamed from: e */
        public final j25 f42084e;

        /* JADX INFO: renamed from: f */
        public final m25.InterfaceC9104a f42085f;

        /* JADX INFO: renamed from: g */
        public final p4d.InterfaceC10791a<i25<?>> f42086g = ko5.threadSafe(150, new a());

        /* JADX INFO: renamed from: h25$b$a */
        public class a implements ko5.InterfaceC8470d<i25<?>> {
            public a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p000.ko5.InterfaceC8470d
            public i25<?> create() {
                C6682b c6682b = C6682b.this;
                return new i25<>(c6682b.f42080a, c6682b.f42081b, c6682b.f42082c, c6682b.f42083d, c6682b.f42084e, c6682b.f42085f, c6682b.f42086g);
            }
        }

        public C6682b(b77 b77Var, b77 b77Var2, b77 b77Var3, b77 b77Var4, j25 j25Var, m25.InterfaceC9104a interfaceC9104a) {
            this.f42080a = b77Var;
            this.f42081b = b77Var2;
            this.f42082c = b77Var3;
            this.f42083d = b77Var4;
            this.f42084e = j25Var;
            this.f42085f = interfaceC9104a;
        }

        /* JADX INFO: renamed from: a */
        public <R> i25<R> m12084a(eq8 eq8Var, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((i25) t7d.checkNotNull(this.f42086g.acquire())).m12738g(eq8Var, z, z2, z3, z4);
        }

        @fdi
        /* JADX INFO: renamed from: b */
        public void m12085b() {
            y85.shutdownAndAwaitTermination(this.f42080a);
            y85.shutdownAndAwaitTermination(this.f42081b);
            y85.shutdownAndAwaitTermination(this.f42082c);
            y85.shutdownAndAwaitTermination(this.f42083d);
        }
    }

    /* JADX INFO: renamed from: h25$c */
    public static class C6683c implements fl3.InterfaceC5874e {

        /* JADX INFO: renamed from: a */
        public final le4.InterfaceC8783a f42088a;

        /* JADX INFO: renamed from: b */
        public volatile le4 f42089b;

        public C6683c(le4.InterfaceC8783a interfaceC8783a) {
            this.f42088a = interfaceC8783a;
        }

        @fdi
        /* JADX INFO: renamed from: a */
        public synchronized void m12086a() {
            if (this.f42089b == null) {
                return;
            }
            this.f42089b.clear();
        }

        @Override // p000.fl3.InterfaceC5874e
        public le4 getDiskCache() {
            if (this.f42089b == null) {
                synchronized (this) {
                    try {
                        if (this.f42089b == null) {
                            this.f42089b = this.f42088a.build();
                        }
                        if (this.f42089b == null) {
                            this.f42089b = new me4();
                        }
                    } finally {
                    }
                }
            }
            return this.f42089b;
        }
    }

    /* JADX INFO: renamed from: h25$d */
    public class C6684d {

        /* JADX INFO: renamed from: a */
        public final i25<?> f42090a;

        /* JADX INFO: renamed from: b */
        public final x5e f42091b;

        public C6684d(x5e x5eVar, i25<?> i25Var) {
            this.f42091b = x5eVar;
            this.f42090a = i25Var;
        }

        public void cancel() {
            synchronized (h25.this) {
                this.f42090a.m12743l(this.f42091b);
            }
        }
    }

    public h25(gqa gqaVar, le4.InterfaceC8783a interfaceC8783a, b77 b77Var, b77 b77Var2, b77 b77Var3, b77 b77Var4, boolean z) {
        this(gqaVar, interfaceC8783a, b77Var, b77Var2, b77Var3, b77Var4, null, null, null, null, null, null, z);
    }

    private m25<?> getEngineResourceFromCache(eq8 eq8Var) {
        t5e<?> t5eVarRemove = this.f42070c.remove(eq8Var);
        if (t5eVarRemove == null) {
            return null;
        }
        return t5eVarRemove instanceof m25 ? (m25) t5eVarRemove : new m25<>(t5eVarRemove, true, true, eq8Var, this);
    }

    @hib
    private m25<?> loadFromActiveResources(eq8 eq8Var) {
        m25<?> m25VarM196e = this.f42075h.m196e(eq8Var);
        if (m25VarM196e != null) {
            m25VarM196e.m16580a();
        }
        return m25VarM196e;
    }

    private m25<?> loadFromCache(eq8 eq8Var) {
        m25<?> engineResourceFromCache = getEngineResourceFromCache(eq8Var);
        if (engineResourceFromCache != null) {
            engineResourceFromCache.m16580a();
            this.f42075h.m192a(eq8Var, engineResourceFromCache);
        }
        return engineResourceFromCache;
    }

    @hib
    private m25<?> loadFromMemory(k25 k25Var, boolean z, long j) {
        if (!z) {
            return null;
        }
        m25<?> m25VarLoadFromActiveResources = loadFromActiveResources(k25Var);
        if (m25VarLoadFromActiveResources != null) {
            if (f42067k) {
                logWithTimeAndKey("Loaded resource from active resources", j, k25Var);
            }
            return m25VarLoadFromActiveResources;
        }
        m25<?> m25VarLoadFromCache = loadFromCache(k25Var);
        if (m25VarLoadFromCache == null) {
            return null;
        }
        if (f42067k) {
            logWithTimeAndKey("Loaded resource from cache", j, k25Var);
        }
        return m25VarLoadFromCache;
    }

    private static void logWithTimeAndKey(String str, long j, eq8 eq8Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(si9.getElapsedMillis(j));
        sb.append("ms, key: ");
        sb.append(eq8Var);
    }

    private <R> C6684d waitForExistingOrStartNewJob(C2487c c2487c, Object obj, eq8 eq8Var, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, ne4 ne4Var, Map<Class<?>, ceh<?>> map, boolean z, boolean z2, i7c i7cVar, boolean z3, boolean z4, boolean z5, boolean z6, x5e x5eVar, Executor executor, k25 k25Var, long j) {
        i25<?> i25VarM23383a = this.f42068a.m23383a(k25Var, z6);
        if (i25VarM23383a != null) {
            i25VarM23383a.m12732a(x5eVar, executor);
            if (f42067k) {
                logWithTimeAndKey("Added to existing load", j, k25Var);
            }
            return new C6684d(x5eVar, i25VarM23383a);
        }
        i25<R> i25VarM12084a = this.f42071d.m12084a(k25Var, z3, z4, z5, z6);
        fl3<R> fl3VarM12083a = this.f42074g.m12083a(c2487c, obj, k25Var, eq8Var, i, i2, cls, cls2, priority, ne4Var, map, z, z2, z6, i7cVar, i25VarM12084a);
        this.f42068a.m23385c(k25Var, i25VarM12084a);
        i25VarM12084a.m12732a(x5eVar, executor);
        i25VarM12084a.start(fl3VarM12083a);
        if (f42067k) {
            logWithTimeAndKey("Started new load", j, k25Var);
        }
        return new C6684d(x5eVar, i25VarM12084a);
    }

    public void clearDiskCache() {
        this.f42073f.getDiskCache().clear();
    }

    public <R> C6684d load(C2487c c2487c, Object obj, eq8 eq8Var, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, ne4 ne4Var, Map<Class<?>, ceh<?>> map, boolean z, boolean z2, i7c i7cVar, boolean z3, boolean z4, boolean z5, boolean z6, x5e x5eVar, Executor executor) {
        long logTime = f42067k ? si9.getLogTime() : 0L;
        k25 k25VarM15276a = this.f42069b.m15276a(obj, eq8Var, i, i2, map, cls, cls2, i7cVar);
        synchronized (this) {
            try {
                m25<?> m25VarLoadFromMemory = loadFromMemory(k25VarM15276a, z3, logTime);
                if (m25VarLoadFromMemory == null) {
                    return waitForExistingOrStartNewJob(c2487c, obj, eq8Var, i, i2, cls, cls2, priority, ne4Var, map, z, z2, i7cVar, z3, z4, z5, z6, x5eVar, executor, k25VarM15276a, logTime);
                }
                x5eVar.onResourceReady(m25VarLoadFromMemory, hh3.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.j25
    public synchronized void onEngineJobCancelled(i25<?> i25Var, eq8 eq8Var) {
        this.f42068a.m23386d(eq8Var, i25Var);
    }

    @Override // p000.j25
    public synchronized void onEngineJobComplete(i25<?> i25Var, eq8 eq8Var, m25<?> m25Var) {
        if (m25Var != null) {
            try {
                if (m25Var.m16582c()) {
                    this.f42075h.m192a(eq8Var, m25Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f42068a.m23386d(eq8Var, i25Var);
    }

    @Override // p000.m25.InterfaceC9104a
    public void onResourceReleased(eq8 eq8Var, m25<?> m25Var) {
        this.f42075h.m195d(eq8Var);
        if (m25Var.m16582c()) {
            this.f42070c.put(eq8Var, m25Var);
        } else {
            this.f42072e.m23116a(m25Var, false);
        }
    }

    @Override // p000.gqa.InterfaceC6464a
    public void onResourceRemoved(@efb t5e<?> t5eVar) {
        this.f42072e.m23116a(t5eVar, true);
    }

    public void release(t5e<?> t5eVar) {
        if (!(t5eVar instanceof m25)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((m25) t5eVar).m16583d();
    }

    @fdi
    public void shutdown() {
        this.f42071d.m12085b();
        this.f42073f.m12086a();
        this.f42075h.m199h();
    }

    @fdi
    public h25(gqa gqaVar, le4.InterfaceC8783a interfaceC8783a, b77 b77Var, b77 b77Var2, b77 b77Var3, b77 b77Var4, uj8 uj8Var, l25 l25Var, C0093a9 c0093a9, C6682b c6682b, C6681a c6681a, u6e u6eVar, boolean z) {
        this.f42070c = gqaVar;
        C6683c c6683c = new C6683c(interfaceC8783a);
        this.f42073f = c6683c;
        C0093a9 c0093a92 = c0093a9 == null ? new C0093a9(z) : c0093a9;
        this.f42075h = c0093a92;
        c0093a92.m198g(this);
        this.f42069b = l25Var == null ? new l25() : l25Var;
        this.f42068a = uj8Var == null ? new uj8() : uj8Var;
        this.f42071d = c6682b == null ? new C6682b(b77Var, b77Var2, b77Var3, b77Var4, this, this) : c6682b;
        this.f42074g = c6681a == null ? new C6681a(c6683c) : c6681a;
        this.f42072e = u6eVar == null ? new u6e() : u6eVar;
        gqaVar.setResourceRemovedListener(this);
    }
}
