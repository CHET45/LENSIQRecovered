package p000;

import java.util.Arrays;
import p000.d4b;
import p000.e4b;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public class qjb<K> {

    /* JADX INFO: renamed from: i */
    public static final int f74608i = 1073741824;

    /* JADX INFO: renamed from: j */
    public static final float f74609j = 1.0f;

    /* JADX INFO: renamed from: k */
    public static final long f74610k = 4294967295L;

    /* JADX INFO: renamed from: l */
    public static final long f74611l = -4294967296L;

    /* JADX INFO: renamed from: m */
    public static final int f74612m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f74613n = -1;

    /* JADX INFO: renamed from: a */
    public transient Object[] f74614a;

    /* JADX INFO: renamed from: b */
    public transient int[] f74615b;

    /* JADX INFO: renamed from: c */
    public transient int f74616c;

    /* JADX INFO: renamed from: d */
    public transient int f74617d;

    /* JADX INFO: renamed from: e */
    public transient int[] f74618e;

    /* JADX INFO: renamed from: f */
    @gdi
    public transient long[] f74619f;

    /* JADX INFO: renamed from: g */
    public transient float f74620g;

    /* JADX INFO: renamed from: h */
    public transient int f74621h;

    /* JADX INFO: renamed from: qjb$a */
    public class C11496a extends e4b.AbstractC5104f<K> {

        /* JADX INFO: renamed from: a */
        @dgc
        public final K f74622a;

        /* JADX INFO: renamed from: b */
        public int f74623b;

        public C11496a(int i) {
            this.f74622a = (K) qjb.this.f74614a[i];
            this.f74623b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m20402a() {
            int i = this.f74623b;
            if (i == -1 || i >= qjb.this.m20401q() || !okb.equal(this.f74622a, qjb.this.f74614a[this.f74623b])) {
                this.f74623b = qjb.this.m20392h(this.f74622a);
            }
        }

        @Override // p000.d4b.InterfaceC4612a
        public int getCount() {
            m20402a();
            int i = this.f74623b;
            if (i == -1) {
                return 0;
            }
            return qjb.this.f74615b[i];
        }

        @Override // p000.d4b.InterfaceC4612a
        @dgc
        public K getElement() {
            return this.f74622a;
        }

        @op1
        public int setCount(int count) {
            m20402a();
            int i = this.f74623b;
            if (i == -1) {
                qjb.this.put(this.f74622a, count);
                return 0;
            }
            int[] iArr = qjb.this.f74615b;
            int i2 = iArr[i];
            iArr[i] = count;
            return i2;
        }
    }

    public qjb() {
        mo20393i(3, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public static <K> qjb<K> m20385a() {
        return new qjb<>();
    }

    /* JADX INFO: renamed from: b */
    public static <K> qjb<K> m20386b(int expectedSize) {
        return new qjb<>(expectedSize);
    }

    private static int getHash(long entry) {
        return (int) (entry >>> 32);
    }

    private static int getNext(long entry) {
        return (int) entry;
    }

    private int hashTableMask() {
        return this.f74618e.length - 1;
    }

    private static long[] newEntries(int size) {
        long[] jArr = new long[size];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] newTable(int size) {
        int[] iArr = new int[size];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void resizeMeMaybe(int newSize) {
        int length = this.f74619f.length;
        if (newSize > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                mo20399o(iMax);
            }
        }
    }

    private void resizeTable(int newCapacity) {
        if (this.f74618e.length >= 1073741824) {
            this.f74621h = Integer.MAX_VALUE;
            return;
        }
        int i = ((int) (newCapacity * this.f74620g)) + 1;
        int[] iArrNewTable = newTable(newCapacity);
        long[] jArr = this.f74619f;
        int length = iArrNewTable.length - 1;
        for (int i2 = 0; i2 < this.f74616c; i2++) {
            int hash = getHash(jArr[i2]);
            int i3 = hash & length;
            int i4 = iArrNewTable[i3];
            iArrNewTable[i3] = i2;
            jArr[i2] = (((long) hash) << 32) | (((long) i4) & 4294967295L);
        }
        this.f74621h = i;
        this.f74618e = iArrNewTable;
    }

    private static long swapNext(long entry, int newNext) {
        return (entry & f74611l) | (4294967295L & ((long) newNext));
    }

    /* JADX INFO: renamed from: c */
    public void m20387c(int minCapacity) {
        if (minCapacity > this.f74619f.length) {
            mo20399o(minCapacity);
        }
        if (minCapacity >= this.f74621h) {
            resizeTable(Math.max(2, Integer.highestOneBit(minCapacity - 1) << 1));
        }
    }

    public void clear() {
        this.f74617d++;
        Arrays.fill(this.f74614a, 0, this.f74616c, (Object) null);
        Arrays.fill(this.f74615b, 0, this.f74616c, 0);
        Arrays.fill(this.f74618e, -1);
        Arrays.fill(this.f74619f, -1L);
        this.f74616c = 0;
    }

    public boolean containsKey(@wx1 Object key) {
        return m20392h(key) != -1;
    }

    /* JADX INFO: renamed from: d */
    public int mo20388d() {
        return this.f74616c == 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: e */
    public d4b.InterfaceC4612a<K> m20389e(int index) {
        v7d.checkElementIndex(index, this.f74616c);
        return new C11496a(index);
    }

    @dgc
    /* JADX INFO: renamed from: f */
    public K m20390f(int i) {
        v7d.checkElementIndex(i, this.f74616c);
        return (K) this.f74614a[i];
    }

    /* JADX INFO: renamed from: g */
    public int m20391g(int index) {
        v7d.checkElementIndex(index, this.f74616c);
        return this.f74615b[index];
    }

    public int get(@wx1 Object key) {
        int iM20392h = m20392h(key);
        if (iM20392h == -1) {
            return 0;
        }
        return this.f74615b[iM20392h];
    }

    /* JADX INFO: renamed from: h */
    public int m20392h(@wx1 Object key) {
        int iM25912d = yh7.m25912d(key);
        int next = this.f74618e[hashTableMask() & iM25912d];
        while (next != -1) {
            long j = this.f74619f[next];
            if (getHash(j) == iM25912d && okb.equal(key, this.f74614a[next])) {
                return next;
            }
            next = getNext(j);
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public void mo20393i(int expectedSize, float loadFactor) {
        v7d.checkArgument(expectedSize >= 0, "Initial capacity must be non-negative");
        v7d.checkArgument(loadFactor > 0.0f, "Illegal load factor");
        int iM25909a = yh7.m25909a(expectedSize, loadFactor);
        this.f74618e = newTable(iM25909a);
        this.f74620g = loadFactor;
        this.f74614a = new Object[expectedSize];
        this.f74615b = new int[expectedSize];
        this.f74619f = newEntries(expectedSize);
        this.f74621h = Math.max(1, (int) (iM25909a * loadFactor));
    }

    /* JADX INFO: renamed from: j */
    public void mo20394j(int entryIndex, @dgc K key, int value, int hash) {
        this.f74619f[entryIndex] = (((long) hash) << 32) | 4294967295L;
        this.f74614a[entryIndex] = key;
        this.f74615b[entryIndex] = value;
    }

    /* JADX INFO: renamed from: k */
    public void mo20395k(int dstIndex) {
        int iM20401q = m20401q() - 1;
        if (dstIndex >= iM20401q) {
            this.f74614a[dstIndex] = null;
            this.f74615b[dstIndex] = 0;
            this.f74619f[dstIndex] = -1;
            return;
        }
        Object[] objArr = this.f74614a;
        objArr[dstIndex] = objArr[iM20401q];
        int[] iArr = this.f74615b;
        iArr[dstIndex] = iArr[iM20401q];
        objArr[iM20401q] = null;
        iArr[iM20401q] = 0;
        long[] jArr = this.f74619f;
        long j = jArr[iM20401q];
        jArr[dstIndex] = j;
        jArr[iM20401q] = -1;
        int hash = getHash(j) & hashTableMask();
        int[] iArr2 = this.f74618e;
        int i = iArr2[hash];
        if (i == iM20401q) {
            iArr2[hash] = dstIndex;
            return;
        }
        while (true) {
            long j2 = this.f74619f[i];
            int next = getNext(j2);
            if (next == iM20401q) {
                this.f74619f[i] = swapNext(j2, dstIndex);
                return;
            }
            i = next;
        }
    }

    /* JADX INFO: renamed from: l */
    public int mo20396l(int index) {
        int i = index + 1;
        if (i < this.f74616c) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: m */
    public int mo20397m(int oldNextIndex, int removedIndex) {
        return oldNextIndex - 1;
    }

    @op1
    /* JADX INFO: renamed from: n */
    public int m20398n(int entryIndex) {
        return remove(this.f74614a[entryIndex], getHash(this.f74619f[entryIndex]));
    }

    /* JADX INFO: renamed from: o */
    public void mo20399o(int newCapacity) {
        this.f74614a = Arrays.copyOf(this.f74614a, newCapacity);
        this.f74615b = Arrays.copyOf(this.f74615b, newCapacity);
        long[] jArr = this.f74619f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, newCapacity);
        if (newCapacity > length) {
            Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
        }
        this.f74619f = jArrCopyOf;
    }

    /* JADX INFO: renamed from: p */
    public void m20400p(int index, int newValue) {
        v7d.checkElementIndex(index, this.f74616c);
        this.f74615b[index] = newValue;
    }

    @op1
    public int put(@dgc K key, int value) {
        s72.m21767d(value, "count");
        long[] jArr = this.f74619f;
        Object[] objArr = this.f74614a;
        int[] iArr = this.f74615b;
        int iM25912d = yh7.m25912d(key);
        int iHashTableMask = hashTableMask() & iM25912d;
        int i = this.f74616c;
        int[] iArr2 = this.f74618e;
        int i2 = iArr2[iHashTableMask];
        if (i2 == -1) {
            iArr2[iHashTableMask] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (getHash(j) == iM25912d && okb.equal(key, objArr[i2])) {
                    int i3 = iArr[i2];
                    iArr[i2] = value;
                    return i3;
                }
                int next = getNext(j);
                if (next == -1) {
                    jArr[i2] = swapNext(j, i);
                    break;
                }
                i2 = next;
            }
        }
        if (i == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i + 1;
        resizeMeMaybe(i4);
        mo20394j(i, key, value, iM25912d);
        this.f74616c = i4;
        if (i >= this.f74621h) {
            resizeTable(this.f74618e.length * 2);
        }
        this.f74617d++;
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public int m20401q() {
        return this.f74616c;
    }

    @op1
    public int remove(@wx1 Object key) {
        return remove(key, yh7.m25912d(key));
    }

    private int remove(@wx1 Object key, int hash) {
        int iHashTableMask = hashTableMask() & hash;
        int i = this.f74618e[iHashTableMask];
        if (i == -1) {
            return 0;
        }
        int i2 = -1;
        while (true) {
            if (getHash(this.f74619f[i]) == hash && okb.equal(key, this.f74614a[i])) {
                int i3 = this.f74615b[i];
                if (i2 == -1) {
                    this.f74618e[iHashTableMask] = getNext(this.f74619f[i]);
                } else {
                    long[] jArr = this.f74619f;
                    jArr[i2] = swapNext(jArr[i2], getNext(jArr[i]));
                }
                mo20395k(i);
                this.f74616c--;
                this.f74617d++;
                return i3;
            }
            int next = getNext(this.f74619f[i]);
            if (next == -1) {
                return 0;
            }
            i2 = i;
            i = next;
        }
    }

    public qjb(qjb<? extends K> map) {
        mo20393i(map.m20401q(), 1.0f);
        int iMo20388d = map.mo20388d();
        while (iMo20388d != -1) {
            put(map.m20390f(iMo20388d), map.m20391g(iMo20388d));
            iMo20388d = map.mo20396l(iMo20388d);
        }
    }

    public qjb(int capacity) {
        this(capacity, 1.0f);
    }

    public qjb(int expectedSize, float loadFactor) {
        mo20393i(expectedSize, loadFactor);
    }
}
