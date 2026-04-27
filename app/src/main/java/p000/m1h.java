package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class m1h<V> {

    /* JADX INFO: renamed from: e */
    public static final int f59659e = 10;

    /* JADX INFO: renamed from: a */
    public long[] f59660a;

    /* JADX INFO: renamed from: b */
    public V[] f59661b;

    /* JADX INFO: renamed from: c */
    public int f59662c;

    /* JADX INFO: renamed from: d */
    public int f59663d;

    public m1h() {
        this(10);
    }

    private void addUnchecked(long j, V v) {
        int i = this.f59662c;
        int i2 = this.f59663d;
        V[] vArr = this.f59661b;
        int length = (i + i2) % vArr.length;
        this.f59660a[length] = j;
        vArr[length] = v;
        this.f59663d = i2 + 1;
    }

    private void clearBufferOnTimeDiscontinuity(long j) {
        if (this.f59663d > 0) {
            if (j <= this.f59660a[((this.f59662c + r0) - 1) % this.f59661b.length]) {
                clear();
            }
        }
    }

    private void doubleCapacityIfFull() {
        int length = this.f59661b.length;
        if (this.f59663d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) newArray(i);
        int i2 = this.f59662c;
        int i3 = length - i2;
        System.arraycopy(this.f59660a, i2, jArr, 0, i3);
        System.arraycopy(this.f59661b, this.f59662c, vArr, 0, i3);
        int i4 = this.f59662c;
        if (i4 > 0) {
            System.arraycopy(this.f59660a, 0, jArr, i3, i4);
            System.arraycopy(this.f59661b, 0, vArr, i3, this.f59662c);
        }
        this.f59660a = jArr;
        this.f59661b = vArr;
        this.f59662c = 0;
    }

    private static <V> V[] newArray(int i) {
        return (V[]) new Object[i];
    }

    @hib
    private V popFirst() {
        v80.checkState(this.f59663d > 0);
        V[] vArr = this.f59661b;
        int i = this.f59662c;
        V v = vArr[i];
        vArr[i] = null;
        this.f59662c = (i + 1) % vArr.length;
        this.f59663d--;
        return v;
    }

    public synchronized void add(long j, V v) {
        clearBufferOnTimeDiscontinuity(j);
        doubleCapacityIfFull();
        addUnchecked(j, v);
    }

    public synchronized void clear() {
        this.f59662c = 0;
        this.f59663d = 0;
        Arrays.fill(this.f59661b, (Object) null);
    }

    @hib
    public synchronized V poll(long j) {
        return poll(j, false);
    }

    @hib
    public synchronized V pollFirst() {
        return this.f59663d == 0 ? null : popFirst();
    }

    @hib
    public synchronized V pollFloor(long j) {
        return poll(j, true);
    }

    public synchronized int size() {
        return this.f59663d;
    }

    public m1h(int i) {
        this.f59660a = new long[i];
        this.f59661b = (V[]) newArray(i);
    }

    @hib
    private V poll(long j, boolean z) {
        V vPopFirst = null;
        long j2 = Long.MAX_VALUE;
        while (this.f59663d > 0) {
            long j3 = j - this.f59660a[this.f59662c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            vPopFirst = popFirst();
            j2 = j3;
        }
        return vPopFirst;
    }
}
