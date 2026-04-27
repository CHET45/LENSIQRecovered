package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p000.kx7;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class ns1<E> extends AbstractList<List<E>> implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final transient kx7<List<E>> f65425a;

    /* JADX INFO: renamed from: b */
    public final transient int[] f65426b;

    /* JADX INFO: renamed from: ns1$a */
    public class C10033a extends kx7<E> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f65427c;

        public C10033a(final int val$index) {
            this.f65427c = val$index;
        }

        @Override // java.util.List
        public E get(int i) {
            v7d.checkElementIndex(i, size());
            return (E) ((List) ns1.this.f65425a.get(i)).get(ns1.this.getAxisIndexForProductIndex(this.f65427c, i));
        }

        @Override // p000.ax7
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return ns1.this.f65425a.size();
        }
    }

    public ns1(kx7<List<E>> axes) {
        this.f65425a = axes;
        int[] iArr = new int[axes.size() + 1];
        iArr[axes.size()] = 1;
        try {
            for (int size = axes.size() - 1; size >= 0; size--) {
                iArr[size] = w68.checkedMultiply(iArr[size + 1], axes.get(size).size());
            }
            this.f65426b = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    /* JADX INFO: renamed from: c */
    public static <E> List<List<E>> m18105c(List<? extends List<? extends E>> lists) {
        kx7.C8541a c8541a = new kx7.C8541a(lists.size());
        Iterator<? extends List<? extends E>> it = lists.iterator();
        while (it.hasNext()) {
            kx7 kx7VarCopyOf = kx7.copyOf((Collection) it.next());
            if (kx7VarCopyOf.isEmpty()) {
                return kx7.m15110of();
            }
            c8541a.add(kx7VarCopyOf);
        }
        return new ns1(c8541a.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAxisIndexForProductIndex(int index, int axis) {
        return (index / this.f65426b[axis + 1]) % this.f65425a.get(axis).size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@wx1 Object object) {
        if (!(object instanceof List)) {
            return false;
        }
        List list = (List) object;
        if (list.size() != this.f65425a.size()) {
            return false;
        }
        Iterator<E> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.f65425a.get(i).contains(it.next())) {
                return false;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@wx1 Object o) {
        if (!(o instanceof List)) {
            return -1;
        }
        List list = (List) o;
        if (list.size() != this.f65425a.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iIndexOf = this.f65425a.get(iNextIndex).indexOf(listIterator.next());
            if (iIndexOf == -1) {
                return -1;
            }
            i += iIndexOf * this.f65426b[iNextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(@wx1 Object o) {
        if (!(o instanceof List)) {
            return -1;
        }
        List list = (List) o;
        if (list.size() != this.f65425a.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iLastIndexOf = this.f65425a.get(iNextIndex).lastIndexOf(listIterator.next());
            if (iLastIndexOf == -1) {
                return -1;
            }
            i += iLastIndexOf * this.f65426b[iNextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f65426b[0];
    }

    @Override // java.util.AbstractList, java.util.List
    public kx7<E> get(int index) {
        v7d.checkElementIndex(index, size());
        return new C10033a(index);
    }
}
