package p000;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes7.dex */
@lg5("https://github.com/grpc/grpc-java/issues/1770")
public abstract class q8b {

    /* JADX INFO: renamed from: q8b$a */
    public class C11371a extends AbstractC11375e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC11376f f73582a;

        public C11371a(InterfaceC11376f interfaceC11376f) {
            this.f73582a = interfaceC11376f;
        }

        @Override // p000.q8b.AbstractC11375e, p000.q8b.InterfaceC11376f
        public void onError(n4g n4gVar) {
            this.f73582a.onError(n4gVar);
        }

        @Override // p000.q8b.AbstractC11375e
        public void onResult(C11377g c11377g) {
            this.f73582a.onAddresses(c11377g.getAddresses(), c11377g.getAttributes());
        }
    }

    /* JADX INFO: renamed from: q8b$b */
    @lg5("https://github.com/grpc/grpc-java/issues/1770")
    public static final class C11372b {

        /* JADX INFO: renamed from: a */
        public final int f73584a;

        /* JADX INFO: renamed from: b */
        public final rid f73585b;

        /* JADX INFO: renamed from: c */
        public final thg f73586c;

        /* JADX INFO: renamed from: d */
        public final AbstractC11379i f73587d;

        /* JADX INFO: renamed from: e */
        @eib
        public final ScheduledExecutorService f73588e;

        /* JADX INFO: renamed from: f */
        @eib
        public final pu1 f73589f;

        /* JADX INFO: renamed from: g */
        @eib
        public final Executor f73590g;

        /* JADX INFO: renamed from: h */
        @eib
        public final String f73591h;

        /* JADX INFO: renamed from: q8b$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Integer f73592a;

            /* JADX INFO: renamed from: b */
            public rid f73593b;

            /* JADX INFO: renamed from: c */
            public thg f73594c;

            /* JADX INFO: renamed from: d */
            public AbstractC11379i f73595d;

            /* JADX INFO: renamed from: e */
            public ScheduledExecutorService f73596e;

            /* JADX INFO: renamed from: f */
            public pu1 f73597f;

            /* JADX INFO: renamed from: g */
            public Executor f73598g;

            /* JADX INFO: renamed from: h */
            public String f73599h;

            public C11372b build() {
                return new C11372b(this.f73592a, this.f73593b, this.f73594c, this.f73595d, this.f73596e, this.f73597f, this.f73598g, this.f73599h, null);
            }

            @lg5("https://github.com/grpc/grpc-java/issues/6438")
            public a setChannelLogger(pu1 pu1Var) {
                this.f73597f = (pu1) v7d.checkNotNull(pu1Var);
                return this;
            }

            public a setDefaultPort(int i) {
                this.f73592a = Integer.valueOf(i);
                return this;
            }

            public a setOffloadExecutor(Executor executor) {
                this.f73598g = executor;
                return this;
            }

            @lg5("https://github.com/grpc/grpc-java/issues/9406")
            public a setOverrideAuthority(String str) {
                this.f73599h = str;
                return this;
            }

            public a setProxyDetector(rid ridVar) {
                this.f73593b = (rid) v7d.checkNotNull(ridVar);
                return this;
            }

            @lg5("https://github.com/grpc/grpc-java/issues/6454")
            public a setScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
                this.f73596e = (ScheduledExecutorService) v7d.checkNotNull(scheduledExecutorService);
                return this;
            }

            public a setServiceConfigParser(AbstractC11379i abstractC11379i) {
                this.f73595d = (AbstractC11379i) v7d.checkNotNull(abstractC11379i);
                return this;
            }

            public a setSynchronizationContext(thg thgVar) {
                this.f73594c = (thg) v7d.checkNotNull(thgVar);
                return this;
            }
        }

        public /* synthetic */ C11372b(Integer num, rid ridVar, thg thgVar, AbstractC11379i abstractC11379i, ScheduledExecutorService scheduledExecutorService, pu1 pu1Var, Executor executor, String str, C11371a c11371a) {
            this(num, ridVar, thgVar, abstractC11379i, scheduledExecutorService, pu1Var, executor, str);
        }

        public static a newBuilder() {
            return new a();
        }

        @lg5("https://github.com/grpc/grpc-java/issues/6438")
        public pu1 getChannelLogger() {
            pu1 pu1Var = this.f73589f;
            if (pu1Var != null) {
                return pu1Var;
            }
            throw new IllegalStateException("ChannelLogger is not set in Builder");
        }

        public int getDefaultPort() {
            return this.f73584a;
        }

        @eib
        public Executor getOffloadExecutor() {
            return this.f73590g;
        }

        @lg5("https://github.com/grpc/grpc-java/issues/9406")
        @eib
        public String getOverrideAuthority() {
            return this.f73591h;
        }

        public rid getProxyDetector() {
            return this.f73585b;
        }

        @lg5("https://github.com/grpc/grpc-java/issues/6454")
        public ScheduledExecutorService getScheduledExecutorService() {
            ScheduledExecutorService scheduledExecutorService = this.f73588e;
            if (scheduledExecutorService != null) {
                return scheduledExecutorService;
            }
            throw new IllegalStateException("ScheduledExecutorService not set in Builder");
        }

        public AbstractC11379i getServiceConfigParser() {
            return this.f73587d;
        }

        public thg getSynchronizationContext() {
            return this.f73586c;
        }

        public a toBuilder() {
            a aVar = new a();
            aVar.setDefaultPort(this.f73584a);
            aVar.setProxyDetector(this.f73585b);
            aVar.setSynchronizationContext(this.f73586c);
            aVar.setServiceConfigParser(this.f73587d);
            aVar.setScheduledExecutorService(this.f73588e);
            aVar.setChannelLogger(this.f73589f);
            aVar.setOffloadExecutor(this.f73590g);
            aVar.setOverrideAuthority(this.f73591h);
            return aVar;
        }

        public String toString() {
            return yya.toStringHelper(this).add("defaultPort", this.f73584a).add("proxyDetector", this.f73585b).add("syncContext", this.f73586c).add("serviceConfigParser", this.f73587d).add("scheduledExecutorService", this.f73588e).add("channelLogger", this.f73589f).add("executor", this.f73590g).add("overrideAuthority", this.f73591h).toString();
        }

        private C11372b(Integer num, rid ridVar, thg thgVar, AbstractC11379i abstractC11379i, @eib ScheduledExecutorService scheduledExecutorService, @eib pu1 pu1Var, @eib Executor executor, @eib String str) {
            this.f73584a = ((Integer) v7d.checkNotNull(num, "defaultPort not set")).intValue();
            this.f73585b = (rid) v7d.checkNotNull(ridVar, "proxyDetector not set");
            this.f73586c = (thg) v7d.checkNotNull(thgVar, "syncContext not set");
            this.f73587d = (AbstractC11379i) v7d.checkNotNull(abstractC11379i, "serviceConfigParser not set");
            this.f73588e = scheduledExecutorService;
            this.f73589f = pu1Var;
            this.f73590g = executor;
            this.f73591h = str;
        }
    }

    /* JADX INFO: renamed from: q8b$d */
    @lg5("https://github.com/grpc/grpc-java/issues/1770")
    public static abstract class AbstractC11374d {
        public abstract String getDefaultScheme();

        public abstract q8b newNameResolver(URI uri, C11372b c11372b);
    }

    /* JADX INFO: renamed from: q8b$e */
    @lg5("https://github.com/grpc/grpc-java/issues/1770")
    public static abstract class AbstractC11375e implements InterfaceC11376f {
        @Override // p000.q8b.InterfaceC11376f
        @Deprecated
        @p28(imports = {"io.grpc.NameResolver.ResolutionResult"}, replacement = "this.onResult(ResolutionResult.newBuilder().setAddresses(servers).setAttributes(attributes).build())")
        public final void onAddresses(List<s45> list, sc0 sc0Var) {
            onResult(C11377g.newBuilder().setAddresses(list).setAttributes(sc0Var).build());
        }

        @Override // p000.q8b.InterfaceC11376f
        public abstract void onError(n4g n4gVar);

        public abstract void onResult(C11377g c11377g);
    }

    /* JADX INFO: renamed from: q8b$f */
    @lg5("https://github.com/grpc/grpc-java/issues/1770")
    @kyg
    public interface InterfaceC11376f {
        void onAddresses(List<s45> list, sc0 sc0Var);

        void onError(n4g n4gVar);
    }

    /* JADX INFO: renamed from: q8b$g */
    @lg5("https://github.com/grpc/grpc-java/issues/1770")
    public static final class C11377g {

        /* JADX INFO: renamed from: a */
        public final List<s45> f73603a;

        /* JADX INFO: renamed from: b */
        public final sc0 f73604b;

        /* JADX INFO: renamed from: c */
        @eib
        public final C11373c f73605c;

        /* JADX INFO: renamed from: q8b$g$a */
        @lg5("https://github.com/grpc/grpc-java/issues/1770")
        public static final class a {

            /* JADX INFO: renamed from: a */
            public List<s45> f73606a = Collections.emptyList();

            /* JADX INFO: renamed from: b */
            public sc0 f73607b = sc0.f81180c;

            /* JADX INFO: renamed from: c */
            @eib
            public C11373c f73608c;

            public C11377g build() {
                return new C11377g(this.f73606a, this.f73607b, this.f73608c);
            }

            public a setAddresses(List<s45> list) {
                this.f73606a = list;
                return this;
            }

            public a setAttributes(sc0 sc0Var) {
                this.f73607b = sc0Var;
                return this;
            }

            public a setServiceConfig(@eib C11373c c11373c) {
                this.f73608c = c11373c;
                return this;
            }
        }

        public C11377g(List<s45> list, sc0 sc0Var, C11373c c11373c) {
            this.f73603a = Collections.unmodifiableList(new ArrayList(list));
            this.f73604b = (sc0) v7d.checkNotNull(sc0Var, "attributes");
            this.f73605c = c11373c;
        }

        public static a newBuilder() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11377g)) {
                return false;
            }
            C11377g c11377g = (C11377g) obj;
            return okb.equal(this.f73603a, c11377g.f73603a) && okb.equal(this.f73604b, c11377g.f73604b) && okb.equal(this.f73605c, c11377g.f73605c);
        }

        public List<s45> getAddresses() {
            return this.f73603a;
        }

        public sc0 getAttributes() {
            return this.f73604b;
        }

        @eib
        public C11373c getServiceConfig() {
            return this.f73605c;
        }

        public int hashCode() {
            return okb.hashCode(this.f73603a, this.f73604b, this.f73605c);
        }

        public a toBuilder() {
            return newBuilder().setAddresses(this.f73603a).setAttributes(this.f73604b).setServiceConfig(this.f73605c);
        }

        public String toString() {
            return yya.toStringHelper(this).add("addresses", this.f73603a).add("attributes", this.f73604b).add(eh4.f32989w, this.f73605c).toString();
        }
    }

    /* JADX INFO: renamed from: q8b$h */
    @lg5("https://github.com/grpc/grpc-java/issues/4972")
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC11378h {
    }

    /* JADX INFO: renamed from: q8b$i */
    @lg5("https://github.com/grpc/grpc-java/issues/1770")
    public static abstract class AbstractC11379i {
        public abstract C11373c parseServiceConfig(Map<String, ?> map);
    }

    public abstract String getServiceAuthority();

    public void refresh() {
    }

    public abstract void shutdown();

    public void start(InterfaceC11376f interfaceC11376f) {
        if (interfaceC11376f instanceof AbstractC11375e) {
            start((AbstractC11375e) interfaceC11376f);
        } else {
            start((AbstractC11375e) new C11371a(interfaceC11376f));
        }
    }

    /* JADX INFO: renamed from: q8b$c */
    @lg5("https://github.com/grpc/grpc-java/issues/1770")
    public static final class C11373c {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ boolean f73600c = false;

        /* JADX INFO: renamed from: a */
        public final n4g f73601a;

        /* JADX INFO: renamed from: b */
        public final Object f73602b;

        private C11373c(Object obj) {
            this.f73602b = v7d.checkNotNull(obj, "config");
            this.f73601a = null;
        }

        public static C11373c fromConfig(Object obj) {
            return new C11373c(obj);
        }

        public static C11373c fromError(n4g n4gVar) {
            return new C11373c(n4gVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11373c.class != obj.getClass()) {
                return false;
            }
            C11373c c11373c = (C11373c) obj;
            return okb.equal(this.f73601a, c11373c.f73601a) && okb.equal(this.f73602b, c11373c.f73602b);
        }

        @eib
        public Object getConfig() {
            return this.f73602b;
        }

        @eib
        public n4g getError() {
            return this.f73601a;
        }

        public int hashCode() {
            return okb.hashCode(this.f73601a, this.f73602b);
        }

        public String toString() {
            return this.f73602b != null ? yya.toStringHelper(this).add("config", this.f73602b).toString() : yya.toStringHelper(this).add("error", this.f73601a).toString();
        }

        private C11373c(n4g n4gVar) {
            this.f73602b = null;
            this.f73601a = (n4g) v7d.checkNotNull(n4gVar, "status");
            v7d.checkArgument(!n4gVar.isOk(), "cannot use OK status: %s", n4gVar);
        }
    }

    public void start(AbstractC11375e abstractC11375e) {
        start((InterfaceC11376f) abstractC11375e);
    }
}
