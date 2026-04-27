package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,769:1\n297#1,5:770\n297#1,5:775\n1#2:780\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n276#1:770,5\n291#1:775,5\n*E\n"})
public class scf<K, V> {

    /* JADX INFO: renamed from: a */
    @yfb
    public int[] f81222a;

    /* JADX INFO: renamed from: b */
    @yfb
    public Object[] f81223b;

    /* JADX INFO: renamed from: c */
    public int f81224c;

    @yn8
    public scf() {
        this(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object obj, T t) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (T) this.f81223b[(iIndexOfKey << 1) + 1] : t;
    }

    private final int indexOf(K k, int i) {
        int i2 = this.f81224c;
        if (i2 == 0) {
            return -1;
        }
        int iBinarySearch = cv2.binarySearch(this.f81222a, i2, i);
        if (iBinarySearch < 0 || md8.areEqual(k, this.f81223b[iBinarySearch << 1])) {
            return iBinarySearch;
        }
        int i3 = iBinarySearch + 1;
        while (i3 < i2 && this.f81222a[i3] == i) {
            if (md8.areEqual(k, this.f81223b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBinarySearch - 1; i4 >= 0 && this.f81222a[i4] == i; i4--) {
            if (md8.areEqual(k, this.f81223b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int indexOfNull() {
        int i = this.f81224c;
        if (i == 0) {
            return -1;
        }
        int iBinarySearch = cv2.binarySearch(this.f81222a, i, 0);
        if (iBinarySearch < 0 || this.f81223b[iBinarySearch << 1] == null) {
            return iBinarySearch;
        }
        int i2 = iBinarySearch + 1;
        while (i2 < i && this.f81222a[i2] == 0) {
            if (this.f81223b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iBinarySearch - 1; i3 >= 0 && this.f81222a[i3] == 0; i3--) {
            if (this.f81223b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    @xn8(name = "__restricted$indexOfValue")
    public final int __restricted$indexOfValue(V v) {
        int i = this.f81224c * 2;
        Object[] objArr = this.f81223b;
        if (v == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (md8.areEqual(v, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.f81224c > 0) {
            this.f81222a = cv2.f27723a;
            this.f81223b = cv2.f27725c;
            this.f81224c = 0;
        }
        if (this.f81224c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k) {
        return indexOfKey(k) >= 0;
    }

    public boolean containsValue(V v) {
        return __restricted$indexOfValue(v) >= 0;
    }

    public void ensureCapacity(int i) {
        int i2 = this.f81224c;
        int[] iArr = this.f81222a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f81222a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f81223b, i * 2);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f81223b = objArrCopyOf;
        }
        if (this.f81224c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof scf) {
                if (size() != ((scf) obj).size()) {
                    return false;
                }
                scf scfVar = (scf) obj;
                int i = this.f81224c;
                for (int i2 = 0; i2 < i; i2++) {
                    K kKeyAt = keyAt(i2);
                    V vValueAt = valueAt(i2);
                    Object obj2 = scfVar.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 != null || !scfVar.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!md8.areEqual(vValueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f81224c;
            for (int i4 = 0; i4 < i3; i4++) {
                K kKeyAt2 = keyAt(i4);
                V vValueAt2 = valueAt(i4);
                Object obj3 = ((Map) obj).get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(kKeyAt2)) {
                        return false;
                    }
                } else if (!md8.areEqual(vValueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @gib
    public V get(K k) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey >= 0) {
            return (V) this.f81223b[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@gib Object obj, V v) {
        int iIndexOfKey = indexOfKey(obj);
        return iIndexOfKey >= 0 ? (V) this.f81223b[(iIndexOfKey << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f81222a;
        Object[] objArr = this.f81223b;
        int i = this.f81224c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public int indexOfKey(K k) {
        return k == null ? indexOfNull() : indexOf(k, k.hashCode());
    }

    public boolean isEmpty() {
        return this.f81224c <= 0;
    }

    public K keyAt(int i) {
        if (i >= 0 && i < this.f81224c) {
            return (K) this.f81223b[i << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    @gib
    public V put(K k, V v) {
        int i = this.f81224c;
        int iHashCode = k != null ? k.hashCode() : 0;
        int iIndexOf = k != null ? indexOf(k, iHashCode) : indexOfNull();
        if (iIndexOf >= 0) {
            int i2 = (iIndexOf << 1) + 1;
            Object[] objArr = this.f81223b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~iIndexOf;
        int[] iArr = this.f81222a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f81222a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f81223b, i4 << 1);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f81223b = objArrCopyOf;
            if (i != this.f81224c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f81222a;
            int i5 = i3 + 1;
            u70.copyInto(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f81223b;
            u70.copyInto(objArr2, objArr2, i5 << 1, i3 << 1, this.f81224c << 1);
        }
        int i6 = this.f81224c;
        if (i == i6) {
            int[] iArr3 = this.f81222a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f81223b;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.f81224c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@yfb scf<? extends K, ? extends V> scfVar) {
        md8.checkNotNullParameter(scfVar, "map");
        int i = scfVar.f81224c;
        ensureCapacity(this.f81224c + i);
        if (this.f81224c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(scfVar.keyAt(i2), scfVar.valueAt(i2));
            }
        } else if (i > 0) {
            u70.copyInto(scfVar.f81222a, this.f81222a, 0, 0, i);
            u70.copyInto(scfVar.f81223b, this.f81223b, 0, 0, i << 1);
            this.f81224c = i;
        }
    }

    @gib
    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    @gib
    public V remove(K k) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public V removeAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f81224c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        Object[] objArr = this.f81223b;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
        } else {
            int i4 = i2 - 1;
            int[] iArr = this.f81222a;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    u70.copyInto(iArr, iArr, i, i5, i2);
                    Object[] objArr2 = this.f81223b;
                    u70.copyInto(objArr2, objArr2, i3, i5 << 1, i2 << 1);
                }
                Object[] objArr3 = this.f81223b;
                int i6 = i4 << 1;
                objArr3[i6] = null;
                objArr3[i6 + 1] = null;
            } else {
                int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
                md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                this.f81222a = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f81223b, i7 << 1);
                md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                this.f81223b = objArrCopyOf;
                if (i2 != this.f81224c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    u70.copyInto(iArr, this.f81222a, 0, 0, i);
                    u70.copyInto(objArr, this.f81223b, 0, 0, i3);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    u70.copyInto(iArr, this.f81222a, i, i8, i2);
                    u70.copyInto(objArr, this.f81223b, i3, i8 << 1, i2 << 1);
                }
            }
            if (i2 != this.f81224c) {
                throw new ConcurrentModificationException();
            }
            this.f81224c = i4;
        }
        return v;
    }

    @gib
    public V replace(K k, V v) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, v);
        }
        return null;
    }

    public V setValueAt(int i, V v) {
        if (i < 0 || i >= this.f81224c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f81223b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public int size() {
        return this.f81224c;
    }

    @yfb
    public String toString() {
        if (isEmpty()) {
            return isa.f48126c;
        }
        StringBuilder sb = new StringBuilder(this.f81224c * 28);
        sb.append('{');
        int i = this.f81224c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i2);
            if (kKeyAt != sb) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i2);
            if (vValueAt != sb) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public V valueAt(int i) {
        if (i >= 0 && i < this.f81224c) {
            return (V) this.f81223b[(i << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
    }

    @yn8
    public scf(int i) {
        this.f81222a = i == 0 ? cv2.f27723a : new int[i];
        this.f81223b = i == 0 ? cv2.f27725c : new Object[i << 1];
    }

    public boolean remove(K k, V v) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey < 0 || !md8.areEqual(v, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey < 0 || !md8.areEqual(v, valueAt(iIndexOfKey))) {
            return false;
        }
        setValueAt(iIndexOfKey, v2);
        return true;
    }

    public /* synthetic */ scf(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public scf(@gib scf<? extends K, ? extends V> scfVar) {
        this(0, 1, null);
        if (scfVar != null) {
            putAll(scfVar);
        }
    }
}
