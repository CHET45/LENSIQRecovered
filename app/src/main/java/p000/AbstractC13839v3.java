package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p000.w98;

/* JADX INFO: renamed from: v3 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13839v3<E> extends AbstractList<E> implements w98.InterfaceC14504k<E> {

    /* JADX INFO: renamed from: b */
    public static final int f89808b = 10;

    /* JADX INFO: renamed from: a */
    public boolean f89809a;

    public AbstractC13839v3() {
        this(true);
    }

    /* JADX INFO: renamed from: a */
    public void m23762a() {
        if (!this.f89809a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        m23762a();
        return super.add(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> c) {
        m23762a();
        return super.addAll(c);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m23762a();
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
        return this.f89809a;
    }

    @Override // p000.w98.InterfaceC14504k
    public final void makeImmutable() {
        if (this.f89809a) {
            this.f89809a = false;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        m23762a();
        return (E) super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> c) {
        m23762a();
        return super.removeAll(c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> c) {
        m23762a();
        return super.retainAll(c);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        m23762a();
        return (E) super.set(i, e);
    }

    public AbstractC13839v3(boolean isMutable) {
        this.f89809a = isMutable;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        m23762a();
        super.add(index, element);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> c) {
        m23762a();
        return super.addAll(index, c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object o) {
        m23762a();
        int iIndexOf = indexOf(o);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
