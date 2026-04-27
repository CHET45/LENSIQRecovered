package p000;

import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p000.ax7;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class ih7<K, V> extends AbstractMap<K, V> implements k11<K, V>, Serializable {

    /* JADX INFO: renamed from: M1 */
    public static final int f47001M1 = -2;

    /* JADX INFO: renamed from: Z */
    public static final int f47002Z = -1;

    /* JADX INFO: renamed from: C */
    public transient int[] f47003C;

    /* JADX INFO: renamed from: F */
    public transient int f47004F;

    /* JADX INFO: renamed from: H */
    public transient int f47005H;

    /* JADX INFO: renamed from: L */
    public transient int[] f47006L;

    /* JADX INFO: renamed from: M */
    public transient int[] f47007M;

    /* JADX INFO: renamed from: N */
    @ez8
    public transient Set<K> f47008N;

    /* JADX INFO: renamed from: Q */
    @ez8
    public transient Set<V> f47009Q;

    /* JADX INFO: renamed from: X */
    @ez8
    public transient Set<Map.Entry<K, V>> f47010X;

    /* JADX INFO: renamed from: Y */
    @RetainedWith
    @wx1
    @ez8
    public transient k11<V, K> f47011Y;

    /* JADX INFO: renamed from: a */
    public transient K[] f47012a;

    /* JADX INFO: renamed from: b */
    public transient V[] f47013b;

    /* JADX INFO: renamed from: c */
    public transient int f47014c;

    /* JADX INFO: renamed from: d */
    public transient int f47015d;

    /* JADX INFO: renamed from: e */
    public transient int[] f47016e;

    /* JADX INFO: renamed from: f */
    public transient int[] f47017f;

    /* JADX INFO: renamed from: m */
    public transient int[] f47018m;

    /* JADX INFO: renamed from: ih7$a */
    public final class C7284a extends AbstractC13818v2<K, V> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final K f47019a;

        /* JADX INFO: renamed from: b */
        public int f47020b;

        public C7284a(int i) {
            this.f47019a = (K) sib.m22018a(ih7.this.f47012a[i]);
            this.f47020b = i;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public K getKey() {
            return this.f47019a;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public V getValue() {
            updateIndex();
            int i = this.f47020b;
            return i == -1 ? (V) sib.m22019b() : (V) sib.m22018a(ih7.this.f47013b[i]);
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public V setValue(@dgc V v) {
            updateIndex();
            int i = this.f47020b;
            if (i == -1) {
                ih7.this.put(this.f47019a, v);
                return (V) sib.m22019b();
            }
            V v2 = (V) sib.m22018a(ih7.this.f47013b[i]);
            if (okb.equal(v2, v)) {
                return v;
            }
            ih7.this.replaceValueInEntry(this.f47020b, v, false);
            return v2;
        }

        public void updateIndex() {
            int i = this.f47020b;
            if (i != -1) {
                ih7 ih7Var = ih7.this;
                if (i <= ih7Var.f47014c && okb.equal(ih7Var.f47012a[i], this.f47019a)) {
                    return;
                }
            }
            this.f47020b = ih7.this.m13095g(this.f47019a);
        }
    }

    /* JADX INFO: renamed from: ih7$b */
    public static final class C7285b<K, V> extends AbstractC13818v2<V, K> {

        /* JADX INFO: renamed from: a */
        public final ih7<K, V> f47022a;

        /* JADX INFO: renamed from: b */
        @dgc
        public final V f47023b;

        /* JADX INFO: renamed from: c */
        public int f47024c;

        public C7285b(ih7<K, V> ih7Var, int i) {
            this.f47022a = ih7Var;
            this.f47023b = (V) sib.m22018a(ih7Var.f47013b[i]);
            this.f47024c = i;
        }

        private void updateIndex() {
            int i = this.f47024c;
            if (i != -1) {
                ih7<K, V> ih7Var = this.f47022a;
                if (i <= ih7Var.f47014c && okb.equal(this.f47023b, ih7Var.f47013b[i])) {
                    return;
                }
            }
            this.f47024c = this.f47022a.m13097i(this.f47023b);
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public V getKey() {
            return this.f47023b;
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public K getValue() {
            updateIndex();
            int i = this.f47024c;
            return i == -1 ? (K) sib.m22019b() : (K) sib.m22018a(this.f47022a.f47012a[i]);
        }

        @Override // p000.AbstractC13818v2, java.util.Map.Entry
        @dgc
        public K setValue(@dgc K k) {
            updateIndex();
            int i = this.f47024c;
            if (i == -1) {
                this.f47022a.m13102n(this.f47023b, k, false);
                return (K) sib.m22019b();
            }
            K k2 = (K) sib.m22018a(this.f47022a.f47012a[i]);
            if (okb.equal(k2, k)) {
                return k;
            }
            this.f47022a.replaceKeyInEntry(this.f47024c, k, false);
            return k2;
        }
    }

    /* JADX INFO: renamed from: ih7$c */
    public final class C7286c extends AbstractC7291h<K, V, Map.Entry<K, V>> {
        public C7286c() {
            super(ih7.this);
        }

        @Override // p000.ih7.AbstractC7291h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo13107a(int entry) {
            return new C7284a(entry);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iM13095g = ih7.this.m13095g(key);
            return iM13095g != -1 && okb.equal(value, ih7.this.f47013b[iM13095g]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @op1
        public boolean remove(@wx1 Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iM25912d = yh7.m25912d(key);
            int iM13096h = ih7.this.m13096h(key, iM25912d);
            if (iM13096h == -1 || !okb.equal(value, ih7.this.f47013b[iM13096h])) {
                return false;
            }
            ih7.this.m13104p(iM13096h, iM25912d);
            return true;
        }
    }

    /* JADX INFO: renamed from: ih7$d */
    public static class C7287d<K, V> extends AbstractMap<V, K> implements k11<V, K>, Serializable {

        /* JADX INFO: renamed from: a */
        public final ih7<K, V> f47026a;

        /* JADX INFO: renamed from: b */
        public transient Set<Map.Entry<V, K>> f47027b;

        public C7287d(ih7<K, V> forward) {
            this.f47026a = forward;
        }

        @jd7("serialization")
        private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException {
            in.defaultReadObject();
            this.f47026a.f47011Y = this;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f47026a.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@wx1 Object key) {
            return this.f47026a.containsValue(key);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@wx1 Object value) {
            return this.f47026a.containsKey(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f47027b;
            if (set != null) {
                return set;
            }
            C7288e c7288e = new C7288e(this.f47026a);
            this.f47027b = c7288e;
            return c7288e;
        }

        @Override // p000.k11
        @op1
        @wx1
        public K forcePut(@dgc V value, @dgc K key) {
            return this.f47026a.m13102n(value, key, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @wx1
        public K get(@wx1 Object key) {
            return this.f47026a.m13099k(key);
        }

        @Override // p000.k11
        public k11<K, V> inverse() {
            return this.f47026a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f47026a.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, p000.k11
        @op1
        @wx1
        public K put(@dgc V value, @dgc K key) {
            return this.f47026a.m13102n(value, key, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @op1
        @wx1
        public K remove(@wx1 Object value) {
            return this.f47026a.m13106r(value);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f47026a.f47014c;
        }

        @Override // java.util.AbstractMap, java.util.Map, p000.k11
        public Set<K> values() {
            return this.f47026a.keySet();
        }
    }

    /* JADX INFO: renamed from: ih7$e */
    public static class C7288e<K, V> extends AbstractC7291h<K, V, Map.Entry<V, K>> {
        public C7288e(ih7<K, V> biMap) {
            super(biMap);
        }

        @Override // p000.ih7.AbstractC7291h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> mo13107a(int entry) {
            return new C7285b(this.f47030a, entry);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iM13097i = this.f47030a.m13097i(key);
            return iM13097i != -1 && okb.equal(this.f47030a.f47012a[iM13097i], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) o;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iM25912d = yh7.m25912d(key);
            int iM13098j = this.f47030a.m13098j(key, iM25912d);
            if (iM13098j == -1 || !okb.equal(this.f47030a.f47012a[iM13098j], value)) {
                return false;
            }
            this.f47030a.m13105q(iM13098j, iM25912d);
            return true;
        }
    }

    /* JADX INFO: renamed from: ih7$f */
    public final class C7289f extends AbstractC7291h<K, V, K> {
        public C7289f() {
            super(ih7.this);
        }

        @Override // p000.ih7.AbstractC7291h
        @dgc
        /* JADX INFO: renamed from: a */
        public K mo13107a(int i) {
            return (K) sib.m22018a(ih7.this.f47012a[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            return ih7.this.containsKey(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            int iM25912d = yh7.m25912d(o);
            int iM13096h = ih7.this.m13096h(o, iM25912d);
            if (iM13096h == -1) {
                return false;
            }
            ih7.this.m13104p(iM13096h, iM25912d);
            return true;
        }
    }

    /* JADX INFO: renamed from: ih7$g */
    public final class C7290g extends AbstractC7291h<K, V, V> {
        public C7290g() {
            super(ih7.this);
        }

        @Override // p000.ih7.AbstractC7291h
        @dgc
        /* JADX INFO: renamed from: a */
        public V mo13107a(int i) {
            return (V) sib.m22018a(ih7.this.f47013b[i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object o) {
            return ih7.this.containsValue(o);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object o) {
            int iM25912d = yh7.m25912d(o);
            int iM13098j = ih7.this.m13098j(o, iM25912d);
            if (iM13098j == -1) {
                return false;
            }
            ih7.this.m13105q(iM13098j, iM25912d);
            return true;
        }
    }

    /* JADX INFO: renamed from: ih7$h */
    public static abstract class AbstractC7291h<K, V, T> extends AbstractSet<T> {

        /* JADX INFO: renamed from: a */
        public final ih7<K, V> f47030a;

        /* JADX INFO: renamed from: ih7$h$a */
        public class a implements Iterator<T> {

            /* JADX INFO: renamed from: a */
            public int f47031a;

            /* JADX INFO: renamed from: b */
            public int f47032b = -1;

            /* JADX INFO: renamed from: c */
            public int f47033c;

            /* JADX INFO: renamed from: d */
            public int f47034d;

            public a() {
                this.f47031a = AbstractC7291h.this.f47030a.f47004F;
                ih7<K, V> ih7Var = AbstractC7291h.this.f47030a;
                this.f47033c = ih7Var.f47015d;
                this.f47034d = ih7Var.f47014c;
            }

            private void checkForComodification() {
                if (AbstractC7291h.this.f47030a.f47015d != this.f47033c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                checkForComodification();
                return this.f47031a != -2 && this.f47034d > 0;
            }

            @Override // java.util.Iterator
            @dgc
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t = (T) AbstractC7291h.this.mo13107a(this.f47031a);
                this.f47032b = this.f47031a;
                this.f47031a = AbstractC7291h.this.f47030a.f47007M[this.f47031a];
                this.f47034d--;
                return t;
            }

            @Override // java.util.Iterator
            public void remove() {
                checkForComodification();
                s72.m21768e(this.f47032b != -1);
                AbstractC7291h.this.f47030a.m13103o(this.f47032b);
                int i = this.f47031a;
                ih7<K, V> ih7Var = AbstractC7291h.this.f47030a;
                if (i == ih7Var.f47014c) {
                    this.f47031a = this.f47032b;
                }
                this.f47032b = -1;
                this.f47033c = ih7Var.f47015d;
            }
        }

        public AbstractC7291h(ih7<K, V> biMap) {
            this.f47030a = biMap;
        }

        @dgc
        /* JADX INFO: renamed from: a */
        public abstract T mo13107a(int entry);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f47030a.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f47030a.f47014c;
        }
    }

    private ih7(int expectedSize) {
        m13100l(expectedSize);
    }

    private int bucket(int hash) {
        return hash & (this.f47016e.length - 1);
    }

    public static <K, V> ih7<K, V> create() {
        return create(16);
    }

    private static int[] createFilledWithAbsent(int size) {
        int[] iArr = new int[size];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void deleteFromTableKToV(int entry, int keyHash) {
        v7d.checkArgument(entry != -1);
        int iBucket = bucket(keyHash);
        int[] iArr = this.f47016e;
        int i = iArr[iBucket];
        if (i == entry) {
            int[] iArr2 = this.f47018m;
            iArr[iBucket] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i2 = this.f47018m[i];
        while (true) {
            int i3 = i;
            i = i2;
            if (i == -1) {
                throw new AssertionError("Expected to find entry with key " + this.f47012a[entry]);
            }
            if (i == entry) {
                int[] iArr3 = this.f47018m;
                iArr3[i3] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
            i2 = this.f47018m[i];
        }
    }

    private void deleteFromTableVToK(int entry, int valueHash) {
        v7d.checkArgument(entry != -1);
        int iBucket = bucket(valueHash);
        int[] iArr = this.f47017f;
        int i = iArr[iBucket];
        if (i == entry) {
            int[] iArr2 = this.f47003C;
            iArr[iBucket] = iArr2[entry];
            iArr2[entry] = -1;
            return;
        }
        int i2 = this.f47003C[i];
        while (true) {
            int i3 = i;
            i = i2;
            if (i == -1) {
                throw new AssertionError("Expected to find entry with value " + this.f47013b[entry]);
            }
            if (i == entry) {
                int[] iArr3 = this.f47003C;
                iArr3[i3] = iArr3[entry];
                iArr3[entry] = -1;
                return;
            }
            i2 = this.f47003C[i];
        }
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.f47018m;
        if (iArr.length < i) {
            int iM2723a = ax7.AbstractC1637b.m2723a(iArr.length, i);
            this.f47012a = (K[]) Arrays.copyOf(this.f47012a, iM2723a);
            this.f47013b = (V[]) Arrays.copyOf(this.f47013b, iM2723a);
            this.f47018m = expandAndFillWithAbsent(this.f47018m, iM2723a);
            this.f47003C = expandAndFillWithAbsent(this.f47003C, iM2723a);
            this.f47006L = expandAndFillWithAbsent(this.f47006L, iM2723a);
            this.f47007M = expandAndFillWithAbsent(this.f47007M, iM2723a);
        }
        if (this.f47016e.length < i) {
            int iM25909a = yh7.m25909a(i, 1.0d);
            this.f47016e = createFilledWithAbsent(iM25909a);
            this.f47017f = createFilledWithAbsent(iM25909a);
            for (int i2 = 0; i2 < this.f47014c; i2++) {
                int iBucket = bucket(yh7.m25912d(this.f47012a[i2]));
                int[] iArr2 = this.f47018m;
                int[] iArr3 = this.f47016e;
                iArr2[i2] = iArr3[iBucket];
                iArr3[iBucket] = i2;
                int iBucket2 = bucket(yh7.m25912d(this.f47013b[i2]));
                int[] iArr4 = this.f47003C;
                int[] iArr5 = this.f47017f;
                iArr4[i2] = iArr5[iBucket2];
                iArr5[iBucket2] = i2;
            }
        }
    }

    private static int[] expandAndFillWithAbsent(int[] array, int newSize) {
        int length = array.length;
        int[] iArrCopyOf = Arrays.copyOf(array, newSize);
        Arrays.fill(iArrCopyOf, length, newSize, -1);
        return iArrCopyOf;
    }

    private void insertIntoTableKToV(int entry, int keyHash) {
        v7d.checkArgument(entry != -1);
        int iBucket = bucket(keyHash);
        int[] iArr = this.f47018m;
        int[] iArr2 = this.f47016e;
        iArr[entry] = iArr2[iBucket];
        iArr2[iBucket] = entry;
    }

    private void insertIntoTableVToK(int entry, int valueHash) {
        v7d.checkArgument(entry != -1);
        int iBucket = bucket(valueHash);
        int[] iArr = this.f47003C;
        int[] iArr2 = this.f47017f;
        iArr[entry] = iArr2[iBucket];
        iArr2[iBucket] = entry;
    }

    private void moveEntryToIndex(int src, int dest) {
        int i;
        int i2;
        if (src == dest) {
            return;
        }
        int i3 = this.f47006L[src];
        int i4 = this.f47007M[src];
        setSucceeds(i3, dest);
        setSucceeds(dest, i4);
        K[] kArr = this.f47012a;
        K k = kArr[src];
        V[] vArr = this.f47013b;
        V v = vArr[src];
        kArr[dest] = k;
        vArr[dest] = v;
        int iBucket = bucket(yh7.m25912d(k));
        int[] iArr = this.f47016e;
        int i5 = iArr[iBucket];
        if (i5 == src) {
            iArr[iBucket] = dest;
        } else {
            int i6 = this.f47018m[i5];
            while (true) {
                i = i5;
                i5 = i6;
                if (i5 == src) {
                    break;
                } else {
                    i6 = this.f47018m[i5];
                }
            }
            this.f47018m[i] = dest;
        }
        int[] iArr2 = this.f47018m;
        iArr2[dest] = iArr2[src];
        iArr2[src] = -1;
        int iBucket2 = bucket(yh7.m25912d(v));
        int[] iArr3 = this.f47017f;
        int i7 = iArr3[iBucket2];
        if (i7 == src) {
            iArr3[iBucket2] = dest;
        } else {
            int i8 = this.f47003C[i7];
            while (true) {
                i2 = i7;
                i7 = i8;
                if (i7 == src) {
                    break;
                } else {
                    i8 = this.f47003C[i7];
                }
            }
            this.f47003C[i2] = dest;
        }
        int[] iArr4 = this.f47003C;
        iArr4[dest] = iArr4[src];
        iArr4[src] = -1;
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int iM2797h = b1f.m2797h(stream);
        m13100l(16);
        b1f.m2792c(this, stream, iM2797h);
    }

    private void removeEntry(int entry, int keyHash, int valueHash) {
        v7d.checkArgument(entry != -1);
        deleteFromTableKToV(entry, keyHash);
        deleteFromTableVToK(entry, valueHash);
        setSucceeds(this.f47006L[entry], this.f47007M[entry]);
        moveEntryToIndex(this.f47014c - 1, entry);
        K[] kArr = this.f47012a;
        int i = this.f47014c;
        kArr[i - 1] = null;
        this.f47013b[i - 1] = null;
        this.f47014c = i - 1;
        this.f47015d++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceKeyInEntry(int entry, @dgc K newKey, boolean force) {
        int i;
        v7d.checkArgument(entry != -1);
        int iM25912d = yh7.m25912d(newKey);
        int iM13096h = m13096h(newKey, iM25912d);
        int i2 = this.f47005H;
        if (iM13096h == -1) {
            i = -2;
        } else {
            if (!force) {
                throw new IllegalArgumentException("Key already present in map: " + newKey);
            }
            i2 = this.f47006L[iM13096h];
            i = this.f47007M[iM13096h];
            m13104p(iM13096h, iM25912d);
            if (entry == this.f47014c) {
                entry = iM13096h;
            }
        }
        if (i2 == entry) {
            i2 = this.f47006L[entry];
        } else if (i2 == this.f47014c) {
            i2 = iM13096h;
        }
        if (i == entry) {
            iM13096h = this.f47007M[entry];
        } else if (i != this.f47014c) {
            iM13096h = i;
        }
        setSucceeds(this.f47006L[entry], this.f47007M[entry]);
        deleteFromTableKToV(entry, yh7.m25912d(this.f47012a[entry]));
        this.f47012a[entry] = newKey;
        insertIntoTableKToV(entry, yh7.m25912d(newKey));
        setSucceeds(i2, entry);
        setSucceeds(entry, iM13096h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceValueInEntry(int entry, @dgc V newValue, boolean force) {
        v7d.checkArgument(entry != -1);
        int iM25912d = yh7.m25912d(newValue);
        int iM13098j = m13098j(newValue, iM25912d);
        if (iM13098j != -1) {
            if (!force) {
                throw new IllegalArgumentException("Value already present in map: " + newValue);
            }
            m13105q(iM13098j, iM25912d);
            if (entry == this.f47014c) {
                entry = iM13098j;
            }
        }
        deleteFromTableVToK(entry, yh7.m25912d(this.f47013b[entry]));
        this.f47013b[entry] = newValue;
        insertIntoTableVToK(entry, iM25912d);
    }

    private void setSucceeds(int prev, int next) {
        if (prev == -2) {
            this.f47004F = next;
        } else {
            this.f47007M[prev] = next;
        }
        if (next == -2) {
            this.f47005H = prev;
        } else {
            this.f47006L[next] = prev;
        }
    }

    @jd7
    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        b1f.m2798i(this, stream);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f47012a, 0, this.f47014c, (Object) null);
        Arrays.fill(this.f47013b, 0, this.f47014c, (Object) null);
        Arrays.fill(this.f47016e, -1);
        Arrays.fill(this.f47017f, -1);
        Arrays.fill(this.f47018m, 0, this.f47014c, -1);
        Arrays.fill(this.f47003C, 0, this.f47014c, -1);
        Arrays.fill(this.f47006L, 0, this.f47014c, -1);
        Arrays.fill(this.f47007M, 0, this.f47014c, -1);
        this.f47014c = 0;
        this.f47004F = -2;
        this.f47005H = -2;
        this.f47015d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@wx1 Object key) {
        return m13095g(key) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@wx1 Object value) {
        return m13097i(value) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f47010X;
        if (set != null) {
            return set;
        }
        C7286c c7286c = new C7286c();
        this.f47010X = c7286c;
        return c7286c;
    }

    /* JADX INFO: renamed from: f */
    public int m13094f(@wx1 Object o, int oHash, int[] hashTable, int[] nextInBucket, Object[] array) {
        int i = hashTable[bucket(oHash)];
        while (i != -1) {
            if (okb.equal(array[i], o)) {
                return i;
            }
            i = nextInBucket[i];
        }
        return -1;
    }

    @Override // p000.k11
    @op1
    @wx1
    public V forcePut(@dgc K key, @dgc V value) {
        return m13101m(key, value, true);
    }

    /* JADX INFO: renamed from: g */
    public int m13095g(@wx1 Object key) {
        return m13096h(key, yh7.m25912d(key));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @wx1
    public V get(@wx1 Object key) {
        int iM13095g = m13095g(key);
        if (iM13095g == -1) {
            return null;
        }
        return this.f47013b[iM13095g];
    }

    /* JADX INFO: renamed from: h */
    public int m13096h(@wx1 Object key, int keyHash) {
        return m13094f(key, keyHash, this.f47016e, this.f47018m, this.f47012a);
    }

    /* JADX INFO: renamed from: i */
    public int m13097i(@wx1 Object value) {
        return m13098j(value, yh7.m25912d(value));
    }

    @Override // p000.k11
    public k11<V, K> inverse() {
        k11<V, K> k11Var = this.f47011Y;
        if (k11Var != null) {
            return k11Var;
        }
        C7287d c7287d = new C7287d(this);
        this.f47011Y = c7287d;
        return c7287d;
    }

    /* JADX INFO: renamed from: j */
    public int m13098j(@wx1 Object value, int valueHash) {
        return m13094f(value, valueHash, this.f47017f, this.f47003C, this.f47013b);
    }

    @wx1
    /* JADX INFO: renamed from: k */
    public K m13099k(@wx1 Object value) {
        int iM13097i = m13097i(value);
        if (iM13097i == -1) {
            return null;
        }
        return this.f47012a[iM13097i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f47008N;
        if (set != null) {
            return set;
        }
        C7289f c7289f = new C7289f();
        this.f47008N = c7289f;
        return c7289f;
    }

    /* JADX INFO: renamed from: l */
    public void m13100l(int i) {
        s72.m21765b(i, "expectedSize");
        int iM25909a = yh7.m25909a(i, 1.0d);
        this.f47014c = 0;
        this.f47012a = (K[]) new Object[i];
        this.f47013b = (V[]) new Object[i];
        this.f47016e = createFilledWithAbsent(iM25909a);
        this.f47017f = createFilledWithAbsent(iM25909a);
        this.f47018m = createFilledWithAbsent(i);
        this.f47003C = createFilledWithAbsent(i);
        this.f47004F = -2;
        this.f47005H = -2;
        this.f47006L = createFilledWithAbsent(i);
        this.f47007M = createFilledWithAbsent(i);
    }

    @wx1
    /* JADX INFO: renamed from: m */
    public V m13101m(@dgc K key, @dgc V value, boolean force) {
        int iM25912d = yh7.m25912d(key);
        int iM13096h = m13096h(key, iM25912d);
        if (iM13096h != -1) {
            V v = this.f47013b[iM13096h];
            if (okb.equal(v, value)) {
                return value;
            }
            replaceValueInEntry(iM13096h, value, force);
            return v;
        }
        int iM25912d2 = yh7.m25912d(value);
        int iM13098j = m13098j(value, iM25912d2);
        if (!force) {
            v7d.checkArgument(iM13098j == -1, "Value already present: %s", value);
        } else if (iM13098j != -1) {
            m13105q(iM13098j, iM25912d2);
        }
        ensureCapacity(this.f47014c + 1);
        K[] kArr = this.f47012a;
        int i = this.f47014c;
        kArr[i] = key;
        this.f47013b[i] = value;
        insertIntoTableKToV(i, iM25912d);
        insertIntoTableVToK(this.f47014c, iM25912d2);
        setSucceeds(this.f47005H, this.f47014c);
        setSucceeds(this.f47014c, -2);
        this.f47014c++;
        this.f47015d++;
        return null;
    }

    @op1
    @wx1
    /* JADX INFO: renamed from: n */
    public K m13102n(@dgc V value, @dgc K key, boolean force) {
        int iM25912d = yh7.m25912d(value);
        int iM13098j = m13098j(value, iM25912d);
        if (iM13098j != -1) {
            K k = this.f47012a[iM13098j];
            if (okb.equal(k, key)) {
                return key;
            }
            replaceKeyInEntry(iM13098j, key, force);
            return k;
        }
        int i = this.f47005H;
        int iM25912d2 = yh7.m25912d(key);
        int iM13096h = m13096h(key, iM25912d2);
        if (!force) {
            v7d.checkArgument(iM13096h == -1, "Key already present: %s", key);
        } else if (iM13096h != -1) {
            i = this.f47006L[iM13096h];
            m13104p(iM13096h, iM25912d2);
        }
        ensureCapacity(this.f47014c + 1);
        K[] kArr = this.f47012a;
        int i2 = this.f47014c;
        kArr[i2] = key;
        this.f47013b[i2] = value;
        insertIntoTableKToV(i2, iM25912d2);
        insertIntoTableVToK(this.f47014c, iM25912d);
        int i3 = i == -2 ? this.f47004F : this.f47007M[i];
        setSucceeds(i, this.f47014c);
        setSucceeds(this.f47014c, i3);
        this.f47014c++;
        this.f47015d++;
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void m13103o(int entry) {
        m13104p(entry, yh7.m25912d(this.f47012a[entry]));
    }

    /* JADX INFO: renamed from: p */
    public void m13104p(int entry, int keyHash) {
        removeEntry(entry, keyHash, yh7.m25912d(this.f47013b[entry]));
    }

    @Override // java.util.AbstractMap, java.util.Map, p000.k11
    @op1
    @wx1
    public V put(@dgc K key, @dgc V value) {
        return m13101m(key, value, false);
    }

    /* JADX INFO: renamed from: q */
    public void m13105q(int entry, int valueHash) {
        removeEntry(entry, yh7.m25912d(this.f47012a[entry]), valueHash);
    }

    @wx1
    /* JADX INFO: renamed from: r */
    public K m13106r(@wx1 Object value) {
        int iM25912d = yh7.m25912d(value);
        int iM13098j = m13098j(value, iM25912d);
        if (iM13098j == -1) {
            return null;
        }
        K k = this.f47012a[iM13098j];
        m13105q(iM13098j, iM25912d);
        return k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @op1
    @wx1
    public V remove(@wx1 Object key) {
        int iM25912d = yh7.m25912d(key);
        int iM13096h = m13096h(key, iM25912d);
        if (iM13096h == -1) {
            return null;
        }
        V v = this.f47013b[iM13096h];
        m13104p(iM13096h, iM25912d);
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f47014c;
    }

    public static <K, V> ih7<K, V> create(int expectedSize) {
        return new ih7<>(expectedSize);
    }

    @Override // java.util.AbstractMap, java.util.Map, p000.k11
    public Set<V> values() {
        Set<V> set = this.f47009Q;
        if (set != null) {
            return set;
        }
        C7290g c7290g = new C7290g();
        this.f47009Q = c7290g;
        return c7290g;
    }

    public static <K, V> ih7<K, V> create(Map<? extends K, ? extends V> map) {
        ih7<K, V> ih7VarCreate = create(map.size());
        ih7VarCreate.putAll(map);
        return ih7VarCreate;
    }
}
