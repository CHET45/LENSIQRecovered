package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class tk9 {

    /* JADX INFO: renamed from: f */
    public static final int f85132f = 16;

    /* JADX INFO: renamed from: a */
    public int f85133a;

    /* JADX INFO: renamed from: b */
    public int f85134b;

    /* JADX INFO: renamed from: c */
    public int f85135c;

    /* JADX INFO: renamed from: d */
    public long[] f85136d;

    /* JADX INFO: renamed from: e */
    public int f85137e;

    public tk9() {
        this(16);
    }

    private void doubleArraySize() {
        long[] jArr = this.f85136d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i = this.f85133a;
        int i2 = length2 - i;
        System.arraycopy(jArr, i, jArr2, 0, i2);
        System.arraycopy(this.f85136d, 0, jArr2, i2, i);
        this.f85133a = 0;
        this.f85134b = this.f85135c - 1;
        this.f85136d = jArr2;
        this.f85137e = jArr2.length - 1;
    }

    @fdi
    /* JADX INFO: renamed from: a */
    public int m22703a() {
        return this.f85136d.length;
    }

    public void add(long j) {
        if (this.f85135c == this.f85136d.length) {
            doubleArraySize();
        }
        int i = (this.f85134b + 1) & this.f85137e;
        this.f85134b = i;
        this.f85136d[i] = j;
        this.f85135c++;
    }

    public void clear() {
        this.f85133a = 0;
        this.f85134b = -1;
        this.f85135c = 0;
    }

    public long element() {
        if (this.f85135c != 0) {
            return this.f85136d[this.f85133a];
        }
        throw new NoSuchElementException();
    }

    public boolean isEmpty() {
        return this.f85135c == 0;
    }

    public long remove() {
        int i = this.f85135c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f85136d;
        int i2 = this.f85133a;
        long j = jArr[i2];
        this.f85133a = this.f85137e & (i2 + 1);
        this.f85135c = i - 1;
        return j;
    }

    public int size() {
        return this.f85135c;
    }

    public tk9(int i) {
        v80.checkArgument(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f85133a = 0;
        this.f85134b = -1;
        this.f85135c = 0;
        long[] jArr = new long[i];
        this.f85136d = jArr;
        this.f85137e = jArr.length - 1;
    }
}
