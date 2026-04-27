package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d68 {

    /* JADX INFO: renamed from: f */
    public static final int f28520f = 16;

    /* JADX INFO: renamed from: a */
    public int f28521a = 0;

    /* JADX INFO: renamed from: b */
    public int f28522b = -1;

    /* JADX INFO: renamed from: c */
    public int f28523c = 0;

    /* JADX INFO: renamed from: d */
    public int[] f28524d = new int[16];

    /* JADX INFO: renamed from: e */
    public int f28525e;

    public d68() {
        this.f28525e = r0.length - 1;
    }

    private void doubleArraySize() {
        int[] iArr = this.f28524d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i = this.f28521a;
        int i2 = length2 - i;
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.f28524d, 0, iArr2, i2, i);
        this.f28521a = 0;
        this.f28522b = this.f28523c - 1;
        this.f28524d = iArr2;
        this.f28525e = iArr2.length - 1;
    }

    public void add(int i) {
        if (this.f28523c == this.f28524d.length) {
            doubleArraySize();
        }
        int i2 = (this.f28522b + 1) & this.f28525e;
        this.f28522b = i2;
        this.f28524d[i2] = i;
        this.f28523c++;
    }

    public int capacity() {
        return this.f28524d.length;
    }

    public void clear() {
        this.f28521a = 0;
        this.f28522b = -1;
        this.f28523c = 0;
    }

    public boolean isEmpty() {
        return this.f28523c == 0;
    }

    public int remove() {
        int i = this.f28523c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f28524d;
        int i2 = this.f28521a;
        int i3 = iArr[i2];
        this.f28521a = (i2 + 1) & this.f28525e;
        this.f28523c = i - 1;
        return i3;
    }

    public int size() {
        return this.f28523c;
    }
}
