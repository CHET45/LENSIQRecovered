package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true, serializable = true)
@tx4
public class rjb<K> extends qjb<K> {

    /* JADX INFO: renamed from: r */
    public static final int f78467r = -2;

    /* JADX INFO: renamed from: o */
    @gdi
    public transient long[] f78468o;

    /* JADX INFO: renamed from: p */
    public transient int f78469p;

    /* JADX INFO: renamed from: q */
    public transient int f78470q;

    public rjb() {
        this(3);
    }

    private int getPredecessor(int entry) {
        return (int) (this.f78468o[entry] >>> 32);
    }

    private int getSuccessor(int entry) {
        return (int) this.f78468o[entry];
    }

    /* JADX INFO: renamed from: r */
    public static <K> rjb<K> m21388r() {
        return new rjb<>();
    }

    /* JADX INFO: renamed from: s */
    public static <K> rjb<K> m21389s(int expectedSize) {
        return new rjb<>(expectedSize);
    }

    private void setPredecessor(int entry, int pred) {
        long[] jArr = this.f78468o;
        jArr[entry] = (jArr[entry] & 4294967295L) | (((long) pred) << 32);
    }

    private void setSucceeds(int pred, int succ) {
        if (pred == -2) {
            this.f78469p = succ;
        } else {
            setSuccessor(pred, succ);
        }
        if (succ == -2) {
            this.f78470q = pred;
        } else {
            setPredecessor(succ, pred);
        }
    }

    private void setSuccessor(int entry, int succ) {
        long[] jArr = this.f78468o;
        jArr[entry] = (jArr[entry] & qjb.f74611l) | (((long) succ) & 4294967295L);
    }

    @Override // p000.qjb
    public void clear() {
        super.clear();
        this.f78469p = -2;
        this.f78470q = -2;
    }

    @Override // p000.qjb
    /* JADX INFO: renamed from: d */
    public int mo20388d() {
        int i = this.f78469p;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // p000.qjb
    /* JADX INFO: renamed from: i */
    public void mo20393i(int expectedSize, float loadFactor) {
        super.mo20393i(expectedSize, loadFactor);
        this.f78469p = -2;
        this.f78470q = -2;
        long[] jArr = new long[expectedSize];
        this.f78468o = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // p000.qjb
    /* JADX INFO: renamed from: j */
    public void mo20394j(int entryIndex, @dgc K key, int value, int hash) {
        super.mo20394j(entryIndex, key, value, hash);
        setSucceeds(this.f78470q, entryIndex);
        setSucceeds(entryIndex, -2);
    }

    @Override // p000.qjb
    /* JADX INFO: renamed from: k */
    public void mo20395k(int dstIndex) {
        int iM20401q = m20401q() - 1;
        setSucceeds(getPredecessor(dstIndex), getSuccessor(dstIndex));
        if (dstIndex < iM20401q) {
            setSucceeds(getPredecessor(iM20401q), dstIndex);
            setSucceeds(dstIndex, getSuccessor(iM20401q));
        }
        super.mo20395k(dstIndex);
    }

    @Override // p000.qjb
    /* JADX INFO: renamed from: l */
    public int mo20396l(int index) {
        int successor = getSuccessor(index);
        if (successor == -2) {
            return -1;
        }
        return successor;
    }

    @Override // p000.qjb
    /* JADX INFO: renamed from: m */
    public int mo20397m(int oldNextIndex, int removedIndex) {
        return oldNextIndex == m20401q() ? removedIndex : oldNextIndex;
    }

    @Override // p000.qjb
    /* JADX INFO: renamed from: o */
    public void mo20399o(int newCapacity) {
        super.mo20399o(newCapacity);
        long[] jArr = this.f78468o;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, newCapacity);
        this.f78468o = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, newCapacity, -1L);
    }

    public rjb(int expectedSize) {
        this(expectedSize, 1.0f);
    }

    public rjb(int expectedSize, float loadFactor) {
        super(expectedSize, loadFactor);
    }

    public rjb(qjb<K> map) {
        mo20393i(map.m20401q(), 1.0f);
        int iMo20388d = map.mo20388d();
        while (iMo20388d != -1) {
            put(map.m20390f(iMo20388d), map.m20391g(iMo20388d));
            iMo20388d = map.mo20396l(iMo20388d);
        }
    }
}
