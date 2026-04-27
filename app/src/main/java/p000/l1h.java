package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l1h<V> {

    /* JADX INFO: renamed from: e */
    public static final int f55944e = 10;

    /* JADX INFO: renamed from: a */
    public long[] f55945a;

    /* JADX INFO: renamed from: b */
    public V[] f55946b;

    /* JADX INFO: renamed from: c */
    public int f55947c;

    /* JADX INFO: renamed from: d */
    public int f55948d;

    public l1h() {
        this(10);
    }

    private void addUnchecked(long j, V v) {
        int i = this.f55947c;
        int i2 = this.f55948d;
        V[] vArr = this.f55946b;
        int length = (i + i2) % vArr.length;
        this.f55945a[length] = j;
        vArr[length] = v;
        this.f55948d = i2 + 1;
    }

    private void clearBufferOnTimeDiscontinuity(long j) {
        if (this.f55948d > 0) {
            if (j <= this.f55945a[((this.f55947c + r0) - 1) % this.f55946b.length]) {
                clear();
            }
        }
    }

    private void doubleCapacityIfFull() {
        int length = this.f55946b.length;
        if (this.f55948d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) newArray(i);
        int i2 = this.f55947c;
        int i3 = length - i2;
        System.arraycopy(this.f55945a, i2, jArr, 0, i3);
        System.arraycopy(this.f55946b, this.f55947c, vArr, 0, i3);
        int i4 = this.f55947c;
        if (i4 > 0) {
            System.arraycopy(this.f55945a, 0, jArr, i3, i4);
            System.arraycopy(this.f55946b, 0, vArr, i3, this.f55947c);
        }
        this.f55945a = jArr;
        this.f55946b = vArr;
        this.f55947c = 0;
    }

    private static <V> V[] newArray(int i) {
        return (V[]) new Object[i];
    }

    @hib
    private V popFirst() {
        u80.checkState(this.f55948d > 0);
        V[] vArr = this.f55946b;
        int i = this.f55947c;
        V v = vArr[i];
        vArr[i] = null;
        this.f55947c = (i + 1) % vArr.length;
        this.f55948d--;
        return v;
    }

    public synchronized void add(long j, V v) {
        clearBufferOnTimeDiscontinuity(j);
        doubleCapacityIfFull();
        addUnchecked(j, v);
    }

    public synchronized void clear() {
        this.f55947c = 0;
        this.f55948d = 0;
        Arrays.fill(this.f55946b, (Object) null);
    }

    @hib
    public synchronized V poll(long j) {
        return poll(j, false);
    }

    @hib
    public synchronized V pollFirst() {
        return this.f55948d == 0 ? null : popFirst();
    }

    @hib
    public synchronized V pollFloor(long j) {
        return poll(j, true);
    }

    public synchronized int size() {
        return this.f55948d;
    }

    public l1h(int i) {
        this.f55945a = new long[i];
        this.f55946b = (V[]) newArray(i);
    }

    @hib
    private V poll(long j, boolean z) {
        V vPopFirst = null;
        long j2 = Long.MAX_VALUE;
        while (this.f55948d > 0) {
            long j3 = j - this.f55945a[this.f55947c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vPopFirst = popFirst();
            j2 = j3;
        }
        return vPopFirst;
    }
}
