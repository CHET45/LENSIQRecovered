package p000;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.tr9;
import p000.w4f;

/* JADX INFO: loaded from: classes7.dex */
@x98
@kyg
public final class ur9 {

    /* JADX INFO: renamed from: c */
    public static final Logger f88858c = Logger.getLogger(ur9.class.getName());

    /* JADX INFO: renamed from: d */
    public static ur9 f88859d;

    /* JADX INFO: renamed from: a */
    @vc7("this")
    public final LinkedHashSet<tr9> f88860a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b */
    @vc7("this")
    public List<tr9> f88861b = Collections.emptyList();

    /* JADX INFO: renamed from: ur9$a */
    public class C13667a implements Comparator<tr9> {
        public C13667a() {
        }

        @Override // java.util.Comparator
        public int compare(tr9 tr9Var, tr9 tr9Var2) {
            return tr9Var.priority() - tr9Var2.priority();
        }
    }

    /* JADX INFO: renamed from: ur9$b */
    public static final class C13668b implements w4f.InterfaceC14388b<tr9> {
        private C13668b() {
        }

        public /* synthetic */ C13668b(C13667a c13667a) {
            this();
        }

        @Override // p000.w4f.InterfaceC14388b
        public int getPriority(tr9 tr9Var) {
            return tr9Var.priority();
        }

        @Override // p000.w4f.InterfaceC14388b
        public boolean isAvailable(tr9 tr9Var) {
            return tr9Var.isAvailable();
        }
    }

    /* JADX INFO: renamed from: ur9$c */
    public static final class C13669c extends RuntimeException {
        private static final long serialVersionUID = 1;

        public C13669c(String str) {
            super(str);
        }
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public static List<Class<?>> m23536a() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(h0c.class);
        } catch (ClassNotFoundException e) {
            f88858c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            f88858c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            f88858c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e3);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private synchronized void addProvider(tr9 tr9Var) {
        v7d.checkArgument(tr9Var.isAvailable(), "isAvailable() returned false");
        this.f88860a.add(tr9Var);
    }

    public static synchronized ur9 getDefaultRegistry() {
        try {
            if (f88859d == null) {
                List<tr9> listLoadAll = w4f.loadAll(tr9.class, m23536a(), tr9.class.getClassLoader(), new C13668b(null));
                f88859d = new ur9();
                for (tr9 tr9Var : listLoadAll) {
                    f88858c.fine("Service loader found " + tr9Var);
                    f88859d.addProvider(tr9Var);
                }
                f88859d.refreshProviders();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f88859d;
    }

    private synchronized void refreshProviders() {
        ArrayList arrayList = new ArrayList(this.f88860a);
        Collections.sort(arrayList, Collections.reverseOrder(new C13667a()));
        this.f88861b = Collections.unmodifiableList(arrayList);
    }

    @gdi
    /* JADX INFO: renamed from: b */
    public pr9<?> m23537b(t8b t8bVar, String str, eu1 eu1Var) {
        s8b providerForScheme;
        try {
            providerForScheme = t8bVar.getProviderForScheme(new URI(str).getScheme());
        } catch (URISyntaxException unused) {
            providerForScheme = null;
        }
        if (providerForScheme == null) {
            providerForScheme = t8bVar.getProviderForScheme(t8bVar.getDefaultScheme());
        }
        Collection<Class<? extends SocketAddress>> producedSocketAddressTypes = providerForScheme != null ? providerForScheme.getProducedSocketAddressTypes() : Collections.emptySet();
        if (m23540e().isEmpty()) {
            throw new C13669c("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
        }
        StringBuilder sb = new StringBuilder();
        for (tr9 tr9Var : m23540e()) {
            if (tr9Var.mo12062a().containsAll(producedSocketAddressTypes)) {
                tr9.C13176a c13176aNewChannelBuilder = tr9Var.newChannelBuilder(str, eu1Var);
                if (c13176aNewChannelBuilder.getChannelBuilder() != null) {
                    return c13176aNewChannelBuilder.getChannelBuilder();
                }
                sb.append("; ");
                sb.append(tr9Var.getClass().getName());
                sb.append(": ");
                sb.append(c13176aNewChannelBuilder.getError());
            } else {
                sb.append("; ");
                sb.append(tr9Var.getClass().getName());
                sb.append(": does not support 1 or more of ");
                sb.append(Arrays.toString(producedSocketAddressTypes.toArray()));
            }
        }
        throw new C13669c(sb.substring(2));
    }

    /* JADX INFO: renamed from: c */
    public pr9<?> m23538c(String str, eu1 eu1Var) {
        return m23537b(t8b.getDefaultRegistry(), str, eu1Var);
    }

    /* JADX INFO: renamed from: d */
    public tr9 m23539d() {
        List<tr9> listM23540e = m23540e();
        if (listM23540e.isEmpty()) {
            return null;
        }
        return listM23540e.get(0);
    }

    public synchronized void deregister(tr9 tr9Var) {
        this.f88860a.remove(tr9Var);
        refreshProviders();
    }

    @gdi
    /* JADX INFO: renamed from: e */
    public synchronized List<tr9> m23540e() {
        return this.f88861b;
    }

    public synchronized void register(tr9 tr9Var) {
        addProvider(tr9Var);
        refreshProviders();
    }
}
