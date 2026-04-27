package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p000.kx7;

/* JADX INFO: loaded from: classes5.dex */
@jh4("Use ImmutableList.of or another implementation")
@gd7(emulated = true)
@tx4
public abstract class ax7<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Object[] f12099a = new Object[0];

    /* JADX INFO: renamed from: ax7$a */
    public static abstract class AbstractC1636a<E> extends AbstractC1637b<E> {

        /* JADX INFO: renamed from: b */
        public Object[] f12100b;

        /* JADX INFO: renamed from: c */
        public int f12101c;

        /* JADX INFO: renamed from: d */
        public boolean f12102d;

        public AbstractC1636a(int initialCapacity) {
            s72.m21765b(initialCapacity, "initialCapacity");
            this.f12100b = new Object[initialCapacity];
            this.f12101c = 0;
        }

        private void getReadyToExpandTo(int minCapacity) {
            Object[] objArr = this.f12100b;
            if (objArr.length < minCapacity) {
                this.f12100b = Arrays.copyOf(objArr, AbstractC1637b.m2723a(objArr.length, minCapacity));
                this.f12102d = false;
            } else if (this.f12102d) {
                this.f12100b = (Object[]) objArr.clone();
                this.f12102d = false;
            }
        }

        @Override // p000.ax7.AbstractC1637b
        @op1
        public AbstractC1637b<E> addAll(Iterable<? extends E> elements) {
            if (elements instanceof Collection) {
                Collection collection = (Collection) elements;
                getReadyToExpandTo(this.f12101c + collection.size());
                if (collection instanceof ax7) {
                    this.f12101c = ((ax7) collection).mo2718a(this.f12100b, this.f12101c);
                    return this;
                }
            }
            super.addAll(elements);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public final void m2722b(Object[] elements, int n) {
            pjb.m19533c(elements, n);
            getReadyToExpandTo(this.f12101c + n);
            System.arraycopy(elements, 0, this.f12100b, this.f12101c, n);
            this.f12101c += n;
        }

        @Override // p000.ax7.AbstractC1637b
        @op1
        public AbstractC1636a<E> add(E element) {
            v7d.checkNotNull(element);
            getReadyToExpandTo(this.f12101c + 1);
            Object[] objArr = this.f12100b;
            int i = this.f12101c;
            this.f12101c = i + 1;
            objArr[i] = element;
            return this;
        }

        @Override // p000.ax7.AbstractC1637b
        @op1
        public AbstractC1637b<E> add(E... elements) {
            m2722b(elements, elements.length);
            return this;
        }
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @op1
    /* JADX INFO: renamed from: a */
    public int mo2718a(Object[] dst, int offset) {
        quh<E> it = iterator();
        while (it.hasNext()) {
            dst[offset] = it.next();
            offset++;
        }
        return offset;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final boolean addAll(Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    public kx7<E> asList() {
        return isEmpty() ? kx7.m15110of() : kx7.m15108e(toArray());
    }

    @wx1
    /* JADX INFO: renamed from: b */
    public Object[] mo2719b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public int mo2720c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @hh4("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@wx1 Object object);

    /* JADX INFO: renamed from: d */
    public int mo2721d() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract quh<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @hh4("Always throws UnsupportedOperationException")
    @op1
    @Deprecated
    public final boolean remove(@wx1 Object object) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final boolean removeAll(Collection<?> oldElements) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    @hh4("Always throws UnsupportedOperationException")
    @op1
    public final boolean retainAll(Collection<?> elementsToKeep) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @yg8
    public final Object[] toArray() {
        return toArray(f12099a);
    }

    @yg8
    public Object writeReplace() {
        return new kx7.C8544d(toArray());
    }

    /* JADX INFO: renamed from: ax7$b */
    @jh4
    public static abstract class AbstractC1637b<E> {

        /* JADX INFO: renamed from: a */
        public static final int f12103a = 4;

        /* JADX INFO: renamed from: a */
        public static int m2723a(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = oldCapacity + (oldCapacity >> 1) + 1;
            if (iHighestOneBit < minCapacity) {
                iHighestOneBit = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @op1
        public abstract AbstractC1637b<E> add(E element);

        @op1
        public AbstractC1637b<E> add(E... elements) {
            for (E e : elements) {
                add(e);
            }
            return this;
        }

        @op1
        public AbstractC1637b<E> addAll(Iterable<? extends E> elements) {
            Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        public abstract ax7<E> build();

        @op1
        public AbstractC1637b<E> addAll(Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                add(elements.next());
            }
            return this;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @op1
    public final <T> T[] toArray(T[] tArr) {
        v7d.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrMo2719b = mo2719b();
            if (objArrMo2719b != null) {
                return (T[]) swc.m22268a(objArrMo2719b, mo2721d(), mo2720c(), tArr);
            }
            tArr = (T[]) pjb.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo2718a(tArr, 0);
        return tArr;
    }
}
