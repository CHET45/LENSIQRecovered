package p000;

import java.io.IOException;
import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class hjh {

    /* JADX INFO: renamed from: a */
    public final byte[] f43828a = new byte[10];

    /* JADX INFO: renamed from: b */
    public boolean f43829b;

    /* JADX INFO: renamed from: c */
    public int f43830c;

    /* JADX INFO: renamed from: d */
    public long f43831d;

    /* JADX INFO: renamed from: e */
    public int f43832e;

    /* JADX INFO: renamed from: f */
    public int f43833f;

    /* JADX INFO: renamed from: g */
    public int f43834g;

    public void outputPendingSampleMetadata(q6h q6hVar, @hib q6h.C11325a c11325a) {
        if (this.f43830c > 0) {
            q6hVar.sampleMetadata(this.f43831d, this.f43832e, this.f43833f, this.f43834g, c11325a);
            this.f43830c = 0;
        }
    }

    public void reset() {
        this.f43829b = false;
        this.f43830c = 0;
    }

    public void sampleMetadata(q6h q6hVar, long j, int i, int i2, int i3, @hib q6h.C11325a c11325a) {
        v80.checkState(this.f43834g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f43829b) {
            int i4 = this.f43830c;
            int i5 = i4 + 1;
            this.f43830c = i5;
            if (i4 == 0) {
                this.f43831d = j;
                this.f43832e = i;
                this.f43833f = 0;
            }
            this.f43833f += i2;
            this.f43834g = i3;
            if (i5 >= 16) {
                outputPendingSampleMetadata(q6hVar, c11325a);
            }
        }
    }

    public void startSample(ak5 ak5Var) throws IOException {
        if (this.f43829b) {
            return;
        }
        ak5Var.peekFully(this.f43828a, 0, 10);
        ak5Var.resetPeekPosition();
        if (C11891r5.parseTrueHdSyncframeAudioSampleCount(this.f43828a) == 0) {
            return;
        }
        this.f43829b = true;
    }
}
