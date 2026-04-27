package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@wx4
public class bt9<K, V> {

    /* JADX INFO: renamed from: a */
    public final Map<K, V> f14734a;

    /* JADX INFO: renamed from: b */
    @wx1
    public volatile transient Map.Entry<K, V> f14735b;

    /* JADX INFO: renamed from: bt9$a */
    public class C2049a extends AbstractSet<K> {

        /* JADX INFO: renamed from: bt9$a$a */
        public class a extends quh<K> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator f14737a;

            public a(final Iterator val$entryIterator) {
                this.f14737a = val$entryIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f14737a.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry entry = (Map.Entry) this.f14737a.next();
                bt9.this.f14735b = entry;
                return (K) entry.getKey();
            }
        }

        public C2049a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object key) {
            return bt9.this.m3395e(key);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return bt9.this.f14734a.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public quh<K> iterator() {
            return new a(bt9.this.f14734a.entrySet().iterator());
        }
    }

    public bt9(Map<K, V> backingMap) {
        this.f14734a = (Map) v7d.checkNotNull(backingMap);
    }

    /* JADX INFO: renamed from: c */
    public final void m3393c() {
        mo3394d();
        this.f14734a.clear();
    }

    /* JADX INFO: renamed from: d */
    public void mo3394d() {
        this.f14735b = null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3395e(@wx1 Object key) {
        return mo3397g(key) != null || this.f14734a.containsKey(key);
    }

    @wx1
    /* JADX INFO: renamed from: f */
    public V mo3396f(Object key) {
        v7d.checkNotNull(key);
        V vMo3397g = mo3397g(key);
        return vMo3397g == null ? m3398h(key) : vMo3397g;
    }

    @wx1
    /* JADX INFO: renamed from: g */
    public V mo3397g(@wx1 Object key) {
        Map.Entry<K, V> entry = this.f14735b;
        if (entry == null || entry.getKey() != key) {
            return null;
        }
        return entry.getValue();
    }

    @wx1
    /* JADX INFO: renamed from: h */
    public final V m3398h(Object key) {
        v7d.checkNotNull(key);
        return this.f14734a.get(key);
    }

    @op1
    @wx1
    /* JADX INFO: renamed from: i */
    public final V m3399i(K key, V value) {
        v7d.checkNotNull(key);
        v7d.checkNotNull(value);
        mo3394d();
        return this.f14734a.put(key, value);
    }

    @op1
    @wx1
    /* JADX INFO: renamed from: j */
    public final V m3400j(Object key) {
        v7d.checkNotNull(key);
        mo3394d();
        return this.f14734a.remove(key);
    }

    /* JADX INFO: renamed from: k */
    public final Set<K> m3401k() {
        return new C2049a();
    }
}
