package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@tx4
public final class zz4<C extends Comparable> extends yy2<C> {

    /* JADX INFO: renamed from: zz4$b */
    @jd7
    @yg8
    public static final class C16327b<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a */
        public final ke4<C> f106571a;

        private Object readResolve() {
            return new zz4(this.f106571a);
        }

        private C16327b(ke4<C> domain) {
            this.f106571a = domain;
        }
    }

    public zz4(ke4<C> domain) {
        super(domain);
    }

    @jd7
    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // p000.dy7, p000.ax7
    public kx7<C> asList() {
        return kx7.m15110of();
    }

    @Override // p000.ax7, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@wx1 Object object) {
        return false;
    }

    @Override // p000.dy7, java.util.Collection, java.util.Set
    public boolean equals(@wx1 Object object) {
        if (object instanceof Set) {
            return ((Set) object).isEmpty();
        }
        return false;
    }

    @Override // p000.dy7, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // p000.dy7
    @jd7
    /* JADX INFO: renamed from: i */
    public boolean mo9583i() {
        return true;
    }

    @Override // p000.py7
    @jd7
    public int indexOf(@wx1 Object target) {
        return -1;
    }

    @Override // p000.yy2
    public yy2<C> intersection(yy2<C> other) {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // p000.ax7
    public boolean isPartialView() {
        return false;
    }

    @Override // p000.yy2, p000.py7
    @jd7
    /* JADX INFO: renamed from: k */
    public py7<C> mo8784k() {
        return py7.m19839l(s7c.natural().reverse());
    }

    @Override // p000.yy2, p000.py7
    /* JADX INFO: renamed from: r */
    public yy2<C> mo8785m(C toElement, boolean inclusive) {
        return this;
    }

    @Override // p000.yy2
    public bpd<C> range() {
        throw new NoSuchElementException();
    }

    @Override // p000.yy2, p000.py7
    /* JADX INFO: renamed from: s */
    public yy2<C> mo8786n(C fromElement, boolean fromInclusive, C toElement, boolean toInclusive) {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // p000.yy2, p000.py7
    /* JADX INFO: renamed from: t */
    public yy2<C> mo8787o(C fromElement, boolean fromInclusive) {
        return this;
    }

    @Override // p000.yy2, java.util.AbstractCollection
    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // p000.py7, p000.dy7, p000.ax7
    @jd7
    @yg8
    public Object writeReplace() {
        return new C16327b(this.f103301C);
    }

    @Override // p000.py7, java.util.NavigableSet
    @jd7
    public quh<C> descendingIterator() {
        return wg8.m24511e();
    }

    @Override // p000.py7, java.util.SortedSet
    public C first() {
        throw new NoSuchElementException();
    }

    @Override // p000.py7, p000.dy7, p000.ax7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public quh<C> iterator() {
        return wg8.m24511e();
    }

    @Override // p000.py7, java.util.SortedSet
    public C last() {
        throw new NoSuchElementException();
    }

    @Override // p000.yy2
    public bpd<C> range(hc1 lowerBoundType, hc1 upperBoundType) {
        throw new NoSuchElementException();
    }
}
