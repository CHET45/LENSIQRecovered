package p000;

import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public final class xva<E> extends AbstractQueue<E> {

    /* JADX INFO: renamed from: C */
    public static final int f99446C = -1431655766;

    /* JADX INFO: renamed from: F */
    public static final int f99447F = 11;

    /* JADX INFO: renamed from: m */
    public static final int f99448m = 1431655765;

    /* JADX INFO: renamed from: a */
    public final xva<E>.C15312c f99449a;

    /* JADX INFO: renamed from: b */
    public final xva<E>.C15312c f99450b;

    /* JADX INFO: renamed from: c */
    @gdi
    public final int f99451c;

    /* JADX INFO: renamed from: d */
    public Object[] f99452d;

    /* JADX INFO: renamed from: e */
    public int f99453e;

    /* JADX INFO: renamed from: f */
    public int f99454f;

    /* JADX INFO: renamed from: xva$b */
    public static final class C15311b<B> {

        /* JADX INFO: renamed from: d */
        public static final int f99455d = -1;

        /* JADX INFO: renamed from: a */
        public final Comparator<B> f99456a;

        /* JADX INFO: renamed from: b */
        public int f99457b;

        /* JADX INFO: renamed from: c */
        public int f99458c;

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> s7c<T> ordering() {
            return s7c.from(this.f99456a);
        }

        public <T extends B> xva<T> create() {
            return create(Collections.emptySet());
        }

        @op1
        public C15311b<B> expectedSize(int expectedSize) {
            v7d.checkArgument(expectedSize >= 0);
            this.f99457b = expectedSize;
            return this;
        }

        @op1
        public C15311b<B> maximumSize(int maximumSize) {
            v7d.checkArgument(maximumSize > 0);
            this.f99458c = maximumSize;
            return this;
        }

        private C15311b(Comparator<B> comparator) {
            this.f99457b = -1;
            this.f99458c = Integer.MAX_VALUE;
            this.f99456a = (Comparator) v7d.checkNotNull(comparator);
        }

        public <T extends B> xva<T> create(Iterable<? extends T> initialContents) {
            xva<T> xvaVar = new xva<>(this, xva.m25477f(this.f99457b, this.f99458c, initialContents));
            Iterator<? extends T> it = initialContents.iterator();
            while (it.hasNext()) {
                xvaVar.offer(it.next());
            }
            return xvaVar;
        }
    }

    /* JADX INFO: renamed from: xva$c */
    public class C15312c {

        /* JADX INFO: renamed from: a */
        public final s7c<E> f99459a;

        /* JADX INFO: renamed from: b */
        @Weak
        public xva<E>.C15312c f99460b;

        public C15312c(s7c<E> ordering) {
            this.f99459a = ordering;
        }

        private int getGrandparentIndex(int i) {
            return getParentIndex(getParentIndex(i));
        }

        private int getLeftChildIndex(int i) {
            return (i * 2) + 1;
        }

        private int getParentIndex(int i) {
            return (i - 1) / 2;
        }

        private int getRightChildIndex(int i) {
            return (i * 2) + 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean verifyIndex(int i) {
            if (getLeftChildIndex(i) < xva.this.f99453e && m25488d(i, getLeftChildIndex(i)) > 0) {
                return false;
            }
            if (getRightChildIndex(i) < xva.this.f99453e && m25488d(i, getRightChildIndex(i)) > 0) {
                return false;
            }
            if (i <= 0 || m25488d(i, getParentIndex(i)) <= 0) {
                return i <= 2 || m25488d(getGrandparentIndex(i), i) <= 0;
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public void m25486b(int index, E x) {
            C15312c c15312c;
            int iM25490f = m25490f(index, x);
            if (iM25490f == index) {
                iM25490f = index;
                c15312c = this;
            } else {
                c15312c = this.f99460b;
            }
            c15312c.m25487c(iM25490f, x);
        }

        @op1
        /* JADX INFO: renamed from: c */
        public int m25487c(int i, E e) {
            while (i > 2) {
                int grandparentIndex = getGrandparentIndex(i);
                Object objM25480e = xva.this.m25480e(grandparentIndex);
                if (this.f99459a.compare((E) objM25480e, e) <= 0) {
                    break;
                }
                xva.this.f99452d[i] = objM25480e;
                i = grandparentIndex;
            }
            xva.this.f99452d[i] = e;
            return i;
        }

        /* JADX INFO: renamed from: d */
        public int m25488d(int i, int i2) {
            return this.f99459a.compare((E) xva.this.m25480e(i), (E) xva.this.m25480e(i2));
        }

        /* JADX INFO: renamed from: e */
        public int m25489e(int i, E e) {
            int iM25493i = m25493i(i);
            if (iM25493i <= 0 || this.f99459a.compare((E) xva.this.m25480e(iM25493i), e) >= 0) {
                return m25490f(i, e);
            }
            xva.this.f99452d[i] = xva.this.m25480e(iM25493i);
            xva.this.f99452d[iM25493i] = e;
            return iM25493i;
        }

        /* JADX INFO: renamed from: f */
        public int m25490f(int i, E e) {
            int rightChildIndex;
            if (i == 0) {
                xva.this.f99452d[0] = e;
                return 0;
            }
            int parentIndex = getParentIndex(i);
            Object objM25480e = xva.this.m25480e(parentIndex);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= xva.this.f99453e) {
                Object objM25480e2 = xva.this.m25480e(rightChildIndex);
                if (this.f99459a.compare((E) objM25480e2, (E) objM25480e) < 0) {
                    parentIndex = rightChildIndex;
                    objM25480e = objM25480e2;
                }
            }
            if (this.f99459a.compare((E) objM25480e, e) >= 0) {
                xva.this.f99452d[i] = e;
                return i;
            }
            xva.this.f99452d[i] = objM25480e;
            xva.this.f99452d[parentIndex] = e;
            return parentIndex;
        }

        /* JADX INFO: renamed from: g */
        public int m25491g(int index) {
            while (true) {
                int iM25494j = m25494j(index);
                if (iM25494j <= 0) {
                    return index;
                }
                xva.this.f99452d[index] = xva.this.m25480e(iM25494j);
                index = iM25494j;
            }
        }

        /* JADX INFO: renamed from: h */
        public int m25492h(int index, int len) {
            if (index >= xva.this.f99453e) {
                return -1;
            }
            v7d.checkState(index > 0);
            int iMin = Math.min(index, xva.this.f99453e - len) + len;
            for (int i = index + 1; i < iMin; i++) {
                if (m25488d(i, index) < 0) {
                    index = i;
                }
            }
            return index;
        }

        /* JADX INFO: renamed from: i */
        public int m25493i(int index) {
            return m25492h(getLeftChildIndex(index), 2);
        }

        /* JADX INFO: renamed from: j */
        public int m25494j(int index) {
            int leftChildIndex = getLeftChildIndex(index);
            if (leftChildIndex < 0) {
                return -1;
            }
            return m25492h(getLeftChildIndex(leftChildIndex), 4);
        }

        /* JADX INFO: renamed from: k */
        public int m25495k(E e) {
            int rightChildIndex;
            int parentIndex = getParentIndex(xva.this.f99453e);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= xva.this.f99453e) {
                Object objM25480e = xva.this.m25480e(rightChildIndex);
                if (this.f99459a.compare((E) objM25480e, e) < 0) {
                    xva.this.f99452d[rightChildIndex] = e;
                    xva.this.f99452d[xva.this.f99453e] = objM25480e;
                    return rightChildIndex;
                }
            }
            return xva.this.f99453e;
        }

        @wx1
        /* JADX INFO: renamed from: l */
        public C15313d<E> m25496l(int removeIndex, int vacated, E toTrickle) {
            int iM25489e = m25489e(vacated, toTrickle);
            if (iM25489e == vacated) {
                return null;
            }
            Object objM25480e = iM25489e < removeIndex ? xva.this.m25480e(removeIndex) : xva.this.m25480e(getParentIndex(removeIndex));
            if (this.f99460b.m25487c(iM25489e, toTrickle) < removeIndex) {
                return new C15313d<>(toTrickle, objM25480e);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: xva$d */
    public static class C15313d<E> {

        /* JADX INFO: renamed from: a */
        public final E f99462a;

        /* JADX INFO: renamed from: b */
        public final E f99463b;

        public C15313d(E toTrickle, E replaced) {
            this.f99462a = toTrickle;
            this.f99463b = replaced;
        }
    }

    /* JADX INFO: renamed from: xva$e */
    public class C15314e implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        public int f99465a;

        /* JADX INFO: renamed from: b */
        public int f99466b;

        /* JADX INFO: renamed from: c */
        public int f99467c;

        /* JADX INFO: renamed from: d */
        @wx1
        public Queue<E> f99468d;

        /* JADX INFO: renamed from: e */
        @wx1
        public List<E> f99469e;

        /* JADX INFO: renamed from: f */
        @wx1
        public E f99470f;

        /* JADX INFO: renamed from: m */
        public boolean f99471m;

        private C15314e() {
            this.f99465a = -1;
            this.f99466b = -1;
            this.f99467c = xva.this.f99454f;
        }

        private void checkModCount() {
            if (xva.this.f99454f != this.f99467c) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean foundAndRemovedExactReference(Iterable<E> elements, E target) {
            Iterator<E> it = elements.iterator();
            while (it.hasNext()) {
                if (it.next() == target) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void nextNotInSkipMe(int c) {
            if (this.f99466b < c) {
                if (this.f99469e != null) {
                    while (c < xva.this.size() && foundAndRemovedExactReference(this.f99469e, xva.this.m25480e(c))) {
                        c++;
                    }
                }
                this.f99466b = c;
            }
        }

        private boolean removeExact(Object target) {
            for (int i = 0; i < xva.this.f99453e; i++) {
                if (xva.this.f99452d[i] == target) {
                    xva.this.m25482i(i);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            checkModCount();
            nextNotInSkipMe(this.f99465a + 1);
            if (this.f99466b < xva.this.size()) {
                return true;
            }
            Queue<E> queue = this.f99468d;
            return (queue == null || queue.isEmpty()) ? false : true;
        }

        @Override // java.util.Iterator
        public E next() {
            checkModCount();
            nextNotInSkipMe(this.f99465a + 1);
            if (this.f99466b < xva.this.size()) {
                int i = this.f99466b;
                this.f99465a = i;
                this.f99471m = true;
                return (E) xva.this.m25480e(i);
            }
            if (this.f99468d != null) {
                this.f99465a = xva.this.size();
                E ePoll = this.f99468d.poll();
                this.f99470f = ePoll;
                if (ePoll != null) {
                    this.f99471m = true;
                    return ePoll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public void remove() {
            s72.m21768e(this.f99471m);
            checkModCount();
            this.f99471m = false;
            this.f99467c++;
            if (this.f99465a >= xva.this.size()) {
                E e = this.f99470f;
                Objects.requireNonNull(e);
                v7d.checkState(removeExact(e));
                this.f99470f = null;
                return;
            }
            C15313d<E> c15313dM25482i = xva.this.m25482i(this.f99465a);
            if (c15313dM25482i != null) {
                if (this.f99468d == null || this.f99469e == null) {
                    this.f99468d = new ArrayDeque();
                    this.f99469e = new ArrayList(3);
                }
                if (!foundAndRemovedExactReference(this.f99469e, c15313dM25482i.f99462a)) {
                    this.f99468d.add(c15313dM25482i.f99462a);
                }
                if (!foundAndRemovedExactReference(this.f99468d, c15313dM25482i.f99463b)) {
                    this.f99469e.add(c15313dM25482i.f99463b);
                }
            }
            this.f99465a--;
            this.f99466b--;
        }
    }

    private int calculateNewCapacity() {
        int length = this.f99452d.length;
        return capAtMaximumSize(length < 64 ? (length + 1) * 2 : w68.checkedMultiply(length / 2, 3), this.f99451c);
    }

    private static int capAtMaximumSize(int queueSize, int maximumSize) {
        return Math.min(queueSize - 1, maximumSize) + 1;
    }

    public static <E extends Comparable<E>> xva<E> create() {
        return new C15311b(s7c.natural()).create();
    }

    public static C15311b<Comparable> expectedSize(int expectedSize) {
        return new C15311b(s7c.natural()).expectedSize(expectedSize);
    }

    @gdi
    /* JADX INFO: renamed from: f */
    public static int m25477f(int configuredExpectedSize, int maximumSize, Iterable<?> initialContents) {
        if (configuredExpectedSize == -1) {
            configuredExpectedSize = 11;
        }
        if (initialContents instanceof Collection) {
            configuredExpectedSize = Math.max(configuredExpectedSize, ((Collection) initialContents).size());
        }
        return capAtMaximumSize(configuredExpectedSize, maximumSize);
    }

    @wx1
    private C15313d<E> fillHole(int index, E toTrickle) {
        xva<E>.C15312c c15312cHeapForIndex = heapForIndex(index);
        int iM25491g = c15312cHeapForIndex.m25491g(index);
        int iM25487c = c15312cHeapForIndex.m25487c(iM25491g, toTrickle);
        if (iM25487c == iM25491g) {
            return c15312cHeapForIndex.m25496l(index, iM25491g, toTrickle);
        }
        if (iM25487c < index) {
            return new C15313d<>(toTrickle, m25480e(index));
        }
        return null;
    }

    @gdi
    /* JADX INFO: renamed from: g */
    public static boolean m25478g(int index) {
        int i = ~(~(index + 1));
        v7d.checkState(i > 0, "negative index");
        return (1431655765 & i) > (i & f99446C);
    }

    private int getMaxElementIndex() {
        int i = this.f99453e;
        if (i != 1) {
            return (i == 2 || this.f99450b.m25488d(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void growIfNeeded() {
        if (this.f99453e > this.f99452d.length) {
            Object[] objArr = new Object[calculateNewCapacity()];
            Object[] objArr2 = this.f99452d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f99452d = objArr;
        }
    }

    private xva<E>.C15312c heapForIndex(int i) {
        return m25478g(i) ? this.f99449a : this.f99450b;
    }

    public static C15311b<Comparable> maximumSize(int maximumSize) {
        return new C15311b(s7c.natural()).maximumSize(maximumSize);
    }

    public static <B> C15311b<B> orderedBy(Comparator<B> comparator) {
        return new C15311b<>(comparator);
    }

    private E removeAndGet(int index) {
        E eM25480e = m25480e(index);
        m25482i(index);
        return eM25480e;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @op1
    public boolean add(E element) {
        offer(element);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @op1
    public boolean addAll(Collection<? extends E> newElements) {
        Iterator<? extends E> it = newElements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            offer(it.next());
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i = 0; i < this.f99453e; i++) {
            this.f99452d[i] = null;
        }
        this.f99453e = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f99449a.f99459a;
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public int m25479d() {
        return this.f99452d.length;
    }

    /* JADX INFO: renamed from: e */
    public E m25480e(int i) {
        E e = (E) this.f99452d[i];
        Objects.requireNonNull(e);
        return e;
    }

    @gdi
    /* JADX INFO: renamed from: h */
    public boolean m25481h() {
        for (int i = 1; i < this.f99453e; i++) {
            if (!heapForIndex(i).verifyIndex(i)) {
                return false;
            }
        }
        return true;
    }

    @wx1
    @gdi
    @op1
    /* JADX INFO: renamed from: i */
    public C15313d<E> m25482i(int index) {
        v7d.checkPositionIndex(index, this.f99453e);
        this.f99454f++;
        int i = this.f99453e - 1;
        this.f99453e = i;
        if (i == index) {
            this.f99452d[i] = null;
            return null;
        }
        E eM25480e = m25480e(i);
        int iM25495k = heapForIndex(this.f99453e).m25495k(eM25480e);
        if (iM25495k == index) {
            this.f99452d[this.f99453e] = null;
            return null;
        }
        E eM25480e2 = m25480e(this.f99453e);
        this.f99452d[this.f99453e] = null;
        C15313d<E> c15313dFillHole = fillHole(index, eM25480e2);
        return iM25495k < index ? c15313dFillHole == null ? new C15313d<>(eM25480e, eM25480e2) : new C15313d<>(eM25480e, c15313dFillHole.f99463b) : c15313dFillHole;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new C15314e();
    }

    @Override // java.util.Queue
    @op1
    public boolean offer(E element) {
        v7d.checkNotNull(element);
        this.f99454f++;
        int i = this.f99453e;
        this.f99453e = i + 1;
        growIfNeeded();
        heapForIndex(i).m25486b(i, element);
        return this.f99453e <= this.f99451c || pollLast() != element;
    }

    @Override // java.util.Queue
    @wx1
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return m25480e(0);
    }

    @wx1
    public E peekFirst() {
        return peek();
    }

    @wx1
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return m25480e(getMaxElementIndex());
    }

    @Override // java.util.Queue
    @op1
    @wx1
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(0);
    }

    @op1
    @wx1
    public E pollFirst() {
        return poll();
    }

    @op1
    @wx1
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(getMaxElementIndex());
    }

    @op1
    public E removeFirst() {
        return remove();
    }

    @op1
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return removeAndGet(getMaxElementIndex());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f99453e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @yg8
    public Object[] toArray() {
        int i = this.f99453e;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f99452d, 0, objArr, 0, i);
        return objArr;
    }

    private xva(C15311b<? super E> builder, int queueSize) {
        s7c s7cVarOrdering = builder.ordering();
        xva<E>.C15312c c15312c = new C15312c(s7cVarOrdering);
        this.f99449a = c15312c;
        xva<E>.C15312c c15312c2 = new C15312c(s7cVarOrdering.reverse());
        this.f99450b = c15312c2;
        c15312c.f99460b = c15312c2;
        c15312c2.f99460b = c15312c;
        this.f99451c = builder.f99458c;
        this.f99452d = new Object[queueSize];
    }

    public static <E extends Comparable<E>> xva<E> create(Iterable<? extends E> initialContents) {
        return new C15311b(s7c.natural()).create(initialContents);
    }
}
