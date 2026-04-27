package p000;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class x60<K, V> extends scf<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: d */
    @hib
    public x60<K, V>.C14930a f96837d;

    /* JADX INFO: renamed from: e */
    @hib
    public x60<K, V>.C14932c f96838e;

    /* JADX INFO: renamed from: f */
    @hib
    public x60<K, V>.C14934e f96839f;

    /* JADX INFO: renamed from: x60$a */
    public final class C14930a extends AbstractSet<Map.Entry<K, V>> {
        public C14930a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @efb
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C14933d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return x60.this.size();
        }
    }

    /* JADX INFO: renamed from: x60$b */
    public final class C14931b extends b08<K> {
        public C14931b() {
            super(x60.this.size());
        }

        @Override // p000.b08
        /* JADX INFO: renamed from: a */
        public K mo2782a(int i) {
            return x60.this.keyAt(i);
        }

        @Override // p000.b08
        /* JADX INFO: renamed from: b */
        public void mo2783b(int i) {
            x60.this.removeAt(i);
        }
    }

    /* JADX INFO: renamed from: x60$d */
    public final class C14933d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public int f96843a;

        /* JADX INFO: renamed from: b */
        public int f96844b = -1;

        /* JADX INFO: renamed from: c */
        public boolean f96845c;

        public C14933d() {
            this.f96843a = x60.this.size() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f96845c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return cv2.equal(entry.getKey(), x60.this.keyAt(this.f96844b)) && cv2.equal(entry.getValue(), x60.this.valueAt(this.f96844b));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f96845c) {
                return x60.this.keyAt(this.f96844b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f96845c) {
                return x60.this.valueAt(this.f96844b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f96844b < this.f96843a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f96845c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kKeyAt = x60.this.keyAt(this.f96844b);
            V vValueAt = x60.this.valueAt(this.f96844b);
            return (kKeyAt == null ? 0 : kKeyAt.hashCode()) ^ (vValueAt != null ? vValueAt.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f96845c) {
                throw new IllegalStateException();
            }
            x60.this.removeAt(this.f96844b);
            this.f96844b--;
            this.f96843a--;
            this.f96845c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f96845c) {
                return x60.this.setValueAt(this.f96844b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f96844b++;
            this.f96845c = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: x60$f */
    public final class C14935f extends b08<V> {
        public C14935f() {
            super(x60.this.size());
        }

        @Override // p000.b08
        /* JADX INFO: renamed from: a */
        public V mo2782a(int i) {
            return x60.this.valueAt(i);
        }

        @Override // p000.b08
        /* JADX INFO: renamed from: b */
        public void mo2783b(int i) {
            x60.this.removeAt(i);
        }
    }

    public x60() {
    }

    /* JADX INFO: renamed from: a */
    public static <T> boolean m25018a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public boolean containsAll(@efb Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.scf, java.util.Map
    public boolean containsKey(@hib Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.scf, java.util.Map
    public boolean containsValue(@hib Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    @efb
    public Set<Map.Entry<K, V>> entrySet() {
        x60<K, V>.C14930a c14930a = this.f96837d;
        if (c14930a != null) {
            return c14930a;
        }
        x60<K, V>.C14930a c14930a2 = new C14930a();
        this.f96837d = c14930a2;
        return c14930a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.scf, java.util.Map
    public V get(@hib Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    @efb
    public Set<K> keySet() {
        x60<K, V>.C14932c c14932c = this.f96838e;
        if (c14932c != null) {
            return c14932c;
        }
        x60<K, V>.C14932c c14932c2 = new C14932c();
        this.f96838e = c14932c2;
        return c14932c2;
    }

    @Override // java.util.Map
    public void putAll(@efb Map<? extends K, ? extends V> map) {
        ensureCapacity(size() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.scf, java.util.Map
    public V remove(@hib Object obj) {
        return (V) super.remove(obj);
    }

    public boolean removeAll(@efb Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    public boolean retainAll(@efb Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(keyAt(size2))) {
                removeAt(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    @efb
    public Collection<V> values() {
        x60<K, V>.C14934e c14934e = this.f96839f;
        if (c14934e != null) {
            return c14934e;
        }
        x60<K, V>.C14934e c14934e2 = new C14934e();
        this.f96839f = c14934e2;
        return c14934e2;
    }

    public x60(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: x60$c */
    public final class C14932c implements Set<K> {
        public C14932c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(@efb Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            x60.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return x60.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@efb Collection<?> collection) {
            return x60.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return x60.m25018a(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = x60.this.size() - 1; size >= 0; size--) {
                K kKeyAt = x60.this.keyAt(size);
                iHashCode += kKeyAt == null ? 0 : kKeyAt.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return x60.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @efb
        public Iterator<K> iterator() {
            return new C14931b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iIndexOfKey = x60.this.indexOfKey(obj);
            if (iIndexOfKey < 0) {
                return false;
            }
            x60.this.removeAt(iIndexOfKey);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(@efb Collection<?> collection) {
            return x60.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(@efb Collection<?> collection) {
            return x60.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return x60.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        @efb
        public Object[] toArray() {
            int size = x60.this.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = x60.this.keyAt(i);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        @efb
        public <T> T[] toArray(@efb T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = x60.this.keyAt(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* JADX INFO: renamed from: x60$e */
    public final class C14934e implements Collection<V> {
        public C14934e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(@efb Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            x60.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return x60.this.__restricted$indexOfValue(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return x60.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @efb
        public Iterator<V> iterator() {
            return new C14935f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int i__restricted$indexOfValue = x60.this.__restricted$indexOfValue(obj);
            if (i__restricted$indexOfValue < 0) {
                return false;
            }
            x60.this.removeAt(i__restricted$indexOfValue);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(@efb Collection<?> collection) {
            int size = x60.this.size();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (collection.contains(x60.this.valueAt(i))) {
                    x60.this.removeAt(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(@efb Collection<?> collection) {
            int size = x60.this.size();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (!collection.contains(x60.this.valueAt(i))) {
                    x60.this.removeAt(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return x60.this.size();
        }

        @Override // java.util.Collection
        @efb
        public Object[] toArray() {
            int size = x60.this.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = x60.this.valueAt(i);
            }
            return objArr;
        }

        @Override // java.util.Collection
        @efb
        public <T> T[] toArray(@efb T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = x60.this.valueAt(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public x60(@hib scf scfVar) {
        super(scfVar);
    }
}
