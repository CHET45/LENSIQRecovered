package p000;

import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.C2473f;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.aaf;
import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
public class eh4 extends q8b {

    /* JADX INFO: renamed from: A */
    public static final String f32974A;

    /* JADX INFO: renamed from: B */
    public static final String f32975B;

    /* JADX INFO: renamed from: C */
    public static final String f32976C;

    /* JADX INFO: renamed from: D */
    @gdi
    public static final String f32977D = "networkaddress.cache.ttl";

    /* JADX INFO: renamed from: E */
    @gdi
    public static final long f32978E = 30;

    /* JADX INFO: renamed from: F */
    @gdi
    public static boolean f32979F = false;

    /* JADX INFO: renamed from: G */
    @gdi
    public static boolean f32980G = false;

    /* JADX INFO: renamed from: H */
    @gdi
    public static boolean f32981H = false;

    /* JADX INFO: renamed from: I */
    public static final InterfaceC5306g f32982I;

    /* JADX INFO: renamed from: J */
    public static String f32983J = null;

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ boolean f32984K = false;

    /* JADX INFO: renamed from: x */
    public static final String f32990x = "grpc_config=";

    /* JADX INFO: renamed from: z */
    public static final String f32992z = "_grpc_config.";

    /* JADX INFO: renamed from: a */
    @gdi
    public final rid f32993a;

    /* JADX INFO: renamed from: b */
    public final Random f32994b = new Random();

    /* JADX INFO: renamed from: c */
    public volatile InterfaceC5301b f32995c = EnumC5303d.INSTANCE;

    /* JADX INFO: renamed from: d */
    public final AtomicReference<InterfaceC5305f> f32996d = new AtomicReference<>();

    /* JADX INFO: renamed from: e */
    public final String f32997e;

    /* JADX INFO: renamed from: f */
    public final String f32998f;

    /* JADX INFO: renamed from: g */
    public final int f32999g;

    /* JADX INFO: renamed from: h */
    public final aaf.InterfaceC0124d<Executor> f33000h;

    /* JADX INFO: renamed from: i */
    public final long f33001i;

    /* JADX INFO: renamed from: j */
    public final thg f33002j;

    /* JADX INFO: renamed from: k */
    public final d5g f33003k;

    /* JADX INFO: renamed from: l */
    public boolean f33004l;

    /* JADX INFO: renamed from: m */
    public boolean f33005m;

    /* JADX INFO: renamed from: n */
    public Executor f33006n;

    /* JADX INFO: renamed from: o */
    public final boolean f33007o;

    /* JADX INFO: renamed from: p */
    public final q8b.AbstractC11379i f33008p;

    /* JADX INFO: renamed from: q */
    public boolean f33009q;

    /* JADX INFO: renamed from: r */
    public q8b.AbstractC11375e f33010r;

    /* JADX INFO: renamed from: s */
    public static final Logger f32985s = Logger.getLogger(eh4.class.getName());

    /* JADX INFO: renamed from: t */
    public static final String f32986t = "clientLanguage";

    /* JADX INFO: renamed from: u */
    public static final String f32987u = "percentage";

    /* JADX INFO: renamed from: v */
    public static final String f32988v = "clientHostname";

    /* JADX INFO: renamed from: w */
    public static final String f32989w = "serviceConfig";

    /* JADX INFO: renamed from: y */
    public static final Set<String> f32991y = Collections.unmodifiableSet(new HashSet(Arrays.asList(f32986t, f32987u, f32988v, f32989w)));

    /* JADX INFO: renamed from: eh4$b */
    @gdi
    public interface InterfaceC5301b {
        List<InetAddress> resolveAddress(String str) throws Exception;
    }

    /* JADX INFO: renamed from: eh4$c */
    public static final class C5302c {

        /* JADX INFO: renamed from: a */
        public n4g f33011a;

        /* JADX INFO: renamed from: b */
        public List<s45> f33012b;

        /* JADX INFO: renamed from: c */
        public q8b.C11373c f33013c;

        /* JADX INFO: renamed from: d */
        public sc0 f33014d;

        private C5302c() {
        }
    }

    /* JADX INFO: renamed from: eh4$d */
    public enum EnumC5303d implements InterfaceC5301b {
        INSTANCE;

        @Override // p000.eh4.InterfaceC5301b
        public List<InetAddress> resolveAddress(String str) throws UnknownHostException {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* JADX INFO: renamed from: eh4$e */
    public final class RunnableC5304e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final q8b.AbstractC11375e f33017a;

        /* JADX INFO: renamed from: eh4$e$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ boolean f33019a;

            public a(boolean z) {
                this.f33019a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f33019a) {
                    eh4 eh4Var = eh4.this;
                    eh4Var.f33004l = true;
                    if (eh4Var.f33001i > 0) {
                        eh4.this.f33003k.reset().start();
                    }
                }
                eh4.this.f33009q = false;
            }
        }

        public RunnableC5304e(q8b.AbstractC11375e abstractC11375e) {
            this.f33017a = (q8b.AbstractC11375e) v7d.checkNotNull(abstractC11375e, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            thg thgVar;
            a aVar;
            Logger logger = eh4.f32985s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                eh4.f32985s.finer("Attempting DNS resolution of " + eh4.this.f32998f);
            }
            C5302c c5302cM9963h = null;
            try {
                try {
                    s45 s45VarDetectProxy = eh4.this.detectProxy();
                    q8b.C11377g.a aVarNewBuilder = q8b.C11377g.newBuilder();
                    if (s45VarDetectProxy != null) {
                        if (eh4.f32985s.isLoggable(level)) {
                            eh4.f32985s.finer("Using proxy address " + s45VarDetectProxy);
                        }
                        aVarNewBuilder.setAddresses(Collections.singletonList(s45VarDetectProxy));
                    } else {
                        c5302cM9963h = eh4.this.m9963h(false);
                        if (c5302cM9963h.f33011a != null) {
                            this.f33017a.onError(c5302cM9963h.f33011a);
                            eh4.this.f33002j.execute(new a(c5302cM9963h != null && c5302cM9963h.f33011a == null));
                            return;
                        }
                        if (c5302cM9963h.f33012b != null) {
                            aVarNewBuilder.setAddresses(c5302cM9963h.f33012b);
                        }
                        if (c5302cM9963h.f33013c != null) {
                            aVarNewBuilder.setServiceConfig(c5302cM9963h.f33013c);
                        }
                        sc0 sc0Var = c5302cM9963h.f33014d;
                        if (sc0Var != null) {
                            aVarNewBuilder.setAttributes(sc0Var);
                        }
                    }
                    this.f33017a.onResult(aVarNewBuilder.build());
                    z = c5302cM9963h != null && c5302cM9963h.f33011a == null;
                    thgVar = eh4.this.f33002j;
                    aVar = new a(z);
                } catch (IOException e) {
                    this.f33017a.onError(n4g.f63273t.withDescription("Unable to resolve host " + eh4.this.f32998f).withCause(e));
                    z = 0 != 0 && null.f33011a == null;
                    thgVar = eh4.this.f33002j;
                    aVar = new a(z);
                }
                thgVar.execute(aVar);
            } catch (Throwable th) {
                eh4.this.f33002j.execute(new a(0 != 0 && null.f33011a == null));
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: eh4$f */
    @gdi
    public interface InterfaceC5305f {
        List<C5307h> resolveSrv(String str) throws Exception;

        List<String> resolveTxt(String str) throws Exception;
    }

    /* JADX INFO: renamed from: eh4$g */
    public interface InterfaceC5306g {
        @eib
        InterfaceC5305f newResourceResolver();

        @eib
        Throwable unavailabilityCause();
    }

    /* JADX INFO: renamed from: eh4$h */
    @gdi
    public static final class C5307h {

        /* JADX INFO: renamed from: a */
        public final String f33021a;

        /* JADX INFO: renamed from: b */
        public final int f33022b;

        public C5307h(String str, int i) {
            this.f33021a = str;
            this.f33022b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5307h.class != obj.getClass()) {
                return false;
            }
            C5307h c5307h = (C5307h) obj;
            return this.f33022b == c5307h.f33022b && this.f33021a.equals(c5307h.f33021a);
        }

        public int hashCode() {
            return okb.hashCode(this.f33021a, Integer.valueOf(this.f33022b));
        }

        public String toString() {
            return yya.toStringHelper(this).add("host", this.f33021a).add("port", this.f33022b).toString();
        }
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f32974A = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f32975B = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f32976C = property3;
        f32979F = Boolean.parseBoolean(property);
        f32980G = Boolean.parseBoolean(property2);
        f32981H = Boolean.parseBoolean(property3);
        f32982I = m9958l(eh4.class.getClassLoader());
    }

    public eh4(@eib String str, String str2, q8b.C11372b c11372b, aaf.InterfaceC0124d<Executor> interfaceC0124d, d5g d5gVar, boolean z) {
        v7d.checkNotNull(c11372b, C2473f.f17565y);
        this.f33000h = interfaceC0124d;
        URI uriCreate = URI.create("//" + ((String) v7d.checkNotNull(str2, "name")));
        v7d.checkArgument(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
        this.f32997e = (String) v7d.checkNotNull(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f32998f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f32999g = c11372b.getDefaultPort();
        } else {
            this.f32999g = uriCreate.getPort();
        }
        this.f32993a = (rid) v7d.checkNotNull(c11372b.getProxyDetector(), "proxyDetector");
        this.f33001i = getNetworkAddressCacheTtlNanos(z);
        this.f33003k = (d5g) v7d.checkNotNull(d5gVar, NotificationCompat.CATEGORY_STOPWATCH);
        this.f33002j = (thg) v7d.checkNotNull(c11372b.getSynchronizationContext(), "syncContext");
        Executor offloadExecutor = c11372b.getOffloadExecutor();
        this.f33006n = offloadExecutor;
        this.f33007o = offloadExecutor == null;
        this.f33008p = (q8b.AbstractC11379i) v7d.checkNotNull(c11372b.getServiceConfigParser(), "serviceConfigParser");
    }

    private boolean cacheRefreshRequired() {
        if (this.f33004l) {
            long j = this.f33001i;
            if (j != 0 && (j <= 0 || this.f33003k.elapsed(TimeUnit.NANOSECONDS) <= this.f33001i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @eib
    public s45 detectProxy() throws IOException {
        qid qidVarProxyFor = this.f32993a.proxyFor(InetSocketAddress.createUnresolved(this.f32998f, this.f32999g));
        if (qidVarProxyFor != null) {
            return new s45(qidVarProxyFor);
        }
        return null;
    }

    @eib
    private static final List<String> getClientLanguagesFromChoice(Map<String, ?> map) {
        return ym8.getListOfStrings(map, f32986t);
    }

    @eib
    private static final List<String> getHostnamesFromChoice(Map<String, ?> map) {
        return ym8.getListOfStrings(map, f32988v);
    }

    private static String getLocalHostname() {
        if (f32983J == null) {
            try {
                f32983J = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return f32983J;
    }

    private static long getNetworkAddressCacheTtlNanos(boolean z) {
        if (z) {
            return 0L;
        }
        String property = System.getProperty(f32977D);
        long j = 30;
        if (property != null) {
            try {
                j = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f32985s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{f32977D, property, 30L});
            }
        }
        return j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
    }

    @eib
    private static final Double getPercentageFromChoice(Map<String, ?> map) {
        return ym8.getNumberAsDouble(map, f32987u);
    }

    @gdi
    @eib
    /* JADX INFO: renamed from: l */
    public static InterfaceC5306g m9958l(ClassLoader classLoader) {
        try {
            try {
                try {
                    InterfaceC5306g interfaceC5306g = (InterfaceC5306g) Class.forName("ij8", true, classLoader).asSubclass(InterfaceC5306g.class).getConstructor(null).newInstance(null);
                    if (interfaceC5306g.unavailabilityCause() == null) {
                        return interfaceC5306g;
                    }
                    f32985s.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", interfaceC5306g.unavailabilityCause());
                    return null;
                } catch (Exception e) {
                    f32985s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                    return null;
                }
            } catch (Exception e2) {
                f32985s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
                return null;
            }
        } catch (ClassCastException e3) {
            f32985s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
            return null;
        } catch (ClassNotFoundException e4) {
            f32985s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
            return null;
        }
    }

    @gdi
    @eib
    /* JADX INFO: renamed from: m */
    public static Map<String, ?> m9959m(Map<String, ?> map, Random random, String str) {
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            s4i.verify(f32991y.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List<String> clientLanguagesFromChoice = getClientLanguagesFromChoice(map);
        if (clientLanguagesFromChoice != null && !clientLanguagesFromChoice.isEmpty()) {
            Iterator<String> it = clientLanguagesFromChoice.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase(it.next())) {
                }
            }
            return null;
        }
        Double percentageFromChoice = getPercentageFromChoice(map);
        if (percentageFromChoice != null) {
            int iIntValue = percentageFromChoice.intValue();
            s4i.verify(iIntValue >= 0 && iIntValue <= 100, "Bad percentage: %s", percentageFromChoice);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List<String> hostnamesFromChoice = getHostnamesFromChoice(map);
        if (hostnamesFromChoice != null && !hostnamesFromChoice.isEmpty()) {
            Iterator<String> it2 = hostnamesFromChoice.iterator();
            while (it2.hasNext()) {
                if (it2.next().equals(str)) {
                }
            }
            return null;
        }
        Map<String, ?> object = ym8.getObject(map, f32989w);
        if (object != null) {
            return object;
        }
        throw new t4i(String.format("key '%s' missing in '%s'", map, f32989w));
    }

    @eib
    /* JADX INFO: renamed from: n */
    public static q8b.C11373c m9960n(List<String> list, Random random, String str) {
        try {
            Iterator<Map<String, ?>> it = m9961o(list).iterator();
            Map<String, ?> mapM9959m = null;
            while (it.hasNext()) {
                try {
                    mapM9959m = m9959m(it.next(), random, str);
                    if (mapM9959m != null) {
                        break;
                    }
                } catch (RuntimeException e) {
                    return q8b.C11373c.fromError(n4g.f63260g.withDescription("failed to pick service config choice").withCause(e));
                }
            }
            if (mapM9959m == null) {
                return null;
            }
            return q8b.C11373c.fromConfig(mapM9959m);
        } catch (IOException | RuntimeException e2) {
            return q8b.C11373c.fromError(n4g.f63260g.withDescription("failed to parse TXT records").withCause(e2));
        }
    }

    @gdi
    /* JADX INFO: renamed from: o */
    public static List<Map<String, ?>> m9961o(List<String> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith(f32990x)) {
                Object obj = dm8.parse(str.substring(12));
                if (!(obj instanceof List)) {
                    throw new ClassCastException("wrong type " + obj);
                }
                arrayList.addAll(ym8.checkObjectList((List) obj));
            } else {
                f32985s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @gdi
    /* JADX INFO: renamed from: r */
    public static boolean m9962r(boolean z, boolean z2, String str) {
        if (!z) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z2;
        }
        if (str.contains(g1i.f38277c)) {
            return false;
        }
        boolean z3 = true;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '.') {
                z3 &= cCharAt >= '0' && cCharAt <= '9';
            }
        }
        return true ^ z3;
    }

    private void resolve() {
        if (this.f33009q || this.f33005m || !cacheRefreshRequired()) {
            return;
        }
        this.f33009q = true;
        this.f33006n.execute(new RunnableC5304e(this.f33010r));
    }

    private List<s45> resolveAddresses() {
        Exception e = null;
        try {
            try {
                List<InetAddress> listResolveAddress = this.f32995c.resolveAddress(this.f32998f);
                ArrayList arrayList = new ArrayList(listResolveAddress.size());
                Iterator<InetAddress> it = listResolveAddress.iterator();
                while (it.hasNext()) {
                    arrayList.add(new s45(new InetSocketAddress(it.next(), this.f32999g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e2) {
                e = e2;
                bzg.throwIfUnchecked(e);
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (e != null) {
                f32985s.log(Level.FINE, "Address resolution failure", (Throwable) e);
            }
            throw th;
        }
    }

    @eib
    private q8b.C11373c resolveServiceConfig() {
        List<String> listEmptyList = Collections.emptyList();
        InterfaceC5305f interfaceC5305fM9966k = m9966k();
        if (interfaceC5305fM9966k != null) {
            try {
                listEmptyList = interfaceC5305fM9966k.resolveTxt(f32992z + this.f32998f);
            } catch (Exception e) {
                f32985s.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e);
            }
        }
        if (listEmptyList.isEmpty()) {
            f32985s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f32998f});
            return null;
        }
        q8b.C11373c c11373cM9960n = m9960n(listEmptyList, this.f32994b, getLocalHostname());
        if (c11373cM9960n == null) {
            return null;
        }
        if (c11373cM9960n.getError() != null) {
            return q8b.C11373c.fromError(c11373cM9960n.getError());
        }
        return this.f33008p.parseServiceConfig((Map) c11373cM9960n.getConfig());
    }

    @Override // p000.q8b
    public String getServiceAuthority() {
        return this.f32997e;
    }

    /* JADX INFO: renamed from: h */
    public C5302c m9963h(boolean z) {
        C5302c c5302c = new C5302c();
        try {
            c5302c.f33012b = resolveAddresses();
        } catch (Exception e) {
            if (!z) {
                c5302c.f33011a = n4g.f63273t.withDescription("Unable to resolve host " + this.f32998f).withCause(e);
                return c5302c;
            }
        }
        if (f32981H) {
            c5302c.f33013c = resolveServiceConfig();
        }
        return c5302c;
    }

    @gdi
    /* JADX INFO: renamed from: i */
    public String m9964i() {
        return this.f32998f;
    }

    /* JADX INFO: renamed from: j */
    public final int m9965j() {
        return this.f32999g;
    }

    @eib
    /* JADX INFO: renamed from: k */
    public InterfaceC5305f m9966k() {
        InterfaceC5306g interfaceC5306g;
        if (!m9962r(f32979F, f32980G, this.f32998f)) {
            return null;
        }
        InterfaceC5305f interfaceC5305f = this.f32996d.get();
        return (interfaceC5305f != null || (interfaceC5306g = f32982I) == null) ? interfaceC5305f : interfaceC5306g.newResourceResolver();
    }

    @gdi
    /* JADX INFO: renamed from: p */
    public void m9967p(InterfaceC5301b interfaceC5301b) {
        this.f32995c = interfaceC5301b;
    }

    @gdi
    /* JADX INFO: renamed from: q */
    public void m9968q(InterfaceC5305f interfaceC5305f) {
        this.f32996d.set(interfaceC5305f);
    }

    @Override // p000.q8b
    public void refresh() {
        v7d.checkState(this.f33010r != null, "not started");
        resolve();
    }

    @Override // p000.q8b
    public void shutdown() {
        if (this.f33005m) {
            return;
        }
        this.f33005m = true;
        Executor executor = this.f33006n;
        if (executor == null || !this.f33007o) {
            return;
        }
        this.f33006n = (Executor) aaf.release(this.f33000h, executor);
    }

    @Override // p000.q8b
    public void start(q8b.AbstractC11375e abstractC11375e) {
        v7d.checkState(this.f33010r == null, "already started");
        if (this.f33007o) {
            this.f33006n = (Executor) aaf.get(this.f33000h);
        }
        this.f33010r = (q8b.AbstractC11375e) v7d.checkNotNull(abstractC11375e, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        resolve();
    }
}
