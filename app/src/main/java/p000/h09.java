package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
@ah5
@e0g(parameters = 0)
public final class h09 implements List<InterfaceC6669a>, uo8 {

    /* JADX INFO: renamed from: b */
    public static final int f41927b = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<InterfaceC6669a> f41928a;

    /* JADX INFO: renamed from: h09$a */
    @ah5
    public interface InterfaceC6669a {
        int getIndex();

        @gib
        Object getKey();
    }

    private h09(List<InterfaceC6669a> list) {
        this.f41928a = list;
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, InterfaceC6669a interfaceC6669a) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends InterfaceC6669a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@yfb InterfaceC6669a interfaceC6669a) {
        return this.f41928a.contains(interfaceC6669a);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        return this.f41928a.containsAll(collection);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    @yfb
    public InterfaceC6669a get(int i) {
        return this.f41928a.get(i);
    }

    public int getSize() {
        return this.f41928a.size();
    }

    public int indexOf(@yfb InterfaceC6669a interfaceC6669a) {
        return this.f41928a.indexOf(interfaceC6669a);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f41928a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<InterfaceC6669a> iterator() {
        return this.f41928a.iterator();
    }

    public int lastIndexOf(@yfb InterfaceC6669a interfaceC6669a) {
        return this.f41928a.lastIndexOf(interfaceC6669a);
    }

    @Override // java.util.List
    @yfb
    public ListIterator<InterfaceC6669a> listIterator() {
        return this.f41928a.listIterator();
    }

    public final void pin$foundation_release(@yfb InterfaceC6669a interfaceC6669a) {
        this.f41928a.add(interfaceC6669a);
    }

    public final void release$foundation_release(@yfb InterfaceC6669a interfaceC6669a) {
        this.f41928a.remove(interfaceC6669a);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public InterfaceC6669a remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<InterfaceC6669a> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public InterfaceC6669a set2(int i, InterfaceC6669a interfaceC6669a) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super InterfaceC6669a> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @yfb
    public List<InterfaceC6669a> subList(int i, int i2) {
        return this.f41928a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, InterfaceC6669a interfaceC6669a) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends InterfaceC6669a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC6669a) {
            return contains((InterfaceC6669a) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC6669a) {
            return indexOf((InterfaceC6669a) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC6669a) {
            return lastIndexOf((InterfaceC6669a) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @yfb
    public ListIterator<InterfaceC6669a> listIterator(int i) {
        return this.f41928a.listIterator(i);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC6669a remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC6669a set(int i, InterfaceC6669a interfaceC6669a) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) f82.toArray(this, tArr);
    }

    public h09() {
        this(new ytf());
    }

    public boolean add(InterfaceC6669a interfaceC6669a) {
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
