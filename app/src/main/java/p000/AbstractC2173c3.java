package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.x3b;

/* JADX INFO: renamed from: c3 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC2173c3<K, V> implements u3b<K, V> {

    /* JADX INFO: renamed from: a */
    @wx1
    @ez8
    public transient Collection<Map.Entry<K, V>> f15613a;

    /* JADX INFO: renamed from: b */
    @wx1
    @ez8
    public transient Set<K> f15614b;

    /* JADX INFO: renamed from: c */
    @wx1
    @ez8
    public transient d4b<K> f15615c;

    /* JADX INFO: renamed from: d */
    @wx1
    @ez8
    public transient Collection<V> f15616d;

    /* JADX INFO: renamed from: e */
    @wx1
    @ez8
    public transient Map<K, Collection<V>> f15617e;

    /* JADX INFO: renamed from: c3$a */
    public class a extends x3b.AbstractC14900f<K, V> {
        public a() {
        }

        @Override // p000.x3b.AbstractC14900f
        /* JADX INFO: renamed from: a */
        public u3b<K, V> mo3684a() {
            return AbstractC2173c3.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC2173c3.this.mo3682f();
        }
    }

    /* JADX INFO: renamed from: c3$b */
    public class b extends AbstractC2173c3<K, V>.a implements Set<Map.Entry<K, V>> {
        public b(final AbstractC2173c3 this$0) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@wx1 Object obj) {
            return t6f.m22396a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return t6f.m22397b(this);
        }
    }

    /* JADX INFO: renamed from: c3$c */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC2173c3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object o) {
            return AbstractC2173c3.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC2173c3.this.mo3683g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC2173c3.this.size();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Map<K, Collection<V>> mo3677a();

    @Override // p000.u3b
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f15617e;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapMo3677a = mo3677a();
        this.f15617e = mapMo3677a;
        return mapMo3677a;
    }

    /* JADX INFO: renamed from: b */
    public abstract Collection<Map.Entry<K, V>> mo3678b();

    /* JADX INFO: renamed from: c */
    public abstract Set<K> mo3679c();

    @Override // p000.u3b
    public boolean containsEntry(@wx1 Object key, @wx1 Object value) {
        Collection<V> collection = asMap().get(key);
        return collection != null && collection.contains(value);
    }

    @Override // p000.u3b
    public boolean containsValue(@wx1 Object value) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(value)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract d4b<K> mo3680d();

    /* JADX INFO: renamed from: e */
    public abstract Collection<V> mo3681e();

    @Override // p000.u3b
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f15613a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionMo3678b = mo3678b();
        this.f15613a = collectionMo3678b;
        return collectionMo3678b;
    }

    @Override // p000.u3b
    public boolean equals(@wx1 Object object) {
        return x3b.m24942c(this, object);
    }

    /* JADX INFO: renamed from: f */
    public abstract Iterator<Map.Entry<K, V>> mo3682f();

    /* JADX INFO: renamed from: g */
    public Iterator<V> mo3683g() {
        return tt9.m22777G(entries().iterator());
    }

    @Override // p000.u3b
    public int hashCode() {
        return asMap().hashCode();
    }

    @Override // p000.u3b
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // p000.u3b
    public Set<K> keySet() {
        Set<K> set = this.f15614b;
        if (set != null) {
            return set;
        }
        Set<K> setMo3679c = mo3679c();
        this.f15614b = setMo3679c;
        return setMo3679c;
    }

    @Override // p000.u3b
    public d4b<K> keys() {
        d4b<K> d4bVar = this.f15615c;
        if (d4bVar != null) {
            return d4bVar;
        }
        d4b<K> d4bVarMo3680d = mo3680d();
        this.f15615c = d4bVarMo3680d;
        return d4bVarMo3680d;
    }

    @Override // p000.u3b
    @op1
    public boolean put(@dgc K key, @dgc V value) {
        return get(key).add(value);
    }

    @Override // p000.u3b
    @op1
    public boolean putAll(@dgc K key, Iterable<? extends V> values) {
        v7d.checkNotNull(values);
        if (values instanceof Collection) {
            Collection<? extends V> collection = (Collection) values;
            return !collection.isEmpty() && get(key).addAll(collection);
        }
        Iterator<? extends V> it = values.iterator();
        return it.hasNext() && wg8.addAll(get(key), it);
    }

    @Override // p000.u3b
    @op1
    public boolean remove(@wx1 Object key, @wx1 Object value) {
        Collection<V> collection = asMap().get(key);
        return collection != null && collection.remove(value);
    }

    @Override // p000.u3b
    @op1
    public Collection<V> replaceValues(@dgc K key, Iterable<? extends V> values) {
        v7d.checkNotNull(values);
        Collection<V> collectionRemoveAll = removeAll(key);
        putAll(key, values);
        return collectionRemoveAll;
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // p000.u3b
    public Collection<V> values() {
        Collection<V> collection = this.f15616d;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionMo3681e = mo3681e();
        this.f15616d = collectionMo3681e;
        return collectionMo3681e;
    }

    @Override // p000.u3b
    @op1
    public boolean putAll(u3b<? extends K, ? extends V> multimap) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : multimap.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }
}
