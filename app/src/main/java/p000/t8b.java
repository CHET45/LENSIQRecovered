package p000;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.q8b;
import p000.w4f;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/4159")
@kyg
public final class t8b {

    /* JADX INFO: renamed from: e */
    public static final Logger f83980e = Logger.getLogger(t8b.class.getName());

    /* JADX INFO: renamed from: f */
    public static t8b f83981f = null;

    /* JADX INFO: renamed from: g */
    public static final String f83982g = "unknown";

    /* JADX INFO: renamed from: a */
    public final q8b.AbstractC11374d f83983a = new C12951b();

    /* JADX INFO: renamed from: b */
    @vc7("this")
    public String f83984b = "unknown";

    /* JADX INFO: renamed from: c */
    @vc7("this")
    public final LinkedHashSet<s8b> f83985c = new LinkedHashSet<>();

    /* JADX INFO: renamed from: d */
    @vc7("this")
    public ox7<String, s8b> f83986d = ox7.m19076of();

    /* JADX INFO: renamed from: t8b$b */
    public final class C12951b extends q8b.AbstractC11374d {
        private C12951b() {
        }

        @Override // p000.q8b.AbstractC11374d
        public String getDefaultScheme() {
            return t8b.this.getDefaultScheme();
        }

        @Override // p000.q8b.AbstractC11374d
        @eib
        public q8b newNameResolver(URI uri, q8b.C11372b c11372b) {
            s8b providerForScheme = t8b.this.getProviderForScheme(uri.getScheme());
            if (providerForScheme == null) {
                return null;
            }
            return providerForScheme.newNameResolver(uri, c11372b);
        }
    }

    /* JADX INFO: renamed from: t8b$c */
    public static final class C12952c implements w4f.InterfaceC14388b<s8b> {
        private C12952c() {
        }

        @Override // p000.w4f.InterfaceC14388b
        public int getPriority(s8b s8bVar) {
            return s8bVar.priority();
        }

        @Override // p000.w4f.InterfaceC14388b
        public boolean isAvailable(s8b s8bVar) {
            return s8bVar.mo10903b();
        }
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public static List<Class<?>> m22419a() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("fh4"));
        } catch (ClassNotFoundException e) {
            f83980e.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void addProvider(s8b s8bVar) {
        v7d.checkArgument(s8bVar.mo10903b(), "isAvailable() returned false");
        this.f83985c.add(s8bVar);
    }

    public static synchronized t8b getDefaultRegistry() {
        try {
            if (f83981f == null) {
                List<s8b> listLoadAll = w4f.loadAll(s8b.class, m22419a(), s8b.class.getClassLoader(), new C12952c());
                if (listLoadAll.isEmpty()) {
                    f83980e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f83981f = new t8b();
                for (s8b s8bVar : listLoadAll) {
                    f83980e.fine("Service loader found " + s8bVar);
                    f83981f.addProvider(s8bVar);
                }
                f83981f.refreshProviders();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f83981f;
    }

    private synchronized void refreshProviders() {
        try {
            HashMap map = new HashMap();
            String strM21775a = "unknown";
            int iPriority = Integer.MIN_VALUE;
            for (s8b s8bVar : this.f83985c) {
                String strM21775a2 = s8bVar.m21775a();
                s8b s8bVar2 = (s8b) map.get(strM21775a2);
                if (s8bVar2 == null || s8bVar2.priority() < s8bVar.priority()) {
                    map.put(strM21775a2, s8bVar);
                }
                if (iPriority < s8bVar.priority()) {
                    iPriority = s8bVar.priority();
                    strM21775a = s8bVar.m21775a();
                }
            }
            this.f83986d = ox7.copyOf((Map) map);
            this.f83984b = strM21775a;
        } catch (Throwable th) {
            throw th;
        }
    }

    public q8b.AbstractC11374d asFactory() {
        return this.f83983a;
    }

    @gdi
    /* JADX INFO: renamed from: b */
    public synchronized Map<String, s8b> m22420b() {
        return this.f83986d;
    }

    public synchronized void deregister(s8b s8bVar) {
        this.f83985c.remove(s8bVar);
        refreshProviders();
    }

    public synchronized String getDefaultScheme() {
        return this.f83984b;
    }

    public s8b getProviderForScheme(String str) {
        if (str == null) {
            return null;
        }
        return m22420b().get(str.toLowerCase(Locale.US));
    }

    public synchronized void register(s8b s8bVar) {
        addProvider(s8bVar);
        refreshProviders();
    }
}
