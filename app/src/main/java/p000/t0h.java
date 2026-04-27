package p000;

import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class t0h extends myf {

    /* JADX INFO: renamed from: a */
    public final long f83314a;

    /* JADX INFO: renamed from: b */
    public final long f83315b;

    private t0h(long j, long j2) {
        this.f83314a = j;
        this.f83315b = j2;
    }

    /* JADX INFO: renamed from: a */
    public static t0h m22308a(jhc jhcVar, long j, h2h h2hVar) {
        long jM22309b = m22309b(jhcVar, j);
        return new t0h(jM22309b, h2hVar.adjustTsTimestamp(jM22309b));
    }

    /* JADX INFO: renamed from: b */
    public static long m22309b(jhc jhcVar, long j) {
        long unsignedByte = jhcVar.readUnsignedByte();
        if ((128 & unsignedByte) != 0) {
            return TarConstants.MAXSIZE & ((((unsignedByte & 1) << 32) | jhcVar.readUnsignedInt()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // p000.myf
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f83314a + ", playbackPositionUs= " + this.f83315b + " }";
    }
}
