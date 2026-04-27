package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class fs6<E> extends lr6<E> implements List<E> {
    @Override // java.util.List
    public void add(int index, @dgc E element) {
        mo8967m().add(index, element);
    }

    @Override // java.util.List
    @op1
    public boolean addAll(int index, Collection<? extends E> elements) {
        return mo8967m().addAll(index, elements);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@wx1 Object object) {
        return object == this || mo8967m().equals(object);
    }

    @Override // java.util.List
    @dgc
    public E get(int index) {
        return mo8967m().get(index);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return mo8967m().hashCode();
    }

    @Override // java.util.List
    public int indexOf(@wx1 Object element) {
        return mo8967m().indexOf(element);
    }

    @Override // java.util.List
    public int lastIndexOf(@wx1 Object element) {
        return mo8967m().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return mo8967m().listIterator();
    }

    @Override // p000.lr6, p000.zs6
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract List<E> mo8967m();

    /* JADX INFO: renamed from: n */
    public boolean m11131n(@dgc E element) {
        add(size(), element);
        return true;
    }

    /* JADX INFO: renamed from: o */
    public boolean m11132o(int index, Iterable<? extends E> elements) {
        return eb9.m9843a(this, index, elements);
    }

    /* JADX INFO: renamed from: p */
    public boolean m11133p(@wx1 Object object) {
        return eb9.m9846d(this, object);
    }

    /* JADX INFO: renamed from: q */
    public int m11134q() {
        return eb9.m9847e(this);
    }

    /* JADX INFO: renamed from: r */
    public int m11135r(@wx1 Object element) {
        return eb9.m9848f(this, element);
    }

    @Override // java.util.List
    @op1
    @dgc
    public E remove(int index) {
        return mo8967m().remove(index);
    }

    /* JADX INFO: renamed from: s */
    public Iterator<E> m11136s() {
        return listIterator();
    }

    @Override // java.util.List
    @op1
    @dgc
    public E set(int index, @dgc E element) {
        return mo8967m().set(index, element);
    }

    @Override // java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        return mo8967m().subList(fromIndex, toIndex);
    }

    /* JADX INFO: renamed from: t */
    public int m11137t(@wx1 Object element) {
        return eb9.m9849g(this, element);
    }

    /* JADX INFO: renamed from: u */
    public ListIterator<E> m11138u() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: v */
    public ListIterator<E> m11139v(int start) {
        return eb9.m9850h(this, start);
    }

    /* JADX INFO: renamed from: w */
    public List<E> m11140w(int fromIndex, int toIndex) {
        return eb9.m9851i(this, fromIndex, toIndex);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int index) {
        return mo8967m().listIterator(index);
    }
}
