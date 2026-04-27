package p000;

import androidx.media3.common.C1213a;
import java.util.Collections;
import java.util.List;
import p000.ckh;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ut4 implements dy4 {

    /* JADX INFO: renamed from: a */
    public final List<ckh.C2368a> f89069a;

    /* JADX INFO: renamed from: b */
    public final String f89070b;

    /* JADX INFO: renamed from: c */
    public final q6h[] f89071c;

    /* JADX INFO: renamed from: d */
    public boolean f89072d;

    /* JADX INFO: renamed from: e */
    public int f89073e;

    /* JADX INFO: renamed from: f */
    public int f89074f;

    /* JADX INFO: renamed from: g */
    public long f89075g = -9223372036854775807L;

    public ut4(List<ckh.C2368a> list, String str) {
        this.f89069a = list;
        this.f89070b = str;
        this.f89071c = new q6h[list.size()];
    }

    private boolean checkNextByte(jhc jhcVar, int i) {
        if (jhcVar.bytesLeft() == 0) {
            return false;
        }
        if (jhcVar.readUnsignedByte() != i) {
            this.f89072d = false;
        }
        this.f89073e--;
        return this.f89072d;
    }

    @Override // p000.dy4
    public void consume(jhc jhcVar) {
        if (this.f89072d) {
            if (this.f89073e != 2 || checkNextByte(jhcVar, 32)) {
                if (this.f89073e != 1 || checkNextByte(jhcVar, 0)) {
                    int position = jhcVar.getPosition();
                    int iBytesLeft = jhcVar.bytesLeft();
                    for (q6h q6hVar : this.f89071c) {
                        jhcVar.setPosition(position);
                        q6hVar.sampleData(jhcVar, iBytesLeft);
                    }
                    this.f89074f += iBytesLeft;
                }
            }
        }
    }

    @Override // p000.dy4
    public void createTracks(bk5 bk5Var, ckh.C2372e c2372e) {
        for (int i = 0; i < this.f89071c.length; i++) {
            ckh.C2368a c2368a = this.f89069a.get(i);
            c2372e.generateNewId();
            q6h q6hVarTrack = bk5Var.track(c2372e.getTrackId(), 3);
            q6hVarTrack.format(new C1213a.b().setId(c2372e.getFormatId()).setContainerMimeType(this.f89070b).setSampleMimeType("application/dvbsubs").setInitializationData(Collections.singletonList(c2368a.f16840c)).setLanguage(c2368a.f16838a).build());
            this.f89071c[i] = q6hVarTrack;
        }
    }

    @Override // p000.dy4
    public void packetFinished(boolean z) {
        if (this.f89072d) {
            v80.checkState(this.f89075g != -9223372036854775807L);
            for (q6h q6hVar : this.f89071c) {
                q6hVar.sampleMetadata(this.f89075g, 1, this.f89074f, 0, null);
            }
            this.f89072d = false;
        }
    }

    @Override // p000.dy4
    public void packetStarted(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f89072d = true;
        this.f89075g = j;
        this.f89074f = 0;
        this.f89073e = 2;
    }

    @Override // p000.dy4
    public void seek() {
        this.f89072d = false;
        this.f89075g = -9223372036854775807L;
    }
}
