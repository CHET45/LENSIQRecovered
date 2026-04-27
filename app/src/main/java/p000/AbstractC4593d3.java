package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p000.d4b;
import p000.e4b;

/* JADX INFO: renamed from: d3 */
/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class AbstractC4593d3<E> extends AbstractCollection<E> implements d4b<E> {

    /* JADX INFO: renamed from: a */
    @wx1
    @ez8
    public transient Set<E> f28297a;

    /* JADX INFO: renamed from: b */
    @wx1
    @ez8
    public transient Set<d4b.InterfaceC4612a<E>> f28298b;

    /* JADX INFO: renamed from: d3$a */
    public class a extends e4b.AbstractC5106h<E> {
        public a() {
        }

        @Override // p000.e4b.AbstractC5106h
        /* JADX INFO: renamed from: a */
        public d4b<E> mo8866a() {
            return AbstractC4593d3.this;
        }

        @Override // p000.e4b.AbstractC5106h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractC4593d3.this.mo2918c();
        }
    }

    /* JADX INFO: renamed from: d3$b */
    public class b extends e4b.AbstractC5107i<E> {
        public b() {
        }

        @Override // p000.e4b.AbstractC5107i
        /* JADX INFO: renamed from: a */
        public d4b<E> mo8725a() {
            return AbstractC4593d3.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<d4b.InterfaceC4612a<E>> iterator() {
            return AbstractC4593d3.this.mo2919d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC4593d3.this.mo2917b();
        }
    }

    /* JADX INFO: renamed from: a */
    public Set<E> mo8865a() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    @op1
    public final boolean add(@dgc E element) {
        add(element, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @op1
    public final boolean addAll(Collection<? extends E> elementsToAdd) {
        return e4b.m9657a(this, elementsToAdd);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo2917b();

    /* JADX INFO: renamed from: c */
    public abstract Iterator<E> mo2918c();

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    public boolean contains(@wx1 Object element) {
        return count(element) > 0;
    }

    public Set<d4b.InterfaceC4612a<E>> createEntrySet() {
        return new b();
    }

    /* JADX INFO: renamed from: d */
    public abstract Iterator<d4b.InterfaceC4612a<E>> mo2919d();

    public Set<E> elementSet() {
        Set<E> set = this.f28297a;
        if (set != null) {
            return set;
        }
        Set<E> setMo8865a = mo8865a();
        this.f28297a = setMo8865a;
        return setMo8865a;
    }

    public Set<d4b.InterfaceC4612a<E>> entrySet() {
        Set<d4b.InterfaceC4612a<E>> set = this.f28298b;
        if (set != null) {
            return set;
        }
        Set<d4b.InterfaceC4612a<E>> setCreateEntrySet = createEntrySet();
        this.f28298b = setCreateEntrySet;
        return setCreateEntrySet;
    }

    @Override // java.util.Collection, p000.d4b
    public final boolean equals(@wx1 Object object) {
        return e4b.m9660d(this, object);
    }

    @Override // java.util.Collection, p000.d4b
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    @op1
    public final boolean remove(@wx1 Object element) {
        return remove(element, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    @op1
    public final boolean removeAll(Collection<?> elementsToRemove) {
        return e4b.m9664h(this, elementsToRemove);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    @op1
    public final boolean retainAll(Collection<?> elementsToRetain) {
        return e4b.m9665i(this, elementsToRetain);
    }

    @op1
    public int setCount(@dgc E element, int count) {
        return e4b.m9666j(this, element, count);
    }

    @Override // java.util.AbstractCollection, p000.d4b
    public final String toString() {
        return entrySet().toString();
    }

    @op1
    public int add(@dgc E element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @op1
    public int remove(@wx1 Object element, int occurrences) {
        throw new UnsupportedOperationException();
    }

    @op1
    public boolean setCount(@dgc E element, int oldCount, int newCount) {
        return e4b.m9667k(this, element, oldCount, newCount);
    }
}
