package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.k4d;

/* JADX INFO: loaded from: classes3.dex */
public class tb7<K extends k4d, V> {

    /* JADX INFO: renamed from: a */
    public final C12969a<K, V> f84145a = new C12969a<>();

    /* JADX INFO: renamed from: b */
    public final Map<K, C12969a<K, V>> f84146b = new HashMap();

    /* JADX INFO: renamed from: tb7$a */
    public static class C12969a<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f84147a;

        /* JADX INFO: renamed from: b */
        public List<V> f84148b;

        /* JADX INFO: renamed from: c */
        public C12969a<K, V> f84149c;

        /* JADX INFO: renamed from: d */
        public C12969a<K, V> f84150d;

        public C12969a() {
            this(null);
        }

        public void add(V v) {
            if (this.f84148b == null) {
                this.f84148b = new ArrayList();
            }
            this.f84148b.add(v);
        }

        @hib
        public V removeLast() {
            int size = size();
            if (size > 0) {
                return this.f84148b.remove(size - 1);
            }
            return null;
        }

        public int size() {
            List<V> list = this.f84148b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C12969a(K k) {
            this.f84150d = this;
            this.f84149c = this;
            this.f84147a = k;
        }
    }

    private void makeHead(C12969a<K, V> c12969a) {
        removeEntry(c12969a);
        C12969a<K, V> c12969a2 = this.f84145a;
        c12969a.f84150d = c12969a2;
        c12969a.f84149c = c12969a2.f84149c;
        updateEntry(c12969a);
    }

    private void makeTail(C12969a<K, V> c12969a) {
        removeEntry(c12969a);
        C12969a<K, V> c12969a2 = this.f84145a;
        c12969a.f84150d = c12969a2.f84150d;
        c12969a.f84149c = c12969a2;
        updateEntry(c12969a);
    }

    private static <K, V> void removeEntry(C12969a<K, V> c12969a) {
        C12969a<K, V> c12969a2 = c12969a.f84150d;
        c12969a2.f84149c = c12969a.f84149c;
        c12969a.f84149c.f84150d = c12969a2;
    }

    private static <K, V> void updateEntry(C12969a<K, V> c12969a) {
        c12969a.f84149c.f84150d = c12969a;
        c12969a.f84150d.f84149c = c12969a;
    }

    @hib
    public V get(K k) {
        C12969a<K, V> c12969a = this.f84146b.get(k);
        if (c12969a == null) {
            c12969a = new C12969a<>(k);
            this.f84146b.put(k, c12969a);
        } else {
            k.offer();
        }
        makeHead(c12969a);
        return c12969a.removeLast();
    }

    public void put(K k, V v) {
        C12969a<K, V> c12969a = this.f84146b.get(k);
        if (c12969a == null) {
            c12969a = new C12969a<>(k);
            makeTail(c12969a);
            this.f84146b.put(k, c12969a);
        } else {
            k.offer();
        }
        c12969a.add(v);
    }

    @hib
    public V removeLast() {
        for (C12969a c12969a = this.f84145a.f84150d; !c12969a.equals(this.f84145a); c12969a = c12969a.f84150d) {
            V v = (V) c12969a.removeLast();
            if (v != null) {
                return v;
            }
            removeEntry(c12969a);
            this.f84146b.remove(c12969a.f84147a);
            ((k4d) c12969a.f84147a).offer();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        C12969a c12969a = this.f84145a.f84149c;
        boolean z = false;
        while (!c12969a.equals(this.f84145a)) {
            sb.append('{');
            sb.append(c12969a.f84147a);
            sb.append(':');
            sb.append(c12969a.size());
            sb.append("}, ");
            c12969a = c12969a.f84149c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
