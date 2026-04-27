package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@vn8
@dwf({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1734#2,3:83\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n58#1:83,3\n*E\n"})
@yh5
public final class pph implements Collection<oph>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final long[] f71621a;

    /* JADX INFO: renamed from: pph$a */
    public static final class C11069a implements Iterator<oph>, uo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final long[] f71622a;

        /* JADX INFO: renamed from: b */
        public int f71623b;

        public C11069a(@yfb long[] jArr) {
            md8.checkNotNullParameter(jArr, "array");
            this.f71622a = jArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f71623b < this.f71622a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ oph next() {
            return oph.m31527boximpl(m31853nextsVKNKU());
        }

        /* JADX INFO: renamed from: next-s-VKNKU, reason: not valid java name */
        public long m31853nextsVKNKU() {
            int i = this.f71623b;
            long[] jArr = this.f71622a;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f71623b));
            }
            this.f71623b = i + 1;
            return oph.m31533constructorimpl(jArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @yjd
    private /* synthetic */ pph(long[] jArr) {
        this.f71621a = jArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ pph m31836boximpl(long[] jArr) {
        return new pph(jArr);
    }

    @yfb
    @yjd
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long[] m31838constructorimpl(@yfb long[] jArr) {
        md8.checkNotNullParameter(jArr, "storage");
        return jArr;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m31840containsAllimpl(long[] jArr, @yfb Collection<oph> collection) {
        md8.checkNotNullParameter(collection, "elements");
        Collection<oph> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof oph) || !e80.contains(jArr, ((oph) obj).m31585unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31841equalsimpl(long[] jArr, Object obj) {
        return (obj instanceof pph) && md8.areEqual(jArr, ((pph) obj).m31852unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31842equalsimpl0(long[] jArr, long[] jArr2) {
        return md8.areEqual(jArr, jArr2);
    }

    /* JADX INFO: renamed from: get-s-VKNKU, reason: not valid java name */
    public static final long m31843getsVKNKU(long[] jArr, int i) {
        return oph.m31533constructorimpl(jArr[i]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m31844getSizeimpl(long[] jArr) {
        return jArr.length;
    }

    @yjd
    public static /* synthetic */ void getStorage$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31845hashCodeimpl(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m31846isEmptyimpl(long[] jArr) {
        return jArr.length == 0;
    }

    @yfb
    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<oph> m31847iteratorimpl(long[] jArr) {
        return new C11069a(jArr);
    }

    /* JADX INFO: renamed from: set-k8EXiF4, reason: not valid java name */
    public static final void m31848setk8EXiF4(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31849toStringimpl(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(oph ophVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: add-VKZWuLQ, reason: not valid java name */
    public boolean m31850addVKZWuLQ(long j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends oph> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof oph) {
            return m31851containsVKZWuLQ(((oph) obj).m31585unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m31851containsVKZWuLQ(long j) {
        return m31839containsVKZWuLQ(this.f71621a, j);
    }

    @Override // java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        return m31840containsAllimpl(this.f71621a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m31841equalsimpl(this.f71621a, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m31844getSizeimpl(this.f71621a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m31845hashCodeimpl(this.f71621a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m31846isEmptyimpl(this.f71621a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<oph> iterator() {
        return m31847iteratorimpl(this.f71621a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    public String toString() {
        return m31849toStringimpl(this.f71621a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long[] m31852unboximpl() {
        return this.f71621a;
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long[] m31837constructorimpl(int i) {
        return m31838constructorimpl(new long[i]);
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public static boolean m31839containsVKZWuLQ(long[] jArr, long j) {
        return e80.contains(jArr, j);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        return (T[]) f82.toArray(this, tArr);
    }
}
