package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public class gv5<K, V> extends AbstractC2173c3<K, V> implements iv5<K, V> {

    /* JADX INFO: renamed from: f */
    public final u3b<K, V> f41457f;

    /* JADX INFO: renamed from: m */
    public final l8d<? super K> f41458m;

    /* JADX INFO: renamed from: gv5$a */
    public static class C6590a<K, V> extends fs6<V> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final K f41459a;

        public C6590a(@dgc K key) {
            this.f41459a = key;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Queue
        public boolean add(@dgc V v) {
            add(0, v);
            return true;
        }

        @Override // p000.lr6, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        @Override // p000.fs6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m */
        public List<V> mo8967m() {
            return Collections.emptyList();
        }

        @Override // p000.fs6, java.util.List
        public void add(int index, @dgc V element) {
            v7d.checkPositionIndex(index, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f41459a);
        }

        @Override // p000.fs6, java.util.List
        @op1
        public boolean addAll(int index, Collection<? extends V> elements) {
            v7d.checkNotNull(elements);
            v7d.checkPositionIndex(index, 0);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f41459a);
        }
    }

    /* JADX INFO: renamed from: gv5$b */
    public static class C6591b<K, V> extends jt6<V> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final K f41460a;

        public C6591b(@dgc K key) {
            this.f41460a = key;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Queue
        public boolean add(@dgc V element) {
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f41460a);
        }

        @Override // p000.lr6, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            v7d.checkNotNull(collection);
            throw new IllegalArgumentException("Key does not satisfy predicate: " + this.f41460a);
        }

        @Override // p000.jt6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m */
        public Set<V> mo8967m() {
            return Collections.emptySet();
        }
    }

    /* JADX INFO: renamed from: gv5$c */
    public class C6592c extends lr6<Map.Entry<K, V>> {
        public C6592c() {
        }

        @Override // p000.lr6, p000.zs6
        /* JADX INFO: renamed from: a */
        public Collection<Map.Entry<K, V>> mo8967m() {
            return h82.filter(gv5.this.f41457f.entries(), gv5.this.entryPredicate());
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (gv5.this.f41457f.containsKey(entry.getKey()) && gv5.this.f41458m.apply((Object) entry.getKey())) {
                return gv5.this.f41457f.remove(entry.getKey(), entry.getValue());
            }
            return false;
        }
    }

    public gv5(u3b<K, V> unfiltered, l8d<? super K> keyPredicate) {
        this.f41457f = (u3b) v7d.checkNotNull(unfiltered);
        this.f41458m = (l8d) v7d.checkNotNull(keyPredicate);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: a */
    public Map<K, Collection<V>> mo3677a() {
        return tt9.filterKeys(this.f41457f.asMap(), this.f41458m);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: b */
    public Collection<Map.Entry<K, V>> mo3678b() {
        return new C6592c();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: c */
    public Set<K> mo3679c() {
        return t6f.filter(this.f41457f.keySet(), this.f41458m);
    }

    @Override // p000.u3b
    public void clear() {
        keySet().clear();
    }

    @Override // p000.u3b
    public boolean containsKey(@wx1 Object key) {
        if (this.f41457f.containsKey(key)) {
            return this.f41458m.apply(key);
        }
        return false;
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: d */
    public d4b<K> mo3680d() {
        return e4b.filter(this.f41457f.keys(), this.f41458m);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: e */
    public Collection<V> mo3681e() {
        return new jv5(this);
    }

    @Override // p000.iv5
    public l8d<? super Map.Entry<K, V>> entryPredicate() {
        return tt9.m22799t(this.f41458m);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: f */
    public Iterator<Map.Entry<K, V>> mo3682f() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.u3b
    public Collection<V> get(@dgc K key) {
        return this.f41458m.apply(key) ? this.f41457f.get(key) : this.f41457f instanceof p6f ? new C6591b(key) : new C6590a(key);
    }

    /* JADX INFO: renamed from: h */
    public Collection<V> m11995h() {
        return this.f41457f instanceof p6f ? Collections.emptySet() : Collections.emptyList();
    }

    @Override // p000.u3b
    public Collection<V> removeAll(@wx1 Object key) {
        return containsKey(key) ? this.f41457f.removeAll(key) : m11995h();
    }

    @Override // p000.u3b
    public int size() {
        Iterator<Collection<V>> it = asMap().values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public u3b<K, V> unfiltered() {
        return this.f41457f;
    }
}
