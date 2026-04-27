package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ysf {

    /* JADX INFO: renamed from: f */
    public static final int f102908f = 8;

    /* JADX INFO: renamed from: a */
    public int f102909a;

    /* JADX INFO: renamed from: b */
    @yfb
    public int[] f102910b = new int[16];

    /* JADX INFO: renamed from: c */
    @yfb
    public int[] f102911c = new int[16];

    /* JADX INFO: renamed from: d */
    @yfb
    public int[] f102912d;

    /* JADX INFO: renamed from: e */
    public int f102913e;

    public ysf() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.f102912d = iArr;
    }

    private final int allocateHandle() {
        int length = this.f102912d.length;
        if (this.f102913e >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            u70.copyInto$default(this.f102912d, iArr, 0, 0, 0, 14, (Object) null);
            this.f102912d = iArr;
        }
        int i4 = this.f102913e;
        this.f102913e = this.f102912d[i4];
        return i4;
    }

    private final void ensure(int i) {
        int[] iArr = this.f102910b;
        int length = iArr.length;
        if (i <= length) {
            return;
        }
        int i2 = length * 2;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        u70.copyInto$default(iArr, iArr2, 0, 0, 0, 14, (Object) null);
        u70.copyInto$default(this.f102911c, iArr3, 0, 0, 0, 14, (Object) null);
        this.f102910b = iArr2;
        this.f102911c = iArr3;
    }

    private final void freeHandle(int i) {
        this.f102912d[i] = this.f102913e;
        this.f102913e = i;
    }

    public static /* synthetic */ int lowestOrDefault$default(ysf ysfVar, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return ysfVar.lowestOrDefault(i);
    }

    private final void shiftDown(int i) {
        int i2;
        int[] iArr = this.f102910b;
        int i3 = this.f102909a >> 1;
        while (i < i3) {
            int i4 = (i + 1) << 1;
            int i5 = i4 - 1;
            if (i4 >= this.f102909a || (i2 = iArr[i4]) >= iArr[i5]) {
                if (iArr[i5] >= iArr[i]) {
                    return;
                }
                swap(i5, i);
                i = i5;
            } else {
                if (i2 >= iArr[i]) {
                    return;
                }
                swap(i4, i);
                i = i4;
            }
        }
    }

    private final void shiftUp(int i) {
        int[] iArr = this.f102910b;
        int i2 = iArr[i];
        while (i > 0) {
            int i3 = ((i + 1) >> 1) - 1;
            if (iArr[i3] <= i2) {
                return;
            }
            swap(i3, i);
            i = i3;
        }
    }

    private final void swap(int i, int i2) {
        int[] iArr = this.f102910b;
        int[] iArr2 = this.f102911c;
        int[] iArr3 = this.f102912d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }

    public final int add(int i) {
        ensure(this.f102909a + 1);
        int i2 = this.f102909a;
        this.f102909a = i2 + 1;
        int iAllocateHandle = allocateHandle();
        this.f102910b[i2] = i;
        this.f102911c[i2] = iAllocateHandle;
        this.f102912d[iAllocateHandle] = i2;
        shiftUp(i2);
        return iAllocateHandle;
    }

    public final int getSize() {
        return this.f102909a;
    }

    public final int lowestOrDefault(int i) {
        return this.f102909a > 0 ? this.f102910b[0] : i;
    }

    public final void remove(int i) {
        int i2 = this.f102912d[i];
        swap(i2, this.f102909a - 1);
        this.f102909a--;
        shiftUp(i2);
        shiftDown(i2);
        freeHandle(i);
    }

    @dpg
    public final void validate() {
        int i = this.f102909a;
        int i2 = 1;
        while (i2 < i) {
            int i3 = i2 + 1;
            int[] iArr = this.f102910b;
            if (iArr[(i3 >> 1) - 1] > iArr[i2]) {
                throw new IllegalStateException(("Index " + i2 + " is out of place").toString());
            }
            i2 = i3;
        }
    }

    @dpg
    public final void validateHandle(int i, int i2) {
        int i3 = this.f102912d[i];
        if (this.f102911c[i3] != i) {
            throw new IllegalStateException(("Index for handle " + i + " is corrupted").toString());
        }
        if (this.f102910b[i3] == i2) {
            return;
        }
        throw new IllegalStateException(("Value for handle " + i + " was " + this.f102910b[i3] + " but was supposed to be " + i2).toString());
    }
}
