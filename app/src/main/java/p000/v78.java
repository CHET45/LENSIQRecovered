package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class v78 {

    /* JADX INFO: renamed from: c */
    public static final int f90204c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public int[] f90205a = new int[10];

    /* JADX INFO: renamed from: b */
    public int f90206b;

    public final void clear() {
        this.f90206b = 0;
    }

    public final int getSize() {
        return this.f90206b;
    }

    public final int indexOf(int i) {
        int i2 = this.f90206b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f90205a[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.f90206b == 0;
    }

    public final boolean isNotEmpty() {
        return this.f90206b != 0;
    }

    public final int peek() {
        return this.f90205a[this.f90206b - 1];
    }

    public final int peek2() {
        return this.f90205a[this.f90206b - 2];
    }

    public final int peekOr(int i) {
        return this.f90206b > 0 ? peek() : i;
    }

    public final int pop() {
        int[] iArr = this.f90205a;
        int i = this.f90206b - 1;
        this.f90206b = i;
        return iArr[i];
    }

    public final void push(int i) {
        int i2 = this.f90206b;
        int[] iArr = this.f90205a;
        if (i2 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f90205a = iArrCopyOf;
        }
        int[] iArr2 = this.f90205a;
        int i3 = this.f90206b;
        this.f90206b = i3 + 1;
        iArr2[i3] = i;
    }

    public final int peek(int i) {
        return this.f90205a[i];
    }
}
