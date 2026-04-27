package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes7.dex */
public final class qzf<T> implements tif<T> {

    /* JADX INFO: renamed from: F */
    public static final int f76402F = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: H */
    public static final Object f76403H = new Object();

    /* JADX INFO: renamed from: b */
    public int f76406b;

    /* JADX INFO: renamed from: c */
    public long f76407c;

    /* JADX INFO: renamed from: d */
    public final int f76408d;

    /* JADX INFO: renamed from: e */
    public AtomicReferenceArray<Object> f76409e;

    /* JADX INFO: renamed from: f */
    public final int f76410f;

    /* JADX INFO: renamed from: m */
    public AtomicReferenceArray<Object> f76411m;

    /* JADX INFO: renamed from: a */
    public final AtomicLong f76405a = new AtomicLong();

    /* JADX INFO: renamed from: C */
    public final AtomicLong f76404C = new AtomicLong();

    public qzf(final int bufferSize) {
        int iRoundToPowerOfTwo = w5d.roundToPowerOfTwo(Math.max(8, bufferSize));
        int i = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.f76409e = atomicReferenceArray;
        this.f76408d = i;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.f76411m = atomicReferenceArray;
        this.f76410f = i;
        this.f76407c = iRoundToPowerOfTwo - 2;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int capacity) {
        this.f76406b = Math.min(capacity / 4, f76402F);
    }

    private static int calcDirectOffset(int index) {
        return index;
    }

    private static int calcWrappedOffset(long index, int mask) {
        return calcDirectOffset(((int) index) & mask);
    }

    private long lpConsumerIndex() {
        return this.f76404C.get();
    }

    private long lpProducerIndex() {
        return this.f76405a.get();
    }

    private long lvConsumerIndex() {
        return this.f76404C.get();
    }

    private static Object lvElement(AtomicReferenceArray<Object> buffer, int offset) {
        return buffer.get(offset);
    }

    private AtomicReferenceArray<Object> lvNextBufferAndUnlink(AtomicReferenceArray<Object> curr, int nextIndex) {
        int iCalcDirectOffset = calcDirectOffset(nextIndex);
        AtomicReferenceArray<Object> atomicReferenceArray = (AtomicReferenceArray) lvElement(curr, iCalcDirectOffset);
        soElement(curr, iCalcDirectOffset, null);
        return atomicReferenceArray;
    }

    private long lvProducerIndex() {
        return this.f76405a.get();
    }

    private T newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f76411m = atomicReferenceArray;
        return (T) lvElement(atomicReferenceArray, calcWrappedOffset(j, i));
    }

    private T newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f76411m = atomicReferenceArray;
        int iCalcWrappedOffset = calcWrappedOffset(j, i);
        T t = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        if (t != null) {
            soElement(atomicReferenceArray, iCalcWrappedOffset, null);
            soConsumerIndex(j + 1);
        }
        return t;
    }

    private void resize(final AtomicReferenceArray<Object> oldBuffer, final long currIndex, final int offset, final T e, final long mask) {
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(oldBuffer.length());
        this.f76409e = atomicReferenceArray;
        this.f76407c = (mask + currIndex) - 1;
        soElement(atomicReferenceArray, offset, e);
        soNext(oldBuffer, atomicReferenceArray);
        soElement(oldBuffer, offset, f76403H);
        soProducerIndex(currIndex + 1);
    }

    private void soConsumerIndex(long v) {
        this.f76404C.lazySet(v);
    }

    private static void soElement(AtomicReferenceArray<Object> buffer, int offset, Object e) {
        buffer.lazySet(offset, e);
    }

    private void soNext(AtomicReferenceArray<Object> curr, AtomicReferenceArray<Object> next) {
        soElement(curr, calcDirectOffset(curr.length() - 1), next);
    }

    private void soProducerIndex(long v) {
        this.f76405a.lazySet(v);
    }

    private boolean writeToQueue(final AtomicReferenceArray<Object> buffer, final T e, final long index, final int offset) {
        soElement(buffer, offset, e);
        soProducerIndex(index + 1);
        return true;
    }

    @Override // p000.zif
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // p000.zif
    public boolean isEmpty() {
        return lvProducerIndex() == lvConsumerIndex();
    }

    @Override // p000.zif
    public boolean offer(final T e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f76409e;
        long jLpProducerIndex = lpProducerIndex();
        int i = this.f76408d;
        int iCalcWrappedOffset = calcWrappedOffset(jLpProducerIndex, i);
        if (jLpProducerIndex < this.f76407c) {
            return writeToQueue(atomicReferenceArray, e, jLpProducerIndex, iCalcWrappedOffset);
        }
        long j = ((long) this.f76406b) + jLpProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j, i)) == null) {
            this.f76407c = j - 1;
            return writeToQueue(atomicReferenceArray, e, jLpProducerIndex, iCalcWrappedOffset);
        }
        if (lvElement(atomicReferenceArray, calcWrappedOffset(1 + jLpProducerIndex, i)) == null) {
            return writeToQueue(atomicReferenceArray, e, jLpProducerIndex, iCalcWrappedOffset);
        }
        resize(atomicReferenceArray, jLpProducerIndex, iCalcWrappedOffset, e, i);
        return true;
    }

    @dib
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f76411m;
        long jLpConsumerIndex = lpConsumerIndex();
        int i = this.f76410f;
        T t = (T) lvElement(atomicReferenceArray, calcWrappedOffset(jLpConsumerIndex, i));
        return t == f76403H ? newBufferPeek(lvNextBufferAndUnlink(atomicReferenceArray, i + 1), jLpConsumerIndex, i) : t;
    }

    @Override // p000.tif, p000.zif
    @dib
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f76411m;
        long jLpConsumerIndex = lpConsumerIndex();
        int i = this.f76410f;
        int iCalcWrappedOffset = calcWrappedOffset(jLpConsumerIndex, i);
        T t = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        boolean z = t == f76403H;
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

    @Override // p000.zif
    public boolean offer(T first, T second) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f76409e;
        long jLvProducerIndex = lvProducerIndex();
        int i = this.f76408d;
        long j = 2 + jLvProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j, i)) == null) {
            int iCalcWrappedOffset = calcWrappedOffset(jLvProducerIndex, i);
            soElement(atomicReferenceArray, iCalcWrappedOffset + 1, second);
            soElement(atomicReferenceArray, iCalcWrappedOffset, first);
            soProducerIndex(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f76409e = atomicReferenceArray2;
        int iCalcWrappedOffset2 = calcWrappedOffset(jLvProducerIndex, i);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2 + 1, second);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2, first);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, iCalcWrappedOffset2, f76403H);
        soProducerIndex(j);
        return true;
    }
}
