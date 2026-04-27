package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p000.zb9;

/* JADX INFO: loaded from: classes7.dex */
@x98
public abstract class d2b extends zb9 {

    /* JADX INFO: renamed from: l */
    public static final Logger f28272l = Logger.getLogger(d2b.class.getName());

    /* JADX INFO: renamed from: h */
    public final zb9.AbstractC16069f f28274h;

    /* JADX INFO: renamed from: i */
    public boolean f28275i;

    /* JADX INFO: renamed from: k */
    public ws2 f28277k;

    /* JADX INFO: renamed from: g */
    public final Map<Object, C4590c> f28273g = new LinkedHashMap();

    /* JADX INFO: renamed from: j */
    public final ac9 f28276j = new ovc();

    /* JADX INFO: renamed from: d2b$b */
    public static class C4589b {

        /* JADX INFO: renamed from: a */
        public final n4g f28278a;

        /* JADX INFO: renamed from: b */
        public final List<C4590c> f28279b;

        public C4589b(n4g n4gVar, List<C4590c> list) {
            this.f28278a = n4gVar;
            this.f28279b = list;
        }
    }

    /* JADX INFO: renamed from: d2b$c */
    public class C4590c {

        /* JADX INFO: renamed from: a */
        public final Object f28280a;

        /* JADX INFO: renamed from: b */
        public zb9.C16072i f28281b;

        /* JADX INFO: renamed from: c */
        public final Object f28282c;

        /* JADX INFO: renamed from: d */
        public final v87 f28283d;

        /* JADX INFO: renamed from: e */
        public final ac9 f28284e;

        /* JADX INFO: renamed from: f */
        public ws2 f28285f;

        /* JADX INFO: renamed from: g */
        public zb9.AbstractC16074k f28286g;

        /* JADX INFO: renamed from: h */
        public boolean f28287h;

        /* JADX INFO: renamed from: d2b$c$a */
        public final class a extends ms6 {
            private a() {
            }

            @Override // p000.ms6
            /* JADX INFO: renamed from: a */
            public zb9.AbstractC16069f mo8856a() {
                return d2b.this.f28274h;
            }

            @Override // p000.ms6, p000.zb9.AbstractC16069f
            public void updateBalancingState(ws2 ws2Var, zb9.AbstractC16074k abstractC16074k) {
                if (d2b.this.f28273g.containsKey(C4590c.this.f28280a)) {
                    C4590c.this.f28285f = ws2Var;
                    C4590c.this.f28286g = abstractC16074k;
                    if (C4590c.this.f28287h) {
                        return;
                    }
                    d2b d2bVar = d2b.this;
                    if (d2bVar.f28275i) {
                        return;
                    }
                    if (ws2Var == ws2.IDLE && d2bVar.m8836t()) {
                        C4590c.this.f28283d.requestConnection();
                    }
                    d2b.this.mo8839w();
                }
            }
        }

        public C4590c(d2b d2bVar, Object obj, ac9 ac9Var, Object obj2, zb9.AbstractC16074k abstractC16074k) {
            this(obj, ac9Var, obj2, abstractC16074k, null, false);
        }

        public zb9.AbstractC16074k getCurrentPicker() {
            return this.f28286g;
        }

        public ws2 getCurrentState() {
            return this.f28285f;
        }

        public s45 getEag() {
            zb9.C16072i c16072i = this.f28281b;
            if (c16072i == null || c16072i.getAddresses().isEmpty()) {
                return null;
            }
            return this.f28281b.getAddresses().get(0);
        }

        public Object getKey() {
            return this.f28280a;
        }

        public ac9 getPolicyProvider() {
            return this.f28284e;
        }

        @gdi
        public zb9.C16072i getResolvedAddresses() {
            return this.f28281b;
        }

        /* JADX INFO: renamed from: h */
        public void m8847h() {
            if (this.f28287h) {
                return;
            }
            d2b.this.f28273g.remove(this.f28280a);
            this.f28287h = true;
            d2b.f28272l.log(Level.FINE, "Child balancer {0} deactivated", this.f28280a);
        }

        /* JADX INFO: renamed from: i */
        public Object m8848i() {
            return this.f28282c;
        }

        public boolean isDeactivated() {
            return this.f28287h;
        }

        /* JADX INFO: renamed from: j */
        public v87 m8849j() {
            return this.f28283d;
        }

        /* JADX INFO: renamed from: k */
        public zb9.AbstractC16073j m8850k(zb9.AbstractC16071h abstractC16071h) {
            if (getCurrentPicker() == null) {
                return null;
            }
            return getCurrentPicker().pickSubchannel(abstractC16071h).getSubchannel();
        }

        /* JADX INFO: renamed from: l */
        public void m8851l() {
            this.f28287h = false;
        }

        /* JADX INFO: renamed from: m */
        public void m8852m(ac9 ac9Var) {
            this.f28287h = false;
        }

        /* JADX INFO: renamed from: n */
        public void m8853n() {
            this.f28287h = true;
        }

        /* JADX INFO: renamed from: o */
        public void m8854o(zb9.C16072i c16072i) {
            v7d.checkNotNull(c16072i, "Missing address list for child");
            this.f28281b = c16072i;
        }

        /* JADX INFO: renamed from: p */
        public void m8855p() {
            this.f28283d.shutdown();
            this.f28285f = ws2.SHUTDOWN;
            d2b.f28272l.log(Level.FINE, "Child balancer {0} deleted", this.f28280a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Address = ");
            sb.append(this.f28280a);
            sb.append(", state = ");
            sb.append(this.f28285f);
            sb.append(", picker type: ");
            sb.append(this.f28286g.getClass());
            sb.append(", lb: ");
            sb.append(this.f28283d.mo16339a().getClass());
            sb.append(this.f28287h ? ", deactivated" : "");
            return sb.toString();
        }

        public C4590c(Object obj, ac9 ac9Var, Object obj2, zb9.AbstractC16074k abstractC16074k, zb9.C16072i c16072i, boolean z) {
            this.f28280a = obj;
            this.f28284e = ac9Var;
            this.f28287h = z;
            this.f28286g = abstractC16074k;
            this.f28282c = obj2;
            v87 v87Var = new v87(new a());
            this.f28283d = v87Var;
            this.f28285f = z ? ws2.IDLE : ws2.CONNECTING;
            this.f28281b = c16072i;
            if (z) {
                return;
            }
            v87Var.switchTo(ac9Var);
        }
    }

    /* JADX INFO: renamed from: d2b$d */
    public static class C4591d {

        /* JADX INFO: renamed from: a */
        public final String[] f28290a;

        /* JADX INFO: renamed from: b */
        public final int f28291b;

        public C4591d(s45 s45Var) {
            v7d.checkNotNull(s45Var, "eag");
            this.f28290a = new String[s45Var.getAddresses().size()];
            Iterator<SocketAddress> it = s45Var.getAddresses().iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f28290a[i] = it.next().toString();
                i++;
            }
            Arrays.sort(this.f28290a);
            this.f28291b = Arrays.hashCode(this.f28290a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C4591d)) {
                return false;
            }
            C4591d c4591d = (C4591d) obj;
            if (c4591d.f28291b == this.f28291b) {
                String[] strArr = c4591d.f28290a;
                int length = strArr.length;
                String[] strArr2 = this.f28290a;
                if (length == strArr2.length) {
                    return Arrays.equals(strArr, strArr2);
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f28291b;
        }

        public String toString() {
            return Arrays.toString(this.f28290a);
        }
    }

    public d2b(zb9.AbstractC16069f abstractC16069f) {
        this.f28274h = (zb9.AbstractC16069f) v7d.checkNotNull(abstractC16069f, "helper");
        f28272l.log(Level.FINE, "Created");
    }

    @eib
    /* JADX INFO: renamed from: e */
    public static ws2 m8820e(@eib ws2 ws2Var, ws2 ws2Var2) {
        if (ws2Var == null) {
            return ws2Var2;
        }
        ws2 ws2Var3 = ws2.READY;
        return (ws2Var == ws2Var3 || ws2Var2 == ws2Var3 || ws2Var == (ws2Var3 = ws2.CONNECTING) || ws2Var2 == ws2Var3 || ws2Var == (ws2Var3 = ws2.IDLE) || ws2Var2 == ws2Var3) ? ws2Var3 : ws2Var;
    }

    /* JADX INFO: renamed from: a */
    public C4589b m8821a(zb9.C16072i c16072i) {
        f28272l.log(Level.FINE, "Received resolution result: {0}", c16072i);
        Map<Object, C4590c> mapM8822f = m8822f(c16072i);
        if (mapM8822f.isEmpty()) {
            n4g n4gVarWithDescription = n4g.f63273t.withDescription("NameResolver returned no usable address. " + c16072i);
            handleNameResolutionError(n4gVarWithDescription);
            return new C4589b(n4gVarWithDescription, null);
        }
        for (Map.Entry<Object, C4590c> entry : mapM8822f.entrySet()) {
            Object key = entry.getKey();
            ac9 policyProvider = entry.getValue().getPolicyProvider();
            Object objM8848i = entry.getValue().m8848i();
            if (this.f28273g.containsKey(key)) {
                C4590c c4590c = this.f28273g.get(key);
                if (c4590c.isDeactivated() && m8835s()) {
                    c4590c.m8852m(policyProvider);
                }
            } else {
                this.f28273g.put(key, entry.getValue());
            }
            C4590c c4590c2 = this.f28273g.get(key);
            zb9.C16072i c16072iM8824h = m8824h(key, c16072i, objM8848i);
            this.f28273g.get(key).m8854o(c16072iM8824h);
            if (!c4590c2.f28287h) {
                c4590c2.f28283d.handleResolvedAddresses(c16072iM8824h);
            }
        }
        ArrayList arrayList = new ArrayList();
        quh it = kx7.copyOf((Collection) this.f28273g.keySet()).iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (!mapM8822f.containsKey(next)) {
                C4590c c4590c3 = this.f28273g.get(next);
                c4590c3.m8847h();
                arrayList.add(c4590c3);
            }
        }
        return new C4589b(n4g.f63258e, arrayList);
    }

    @Override // p000.zb9
    public n4g acceptResolvedAddresses(zb9.C16072i c16072i) {
        try {
            this.f28275i = true;
            C4589b c4589bM8821a = m8821a(c16072i);
            if (!c4589bM8821a.f28278a.isOk()) {
                return c4589bM8821a.f28278a;
            }
            mo8839w();
            m8838v(c4589bM8821a.f28279b);
            return c4589bM8821a.f28278a;
        } finally {
            this.f28275i = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public Map<Object, C4590c> m8822f(zb9.C16072i c16072i) {
        HashMap map = new HashMap();
        Iterator<s45> it = c16072i.getAddresses().iterator();
        while (it.hasNext()) {
            C4591d c4591d = new C4591d(it.next());
            C4590c c4590c = this.f28273g.get(c4591d);
            if (c4590c != null) {
                map.put(c4591d, c4590c);
            } else {
                map.put(c4591d, m8823g(c4591d, null, m8831o(), c16072i));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: g */
    public C4590c m8823g(Object obj, Object obj2, zb9.AbstractC16074k abstractC16074k, zb9.C16072i c16072i) {
        return new C4590c(this, obj, this.f28276j, obj2, abstractC16074k);
    }

    /* JADX INFO: renamed from: h */
    public zb9.C16072i m8824h(Object obj, zb9.C16072i c16072i, Object obj2) {
        C4591d c4591d;
        s45 next;
        if (obj instanceof s45) {
            c4591d = new C4591d((s45) obj);
        } else {
            v7d.checkArgument(obj instanceof C4591d, "key is wrong type");
            c4591d = (C4591d) obj;
        }
        Iterator<s45> it = c16072i.getAddresses().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (c4591d.equals(new C4591d(next))) {
                break;
            }
        }
        v7d.checkNotNull(next, obj + " no longer present in load balancer children");
        return c16072i.toBuilder().setAddresses(Collections.singletonList(next)).setAttributes(sc0.newBuilder().set(zb9.f104686e, Boolean.TRUE).build()).setLoadBalancingPolicyConfig(obj2).build();
    }

    @Override // p000.zb9
    public void handleNameResolutionError(n4g n4gVar) {
        if (this.f28277k != ws2.READY) {
            this.f28274h.updateBalancingState(ws2.TRANSIENT_FAILURE, m8828l(n4gVar));
        }
    }

    /* JADX INFO: renamed from: i */
    public C4590c m8825i(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof s45) {
            obj = new C4591d((s45) obj);
        }
        return this.f28273g.get(obj);
    }

    /* JADX INFO: renamed from: j */
    public C4590c m8826j(s45 s45Var) {
        return m8825i(new C4591d(s45Var));
    }

    @gdi
    /* JADX INFO: renamed from: k */
    public Collection<C4590c> m8827k() {
        return this.f28273g.values();
    }

    /* JADX INFO: renamed from: l */
    public zb9.AbstractC16074k m8828l(n4g n4gVar) {
        return new zb9.C16068e(zb9.C16070g.withError(n4gVar));
    }

    /* JADX INFO: renamed from: m */
    public zb9.AbstractC16069f m8829m() {
        return this.f28274h;
    }

    /* JADX INFO: renamed from: n */
    public ox7<Object, C4590c> m8830n() {
        return ox7.copyOf((Map) this.f28273g);
    }

    /* JADX INFO: renamed from: o */
    public zb9.AbstractC16074k m8831o() {
        return new zb9.C16068e(zb9.C16070g.withNoResult());
    }

    /* JADX INFO: renamed from: p */
    public List<C4590c> m8832p() {
        ArrayList arrayList = new ArrayList();
        for (C4590c c4590c : m8827k()) {
            if (!c4590c.isDeactivated() && c4590c.getCurrentState() == ws2.READY) {
                arrayList.add(c4590c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public abstract zb9.AbstractC16074k mo8833q(Map<Object, zb9.AbstractC16074k> map);

    /* JADX INFO: renamed from: r */
    public void m8834r(C4590c c4590c, n4g n4gVar) {
        c4590c.f28283d.handleNameResolutionError(n4gVar);
    }

    /* JADX INFO: renamed from: s */
    public boolean m8835s() {
        return true;
    }

    @Override // p000.zb9
    public void shutdown() {
        f28272l.log(Level.FINE, "Shutdown");
        Iterator<C4590c> it = this.f28273g.values().iterator();
        while (it.hasNext()) {
            it.next().m8855p();
        }
        this.f28273g.clear();
    }

    /* JADX INFO: renamed from: t */
    public boolean m8836t() {
        return true;
    }

    /* JADX INFO: renamed from: u */
    public void m8837u(Object obj) {
        this.f28273g.remove(obj);
    }

    /* JADX INFO: renamed from: v */
    public void m8838v(List<C4590c> list) {
        Iterator<C4590c> it = list.iterator();
        while (it.hasNext()) {
            it.next().m8855p();
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo8839w() {
        HashMap map = new HashMap();
        ws2 ws2VarM8820e = null;
        for (C4590c c4590c : m8827k()) {
            if (!c4590c.f28287h) {
                map.put(c4590c.f28280a, c4590c.f28286g);
                ws2VarM8820e = m8820e(ws2VarM8820e, c4590c.f28285f);
            }
        }
        if (ws2VarM8820e != null) {
            this.f28274h.updateBalancingState(ws2VarM8820e, mo8833q(map));
            this.f28277k = ws2VarM8820e;
        }
    }
}
