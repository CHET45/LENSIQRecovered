package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import p000.ax7;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class iy7<K, V> extends ly7<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: F */
    public static final Comparator<Comparable> f48856F = s7c.natural();

    /* JADX INFO: renamed from: H */
    public static final iy7<Comparable, Object> f48857H = new iy7<>(py7.m19839l(s7c.natural()), kx7.m15110of());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    @wx1
    public transient iy7<K, V> f48858C;

    /* JADX INFO: renamed from: f */
    public final transient qxd<K> f48859f;

    /* JADX INFO: renamed from: m */
    public final transient kx7<V> f48860m;

    /* JADX INFO: renamed from: iy7$a */
    public class C7664a extends rx7<K, V> {

        /* JADX INFO: renamed from: iy7$a$a */
        public class a extends kx7<Map.Entry<K, V>> {
            public a() {
            }

            @Override // p000.ax7
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return iy7.this.size();
            }

            @Override // java.util.List
            public Map.Entry<K, V> get(int index) {
                return new AbstractMap.SimpleImmutableEntry(iy7.this.f48859f.asList().get(index), iy7.this.f48860m.get(index));
            }
        }

        public C7664a() {
        }

        @Override // p000.dy7
        /* JADX INFO: renamed from: h */
        public kx7<Map.Entry<K, V>> mo9582h() {
            return new a();
        }

        @Override // p000.rx7
        /* JADX INFO: renamed from: j */
        public ox7<K, V> mo13561j() {
            return iy7.this;
        }

        @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public quh<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    /* JADX INFO: renamed from: iy7$b */
    public static class C7665b<K, V> extends ox7.C10705d<K, V> {

        /* JADX INFO: renamed from: f */
        public transient Object[] f48863f;

        /* JADX INFO: renamed from: g */
        public transient Object[] f48864g;

        /* JADX INFO: renamed from: h */
        public final Comparator<? super K> f48865h;

        public C7665b(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private void ensureCapacity(int minCapacity) {
            Object[] objArr = this.f48863f;
            if (minCapacity > objArr.length) {
                int iM2723a = ax7.AbstractC1637b.m2723a(objArr.length, minCapacity);
                this.f48863f = Arrays.copyOf(this.f48863f, iM2723a);
                this.f48864g = Arrays.copyOf(this.f48864g, iM2723a);
            }
        }

        @op1
        /* JADX INFO: renamed from: c */
        public C7665b<K, V> m13562c(C7665b<K, V> other) {
            ensureCapacity(this.f69150c + other.f69150c);
            System.arraycopy(other.f48863f, 0, this.f48863f, this.f69150c, other.f69150c);
            System.arraycopy(other.f48864g, 0, this.f48864g, this.f69150c, other.f69150c);
            this.f69150c += other.f69150c;
            return this;
        }

        private C7665b(Comparator<? super K> comparator, int initialCapacity) {
            this.f48865h = (Comparator) v7d.checkNotNull(comparator);
            this.f48863f = new Object[initialCapacity];
            this.f48864g = new Object[initialCapacity];
        }

        @Override // p000.ox7.C10705d
        public iy7<K, V> build() {
            return buildOrThrow();
        }

        @Override // p000.ox7.C10705d
        @hh4
        @Deprecated
        public final iy7<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        @Override // p000.ox7.C10705d
        public iy7<K, V> buildOrThrow() {
            int i = this.f69150c;
            if (i == 0) {
                return iy7.m13546n(this.f48865h);
            }
            if (i == 1) {
                Comparator<? super K> comparator = this.f48865h;
                Object obj = this.f48863f[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.f48864g[0];
                Objects.requireNonNull(obj2);
                return iy7.m13558of(comparator, obj, obj2);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f48863f, i);
            Arrays.sort(objArrCopyOf, this.f48865h);
            Object[] objArr = new Object[this.f69150c];
            for (int i2 = 0; i2 < this.f69150c; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.f48865h.compare(objArrCopyOf[i3], objArrCopyOf[i2]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i3] + " and " + objArrCopyOf[i2]);
                    }
                }
                Object obj3 = this.f48863f[i2];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.f48865h);
                Object obj4 = this.f48864g[i2];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new iy7<>(new qxd(kx7.m15108e(objArrCopyOf), this.f48865h), kx7.m15108e(objArr));
        }

        @Override // p000.ox7.C10705d
        @Deprecated
        @hh4("Always throws UnsupportedOperationException")
        @op1
        public final C7665b<K, V> orderEntriesByValue(Comparator<? super V> valueComparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @Override // p000.ox7.C10705d
        @op1
        public C7665b<K, V> put(K key, V value) {
            ensureCapacity(this.f69150c + 1);
            s72.m21764a(key, value);
            Object[] objArr = this.f48863f;
            int i = this.f69150c;
            objArr[i] = key;
            this.f48864g[i] = value;
            this.f69150c = i + 1;
            return this;
        }

        @Override // p000.ox7.C10705d
        @op1
        public C7665b<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // p000.ox7.C10705d
        @op1
        public C7665b<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
            super.putAll((Iterable) entries);
            return this;
        }

        @Override // p000.ox7.C10705d
        @op1
        public C7665b<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }
    }

    /* JADX INFO: renamed from: iy7$c */
    @yg8
    public static class C7666c<K, V> extends ox7.C10706e<K, V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: d */
        public final Comparator<? super K> f48866d;

        public C7666c(iy7<K, V> sortedMap) {
            super(sortedMap);
            this.f48866d = sortedMap.comparator();
        }

        @Override // p000.ox7.C10706e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C7665b<K, V> mo13563b(int size) {
            return new C7665b<>(this.f48866d);
        }
    }

    public iy7(qxd<K> keySet, kx7<V> valueList) {
        this(keySet, valueList, null);
    }

    public static <K, V> iy7<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return copyOfInternal(map, (s7c) f48856F);
    }

    private static <K, V> iy7<K, V> copyOfInternal(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean zEquals = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == f48856F) {
                zEquals = true;
            }
        }
        if (zEquals && (map instanceof iy7)) {
            iy7<K, V> iy7Var = (iy7) map;
            if (!iy7Var.mo2953h()) {
                return iy7Var;
            }
        }
        return fromEntries(comparator, zEquals, map.entrySet());
    }

    public static <K, V> iy7<K, V> copyOfSorted(SortedMap<K, ? extends V> map) {
        Comparator<? super K> comparator = map.comparator();
        if (comparator == null) {
            comparator = f48856F;
        }
        if (map instanceof iy7) {
            iy7<K, V> iy7Var = (iy7) map;
            if (!iy7Var.mo2953h()) {
                return iy7Var;
            }
        }
        return fromEntries(comparator, true, map.entrySet());
    }

    private static <K extends Comparable<? super K>, V> iy7<K, V> fromEntries(Map.Entry<K, V>... entries) {
        return fromEntries(s7c.natural(), false, entries, entries.length);
    }

    private iy7<K, V> getSubMap(int fromIndex, int toIndex) {
        return (fromIndex == 0 && toIndex == size()) ? this : fromIndex == toIndex ? m13546n(comparator()) : new iy7<>(this.f48859f.m20706r(fromIndex, toIndex), this.f48860m.subList(fromIndex, toIndex));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$fromEntries$0(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        Objects.requireNonNull(entry);
        Objects.requireNonNull(entry2);
        return comparator.compare(entry.getKey(), entry2.getKey());
    }

    /* JADX INFO: renamed from: n */
    public static <K, V> iy7<K, V> m13546n(Comparator<? super K> comparator) {
        return s7c.natural().equals(comparator) ? m13547of() : new iy7<>(py7.m19839l(comparator), kx7.m15110of());
    }

    public static <K extends Comparable<?>, V> C7665b<K, V> naturalOrder() {
        return new C7665b<>(s7c.natural());
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> iy7<K, V> m13547of() {
        return (iy7<K, V>) f48857H;
    }

    public static <K, V> C7665b<K, V> orderedBy(Comparator<K> comparator) {
        return new C7665b<>(comparator);
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <K extends Comparable<?>, V> C7665b<K, V> reverseOrder() {
        return new C7665b<>(s7c.natural().reverse());
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: c */
    public dy7<Map.Entry<K, V>> mo13559c() {
        return isEmpty() ? dy7.m9575of() : new C7664a();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> ceilingEntry(K key) {
        return tailMap((Object) key, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public K ceilingKey(K k) {
        return (K) tt9.m22798s(ceilingEntry(k));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: d */
    public dy7<K> mo2957d() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: e */
    public ax7<V> mo13560e() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> floorEntry(K key) {
        return headMap((Object) key, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public K floorKey(K k) {
        return (K) tt9.m22798s(floorEntry(k));
    }

    @Override // p000.ox7, java.util.Map
    @wx1
    public V get(@wx1 Object key) {
        int iIndexOf = this.f48859f.indexOf(key);
        if (iIndexOf == -1) {
            return null;
        }
        return this.f48860m.get(iIndexOf);
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: h */
    public boolean mo2953h() {
        return this.f48859f.isPartialView() || this.f48860m.isPartialView();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> higherEntry(K key) {
        return tailMap((Object) key, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public K higherKey(K k) {
        return (K) tt9.m22798s(higherEntry(k));
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    @wx1
    public Map.Entry<K, V> lowerEntry(K key) {
        return headMap((Object) key, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @wx1
    public K lowerKey(K k) {
        return (K) tt9.m22798s(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @wx1
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.f48860m.size();
    }

    @Override // p000.ox7
    @yg8
    public Object writeReplace() {
        return new C7666c(this);
    }

    public iy7(qxd<K> keySet, kx7<V> valueList, @wx1 iy7<K, V> descendingMap) {
        this.f48859f = keySet;
        this.f48860m = valueList;
        this.f48858C = descendingMap;
    }

    private static <K, V> iy7<K, V> fromEntries(Comparator<? super K> comparator, boolean sameComparator, Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        Map.Entry[] entryArr = (Map.Entry[]) vg8.m23937c(entries, ox7.f69138e);
        return fromEntries(comparator, sameComparator, entryArr, entryArr.length);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Liy7<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static iy7 m13548of(Comparable k1, Object v1) {
        return m13558of(s7c.natural(), k1, v1);
    }

    @Override // java.util.NavigableMap
    public py7<K> descendingKeySet() {
        return this.f48859f.descendingSet();
    }

    @Override // java.util.NavigableMap
    public iy7<K, V> descendingMap() {
        iy7<K, V> iy7Var = this.f48858C;
        return iy7Var == null ? isEmpty() ? m13546n(s7c.from(comparator()).reverse()) : new iy7<>((qxd) this.f48859f.descendingSet(), this.f48860m.reverse(), this) : iy7Var;
    }

    @Override // p000.ox7, java.util.Map, java.util.SortedMap
    public dy7<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public py7<K> navigableKeySet() {
        return this.f48859f;
    }

    @Override // p000.ox7, java.util.Map, java.util.SortedMap
    public ax7<V> values() {
        return this.f48860m;
    }

    public static <K, V> iy7<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return copyOfInternal(map, (Comparator) v7d.checkNotNull(comparator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: of */
    public static <K, V> iy7<K, V> m13558of(Comparator<? super K> comparator, K k1, V v1) {
        return new iy7<>(new qxd(kx7.m15111of(k1), (Comparator) v7d.checkNotNull(comparator)), kx7.m15111of(v1));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public iy7<K, V> headMap(K toKey) {
        return headMap((Object) toKey, false);
    }

    @Override // p000.ox7, java.util.Map, java.util.SortedMap
    public py7<K> keySet() {
        return this.f48859f;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public iy7<K, V> subMap(K fromKey, K toKey) {
        return subMap((Object) fromKey, true, (Object) toKey, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public iy7<K, V> tailMap(K fromKey) {
        return tailMap((Object) fromKey, true);
    }

    public static <K, V> iy7<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries) {
        return copyOf(entries, (s7c) f48856F);
    }

    private static <K, V> iy7<K, V> fromEntries(final Comparator<? super K> comparator, boolean sameComparator, Map.Entry<K, V>[] entryArray, int size) {
        if (size == 0) {
            return m13546n(comparator);
        }
        if (size != 1) {
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            if (sameComparator) {
                for (int i = 0; i < size; i++) {
                    Map.Entry<K, V> entry = entryArray[i];
                    Objects.requireNonNull(entry);
                    Map.Entry<K, V> entry2 = entry;
                    K key = entry2.getKey();
                    V value = entry2.getValue();
                    s72.m21764a(key, value);
                    objArr[i] = key;
                    objArr2[i] = value;
                }
            } else {
                Arrays.sort(entryArray, 0, size, new Comparator() { // from class: hy7
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return iy7.lambda$fromEntries$0(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                    }
                });
                Map.Entry<K, V> entry3 = entryArray[0];
                Objects.requireNonNull(entry3);
                Map.Entry<K, V> entry4 = entry3;
                Object key2 = entry4.getKey();
                objArr[0] = key2;
                V value2 = entry4.getValue();
                objArr2[0] = value2;
                s72.m21764a(objArr[0], value2);
                int i2 = 1;
                while (i2 < size) {
                    Map.Entry<K, V> entry5 = entryArray[i2 - 1];
                    Objects.requireNonNull(entry5);
                    Map.Entry<K, V> entry6 = entry5;
                    Map.Entry<K, V> entry7 = entryArray[i2];
                    Objects.requireNonNull(entry7);
                    Map.Entry<K, V> entry8 = entry7;
                    Object key3 = entry8.getKey();
                    V value3 = entry8.getValue();
                    s72.m21764a(key3, value3);
                    objArr[i2] = key3;
                    objArr2[i2] = value3;
                    ox7.m19073a(comparator.compare(key2, key3) != 0, "key", entry6, entry8);
                    i2++;
                    key2 = key3;
                }
            }
            return new iy7<>(new qxd(kx7.m15108e(objArr), comparator), kx7.m15108e(objArr2));
        }
        Map.Entry<K, V> entry9 = entryArray[0];
        Objects.requireNonNull(entry9);
        Map.Entry<K, V> entry10 = entry9;
        return m13558of(comparator, entry10.getKey(), entry10.getValue());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public iy7<K, V> headMap(K k, boolean z) {
        return getSubMap(0, this.f48859f.m20707s((K) v7d.checkNotNull(k), z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public iy7<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
        v7d.checkNotNull(fromKey);
        v7d.checkNotNull(toKey);
        v7d.checkArgument(comparator().compare(fromKey, toKey) <= 0, "expected fromKey <= toKey but %s > %s", fromKey, toKey);
        return headMap((Object) toKey, toInclusive).tailMap((Object) fromKey, fromInclusive);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public iy7<K, V> tailMap(K k, boolean z) {
        return getSubMap(this.f48859f.m20708t((K) v7d.checkNotNull(k), z), size());
    }

    public static <K, V> iy7<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> entries, Comparator<? super K> comparator) {
        return fromEntries((Comparator) v7d.checkNotNull(comparator), false, entries);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Liy7<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static iy7 m13549of(Comparable k1, Object v1, Comparable k2, Object v2) {
        return fromEntries(ox7.m19075f(k1, v1), ox7.m19075f(k2, v2));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Liy7<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static iy7 m13550of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3) {
        return fromEntries(ox7.m19075f(k1, v1), ox7.m19075f(k2, v2), ox7.m19075f(k3, v3));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Liy7<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static iy7 m13551of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4) {
        return fromEntries(ox7.m19075f(k1, v1), ox7.m19075f(k2, v2), ox7.m19075f(k3, v3), ox7.m19075f(k4, v4));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Liy7<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static iy7 m13552of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5) {
        return fromEntries(ox7.m19075f(k1, v1), ox7.m19075f(k2, v2), ox7.m19075f(k3, v3), ox7.m19075f(k4, v4), ox7.m19075f(k5, v5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Liy7<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static iy7 m13553of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5, Comparable k6, Object v6) {
        return fromEntries(ox7.m19075f(k1, v1), ox7.m19075f(k2, v2), ox7.m19075f(k3, v3), ox7.m19075f(k4, v4), ox7.m19075f(k5, v5), ox7.m19075f(k6, v6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Liy7<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static iy7 m13554of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5, Comparable k6, Object v6, Comparable k7, Object v7) {
        return fromEntries(ox7.m19075f(k1, v1), ox7.m19075f(k2, v2), ox7.m19075f(k3, v3), ox7.m19075f(k4, v4), ox7.m19075f(k5, v5), ox7.m19075f(k6, v6), ox7.m19075f(k7, v7));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Liy7<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static iy7 m13555of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5, Comparable k6, Object v6, Comparable k7, Object v7, Comparable k8, Object v8) {
        return fromEntries(ox7.m19075f(k1, v1), ox7.m19075f(k2, v2), ox7.m19075f(k3, v3), ox7.m19075f(k4, v4), ox7.m19075f(k5, v5), ox7.m19075f(k6, v6), ox7.m19075f(k7, v7), ox7.m19075f(k8, v8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Liy7<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static iy7 m13556of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5, Comparable k6, Object v6, Comparable k7, Object v7, Comparable k8, Object v8, Comparable k9, Object v9) {
        return fromEntries(ox7.m19075f(k1, v1), ox7.m19075f(k2, v2), ox7.m19075f(k3, v3), ox7.m19075f(k4, v4), ox7.m19075f(k5, v5), ox7.m19075f(k6, v6), ox7.m19075f(k7, v7), ox7.m19075f(k8, v8), ox7.m19075f(k9, v9));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Liy7<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static iy7 m13557of(Comparable k1, Object v1, Comparable k2, Object v2, Comparable k3, Object v3, Comparable k4, Object v4, Comparable k5, Object v5, Comparable k6, Object v6, Comparable k7, Object v7, Comparable k8, Object v8, Comparable k9, Object v9, Comparable k10, Object v10) {
        return fromEntries(ox7.m19075f(k1, v1), ox7.m19075f(k2, v2), ox7.m19075f(k3, v3), ox7.m19075f(k4, v4), ox7.m19075f(k5, v5), ox7.m19075f(k6, v6), ox7.m19075f(k7, v7), ox7.m19075f(k8, v8), ox7.m19075f(k9, v9), ox7.m19075f(k10, v10));
    }
}
