package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pk9 {

    /* JADX INFO: renamed from: c */
    public static final int f71170c = 32;

    /* JADX INFO: renamed from: a */
    public int f71171a;

    /* JADX INFO: renamed from: b */
    public long[] f71172b;

    public pk9() {
        this(32);
    }

    public void add(long j) {
        int i = this.f71171a;
        long[] jArr = this.f71172b;
        if (i == jArr.length) {
            this.f71172b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f71172b;
        int i2 = this.f71171a;
        this.f71171a = i2 + 1;
        jArr2[i2] = j;
    }

    public void addAll(long[] jArr) {
        int length = this.f71171a + jArr.length;
        long[] jArr2 = this.f71172b;
        if (length > jArr2.length) {
            this.f71172b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f71172b, this.f71171a, jArr.length);
        this.f71171a = length;
    }

    public long get(int i) {
        if (i >= 0 && i < this.f71171a) {
            return this.f71172b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f71171a);
    }

    public int size() {
        return this.f71171a;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.f71172b, this.f71171a);
    }

    public pk9(int i) {
        this.f71172b = new long[i];
    }
}
