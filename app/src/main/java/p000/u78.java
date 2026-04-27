package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,511:1\n42#2,7:512\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n*L\n463#1:512,7\n*E\n"})
public final class u78 {

    /* JADX INFO: renamed from: a */
    @yfb
    public int[] f86983a;

    /* JADX INFO: renamed from: b */
    public int f86984b;

    public u78(int i) {
        this.f86983a = new int[i];
    }

    private final boolean compareDiagonal(int i, int i2) {
        int[] iArr = this.f86983a;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        if (i3 >= i4) {
            return i3 == i4 && iArr[i + 1] <= iArr[i2 + 1];
        }
        return true;
    }

    private final int partition(int i, int i2, int i3) {
        int i4 = i - i3;
        while (i < i2) {
            if (compareDiagonal(i, i2)) {
                i4 += i3;
                swapDiagonal(i4, i);
            }
            i += i3;
        }
        int i5 = i4 + i3;
        swapDiagonal(i5, i2);
        return i5;
    }

    private final void quickSort(int i, int i2, int i3) {
        if (i < i2) {
            int iPartition = partition(i, i2, i3);
            quickSort(i, iPartition - i3, i3);
            quickSort(iPartition + i3, i2, i3);
        }
    }

    private final void swapDiagonal(int i, int i2) {
        int[] iArr = this.f86983a;
        g8b.swap(iArr, i, i2);
        g8b.swap(iArr, i + 1, i2 + 1);
        g8b.swap(iArr, i + 2, i2 + 2);
    }

    public final int get(int i) {
        return this.f86983a[i];
    }

    public final int getSize() {
        return this.f86984b;
    }

    public final boolean isNotEmpty() {
        return this.f86984b != 0;
    }

    public final int pop() {
        int[] iArr = this.f86983a;
        int i = this.f86984b - 1;
        this.f86984b = i;
        return iArr[i];
    }

    public final void pushDiagonal(int i, int i2, int i3) {
        int i4 = this.f86984b;
        int i5 = i4 + 3;
        int[] iArr = this.f86983a;
        if (i5 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f86983a = iArrCopyOf;
        }
        int[] iArr2 = this.f86983a;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.f86984b = i5;
    }

    public final void pushRange(int i, int i2, int i3, int i4) {
        int i5 = this.f86984b;
        int i6 = i5 + 4;
        int[] iArr = this.f86983a;
        if (i6 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            md8.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f86983a = iArrCopyOf;
        }
        int[] iArr2 = this.f86983a;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.f86984b = i6;
    }

    public final void sortDiagonals() {
        int i = this.f86984b;
        if (!(i % 3 == 0)) {
            g28.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i > 3) {
            quickSort(0, i - 3, 3);
        }
    }
}
