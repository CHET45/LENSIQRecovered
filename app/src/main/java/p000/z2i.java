package p000;

import p000.hue;
import p000.p1b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z2i implements oue {

    /* JADX INFO: renamed from: h */
    public static final String f103913h = "VbriSeeker";

    /* JADX INFO: renamed from: d */
    public final long[] f103914d;

    /* JADX INFO: renamed from: e */
    public final long[] f103915e;

    /* JADX INFO: renamed from: f */
    public final long f103916f;

    /* JADX INFO: renamed from: g */
    public final long f103917g;

    private z2i(long[] jArr, long[] jArr2, long j, long j2) {
        this.f103914d = jArr;
        this.f103915e = jArr2;
        this.f103916f = j;
        this.f103917g = j2;
    }

    @hib
    public static z2i create(long j, long j2, p1b.C10751a c10751a, ihc ihcVar) {
        int unsignedByte;
        ihcVar.skipBytes(10);
        int i = ihcVar.readInt();
        if (i <= 0) {
            return null;
        }
        int i2 = c10751a.f69423d;
        long jScaleLargeTimestamp = x0i.scaleLargeTimestamp(i, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, i2);
        int unsignedShort = ihcVar.readUnsignedShort();
        int unsignedShort2 = ihcVar.readUnsignedShort();
        int unsignedShort3 = ihcVar.readUnsignedShort();
        ihcVar.skipBytes(2);
        long j3 = j2 + ((long) c10751a.f69422c);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i3 = 0;
        long j4 = j2;
        while (i3 < unsignedShort) {
            int i4 = unsignedShort2;
            long j5 = j3;
            jArr[i3] = (((long) i3) * jScaleLargeTimestamp) / ((long) unsignedShort);
            jArr2[i3] = Math.max(j4, j5);
            if (unsignedShort3 == 1) {
                unsignedByte = ihcVar.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = ihcVar.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = ihcVar.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return null;
                }
                unsignedByte = ihcVar.readUnsignedIntToInt();
            }
            j4 += ((long) unsignedByte) * ((long) i4);
            i3++;
            jArr = jArr;
            unsignedShort2 = i4;
            j3 = j5;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j4) {
            yh9.m25919w("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new z2i(jArr3, jArr2, jScaleLargeTimestamp, j4);
    }

    @Override // p000.oue
    public long getDataEndPosition() {
        return this.f103917g;
    }

    @Override // p000.hue
    public long getDurationUs() {
        return this.f103916f;
    }

    @Override // p000.hue
    public hue.C7023a getSeekPoints(long j) {
        int iBinarySearchFloor = x0i.binarySearchFloor(this.f103914d, j, true, true);
        kue kueVar = new kue(this.f103914d[iBinarySearchFloor], this.f103915e[iBinarySearchFloor]);
        if (kueVar.f55384a >= j || iBinarySearchFloor == this.f103914d.length - 1) {
            return new hue.C7023a(kueVar);
        }
        int i = iBinarySearchFloor + 1;
        return new hue.C7023a(kueVar, new kue(this.f103914d[i], this.f103915e[i]));
    }

    @Override // p000.oue
    public long getTimeUs(long j) {
        return this.f103914d[x0i.binarySearchFloor(this.f103915e, j, true, true)];
    }

    @Override // p000.hue
    public boolean isSeekable() {
        return true;
    }
}
