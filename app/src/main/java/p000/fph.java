package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@vn8
@dwf({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1734#2,3:83\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n58#1:83,3\n*E\n"})
@yh5
public final class fph implements Collection<woh>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final int[] f37372a;

    /* JADX INFO: renamed from: fph$a */
    public static final class C5922a implements Iterator<woh>, uo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final int[] f37373a;

        /* JADX INFO: renamed from: b */
        public int f37374b;

        public C5922a(@yfb int[] iArr) {
            md8.checkNotNullParameter(iArr, "array");
            this.f37373a = iArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37374b < this.f37373a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ woh next() {
            return woh.m32998boximpl(m29600nextpVg5ArA());
        }

        /* JADX INFO: renamed from: next-pVg5ArA, reason: not valid java name */
        public int m29600nextpVg5ArA() {
            int i = this.f37374b;
            int[] iArr = this.f37373a;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f37374b));
            }
            this.f37374b = i + 1;
            return woh.m33004constructorimpl(iArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @yjd
    private /* synthetic */ fph(int[] iArr) {
        this.f37372a = iArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ fph m29583boximpl(int[] iArr) {
        return new fph(iArr);
    }

    @yfb
    @yjd
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m29585constructorimpl(@yfb int[] iArr) {
        md8.checkNotNullParameter(iArr, "storage");
        return iArr;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m29587containsAllimpl(int[] iArr, @yfb Collection<woh> collection) {
        md8.checkNotNullParameter(collection, "elements");
        Collection<woh> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof woh) || !e80.contains(iArr, ((woh) obj).m33056unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29588equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof fph) && md8.areEqual(iArr, ((fph) obj).m29599unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29589equalsimpl0(int[] iArr, int[] iArr2) {
        return md8.areEqual(iArr, iArr2);
    }

    /* JADX INFO: renamed from: get-pVg5ArA, reason: not valid java name */
    public static final int m29590getpVg5ArA(int[] iArr, int i) {
        return woh.m33004constructorimpl(iArr[i]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m29591getSizeimpl(int[] iArr) {
        return iArr.length;
    }

    @yjd
    public static /* synthetic */ void getStorage$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29592hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m29593isEmptyimpl(int[] iArr) {
        return iArr.length == 0;
    }

    @yfb
    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<woh> m29594iteratorimpl(int[] iArr) {
        return new C5922a(iArr);
    }

    /* JADX INFO: renamed from: set-VXSXFK8, reason: not valid java name */
    public static final void m29595setVXSXFK8(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29596toStringimpl(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(woh wohVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: add-WZ4Q5Ns, reason: not valid java name */
    public boolean m29597addWZ4Q5Ns(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends woh> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof woh) {
            return m29598containsWZ4Q5Ns(((woh) obj).m33056unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m29598containsWZ4Q5Ns(int i) {
        return m29586containsWZ4Q5Ns(this.f37372a, i);
    }

    @Override // java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        return m29587containsAllimpl(this.f37372a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m29588equalsimpl(this.f37372a, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m29591getSizeimpl(this.f37372a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m29592hashCodeimpl(this.f37372a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m29593isEmptyimpl(this.f37372a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<woh> iterator() {
        return m29594iteratorimpl(this.f37372a);
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
        return m29596toStringimpl(this.f37372a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m29599unboximpl() {
        return this.f37372a;
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int[] m29584constructorimpl(int i) {
        return m29585constructorimpl(new int[i]);
    }

    /* JADX INFO: renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public static boolean m29586containsWZ4Q5Ns(int[] iArr, int i) {
        return e80.contains(iArr, i);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        return (T[]) f82.toArray(this, tArr);
    }
}
