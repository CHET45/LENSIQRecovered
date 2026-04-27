package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zm0 implements tm0 {

    /* JADX INFO: renamed from: g */
    public static final String f105445g = "AviStreamHeaderChunk";

    /* JADX INFO: renamed from: a */
    public final int f105446a;

    /* JADX INFO: renamed from: b */
    public final int f105447b;

    /* JADX INFO: renamed from: c */
    public final int f105448c;

    /* JADX INFO: renamed from: d */
    public final int f105449d;

    /* JADX INFO: renamed from: e */
    public final int f105450e;

    /* JADX INFO: renamed from: f */
    public final int f105451f;

    private zm0(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f105446a = i;
        this.f105447b = i2;
        this.f105448c = i3;
        this.f105449d = i4;
        this.f105450e = i5;
        this.f105451f = i6;
    }

    public static zm0 parseFrom(ihc ihcVar) {
        int littleEndianInt = ihcVar.readLittleEndianInt();
        ihcVar.skipBytes(12);
        int littleEndianInt2 = ihcVar.readLittleEndianInt();
        int littleEndianInt3 = ihcVar.readLittleEndianInt();
        int littleEndianInt4 = ihcVar.readLittleEndianInt();
        ihcVar.skipBytes(4);
        int littleEndianInt5 = ihcVar.readLittleEndianInt();
        int littleEndianInt6 = ihcVar.readLittleEndianInt();
        ihcVar.skipBytes(8);
        return new zm0(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4, littleEndianInt5, littleEndianInt6);
    }

    public long getDurationUs() {
        return x0i.scaleLargeTimestamp(this.f105450e, ((long) this.f105448c) * 1000000, this.f105449d);
    }

    public float getFrameRate() {
        return this.f105449d / this.f105448c;
    }

    public int getTrackType() {
        int i = this.f105446a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        yh9.m25919w("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f105446a));
        return -1;
    }

    @Override // p000.tm0
    public int getType() {
        return 1752331379;
    }
}
