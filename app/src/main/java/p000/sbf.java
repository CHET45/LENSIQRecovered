package p000;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface sbf {

    /* JADX INFO: renamed from: sbf$a */
    public static class C12510a implements sbf {

        /* JADX INFO: renamed from: a */
        public final Random f81166a;

        /* JADX INFO: renamed from: b */
        public final int[] f81167b;

        /* JADX INFO: renamed from: c */
        public final int[] f81168c;

        public C12510a(int i) {
            this(i, new Random());
        }

        private static int[] createShuffledList(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr[i2] = iArr[iNextInt];
                iArr[iNextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // p000.sbf
        public sbf cloneAndClear() {
            return new C12510a(0, new Random(this.f81166a.nextLong()));
        }

        @Override // p000.sbf
        public sbf cloneAndInsert(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f81166a.nextInt(this.f81167b.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f81166a.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f81167b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f81167b;
                if (i3 >= iArr4.length + i2) {
                    return new C12510a(iArr3, new Random(this.f81166a.nextLong()));
                }
                if (i6 >= i2 || i7 != iArr[i6]) {
                    int i8 = i7 + 1;
                    int i9 = iArr4[i7];
                    iArr3[i3] = i9;
                    if (i9 >= i) {
                        iArr3[i3] = i9 + i2;
                    }
                    i7 = i8;
                } else {
                    iArr3[i3] = iArr2[i6];
                    i6++;
                }
                i3++;
            }
        }

        @Override // p000.sbf
        public sbf cloneAndRemove(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f81167b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f81167b;
                if (i4 >= iArr2.length) {
                    return new C12510a(iArr, new Random(this.f81166a.nextLong()));
                }
                int i6 = iArr2[i4];
                if (i6 < i || i6 >= i2) {
                    int i7 = i4 - i5;
                    if (i6 >= i) {
                        i6 -= i3;
                    }
                    iArr[i7] = i6;
                } else {
                    i5++;
                }
                i4++;
            }
        }

        @Override // p000.sbf
        public int getFirstIndex() {
            int[] iArr = this.f81167b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p000.sbf
        public int getLastIndex() {
            int[] iArr = this.f81167b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p000.sbf
        public int getLength() {
            return this.f81167b.length;
        }

        @Override // p000.sbf
        public int getNextIndex(int i) {
            int i2 = this.f81168c[i] + 1;
            int[] iArr = this.f81167b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // p000.sbf
        public int getPreviousIndex(int i) {
            int i2 = this.f81168c[i] - 1;
            if (i2 >= 0) {
                return this.f81167b[i2];
            }
            return -1;
        }

        public C12510a(int i, long j) {
            this(i, new Random(j));
        }

        public C12510a(int[] iArr, long j) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j));
        }

        private C12510a(int i, Random random) {
            this(createShuffledList(i, random), random);
        }

        private C12510a(int[] iArr, Random random) {
            this.f81167b = iArr;
            this.f81166a = random;
            this.f81168c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f81168c[iArr[i]] = i;
            }
        }
    }

    /* JADX INFO: renamed from: sbf$b */
    public static final class C12511b implements sbf {

        /* JADX INFO: renamed from: a */
        public final int f81169a;

        public C12511b(int i) {
            this.f81169a = i;
        }

        @Override // p000.sbf
        public sbf cloneAndClear() {
            return new C12511b(0);
        }

        @Override // p000.sbf
        public sbf cloneAndInsert(int i, int i2) {
            return new C12511b(this.f81169a + i2);
        }

        @Override // p000.sbf
        public sbf cloneAndRemove(int i, int i2) {
            return new C12511b((this.f81169a - i2) + i);
        }

        @Override // p000.sbf
        public int getFirstIndex() {
            return this.f81169a > 0 ? 0 : -1;
        }

        @Override // p000.sbf
        public int getLastIndex() {
            int i = this.f81169a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // p000.sbf
        public int getLength() {
            return this.f81169a;
        }

        @Override // p000.sbf
        public int getNextIndex(int i) {
            int i2 = i + 1;
            if (i2 < this.f81169a) {
                return i2;
            }
            return -1;
        }

        @Override // p000.sbf
        public int getPreviousIndex(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }
    }

    sbf cloneAndClear();

    sbf cloneAndInsert(int i, int i2);

    sbf cloneAndRemove(int i, int i2);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i);

    int getPreviousIndex(int i);
}
