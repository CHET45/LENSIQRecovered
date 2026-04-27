package p000;

import im.zego.zegoexpress.ZegoExpressErrorCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class oe3 {

    /* JADX INFO: renamed from: oe3$b */
    public static class C10338b {

        /* JADX INFO: renamed from: a */
        public final ej2<?> f67383a;

        /* JADX INFO: renamed from: b */
        public final Set<C10338b> f67384b = new HashSet();

        /* JADX INFO: renamed from: c */
        public final Set<C10338b> f67385c = new HashSet();

        public C10338b(ej2<?> ej2Var) {
            this.f67383a = ej2Var;
        }

        /* JADX INFO: renamed from: a */
        public void m18597a(C10338b c10338b) {
            this.f67384b.add(c10338b);
        }

        /* JADX INFO: renamed from: b */
        public void m18598b(C10338b c10338b) {
            this.f67385c.add(c10338b);
        }

        /* JADX INFO: renamed from: c */
        public ej2<?> m18599c() {
            return this.f67383a;
        }

        /* JADX INFO: renamed from: d */
        public Set<C10338b> m18600d() {
            return this.f67384b;
        }

        /* JADX INFO: renamed from: e */
        public boolean m18601e() {
            return this.f67384b.isEmpty();
        }

        /* JADX INFO: renamed from: f */
        public boolean m18602f() {
            return this.f67385c.isEmpty();
        }

        /* JADX INFO: renamed from: g */
        public void m18603g(C10338b c10338b) {
            this.f67385c.remove(c10338b);
        }
    }

    /* JADX INFO: renamed from: oe3$c */
    public static class C10339c {

        /* JADX INFO: renamed from: a */
        public final pkd<?> f67386a;

        /* JADX INFO: renamed from: b */
        public final boolean f67387b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C10339c)) {
                return false;
            }
            C10339c c10339c = (C10339c) obj;
            return c10339c.f67386a.equals(this.f67386a) && c10339c.f67387b == this.f67387b;
        }

        public int hashCode() {
            return ((this.f67386a.hashCode() ^ ZegoExpressErrorCode.CommonEngineNotStarted) * ZegoExpressErrorCode.CommonEngineNotStarted) ^ Boolean.valueOf(this.f67387b).hashCode();
        }

        private C10339c(pkd<?> pkdVar, boolean z) {
            this.f67386a = pkdVar;
            this.f67387b = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m18596a(List<ej2<?>> list) {
        Set<C10338b> graph = toGraph(list);
        Set<C10338b> roots = getRoots(graph);
        int i = 0;
        while (!roots.isEmpty()) {
            C10338b next = roots.iterator().next();
            roots.remove(next);
            i++;
            for (C10338b c10338b : next.m18600d()) {
                c10338b.m18603g(next);
                if (c10338b.m18602f()) {
                    roots.add(c10338b);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C10338b c10338b2 : graph) {
            if (!c10338b2.m18602f() && !c10338b2.m18601e()) {
                arrayList.add(c10338b2.m18599c());
            }
        }
        throw new k64(arrayList);
    }

    private static Set<C10338b> getRoots(Set<C10338b> set) {
        HashSet hashSet = new HashSet();
        for (C10338b c10338b : set) {
            if (c10338b.m18602f()) {
                hashSet.add(c10338b);
            }
        }
        return hashSet;
    }

    private static Set<C10338b> toGraph(List<ej2<?>> list) {
        Set<C10338b> set;
        HashMap map = new HashMap(list.size());
        Iterator<ej2<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (C10338b c10338b : (Set) it2.next()) {
                        for (i64 i64Var : c10338b.m18599c().getDependencies()) {
                            if (i64Var.isDirectInjection() && (set = (Set) map.get(new C10339c(i64Var.getInterface(), i64Var.isSet()))) != null) {
                                for (C10338b c10338b2 : set) {
                                    c10338b.m18597a(c10338b2);
                                    c10338b2.m18598b(c10338b);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            ej2<?> next = it.next();
            C10338b c10338b3 = new C10338b(next);
            for (pkd<? super Object> pkdVar : next.getProvidedInterfaces()) {
                C10339c c10339c = new C10339c(pkdVar, !next.isValue());
                if (!map.containsKey(c10339c)) {
                    map.put(c10339c, new HashSet());
                }
                Set set2 = (Set) map.get(c10339c);
                if (!set2.isEmpty() && !c10339c.f67387b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", pkdVar));
                }
                set2.add(c10338b3);
            }
        }
    }
}
