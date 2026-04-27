package p000;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public class qc2<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: f */
    @gdi
    public static final double f73905f = 0.001d;

    /* JADX INFO: renamed from: m */
    public static final int f73906m = 9;

    /* JADX INFO: renamed from: a */
    @wx1
    public transient Object f73907a;

    /* JADX INFO: renamed from: b */
    @wx1
    public transient int[] f73908b;

    /* JADX INFO: renamed from: c */
    @gdi
    @wx1
    public transient Object[] f73909c;

    /* JADX INFO: renamed from: d */
    public transient int f73910d;

    /* JADX INFO: renamed from: e */
    public transient int f73911e;

    /* JADX INFO: renamed from: qc2$a */
    public class C11422a implements Iterator<E> {

        /* JADX INFO: renamed from: a */
        public int f73912a;

        /* JADX INFO: renamed from: b */
        public int f73913b;

        /* JADX INFO: renamed from: c */
        public int f73914c = -1;

        public C11422a() {
            this.f73912a = qc2.this.f73910d;
            this.f73913b = qc2.this.mo20227g();
        }

        private void checkForConcurrentModification() {
            if (qc2.this.f73910d != this.f73912a) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m20236a() {
            this.f73912a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f73913b >= 0;
        }

        @Override // java.util.Iterator
        @dgc
        public E next() {
            checkForConcurrentModification();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f73913b;
            this.f73914c = i;
            E e = (E) qc2.this.element(i);
            this.f73913b = qc2.this.mo20228h(this.f73913b);
            return e;
        }

        @Override // java.util.Iterator
        public void remove() {
            checkForConcurrentModification();
            s72.m21768e(this.f73914c >= 0);
            m20236a();
            qc2 qc2Var = qc2.this;
            qc2Var.remove(qc2Var.element(this.f73914c));
            this.f73913b = qc2.this.mo20223c(this.f73913b, this.f73914c);
            this.f73914c = -1;
        }
    }

    public qc2() {
        mo20230j(3);
    }

    public static <E> qc2<E> create() {
        return new qc2<>();
    }

    private Set<E> createHashFloodingResistantDelegate(int tableSize) {
        return new LinkedHashSet(tableSize, 1.0f);
    }

    public static <E> qc2<E> createWithExpectedSize(int expectedSize) {
        return new qc2<>(expectedSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E element(int i) {
        return (E) requireElements()[i];
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    private int hashTableMask() {
        return (1 << (this.f73910d & 31)) - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yg8
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int i = stream.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Invalid size: " + i);
        }
        mo20230j(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(stream.readObject());
        }
    }

    private Object[] requireElements() {
        Object[] objArr = this.f73909c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] requireEntries() {
        int[] iArr = this.f73908b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object requireTable() {
        Object obj = this.f73907a;
        Objects.requireNonNull(obj);
        return obj;
    }

    private void resizeMeMaybe(int newSize) {
        int iMin;
        int length = requireEntries().length;
        if (newSize <= length || (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        mo20235o(iMin);
    }

    @op1
    private int resizeTable(int oldMask, int newCapacity, int targetHash, int targetEntryIndex) {
        Object objM21141a = rc2.m21141a(newCapacity);
        int i = newCapacity - 1;
        if (targetEntryIndex != 0) {
            rc2.m21149i(objM21141a, targetHash & i, targetEntryIndex + 1);
        }
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        for (int i2 = 0; i2 <= oldMask; i2++) {
            int iM21148h = rc2.m21148h(objRequireTable, i2);
            while (iM21148h != 0) {
                int i3 = iM21148h - 1;
                int i4 = iArrRequireEntries[i3];
                int iM21142b = rc2.m21142b(i4, oldMask) | i2;
                int i5 = iM21142b & i;
                int iM21148h2 = rc2.m21148h(objM21141a, i5);
                rc2.m21149i(objM21141a, i5, iM21148h);
                iArrRequireEntries[i3] = rc2.m21144d(iM21142b, iM21148h2, i);
                iM21148h = rc2.m21143c(i4, oldMask);
            }
        }
        this.f73907a = objM21141a;
        setHashTableMask(i);
        return i;
    }

    private void setElement(int i, E value) {
        requireElements()[i] = value;
    }

    private void setEntry(int i, int value) {
        requireEntries()[i] = value;
    }

    private void setHashTableMask(int mask) {
        this.f73910d = rc2.m21144d(this.f73910d, 32 - Integer.numberOfLeadingZeros(mask), 31);
    }

    @yg8
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @op1
    public boolean add(@dgc E object) {
        if (m20234n()) {
            mo20224d();
        }
        Set<E> setM20226f = m20226f();
        if (setM20226f != null) {
            return setM20226f.add(object);
        }
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int i = this.f73911e;
        int i2 = i + 1;
        int iM25912d = yh7.m25912d(object);
        int iHashTableMask = hashTableMask();
        int i3 = iM25912d & iHashTableMask;
        int iM21148h = rc2.m21148h(requireTable(), i3);
        if (iM21148h != 0) {
            int iM21142b = rc2.m21142b(iM25912d, iHashTableMask);
            int i4 = 0;
            while (true) {
                int i5 = iM21148h - 1;
                int i6 = iArrRequireEntries[i5];
                if (rc2.m21142b(i6, iHashTableMask) == iM21142b && okb.equal(object, objArrRequireElements[i5])) {
                    return false;
                }
                int iM21143c = rc2.m21143c(i6, iHashTableMask);
                i4++;
                if (iM21143c != 0) {
                    iM21148h = iM21143c;
                } else {
                    if (i4 >= 9) {
                        return mo20225e().add(object);
                    }
                    if (i2 > iHashTableMask) {
                        iHashTableMask = resizeTable(iHashTableMask, rc2.m21145e(iHashTableMask), iM25912d, i);
                    } else {
                        iArrRequireEntries[i5] = rc2.m21144d(i6, i2, iHashTableMask);
                    }
                }
            }
        } else if (i2 > iHashTableMask) {
            iHashTableMask = resizeTable(iHashTableMask, rc2.m21145e(iHashTableMask), iM25912d, i);
        } else {
            rc2.m21149i(requireTable(), i3, i2);
        }
        resizeMeMaybe(i2);
        mo20231k(i, object, iM25912d, iHashTableMask);
        this.f73911e = i2;
        m20229i();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public int mo20223c(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m20234n()) {
            return;
        }
        m20229i();
        Set<E> setM20226f = m20226f();
        if (setM20226f != null) {
            this.f73910d = rd8.constrainToRange(size(), 3, 1073741823);
            setM20226f.clear();
            this.f73907a = null;
            this.f73911e = 0;
            return;
        }
        Arrays.fill(requireElements(), 0, this.f73911e, (Object) null);
        rc2.m21147g(requireTable());
        Arrays.fill(requireEntries(), 0, this.f73911e, 0);
        this.f73911e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@wx1 Object object) {
        if (m20234n()) {
            return false;
        }
        Set<E> setM20226f = m20226f();
        if (setM20226f != null) {
            return setM20226f.contains(object);
        }
        int iM25912d = yh7.m25912d(object);
        int iHashTableMask = hashTableMask();
        int iM21148h = rc2.m21148h(requireTable(), iM25912d & iHashTableMask);
        if (iM21148h == 0) {
            return false;
        }
        int iM21142b = rc2.m21142b(iM25912d, iHashTableMask);
        do {
            int i = iM21148h - 1;
            int iEntry = entry(i);
            if (rc2.m21142b(iEntry, iHashTableMask) == iM21142b && okb.equal(object, element(i))) {
                return true;
            }
            iM21148h = rc2.m21143c(iEntry, iHashTableMask);
        } while (iM21148h != 0);
        return false;
    }

    @op1
    /* JADX INFO: renamed from: d */
    public int mo20224d() {
        v7d.checkState(m20234n(), "Arrays already allocated");
        int i = this.f73910d;
        int iM21150j = rc2.m21150j(i);
        this.f73907a = rc2.m21141a(iM21150j);
        setHashTableMask(iM21150j - 1);
        this.f73908b = new int[i];
        this.f73909c = new Object[i];
        return i;
    }

    @gdi
    @op1
    /* JADX INFO: renamed from: e */
    public Set<E> mo20225e() {
        Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int iMo20227g = mo20227g();
        while (iMo20227g >= 0) {
            setCreateHashFloodingResistantDelegate.add(element(iMo20227g));
            iMo20227g = mo20228h(iMo20227g);
        }
        this.f73907a = setCreateHashFloodingResistantDelegate;
        this.f73908b = null;
        this.f73909c = null;
        m20229i();
        return setCreateHashFloodingResistantDelegate;
    }

    @gdi
    @wx1
    /* JADX INFO: renamed from: f */
    public Set<E> m20226f() {
        Object obj = this.f73907a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public int mo20227g() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: renamed from: h */
    public int mo20228h(int entryIndex) {
        int i = entryIndex + 1;
        if (i < this.f73911e) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public void m20229i() {
        this.f73910d += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> setM20226f = m20226f();
        return setM20226f != null ? setM20226f.iterator() : new C11422a();
    }

    /* JADX INFO: renamed from: j */
    public void mo20230j(int expectedSize) {
        v7d.checkArgument(expectedSize >= 0, "Expected size must be >= 0");
        this.f73910d = rd8.constrainToRange(expectedSize, 1, 1073741823);
    }

    /* JADX INFO: renamed from: k */
    public void mo20231k(int entryIndex, @dgc E object, int hash, int mask) {
        setEntry(entryIndex, rc2.m21144d(hash, 0, mask));
        setElement(entryIndex, object);
    }

    @gdi
    /* JADX INFO: renamed from: l */
    public boolean m20232l() {
        return m20226f() != null;
    }

    /* JADX INFO: renamed from: m */
    public void mo20233m(int dstIndex, int mask) {
        Object objRequireTable = requireTable();
        int[] iArrRequireEntries = requireEntries();
        Object[] objArrRequireElements = requireElements();
        int size = size();
        int i = size - 1;
        if (dstIndex >= i) {
            objArrRequireElements[dstIndex] = null;
            iArrRequireEntries[dstIndex] = 0;
            return;
        }
        Object obj = objArrRequireElements[i];
        objArrRequireElements[dstIndex] = obj;
        objArrRequireElements[i] = null;
        iArrRequireEntries[dstIndex] = iArrRequireEntries[i];
        iArrRequireEntries[i] = 0;
        int iM25912d = yh7.m25912d(obj) & mask;
        int iM21148h = rc2.m21148h(objRequireTable, iM25912d);
        if (iM21148h == size) {
            rc2.m21149i(objRequireTable, iM25912d, dstIndex + 1);
            return;
        }
        while (true) {
            int i2 = iM21148h - 1;
            int i3 = iArrRequireEntries[i2];
            int iM21143c = rc2.m21143c(i3, mask);
            if (iM21143c == size) {
                iArrRequireEntries[i2] = rc2.m21144d(i3, dstIndex + 1, mask);
                return;
            }
            iM21148h = iM21143c;
        }
    }

    @gdi
    /* JADX INFO: renamed from: n */
    public boolean m20234n() {
        return this.f73907a == null;
    }

    /* JADX INFO: renamed from: o */
    public void mo20235o(int newCapacity) {
        this.f73908b = Arrays.copyOf(requireEntries(), newCapacity);
        this.f73909c = Arrays.copyOf(requireElements(), newCapacity);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @op1
    public boolean remove(@wx1 Object object) {
        if (m20234n()) {
            return false;
        }
        Set<E> setM20226f = m20226f();
        if (setM20226f != null) {
            return setM20226f.remove(object);
        }
        int iHashTableMask = hashTableMask();
        int iM21146f = rc2.m21146f(object, null, iHashTableMask, requireTable(), requireEntries(), requireElements(), null);
        if (iM21146f == -1) {
            return false;
        }
        mo20233m(iM21146f, iHashTableMask);
        this.f73911e--;
        m20229i();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> setM20226f = m20226f();
        return setM20226f != null ? setM20226f.size() : this.f73911e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (m20234n()) {
            return new Object[0];
        }
        Set<E> setM20226f = m20226f();
        return setM20226f != null ? setM20226f.toArray() : Arrays.copyOf(requireElements(), this.f73911e);
    }

    public void trimToSize() {
        if (m20234n()) {
            return;
        }
        Set<E> setM20226f = m20226f();
        if (setM20226f != null) {
            Set<E> setCreateHashFloodingResistantDelegate = createHashFloodingResistantDelegate(size());
            setCreateHashFloodingResistantDelegate.addAll(setM20226f);
            this.f73907a = setCreateHashFloodingResistantDelegate;
            return;
        }
        int i = this.f73911e;
        if (i < requireEntries().length) {
            mo20235o(i);
        }
        int iM21150j = rc2.m21150j(i);
        int iHashTableMask = hashTableMask();
        if (iM21150j < iHashTableMask) {
            resizeTable(iHashTableMask, iM21150j, 0, 0);
        }
    }

    public static <E> qc2<E> create(Collection<? extends E> collection) {
        qc2<E> qc2VarCreateWithExpectedSize = createWithExpectedSize(collection.size());
        qc2VarCreateWithExpectedSize.addAll(collection);
        return qc2VarCreateWithExpectedSize;
    }

    public qc2(int expectedSize) {
        mo20230j(expectedSize);
    }

    @SafeVarargs
    public static <E> qc2<E> create(E... elements) {
        qc2<E> qc2VarCreateWithExpectedSize = createWithExpectedSize(elements.length);
        Collections.addAll(qc2VarCreateWithExpectedSize, elements);
        return qc2VarCreateWithExpectedSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @op1
    public <T> T[] toArray(T[] tArr) {
        if (m20234n()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setM20226f = m20226f();
        if (setM20226f != null) {
            return (T[]) setM20226f.toArray(tArr);
        }
        return (T[]) pjb.m19538h(requireElements(), 0, this.f73911e, tArr);
    }
}
