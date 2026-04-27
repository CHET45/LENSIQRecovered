package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class suh extends AbstractList<String> implements f39, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final f39 f82933a;

    /* JADX INFO: renamed from: suh$a */
    public class C12796a implements ListIterator<String> {

        /* JADX INFO: renamed from: a */
        public ListIterator<String> f82934a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f82935b;

        public C12796a(final int val$index) {
            this.f82935b = val$index;
            this.f82934a = suh.this.f82933a.listIterator(val$index);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f82934a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f82934a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f82934a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f82934a.previousIndex();
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
            return this.f82934a.next();
        }

        @Override // java.util.ListIterator
        public String previous() {
            return this.f82934a.previous();
        }

        @Override // java.util.ListIterator
        public void set(String o) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: suh$b */
    public class C12797b implements Iterator<String> {

        /* JADX INFO: renamed from: a */
        public Iterator<String> f82937a;

        public C12797b() {
            this.f82937a = suh.this.f82933a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f82937a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public String next() {
            return this.f82937a.next();
        }
    }

    public suh(f39 list) {
        this.f82933a = list;
    }

    @Override // p000.f39
    public void add(wj1 element) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.f39
    public boolean addAllByteArray(Collection<byte[]> element) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.f39
    public boolean addAllByteString(Collection<? extends wj1> element) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.f39
    public List<byte[]> asByteArrayList() {
        return Collections.unmodifiableList(this.f82933a.asByteArrayList());
    }

    @Override // p000.whd
    public List<wj1> asByteStringList() {
        return Collections.unmodifiableList(this.f82933a.asByteStringList());
    }

    @Override // p000.f39
    public byte[] getByteArray(int index) {
        return this.f82933a.getByteArray(index);
    }

    @Override // p000.f39
    public wj1 getByteString(int index) {
        return this.f82933a.getByteString(index);
    }

    @Override // p000.f39
    public Object getRaw(int index) {
        return this.f82933a.getRaw(index);
    }

    @Override // p000.f39
    public List<?> getUnderlyingElements() {
        return this.f82933a.getUnderlyingElements();
    }

    @Override // p000.f39
    public f39 getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new C12797b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(final int index) {
        return new C12796a(index);
    }

    @Override // p000.f39
    public void mergeFrom(f39 other) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.f39
    public void set(int index, wj1 element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f82933a.size();
    }

    @Override // p000.f39
    public void add(byte[] element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int index) {
        return this.f82933a.get(index);
    }

    @Override // p000.f39
    public void set(int index, byte[] element) {
        throw new UnsupportedOperationException();
    }
}
