package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.a32;
import p000.j8e;
import p000.n4g;
import p000.q8b;

/* JADX INFO: loaded from: classes7.dex */
public final class i4f {

    /* JADX INFO: renamed from: i4f$a */
    public static final class C7145a {

        /* JADX INFO: renamed from: a */
        public final String f45741a;

        /* JADX INFO: renamed from: b */
        public final Map<String, ?> f45742b;

        public C7145a(String str, Map<String, ?> map) {
            this.f45741a = (String) v7d.checkNotNull(str, "policyName");
            this.f45742b = (Map) v7d.checkNotNull(map, "rawConfigValue");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7145a)) {
                return false;
            }
            C7145a c7145a = (C7145a) obj;
            return this.f45741a.equals(c7145a.f45741a) && this.f45742b.equals(c7145a.f45742b);
        }

        public String getPolicyName() {
            return this.f45741a;
        }

        public Map<String, ?> getRawConfigValue() {
            return this.f45742b;
        }

        public int hashCode() {
            return okb.hashCode(this.f45741a, this.f45742b);
        }

        public String toString() {
            return yya.toStringHelper(this).add("policyName", this.f45741a).add("rawConfigValue", this.f45742b).toString();
        }
    }

    /* JADX INFO: renamed from: i4f$b */
    public static final class C7146b {

        /* JADX INFO: renamed from: a */
        public final ac9 f45743a;

        /* JADX INFO: renamed from: b */
        @eib
        public final Object f45744b;

        public C7146b(ac9 ac9Var, @eib Object obj) {
            this.f45743a = (ac9) v7d.checkNotNull(ac9Var, "provider");
            this.f45744b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7146b.class != obj.getClass()) {
                return false;
            }
            C7146b c7146b = (C7146b) obj;
            return okb.equal(this.f45743a, c7146b.f45743a) && okb.equal(this.f45744b, c7146b.f45744b);
        }

        @eib
        public Object getConfig() {
            return this.f45744b;
        }

        public ac9 getProvider() {
            return this.f45743a;
        }

        public int hashCode() {
            return okb.hashCode(this.f45743a, this.f45744b);
        }

        public String toString() {
            return yya.toStringHelper(this).add("provider", this.f45743a).add("config", this.f45744b).toString();
        }
    }

    private i4f() {
    }

    @eib
    /* JADX INFO: renamed from: a */
    public static Double m12772a(Map<String, ?> map) {
        return ym8.getNumberAsDouble(map, "backoffMultiplier");
    }

    @eib
    /* JADX INFO: renamed from: b */
    public static Long m12773b(Map<String, ?> map) {
        return ym8.getStringAsDuration(map, "hedgingDelay");
    }

    @eib
    /* JADX INFO: renamed from: c */
    public static Map<String, ?> m12774c(Map<String, ?> map) {
        return ym8.getObject(map, "hedgingPolicy");
    }

    @eib
    /* JADX INFO: renamed from: d */
    public static Long m12775d(Map<String, ?> map) {
        return ym8.getStringAsDuration(map, "initialBackoff");
    }

    @eib
    /* JADX INFO: renamed from: e */
    public static Integer m12776e(Map<String, ?> map) {
        return ym8.getNumberAsInteger(map, "maxAttempts");
    }

    @eib
    /* JADX INFO: renamed from: f */
    public static Integer m12777f(Map<String, ?> map) {
        return ym8.getNumberAsInteger(map, "maxAttempts");
    }

    @eib
    /* JADX INFO: renamed from: g */
    public static Long m12778g(Map<String, ?> map) {
        return ym8.getStringAsDuration(map, "maxBackoff");
    }

    @eib
    public static Map<String, ?> getHealthCheckedService(@eib Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return ym8.getObject(map, "healthCheckConfig");
    }

    @eib
    public static String getHealthCheckedServiceName(@eib Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return ym8.getString(map, "serviceName");
    }

    private static Set<n4g.EnumC9694b> getListOfStatusCodesAsSet(Map<String, ?> map, String str) {
        List<?> list = ym8.getList(map, str);
        if (list == null) {
            return null;
        }
        return getStatusCodesFromList(list);
    }

    @gdi
    public static List<Map<String, ?>> getLoadBalancingConfigsFromServiceConfig(Map<String, ?> map) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(ym8.getListOfObjects(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (string = ym8.getString(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(string.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static Set<n4g.EnumC9694b> getStatusCodesFromList(List<?> list) {
        n4g.EnumC9694b enumC9694bValueOf;
        EnumSet enumSetNoneOf = EnumSet.noneOf(n4g.EnumC9694b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                s4i.verify(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                enumC9694bValueOf = n4g.fromCodeValue(iIntValue).getCode();
                s4i.verify(enumC9694bValueOf.value() == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new t4i("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    enumC9694bValueOf = n4g.EnumC9694b.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new t4i("Status code " + obj + " is not valid", e);
                }
            }
            enumSetNoneOf.add(enumC9694bValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    @eib
    /* JADX INFO: renamed from: h */
    public static Integer m12779h(Map<String, ?> map) {
        return ym8.getNumberAsInteger(map, "maxRequestMessageBytes");
    }

    @eib
    /* JADX INFO: renamed from: i */
    public static Integer m12780i(Map<String, ?> map) {
        return ym8.getNumberAsInteger(map, "maxResponseMessageBytes");
    }

    @eib
    /* JADX INFO: renamed from: j */
    public static List<Map<String, ?>> m12781j(Map<String, ?> map) {
        return ym8.getListOfObjects(map, "methodConfig");
    }

    @eib
    /* JADX INFO: renamed from: k */
    public static String m12782k(Map<String, ?> map) {
        return ym8.getString(map, FirebaseAnalytics.C3552d.f23230v);
    }

    @eib
    /* JADX INFO: renamed from: l */
    public static List<Map<String, ?>> m12783l(Map<String, ?> map) {
        return ym8.getListOfObjects(map, "name");
    }

    /* JADX INFO: renamed from: m */
    public static Set<n4g.EnumC9694b> m12784m(Map<String, ?> map) {
        Set<n4g.EnumC9694b> listOfStatusCodesAsSet = getListOfStatusCodesAsSet(map, "nonFatalStatusCodes");
        if (listOfStatusCodesAsSet == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(n4g.EnumC9694b.class));
        }
        s4i.verify(!listOfStatusCodesAsSet.contains(n4g.EnumC9694b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return listOfStatusCodesAsSet;
    }

    @eib
    /* JADX INFO: renamed from: n */
    public static Long m12785n(Map<String, ?> map) {
        return ym8.getStringAsDuration(map, "perAttemptRecvTimeout");
    }

    @eib
    /* JADX INFO: renamed from: o */
    public static Map<String, ?> m12786o(Map<String, ?> map) {
        return ym8.getObject(map, "retryPolicy");
    }

    /* JADX INFO: renamed from: p */
    public static Set<n4g.EnumC9694b> m12787p(Map<String, ?> map) {
        Set<n4g.EnumC9694b> listOfStatusCodesAsSet = getListOfStatusCodesAsSet(map, "retryableStatusCodes");
        s4i.verify(listOfStatusCodesAsSet != null, "%s is required in retry policy", "retryableStatusCodes");
        s4i.verify(true ^ listOfStatusCodesAsSet.contains(n4g.EnumC9694b.OK), "%s must not contain OK", "retryableStatusCodes");
        return listOfStatusCodesAsSet;
    }

    @eib
    /* JADX INFO: renamed from: q */
    public static String m12788q(Map<String, ?> map) {
        return ym8.getString(map, "service");
    }

    @eib
    /* JADX INFO: renamed from: r */
    public static j8e.C7789e0 m12789r(@eib Map<String, ?> map) {
        Map<String, ?> object;
        if (map == null || (object = ym8.getObject(map, "retryThrottling")) == null) {
            return null;
        }
        float fFloatValue = ym8.getNumberAsDouble(object, "maxTokens").floatValue();
        float fFloatValue2 = ym8.getNumberAsDouble(object, "tokenRatio").floatValue();
        v7d.checkState(fFloatValue > 0.0f, "maxToken should be greater than zero");
        v7d.checkState(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new j8e.C7789e0(fFloatValue, fFloatValue2);
    }

    @eib
    /* JADX INFO: renamed from: s */
    public static Long m12790s(Map<String, ?> map) {
        return ym8.getStringAsDuration(map, a32.C0034g.f248b);
    }

    public static q8b.C11373c selectLbPolicyFromList(List<C7145a> list, bc9 bc9Var) {
        ArrayList arrayList = new ArrayList();
        for (C7145a c7145a : list) {
            String policyName = c7145a.getPolicyName();
            ac9 provider = bc9Var.getProvider(policyName);
            if (provider != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(i4f.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                q8b.C11373c loadBalancingPolicyConfig = provider.parseLoadBalancingPolicyConfig(c7145a.getRawConfigValue());
                return loadBalancingPolicyConfig.getError() != null ? loadBalancingPolicyConfig : q8b.C11373c.fromConfig(new C7146b(provider, loadBalancingPolicyConfig.getConfig()));
            }
            arrayList.add(policyName);
        }
        return q8b.C11373c.fromError(n4g.f63260g.withDescription("None of " + arrayList + " specified by Service Config are available."));
    }

    @eib
    /* JADX INFO: renamed from: t */
    public static Boolean m12791t(Map<String, ?> map) {
        return ym8.getBoolean(map, "waitForReady");
    }

    public static C7145a unwrapLoadBalancingConfig(Map<String, ?> map) {
        if (map.size() == 1) {
            String key = map.entrySet().iterator().next().getKey();
            return new C7145a(key, ym8.getObject(map, key));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }

    public static List<C7145a> unwrapLoadBalancingConfigList(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, ?>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(unwrapLoadBalancingConfig(it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
