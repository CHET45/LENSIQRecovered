package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes7.dex */
@x0f(with = ek8.class)
public final class ck8 extends sk8 implements List<sk8>, uo8 {

    @yfb
    public static final C2345a Companion = new C2345a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<sk8> f16822a;

    /* JADX INFO: renamed from: ck8$a */
    public static final class C2345a {
        private C2345a() {
        }

        @yfb
        public final lp8<ck8> serializer() {
            return ek8.f33245a;
        }

        public /* synthetic */ C2345a(jt3 jt3Var) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ck8(@yfb List<? extends sk8> list) {
        super(null);
        md8.checkNotNullParameter(list, "content");
        this.f16822a = list;
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i, sk8 sk8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends sk8> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "element");
        return this.f16822a.contains(sk8Var);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@yfb Collection<? extends Object> collection) {
        md8.checkNotNullParameter(collection, "elements");
        return this.f16822a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@gib Object obj) {
        return md8.areEqual(this.f16822a, obj);
    }

    @Override // java.util.List
    @yfb
    public sk8 get(int i) {
        return this.f16822a.get(i);
    }

    public int getSize() {
        return this.f16822a.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f16822a.hashCode();
    }

    public int indexOf(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "element");
        return this.f16822a.indexOf(sk8Var);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f16822a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @yfb
    public Iterator<sk8> iterator() {
        return this.f16822a.iterator();
    }

    public int lastIndexOf(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "element");
        return this.f16822a.lastIndexOf(sk8Var);
    }

    @Override // java.util.List
    @yfb
    public ListIterator<sk8> listIterator() {
        return this.f16822a.listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: remove, reason: avoid collision after fix types in other method */
    public sk8 remove2(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<sk8> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public sk8 set2(int i, sk8 sk8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(Comparator<? super sk8> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @yfb
    public List<sk8> subList(int i, int i2) {
        return this.f16822a.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return f82.toArray(this);
    }

    @yfb
    public String toString() {
        return v82.joinToString$default(this.f16822a, ",", "[", "]", 0, null, null, 56, null);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, sk8 sk8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends sk8> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof sk8) {
            return contains((sk8) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof sk8) {
            return indexOf((sk8) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof sk8) {
            return lastIndexOf((sk8) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @yfb
    public ListIterator<sk8> listIterator(int i) {
        return this.f16822a.listIterator(i);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ sk8 remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ sk8 set(int i, sk8 sk8Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        md8.checkNotNullParameter(tArr, "array");
        return (T[]) f82.toArray(this, tArr);
    }

    public boolean add(sk8 sk8Var) {
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
