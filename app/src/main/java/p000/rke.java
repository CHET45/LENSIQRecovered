package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p000.p7e;

/* JADX INFO: loaded from: classes.dex */
@p7e({p7e.EnumC10826a.f69936c})
public class rke<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: a */
    public C12135c<K, V> f78574a;

    /* JADX INFO: renamed from: b */
    public C12135c<K, V> f78575b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap<AbstractC12138f<K, V>, Boolean> f78576c = new WeakHashMap<>();

    /* JADX INFO: renamed from: d */
    public int f78577d = 0;

    /* JADX INFO: renamed from: rke$a */
    public static class C12133a<K, V> extends AbstractC12137e<K, V> {
        public C12133a(C12135c<K, V> c12135c, C12135c<K, V> c12135c2) {
            super(c12135c, c12135c2);
        }

        @Override // p000.rke.AbstractC12137e
        /* JADX INFO: renamed from: a */
        public C12135c<K, V> mo21411a(C12135c<K, V> c12135c) {
            return c12135c.f78581d;
        }

        @Override // p000.rke.AbstractC12137e
        /* JADX INFO: renamed from: b */
        public C12135c<K, V> mo21412b(C12135c<K, V> c12135c) {
            return c12135c.f78580c;
        }
    }

    /* JADX INFO: renamed from: rke$b */
    public static class C12134b<K, V> extends AbstractC12137e<K, V> {
        public C12134b(C12135c<K, V> c12135c, C12135c<K, V> c12135c2) {
            super(c12135c, c12135c2);
        }

        @Override // p000.rke.AbstractC12137e
        /* JADX INFO: renamed from: a */
        public C12135c<K, V> mo21411a(C12135c<K, V> c12135c) {
            return c12135c.f78580c;
        }

        @Override // p000.rke.AbstractC12137e
        /* JADX INFO: renamed from: b */
        public C12135c<K, V> mo21412b(C12135c<K, V> c12135c) {
            return c12135c.f78581d;
        }
    }

    /* JADX INFO: renamed from: rke$c */
    public static class C12135c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        @efb
        public final K f78578a;

        /* JADX INFO: renamed from: b */
        @efb
        public final V f78579b;

        /* JADX INFO: renamed from: c */
        public C12135c<K, V> f78580c;

        /* JADX INFO: renamed from: d */
        public C12135c<K, V> f78581d;

        public C12135c(@efb K k, @efb V v) {
            this.f78578a = k;
            this.f78579b = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C12135c)) {
                return false;
            }
            C12135c c12135c = (C12135c) obj;
            return this.f78578a.equals(c12135c.f78578a) && this.f78579b.equals(c12135c.f78579b);
        }

        @Override // java.util.Map.Entry
        @efb
        public K getKey() {
            return this.f78578a;
        }

        @Override // java.util.Map.Entry
        @efb
        public V getValue() {
            return this.f78579b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f78578a.hashCode() ^ this.f78579b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f78578a + "=" + this.f78579b;
        }
    }

    /* JADX INFO: renamed from: rke$d */
    @p7e({p7e.EnumC10826a.f69936c})
    public class C12136d extends AbstractC12138f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public C12135c<K, V> f78582a;

        /* JADX INFO: renamed from: b */
        public boolean f78583b = true;

        public C12136d() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f78583b) {
                return rke.this.f78574a != null;
            }
            C12135c<K, V> c12135c = this.f78582a;
            return (c12135c == null || c12135c.f78580c == null) ? false : true;
        }

        @Override // p000.rke.AbstractC12138f
        public void supportRemove(@efb C12135c<K, V> c12135c) {
            C12135c<K, V> c12135c2 = this.f78582a;
            if (c12135c == c12135c2) {
                C12135c<K, V> c12135c3 = c12135c2.f78581d;
                this.f78582a = c12135c3;
                this.f78583b = c12135c3 == null;
            }
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (this.f78583b) {
                this.f78583b = false;
                this.f78582a = rke.this.f78574a;
            } else {
                C12135c<K, V> c12135c = this.f78582a;
                this.f78582a = c12135c != null ? c12135c.f78580c : null;
            }
            return this.f78582a;
        }
    }

    /* JADX INFO: renamed from: rke$e */
    public static abstract class AbstractC12137e<K, V> extends AbstractC12138f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public C12135c<K, V> f78585a;

        /* JADX INFO: renamed from: b */
        public C12135c<K, V> f78586b;

        public AbstractC12137e(C12135c<K, V> c12135c, C12135c<K, V> c12135c2) {
            this.f78585a = c12135c2;
            this.f78586b = c12135c;
        }

        private C12135c<K, V> nextNode() {
            C12135c<K, V> c12135c = this.f78586b;
            C12135c<K, V> c12135c2 = this.f78585a;
            if (c12135c == c12135c2 || c12135c2 == null) {
                return null;
            }
            return mo21412b(c12135c);
        }

        /* JADX INFO: renamed from: a */
        public abstract C12135c<K, V> mo21411a(C12135c<K, V> c12135c);

        /* JADX INFO: renamed from: b */
        public abstract C12135c<K, V> mo21412b(C12135c<K, V> c12135c);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f78586b != null;
        }

        @Override // p000.rke.AbstractC12138f
        public void supportRemove(@efb C12135c<K, V> c12135c) {
            if (this.f78585a == c12135c && c12135c == this.f78586b) {
                this.f78586b = null;
                this.f78585a = null;
            }
            C12135c<K, V> c12135c2 = this.f78585a;
            if (c12135c2 == c12135c) {
                this.f78585a = mo21411a(c12135c2);
            }
            if (this.f78586b == c12135c) {
                this.f78586b = nextNode();
            }
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            C12135c<K, V> c12135c = this.f78586b;
            this.f78586b = nextNode();
            return c12135c;
        }
    }

    /* JADX INFO: renamed from: rke$f */
    @p7e({p7e.EnumC10826a.f69936c})
    public static abstract class AbstractC12138f<K, V> {
        public abstract void supportRemove(@efb C12135c<K, V> c12135c);
    }

    @hib
    /* JADX INFO: renamed from: a */
    public C12135c<K, V> mo18803a(K k) {
        C12135c<K, V> c12135c = this.f78574a;
        while (c12135c != null && !c12135c.f78578a.equals(k)) {
            c12135c = c12135c.f78580c;
        }
        return c12135c;
    }

    /* JADX INFO: renamed from: b */
    public C12135c<K, V> m21410b(@efb K k, @efb V v) {
        C12135c<K, V> c12135c = new C12135c<>(k, v);
        this.f78577d++;
        C12135c<K, V> c12135c2 = this.f78575b;
        if (c12135c2 == null) {
            this.f78574a = c12135c;
            this.f78575b = c12135c;
            return c12135c;
        }
        c12135c2.f78580c = c12135c;
        c12135c.f78581d = c12135c2;
        this.f78575b = c12135c;
        return c12135c;
    }

    @efb
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C12134b c12134b = new C12134b(this.f78575b, this.f78574a);
        this.f78576c.put(c12134b, Boolean.FALSE);
        return c12134b;
    }

    @hib
    public Map.Entry<K, V> eldest() {
        return this.f78574a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rke)) {
            return false;
        }
        rke rkeVar = (rke) obj;
        if (size() != rkeVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = rkeVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    @efb
    public Iterator<Map.Entry<K, V>> iterator() {
        C12133a c12133a = new C12133a(this.f78574a, this.f78575b);
        this.f78576c.put(c12133a, Boolean.FALSE);
        return c12133a;
    }

    @efb
    public rke<K, V>.C12136d iteratorWithAdditions() {
        rke<K, V>.C12136d c12136d = new C12136d();
        this.f78576c.put(c12136d, Boolean.FALSE);
        return c12136d;
    }

    @hib
    public Map.Entry<K, V> newest() {
        return this.f78575b;
    }

    public V putIfAbsent(@efb K k, @efb V v) {
        C12135c<K, V> c12135cMo18803a = mo18803a(k);
        if (c12135cMo18803a != null) {
            return c12135cMo18803a.f78579b;
        }
        m21410b(k, v);
        return null;
    }

    public V remove(@efb K k) {
        C12135c<K, V> c12135cMo18803a = mo18803a(k);
        if (c12135cMo18803a == null) {
            return null;
        }
        this.f78577d--;
        if (!this.f78576c.isEmpty()) {
            Iterator<AbstractC12138f<K, V>> it = this.f78576c.keySet().iterator();
            while (it.hasNext()) {
                it.next().supportRemove(c12135cMo18803a);
            }
        }
        C12135c<K, V> c12135c = c12135cMo18803a.f78581d;
        if (c12135c != null) {
            c12135c.f78580c = c12135cMo18803a.f78580c;
        } else {
            this.f78574a = c12135cMo18803a.f78580c;
        }
        C12135c<K, V> c12135c2 = c12135cMo18803a.f78580c;
        if (c12135c2 != null) {
            c12135c2.f78581d = c12135c;
        } else {
            this.f78575b = c12135c;
        }
        c12135cMo18803a.f78580c = null;
        c12135cMo18803a.f78581d = null;
        return c12135cMo18803a.f78579b;
    }

    public int size() {
        return this.f78577d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
