package p000;

import p000.dkh;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class fr7 implements cy4 {

    /* JADX INFO: renamed from: g */
    public static final String f37554g = "Id3Reader";

    /* JADX INFO: renamed from: b */
    public r6h f37556b;

    /* JADX INFO: renamed from: c */
    public boolean f37557c;

    /* JADX INFO: renamed from: e */
    public int f37559e;

    /* JADX INFO: renamed from: f */
    public int f37560f;

    /* JADX INFO: renamed from: a */
    public final ihc f37555a = new ihc(10);

    /* JADX INFO: renamed from: d */
    public long f37558d = -9223372036854775807L;

    @Override // p000.cy4
    public void consume(ihc ihcVar) {
        u80.checkStateNotNull(this.f37556b);
        if (this.f37557c) {
            int iBytesLeft = ihcVar.bytesLeft();
            int i = this.f37560f;
            if (i < 10) {
                int iMin = Math.min(iBytesLeft, 10 - i);
                System.arraycopy(ihcVar.getData(), ihcVar.getPosition(), this.f37555a.getData(), this.f37560f, iMin);
                if (this.f37560f + iMin == 10) {
                    this.f37555a.setPosition(0);
                    if (73 != this.f37555a.readUnsignedByte() || 68 != this.f37555a.readUnsignedByte() || 51 != this.f37555a.readUnsignedByte()) {
                        yh9.m25919w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f37557c = false;
                        return;
                    } else {
                        this.f37555a.skipBytes(3);
                        this.f37559e = this.f37555a.readSynchSafeInt() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iBytesLeft, this.f37559e - this.f37560f);
            this.f37556b.sampleData(ihcVar, iMin2);
            this.f37560f += iMin2;
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        c4838e.generateNewId();
        r6h r6hVarTrack = ck5Var.track(c4838e.getTrackId(), 5);
        this.f37556b = r6hVarTrack;
        r6hVarTrack.format(new kq6.C8497b().setId(c4838e.getFormatId()).setSampleMimeType("application/id3").build());
    }

    @Override // p000.cy4
    public void packetFinished() {
        int i;
        u80.checkStateNotNull(this.f37556b);
        if (this.f37557c && (i = this.f37559e) != 0 && this.f37560f == i) {
            long j = this.f37558d;
            if (j != -9223372036854775807L) {
                this.f37556b.sampleMetadata(j, 1, i, 0, null);
            }
            this.f37557c = false;
        }
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f37557c = true;
        if (j != -9223372036854775807L) {
            this.f37558d = j;
        }
        this.f37559e = 0;
        this.f37560f = 0;
    }

    @Override // p000.cy4
    public void seek() {
        this.f37557c = false;
        this.f37558d = -9223372036854775807L;
    }
}
