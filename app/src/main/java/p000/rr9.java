package p000;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.ii5;
import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
public final class rr9 extends pr9<rr9> {

    /* JADX INFO: renamed from: K */
    public static final String f79072K = "directaddress";

    /* JADX INFO: renamed from: M */
    @gdi
    public static final long f79074M = 30;

    /* JADX INFO: renamed from: S */
    public static final long f79080S = 16777216;

    /* JADX INFO: renamed from: T */
    public static final long f79081T = 1048576;

    /* JADX INFO: renamed from: U */
    public static final Method f79082U;

    /* JADX INFO: renamed from: A */
    @eib
    public rid f79083A;

    /* JADX INFO: renamed from: B */
    public boolean f79084B;

    /* JADX INFO: renamed from: C */
    public boolean f79085C;

    /* JADX INFO: renamed from: D */
    public boolean f79086D;

    /* JADX INFO: renamed from: E */
    public boolean f79087E;

    /* JADX INFO: renamed from: F */
    public boolean f79088F;

    /* JADX INFO: renamed from: G */
    public boolean f79089G;

    /* JADX INFO: renamed from: H */
    public boolean f79090H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC12216c f79091I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC12215b f79092J;

    /* JADX INFO: renamed from: a */
    public gkb<? extends Executor> f79093a;

    /* JADX INFO: renamed from: b */
    public gkb<? extends Executor> f79094b;

    /* JADX INFO: renamed from: c */
    public final List<d42> f79095c;

    /* JADX INFO: renamed from: d */
    public t8b f79096d;

    /* JADX INFO: renamed from: e */
    public final List<t42> f79097e;

    /* JADX INFO: renamed from: f */
    public final String f79098f;

    /* JADX INFO: renamed from: g */
    @eib
    public final eu1 f79099g;

    /* JADX INFO: renamed from: h */
    @eib
    public final pn1 f79100h;

    /* JADX INFO: renamed from: i */
    @eib
    public final SocketAddress f79101i;

    /* JADX INFO: renamed from: j */
    @eib
    public String f79102j;

    /* JADX INFO: renamed from: k */
    @eib
    public String f79103k;

    /* JADX INFO: renamed from: l */
    public String f79104l;

    /* JADX INFO: renamed from: m */
    public boolean f79105m;

    /* JADX INFO: renamed from: n */
    public bm3 f79106n;

    /* JADX INFO: renamed from: o */
    public ho2 f79107o;

    /* JADX INFO: renamed from: p */
    public long f79108p;

    /* JADX INFO: renamed from: q */
    public int f79109q;

    /* JADX INFO: renamed from: r */
    public int f79110r;

    /* JADX INFO: renamed from: s */
    public long f79111s;

    /* JADX INFO: renamed from: t */
    public long f79112t;

    /* JADX INFO: renamed from: u */
    public boolean f79113u;

    /* JADX INFO: renamed from: v */
    public da8 f79114v;

    /* JADX INFO: renamed from: w */
    public int f79115w;

    /* JADX INFO: renamed from: x */
    @eib
    public Map<String, ?> f79116x;

    /* JADX INFO: renamed from: y */
    public boolean f79117y;

    /* JADX INFO: renamed from: z */
    @eib
    public d21 f79118z;

    /* JADX INFO: renamed from: L */
    public static final Logger f79073L = Logger.getLogger(rr9.class.getName());

    /* JADX INFO: renamed from: N */
    @gdi
    public static final long f79075N = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: O */
    public static final long f79076O = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: P */
    public static final gkb<? extends Executor> f79077P = baf.forResource(oc7.f67129K);

    /* JADX INFO: renamed from: Q */
    public static final bm3 f79078Q = bm3.getDefaultInstance();

    /* JADX INFO: renamed from: R */
    public static final ho2 f79079R = ho2.getDefaultInstance();

    /* JADX INFO: renamed from: rr9$b */
    public interface InterfaceC12215b {
        int getDefaultPort();
    }

    /* JADX INFO: renamed from: rr9$c */
    public interface InterfaceC12216c {
        s42 buildClientTransportFactory();
    }

    /* JADX INFO: renamed from: rr9$d */
    public static class C12217d extends s8b {

        /* JADX INFO: renamed from: a */
        public final SocketAddress f79119a;

        /* JADX INFO: renamed from: b */
        public final String f79120b;

        /* JADX INFO: renamed from: c */
        public final Collection<Class<? extends SocketAddress>> f79121c;

        /* JADX INFO: renamed from: rr9$d$a */
        public class a extends q8b {
            public a() {
            }

            @Override // p000.q8b
            public String getServiceAuthority() {
                return C12217d.this.f79120b;
            }

            @Override // p000.q8b
            public void shutdown() {
            }

            @Override // p000.q8b
            public void start(q8b.AbstractC11375e abstractC11375e) {
                abstractC11375e.onResult(q8b.C11377g.newBuilder().setAddresses(Collections.singletonList(new s45(C12217d.this.f79119a))).setAttributes(sc0.f81180c).build());
            }
        }

        public C12217d(SocketAddress socketAddress, String str) {
            this.f79119a = socketAddress;
            this.f79120b = str;
            this.f79121c = Collections.singleton(socketAddress.getClass());
        }

        @Override // p000.s8b
        /* JADX INFO: renamed from: b */
        public boolean mo10903b() {
            return true;
        }

        @Override // p000.q8b.AbstractC11374d
        public String getDefaultScheme() {
            return rr9.f79072K;
        }

        @Override // p000.s8b
        public Collection<Class<? extends SocketAddress>> getProducedSocketAddressTypes() {
            return this.f79121c;
        }

        @Override // p000.q8b.AbstractC11374d
        public q8b newNameResolver(URI uri, q8b.C11372b c11372b) {
            return new a();
        }

        @Override // p000.s8b
        public int priority() {
            return 5;
        }
    }

    /* JADX INFO: renamed from: rr9$e */
    public static final class C12218e implements InterfaceC12215b {

        /* JADX INFO: renamed from: a */
        public final int f79123a;

        public C12218e(int i) {
            this.f79123a = i;
        }

        @Override // p000.rr9.InterfaceC12215b
        public int getDefaultPort() {
            return this.f79123a;
        }
    }

    /* JADX INFO: renamed from: rr9$f */
    public static final class C12219f implements InterfaceC12215b {
        private C12219f() {
        }

        @Override // p000.rr9.InterfaceC12215b
        public int getDefaultPort() {
            return 443;
        }
    }

    /* JADX INFO: renamed from: rr9$g */
    public static class C12220g implements InterfaceC12216c {
        @Override // p000.rr9.InterfaceC12216c
        public s42 buildClientTransportFactory() {
            throw new UnsupportedOperationException();
        }
    }

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            f79073L.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            declaredMethod = null;
        } catch (NoSuchMethodException e2) {
            f79073L.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            declaredMethod = null;
        }
        f79082U = declaredMethod;
    }

    public rr9(String str, InterfaceC12216c interfaceC12216c, @eib InterfaceC12215b interfaceC12215b) {
        this(str, null, null, interfaceC12216c, interfaceC12215b);
    }

    private static List<?> checkListEntryTypes(List<?> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof Map) {
                arrayList.add(checkMapEntryTypes((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(checkListEntryTypes((List) obj));
            } else if (obj instanceof String) {
                arrayList.add(obj);
            } else if (obj instanceof Double) {
                arrayList.add(obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("The entry '" + obj + "' is of type '" + obj.getClass() + "', which is not supported");
                }
                arrayList.add(obj);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @eib
    private static Map<String, ?> checkMapEntryTypes(@eib Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            v7d.checkArgument(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, checkMapEntryTypes((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, checkListEntryTypes((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Double) {
                linkedHashMap.put(str, value);
            } else {
                if (!(value instanceof Boolean)) {
                    throw new IllegalArgumentException("The value of the map entry '" + entry + "' is of type '" + value.getClass() + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public static String m21485d(SocketAddress socketAddress) {
        try {
            return new URI(f79072K, "", pj4.f71071b + socketAddress, null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @hh4("ClientTransportFactoryBuilder is required, use a constructor")
    public static pr9<?> forAddress(String str, int i) {
        throw new UnsupportedOperationException("ClientTransportFactoryBuilder is required, use a constructor");
    }

    @hh4("ClientTransportFactoryBuilder is required, use a constructor")
    public static pr9<?> forTarget(String str) {
        throw new UnsupportedOperationException("ClientTransportFactoryBuilder is required, use a constructor");
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public String m21486a(String str) {
        return this.f79084B ? str : oc7.checkAuthority(str);
    }

    /* JADX INFO: renamed from: b */
    public int m21487b() {
        return this.f79092J.getDefaultPort();
    }

    @Override // p000.pr9
    public or9 build() {
        return new sr9(new qr9(this, this.f79091I.buildClientTransportFactory(), new ii5.C7298a(), baf.forResource(oc7.f67129K), oc7.f67131M, m21488c(), q0h.f72713a));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    @p000.gdi
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<p000.d42> m21488c() {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<d42> r1 = r10.f79095c
            r0.<init>(r1)
            java.util.List r1 = p000.ua8.getClientInterceptors()
            r2 = 0
            if (r1 == 0) goto L13
            r0.addAll(r1)
            r1 = 1
            goto L14
        L13:
            r1 = r2
        L14:
            java.lang.String r3 = "Unable to apply census stats"
            r4 = 0
            if (r1 != 0) goto L5d
            boolean r5 = r10.f79085C
            if (r5 == 0) goto L5d
            java.lang.reflect.Method r5 = p000.rr9.f79082U
            if (r5 == 0) goto L57
            boolean r6 = r10.f79086D     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            boolean r7 = r10.f79087E     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            boolean r8 = r10.f79088F     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            boolean r9 = r10.f79089G     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7, r8, r9}     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            java.lang.Object r5 = r5.invoke(r4, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            d42 r5 = (p000.d42) r5     // Catch: java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            goto L58
        L44:
            r5 = move-exception
            goto L48
        L46:
            r5 = move-exception
            goto L50
        L48:
            java.util.logging.Logger r6 = p000.rr9.f79073L
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r3, r5)
            goto L57
        L50:
            java.util.logging.Logger r6 = p000.rr9.f79073L
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            r6.log(r7, r3, r5)
        L57:
            r5 = r4
        L58:
            if (r5 == 0) goto L5d
            r0.add(r2, r5)
        L5d:
            if (r1 != 0) goto La3
            boolean r1 = r10.f79090H
            if (r1 == 0) goto La3
            java.lang.String r1 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.IllegalAccessException -> L79 java.lang.NoSuchMethodException -> L7b java.lang.ClassNotFoundException -> L7d
            java.lang.String r5 = "getClientInterceptor"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r5, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.IllegalAccessException -> L79 java.lang.NoSuchMethodException -> L7b java.lang.ClassNotFoundException -> L7d
            java.lang.Object r1 = r1.invoke(r4, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.IllegalAccessException -> L79 java.lang.NoSuchMethodException -> L7b java.lang.ClassNotFoundException -> L7d
            d42 r1 = (p000.d42) r1     // Catch: java.lang.reflect.InvocationTargetException -> L77 java.lang.IllegalAccessException -> L79 java.lang.NoSuchMethodException -> L7b java.lang.ClassNotFoundException -> L7d
            r4 = r1
            goto L9e
        L77:
            r1 = move-exception
            goto L7f
        L79:
            r1 = move-exception
            goto L87
        L7b:
            r1 = move-exception
            goto L8f
        L7d:
            r1 = move-exception
            goto L97
        L7f:
            java.util.logging.Logger r5 = p000.rr9.f79073L
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r5.log(r6, r3, r1)
            goto L9e
        L87:
            java.util.logging.Logger r5 = p000.rr9.f79073L
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r5.log(r6, r3, r1)
            goto L9e
        L8f:
            java.util.logging.Logger r5 = p000.rr9.f79073L
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r5.log(r6, r3, r1)
            goto L9e
        L97:
            java.util.logging.Logger r5 = p000.rr9.f79073L
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            r5.log(r6, r3, r1)
        L9e:
            if (r4 == 0) goto La3
            r0.add(r2, r4)
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rr9.m21488c():java.util.List");
    }

    @Override // p000.pr9
    public /* bridge */ /* synthetic */ pr9 defaultServiceConfig(@eib Map map) {
        return defaultServiceConfig((Map<String, ?>) map);
    }

    public rr9 disableCheckAuthority() {
        this.f79084B = true;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public rr9 m21489e(t8b t8bVar) {
        this.f79096d = t8bVar;
        return this;
    }

    public rr9 enableCheckAuthority() {
        this.f79084B = false;
        return this;
    }

    public gkb<? extends Executor> getOffloadExecutorPool() {
        return this.f79094b;
    }

    @Override // p000.pr9
    public /* bridge */ /* synthetic */ pr9 intercept(List list) {
        return intercept((List<d42>) list);
    }

    public void setStatsEnabled(boolean z) {
        this.f79085C = z;
    }

    public void setStatsRecordFinishedRpcs(boolean z) {
        this.f79087E = z;
    }

    public void setStatsRecordRealTimeMetrics(boolean z) {
        this.f79088F = z;
    }

    public void setStatsRecordRetryMetrics(boolean z) {
        this.f79089G = z;
    }

    public void setStatsRecordStartedRpcs(boolean z) {
        this.f79086D = z;
    }

    public void setTracingEnabled(boolean z) {
        this.f79090H = z;
    }

    public rr9(String str, @eib eu1 eu1Var, @eib pn1 pn1Var, InterfaceC12216c interfaceC12216c, @eib InterfaceC12215b interfaceC12215b) {
        gkb<? extends Executor> gkbVar = f79077P;
        this.f79093a = gkbVar;
        this.f79094b = gkbVar;
        this.f79095c = new ArrayList();
        this.f79096d = t8b.getDefaultRegistry();
        this.f79097e = new ArrayList();
        this.f79104l = oc7.f67126H;
        this.f79106n = f79078Q;
        this.f79107o = f79079R;
        this.f79108p = f79075N;
        this.f79109q = 5;
        this.f79110r = 5;
        this.f79111s = f79080S;
        this.f79112t = 1048576L;
        this.f79113u = true;
        this.f79114v = da8.instance();
        this.f79117y = true;
        this.f79085C = true;
        this.f79086D = true;
        this.f79087E = true;
        this.f79088F = false;
        this.f79089G = true;
        this.f79090H = true;
        this.f79098f = (String) v7d.checkNotNull(str, "target");
        this.f79099g = eu1Var;
        this.f79100h = pn1Var;
        this.f79091I = (InterfaceC12216c) v7d.checkNotNull(interfaceC12216c, "clientTransportFactoryBuilder");
        this.f79101i = null;
        if (interfaceC12215b != null) {
            this.f79092J = interfaceC12215b;
        } else {
            this.f79092J = new C12219f();
        }
    }

    @Override // p000.pr9
    public rr9 addTransportFilter(t42 t42Var) {
        this.f79097e.add((t42) v7d.checkNotNull(t42Var, "transport filter"));
        return this;
    }

    @Override // p000.pr9
    public rr9 compressorRegistry(ho2 ho2Var) {
        if (ho2Var != null) {
            this.f79107o = ho2Var;
        } else {
            this.f79107o = f79079R;
        }
        return this;
    }

    @Override // p000.pr9
    public rr9 decompressorRegistry(bm3 bm3Var) {
        if (bm3Var != null) {
            this.f79106n = bm3Var;
        } else {
            this.f79106n = f79078Q;
        }
        return this;
    }

    @Override // p000.pr9
    public rr9 defaultLoadBalancingPolicy(String str) {
        SocketAddress socketAddress = this.f79101i;
        v7d.checkState(socketAddress == null, "directServerAddress is set (%s), which forbids the use of load-balancing policy", socketAddress);
        v7d.checkArgument(str != null, "policy cannot be null");
        this.f79104l = str;
        return this;
    }

    @Override // p000.pr9
    public rr9 defaultServiceConfig(@eib Map<String, ?> map) {
        this.f79116x = checkMapEntryTypes(map);
        return this;
    }

    @Override // p000.pr9
    public rr9 directExecutor() {
        return executor(xya.directExecutor());
    }

    @Override // p000.pr9
    public rr9 disableRetry() {
        this.f79113u = false;
        return this;
    }

    @Override // p000.pr9
    public rr9 disableServiceConfigLookUp() {
        this.f79117y = false;
        return this;
    }

    @Override // p000.pr9
    public rr9 enableRetry() {
        this.f79113u = true;
        return this;
    }

    @Override // p000.pr9
    public rr9 executor(Executor executor) {
        if (executor != null) {
            this.f79093a = new c26(executor);
        } else {
            this.f79093a = f79077P;
        }
        return this;
    }

    @Override // p000.pr9
    public rr9 idleTimeout(long j, TimeUnit timeUnit) {
        v7d.checkArgument(j > 0, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) >= 30) {
            this.f79108p = -1L;
        } else {
            this.f79108p = Math.max(timeUnit.toMillis(j), f79076O);
        }
        return this;
    }

    @Override // p000.pr9
    public rr9 maxHedgedAttempts(int i) {
        this.f79110r = i;
        return this;
    }

    @Override // p000.pr9
    public rr9 maxRetryAttempts(int i) {
        this.f79109q = i;
        return this;
    }

    @Override // p000.pr9
    public rr9 maxTraceEvents(int i) {
        v7d.checkArgument(i >= 0, "maxTraceEvents must be non-negative");
        this.f79115w = i;
        return this;
    }

    @Override // p000.pr9
    @Deprecated
    public rr9 nameResolverFactory(q8b.AbstractC11374d abstractC11374d) {
        SocketAddress socketAddress = this.f79101i;
        v7d.checkState(socketAddress == null, "directServerAddress is set (%s), which forbids the use of NameResolverFactory", socketAddress);
        if (abstractC11374d != null) {
            t8b t8bVar = new t8b();
            if (abstractC11374d instanceof s8b) {
                t8bVar.register((s8b) abstractC11374d);
            } else {
                t8bVar.register(new r8b(abstractC11374d));
            }
            this.f79096d = t8bVar;
        } else {
            this.f79096d = t8b.getDefaultRegistry();
        }
        return this;
    }

    @Override // p000.pr9
    public rr9 offloadExecutor(Executor executor) {
        if (executor != null) {
            this.f79094b = new c26(executor);
        } else {
            this.f79094b = f79077P;
        }
        return this;
    }

    @Override // p000.pr9
    public rr9 overrideAuthority(String str) {
        this.f79103k = m21486a(str);
        return this;
    }

    @Override // p000.pr9
    public rr9 perRpcBufferLimit(long j) {
        v7d.checkArgument(j > 0, "per RPC buffer limit must be positive");
        this.f79112t = j;
        return this;
    }

    @Override // p000.pr9
    public rr9 proxyDetector(@eib rid ridVar) {
        this.f79083A = ridVar;
        return this;
    }

    @Override // p000.pr9
    public rr9 retryBufferSize(long j) {
        v7d.checkArgument(j > 0, "retry buffer size must be positive");
        this.f79111s = j;
        return this;
    }

    @Override // p000.pr9
    public rr9 setBinaryLog(d21 d21Var) {
        this.f79118z = d21Var;
        return this;
    }

    @Override // p000.pr9
    public rr9 userAgent(@eib String str) {
        this.f79102j = str;
        return this;
    }

    @Override // p000.pr9
    public rr9 intercept(List<d42> list) {
        this.f79095c.addAll(list);
        return this;
    }

    @Override // p000.pr9
    public rr9 intercept(d42... d42VarArr) {
        return intercept(Arrays.asList(d42VarArr));
    }

    public rr9(SocketAddress socketAddress, String str, InterfaceC12216c interfaceC12216c, @eib InterfaceC12215b interfaceC12215b) {
        this(socketAddress, str, null, null, interfaceC12216c, interfaceC12215b);
    }

    public rr9(SocketAddress socketAddress, String str, @eib eu1 eu1Var, @eib pn1 pn1Var, InterfaceC12216c interfaceC12216c, @eib InterfaceC12215b interfaceC12215b) {
        gkb<? extends Executor> gkbVar = f79077P;
        this.f79093a = gkbVar;
        this.f79094b = gkbVar;
        this.f79095c = new ArrayList();
        this.f79096d = t8b.getDefaultRegistry();
        this.f79097e = new ArrayList();
        this.f79104l = oc7.f67126H;
        this.f79106n = f79078Q;
        this.f79107o = f79079R;
        this.f79108p = f79075N;
        this.f79109q = 5;
        this.f79110r = 5;
        this.f79111s = f79080S;
        this.f79112t = 1048576L;
        this.f79113u = true;
        this.f79114v = da8.instance();
        this.f79117y = true;
        this.f79085C = true;
        this.f79086D = true;
        this.f79087E = true;
        this.f79088F = false;
        this.f79089G = true;
        this.f79090H = true;
        this.f79098f = m21485d(socketAddress);
        this.f79099g = eu1Var;
        this.f79100h = pn1Var;
        this.f79091I = (InterfaceC12216c) v7d.checkNotNull(interfaceC12216c, "clientTransportFactoryBuilder");
        this.f79101i = socketAddress;
        t8b t8bVar = new t8b();
        t8bVar.register(new C12217d(socketAddress, str));
        this.f79096d = t8bVar;
        if (interfaceC12215b != null) {
            this.f79092J = interfaceC12215b;
        } else {
            this.f79092J = new C12219f();
        }
    }
}
