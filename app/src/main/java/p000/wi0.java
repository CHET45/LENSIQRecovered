package p000;

import java.util.List;
import java.util.Map;
import p000.i4f;
import p000.pu1;
import p000.q8b;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
public final class wi0 {

    /* JADX INFO: renamed from: a */
    public final bc9 f94291a;

    /* JADX INFO: renamed from: b */
    public final String f94292b;

    /* JADX INFO: renamed from: wi0$b */
    @gdi
    public final class C14608b {

        /* JADX INFO: renamed from: a */
        public final zb9.AbstractC16069f f94293a;

        /* JADX INFO: renamed from: b */
        public zb9 f94294b;

        /* JADX INFO: renamed from: c */
        public ac9 f94295c;

        public C14608b(zb9.AbstractC16069f abstractC16069f) {
            this.f94293a = abstractC16069f;
            ac9 provider = wi0.this.f94291a.getProvider(wi0.this.f94292b);
            this.f94295c = provider;
            if (provider != null) {
                this.f94294b = provider.newLoadBalancer(abstractC16069f);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + wi0.this.f94292b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        @gdi
        /* JADX INFO: renamed from: a */
        public ac9 m24562a() {
            return this.f94295c;
        }

        /* JADX INFO: renamed from: b */
        public void m24563b(n4g n4gVar) {
            getDelegate().handleNameResolutionError(n4gVar);
        }

        @Deprecated
        /* JADX INFO: renamed from: c */
        public void m24564c(zb9.AbstractC16073j abstractC16073j, xs2 xs2Var) {
            getDelegate().handleSubchannelState(abstractC16073j, xs2Var);
        }

        /* JADX INFO: renamed from: d */
        public void m24565d() {
            getDelegate().requestConnection();
        }

        @gdi
        /* JADX INFO: renamed from: e */
        public void m24566e(zb9 zb9Var) {
            this.f94294b = zb9Var;
        }

        /* JADX INFO: renamed from: f */
        public void m24567f() {
            this.f94294b.shutdown();
            this.f94294b = null;
        }

        /* JADX INFO: renamed from: g */
        public n4g m24568g(zb9.C16072i c16072i) {
            i4f.C7146b c7146b = (i4f.C7146b) c16072i.getLoadBalancingPolicyConfig();
            if (c7146b == null) {
                try {
                    wi0 wi0Var = wi0.this;
                    c7146b = new i4f.C7146b(wi0Var.getProviderOrThrow(wi0Var.f94292b, "using default policy"), null);
                } catch (C14612f e) {
                    this.f94293a.updateBalancingState(ws2.TRANSIENT_FAILURE, new C14610d(n4g.f63272s.withDescription(e.getMessage())));
                    this.f94294b.shutdown();
                    this.f94295c = null;
                    this.f94294b = new C14611e();
                    return n4g.f63258e;
                }
            }
            if (this.f94295c == null || !c7146b.f45743a.getPolicyName().equals(this.f94295c.getPolicyName())) {
                this.f94293a.updateBalancingState(ws2.CONNECTING, new C14609c());
                this.f94294b.shutdown();
                ac9 ac9Var = c7146b.f45743a;
                this.f94295c = ac9Var;
                zb9 zb9Var = this.f94294b;
                this.f94294b = ac9Var.newLoadBalancer(this.f94293a);
                this.f94293a.getChannelLogger().log(pu1.EnumC11124a.INFO, "Load balancer changed from {0} to {1}", zb9Var.getClass().getSimpleName(), this.f94294b.getClass().getSimpleName());
            }
            Object obj = c7146b.f45744b;
            if (obj != null) {
                this.f94293a.getChannelLogger().log(pu1.EnumC11124a.DEBUG, "Load-balancing config: {0}", c7146b.f45744b);
            }
            return getDelegate().acceptResolvedAddresses(zb9.C16072i.newBuilder().setAddresses(c16072i.getAddresses()).setAttributes(c16072i.getAttributes()).setLoadBalancingPolicyConfig(obj).build());
        }

        @gdi
        public zb9 getDelegate() {
            return this.f94294b;
        }
    }

    /* JADX INFO: renamed from: wi0$c */
    public static final class C14609c extends zb9.AbstractC16074k {
        private C14609c() {
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            return zb9.C16070g.withNoResult();
        }

        public String toString() {
            return yya.toStringHelper((Class<?>) C14609c.class).toString();
        }
    }

    /* JADX INFO: renamed from: wi0$d */
    public static final class C14610d extends zb9.AbstractC16074k {

        /* JADX INFO: renamed from: a */
        public final n4g f94297a;

        public C14610d(n4g n4gVar) {
            this.f94297a = n4gVar;
        }

        @Override // p000.zb9.AbstractC16074k
        public zb9.C16070g pickSubchannel(zb9.AbstractC16071h abstractC16071h) {
            return zb9.C16070g.withError(this.f94297a);
        }
    }

    /* JADX INFO: renamed from: wi0$e */
    public static final class C14611e extends zb9 {
        private C14611e() {
        }

        @Override // p000.zb9
        public n4g acceptResolvedAddresses(zb9.C16072i c16072i) {
            return n4g.f63258e;
        }

        @Override // p000.zb9
        public void handleNameResolutionError(n4g n4gVar) {
        }

        @Override // p000.zb9
        @Deprecated
        public void handleResolvedAddresses(zb9.C16072i c16072i) {
        }

        @Override // p000.zb9
        public void shutdown() {
        }
    }

    /* JADX INFO: renamed from: wi0$f */
    @gdi
    public static final class C14612f extends Exception {
        private static final long serialVersionUID = 1;

        private C14612f(String str) {
            super(str);
        }
    }

    public wi0(String str) {
        this(bc9.getDefaultRegistry(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ac9 getProviderOrThrow(String str, String str2) throws C14612f {
        ac9 provider = this.f94291a.getProvider(str);
        if (provider != null) {
            return provider;
        }
        throw new C14612f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    @eib
    /* JADX INFO: renamed from: d */
    public q8b.C11373c m24561d(Map<String, ?> map) {
        List<i4f.C7145a> listUnwrapLoadBalancingConfigList;
        if (map != null) {
            try {
                listUnwrapLoadBalancingConfigList = i4f.unwrapLoadBalancingConfigList(i4f.getLoadBalancingConfigsFromServiceConfig(map));
            } catch (RuntimeException e) {
                return q8b.C11373c.fromError(n4g.f63260g.withDescription("can't parse load balancer configuration").withCause(e));
            }
        } else {
            listUnwrapLoadBalancingConfigList = null;
        }
        if (listUnwrapLoadBalancingConfigList == null || listUnwrapLoadBalancingConfigList.isEmpty()) {
            return null;
        }
        return i4f.selectLbPolicyFromList(listUnwrapLoadBalancingConfigList, this.f94291a);
    }

    public C14608b newLoadBalancer(zb9.AbstractC16069f abstractC16069f) {
        return new C14608b(abstractC16069f);
    }

    @gdi
    public wi0(bc9 bc9Var, String str) {
        this.f94291a = (bc9) v7d.checkNotNull(bc9Var, "registry");
        this.f94292b = (String) v7d.checkNotNull(str, "defaultPolicy");
    }
}
