package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
public final class nxf {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Object f65980a = new Object();

    public static final <E> void commonAppend(@yfb mxf<E> mxfVar, int i, E e) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        int i2 = mxfVar.f62767d;
        if (i2 != 0 && i <= mxfVar.f62765b[i2 - 1]) {
            mxfVar.put(i, e);
            return;
        }
        if (mxfVar.f62764a && i2 >= mxfVar.f62765b.length) {
            m18191gc(mxfVar);
        }
        int i3 = mxfVar.f62767d;
        if (i3 >= mxfVar.f62765b.length) {
            int iIdealIntArraySize = cv2.idealIntArraySize(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(mxfVar.f62765b, iIdealIntArraySize);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            mxfVar.f62765b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(mxfVar.f62766c, iIdealIntArraySize);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            mxfVar.f62766c = objArrCopyOf;
        }
        mxfVar.f62765b[i3] = i;
        mxfVar.f62766c[i3] = e;
        mxfVar.f62767d = i3 + 1;
    }

    public static final <E> void commonClear(@yfb mxf<E> mxfVar) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        int i = mxfVar.f62767d;
        Object[] objArr = mxfVar.f62766c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        mxfVar.f62767d = 0;
        mxfVar.f62764a = false;
    }

    public static final <E> boolean commonContainsKey(@yfb mxf<E> mxfVar, int i) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        return mxfVar.indexOfKey(i) >= 0;
    }

    public static final <E> boolean commonContainsValue(@yfb mxf<E> mxfVar, E e) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        if (mxfVar.f62764a) {
            m18191gc(mxfVar);
        }
        int i = mxfVar.f62767d;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                i2 = -1;
                break;
            }
            if (mxfVar.f62766c[i2] == e) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    @gib
    public static final <E> E commonGet(@yfb mxf<E> mxfVar, int i) {
        E e;
        md8.checkNotNullParameter(mxfVar, "<this>");
        int iBinarySearch = cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, i);
        if (iBinarySearch < 0 || (e = (E) mxfVar.f62766c[iBinarySearch]) == f65980a) {
            return null;
        }
        return e;
    }

    public static final <E> int commonIndexOfKey(@yfb mxf<E> mxfVar, int i) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        if (mxfVar.f62764a) {
            m18191gc(mxfVar);
        }
        return cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, i);
    }

    public static final <E> int commonIndexOfValue(@yfb mxf<E> mxfVar, E e) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        if (mxfVar.f62764a) {
            m18191gc(mxfVar);
        }
        int i = mxfVar.f62767d;
        for (int i2 = 0; i2 < i; i2++) {
            if (mxfVar.f62766c[i2] == e) {
                return i2;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@yfb mxf<E> mxfVar) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        return mxfVar.size() == 0;
    }

    public static final <E> int commonKeyAt(@yfb mxf<E> mxfVar, int i) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        if (mxfVar.f62764a) {
            m18191gc(mxfVar);
        }
        return mxfVar.f62765b[i];
    }

    public static final <E> void commonPut(@yfb mxf<E> mxfVar, int i, E e) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        int iBinarySearch = cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, i);
        if (iBinarySearch >= 0) {
            mxfVar.f62766c[iBinarySearch] = e;
            return;
        }
        int i2 = ~iBinarySearch;
        if (i2 < mxfVar.f62767d && mxfVar.f62766c[i2] == f65980a) {
            mxfVar.f62765b[i2] = i;
            mxfVar.f62766c[i2] = e;
            return;
        }
        if (mxfVar.f62764a && mxfVar.f62767d >= mxfVar.f62765b.length) {
            m18191gc(mxfVar);
            i2 = ~cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, i);
        }
        int i3 = mxfVar.f62767d;
        if (i3 >= mxfVar.f62765b.length) {
            int iIdealIntArraySize = cv2.idealIntArraySize(i3 + 1);
            int[] iArrCopyOf = Arrays.copyOf(mxfVar.f62765b, iIdealIntArraySize);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            mxfVar.f62765b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(mxfVar.f62766c, iIdealIntArraySize);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            mxfVar.f62766c = objArrCopyOf;
        }
        int i4 = mxfVar.f62767d;
        if (i4 - i2 != 0) {
            int[] iArr = mxfVar.f62765b;
            int i5 = i2 + 1;
            u70.copyInto(iArr, iArr, i5, i2, i4);
            Object[] objArr = mxfVar.f62766c;
            u70.copyInto(objArr, objArr, i5, i2, mxfVar.f62767d);
        }
        mxfVar.f62765b[i2] = i;
        mxfVar.f62766c[i2] = e;
        mxfVar.f62767d++;
    }

    public static final <E> void commonPutAll(@yfb mxf<E> mxfVar, @yfb mxf<? extends E> mxfVar2) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        md8.checkNotNullParameter(mxfVar2, "other");
        int size = mxfVar2.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = mxfVar2.keyAt(i);
            E eValueAt = mxfVar2.valueAt(i);
            int iBinarySearch = cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, iKeyAt);
            if (iBinarySearch >= 0) {
                mxfVar.f62766c[iBinarySearch] = eValueAt;
            } else {
                int i2 = ~iBinarySearch;
                if (i2 >= mxfVar.f62767d || mxfVar.f62766c[i2] != f65980a) {
                    if (mxfVar.f62764a && mxfVar.f62767d >= mxfVar.f62765b.length) {
                        m18191gc(mxfVar);
                        i2 = ~cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, iKeyAt);
                    }
                    int i3 = mxfVar.f62767d;
                    if (i3 >= mxfVar.f62765b.length) {
                        int iIdealIntArraySize = cv2.idealIntArraySize(i3 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(mxfVar.f62765b, iIdealIntArraySize);
                        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        mxfVar.f62765b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(mxfVar.f62766c, iIdealIntArraySize);
                        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        mxfVar.f62766c = objArrCopyOf;
                    }
                    int i4 = mxfVar.f62767d;
                    if (i4 - i2 != 0) {
                        int[] iArr = mxfVar.f62765b;
                        int i5 = i2 + 1;
                        u70.copyInto(iArr, iArr, i5, i2, i4);
                        Object[] objArr = mxfVar.f62766c;
                        u70.copyInto(objArr, objArr, i5, i2, mxfVar.f62767d);
                    }
                    mxfVar.f62765b[i2] = iKeyAt;
                    mxfVar.f62766c[i2] = eValueAt;
                    mxfVar.f62767d++;
                } else {
                    mxfVar.f62765b[i2] = iKeyAt;
                    mxfVar.f62766c[i2] = eValueAt;
                }
            }
        }
    }

    @gib
    public static final <E> E commonPutIfAbsent(@yfb mxf<E> mxfVar, int i, E e) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        E e2 = (E) commonGet(mxfVar, i);
        if (e2 == null) {
            int iBinarySearch = cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, i);
            if (iBinarySearch >= 0) {
                mxfVar.f62766c[iBinarySearch] = e;
            } else {
                int i2 = ~iBinarySearch;
                if (i2 >= mxfVar.f62767d || mxfVar.f62766c[i2] != f65980a) {
                    if (mxfVar.f62764a && mxfVar.f62767d >= mxfVar.f62765b.length) {
                        m18191gc(mxfVar);
                        i2 = ~cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, i);
                    }
                    int i3 = mxfVar.f62767d;
                    if (i3 >= mxfVar.f62765b.length) {
                        int iIdealIntArraySize = cv2.idealIntArraySize(i3 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(mxfVar.f62765b, iIdealIntArraySize);
                        md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        mxfVar.f62765b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(mxfVar.f62766c, iIdealIntArraySize);
                        md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        mxfVar.f62766c = objArrCopyOf;
                    }
                    int i4 = mxfVar.f62767d;
                    if (i4 - i2 != 0) {
                        int[] iArr = mxfVar.f62765b;
                        int i5 = i2 + 1;
                        u70.copyInto(iArr, iArr, i5, i2, i4);
                        Object[] objArr = mxfVar.f62766c;
                        u70.copyInto(objArr, objArr, i5, i2, mxfVar.f62767d);
                    }
                    mxfVar.f62765b[i2] = i;
                    mxfVar.f62766c[i2] = e;
                    mxfVar.f62767d++;
                } else {
                    mxfVar.f62765b[i2] = i;
                    mxfVar.f62766c[i2] = e;
                }
            }
        }
        return e2;
    }

    public static final <E> void commonRemove(@yfb mxf<E> mxfVar, int i) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        int iBinarySearch = cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, i);
        if (iBinarySearch >= 0) {
            Object[] objArr = mxfVar.f62766c;
            Object obj = objArr[iBinarySearch];
            Object obj2 = f65980a;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                mxfVar.f62764a = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(@yfb mxf<E> mxfVar, int i) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        if (mxfVar.f62766c[i] != f65980a) {
            mxfVar.f62766c[i] = f65980a;
            mxfVar.f62764a = true;
        }
    }

    public static final <E> void commonRemoveAtRange(@yfb mxf<E> mxfVar, int i, int i2) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        int iMin = Math.min(i2, i + i2);
        while (i < iMin) {
            mxfVar.removeAt(i);
            i++;
        }
    }

    @gib
    public static final <E> E commonReplace(@yfb mxf<E> mxfVar, int i, E e) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        int iIndexOfKey = mxfVar.indexOfKey(i);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = mxfVar.f62766c;
        E e2 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e2;
    }

    public static final <E> void commonSetValueAt(@yfb mxf<E> mxfVar, int i, E e) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        if (mxfVar.f62764a) {
            m18191gc(mxfVar);
        }
        mxfVar.f62766c[i] = e;
    }

    public static final <E> int commonSize(@yfb mxf<E> mxfVar) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        if (mxfVar.f62764a) {
            m18191gc(mxfVar);
        }
        return mxfVar.f62767d;
    }

    @yfb
    public static final <E> String commonToString(@yfb mxf<E> mxfVar) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        if (mxfVar.size() <= 0) {
            return isa.f48126c;
        }
        StringBuilder sb = new StringBuilder(mxfVar.f62767d * 28);
        sb.append('{');
        int i = mxfVar.f62767d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(mxfVar.keyAt(i2));
            sb.append('=');
            E eValueAt = mxfVar.valueAt(i2);
            if (eValueAt != mxfVar) {
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

    public static final <E> E commonValueAt(@yfb mxf<E> mxfVar, int i) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        if (mxfVar.f62764a) {
            m18191gc(mxfVar);
        }
        return (E) mxfVar.f62766c[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: gc */
    public static final <E> void m18191gc(mxf<E> mxfVar) {
        int i = mxfVar.f62767d;
        int[] iArr = mxfVar.f62765b;
        Object[] objArr = mxfVar.f62766c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f65980a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        mxfVar.f62764a = false;
        mxfVar.f62767d = i2;
    }

    private static final <E, T extends E> T internalGet(mxf<E> mxfVar, int i, T t) {
        T t2;
        int iBinarySearch = cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, i);
        return (iBinarySearch < 0 || (t2 = (T) mxfVar.f62766c[iBinarySearch]) == f65980a) ? t : t2;
    }

    public static final <E> E commonGet(@yfb mxf<E> mxfVar, int i, E e) {
        E e2;
        md8.checkNotNullParameter(mxfVar, "<this>");
        int iBinarySearch = cv2.binarySearch(mxfVar.f62765b, mxfVar.f62767d, i);
        return (iBinarySearch < 0 || (e2 = (E) mxfVar.f62766c[iBinarySearch]) == f65980a) ? e : e2;
    }

    public static final <E> boolean commonReplace(@yfb mxf<E> mxfVar, int i, E e, E e2) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        int iIndexOfKey = mxfVar.indexOfKey(i);
        if (iIndexOfKey < 0 || !md8.areEqual(mxfVar.f62766c[iIndexOfKey], e)) {
            return false;
        }
        mxfVar.f62766c[iIndexOfKey] = e2;
        return true;
    }

    public static final <E> boolean commonRemove(@yfb mxf<E> mxfVar, int i, @gib Object obj) {
        md8.checkNotNullParameter(mxfVar, "<this>");
        int iIndexOfKey = mxfVar.indexOfKey(i);
        if (iIndexOfKey < 0 || !md8.areEqual(obj, mxfVar.valueAt(iIndexOfKey))) {
            return false;
        }
        mxfVar.removeAt(iIndexOfKey);
        return true;
    }
}
