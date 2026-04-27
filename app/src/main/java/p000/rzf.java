package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class rzf<T> implements uif<T> {

    /* JADX INFO: renamed from: F */
    public static final int f80210F = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: H */
    public static final Object f80211H = new Object();

    /* JADX INFO: renamed from: b */
    public int f80214b;

    /* JADX INFO: renamed from: c */
    public long f80215c;

    /* JADX INFO: renamed from: d */
    public final int f80216d;

    /* JADX INFO: renamed from: e */
    public AtomicReferenceArray<Object> f80217e;

    /* JADX INFO: renamed from: f */
    public final int f80218f;

    /* JADX INFO: renamed from: m */
    public AtomicReferenceArray<Object> f80219m;

    /* JADX INFO: renamed from: a */
    public final AtomicLong f80213a = new AtomicLong();

    /* JADX INFO: renamed from: C */
    public final AtomicLong f80212C = new AtomicLong();

    public rzf(int i) {
        int iRoundToPowerOfTwo = x5d.roundToPowerOfTwo(Math.max(8, i));
        int i2 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.f80217e = atomicReferenceArray;
        this.f80216d = i2;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.f80219m = atomicReferenceArray;
        this.f80218f = i2;
        this.f80215c = iRoundToPowerOfTwo - 2;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int i) {
        this.f80214b = Math.min(i / 4, f80210F);
    }

    private static int calcDirectOffset(int i) {
        return i;
    }

    private static int calcWrappedOffset(long j, int i) {
        return calcDirectOffset(((int) j) & i);
    }

    private long lpConsumerIndex() {
        return this.f80212C.get();
    }

    private long lpProducerIndex() {
        return this.f80213a.get();
    }

    private long lvConsumerIndex() {
        return this.f80212C.get();
    }

    private static <E> Object lvElement(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    private AtomicReferenceArray<Object> lvNextBufferAndUnlink(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int iCalcDirectOffset = calcDirectOffset(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) lvElement(atomicReferenceArray, iCalcDirectOffset);
        soElement(atomicReferenceArray, iCalcDirectOffset, null);
        return atomicReferenceArray2;
    }

    private long lvProducerIndex() {
        return this.f80213a.get();
    }

    private T newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f80219m = atomicReferenceArray;
        return (T) lvElement(atomicReferenceArray, calcWrappedOffset(j, i));
    }

    private T newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f80219m = atomicReferenceArray;
        int iCalcWrappedOffset = calcWrappedOffset(j, i);
        T t = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        if (t != null) {
            soElement(atomicReferenceArray, iCalcWrappedOffset, null);
            soConsumerIndex(j + 1);
        }
        return t;
    }

    private void resize(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f80217e = atomicReferenceArray2;
        this.f80215c = (j2 + j) - 1;
        soElement(atomicReferenceArray2, i, t);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, i, f80211H);
        soProducerIndex(j + 1);
    }

    private void soConsumerIndex(long j) {
        this.f80212C.lazySet(j);
    }

    private static void soElement(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    private void soNext(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        soElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void soProducerIndex(long j) {
        this.f80213a.lazySet(j);
    }

    private boolean writeToQueue(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        soElement(atomicReferenceArray, i, t);
        soProducerIndex(j + 1);
        return true;
    }

    @Override // p000.ajf
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // p000.ajf
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // p000.ajf
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f80217e;
        long jLpProducerIndex = lpProducerIndex();
        int i = this.f80216d;
        int iCalcWrappedOffset = calcWrappedOffset(jLpProducerIndex, i);
        if (jLpProducerIndex < this.f80215c) {
            return writeToQueue(atomicReferenceArray, t, jLpProducerIndex, iCalcWrappedOffset);
        }
        long j = ((long) this.f80214b) + jLpProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j, i)) == null) {
            this.f80215c = j - 1;
            return writeToQueue(atomicReferenceArray, t, jLpProducerIndex, iCalcWrappedOffset);
        }
        if (lvElement(atomicReferenceArray, calcWrappedOffset(1 + jLpProducerIndex, i)) == null) {
            return writeToQueue(atomicReferenceArray, t, jLpProducerIndex, iCalcWrappedOffset);
        }
        resize(atomicReferenceArray, jLpProducerIndex, iCalcWrappedOffset, t, i);
        return true;
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f80219m;
        long jLpConsumerIndex = lpConsumerIndex();
        int i = this.f80218f;
        T t = (T) lvElement(atomicReferenceArray, calcWrappedOffset(jLpConsumerIndex, i));
        return t == f80211H ? newBufferPeek(lvNextBufferAndUnlink(atomicReferenceArray, i + 1), jLpConsumerIndex, i) : t;
    }

    @Override // p000.uif, p000.ajf
    @cib
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f80219m;
        long jLpConsumerIndex = lpConsumerIndex();
        int i = this.f80218f;
        int iCalcWrappedOffset = calcWrappedOffset(jLpConsumerIndex, i);
        T t = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        boolean z = t == f80211H;
        if (t == null || z) {
            if (z) {
                return newBufferPoll(lvNextBufferAndUnlink(atomicReferenceArray, i + 1), jLpConsumerIndex, i);
            }
            return null;
        }
        soElement(atomicReferenceArray, iCalcWrappedOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return t;
    }

    public int size() {
        long jLvConsumerIndex = lvConsumerIndex();
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            long jLvConsumerIndex2 = lvConsumerIndex();
            if (jLvConsumerIndex == jLvConsumerIndex2) {
                return (int) (jLvProducerIndex - jLvConsumerIndex2);
            }
            jLvConsumerIndex = jLvConsumerIndex2;
        }
    }

    @Override // p000.ajf
    public boolean offer(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f80217e;
        long jLvProducerIndex = lvProducerIndex();
        int i = this.f80216d;
        long j = 2 + jLvProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j, i)) == null) {
            int iCalcWrappedOffset = calcWrappedOffset(jLvProducerIndex, i);
            soElement(atomicReferenceArray, iCalcWrappedOffset + 1, t2);
            soElement(atomicReferenceArray, iCalcWrappedOffset, t);
            soProducerIndex(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f80217e = atomicReferenceArray2;
        int iCalcWrappedOffset2 = calcWrappedOffset(jLvProducerIndex, i);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2 + 1, t2);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2, t);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, iCalcWrappedOffset2, f80211H);
        soProducerIndex(j);
        return true;
    }
}
