package p000;

import org.apache.commons.compress.archivers.zip.UnixStat;
import p000.o1b;

/* JADX INFO: loaded from: classes3.dex */
public final class wsi {

    /* JADX INFO: renamed from: a */
    public final o1b.C10138a f95459a;

    /* JADX INFO: renamed from: b */
    public final long f95460b;

    /* JADX INFO: renamed from: c */
    public final long f95461c;

    /* JADX INFO: renamed from: d */
    public final int f95462d;

    /* JADX INFO: renamed from: e */
    public final int f95463e;

    /* JADX INFO: renamed from: f */
    @hib
    public final long[] f95464f;

    private wsi(o1b.C10138a c10138a, long j, long j2, @hib long[] jArr, int i, int i2) {
        this.f95459a = new o1b.C10138a(c10138a);
        this.f95460b = j;
        this.f95461c = j2;
        this.f95464f = jArr;
        this.f95462d = i;
        this.f95463e = i2;
    }

    public static wsi parse(o1b.C10138a c10138a, jhc jhcVar) {
        long[] jArr;
        int i;
        int i2;
        int i3 = jhcVar.readInt();
        int unsignedIntToInt = (i3 & 1) != 0 ? jhcVar.readUnsignedIntToInt() : -1;
        long unsignedInt = (i3 & 2) != 0 ? jhcVar.readUnsignedInt() : -1L;
        if ((i3 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                jArr2[i4] = jhcVar.readUnsignedByte();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((i3 & 8) != 0) {
            jhcVar.skipBytes(4);
        }
        if (jhcVar.bytesLeft() >= 24) {
            jhcVar.skipBytes(21);
            int unsignedInt24 = jhcVar.readUnsignedInt24();
            i2 = unsignedInt24 & UnixStat.PERM_MASK;
            i = (16773120 & unsignedInt24) >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new wsi(c10138a, unsignedIntToInt, unsignedInt, jArr, i, i2);
    }

    public long computeDurationUs() {
        long j = this.f95460b;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        o1b.C10138a c10138a = this.f95459a;
        return t0i.sampleCountToDurationUs((j * ((long) c10138a.f66227g)) - 1, c10138a.f66224d);
    }
}
