package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ok9 {

    /* JADX INFO: renamed from: c */
    public static final int f67902c = 32;

    /* JADX INFO: renamed from: a */
    public int f67903a;

    /* JADX INFO: renamed from: b */
    public long[] f67904b;

    public ok9() {
        this(32);
    }

    public void add(long j) {
        int i = this.f67903a;
        long[] jArr = this.f67904b;
        if (i == jArr.length) {
            this.f67904b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f67904b;
        int i2 = this.f67903a;
        this.f67903a = i2 + 1;
        jArr2[i2] = j;
    }

    public long get(int i) {
        if (i >= 0 && i < this.f67903a) {
            return this.f67904b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f67903a);
    }

    public int size() {
        return this.f67903a;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.f67904b, this.f67903a);
    }

    public ok9(int i) {
        this.f67904b = new long[i];
    }
}
