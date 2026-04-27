package p000;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class fvf {

    /* JADX INFO: renamed from: w */
    public static final int f37827w = 65;

    /* JADX INFO: renamed from: x */
    public static final int f37828x = 400;

    /* JADX INFO: renamed from: y */
    public static final int f37829y = 4000;

    /* JADX INFO: renamed from: z */
    public static final int f37830z = 2;

    /* JADX INFO: renamed from: a */
    public final int f37831a;

    /* JADX INFO: renamed from: b */
    public final int f37832b;

    /* JADX INFO: renamed from: c */
    public final float f37833c;

    /* JADX INFO: renamed from: d */
    public final float f37834d;

    /* JADX INFO: renamed from: e */
    public final float f37835e;

    /* JADX INFO: renamed from: f */
    public final int f37836f;

    /* JADX INFO: renamed from: g */
    public final int f37837g;

    /* JADX INFO: renamed from: h */
    public final int f37838h;

    /* JADX INFO: renamed from: i */
    public final short[] f37839i;

    /* JADX INFO: renamed from: j */
    public short[] f37840j;

    /* JADX INFO: renamed from: k */
    public int f37841k;

    /* JADX INFO: renamed from: l */
    public short[] f37842l;

    /* JADX INFO: renamed from: m */
    public int f37843m;

    /* JADX INFO: renamed from: n */
    public short[] f37844n;

    /* JADX INFO: renamed from: o */
    public int f37845o;

    /* JADX INFO: renamed from: p */
    public int f37846p;

    /* JADX INFO: renamed from: q */
    public int f37847q;

    /* JADX INFO: renamed from: r */
    public int f37848r;

    /* JADX INFO: renamed from: s */
    public int f37849s;

    /* JADX INFO: renamed from: t */
    public int f37850t;

    /* JADX INFO: renamed from: u */
    public int f37851u;

    /* JADX INFO: renamed from: v */
    public int f37852v;

    public fvf(int i, int i2, float f, float f2, int i3) {
        this.f37831a = i;
        this.f37832b = i2;
        this.f37833c = f;
        this.f37834d = f2;
        this.f37835e = i / i3;
        this.f37836f = i / 400;
        int i4 = i / 65;
        this.f37837g = i4;
        int i5 = i4 * 2;
        this.f37838h = i5;
        this.f37839i = new short[i5];
        this.f37840j = new short[i5 * i2];
        this.f37842l = new short[i5 * i2];
        this.f37844n = new short[i5 * i2];
    }

    private void adjustRate(float f, int i) {
        int i2;
        int i3;
        if (this.f37843m == i) {
            return;
        }
        int i4 = this.f37831a;
        int i5 = (int) (i4 / f);
        while (true) {
            if (i5 <= 16384 && i4 <= 16384) {
                break;
            }
            i5 /= 2;
            i4 /= 2;
        }
        moveNewSamplesToPitchBuffer(i);
        int i6 = 0;
        while (true) {
            int i7 = this.f37845o;
            if (i6 >= i7 - 1) {
                removePitchFrames(i7 - 1);
                return;
            }
            while (true) {
                i2 = this.f37846p;
                int i8 = (i2 + 1) * i5;
                i3 = this.f37847q;
                if (i8 <= i3 * i4) {
                    break;
                }
                this.f37842l = ensureSpaceForAdditionalFrames(this.f37842l, this.f37843m, 1);
                int i9 = 0;
                while (true) {
                    int i10 = this.f37832b;
                    if (i9 < i10) {
                        this.f37842l[(this.f37843m * i10) + i9] = interpolate(this.f37844n, (i10 * i6) + i9, i4, i5);
                        i9++;
                    }
                }
                this.f37847q++;
                this.f37843m++;
            }
            int i11 = i2 + 1;
            this.f37846p = i11;
            if (i11 == i4) {
                this.f37846p = 0;
                u80.checkState(i3 == i5);
                this.f37847q = 0;
            }
            i6++;
        }
    }

    private void changeSpeed(float f) {
        int iSkipPitchPeriod;
        int i = this.f37841k;
        if (i < this.f37838h) {
            return;
        }
        int i2 = 0;
        do {
            if (this.f37848r > 0) {
                iSkipPitchPeriod = copyInputToOutput(i2);
            } else {
                int iFindPitchPeriod = findPitchPeriod(this.f37840j, i2);
                iSkipPitchPeriod = ((double) f) > 1.0d ? iFindPitchPeriod + skipPitchPeriod(this.f37840j, i2, f, iFindPitchPeriod) : insertPitchPeriod(this.f37840j, i2, f, iFindPitchPeriod);
            }
            i2 += iSkipPitchPeriod;
        } while (this.f37838h + i2 <= i);
        removeProcessedInputFrames(i2);
    }

    private int copyInputToOutput(int i) {
        int iMin = Math.min(this.f37838h, this.f37848r);
        copyToOutput(this.f37840j, i, iMin);
        this.f37848r -= iMin;
        return iMin;
    }

    private void copyToOutput(short[] sArr, int i, int i2) {
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.f37842l, this.f37843m, i2);
        this.f37842l = sArrEnsureSpaceForAdditionalFrames;
        int i3 = this.f37832b;
        System.arraycopy(sArr, i * i3, sArrEnsureSpaceForAdditionalFrames, this.f37843m * i3, i3 * i2);
        this.f37843m += i2;
    }

    private void downSampleInput(short[] sArr, int i, int i2) {
        int i3 = this.f37838h / i2;
        int i4 = this.f37832b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f37839i[i7] = (short) (i8 / i5);
        }
    }

    private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f37832b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    private int findPitchPeriod(short[] sArr, int i) {
        int iFindPitchPeriodInRange;
        int i2 = this.f37831a;
        int i3 = i2 > 4000 ? i2 / 4000 : 1;
        if (this.f37832b == 1 && i3 == 1) {
            iFindPitchPeriodInRange = findPitchPeriodInRange(sArr, i, this.f37836f, this.f37837g);
        } else {
            downSampleInput(sArr, i, i3);
            int iFindPitchPeriodInRange2 = findPitchPeriodInRange(this.f37839i, 0, this.f37836f / i3, this.f37837g / i3);
            if (i3 != 1) {
                int i4 = iFindPitchPeriodInRange2 * i3;
                int i5 = i3 * 4;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                int i8 = this.f37836f;
                if (i6 < i8) {
                    i6 = i8;
                }
                int i9 = this.f37837g;
                if (i7 > i9) {
                    i7 = i9;
                }
                if (this.f37832b == 1) {
                    iFindPitchPeriodInRange = findPitchPeriodInRange(sArr, i, i6, i7);
                } else {
                    downSampleInput(sArr, i, 1);
                    iFindPitchPeriodInRange = findPitchPeriodInRange(this.f37839i, 0, i6, i7);
                }
            } else {
                iFindPitchPeriodInRange = iFindPitchPeriodInRange2;
            }
        }
        int i10 = previousPeriodBetter(this.f37851u, this.f37852v) ? this.f37849s : iFindPitchPeriodInRange;
        this.f37850t = this.f37851u;
        this.f37849s = iFindPitchPeriodInRange;
        return i10;
    }

    private int findPitchPeriodInRange(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f37832b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f37851u = i6 / i7;
        this.f37852v = i8 / i5;
        return i7;
    }

    private int insertPitchPeriod(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((i2 * f) / (1.0f - f));
        } else {
            this.f37848r = (int) ((i2 * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.f37842l, this.f37843m, i4);
        this.f37842l = sArrEnsureSpaceForAdditionalFrames;
        int i5 = this.f37832b;
        System.arraycopy(sArr, i * i5, sArrEnsureSpaceForAdditionalFrames, this.f37843m * i5, i5 * i2);
        overlapAdd(i3, this.f37832b, this.f37842l, this.f37843m + i2, sArr, i + i2, sArr, i);
        this.f37843m += i4;
        return i3;
    }

    private short interpolate(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f37832b];
        int i4 = this.f37847q * i2;
        int i5 = this.f37846p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    private void moveNewSamplesToPitchBuffer(int i) {
        int i2 = this.f37843m - i;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.f37844n, this.f37845o, i2);
        this.f37844n = sArrEnsureSpaceForAdditionalFrames;
        short[] sArr = this.f37842l;
        int i3 = this.f37832b;
        System.arraycopy(sArr, i * i3, sArrEnsureSpaceForAdditionalFrames, this.f37845o * i3, i3 * i2);
        this.f37843m = i;
        this.f37845o += i2;
    }

    private static void overlapAdd(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    private boolean previousPeriodBetter(int i, int i2) {
        return i != 0 && this.f37849s != 0 && i2 <= i * 3 && i * 2 > this.f37850t * 3;
    }

    private void processStreamInput() {
        int i = this.f37843m;
        float f = this.f37833c;
        float f2 = this.f37834d;
        float f3 = f / f2;
        float f4 = this.f37835e * f2;
        double d = f3;
        if (d > 1.00001d || d < 0.99999d) {
            changeSpeed(f3);
        } else {
            copyToOutput(this.f37840j, 0, this.f37841k);
            this.f37841k = 0;
        }
        if (f4 != 1.0f) {
            adjustRate(f4, i);
        }
    }

    private void removePitchFrames(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f37844n;
        int i2 = this.f37832b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f37845o - i) * i2);
        this.f37845o -= i;
    }

    private void removeProcessedInputFrames(int i) {
        int i2 = this.f37841k - i;
        short[] sArr = this.f37840j;
        int i3 = this.f37832b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f37841k = i2;
    }

    private int skipPitchPeriod(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (i2 / (f - 1.0f));
        } else {
            this.f37848r = (int) ((i2 * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.f37842l, this.f37843m, i3);
        this.f37842l = sArrEnsureSpaceForAdditionalFrames;
        overlapAdd(i3, this.f37832b, sArrEnsureSpaceForAdditionalFrames, this.f37843m, sArr, i, sArr, i + i2);
        this.f37843m += i3;
        return i3;
    }

    public void flush() {
        this.f37841k = 0;
        this.f37843m = 0;
        this.f37845o = 0;
        this.f37846p = 0;
        this.f37847q = 0;
        this.f37848r = 0;
        this.f37849s = 0;
        this.f37850t = 0;
        this.f37851u = 0;
        this.f37852v = 0;
    }

    public void getOutput(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f37832b, this.f37843m);
        shortBuffer.put(this.f37842l, 0, this.f37832b * iMin);
        int i = this.f37843m - iMin;
        this.f37843m = i;
        short[] sArr = this.f37842l;
        int i2 = this.f37832b;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public int getOutputSize() {
        return this.f37843m * this.f37832b * 2;
    }

    public int getPendingInputBytes() {
        return this.f37841k * this.f37832b * 2;
    }

    public void queueEndOfStream() {
        int i;
        int i2 = this.f37841k;
        float f = this.f37833c;
        float f2 = this.f37834d;
        int i3 = this.f37843m + ((int) ((((i2 / (f / f2)) + this.f37845o) / (this.f37835e * f2)) + 0.5f));
        this.f37840j = ensureSpaceForAdditionalFrames(this.f37840j, i2, (this.f37838h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f37838h;
            int i5 = this.f37832b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f37840j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f37841k += i * 2;
        processStreamInput();
        if (this.f37843m > i3) {
            this.f37843m = i3;
        }
        this.f37841k = 0;
        this.f37848r = 0;
        this.f37845o = 0;
    }

    public void queueInput(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f37832b;
        int i2 = iRemaining / i;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.f37840j, this.f37841k, i2);
        this.f37840j = sArrEnsureSpaceForAdditionalFrames;
        shortBuffer.get(sArrEnsureSpaceForAdditionalFrames, this.f37841k * this.f37832b, ((i * i2) * 2) / 2);
        this.f37841k += i2;
        processStreamInput();
    }
}
