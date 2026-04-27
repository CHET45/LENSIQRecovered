package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.w4f;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1771")
@kyg
public final class bc9 {

    /* JADX INFO: renamed from: d */
    public static bc9 f13311d;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet<ac9> f13313a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap<String, ac9> f13314b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c */
    public static final Logger f13310c = Logger.getLogger(bc9.class.getName());

    /* JADX INFO: renamed from: e */
    public static final Iterable<Class<?>> f13312e = m3035a();

    /* JADX INFO: renamed from: bc9$a */
    public static final class C1829a implements w4f.InterfaceC14388b<ac9> {
        @Override // p000.w4f.InterfaceC14388b
        public int getPriority(ac9 ac9Var) {
            return ac9Var.getPriority();
        }

        @Override // p000.w4f.InterfaceC14388b
        public boolean isAvailable(ac9 ac9Var) {
            return ac9Var.isAvailable();
        }
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public static List<Class<?>> m3035a() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("ovc"));
        } catch (ClassNotFoundException e) {
            f13310c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("qte$a"));
        } catch (ClassNotFoundException e2) {
            f13310c.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void addProvider(ac9 ac9Var) {
        v7d.checkArgument(ac9Var.isAvailable(), "isAvailable() returned false");
        this.f13313a.add(ac9Var);
    }

    public static synchronized bc9 getDefaultRegistry() {
        try {
            if (f13311d == null) {
                List<ac9> listLoadAll = w4f.loadAll(ac9.class, f13312e, ac9.class.getClassLoader(), new C1829a());
                f13311d = new bc9();
                for (ac9 ac9Var : listLoadAll) {
                    f13310c.fine("Service loader found " + ac9Var);
                    f13311d.addProvider(ac9Var);
                }
                f13311d.refreshProviderMap();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13311d;
    }

    private synchronized void refreshProviderMap() {
        try {
            this.f13314b.clear();
            for (ac9 ac9Var : this.f13313a) {
                String policyName = ac9Var.getPolicyName();
                ac9 ac9Var2 = this.f13314b.get(policyName);
                if (ac9Var2 == null || ac9Var2.getPriority() < ac9Var.getPriority()) {
                    this.f13314b.put(policyName, ac9Var);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @gdi
    /* JADX INFO: renamed from: b */
    public synchronized Map<String, ac9> m3036b() {
        return new LinkedHashMap(this.f13314b);
    }

    public synchronized void deregister(ac9 ac9Var) {
        this.f13313a.remove(ac9Var);
        refreshProviderMap();
    }

    @eib
    public synchronized ac9 getProvider(String str) {
        return this.f13314b.get(v7d.checkNotNull(str, "policy"));
    }

    public synchronized void register(ac9 ac9Var) {
        addProvider(ac9Var);
        refreshProviderMap();
    }
}
