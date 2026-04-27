package p000;

import p000.gue;
import p000.o1b;

/* JADX INFO: loaded from: classes3.dex */
public final class ysi implements nue {

    /* JADX INFO: renamed from: k */
    public static final String f102919k = "XingSeeker";

    /* JADX INFO: renamed from: d */
    public final long f102920d;

    /* JADX INFO: renamed from: e */
    public final int f102921e;

    /* JADX INFO: renamed from: f */
    public final long f102922f;

    /* JADX INFO: renamed from: g */
    public final int f102923g;

    /* JADX INFO: renamed from: h */
    public final long f102924h;

    /* JADX INFO: renamed from: i */
    public final long f102925i;

    /* JADX INFO: renamed from: j */
    @hib
    public final long[] f102926j;

    private ysi(long j, int i, long j2, int i2, long j3, @hib long[] jArr) {
        this.f102920d = j;
        this.f102921e = i;
        this.f102922f = j2;
        this.f102923g = i2;
        this.f102924h = j3;
        this.f102926j = jArr;
        this.f102925i = j3 != -1 ? j + j3 : -1L;
    }

    @hib
    public static ysi create(wsi wsiVar, long j) {
        long jComputeDurationUs = wsiVar.computeDurationUs();
        if (jComputeDurationUs == -9223372036854775807L) {
            return null;
        }
        o1b.C10138a c10138a = wsiVar.f95459a;
        return new ysi(j, c10138a.f66223c, jComputeDurationUs, c10138a.f66226f, wsiVar.f95461c, wsiVar.f95464f);
    }

    private long getTimeUsForTableIndex(int i) {
        return (this.f102922f * ((long) i)) / 100;
    }

    @Override // p000.nue
    public int getAverageBitrate() {
        return this.f102923g;
    }

    @Override // p000.nue
    public long getDataEndPosition() {
        return this.f102925i;
    }

    @Override // p000.nue
    public long getDataStartPosition() {
        return this.f102920d + ((long) this.f102921e);
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f102922f;
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        if (!isSeekable()) {
            return new gue.C6548a(new lue(0L, this.f102920d + ((long) this.f102921e)));
        }
        long jConstrainValue = t0i.constrainValue(j, 0L, this.f102922f);
        double d = (jConstrainValue * 100.0d) / this.f102922f;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) v80.checkStateNotNull(this.f102926j))[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        return new gue.C6548a(new lue(jConstrainValue, this.f102920d + t0i.constrainValue(Math.round((d2 / 256.0d) * this.f102924h), this.f102921e, this.f102924h - 1)));
    }

    @Override // p000.nue
    public long getTimeUs(long j) {
        long j2 = j - this.f102920d;
        if (!isSeekable() || j2 <= this.f102921e) {
            return 0L;
        }
        long[] jArr = (long[]) v80.checkStateNotNull(this.f102926j);
        double d = (j2 * 256.0d) / this.f102924h;
        int iBinarySearchFloor = t0i.binarySearchFloor(jArr, (long) d, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j3 = jArr[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i);
        return timeUsForTableIndex + Math.round((j3 == (iBinarySearchFloor == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (timeUsForTableIndex2 - timeUsForTableIndex));
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return this.f102926j != null;
    }
}
