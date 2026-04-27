package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ruh extends AbstractList<String> implements e39, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final e39 f79700a;

    /* JADX INFO: renamed from: ruh$a */
    public class C12308a implements ListIterator<String> {

        /* JADX INFO: renamed from: a */
        public ListIterator<String> f79701a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f79702b;

        public C12308a(final int val$index) {
            this.f79702b = val$index;
            this.f79701a = ruh.this.f79700a.listIterator(val$index);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f79701a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f79701a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f79701a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f79701a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void add(String o) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public String next() {
            return this.f79701a.next();
        }

        @Override // java.util.ListIterator
        public String previous() {
            return this.f79701a.previous();
        }

        @Override // java.util.ListIterator
        public void set(String o) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ruh$b */
    public class C12309b implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public Iterator<String> f79704a;

        public C12309b() {
            this.f79704a = ruh.this.f79700a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f79704a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public String next() {
            return this.f79704a.next();
        }
    }

    public ruh(e39 list) {
        this.f79700a = list;
    }

    @Override // p000.e39
    public void add(vj1 element) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.e39
    public boolean addAllByteArray(Collection<byte[]> element) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.e39
    public boolean addAllByteString(Collection<? extends vj1> element) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.e39
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.f79700a.asByteArrayList());
    }

    @Override // p000.vhd
    public List<vj1> asByteStringList() {
        return Collections.unmodifiableList(this.f79700a.asByteStringList());
    }

    @Override // p000.e39
    public byte[] getByteArray(int index) {
        return this.f79700a.getByteArray(index);
    }

    @Override // p000.e39
    public vj1 getByteString(int index) {
        return this.f79700a.getByteString(index);
    }

    @Override // p000.e39
    public Object getRaw(int index) {
        return this.f79700a.getRaw(index);
    }

    @Override // p000.e39
    public List<?> getUnderlyingElements() {
        return this.f79700a.getUnderlyingElements();
    }

    @Override // p000.e39
    public e39 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C12309b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(final int index) {
        return new C12308a(index);
    }

    @Override // p000.e39
    public void mergeFrom(e39 other) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.e39
    public void set(int index, vj1 element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f79700a.size();
    }

    @Override // p000.e39
    public void add(byte[] element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int index) {
        return this.f79700a.get(index);
    }

    @Override // p000.e39
    public void set(int index, byte[] element) {
        throw new UnsupportedOperationException();
    }
}
