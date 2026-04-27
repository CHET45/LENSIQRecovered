package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@vn8
@dwf({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1734#2,3:83\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n58#1:83,3\n*E\n"})
@yh5
public final class jqh implements Collection<iqh>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final short[] f51527a;

    /* JADX INFO: renamed from: jqh$a */
    public static final class C8030a implements Iterator<iqh>, uo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final short[] f51528a;

        /* JADX INFO: renamed from: b */
        public int f51529b;

        public C8030a(@yfb short[] sArr) {
            md8.checkNotNullParameter(sArr, "array");
            this.f51528a = sArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f51529b < this.f51528a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ iqh next() {
            return iqh.m30318boximpl(m30561nextMh2AYeg());
        }

        /* JADX INFO: renamed from: next-Mh2AYeg, reason: not valid java name */
        public short m30561nextMh2AYeg() {
            int i = this.f51529b;
            short[] sArr = this.f51528a;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f51529b));
            }
            this.f51529b = i + 1;
            return iqh.m30324constructorimpl(sArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @yjd
    private /* synthetic */ jqh(short[] sArr) {
        this.f51527a = sArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ jqh m30544boximpl(short[] sArr) {
        return new jqh(sArr);
    }

    @yfb
    @yjd
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short[] m30546constructorimpl(@yfb short[] sArr) {
        md8.checkNotNullParameter(sArr, "storage");
        return sArr;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m30548containsAllimpl(short[] sArr, @yfb Collection<iqh> collection) {
        md8.checkNotNullParameter(collection, "elements");
        Collection<iqh> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof iqh) || !e80.contains(sArr, ((iqh) obj).m30374unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30549equalsimpl(short[] sArr, Object obj) {
        return (obj instanceof jqh) && md8.areEqual(sArr, ((jqh) obj).m30560unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30550equalsimpl0(short[] sArr, short[] sArr2) {
        return md8.areEqual(sArr, sArr2);
    }

    /* JADX INFO: renamed from: get-Mh2AYeg, reason: not valid java name */
    public static final short m30551getMh2AYeg(short[] sArr, int i) {
        return iqh.m30324constructorimpl(sArr[i]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m30552getSizeimpl(short[] sArr) {
        return sArr.length;
    }

    @yjd
    public static /* synthetic */ void getStorage$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30553hashCodeimpl(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m30554isEmptyimpl(short[] sArr) {
        return sArr.length == 0;
    }

    @yfb
    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<iqh> m30555iteratorimpl(short[] sArr) {
        return new C8030a(sArr);
    }

    /* JADX INFO: renamed from: set-01HTLdE, reason: not valid java name */
    public static final void m30556set01HTLdE(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30557toStringimpl(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(iqh iqhVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: add-xj2QHRw, reason: not valid java name */
    public boolean m30558addxj2QHRw(short s) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends iqh> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof iqh) {
            return m30559containsxj2QHRw(((iqh) obj).m30374unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public boolean m30559containsxj2QHRw(short s) {
        return m30547containsxj2QHRw(this.f51527a, s);
    }

    @Override // java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        return m30548containsAllimpl(this.f51527a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m30549equalsimpl(this.f51527a, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m30552getSizeimpl(this.f51527a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m30553hashCodeimpl(this.f51527a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m30554isEmptyimpl(this.f51527a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<iqh> iterator() {
        return m30555iteratorimpl(this.f51527a);
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
        return m30557toStringimpl(this.f51527a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short[] m30560unboximpl() {
        return this.f51527a;
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short[] m30545constructorimpl(int i) {
        return m30546constructorimpl(new short[i]);
    }

    /* JADX INFO: renamed from: contains-xj2QHRw, reason: not valid java name */
    public static boolean m30547containsxj2QHRw(short[] sArr, short s) {
        return e80.contains(sArr, s);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        return (T[]) f82.toArray(this, tArr);
    }
}
