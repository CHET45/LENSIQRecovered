package p000;

import java.io.IOException;
import p000.r6h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class gjh {

    /* JADX INFO: renamed from: a */
    public final byte[] f39963a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f39964b;

    /* JADX INFO: renamed from: c */
    public int f39965c;

    /* JADX INFO: renamed from: d */
    public long f39966d;

    /* JADX INFO: renamed from: e */
    public int f39967e;

    /* JADX INFO: renamed from: f */
    public int f39968f;

    /* JADX INFO: renamed from: g */
    public int f39969g;

    public void outputPendingSampleMetadata(r6h r6hVar, @hib r6h.C11906a c11906a) {
        if (this.f39965c > 0) {
            r6hVar.sampleMetadata(this.f39966d, this.f39967e, this.f39968f, this.f39969g, c11906a);
            this.f39965c = 0;
        }
    }

    public void reset() {
        this.f39964b = false;
        this.f39965c = 0;
    }

    public void sampleMetadata(r6h r6hVar, long j, int i, int i2, int i3, @hib r6h.C11906a c11906a) {
        u80.checkState(this.f39969g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f39964b) {
            int i4 = this.f39965c;
            int i5 = i4 + 1;
            this.f39965c = i5;
            if (i4 == 0) {
                this.f39966d = j;
                this.f39967e = i;
                this.f39968f = 0;
            }
            this.f39968f += i2;
            this.f39969g = i3;
            if (i5 >= 16) {
                outputPendingSampleMetadata(r6hVar, c11906a);
            }
        }
    }

    public void startSample(zj5 zj5Var) throws IOException {
        if (this.f39964b) {
            return;
        }
        zj5Var.peekFully(this.f39963a, 0, 10);
        zj5Var.resetPeekPosition();
        if (C12443s5.parseTrueHdSyncframeAudioSampleCount(this.f39963a) == 0) {
            return;
        }
        this.f39964b = true;
    }
}
