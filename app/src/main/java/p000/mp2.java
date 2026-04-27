package p000;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000.b1f;
import p000.d4b;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
@yg8
public final class mp2<E> extends AbstractC4593d3<E> implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c */
    public final transient ConcurrentMap<E, AtomicInteger> f61676c;

    /* JADX INFO: renamed from: mp2$a */
    public class C9447a extends jt6<E> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Set f61677a;

        public C9447a(final mp2 this$0, final Set val$delegate) {
            this.f61677a = val$delegate;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean contains(@wx1 Object object) {
            return object != null && h82.m12263d(this.f61677a, object);
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return m16323e(collection);
        }

        @Override // p000.jt6, p000.lr6, p000.zs6
        /* JADX INFO: renamed from: m */
        public Set<E> mo8967m() {
            return this.f61677a;
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean remove(@wx1 Object object) {
            return object != null && h82.m12264e(this.f61677a, object);
        }

        @Override // p000.lr6, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> c) {
            return mo14281h(c);
        }
    }

    /* JADX INFO: renamed from: mp2$b */
    public class C9448b extends AbstractC0012a2<d4b.InterfaceC4612a<E>> {

        /* JADX INFO: renamed from: c */
        public final Iterator<Map.Entry<E, AtomicInteger>> f61678c;

        public C9448b() {
            this.f61678c = mp2.this.f61676c.entrySet().iterator();
        }

        @Override // p000.AbstractC0012a2
        @wx1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d4b.InterfaceC4612a<E> computeNext() {
            while (this.f61678c.hasNext()) {
                Map.Entry<E, AtomicInteger> next = this.f61678c.next();
                int i = next.getValue().get();
                if (i != 0) {
                    return e4b.immutableEntry(next.getKey(), i);
                }
            }
            return m25a();
        }
    }

    /* JADX INFO: renamed from: mp2$c */
    public class C9449c extends es6<d4b.InterfaceC4612a<E>> {

        /* JADX INFO: renamed from: a */
        @wx1
        public d4b.InterfaceC4612a<E> f61680a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterator f61681b;

        public C9449c(final Iterator val$readOnlyIterator) {
            this.f61681b = val$readOnlyIterator;
        }

        @Override // p000.es6, p000.zs6
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Iterator<d4b.InterfaceC4612a<E>> mo8967m() {
            return this.f61681b;
        }

        @Override // p000.es6, java.util.Iterator
        public void remove() {
            v7d.checkState(this.f61680a != null, "no calls to next() since the last call to remove()");
            mp2.this.setCount(this.f61680a.getElement(), 0);
            this.f61680a = null;
        }

        @Override // p000.es6, java.util.Iterator
        public d4b.InterfaceC4612a<E> next() {
            d4b.InterfaceC4612a<E> interfaceC4612a = (d4b.InterfaceC4612a) super.next();
            this.f61680a = interfaceC4612a;
            return interfaceC4612a;
        }
    }

    /* JADX INFO: renamed from: mp2$d */
    public class C9450d extends AbstractC4593d3<E>.b {
        private C9450d() {
            super();
        }

        private List<d4b.InterfaceC4612a<E>> snapshot() {
            ArrayList arrayListNewArrayListWithExpectedSize = eb9.newArrayListWithExpectedSize(size());
            wg8.addAll(arrayListNewArrayListWithExpectedSize, iterator());
            return arrayListNewArrayListWithExpectedSize;
        }

        @Override // p000.AbstractC4593d3.b, p000.e4b.AbstractC5107i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public mp2<E> mo8725a() {
            return mp2.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return snapshot().toArray();
        }

        public /* synthetic */ C9450d(mp2 mp2Var, C9447a c9447a) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) snapshot().toArray(tArr);
        }
    }

    /* JADX INFO: renamed from: mp2$e */
    public static class C9451e {

        /* JADX INFO: renamed from: a */
        public static final b1f.C1698b<mp2> f61684a = b1f.m2790a(mp2.class, "countMap");

        private C9451e() {
        }
    }

    @gdi
    public mp2(ConcurrentMap<E, AtomicInteger> countMap) {
        v7d.checkArgument(countMap.isEmpty(), "the backing map (%s) must be empty", countMap);
        this.f61676c = countMap;
    }

    public static <E> mp2<E> create() {
        return new mp2<>(new ConcurrentHashMap());
    }

    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        Object object = stream.readObject();
        Objects.requireNonNull(object);
        C9451e.f61684a.m2802b(this, (ConcurrentMap) object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<E> snapshot() {
        ArrayList arrayListNewArrayListWithExpectedSize = eb9.newArrayListWithExpectedSize(size());
        for (d4b.InterfaceC4612a interfaceC4612a : entrySet()) {
            Object element = interfaceC4612a.getElement();
            for (int count = interfaceC4612a.getCount(); count > 0; count--) {
                arrayListNewArrayListWithExpectedSize.add(element);
            }
        }
        return arrayListNewArrayListWithExpectedSize;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.f61676c);
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: a */
    public Set<E> mo8865a() {
        return new C9447a(this, this.f61676c.keySet());
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public int add(E element, int occurrences) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i;
        AtomicInteger atomicInteger;
        v7d.checkNotNull(element);
        if (occurrences == 0) {
            return count(element);
        }
        s72.m21767d(occurrences, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) tt9.m22804y(this.f61676c, element);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.f61676c.putIfAbsent(element, new AtomicInteger(occurrences))) == null) {
                return 0;
            }
            do {
                i = atomicIntegerPutIfAbsent.get();
                if (i == 0) {
                    atomicInteger = new AtomicInteger(occurrences);
                    if (this.f61676c.putIfAbsent(element, atomicInteger) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        throw new IllegalArgumentException("Overflow adding " + occurrences + " occurrences to a count of " + i);
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i, w68.checkedAdd(i, occurrences)));
            return i;
        } while (!this.f61676c.replace(element, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: b */
    public int mo2917b() {
        return this.f61676c.size();
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: c */
    public Iterator<E> mo2918c() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f61676c.clear();
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection, p000.d4b
    public /* bridge */ /* synthetic */ boolean contains(@wx1 Object element) {
        return super.contains(element);
    }

    @Override // p000.d4b
    public int count(@wx1 Object element) {
        AtomicInteger atomicInteger = (AtomicInteger) tt9.m22804y(this.f61676c, element);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // p000.AbstractC4593d3
    @Deprecated
    public Set<d4b.InterfaceC4612a<E>> createEntrySet() {
        return new C9450d(this, null);
    }

    @Override // p000.AbstractC4593d3
    /* JADX INFO: renamed from: d */
    public Iterator<d4b.InterfaceC4612a<E>> mo2919d() {
        return new C9449c(new C9448b());
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // p000.AbstractC4593d3, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f61676c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, p000.d4b
    public Iterator<E> iterator() {
        return e4b.m9662f(this);
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public int remove(@wx1 Object element, int occurrences) {
        int i;
        int iMax;
        if (occurrences == 0) {
            return count(element);
        }
        s72.m21767d(occurrences, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) tt9.m22804y(this.f61676c, element);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i = atomicInteger.get();
            if (i == 0) {
                return 0;
            }
            iMax = Math.max(0, i - occurrences);
        } while (!atomicInteger.compareAndSet(i, iMax));
        if (iMax == 0) {
            this.f61676c.remove(element, atomicInteger);
        }
        return i;
    }

    @op1
    public boolean removeExactly(@wx1 Object element, int occurrences) {
        int i;
        int i2;
        if (occurrences == 0) {
            return true;
        }
        s72.m21767d(occurrences, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) tt9.m22804y(this.f61676c, element);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i = atomicInteger.get();
            if (i < occurrences) {
                return false;
            }
            i2 = i - occurrences;
        } while (!atomicInteger.compareAndSet(i, i2));
        if (i2 == 0) {
            this.f61676c.remove(element, atomicInteger);
        }
        return true;
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public int setCount(E element, int count) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i;
        AtomicInteger atomicInteger;
        v7d.checkNotNull(element);
        s72.m21765b(count, "count");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) tt9.m22804y(this.f61676c, element);
            if (atomicIntegerPutIfAbsent == null && (count == 0 || (atomicIntegerPutIfAbsent = this.f61676c.putIfAbsent(element, new AtomicInteger(count))) == null)) {
                return 0;
            }
            do {
                i = atomicIntegerPutIfAbsent.get();
                if (i == 0) {
                    if (count != 0) {
                        atomicInteger = new AtomicInteger(count);
                        if (this.f61676c.putIfAbsent(element, atomicInteger) == null) {
                            break;
                        }
                    } else {
                        return 0;
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i, count));
            if (count == 0) {
                this.f61676c.remove(element, atomicIntegerPutIfAbsent);
            }
            return i;
        } while (!this.f61676c.replace(element, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p000.d4b
    public int size() {
        Iterator<AtomicInteger> it = this.f61676c.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) it.next().get();
        }
        return rd8.saturatedCast(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return snapshot().toArray();
    }

    public static <E> mp2<E> create(Iterable<? extends E> elements) {
        mp2<E> mp2VarCreate = create();
        vg8.addAll(mp2VarCreate, elements);
        return mp2VarCreate;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) snapshot().toArray(tArr);
    }

    public static <E> mp2<E> create(ConcurrentMap<E, AtomicInteger> countMap) {
        return new mp2<>(countMap);
    }

    @Override // p000.AbstractC4593d3, p000.d4b
    @op1
    public boolean setCount(E element, int expectedOldCount, int newCount) {
        v7d.checkNotNull(element);
        s72.m21765b(expectedOldCount, "oldCount");
        s72.m21765b(newCount, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) tt9.m22804y(this.f61676c, element);
        if (atomicInteger == null) {
            if (expectedOldCount != 0) {
                return false;
            }
            return newCount == 0 || this.f61676c.putIfAbsent(element, new AtomicInteger(newCount)) == null;
        }
        int i = atomicInteger.get();
        if (i == expectedOldCount) {
            if (i == 0) {
                if (newCount == 0) {
                    this.f61676c.remove(element, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(newCount);
                return this.f61676c.putIfAbsent(element, atomicInteger2) == null || this.f61676c.replace(element, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i, newCount)) {
                if (newCount == 0) {
                    this.f61676c.remove(element, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }
}
