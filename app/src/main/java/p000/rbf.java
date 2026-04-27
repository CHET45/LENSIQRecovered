package p000;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public interface rbf {

    /* JADX INFO: renamed from: rbf$a */
    public static class C11995a implements rbf {

        /* JADX INFO: renamed from: a */
        public final Random f77689a;

        /* JADX INFO: renamed from: b */
        public final int[] f77690b;

        /* JADX INFO: renamed from: c */
        public final int[] f77691c;

        public C11995a(int i) {
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

        @Override // p000.rbf
        public rbf cloneAndClear() {
            return new C11995a(0, new Random(this.f77689a.nextLong()));
        }

        @Override // p000.rbf
        public rbf cloneAndInsert(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f77689a.nextInt(this.f77690b.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.f77689a.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f77690b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f77690b;
                if (i3 >= iArr4.length + i2) {
                    return new C11995a(iArr3, new Random(this.f77689a.nextLong()));
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

        @Override // p000.rbf
        public rbf cloneAndRemove(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f77690b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f77690b;
                if (i4 >= iArr2.length) {
                    return new C11995a(iArr, new Random(this.f77689a.nextLong()));
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

        @Override // p000.rbf
        public int getFirstIndex() {
            int[] iArr = this.f77690b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p000.rbf
        public int getLastIndex() {
            int[] iArr = this.f77690b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p000.rbf
        public int getLength() {
            return this.f77690b.length;
        }

        @Override // p000.rbf
        public int getNextIndex(int i) {
            int i2 = this.f77691c[i] + 1;
            int[] iArr = this.f77690b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // p000.rbf
        public int getPreviousIndex(int i) {
            int i2 = this.f77691c[i] - 1;
            if (i2 >= 0) {
                return this.f77690b[i2];
            }
            return -1;
        }

        public C11995a(int i, long j) {
            this(i, new Random(j));
        }

        public C11995a(int[] iArr, long j) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j));
        }

        private C11995a(int i, Random random) {
            this(createShuffledList(i, random), random);
        }

        private C11995a(int[] iArr, Random random) {
            this.f77690b = iArr;
            this.f77689a = random;
            this.f77691c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f77691c[iArr[i]] = i;
            }
        }
    }

    /* JADX INFO: renamed from: rbf$b */
    public static final class C11996b implements rbf {

        /* JADX INFO: renamed from: a */
        public final int f77692a;

        public C11996b(int i) {
            this.f77692a = i;
        }

        @Override // p000.rbf
        public rbf cloneAndClear() {
            return new C11996b(0);
        }

        @Override // p000.rbf
        public rbf cloneAndInsert(int i, int i2) {
            return new C11996b(this.f77692a + i2);
        }

        @Override // p000.rbf
        public rbf cloneAndRemove(int i, int i2) {
            return new C11996b((this.f77692a - i2) + i);
        }

        @Override // p000.rbf
        public int getFirstIndex() {
            return this.f77692a > 0 ? 0 : -1;
        }

        @Override // p000.rbf
        public int getLastIndex() {
            int i = this.f77692a;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // p000.rbf
        public int getLength() {
            return this.f77692a;
        }

        @Override // p000.rbf
        public int getNextIndex(int i) {
            int i2 = i + 1;
            if (i2 < this.f77692a) {
                return i2;
            }
            return -1;
        }

        @Override // p000.rbf
        public int getPreviousIndex(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }
    }

    rbf cloneAndClear();

    rbf cloneAndInsert(int i, int i2);

    default rbf cloneAndMove(int i, int i2, int i3) {
        return this;
    }

    rbf cloneAndRemove(int i, int i2);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i);

    int getPreviousIndex(int i);
}
