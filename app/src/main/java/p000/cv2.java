package p000;

/* JADX INFO: loaded from: classes.dex */
public final class cv2 {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public static final int[] f27723a = new int[0];

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public static final long[] f27724b = new long[0];

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public static final Object[] f27725c = new Object[0];

    public static final int binarySearch(@yfb int[] iArr, int i, int i2) {
        md8.checkNotNullParameter(iArr, "array");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final boolean equal(@gib Object obj, @gib Object obj2) {
        return md8.areEqual(obj, obj2);
    }

    public static final int idealByteArraySize(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    public static final int idealIntArraySize(int i) {
        return idealByteArraySize(i * 4) / 4;
    }

    public static final int idealLongArraySize(int i) {
        return idealByteArraySize(i * 8) / 8;
    }

    public static final int binarySearch(@yfb long[] jArr, int i, long j) {
        md8.checkNotNullParameter(jArr, "array");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }
}
