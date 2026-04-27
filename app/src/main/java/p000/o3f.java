package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.n3f;
import p000.w4f;

/* JADX INFO: loaded from: classes7.dex */
@x98
@kyg
public final class o3f {

    /* JADX INFO: renamed from: c */
    public static final Logger f66418c = Logger.getLogger(o3f.class.getName());

    /* JADX INFO: renamed from: d */
    public static o3f f66419d;

    /* JADX INFO: renamed from: a */
    @vc7("this")
    public final LinkedHashSet<n3f> f66420a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b */
    @vc7("this")
    public List<n3f> f66421b = Collections.emptyList();

    /* JADX INFO: renamed from: o3f$a */
    public class C10181a implements Comparator<n3f> {
        public C10181a() {
        }

        @Override // java.util.Comparator
        public int compare(n3f n3fVar, n3f n3fVar2) {
            return n3fVar.mo17767d() - n3fVar2.mo17767d();
        }
    }

    /* JADX INFO: renamed from: o3f$b */
    public static final class C10182b extends RuntimeException {
        private static final long serialVersionUID = 1;

        public C10182b(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: o3f$c */
    public static final class C10183c implements w4f.InterfaceC14388b<n3f> {
        private C10183c() {
        }

        public /* synthetic */ C10183c(C10181a c10181a) {
            this();
        }

        @Override // p000.w4f.InterfaceC14388b
        public int getPriority(n3f n3fVar) {
            return n3fVar.mo17767d();
        }

        @Override // p000.w4f.InterfaceC14388b
        public boolean isAvailable(n3f n3fVar) {
            return n3fVar.mo17765b();
        }
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public static List<Class<?>> m18335a() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(t0c.class);
        } catch (ClassNotFoundException e) {
            f66418c.log(Level.FINE, "Unable to find OkHttpServerProvider", (Throwable) e);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void addProvider(n3f n3fVar) {
        v7d.checkArgument(n3fVar.mo17765b(), "isAvailable() returned false");
        this.f66420a.add(n3fVar);
    }

    public static synchronized o3f getDefaultRegistry() {
        try {
            if (f66419d == null) {
                List<n3f> listLoadAll = w4f.loadAll(n3f.class, m18335a(), n3f.class.getClassLoader(), new C10183c(null));
                f66419d = new o3f();
                for (n3f n3fVar : listLoadAll) {
                    f66418c.fine("Service loader found " + n3fVar);
                    f66419d.addProvider(n3fVar);
                }
                f66419d.refreshProviders();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f66419d;
    }

    private synchronized void refreshProviders() {
        ArrayList arrayList = new ArrayList(this.f66420a);
        Collections.sort(arrayList, Collections.reverseOrder(new C10181a()));
        this.f66421b = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public v2f<?> m18336b(int i, e3f e3fVar) {
        if (m18338d().isEmpty()) {
            throw new C10182b("No functional server found. Try adding a dependency on the grpc-netty, grpc-netty-shaded, or grpc-okhttp artifact");
        }
        StringBuilder sb = new StringBuilder();
        for (n3f n3fVar : m18338d()) {
            n3f.C9682a c9682aMo17766c = n3fVar.mo17766c(i, e3fVar);
            if (c9682aMo17766c.getServerBuilder() != null) {
                return c9682aMo17766c.getServerBuilder();
            }
            sb.append("; ");
            sb.append(n3fVar.getClass().getName());
            sb.append(": ");
            sb.append(c9682aMo17766c.getError());
        }
        throw new C10182b(sb.substring(2));
    }

    /* JADX INFO: renamed from: c */
    public n3f m18337c() {
        List<n3f> listM18338d = m18338d();
        if (listM18338d.isEmpty()) {
            return null;
        }
        return listM18338d.get(0);
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public synchronized List<n3f> m18338d() {
        return this.f66421b;
    }

    public synchronized void deregister(n3f n3fVar) {
        this.f66420a.remove(n3fVar);
        refreshProviders();
    }

    public synchronized void register(n3f n3fVar) {
        addProvider(n3fVar);
        refreshProviders();
    }
}
