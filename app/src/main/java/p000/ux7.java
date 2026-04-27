package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import com.google.j2objc.annotations.Weak;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.b1f;
import p000.d4b;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public abstract class ux7<K, V> extends ir0<K, V> implements Serializable {

    @yg8
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: f */
    public final transient ox7<K, ? extends ax7<V>> f89332f;

    /* JADX INFO: renamed from: m */
    public final transient int f89333m;

    /* JADX INFO: renamed from: ux7$a */
    public class C13755a extends quh<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a */
        public final Iterator<? extends Map.Entry<K, ? extends ax7<V>>> f89334a;

        /* JADX INFO: renamed from: b */
        @wx1
        public K f89335b = null;

        /* JADX INFO: renamed from: c */
        public Iterator<V> f89336c = wg8.m24511e();

        public C13755a() {
            this.f89334a = ux7.this.f89332f.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f89336c.hasNext() || this.f89334a.hasNext();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            if (!this.f89336c.hasNext()) {
                Map.Entry<K, ? extends ax7<V>> next = this.f89334a.next();
                this.f89335b = next.getKey();
                this.f89336c = next.getValue().iterator();
            }
            K k = this.f89335b;
            Objects.requireNonNull(k);
            return tt9.immutableEntry(k, this.f89336c.next());
        }
    }

    /* JADX INFO: renamed from: ux7$b */
    public class C13756b extends quh<V> {

        /* JADX INFO: renamed from: a */
        public Iterator<? extends ax7<V>> f89338a;

        /* JADX INFO: renamed from: b */
        public Iterator<V> f89339b = wg8.m24511e();

        public C13756b() {
            this.f89338a = ux7.this.f89332f.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f89339b.hasNext() || this.f89338a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f89339b.hasNext()) {
                this.f89339b = this.f89338a.next().iterator();
            }
            return this.f89339b.next();
        }
    }

    /* JADX INFO: renamed from: ux7$d */
    public static class C13758d<K, V> extends ax7<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b */
        @Weak
        public final ux7<K, V> f89344b;

        public C13758d(ux7<K, V> multimap) {
            this.f89344b = multimap;
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            return this.f89344b.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return this.f89344b.m23631l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f89344b.size();
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public quh<Map.Entry<K, V>> iterator() {
            return this.f89344b.mo3682f();
        }
    }

    /* JADX INFO: renamed from: ux7$e */
    @jd7
    @yg8
    public static class C13759e {

        /* JADX INFO: renamed from: a */
        public static final b1f.C1698b<ux7> f89345a = b1f.m2790a(ux7.class, "map");

        /* JADX INFO: renamed from: b */
        public static final b1f.C1698b<ux7> f89346b = b1f.m2790a(ux7.class, MediaInformation.KEY_SIZE);
    }

    /* JADX INFO: renamed from: ux7$f */
    public class C13760f extends vx7<K> {
        public C13760f() {
        }

        @jd7
        @yg8
        private void readObject(ObjectInputStream stream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // p000.vx7, p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object object) {
            return ux7.this.containsKey(object);
        }

        @Override // p000.d4b
        public int count(@wx1 Object element) {
            ax7<V> ax7Var = ux7.this.f89332f.get(element);
            if (ax7Var == null) {
                return 0;
            }
            return ax7Var.size();
        }

        @Override // p000.vx7
        /* JADX INFO: renamed from: f */
        public d4b.InterfaceC4612a<K> mo8961f(int index) {
            Map.Entry<K, ? extends ax7<V>> entry = ux7.this.f89332f.entrySet().asList().get(index);
            return e4b.immutableEntry(entry.getKey(), entry.getValue().size());
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
        public int size() {
            return ux7.this.size();
        }

        @Override // p000.vx7, p000.ax7
        @jd7
        @yg8
        public Object writeReplace() {
            return new C13761g(ux7.this);
        }

        @Override // p000.vx7, p000.d4b
        public dy7<K> elementSet() {
            return ux7.this.keySet();
        }
    }

    /* JADX INFO: renamed from: ux7$g */
    @jd7
    @yg8
    public static final class C13761g implements Serializable {

        /* JADX INFO: renamed from: a */
        public final ux7<?, ?> f89348a;

        public C13761g(ux7<?, ?> multimap) {
            this.f89348a = multimap;
        }

        public Object readResolve() {
            return this.f89348a.keys();
        }
    }

    /* JADX INFO: renamed from: ux7$h */
    public static final class C13762h<K, V> extends ax7<V> {

        @yg8
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: b */
        @Weak
        public final transient ux7<K, V> f89349b;

        public C13762h(ux7<K, V> multimap) {
            this.f89349b = multimap;
        }

        @Override // p000.ax7
        @jd7
        /* JADX INFO: renamed from: a */
        public int mo2718a(Object[] dst, int offset) {
            quh<? extends ax7<V>> it = this.f89349b.f89332f.values().iterator();
            while (it.hasNext()) {
                offset = it.next().mo2718a(dst, offset);
            }
            return offset;
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object object) {
            return this.f89349b.containsValue(object);
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f89349b.size();
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public quh<V> iterator() {
            return this.f89349b.mo3683g();
        }
    }

    public ux7(ox7<K, ? extends ax7<V>> map, int size) {
        this.f89332f = map;
        this.f89333m = size;
    }

    public static <K, V> C13757c<K, V> builder() {
        return new C13757c<>();
    }

    public static <K, V> ux7<K, V> copyOf(u3b<? extends K, ? extends V> multimap) {
        if (multimap instanceof ux7) {
            ux7<K, V> ux7Var = (ux7) multimap;
            if (!ux7Var.m23631l()) {
                return ux7Var;
            }
        }
        return mx7.copyOf((u3b) multimap);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ux7<K, V> m23621of() {
        return mx7.m17655of();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: a */
    public Map<K, Collection<V>> mo3677a() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: c */
    public Set<K> mo3679c() {
        throw new AssertionError("unreachable");
    }

    @Override // p000.u3b
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean containsEntry(@wx1 Object key, @wx1 Object value) {
        return super.containsEntry(key, value);
    }

    @Override // p000.u3b
    public boolean containsKey(@wx1 Object key) {
        return this.f89332f.containsKey(key);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public boolean containsValue(@wx1 Object value) {
        return value != null && super.containsValue(value);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean equals(@wx1 Object object) {
        return super.equals(object);
    }

    @Override // p000.u3b
    public abstract ax7<V> get(K key);

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ax7<Map.Entry<K, V>> mo3678b() {
        return new C13758d(this);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public vx7<K> mo3680d() {
        return new C13760f();
    }

    public abstract ux7<V, K> inverse();

    @Override // p000.AbstractC2173c3, p000.u3b
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ax7<V> mo3681e() {
        return new C13762h(this);
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public quh<Map.Entry<K, V>> mo3682f() {
        return new C13755a();
    }

    /* JADX INFO: renamed from: l */
    public boolean m23631l() {
        return this.f89332f.mo2953h();
    }

    @Override // p000.AbstractC2173c3
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public quh<V> mo3683g() {
        return new C13756b();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final boolean put(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final boolean putAll(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @hh4("Always throws UnsupportedOperationException")
    @op1
    @Deprecated
    public final boolean remove(@wx1 Object key, @wx1 Object value) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.u3b
    public int size() {
        return this.f89333m;
    }

    @Override // p000.AbstractC2173c3
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* JADX INFO: renamed from: ux7$c */
    @jh4
    public static class C13757c<K, V> {

        /* JADX INFO: renamed from: a */
        public final Map<K, Collection<V>> f89341a = swc.m22276i();

        /* JADX INFO: renamed from: b */
        @wx1
        public Comparator<? super K> f89342b;

        /* JADX INFO: renamed from: c */
        @wx1
        public Comparator<? super V> f89343c;

        @op1
        /* JADX INFO: renamed from: a */
        public C13757c<K, V> mo12033a(C13757c<K, V> other) {
            for (Map.Entry<K, Collection<V>> entry : other.f89341a.entrySet()) {
                putAll(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* JADX INFO: renamed from: b */
        public Collection<V> mo12034b() {
            return new ArrayList();
        }

        public ux7<K, V> build() {
            Collection collectionEntrySet = this.f89341a.entrySet();
            Comparator<? super K> comparator = this.f89342b;
            if (comparator != null) {
                collectionEntrySet = s7c.from(comparator).m21770a().immutableSortedCopy(collectionEntrySet);
            }
            return mx7.m17654n(collectionEntrySet, this.f89343c);
        }

        @op1
        public C13757c<K, V> orderKeysBy(Comparator<? super K> keyComparator) {
            this.f89342b = (Comparator) v7d.checkNotNull(keyComparator);
            return this;
        }

        @op1
        public C13757c<K, V> orderValuesBy(Comparator<? super V> valueComparator) {
            this.f89343c = (Comparator) v7d.checkNotNull(valueComparator);
            return this;
        }

        @op1
        public C13757c<K, V> put(K key, V value) {
            s72.m21764a(key, value);
            Collection<V> collection = this.f89341a.get(key);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f89341a;
                Collection<V> collectionMo12034b = mo12034b();
                map.put(key, collectionMo12034b);
                collection = collectionMo12034b;
            }
            collection.add(value);
            return this;
        }

        @op1
        public C13757c<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = entries.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        @op1
        public C13757c<K, V> putAll(K key, Iterable<? extends V> values) {
            if (key != null) {
                Collection<V> collection = this.f89341a.get(key);
                if (collection != null) {
                    for (V v : values) {
                        s72.m21764a(key, v);
                        collection.add(v);
                    }
                    return this;
                }
                Iterator<? extends V> it = values.iterator();
                if (!it.hasNext()) {
                    return this;
                }
                Collection<V> collectionMo12034b = mo12034b();
                while (it.hasNext()) {
                    V next = it.next();
                    s72.m21764a(key, next);
                    collectionMo12034b.add(next);
                }
                this.f89341a.put(key, collectionMo12034b);
                return this;
            }
            throw new NullPointerException("null key in entry: null=" + vg8.toString(values));
        }

        @op1
        public C13757c<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        @op1
        public C13757c<K, V> putAll(K key, V... values) {
            return putAll(key, Arrays.asList(values));
        }

        @op1
        public C13757c<K, V> putAll(u3b<? extends K, ? extends V> multimap) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : multimap.asMap().entrySet()) {
                putAll(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ux7<K, V> m23622of(K k1, V v1) {
        return mx7.m17656of((Object) k1, (Object) v1);
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public ox7<K, Collection<V>> asMap() {
        return this.f89332f;
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public ax7<Map.Entry<K, V>> entries() {
        return (ax7) super.entries();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public dy7<K> keySet() {
        return this.f89332f.keySet();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public vx7<K> keys() {
        return (vx7) super.keys();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final boolean putAll(u3b<? extends K, ? extends V> multimap) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.u3b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public ax7<V> removeAll(@wx1 Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public ax7<V> replaceValues(K key, Iterable<? extends V> values) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC2173c3, p000.u3b
    public ax7<V> values() {
        return (ax7) super.values();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ux7<K, V> m23623of(K k1, V v1, K k2, V v2) {
        return mx7.m17657of((Object) k1, (Object) v1, (Object) k2, (Object) v2);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ux7<K, V> m23624of(K k1, V v1, K k2, V v2, K k3, V v3) {
        return mx7.m17658of((Object) k1, (Object) v1, (Object) k2, (Object) v2, (Object) k3, (Object) v3);
    }

    public static <K, V> ux7<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return mx7.copyOf((Iterable) entries);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ux7<K, V> m23625of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        return mx7.m17659of((Object) k1, (Object) v1, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ux7<K, V> m23626of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return mx7.m17660of((Object) k1, (Object) v1, (Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4, (Object) k5, (Object) v5);
    }
}
