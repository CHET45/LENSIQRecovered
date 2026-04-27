package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n1#2:269\n*E\n"})
@vw7
public final class lo6 extends ks5 implements List<xn6>, uo8 {

    /* JADX INFO: renamed from: L */
    public static final int f58361L = 0;

    /* JADX INFO: renamed from: H */
    @yfb
    public final List<xn6> f58362H;

    /* JADX WARN: Multi-variable type inference failed */
    public lo6(@yfb List<? extends xn6> list) {
        super(null);
        this.f58362H = list;
        if (list.isEmpty()) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, xn6 xn6Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends xn6> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@yfb xn6 xn6Var) {
        return this.f58362H.contains(xn6Var);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        return this.f58362H.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo6) && md8.areEqual(this.f58362H, ((lo6) obj).f58362H);
    }

    @Override // java.util.List
    @yfb
    public xn6 get(int i) {
        return this.f58362H.get(i);
    }

    @yfb
    public final List<xn6> getFonts() {
        return this.f58362H;
    }

    public int getSize() {
        return this.f58362H.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f58362H.hashCode();
    }

    public int indexOf(@yfb xn6 xn6Var) {
        return this.f58362H.indexOf(xn6Var);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f58362H.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<xn6> iterator() {
        return this.f58362H.iterator();
    }

    public int lastIndexOf(@yfb xn6 xn6Var) {
        return this.f58362H.lastIndexOf(xn6Var);
    }

    @Override // java.util.List
    @yfb
    public ListIterator<xn6> listIterator() {
        return this.f58362H.listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: remove, reason: avoid collision after fix types in other method */
    public xn6 remove2(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<xn6> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public xn6 set2(int i, xn6 xn6Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super xn6> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @yfb
    public List<xn6> subList(int i, int i2) {
        return this.f58362H.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @yfb
    public String toString() {
        return "FontListFontFamily(fonts=" + this.f58362H + ')';
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, xn6 xn6Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends xn6> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof xn6) {
            return contains((xn6) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof xn6) {
            return indexOf((xn6) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof xn6) {
            return lastIndexOf((xn6) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @yfb
    public ListIterator<xn6> listIterator(int i) {
        return this.f58362H.listIterator(i);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ xn6 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ xn6 set(int i, xn6 xn6Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f82.toArray(this, tArr);
    }

    public boolean add(xn6 xn6Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
