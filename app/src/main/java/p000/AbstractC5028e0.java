package p000;

import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: e0 */
/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public abstract class AbstractC5028e0<K, V> extends qs6<K, V> implements k11<K, V>, Serializable {

    @jd7
    @yg8
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    public transient Map<K, V> f31399a;

    /* JADX INFO: renamed from: b */
    @RetainedWith
    public transient AbstractC5028e0<V, K> f31400b;

    /* JADX INFO: renamed from: c */
    @wx1
    @ez8
    public transient Set<K> f31401c;

    /* JADX INFO: renamed from: d */
    @wx1
    @ez8
    public transient Set<V> f31402d;

    /* JADX INFO: renamed from: e */
    @wx1
    @ez8
    public transient Set<Map.Entry<K, V>> f31403e;

    /* JADX INFO: renamed from: e0$a */
    public class a implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        @wx1
        public Map.Entry<K, V> f31404a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterator f31405b;

        public a(final Iterator val$iterator) {
            this.f31405b = val$iterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31405b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry<K, V> entry = this.f31404a;
            if (entry == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            V value = entry.getValue();
            this.f31405b.remove();
            AbstractC5028e0.this.removeFromInverseMap(value);
            this.f31404a = null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f31405b.next();
            this.f31404a = entry;
            return new b(entry);
        }
    }

    /* JADX INFO: renamed from: e0$b */
    public class b extends rs6<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map.Entry<K, V> f31407a;

        public b(Map.Entry<K, V> delegate) {
            this.f31407a = delegate;
        }

        @Override // p000.rs6, p000.zs6
        /* JADX INFO: renamed from: a */
        public Map.Entry<K, V> mo8967m() {
            return this.f31407a;
        }

        @Override // p000.rs6, java.util.Map.Entry
        public V setValue(V value) {
            AbstractC5028e0.this.mo9606p(value);
            v7d.checkState(AbstractC5028e0.this.entrySet().contains(this), "entry no longer in map");
            if (okb.equal(value, getValue())) {
                return value;
            }
            v7d.checkArgument(!AbstractC5028e0.this.containsValue(value), "value already present: %s", value);
            V value2 = this.f31407a.setValue(value);
            v7d.checkState(okb.equal(value, AbstractC5028e0.this.get(getKey())), "entry no longer in map");
            AbstractC5028e0.this.updateInverseMap(getKey(), true, value2, value);
            return value2;
        }
    }

    /* JADX INFO: renamed from: e0$c */
    public class c extends jt6<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Set<Map.Entry<K, V>> f31409a;

        private c() {
            this.f31409a = AbstractC5028e0.this.f31399a.entrySet();
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC5028e0.this.clear();
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            return tt9.m22791l(mo8967m(), o);
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> c) {
            return m16323e(c);
        }

        @Override // p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC5028e0.this.m9607q();
        }

        @Override // p000.jt6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m */
        public Set<Map.Entry<K, V>> mo8967m() {
            return this.f31409a;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object object) {
            if (!this.f31409a.contains(object) || !(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            AbstractC5028e0.this.f31400b.f31399a.remove(entry.getValue());
            this.f31409a.remove(entry);
            return true;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c) {
            return mo14281h(c);
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> c) {
            return mo16326i(c);
        }

        @Override // p000.lr6, java.util.Collection
        public Object[] toArray() {
            return m16327j();
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m16328k(tArr);
        }

        public /* synthetic */ c(AbstractC5028e0 abstractC5028e0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: e0$d */
    public static class d<K, V> extends AbstractC5028e0<K, V> {

        @jd7
        @yg8
        private static final long serialVersionUID = 0;

        public d(Map<K, V> backward, AbstractC5028e0<V, K> forward) {
            super(backward, forward, null);
        }

        @jd7
        @yg8
        private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
            stream.defaultReadObject();
            Object object = stream.readObject();
            Objects.requireNonNull(object);
            m9610t((AbstractC5028e0) object);
        }

        @jd7
        @yg8
        private void writeObject(ObjectOutputStream stream) throws IOException {
            stream.defaultWriteObject();
            stream.writeObject(inverse());
        }

        @Override // p000.AbstractC5028e0, p000.qs6, p000.zs6
        /* JADX INFO: renamed from: delegate */
        public /* bridge */ /* synthetic */ Object mo8967m() {
            return super.mo8967m();
        }

        @Override // p000.AbstractC5028e0
        @dgc
        /* JADX INFO: renamed from: o */
        public K mo135o(@dgc K key) {
            return this.f31400b.mo9606p(key);
        }

        @Override // p000.AbstractC5028e0
        @dgc
        /* JADX INFO: renamed from: p */
        public V mo9606p(@dgc V value) {
            return this.f31400b.mo135o(value);
        }

        @jd7
        @yg8
        public Object readResolve() {
            return inverse().inverse();
        }

        @Override // p000.AbstractC5028e0, p000.qs6, java.util.Map, p000.k11
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* JADX INFO: renamed from: e0$e */
    public class e extends jt6<K> {
        private e() {
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC5028e0.this.clear();
        }

        @Override // p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return tt9.m22797r(AbstractC5028e0.this.entrySet().iterator());
        }

        @Override // p000.jt6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m */
        public Set<K> mo8967m() {
            return AbstractC5028e0.this.f31399a.keySet();
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object key) {
            if (!contains(key)) {
                return false;
            }
            AbstractC5028e0.this.removeFromBothMaps(key);
            return true;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> keysToRemove) {
            return mo14281h(keysToRemove);
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> keysToRetain) {
            return mo16326i(keysToRetain);
        }

        public /* synthetic */ e(AbstractC5028e0 abstractC5028e0, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: e0$f */
    public class f extends jt6<V> {

        /* JADX INFO: renamed from: a */
        public final Set<V> f31412a;

        private f() {
            this.f31412a = AbstractC5028e0.this.f31400b.keySet();
        }

        @Override // p000.lr6, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return tt9.m22777G(AbstractC5028e0.this.entrySet().iterator());
        }

        @Override // p000.jt6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m */
        public Set<V> mo8967m() {
            return this.f31412a;
        }

        @Override // p000.lr6, java.util.Collection
        public Object[] toArray() {
            return m16327j();
        }

        @Override // p000.zs6
        public String toString() {
            return mo16329l();
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m16328k(tArr);
        }

        public /* synthetic */ f(AbstractC5028e0 abstractC5028e0, a aVar) {
            this();
        }
    }

    public /* synthetic */ AbstractC5028e0(Map map, AbstractC5028e0 abstractC5028e0, a aVar) {
        this(map, abstractC5028e0);
    }

    @wx1
    private V putInBothMaps(@dgc K key, @dgc V value, boolean force) {
        mo135o(key);
        mo9606p(value);
        boolean zContainsKey = containsKey(key);
        if (zContainsKey && okb.equal(value, get(key))) {
            return value;
        }
        if (force) {
            inverse().remove(value);
        } else {
            v7d.checkArgument(!containsValue(value), "value already present: %s", value);
        }
        V vPut = this.f31399a.put(key, value);
        updateInverseMap(key, zContainsKey, vPut, value);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @op1
    @dgc
    public V removeFromBothMaps(@wx1 Object obj) {
        V v = (V) sib.m22018a(this.f31399a.remove(obj));
        removeFromInverseMap(v);
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFromInverseMap(@dgc V oldValue) {
        this.f31400b.f31399a.remove(oldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void updateInverseMap(@dgc K key, boolean containedKey, @wx1 V oldValue, @dgc V newValue) {
        if (containedKey) {
            removeFromInverseMap(sib.m22018a(oldValue));
        }
        this.f31400b.f31399a.put(newValue, key);
    }

    @Override // p000.qs6, p000.zs6
    /* JADX INFO: renamed from: a */
    public Map<K, V> mo8967m() {
        return this.f31399a;
    }

    @Override // p000.qs6, java.util.Map
    public void clear() {
        this.f31399a.clear();
        this.f31400b.f31399a.clear();
    }

    @Override // p000.qs6, java.util.Map
    public boolean containsValue(@wx1 Object value) {
        return this.f31400b.containsKey(value);
    }

    @Override // p000.qs6, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f31403e;
        if (set != null) {
            return set;
        }
        c cVar = new c(this, null);
        this.f31403e = cVar;
        return cVar;
    }

    @op1
    @wx1
    public V forcePut(@dgc K key, @dgc V value) {
        return putInBothMaps(key, value, true);
    }

    public k11<V, K> inverse() {
        return this.f31400b;
    }

    @Override // p000.qs6, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f31401c;
        if (set != null) {
            return set;
        }
        e eVar = new e(this, null);
        this.f31401c = eVar;
        return eVar;
    }

    @op1
    @dgc
    /* JADX INFO: renamed from: o */
    public K mo135o(@dgc K key) {
        return key;
    }

    @op1
    @dgc
    /* JADX INFO: renamed from: p */
    public V mo9606p(@dgc V value) {
        return value;
    }

    @Override // p000.qs6, java.util.Map, p000.k11
    @op1
    @wx1
    public V put(@dgc K key, @dgc V value) {
        return putInBothMaps(key, value, false);
    }

    @Override // p000.qs6, java.util.Map, p000.k11
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: q */
    public Iterator<Map.Entry<K, V>> m9607q() {
        return new a(this.f31399a.entrySet().iterator());
    }

    /* JADX INFO: renamed from: r */
    public AbstractC5028e0<V, K> m9608r(Map<V, K> backward) {
        return new d(backward, this);
    }

    @Override // p000.qs6, java.util.Map
    @op1
    @wx1
    public V remove(@wx1 Object key) {
        if (containsKey(key)) {
            return removeFromBothMaps(key);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public void m9609s(Map<K, V> forward, Map<V, K> backward) {
        v7d.checkState(this.f31399a == null);
        v7d.checkState(this.f31400b == null);
        v7d.checkArgument(forward.isEmpty());
        v7d.checkArgument(backward.isEmpty());
        v7d.checkArgument(forward != backward);
        this.f31399a = forward;
        this.f31400b = m9608r(backward);
    }

    /* JADX INFO: renamed from: t */
    public void m9610t(AbstractC5028e0<V, K> inverse) {
        this.f31400b = inverse;
    }

    public AbstractC5028e0(Map<K, V> forward, Map<V, K> backward) {
        m9609s(forward, backward);
    }

    @Override // p000.qs6, java.util.Map, p000.k11
    public Set<V> values() {
        Set<V> set = this.f31402d;
        if (set != null) {
            return set;
        }
        f fVar = new f(this, null);
        this.f31402d = fVar;
        return fVar;
    }

    private AbstractC5028e0(Map<K, V> backward, AbstractC5028e0<V, K> forward) {
        this.f31399a = backward;
        this.f31400b = forward;
    }
}
