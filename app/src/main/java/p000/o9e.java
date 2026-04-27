package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes7.dex */
public final class o9e<T> extends AbstractC5568f3<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<T> f66943a;

    /* JADX INFO: renamed from: o9e$a */
    public static final class C10273a implements ListIterator<T>, zo8 {

        /* JADX INFO: renamed from: a */
        public final ListIterator<T> f66944a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ o9e<T> f66945b;

        public C10273a(o9e<T> o9eVar, int i) {
            this.f66945b = o9eVar;
            this.f66944a = o9eVar.f66943a.listIterator(r82.reversePositionIndex$CollectionsKt__ReversedViewsKt(o9eVar, i));
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.f66944a.add(t);
            this.f66944a.previous();
        }

        public final ListIterator<T> getDelegateIterator() {
            return this.f66944a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f66944a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f66944a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f66944a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return r82.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.f66945b, this.f66944a.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f66944a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return r82.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.f66945b, this.f66944a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f66944a.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.f66944a.set(t);
        }
    }

    public o9e(@yfb List<T> list) {
        md8.checkNotNullParameter(list, "delegate");
        this.f66943a = list;
    }

    @Override // p000.AbstractC5568f3, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        this.f66943a.add(r82.reversePositionIndex$CollectionsKt__ReversedViewsKt(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f66943a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.f66943a.get(r82.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i));
    }

    @Override // p000.AbstractC5568f3
    public int getSize() {
        return this.f66943a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @yfb
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @yfb
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC5568f3
    public T removeAt(int i) {
        return this.f66943a.remove(r82.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i));
    }

    @Override // p000.AbstractC5568f3, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        return this.f66943a.set(r82.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.List
    @yfb
    public ListIterator<T> listIterator(int i) {
        return new C10273a(this, i);
    }
}
