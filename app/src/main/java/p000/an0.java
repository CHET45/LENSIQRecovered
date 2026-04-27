package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class an0 implements um0 {

    /* JADX INFO: renamed from: h */
    public static final String f2132h = "AviStreamHeaderChunk";

    /* JADX INFO: renamed from: a */
    public final int f2133a;

    /* JADX INFO: renamed from: b */
    public final int f2134b;

    /* JADX INFO: renamed from: c */
    public final int f2135c;

    /* JADX INFO: renamed from: d */
    public final int f2136d;

    /* JADX INFO: renamed from: e */
    public final int f2137e;

    /* JADX INFO: renamed from: f */
    public final int f2138f;

    /* JADX INFO: renamed from: g */
    public final int f2139g;

    private an0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f2133a = i;
        this.f2134b = i2;
        this.f2135c = i3;
        this.f2136d = i4;
        this.f2137e = i5;
        this.f2138f = i6;
        this.f2139g = i7;
    }

    public static an0 parseFrom(jhc jhcVar) {
        int littleEndianInt = jhcVar.readLittleEndianInt();
        jhcVar.skipBytes(12);
        int littleEndianInt2 = jhcVar.readLittleEndianInt();
        int littleEndianInt3 = jhcVar.readLittleEndianInt();
        int littleEndianInt4 = jhcVar.readLittleEndianInt();
        jhcVar.skipBytes(4);
        int littleEndianInt5 = jhcVar.readLittleEndianInt();
        int littleEndianInt6 = jhcVar.readLittleEndianInt();
        jhcVar.skipBytes(4);
        return new an0(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4, littleEndianInt5, littleEndianInt6, jhcVar.readLittleEndianInt());
    }

    public long getDurationUs() {
        return t0i.scaleLargeTimestamp(this.f2137e, ((long) this.f2135c) * 1000000, this.f2136d);
    }

    public float getFrameRate() {
        return this.f2136d / this.f2135c;
    }

    public int getTrackType() {
        int i = this.f2133a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        xh9.m25148w("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f2133a));
        return -1;
    }

    @Override // p000.um0
    public int getType() {
        return 1752331379;
    }
}
