package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class rcf<K, V> {

    /* JADX INFO: renamed from: d */
    public static final int f77835d = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public int[] f77836a;

    /* JADX INFO: renamed from: b */
    @yfb
    public Object[] f77837b;

    /* JADX INFO: renamed from: c */
    public int f77838c;

    @yn8
    public rcf() {
        this(0, 1, null);
    }

    public static /* synthetic */ void size$annotations() {
    }

    /* JADX INFO: renamed from: a */
    public final int m21166a() {
        return this.f77838c;
    }

    /* JADX INFO: renamed from: b */
    public final int m21167b(@yfb Object obj, int i) {
        int i2 = this.f77838c;
        if (i2 == 0) {
            return -1;
        }
        int iBinarySearchInternal = bv2.binarySearchInternal(this.f77836a, i2, i);
        if (iBinarySearchInternal < 0 || md8.areEqual(obj, this.f77837b[iBinarySearchInternal << 1])) {
            return iBinarySearchInternal;
        }
        int i3 = iBinarySearchInternal + 1;
        while (i3 < i2 && this.f77836a[i3] == i) {
            if (md8.areEqual(obj, this.f77837b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iBinarySearchInternal - 1; i4 >= 0 && this.f77836a[i4] == i; i4--) {
            if (md8.areEqual(obj, this.f77837b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: c */
    public final int m21168c() {
        int i = this.f77838c;
        if (i == 0) {
            return -1;
        }
        int iBinarySearchInternal = bv2.binarySearchInternal(this.f77836a, i, 0);
        if (iBinarySearchInternal < 0 || this.f77837b[iBinarySearchInternal << 1] == null) {
            return iBinarySearchInternal;
        }
        int i2 = iBinarySearchInternal + 1;
        while (i2 < i && this.f77836a[i2] == 0) {
            if (this.f77837b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iBinarySearchInternal - 1; i3 >= 0 && this.f77836a[i3] == 0; i3--) {
            if (this.f77837b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final void clear() {
        if (this.f77838c > 0) {
            this.f77836a = bv2.f14853a;
            this.f77837b = bv2.f14854b;
            this.f77838c = 0;
        }
        if (this.f77838c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(K k) {
        return indexOfKey(k) >= 0;
    }

    public final boolean containsValue(V v) {
        return indexOfValue$ui_text_release(v) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m21169d(int i) {
        this.f77838c = i;
    }

    public final void ensureCapacity(int i) {
        int i2 = this.f77838c;
        int[] iArr = this.f77836a;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f77836a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f77837b, i << 1);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f77837b = objArrCopyOf;
        }
        if (this.f77838c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof rcf) {
                rcf rcfVar = (rcf) obj;
                int i = this.f77838c;
                if (i != rcfVar.f77838c) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    K kKeyAt = keyAt(i2);
                    V vValueAt = valueAt(i2);
                    Object obj2 = rcfVar.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj2 != null || !rcfVar.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!md8.areEqual(vValueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f77838c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f77838c;
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
    public final V get(K k) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey >= 0) {
            return (V) this.f77837b[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    public final V getOrDefault(K k, V v) {
        int iIndexOfKey = indexOfKey(k);
        return iIndexOfKey >= 0 ? (V) this.f77837b[(iIndexOfKey << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f77836a;
        Object[] objArr = this.f77837b;
        int i = this.f77838c;
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

    public final int indexOfKey(@gib Object obj) {
        return obj == null ? m21168c() : m21167b(obj, obj.hashCode());
    }

    public final int indexOfValue$ui_text_release(V v) {
        int i = this.f77838c << 1;
        Object[] objArr = this.f77837b;
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

    public final boolean isEmpty() {
        return this.f77838c <= 0;
    }

    public final K keyAt(int i) {
        return (K) this.f77837b[i << 1];
    }

    @gib
    public final V put(K k, V v) {
        int iHashCode;
        int iM21167b;
        int i = this.f77838c;
        if (k == null) {
            iM21167b = m21168c();
            iHashCode = 0;
        } else {
            iHashCode = k.hashCode();
            iM21167b = m21167b(k, iHashCode);
        }
        if (iM21167b >= 0) {
            int i2 = (iM21167b << 1) + 1;
            Object[] objArr = this.f77837b;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = ~iM21167b;
        int[] iArr = this.f77836a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f77836a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f77837b, i4 << 1);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f77837b = objArrCopyOf;
            if (i != this.f77838c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f77836a;
            int i5 = i3 + 1;
            u70.copyInto(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f77837b;
            u70.copyInto(objArr2, objArr2, i5 << 1, i3 << 1, this.f77838c << 1);
        }
        int i6 = this.f77838c;
        if (i == i6) {
            int[] iArr3 = this.f77836a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f77837b;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.f77838c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(@yfb rcf<? extends K, ? extends V> rcfVar) {
        int i = rcfVar.f77838c;
        ensureCapacity(this.f77838c + i);
        if (this.f77838c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(rcfVar.keyAt(i2), rcfVar.valueAt(i2));
            }
        } else if (i > 0) {
            u70.copyInto(rcfVar.f77836a, this.f77836a, 0, 0, i);
            u70.copyInto(rcfVar.f77837b, this.f77837b, 0, 0, i << 1);
            this.f77838c = i;
        }
    }

    @gib
    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    @gib
    public final V remove(K k) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    @gib
    public final V removeAt(int i) {
        Object[] objArr = this.f77837b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f77838c;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f77836a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    u70.copyInto(iArr, iArr, i, i5, i3);
                    Object[] objArr2 = this.f77837b;
                    u70.copyInto(objArr2, objArr2, i2, i5 << 1, i3 << 1);
                }
                Object[] objArr3 = this.f77837b;
                int i6 = i4 << 1;
                objArr3[i6] = null;
                objArr3[i6 + 1] = null;
            } else {
                int i7 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr2 = new int[i7];
                this.f77836a = iArr2;
                this.f77837b = new Object[i7 << 1];
                if (i > 0) {
                    u70.copyInto(iArr, iArr2, 0, 0, i);
                    u70.copyInto(objArr, this.f77837b, 0, 0, i2);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    u70.copyInto(iArr, this.f77836a, i, i8, i3);
                    u70.copyInto(objArr, this.f77837b, i2, i8 << 1, i3 << 1);
                }
            }
            if (i3 != this.f77838c) {
                throw new ConcurrentModificationException();
            }
            this.f77838c = i4;
        }
        return v;
    }

    @gib
    public final V replace(K k, V v) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, v);
        }
        return null;
    }

    public final V setValueAt(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f77837b;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    @xn8(name = MediaInformation.KEY_SIZE)
    public final int size() {
        return this.f77838c;
    }

    @yfb
    public String toString() {
        if (isEmpty()) {
            return isa.f48126c;
        }
        StringBuilder sb = new StringBuilder(this.f77838c * 28);
        sb.append('{');
        int i = this.f77838c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i2);
            if (kKeyAt != this) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i2);
            if (vValueAt != this) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final V valueAt(int i) {
        return (V) this.f77837b[(i << 1) + 1];
    }

    @yn8
    public rcf(int i) {
        if (i == 0) {
            this.f77836a = bv2.f14853a;
            this.f77837b = bv2.f14854b;
        } else {
            this.f77836a = new int[i];
            this.f77837b = new Object[i << 1];
        }
        this.f77838c = 0;
    }

    public final boolean remove(K k, V v) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey < 0 || !md8.areEqual(v, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey < 0 || valueAt(iIndexOfKey) != v) {
            return false;
        }
        setValueAt(iIndexOfKey, v2);
        return true;
    }

    public /* synthetic */ rcf(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rcf(@gib rcf<K, V> rcfVar) {
        this(0, 1, null);
        if (rcfVar != 0) {
            putAll(rcfVar);
        }
    }
}
