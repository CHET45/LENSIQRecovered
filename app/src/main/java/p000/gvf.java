package p000;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class gvf {

    /* JADX INFO: renamed from: A */
    public static final int f41487A = 2;

    /* JADX INFO: renamed from: B */
    public static final float f41488B = 1.00001f;

    /* JADX INFO: renamed from: C */
    public static final float f41489C = 0.99999f;

    /* JADX INFO: renamed from: x */
    public static final int f41490x = 65;

    /* JADX INFO: renamed from: y */
    public static final int f41491y = 400;

    /* JADX INFO: renamed from: z */
    public static final int f41492z = 4000;

    /* JADX INFO: renamed from: a */
    public final int f41493a;

    /* JADX INFO: renamed from: b */
    public final int f41494b;

    /* JADX INFO: renamed from: c */
    public final float f41495c;

    /* JADX INFO: renamed from: d */
    public final float f41496d;

    /* JADX INFO: renamed from: e */
    public final float f41497e;

    /* JADX INFO: renamed from: f */
    public final int f41498f;

    /* JADX INFO: renamed from: g */
    public final int f41499g;

    /* JADX INFO: renamed from: h */
    public final int f41500h;

    /* JADX INFO: renamed from: i */
    public final short[] f41501i;

    /* JADX INFO: renamed from: j */
    public short[] f41502j;

    /* JADX INFO: renamed from: k */
    public int f41503k;

    /* JADX INFO: renamed from: l */
    public short[] f41504l;

    /* JADX INFO: renamed from: m */
    public int f41505m;

    /* JADX INFO: renamed from: n */
    public short[] f41506n;

    /* JADX INFO: renamed from: o */
    public int f41507o;

    /* JADX INFO: renamed from: p */
    public int f41508p;

    /* JADX INFO: renamed from: q */
    public int f41509q;

    /* JADX INFO: renamed from: r */
    public int f41510r;

    /* JADX INFO: renamed from: s */
    public int f41511s;

    /* JADX INFO: renamed from: t */
    public int f41512t;

    /* JADX INFO: renamed from: u */
    public int f41513u;

    /* JADX INFO: renamed from: v */
    public int f41514v;

    /* JADX INFO: renamed from: w */
    public double f41515w;

    public gvf(int i, int i2, float f, float f2, int i3) {
        this.f41493a = i;
        this.f41494b = i2;
        this.f41495c = f;
        this.f41496d = f2;
        this.f41497e = i / i3;
        this.f41498f = i / 400;
        int i4 = i / 65;
        this.f41499g = i4;
        int i5 = i4 * 2;
        this.f41500h = i5;
        this.f41501i = new short[i5];
        this.f41502j = new short[i5 * i2];
        this.f41504l = new short[i5 * i2];
        this.f41506n = new short[i5 * i2];
    }

    /* JADX INFO: renamed from: a */
    public static long m12004a(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.HALF_EVEN;
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, 20, roundingMode);
        BigDecimal bigDecimalDivide2 = bigDecimal2.divide(bigDecimal3, 20, roundingMode);
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        return bigDecimalDivide.multiply(bigDecimalDivide2.subtract(bigDecimalDivide2.setScale(0, roundingMode2))).setScale(0, roundingMode2).longValueExact();
    }

    private void adjustRate(float f, int i) {
        int i2;
        int i3;
        if (this.f41505m == i) {
            return;
        }
        int i4 = this.f41493a;
        long j = (long) (i4 / f);
        long j2 = i4;
        while (j != 0 && j2 != 0 && j % 2 == 0 && j2 % 2 == 0) {
            j /= 2;
            j2 /= 2;
        }
        moveNewSamplesToPitchBuffer(i);
        int i5 = 0;
        while (true) {
            int i6 = this.f41507o;
            if (i5 >= i6 - 1) {
                removePitchFrames(i6 - 1);
                return;
            }
            while (true) {
                i2 = this.f41508p;
                long j3 = ((long) (i2 + 1)) * j;
                i3 = this.f41509q;
                if (j3 <= ((long) i3) * j2) {
                    break;
                }
                this.f41504l = ensureSpaceForAdditionalFrames(this.f41504l, this.f41505m, 1);
                int i7 = 0;
                while (true) {
                    int i8 = this.f41494b;
                    if (i7 < i8) {
                        this.f41504l[(this.f41505m * i8) + i7] = interpolate(this.f41506n, (i8 * i5) + i7, j2, j);
                        i7++;
                    }
                }
                this.f41509q++;
                this.f41505m++;
            }
            int i9 = i2 + 1;
            this.f41508p = i9;
            if (i9 == j2) {
                this.f41508p = 0;
                v80.checkState(((long) i3) == j);
                this.f41509q = 0;
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m12005b(int i, int i2, float f, float f2, long j) {
        long frameCountBeforeResamplingForOutputCount = getFrameCountBeforeResamplingForOutputCount(BigDecimal.valueOf(i), new BigDecimal(String.valueOf((i / i2) * f2)), BigDecimal.valueOf(j));
        double d = f / f2;
        return (d > 1.0000100135803223d || d < 0.9999899864196777d) ? BigDecimal.valueOf(frameCountBeforeResamplingForOutputCount).multiply(BigDecimal.valueOf(d)).setScale(0, RoundingMode.FLOOR).longValueExact() : frameCountBeforeResamplingForOutputCount;
    }

    private void changeSpeed(double d) {
        int iInsertPitchPeriod;
        int i = this.f41503k;
        if (i < this.f41500h) {
            return;
        }
        int iSkipPitchPeriod = 0;
        do {
            if (this.f41510r > 0) {
                iInsertPitchPeriod = copyInputToOutput(iSkipPitchPeriod);
            } else {
                int iFindPitchPeriod = findPitchPeriod(this.f41502j, iSkipPitchPeriod);
                if (d > 1.0d) {
                    iSkipPitchPeriod += iFindPitchPeriod + skipPitchPeriod(this.f41502j, iSkipPitchPeriod, d, iFindPitchPeriod);
                } else {
                    iInsertPitchPeriod = insertPitchPeriod(this.f41502j, iSkipPitchPeriod, d, iFindPitchPeriod);
                }
            }
            iSkipPitchPeriod += iInsertPitchPeriod;
        } while (this.f41500h + iSkipPitchPeriod <= i);
        removeProcessedInputFrames(iSkipPitchPeriod);
    }

    private int copyInputToOutput(int i) {
        int iMin = Math.min(this.f41500h, this.f41510r);
        copyToOutput(this.f41502j, i, iMin);
        this.f41510r -= iMin;
        return iMin;
    }

    private void copyToOutput(short[] sArr, int i, int i2) {
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.f41504l, this.f41505m, i2);
        this.f41504l = sArrEnsureSpaceForAdditionalFrames;
        int i3 = this.f41494b;
        System.arraycopy(sArr, i * i3, sArrEnsureSpaceForAdditionalFrames, this.f41505m * i3, i3 * i2);
        this.f41505m += i2;
    }

    private void downSampleInput(short[] sArr, int i, int i2) {
        int i3 = this.f41500h / i2;
        int i4 = this.f41494b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f41501i[i7] = (short) (i8 / i5);
        }
    }

    private short[] ensureSpaceForAdditionalFrames(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f41494b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    private int findPitchPeriod(short[] sArr, int i) {
        int iFindPitchPeriodInRange;
        int i2 = this.f41493a;
        int i3 = i2 > 4000 ? i2 / 4000 : 1;
        if (this.f41494b == 1 && i3 == 1) {
            iFindPitchPeriodInRange = findPitchPeriodInRange(sArr, i, this.f41498f, this.f41499g);
        } else {
            downSampleInput(sArr, i, i3);
            int iFindPitchPeriodInRange2 = findPitchPeriodInRange(this.f41501i, 0, this.f41498f / i3, this.f41499g / i3);
            if (i3 != 1) {
                int i4 = iFindPitchPeriodInRange2 * i3;
                int i5 = i3 * 4;
                int i6 = i4 - i5;
                int i7 = i4 + i5;
                int i8 = this.f41498f;
                if (i6 < i8) {
                    i6 = i8;
                }
                int i9 = this.f41499g;
                if (i7 > i9) {
                    i7 = i9;
                }
                if (this.f41494b == 1) {
                    iFindPitchPeriodInRange = findPitchPeriodInRange(sArr, i, i6, i7);
                } else {
                    downSampleInput(sArr, i, 1);
                    iFindPitchPeriodInRange = findPitchPeriodInRange(this.f41501i, 0, i6, i7);
                }
            } else {
                iFindPitchPeriodInRange = iFindPitchPeriodInRange2;
            }
        }
        int i10 = previousPeriodBetter(this.f41513u, this.f41514v) ? this.f41511s : iFindPitchPeriodInRange;
        this.f41512t = this.f41513u;
        this.f41511s = iFindPitchPeriodInRange;
        return i10;
    }

    private int findPitchPeriodInRange(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f41494b;
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
        this.f41513u = i6 / i7;
        this.f41514v = i8 / i5;
        return i7;
    }

    public static long getExpectedFrameCountAfterProcessorApplied(int i, int i2, float f, float f2, long j) {
        float f3 = (i / i2) * f2;
        double d = f / f2;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(f3));
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            bigDecimalValueOf = bigDecimalValueOf.divide(BigDecimal.valueOf(d), RoundingMode.HALF_EVEN);
        }
        return f3 == 1.0f ? bigDecimalValueOf.longValueExact() : bigDecimalValueOf.divide(bigDecimal, RoundingMode.HALF_EVEN).longValueExact() - m12004a(bigDecimalValueOf, BigDecimal.valueOf(i), bigDecimal);
    }

    private static long getFrameCountBeforeResamplingForOutputCount(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        RoundingMode roundingMode = RoundingMode.FLOOR;
        return bigDecimal.multiply(bigDecimal3).divide(bigDecimal.divide(bigDecimal2, 0, roundingMode), 0, roundingMode).longValueExact();
    }

    private int insertPitchPeriod(short[] sArr, int i, double d, int i2) {
        int i3;
        if (d < 0.5d) {
            double d2 = ((((double) i2) * d) / (1.0d - d)) + this.f41515w;
            int iRound = (int) Math.round(d2);
            this.f41515w = d2 - ((double) iRound);
            i3 = iRound;
        } else {
            double d3 = ((((double) i2) * ((2.0d * d) - 1.0d)) / (1.0d - d)) + this.f41515w;
            int iRound2 = (int) Math.round(d3);
            this.f41510r = iRound2;
            this.f41515w = d3 - ((double) iRound2);
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.f41504l, this.f41505m, i4);
        this.f41504l = sArrEnsureSpaceForAdditionalFrames;
        int i5 = this.f41494b;
        System.arraycopy(sArr, i * i5, sArrEnsureSpaceForAdditionalFrames, this.f41505m * i5, i5 * i2);
        overlapAdd(i3, this.f41494b, this.f41504l, this.f41505m + i2, sArr, i + i2, sArr, i);
        this.f41505m += i4;
        return i3;
    }

    private short interpolate(short[] sArr, int i, long j, long j2) {
        short s = sArr[i];
        short s2 = sArr[i + this.f41494b];
        long j3 = ((long) this.f41509q) * j;
        int i2 = this.f41508p;
        long j4 = ((long) i2) * j2;
        long j5 = ((long) (i2 + 1)) * j2;
        long j6 = j5 - j3;
        long j7 = j5 - j4;
        return (short) (((((long) s) * j6) + ((j7 - j6) * ((long) s2))) / j7);
    }

    private void moveNewSamplesToPitchBuffer(int i) {
        int i2 = this.f41505m - i;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.f41506n, this.f41507o, i2);
        this.f41506n = sArrEnsureSpaceForAdditionalFrames;
        short[] sArr = this.f41504l;
        int i3 = this.f41494b;
        System.arraycopy(sArr, i * i3, sArrEnsureSpaceForAdditionalFrames, this.f41507o * i3, i3 * i2);
        this.f41505m = i;
        this.f41507o += i2;
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
        return i != 0 && this.f41511s != 0 && i2 <= i * 3 && i * 2 > this.f41512t * 3;
    }

    private void processStreamInput() {
        int i = this.f41505m;
        float f = this.f41495c;
        float f2 = this.f41496d;
        double d = f / f2;
        float f3 = this.f41497e * f2;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            changeSpeed(d);
        } else {
            copyToOutput(this.f41502j, 0, this.f41503k);
            this.f41503k = 0;
        }
        if (f3 != 1.0f) {
            adjustRate(f3, i);
        }
    }

    private void removePitchFrames(int i) {
        if (i == 0) {
            return;
        }
        short[] sArr = this.f41506n;
        int i2 = this.f41494b;
        System.arraycopy(sArr, i * i2, sArr, 0, (this.f41507o - i) * i2);
        this.f41507o -= i;
    }

    private void removeProcessedInputFrames(int i) {
        int i2 = this.f41503k - i;
        short[] sArr = this.f41502j;
        int i3 = this.f41494b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f41503k = i2;
    }

    private int skipPitchPeriod(short[] sArr, int i, double d, int i2) {
        int iRound;
        if (d >= 2.0d) {
            double d2 = (((double) i2) / (d - 1.0d)) + this.f41515w;
            iRound = (int) Math.round(d2);
            this.f41515w = d2 - ((double) iRound);
        } else {
            double d3 = ((((double) i2) * (2.0d - d)) / (d - 1.0d)) + this.f41515w;
            int iRound2 = (int) Math.round(d3);
            this.f41510r = iRound2;
            this.f41515w = d3 - ((double) iRound2);
            iRound = i2;
        }
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.f41504l, this.f41505m, iRound);
        this.f41504l = sArrEnsureSpaceForAdditionalFrames;
        overlapAdd(iRound, this.f41494b, sArrEnsureSpaceForAdditionalFrames, this.f41505m, sArr, i, sArr, i + i2);
        this.f41505m += iRound;
        return iRound;
    }

    public void flush() {
        this.f41503k = 0;
        this.f41505m = 0;
        this.f41507o = 0;
        this.f41508p = 0;
        this.f41509q = 0;
        this.f41510r = 0;
        this.f41511s = 0;
        this.f41512t = 0;
        this.f41513u = 0;
        this.f41514v = 0;
        this.f41515w = 0.0d;
    }

    public void getOutput(ShortBuffer shortBuffer) {
        v80.checkState(this.f41505m >= 0);
        int iMin = Math.min(shortBuffer.remaining() / this.f41494b, this.f41505m);
        shortBuffer.put(this.f41504l, 0, this.f41494b * iMin);
        int i = this.f41505m - iMin;
        this.f41505m = i;
        short[] sArr = this.f41504l;
        int i2 = this.f41494b;
        System.arraycopy(sArr, iMin * i2, sArr, 0, i * i2);
    }

    public int getOutputSize() {
        v80.checkState(this.f41505m >= 0);
        return this.f41505m * this.f41494b * 2;
    }

    public int getPendingInputBytes() {
        return this.f41503k * this.f41494b * 2;
    }

    public void queueEndOfStream() {
        int i;
        int i2 = this.f41503k;
        float f = this.f41495c;
        float f2 = this.f41496d;
        double d = f / f2;
        double d2 = this.f41497e * f2;
        int i3 = this.f41510r;
        int i4 = this.f41505m + ((int) ((((((((double) (i2 - i3)) / d) + ((double) i3)) + this.f41515w) + ((double) this.f41507o)) / d2) + 0.5d));
        this.f41515w = 0.0d;
        this.f41502j = ensureSpaceForAdditionalFrames(this.f41502j, i2, (this.f41500h * 2) + i2);
        int i5 = 0;
        while (true) {
            i = this.f41500h;
            int i6 = this.f41494b;
            if (i5 >= i * 2 * i6) {
                break;
            }
            this.f41502j[(i6 * i2) + i5] = 0;
            i5++;
        }
        this.f41503k += i * 2;
        processStreamInput();
        if (this.f41505m > i4) {
            this.f41505m = Math.max(i4, 0);
        }
        this.f41503k = 0;
        this.f41510r = 0;
        this.f41507o = 0;
    }

    public void queueInput(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f41494b;
        int i2 = iRemaining / i;
        short[] sArrEnsureSpaceForAdditionalFrames = ensureSpaceForAdditionalFrames(this.f41502j, this.f41503k, i2);
        this.f41502j = sArrEnsureSpaceForAdditionalFrames;
        shortBuffer.get(sArrEnsureSpaceForAdditionalFrames, this.f41503k * this.f41494b, ((i * i2) * 2) / 2);
        this.f41503k += i2;
        processStreamInput();
    }
}
