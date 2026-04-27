package p000;

import androidx.media3.common.C1213a;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class bof implements xj5 {

    /* JADX INFO: renamed from: k */
    public static final int f14303k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f14304l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f14305m = 1024;

    /* JADX INFO: renamed from: n */
    public static final int f14306n = 1024;

    /* JADX INFO: renamed from: d */
    public final int f14307d;

    /* JADX INFO: renamed from: e */
    public final int f14308e;

    /* JADX INFO: renamed from: f */
    public final String f14309f;

    /* JADX INFO: renamed from: g */
    public int f14310g;

    /* JADX INFO: renamed from: h */
    public int f14311h;

    /* JADX INFO: renamed from: i */
    public bk5 f14312i;

    /* JADX INFO: renamed from: j */
    public q6h f14313j;

    public bof(int i, int i2, String str) {
        this.f14307d = i;
        this.f14308e = i2;
        this.f14309f = str;
    }

    @g5e({"this.extractorOutput"})
    private void outputImageTrackAndSeekMap(String str) {
        q6h q6hVarTrack = this.f14312i.track(1024, 4);
        this.f14313j = q6hVarTrack;
        q6hVarTrack.format(new C1213a.b().setContainerMimeType(str).setSampleMimeType(str).build());
        this.f14312i.endTracks();
        this.f14312i.seekMap(new jof(-9223372036854775807L));
        this.f14311h = 1;
    }

    private void readSegment(ak5 ak5Var) throws IOException {
        int iSampleData = ((q6h) v80.checkNotNull(this.f14313j)).sampleData((bh3) ak5Var, 1024, true);
        if (iSampleData != -1) {
            this.f14310g += iSampleData;
            return;
        }
        this.f14311h = 2;
        this.f14313j.sampleMetadata(0L, 1, this.f14310g, 0, null);
        this.f14310g = 0;
    }

    @Override // p000.xj5
    public void init(bk5 bk5Var) {
        this.f14312i = bk5Var;
        outputImageTrackAndSeekMap(this.f14309f);
    }

    @Override // p000.xj5
    public int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        int i = this.f14311h;
        if (i == 1) {
            readSegment(ak5Var);
            return 0;
        }
        if (i == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // p000.xj5
    public void release() {
    }

    @Override // p000.xj5
    public void seek(long j, long j2) {
        if (j == 0 || this.f14311h == 1) {
            this.f14311h = 1;
            this.f14310g = 0;
        }
    }

    @Override // p000.xj5
    public boolean sniff(ak5 ak5Var) throws IOException {
        v80.checkState((this.f14307d == -1 || this.f14308e == -1) ? false : true);
        jhc jhcVar = new jhc(this.f14308e);
        ak5Var.peekFully(jhcVar.getData(), 0, this.f14308e);
        return jhcVar.readUnsignedShort() == this.f14307d;
    }
}
