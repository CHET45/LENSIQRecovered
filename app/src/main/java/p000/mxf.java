package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSparseArrayCompat.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n+ 2 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,273:1\n275#2,9:274\n288#2,5:283\n296#2,5:288\n304#2,8:293\n320#2,9:301\n353#2,40:310\n396#2,2:350\n353#2,47:352\n403#2,3:399\n353#2,40:402\n407#2:442\n412#2,4:443\n419#2:447\n423#2,4:448\n431#2,8:452\n443#2,5:460\n451#2,4:465\n459#2,9:469\n472#2:478\n477#2:479\n459#2,9:480\n482#2,8:489\n493#2,17:497\n513#2,21:514\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.jvm.kt\nandroidx/collection/SparseArrayCompat\n*L\n130#1:274,9\n135#1:283,5\n144#1:288,5\n152#1:293,8\n163#1:301,9\n169#1:310,40\n176#1:350,2\n176#1:352,47\n186#1:399,3\n186#1:402,40\n186#1:442\n191#1:443,4\n205#1:447\n212#1:448,4\n218#1:452,8\n224#1:460,5\n234#1:465,4\n246#1:469,9\n249#1:478\n252#1:479\n252#1:480,9\n257#1:489,8\n263#1:497,17\n271#1:514,21\n*E\n"})
public class mxf<E> implements Cloneable {

    /* JADX INFO: renamed from: a */
    @un8
    public /* synthetic */ boolean f62764a;

    /* JADX INFO: renamed from: b */
    @un8
    public /* synthetic */ int[] f62765b;

    /* JADX INFO: renamed from: c */
    @un8
    public /* synthetic */ Object[] f62766c;

    /* JADX INFO: renamed from: d */
    @un8
    public /* synthetic */ int f62767d;

    @yn8
    public mxf() {
        this(0, 1, null);
    }

    public void append(int i, E e) {
        int i2 = this.f62767d;
        if (i2 != 0 && i <= this.f62765b[i2 - 1]) {
            put(i, e);
            return;
        }
        if (this.f62764a && i2 >= this.f62765b.length) {
            nxf.m18191gc(this);
        }
        int i3 = this.f62767d;
        if (i3 >= this.f62765b.length) {
            int iIdealIntArraySize = cv2.idealIntArraySize(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f62765b, iIdealIntArraySize);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f62765b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f62766c, iIdealIntArraySize);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f62766c = objArrCopyOf;
        }
        this.f62765b[i3] = i;
        this.f62766c[i3] = e;
        this.f62767d = i3 + 1;
    }

    public void clear() {
        int i = this.f62767d;
        Object[] objArr = this.f62766c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f62767d = 0;
        this.f62764a = false;
    }

    public boolean containsKey(int i) {
        return indexOfKey(i) >= 0;
    }

    public boolean containsValue(E e) {
        if (this.f62764a) {
            nxf.m18191gc(this);
        }
        int i = this.f62767d;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (this.f62766c[i2] == e) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    @q64(message = "Alias for remove(int).", replaceWith = @i2e(expression = "remove(key)", imports = {}))
    public void delete(int i) {
        remove(i);
    }

    @gib
    public E get(int i) {
        return (E) nxf.commonGet(this, i);
    }

    @xn8(name = "getIsEmpty")
    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public int indexOfKey(int i) {
        if (this.f62764a) {
            nxf.m18191gc(this);
        }
        return cv2.binarySearch(this.f62765b, this.f62767d, i);
    }

    public int indexOfValue(E e) {
        if (this.f62764a) {
            nxf.m18191gc(this);
        }
        int i = this.f62767d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f62766c[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i) {
        if (this.f62764a) {
            nxf.m18191gc(this);
        }
        return this.f62765b[i];
    }

    public void put(int i, E e) {
        int iBinarySearch = cv2.binarySearch(this.f62765b, this.f62767d, i);
        if (iBinarySearch >= 0) {
            this.f62766c[iBinarySearch] = e;
            return;
        }
        int i2 = ~iBinarySearch;
        if (i2 < this.f62767d && this.f62766c[i2] == nxf.f65980a) {
            this.f62765b[i2] = i;
            this.f62766c[i2] = e;
            return;
        }
        if (this.f62764a && this.f62767d >= this.f62765b.length) {
            nxf.m18191gc(this);
            i2 = ~cv2.binarySearch(this.f62765b, this.f62767d, i);
        }
        int i3 = this.f62767d;
        if (i3 >= this.f62765b.length) {
            int iIdealIntArraySize = cv2.idealIntArraySize(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.f62765b, iIdealIntArraySize);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f62765b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f62766c, iIdealIntArraySize);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f62766c = objArrCopyOf;
        }
        int i4 = this.f62767d;
        if (i4 - i2 != 0) {
            int[] iArr = this.f62765b;
            int i5 = i2 + 1;
            u70.copyInto(iArr, iArr, i5, i2, i4);
            Object[] objArr = this.f62766c;
            u70.copyInto(objArr, objArr, i5, i2, this.f62767d);
        }
        this.f62765b[i2] = i;
        this.f62766c[i2] = e;
        this.f62767d++;
    }

    public void putAll(@yfb mxf<? extends E> mxfVar) {
        md8.checkNotNullParameter(mxfVar, "other");
        int size = mxfVar.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = mxfVar.keyAt(i);
            E eValueAt = mxfVar.valueAt(i);
            int iBinarySearch = cv2.binarySearch(this.f62765b, this.f62767d, iKeyAt);
            if (iBinarySearch >= 0) {
                this.f62766c[iBinarySearch] = eValueAt;
            } else {
                int i2 = ~iBinarySearch;
                if (i2 >= this.f62767d || this.f62766c[i2] != nxf.f65980a) {
                    if (this.f62764a && this.f62767d >= this.f62765b.length) {
                        nxf.m18191gc(this);
                        i2 = ~cv2.binarySearch(this.f62765b, this.f62767d, iKeyAt);
                    }
                    int i3 = this.f62767d;
                    if (i3 >= this.f62765b.length) {
                        int iIdealIntArraySize = cv2.idealIntArraySize(i3 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.f62765b, iIdealIntArraySize);
                        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        this.f62765b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.f62766c, iIdealIntArraySize);
                        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        this.f62766c = objArrCopyOf;
                    }
                    int i4 = this.f62767d;
                    if (i4 - i2 != 0) {
                        int[] iArr = this.f62765b;
                        int i5 = i2 + 1;
                        u70.copyInto(iArr, iArr, i5, i2, i4);
                        Object[] objArr = this.f62766c;
                        u70.copyInto(objArr, objArr, i5, i2, this.f62767d);
                    }
                    this.f62765b[i2] = iKeyAt;
                    this.f62766c[i2] = eValueAt;
                    this.f62767d++;
                } else {
                    this.f62765b[i2] = iKeyAt;
                    this.f62766c[i2] = eValueAt;
                }
            }
        }
    }

    @gib
    public E putIfAbsent(int i, E e) {
        E e2 = (E) nxf.commonGet(this, i);
        if (e2 == null) {
            int iBinarySearch = cv2.binarySearch(this.f62765b, this.f62767d, i);
            if (iBinarySearch >= 0) {
                this.f62766c[iBinarySearch] = e;
            } else {
                int i2 = ~iBinarySearch;
                if (i2 >= this.f62767d || this.f62766c[i2] != nxf.f65980a) {
                    if (this.f62764a && this.f62767d >= this.f62765b.length) {
                        nxf.m18191gc(this);
                        i2 = ~cv2.binarySearch(this.f62765b, this.f62767d, i);
                    }
                    int i3 = this.f62767d;
                    if (i3 >= this.f62765b.length) {
                        int iIdealIntArraySize = cv2.idealIntArraySize(i3 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.f62765b, iIdealIntArraySize);
                        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        this.f62765b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.f62766c, iIdealIntArraySize);
                        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        this.f62766c = objArrCopyOf;
                    }
                    int i4 = this.f62767d;
                    if (i4 - i2 != 0) {
                        int[] iArr = this.f62765b;
                        int i5 = i2 + 1;
                        u70.copyInto(iArr, iArr, i5, i2, i4);
                        Object[] objArr = this.f62766c;
                        u70.copyInto(objArr, objArr, i5, i2, this.f62767d);
                    }
                    this.f62765b[i2] = i;
                    this.f62766c[i2] = e;
                    this.f62767d++;
                } else {
                    this.f62765b[i2] = i;
                    this.f62766c[i2] = e;
                }
            }
        }
        return e2;
    }

    public void remove(int i) {
        nxf.commonRemove(this, i);
    }

    public void removeAt(int i) {
        if (this.f62766c[i] != nxf.f65980a) {
            this.f62766c[i] = nxf.f65980a;
            this.f62764a = true;
        }
    }

    public void removeAtRange(int i, int i2) {
        int iMin = Math.min(i2, i + i2);
        while (i < iMin) {
            removeAt(i);
            i++;
        }
    }

    @gib
    public E replace(int i, E e) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.f62766c;
        E e2 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e2;
    }

    public void setValueAt(int i, E e) {
        if (this.f62764a) {
            nxf.m18191gc(this);
        }
        this.f62766c[i] = e;
    }

    public int size() {
        if (this.f62764a) {
            nxf.m18191gc(this);
        }
        return this.f62767d;
    }

    @yfb
    public String toString() {
        if (size() <= 0) {
            return isa.f48126c;
        }
        StringBuilder sb = new StringBuilder(this.f62767d * 28);
        sb.append('{');
        int i = this.f62767d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
            sb.append('=');
            E eValueAt = valueAt(i2);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    public E valueAt(int i) {
        if (this.f62764a) {
            nxf.m18191gc(this);
        }
        return (E) this.f62766c[i];
    }

    @yn8
    public mxf(int i) {
        if (i == 0) {
            this.f62765b = cv2.f27723a;
            this.f62766c = cv2.f27725c;
        } else {
            int iIdealIntArraySize = cv2.idealIntArraySize(i);
            this.f62765b = new int[iIdealIntArraySize];
            this.f62766c = new Object[iIdealIntArraySize];
        }
    }

    @yfb
    public mxf<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        md8.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        mxf<E> mxfVar = (mxf) objClone;
        mxfVar.f62765b = (int[]) this.f62765b.clone();
        mxfVar.f62766c = (Object[]) this.f62766c.clone();
        return mxfVar;
    }

    public E get(int i, E e) {
        return (E) nxf.commonGet(this, i, e);
    }

    public boolean remove(int i, @gib Object obj) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey < 0 || !md8.areEqual(obj, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public boolean replace(int i, E e, E e2) {
        int iIndexOfKey = indexOfKey(i);
        if (iIndexOfKey < 0 || !md8.areEqual(this.f62766c[iIndexOfKey], e)) {
            return false;
        }
        this.f62766c[iIndexOfKey] = e2;
        return true;
    }

    public /* synthetic */ mxf(int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? 10 : i);
    }
}
