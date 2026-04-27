package p000;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@tx4
@yg8
public class sc2<K, V> extends pc2<K, V> {

    /* JADX INFO: renamed from: Z */
    public static final int f81187Z = -2;

    /* JADX INFO: renamed from: N */
    @gdi
    @wx1
    public transient long[] f81188N;

    /* JADX INFO: renamed from: Q */
    public transient int f81189Q;

    /* JADX INFO: renamed from: X */
    public transient int f81190X;

    /* JADX INFO: renamed from: Y */
    public final boolean f81191Y;

    public sc2() {
        this(3);
    }

    public static <K, V> sc2<K, V> create() {
        return new sc2<>();
    }

    public static <K, V> sc2<K, V> createWithExpectedSize(int expectedSize) {
        return new sc2<>(expectedSize);
    }

    private int getPredecessor(int entry) {
        return ((int) (link(entry) >>> 32)) - 1;
    }

    private long link(int i) {
        return requireLinks()[i];
    }

    private long[] requireLinks() {
        long[] jArr = this.f81188N;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    private void setLink(int i, long value) {
        requireLinks()[i] = value;
    }

    private void setPredecessor(int entry, int pred) {
        setLink(entry, (link(entry) & 4294967295L) | (((long) (pred + 1)) << 32));
    }

    private void setSucceeds(int pred, int succ) {
        if (pred == -2) {
            this.f81189Q = succ;
        } else {
            setSuccessor(pred, succ);
        }
        if (succ == -2) {
            this.f81190X = pred;
        } else {
            setPredecessor(succ, pred);
        }
    }

    private void setSuccessor(int entry, int succ) {
        setLink(entry, (link(entry) & qjb.f74611l) | (((long) (succ + 1)) & 4294967295L));
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: A */
    public void mo19377A(int expectedSize) {
        super.mo19377A(expectedSize);
        this.f81189Q = -2;
        this.f81190X = -2;
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: B */
    public void mo19378B(int entryIndex, @dgc K key, @dgc V value, int hash, int mask) {
        super.mo19378B(entryIndex, key, value, hash, mask);
        setSucceeds(this.f81190X, entryIndex);
        setSucceeds(entryIndex, -2);
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: D */
    public void mo19380D(int dstIndex, int mask) {
        int size = size() - 1;
        super.mo19380D(dstIndex, mask);
        setSucceeds(getPredecessor(dstIndex), mo19395y(dstIndex));
        if (dstIndex < size) {
            setSucceeds(getPredecessor(size), dstIndex);
            setSucceeds(dstIndex, mo19395y(size));
        }
        setLink(size, 0L);
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: F */
    public void mo19382F(int newCapacity) {
        super.mo19382F(newCapacity);
        this.f81188N = Arrays.copyOf(requireLinks(), newCapacity);
    }

    @Override // p000.pc2, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m19381E()) {
            return;
        }
        this.f81189Q = -2;
        this.f81190X = -2;
        long[] jArr = this.f81188N;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: n */
    public void mo19384n(int index) {
        if (this.f81191Y) {
            setSucceeds(getPredecessor(index), mo19395y(index));
            setSucceeds(this.f81190X, index);
            setSucceeds(index, -2);
            m19396z();
        }
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: o */
    public int mo19385o(int indexBeforeRemove, int indexRemoved) {
        return indexBeforeRemove >= size() ? indexRemoved : indexBeforeRemove;
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: p */
    public int mo19386p() {
        int iMo19386p = super.mo19386p();
        this.f81188N = new long[iMo19386p];
        return iMo19386p;
    }

    @Override // p000.pc2
    @op1
    /* JADX INFO: renamed from: q */
    public Map<K, V> mo19387q() {
        Map<K, V> mapMo19387q = super.mo19387q();
        this.f81188N = null;
        return mapMo19387q;
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: s */
    public Map<K, V> mo19389s(int tableSize) {
        return new LinkedHashMap(tableSize, 1.0f, this.f81191Y);
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: x */
    public int mo19394x() {
        return this.f81189Q;
    }

    @Override // p000.pc2
    /* JADX INFO: renamed from: y */
    public int mo19395y(int entry) {
        return ((int) link(entry)) - 1;
    }

    public sc2(int expectedSize) {
        this(expectedSize, false);
    }

    public sc2(int expectedSize, boolean accessOrder) {
        super(expectedSize);
        this.f81191Y = accessOrder;
    }
}
