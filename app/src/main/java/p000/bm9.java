package p000;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLongSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,606:1\n256#1,6:607\n256#1,6:613\n328#1,18:619\n328#1,18:637\n328#1,18:655\n328#1,18:673\n328#1,18:691\n328#1,18:709\n328#1,18:727\n328#1,18:745\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n243#1:607,6\n248#1:613,6\n360#1:619,18\n410#1:637,18\n425#1:655,18\n437#1:673,18\n451#1:691,18\n459#1:709,18\n467#1:727,18\n505#1:745,18\n*E\n"})
public final class bm9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Object f14137a = new Object();

    /* JADX INFO: renamed from: bm9$a */
    public static final class C1946a extends gl9 {

        /* JADX INFO: renamed from: a */
        public int f14138a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zl9<T> f14139b;

        public C1946a(zl9<T> zl9Var) {
            this.f14139b = zl9Var;
        }

        public final int getIndex() {
            return this.f14138a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14138a < this.f14139b.size();
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
        @Override // p000.gl9
        public long nextLong() {
            zl9<T> zl9Var = this.f14139b;
            int i = this.f14138a;
            this.f14138a = i + 1;
            return zl9Var.keyAt(i);
        }

        public final void setIndex(int i) {
            this.f14138a = i;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: bm9$b */
    public static final class C1947b<T> implements Iterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public int f14140a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ zl9<T> f14141b;

        public C1947b(zl9<T> zl9Var) {
            this.f14141b = zl9Var;
        }

        public final int getIndex() {
            return this.f14140a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14140a < this.f14141b.size();
        }

        @Override // java.util.Iterator
        public T next() {
            zl9<T> zl9Var = this.f14141b;
            int i = this.f14140a;
            this.f14140a = i + 1;
            return zl9Var.valueAt(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setIndex(int i) {
            this.f14140a = i;
        }
    }

    public static final <E> void commonAppend(@yfb zl9<E> zl9Var, long j, E e) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int i = zl9Var.f105415d;
        if (i != 0 && j <= zl9Var.f105413b[i - 1]) {
            zl9Var.put(j, e);
            return;
        }
        if (zl9Var.f105412a) {
            long[] jArr = zl9Var.f105413b;
            if (i >= jArr.length) {
                Object[] objArr = zl9Var.f105414c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != f14137a) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                zl9Var.f105412a = false;
                zl9Var.f105415d = i2;
            }
        }
        int i4 = zl9Var.f105415d;
        if (i4 >= zl9Var.f105413b.length) {
            int iIdealLongArraySize = cv2.idealLongArraySize(i4 + 1);
            long[] jArrCopyOf = Arrays.copyOf(zl9Var.f105413b, iIdealLongArraySize);
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            zl9Var.f105413b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(zl9Var.f105414c, iIdealLongArraySize);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            zl9Var.f105414c = objArrCopyOf;
        }
        zl9Var.f105413b[i4] = j;
        zl9Var.f105414c[i4] = e;
        zl9Var.f105415d = i4 + 1;
    }

    public static final <E> void commonClear(@yfb zl9<E> zl9Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int i = zl9Var.f105415d;
        Object[] objArr = zl9Var.f105414c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        zl9Var.f105415d = 0;
        zl9Var.f105412a = false;
    }

    public static final <E> boolean commonContainsKey(@yfb zl9<E> zl9Var, long j) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        return zl9Var.indexOfKey(j) >= 0;
    }

    public static final <E> boolean commonContainsValue(@yfb zl9<E> zl9Var, E e) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        return zl9Var.indexOfValue(e) >= 0;
    }

    public static final <E> void commonGc(@yfb zl9<E> zl9Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int i = zl9Var.f105415d;
        long[] jArr = zl9Var.f105413b;
        Object[] objArr = zl9Var.f105414c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f14137a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        zl9Var.f105412a = false;
        zl9Var.f105415d = i2;
    }

    @gib
    public static final <E> E commonGet(@yfb zl9<E> zl9Var, long j) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int iBinarySearch = cv2.binarySearch(zl9Var.f105413b, zl9Var.f105415d, j);
        if (iBinarySearch < 0 || zl9Var.f105414c[iBinarySearch] == f14137a) {
            return null;
        }
        return (E) zl9Var.f105414c[iBinarySearch];
    }

    public static final <T extends E, E> T commonGetInternal(@yfb zl9<E> zl9Var, long j, T t) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int iBinarySearch = cv2.binarySearch(zl9Var.f105413b, zl9Var.f105415d, j);
        return (iBinarySearch < 0 || zl9Var.f105414c[iBinarySearch] == f14137a) ? t : (T) zl9Var.f105414c[iBinarySearch];
    }

    public static final <E> int commonIndexOfKey(@yfb zl9<E> zl9Var, long j) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        if (zl9Var.f105412a) {
            int i = zl9Var.f105415d;
            long[] jArr = zl9Var.f105413b;
            Object[] objArr = zl9Var.f105414c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != f14137a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            zl9Var.f105412a = false;
            zl9Var.f105415d = i2;
        }
        return cv2.binarySearch(zl9Var.f105413b, zl9Var.f105415d, j);
    }

    public static final <E> int commonIndexOfValue(@yfb zl9<E> zl9Var, E e) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        if (zl9Var.f105412a) {
            int i = zl9Var.f105415d;
            long[] jArr = zl9Var.f105413b;
            Object[] objArr = zl9Var.f105414c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != f14137a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            zl9Var.f105412a = false;
            zl9Var.f105415d = i2;
        }
        int i4 = zl9Var.f105415d;
        for (int i5 = 0; i5 < i4; i5++) {
            if (zl9Var.f105414c[i5] == e) {
                return i5;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@yfb zl9<E> zl9Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        return zl9Var.size() == 0;
    }

    public static final <E> long commonKeyAt(@yfb zl9<E> zl9Var, int i) {
        int i2;
        md8.checkNotNullParameter(zl9Var, "<this>");
        if (i < 0 || i >= (i2 = zl9Var.f105415d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (zl9Var.f105412a) {
            long[] jArr = zl9Var.f105413b;
            Object[] objArr = zl9Var.f105414c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != f14137a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            zl9Var.f105412a = false;
            zl9Var.f105415d = i3;
        }
        return zl9Var.f105413b[i];
    }

    public static final <E> void commonPut(@yfb zl9<E> zl9Var, long j, E e) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int iBinarySearch = cv2.binarySearch(zl9Var.f105413b, zl9Var.f105415d, j);
        if (iBinarySearch >= 0) {
            zl9Var.f105414c[iBinarySearch] = e;
            return;
        }
        int i = ~iBinarySearch;
        if (i < zl9Var.f105415d && zl9Var.f105414c[i] == f14137a) {
            zl9Var.f105413b[i] = j;
            zl9Var.f105414c[i] = e;
            return;
        }
        if (zl9Var.f105412a) {
            int i2 = zl9Var.f105415d;
            long[] jArr = zl9Var.f105413b;
            if (i2 >= jArr.length) {
                Object[] objArr = zl9Var.f105414c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != f14137a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                zl9Var.f105412a = false;
                zl9Var.f105415d = i3;
                i = ~cv2.binarySearch(zl9Var.f105413b, i3, j);
            }
        }
        int i5 = zl9Var.f105415d;
        if (i5 >= zl9Var.f105413b.length) {
            int iIdealLongArraySize = cv2.idealLongArraySize(i5 + 1);
            long[] jArrCopyOf = Arrays.copyOf(zl9Var.f105413b, iIdealLongArraySize);
            md8.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            zl9Var.f105413b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(zl9Var.f105414c, iIdealLongArraySize);
            md8.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            zl9Var.f105414c = objArrCopyOf;
        }
        int i6 = zl9Var.f105415d;
        if (i6 - i != 0) {
            long[] jArr2 = zl9Var.f105413b;
            int i7 = i + 1;
            u70.copyInto(jArr2, jArr2, i7, i, i6);
            Object[] objArr2 = zl9Var.f105414c;
            u70.copyInto(objArr2, objArr2, i7, i, zl9Var.f105415d);
        }
        zl9Var.f105413b[i] = j;
        zl9Var.f105414c[i] = e;
        zl9Var.f105415d++;
    }

    public static final <E> void commonPutAll(@yfb zl9<E> zl9Var, @yfb zl9<? extends E> zl9Var2) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        md8.checkNotNullParameter(zl9Var2, "other");
        int size = zl9Var2.size();
        for (int i = 0; i < size; i++) {
            zl9Var.put(zl9Var2.keyAt(i), zl9Var2.valueAt(i));
        }
    }

    @gib
    public static final <E> E commonPutIfAbsent(@yfb zl9<E> zl9Var, long j, E e) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        E e2 = zl9Var.get(j);
        if (e2 == null) {
            zl9Var.put(j, e);
        }
        return e2;
    }

    public static final <E> void commonRemove(@yfb zl9<E> zl9Var, long j) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int iBinarySearch = cv2.binarySearch(zl9Var.f105413b, zl9Var.f105415d, j);
        if (iBinarySearch < 0 || zl9Var.f105414c[iBinarySearch] == f14137a) {
            return;
        }
        zl9Var.f105414c[iBinarySearch] = f14137a;
        zl9Var.f105412a = true;
    }

    public static final <E> void commonRemoveAt(@yfb zl9<E> zl9Var, int i) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        if (zl9Var.f105414c[i] != f14137a) {
            zl9Var.f105414c[i] = f14137a;
            zl9Var.f105412a = true;
        }
    }

    @gib
    public static final <E> E commonReplace(@yfb zl9<E> zl9Var, long j, E e) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int iIndexOfKey = zl9Var.indexOfKey(j);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = zl9Var.f105414c;
        E e2 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e;
        return e2;
    }

    public static final <E> void commonSetValueAt(@yfb zl9<E> zl9Var, int i, E e) {
        int i2;
        md8.checkNotNullParameter(zl9Var, "<this>");
        if (i < 0 || i >= (i2 = zl9Var.f105415d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (zl9Var.f105412a) {
            long[] jArr = zl9Var.f105413b;
            Object[] objArr = zl9Var.f105414c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != f14137a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            zl9Var.f105412a = false;
            zl9Var.f105415d = i3;
        }
        zl9Var.f105414c[i] = e;
    }

    public static final <E> int commonSize(@yfb zl9<E> zl9Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        if (zl9Var.f105412a) {
            int i = zl9Var.f105415d;
            long[] jArr = zl9Var.f105413b;
            Object[] objArr = zl9Var.f105414c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != f14137a) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            zl9Var.f105412a = false;
            zl9Var.f105415d = i2;
        }
        return zl9Var.f105415d;
    }

    @yfb
    public static final <E> String commonToString(@yfb zl9<E> zl9Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        if (zl9Var.size() <= 0) {
            return isa.f48126c;
        }
        StringBuilder sb = new StringBuilder(zl9Var.f105415d * 28);
        sb.append('{');
        int i = zl9Var.f105415d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(zl9Var.keyAt(i2));
            sb.append('=');
            E eValueAt = zl9Var.valueAt(i2);
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

    public static final <E> E commonValueAt(@yfb zl9<E> zl9Var, int i) {
        int i2;
        md8.checkNotNullParameter(zl9Var, "<this>");
        if (i < 0 || i >= (i2 = zl9Var.f105415d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i).toString());
        }
        if (zl9Var.f105412a) {
            long[] jArr = zl9Var.f105413b;
            Object[] objArr = zl9Var.f105414c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != f14137a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            zl9Var.f105412a = false;
            zl9Var.f105415d = i3;
        }
        return (E) zl9Var.f105414c[i];
    }

    public static final <T> boolean contains(@yfb zl9<T> zl9Var, long j) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        return zl9Var.containsKey(j);
    }

    public static final <T> void forEach(@yfb zl9<T> zl9Var, @yfb gz6<? super Long, ? super T, bth> gz6Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        md8.checkNotNullParameter(gz6Var, "action");
        int size = zl9Var.size();
        for (int i = 0; i < size; i++) {
            gz6Var.invoke(Long.valueOf(zl9Var.keyAt(i)), zl9Var.valueAt(i));
        }
    }

    public static final <T> T getOrDefault(@yfb zl9<T> zl9Var, long j, T t) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        return zl9Var.get(j, t);
    }

    public static final <T> T getOrElse(@yfb zl9<T> zl9Var, long j, @yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        md8.checkNotNullParameter(ny6Var, "defaultValue");
        T t = zl9Var.get(j);
        return t == null ? ny6Var.invoke() : t;
    }

    public static final <T> int getSize(@yfb zl9<T> zl9Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        return zl9Var.size();
    }

    public static /* synthetic */ void getSize$annotations(zl9 zl9Var) {
    }

    public static final <T> boolean isNotEmpty(@yfb zl9<T> zl9Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        return !zl9Var.isEmpty();
    }

    @yfb
    public static final <T> gl9 keyIterator(@yfb zl9<T> zl9Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        return new C1946a(zl9Var);
    }

    @yfb
    public static final <T> zl9<T> plus(@yfb zl9<T> zl9Var, @yfb zl9<T> zl9Var2) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        md8.checkNotNullParameter(zl9Var2, "other");
        zl9<T> zl9Var3 = new zl9<>(zl9Var.size() + zl9Var2.size());
        zl9Var3.putAll(zl9Var);
        zl9Var3.putAll(zl9Var2);
        return zl9Var3;
    }

    @q64(level = u64.f86867c, message = "Replaced with member function. Remove extension import!")
    public static final /* synthetic */ boolean remove(zl9 zl9Var, long j, Object obj) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        return zl9Var.remove(j, obj);
    }

    public static final <T> void set(@yfb zl9<T> zl9Var, long j, T t) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        zl9Var.put(j, t);
    }

    @yfb
    public static final <T> Iterator<T> valueIterator(@yfb zl9<T> zl9Var) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        return new C1947b(zl9Var);
    }

    public static final <E> E commonGet(@yfb zl9<E> zl9Var, long j, E e) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int iBinarySearch = cv2.binarySearch(zl9Var.f105413b, zl9Var.f105415d, j);
        return (iBinarySearch < 0 || zl9Var.f105414c[iBinarySearch] == f14137a) ? e : (E) zl9Var.f105414c[iBinarySearch];
    }

    public static final <E> boolean commonReplace(@yfb zl9<E> zl9Var, long j, E e, E e2) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int iIndexOfKey = zl9Var.indexOfKey(j);
        if (iIndexOfKey < 0 || !md8.areEqual(zl9Var.f105414c[iIndexOfKey], e)) {
            return false;
        }
        zl9Var.f105414c[iIndexOfKey] = e2;
        return true;
    }

    public static final <E> boolean commonRemove(@yfb zl9<E> zl9Var, long j, E e) {
        md8.checkNotNullParameter(zl9Var, "<this>");
        int iIndexOfKey = zl9Var.indexOfKey(j);
        if (iIndexOfKey < 0 || !md8.areEqual(e, zl9Var.valueAt(iIndexOfKey))) {
            return false;
        }
        zl9Var.removeAt(iIndexOfKey);
        return true;
    }
}
