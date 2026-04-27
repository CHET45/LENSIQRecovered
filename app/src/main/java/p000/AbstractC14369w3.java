package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p000.v98;

/* JADX INFO: renamed from: w3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14369w3<E> extends AbstractList<E> implements v98.InterfaceC13956l<E> {

    /* JADX INFO: renamed from: b */
    public static final int f93143b = 10;

    /* JADX INFO: renamed from: a */
    public boolean f93144a;

    public AbstractC14369w3() {
        this(true);
    }

    /* JADX INFO: renamed from: a */
    public void m24324a() {
        if (!this.f93144a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m24324a();
        return super.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> c) {
        m24324a();
        return super.addAll(c);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m24324a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        if (!(o instanceof RandomAccess)) {
            return super.equals(o);
        }
        List list = (List) o;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public boolean isModifiable() {
        return this.f93144a;
    }

    @Override // p000.v98.InterfaceC13956l
    public final void makeImmutable() {
        if (this.f93144a) {
            this.f93144a = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        m24324a();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> c) {
        m24324a();
        return super.removeAll(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> c) {
        m24324a();
        return super.retainAll(c);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m24324a();
        return (E) super.set(i, e);
    }

    public AbstractC14369w3(boolean isMutable) {
        this.f93144a = isMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        m24324a();
        super.add(index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> c) {
        m24324a();
        return super.addAll(index, c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object o) {
        m24324a();
        int iIndexOf = indexOf(o);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
