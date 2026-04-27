package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public interface d4b<E> extends Collection<E> {

    /* JADX INFO: renamed from: d4b$a */
    public interface InterfaceC4612a<E> {
        boolean equals(@wx1 Object o);

        int getCount();

        @dgc
        E getElement();

        int hashCode();

        String toString();
    }

    @op1
    int add(@dgc E element, int occurrences);

    @op1
    boolean add(@dgc E element);

    boolean contains(@wx1 Object element);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> elements);

    int count(@wx1 @rd2(k95.f53029S4) Object element);

    Set<E> elementSet();

    Set<InterfaceC4612a<E>> entrySet();

    boolean equals(@wx1 Object object);

    int hashCode();

    Iterator<E> iterator();

    @op1
    int remove(@wx1 @rd2(k95.f53029S4) Object element, int occurrences);

    @op1
    boolean remove(@wx1 Object element);

    @op1
    boolean removeAll(Collection<?> c);

    @op1
    boolean retainAll(Collection<?> c);

    @op1
    int setCount(@dgc E element, int count);

    @op1
    boolean setCount(@dgc E element, int oldCount, int newCount);

    int size();

    String toString();
}
