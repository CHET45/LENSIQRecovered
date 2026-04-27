package p000;

import p000.hue;
import p000.p1b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class xsi implements oue {

    /* JADX INFO: renamed from: j */
    public static final String f99149j = "XingSeeker";

    /* JADX INFO: renamed from: d */
    public final long f99150d;

    /* JADX INFO: renamed from: e */
    public final int f99151e;

    /* JADX INFO: renamed from: f */
    public final long f99152f;

    /* JADX INFO: renamed from: g */
    public final long f99153g;

    /* JADX INFO: renamed from: h */
    public final long f99154h;

    /* JADX INFO: renamed from: i */
    @hib
    public final long[] f99155i;

    private xsi(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    @hib
    public static xsi create(long j, long j2, p1b.C10751a c10751a, ihc ihcVar) {
        int unsignedIntToInt;
        int i = c10751a.f69426g;
        int i2 = c10751a.f69423d;
        int i3 = ihcVar.readInt();
        if ((i3 & 1) != 1 || (unsignedIntToInt = ihcVar.readUnsignedIntToInt()) == 0) {
            return null;
        }
        long jScaleLargeTimestamp = x0i.scaleLargeTimestamp(unsignedIntToInt, ((long) i) * 1000000, i2);
        if ((i3 & 6) != 6) {
            return new xsi(j2, c10751a.f69422c, jScaleLargeTimestamp);
        }
        long unsignedInt = ihcVar.readUnsignedInt();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = ihcVar.readUnsignedByte();
        }
        if (j != -1) {
            long j3 = j2 + unsignedInt;
            if (j != j3) {
                yh9.m25919w("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new xsi(j2, c10751a.f69422c, jScaleLargeTimestamp, unsignedInt, jArr);
    }

    private long getTimeUsForTableIndex(int i) {
        return (this.f99152f * ((long) i)) / 100;
    }

    @Override // p000.oue
    public long getDataEndPosition() {
        return this.f99154h;
    }

    @Override // p000.hue
    public long getDurationUs() {
        return this.f99152f;
    }

    @Override // p000.hue
    public hue.C7023a getSeekPoints(long j) {
        if (!isSeekable()) {
            return new hue.C7023a(new kue(0L, this.f99150d + ((long) this.f99151e)));
        }
        long jConstrainValue = x0i.constrainValue(j, 0L, this.f99152f);
        double d = (jConstrainValue * 100.0d) / this.f99152f;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) u80.checkStateNotNull(this.f99155i))[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        return new hue.C7023a(new kue(jConstrainValue, this.f99150d + x0i.constrainValue(Math.round((d2 / 256.0d) * this.f99153g), this.f99151e, this.f99153g - 1)));
    }

    @Override // p000.oue
    public long getTimeUs(long j) {
        long j2 = j - this.f99150d;
        if (!isSeekable() || j2 <= this.f99151e) {
            return 0L;
        }
        long[] jArr = (long[]) u80.checkStateNotNull(this.f99155i);
        double d = (j2 * 256.0d) / this.f99153g;
        int iBinarySearchFloor = x0i.binarySearchFloor(jArr, (long) d, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(iBinarySearchFloor);
        long j3 = jArr[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i);
        return timeUsForTableIndex + Math.round((j3 == (iBinarySearchFloor == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (timeUsForTableIndex2 - timeUsForTableIndex));
    }

    @Override // p000.hue
    public boolean isSeekable() {
        return this.f99155i != null;
    }

    private xsi(long j, int i, long j2, long j3, @hib long[] jArr) {
        this.f99150d = j;
        this.f99151e = i;
        this.f99152f = j2;
        this.f99155i = jArr;
        this.f99153g = j3;
        this.f99154h = j3 != -1 ? j + j3 : -1L;
    }
}
