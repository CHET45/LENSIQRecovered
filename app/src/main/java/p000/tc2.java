package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
public class tc2<E> extends qc2<E> {

    /* JADX INFO: renamed from: M */
    public static final int f84234M = -2;

    /* JADX INFO: renamed from: C */
    @wx1
    public transient int[] f84235C;

    /* JADX INFO: renamed from: F */
    @wx1
    public transient int[] f84236F;

    /* JADX INFO: renamed from: H */
    public transient int f84237H;

    /* JADX INFO: renamed from: L */
    public transient int f84238L;

    public tc2() {
    }

    public static <E> tc2<E> create() {
        return new tc2<>();
    }

    public static <E> tc2<E> createWithExpectedSize(int expectedSize) {
        return new tc2<>(expectedSize);
    }

    private int getPredecessor(int entry) {
        return requirePredecessors()[entry] - 1;
    }

    private int[] requirePredecessors() {
        int[] iArr = this.f84235C;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private int[] requireSuccessors() {
        int[] iArr = this.f84236F;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private void setPredecessor(int entry, int pred) {
        requirePredecessors()[entry] = pred + 1;
    }

    private void setSucceeds(int pred, int succ) {
        if (pred == -2) {
            this.f84237H = succ;
        } else {
            setSuccessor(pred, succ);
        }
        if (succ == -2) {
            this.f84238L = pred;
        } else {
            setPredecessor(succ, pred);
        }
    }

    private void setSuccessor(int entry, int succ) {
        requireSuccessors()[entry] = succ + 1;
    }

    @Override // p000.qc2
    /* JADX INFO: renamed from: c */
    public int mo20223c(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove >= size() ? indexRemoved : indexBeforeRemove;
    }

    @Override // p000.qc2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m20234n()) {
            return;
        }
        this.f84237H = -2;
        this.f84238L = -2;
        int[] iArr = this.f84235C;
        if (iArr != null && this.f84236F != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f84236F, 0, size(), 0);
        }
        super.clear();
    }

    @Override // p000.qc2
    /* JADX INFO: renamed from: d */
    public int mo20224d() {
        int iMo20224d = super.mo20224d();
        this.f84235C = new int[iMo20224d];
        this.f84236F = new int[iMo20224d];
        return iMo20224d;
    }

    @Override // p000.qc2
    @op1
    /* JADX INFO: renamed from: e */
    public Set<E> mo20225e() {
        Set<E> setMo20225e = super.mo20225e();
        this.f84235C = null;
        this.f84236F = null;
        return setMo20225e;
    }

    @Override // p000.qc2
    /* JADX INFO: renamed from: g */
    public int mo20227g() {
        return this.f84237H;
    }

    @Override // p000.qc2
    /* JADX INFO: renamed from: h */
    public int mo20228h(int entry) {
        return requireSuccessors()[entry] - 1;
    }

    @Override // p000.qc2
    /* JADX INFO: renamed from: j */
    public void mo20230j(int expectedSize) {
        super.mo20230j(expectedSize);
        this.f84237H = -2;
        this.f84238L = -2;
    }

    @Override // p000.qc2
    /* JADX INFO: renamed from: k */
    public void mo20231k(int entryIndex, @dgc E object, int hash, int mask) {
        super.mo20231k(entryIndex, object, hash, mask);
        setSucceeds(this.f84238L, entryIndex);
        setSucceeds(entryIndex, -2);
    }

    @Override // p000.qc2
    /* JADX INFO: renamed from: m */
    public void mo20233m(int dstIndex, int mask) {
        int size = size() - 1;
        super.mo20233m(dstIndex, mask);
        setSucceeds(getPredecessor(dstIndex), mo20228h(dstIndex));
        if (dstIndex < size) {
            setSucceeds(getPredecessor(size), dstIndex);
            setSucceeds(dstIndex, mo20228h(size));
        }
        requirePredecessors()[size] = 0;
        requireSuccessors()[size] = 0;
    }

    @Override // p000.qc2
    /* JADX INFO: renamed from: o */
    public void mo20235o(int newCapacity) {
        super.mo20235o(newCapacity);
        this.f84235C = Arrays.copyOf(requirePredecessors(), newCapacity);
        this.f84236F = Arrays.copyOf(requireSuccessors(), newCapacity);
    }

    @Override // p000.qc2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return pjb.m19536f(this);
    }

    public tc2(int expectedSize) {
        super(expectedSize);
    }

    public static <E> tc2<E> create(Collection<? extends E> collection) {
        tc2<E> tc2VarCreateWithExpectedSize = createWithExpectedSize(collection.size());
        tc2VarCreateWithExpectedSize.addAll(collection);
        return tc2VarCreateWithExpectedSize;
    }

    @Override // p000.qc2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) pjb.m19537g(this, tArr);
    }

    @SafeVarargs
    public static <E> tc2<E> create(E... elements) {
        tc2<E> tc2VarCreateWithExpectedSize = createWithExpectedSize(elements.length);
        Collections.addAll(tc2VarCreateWithExpectedSize, elements);
        return tc2VarCreateWithExpectedSize;
    }
}
