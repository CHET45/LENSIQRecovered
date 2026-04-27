package p000;

import java.util.Collections;
import java.util.List;
import p000.dkh;
import p000.kq6;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class tt4 implements cy4 {

    /* JADX INFO: renamed from: a */
    public final List<dkh.C4834a> f85816a;

    /* JADX INFO: renamed from: b */
    public final r6h[] f85817b;

    /* JADX INFO: renamed from: c */
    public boolean f85818c;

    /* JADX INFO: renamed from: d */
    public int f85819d;

    /* JADX INFO: renamed from: e */
    public int f85820e;

    /* JADX INFO: renamed from: f */
    public long f85821f = -9223372036854775807L;

    public tt4(List<dkh.C4834a> list) {
        this.f85816a = list;
        this.f85817b = new r6h[list.size()];
    }

    private boolean checkNextByte(ihc ihcVar, int i) {
        if (ihcVar.bytesLeft() == 0) {
            return false;
        }
        if (ihcVar.readUnsignedByte() != i) {
            this.f85818c = false;
        }
        this.f85819d--;
        return this.f85818c;
    }

    @Override // p000.cy4
    public void consume(ihc ihcVar) {
        if (this.f85818c) {
            if (this.f85819d != 2 || checkNextByte(ihcVar, 32)) {
                if (this.f85819d != 1 || checkNextByte(ihcVar, 0)) {
                    int position = ihcVar.getPosition();
                    int iBytesLeft = ihcVar.bytesLeft();
                    for (r6h r6hVar : this.f85817b) {
                        ihcVar.setPosition(position);
                        r6hVar.sampleData(ihcVar, iBytesLeft);
                    }
                    this.f85820e += iBytesLeft;
                }
            }
        }
    }

    @Override // p000.cy4
    public void createTracks(ck5 ck5Var, dkh.C4838e c4838e) {
        for (int i = 0; i < this.f85817b.length; i++) {
            dkh.C4834a c4834a = this.f85816a.get(i);
            c4838e.generateNewId();
            r6h r6hVarTrack = ck5Var.track(c4838e.getTrackId(), 3);
            r6hVarTrack.format(new kq6.C8497b().setId(c4838e.getFormatId()).setSampleMimeType("application/dvbsubs").setInitializationData(Collections.singletonList(c4834a.f29900c)).setLanguage(c4834a.f29898a).build());
            this.f85817b[i] = r6hVarTrack;
        }
    }

    @Override // p000.cy4
    public void packetFinished() {
        if (this.f85818c) {
            if (this.f85821f != -9223372036854775807L) {
                for (r6h r6hVar : this.f85817b) {
                    r6hVar.sampleMetadata(this.f85821f, 1, this.f85820e, 0, null);
                }
            }
            this.f85818c = false;
        }
    }

    @Override // p000.cy4
    public void packetStarted(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f85818c = true;
        if (j != -9223372036854775807L) {
            this.f85821f = j;
        }
        this.f85820e = 0;
        this.f85819d = 2;
    }

    @Override // p000.cy4
    public void seek() {
        this.f85818c = false;
        this.f85821f = -9223372036854775807L;
    }
}
