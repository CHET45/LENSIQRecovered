package p000;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public class pc2<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: H */
    public static final Object f70259H = new Object();

    /* JADX INFO: renamed from: L */
    @gdi
    public static final double f70260L = 0.001d;

    /* JADX INFO: renamed from: M */
    public static final int f70261M = 9;

    /* JADX INFO: renamed from: C */
    @wx1
    @ez8
    public transient Set<Map.Entry<K, V>> f70262C;

    /* JADX INFO: renamed from: F */
    @wx1
    @ez8
    public transient Collection<V> f70263F;

    /* JADX INFO: renamed from: a */
    @wx1
    public transient Object f70264a;

    /* JADX INFO: renamed from: b */
    @gdi
    @wx1
    public transient int[] f70265b;

    /* JADX INFO: renamed from: c */
    @gdi
    @wx1
    public transient Object[] f70266c;

    /* JADX INFO: renamed from: d */
    @gdi
    @wx1
    public transient Object[] f70267d;

    /* JADX INFO: renamed from: e */
    public transient int f70268e;

    /* JADX INFO: renamed from: f */
    public transient int f70269f;

    /* JADX INFO: renamed from: m */
    @wx1
    @ez8
    public transient Set<K> f70270m;

    /* JADX INFO: renamed from: pc2$a */
    public class C10885a extends pc2<K, V>.AbstractC10889e<K> {
        public C10885a() {
            super(pc2.this, null);
        }

        @Override // p000.pc2.AbstractC10889e
        @dgc
        /* JADX INFO: renamed from: a */
        public K mo19397a(int i) {
            return (K) pc2.this.key(i);
        }
    }

    /* JADX INFO: renamed from: pc2$b */
    public class C10886b extends pc2<K, V>.AbstractC10889e<Map.Entry<K, V>> {
        public C10886b() {
            super(pc2.this, null);
        }

        @Override // p000.pc2.AbstractC10889e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo19397a(int entry) {
            return new C10891g(entry);
        }
    }

    /* JADX INFO: renamed from: pc2$c */
    public class C10887c extends pc2<K, V>.AbstractC10889e<V> {
        public C10887c() {
            super(pc2.this, null);
        }

        @Override // p000.pc2.AbstractC10889e
        @dgc
        /* JADX INFO: renamed from: a */
        public V mo19397a(int i) {
            return (V) pc2.this.value(i);
        }
    }

    /* JADX INFO: renamed from: pc2$d */
    public class C10888d extends AbstractSet<Map.Entry<K, V>> {
        public C10888d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            pc2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            Map<K, V> mapM19392v = pc2.this.m19392v();
            if (mapM19392v != null) {
                return mapM19392v.entrySet().contains(o);
            }
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            int iIndexOf = pc2.this.indexOf(entry.getKey());
            return iIndexOf != -1 && okb.equal(pc2.this.value(iIndexOf), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return pc2.this.m19393w();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            Map<K, V> mapM19392v = pc2.this.m19392v();
            if (mapM19392v != null) {
                return mapM19392v.entrySet().remove(o);
            }
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            if (pc2.this.m19381E()) {
                return false;
            }
            int iHashTableMask = pc2.this.hashTableMask();
            int iM21146f = rc2.m21146f(entry.getKey(), entry.getValue(), iHashTableMask, pc2.this.requireTable(), pc2.this.requireEntries(), pc2.this.requireKeys(), pc2.this.requireValues());
            if (iM21146f == -1) {
                return false;
            }
            pc2.this.mo19380D(iM21146f, iHashTableMask);
            pc2.m19368e(pc2.this);
            pc2.this.m19396z();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return pc2.this.size();
        }
    }

    /* JADX INFO: renamed from: pc2$f */
    public class C10890f extends AbstractSet<K> {
        public C10890f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            pc2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            return pc2.this.containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return pc2.this.m19379C();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            Map<K, V> mapM19392v = pc2.this.m19392v();
            return mapM19392v != null ? mapM19392v.keySet().remove(o) : pc2.this.removeHelper(o) != pc2.f70259H;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return pc2.this.size();
        }
    }

    /* JADX INFO: renamed from: pc2$g */
    public final class C10891g extends AbstractC13818v2<K, V> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final K f70280a;

        /* JADX INFO: renamed from: b */
        public int f70281b;

        public C10891g(int i) {
            this.f70280a = (K) pc2.this.key(i);
            this.f70281b = i;
        }

        private void updateLastKnownIndex() {
            int i = this.f70281b;
            if (i == -1 || i >= pc2.this.size() || !okb.equal(this.f70280a, pc2.this.key(this.f70281b))) {
                this.f70281b = pc2.this.indexOf(this.f70280a);
            }
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public K getKey() {
            return this.f70280a;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public V getValue() {
            Map<K, V> mapM19392v = pc2.this.m19392v();
            if (mapM19392v != null) {
                return (V) sib.m22018a(mapM19392v.get(this.f70280a));
            }
            updateLastKnownIndex();
            int i = this.f70281b;
            return i == -1 ? (V) sib.m22019b() : (V) pc2.this.value(i);
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public V setValue(@dgc V v) {
            Map<K, V> mapM19392v = pc2.this.m19392v();
            if (mapM19392v != null) {
                return (V) sib.m22018a(mapM19392v.put(this.f70280a, v));
            }
            updateLastKnownIndex();
            int i = this.f70281b;
            if (i == -1) {
                pc2.this.put(this.f70280a, v);
                return (V) sib.m22019b();
            }
            V v2 = (V) pc2.this.value(i);
            pc2.this.setValue(this.f70281b, v);
            return v2;
        }
    }

    /* JADX INFO: renamed from: pc2$h */
    public class C10892h extends AbstractCollection<V> {
        public C10892h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            pc2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return pc2.this.m19383G();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return pc2.this.size();
        }
    }

    public pc2() {
        mo19377A(3);
    }

    public static <K, V> pc2<K, V> create() {
        return new pc2<>();
    }

    public static <K, V> pc2<K, V> createWithExpectedSize(int expectedSize) {
        return new pc2<>(expectedSize);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m19368e(pc2 pc2Var) {
        int i = pc2Var.f70269f;
        pc2Var.f70269f = i - 1;
        return i;
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int hashTableMask() {
        return (1 << (this.f70268e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int indexOf(@wx1 Object key) {
        if (m19381E()) {
            return -1;
        }
        int iM25912d = yh7.m25912d(key);
        int iHashTableMask = hashTableMask();
        int iM21148h = rc2.m21148h(requireTable(), iM25912d & iHashTableMask);
        if (iM21148h == 0) {
            return -1;
        }
        int iM21142b = rc2.m21142b(iM25912d, iHashTableMask);
        do {
            int i = iM21148h - 1;
            int iEntry = entry(i);
            if (rc2.m21142b(iEntry, iHashTableMask) == iM21142b && okb.equal(key, key(i))) {
                return i;
            }
            iM21148h = rc2.m21143c(iEntry, iHashTableMask);
        } while (iM21148h != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public K key(int i) {
        return (K) requireKeys()[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int i = stream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid size: " + i);
        }
        mo19377A(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(stream.readObject(), stream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeHelper(@wx1 Object key) {
        if (m19381E()) {
            return f70259H;
        }
        int iHashTableMask = hashTableMask();
        int iM21146f = rc2.m21146f(key, null, iHashTableMask, requireTable(), requireEntries(), requireKeys(), null);
        if (iM21146f == -1) {
            return f70259H;
        }
        V vValue = value(iM21146f);
        mo19380D(iM21146f, iHashTableMask);
        this.f70269f--;
        m19396z();
        return vValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] requireEntries() {
        int[] iArr = this.f70265b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireKeys() {
        Object[] objArr = this.f70266c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object requireTable() {
        Object obj = this.f70264a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] requireValues() {
        Object[] objArr = this.f70267d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void resizeMeMaybe(int newSize) {
        int iMin;
        int length = requireEntries().length;
        if (newSize <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        mo19382F(iMin);
    }

    @op1
    private int resizeTable(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        Object objM21141a = rc2.m21141a(newCapacity);
        int i = newCapacity - 1;
        if (targetEntryIndex != 0) {
            rc2.m21149i(objM21141a, targetHash & i, targetEntryIndex + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i2 = 0; i2 <= oldMask; i2++) {
            int iM21148h = rc2.m21148h(objRequireTable, i2);
            while (iM21148h != 0) {
                int i3 = iM21148h - 1;
                int i4 = iArrRequireEntries[i3];
                int iM21142b = rc2.m21142b(i4, oldMask) | i2;
                int i5 = iM21142b & i;
                int iM21148h2 = rc2.m21148h(objM21141a, i5);
                rc2.m21149i(objM21141a, i5, iM21148h);
                iArrRequireEntries[i3] = rc2.m21144d(iM21142b, iM21148h2, i);
                iM21148h = rc2.m21143c(i4, oldMask);
            }
        }
        this.f70264a = objM21141a;
        setHashTableMask(i);
        return i;
    }

    private void setEntry(int i, int value) {
        requireEntries()[i] = value;
    }

    private void setHashTableMask(int mask) {
        this.f70268e = rc2.m21144d(this.f70268e, 32 - Integer.numberOfLeadingZeros(mask), 31);
    }

    private void setKey(int i, K key) {
        requireKeys()[i] = key;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i, V value) {
        requireValues()[i] = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V value(int i) {
        return (V) requireValues()[i];
    }

    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator<Map.Entry<K, V>> itM19393w = m19393w();
        while (itM19393w.hasNext()) {
            Map.Entry<K, V> next = itM19393w.next();
            stream.writeObject(next.getKey());
            stream.writeObject(next.getValue());
        }
    }

    /* JADX INFO: renamed from: A */
    public void mo19377A(int expectedSize) {
        v7d.checkArgument(expectedSize >= 0, "Expected size must be >= 0");
        this.f70268e = rd8.constrainToRange(expectedSize, 1, 1073741823);
    }

    /* JADX INFO: renamed from: B */
    public void mo19378B(int entryIndex, @dgc K key, @dgc V value, int hash, int mask) {
        setEntry(entryIndex, rc2.m21144d(hash, 0, mask));
        setKey(entryIndex, key);
        setValue(entryIndex, value);
    }

    /* JADX INFO: renamed from: C */
    public Iterator<K> m19379C() {
        Map<K, V> mapM19392v = m19392v();
        return mapM19392v != null ? mapM19392v.keySet().iterator() : new C10885a();
    }

    /* JADX INFO: renamed from: D */
    public void mo19380D(int dstIndex, int mask) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int size = size();
        int i = size - 1;
        if (dstIndex >= i) {
            objArrRequireKeys[dstIndex] = null;
            objArrRequireValues[dstIndex] = null;
            iArrRequireEntries[dstIndex] = 0;
            return;
        }
        Object obj = objArrRequireKeys[i];
        objArrRequireKeys[dstIndex] = obj;
        objArrRequireValues[dstIndex] = objArrRequireValues[i];
        objArrRequireKeys[i] = null;
        objArrRequireValues[i] = null;
        iArrRequireEntries[dstIndex] = iArrRequireEntries[i];
        iArrRequireEntries[i] = 0;
        int iM25912d = yh7.m25912d(obj) & mask;
        int iM21148h = rc2.m21148h(objRequireTable, iM25912d);
        if (iM21148h == size) {
            rc2.m21149i(objRequireTable, iM25912d, dstIndex + 1);
            return;
        }
        while (true) {
            int i2 = iM21148h - 1;
            int i3 = iArrRequireEntries[i2];
            int iM21143c = rc2.m21143c(i3, mask);
            if (iM21143c == size) {
                iArrRequireEntries[i2] = rc2.m21144d(i3, dstIndex + 1, mask);
                return;
            }
            iM21148h = iM21143c;
        }
    }

    @gdi
    /* JADX INFO: renamed from: E */
    public boolean m19381E() {
        return this.f70264a == null;
    }

    /* JADX INFO: renamed from: F */
    public void mo19382F(int newCapacity) {
        this.f70265b = Arrays.copyOf(requireEntries(), newCapacity);
        this.f70266c = Arrays.copyOf(requireKeys(), newCapacity);
        this.f70267d = Arrays.copyOf(requireValues(), newCapacity);
    }

    /* JADX INFO: renamed from: G */
    public Iterator<V> m19383G() {
        Map<K, V> mapM19392v = m19392v();
        return mapM19392v != null ? mapM19392v.values().iterator() : new C10887c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m19381E()) {
            return;
        }
        m19396z();
        Map<K, V> mapM19392v = m19392v();
        if (mapM19392v != null) {
            this.f70268e = rd8.constrainToRange(size(), 3, 1073741823);
            mapM19392v.clear();
            this.f70264a = null;
            this.f70269f = 0;
            return;
        }
        Arrays.fill(requireKeys(), 0, this.f70269f, (Object) null);
        Arrays.fill(requireValues(), 0, this.f70269f, (Object) null);
        rc2.m21147g(requireTable());
        Arrays.fill(requireEntries(), 0, this.f70269f, 0);
        this.f70269f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@wx1 Object key) {
        Map<K, V> mapM19392v = m19392v();
        return mapM19392v != null ? mapM19392v.containsKey(key) : indexOf(key) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@wx1 Object value) {
        Map<K, V> mapM19392v = m19392v();
        if (mapM19392v != null) {
            return mapM19392v.containsValue(value);
        }
        for (int i = 0; i < this.f70269f; i++) {
            if (okb.equal(value, value(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f70262C;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setM19388r = m19388r();
        this.f70262C = setM19388r;
        return setM19388r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @wx1
    public V get(@wx1 Object key) {
        Map<K, V> mapM19392v = m19392v();
        if (mapM19392v != null) {
            return mapM19392v.get(key);
        }
        int iIndexOf = indexOf(key);
        if (iIndexOf == -1) {
            return null;
        }
        mo19384n(iIndexOf);
        return value(iIndexOf);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f70270m;
        if (set != null) {
            return set;
        }
        Set<K> setM19390t = m19390t();
        this.f70270m = setM19390t;
        return setM19390t;
    }

    /* JADX INFO: renamed from: n */
    public void mo19384n(int index) {
    }

    /* JADX INFO: renamed from: o */
    public int mo19385o(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    @op1
    /* JADX INFO: renamed from: p */
    public int mo19386p() {
        v7d.checkState(m19381E(), "Arrays already allocated");
        int i = this.f70268e;
        int iM21150j = rc2.m21150j(i);
        this.f70264a = rc2.m21141a(iM21150j);
        setHashTableMask(iM21150j - 1);
        this.f70265b = new int[i];
        this.f70266c = new Object[i];
        this.f70267d = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @op1
    @wx1
    public V put(@dgc K k, @dgc V v) {
        int iResizeTable;
        int i;
        if (m19381E()) {
            mo19386p();
        }
        Map<K, V> mapM19392v = m19392v();
        if (mapM19392v != null) {
            return mapM19392v.put(k, v);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireKeys = requireKeys();
        Object[] objArrRequireValues = requireValues();
        int i2 = this.f70269f;
        int i3 = i2 + 1;
        int iM25912d = yh7.m25912d(k);
        int iHashTableMask = hashTableMask();
        int i4 = iM25912d & iHashTableMask;
        int iM21148h = rc2.m21148h(requireTable(), i4);
        if (iM21148h != 0) {
            int iM21142b = rc2.m21142b(iM25912d, iHashTableMask);
            int i5 = 0;
            while (true) {
                int i6 = iM21148h - 1;
                int i7 = iArrRequireEntries[i6];
                if (rc2.m21142b(i7, iHashTableMask) == iM21142b && okb.equal(k, objArrRequireKeys[i6])) {
                    V v2 = (V) objArrRequireValues[i6];
                    objArrRequireValues[i6] = v;
                    mo19384n(i6);
                    return v2;
                }
                int iM21143c = rc2.m21143c(i7, iHashTableMask);
                i5++;
                if (iM21143c != 0) {
                    iM21148h = iM21143c;
                } else {
                    if (i5 >= 9) {
                        return mo19387q().put(k, v);
                    }
                    if (i3 > iHashTableMask) {
                        iResizeTable = resizeTable(iHashTableMask, rc2.m21145e(iHashTableMask), iM25912d, i2);
                    } else {
                        iArrRequireEntries[i6] = rc2.m21144d(i7, i3, iHashTableMask);
                    }
                }
            }
            i = iHashTableMask;
        } else if (i3 > iHashTableMask) {
            iResizeTable = resizeTable(iHashTableMask, rc2.m21145e(iHashTableMask), iM25912d, i2);
            i = iResizeTable;
        } else {
            rc2.m21149i(requireTable(), i4, i3);
            i = iHashTableMask;
        }
        resizeMeMaybe(i3);
        mo19378B(i2, k, v, iM25912d, i);
        this.f70269f = i3;
        m19396z();
        return null;
    }

    @gdi
    @op1
    /* JADX INFO: renamed from: q */
    public Map<K, V> mo19387q() {
        Map<K, V> mapMo19389s = mo19389s(hashTableMask() + 1);
        int iMo19394x = mo19394x();
        while (iMo19394x >= 0) {
            mapMo19389s.put(key(iMo19394x), value(iMo19394x));
            iMo19394x = mo19395y(iMo19394x);
        }
        this.f70264a = mapMo19389s;
        this.f70265b = null;
        this.f70266c = null;
        this.f70267d = null;
        m19396z();
        return mapMo19389s;
    }

    /* JADX INFO: renamed from: r */
    public Set<Map.Entry<K, V>> m19388r() {
        return new C10888d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @op1
    @wx1
    public V remove(@wx1 Object obj) {
        Map<K, V> mapM19392v = m19392v();
        if (mapM19392v != null) {
            return mapM19392v.remove(obj);
        }
        V v = (V) removeHelper(obj);
        if (v == f70259H) {
            return null;
        }
        return v;
    }

    /* JADX INFO: renamed from: s */
    public Map<K, V> mo19389s(int tableSize) {
        return new LinkedHashMap(tableSize, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> mapM19392v = m19392v();
        return mapM19392v != null ? mapM19392v.size() : this.f70269f;
    }

    /* JADX INFO: renamed from: t */
    public Set<K> m19390t() {
        return new C10890f();
    }

    public void trimToSize() {
        if (m19381E()) {
            return;
        }
        Map<K, V> mapM19392v = m19392v();
        if (mapM19392v != null) {
            Map<K, V> mapMo19389s = mo19389s(size());
            mapMo19389s.putAll(mapM19392v);
            this.f70264a = mapMo19389s;
            return;
        }
        int i = this.f70269f;
        if (i < requireEntries().length) {
            mo19382F(i);
        }
        int iM21150j = rc2.m21150j(i);
        int iHashTableMask = hashTableMask();
        if (iM21150j < iHashTableMask) {
            resizeTable(iHashTableMask, iM21150j, 0, 0);
        }
    }

    /* JADX INFO: renamed from: u */
    public Collection<V> m19391u() {
        return new C10892h();
    }

    @gdi
    @wx1
    /* JADX INFO: renamed from: v */
    public Map<K, V> m19392v() {
        Object obj = this.f70264a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f70263F;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionM19391u = m19391u();
        this.f70263F = collectionM19391u;
        return collectionM19391u;
    }

    /* JADX INFO: renamed from: w */
    public Iterator<Map.Entry<K, V>> m19393w() {
        Map<K, V> mapM19392v = m19392v();
        return mapM19392v != null ? mapM19392v.entrySet().iterator() : new C10886b();
    }

    /* JADX INFO: renamed from: x */
    public int mo19394x() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: renamed from: y */
    public int mo19395y(int entryIndex) {
        int i = entryIndex + 1;
        if (i < this.f70269f) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: z */
    public void m19396z() {
        this.f70268e += 32;
    }

    public pc2(int expectedSize) {
        mo19377A(expectedSize);
    }

    /* JADX INFO: renamed from: pc2$e */
    public abstract class AbstractC10889e<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public int f70275a;

        /* JADX INFO: renamed from: b */
        public int f70276b;

        /* JADX INFO: renamed from: c */
        public int f70277c;

        private AbstractC10889e() {
            this.f70275a = pc2.this.f70268e;
            this.f70276b = pc2.this.mo19394x();
            this.f70277c = -1;
        }

        private void checkForConcurrentModification() {
            if (pc2.this.f70268e != this.f70275a) {
                throw new ConcurrentModificationException();
            }
        }

        @dgc
        /* JADX INFO: renamed from: a */
        public abstract T mo19397a(int entry);

        /* JADX INFO: renamed from: b */
        public void m19399b() {
            this.f70275a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f70276b >= 0;
        }

        @Override // java.util.Iterator
        @dgc
        public T next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f70276b;
            this.f70277c = i;
            T tMo19397a = mo19397a(i);
            this.f70276b = pc2.this.mo19395y(this.f70276b);
            return tMo19397a;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            s72.m21768e(this.f70277c >= 0);
            m19399b();
            pc2 pc2Var = pc2.this;
            pc2Var.remove(pc2Var.key(this.f70277c));
            this.f70276b = pc2.this.mo19385o(this.f70276b, this.f70277c);
            this.f70277c = -1;
        }

        public /* synthetic */ AbstractC10889e(pc2 pc2Var, C10885a c10885a) {
            this();
        }
    }
}
