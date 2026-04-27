package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
@vn8
@dwf({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1734#2,3:83\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n58#1:83,3\n*E\n"})
@yh5
public final class hoh implements Collection<goh>, uo8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final byte[] f44419a;

    /* JADX INFO: renamed from: hoh$a */
    public static final class C6960a implements Iterator<goh>, uo8 {

        /* JADX INFO: renamed from: a */
        @yfb
        public final byte[] f44420a;

        /* JADX INFO: renamed from: b */
        public int f44421b;

        public C6960a(@yfb byte[] bArr) {
            md8.checkNotNullParameter(bArr, "array");
            this.f44420a = bArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f44421b < this.f44420a.length;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ goh next() {
            return goh.m29780boximpl(m30098nextw2LRezQ());
        }

        /* JADX INFO: renamed from: next-w2LRezQ, reason: not valid java name */
        public byte m30098nextw2LRezQ() {
            int i = this.f44421b;
            byte[] bArr = this.f44420a;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f44421b));
            }
            this.f44421b = i + 1;
            return goh.m29786constructorimpl(bArr[i]);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @yjd
    private /* synthetic */ hoh(byte[] bArr) {
        this.f44419a = bArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ hoh m30081boximpl(byte[] bArr) {
        return new hoh(bArr);
    }

    @yfb
    @yjd
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m30083constructorimpl(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "storage");
        return bArr;
    }

    /* JADX INFO: renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m30085containsAllimpl(byte[] bArr, @yfb Collection<goh> collection) {
        md8.checkNotNullParameter(collection, "elements");
        Collection<goh> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof goh) || !e80.contains(bArr, ((goh) obj).m29836unboximpl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30086equalsimpl(byte[] bArr, Object obj) {
        return (obj instanceof hoh) && md8.areEqual(bArr, ((hoh) obj).m30097unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30087equalsimpl0(byte[] bArr, byte[] bArr2) {
        return md8.areEqual(bArr, bArr2);
    }

    /* JADX INFO: renamed from: get-w2LRezQ, reason: not valid java name */
    public static final byte m30088getw2LRezQ(byte[] bArr, int i) {
        return goh.m29786constructorimpl(bArr[i]);
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static int m30089getSizeimpl(byte[] bArr) {
        return bArr.length;
    }

    @yjd
    public static /* synthetic */ void getStorage$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30090hashCodeimpl(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m30091isEmptyimpl(byte[] bArr) {
        return bArr.length == 0;
    }

    @yfb
    /* JADX INFO: renamed from: iterator-impl, reason: not valid java name */
    public static Iterator<goh> m30092iteratorimpl(byte[] bArr) {
        return new C6960a(bArr);
    }

    /* JADX INFO: renamed from: set-VurrAj0, reason: not valid java name */
    public static final void m30093setVurrAj0(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30094toStringimpl(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(goh gohVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: add-7apg3OU, reason: not valid java name */
    public boolean m30095add7apg3OU(byte b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends goh> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof goh) {
            return m30096contains7apg3OU(((goh) obj).m29836unboximpl());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m30096contains7apg3OU(byte b) {
        return m30084contains7apg3OU(this.f44419a, b);
    }

    @Override // java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        return m30085containsAllimpl(this.f44419a, collection);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m30086equalsimpl(this.f44419a, obj);
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m30089getSizeimpl(this.f44419a);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m30090hashCodeimpl(this.f44419a);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m30091isEmptyimpl(this.f44419a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<goh> iterator() {
        return m30092iteratorimpl(this.f44419a);
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
        return m30094toStringimpl(this.f44419a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte[] m30097unboximpl() {
        return this.f44419a;
    }

    @yfb
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte[] m30082constructorimpl(int i) {
        return m30083constructorimpl(new byte[i]);
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public static boolean m30084contains7apg3OU(byte[] bArr, byte b) {
        return e80.contains(bArr, b);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        return (T[]) f82.toArray(this, tArr);
    }
}
