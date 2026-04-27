package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000.j8e;
import p000.ja8;
import p000.n4g;
import p000.rn1;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
public final class vr9 {

    /* JADX INFO: renamed from: a */
    @eib
    public final C14229b f92058a;

    /* JADX INFO: renamed from: b */
    public final Map<String, C14229b> f92059b;

    /* JADX INFO: renamed from: c */
    public final Map<String, C14229b> f92060c;

    /* JADX INFO: renamed from: d */
    @eib
    public final j8e.C7789e0 f92061d;

    /* JADX INFO: renamed from: e */
    @eib
    public final Object f92062e;

    /* JADX INFO: renamed from: f */
    @eib
    public final Map<String, ?> f92063f;

    /* JADX INFO: renamed from: vr9$b */
    public static final class C14229b {

        /* JADX INFO: renamed from: g */
        public static final rn1.C12165c<C14229b> f92064g = rn1.C12165c.create("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* JADX INFO: renamed from: a */
        public final Long f92065a;

        /* JADX INFO: renamed from: b */
        public final Boolean f92066b;

        /* JADX INFO: renamed from: c */
        public final Integer f92067c;

        /* JADX INFO: renamed from: d */
        public final Integer f92068d;

        /* JADX INFO: renamed from: e */
        public final u8e f92069e;

        /* JADX INFO: renamed from: f */
        public final ij7 f92070f;

        public C14229b(Map<String, ?> map, boolean z, int i, int i2) {
            this.f92065a = i4f.m12790s(map);
            this.f92066b = i4f.m12791t(map);
            Integer numM12780i = i4f.m12780i(map);
            this.f92067c = numM12780i;
            if (numM12780i != null) {
                v7d.checkArgument(numM12780i.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numM12780i);
            }
            Integer numM12779h = i4f.m12779h(map);
            this.f92068d = numM12779h;
            if (numM12779h != null) {
                v7d.checkArgument(numM12779h.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numM12779h);
            }
            Map<String, ?> mapM12786o = z ? i4f.m12786o(map) : null;
            this.f92069e = mapM12786o == null ? null : retryPolicy(mapM12786o, i);
            Map<String, ?> mapM12774c = z ? i4f.m12774c(map) : null;
            this.f92070f = mapM12774c != null ? hedgingPolicy(mapM12774c, i2) : null;
        }

        private static ij7 hedgingPolicy(Map<String, ?> map, int i) {
            int iIntValue = ((Integer) v7d.checkNotNull(i4f.m12776e(map), "maxAttempts cannot be empty")).intValue();
            v7d.checkArgument(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i);
            long jLongValue = ((Long) v7d.checkNotNull(i4f.m12773b(map), "hedgingDelay cannot be empty")).longValue();
            v7d.checkArgument(jLongValue >= 0, "hedgingDelay must not be negative: %s", jLongValue);
            return new ij7(iMin, jLongValue, i4f.m12784m(map));
        }

        private static u8e retryPolicy(Map<String, ?> map, int i) {
            int iIntValue = ((Integer) v7d.checkNotNull(i4f.m12777f(map), "maxAttempts cannot be empty")).intValue();
            v7d.checkArgument(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i);
            long jLongValue = ((Long) v7d.checkNotNull(i4f.m12775d(map), "initialBackoff cannot be empty")).longValue();
            v7d.checkArgument(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) v7d.checkNotNull(i4f.m12778g(map), "maxBackoff cannot be empty")).longValue();
            v7d.checkArgument(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d = (Double) v7d.checkNotNull(i4f.m12772a(map), "backoffMultiplier cannot be empty");
            double dDoubleValue = d.doubleValue();
            v7d.checkArgument(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d);
            Long lM12785n = i4f.m12785n(map);
            v7d.checkArgument(lM12785n == null || lM12785n.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lM12785n);
            Set<n4g.EnumC9694b> setM12787p = i4f.m12787p(map);
            v7d.checkArgument((lM12785n == null && setM12787p.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new u8e(iMin, jLongValue, jLongValue2, dDoubleValue, lM12785n, setM12787p);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C14229b)) {
                return false;
            }
            C14229b c14229b = (C14229b) obj;
            return okb.equal(this.f92065a, c14229b.f92065a) && okb.equal(this.f92066b, c14229b.f92066b) && okb.equal(this.f92067c, c14229b.f92067c) && okb.equal(this.f92068d, c14229b.f92068d) && okb.equal(this.f92069e, c14229b.f92069e) && okb.equal(this.f92070f, c14229b.f92070f);
        }

        public int hashCode() {
            return okb.hashCode(this.f92065a, this.f92066b, this.f92067c, this.f92068d, this.f92069e, this.f92070f);
        }

        public String toString() {
            return yya.toStringHelper(this).add("timeoutNanos", this.f92065a).add("waitForReady", this.f92066b).add("maxInboundMessageSize", this.f92067c).add("maxOutboundMessageSize", this.f92068d).add("retryPolicy", this.f92069e).add("hedgingPolicy", this.f92070f).toString();
        }
    }

    /* JADX INFO: renamed from: vr9$c */
    public static final class C14230c extends ja8 {

        /* JADX INFO: renamed from: b */
        public final vr9 f92071b;

        @Override // p000.ja8
        public ja8.C7824b selectConfig(zb9.AbstractC16071h abstractC16071h) {
            return ja8.C7824b.newBuilder().setConfig(this.f92071b).build();
        }

        private C14230c(vr9 vr9Var) {
            this.f92071b = vr9Var;
        }
    }

    public vr9(@eib C14229b c14229b, Map<String, C14229b> map, Map<String, C14229b> map2, @eib j8e.C7789e0 c7789e0, @eib Object obj, @eib Map<String, ?> map3) {
        this.f92058a = c14229b;
        this.f92059b = Collections.unmodifiableMap(new HashMap(map));
        this.f92060c = Collections.unmodifiableMap(new HashMap(map2));
        this.f92061d = c7789e0;
        this.f92062e = obj;
        this.f92063f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: renamed from: a */
    public static vr9 m24140a() {
        return new vr9(null, new HashMap(), new HashMap(), null, null, null);
    }

    /* JADX INFO: renamed from: b */
    public static vr9 m24141b(Map<String, ?> map, boolean z, int i, int i2, @eib Object obj) {
        j8e.C7789e0 c7789e0M12789r = z ? i4f.m12789r(map) : null;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map<String, ?> healthCheckedService = i4f.getHealthCheckedService(map);
        List<Map<String, ?>> listM12781j = i4f.m12781j(map);
        if (listM12781j == null) {
            return new vr9(null, map2, map3, c7789e0M12789r, obj, healthCheckedService);
        }
        C14229b c14229b = null;
        for (Map<String, ?> map4 : listM12781j) {
            C14229b c14229b2 = new C14229b(map4, z, i, i2);
            List<Map<String, ?>> listM12783l = i4f.m12783l(map4);
            if (listM12783l != null && !listM12783l.isEmpty()) {
                for (Map<String, ?> map5 : listM12783l) {
                    String strM12788q = i4f.m12788q(map5);
                    String strM12782k = i4f.m12782k(map5);
                    if (u8g.isNullOrEmpty(strM12788q)) {
                        v7d.checkArgument(u8g.isNullOrEmpty(strM12782k), "missing service name for method %s", strM12782k);
                        v7d.checkArgument(c14229b == null, "Duplicate default method config in service config %s", map);
                        c14229b = c14229b2;
                    } else if (u8g.isNullOrEmpty(strM12782k)) {
                        v7d.checkArgument(!map3.containsKey(strM12788q), "Duplicate service %s", strM12788q);
                        map3.put(strM12788q, c14229b2);
                    } else {
                        String strGenerateFullMethodName = rua.generateFullMethodName(strM12788q, strM12782k);
                        v7d.checkArgument(!map2.containsKey(strGenerateFullMethodName), "Duplicate method name %s", strGenerateFullMethodName);
                        map2.put(strGenerateFullMethodName, c14229b2);
                    }
                }
            }
        }
        return new vr9(c14229b, map2, map3, c7789e0M12789r, obj, healthCheckedService);
    }

    @eib
    /* JADX INFO: renamed from: c */
    public ja8 m24142c() {
        if (this.f92060c.isEmpty() && this.f92059b.isEmpty() && this.f92058a == null) {
            return null;
        }
        return new C14230c();
    }

    @eib
    /* JADX INFO: renamed from: d */
    public Map<String, ?> m24143d() {
        return this.f92063f;
    }

    @gdi
    @eib
    /* JADX INFO: renamed from: e */
    public Object m24144e() {
        return this.f92062e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vr9.class != obj.getClass()) {
            return false;
        }
        vr9 vr9Var = (vr9) obj;
        return okb.equal(this.f92058a, vr9Var.f92058a) && okb.equal(this.f92059b, vr9Var.f92059b) && okb.equal(this.f92060c, vr9Var.f92060c) && okb.equal(this.f92061d, vr9Var.f92061d) && okb.equal(this.f92062e, vr9Var.f92062e);
    }

    @eib
    /* JADX INFO: renamed from: f */
    public C14229b m24145f(rua<?, ?> ruaVar) {
        C14229b c14229b = this.f92059b.get(ruaVar.getFullMethodName());
        if (c14229b == null) {
            c14229b = this.f92060c.get(ruaVar.getServiceName());
        }
        return c14229b == null ? this.f92058a : c14229b;
    }

    @eib
    /* JADX INFO: renamed from: g */
    public j8e.C7789e0 m24146g() {
        return this.f92061d;
    }

    public int hashCode() {
        return okb.hashCode(this.f92058a, this.f92059b, this.f92060c, this.f92061d, this.f92062e);
    }

    public String toString() {
        return yya.toStringHelper(this).add("defaultMethodConfig", this.f92058a).add("serviceMethodMap", this.f92059b).add("serviceMap", this.f92060c).add("retryThrottling", this.f92061d).add("loadBalancingConfig", this.f92062e).toString();
    }
}
