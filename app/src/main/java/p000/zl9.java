package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,255:1\n243#2:256\n256#2,6:257\n248#2,14:263\n267#2,8:277\n267#2,8:285\n278#2,9:293\n291#2,5:302\n299#2,8:307\n315#2,9:315\n349#2,12:324\n328#2,18:336\n363#2,26:354\n392#2,5:380\n400#2,5:385\n409#2,2:390\n328#2,18:392\n412#2:410\n416#2:411\n420#2,6:412\n328#2,18:418\n427#2:436\n432#2,6:437\n328#2,18:443\n441#2:461\n446#2,6:462\n328#2,18:468\n453#2,2:486\n458#2,2:488\n328#2,18:490\n461#2:508\n466#2,2:509\n328#2,18:511\n469#2,6:529\n479#2:535\n484#2:536\n489#2,8:537\n500#2,6:545\n328#2,18:551\n507#2,10:569\n520#2,21:579\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n93#1:256\n93#1:257,6\n100#1:263,14\n106#1:277,8\n111#1:285,8\n120#1:293,9\n125#1:302,5\n134#1:307,8\n145#1:315,9\n151#1:324,12\n151#1:336,18\n151#1:354,26\n157#1:380,5\n168#1:385,5\n173#1:390,2\n173#1:392,18\n173#1:410\n180#1:411\n192#1:412,6\n192#1:418,18\n192#1:436\n204#1:437,6\n204#1:443,18\n204#1:461\n212#1:462,6\n212#1:468,18\n212#1:486,2\n219#1:488,2\n219#1:490,18\n219#1:508\n228#1:509,2\n228#1:511,18\n228#1:529,6\n231#1:535\n234#1:536\n239#1:537,8\n245#1:545,6\n245#1:551,18\n245#1:569,10\n253#1:579,21\n*E\n"})
public class zl9<E> implements Cloneable {

    /* JADX INFO: renamed from: a */
    @un8
    public /* synthetic */ boolean f105412a;

    /* JADX INFO: renamed from: b */
    @un8
    public /* synthetic */ long[] f105413b;

    /* JADX INFO: renamed from: c */
    @un8
    public /* synthetic */ Object[] f105414c;

    /* JADX INFO: renamed from: d */
    @un8
    public /* synthetic */ int f105415d;

    @yn8
    public zl9() {
        this(0, 1, null);
    }

    public void append(long j, E e) {
        int i = this.f105415d;
        if (i != 0 && j <= this.f105413b[i - 1]) {
            put(j, e);
            return;
        }
        if (this.f105412a) {
            long[] jArr = this.f105413b;
            if (i >= jArr.length) {
                Object[] objArr = this.f105414c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != bm9.f14137a) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.f105412a = false;
                this.f105415d = i2;
            }
        }
        int i4 = this.f105415d;
        if (i4 >= this.f105413b.length) {
            int iIdealLongArraySize = cv2.idealLongArraySize(i4 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f105413b, iIdealLongArraySize);
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f105413b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f105414c, iIdealLongArraySize);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f105414c = objArrCopyOf;
        }
        this.f105413b[i4] = j;
        this.f105414c[i4] = e;
        this.f105415d = i4 + 1;
    }

    public void clear() {
        int i = this.f105415d;
        Object[] objArr = this.f105414c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f105415d = 0;
        this.f105412a = false;
    }

    public boolean containsKey(long j) {
        return indexOfKey(j) >= 0;
    }

    public boolean containsValue(E e) {
        return indexOfValue(e) >= 0;
    }

    @q64(message = "Alias for `remove(key)`.", replaceWith = @i2e(expression = "remove(key)", imports = {}))
    public void delete(long j) {
        int iBinarySearch = cv2.binarySearch(this.f105413b, this.f105415d, j);
        if (iBinarySearch < 0 || this.f105414c[iBinarySearch] == bm9.f14137a) {
            return;
        }
        this.f105414c[iBinarySearch] = bm9.f14137a;
        this.f105412a = true;
    }

    @gib
    public E get(long j) {
        int iBinarySearch = cv2.binarySearch(this.f105413b, this.f105415d, j);
        if (iBinarySearch < 0 || this.f105414c[iBinarySearch] == bm9.f14137a) {
            return null;
        }
        return (E) this.f105414c[iBinarySearch];
    }

    public int indexOfKey(long j) {
        if (this.f105412a) {
            int i = this.f105415d;
            long[] jArr = this.f105413b;
            Object[] objArr = this.f105414c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != bm9.f14137a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f105412a = false;
            this.f105415d = i2;
        }
        return cv2.binarySearch(this.f105413b, this.f105415d, j);
    }

    public int indexOfValue(E e) {
        if (this.f105412a) {
            int i = this.f105415d;
            long[] jArr = this.f105413b;
            Object[] objArr = this.f105414c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != bm9.f14137a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f105412a = false;
            this.f105415d = i2;
        }
        int i4 = this.f105415d;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f105414c[i5] == e) {
                return i5;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f105415d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.f105412a) {
            long[] jArr = this.f105413b;
            Object[] objArr = this.f105414c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != bm9.f14137a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f105412a = false;
            this.f105415d = i3;
        }
        return this.f105413b[i];
    }

    public void put(long j, E e) {
        int iBinarySearch = cv2.binarySearch(this.f105413b, this.f105415d, j);
        if (iBinarySearch >= 0) {
            this.f105414c[iBinarySearch] = e;
            return;
        }
        int i = ~iBinarySearch;
        if (i < this.f105415d && this.f105414c[i] == bm9.f14137a) {
            this.f105413b[i] = j;
            this.f105414c[i] = e;
            return;
        }
        if (this.f105412a) {
            int i2 = this.f105415d;
            long[] jArr = this.f105413b;
            if (i2 >= jArr.length) {
                Object[] objArr = this.f105414c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != bm9.f14137a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f105412a = false;
                this.f105415d = i3;
                i = ~cv2.binarySearch(this.f105413b, i3, j);
            }
        }
        int i5 = this.f105415d;
        if (i5 >= this.f105413b.length) {
            int iIdealLongArraySize = cv2.idealLongArraySize(i5 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.f105413b, iIdealLongArraySize);
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f105413b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f105414c, iIdealLongArraySize);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f105414c = objArrCopyOf;
        }
        int i6 = this.f105415d;
        if (i6 - i != 0) {
            long[] jArr2 = this.f105413b;
            int i7 = i + 1;
            u70.copyInto(jArr2, jArr2, i7, i, i6);
            Object[] objArr2 = this.f105414c;
            u70.copyInto(objArr2, objArr2, i7, i, this.f105415d);
        }
        this.f105413b[i] = j;
        this.f105414c[i] = e;
        this.f105415d++;
    }

    public void putAll(@yfb zl9<? extends E> zl9Var) {
        md8.checkNotNullParameter(zl9Var, "other");
        int size = zl9Var.size();
        for (int i = 0; i < size; i++) {
            put(zl9Var.keyAt(i), zl9Var.valueAt(i));
        }
    }

    @gib
    public E putIfAbsent(long j, E e) {
        E e2 = get(j);
        if (e2 == null) {
            put(j, e);
        }
        return e2;
    }

    public void remove(long j) {
        int iBinarySearch = cv2.binarySearch(this.f105413b, this.f105415d, j);
        if (iBinarySearch < 0 || this.f105414c[iBinarySearch] == bm9.f14137a) {
            return;
        }
        this.f105414c[iBinarySearch] = bm9.f14137a;
        this.f105412a = true;
    }

    public void removeAt(int i) {
        if (this.f105414c[i] != bm9.f14137a) {
            this.f105414c[i] = bm9.f14137a;
            this.f105412a = true;
        }
    }

    @gib
    public E replace(long j, E e) {
        int iIndexOfKey = indexOfKey(j);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.f105414c;
        E e2 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e2;
    }

    public void setValueAt(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f105415d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.f105412a) {
            long[] jArr = this.f105413b;
            Object[] objArr = this.f105414c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != bm9.f14137a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f105412a = false;
            this.f105415d = i3;
        }
        this.f105414c[i] = e;
    }

    public int size() {
        if (this.f105412a) {
            int i = this.f105415d;
            long[] jArr = this.f105413b;
            Object[] objArr = this.f105414c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != bm9.f14137a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.f105412a = false;
            this.f105415d = i2;
        }
        return this.f105415d;
    }

    @yfb
    public String toString() {
        if (size() <= 0) {
            return isa.f48126c;
        }
        StringBuilder sb = new StringBuilder(this.f105415d * 28);
        sb.append('{');
        int i = this.f105415d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
            sb.append('=');
            E eValueAt = valueAt(i2);
            if (eValueAt != sb) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public E valueAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f105415d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (this.f105412a) {
            long[] jArr = this.f105413b;
            Object[] objArr = this.f105414c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != bm9.f14137a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f105412a = false;
            this.f105415d = i3;
        }
        return (E) this.f105414c[i];
    }

    @yn8
    public zl9(int i) {
        if (i == 0) {
            this.f105413b = cv2.f27724b;
            this.f105414c = cv2.f27725c;
        } else {
            int iIdealLongArraySize = cv2.idealLongArraySize(i);
            this.f105413b = new long[iIdealLongArraySize];
            this.f105414c = new Object[iIdealLongArraySize];
        }
    }

    @yfb
    public zl9<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        md8.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        zl9<E> zl9Var = (zl9) objClone;
        zl9Var.f105413b = (long[]) this.f105413b.clone();
        zl9Var.f105414c = (Object[]) this.f105414c.clone();
        return zl9Var;
    }

    public E get(long j, E e) {
        int iBinarySearch = cv2.binarySearch(this.f105413b, this.f105415d, j);
        return (iBinarySearch < 0 || this.f105414c[iBinarySearch] == bm9.f14137a) ? e : (E) this.f105414c[iBinarySearch];
    }

    public boolean replace(long j, E e, E e2) {
        int iIndexOfKey = indexOfKey(j);
        if (iIndexOfKey < 0 || !md8.areEqual(this.f105414c[iIndexOfKey], e)) {
            return false;
        }
        this.f105414c[iIndexOfKey] = e2;
        return true;
    }

    public boolean remove(long j, E e) {
        int iIndexOfKey = indexOfKey(j);
        if (iIndexOfKey < 0 || !md8.areEqual(e, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public /* synthetic */ zl9(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
