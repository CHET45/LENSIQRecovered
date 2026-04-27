package p000;

import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import p000.ax7;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use ImmutableMap.of or another implementation")
@gd7(emulated = true, serializable = true)
@tx4
public abstract class ox7<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: e */
    public static final Map.Entry<?, ?>[] f69138e = new Map.Entry[0];

    /* JADX INFO: renamed from: a */
    @RetainedWith
    @wx1
    @ez8
    public transient dy7<Map.Entry<K, V>> f69139a;

    /* JADX INFO: renamed from: b */
    @RetainedWith
    @wx1
    @ez8
    public transient dy7<K> f69140b;

    /* JADX INFO: renamed from: c */
    @RetainedWith
    @wx1
    @ez8
    public transient ax7<V> f69141c;

    /* JADX INFO: renamed from: d */
    @wx1
    @ez8
    public transient gy7<K, V> f69142d;

    /* JADX INFO: renamed from: ox7$a */
    public class C10702a extends quh<K> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ quh f69143a;

        public C10702a(final ox7 this$0, final quh val$entryIterator) {
            this.f69143a = val$entryIterator;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f69143a.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f69143a.next()).getKey();
        }
    }

    /* JADX INFO: renamed from: ox7$b */
    public static abstract class AbstractC10703b<K, V> extends ox7<K, V> {

        /* JADX INFO: renamed from: ox7$b$a */
        public class a extends rx7<K, V> {
            public a() {
            }

            @Override // p000.rx7
            /* JADX INFO: renamed from: j */
            public ox7<K, V> mo13561j() {
                return AbstractC10703b.this;
            }

            @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public quh<Map.Entry<K, V>> iterator() {
                return AbstractC10703b.this.mo2958j();
            }
        }

        @Override // p000.ox7
        /* JADX INFO: renamed from: c */
        public dy7<Map.Entry<K, V>> mo13559c() {
            return new a();
        }

        @Override // p000.ox7
        /* JADX INFO: renamed from: d */
        public dy7<K> mo2957d() {
            return new sx7(this);
        }

        @Override // p000.ox7
        /* JADX INFO: renamed from: e */
        public ax7<V> mo13560e() {
            return new tx7(this);
        }

        @Override // p000.ox7, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        /* JADX INFO: renamed from: j */
        public abstract quh<Map.Entry<K, V>> mo2958j();

        @Override // p000.ox7, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // p000.ox7, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* JADX INFO: renamed from: ox7$c */
    public final class C10704c extends AbstractC10703b<K, dy7<V>> {

        /* JADX INFO: renamed from: ox7$c$a */
        public class a extends quh<Map.Entry<K, dy7<V>>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Iterator f69146a;

            /* JADX INFO: renamed from: ox7$c$a$a, reason: collision with other inner class name */
            public class C16499a extends AbstractC13818v2<K, dy7<V>> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Map.Entry f69147a;

                public C16499a(final a this$2, final Map.Entry val$backingEntry) {
                    this.f69147a = val$backingEntry;
                }

                @Override // p000.AbstractC13818v2, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f69147a.getKey();
                }

                @Override // p000.AbstractC13818v2, java.util.Map.Entry
                public dy7<V> getValue() {
                    return dy7.m9576of(this.f69147a.getValue());
                }
            }

            public a(final C10704c this$1, final Iterator val$backingIterator) {
                this.f69146a = val$backingIterator;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f69146a.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, dy7<V>> next() {
                return new C16499a(this, (Map.Entry) this.f69146a.next());
            }
        }

        private C10704c() {
        }

        @Override // p000.ox7, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return ox7.this.containsKey(key);
        }

        @Override // p000.ox7.AbstractC10703b, p000.ox7
        /* JADX INFO: renamed from: d */
        public dy7<K> mo2957d() {
            return ox7.this.keySet();
        }

        @Override // p000.ox7
        /* JADX INFO: renamed from: g */
        public boolean mo19087g() {
            return ox7.this.mo19087g();
        }

        @Override // p000.ox7
        /* JADX INFO: renamed from: h */
        public boolean mo2953h() {
            return ox7.this.mo2953h();
        }

        @Override // p000.ox7, java.util.Map
        public int hashCode() {
            return ox7.this.hashCode();
        }

        @Override // p000.ox7.AbstractC10703b
        /* JADX INFO: renamed from: j */
        public quh<Map.Entry<K, dy7<V>>> mo2958j() {
            return new a(this, ox7.this.entrySet().iterator());
        }

        @Override // java.util.Map
        public int size() {
            return ox7.this.size();
        }

        public /* synthetic */ C10704c(ox7 ox7Var, C10702a c10702a) {
            this();
        }

        @Override // p000.ox7, java.util.Map
        @wx1
        public dy7<V> get(@wx1 Object key) {
            Object obj = ox7.this.get(key);
            if (obj == null) {
                return null;
            }
            return dy7.m9576of(obj);
        }
    }

    /* JADX INFO: renamed from: ox7$d */
    @jh4
    public static class C10705d<K, V> {

        /* JADX INFO: renamed from: a */
        @wx1
        public Comparator<? super V> f69148a;

        /* JADX INFO: renamed from: b */
        public Object[] f69149b;

        /* JADX INFO: renamed from: c */
        public int f69150c;

        /* JADX INFO: renamed from: d */
        public boolean f69151d;

        /* JADX INFO: renamed from: e */
        public a f69152e;

        /* JADX INFO: renamed from: ox7$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final Object f69153a;

            /* JADX INFO: renamed from: b */
            public final Object f69154b;

            /* JADX INFO: renamed from: c */
            public final Object f69155c;

            public a(Object key, Object value1, Object value2) {
                this.f69153a = key;
                this.f69154b = value1;
                this.f69155c = value2;
            }

            /* JADX INFO: renamed from: a */
            public IllegalArgumentException m19090a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f69153a + "=" + this.f69154b + " and " + this.f69153a + "=" + this.f69155c);
            }
        }

        public C10705d() {
            this(4);
        }

        /* JADX INFO: renamed from: b */
        public static <V> void m19088b(Object[] alternatingKeysAndValues, int size, Comparator<? super V> valueComparator) {
            Map.Entry[] entryArr = new Map.Entry[size];
            for (int i = 0; i < size; i++) {
                int i2 = i * 2;
                Object obj = alternatingKeysAndValues[i2];
                Objects.requireNonNull(obj);
                Object obj2 = alternatingKeysAndValues[i2 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, size, s7c.from(valueComparator).onResultOf(tt9.m22776F()));
            for (int i3 = 0; i3 < size; i3++) {
                int i4 = i3 * 2;
                alternatingKeysAndValues[i4] = entryArr[i3].getKey();
                alternatingKeysAndValues[i4 + 1] = entryArr[i3].getValue();
            }
        }

        private ox7<K, V> build(boolean throwIfDuplicateKeys) {
            Object[] objArrLastEntryForEachKey;
            a aVar;
            a aVar2;
            if (throwIfDuplicateKeys && (aVar2 = this.f69152e) != null) {
                throw aVar2.m19090a();
            }
            int length = this.f69150c;
            if (this.f69148a == null) {
                objArrLastEntryForEachKey = this.f69149b;
            } else {
                if (this.f69151d) {
                    this.f69149b = Arrays.copyOf(this.f69149b, length * 2);
                }
                objArrLastEntryForEachKey = this.f69149b;
                if (!throwIfDuplicateKeys) {
                    objArrLastEntryForEachKey = lastEntryForEachKey(objArrLastEntryForEachKey, this.f69150c);
                    if (objArrLastEntryForEachKey.length < this.f69149b.length) {
                        length = objArrLastEntryForEachKey.length >>> 1;
                    }
                }
                m19088b(objArrLastEntryForEachKey, length, this.f69148a);
            }
            this.f69151d = true;
            mxd mxdVarM17664k = mxd.m17664k(length, objArrLastEntryForEachKey, this);
            if (!throwIfDuplicateKeys || (aVar = this.f69152e) == null) {
                return mxdVarM17664k;
            }
            throw aVar.m19090a();
        }

        private void ensureCapacity(int minCapacity) {
            int i = minCapacity * 2;
            Object[] objArr = this.f69149b;
            if (i > objArr.length) {
                this.f69149b = Arrays.copyOf(objArr, ax7.AbstractC1637b.m2723a(objArr.length, i));
                this.f69151d = false;
            }
        }

        private Object[] lastEntryForEachKey(Object[] localAlternatingKeysAndValues, int size) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i = size - 1; i >= 0; i--) {
                Object obj = localAlternatingKeysAndValues[i * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i);
                }
            }
            if (bitSet.isEmpty()) {
                return localAlternatingKeysAndValues;
            }
            Object[] objArr = new Object[(size - bitSet.cardinality()) * 2];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size * 2) {
                if (bitSet.get(i2 >>> 1)) {
                    i2 += 2;
                } else {
                    int i4 = i3 + 1;
                    int i5 = i2 + 1;
                    Object obj2 = localAlternatingKeysAndValues[i2];
                    Objects.requireNonNull(obj2);
                    objArr[i3] = obj2;
                    i3 += 2;
                    i2 += 2;
                    Object obj3 = localAlternatingKeysAndValues[i5];
                    Objects.requireNonNull(obj3);
                    objArr[i4] = obj3;
                }
            }
            return objArr;
        }

        @op1
        /* JADX INFO: renamed from: a */
        public C10705d<K, V> mo19089a(C10705d<K, V> other) {
            v7d.checkNotNull(other);
            ensureCapacity(this.f69150c + other.f69150c);
            System.arraycopy(other.f69149b, 0, this.f69149b, this.f69150c * 2, other.f69150c * 2);
            this.f69150c += other.f69150c;
            return this;
        }

        public ox7<K, V> buildKeepingLast() {
            return build(false);
        }

        public ox7<K, V> buildOrThrow() {
            return build(true);
        }

        @op1
        public C10705d<K, V> orderEntriesByValue(Comparator<? super V> valueComparator) {
            v7d.checkState(this.f69148a == null, "valueComparator was already set");
            this.f69148a = (Comparator) v7d.checkNotNull(valueComparator, "valueComparator");
            return this;
        }

        @op1
        public C10705d<K, V> put(K key, V value) {
            ensureCapacity(this.f69150c + 1);
            s72.m21764a(key, value);
            Object[] objArr = this.f69149b;
            int i = this.f69150c;
            objArr[i * 2] = key;
            objArr[(i * 2) + 1] = value;
            this.f69150c = i + 1;
            return this;
        }

        @op1
        public C10705d<K, V> putAll(Map<? extends K, ? extends V> map) {
            return putAll(map.entrySet());
        }

        public C10705d(int initialCapacity) {
            this.f69149b = new Object[initialCapacity * 2];
            this.f69150c = 0;
            this.f69151d = false;
        }

        @op1
        public C10705d<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            if (entries instanceof Collection) {
                ensureCapacity(this.f69150c + ((Collection) entries).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = entries.iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }

        @op1
        public C10705d<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            return put(entry.getKey(), entry.getValue());
        }

        public ox7<K, V> build() {
            return buildOrThrow();
        }
    }

    /* JADX INFO: renamed from: ox7$e */
    @yg8
    public static class C10706e<K, V> implements Serializable {

        /* JADX INFO: renamed from: c */
        public static final boolean f69156c = true;
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final Object f69157a;

        /* JADX INFO: renamed from: b */
        public final Object f69158b;

        public C10706e(ox7<K, V> map) {
            Object[] objArr = new Object[map.size()];
            Object[] objArr2 = new Object[map.size()];
            quh<Map.Entry<K, V>> it = map.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.f69157a = objArr;
            this.f69158b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final Object m19091a() {
            Object[] objArr = (Object[]) this.f69157a;
            Object[] objArr2 = (Object[]) this.f69158b;
            C10705d<K, V> c10705dMo13563b = mo13563b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                c10705dMo13563b.put(objArr[i], objArr2[i]);
            }
            return c10705dMo13563b.buildOrThrow();
        }

        /* JADX INFO: renamed from: b */
        public C10705d<K, V> mo13563b(int size) {
            return new C10705d<>(size);
        }

        public final Object readResolve() {
            Object obj = this.f69157a;
            if (!(obj instanceof dy7)) {
                return m19091a();
            }
            dy7 dy7Var = (dy7) obj;
            ax7 ax7Var = (ax7) this.f69158b;
            C10705d<K, V> c10705dMo13563b = mo13563b(dy7Var.size());
            quh it = dy7Var.iterator();
            quh it2 = ax7Var.iterator();
            while (it.hasNext()) {
                c10705dMo13563b.put(it.next(), it2.next());
            }
            return c10705dMo13563b.buildOrThrow();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19073a(boolean safe, String conflictDescription, Object entry1, Object entry2) {
        if (!safe) {
            throw m19074b(conflictDescription, entry1, entry2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static IllegalArgumentException m19074b(String conflictDescription, Object entry1, Object entry2) {
        return new IllegalArgumentException("Multiple entries with same " + conflictDescription + ": " + entry1 + " and " + entry2);
    }

    public static <K, V> C10705d<K, V> builder() {
        return new C10705d<>();
    }

    public static <K, V> C10705d<K, V> builderWithExpectedSize(int expectedSize) {
        s72.m21765b(expectedSize, "expectedSize");
        return new C10705d<>(expectedSize);
    }

    public static <K, V> ox7<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ox7) && !(map instanceof SortedMap)) {
            ox7<K, V> ox7Var = (ox7) map;
            if (!ox7Var.mo2953h()) {
                return ox7Var;
            }
        }
        return copyOf(map.entrySet());
    }

    /* JADX INFO: renamed from: f */
    public static <K, V> Map.Entry<K, V> m19075f(K key, V value) {
        s72.m21764a(key, value);
        return new AbstractMap.SimpleImmutableEntry(key, value);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19076of() {
        return (ox7<K, V>) mxd.f62719Q;
    }

    @SafeVarargs
    public static <K, V> ox7<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entries) {
        return copyOf(Arrays.asList(entries));
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public gy7<K, V> asMultimap() {
        if (isEmpty()) {
            return gy7.m12027of();
        }
        gy7<K, V> gy7Var = this.f69142d;
        if (gy7Var != null) {
            return gy7Var;
        }
        gy7<K, V> gy7Var2 = new gy7<>(new C10704c(this, null), size(), null);
        this.f69142d = gy7Var2;
        return gy7Var2;
    }

    /* JADX INFO: renamed from: c */
    public abstract dy7<Map.Entry<K, V>> mo13559c();

    @Override // java.util.Map
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@wx1 Object key) {
        return get(key) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@wx1 Object value) {
        return values().contains(value);
    }

    /* JADX INFO: renamed from: d */
    public abstract dy7<K> mo2957d();

    /* JADX INFO: renamed from: e */
    public abstract ax7<V> mo13560e();

    @Override // java.util.Map
    public boolean equals(@wx1 Object object) {
        return tt9.m22794o(this, object);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo19087g() {
        return false;
    }

    @Override // java.util.Map
    @wx1
    public abstract V get(@wx1 Object key);

    @Override // java.util.Map
    @wx1
    public final V getOrDefault(@wx1 Object key, @wx1 V defaultValue) {
        V v = get(key);
        return v != null ? v : defaultValue;
    }

    /* JADX INFO: renamed from: h */
    public abstract boolean mo2953h();

    @Override // java.util.Map
    public int hashCode() {
        return t6f.m22397b(entrySet());
    }

    /* JADX INFO: renamed from: i */
    public quh<K> mo11218i() {
        return new C10702a(this, entrySet().iterator());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @wx1
    @Deprecated
    @op1
    public final V remove(@wx1 Object o) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return tt9.m22771A(this);
    }

    @yg8
    public Object writeReplace() {
        return new C10706e(this);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19077of(K k1, V v1) {
        s72.m21764a(k1, v1);
        return mxd.m17663j(1, new Object[]{k1, v1});
    }

    @Override // java.util.Map, java.util.SortedMap
    public dy7<Map.Entry<K, V>> entrySet() {
        dy7<Map.Entry<K, V>> dy7Var = this.f69139a;
        if (dy7Var != null) {
            return dy7Var;
        }
        dy7<Map.Entry<K, V>> dy7VarMo13559c = mo13559c();
        this.f69139a = dy7VarMo13559c;
        return dy7VarMo13559c;
    }

    @Override // java.util.Map, java.util.SortedMap
    public dy7<K> keySet() {
        dy7<K> dy7Var = this.f69140b;
        if (dy7Var != null) {
            return dy7Var;
        }
        dy7<K> dy7VarMo2957d = mo2957d();
        this.f69140b = dy7VarMo2957d;
        return dy7VarMo2957d;
    }

    @Override // java.util.Map, java.util.SortedMap
    public ax7<V> values() {
        ax7<V> ax7Var = this.f69141c;
        if (ax7Var != null) {
            return ax7Var;
        }
        ax7<V> ax7VarMo13560e = mo13560e();
        this.f69141c = ax7VarMo13560e;
        return ax7VarMo13560e;
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19078of(K k1, V v1, K k2, V v2) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        return mxd.m17663j(2, new Object[]{k1, v1, k2, v2});
    }

    public static <K, V> ox7<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        C10705d c10705d = new C10705d(entries instanceof Collection ? ((Collection) entries).size() : 4);
        c10705d.putAll(entries);
        return c10705d.build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19079of(K k1, V v1, K k2, V v2, K k3, V v3) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        return mxd.m17663j(3, new Object[]{k1, v1, k2, v2, k3, v3});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19080of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        return mxd.m17663j(4, new Object[]{k1, v1, k2, v2, k3, v3, k4, v4});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19081of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        return mxd.m17663j(5, new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19082of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        s72.m21764a(k6, v6);
        return mxd.m17663j(6, new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19083of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        s72.m21764a(k6, v6);
        s72.m21764a(k7, v7);
        return mxd.m17663j(7, new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19084of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        s72.m21764a(k6, v6);
        s72.m21764a(k7, v7);
        s72.m21764a(k8, v8);
        return mxd.m17663j(8, new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19085of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        s72.m21764a(k6, v6);
        s72.m21764a(k7, v7);
        s72.m21764a(k8, v8);
        s72.m21764a(k9, v9);
        return mxd.m17663j(9, new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9});
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ox7<K, V> m19086of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        s72.m21764a(k1, v1);
        s72.m21764a(k2, v2);
        s72.m21764a(k3, v3);
        s72.m21764a(k4, v4);
        s72.m21764a(k5, v5);
        s72.m21764a(k6, v6);
        s72.m21764a(k7, v7);
        s72.m21764a(k8, v8);
        s72.m21764a(k9, v9);
        s72.m21764a(k10, v10);
        return mxd.m17663j(10, new Object[]{k1, v1, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10});
    }
}
