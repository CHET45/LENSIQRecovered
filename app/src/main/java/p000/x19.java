package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x19 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int[] calculateCellsCrossAxisSizeImpl(int i, int i2, int i3) {
        int i4;
        int i5 = i - (i3 * (i2 - 1));
        int i6 = i5 / i2;
        int i7 = i5 % i2;
        int[] iArr = new int[i2];
        int i8 = 0;
        while (i8 < i2) {
            if (i6 < 0) {
                i4 = 0;
            } else {
                i4 = (i8 < i7 ? 1 : 0) + i6;
            }
            iArr[i8] = i4;
            i8++;
        }
        return iArr;
    }
}
