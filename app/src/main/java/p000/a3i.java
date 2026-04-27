package p000;

import p000.gue;
import p000.o1b;

/* JADX INFO: loaded from: classes3.dex */
public final class a3i implements nue {

    /* JADX INFO: renamed from: j */
    public static final String f335j = "VbriSeeker";

    /* JADX INFO: renamed from: d */
    public final long[] f336d;

    /* JADX INFO: renamed from: e */
    public final long[] f337e;

    /* JADX INFO: renamed from: f */
    public final long f338f;

    /* JADX INFO: renamed from: g */
    public final long f339g;

    /* JADX INFO: renamed from: h */
    public final long f340h;

    /* JADX INFO: renamed from: i */
    public final int f341i;

    private a3i(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.f336d = jArr;
        this.f337e = jArr2;
        this.f338f = j;
        this.f339g = j2;
        this.f340h = j3;
        this.f341i = i;
    }

    @hib
    public static a3i create(long j, long j2, o1b.C10138a c10138a, jhc jhcVar) {
        long jMax;
        int unsignedByte;
        jhcVar.skipBytes(6);
        int i = jhcVar.readInt();
        long j3 = j2 + ((long) c10138a.f66223c);
        long j4 = ((long) i) + j3;
        int i2 = jhcVar.readInt();
        if (i2 <= 0) {
            return null;
        }
        long jSampleCountToDurationUs = t0i.sampleCountToDurationUs((((long) i2) * ((long) c10138a.f66227g)) - 1, c10138a.f66224d);
        int unsignedShort = jhcVar.readUnsignedShort();
        int unsignedShort2 = jhcVar.readUnsignedShort();
        int unsignedShort3 = jhcVar.readUnsignedShort();
        jhcVar.skipBytes(2);
        int i3 = unsignedShort2;
        long j5 = j2 + ((long) c10138a.f66223c);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i4 = 0;
        while (i4 < unsignedShort) {
            long j6 = j3;
            long j7 = jSampleCountToDurationUs;
            jArr[i4] = (((long) i4) * jSampleCountToDurationUs) / ((long) unsignedShort);
            jArr2[i4] = j5;
            if (unsignedShort3 == 1) {
                unsignedByte = jhcVar.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = jhcVar.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = jhcVar.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return null;
                }
                unsignedByte = jhcVar.readUnsignedIntToInt();
            }
            int i5 = i3;
            j5 += ((long) unsignedByte) * ((long) i5);
            i4++;
            jArr = jArr;
            jArr2 = jArr2;
            j3 = j6;
            i3 = i5;
            jSampleCountToDurationUs = j7;
        }
        long j8 = jSampleCountToDurationUs;
        long j9 = j3;
        long[] jArr3 = jArr2;
        long[] jArr4 = jArr;
        if (j != -1 && j != j4) {
            xh9.m25148w("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        if (j4 != j5) {
            xh9.m25148w("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + j4 + ", " + j5 + "\nSeeking will be inaccurate.");
            jMax = Math.max(j4, j5);
        } else {
            jMax = j4;
        }
        return new a3i(jArr4, jArr3, j8, j9, jMax, c10138a.f66226f);
    }

    @Override // p000.nue
    public int getAverageBitrate() {
        return this.f341i;
    }

    @Override // p000.nue
    public long getDataEndPosition() {
        return this.f340h;
    }

    @Override // p000.nue
    public long getDataStartPosition() {
        return this.f339g;
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f338f;
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        int iBinarySearchFloor = t0i.binarySearchFloor(this.f336d, j, true, true);
        lue lueVar = new lue(this.f336d[iBinarySearchFloor], this.f337e[iBinarySearchFloor]);
        if (lueVar.f58833a >= j || iBinarySearchFloor == this.f336d.length - 1) {
            return new gue.C6548a(lueVar);
        }
        int i = iBinarySearchFloor + 1;
        return new gue.C6548a(lueVar, new lue(this.f336d[i], this.f337e[i]));
    }

    @Override // p000.nue
    public long getTimeUs(long j) {
        return this.f336d[t0i.binarySearchFloor(this.f337e, j, true, true)];
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return true;
    }
}
