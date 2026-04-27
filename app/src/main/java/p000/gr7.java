package p000;

import androidx.media3.common.C1213a;
import p000.ckh;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class gr7 implements dy4 {

    /* JADX INFO: renamed from: h */
    public static final String f40819h = "Id3Reader";

    /* JADX INFO: renamed from: a */
    public final String f40820a;

    /* JADX INFO: renamed from: c */
    public q6h f40822c;

    /* JADX INFO: renamed from: d */
    public boolean f40823d;

    /* JADX INFO: renamed from: f */
    public int f40825f;

    /* JADX INFO: renamed from: g */
    public int f40826g;

    /* JADX INFO: renamed from: b */
    public final jhc f40821b = new jhc(10);

    /* JADX INFO: renamed from: e */
    public long f40824e = -9223372036854775807L;

    public gr7(String str) {
        this.f40820a = str;
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) {
        v80.checkStateNotNull(this.f40822c);
        if (this.f40823d) {
            int iBytesLeft = jhcVar.bytesLeft();
            int i = this.f40826g;
            if (i < 10) {
                int iMin = Math.min(iBytesLeft, 10 - i);
                System.arraycopy(jhcVar.getData(), jhcVar.getPosition(), this.f40821b.getData(), this.f40826g, iMin);
                if (this.f40826g + iMin == 10) {
                    this.f40821b.setPosition(0);
                    if (73 != this.f40821b.readUnsignedByte() || 68 != this.f40821b.readUnsignedByte() || 51 != this.f40821b.readUnsignedByte()) {
                        xh9.m25148w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f40823d = false;
                        return;
                    } else {
                        this.f40821b.skipBytes(3);
                        this.f40825f = this.f40821b.readSynchSafeInt() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iBytesLeft, this.f40825f - this.f40826g);
            this.f40822c.sampleData(jhcVar, iMin2);
            this.f40826g += iMin2;
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        c2372e.generateNewId();
        q6h q6hVarTrack = bk5Var.track(c2372e.getTrackId(), 5);
        this.f40822c = q6hVarTrack;
        q6hVarTrack.format(new C1213a.b().setId(c2372e.getFormatId()).setContainerMimeType(this.f40820a).setSampleMimeType("application/id3").build());
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
        int i;
        v80.checkStateNotNull(this.f40822c);
        if (this.f40823d && (i = this.f40825f) != 0 && this.f40826g == i) {
            v80.checkState(this.f40824e != -9223372036854775807L);
            this.f40822c.sampleMetadata(this.f40824e, 1, this.f40825f, 0, null);
            this.f40823d = false;
        }
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f40823d = true;
        this.f40824e = j;
        this.f40825f = 0;
        this.f40826g = 0;
    }

    @Override // p000.dy4
    public void seek() {
        this.f40823d = false;
        this.f40824e = -9223372036854775807L;
    }
}
