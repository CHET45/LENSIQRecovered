package p000;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p000.ox7;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public final class mxd<K, V> extends ox7<K, V> {

    /* JADX INFO: renamed from: F */
    public static final byte f62714F = -1;

    /* JADX INFO: renamed from: H */
    public static final int f62715H = 128;

    /* JADX INFO: renamed from: L */
    public static final int f62716L = 32768;

    /* JADX INFO: renamed from: M */
    public static final int f62717M = 255;

    /* JADX INFO: renamed from: N */
    public static final int f62718N = 65535;

    /* JADX INFO: renamed from: Q */
    public static final ox7<Object, Object> f62719Q = new mxd(null, new Object[0], 0);

    @yg8
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: C */
    public final transient int f62720C;

    /* JADX INFO: renamed from: f */
    @wx1
    public final transient Object f62721f;

    /* JADX INFO: renamed from: m */
    @gdi
    public final transient Object[] f62722m;

    /* JADX INFO: renamed from: mxd$a */
    public static class C9606a<K, V> extends dy7<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: C */
        public final transient int f62723C;

        /* JADX INFO: renamed from: F */
        public final transient int f62724F;

        /* JADX INFO: renamed from: f */
        public final transient ox7<K, V> f62725f;

        /* JADX INFO: renamed from: m */
        public final transient Object[] f62726m;

        /* JADX INFO: renamed from: mxd$a$a */
        public class a extends kx7<Map.Entry<K, V>> {
            public a() {
            }

            @Override // p000.ax7
            public boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return C9606a.this.f62724F;
            }

            @Override // java.util.List
            public Map.Entry<K, V> get(int index) {
                v7d.checkElementIndex(index, C9606a.this.f62724F);
                int i = index * 2;
                Object obj = C9606a.this.f62726m[C9606a.this.f62723C + i];
                Objects.requireNonNull(obj);
                Object obj2 = C9606a.this.f62726m[i + (C9606a.this.f62723C ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
        }

        public C9606a(ox7<K, V> map, Object[] alternatingKeysAndValues, int keyOffset, int size) {
            this.f62725f = map;
            this.f62726m = alternatingKeysAndValues;
            this.f62723C = keyOffset;
            this.f62724F = size;
        }

        @Override // p000.ax7
        /* JADX INFO: renamed from: a */
        public int mo2718a(Object[] dst, int offset) {
            return asList().mo2718a(dst, offset);
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) object;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f62725f.get(key));
        }

        @Override // p000.dy7
        /* JADX INFO: renamed from: h */
        public kx7<Map.Entry<K, V>> mo9582h() {
            return new a();
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f62724F;
        }

        @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public quh<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    /* JADX INFO: renamed from: mxd$b */
    public static final class C9607b<K> extends dy7<K> {

        /* JADX INFO: renamed from: f */
        public final transient ox7<K, ?> f62728f;

        /* JADX INFO: renamed from: m */
        public final transient kx7<K> f62729m;

        public C9607b(ox7<K, ?> map, kx7<K> list) {
            this.f62728f = map;
            this.f62729m = list;
        }

        @Override // p000.ax7
        /* JADX INFO: renamed from: a */
        public int mo2718a(Object[] dst, int offset) {
            return asList().mo2718a(dst, offset);
        }

        @Override // p000.dy7, p000.ax7
        public kx7<K> asList() {
            return this.f62729m;
        }

        @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@wx1 Object object) {
            return this.f62728f.get(object) != null;
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f62728f.size();
        }

        @Override // p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public quh<K> iterator() {
            return asList().iterator();
        }
    }

    /* JADX INFO: renamed from: mxd$c */
    public static final class C9608c extends kx7<Object> {

        /* JADX INFO: renamed from: c */
        public final transient Object[] f62730c;

        /* JADX INFO: renamed from: d */
        public final transient int f62731d;

        /* JADX INFO: renamed from: e */
        public final transient int f62732e;

        public C9608c(Object[] alternatingKeysAndValues, int offset, int size) {
            this.f62730c = alternatingKeysAndValues;
            this.f62731d = offset;
            this.f62732e = size;
        }

        @Override // java.util.List
        public Object get(int index) {
            v7d.checkElementIndex(index, this.f62732e);
            Object obj = this.f62730c[(index * 2) + this.f62731d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f62732e;
        }
    }

    private mxd(@wx1 Object hashTable, Object[] alternatingKeysAndValues, int size) {
        this.f62721f = hashTable;
        this.f62722m = alternatingKeysAndValues;
        this.f62720C = size;
    }

    @wx1
    private static Object createHashTable(Object[] alternatingKeysAndValues, int n, int tableSize, int keyOffset) {
        ox7.C10705d.a aVar = null;
        if (n == 1) {
            Object obj = alternatingKeysAndValues[keyOffset];
            Objects.requireNonNull(obj);
            Object obj2 = alternatingKeysAndValues[keyOffset ^ 1];
            Objects.requireNonNull(obj2);
            s72.m21764a(obj, obj2);
            return null;
        }
        int i = tableSize - 1;
        int i2 = -1;
        if (tableSize <= 128) {
            byte[] bArr = new byte[tableSize];
            Arrays.fill(bArr, (byte) -1);
            int i3 = 0;
            for (int i4 = 0; i4 < n; i4++) {
                int i5 = (i4 * 2) + keyOffset;
                int i6 = (i3 * 2) + keyOffset;
                Object obj3 = alternatingKeysAndValues[i5];
                Objects.requireNonNull(obj3);
                Object obj4 = alternatingKeysAndValues[i5 ^ 1];
                Objects.requireNonNull(obj4);
                s72.m21764a(obj3, obj4);
                int iM25911c = yh7.m25911c(obj3.hashCode());
                while (true) {
                    int i7 = iM25911c & i;
                    int i8 = bArr[i7] & 255;
                    if (i8 == 255) {
                        bArr[i7] = (byte) i6;
                        if (i3 < i4) {
                            alternatingKeysAndValues[i6] = obj3;
                            alternatingKeysAndValues[i6 ^ 1] = obj4;
                        }
                        i3++;
                    } else {
                        if (obj3.equals(alternatingKeysAndValues[i8])) {
                            int i9 = i8 ^ 1;
                            Object obj5 = alternatingKeysAndValues[i9];
                            Objects.requireNonNull(obj5);
                            aVar = new ox7.C10705d.a(obj3, obj4, obj5);
                            alternatingKeysAndValues[i9] = obj4;
                            break;
                        }
                        iM25911c = i7 + 1;
                    }
                }
            }
            return i3 == n ? bArr : new Object[]{bArr, Integer.valueOf(i3), aVar};
        }
        if (tableSize <= 32768) {
            short[] sArr = new short[tableSize];
            Arrays.fill(sArr, (short) -1);
            int i10 = 0;
            for (int i11 = 0; i11 < n; i11++) {
                int i12 = (i11 * 2) + keyOffset;
                int i13 = (i10 * 2) + keyOffset;
                Object obj6 = alternatingKeysAndValues[i12];
                Objects.requireNonNull(obj6);
                Object obj7 = alternatingKeysAndValues[i12 ^ 1];
                Objects.requireNonNull(obj7);
                s72.m21764a(obj6, obj7);
                int iM25911c2 = yh7.m25911c(obj6.hashCode());
                while (true) {
                    int i14 = iM25911c2 & i;
                    int i15 = sArr[i14] & iqh.f48007d;
                    if (i15 == 65535) {
                        sArr[i14] = (short) i13;
                        if (i10 < i11) {
                            alternatingKeysAndValues[i13] = obj6;
                            alternatingKeysAndValues[i13 ^ 1] = obj7;
                        }
                        i10++;
                    } else {
                        if (obj6.equals(alternatingKeysAndValues[i15])) {
                            int i16 = i15 ^ 1;
                            Object obj8 = alternatingKeysAndValues[i16];
                            Objects.requireNonNull(obj8);
                            aVar = new ox7.C10705d.a(obj6, obj7, obj8);
                            alternatingKeysAndValues[i16] = obj7;
                            break;
                        }
                        iM25911c2 = i14 + 1;
                    }
                }
            }
            return i10 == n ? sArr : new Object[]{sArr, Integer.valueOf(i10), aVar};
        }
        int[] iArr = new int[tableSize];
        Arrays.fill(iArr, -1);
        int i17 = 0;
        int i18 = 0;
        while (i17 < n) {
            int i19 = (i17 * 2) + keyOffset;
            int i20 = (i18 * 2) + keyOffset;
            Object obj9 = alternatingKeysAndValues[i19];
            Objects.requireNonNull(obj9);
            Object obj10 = alternatingKeysAndValues[i19 ^ 1];
            Objects.requireNonNull(obj10);
            s72.m21764a(obj9, obj10);
            int iM25911c3 = yh7.m25911c(obj9.hashCode());
            while (true) {
                int i21 = iM25911c3 & i;
                int i22 = iArr[i21];
                if (i22 == i2) {
                    iArr[i21] = i20;
                    if (i18 < i17) {
                        alternatingKeysAndValues[i20] = obj9;
                        alternatingKeysAndValues[i20 ^ 1] = obj10;
                    }
                    i18++;
                } else {
                    if (obj9.equals(alternatingKeysAndValues[i22])) {
                        int i23 = i22 ^ 1;
                        Object obj11 = alternatingKeysAndValues[i23];
                        Objects.requireNonNull(obj11);
                        aVar = new ox7.C10705d.a(obj9, obj10, obj11);
                        alternatingKeysAndValues[i23] = obj10;
                        break;
                    }
                    iM25911c3 = i21 + 1;
                    i2 = -1;
                }
            }
            i17++;
            i2 = -1;
        }
        return i18 == n ? iArr : new Object[]{iArr, Integer.valueOf(i18), aVar};
    }

    /* JADX INFO: renamed from: j */
    public static <K, V> mxd<K, V> m17663j(int n, Object[] alternatingKeysAndValues) {
        return m17664k(n, alternatingKeysAndValues, null);
    }

    /* JADX INFO: renamed from: k */
    public static <K, V> mxd<K, V> m17664k(int n, Object[] alternatingKeysAndValues, ox7.C10705d<K, V> builder) {
        if (n == 0) {
            return (mxd) f62719Q;
        }
        if (n == 1) {
            Object obj = alternatingKeysAndValues[0];
            Objects.requireNonNull(obj);
            Object obj2 = alternatingKeysAndValues[1];
            Objects.requireNonNull(obj2);
            s72.m21764a(obj, obj2);
            return new mxd<>(null, alternatingKeysAndValues, 1);
        }
        v7d.checkPositionIndex(n, alternatingKeysAndValues.length >> 1);
        Object objCreateHashTable = createHashTable(alternatingKeysAndValues, n, dy7.m9574g(n), 0);
        if (objCreateHashTable instanceof Object[]) {
            Object[] objArr = (Object[]) objCreateHashTable;
            ox7.C10705d.a aVar = (ox7.C10705d.a) objArr[2];
            if (builder == null) {
                throw aVar.m19090a();
            }
            builder.f69152e = aVar;
            Object obj3 = objArr[0];
            int iIntValue = ((Integer) objArr[1]).intValue();
            alternatingKeysAndValues = Arrays.copyOf(alternatingKeysAndValues, iIntValue * 2);
            objCreateHashTable = obj3;
            n = iIntValue;
        }
        return new mxd<>(objCreateHashTable, alternatingKeysAndValues, n);
    }

    @wx1
    /* JADX INFO: renamed from: l */
    public static Object m17665l(Object[] alternatingKeysAndValues, int n, int tableSize, int keyOffset) {
        Object objCreateHashTable = createHashTable(alternatingKeysAndValues, n, tableSize, keyOffset);
        if (objCreateHashTable instanceof Object[]) {
            throw ((ox7.C10705d.a) ((Object[]) objCreateHashTable)[2]).m19090a();
        }
        return objCreateHashTable;
    }

    @wx1
    /* JADX INFO: renamed from: m */
    public static Object m17666m(@wx1 Object hashTableObject, Object[] alternatingKeysAndValues, int size, int keyOffset, @wx1 Object key) {
        if (key == null) {
            return null;
        }
        if (size == 1) {
            Object obj = alternatingKeysAndValues[keyOffset];
            Objects.requireNonNull(obj);
            if (!obj.equals(key)) {
                return null;
            }
            Object obj2 = alternatingKeysAndValues[keyOffset ^ 1];
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if (hashTableObject == null) {
            return null;
        }
        if (hashTableObject instanceof byte[]) {
            byte[] bArr = (byte[]) hashTableObject;
            int length = bArr.length - 1;
            int iM25911c = yh7.m25911c(key.hashCode());
            while (true) {
                int i = iM25911c & length;
                int i2 = bArr[i] & 255;
                if (i2 == 255) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i2])) {
                    return alternatingKeysAndValues[i2 ^ 1];
                }
                iM25911c = i + 1;
            }
        } else if (hashTableObject instanceof short[]) {
            short[] sArr = (short[]) hashTableObject;
            int length2 = sArr.length - 1;
            int iM25911c2 = yh7.m25911c(key.hashCode());
            while (true) {
                int i3 = iM25911c2 & length2;
                int i4 = sArr[i3] & iqh.f48007d;
                if (i4 == 65535) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i4])) {
                    return alternatingKeysAndValues[i4 ^ 1];
                }
                iM25911c2 = i3 + 1;
            }
        } else {
            int[] iArr = (int[]) hashTableObject;
            int length3 = iArr.length - 1;
            int iM25911c3 = yh7.m25911c(key.hashCode());
            while (true) {
                int i5 = iM25911c3 & length3;
                int i6 = iArr[i5];
                if (i6 == -1) {
                    return null;
                }
                if (key.equals(alternatingKeysAndValues[i6])) {
                    return alternatingKeysAndValues[i6 ^ 1];
                }
                iM25911c3 = i5 + 1;
            }
        }
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: c */
    public dy7<Map.Entry<K, V>> mo13559c() {
        return new C9606a(this, this.f62722m, 0, this.f62720C);
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: d */
    public dy7<K> mo2957d() {
        return new C9607b(this, new C9608c(this.f62722m, 0, this.f62720C));
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: e */
    public ax7<V> mo13560e() {
        return new C9608c(this.f62722m, 1, this.f62720C);
    }

    @Override // p000.ox7, java.util.Map
    @wx1
    public V get(@wx1 Object obj) {
        V v = (V) m17666m(this.f62721f, this.f62722m, this.f62720C, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // p000.ox7
    /* JADX INFO: renamed from: h */
    public boolean mo2953h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f62720C;
    }
}
