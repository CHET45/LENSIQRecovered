package p000;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes7.dex */
public class p9e<T> extends AbstractC7110i2<T> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<T> f70113a;

    /* JADX INFO: renamed from: p9e$a */
    public static final class C10864a implements ListIterator<T>, uo8 {

        /* JADX INFO: renamed from: a */
        public final ListIterator<T> f70114a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ p9e<T> f70115b;

        /* JADX WARN: Multi-variable type inference failed */
        public C10864a(p9e<? extends T> p9eVar, int i) {
            this.f70115b = p9eVar;
            this.f70114a = p9eVar.f70113a.listIterator(r82.reversePositionIndex$CollectionsKt__ReversedViewsKt(p9eVar, i));
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final ListIterator<T> getDelegateIterator() {
            return this.f70114a;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f70114a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f70114a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f70114a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return r82.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.f70115b, this.f70114a.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f70114a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return r82.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.f70115b, this.f70114a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p9e(@yfb List<? extends T> list) {
        md8.checkNotNullParameter(list, "delegate");
        this.f70113a = list;
    }

    @Override // p000.AbstractC7110i2, java.util.List
    public T get(int i) {
        return this.f70113a.get(r82.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i));
    }

    @Override // p000.AbstractC7110i2, p000.AbstractC10126o0
    public int getSize() {
        return this.f70113a.size();
    }

    @Override // p000.AbstractC7110i2, p000.AbstractC10126o0, java.util.Collection, java.lang.Iterable, java.util.Set
    @yfb
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC7110i2, java.util.List
    @yfb
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC7110i2, java.util.List
    @yfb
    public ListIterator<T> listIterator(int i) {
        return new C10864a(this, i);
    }
}
